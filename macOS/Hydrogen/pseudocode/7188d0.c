
undefined8 FUN_007188d0(long param_1,ulong param_2,undefined8 param_3,int param_4)

{
  int iVar1;
  ulong uVar2;
  uint auStack_50 [8];
  
  param_2 = param_2 & 0xff;
  if (param_4 == 0) {
    func_0x0070c3d0(auStack_50,param_1 + 0x60);
    if (auStack_50[0] == param_2) {
      func_0x00710d48(param_1);
      goto code_r0x00724564;
    }
  }
  else {
    iVar1 = *(int *)(param_1 + 0xa8);
    uVar2 = (ulong)*(uint *)(param_1 + 0x80);
    if (iVar1 == *(int *)(param_1 + 0x84) && uVar2 != param_2) {
      do {
        if (*(int *)(*(long *)(param_1 + 0x1c0) + uVar2 * 4) != 0) {
          return 0;
        }
        func_0x00710d48(param_1);
        uVar2 = (ulong)*(uint *)(param_1 + 0x80);
      } while (iVar1 == *(int *)(param_1 + 0x84) && uVar2 != param_2);
    }
    if (uVar2 == param_2) {
code_r0x00724564:
      func_0x00710d48(param_1);
      return 1;
    }
  }
  return 0;
}

