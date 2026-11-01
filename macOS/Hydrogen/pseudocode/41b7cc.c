
undefined1  [16] FUN_0041b7cc(ulong param_1)

{
  bool bVar1;
  ulong uVar2;
  ulong uVar3;
  undefined8 uVar4;
  undefined8 *unaff_x19;
  ulong unaff_x20;
  ulong uVar5;
  ulong unaff_x21;
  undefined1 *unaff_x22;
  long unaff_x23;
  ulong *unaff_x24;
  long unaff_x26;
  long lVar6;
  ulong unaff_x27;
  undefined1 auVar7 [16];
  
  uVar5 = param_1;
  if (param_1 <= unaff_x27) {
    uVar5 = unaff_x27;
  }
  *(undefined8 *)(unaff_x23 + 0x20) = 0;
  *(ulong *)(unaff_x23 + 0x28) = param_1;
  *(ulong *)(unaff_x23 + 0x30) = uVar5;
  if (((unaff_x21 == 0) || ((unaff_x21 & 0xffffffff00000003) == 0x900000002)) &&
     (unaff_x21 = unaff_x20, unaff_x22 != (undefined1 *)0x0)) {
    unaff_x21 = 0;
    lVar6 = unaff_x26 << 4;
    uVar5 = unaff_x20;
    do {
      if (lVar6 == 0) break;
      uVar3 = unaff_x19[1];
      uVar2 = uVar5;
      if (uVar3 <= uVar5) {
        uVar2 = uVar3;
      }
      if (uVar2 == 1) {
        *(undefined1 *)*unaff_x19 = *unaff_x22;
      }
      else {
        _memcpy((undefined1 *)*unaff_x19,unaff_x22,uVar2);
      }
      unaff_x19 = unaff_x19 + 2;
      unaff_x22 = unaff_x22 + uVar2;
      unaff_x21 = uVar2 + unaff_x21;
      lVar6 = lVar6 + -0x10;
      bVar1 = uVar3 < uVar5;
      uVar5 = uVar5 - uVar2;
    } while (bVar1);
    uVar4 = 0;
    if (unaff_x21 <= unaff_x20) {
      unaff_x20 = unaff_x21;
    }
    *unaff_x24 = unaff_x20;
  }
  else {
    uVar4 = 1;
  }
  auVar7._8_8_ = unaff_x21;
  auVar7._0_8_ = uVar4;
  return auVar7;
}

