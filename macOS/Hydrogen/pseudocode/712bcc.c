
void FUN_00712bcc(long param_1)

{
  long lVar1;
  ulong uVar2;
  long lVar3;
  ulong uVar4;
  long unaff_x19;
  ulong unaff_x20;
  undefined8 unaff_x21;
  ulong unaff_x22;
  
  lVar1 = *(long *)(unaff_x19 + 0x418);
  uVar2 = (unaff_x22 ^ unaff_x20 >> 9) & param_1 - 1U;
  uVar4 = *(ulong *)(lVar1 + uVar2 * 0x10);
  if (uVar4 != *(ulong *)(unaff_x19 + 0x430)) {
    lVar3 = 1;
    do {
      if (uVar4 == unaff_x20) goto FUN_00712c2c;
      uVar2 = uVar2 + lVar3 & param_1 - 1U;
      uVar4 = *(ulong *)(lVar1 + uVar2 * 0x10);
      lVar3 = lVar3 + 1;
    } while (uVar4 != *(ulong *)(unaff_x19 + 0x430));
  }
  *(ulong *)(lVar1 + uVar2 * 0x10) = unaff_x20;
  *(long *)(unaff_x19 + 0x428) = *(long *)(unaff_x19 + 0x428) + 1;
FUN_00712c2c:
  *(undefined8 *)(lVar1 + uVar2 * 0x10 + 8) = unaff_x21;
  return;
}

