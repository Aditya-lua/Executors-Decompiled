
void FUN_006f7160(long param_1)

{
  uint uVar1;
  long in_x9;
  uint in_w10;
  long in_x11;
  long in_x12;
  ulong uVar2;
  long unaff_x21;
  undefined4 unaff_w23;
  long *unaff_x24;
  
  while( true ) {
    while (in_x12 != 0) {
      in_x12 = *(long *)(in_x11 + 8);
      uVar1 = *(int *)(in_x11 + 0x10) + (int)(int *)(in_x11 + 0x10) & in_w10;
      uVar2 = -(ulong)(uVar1 >> 0x1f) & 0xfffffff800000000 | (ulong)uVar1 << 3;
      *(undefined8 *)(in_x11 + 8) = *(undefined8 *)(unaff_x21 + uVar2);
      *(long *)(unaff_x21 + uVar2) = in_x11;
      in_x11 = in_x12;
    }
    in_x9 = in_x9 + 1;
    if (in_x9 == param_1) break;
    in_x12 = *(long *)(*unaff_x24 + in_x9 * 8);
    in_x11 = in_x12;
  }
  func_0x006f3a2c();
  *(undefined4 *)((long)unaff_x24 + 0xc) = unaff_w23;
  *unaff_x24 = unaff_x21;
  return;
}

