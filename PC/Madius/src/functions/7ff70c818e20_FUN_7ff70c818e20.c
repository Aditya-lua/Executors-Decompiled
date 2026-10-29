/* 7ff70c818e20 FUN_7ff70c818e20 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

longlong FUN_7ff70c818e20(uint param_1)

{
  code *pcVar1;
  uint uVar2;
  longlong lVar3;
  longlong lVar4;
  uint uVar5;
  uint uVar6;
  longlong lVar7;
  undefined *puVar8;
  undefined1 auStack_68 [32];
  undefined *puStack_48;
  undefined *puStack_40;
  undefined *puStack_38;
  undefined *puStack_30;
  ulonglong uStack_20;
  
  lVar4 = _DAT_7ff70cc1a3c0;
  uStack_20 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_68;
  uVar6 = param_1 & 0xffff0fff;
  if (uVar6 - 0x20f < 8) {
    uVar2 = 0xffffefff;
    if ((uVar6 != 0x20f) && (uVar6 != 0x213)) {
      uVar5 = (param_1 & 0xffff0ffb) - 0x210;
      uVar2 = 0xffffffff;
      if (uVar5 < 3) {
        uVar2 = *(uint *)(&UNK_7ff70cb1d3e8 + (ulonglong)uVar5 * 4);
      }
    }
    param_1 = param_1 & uVar2;
  }
  else {
    if (param_1 != 0 && uVar6 == 0) {
      puStack_30 = &UNK_7ff70cb923a7;
      goto LAB_7ff70c818ed8;
    }
    if (uVar6 == 0) {
      puStack_30 = &UNK_7ff70cb86ac2;
      goto LAB_7ff70c818ed8;
    }
    if (0x9a < uVar6 - 0x200) {
      puStack_30 = &UNK_7ff70cb84132;
      goto LAB_7ff70c818ed8;
    }
  }
  puStack_30 = *(undefined **)(&UNK_7ff70cb1b940 + (ulonglong)uVar6 * 8);
LAB_7ff70c818ed8:
  puStack_38 = &UNK_7ff70cb8e054;
  if (-1 < (short)param_1) {
    puStack_38 = &UNK_7ff70cb923a7;
  }
  puStack_40 = &UNK_7ff70cb8e034;
  if ((param_1 & 0x4000) == 0) {
    puStack_40 = &UNK_7ff70cb923a7;
  }
  puStack_48 = &UNK_7ff70cb8e039;
  if ((param_1 & 0x2000) == 0) {
    puStack_48 = &UNK_7ff70cb923a7;
  }
  puVar8 = &UNK_7ff70cb8e05b;
  if ((param_1 & 0x1000) == 0) {
    puVar8 = &UNK_7ff70cb923a7;
  }
  lVar7 = _DAT_7ff70cc1a3c0 + 0x29c0;
  FUN_7ff70c802a20(lVar7,0x40,&UNK_7ff70cb823fb,puVar8);
  if ((uVar6 == 0) && (param_1 != 0)) {
    lVar3 = FUN_7ff70cb12e80(lVar7);
    if (lVar3 != 0) {
      *(undefined1 *)(lVar4 + 0x29bf + lVar3) = 0;
    }
  }
  if (_DAT_7ff70cbebd80 == (uStack_20 ^ (ulonglong)auStack_68)) {
    return lVar7;
  }
  FUN_7ff70caa97e0(uStack_20 ^ (ulonglong)auStack_68);
  pcVar1 = (code *)swi(3);
  lVar4 = (*pcVar1)();
  return lVar4;
}


