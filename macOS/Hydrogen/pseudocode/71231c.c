
void FUN_0071231c(void)

{
  undefined1 in_ZR;
  undefined1 in_CY;
  undefined1 uVar1;
  undefined8 *puVar2;
  ulong in_x9;
  ulong uVar3;
  long unaff_x20;
  long unaff_x21;
  long *unaff_x22;
  undefined8 unaff_x24;
  undefined8 uVar4;
  ulong unaff_x26;
  undefined4 uStack0000000000000004;
  undefined4 uStack000000000000000c;
  
  while ((bool)in_CY && !(bool)in_ZR) {
    uVar3 = in_x9 - 1;
    uVar4 = *(undefined8 *)(*(long *)(*unaff_x22 + in_x9 * 8 + -8) + 0x18);
    puVar2 = (undefined8 *)func_0x006db828();
    *puVar2 = uVar4;
    in_ZR = uVar3 == unaff_x26;
    in_x9 = uVar3;
    in_CY = unaff_x26 <= uVar3;
  }
  uVar3 = *(long *)(unaff_x20 + 0x198) - *(long *)(unaff_x20 + 400) >> 3;
  if (uVar3 < unaff_x26) {
    func_0x006cfeb0();
  }
  else if (unaff_x26 < uVar3) {
    *(ulong *)(unaff_x20 + 0x198) = *(long *)(unaff_x20 + 400) + unaff_x26 * 8;
  }
  *(int *)(*(long *)(unaff_x20 + 0x150) + -4) = *(int *)(*(long *)(unaff_x20 + 0x150) + -4) + -1;
  uVar4 = *(undefined8 *)(unaff_x20 + 0x8c);
  uVar1 = func_0x00716f30();
  *(undefined1 *)(unaff_x21 + 0x30) = uVar1;
  uStack0000000000000004 = (undefined4)((ulong)unaff_x24 >> 0x20);
  uStack000000000000000c = (undefined4)((ulong)uVar4 >> 0x20);
  func_0x00704c24(*(undefined8 *)(unaff_x20 + 0xd8),0x48);
  func_0x00706e70();
  return;
}

