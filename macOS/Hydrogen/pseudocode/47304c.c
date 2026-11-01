
void FUN_0047304c(undefined1 *param_1)

{
  undefined1 auVar1 [16];
  undefined1 auVar2 [16];
  undefined1 in_ZR;
  undefined1 in_CY;
  ulong in_x9;
  ulong uVar3;
  long in_x10;
  undefined1 uVar4;
  long in_x11;
  byte *in_x12;
  ulong in_x13;
  uint in_w14;
  
  do {
    if ((bool)in_CY && !(bool)in_ZR) {
      param_1[1] = 1;
LAB_004731d0:
      uVar4 = 1;
LAB_004731d4:
      *param_1 = uVar4;
      return;
    }
    auVar1._8_8_ = 0;
    auVar1._0_8_ = in_x9;
    auVar2._8_8_ = 0;
    auVar2._0_8_ = in_x13;
    uVar3 = in_x9 * 10;
    in_x12 = in_x12 + 1;
    in_x9 = uVar3 - in_w14;
    in_x10 = (SUB168(auVar1 * auVar2,8) + in_x10 * in_x13) - (ulong)(uVar3 < in_w14);
    in_x11 = in_x11 + -1;
    if (in_x11 == 0) {
      if (in_x9 != 0 || in_x10 != 0) {
        uVar4 = 0;
        *(ulong *)(param_1 + 0x10) = in_x9;
        *(long *)(param_1 + 0x18) = in_x10;
        goto LAB_004731d4;
      }
      param_1[1] = 4;
      goto LAB_004731d0;
    }
    in_w14 = *in_x12 - 0x30;
    in_CY = 8 < in_w14;
    in_ZR = in_w14 == 9;
  } while( true );
}

