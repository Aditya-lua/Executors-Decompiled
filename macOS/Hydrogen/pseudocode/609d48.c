
long FUN_00609d48(ulong param_1)

{
  long lVar1;
  bool bVar2;
  ulong uVar3;
  long lVar4;
  long in_x9;
  ulong uVar5;
  ulong in_x10;
  long in_x11;
  ulong unaff_x19;
  long unaff_x20;
  long unaff_x21;
  
  for (; (in_x11 == 0 && (param_1 = in_x10, in_x10 != 0)); in_x10 = in_x10 - 1) {
    in_x11 = *(long *)(in_x9 + in_x10 * 8);
  }
  if (unaff_x19 < 6) {
    if ((param_1 & 0xffffffff) == 0) {
      lVar4 = 0;
      uVar3 = 0;
    }
    else {
      uVar3 = 0;
      lVar4 = 0;
      param_1 = param_1 & 0xffffffff;
      do {
        param_1 = param_1 - 1;
        uVar5 = *(ulong *)(unaff_x21 + (param_1 & 0xffffffff) * 8);
        bVar2 = CARRY8(uVar3,uVar5);
        uVar3 = uVar3 + uVar5;
        if (bVar2) {
          lVar4 = lVar4 + 1;
        }
      } while ((param_1 & 0xffffffff) != 0);
    }
    lVar4 = func_0x00479af8(uVar3,lVar4);
  }
  else {
    lVar4 = 0;
    if ((param_1 & 0xffffffff) != 0) {
      param_1 = param_1 & 0xffffffff;
      do {
        param_1 = param_1 - 1;
        lVar4 = func_0x00479af8(*(undefined8 *)(unaff_x21 + (param_1 & 0xffffffff) * 8));
      } while ((param_1 & 0xffffffff) != 0);
    }
  }
  lVar1 = unaff_x19 - lVar4;
  if (lVar4 == 0 || *(int *)(unaff_x20 + 0x28) != 1) {
    lVar1 = lVar4;
  }
  return lVar1;
}

