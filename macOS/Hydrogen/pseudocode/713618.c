
void FUN_00713618(void)

{
  long lVar1;
  ulong uVar2;
  ulong uVar3;
  long lVar4;
  ulong uVar5;
  long unaff_x19;
  ulong unaff_x20;
  ulong unaff_x21;
  undefined8 unaff_x22;
  
  uVar3 = *(long *)(unaff_x19 + 0x420) - 1;
  lVar1 = *(long *)(unaff_x19 + 0x418);
  uVar2 = (unaff_x21 ^ unaff_x20 >> 9) & uVar3;
  uVar5 = *(ulong *)(lVar1 + uVar2 * 0x10);
  if (uVar5 != *(ulong *)(unaff_x19 + 0x430)) {
    lVar4 = 1;
    do {
      if (uVar5 == unaff_x20) goto LAB_0071367c;
      uVar2 = uVar2 + lVar4 & uVar3;
      uVar5 = *(ulong *)(lVar1 + uVar2 * 0x10);
      lVar4 = lVar4 + 1;
    } while (uVar5 != *(ulong *)(unaff_x19 + 0x430));
  }
  *(ulong *)(lVar1 + uVar2 * 0x10) = unaff_x20;
  *(long *)(unaff_x19 + 0x428) = *(long *)(unaff_x19 + 0x428) + 1;
LAB_0071367c:
  *(undefined8 *)(lVar1 + uVar2 * 0x10 + 8) = unaff_x22;
  return;
}

