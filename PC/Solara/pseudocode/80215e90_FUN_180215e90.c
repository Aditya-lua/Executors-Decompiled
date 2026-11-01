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
  undefined8 *puVar13;
  undefined4 *puVar14;
  longlong lVar15;
  undefined8 *puVar16;
  uint uVar17;
  undefined1 *puVar18;
  undefined1 *puVar19;
  longlong lVar20;
  longlong unaff_GS_OFFSET;
  undefined1 uStack00000000000001b8;
  undefined8 uStack_30;
  
  uStack_30 = 0x180215ead;
  lVar11 = FUN_180e15b20();
  lVar11 = -lVar11;
  *(ulonglong *)((longlong)register0x00000020 + lVar11 + 0x1318) =
       _DAT_1810c1700 ^ (longlong)register0x00000020 + lVar11 + -0x28;
  *(longlong **)(&uStack00000000000001b8 + lVar11) = param_2;
  *(undefined8 *)((longlong)&uStack_30 + lVar11) = 0x180215ee2;
  FUN_180f297c0((longlong)register0x00000020 + lVar11 + 0x298,0,0x1078);
  *(undefined8 *)((longlong)&uStack_30 + lVar11) = 0x180215eef;
  FUN_1801ef8d0((longlong)register0x00000020 + lVar11 + 0x298);
  puVar19 = (undefined1 *)((longlong)register0x00000020 + lVar11 + -0x28);
  lVar20 = *(longlong *)(*(longlong *)(unaff_GS_OFFSET + 0x58) + (ulonglong)__tls_index * 8);
  if (*(int *)(lVar20 + 4) < _DAT_1810cec20) {
    *(undefined8 *)((longlong)&uStack_30 + lVar11) = 0x180215f1f;
    FUN_180e15c30(&DAT_1810cec20);
    puVar19 = (undefined1 *)((longlong)register0x00000020 + lVar11 + -0x28);
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
      puVar19 = (undefined1 *)((longlong)register0x00000020 + lVar11 + -0x28);
    }
  }
  *(undefined8 *)(puVar19 + -8) = 0x180215f8e;
  uVar12 = FUN_180229980();
  *(undefined8 *)(puVar19 + 0x50) = uVar12;
  if (*(int *)(lVar20 + 4) < iRam00000001810cec24) {
    *(undefined8 *)(puVar19 + -8) = 0x180215faa;
    FUN_180e15c30(0x1810cec24);
    if (iRam00000001810cec24 == -1) {
      *(undefined8 *)(puVar19 + -8) = 0x180215fbf;
      FUN_180e15ad0(FUN_180f42f40);
      *(undefined8 *)(puVar19 + -8) = 0x180215fcb;
      FUN_180e15bc0(0x1810cec24);
    }
  }
  *(undefined8 *)(puVar19 + 0x220) = 0;
  *(undefined8 *)(puVar19 + 0x228) = 0;
  *(undefined8 *)(puVar19 + 0x230) = 0;
  *(undefined8 *)(puVar19 + 0x238) = 0;
  *(undefined8 *)(puVar19 + 0x240) = 0;
  *(undefined8 *)(puVar19 + 0x248) = 0;
  *(undefined8 *)(puVar19 + 0x250) = 0;
  *(undefined8 *)(puVar19 + 600) = 0;
  *(undefined8 *)(puVar19 + 0x260) = 0;
  *(undefined8 *)(puVar19 + 0x268) = 0;
  *(undefined8 *)(puVar19 + 0x270) = 0;
  *(undefined8 *)(puVar19 + 0x278) = 0;
  *(undefined8 *)(puVar19 + 0x280) = 0;
  *(undefined8 *)(puVar19 + 0x288) = 0;
  *(undefined8 *)(puVar19 + 0x290) = 0;
  *(undefined8 *)(puVar19 + 0x298) = 0;
  *(undefined8 *)(puVar19 + 0x2a0) = 0;
  *(undefined8 *)(puVar19 + 0x2a8) = 0;
  *(undefined8 *)(puVar19 + 0x2b0) = 0;
  *(undefined1 **)(puVar19 + 0x20) = puVar19 + 0x220;
  *(undefined4 *)(puVar19 + 0x220) = 0;
  *(undefined8 *)(puVar19 + 0x228) = 0;
  *(undefined8 *)(puVar19 + 0x230) = 0;
  *(undefined8 *)(puVar19 + -8) = 0x180216052;
  lVar11 = FUN_180e152f0(0x58);
  *(longlong *)lVar11 = lVar11;
  *(longlong *)(lVar11 + 8) = lVar11;
  *(longlong *)(puVar19 + 0x228) = lVar11;
  *(undefined8 *)(puVar19 + 0x238) = 0;
  *(undefined8 *)(puVar19 + 0x240) = 0;
  *(undefined8 *)(puVar19 + 0x248) = 0;
  *(undefined8 *)(puVar19 + 0x250) = 7;
  *(undefined8 *)(puVar19 + 600) = 8;
  *(undefined4 *)(puVar19 + 0x220) = 0x3f800000;
  *(undefined8 *)(puVar19 + -8) = 0x1802160ad;
  FUN_1801bee10(puVar19 + 0x238,0x10,lVar11);
  *(undefined8 *)(puVar19 + 0x260) = 1;
  *(undefined8 *)(puVar19 + 0x280) = 0;
  *(undefined8 *)(puVar19 + 0x288) = 0;
  *(undefined8 *)(puVar19 + 0x290) = 0;
  *(undefined8 *)(puVar19 + 0x298) = 0;
  *(undefined8 *)(puVar19 + 0x2a0) = 0;
  *(undefined8 *)(puVar19 + 0x2a8) = 0;
  *(undefined8 *)(puVar19 + 0x270) = 0;
  *(undefined8 *)(puVar19 + 0x278) = 0;
  *(undefined4 *)(puVar19 + 0x2b0) = 0xffffffff;
  *(undefined4 *)(puVar19 + 0x268) = 2;
  *(undefined4 *)(puVar19 + 0x2b4) = 0;
  if (*(int *)(lVar20 + 4) < iRam00000001810ced40) {
    *(undefined8 *)(puVar19 + -8) = 0x180216115;
    FUN_180e15c30(0x1810ced40);
    if (iRam00000001810ced40 == -1) {
      *(undefined8 *)(puVar19 + -8) = 0x180216135;
      FUN_180f297c0(0x1810cec90,0,0xb0);
      *(undefined8 *)(puVar19 + -8) = 0x18021613d;
      FUN_1801f3710(0x1810cec90);
      *(undefined8 *)(puVar19 + -8) = 0x180216149;
      FUN_180e15ad0(FUN_180f42fc0);
      *(undefined8 *)(puVar19 + -8) = 0x180216156;
      FUN_180e15bc0(0x1810ced40);
    }
  }
  uRam00000001810bc1c0 = 4;
  *(undefined8 *)(puVar19 + -8) = 0x180216175;
  FUN_18028ca70(0x1810bc250);
  *(undefined8 *)(puVar19 + 0x28) = 0;
  *(undefined8 *)(puVar19 + 0x30) = 0;
  *(undefined8 *)(puVar19 + 0x38) = 0;
  *(undefined8 *)(puVar19 + 0x40) = 0;
  *(undefined8 *)(puVar19 + -8) = 0x18021619e;
  FUN_180191ab0(puVar19 + 0x28,&UNK_180f46be4,1);
  *(undefined8 *)(puVar19 + -8) = 0x1802161a9;
  puVar13 = (undefined8 *)FUN_180e152f0(0xe0);
  *(undefined8 **)(puVar19 + 0x20) = puVar13;
  if (puVar13 == (undefined8 *)0x0) {
    puVar13 = (undefined8 *)0x0;
  }
  else {
    *(undefined8 *)(puVar19 + -8) = 0x1802161c6;
    FUN_180f297c0(puVar13,0,0xe0);
    *(undefined8 *)(puVar19 + -8) = 0x1802161d8;
    puVar14 = (undefined4 *)FUN_180193750(puVar19 + 0x1f0,puVar19 + 0x28);
    uVar5 = puVar14[1];
    uVar6 = puVar14[2];
    uVar7 = puVar14[3];
    *(undefined4 *)(puVar19 + 0x1c0) = *puVar14;
    *(undefined4 *)(puVar19 + 0x1c4) = uVar5;
    *(undefined4 *)(puVar19 + 0x1c8) = uVar6;
    *(undefined4 *)(puVar19 + 0x1cc) = uVar7;
    uVar5 = puVar14[5];
    uVar6 = puVar14[6];
    uVar7 = puVar14[7];
    *(undefined4 *)(puVar19 + 0x1d0) = puVar14[4];
    *(undefined4 *)(puVar19 + 0x1d4) = uVar5;
    *(undefined4 *)(puVar19 + 0x1d8) = uVar6;
    *(undefined4 *)(puVar19 + 0x1dc) = uVar7;
    *(undefined1 *)puVar14 = 0;
    *(undefined8 *)(puVar14 + 4) = 0;
    *(undefined8 *)(puVar14 + 6) = 0xf;
    *(undefined8 *)(puVar19 + -8) = 0x180216211;
    FUN_1801f25b0(puVar13,puVar19 + 0x1c0);
    *puVar13 = &UNK_180f49c68;
    puVar13[0x1b] = 0;
    *(undefined8 *)(puVar19 + -8) = 0x18021622a;
    FUN_180195980(puVar14);
  }
  *(undefined8 **)(puVar19 + 0x20) = puVar13;
  puVar16 = *(undefined8 **)(puVar19 + 0x1148);
  if (puVar16 == *(undefined8 **)(puVar19 + 0x1150)) {
    *(undefined8 *)(puVar19 + -8) = 0x180216266;
    FUN_1801e3330(puVar19 + 0x1140,puVar16,puVar19 + 0x20);
  }
  else {
    *puVar16 = puVar13;
    *(longlong *)(puVar19 + 0x1148) = *(longlong *)(puVar19 + 0x1148) + 8;
  }
  *(undefined **)(puVar19 + 0xc0) = &UNK_180f4a5b8;
  puVar19[200] = puVar19[0x1e8];
  *(undefined1 **)(puVar19 + 0xf8) = puVar19 + 0xc0;
  *(undefined8 *)(puVar19 + -8) = 0x1802162a8;
  FUN_180238060(puVar19 + 0xc0,puVar13 + 0x14);
  plVar2 = *(longlong **)(puVar19 + 0xf8);
  if (plVar2 != (longlong *)0x0) {
    pcVar3 = *(code **)(*plVar2 + 0x20);
    *(undefined8 *)(puVar19 + -8) = 0x1802162c9;
    (*pcVar3)(plVar2,CONCAT71((int7)((ulonglong)(puVar19 + 0xc0) >> 8),
                              plVar2 != (longlong *)(puVar19 + 0xc0)));
  }
  uVar4 = *(ulonglong *)(puVar19 + 0x40);
  if (0xf < uVar4) {
    lVar20 = *(longlong *)(puVar19 + 0x28);
    if (uVar4 + 1 < 0x1000) {
      *(undefined8 *)(puVar19 + -8) = 0x180216327;
      func_0x000180e15340(lVar20,uVar4 + 1,lVar20);
      goto code_r0x00018021632f;
    }
    lVar11 = *(longlong *)(lVar20 + -8);
    if ((lVar20 - lVar11) - 8U < 0x20) {
      *(undefined8 *)(puVar19 + -8) = 0x18021630f;
      func_0x000180e15340(lVar11,uVar4 + 0x28);
      goto code_r0x00018021632f;
    }
code_r0x00018021713e:
    pcVar3 = (code *)swi(0x29);
    (*pcVar3)(5);
    puVar19 = puVar19 + 8;
code_r0x000180217145:
    *(undefined8 *)(puVar19 + -8) = 0x18021714f;
    FUN_18021b590(4);
    pcVar3 = (code *)swi(3);
    (*pcVar3)();
    return;
  }
