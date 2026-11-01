
undefined1  [16] FUN_0041d544(long param_1)

{
  int iVar1;
  undefined1 auVar2 [16];
  long *plVar3;
  long in_x9;
  long lVar4;
  long in_x10;
  long in_x11;
  long in_x12;
  long *in_x13;
  long in_x14;
  undefined8 *unaff_x19;
  long unaff_x20;
  long unaff_x21;
  ulong uVar5;
  
  do {
    in_x9 = in_x13[-4] + in_x9;
    in_x10 = in_x13[-2] + in_x10;
    in_x11 = *in_x13 + in_x11;
    in_x12 = in_x13[2] + in_x12;
    in_x13 = in_x13 + 8;
    in_x14 = in_x14 + -4;
  } while (in_x14 != 0);
  uVar5 = in_x12 + in_x11 + in_x10 + in_x9;
  if (unaff_x21 != param_1) {
    lVar4 = unaff_x21 - param_1;
    plVar3 = (long *)(unaff_x20 + param_1 * 0x10 + 8);
    do {
      uVar5 = *plVar3 + uVar5;
      lVar4 = lVar4 + -1;
      plVar3 = plVar3 + 2;
    } while (lVar4 != 0);
  }
  unaff_x19[3] = unaff_x19[3] + 1;
  iVar1 = *(int *)(unaff_x19 + 2);
  *(int *)(unaff_x19 + 2) = iVar1 + -1;
  if (iVar1 + -1 == 0) {
    unaff_x19[1] = 0;
    _pthread_mutex_unlock(*unaff_x19);
  }
  auVar2._8_8_ = 0;
  auVar2._0_8_ = uVar5;
  return auVar2 << 0x40;
}

