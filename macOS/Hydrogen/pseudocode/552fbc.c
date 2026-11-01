
void FUN_00552fbc(long *param_1,undefined8 *param_2)

{
  long lVar1;
  long lVar2;
  ulong uVar3;
  long lVar4;
  
  lVar2 = param_2[1];
  lVar1 = param_2[3];
  uVar3 = ((ulong)(lVar1 - lVar2) >> 3) * 0xf83e0f83e0f83e1;
  lVar4 = param_1[2];
  if ((ulong)(*param_1 - lVar4) < uVar3) {
    func_0x007abb04(param_1,lVar4,uVar3,8,0x108);
    lVar4 = param_1[2];
  }
  _memcpy(param_1[1] + lVar4 * 0x108,lVar2,lVar1 - lVar2);
  param_1[2] = lVar4 + uVar3;
  param_2[3] = lVar2;
  lVar1 = ((ulong)(param_2[3] - param_2[1]) >> 3) * 0xf83e0f83e0f83e1 + 1;
  lVar2 = param_2[1];
  while (lVar1 = lVar1 + -1, lVar1 != 0) {
    func_0x005913d0(lVar2);
    lVar2 = lVar2 + 0x108;
  }
  if (param_2[2] == 0) {
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(*param_2,param_2[2] * 0x108,8);
  return;
}

