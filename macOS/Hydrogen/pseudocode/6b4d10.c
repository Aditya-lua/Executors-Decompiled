
void FUN_006b4d10(uint *param_1)

{
  uint uVar1;
  uint uVar2;
  undefined1 in_NG;
  long lVar3;
  uint *in_x9;
  long in_x10;
  uint in_w11;
  undefined2 in_w12;
  ulong in_x14;
  uint in_w15;
  int in_w16;
  undefined8 unaff_x20;
  undefined8 unaff_x21;
  long unaff_x22;
  undefined8 unaff_x23;
  undefined8 unaff_x25;
  long unaff_x26;
  long unaff_x28;
  long unaff_x29;
  undefined8 in_stack_00000040;
  undefined8 uStack0000000000000058;
  undefined8 in_stack_00000060;
  
  while( true ) {
    uVar2 = *(uint *)(in_x10 + in_x14 * 4);
    uVar1 = -in_w15;
    if (!(bool)in_NG) {
      uVar1 = in_w15;
    }
    if (uVar1 < in_w11) {
      *(short *)(unaff_x22 + (ulong)uVar2 * 4 + 2) =
           (short)((in_w16 - uVar2) * 0x10000 + -0x10000 >> 0x10);
    }
    else {
      lVar3 = (ulong)(uVar2 - 1) * 4;
      *(uint *)(unaff_x22 + lVar3) = (uint)*(byte *)(unaff_x22 + lVar3) | (in_w16 - uVar2) * 0x100;
      *(undefined2 *)(unaff_x22 + (ulong)uVar2 * 4 + 2) = in_w12;
    }
    if (param_1 + 2 == in_x9) break;
    uVar1 = param_1[2];
    in_x14 = (ulong)uVar1;
    in_w16 = *(int *)(in_x10 + (ulong)param_1[3] * 4);
    in_w15 = param_1[3] + ~uVar1;
    in_NG = (int)in_w15 < 0;
    param_1 = param_1 + 2;
  }
  *(undefined8 *)(unaff_x26 + 0x28) = in_stack_00000060;
  *(undefined8 *)(unaff_x26 + 0x30) = unaff_x25;
  lVar3 = *(long *)(unaff_x26 + 0x40);
  *(undefined8 *)(unaff_x26 + 0x38) = in_stack_00000040;
  *(undefined8 *)(unaff_x26 + 0x40) = unaff_x20;
  uStack0000000000000058 = *(undefined8 *)(unaff_x26 + 0x50);
  *(undefined8 *)(unaff_x26 + 0x48) = unaff_x23;
  *(undefined8 *)(unaff_x26 + 0x50) = unaff_x21;
  if (lVar3 != 0) {
    __ZdlPv();
  }
  if (unaff_x28 != 0) {
    __ZdlPv();
  }
  if (*(long *)(unaff_x29 + -0x68) != 0) {
    __ZdlPv();
  }
  return;
}

