
void FUN_0064c2d4(ulong param_1,long param_2)

{
  long lVar1;
  ulong uVar2;
  ulong in_x9;
  long unaff_x19;
  long unaff_x20;
  long unaff_x21;
  long unaff_x22;
  undefined8 unaff_x23;
  
  while( true ) {
    if (in_x9 <= param_1) {
      param_1 = in_x9;
    }
    if (param_2 != 0) {
      if (param_1 != 0) {
        do {
          *(undefined8 *)(param_2 + -8 + param_1 * 8) = 0;
          param_1 = param_1 - 1;
        } while (param_1 != 0);
      }
      func_0x00611644();
    }
    *(long *)(unaff_x21 + -0x60) = unaff_x22 + 0x10;
    lVar1 = *(long *)(unaff_x21 + -0x40);
    uVar2 = *(ulong *)(unaff_x21 + -0x50);
    if (*(ulong *)(unaff_x21 + -0x48) <= *(ulong *)(unaff_x21 + -0x50)) {
      uVar2 = *(ulong *)(unaff_x21 + -0x48);
    }
    if (lVar1 != 0) {
      if (uVar2 != 0) {
        do {
          *(undefined8 *)(lVar1 + -8 + uVar2 * 8) = 0;
          uVar2 = uVar2 - 1;
        } while (uVar2 != 0);
      }
      func_0x00611644();
    }
    if (unaff_x21 + -0x60 == unaff_x19) break;
    *(undefined8 *)(unaff_x21 + -0x90) = unaff_x23;
    in_x9 = *(ulong *)(unaff_x21 + -0x78);
    param_2 = *(long *)(unaff_x21 + -0x70);
    param_1 = *(ulong *)(unaff_x21 + -0x80);
    unaff_x21 = unaff_x21 + -0x60;
  }
  *(long *)(unaff_x20 + 8) = unaff_x19;
  return;
}

