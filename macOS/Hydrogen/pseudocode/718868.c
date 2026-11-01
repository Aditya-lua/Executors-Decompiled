
undefined8 FUN_00718868(long param_1,ulong param_2,undefined8 param_3,int param_4)

{
  uint uVar1;
  int iVar2;
  ulong uVar3;
  uint auStack_20 [8];
  
  uVar1 = (uint)param_2 & 0xff;
  if (*(uint *)(param_1 + 0x80) == uVar1) {
    func_0x00710d48(param_1);
    return 1;
  }
  func_0x00721808(param_1,uVar1,param_3,0);
  param_2 = param_2 & 0xff;
  if (param_4 == 0) {
    func_0x0070c3d0(auStack_20,param_1 + 0x60);
    if (auStack_20[0] == param_2) {
      func_0x00710d48(param_1);
      goto code_r0x00724564;
    }
  }
  else {
    iVar2 = *(int *)(param_1 + 0xa8);
    uVar3 = (ulong)*(uint *)(param_1 + 0x80);
    if (iVar2 == *(int *)(param_1 + 0x84) && uVar3 != param_2) {
      do {
        if (*(int *)(*(long *)(param_1 + 0x1c0) + uVar3 * 4) != 0) {
          return 0;
        }
        func_0x00710d48(param_1);
        uVar3 = (ulong)*(uint *)(param_1 + 0x80);
      } while (iVar2 == *(int *)(param_1 + 0x84) && uVar3 != param_2);
    }
    if (uVar3 == param_2) {
code_r0x00724564:
      func_0x00710d48(param_1);
      return 1;
    }
  }
  return 0;
}

