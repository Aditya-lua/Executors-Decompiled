
undefined8 FUN_0017e6f4(long *param_1,undefined8 param_2,ulong param_3)

{
  long unaff_x19;
  long lVar1;
  
  lVar1 = param_1[2];
  if ((ulong)(*param_1 - lVar1) < param_3) {
    func_0x0079a190(param_1,lVar1);
    lVar1 = param_1[2];
  }
  _memcpy(param_1[1] + lVar1,param_2);
  param_1[2] = lVar1 + unaff_x19;
  return 0;
}

