
undefined8 FUN_004001b0(long *param_1,undefined8 param_2,ulong param_3)

{
  long lVar1;
  
  lVar1 = param_1[2];
  if ((ulong)(*param_1 - lVar1) < param_3) {
    func_0x007a0000(param_1,lVar1,param_3,1,1);
    lVar1 = param_1[2];
  }
  _memcpy(param_1[1] + lVar1,param_2,param_3);
  param_1[2] = lVar1 + param_3;
  return 0;
}

