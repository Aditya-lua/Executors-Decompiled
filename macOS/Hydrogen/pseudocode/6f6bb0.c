
void FUN_006f6bb0(long param_1)

{
  uint uVar1;
  long in_x9;
  uint in_w10;
  long in_x11;
  long lVar2;
  ulong uVar3;
  undefined4 unaff_w19;
  long unaff_x21;
  long *unaff_x23;
  
  while( true ) {
    while (in_x11 != 0) {
      lVar2 = *(long *)(in_x11 + 8);
      uVar1 = *(int *)(in_x11 + 0x10) + (int)(int *)(in_x11 + 0x10) & in_w10;
      uVar3 = -(ulong)(uVar1 >> 0x1f) & 0xfffffff800000000 | (ulong)uVar1 << 3;
      *(undefined8 *)(in_x11 + 8) = *(undefined8 *)(unaff_x21 + uVar3);
      *(long *)(unaff_x21 + uVar3) = in_x11;
      in_x11 = lVar2;
    }
    in_x9 = in_x9 + 1;
    if (in_x9 == param_1) break;
    in_x11 = *(long *)(*unaff_x23 + in_x9 * 8);
  }
  func_0x006f3a2c();
  *(undefined4 *)((long)unaff_x23 + 0xc) = unaff_w19;
  *unaff_x23 = unaff_x21;
  return;
}

