
ulong FUN_001ac1cc(void)

{
  ulong uVar1;
  undefined8 uVar2;
  long lVar3;
  ulong uVar4;
  ulong *extraout_x8;
  long lVar5;
  undefined8 *puVar6;
  undefined8 *puVar7;
  long lVar8;
  ulong uVar9;
  ulong uVar10;
  undefined8 uVar11;
  undefined8 uVar12;
  undefined8 uVar13;
  undefined8 uVar14;
  undefined8 uVar15;
  undefined8 uVar16;
  undefined1 uStack0000000000000008;
  
  func_0x00187bd4();
  func_0x0016b01c(&uStack0000000000000008);
  uVar2 = __Unwind_Resume();
  func_0x0016b01c(&uStack0000000000000008);
  lVar3 = __Unwind_Resume(uVar2);
  uVar10 = *(ulong *)(lVar3 + 0x10);
  uVar9 = uVar10 * 0x10;
  if (uVar10 >> 0x3c != 0 || 0x7ffffffffffffff8 < uVar9) {
    uVar2 = 0;
LAB_001ac334:
    lVar3 = func_0x007a1f00(uVar2,uVar9,&UNK_009c2438);
    if (*(long *)(lVar3 + 0x10) == 1) {
      return *(ulong *)(*(long *)(lVar3 + 8) + 8);
    }
    return 0;
  }
  lVar3 = *(long *)(lVar3 + 8);
  if (uVar9 == 0) {
    uVar4 = 8;
    uVar1 = 0;
  }
  else {
    uVar2 = 8;
    uVar4 = func_0x00187bd0(uVar9,8);
    uVar1 = uVar10;
    if (uVar4 == 0) goto LAB_001ac334;
  }
  if (uVar10 != 0) {
    if ((uVar10 < 5) || (uVar4 < lVar3 + uVar10 * 0x18 && lVar3 + 8U < uVar4 + uVar9)) {
      lVar5 = 0;
    }
    else {
      uVar9 = 4;
      if ((uVar10 & 3) != 0) {
        uVar9 = uVar10 & 3;
      }
      lVar5 = uVar10 - uVar9;
      puVar7 = (undefined8 *)(lVar3 + 0x38);
      puVar6 = (undefined8 *)(uVar4 + 0x20);
      lVar8 = lVar5;
      do {
        uVar11 = puVar7[-5];
        uVar2 = puVar7[-3];
        uVar12 = puVar7[-2];
        uVar13 = *puVar7;
        uVar15 = puVar7[1];
        uVar14 = puVar7[3];
        uVar16 = puVar7[4];
        puVar6[-4] = puVar7[-6];
        puVar6[-3] = uVar11;
        puVar6[-2] = uVar2;
        puVar6[-1] = uVar12;
        *puVar6 = uVar13;
        puVar6[1] = uVar15;
        puVar6[2] = uVar14;
        puVar6[3] = uVar16;
        puVar7 = puVar7 + 0xc;
        puVar6 = puVar6 + 8;
        lVar8 = lVar8 + -4;
      } while (lVar8 != 0);
    }
    puVar7 = (undefined8 *)(lVar3 + lVar5 * 0x18 + 0x10);
    lVar3 = uVar10 - lVar5;
    puVar6 = (undefined8 *)(uVar4 + lVar5 * 0x10 + 8);
    do {
      uVar2 = *puVar7;
      puVar6[-1] = puVar7[-1];
      *puVar6 = uVar2;
      puVar7 = puVar7 + 3;
      puVar6 = puVar6 + 2;
      lVar3 = lVar3 + -1;
    } while (lVar3 != 0);
  }
  *extraout_x8 = uVar1;
  extraout_x8[1] = uVar4;
  extraout_x8[2] = uVar10;
  return uVar4;
}