code_r0x00018021632f:
  lVar20 = 0x28;
  *(undefined8 *)(puVar19 + 0x28) = 0;
  *(undefined8 *)(puVar19 + 0x30) = 0;
  *(undefined8 *)(puVar19 + 0x38) = 0;
  *(undefined8 *)(puVar19 + 0x40) = 0;
  *(undefined8 *)(puVar19 + -8) = 0x180216358;
  FUN_180191ab0(puVar19 + 0x28,&UNK_180f49d60,6);
  *(undefined8 *)(puVar19 + -8) = 0x180216363;
  puVar13 = (undefined8 *)FUN_180e152f0(0xe0);
  *(undefined8 **)(puVar19 + 0x1c0) = puVar13;
  if (puVar13 == (undefined8 *)0x0) {
    puVar13 = (undefined8 *)0x0;
  }
  else {
    *(undefined8 *)(puVar19 + -8) = 0x180216383;
    FUN_180f297c0(puVar13,0,0xe0);
    *(undefined8 *)(puVar19 + -8) = 0x180216395;
    puVar14 = (undefined4 *)FUN_180193750(puVar19 + 0x1f0,puVar19 + 0x28);
    uVar5 = puVar14[1];
    uVar6 = puVar14[2];
    uVar7 = puVar14[3];
    *(undefined4 *)(puVar19 + 0x1c0) = *puVar14;
    *(undefined4 *)(puVar19 + 0x1c4) = uVar5;
    *(undefined4 *)(puVar19 + 0x1c8) = uVar6;
    *(undefined4 *)(puVar19 + 0x1cc) = uVar7;
    uVar5 = puVar14[5];
    uVar6 = puVar14[6];
    uVar7 = puVar14[7];
    *(undefined4 *)(puVar19 + 0x1d0) = puVar14[4];
    *(undefined4 *)(puVar19 + 0x1d4) = uVar5;
    *(undefined4 *)(puVar19 + 0x1d8) = uVar6;
    *(undefined4 *)(puVar19 + 0x1dc) = uVar7;
    *(undefined1 *)puVar14 = 0;
    *(undefined8 *)(puVar14 + 4) = 0;
    *(undefined8 *)(puVar14 + 6) = 0xf;
    *(undefined8 *)(puVar19 + -8) = 0x1802163ce;
    FUN_1801f25b0(puVar13,puVar19 + 0x1c0);
    *puVar13 = &UNK_180f49c68;
    puVar13[0x1b] = 0;
    *(undefined8 *)(puVar19 + -8) = 0x1802163e7;
    FUN_180195980(puVar14);
  }
  *(undefined8 **)(puVar19 + 0x20) = puVar13;
  puVar16 = *(undefined8 **)(puVar19 + 0x1148);
  if (puVar16 == *(undefined8 **)(puVar19 + 0x1150)) {
    *(undefined8 *)(puVar19 + -8) = 0x180216423;
    FUN_1801e3330(puVar19 + 0x1140,puVar16,puVar19 + 0x20);
  }
  else {
    *puVar16 = puVar13;
    *(longlong *)(puVar19 + 0x1148) = *(longlong *)(puVar19 + 0x1148) + 8;
  }
  if (puVar13 == (undefined8 *)0xffffffffffffff67) {
    puVar13 = (undefined8 *)0x0;
  }
  puVar13[5] = 8;
  *(undefined **)(puVar19 + 0x80) = &UNK_180f4a5f0;
  uVar12 = *(undefined8 *)(puVar19 + 0x50);
  *(undefined8 *)(puVar19 + 0x88) = uVar12;
  *(undefined8 *)(puVar19 + 0x90) = 0x1810bc250;
  *(undefined1 **)(puVar19 + 0x98) = puVar19 + 0x220;
  *(undefined1 **)(puVar19 + 0xb8) = puVar19 + 0x80;
  *(undefined8 *)(puVar19 + -8) = 0x180216498;
  FUN_180238060(puVar19 + 0x80,puVar13 + 0x14);
  plVar2 = *(longlong **)(puVar19 + 0xb8);
  if (plVar2 != (longlong *)0x0) {
    pcVar3 = *(code **)(*plVar2 + 0x20);
    *(undefined8 *)(puVar19 + -8) = 0x1802164b9;
    (*pcVar3)(plVar2,CONCAT71((int7)((ulonglong)(puVar19 + 0x80) >> 8),
                              plVar2 != (longlong *)(puVar19 + 0x80)));
  }
  uVar4 = *(ulonglong *)(puVar19 + 0x40);
  if (0xf < uVar4) {
    lVar11 = *(longlong *)(puVar19 + 0x28);
    if (uVar4 + 1 < 0x1000) {
      lVar15 = 1;
    }
    else {
      if (0x1f < (lVar11 - *(longlong *)(lVar11 + -8)) - 8U) goto code_r0x00018021713e;
      lVar15 = 0x28;
      lVar11 = *(longlong *)(lVar11 + -8);
    }
    *(undefined8 *)(puVar19 + -8) = 0x180216503;
    func_0x000180e15340(lVar11,uVar4 + lVar15);
  }
  *(undefined8 *)(puVar19 + 0x28) = 0;
  *(undefined8 *)(puVar19 + 0x30) = 0;
  *(undefined8 *)(puVar19 + 0x38) = 0;
  *(undefined8 *)(puVar19 + 0x40) = 0;
  *(undefined8 *)(puVar19 + -8) = 0x18021652c;
  FUN_180191ab0(puVar19 + 0x28,&UNK_180f49d68,0xf);
  *(undefined8 *)(puVar19 + -8) = 0x180216537;
  puVar13 = (undefined8 *)FUN_180e152f0(0xe0);
  *(undefined8 **)(puVar19 + 0x1c0) = puVar13;
  if (puVar13 == (undefined8 *)0x0) {
    puVar13 = (undefined8 *)0x0;
  }
  else {
    *(undefined8 *)(puVar19 + -8) = 0x180216557;
    FUN_180f297c0(puVar13,0,0xe0);
    *(undefined8 *)(puVar19 + -8) = 0x180216569;
    puVar14 = (undefined4 *)FUN_180193750(puVar19 + 0x1f0,puVar19 + 0x28);
    uVar5 = puVar14[1];
    uVar6 = puVar14[2];
    uVar7 = puVar14[3];
    *(undefined4 *)(puVar19 + 0x1c0) = *puVar14;
    *(undefined4 *)(puVar19 + 0x1c4) = uVar5;
    *(undefined4 *)(puVar19 + 0x1c8) = uVar6;
    *(undefined4 *)(puVar19 + 0x1cc) = uVar7;
    uVar5 = puVar14[5];
    uVar6 = puVar14[6];
    uVar7 = puVar14[7];
    *(undefined4 *)(puVar19 + 0x1d0) = puVar14[4];
    *(undefined4 *)(puVar19 + 0x1d4) = uVar5;
    *(undefined4 *)(puVar19 + 0x1d8) = uVar6;
    *(undefined4 *)(puVar19 + 0x1dc) = uVar7;
    *(undefined1 *)puVar14 = 0;
    *(undefined8 *)(puVar14 + 4) = 0;
    *(undefined8 *)(puVar14 + 6) = 0xf;
    *(undefined8 *)(puVar19 + -8) = 0x1802165a2;
    FUN_1801f25b0(puVar13,puVar19 + 0x1c0);
    *puVar13 = &UNK_180f49c68;
    puVar13[0x1b] = 0;
    *(undefined8 *)(puVar19 + -8) = 0x1802165bb;
    FUN_180195980(puVar14);
    uVar12 = *(undefined8 *)(puVar19 + 0x50);
  }
  *(undefined8 **)(puVar19 + 0x20) = puVar13;
  puVar16 = *(undefined8 **)(puVar19 + 0x1148);
  if (puVar16 == *(undefined8 **)(puVar19 + 0x1150)) {
    *(undefined8 *)(puVar19 + -8) = 0x1802165fc;
    FUN_1801e3330(puVar19 + 0x1140,puVar16,puVar19 + 0x20);
  }
  else {
    *puVar16 = puVar13;
    *(longlong *)(puVar19 + 0x1148) = *(longlong *)(puVar19 + 0x1148) + 8;
  }
  if (puVar13 == (undefined8 *)0xffffffffffffff67) {
    puVar13 = (undefined8 *)0x0;
  }
  puVar13[5] = 8;
  *(undefined **)(puVar19 + 0x100) = &UNK_180f4a628;
  *(undefined8 *)(puVar19 + 0x108) = uVar12;
  *(undefined1 **)(puVar19 + 0x138) = puVar19 + 0x100;
  *(undefined8 *)(puVar19 + -8) = 0x18021664d;
  FUN_180238060(puVar19 + 0x100,puVar13 + 0x14);
  plVar2 = *(longlong **)(puVar19 + 0x138);
  if (plVar2 != (longlong *)0x0) {
    pcVar3 = *(code **)(*plVar2 + 0x20);
    *(undefined8 *)(puVar19 + -8) = 0x18021666e;
    (*pcVar3)(plVar2,CONCAT71((int7)((ulonglong)(puVar19 + 0x100) >> 8),
                              plVar2 != (longlong *)(puVar19 + 0x100)));
  }
  uVar4 = *(ulonglong *)(puVar19 + 0x40);
  if (0xf < uVar4) {
    lVar11 = *(longlong *)(puVar19 + 0x28);
    if (uVar4 + 1 < 0x1000) {
      lVar15 = 1;
    }
    else {
      if (0x1f < (lVar11 - *(longlong *)(lVar11 + -8)) - 8U) goto code_r0x00018021713e;
      lVar15 = 0x28;
      lVar11 = *(longlong *)(lVar11 + -8);
    }
    *(undefined8 *)(puVar19 + -8) = 0x1802166b8;
    func_0x000180e15340(lVar11,uVar4 + lVar15);
  }
  *(undefined8 *)(puVar19 + 0x28) = 0;
  *(undefined8 *)(puVar19 + 0x30) = 0;
  *(undefined8 *)(puVar19 + 0x38) = 0;
  *(undefined8 *)(puVar19 + 0x40) = 0;
  *(undefined8 *)(puVar19 + -8) = 0x1802166e1;
  FUN_180191ab0(puVar19 + 0x28,&UNK_180f49d78,8);
  *(undefined8 *)(puVar19 + -8) = 0x1802166ec;
  puVar13 = (undefined8 *)FUN_180e152f0(0xe0);
  *(undefined8 **)(puVar19 + 0x1c0) = puVar13;
  if (puVar13 == (undefined8 *)0x0) {
    puVar13 = (undefined8 *)0x0;
  }
  else {
    *(undefined8 *)(puVar19 + -8) = 0x18021670c;
    FUN_180f297c0(puVar13,0,0xe0);
    *(undefined8 *)(puVar19 + -8) = 0x18021671e;
    puVar14 = (undefined4 *)FUN_180193750(puVar19 + 0x1f0,puVar19 + 0x28);
    uVar5 = puVar14[1];
    uVar6 = puVar14[2];
    uVar7 = puVar14[3];
    *(undefined4 *)(puVar19 + 0x1c0) = *puVar14;
    *(undefined4 *)(puVar19 + 0x1c4) = uVar5;
    *(undefined4 *)(puVar19 + 0x1c8) = uVar6;
    *(undefined4 *)(puVar19 + 0x1cc) = uVar7;
    uVar5 = puVar14[5];
    uVar6 = puVar14[6];
    uVar7 = puVar14[7];
    *(undefined4 *)(puVar19 + 0x1d0) = puVar14[4];
    *(undefined4 *)(puVar19 + 0x1d4) = uVar5;
    *(undefined4 *)(puVar19 + 0x1d8) = uVar6;
    *(undefined4 *)(puVar19 + 0x1dc) = uVar7;
    *(undefined1 *)puVar14 = 0;
    *(undefined8 *)(puVar14 + 4) = 0;
    *(undefined8 *)(puVar14 + 6) = 0xf;
    *(undefined8 *)(puVar19 + -8) = 0x180216757;
    FUN_1801f25b0(puVar13,puVar19 + 0x1c0);
    *puVar13 = &UNK_180f49c68;
    puVar13[0x1b] = 0;
    *(undefined8 *)(puVar19 + -8) = 0x180216770;
    FUN_180195980(puVar14);
    uVar12 = *(undefined8 *)(puVar19 + 0x50);
  }
  *(undefined8 **)(puVar19 + 0x20) = puVar13;
  puVar16 = *(undefined8 **)(puVar19 + 0x1148);
  if (puVar16 == *(undefined8 **)(puVar19 + 0x1150)) {
    *(undefined8 *)(puVar19 + -8) = 0x1802167b1;
    FUN_1801e3330(puVar19 + 0x1140,puVar16,puVar19 + 0x20);
  }
  else {
    *puVar16 = puVar13;
    *(longlong *)(puVar19 + 0x1148) = *(longlong *)(puVar19 + 0x1148) + 8;
  }
  if (puVar13 == (undefined8 *)0xffffffffffffff67) {
    puVar13 = (undefined8 *)0x0;
  }
  puVar13[5] = 8;
  *(undefined8 *)(puVar19 + 0x1b8) = 0;
  *(undefined8 *)(puVar19 + -8) = 0x1802167d9;
  puVar16 = (undefined8 *)FUN_180e152f0(0x50);
  *puVar16 = &UNK_180f4a660;
  puVar16[1] = uVar12;
  puVar16[2] = &DAT_1810cebe0;
  puVar16[3] = 0x1810ced44;
  puVar16[4] = 0x1810bc250;
  puVar16[5] = puVar19 + 0x220;
  puVar16[6] = 0x1810cec8c;
  puVar16[7] = puVar19 + 0x1e8;
  puVar16[8] = 0x1810cec90;
  puVar16[9] = puVar19 + 0x1e9;
  *(undefined8 **)(puVar19 + 0x1b8) = puVar16;
  *(undefined8 *)(puVar19 + -8) = 0x180216857;
  FUN_180238060(puVar19 + 0x180,puVar13 + 0x14);
  plVar2 = *(longlong **)(puVar19 + 0x1b8);
  if (plVar2 != (longlong *)0x0) {
    pcVar3 = *(code **)(*plVar2 + 0x20);
    *(undefined8 *)(puVar19 + -8) = 0x180216878;
    (*pcVar3)(plVar2,CONCAT71((int7)((ulonglong)(puVar19 + 0x180) >> 8),
                              plVar2 != (longlong *)(puVar19 + 0x180)));
  }
  uVar4 = *(ulonglong *)(puVar19 + 0x40);
  if (0xf < uVar4) {
    lVar11 = *(longlong *)(puVar19 + 0x28);
    if (uVar4 + 1 < 0x1000) {
      lVar20 = 1;
      lVar15 = lVar11;
    }
    else {
      lVar15 = *(longlong *)(lVar11 + -8);
      if (0x1f < (lVar11 - lVar15) - 8U) goto code_r0x00018021713e;
    }
    *(undefined8 *)(puVar19 + -8) = 0x1802168c0;
    func_0x000180e15340(lVar15,uVar4 + lVar20);
  }
  *(undefined8 *)(puVar19 + 0x28) = 0;
  *(undefined8 *)(puVar19 + 0x30) = 0;
  *(undefined8 *)(puVar19 + 0x38) = 0;
  *(undefined8 *)(puVar19 + 0x40) = 0;
  *(undefined8 *)(puVar19 + -8) = 0x1802168e9;
  FUN_180191ab0(puVar19 + 0x28,&UNK_180f49d88,0xf);
  *(undefined8 *)(puVar19 + -8) = 0x1802168f4;
  puVar13 = (undefined8 *)FUN_180e152f0(0xe0);
  *(undefined8 **)(puVar19 + 0x1c0) = puVar13;
  if (puVar13 == (undefined8 *)0x0) {
    puVar13 = (undefined8 *)0x0;
  }
  else {
    *(undefined8 *)(puVar19 + -8) = 0x180216914;
    FUN_180f297c0(puVar13,0,0xe0);
    *(undefined8 *)(puVar19 + -8) = 0x180216926;
    puVar14 = (undefined4 *)FUN_180193750(puVar19 + 0x1f0,puVar19 + 0x28);
    uVar5 = puVar14[1];
    uVar6 = puVar14[2];
    uVar7 = puVar14[3];
    *(undefined4 *)(puVar19 + 0x1c0) = *puVar14;
    *(undefined4 *)(puVar19 + 0x1c4) = uVar5;
    *(undefined4 *)(puVar19 + 0x1c8) = uVar6;
    *(undefined4 *)(puVar19 + 0x1cc) = uVar7;
    uVar5 = puVar14[5];
    uVar6 = puVar14[6];
    uVar7 = puVar14[7];
    *(undefined4 *)(puVar19 + 0x1d0) = puVar14[4];
    *(undefined4 *)(puVar19 + 0x1d4) = uVar5;
    *(undefined4 *)(puVar19 + 0x1d8) = uVar6;
    *(undefined4 *)(puVar19 + 0x1dc) = uVar7;
    *(undefined1 *)puVar14 = 0;
    *(undefined8 *)(puVar14 + 4) = 0;
    *(undefined8 *)(puVar14 + 6) = 0xf;
    *(undefined8 *)(puVar19 + -8) = 0x18021695f;
    FUN_1801f25b0(puVar13,puVar19 + 0x1c0);
    *puVar13 = &UNK_180f49c68;
    puVar13[0x1b] = 0;
    *(undefined8 *)(puVar19 + -8) = 0x180216978;
    FUN_180195980(puVar14);
    uVar12 = *(undefined8 *)(puVar19 + 0x50);
  }
  *(undefined8 **)(puVar19 + 0x20) = puVar13;
  puVar16 = *(undefined8 **)(puVar19 + 0x1148);
  if (puVar16 == *(undefined8 **)(puVar19 + 0x1150)) {
    *(undefined8 *)(puVar19 + -8) = 0x1802169b9;
    FUN_1801e3330(puVar19 + 0x1140,puVar16,puVar19 + 0x20);
  }
  else {
    *puVar16 = puVar13;
    *(longlong *)(puVar19 + 0x1148) = *(longlong *)(puVar19 + 0x1148) + 8;
  }
  if (puVar13 == (undefined8 *)0xffffffffffffff67) {
    puVar13 = (undefined8 *)0x0;
  }
  puVar13[5] = 8;
  *(undefined **)(puVar19 + 0x140) = &UNK_180f4a698;
  *(undefined8 *)(puVar19 + 0x148) = uVar12;
  *(undefined1 **)(puVar19 + 0x178) = puVar19 + 0x140;
  *(undefined8 *)(puVar19 + -8) = 0x180216a0a;
  FUN_180238060(puVar19 + 0x140,puVar13 + 0x14);
  plVar2 = *(longlong **)(puVar19 + 0x178);
  if (plVar2 != (longlong *)0x0) {
    pcVar3 = *(code **)(*plVar2 + 0x20);
    *(undefined8 *)(puVar19 + -8) = 0x180216a2b;
    (*pcVar3)(plVar2,CONCAT71((int7)((ulonglong)(puVar19 + 0x140) >> 8),
                              plVar2 != (longlong *)(puVar19 + 0x140)));
  }
  *(undefined8 *)(puVar19 + -8) = 0x180216a36;
  FUN_180195980(puVar19 + 0x28);
  *(undefined8 *)(puVar19 + -8) = 0x180216a43;
  FUN_180239210(puVar19 + 0x328);
  *(undefined8 *)(puVar19 + 0x58) = 0;
  *(undefined8 *)(puVar19 + 0x60) = 0;
  *(undefined8 *)(puVar19 + 0x68) = 0;
  *(undefined8 *)(puVar19 + 0x70) = 0;
  *(undefined8 *)(puVar19 + -8) = 0x180216a6c;
  FUN_180191ab0(puVar19 + 0x58,&UNK_180f49d98,9);
  *(undefined1 **)(puVar19 + 0x1c0) = puVar19 + 0x58;
  if (puVar19 + 0x2f8 != puVar19 + 0x58) {
    puVar18 = puVar19 + 0x58;
    if (0xf < *(ulonglong *)(puVar19 + 0x70)) {
      puVar18 = *(undefined1 **)(puVar19 + 0x58);
    }
    *(undefined8 *)(puVar19 + -8) = 0x180216aae;
    FUN_18019a4f0(puVar19 + 0x2f8,puVar18,*(undefined8 *)(puVar19 + 0x68));
  }
  *(undefined8 *)(puVar19 + -8) = 0x180216ab9;
  FUN_180195980(puVar19 + 0x58);
  *(undefined2 *)(puVar19 + 0x2c2) = 0;
  *(undefined8 *)(puVar19 + -8) = 0x180216ac6;
  uVar9 = FUN_180e13110();
  uVar17 = 2;
  if (1 < uVar9) {
    uVar17 = uVar9;
  }
  *(uint *)(puVar19 + 0x2c4) = uVar17;
  *(undefined8 *)(puVar19 + 0x1c0) = 0;
  *(undefined8 *)(puVar19 + 0x1c8) = 0;
  *(undefined8 *)(puVar19 + 0x28) = 0;
  *(undefined8 *)(puVar19 + 0x30) = 0;
  *(undefined8 *)(puVar19 + 0x38) = 0;
  *(undefined1 **)(puVar19 + 0x20) = puVar19 + 0x2c0;
  *(undefined8 *)(puVar19 + -8) = 0x180216b0b;
  puVar13 = (undefined8 *)FUN_1801e4970(1,puVar19 + 0x20);
  *(undefined8 **)(puVar19 + 0x28) = puVar13;
  puVar19[0x30] = 0;
  puVar19[0x38] = 0;
  if (puVar13 == (undefined8 *)0x0) goto code_r0x000180217145;
  *(undefined8 **)(puVar19 + 0x1c0) = puVar13;
  puVar19[0x1c8] = 1;
  LOCK();
  *(int *)(puVar13 + 1) = *(int *)(puVar13 + 1) + 1;
  UNLOCK();
  LOCK();
  piVar1 = (int *)(puVar13 + 1);
  *piVar1 = *piVar1 + -1;
  UNLOCK();
  if (*piVar1 == 0) {
    puVar16 = (undefined8 *)puVar13[0x19];
    if (puVar16 == (undefined8 *)0x0) {
      pcVar3 = *(code **)*puVar13;
      *(undefined8 *)(puVar19 + -8) = 0x180216b63;
      (*pcVar3)(puVar13,1);
    }
    else {
      pcVar3 = *(code **)*puVar16;
      *(undefined8 *)(puVar19 + -8) = 0x180216b57;
      (*pcVar3)(puVar16,puVar13);
    }
  }
  *(undefined8 *)(puVar19 + -8) = 0x180216b76;
  iVar10 = FUN_18023a320(puVar19 + 0x2c0,5000);
  if ((iVar10 == 1) || (puVar19[0x2c8] == '\0')) {
    *(undefined8 *)(puVar19 + -8) = 0x180216e1f;
    FUN_18021df30(puVar19 + 0x2c0);
    if (*(longlong *)(puVar19 + 0x1208) != 0) {
      *(undefined8 *)(puVar19 + -8) = 0x180216e31;
      FUN_180237440();
    }
    if (*(longlong *)(puVar19 + 0x1210) != 0) {
      *(undefined8 *)(puVar19 + -8) = 0x180216e43;
      FUN_180237950();
    }
    *(undefined8 *)(puVar19 + -8) = 0x180216e51;
    FUN_180228f30(puVar19 + 0x1c0);
    *(undefined4 *)(puVar19 + 0x50) = 0xffffffff;
    lVar20 = *param_2;
    if ((lVar20 == 0) || (((char)param_2[1] != '\0' && (*(char *)(lVar20 + 0xb8) != '\0'))))
    goto code_r0x000180217133;
    *(undefined8 *)(puVar19 + -8) = 0x180216e96;
    FUN_18021b1d0(lVar20,puVar19 + 0x50,0);
    puVar13 = *(undefined8 **)(puVar19 + 0x1c0);
    if (puVar13 != (undefined8 *)0x0) {
      LOCK();
      piVar1 = (int *)(puVar13 + 1);
      iVar10 = *piVar1;
      *piVar1 = *piVar1 + -1;
      UNLOCK();
      if (iVar10 == 1) {
        puVar16 = (undefined8 *)puVar13[0x19];
        if (puVar16 == (undefined8 *)0x0) {
          if (puVar13 != (undefined8 *)0x0) {
            pcVar3 = *(code **)*puVar13;
            *(undefined8 *)(puVar19 + -8) = 0x180216ed8;
            (*pcVar3)(puVar13,1);
          }
        }
        else {
          pcVar3 = *(code **)*puVar16;
          *(undefined8 *)(puVar19 + -8) = 0x180216ec7;
          (*pcVar3)(puVar16,puVar13);
        }
      }
    }
    *(undefined8 *)(puVar19 + -8) = 0x180216ee6;
    FUN_1801b1070(puVar19 + 0x238);
    *(undefined8 *)(puVar19 + -8) = 0x180216efb;
    FUN_1801e44a0(puVar19 + 0x228,*(undefined8 *)(puVar19 + 0x228));
    *(undefined8 *)(puVar19 + -8) = 0x180216f0d;
    func_0x000180e15340(*(undefined8 *)(puVar19 + 0x228),0x58);
    *(undefined8 *)(puVar19 + -8) = 0x180216f1b;
    FUN_1801f5aa0(puVar19 + 0x1320);
    *(undefined8 *)(puVar19 + -8) = 0x180216f28;
    FUN_18021b5c0(puVar19 + 0x1218);
    if (*(longlong *)(puVar19 + 0x1210) != 0) {
      *(undefined8 *)(puVar19 + -8) = 0x180216f3f;
      FUN_1802150c0(*(longlong *)(puVar19 + 0x1210),1);
    }
    if (*(longlong *)(puVar19 + 0x1208) != 0) {
      *(undefined8 *)(puVar19 + -8) = 0x180216f56;
      FUN_180214f60(*(longlong *)(puVar19 + 0x1208),1);
    }
    plVar2 = *(longlong **)(puVar19 + 0x11f8);
    if (plVar2 != (longlong *)0x0) {
      pcVar3 = *(code **)(*plVar2 + 0x20);
      *(undefined8 *)(puVar19 + -8) = 0x180216f77;
      (*pcVar3)(plVar2,CONCAT71((int7)((ulonglong)(puVar19 + 0x11c0) >> 8),
                                plVar2 != (longlong *)(puVar19 + 0x11c0)));
      *(undefined8 *)(puVar19 + 0x11f8) = 0;
    }
    *(undefined8 *)(puVar19 + -8) = 0x180216f8c;
    FUN_1801f5c40(puVar19 + 0x328);
    *(undefined8 *)(puVar19 + -8) = 0x180216f99;
    FUN_180195980(puVar19 + 0x2f8);
    *(undefined8 *)(puVar19 + -8) = 0x180216fa6;
    FUN_180195980(puVar19 + 0x2d8);
    lVar20 = *param_2;
    if ((lVar20 != 0) &&
       ((((char)param_2[1] == '\0' || (*(char *)(lVar20 + 0xb8) == '\0')) &&
        (*(int *)(lVar20 + 0xbc) == 0)))) {
      *(undefined8 *)(puVar19 + 0x208) = 0;
      *(undefined8 *)(puVar19 + 0x210) = 0;
      *(undefined **)(puVar19 + 0x1f0) = &UNK_180f46590;
      *(undefined8 *)(puVar19 + 0x1f8) = 0;
      *(undefined8 *)(puVar19 + 0x200) = 0;
      *(undefined **)(puVar19 + 0x1c0) = &UNK_180f467a8;
      puVar19[0x1c8] = 1;
      *(undefined8 *)(puVar19 + -8) = 0x180217031;
      FUN_180e16890(puVar19 + 0x1c0,puVar19 + 0x1f8);
      *(undefined **)(puVar19 + 0x1f0) = &UNK_180f48010;
      *(undefined4 *)(puVar19 + 0x208) = 1;
      *(undefined8 *)(puVar19 + 0x210) = 0x1810bc690;
      *(undefined **)(puVar19 + 0x28) = &UNK_180f46590;
      *(undefined8 *)(puVar19 + 0x30) = 0;
      *(undefined8 *)(puVar19 + 0x38) = 0;
      *(undefined8 *)(puVar19 + -8) = 0x180217072;
      FUN_180e16890(puVar19 + 0x1f8,puVar19 + 0x30);
      *(undefined **)(puVar19 + 0x28) = &UNK_180f48010;
      *(undefined4 *)(puVar19 + 0x40) = *(undefined4 *)(puVar19 + 0x208);
      *(undefined4 *)(puVar19 + 0x44) = *(undefined4 *)(puVar19 + 0x20c);
      *(undefined8 *)(puVar19 + 0x48) = *(undefined8 *)(puVar19 + 0x210);
      *(undefined8 *)(puVar19 + -8) = 0x1802170ac;
      uVar12 = FUN_1801ee3c0(puVar19 + 0x1c0,puVar19 + 0x28);
      *(undefined8 *)(puVar19 + -8) = 0x1802170ba;
      FUN_18021b140(param_2,uVar12,0);
      *(undefined **)(puVar19 + 0x1f0) = &UNK_180f46590;
      *(undefined8 *)(puVar19 + -8) = 0x1802170cf;
      FUN_180e16930(puVar19 + 0x1f8);
    }
    puVar13 = (undefined8 *)*param_2;
    if (puVar13 == (undefined8 *)0x0) goto code_r0x000180217106;
    LOCK();
    piVar1 = (int *)(puVar13 + 1);
    iVar10 = *piVar1;
    *piVar1 = *piVar1 + -1;
    UNLOCK();
    iVar10 = iVar10 + -1;
  }
  else {
    if (puVar19[0x1230] == '\0') {
      uVar8 = *(ushort *)(puVar19 + 0x2c2);
    }
    else {
      *(undefined8 *)(puVar19 + -8) = 0x180216bb9;
      FUN_18022fc40(*(longlong *)(puVar19 + 0x1208) + 0x80,puVar19 + 0x28);
      *(undefined8 *)(puVar19 + -8) = 0x180216bc4;
      uVar8 = Ordinal_15(*(undefined2 *)(puVar19 + 0x2a));
    }
    *(uint *)(puVar19 + 0x50) = (uint)uVar8;
    lVar20 = *param_2;
    if ((lVar20 == 0) || (((char)param_2[1] != '\0' && (*(char *)(lVar20 + 0xb8) != '\0')))) {
code_r0x000180217133:
      *(undefined8 *)(puVar19 + -8) = 0x18021713d;
      FUN_18021b590(4);
      goto code_r0x00018021713e;
    }
    *(undefined8 *)(puVar19 + -8) = 0x180216bf8;
    FUN_18021b1d0(lVar20,puVar19 + 0x50,0);
    *(undefined8 *)(puVar19 + -8) = 0x180216c05;
    FUN_180228f30(puVar19 + 0x1c0);
    puVar13 = *(undefined8 **)(puVar19 + 0x1c0);
    if (puVar13 != (undefined8 *)0x0) {
      LOCK();
      piVar1 = (int *)(puVar13 + 1);
      *piVar1 = *piVar1 + -1;
      UNLOCK();
      if (*piVar1 == 0) {
        puVar16 = (undefined8 *)puVar13[0x19];
        if (puVar16 == (undefined8 *)0x0) {
          if (puVar13 != (undefined8 *)0x0) {
            pcVar3 = *(code **)*puVar13;
            *(undefined8 *)(puVar19 + -8) = 0x180216c41;
            (*pcVar3)(puVar13,1);
          }
        }
        else {
          pcVar3 = *(code **)*puVar16;
          *(undefined8 *)(puVar19 + -8) = 0x180216c30;
          (*pcVar3)(puVar16,puVar13);
        }
      }
    }
    *(undefined8 *)(puVar19 + -8) = 0x180216c4f;
    FUN_1801b1070(puVar19 + 0x238);
    *(undefined8 *)(puVar19 + -8) = 0x180216c64;
    FUN_1801e44a0(puVar19 + 0x228,*(undefined8 *)(puVar19 + 0x228));
    *(undefined8 *)(puVar19 + -8) = 0x180216c76;
    func_0x000180e15340(*(undefined8 *)(puVar19 + 0x228),0x58);
    *(undefined8 *)(puVar19 + -8) = 0x180216c84;
    FUN_1801f5aa0(puVar19 + 0x1320);
    *(undefined8 *)(puVar19 + -8) = 0x180216c91;
    FUN_18021b5c0(puVar19 + 0x1218);
    if (*(longlong *)(puVar19 + 0x1210) != 0) {
      *(undefined8 *)(puVar19 + -8) = 0x180216ca8;
      FUN_1802150c0(*(longlong *)(puVar19 + 0x1210),1);
    }
    if (*(longlong *)(puVar19 + 0x1208) != 0) {
      *(undefined8 *)(puVar19 + -8) = 0x180216cbf;
      FUN_180214f60(*(longlong *)(puVar19 + 0x1208),1);
    }
    plVar2 = *(longlong **)(puVar19 + 0x11f8);
    if (plVar2 != (longlong *)0x0) {
      pcVar3 = *(code **)(*plVar2 + 0x20);
      *(undefined8 *)(puVar19 + -8) = 0x180216ce0;
      (*pcVar3)(plVar2,CONCAT71((int7)((ulonglong)(puVar19 + 0x11c0) >> 8),
                                plVar2 != (longlong *)(puVar19 + 0x11c0)));
      *(undefined8 *)(puVar19 + 0x11f8) = 0;
    }
    *(undefined8 *)(puVar19 + -8) = 0x180216cf5;
    FUN_1801f5c40(puVar19 + 0x328);
    *(undefined8 *)(puVar19 + -8) = 0x180216d02;
    FUN_180195980(puVar19 + 0x2f8);
    *(undefined8 *)(puVar19 + -8) = 0x180216d0f;
    FUN_180195980(puVar19 + 0x2d8);
    lVar20 = *param_2;
    if (((lVar20 != 0) && (((char)param_2[1] == '\0' || (*(char *)(lVar20 + 0xb8) == '\0')))) &&
       (*(int *)(lVar20 + 0xbc) == 0)) {
      *(undefined8 *)(puVar19 + 0x1f0) = 0;
      *(undefined8 *)(puVar19 + 0x1f8) = 0;
      *(undefined8 *)(puVar19 + 0x200) = 0;
      *(undefined8 *)(puVar19 + 0x208) = 0;
      *(undefined8 *)(puVar19 + 0x210) = 0;
      *(undefined4 *)(puVar19 + 0x1c0) = 1;
      *(undefined8 *)(puVar19 + 0x1c8) = 0x1810bc690;
      *(undefined8 *)(puVar19 + -8) = 0x180216d89;
      FUN_1801f2eb0(puVar19 + 0x1f0,puVar19 + 0x1c0);
      *(undefined **)(puVar19 + 0x28) = &UNK_180f46590;
      *(undefined8 *)(puVar19 + 0x30) = 0;
      *(undefined8 *)(puVar19 + 0x38) = 0;
      *(undefined8 *)(puVar19 + -8) = 0x180216daf;
      FUN_180e16890(puVar19 + 0x1f8,puVar19 + 0x30);
      *(undefined **)(puVar19 + 0x28) = &UNK_180f48010;
      *(undefined4 *)(puVar19 + 0x40) = *(undefined4 *)(puVar19 + 0x208);
      *(undefined4 *)(puVar19 + 0x44) = *(undefined4 *)(puVar19 + 0x20c);
      *(undefined4 *)(puVar19 + 0x48) = *(undefined4 *)(puVar19 + 0x210);
      *(undefined4 *)(puVar19 + 0x4c) = *(undefined4 *)(puVar19 + 0x214);
      *(undefined8 *)(puVar19 + -8) = 0x180216dda;
      uVar12 = FUN_1801ee3c0(puVar19 + 0x1c0,puVar19 + 0x28);
      *(undefined8 *)(puVar19 + -8) = 0x180216de8;
      FUN_18021b140(param_2,uVar12,0);
      *(undefined **)(puVar19 + 0x1f0) = &UNK_180f46590;
      *(undefined8 *)(puVar19 + -8) = 0x180216dfd;
      FUN_180e16930(puVar19 + 0x1f8);
    }
    puVar13 = (undefined8 *)*param_2;
    if (puVar13 == (undefined8 *)0x0) goto code_r0x000180217106;
    LOCK();
    piVar1 = (int *)(puVar13 + 1);
    *piVar1 = *piVar1 + -1;
    iVar10 = *piVar1;
    UNLOCK();
  }
  if (iVar10 == 0) {
    puVar16 = (undefined8 *)puVar13[0x19];
    if (puVar16 == (undefined8 *)0x0) {
      pcVar3 = *(code **)*puVar13;
      *(undefined8 *)(puVar19 + -8) = 0x180217105;
      (*pcVar3)(puVar13,1);
    }
    else {
      pcVar3 = *(code **)*puVar16;
      *(undefined8 *)(puVar19 + -8) = 0x1802170f9;
      (*pcVar3)(puVar16,puVar13);
    }
  }
code_r0x000180217106:
  *(undefined8 *)(puVar19 + -8) = 0x180217116;
  FUN_180e155e0(*(ulonglong *)(puVar19 + 0x1340) ^ (ulonglong)puVar19);
  return;
}

