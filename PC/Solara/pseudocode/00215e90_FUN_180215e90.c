/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_180215e90(undefined8 param_1,longlong *param_2)

{
  int *piVar1;
  longlong *plVar2;
  code *pcVar3;
  ulonglong uVar4;
  undefined4 uVar5;
  undefined4 uVar6;
  undefined4 uVar7;
  ushort uVar8;
  uint uVar9;
  int iVar10;
  longlong lVar11;
  undefined8 uVar12;
  longlong lVar13;
  undefined8 *puVar14;
  undefined4 *puVar15;
  longlong lVar16;
  undefined8 *puVar17;
  uint uVar18;
  undefined1 *puVar19;
  undefined1 *puVar20;
  undefined8 *puVar21;
  longlong lVar22;
  longlong unaff_GS_OFFSET;
  undefined8 uStackX_10;
  undefined8 uStackX_20;
  undefined8 uStack_30;
  
  uStack_30 = 0x180215ead;
  lVar11 = FUN_180e15b20();
  lVar11 = -lVar11;
  puVar20 = &stack0xffffffffffffffd8 + lVar11;
  *(ulonglong *)(&stack0x00001318 + lVar11) =
       _DAT_1810c1700 ^ (ulonglong)(&stack0xffffffffffffffd8 + lVar11);
  *(longlong **)(&stack0x000001b8 + lVar11) = param_2;
  *(undefined8 *)((longlong)&uStack_30 + lVar11) = 0x180215ee2;
  FUN_180f297c0(&stack0x00000298 + lVar11,0,0x1078);
  *(undefined8 *)((longlong)&uStack_30 + lVar11) = 0x180215eef;
  FUN_1801ef8d0(&stack0x00000298 + lVar11);
  lVar22 = *(longlong *)(*(longlong *)(unaff_GS_OFFSET + 0x58) + (ulonglong)__tls_index * 8);
  if (*(int *)(lVar22 + 4) < _DAT_1810cec20) {
    *(undefined8 *)((longlong)&uStack_30 + lVar11) = 0x180215f1f;
    FUN_180e15c30(&DAT_1810cec20);
    if (_DAT_1810cec20 == -1) {
      uRam00000001810cebe8 = 0;
      _DAT_1810cebf0 = 0;
      _DAT_1810cebf8 = 0xf;
      _DAT_1810cebe0 = 0;
      uRam00000001810cec08 = 0;
      _DAT_1810cec10 = 0;
      _DAT_1810cec18 = 0xf;
      _DAT_1810cec00 = 0;
      *(undefined8 *)((longlong)&uStack_30 + lVar11) = 0x180215f79;
      FUN_180e15ad0(FUN_180f42f20);
      *(undefined8 *)((longlong)&uStack_30 + lVar11) = 0x180215f85;
      FUN_180e15bc0(&DAT_1810cec20);
    }
  }
  puVar17 = (undefined8 *)0x0;
  *(undefined8 *)((longlong)&uStack_30 + lVar11) = 0x180215f8e;
  uVar12 = FUN_180229980();
  *(undefined8 *)(&stack0x00000028 + lVar11) = uVar12;
  if (*(int *)(lVar22 + 4) < _DAT_1810cec24) {
    *(undefined8 *)((longlong)&uStack_30 + lVar11) = 0x180215faa;
    FUN_180e15c30(&DAT_1810cec24);
    if (_DAT_1810cec24 == -1) {
      *(undefined8 *)((longlong)&uStack_30 + lVar11) = 0x180215fbf;
      FUN_180e15ad0(FUN_180f42f40);
      *(undefined8 *)((longlong)&uStack_30 + lVar11) = 0x180215fcb;
      FUN_180e15bc0(&DAT_1810cec24);
    }
  }
  *(undefined8 *)(&stack0x000001f8 + lVar11) = 0;
  *(undefined8 *)(&stack0x00000200 + lVar11) = 0;
  *(undefined8 *)(&stack0x00000208 + lVar11) = 0;
  *(undefined8 *)(&stack0x00000210 + lVar11) = 0;
  *(undefined8 *)(&stack0x00000218 + lVar11) = 0;
  *(undefined8 *)(&stack0x00000220 + lVar11) = 0;
  *(undefined8 *)(&stack0x00000228 + lVar11) = 0;
  *(undefined8 *)(&stack0x00000230 + lVar11) = 0;
  *(undefined8 *)(&stack0x00000238 + lVar11) = 0;
  *(undefined8 *)(&stack0x00000240 + lVar11) = 0;
  *(undefined8 *)(&stack0x00000248 + lVar11) = 0;
  *(undefined8 *)(&stack0x00000250 + lVar11) = 0;
  *(undefined8 *)(&stack0x00000258 + lVar11) = 0;
  *(undefined8 *)(&stack0x00000260 + lVar11) = 0;
  *(undefined8 *)(&stack0x00000268 + lVar11) = 0;
  *(undefined8 *)(&stack0x00000270 + lVar11) = 0;
  *(undefined8 *)(&stack0x00000278 + lVar11) = 0;
  *(undefined8 *)(&stack0x00000280 + lVar11) = 0;
  *(undefined8 *)(&stack0x00000288 + lVar11) = 0;
  *(undefined1 **)(&stack0xfffffffffffffff8 + lVar11) = &stack0x000001f8 + lVar11;
  *(undefined4 *)(&stack0x000001f8 + lVar11) = 0;
  *(undefined8 *)(&stack0x00000200 + lVar11) = 0;
  *(undefined8 *)(&stack0x00000208 + lVar11) = 0;
  *(undefined8 *)((longlong)&uStack_30 + lVar11) = 0x180216052;
  lVar13 = FUN_180e152f0(0x58);
  *(longlong *)lVar13 = lVar13;
  *(longlong *)(lVar13 + 8) = lVar13;
  *(longlong *)(&stack0x00000200 + lVar11) = lVar13;
  *(undefined8 *)(&stack0x00000210 + lVar11) = 0;
  *(undefined8 *)(&stack0x00000218 + lVar11) = 0;
  *(undefined8 *)(&stack0x00000220 + lVar11) = 0;
  *(undefined8 *)(&stack0x00000228 + lVar11) = 7;
  *(undefined8 *)(&stack0x00000230 + lVar11) = 8;
  *(undefined4 *)(&stack0x000001f8 + lVar11) = 0x3f800000;
  *(undefined8 *)((longlong)&uStack_30 + lVar11) = 0x1802160ad;
  FUN_1801bee10(&stack0x00000210 + lVar11,0x10,lVar13);
  *(undefined8 *)(&stack0x00000238 + lVar11) = 1;
  *(undefined8 *)(&stack0x00000258 + lVar11) = 0;
  *(undefined8 *)(&stack0x00000260 + lVar11) = 0;
  *(undefined8 *)(&stack0x00000268 + lVar11) = 0;
  *(undefined8 *)(&stack0x00000270 + lVar11) = 0;
  *(undefined8 *)(&stack0x00000278 + lVar11) = 0;
  *(undefined8 *)(&stack0x00000280 + lVar11) = 0;
  *(undefined8 *)(&stack0x00000248 + lVar11) = 0;
  *(undefined8 *)(&stack0x00000250 + lVar11) = 0;
  *(undefined4 *)(&stack0x00000288 + lVar11) = 0xffffffff;
  *(undefined4 *)(&stack0x00000240 + lVar11) = 2;
  *(undefined4 *)(&stack0x0000028c + lVar11) = 0;
  if (*(int *)(lVar22 + 4) < _DAT_1810ced40) {
    *(undefined8 *)((longlong)&uStack_30 + lVar11) = 0x180216115;
    FUN_180e15c30(&DAT_1810ced40);
    if (_DAT_1810ced40 == -1) {
      *(undefined8 *)((longlong)&uStack_30 + lVar11) = 0x180216135;
      FUN_180f297c0(0x1810cec90,0,0xb0);
      *(undefined8 *)((longlong)&uStack_30 + lVar11) = 0x18021613d;
      FUN_1801f3710(0x1810cec90);
      *(undefined8 *)((longlong)&uStack_30 + lVar11) = 0x180216149;
      FUN_180e15ad0(FUN_180f42fc0);
      *(undefined8 *)((longlong)&uStack_30 + lVar11) = 0x180216156;
      FUN_180e15bc0(&DAT_1810ced40);
    }
  }
  _DAT_1810bc1c0 = 4;
  *(undefined8 *)((longlong)&uStack_30 + lVar11) = 0x180216175;
  FUN_18028ca70(0x1810bc250);
  *(undefined8 *)(&stack0x00000000 + lVar11) = 0;
  *(undefined8 *)((longlong)(&stack0x00000000 + lVar11) + 8) = 0;
  *(undefined8 *)((longlong)&uStackX_10 + lVar11) = 0;
  *(undefined8 *)(&stack0x00000018 + lVar11) = 0;
  *(undefined8 *)((longlong)&uStack_30 + lVar11) = 0x18021619e;
  FUN_180191ab0((longlong)&stack0x00000000 + lVar11,&UNK_180f46be4,1);
  *(undefined8 *)((longlong)&uStack_30 + lVar11) = 0x1802161a9;
  puVar14 = (undefined8 *)FUN_180e152f0(0xe0);
  *(undefined8 **)(&stack0xfffffffffffffff8 + lVar11) = puVar14;
  puVar21 = puVar17;
  if (puVar14 != (undefined8 *)0x0) {
    *(undefined8 *)((longlong)&uStack_30 + lVar11) = 0x1802161c6;
    FUN_180f297c0(puVar14,0,0xe0);
    *(undefined8 *)((longlong)&uStack_30 + lVar11) = 0x1802161d8;
    puVar15 = (undefined4 *)
              FUN_180193750(&stack0x000001c8 + lVar11,(longlong)&stack0x00000000 + lVar11);
    uVar5 = puVar15[1];
    uVar6 = puVar15[2];
    uVar7 = puVar15[3];
    *(undefined4 *)(&stack0x00000198 + lVar11) = *puVar15;
    *(undefined4 *)(&stack0x0000019c + lVar11) = uVar5;
    *(undefined4 *)(&stack0x000001a0 + lVar11) = uVar6;
    *(undefined4 *)(&stack0x000001a4 + lVar11) = uVar7;
    uVar5 = puVar15[5];
    uVar6 = puVar15[6];
    uVar7 = puVar15[7];
    *(undefined4 *)(&stack0x000001a8 + lVar11) = puVar15[4];
    *(undefined4 *)(&stack0x000001ac + lVar11) = uVar5;
    *(undefined4 *)(&stack0x000001b0 + lVar11) = uVar6;
    *(undefined4 *)(&stack0x000001b4 + lVar11) = uVar7;
    *(undefined1 *)puVar15 = 0;
    *(undefined8 *)(puVar15 + 4) = 0;
    *(undefined8 *)(puVar15 + 6) = 0xf;
    *(undefined8 *)((longlong)&uStack_30 + lVar11) = 0x180216211;
    FUN_1801f25b0(puVar14,&stack0x00000198 + lVar11);
    *puVar14 = &UNK_180f49c68;
    puVar14[0x1b] = 0;
    *(undefined8 *)((longlong)&uStack_30 + lVar11) = 0x18021622a;
    FUN_180195980(puVar15);
    puVar21 = puVar14;
  }
  *(undefined8 **)(&stack0xfffffffffffffff8 + lVar11) = puVar21;
  puVar14 = *(undefined8 **)(&stack0x00001120 + lVar11);
  if (puVar14 == *(undefined8 **)(&stack0x00001128 + lVar11)) {
    *(undefined8 *)((longlong)&uStack_30 + lVar11) = 0x180216266;
    FUN_1801e3330(&stack0x00001118 + lVar11,puVar14,&stack0xfffffffffffffff8 + lVar11);
  }
  else {
    *puVar14 = puVar21;
    *(longlong *)(&stack0x00001120 + lVar11) = *(longlong *)(&stack0x00001120 + lVar11) + 8;
  }
  *(undefined **)(&stack0x00000098 + lVar11) = &UNK_180f4a5b8;
  (&stack0x000000a0)[lVar11] = (&stack0x000001c0)[lVar11];
  *(undefined1 **)(&stack0x000000d0 + lVar11) = &stack0x00000098 + lVar11;
  *(undefined8 *)((longlong)&uStack_30 + lVar11) = 0x1802162a8;
  FUN_180238060(&stack0x00000098 + lVar11,puVar21 + 0x14);
  plVar2 = *(longlong **)(&stack0x000000d0 + lVar11);
  if (plVar2 != (longlong *)0x0) {
    pcVar3 = *(code **)(*plVar2 + 0x20);
    *(undefined8 *)((longlong)&uStack_30 + lVar11) = 0x1802162c9;
    (*pcVar3)(plVar2,CONCAT71((int7)((ulonglong)(&stack0x00000098 + lVar11) >> 8),
                              plVar2 != (longlong *)(&stack0x00000098 + lVar11)));
  }
  uVar4 = *(ulonglong *)(&stack0x00000018 + lVar11);
  if (uVar4 < 0x10) {
LAB_18021632f:
    lVar22 = 0x28;
    *(undefined8 *)(&stack0x00000000 + lVar11) = 0;
    *(undefined8 *)((longlong)(&stack0x00000000 + lVar11) + 8) = 0;
    *(undefined8 *)((longlong)&uStackX_10 + lVar11) = 0;
    *(undefined8 *)(&stack0x00000018 + lVar11) = 0;
    *(undefined8 *)((longlong)&uStack_30 + lVar11) = 0x180216358;
    FUN_180191ab0((longlong)&stack0x00000000 + lVar11,&UNK_180f49d60,6);
    *(undefined8 *)((longlong)&uStack_30 + lVar11) = 0x180216363;
    puVar14 = (undefined8 *)FUN_180e152f0(0xe0);
    *(undefined8 **)(&stack0x00000198 + lVar11) = puVar14;
    puVar21 = puVar17;
    if (puVar14 != (undefined8 *)0x0) {
      *(undefined8 *)((longlong)&uStack_30 + lVar11) = 0x180216383;
      FUN_180f297c0(puVar14,0,0xe0);
      *(undefined8 *)((longlong)&uStack_30 + lVar11) = 0x180216395;
      puVar15 = (undefined4 *)
                FUN_180193750(&stack0x000001c8 + lVar11,(longlong)&stack0x00000000 + lVar11);
      uVar5 = puVar15[1];
      uVar6 = puVar15[2];
      uVar7 = puVar15[3];
      *(undefined4 *)(&stack0x00000198 + lVar11) = *puVar15;
      *(undefined4 *)(&stack0x0000019c + lVar11) = uVar5;
      *(undefined4 *)(&stack0x000001a0 + lVar11) = uVar6;
      *(undefined4 *)(&stack0x000001a4 + lVar11) = uVar7;
      uVar5 = puVar15[5];
      uVar6 = puVar15[6];
      uVar7 = puVar15[7];
      *(undefined4 *)(&stack0x000001a8 + lVar11) = puVar15[4];
      *(undefined4 *)(&stack0x000001ac + lVar11) = uVar5;
      *(undefined4 *)(&stack0x000001b0 + lVar11) = uVar6;
      *(undefined4 *)(&stack0x000001b4 + lVar11) = uVar7;
      *(undefined1 *)puVar15 = 0;
      *(undefined8 *)(puVar15 + 4) = 0;
      *(undefined8 *)(puVar15 + 6) = 0xf;
      *(undefined8 *)((longlong)&uStack_30 + lVar11) = 0x1802163ce;
      FUN_1801f25b0(puVar14,&stack0x00000198 + lVar11);
      *puVar14 = &UNK_180f49c68;
      puVar14[0x1b] = 0;
      *(undefined8 *)((longlong)&uStack_30 + lVar11) = 0x1802163e7;
      FUN_180195980(puVar15);
      puVar21 = puVar14;
    }
    *(undefined8 **)(&stack0xfffffffffffffff8 + lVar11) = puVar21;
    puVar14 = *(undefined8 **)(&stack0x00001120 + lVar11);
    if (puVar14 == *(undefined8 **)(&stack0x00001128 + lVar11)) {
      *(undefined8 *)((longlong)&uStack_30 + lVar11) = 0x180216423;
      FUN_1801e3330(&stack0x00001118 + lVar11,puVar14,&stack0xfffffffffffffff8 + lVar11);
    }
    else {
      *puVar14 = puVar21;
      *(longlong *)(&stack0x00001120 + lVar11) = *(longlong *)(&stack0x00001120 + lVar11) + 8;
    }
    if (puVar21 == (undefined8 *)0xffffffffffffff67) {
      puVar21 = puVar17;
    }
    puVar21[5] = 8;
    *(undefined **)(&stack0x00000058 + lVar11) = &UNK_180f4a5f0;
    uVar12 = *(undefined8 *)(&stack0x00000028 + lVar11);
    *(undefined8 *)(&stack0x00000060 + lVar11) = uVar12;
    *(undefined8 *)(&stack0x00000068 + lVar11) = 0x1810bc250;
    *(undefined1 **)(&stack0x00000070 + lVar11) = &stack0x000001f8 + lVar11;
    *(undefined1 **)(&stack0x00000090 + lVar11) = &stack0x00000058 + lVar11;
    *(undefined8 *)((longlong)&uStack_30 + lVar11) = 0x180216498;
    FUN_180238060(&stack0x00000058 + lVar11,puVar21 + 0x14);
    plVar2 = *(longlong **)(&stack0x00000090 + lVar11);
    if (plVar2 != (longlong *)0x0) {
      pcVar3 = *(code **)(*plVar2 + 0x20);
      *(undefined8 *)((longlong)&uStack_30 + lVar11) = 0x1802164b9;
      (*pcVar3)(plVar2,CONCAT71((int7)((ulonglong)(&stack0x00000058 + lVar11) >> 8),
                                plVar2 != (longlong *)(&stack0x00000058 + lVar11)));
    }
    uVar4 = *(ulonglong *)(&stack0x00000018 + lVar11);
    if (0xf < uVar4) {
      lVar13 = *(longlong *)(&stack0x00000000 + lVar11);
      if (uVar4 + 1 < 0x1000) {
        lVar16 = 1;
      }
      else {
        if (0x1f < (lVar13 - *(longlong *)(lVar13 + -8)) - 8U) goto LAB_18021713e;
        lVar16 = 0x28;
        lVar13 = *(longlong *)(lVar13 + -8);
      }
      *(undefined8 *)((longlong)&uStack_30 + lVar11) = 0x180216503;
      func_0x000180e15340(lVar13,uVar4 + lVar16);
    }
    *(undefined8 *)(&stack0x00000000 + lVar11) = 0;
    *(undefined8 *)((longlong)(&stack0x00000000 + lVar11) + 8) = 0;
    *(undefined8 *)((longlong)&uStackX_10 + lVar11) = 0;
    *(undefined8 *)(&stack0x00000018 + lVar11) = 0;
    *(undefined8 *)((longlong)&uStack_30 + lVar11) = 0x18021652c;
    FUN_180191ab0((longlong)&stack0x00000000 + lVar11,&UNK_180f49d68,0xf);
    *(undefined8 *)((longlong)&uStack_30 + lVar11) = 0x180216537;
    puVar14 = (undefined8 *)FUN_180e152f0(0xe0);
    *(undefined8 **)(&stack0x00000198 + lVar11) = puVar14;
    puVar21 = puVar17;
    if (puVar14 != (undefined8 *)0x0) {
      *(undefined8 *)((longlong)&uStack_30 + lVar11) = 0x180216557;
      FUN_180f297c0(puVar14,0,0xe0);
      *(undefined8 *)((longlong)&uStack_30 + lVar11) = 0x180216569;
      puVar15 = (undefined4 *)
                FUN_180193750(&stack0x000001c8 + lVar11,(longlong)&stack0x00000000 + lVar11);
      uVar5 = puVar15[1];
      uVar6 = puVar15[2];
      uVar7 = puVar15[3];
      *(undefined4 *)(&stack0x00000198 + lVar11) = *puVar15;
      *(undefined4 *)(&stack0x0000019c + lVar11) = uVar5;
      *(undefined4 *)(&stack0x000001a0 + lVar11) = uVar6;
      *(undefined4 *)(&stack0x000001a4 + lVar11) = uVar7;
      uVar5 = puVar15[5];
      uVar6 = puVar15[6];
      uVar7 = puVar15[7];
      *(undefined4 *)(&stack0x000001a8 + lVar11) = puVar15[4];
      *(undefined4 *)(&stack0x000001ac + lVar11) = uVar5;
      *(undefined4 *)(&stack0x000001b0 + lVar11) = uVar6;
      *(undefined4 *)(&stack0x000001b4 + lVar11) = uVar7;
      *(undefined1 *)puVar15 = 0;
      *(undefined8 *)(puVar15 + 4) = 0;
      *(undefined8 *)(puVar15 + 6) = 0xf;
      *(undefined8 *)((longlong)&uStack_30 + lVar11) = 0x1802165a2;
      FUN_1801f25b0(puVar14,&stack0x00000198 + lVar11);
      *puVar14 = &UNK_180f49c68;
      puVar14[0x1b] = 0;
      *(undefined8 *)((longlong)&uStack_30 + lVar11) = 0x1802165bb;
      FUN_180195980(puVar15);
      uVar12 = *(undefined8 *)(&stack0x00000028 + lVar11);
      puVar21 = puVar14;
    }
    *(undefined8 **)(&stack0xfffffffffffffff8 + lVar11) = puVar21;
    puVar14 = *(undefined8 **)(&stack0x00001120 + lVar11);
    if (puVar14 == *(undefined8 **)(&stack0x00001128 + lVar11)) {
      *(undefined8 *)((longlong)&uStack_30 + lVar11) = 0x1802165fc;
      FUN_1801e3330(&stack0x00001118 + lVar11,puVar14,&stack0xfffffffffffffff8 + lVar11);
    }
    else {
      *puVar14 = puVar21;
      *(longlong *)(&stack0x00001120 + lVar11) = *(longlong *)(&stack0x00001120 + lVar11) + 8;
    }
    if (puVar21 == (undefined8 *)0xffffffffffffff67) {
      puVar21 = puVar17;
    }
    puVar21[5] = 8;
    *(undefined **)(&stack0x000000d8 + lVar11) = &UNK_180f4a628;
    *(undefined8 *)(&stack0x000000e0 + lVar11) = uVar12;
    *(undefined1 **)(&stack0x00000110 + lVar11) = &stack0x000000d8 + lVar11;
    *(undefined8 *)((longlong)&uStack_30 + lVar11) = 0x18021664d;
    FUN_180238060(&stack0x000000d8 + lVar11,puVar21 + 0x14);
    plVar2 = *(longlong **)(&stack0x00000110 + lVar11);
    if (plVar2 != (longlong *)0x0) {
      pcVar3 = *(code **)(*plVar2 + 0x20);
      *(undefined8 *)((longlong)&uStack_30 + lVar11) = 0x18021666e;
      (*pcVar3)(plVar2,CONCAT71((int7)((ulonglong)(&stack0x000000d8 + lVar11) >> 8),
                                plVar2 != (longlong *)(&stack0x000000d8 + lVar11)));
    }
    uVar4 = *(ulonglong *)(&stack0x00000018 + lVar11);
    if (0xf < uVar4) {
      lVar13 = *(longlong *)(&stack0x00000000 + lVar11);
      if (uVar4 + 1 < 0x1000) {
        lVar16 = 1;
      }
      else {
        if (0x1f < (lVar13 - *(longlong *)(lVar13 + -8)) - 8U) goto LAB_18021713e;
        lVar16 = 0x28;
        lVar13 = *(longlong *)(lVar13 + -8);
      }
      *(undefined8 *)((longlong)&uStack_30 + lVar11) = 0x1802166b8;
      func_0x000180e15340(lVar13,uVar4 + lVar16);
    }
    *(undefined8 *)(&stack0x00000000 + lVar11) = 0;
    *(undefined8 *)((longlong)(&stack0x00000000 + lVar11) + 8) = 0;
    *(undefined8 *)((longlong)&uStackX_10 + lVar11) = 0;
    *(undefined8 *)(&stack0x00000018 + lVar11) = 0;
    *(undefined8 *)((longlong)&uStack_30 + lVar11) = 0x1802166e1;
    FUN_180191ab0((longlong)&stack0x00000000 + lVar11,&UNK_180f49d78,8);
    *(undefined8 *)((longlong)&uStack_30 + lVar11) = 0x1802166ec;
    puVar14 = (undefined8 *)FUN_180e152f0(0xe0);
    *(undefined8 **)(&stack0x00000198 + lVar11) = puVar14;
    puVar21 = puVar17;
    if (puVar14 != (undefined8 *)0x0) {
      *(undefined8 *)((longlong)&uStack_30 + lVar11) = 0x18021670c;
      FUN_180f297c0(puVar14,0,0xe0);
      *(undefined8 *)((longlong)&uStack_30 + lVar11) = 0x18021671e;
      puVar15 = (undefined4 *)
                FUN_180193750(&stack0x000001c8 + lVar11,(longlong)&stack0x00000000 + lVar11);
      uVar5 = puVar15[1];
      uVar6 = puVar15[2];
      uVar7 = puVar15[3];
      *(undefined4 *)(&stack0x00000198 + lVar11) = *puVar15;
      *(undefined4 *)(&stack0x0000019c + lVar11) = uVar5;
      *(undefined4 *)(&stack0x000001a0 + lVar11) = uVar6;
      *(undefined4 *)(&stack0x000001a4 + lVar11) = uVar7;
      uVar5 = puVar15[5];
      uVar6 = puVar15[6];
      uVar7 = puVar15[7];
      *(undefined4 *)(&stack0x000001a8 + lVar11) = puVar15[4];
      *(undefined4 *)(&stack0x000001ac + lVar11) = uVar5;
      *(undefined4 *)(&stack0x000001b0 + lVar11) = uVar6;
      *(undefined4 *)(&stack0x000001b4 + lVar11) = uVar7;
      *(undefined1 *)puVar15 = 0;
      *(undefined8 *)(puVar15 + 4) = 0;
      *(undefined8 *)(puVar15 + 6) = 0xf;
      *(undefined8 *)((longlong)&uStack_30 + lVar11) = 0x180216757;
      FUN_1801f25b0(puVar14,&stack0x00000198 + lVar11);
      *puVar14 = &UNK_180f49c68;
      puVar14[0x1b] = 0;
      *(undefined8 *)((longlong)&uStack_30 + lVar11) = 0x180216770;
      FUN_180195980(puVar15);
      uVar12 = *(undefined8 *)(&stack0x00000028 + lVar11);
      puVar21 = puVar14;
    }
    *(undefined8 **)(&stack0xfffffffffffffff8 + lVar11) = puVar21;
    puVar14 = *(undefined8 **)(&stack0x00001120 + lVar11);
    if (puVar14 == *(undefined8 **)(&stack0x00001128 + lVar11)) {
      *(undefined8 *)((longlong)&uStack_30 + lVar11) = 0x1802167b1;
      FUN_1801e3330(&stack0x00001118 + lVar11,puVar14,&stack0xfffffffffffffff8 + lVar11);
    }
    else {
      *puVar14 = puVar21;
      *(longlong *)(&stack0x00001120 + lVar11) = *(longlong *)(&stack0x00001120 + lVar11) + 8;
    }
    if (puVar21 == (undefined8 *)0xffffffffffffff67) {
      puVar21 = puVar17;
    }
    puVar21[5] = 8;
    *(undefined8 *)(&stack0x00000190 + lVar11) = 0;
    *(undefined8 *)((longlong)&uStack_30 + lVar11) = 0x1802167d9;
    puVar14 = (undefined8 *)FUN_180e152f0(0x50);
    *puVar14 = &UNK_180f4a660;
    puVar14[1] = uVar12;
    puVar14[2] = &DAT_1810cebe0;
    puVar14[3] = 0x1810ced44;
    puVar14[4] = 0x1810bc250;
    puVar14[5] = &stack0x000001f8 + lVar11;
    puVar14[6] = 0x1810cec8c;
    puVar14[7] = &stack0x000001c0 + lVar11;
    puVar14[8] = 0x1810cec90;
    puVar14[9] = &stack0x000001c1 + lVar11;
    *(undefined8 **)(&stack0x00000190 + lVar11) = puVar14;
    *(undefined8 *)((longlong)&uStack_30 + lVar11) = 0x180216857;
    FUN_180238060(&stack0x00000158 + lVar11,puVar21 + 0x14);
    plVar2 = *(longlong **)(&stack0x00000190 + lVar11);
    if (plVar2 != (longlong *)0x0) {
      pcVar3 = *(code **)(*plVar2 + 0x20);
      *(undefined8 *)((longlong)&uStack_30 + lVar11) = 0x180216878;
      (*pcVar3)(plVar2,CONCAT71((int7)((ulonglong)(&stack0x00000158 + lVar11) >> 8),
                                plVar2 != (longlong *)(&stack0x00000158 + lVar11)));
    }
    uVar4 = *(ulonglong *)(&stack0x00000018 + lVar11);
    if (0xf < uVar4) {
      lVar13 = *(longlong *)(&stack0x00000000 + lVar11);
      if (uVar4 + 1 < 0x1000) {
        lVar22 = 1;
        lVar16 = lVar13;
      }
      else {
        lVar16 = *(longlong *)(lVar13 + -8);
        if (0x1f < (lVar13 - lVar16) - 8U) goto LAB_18021713e;
      }
      *(undefined8 *)((longlong)&uStack_30 + lVar11) = 0x1802168c0;
      func_0x000180e15340(lVar16,uVar4 + lVar22);
    }
    *(undefined8 *)(&stack0x00000000 + lVar11) = 0;
    *(undefined8 *)((longlong)(&stack0x00000000 + lVar11) + 8) = 0;
    *(undefined8 *)((longlong)&uStackX_10 + lVar11) = 0;
    *(undefined8 *)(&stack0x00000018 + lVar11) = 0;
    *(undefined8 *)((longlong)&uStack_30 + lVar11) = 0x1802168e9;
    FUN_180191ab0((longlong)&stack0x00000000 + lVar11,&UNK_180f49d88,0xf);
    *(undefined8 *)((longlong)&uStack_30 + lVar11) = 0x1802168f4;
    puVar14 = (undefined8 *)FUN_180e152f0(0xe0);
    *(undefined8 **)(&stack0x00000198 + lVar11) = puVar14;
    puVar21 = puVar17;
    if (puVar14 != (undefined8 *)0x0) {
      *(undefined8 *)((longlong)&uStack_30 + lVar11) = 0x180216914;
      FUN_180f297c0(puVar14,0,0xe0);
      *(undefined8 *)((longlong)&uStack_30 + lVar11) = 0x180216926;
      puVar15 = (undefined4 *)
                FUN_180193750(&stack0x000001c8 + lVar11,(longlong)&stack0x00000000 + lVar11);
      uVar5 = puVar15[1];
      uVar6 = puVar15[2];
      uVar7 = puVar15[3];
      *(undefined4 *)(&stack0x00000198 + lVar11) = *puVar15;
      *(undefined4 *)(&stack0x0000019c + lVar11) = uVar5;
      *(undefined4 *)(&stack0x000001a0 + lVar11) = uVar6;
      *(undefined4 *)(&stack0x000001a4 + lVar11) = uVar7;
      uVar5 = puVar15[5];
      uVar6 = puVar15[6];
      uVar7 = puVar15[7];
      *(undefined4 *)(&stack0x000001a8 + lVar11) = puVar15[4];
      *(undefined4 *)(&stack0x000001ac + lVar11) = uVar5;
      *(undefined4 *)(&stack0x000001b0 + lVar11) = uVar6;
      *(undefined4 *)(&stack0x000001b4 + lVar11) = uVar7;
      *(undefined1 *)puVar15 = 0;
      *(undefined8 *)(puVar15 + 4) = 0;
      *(undefined8 *)(puVar15 + 6) = 0xf;
      *(undefined8 *)((longlong)&uStack_30 + lVar11) = 0x18021695f;
      FUN_1801f25b0(puVar14,&stack0x00000198 + lVar11);
      *puVar14 = &UNK_180f49c68;
      puVar14[0x1b] = 0;
      *(undefined8 *)((longlong)&uStack_30 + lVar11) = 0x180216978;
      FUN_180195980(puVar15);
      uVar12 = *(undefined8 *)(&stack0x00000028 + lVar11);
      puVar21 = puVar14;
    }
    *(undefined8 **)(&stack0xfffffffffffffff8 + lVar11) = puVar21;
    puVar14 = *(undefined8 **)(&stack0x00001120 + lVar11);
    if (puVar14 == *(undefined8 **)(&stack0x00001128 + lVar11)) {
      *(undefined8 *)((longlong)&uStack_30 + lVar11) = 0x1802169b9;
      FUN_1801e3330(&stack0x00001118 + lVar11,puVar14,&stack0xfffffffffffffff8 + lVar11);
    }
    else {
      *puVar14 = puVar21;
      *(longlong *)(&stack0x00001120 + lVar11) = *(longlong *)(&stack0x00001120 + lVar11) + 8;
    }
    if (puVar21 == (undefined8 *)0xffffffffffffff67) {
      puVar21 = puVar17;
    }
    puVar21[5] = 8;
    *(undefined **)(&stack0x00000118 + lVar11) = &UNK_180f4a698;
    *(undefined8 *)(&stack0x00000120 + lVar11) = uVar12;
    *(undefined1 **)(&stack0x00000150 + lVar11) = &stack0x00000118 + lVar11;
    *(undefined8 *)((longlong)&uStack_30 + lVar11) = 0x180216a0a;
    FUN_180238060(&stack0x00000118 + lVar11,puVar21 + 0x14);
    plVar2 = *(longlong **)(&stack0x00000150 + lVar11);
    if (plVar2 != (longlong *)0x0) {
      pcVar3 = *(code **)(*plVar2 + 0x20);
      *(undefined8 *)((longlong)&uStack_30 + lVar11) = 0x180216a2b;
      (*pcVar3)(plVar2,CONCAT71((int7)((ulonglong)(&stack0x00000118 + lVar11) >> 8),
                                plVar2 != (longlong *)(&stack0x00000118 + lVar11)));
    }
    *(undefined8 *)((longlong)&uStack_30 + lVar11) = 0x180216a36;
    FUN_180195980((longlong)&stack0x00000000 + lVar11);
    *(undefined8 *)((longlong)&uStack_30 + lVar11) = 0x180216a43;
    FUN_180239210(&stack0x00000300 + lVar11);
    *(undefined8 *)(&stack0x00000030 + lVar11) = 0;
    *(undefined8 *)(&stack0x00000038 + lVar11) = 0;
    *(undefined8 *)(&stack0x00000040 + lVar11) = 0;
    *(undefined8 *)(&stack0x00000048 + lVar11) = 0;
    *(undefined8 *)((longlong)&uStack_30 + lVar11) = 0x180216a6c;
    FUN_180191ab0(&stack0x00000030 + lVar11,&UNK_180f49d98,9);
    *(undefined1 **)(&stack0x00000198 + lVar11) = &stack0x00000030 + lVar11;
    if (&stack0x000002d0 + lVar11 != &stack0x00000030 + lVar11) {
      puVar19 = &stack0x00000030 + lVar11;
      if (0xf < *(ulonglong *)(&stack0x00000048 + lVar11)) {
        puVar19 = *(undefined1 **)(&stack0x00000030 + lVar11);
      }
      *(undefined8 *)((longlong)&uStack_30 + lVar11) = 0x180216aae;
      FUN_18019a4f0(&stack0x000002d0 + lVar11,puVar19,*(undefined8 *)(&stack0x00000040 + lVar11));
    }
    *(undefined8 *)((longlong)&uStack_30 + lVar11) = 0x180216ab9;
    FUN_180195980(&stack0x00000030 + lVar11);
    *(undefined2 *)(&stack0x0000029a + lVar11) = 0;
    *(undefined8 *)((longlong)&uStack_30 + lVar11) = 0x180216ac6;
    uVar9 = FUN_180e13110();
    uVar18 = 2;
    if (1 < uVar9) {
      uVar18 = uVar9;
    }
    *(uint *)(&stack0x0000029c + lVar11) = uVar18;
    *(undefined8 *)(&stack0x00000198 + lVar11) = 0;
    *(undefined8 *)(&stack0x000001a0 + lVar11) = 0;
    *(undefined8 *)(&stack0x00000000 + lVar11) = 0;
    *(undefined8 *)((longlong)(&stack0x00000000 + lVar11) + 8) = 0;
    *(undefined8 *)((longlong)&uStackX_10 + lVar11) = 0;
    *(undefined1 **)(&stack0xfffffffffffffff8 + lVar11) = &stack0x00000298 + lVar11;
    *(undefined8 *)((longlong)&uStack_30 + lVar11) = 0x180216b0b;
    puVar17 = (undefined8 *)FUN_1801e4970(1,&stack0xfffffffffffffff8 + lVar11);
    *(undefined8 **)(&stack0x00000000 + lVar11) = puVar17;
    (&stack0x00000008)[lVar11] = 0;
    *(undefined1 *)((longlong)&uStackX_10 + lVar11) = 0;
    if (puVar17 == (undefined8 *)0x0) goto LAB_180217145;
    *(undefined8 **)(&stack0x00000198 + lVar11) = puVar17;
    (&stack0x000001a0)[lVar11] = 1;
    LOCK();
    *(int *)(puVar17 + 1) = *(int *)(puVar17 + 1) + 1;
    UNLOCK();
    LOCK();
    piVar1 = (int *)(puVar17 + 1);
    *piVar1 = *piVar1 + -1;
    UNLOCK();
    if (*piVar1 == 0) {
      puVar21 = (undefined8 *)puVar17[0x19];
      if (puVar21 == (undefined8 *)0x0) {
        pcVar3 = *(code **)*puVar17;
        *(undefined8 *)((longlong)&uStack_30 + lVar11) = 0x180216b63;
        (*pcVar3)(puVar17,1);
      }
      else {
        pcVar3 = *(code **)*puVar21;
        *(undefined8 *)((longlong)&uStack_30 + lVar11) = 0x180216b57;
        (*pcVar3)(puVar21,puVar17);
      }
    }
    *(undefined8 *)((longlong)&uStack_30 + lVar11) = 0x180216b76;
    iVar10 = FUN_18023a320(&stack0x00000298 + lVar11,5000);
    if ((iVar10 == 1) || ((&stack0x000002a0)[lVar11] == '\0')) {
      *(undefined8 *)((longlong)&uStack_30 + lVar11) = 0x180216e1f;
      FUN_18021df30(&stack0x00000298 + lVar11);
      if (*(longlong *)(&stack0x000011e0 + lVar11) != 0) {
        *(undefined8 *)((longlong)&uStack_30 + lVar11) = 0x180216e31;
        FUN_180237440();
      }
      if (*(longlong *)(&stack0x000011e8 + lVar11) != 0) {
        *(undefined8 *)((longlong)&uStack_30 + lVar11) = 0x180216e43;
        FUN_180237950();
      }
      *(undefined8 *)((longlong)&uStack_30 + lVar11) = 0x180216e51;
      FUN_180228f30(&stack0x00000198 + lVar11);
      *(undefined4 *)(&stack0x00000028 + lVar11) = 0xffffffff;
      lVar22 = *param_2;
      if ((lVar22 == 0) || (((char)param_2[1] != '\0' && (*(char *)(lVar22 + 0xb8) != '\0'))))
      goto LAB_180217133;
      *(undefined8 *)((longlong)&uStack_30 + lVar11) = 0x180216e96;
      FUN_18021b1d0(lVar22,&stack0x00000028 + lVar11,0);
      puVar17 = *(undefined8 **)(&stack0x00000198 + lVar11);
      if (puVar17 != (undefined8 *)0x0) {
        LOCK();
        piVar1 = (int *)(puVar17 + 1);
        iVar10 = *piVar1;
        *piVar1 = *piVar1 + -1;
        UNLOCK();
        if (iVar10 == 1) {
          puVar21 = (undefined8 *)puVar17[0x19];
          if (puVar21 == (undefined8 *)0x0) {
            if (puVar17 != (undefined8 *)0x0) {
              pcVar3 = *(code **)*puVar17;
              *(undefined8 *)((longlong)&uStack_30 + lVar11) = 0x180216ed8;
              (*pcVar3)(puVar17,1);
            }
          }
          else {
            pcVar3 = *(code **)*puVar21;
            *(undefined8 *)((longlong)&uStack_30 + lVar11) = 0x180216ec7;
            (*pcVar3)(puVar21,puVar17);
          }
        }
      }
      *(undefined8 *)((longlong)&uStack_30 + lVar11) = 0x180216ee6;
      FUN_1801b1070(&stack0x00000210 + lVar11);
      *(undefined8 *)((longlong)&uStack_30 + lVar11) = 0x180216efb;
      FUN_1801e44a0(&stack0x00000200 + lVar11,*(undefined8 *)(&stack0x00000200 + lVar11));
      *(undefined8 *)((longlong)&uStack_30 + lVar11) = 0x180216f0d;
      func_0x000180e15340(*(undefined8 *)(&stack0x00000200 + lVar11),0x58);
      *(undefined8 *)((longlong)&uStack_30 + lVar11) = 0x180216f1b;
      FUN_1801f5aa0(&stack0x000012f8 + lVar11);
      *(undefined8 *)((longlong)&uStack_30 + lVar11) = 0x180216f28;
      FUN_18021b5c0(&stack0x000011f0 + lVar11);
      if (*(longlong *)(&stack0x000011e8 + lVar11) != 0) {
        *(undefined8 *)((longlong)&uStack_30 + lVar11) = 0x180216f3f;
        FUN_1802150c0(*(longlong *)(&stack0x000011e8 + lVar11),1);
      }
      if (*(longlong *)(&stack0x000011e0 + lVar11) != 0) {
        *(undefined8 *)((longlong)&uStack_30 + lVar11) = 0x180216f56;
        FUN_180214f60(*(longlong *)(&stack0x000011e0 + lVar11),1);
      }
      plVar2 = *(longlong **)(&stack0x000011d0 + lVar11);
      if (plVar2 != (longlong *)0x0) {
        pcVar3 = *(code **)(*plVar2 + 0x20);
        *(undefined8 *)((longlong)&uStack_30 + lVar11) = 0x180216f77;
        (*pcVar3)(plVar2,CONCAT71((int7)((ulonglong)(&stack0x00001198 + lVar11) >> 8),
                                  plVar2 != (longlong *)(&stack0x00001198 + lVar11)));
        *(undefined8 *)(&stack0x000011d0 + lVar11) = 0;
      }
      *(undefined8 *)((longlong)&uStack_30 + lVar11) = 0x180216f8c;
      FUN_1801f5c40(&stack0x00000300 + lVar11);
      *(undefined8 *)((longlong)&uStack_30 + lVar11) = 0x180216f99;
      FUN_180195980(&stack0x000002d0 + lVar11);
      *(undefined8 *)((longlong)&uStack_30 + lVar11) = 0x180216fa6;
      FUN_180195980(&stack0x000002b0 + lVar11);
      lVar22 = *param_2;
      if ((lVar22 != 0) &&
         ((((char)param_2[1] == '\0' || (*(char *)(lVar22 + 0xb8) == '\0')) &&
          (*(int *)(lVar22 + 0xbc) == 0)))) {
        *(undefined8 *)(&stack0x000001e0 + lVar11) = 0;
        *(undefined8 *)(&stack0x000001e8 + lVar11) = 0;
        *(undefined **)(&stack0x000001c8 + lVar11) = &UNK_180f46590;
        *(undefined8 *)(&stack0x000001d0 + lVar11) = 0;
        *(undefined8 *)(&stack0x000001d8 + lVar11) = 0;
        *(undefined **)(&stack0x00000198 + lVar11) = &UNK_180f467a8;
        (&stack0x000001a0)[lVar11] = 1;
        *(undefined8 *)((longlong)&uStack_30 + lVar11) = 0x180217031;
        FUN_180e16890(&stack0x00000198 + lVar11,&stack0x000001d0 + lVar11);
        *(undefined **)(&stack0x000001c8 + lVar11) = &UNK_180f48010;
        *(undefined4 *)(&stack0x000001e0 + lVar11) = 1;
        *(undefined8 *)(&stack0x000001e8 + lVar11) = 0x1810bc690;
        *(undefined **)(&stack0x00000000 + lVar11) = &UNK_180f46590;
        *(undefined8 *)(&stack0x00000008 + lVar11) = 0;
        *(undefined8 *)((longlong)&uStackX_10 + lVar11) = 0;
        *(undefined8 *)((longlong)&uStack_30 + lVar11) = 0x180217072;
        FUN_180e16890(&stack0x000001d0 + lVar11,&stack0x00000008 + lVar11);
        *(undefined **)(&stack0x00000000 + lVar11) = &UNK_180f48010;
        *(undefined4 *)(&stack0x00000018 + lVar11) = *(undefined4 *)(&stack0x000001e0 + lVar11);
        *(undefined4 *)(&stack0x0000001c + lVar11) = *(undefined4 *)(&stack0x000001e4 + lVar11);
        *(undefined8 *)((longlong)&uStackX_20 + lVar11) = *(undefined8 *)(&stack0x000001e8 + lVar11)
        ;
        *(undefined8 *)((longlong)&uStack_30 + lVar11) = 0x1802170ac;
        uVar12 = FUN_1801ee3c0(&stack0x00000198 + lVar11,(longlong)&stack0x00000000 + lVar11);
        *(undefined8 *)((longlong)&uStack_30 + lVar11) = 0x1802170ba;
        FUN_18021b140(param_2,uVar12,0);
        *(undefined **)(&stack0x000001c8 + lVar11) = &UNK_180f46590;
        *(undefined8 *)((longlong)&uStack_30 + lVar11) = 0x1802170cf;
        FUN_180e16930(&stack0x000001d0 + lVar11);
      }
      puVar17 = (undefined8 *)*param_2;
      if (puVar17 == (undefined8 *)0x0) goto LAB_180217106;
      LOCK();
      piVar1 = (int *)(puVar17 + 1);
      iVar10 = *piVar1;
      *piVar1 = *piVar1 + -1;
      UNLOCK();
      iVar10 = iVar10 + -1;
    }
    else {
      if ((&stack0x00001208)[lVar11] == '\0') {
        uVar8 = *(ushort *)(&stack0x0000029a + lVar11);
      }
      else {
        *(undefined8 *)((longlong)&uStack_30 + lVar11) = 0x180216bb9;
        FUN_18022fc40(*(longlong *)(&stack0x000011e0 + lVar11) + 0x80,
                      (longlong)&stack0x00000000 + lVar11);
        *(undefined8 *)((longlong)&uStack_30 + lVar11) = 0x180216bc4;
        uVar8 = Ordinal_15(*(undefined2 *)(&stack0x00000002 + lVar11));
      }
      *(uint *)(&stack0x00000028 + lVar11) = (uint)uVar8;
      lVar22 = *param_2;
      if ((lVar22 == 0) || (((char)param_2[1] != '\0' && (*(char *)(lVar22 + 0xb8) != '\0')))) {
LAB_180217133:
        *(undefined8 *)((longlong)&uStack_30 + lVar11) = 0x18021713d;
        FUN_18021b590(4);
        goto LAB_18021713e;
      }
      *(undefined8 *)((longlong)&uStack_30 + lVar11) = 0x180216bf8;
      FUN_18021b1d0(lVar22,&stack0x00000028 + lVar11,0);
      *(undefined8 *)((longlong)&uStack_30 + lVar11) = 0x180216c05;
      FUN_180228f30(&stack0x00000198 + lVar11);
      puVar17 = *(undefined8 **)(&stack0x00000198 + lVar11);
      if (puVar17 != (undefined8 *)0x0) {
        LOCK();
        piVar1 = (int *)(puVar17 + 1);
        *piVar1 = *piVar1 + -1;
        UNLOCK();
        if (*piVar1 == 0) {
          puVar21 = (undefined8 *)puVar17[0x19];
          if (puVar21 == (undefined8 *)0x0) {
            if (puVar17 != (undefined8 *)0x0) {
              pcVar3 = *(code **)*puVar17;
              *(undefined8 *)((longlong)&uStack_30 + lVar11) = 0x180216c41;
              (*pcVar3)(puVar17,1);
            }
          }
          else {
            pcVar3 = *(code **)*puVar21;
            *(undefined8 *)((longlong)&uStack_30 + lVar11) = 0x180216c30;
            (*pcVar3)(puVar21,puVar17);
          }
        }
      }
      *(undefined8 *)((longlong)&uStack_30 + lVar11) = 0x180216c4f;
      FUN_1801b1070(&stack0x00000210 + lVar11);
      *(undefined8 *)((longlong)&uStack_30 + lVar11) = 0x180216c64;
      FUN_1801e44a0(&stack0x00000200 + lVar11,*(undefined8 *)(&stack0x00000200 + lVar11));
      *(undefined8 *)((longlong)&uStack_30 + lVar11) = 0x180216c76;
      func_0x000180e15340(*(undefined8 *)(&stack0x00000200 + lVar11),0x58);
      *(undefined8 *)((longlong)&uStack_30 + lVar11) = 0x180216c84;
      FUN_1801f5aa0(&stack0x000012f8 + lVar11);
      *(undefined8 *)((longlong)&uStack_30 + lVar11) = 0x180216c91;
      FUN_18021b5c0(&stack0x000011f0 + lVar11);
      if (*(longlong *)(&stack0x000011e8 + lVar11) != 0) {
        *(undefined8 *)((longlong)&uStack_30 + lVar11) = 0x180216ca8;
        FUN_1802150c0(*(longlong *)(&stack0x000011e8 + lVar11),1);
      }
      if (*(longlong *)(&stack0x000011e0 + lVar11) != 0) {
        *(undefined8 *)((longlong)&uStack_30 + lVar11) = 0x180216cbf;
        FUN_180214f60(*(longlong *)(&stack0x000011e0 + lVar11),1);
      }
      plVar2 = *(longlong **)(&stack0x000011d0 + lVar11);
      if (plVar2 != (longlong *)0x0) {
        pcVar3 = *(code **)(*plVar2 + 0x20);
        *(undefined8 *)((longlong)&uStack_30 + lVar11) = 0x180216ce0;
        (*pcVar3)(plVar2,CONCAT71((int7)((ulonglong)(&stack0x00001198 + lVar11) >> 8),
                                  plVar2 != (longlong *)(&stack0x00001198 + lVar11)));
        *(undefined8 *)(&stack0x000011d0 + lVar11) = 0;
      }
      *(undefined8 *)((longlong)&uStack_30 + lVar11) = 0x180216cf5;
      FUN_1801f5c40(&stack0x00000300 + lVar11);
      *(undefined8 *)((longlong)&uStack_30 + lVar11) = 0x180216d02;
      FUN_180195980(&stack0x000002d0 + lVar11);
      *(undefined8 *)((longlong)&uStack_30 + lVar11) = 0x180216d0f;
      FUN_180195980(&stack0x000002b0 + lVar11);
      lVar22 = *param_2;
      if (((lVar22 != 0) && (((char)param_2[1] == '\0' || (*(char *)(lVar22 + 0xb8) == '\0')))) &&
         (*(int *)(lVar22 + 0xbc) == 0)) {
        *(undefined8 *)(&stack0x000001c8 + lVar11) = 0;
        *(undefined8 *)(&stack0x000001d0 + lVar11) = 0;
        *(undefined8 *)(&stack0x000001d8 + lVar11) = 0;
        *(undefined8 *)(&stack0x000001e0 + lVar11) = 0;
        *(undefined8 *)(&stack0x000001e8 + lVar11) = 0;
        *(undefined4 *)(&stack0x00000198 + lVar11) = 1;
        *(undefined8 *)(&stack0x000001a0 + lVar11) = 0x1810bc690;
        *(undefined8 *)((longlong)&uStack_30 + lVar11) = 0x180216d89;
        FUN_1801f2eb0(&stack0x000001c8 + lVar11,&stack0x00000198 + lVar11);
        *(undefined **)(&stack0x00000000 + lVar11) = &UNK_180f46590;
        *(undefined8 *)(&stack0x00000008 + lVar11) = 0;
        *(undefined8 *)((longlong)&uStackX_10 + lVar11) = 0;
        *(undefined8 *)((longlong)&uStack_30 + lVar11) = 0x180216daf;
        FUN_180e16890(&stack0x000001d0 + lVar11,&stack0x00000008 + lVar11);
        *(undefined **)(&stack0x00000000 + lVar11) = &UNK_180f48010;
        *(undefined4 *)(&stack0x00000018 + lVar11) = *(undefined4 *)(&stack0x000001e0 + lVar11);
        *(undefined4 *)(&stack0x0000001c + lVar11) = *(undefined4 *)(&stack0x000001e4 + lVar11);
        *(undefined4 *)((longlong)&uStackX_20 + lVar11) = *(undefined4 *)(&stack0x000001e8 + lVar11)
        ;
        *(undefined4 *)((longlong)&uStackX_20 + lVar11 + 4) =
             *(undefined4 *)(&stack0x000001ec + lVar11);
        *(undefined8 *)((longlong)&uStack_30 + lVar11) = 0x180216dda;
        uVar12 = FUN_1801ee3c0(&stack0x00000198 + lVar11,(longlong)&stack0x00000000 + lVar11);
        *(undefined8 *)((longlong)&uStack_30 + lVar11) = 0x180216de8;
        FUN_18021b140(param_2,uVar12,0);
        *(undefined **)(&stack0x000001c8 + lVar11) = &UNK_180f46590;
        *(undefined8 *)((longlong)&uStack_30 + lVar11) = 0x180216dfd;
        FUN_180e16930(&stack0x000001d0 + lVar11);
      }
      puVar17 = (undefined8 *)*param_2;
      if (puVar17 == (undefined8 *)0x0) goto LAB_180217106;
      LOCK();
      piVar1 = (int *)(puVar17 + 1);
      *piVar1 = *piVar1 + -1;
      iVar10 = *piVar1;
      UNLOCK();
    }
    if (iVar10 == 0) {
      puVar21 = (undefined8 *)puVar17[0x19];
      if (puVar21 == (undefined8 *)0x0) {
        pcVar3 = *(code **)*puVar17;
        *(undefined8 *)((longlong)&uStack_30 + lVar11) = 0x180217105;
        (*pcVar3)(puVar17,1);
      }
      else {
        pcVar3 = *(code **)*puVar21;
        *(undefined8 *)((longlong)&uStack_30 + lVar11) = 0x1802170f9;
        (*pcVar3)(puVar21,puVar17);
      }
    }
LAB_180217106:
    *(undefined8 *)((longlong)&uStack_30 + lVar11) = 0x180217116;
    FUN_180e155e0(*(ulonglong *)(&stack0x00001318 + lVar11) ^
                  (ulonglong)(&stack0xffffffffffffffd8 + lVar11));
    return;
  }
  lVar22 = *(longlong *)(&stack0x00000000 + lVar11);
  if (uVar4 + 1 < 0x1000) {
    *(undefined8 *)((longlong)&uStack_30 + lVar11) = 0x180216327;
    func_0x000180e15340(lVar22,uVar4 + 1,lVar22);
    goto LAB_18021632f;
  }
  lVar13 = *(longlong *)(lVar22 + -8);
  if ((lVar22 - lVar13) - 8U < 0x20) {
    *(undefined8 *)((longlong)&uStack_30 + lVar11) = 0x18021630f;
    func_0x000180e15340(lVar13,uVar4 + 0x28);
    goto LAB_18021632f;
  }
LAB_18021713e:
  pcVar3 = (code *)swi(0x29);
  (*pcVar3)(5);
  puVar20 = &stack0xffffffffffffffe0 + lVar11;
LAB_180217145:
  *(undefined8 *)(puVar20 + -8) = 0x18021714f;
  FUN_18021b590(4);
  pcVar3 = (code *)swi(3);
  (*pcVar3)();
  return;
}


