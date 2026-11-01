
void FUN_00441204(undefined8 param_1)

{
  uint uVar1;
  undefined1 in_ZR;
  undefined8 in_x9;
  long in_x10;
  byte *in_x11;
  uint in_w12;
  undefined4 in_w13;
  uint uVar2;
  undefined4 *unaff_x19;
  uint unaff_w20;
  
  while( true ) {
    if ((bool)in_ZR) {
      *unaff_x19 = in_w13;
      unaff_x19[1] = unaff_w20;
      *(undefined8 *)(unaff_x19 + 2) = param_1;
      *(undefined8 *)(unaff_x19 + 4) = in_x9;
      *(byte **)(unaff_x19 + 6) = in_x11;
      *(long *)(unaff_x19 + 8) = in_x10;
      return;
    }
    uVar1 = *in_x11 - 0x30;
    if (((9 < uVar1) || (((ulong)unaff_w20 * (ulong)in_w12 & 0xffffffff00000000) != 0)) ||
       (uVar2 = (uint)((ulong)unaff_w20 * (ulong)in_w12), CARRY4(uVar2,uVar1))) break;
    unaff_w20 = uVar1 + uVar2;
    in_w13 = 1;
    in_x10 = in_x10 + -1;
    in_ZR = in_x10 == 0;
    in_x11 = in_x11 + 1;
  }
  *(undefined **)(unaff_x19 + 2) = &UNK_00888937;
  *(undefined8 *)(unaff_x19 + 4) = 0x23;
  *unaff_x19 = 3;
  return;
}

