
undefined8 FUN_0014e908(ulong param_1)

{
  undefined4 uVar1;
  long unaff_x19;
  ulong unaff_x23;
  undefined8 uVar2;
  long unaff_x24;
  undefined8 in_stack_00000000;
  int iStack0000000000000008;
  
  if (param_1 < unaff_x23) {
    uVar2 = 0xffffffffffffffec;
  }
  else {
    *(ulong *)(&UNK_000074e0 + unaff_x19) = unaff_x23;
    *(undefined4 *)(unaff_x24 + 0x30) = in_stack_00000000._4_4_;
    *(ulong *)(&UNK_000075d0 + unaff_x19) = _iStack0000000000000008 >> 0x20;
    if (unaff_x23 == 0) {
      if (iStack0000000000000008 == 0) {
        *(undefined8 *)(&UNK_000074e0 + unaff_x19) = 3;
        uVar1 = 2;
      }
      else if (*(int *)(unaff_x24 + 0x10) == 0) {
        *(undefined8 *)(&UNK_000074e0 + unaff_x19) = 0;
        uVar1 = 0;
      }
      else {
        *(undefined8 *)(&UNK_000074e0 + unaff_x19) = 4;
        uVar1 = 5;
      }
    }
    else {
      uVar1 = 3;
      if (iStack0000000000000008 != 0) {
        uVar1 = 4;
      }
    }
    uVar2 = 0;
    *(undefined4 *)(unaff_x24 + 0x34) = uVar1;
  }
  return uVar2;
}

