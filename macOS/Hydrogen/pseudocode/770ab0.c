
bool FUN_00770ab0(long param_1)

{
  uint uVar1;
  int iVar2;
  ulong uVar3;
  long lVar4;
  long in_x9;
  long lVar5;
  long in_x10;
  long in_x11;
  int in_w12;
  int in_w13;
  int in_w14;
  long unaff_x19;
  long unaff_x20;
  undefined8 unaff_x21;
  long unaff_x22;
  long unaff_x23;
  
  iVar2 = in_w12 - in_w14 * in_w13;
  *(long *)(unaff_x20 + 0xa40) = unaff_x19;
  lVar4 = unaff_x23 + (long)iVar2 * 8;
  *(long *)(lVar4 + 0x118) = in_x10 + param_1;
  lVar5 = unaff_x23 + (long)iVar2 * 0x10;
  *(long *)(lVar5 + 0x148) = unaff_x19;
  *(undefined8 *)(lVar5 + 0x150) = unaff_x21;
  uVar1 = in_w12 + 1;
  *(uint *)(unaff_x20 + 0xbe8) = uVar1;
  if (in_w12 == 0) {
    lVar4 = in_x11 + in_x9;
  }
  else {
    uVar1 = uVar1 - (uVar1 / 6) * in_w13;
    if (in_w12 < 5) {
      uVar1 = 0;
    }
    uVar3 = func_0x00782dc4();
    if (uVar3 < 2) {
      uVar3 = 1;
    }
    lVar5 = *(long *)(lVar4 + 0x118) - *(long *)(unaff_x23 + (ulong)uVar1 * 8 + 0x118);
    if (lVar5 < 0x418938) {
      lVar4 = 0;
      if (uVar3 != 0) {
        lVar4 = (lVar5 * 1000) / (long)uVar3;
      }
    }
    else {
      lVar4 = (long)((double)lVar5 / ((double)(long)uVar3 / 1000.0));
    }
  }
  *(long *)(unaff_x20 + 0xaa8) = lVar4;
  return unaff_x22 != unaff_x19;
}

