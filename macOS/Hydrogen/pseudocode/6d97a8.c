
undefined8 FUN_006d97a8(code *param_1)

{
  ulong uVar1;
  ulong uVar2;
  ulong uVar3;
  long unaff_x19;
  long unaff_x20;
  long unaff_x21;
  
  (*param_1)();
  uVar1 = *(long *)(unaff_x20 + 0x40) + unaff_x21;
  uVar2 = uVar1 & 0x8080808080808080;
  uVar2 = uVar2 - (uVar2 >> 7) | uVar1 & 0x7f7f7f7f7f7f7f7f;
  uVar1 = (uVar2 & 0x7f007f007f007f) * 3;
  uVar2 = uVar2 >> 8 & 0x7f007f007f007f;
  uVar3 = uVar1 + 0x7f807f807f807f80 >> 8 & 0x80008000800080 |
          uVar2 * 3 + 0x7f807f807f807f80 & 0x8000800080008000;
  uVar1 = (uVar2 * 0x300 & 0x7f007f007f007f00 | uVar1 & 0x7f007f007f007f | uVar3 - (uVar3 >> 7)) +
          unaff_x19;
  uVar2 = uVar1 & 0x8080808080808080;
  *(ulong *)(unaff_x20 + 0x40) = uVar2 - (uVar2 >> 7) | uVar1 & 0x7f7f7f7f7f7f7f7f;
  *(undefined8 *)(unaff_x20 + 0x48) = 0;
  return 0;
}

