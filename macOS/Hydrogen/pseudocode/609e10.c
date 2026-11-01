
undefined4 FUN_00609e10(void)

{
  undefined8 uVar1;
  undefined4 uVar2;
  long lVar3;
  long lVar4;
  long lVar5;
  ulong uVar6;
  long lVar7;
  ulong uVar8;
  undefined1 auVar9 [16];
  
  uVar1 = ___cxa_throw();
  ___cxa_free_exception();
  auVar9 = __Unwind_Resume(uVar1);
  lVar3 = *(long *)(auVar9._0_8_ + 0x20) + -8;
  uVar6 = *(ulong *)(auVar9._0_8_ + 0x18);
  do {
    uVar8 = uVar6;
    if (uVar8 == 0) break;
    uVar6 = uVar8 - 1;
  } while (*(long *)(lVar3 + uVar8 * 8) == 0);
  lVar4 = *(long *)(auVar9._8_8_ + 0x20) + -8;
  lVar5 = *(long *)(auVar9._8_8_ + 0x18);
  do {
    lVar7 = lVar5;
    if (lVar7 == 0) break;
    lVar5 = lVar7 + -1;
  } while (*(long *)(lVar4 + lVar7 * 8) == 0);
  if ((uint)uVar8 != (uint)lVar7) {
    uVar2 = 0xffffffff;
    if ((uint)lVar7 < (uint)uVar8) {
      uVar2 = 1;
    }
    return uVar2;
  }
  lVar5 = (uVar8 & 0xffffffff) << 3;
  while( true ) {
    if (lVar5 == 0) {
      return 0;
    }
    uVar6 = *(ulong *)(lVar3 + lVar5);
    uVar8 = *(ulong *)(lVar4 + lVar5);
    if (uVar8 < uVar6) break;
    lVar5 = lVar5 + -8;
    if (uVar6 < uVar8) {
      return 0xffffffff;
    }
  }
  return 1;
}

