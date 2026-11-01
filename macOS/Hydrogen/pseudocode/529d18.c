
long FUN_00529d18(undefined8 param_1,long param_2)

{
  long lVar1;
  long lStack_78;
  undefined8 uStack_70;
  long lStack_60;
  undefined8 uStack_58;
  
  while ((param_2 != 0 &&
         (func_0x00520ec0(&lStack_78,param_1), lVar1 = lStack_78, lStack_78 != -0x8000000000000000))
        ) {
    if (lStack_60 != -0x8000000000000000 && lStack_60 != 0) {
      func_0x00187bd4(uStack_58,lStack_60,1);
    }
    if (lVar1 != 0) {
      func_0x00187bd4(uStack_70,lVar1 << 4,8);
    }
    param_2 = param_2 + -1;
  }
  return param_2;
}

