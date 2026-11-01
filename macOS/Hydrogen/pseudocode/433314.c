
void FUN_00433314(undefined4 *param_1,ulong param_2,short *param_3)

{
  int iVar1;
  int *piVar2;
  undefined4 uVar3;
  int iStack0000000000000000;
  undefined4 uStack0000000000000004;
  undefined8 in_stack_00000008;
  
  if ((param_2 & 1) == 0) {
    uVar3 = 0x1e;
    if (*param_3 == 0) {
      uVar3 = 2;
    }
    func_0x00433f20(uVar3,1);
    if (iStack0000000000000000 == 1) {
      *(undefined8 *)(param_1 + 2) = in_stack_00000008;
      *param_1 = 1;
    }
    else {
      do {
        iVar1 = _connect(uStack0000000000000004);
        if (iVar1 != -1) goto code_r0x00433404;
        piVar2 = (int *)___error();
        iVar1 = *piVar2;
      } while (iVar1 == 4);
      if (iVar1 == 0x38) {
code_r0x00433404:
        *param_1 = 0;
        param_1[1] = uStack0000000000000004;
      }
      else {
        *(ulong *)(param_1 + 2) = (long)iVar1 << 0x20 | 2;
        *param_1 = 1;
        _close(uStack0000000000000004);
      }
    }
  }
  else {
    *(short **)(param_1 + 2) = param_3;
    *param_1 = 1;
  }
  return;
}

