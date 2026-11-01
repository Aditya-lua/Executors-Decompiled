
undefined8 FUN_0066aa14(long *param_1)

{
  ulong uVar1;
  long *plVar2;
  int unaff_w22;
  
  if ((int)param_1[5] != 1) {
    if ((int)param_1[5] != 0) {
      return 0;
    }
    uVar1 = (**(code **)(*param_1 + 0x60))(param_1);
    if ((uVar1 & 1) != 0) {
      return 1;
    }
  }
  if (unaff_w22 != 0) {
    plVar2 = (long *)(**(code **)(*param_1 + 0x160))(param_1);
    uVar1 = (**(code **)(*plVar2 + 0x140))(plVar2,&UNK_008ba5c8);
    if ((uVar1 & 1) != 0) {
      *(undefined4 *)(param_1 + 5) = 1;
      return 1;
    }
  }
  *(undefined4 *)(param_1 + 5) = 0;
  return 0;
}

