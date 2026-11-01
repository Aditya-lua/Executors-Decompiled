
void FUN_00712b9c(long param_1)

{
  long lVar1;
  ulong in_x9;
  ulong in_x10;
  ulong in_x11;
  long in_x12;
  long lVar2;
  ulong in_x13;
  ulong uVar3;
  ulong uVar4;
  long unaff_x19;
  ulong unaff_x20;
  undefined8 unaff_x21;
  ulong unaff_x22;
  
  do {
    uVar4 = *(ulong *)(in_x12 + (in_x13 & in_x11) * 0x10);
    if (uVar4 == unaff_x20) goto FUN_00712bcc;
    in_x10 = in_x10 + 1;
    in_x13 = in_x10 + (in_x13 & in_x11);
  } while (uVar4 != in_x9 && in_x10 <= in_x11);
  func_0x006db93c();
  param_1 = *(long *)(unaff_x19 + 0x420);
FUN_00712bcc:
  lVar1 = *(long *)(unaff_x19 + 0x418);
  uVar4 = (unaff_x22 ^ unaff_x20 >> 9) & param_1 - 1U;
  uVar3 = *(ulong *)(lVar1 + uVar4 * 0x10);
  if (uVar3 != *(ulong *)(unaff_x19 + 0x430)) {
    lVar2 = 1;
    do {
      if (uVar3 == unaff_x20) goto FUN_00712c2c;
      uVar4 = uVar4 + lVar2 & param_1 - 1U;
      uVar3 = *(ulong *)(lVar1 + uVar4 * 0x10);
      lVar2 = lVar2 + 1;
    } while (uVar3 != *(ulong *)(unaff_x19 + 0x430));
  }
  *(ulong *)(lVar1 + uVar4 * 0x10) = unaff_x20;
  *(long *)(unaff_x19 + 0x428) = *(long *)(unaff_x19 + 0x428) + 1;
FUN_00712c2c:
  *(undefined8 *)(lVar1 + uVar4 * 0x10 + 8) = unaff_x21;
  return;
}

