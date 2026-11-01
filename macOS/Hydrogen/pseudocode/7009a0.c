
undefined8 FUN_007009a0(undefined8 *param_1)

{
  undefined8 uVar1;
  uint uVar2;
  undefined4 *in_x9;
  long in_x10;
  long in_x11;
  long lVar3;
  long in_x12;
  long in_x13;
  long unaff_x19;
  int unaff_w20;
  
  while( true ) {
    in_x9[-4] = 0;
    *in_x9 = 0;
    in_x9[4] = 0;
    in_x13 = in_x13 + -4;
    if (in_x13 == 0) break;
    in_x9[8] = 0;
    in_x9 = in_x9 + 0x10;
  }
  if (in_x12 != in_x11) {
    uVar2 = unaff_w20 + 1;
    lVar3 = in_x10;
    do {
      in_x10 = lVar3 + 0x10;
      *(undefined4 *)(lVar3 + 0xc) = 0;
      uVar2 = uVar2 - 1;
      lVar3 = in_x10;
    } while (1 < uVar2);
  }
  *(undefined8 **)(unaff_x19 + 0x20) = param_1;
  uVar1 = *param_1;
  *(long *)(unaff_x19 + 8) = in_x10;
  *(undefined8 *)(unaff_x19 + 0x10) = uVar1;
  return 1;
}

