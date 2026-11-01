
undefined8 FUN_00688614(long param_1)

{
  bool in_ZR;
  ulong uVar1;
  long lVar2;
  ulong uVar3;
  long lVar4;
  ulong in_x10;
  long unaff_x19;
  long unaff_x20;
  
  uVar1 = 0;
  if (!in_ZR) {
    uVar1 = in_x10;
  }
  uVar3 = *(long *)(unaff_x19 + 0x90) + *(long *)(unaff_x19 + 0x88);
  if (uVar1 == uVar3) {
    func_0x00688bf4(unaff_x20 + 0x48);
    param_1 = *(long *)(unaff_x19 + 0x70);
    uVar3 = *(long *)(unaff_x19 + 0x90) + *(long *)(unaff_x19 + 0x88);
  }
  *(undefined8 *)(*(long *)(param_1 + (uVar3 >> 6 & 0x3fffffffffffff8)) + (uVar3 & 0x1ff) * 8) = 0;
  *(long *)(unaff_x19 + 0x90) = *(long *)(unaff_x19 + 0x90) + 1;
  uVar1 = (*(long *)(unaff_x19 + 0xc0) + *(long *)(unaff_x19 + 0xb8)) - 1;
  lVar4 = *(long *)(*(long *)(unaff_x19 + 0xa0) + (uVar1 >> 7 & 0x1fffffffffffff8));
  lVar2 = (uVar1 & 0x3ff) * 4;
  *(int *)(lVar4 + lVar2) = *(int *)(lVar4 + lVar2) + 1;
  return 0;
}

