
undefined8 FUN_0046b5dc(ulong param_1)

{
  uint uVar1;
  uint uVar2;
  undefined1 in_ZR;
  undefined1 in_CY;
  ulong uVar3;
  long unaff_x20;
  ulong unaff_x21;
  long unaff_x22;
  int unaff_w23;
  long unaff_x24;
  ulong unaff_x25;
  ulong unaff_x26;
  ulong unaff_x27;
  code *unaff_x28;
  uint in_stack_00000000;
  
  do {
    if ((bool)in_CY && !(bool)in_ZR || (param_1 & unaff_x27) == 0) {
      unaff_x21 = unaff_x21 + 1;
      if (unaff_x26 != unaff_x21) goto LAB_0046b5c0;
      unaff_x21 = unaff_x26;
    }
    do {
      uVar3 = (*unaff_x28)();
      if ((uVar3 & 1) != 0) {
        return 1;
      }
      if (unaff_x26 == unaff_x21) {
LAB_0046b6a4:
        uVar2 = (uint)unaff_x25;
        if ((uint)unaff_x25 <= in_stack_00000000) {
          uVar2 = in_stack_00000000;
        }
        uVar1 = 0;
        if (unaff_w23 != 0x80) {
          uVar1 = uVar2;
        }
        do {
          if (uVar1 == unaff_x25) {
            return 0;
          }
          unaff_x25 = unaff_x25 + 1;
          uVar3 = (**(code **)(unaff_x24 + 0x20))();
        } while ((uVar3 & 1) == 0);
        return 1;
      }
      uVar3 = (*unaff_x28)();
      if ((uVar3 & 1) != 0) {
        return 1;
      }
      unaff_x20 = unaff_x20 + unaff_x21 + 1;
      unaff_x26 = unaff_x26 + ~unaff_x21;
      if (unaff_x26 == 0) goto LAB_0046b6a4;
      unaff_x21 = 0;
LAB_0046b5c0:
    } while (*(byte *)(unaff_x20 + unaff_x21) - 0x7f < 0xffffffa1);
    uVar2 = *(byte *)(unaff_x20 + unaff_x21) - 0x22;
    in_CY = 0x39 < uVar2;
    in_ZR = uVar2 == 0x3a;
    param_1 = unaff_x22 << ((ulong)uVar2 & 0x3f);
  } while( true );
}

