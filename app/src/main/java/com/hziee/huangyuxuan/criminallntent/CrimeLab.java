package com.hziee.huangyuxuan.criminallntent;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class CrimeLab {
    private static CrimeLab sCrimeLab;
    private List<Crime> mCrimes;
    public static CrimeLab get(Context context){
        if(sCrimeLab == null){
            sCrimeLab = new CrimeLab(context);
        }
        return sCrimeLab;
    }
    //私有构造函数
    private CrimeLab(Context context){
        mCrimes = new ArrayList<>();
        for(int i=0;i<=100;i++){
            Crime crime = new Crime();
            crime.setTitle("违纪编号："+i);
            crime.setSolved(i%2 == 0);
            mCrimes.add(crime);
        }

    }
    public List<Crime> getCrimes(){
        return mCrimes;
    }
public Crime getCrime(UUID id){
        for (Crime crime:mCrimes){
            if(crime.getId().equals(id)){
                return crime;
            }
        }
        return null;
    }
}
