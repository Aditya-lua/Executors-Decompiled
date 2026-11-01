
undefined8 FUN_0041f068(undefined8 *param_1,undefined8 param_2,ulong param_3)

{
  long *plVar1;
  long lVar2;
  
  plVar1 = (long *)*param_1;
  lVar2 = plVar1[2];
  if ((ulong)(*plVar1 - lVar2) < param_3) {
    func_0x007a0000(plVar1,lVar2,param_3,1,1);
    lVar2 = plVar1[2];
  }
  _memcpy(plVar1[1] + lVar2,param_2,param_3);
  plVar1[2] = lVar2 + param_3;
  return 0;
}

