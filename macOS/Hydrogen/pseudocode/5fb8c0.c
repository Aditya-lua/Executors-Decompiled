
void FUN_005fb8c0(long *param_1,long param_2,ulong *param_3,ulong param_4)

{
  ulong *puVar1;
  ulong *puVar2;
  ulong uVar3;
  undefined1 auVar4 [16];
  undefined1 auVar5 [16];
  undefined1 auVar6 [16];
  undefined1 auVar7 [16];
  undefined1 auVar8 [16];
  undefined1 auVar9 [16];
  undefined1 auVar10 [16];
  undefined1 auVar11 [16];
  undefined1 auVar12 [16];
  undefined1 auVar13 [16];
  undefined1 auVar14 [16];
  undefined1 auVar15 [16];
  undefined1 auVar16 [16];
  undefined1 auVar17 [16];
  undefined1 auVar18 [16];
  undefined1 auVar19 [16];
  undefined1 auVar20 [16];
  undefined1 auVar21 [16];
  undefined1 auVar22 [16];
  undefined1 auVar23 [16];
  undefined1 auVar24 [16];
  undefined1 auVar25 [16];
  undefined1 auVar26 [16];
  undefined1 auVar27 [16];
  undefined1 auVar28 [16];
  undefined1 auVar29 [16];
  undefined1 auVar30 [16];
  undefined1 auVar31 [16];
  undefined1 auVar32 [16];
  undefined1 auVar33 [16];
  undefined1 auVar34 [16];
  undefined1 auVar35 [16];
  undefined1 auVar36 [16];
  undefined1 auVar37 [16];
  undefined1 auVar38 [16];
  undefined1 auVar39 [16];
  undefined1 auVar40 [16];
  undefined1 auVar41 [16];
  undefined1 auVar42 [16];
  undefined1 auVar43 [16];
  undefined1 auVar44 [16];
  undefined1 auVar45 [16];
  undefined1 auVar46 [16];
  undefined1 auVar47 [16];
  undefined1 auVar48 [16];
  undefined1 auVar49 [16];
  undefined1 auVar50 [16];
  undefined1 auVar51 [16];
  undefined1 auVar52 [16];
  undefined1 auVar53 [16];
  undefined1 auVar54 [16];
  undefined1 auVar55 [16];
  undefined1 auVar56 [16];
  undefined1 auVar57 [16];
  undefined1 auVar58 [16];
  undefined1 auVar59 [16];
  undefined1 auVar60 [16];
  undefined1 auVar61 [16];
  undefined1 auVar62 [16];
  undefined1 auVar63 [16];
  undefined1 auVar64 [16];
  undefined1 auVar65 [16];
  undefined1 auVar66 [16];
  undefined1 auVar67 [16];
  undefined1 auVar68 [16];
  undefined1 auVar69 [16];
  undefined1 auVar70 [16];
  undefined1 auVar71 [16];
  undefined1 auVar72 [16];
  undefined1 auVar73 [16];
  undefined1 auVar74 [16];
  undefined1 auVar75 [16];
  undefined1 auVar76 [16];
  undefined1 auVar77 [16];
  undefined1 auVar78 [16];
  undefined1 auVar79 [16];
  undefined1 auVar80 [16];
  undefined1 auVar81 [16];
  undefined1 auVar82 [16];
  undefined1 auVar83 [16];
  undefined1 auVar84 [16];
  undefined1 auVar85 [16];
  undefined1 auVar86 [16];
  undefined1 auVar87 [16];
  undefined1 auVar88 [16];
  undefined1 auVar89 [16];
  undefined1 auVar90 [16];
  undefined1 auVar91 [16];
  undefined1 auVar92 [16];
  undefined1 auVar93 [16];
  undefined1 auVar94 [16];
  undefined1 auVar95 [16];
  undefined1 auVar96 [16];
  undefined1 auVar97 [16];
  undefined1 auVar98 [16];
  undefined1 auVar99 [16];
  undefined1 auVar100 [16];
  undefined1 auVar101 [16];
  bool bVar102;
  bool bVar103;
  ulong uVar104;
  ulong uVar105;
  ulong uVar106;
  ulong uVar107;
  ulong uVar108;
  ulong uVar109;
  ulong uVar110;
  ulong uVar111;
  ulong uVar112;
  ulong uVar113;
  ulong uVar114;
  long lVar115;
  long lVar116;
  ulong uVar117;
  ulong uVar118;
  ulong uVar119;
  ulong uVar120;
  ulong uVar121;
  ulong uVar122;
  ulong uVar123;
  
                    /* WARNING (jumptable): Sanity check requires truncation of jumptable */
                    /* WARNING: Could not find normalized switch variable to match jumptable */
  switch(param_4) {
  case 0:
  case 1:
  case 2:
  case 3:
    uVar110 = *param_3;
    auVar4._8_8_ = 0;
    auVar4._0_8_ = uVar110;
    auVar53._8_8_ = 0;
    auVar53._0_8_ = uVar110;
    uVar108 = SUB168(auVar4 * auVar53,8);
    *param_1 = uVar110 * uVar110;
    uVar110 = param_3[1] * *param_3;
    auVar5._8_8_ = 0;
    auVar5._0_8_ = *param_3;
    auVar54._8_8_ = 0;
    auVar54._0_8_ = param_3[1];
    lVar116 = SUB168(auVar5 * auVar54,8);
    uVar113 = uVar110 >> 0x3f | lVar116 << 1;
    uVar110 = uVar110 * 2;
    param_1[1] = uVar108 + uVar110;
    uVar123 = param_3[1];
    uVar114 = uVar123 * uVar123;
    auVar6._8_8_ = 0;
    auVar6._0_8_ = uVar123;
    auVar55._8_8_ = 0;
    auVar55._0_8_ = uVar123;
    param_1[2] = uVar113 + uVar114 + (ulong)CARRY8(uVar108,uVar110);
    param_1[3] = (SUB168(auVar6 * auVar55,8) - (lVar116 >> 0x3f)) +
                 (ulong)(CARRY8(uVar113,uVar114) ||
                        CARRY8(uVar113 + uVar114,(ulong)CARRY8(uVar108,uVar110)));
    return;
  case 4:
  case 5:
  case 6:
  case 7:
    uVar110 = *param_3;
    auVar7._8_8_ = 0;
    auVar7._0_8_ = uVar110;
    auVar56._8_8_ = 0;
    auVar56._0_8_ = uVar110;
    uVar117 = SUB168(auVar7 * auVar56,8);
    *param_1 = uVar110 * uVar110;
    uVar113 = *param_3;
    uVar109 = param_3[1];
    uVar119 = uVar109 * uVar113;
    param_1[1] = uVar117 + uVar119 * 2;
    uVar114 = param_3[1];
    uVar110 = param_3[2] * *param_3;
    auVar8._8_8_ = 0;
    auVar8._0_8_ = *param_3;
    auVar57._8_8_ = 0;
    auVar57._0_8_ = param_3[2];
    lVar115 = SUB168(auVar8 * auVar57,8);
    lVar116 = -(lVar115 >> 0x3f);
    uVar122 = uVar110 >> 0x3f | lVar115 << 1;
    auVar9._8_8_ = 0;
    auVar9._0_8_ = uVar114;
    auVar58._8_8_ = 0;
    auVar58._0_8_ = uVar114;
    uVar123 = SUB168(auVar9 * auVar58,8);
    uVar110 = uVar110 * 2;
    uVar108 = uVar114 * uVar114 + uVar110;
    if (CARRY8(uVar114 * uVar114,uVar110)) {
      uVar123 = uVar123 + 1;
    }
    uVar110 = uVar123 + uVar122;
    if (CARRY8(uVar123,uVar122)) {
      lVar116 = lVar116 + 1;
    }
    bVar102 = CARRY8(uVar117,uVar119 * 2);
    auVar10._8_8_ = 0;
    auVar10._0_8_ = uVar113;
    auVar59._8_8_ = 0;
    auVar59._0_8_ = uVar109;
    lVar115 = SUB168(auVar10 * auVar59,8);
    uVar114 = -(lVar115 >> 0x3f);
    uVar123 = uVar119 >> 0x3f | lVar115 << 1;
    bVar103 = CARRY8(uVar108,uVar123) || CARRY8(uVar108 + uVar123,(ulong)bVar102);
    uVar109 = uVar110 + uVar114 + (ulong)bVar103;
    param_1[2] = uVar108 + uVar123 + (ulong)bVar102;
    uVar119 = param_3[3] * *param_3;
    auVar11._8_8_ = 0;
    auVar11._0_8_ = *param_3;
    auVar60._8_8_ = 0;
    auVar60._0_8_ = param_3[3];
    uVar113 = SUB168(auVar11 * auVar60,8);
    uVar117 = param_3[2] * param_3[1];
    auVar12._8_8_ = 0;
    auVar12._0_8_ = param_3[1];
    auVar61._8_8_ = 0;
    auVar61._0_8_ = param_3[2];
    uVar123 = SUB168(auVar12 * auVar61,8);
    uVar108 = uVar117 + uVar119;
    if (CARRY8(uVar117,uVar119)) {
      uVar123 = uVar123 + 1;
    }
    uVar117 = uVar123 + uVar113;
    uVar119 = 2;
    if (!CARRY8(uVar123,uVar113)) {
      uVar119 = 0;
    }
    uVar122 = uVar108 >> 0x3f | uVar117 * 2;
    uVar108 = uVar108 * 2;
    uVar111 = lVar116 + (ulong)(CARRY8(uVar110,uVar114) || CARRY8(uVar110 + uVar114,(ulong)bVar103))
              + (ulong)CARRY8(uVar109,uVar108);
    uVar123 = uVar122 + uVar111;
    param_1[3] = uVar109 + uVar108;
    uVar114 = param_3[2];
    uVar110 = param_3[3] * param_3[1];
    auVar13._8_8_ = 0;
    auVar13._0_8_ = param_3[1];
    auVar62._8_8_ = 0;
    auVar62._0_8_ = param_3[3];
    lVar115 = SUB168(auVar13 * auVar62,8);
    lVar116 = -(lVar115 >> 0x3f);
    uVar109 = uVar110 >> 0x3f | lVar115 << 1;
    auVar14._8_8_ = 0;
    auVar14._0_8_ = uVar114;
    auVar63._8_8_ = 0;
    auVar63._0_8_ = uVar114;
    uVar113 = SUB168(auVar14 * auVar63,8);
    uVar110 = uVar110 * 2;
    uVar108 = uVar114 * uVar114 + uVar110;
    if (CARRY8(uVar114 * uVar114,uVar110)) {
      uVar113 = uVar113 + 1;
    }
    uVar110 = uVar113 + uVar109;
    if (CARRY8(uVar113,uVar109)) {
      lVar116 = lVar116 + 1;
    }
    uVar114 = (uVar119 | uVar117 >> 0x3f) + (ulong)CARRY8(uVar122,uVar111) +
              (ulong)CARRY8(uVar123,uVar108);
    uVar113 = uVar110 + uVar114;
    param_1[4] = uVar123 + uVar108;
    uVar108 = param_3[3] * param_3[2];
    auVar15._8_8_ = 0;
    auVar15._0_8_ = param_3[2];
    auVar64._8_8_ = 0;
    auVar64._0_8_ = param_3[3];
    lVar115 = SUB168(auVar15 * auVar64,8);
    uVar109 = uVar108 >> 0x3f | lVar115 << 1;
    uVar108 = uVar108 * 2;
    uVar123 = lVar116 + (ulong)CARRY8(uVar110,uVar114) + (ulong)CARRY8(uVar113,uVar108);
    uVar110 = uVar123 + uVar109;
    param_1[5] = uVar113 + uVar108;
    uVar108 = param_3[3];
    auVar16._8_8_ = 0;
    auVar16._0_8_ = uVar108;
    auVar65._8_8_ = 0;
    auVar65._0_8_ = uVar108;
    param_1[6] = uVar110 + uVar108 * uVar108;
    param_1[7] = (SUB168(auVar16 * auVar65,8) - (lVar115 >> 0x3f)) + (ulong)CARRY8(uVar123,uVar109)
                 + (ulong)CARRY8(uVar110,uVar108 * uVar108);
    return;
  case 8:
  case 9:
  case 10:
  case 0xb:
    uVar110 = *param_3;
    auVar17._8_8_ = 0;
    auVar17._0_8_ = uVar110;
    auVar66._8_8_ = 0;
    auVar66._0_8_ = uVar110;
    uVar117 = SUB168(auVar17 * auVar66,8);
    *param_1 = uVar110 * uVar110;
    uVar113 = *param_3;
    uVar109 = param_3[1];
    uVar119 = uVar109 * uVar113;
    param_1[1] = uVar117 + uVar119 * 2;
    uVar114 = param_3[1];
    uVar110 = param_3[2] * *param_3;
    auVar18._8_8_ = 0;
    auVar18._0_8_ = *param_3;
    auVar67._8_8_ = 0;
    auVar67._0_8_ = param_3[2];
    lVar115 = SUB168(auVar18 * auVar67,8);
    lVar116 = -(lVar115 >> 0x3f);
    uVar122 = uVar110 >> 0x3f | lVar115 << 1;
    auVar19._8_8_ = 0;
    auVar19._0_8_ = uVar114;
    auVar68._8_8_ = 0;
    auVar68._0_8_ = uVar114;
    uVar123 = SUB168(auVar19 * auVar68,8);
    uVar110 = uVar110 * 2;
    uVar108 = uVar114 * uVar114 + uVar110;
    if (CARRY8(uVar114 * uVar114,uVar110)) {
      uVar123 = uVar123 + 1;
    }
    uVar110 = uVar123 + uVar122;
    if (CARRY8(uVar123,uVar122)) {
      lVar116 = lVar116 + 1;
    }
    break;
  default:
    uVar123 = param_4 >> 1;
    lVar116 = param_2 + param_4 * 8;
    func_0x005fb8a4(param_1,lVar116,param_3,uVar123);
    func_0x005fb8a4(param_1 + param_4,lVar116,param_3 + uVar123,uVar123);
    func_0x005fb3a8(param_2,lVar116,param_3,param_3 + uVar123,uVar123);
    uVar108 = 0;
    uVar110 = 0;
    do {
      puVar1 = (ulong *)(param_1 + uVar123 + uVar110);
      puVar2 = (ulong *)(param_2 + uVar110 * 8);
      uVar117 = *puVar2;
      uVar114 = *puVar1;
      uVar119 = (ulong)CARRY8(uVar117 + uVar114,uVar108);
      *puVar1 = uVar117 + uVar114 + uVar108;
      uVar109 = puVar2[1];
      uVar113 = uVar109 + puVar1[1];
      uVar108 = (ulong)(CARRY8(uVar113,uVar119) ||
                       CARRY8(uVar113 + uVar119,(ulong)CARRY8(uVar117,uVar114)));
      if (CARRY8(uVar109,puVar1[1])) {
        uVar108 = uVar108 + 1;
      }
      puVar1[1] = uVar113 + uVar119 + (ulong)CARRY8(uVar117,uVar114);
      uVar110 = uVar110 + 2;
    } while (uVar110 < param_4);
    uVar113 = 0;
    uVar110 = 0;
    do {
      puVar1 = (ulong *)(param_1 + uVar123 + uVar110);
      puVar2 = (ulong *)(param_2 + uVar110 * 8);
      uVar119 = *puVar2;
      uVar109 = *puVar1;
      uVar122 = (ulong)CARRY8(uVar119 + uVar109,uVar113);
      *puVar1 = uVar119 + uVar109 + uVar113;
      uVar117 = puVar2[1];
      uVar114 = uVar117 + puVar1[1];
      uVar113 = (ulong)(CARRY8(uVar114,uVar122) ||
                       CARRY8(uVar114 + uVar122,(ulong)CARRY8(uVar119,uVar109)));
      if (CARRY8(uVar117,puVar1[1])) {
        uVar113 = uVar113 + 1;
      }
      puVar1[1] = uVar114 + uVar122 + (ulong)CARRY8(uVar119,uVar109);
      uVar110 = uVar110 + 2;
    } while (uVar110 < param_4);
    puVar1 = (ulong *)(param_1 + param_4 + uVar123);
    uVar110 = *puVar1;
    *puVar1 = uVar113 + uVar108 + uVar110;
    if (CARRY8(uVar113 + uVar108,uVar110)) {
      uVar110 = 2;
      uVar108 = 1;
      do {
        uVar113 = uVar110;
        uVar114 = puVar1[uVar108];
        puVar1[uVar108] = uVar114 + 1;
        uVar110 = (ulong)((int)uVar113 + 1);
        uVar108 = uVar113;
      } while ((uVar114 == 0xffffffffffffffff && uVar113 <= uVar123) &&
               (uVar114 != 0xffffffffffffffff || uVar123 != uVar113));
    }
    return;
  }
  bVar102 = CARRY8(uVar117,uVar119 * 2);
  auVar20._8_8_ = 0;
  auVar20._0_8_ = uVar113;
  auVar69._8_8_ = 0;
  auVar69._0_8_ = uVar109;
  lVar115 = SUB168(auVar20 * auVar69,8);
  uVar114 = -(lVar115 >> 0x3f);
  uVar123 = uVar119 >> 0x3f | lVar115 << 1;
  bVar103 = CARRY8(uVar108,uVar123) || CARRY8(uVar108 + uVar123,(ulong)bVar102);
  uVar109 = uVar110 + uVar114 + (ulong)bVar103;
  param_1[2] = uVar108 + uVar123 + (ulong)bVar102;
  uVar119 = param_3[3] * *param_3;
  auVar21._8_8_ = 0;
  auVar21._0_8_ = *param_3;
  auVar70._8_8_ = 0;
  auVar70._0_8_ = param_3[3];
  uVar113 = SUB168(auVar21 * auVar70,8);
  uVar117 = param_3[2] * param_3[1];
  auVar22._8_8_ = 0;
  auVar22._0_8_ = param_3[1];
  auVar71._8_8_ = 0;
  auVar71._0_8_ = param_3[2];
  uVar123 = SUB168(auVar22 * auVar71,8);
  uVar108 = uVar117 + uVar119;
  if (CARRY8(uVar117,uVar119)) {
    uVar123 = uVar123 + 1;
  }
  uVar117 = uVar123 + uVar113;
  uVar119 = 2;
  if (!CARRY8(uVar123,uVar113)) {
    uVar119 = 0;
  }
  uVar111 = uVar108 >> 0x3f | uVar117 * 2;
  uVar108 = uVar108 * 2;
  uVar122 = lVar116 + (ulong)(CARRY8(uVar110,uVar114) || CARRY8(uVar110 + uVar114,(ulong)bVar103)) +
            (ulong)CARRY8(uVar109,uVar108);
  uVar123 = uVar111 + uVar122;
  param_1[3] = uVar109 + uVar108;
  uVar109 = param_3[4] * *param_3;
  auVar23._8_8_ = 0;
  auVar23._0_8_ = *param_3;
  auVar72._8_8_ = 0;
  auVar72._0_8_ = param_3[4];
  uVar114 = SUB168(auVar23 * auVar72,8);
  uVar113 = param_3[2];
  uVar120 = param_3[3] * param_3[1];
  auVar24._8_8_ = 0;
  auVar24._0_8_ = param_3[1];
  auVar73._8_8_ = 0;
  auVar73._0_8_ = param_3[3];
  uVar108 = SUB168(auVar24 * auVar73,8);
  uVar110 = uVar120 + uVar109;
  if (CARRY8(uVar120,uVar109)) {
    uVar108 = uVar108 + 1;
  }
  uVar109 = uVar108 + uVar114;
  uVar120 = 2;
  if (!CARRY8(uVar108,uVar114)) {
    uVar120 = 0;
  }
  uVar120 = uVar120 | uVar109 >> 0x3f;
  uVar109 = uVar110 >> 0x3f | uVar109 * 2;
  auVar25._8_8_ = 0;
  auVar25._0_8_ = uVar113;
  auVar74._8_8_ = 0;
  auVar74._0_8_ = uVar113;
  uVar114 = SUB168(auVar25 * auVar74,8);
  uVar110 = uVar110 * 2;
  uVar108 = uVar113 * uVar113 + uVar110;
  if (CARRY8(uVar113 * uVar113,uVar110)) {
    uVar114 = uVar114 + 1;
  }
  uVar110 = uVar109 + uVar114;
  if (CARRY8(uVar109,uVar114)) {
    uVar120 = uVar120 + 1;
  }
  uVar117 = (uVar119 | uVar117 >> 0x3f) + (ulong)CARRY8(uVar111,uVar122) +
            (ulong)CARRY8(uVar108,uVar123);
  uVar113 = uVar110 + uVar117;
  param_1[4] = uVar108 + uVar123;
  uVar114 = *param_3;
  uVar109 = param_3[5];
  uVar119 = uVar109 * uVar114;
  uVar122 = param_3[4] * param_3[1];
  auVar26._8_8_ = 0;
  auVar26._0_8_ = param_3[1];
  auVar75._8_8_ = 0;
  auVar75._0_8_ = param_3[4];
  uVar123 = SUB168(auVar26 * auVar75,8);
  uVar108 = uVar122 + uVar119;
  if (CARRY8(uVar122,uVar119)) {
    uVar123 = uVar123 + 1;
  }
  uVar111 = param_3[3] * param_3[2];
  auVar27._8_8_ = 0;
  auVar27._0_8_ = param_3[2];
  auVar76._8_8_ = 0;
  auVar76._0_8_ = param_3[3];
  uVar122 = SUB168(auVar27 * auVar76,8);
  uVar119 = uVar111 + uVar108;
  if (CARRY8(uVar111,uVar108)) {
    uVar122 = uVar122 + 1;
  }
  uVar108 = uVar119 * 2;
  uVar111 = uVar120 + CARRY8(uVar110,uVar117) + (ulong)CARRY8(uVar113,uVar108);
  param_1[5] = uVar113 + uVar108;
  uVar113 = param_3[6] * *param_3;
  auVar28._8_8_ = 0;
  auVar28._0_8_ = *param_3;
  auVar77._8_8_ = 0;
  auVar77._0_8_ = param_3[6];
  uVar120 = SUB168(auVar28 * auVar77,8);
  uVar117 = param_3[5] * param_3[1];
  auVar29._8_8_ = 0;
  auVar29._0_8_ = param_3[1];
  auVar78._8_8_ = 0;
  auVar78._0_8_ = param_3[5];
  uVar108 = SUB168(auVar29 * auVar78,8);
  uVar110 = uVar117 + uVar113;
  if (CARRY8(uVar117,uVar113)) {
    uVar108 = uVar108 + 1;
  }
  uVar117 = uVar108 + uVar120;
  uVar121 = param_3[3];
  uVar107 = param_3[4] * param_3[2];
  auVar30._8_8_ = 0;
  auVar30._0_8_ = param_3[2];
  auVar79._8_8_ = 0;
  auVar79._0_8_ = param_3[4];
  uVar105 = SUB168(auVar30 * auVar79,8);
  uVar113 = uVar107 + uVar110;
  if (CARRY8(uVar107,uVar110)) {
    uVar105 = uVar105 + 1;
  }
  uVar110 = uVar105 + uVar117;
  uVar117 = (ulong)CARRY8(uVar105,uVar117);
  auVar31._8_8_ = 0;
  auVar31._0_8_ = uVar114;
  auVar80._8_8_ = 0;
  auVar80._0_8_ = uVar109;
  uVar114 = SUB168(auVar31 * auVar80,8);
  if (CARRY8(uVar108,uVar120)) {
    uVar117 = uVar117 + 1;
  }
  uVar108 = uVar123 + uVar114;
  uVar109 = uVar122 + uVar108;
  uVar108 = (ulong)CARRY8(uVar122,uVar108);
  if (CARRY8(uVar123,uVar114)) {
    uVar108 = uVar108 + 1;
  }
  uVar119 = uVar119 >> 0x3f | uVar109 * 2;
  uVar123 = uVar119 + uVar111;
  uVar117 = uVar110 >> 0x3f | uVar117 << 1;
  uVar122 = uVar113 >> 0x3f | uVar110 * 2;
  auVar32._8_8_ = 0;
  auVar32._0_8_ = uVar121;
  auVar81._8_8_ = 0;
  auVar81._0_8_ = uVar121;
  uVar114 = SUB168(auVar32 * auVar81,8);
  uVar113 = uVar113 * 2;
  uVar110 = uVar121 * uVar121 + uVar113;
  if (CARRY8(uVar121 * uVar121,uVar113)) {
    uVar114 = uVar114 + 1;
  }
  uVar113 = uVar122 + uVar114;
  if (CARRY8(uVar122,uVar114)) {
    uVar117 = uVar117 + 1;
  }
  uVar114 = (uVar109 >> 0x3f | uVar108 << 1) + (ulong)CARRY8(uVar119,uVar111) +
            (ulong)CARRY8(uVar110,uVar123);
  uVar108 = uVar113 + uVar114;
  param_1[6] = uVar110 + uVar123;
  uVar122 = param_3[7] * *param_3;
  auVar33._8_8_ = 0;
  auVar33._0_8_ = *param_3;
  auVar82._8_8_ = 0;
  auVar82._0_8_ = param_3[7];
  uVar109 = SUB168(auVar33 * auVar82,8);
  uVar119 = param_3[6] * param_3[1];
  auVar34._8_8_ = 0;
  auVar34._0_8_ = param_3[1];
  auVar83._8_8_ = 0;
  auVar83._0_8_ = param_3[6];
  uVar123 = SUB168(auVar34 * auVar83,8);
  uVar110 = uVar119 + uVar122;
  if (CARRY8(uVar119,uVar122)) {
    uVar123 = uVar123 + 1;
  }
  uVar119 = uVar123 + uVar109;
  uVar120 = param_3[5] * param_3[2];
  auVar35._8_8_ = 0;
  auVar35._0_8_ = param_3[2];
  auVar84._8_8_ = 0;
  auVar84._0_8_ = param_3[5];
  uVar111 = SUB168(auVar35 * auVar84,8);
  uVar122 = uVar120 + uVar110;
  if (CARRY8(uVar120,uVar110)) {
    uVar111 = uVar111 + 1;
  }
  uVar120 = uVar111 + uVar119;
  uVar121 = param_3[4] * param_3[3];
  auVar36._8_8_ = 0;
  auVar36._0_8_ = param_3[3];
  auVar85._8_8_ = 0;
  auVar85._0_8_ = param_3[4];
  uVar105 = SUB168(auVar36 * auVar85,8);
  uVar110 = uVar121 + uVar122;
  if (CARRY8(uVar121,uVar122)) {
    uVar105 = uVar105 + 1;
  }
  uVar122 = uVar105 + uVar120;
  uVar112 = uVar110 >> 0x3f | uVar122 * 2;
  uVar110 = uVar110 * 2;
  uVar107 = uVar117 + CARRY8(uVar113,uVar114) + (ulong)CARRY8(uVar108,uVar110);
  uVar113 = uVar112 + uVar107;
  param_1[7] = uVar108 + uVar110;
  uVar117 = param_3[7];
  uVar114 = param_3[1];
  uVar118 = uVar117 * uVar114;
  uVar121 = param_3[6] * param_3[2];
  auVar37._8_8_ = 0;
  auVar37._0_8_ = param_3[2];
  auVar86._8_8_ = 0;
  auVar86._0_8_ = param_3[6];
  uVar108 = SUB168(auVar37 * auVar86,8);
  uVar110 = uVar121 + uVar118;
  if (CARRY8(uVar121,uVar118)) {
    uVar108 = uVar108 + 1;
  }
  uVar3 = param_3[4];
  uVar106 = param_3[5] * param_3[3];
  auVar38._8_8_ = 0;
  auVar38._0_8_ = param_3[3];
  auVar87._8_8_ = 0;
  auVar87._0_8_ = param_3[5];
  uVar118 = SUB168(auVar38 * auVar87,8);
  uVar121 = uVar106 + uVar110;
  if (CARRY8(uVar106,uVar110)) {
    uVar118 = uVar118 + 1;
  }
  auVar39._8_8_ = 0;
  auVar39._0_8_ = uVar3;
  auVar88._8_8_ = 0;
  auVar88._0_8_ = uVar3;
  uVar104 = SUB168(auVar39 * auVar88,8);
  uVar110 = uVar121 * 2;
  uVar106 = uVar3 * uVar3 + uVar110;
  if (CARRY8(uVar3 * uVar3,uVar110)) {
    uVar104 = uVar104 + 1;
  }
  uVar119 = (uVar122 >> 0x3f |
            ((ulong)CARRY8(uVar111,uVar119) + (ulong)CARRY8(uVar123,uVar109) +
            (ulong)CARRY8(uVar105,uVar120)) * 2) + (ulong)CARRY8(uVar112,uVar107) +
            (ulong)CARRY8(uVar106,uVar113);
  param_1[8] = uVar106 + uVar113;
  uVar113 = param_3[7] * param_3[2];
  auVar40._8_8_ = 0;
  auVar40._0_8_ = param_3[2];
  auVar89._8_8_ = 0;
  auVar89._0_8_ = param_3[7];
  uVar109 = SUB168(auVar40 * auVar89,8);
  uVar122 = param_3[6] * param_3[3];
  auVar41._8_8_ = 0;
  auVar41._0_8_ = param_3[3];
  auVar90._8_8_ = 0;
  auVar90._0_8_ = param_3[6];
  uVar123 = SUB168(auVar41 * auVar90,8);
  uVar110 = uVar122 + uVar113;
  if (CARRY8(uVar122,uVar113)) {
    uVar123 = uVar123 + 1;
  }
  uVar122 = uVar123 + uVar109;
  uVar120 = param_3[5] * param_3[4];
  auVar42._8_8_ = 0;
  auVar42._0_8_ = param_3[4];
  auVar91._8_8_ = 0;
  auVar91._0_8_ = param_3[5];
  uVar111 = SUB168(auVar42 * auVar91,8);
  uVar113 = uVar120 + uVar110;
  if (CARRY8(uVar120,uVar110)) {
    uVar111 = uVar111 + 1;
  }
  uVar110 = uVar111 + uVar122;
  uVar122 = (ulong)CARRY8(uVar111,uVar122);
  auVar43._8_8_ = 0;
  auVar43._0_8_ = uVar114;
  auVar92._8_8_ = 0;
  auVar92._0_8_ = uVar117;
  uVar114 = SUB168(auVar43 * auVar92,8);
  if (CARRY8(uVar123,uVar109)) {
    uVar122 = uVar122 + 1;
  }
  uVar123 = uVar108 + uVar114;
  uVar109 = uVar118 + uVar123;
  uVar123 = (ulong)CARRY8(uVar118,uVar123);
  if (CARRY8(uVar108,uVar114)) {
    uVar123 = uVar123 + 1;
  }
  uVar123 = uVar109 >> 0x3f | uVar123 << 1;
  uVar114 = uVar121 >> 0x3f | uVar109 * 2;
  uVar108 = uVar114 + uVar104;
  if (CARRY8(uVar114,uVar104)) {
    uVar123 = uVar123 + 1;
  }
  uVar114 = uVar108 + uVar119;
  uVar111 = uVar113 >> 0x3f | uVar110 * 2;
  uVar113 = uVar113 * 2;
  uVar109 = uVar123 + CARRY8(uVar108,uVar119) + (ulong)CARRY8(uVar114,uVar113);
  uVar123 = uVar111 + uVar109;
  param_1[9] = uVar114 + uVar113;
  uVar119 = param_3[7] * param_3[3];
  auVar44._8_8_ = 0;
  auVar44._0_8_ = param_3[3];
  auVar93._8_8_ = 0;
  auVar93._0_8_ = param_3[7];
  uVar117 = SUB168(auVar44 * auVar93,8);
  uVar114 = param_3[5];
  uVar120 = param_3[6] * param_3[4];
  auVar45._8_8_ = 0;
  auVar45._0_8_ = param_3[4];
  auVar94._8_8_ = 0;
  auVar94._0_8_ = param_3[6];
  uVar113 = SUB168(auVar45 * auVar94,8);
  uVar108 = uVar120 + uVar119;
  if (CARRY8(uVar120,uVar119)) {
    uVar113 = uVar113 + 1;
  }
  uVar119 = uVar113 + uVar117;
  uVar120 = 2;
  if (!CARRY8(uVar113,uVar117)) {
    uVar120 = 0;
  }
  uVar120 = uVar120 | uVar119 >> 0x3f;
  uVar119 = uVar108 >> 0x3f | uVar119 * 2;
  auVar46._8_8_ = 0;
  auVar46._0_8_ = uVar114;
  auVar95._8_8_ = 0;
  auVar95._0_8_ = uVar114;
  uVar117 = SUB168(auVar46 * auVar95,8);
  uVar108 = uVar108 * 2;
  uVar113 = uVar114 * uVar114 + uVar108;
  if (CARRY8(uVar114 * uVar114,uVar108)) {
    uVar117 = uVar117 + 1;
  }
  uVar108 = uVar119 + uVar117;
  if (CARRY8(uVar119,uVar117)) {
    uVar120 = uVar120 + 1;
  }
  uVar109 = (uVar110 >> 0x3f | uVar122 << 1) + (ulong)CARRY8(uVar111,uVar109) +
            (ulong)CARRY8(uVar113,uVar123);
  uVar114 = uVar108 + uVar109;
  param_1[10] = uVar113 + uVar123;
  uVar119 = param_3[7] * param_3[4];
  auVar47._8_8_ = 0;
  auVar47._0_8_ = param_3[4];
  auVar96._8_8_ = 0;
  auVar96._0_8_ = param_3[7];
  uVar113 = SUB168(auVar47 * auVar96,8);
  uVar117 = param_3[6] * param_3[5];
  auVar48._8_8_ = 0;
  auVar48._0_8_ = param_3[5];
  auVar97._8_8_ = 0;
  auVar97._0_8_ = param_3[6];
  uVar123 = SUB168(auVar48 * auVar97,8);
  uVar110 = uVar117 + uVar119;
  if (CARRY8(uVar117,uVar119)) {
    uVar123 = uVar123 + 1;
  }
  uVar117 = uVar123 + uVar113;
  uVar119 = 2;
  if (!CARRY8(uVar123,uVar113)) {
    uVar119 = 0;
  }
  uVar122 = uVar110 >> 0x3f | uVar117 * 2;
  uVar110 = uVar110 * 2;
  uVar111 = uVar120 + CARRY8(uVar108,uVar109) + (ulong)CARRY8(uVar114,uVar110);
  uVar108 = uVar122 + uVar111;
  param_1[0xb] = uVar114 + uVar110;
  uVar114 = param_3[6];
  uVar110 = param_3[7] * param_3[5];
  auVar49._8_8_ = 0;
  auVar49._0_8_ = param_3[5];
  auVar98._8_8_ = 0;
  auVar98._0_8_ = param_3[7];
  lVar115 = SUB168(auVar49 * auVar98,8);
  lVar116 = -(lVar115 >> 0x3f);
  uVar109 = uVar110 >> 0x3f | lVar115 << 1;
  auVar50._8_8_ = 0;
  auVar50._0_8_ = uVar114;
  auVar99._8_8_ = 0;
  auVar99._0_8_ = uVar114;
  uVar113 = SUB168(auVar50 * auVar99,8);
  uVar110 = uVar110 * 2;
  uVar123 = uVar114 * uVar114 + uVar110;
  if (CARRY8(uVar114 * uVar114,uVar110)) {
    uVar113 = uVar113 + 1;
  }
  uVar110 = uVar113 + uVar109;
  if (CARRY8(uVar113,uVar109)) {
    lVar116 = lVar116 + 1;
  }
  uVar114 = (uVar119 | uVar117 >> 0x3f) + (ulong)CARRY8(uVar122,uVar111) +
            (ulong)CARRY8(uVar108,uVar123);
  uVar113 = uVar110 + uVar114;
  param_1[0xc] = uVar108 + uVar123;
  uVar108 = param_3[7] * param_3[6];
  auVar51._8_8_ = 0;
  auVar51._0_8_ = param_3[6];
  auVar100._8_8_ = 0;
  auVar100._0_8_ = param_3[7];
  lVar115 = SUB168(auVar51 * auVar100,8);
  uVar109 = uVar108 >> 0x3f | lVar115 << 1;
  uVar108 = uVar108 * 2;
  uVar123 = lVar116 + (ulong)CARRY8(uVar110,uVar114) + (ulong)CARRY8(uVar113,uVar108);
  uVar110 = uVar123 + uVar109;
  param_1[0xd] = uVar113 + uVar108;
  uVar108 = param_3[7];
  auVar52._8_8_ = 0;
  auVar52._0_8_ = uVar108;
  auVar101._8_8_ = 0;
  auVar101._0_8_ = uVar108;
  param_1[0xe] = uVar110 + uVar108 * uVar108;
  param_1[0xf] = (SUB168(auVar52 * auVar101,8) - (lVar115 >> 0x3f)) + (ulong)CARRY8(uVar123,uVar109)
                 + (ulong)CARRY8(uVar110,uVar108 * uVar108);
  return;
}

