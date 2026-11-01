
undefined1  [16] FUN_0041b884(long param_1,undefined8 param_2,undefined8 param_3,long param_4)

{
  bool bVar1;
  ulong uVar2;
  ulong uVar3;
  undefined8 uVar4;
  long in_x9;
  undefined8 *unaff_x19;
  ulong unaff_x20;
  ulong uVar5;
  ulong unaff_x21;
  undefined1 *puVar6;
  long unaff_x22;
  ulong *unaff_x24;
  long unaff_x25;
  ulong uVar7;
  undefined1 auVar8 [16];
  
  if ((param_1 == in_x9) && (unaff_x21 = unaff_x20 - unaff_x25, unaff_x22 != 0)) {
    uVar7 = 0;
    puVar6 = (undefined1 *)(unaff_x22 + unaff_x25);
    param_4 = param_4 << 4;
    uVar5 = unaff_x21;
    do {
      unaff_x21 = uVar7;
      if (param_4 == 0) break;
      uVar3 = unaff_x19[1];
      uVar2 = uVar5;
      if (uVar3 <= uVar5) {
        uVar2 = uVar3;
      }
      if (uVar2 == 1) {
        *(undefined1 *)*unaff_x19 = *puVar6;
      }
      else {
        _memcpy((undefined1 *)*unaff_x19,puVar6,uVar2);
      }
      unaff_x19 = unaff_x19 + 2;
      puVar6 = puVar6 + uVar2;
      uVar7 = uVar2 + uVar7;
      param_4 = param_4 + -0x10;
      bVar1 = uVar3 < uVar5;
      uVar5 = uVar5 - uVar2;
      unaff_x21 = uVar7;
    } while (bVar1);
    uVar4 = 0;
    if (unaff_x21 + unaff_x25 <= unaff_x20) {
      unaff_x20 = unaff_x21 + unaff_x25;
    }
    *unaff_x24 = unaff_x20;
  }
  else {
    uVar4 = 1;
  }
  auVar8._8_8_ = unaff_x21;
  auVar8._0_8_ = uVar4;
  return auVar8;
}

