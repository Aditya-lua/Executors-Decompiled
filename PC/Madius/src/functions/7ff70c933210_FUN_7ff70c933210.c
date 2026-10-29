/* 7ff70c933210 FUN_7ff70c933210 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

longlong FUN_7ff70c933210(longlong *param_1,ulonglong *param_2)

{
  undefined4 *puVar1;
  undefined8 *puVar2;
  ulonglong uVar3;
  code *pcVar4;
  undefined4 uVar5;
  undefined4 uVar6;
  longlong in_RAX;
  ulonglong uVar7;
  ulonglong *puVar8;
  ulonglong *puVar9;
  ulonglong uVar10;
  ulonglong uVar11;
  longlong lVar12;
  ulonglong *puVar13;
  ulonglong uVar14;
  ulonglong uVar15;
  ulonglong *puVar16;
  ulonglong *puVar17;
  ulonglong uStack_78;
  ulonglong uStack_70;
  undefined *puStack_68;
  undefined8 uStack_60;
  undefined *puStack_58;
  undefined *puStack_50;
  undefined8 uStack_48;
  
  puVar16 = (ulonglong *)param_1[1];
  if (puVar16 != (ulonglong *)param_1[2]) {
    puVar16[2] = 0;
    puVar16[3] = 0;
    *puVar16 = 0;
    puVar16[1] = 0;
    uVar7 = *param_2;
    uVar14 = param_2[1];
    uVar15 = param_2[3];
    puVar16[2] = param_2[2];
    puVar16[3] = uVar15;
    *puVar16 = uVar7;
    puVar16[1] = uVar14;
    param_2[2] = 0;
    param_2[3] = 0xf;
    *(undefined1 *)param_2 = 0;
    param_1[1] = param_1[1] + 0x20;
    return in_RAX;
  }
  lVar12 = *param_1;
  uVar15 = (param_1[1] - lVar12 >> 5) + 1;
  uVar14 = param_1[2] - lVar12 >> 5;
  uVar7 = (uVar14 >> 1) + uVar14;
  if (uVar7 <= uVar15) {
    uVar7 = uVar15;
  }
  if (0x7ffffffffffffff - (uVar14 >> 1) < uVar14) {
    uVar7 = 0x7ffffffffffffff;
  }
  if (uVar7 >> 0x3b != 0) {
LAB_7ff70ca34aaa:
    FUN_7ff70ca007a0();
LAB_7ff70ca34aaf:
    puStack_68 = &UNK_7ff70cb868f0;
    uStack_60 = 0x6e;
    FUN_7ff70ca90020(0x7ff70cc1b2a0,&puStack_68,&uStack_70,&uStack_78);
    uStack_48 = 0;
    puStack_50 = &UNK_7ff70cb846bb;
    puStack_58 = &UNK_7ff70cb740b8;
    FUN_7ff70cb12a50(&puStack_58,&UNK_7ff70cbe4470);
    pcVar4 = (code *)swi(3);
    lVar12 = (*pcVar4)();
    return lVar12;
  }
  uVar14 = uVar7 * 0x20;
  if (uVar7 == 0) {
    puVar13 = (ulonglong *)0x0;
  }
  else if (uVar7 < 0x80) {
    uStack_70 = uVar14 | 0x10;
    uStack_78 = uVar14;
    puVar13 = (ulonglong *)(*_DAT_7ff70cb96730)();
    if (puVar13 == (ulonglong *)0x0) goto LAB_7ff70ca34aaf;
    *puVar13 = uVar14;
    *(undefined1 *)(puVar13 + 1) = 1;
    LOCK();
    _DAT_7ff70cc1b490 = _DAT_7ff70cc1b490 + uVar14;
    UNLOCK();
    LOCK();
    _DAT_7ff70cc1b448 = _DAT_7ff70cc1b448 + uStack_78;
    UNLOCK();
    puVar13 = puVar13 + 2;
  }
  else {
    if (uVar7 == 0x7ffffffffffffff) goto LAB_7ff70ca34aaa;
    uVar10 = uVar14 + 0x27;
    uStack_70 = uVar14 + 0x37;
    uStack_78 = uVar10;
    puVar8 = (ulonglong *)(*_DAT_7ff70cb96730)();
    if (puVar8 == (ulonglong *)0x0) goto LAB_7ff70ca34aaf;
    *puVar8 = uVar10;
    *(undefined1 *)(puVar8 + 1) = 1;
    LOCK();
    _DAT_7ff70cc1b490 = _DAT_7ff70cc1b490 + uVar10;
    UNLOCK();
    LOCK();
    _DAT_7ff70cc1b448 = _DAT_7ff70cc1b448 + uStack_78;
    UNLOCK();
    puVar13 = (ulonglong *)((longlong)puVar8 + 0x37U & 0xffffffffffffffe0);
    puVar13[-1] = (ulonglong)(puVar8 + 2);
  }
  lVar12 = (longlong)puVar16 - lVar12;
  puVar2 = (undefined8 *)((longlong)puVar13 + lVar12 + 0x10);
  *puVar2 = 0;
  puVar2[1] = 0;
  *(undefined8 *)((longlong)puVar13 + lVar12) = 0;
  ((undefined8 *)((longlong)puVar13 + lVar12))[1] = 0;
  uVar10 = *param_2;
  uVar5 = *(undefined4 *)((longlong)param_2 + 4);
  uVar3 = param_2[1];
  uVar6 = *(undefined4 *)((longlong)param_2 + 0xc);
  uVar14 = param_2[3];
  puVar8 = (ulonglong *)((longlong)puVar13 + lVar12 + 0x10);
  *puVar8 = param_2[2];
  puVar8[1] = uVar14;
  puVar1 = (undefined4 *)((longlong)puVar13 + lVar12);
  *puVar1 = (int)uVar10;
  puVar1[1] = uVar5;
  puVar1[2] = (int)uVar3;
  puVar1[3] = uVar6;
  param_2[2] = 0;
  param_2[3] = 0xf;
  *(undefined1 *)param_2 = 0;
  puVar17 = (ulonglong *)*param_1;
  puVar8 = (ulonglong *)param_1[1];
  if (puVar16 == puVar8) {
    puVar8 = puVar13;
    if (puVar17 == puVar16) goto LAB_7ff70ca349db;
    do {
      puVar8[2] = 0;
      puVar8[3] = 0;
      *puVar8 = 0;
      puVar8[1] = 0;
      uVar14 = *puVar17;
      uVar10 = puVar17[1];
      uVar3 = puVar17[3];
      puVar8[2] = puVar17[2];
      puVar8[3] = uVar3;
      *puVar8 = uVar14;
      puVar8[1] = uVar10;
      puVar17[2] = 0;
      puVar17[3] = 0xf;
      *(undefined1 *)puVar17 = 0;
      puVar17 = puVar17 + 4;
      puVar8 = puVar8 + 4;
    } while (puVar17 != puVar16);
  }
  else {
    puVar9 = puVar13;
    if (puVar17 != puVar16) {
      do {
        puVar9[2] = 0;
        puVar9[3] = 0;
        *puVar9 = 0;
        puVar9[1] = 0;
        uVar14 = *puVar17;
        uVar10 = puVar17[1];
        uVar3 = puVar17[3];
        puVar9[2] = puVar17[2];
        puVar9[3] = uVar3;
        *puVar9 = uVar14;
        puVar9[1] = uVar10;
        puVar17[2] = 0;
        puVar17[3] = 0xf;
        *(undefined1 *)puVar17 = 0;
        puVar17 = puVar17 + 4;
        puVar9 = puVar9 + 4;
      } while (puVar17 != puVar16);
      puVar8 = (ulonglong *)param_1[1];
    }
    if (puVar16 != puVar8) {
      puVar17 = (ulonglong *)(lVar12 + (longlong)puVar13);
      do {
        puVar9 = puVar17 + 4;
        puVar17[6] = 0;
        puVar17[7] = 0;
        *puVar9 = 0;
        puVar17[5] = 0;
        uVar14 = *puVar16;
        uVar10 = puVar16[1];
        uVar3 = puVar16[3];
        puVar17[6] = puVar16[2];
        puVar17[7] = uVar3;
        *puVar9 = uVar14;
        puVar17[5] = uVar10;
        puVar16[2] = 0;
        puVar16[3] = 0xf;
        *(undefined1 *)puVar16 = 0;
        puVar16 = puVar16 + 4;
        puVar17 = puVar9;
      } while (puVar16 != puVar8);
    }
  }
  puVar17 = (ulonglong *)*param_1;
LAB_7ff70ca349db:
  if (puVar17 != (ulonglong *)0x0) {
    puVar16 = (ulonglong *)param_1[1];
    if (puVar17 != puVar16) {
      do {
        uVar14 = puVar17[3];
        if (0xf < uVar14) {
          uVar3 = *puVar17;
          uVar10 = uVar14 + 1;
          uVar11 = uVar3;
          if (0xfff < uVar10) {
            uVar11 = *(ulonglong *)(uVar3 - 8);
            if (0x1f < (uVar3 - 8) - uVar11) goto LAB_7ff70ca34aa8;
            uVar10 = uVar14 + 0x28;
          }
          thunk_FUN_7ff70ca90250(uVar11,uVar10);
        }
        puVar17[2] = 0;
        puVar17[3] = 0xf;
        *(undefined1 *)puVar17 = 0;
        puVar17 = puVar17 + 4;
      } while (puVar17 != puVar16);
      puVar17 = (ulonglong *)*param_1;
    }
    uVar14 = param_1[2] - (longlong)puVar17;
    puVar16 = puVar17;
    if (0xfff < uVar14) {
      puVar16 = (ulonglong *)puVar17[-1];
      if ((undefined1 *)0x1f < (undefined1 *)((longlong)puVar17 + (-8 - (longlong)puVar16))) {
LAB_7ff70ca34aa8:
                    /* WARNING: Does not return */
        pcVar4 = (code *)invalidInstructionException();
        (*pcVar4)();
      }
      uVar14 = uVar14 + 0x27;
    }
    thunk_FUN_7ff70ca90250(puVar16,uVar14);
  }
  *param_1 = (longlong)puVar13;
  param_1[1] = (longlong)(puVar13 + uVar15 * 4);
  param_1[2] = (longlong)(puVar13 + uVar7 * 4);
  return lVar12 + (longlong)puVar13;
}


