
void thunk_FUN_006c8a10(undefined8 param_1,undefined8 param_2,undefined4 param_3)

{
  uint uVar1;
  uint uVar2;
  uint uVar3;
  undefined4 uVar4;
  char cVar5;
  code *pcVar6;
  undefined1 uVar7;
  undefined8 *puVar8;
  ulong uVar9;
  undefined8 *puVar10;
  undefined8 *puVar11;
  long *plVar12;
  long *plVar13;
  undefined8 uVar14;
  long lVar15;
  long lVar16;
  undefined8 *puVar17;
  long lVar18;
  ulong uVar19;
  char *pcVar20;
  char *pcVar21;
  char *pcVar22;
  ulong uVar23;
  ulong uVar24;
  ulong uVar25;
  long lVar26;
  long lVar27;
  ulong uVar28;
  long lVar29;
  int iVar30;
  undefined8 uVar31;
  undefined8 *puVar32;
  long lVar33;
  long lVar34;
  long lVar35;
  long lVar36;
  long lVar37;
  long lVar38;
  long lVar39;
  long lVar40;
  long lVar41;
  long lVar42;
  long lVar43;
  long lVar44;
  long lVar45;
  long lVar46;
  long lVar47;
  long lVar48;
  long lVar49;
  long lVar50;
  long lVar51;
  long lVar52;
  long lVar53;
  long lVar54;
  long lVar55;
  long lVar56;
  long lVar57;
  long lVar58;
  long lVar59;
  long lVar60;
  long lVar61;
  long lVar62;
  byte bVar63;
  byte bVar64;
  byte bVar65;
  byte bVar66;
  byte bVar67;
  byte bVar68;
  byte bVar69;
  byte bVar71;
  byte bVar72;
  undefined8 uVar70;
  byte bVar73;
  byte bVar75;
  undefined8 uVar74;
  byte bVar76;
  undefined1 auVar77 [16];
  long in_stack_00000008;
  int iStack_100;
  long lStack_f0;
  long lStack_c8;
  undefined8 uStack_c0;
  ulong uStack_b8;
  undefined8 uStack_b0;
  
  if (in_stack_00000008 != 0) {
    __ZdlPv();
  }
  auVar77 = __Unwind_Resume(param_1);
  lVar15 = auVar77._8_8_;
  puVar8 = auVar77._0_8_;
  if (*(long *)(lVar15 + 0x28) == 0) {
    lVar16 = 0;
  }
  else {
    lVar16 = 0;
    puVar17 = *(undefined8 **)(lVar15 + 0x20);
    puVar10 = puVar17 + *(long *)(lVar15 + 0x28) * 2;
    do {
      uVar19 = puVar17[1];
      if (uVar19 == 0) {
        lVar26 = 0;
      }
      else {
        pcVar20 = (char *)*puVar17;
        if (uVar19 < 8) {
          lVar26 = 0;
          pcVar21 = pcVar20;
        }
        else {
          if (uVar19 < 0x20) {
            lVar26 = 0;
            uVar28 = 0;
          }
          else {
            lVar26 = 0;
            lVar18 = 0;
            uVar28 = uVar19 & 0xffffffffffffffe0;
            lVar35 = 0;
            lVar36 = 0;
            pcVar21 = pcVar20 + 0x10;
            lVar33 = 0;
            lVar34 = 0;
            lVar43 = 0;
            lVar44 = 0;
            lVar29 = 0;
            lVar27 = 0;
            lVar39 = 0;
            lVar40 = 0;
            lVar37 = 0;
            lVar38 = 0;
            lVar47 = 0;
            lVar48 = 0;
            lVar41 = 0;
            lVar42 = 0;
            lVar51 = 0;
            lVar52 = 0;
            lVar49 = 0;
            lVar50 = 0;
            lVar57 = 0;
            lVar58 = 0;
            lVar45 = 0;
            lVar46 = 0;
            lVar55 = 0;
            lVar56 = 0;
            lVar53 = 0;
            lVar54 = 0;
            lVar59 = 0;
            lVar60 = 0;
            uVar23 = uVar28;
            do {
              uVar31 = *(undefined8 *)(pcVar21 + -8);
              uVar14 = *(undefined8 *)(pcVar21 + -0x10);
              uVar74 = *(undefined8 *)(pcVar21 + 8);
              uVar70 = *(undefined8 *)pcVar21;
              bVar63 = -((char)((ulong)uVar14 >> 0x18) == '%');
              bVar64 = -((char)((ulong)uVar14 >> 0x28) == '%');
              bVar65 = -((char)((ulong)uVar14 >> 0x38) == '%');
              bVar66 = -((char)((ulong)uVar31 >> 8) == '%');
              bVar67 = -((char)((ulong)uVar31 >> 0x18) == '%');
              bVar68 = -((char)((ulong)uVar31 >> 0x28) == '%');
              bVar69 = -((char)((ulong)uVar31 >> 0x38) == '%');
              bVar71 = -((char)((ulong)uVar70 >> 8) == '%');
              bVar72 = -((char)((ulong)uVar70 >> 0x18) == '%');
              bVar73 = -((char)((ulong)uVar70 >> 0x38) == '%');
              bVar75 = -((char)((ulong)uVar74 >> 0x28) == '%');
              bVar76 = -((char)((ulong)uVar74 >> 0x38) == '%');
              lVar47 = lVar47 + ((ulong)CONCAT14(bVar69,(uint)(byte)-((char)((ulong)uVar31 >> 0x30)
                                                                     == '%')) & 0xffffff01);
              lVar48 = lVar48 + ((ulong)bVar69 & 0xffffff01);
              lVar37 = lVar37 + ((ulong)((uint6)CONCAT14(bVar68,(uint)CONCAT12(bVar68,(ushort)(byte)
                                                  -((char)((ulong)uVar31 >> 0x20) == '%'))) &
                                        0xffff0000ffff) & 0xffffff01);
              lVar38 = lVar38 + ((ulong)bVar68 & 0xffffff01);
              lVar39 = lVar39 + ((ulong)CONCAT14(bVar67,(uint)(byte)-((char)((ulong)uVar31 >> 0x10)
                                                                     == '%')) & 0xffffff01);
              lVar40 = lVar40 + ((ulong)bVar67 & 0xffffff01);
              lVar43 = lVar43 + ((ulong)CONCAT14(bVar65,(uint)(byte)-((char)((ulong)uVar14 >> 0x30)
                                                                     == '%')) & 0xffffff01);
              lVar44 = lVar44 + ((ulong)bVar65 & 0xffffff01);
              lVar29 = lVar29 + ((ulong)((uint6)CONCAT14(bVar66,(uint)CONCAT12(bVar66,(ushort)(byte)
                                                  -((char)uVar31 == '%'))) & 0xffff0000ffff) &
                                0xffffff01);
              lVar27 = lVar27 + ((ulong)bVar66 & 0xffffff01);
              lVar33 = lVar33 + ((ulong)((uint6)CONCAT14(bVar64,(uint)CONCAT12(bVar64,(ushort)(byte)
                                                  -((char)((ulong)uVar14 >> 0x20) == '%'))) &
                                        0xffff0000ffff) & 0xffffff01);
              lVar34 = lVar34 + ((ulong)bVar64 & 0xffffff01);
              lVar35 = lVar35 + ((ulong)CONCAT14(bVar63,(uint)(byte)-((char)((ulong)uVar14 >> 0x10)
                                                                     == '%')) & 0xffffff01);
              lVar36 = lVar36 + ((ulong)bVar63 & 0xffffff01);
              lVar26 = lVar26 + (ulong)(-((char)uVar14 == '%') & 1);
              lVar18 = lVar18 + (ulong)(-((char)((ulong)uVar14 >> 8) == '%') & 1);
              lVar59 = lVar59 + ((ulong)CONCAT14(bVar76,(uint)(byte)-((char)((ulong)uVar74 >> 0x30)
                                                                     == '%')) & 0xffffff01);
              lVar60 = lVar60 + ((ulong)bVar76 & 0xffffff01);
              lVar53 = lVar53 + ((ulong)((uint6)CONCAT14(bVar75,(uint)CONCAT12(bVar75,(ushort)(byte)
                                                  -((char)((ulong)uVar74 >> 0x20) == '%'))) &
                                        0xffff0000ffff) & 0xffffff01);
              lVar54 = lVar54 + ((ulong)bVar75 & 0xffffff01);
              lVar55 = lVar55 + (ulong)(-((char)((ulong)uVar74 >> 0x10) == '%') & 1);
              lVar56 = lVar56 + (ulong)(-((char)((ulong)uVar74 >> 0x18) == '%') & 1);
              lVar57 = lVar57 + ((ulong)CONCAT14(bVar73,(uint)(byte)-((char)((ulong)uVar70 >> 0x30)
                                                                     == '%')) & 0xffffff01);
              lVar58 = lVar58 + ((ulong)bVar73 & 0xffffff01);
              lVar45 = lVar45 + (ulong)(-((char)uVar74 == '%') & 1);
              lVar46 = lVar46 + (ulong)(-((char)((ulong)uVar74 >> 8) == '%') & 1);
              lVar49 = lVar49 + (ulong)(-((char)((ulong)uVar70 >> 0x20) == '%') & 1);
              lVar50 = lVar50 + (ulong)(-((char)((ulong)uVar70 >> 0x28) == '%') & 1);
              lVar51 = lVar51 + ((ulong)CONCAT14(bVar72,(uint)(byte)-((char)((ulong)uVar70 >> 0x10)
                                                                     == '%')) & 0xffffff01);
              lVar52 = lVar52 + ((ulong)bVar72 & 0xffffff01);
              lVar41 = lVar41 + ((ulong)((uint6)CONCAT14(bVar71,(uint)CONCAT12(bVar71,(ushort)(byte)
                                                  -((char)uVar70 == '%'))) & 0xffff0000ffff) &
                                0xffffff01);
              lVar42 = lVar42 + ((ulong)bVar71 & 0xffffff01);
              pcVar21 = pcVar21 + 0x20;
              uVar23 = uVar23 - 0x20;
            } while (uVar23 != 0);
            lVar26 = lVar41 + lVar26 + lVar45 + lVar29 + lVar49 + lVar33 + lVar53 + lVar37 +
                     lVar51 + lVar35 + lVar55 + lVar39 + lVar57 + lVar43 + lVar59 + lVar47 +
                     lVar42 + lVar18 + lVar46 + lVar27 + lVar50 + lVar34 + lVar54 + lVar38 +
                     lVar52 + lVar36 + lVar56 + lVar40 + lVar58 + lVar44 + lVar60 + lVar48;
            if (uVar19 == uVar28) goto LAB_006c8a98;
            if ((uVar19 & 0x18) == 0) {
              pcVar21 = pcVar20 + uVar28;
              goto LAB_006c8d40;
            }
          }
          uVar23 = uVar19 & 0xfffffffffffffff8;
          pcVar21 = pcVar20 + uVar23;
          lVar29 = 0;
          lVar27 = 0;
          lVar33 = 0;
          lVar18 = uVar28 - uVar23;
          lVar34 = 0;
          lVar35 = 0;
          lVar36 = 0;
          lVar37 = 0;
          pcVar22 = pcVar20 + uVar28;
          do {
            uVar14 = *(undefined8 *)pcVar22;
            lVar36 = lVar36 + (ulong)(-((char)((ulong)uVar14 >> 0x30) == '%') & 1);
            lVar37 = lVar37 + (ulong)(-((char)((ulong)uVar14 >> 0x38) == '%') & 1);
            lVar34 = lVar34 + (ulong)(-((char)((ulong)uVar14 >> 0x20) == '%') & 1);
            lVar35 = lVar35 + (ulong)(-((char)((ulong)uVar14 >> 0x28) == '%') & 1);
            lVar29 = lVar29 + (ulong)(-((char)((ulong)uVar14 >> 0x10) == '%') & 1);
            lVar27 = lVar27 + (ulong)(-((char)((ulong)uVar14 >> 0x18) == '%') & 1);
            lVar26 = lVar26 + (ulong)(-((char)uVar14 == '%') & 1);
            lVar33 = lVar33 + (ulong)(-((char)((ulong)uVar14 >> 8) == '%') & 1);
            lVar18 = lVar18 + 8;
            pcVar22 = pcVar22 + 8;
          } while (lVar18 != 0);
          lVar26 = lVar26 + lVar34 + lVar29 + lVar36 + lVar33 + lVar35 + lVar27 + lVar37;
          if (uVar19 == uVar23) goto LAB_006c8a98;
        }
LAB_006c8d40:
        do {
          pcVar22 = pcVar21 + 1;
          if (*pcVar21 == '%') {
            lVar26 = lVar26 + 1;
          }
          pcVar21 = pcVar22;
        } while (pcVar22 != pcVar20 + uVar19);
      }
LAB_006c8a98:
      lVar16 = uVar19 + lVar16 + lVar26;
      puVar17 = puVar17 + 2;
    } while (puVar17 != puVar10);
  }
  if ((cRam0000000000a336a0 == '\0') || (lVar26 = *(long *)(lVar15 + 0x38), lVar26 == 0)) {
    iStack_100 = 0;
  }
  else if (puVar8[0x22] == 0) {
    iStack_100 = 0;
    lVar16 = lVar16 + lVar26 * 2;
  }
  else {
    iStack_100 = 0;
    lVar18 = 0;
    do {
      while (uVar19 = *(ulong *)(*(long *)(lVar15 + 0x30) + lVar18 * 8), uVar19 != puVar8[0x23]) {
        uVar23 = 0;
        uVar28 = uVar19 >> 4 ^ uVar19 >> 9;
LAB_006c8dd8:
        uVar28 = uVar28 & puVar8[0x21] - 1;
        uVar9 = *(ulong *)(puVar8[0x20] + uVar28 * 0x20);
        if (uVar9 != uVar19) {
          if (uVar9 != puVar8[0x23]) goto code_r0x006c8df4;
          break;
        }
        lVar29 = puVar8[0x20] + uVar28 * 0x20;
        if (*(int *)(lVar29 + 8) != 5) break;
        uVar1 = *(uint *)(lVar29 + 0xc);
        uVar19 = (ulong)uVar1;
        if (uVar1 == 0) {
          lVar29 = 0;
          goto LAB_006c90d0;
        }
        pcVar20 = *(char **)(lVar29 + 0x10);
        if (uVar1 < 8) {
          lVar29 = 0;
          pcVar21 = pcVar20;
          goto LAB_006c90b8;
        }
        if (uVar1 < 0x20) {
          lVar29 = 0;
          uVar23 = 0;
          goto LAB_006c9024;
        }
        lVar29 = 0;
        lVar27 = 0;
        uVar23 = uVar19 & 0xffffffe0;
        lVar37 = 0;
        lVar38 = 0;
        pcVar21 = pcVar20 + 0x10;
        lVar35 = 0;
        lVar36 = 0;
        lVar45 = 0;
        lVar46 = 0;
        lVar33 = 0;
        lVar34 = 0;
        lVar41 = 0;
        lVar42 = 0;
        lVar39 = 0;
        lVar40 = 0;
        lVar49 = 0;
        lVar50 = 0;
        lVar43 = 0;
        lVar44 = 0;
        lVar53 = 0;
        lVar54 = 0;
        lVar51 = 0;
        lVar52 = 0;
        lVar59 = 0;
        lVar60 = 0;
        lVar47 = 0;
        lVar48 = 0;
        lVar57 = 0;
        lVar58 = 0;
        lVar55 = 0;
        lVar56 = 0;
        lVar61 = 0;
        lVar62 = 0;
        uVar28 = uVar23;
        do {
          uVar31 = *(undefined8 *)(pcVar21 + -8);
          uVar14 = *(undefined8 *)(pcVar21 + -0x10);
          uVar74 = *(undefined8 *)(pcVar21 + 8);
          uVar70 = *(undefined8 *)pcVar21;
          bVar63 = -((char)((ulong)uVar14 >> 0x18) == '%');
          bVar64 = -((char)((ulong)uVar14 >> 0x28) == '%');
          bVar65 = -((char)((ulong)uVar14 >> 0x38) == '%');
          bVar66 = -((char)((ulong)uVar31 >> 8) == '%');
          bVar67 = -((char)((ulong)uVar31 >> 0x18) == '%');
          bVar68 = -((char)((ulong)uVar31 >> 0x28) == '%');
          bVar69 = -((char)((ulong)uVar31 >> 0x38) == '%');
          bVar71 = -((char)((ulong)uVar70 >> 8) == '%');
          bVar72 = -((char)((ulong)uVar70 >> 0x18) == '%');
          bVar73 = -((char)((ulong)uVar70 >> 0x38) == '%');
          bVar75 = -((char)((ulong)uVar74 >> 0x28) == '%');
          bVar76 = -((char)((ulong)uVar74 >> 0x38) == '%');
          lVar49 = lVar49 + ((ulong)CONCAT14(bVar69,(uint)(byte)-((char)((ulong)uVar31 >> 0x30) ==
                                                                 '%')) & 0xffffff01);
          lVar50 = lVar50 + ((ulong)bVar69 & 0xffffff01);
          lVar39 = lVar39 + ((ulong)((uint6)CONCAT14(bVar68,(uint)CONCAT12(bVar68,(ushort)(byte)-((
                                                  char)((ulong)uVar31 >> 0x20) == '%'))) &
                                    0xffff0000ffff) & 0xffffff01);
          lVar40 = lVar40 + ((ulong)bVar68 & 0xffffff01);
          lVar41 = lVar41 + ((ulong)CONCAT14(bVar67,(uint)(byte)-((char)((ulong)uVar31 >> 0x10) ==
                                                                 '%')) & 0xffffff01);
          lVar42 = lVar42 + ((ulong)bVar67 & 0xffffff01);
          lVar45 = lVar45 + ((ulong)CONCAT14(bVar65,(uint)(byte)-((char)((ulong)uVar14 >> 0x30) ==
                                                                 '%')) & 0xffffff01);
          lVar46 = lVar46 + ((ulong)bVar65 & 0xffffff01);
          lVar33 = lVar33 + ((ulong)((uint6)CONCAT14(bVar66,(uint)CONCAT12(bVar66,(ushort)(byte)-((
                                                  char)uVar31 == '%'))) & 0xffff0000ffff) &
                            0xffffff01);
          lVar34 = lVar34 + ((ulong)bVar66 & 0xffffff01);
          lVar35 = lVar35 + ((ulong)((uint6)CONCAT14(bVar64,(uint)CONCAT12(bVar64,(ushort)(byte)-((
                                                  char)((ulong)uVar14 >> 0x20) == '%'))) &
                                    0xffff0000ffff) & 0xffffff01);
          lVar36 = lVar36 + ((ulong)bVar64 & 0xffffff01);
          lVar37 = lVar37 + ((ulong)CONCAT14(bVar63,(uint)(byte)-((char)((ulong)uVar14 >> 0x10) ==
                                                                 '%')) & 0xffffff01);
          lVar38 = lVar38 + ((ulong)bVar63 & 0xffffff01);
          lVar29 = lVar29 + (ulong)(-((char)uVar14 == '%') & 1);
          lVar27 = lVar27 + (ulong)(-((char)((ulong)uVar14 >> 8) == '%') & 1);
          lVar61 = lVar61 + ((ulong)CONCAT14(bVar76,(uint)(byte)-((char)((ulong)uVar74 >> 0x30) ==
                                                                 '%')) & 0xffffff01);
          lVar62 = lVar62 + ((ulong)bVar76 & 0xffffff01);
          lVar55 = lVar55 + ((ulong)((uint6)CONCAT14(bVar75,(uint)CONCAT12(bVar75,(ushort)(byte)-((
                                                  char)((ulong)uVar74 >> 0x20) == '%'))) &
                                    0xffff0000ffff) & 0xffffff01);
          lVar56 = lVar56 + ((ulong)bVar75 & 0xffffff01);
          lVar57 = lVar57 + (ulong)(-((char)((ulong)uVar74 >> 0x10) == '%') & 1);
          lVar58 = lVar58 + (ulong)(-((char)((ulong)uVar74 >> 0x18) == '%') & 1);
          lVar59 = lVar59 + ((ulong)CONCAT14(bVar73,(uint)(byte)-((char)((ulong)uVar70 >> 0x30) ==
                                                                 '%')) & 0xffffff01);
          lVar60 = lVar60 + ((ulong)bVar73 & 0xffffff01);
          lVar47 = lVar47 + (ulong)(-((char)uVar74 == '%') & 1);
          lVar48 = lVar48 + (ulong)(-((char)((ulong)uVar74 >> 8) == '%') & 1);
          lVar51 = lVar51 + (ulong)(-((char)((ulong)uVar70 >> 0x20) == '%') & 1);
          lVar52 = lVar52 + (ulong)(-((char)((ulong)uVar70 >> 0x28) == '%') & 1);
          lVar53 = lVar53 + ((ulong)CONCAT14(bVar72,(uint)(byte)-((char)((ulong)uVar70 >> 0x10) ==
                                                                 '%')) & 0xffffff01);
          lVar54 = lVar54 + ((ulong)bVar72 & 0xffffff01);
          lVar43 = lVar43 + ((ulong)((uint6)CONCAT14(bVar71,(uint)CONCAT12(bVar71,(ushort)(byte)-((
                                                  char)uVar70 == '%'))) & 0xffff0000ffff) &
                            0xffffff01);
          lVar44 = lVar44 + ((ulong)bVar71 & 0xffffff01);
          pcVar21 = pcVar21 + 0x20;
          uVar28 = uVar28 - 0x20;
        } while (uVar28 != 0);
        lVar29 = lVar43 + lVar29 + lVar47 + lVar33 + lVar51 + lVar35 + lVar55 + lVar39 +
                 lVar53 + lVar37 + lVar57 + lVar41 + lVar59 + lVar45 + lVar61 + lVar49 +
                 lVar44 + lVar27 + lVar48 + lVar34 + lVar52 + lVar36 + lVar56 + lVar40 +
                 lVar54 + lVar38 + lVar58 + lVar42 + lVar60 + lVar46 + lVar62 + lVar50;
        if (uVar23 != uVar19) {
          if ((uVar1 & 0x18) == 0) {
            pcVar21 = pcVar20 + uVar23;
          }
          else {
LAB_006c9024:
            uVar28 = uVar19 & 0xfffffff8;
            pcVar21 = pcVar20 + uVar28;
            lVar33 = 0;
            lVar34 = 0;
            lVar35 = 0;
            lVar27 = uVar23 - uVar28;
            lVar36 = 0;
            lVar37 = 0;
            lVar38 = 0;
            lVar39 = 0;
            pcVar22 = pcVar20 + uVar23;
            do {
              uVar14 = *(undefined8 *)pcVar22;
              lVar38 = lVar38 + (ulong)(-((char)((ulong)uVar14 >> 0x30) == '%') & 1);
              lVar39 = lVar39 + (ulong)(-((char)((ulong)uVar14 >> 0x38) == '%') & 1);
              lVar36 = lVar36 + (ulong)(-((char)((ulong)uVar14 >> 0x20) == '%') & 1);
              lVar37 = lVar37 + (ulong)(-((char)((ulong)uVar14 >> 0x28) == '%') & 1);
              lVar33 = lVar33 + (ulong)(-((char)((ulong)uVar14 >> 0x10) == '%') & 1);
              lVar34 = lVar34 + (ulong)(-((char)((ulong)uVar14 >> 0x18) == '%') & 1);
              lVar29 = lVar29 + (ulong)(-((char)uVar14 == '%') & 1);
              lVar35 = lVar35 + (ulong)(-((char)((ulong)uVar14 >> 8) == '%') & 1);
              lVar27 = lVar27 + 8;
              pcVar22 = pcVar22 + 8;
            } while (lVar27 != 0);
            lVar29 = lVar29 + lVar36 + lVar33 + lVar38 + lVar35 + lVar37 + lVar34 + lVar39;
            if (uVar28 == uVar19) goto LAB_006c90d0;
          }
LAB_006c90b8:
          do {
            pcVar22 = pcVar21 + 1;
            if (*pcVar21 == '%') {
              lVar29 = lVar29 + 1;
            }
            pcVar21 = pcVar22;
          } while (pcVar22 != pcVar20 + uVar19);
        }
LAB_006c90d0:
        iStack_100 = iStack_100 + 1;
        lVar16 = lVar29 + uVar19 + lVar16;
        lVar18 = lVar18 + 1;
        if (lVar18 == lVar26) goto LAB_006c90f8;
      }
LAB_006c8da4:
      lVar16 = lVar16 + 2;
      lVar18 = lVar18 + 1;
    } while (lVar18 != lVar26);
  }
LAB_006c90f8:
  uStack_c0 = (undefined8 *)0x0;
  uStack_b8 = 0;
  uStack_b0 = 0;
  __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE7reserveEm(&uStack_c0,lVar16);
  lStack_f0 = *(long *)(lVar15 + 0x28);
  if (cRam0000000000a336a0 == '\0') {
    if (lStack_f0 != 0) {
      puVar17 = *(undefined8 **)(lVar15 + 0x20);
      puVar10 = puVar17 + lStack_f0 * 2;
      do {
        pcVar20 = (char *)*puVar17;
        lVar16 = puVar17[1];
        lVar26 = _memchr(pcVar20,0x25,lVar16);
        uVar19 = uStack_b0;
        if (lVar26 == 0) {
          __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm
                    (&uStack_c0,pcVar20,lVar16);
        }
        else {
          for (; uStack_b0 = uVar19, lVar16 != 0; lVar16 = lVar16 + -1) {
            cVar5 = *pcVar20;
            uStack_b0._7_1_ = (byte)(uVar19 >> 0x38);
            if ((long)uVar19 < 0) {
              uVar23 = (uVar19 & 0x7fffffffffffffff) - 1;
              if (uStack_b8 != uVar23) goto code_r0x006c9624;
              if ((uVar19 & 0x7fffffffffffffff) != 0x7ffffffffffffff8) {
                uVar19 = 0x7ffffffffffffff7;
                puVar32 = uStack_c0;
                if (uVar23 < 0x3ffffffffffffff3) goto code_r0x006c9580;
                goto code_r0x006c95b0;
              }
code_r0x006c9a90:
              func_0x0001748c(&uStack_c0);
              goto code_r0x006c9ae0;
            }
            if (uStack_b0._7_1_ == 0x16) {
              uVar23 = 0x16;
              puVar32 = &uStack_c0;
code_r0x006c9580:
              uVar28 = uVar23 * 2;
              if (uVar28 < uVar23 + 1) {
                uVar28 = uVar23 + 1;
              }
              uVar9 = (uVar28 & 0x7ffffffffffffff8) + 8;
              if ((uVar28 | 7) != 0x17) {
                uVar9 = uVar28 | 7;
              }
              uVar19 = 0x17;
              if (0x16 < uVar28) {
                uVar19 = uVar9 + 1;
              }
code_r0x006c95b0:
              puVar11 = (undefined8 *)__Znwm(uVar19);
              if ((uVar23 == 0) || (_memmove(puVar11,puVar32,uVar23), uVar23 != 0x16)) {
                __ZdlPv(puVar32);
              }
              uStack_b8 = uVar23;
              uStack_c0 = puVar11;
              uStack_b0 = uVar19 | 0x8000000000000000;
code_r0x006c9624:
              *(char *)((long)uStack_c0 + uStack_b8) = cVar5;
              ((char *)((long)uStack_c0 + uStack_b8))[1] = '\0';
              uStack_b8 = uStack_b8 + 1;
              uVar19 = uStack_b0;
            }
            else {
              uVar23 = (ulong)uStack_b0._7_1_;
              uStack_b0._0_7_ = (undefined7)uVar19;
              uStack_b0 = CONCAT17(uStack_b0._7_1_ + 1,(undefined7)uStack_b0) & 0x7fffffffffffffff;
              *(char *)((long)&uStack_c0 + uVar23) = cVar5;
              *(undefined1 *)((long)&uStack_c0 + uVar23 + 1) = 0;
              uVar19 = uStack_b0;
            }
            uStack_b0 = uVar19;
            if (cVar5 == '%') {
              uStack_b0._7_1_ = (byte)(uVar19 >> 0x38);
              if ((long)uVar19 < 0) {
                uVar23 = (uVar19 & 0x7fffffffffffffff) - 1;
                if (uStack_b8 == uVar23) {
                  if ((uVar19 & 0x7fffffffffffffff) == 0x7ffffffffffffff8) goto code_r0x006c9a90;
                  uVar19 = 0x7ffffffffffffff7;
                  puVar32 = uStack_c0;
                  if (uVar23 < 0x3ffffffffffffff3) goto code_r0x006c969c;
                  goto code_r0x006c96d4;
                }
code_r0x006c971c:
                uVar23 = uStack_b8;
                puVar32 = uStack_c0;
                uStack_b8 = uStack_b8 + 1;
              }
              else {
                if (uStack_b0._7_1_ == 0x16) {
                  uVar23 = 0x16;
                  puVar32 = &uStack_c0;
code_r0x006c969c:
                  uVar28 = uVar23 * 2;
                  if (uVar28 < uVar23 + 1) {
                    uVar28 = uVar23 + 1;
                  }
                  if (uVar28 < 0x17) {
                    uVar19 = 0x17;
                  }
                  else {
                    uVar19 = (uVar28 & 0x7ffffffffffffff8) + 8;
                    if ((uVar28 | 7) != 0x17) {
                      uVar19 = uVar28 | 7;
                    }
                    uVar19 = uVar19 + 1;
                  }
code_r0x006c96d4:
                  puVar11 = (undefined8 *)__Znwm(uVar19);
                  if ((uVar23 == 0) || (_memmove(puVar11,puVar32,uVar23), uVar23 != 0x16)) {
                    __ZdlPv(puVar32);
                  }
                  uStack_b8 = uVar23;
                  uStack_c0 = puVar11;
                  uStack_b0 = uVar19 | 0x8000000000000000;
                  goto code_r0x006c971c;
                }
                uVar23 = (ulong)uStack_b0._7_1_;
                uStack_b0._0_7_ = (undefined7)uVar19;
                uStack_b0 = CONCAT17(uStack_b0._7_1_ + 1,(undefined7)uStack_b0) & 0x7fffffffffffffff
                ;
                puVar32 = &uStack_c0;
              }
              *(undefined2 *)((long)puVar32 + uVar23) = 0x25;
            }
            pcVar20 = pcVar20 + 1;
            uVar19 = uStack_b0;
          }
        }
        lStack_f0 = lStack_f0 + -1;
        if (lStack_f0 != 0) {
          __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm
                    (&uStack_c0,"%*",2);
        }
        puVar17 = puVar17 + 2;
      } while (puVar17 != puVar10);
    }
  }
  else if (lStack_f0 != 0) {
    uVar19 = 0;
    do {
      puVar17 = (undefined8 *)(*(long *)(lVar15 + 0x20) + uVar19 * 0x10);
      pcVar20 = (char *)*puVar17;
      lVar16 = puVar17[1];
      lVar26 = _memchr(pcVar20,0x25,lVar16);
      uVar23 = uStack_b0;
      if (lVar26 == 0) {
        __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm
                  (&uStack_c0,pcVar20,lVar16);
      }
      else {
        for (; uStack_b0 = uVar23, lVar16 != 0; lVar16 = lVar16 + -1) {
          cVar5 = *pcVar20;
          uStack_b0._7_1_ = (byte)(uVar23 >> 0x38);
          if ((long)uVar23 < 0) {
            uVar28 = (uVar23 & 0x7fffffffffffffff) - 1;
            if (uStack_b8 != uVar28) goto code_r0x006c92ac;
            if ((uVar23 & 0x7fffffffffffffff) != 0x7ffffffffffffff8) {
              uVar23 = 0x7ffffffffffffff7;
              puVar17 = uStack_c0;
              if (uVar28 < 0x3ffffffffffffff3) goto LAB_006c9208;
              goto LAB_006c9238;
            }
LAB_006c9a84:
            func_0x0001748c(&uStack_c0);
            goto code_r0x006c9ae0;
          }
          if (uStack_b0._7_1_ == 0x16) {
            uVar28 = 0x16;
            puVar17 = &uStack_c0;
LAB_006c9208:
            uVar9 = uVar28 * 2;
            if (uVar9 < uVar28 + 1) {
              uVar9 = uVar28 + 1;
            }
            uVar24 = (uVar9 & 0x7ffffffffffffff8) + 8;
            if ((uVar9 | 7) != 0x17) {
              uVar24 = uVar9 | 7;
            }
            uVar23 = 0x17;
            if (0x16 < uVar9) {
              uVar23 = uVar24 + 1;
            }
LAB_006c9238:
            puVar10 = (undefined8 *)__Znwm(uVar23);
            if ((uVar28 == 0) || (_memmove(puVar10,puVar17,uVar28), uVar28 != 0x16)) {
              __ZdlPv(puVar17);
            }
            uStack_b8 = uVar28;
            uStack_c0 = puVar10;
            uStack_b0 = uVar23 | 0x8000000000000000;
code_r0x006c92ac:
            *(char *)((long)uStack_c0 + uStack_b8) = cVar5;
            ((char *)((long)uStack_c0 + uStack_b8))[1] = '\0';
            uStack_b8 = uStack_b8 + 1;
            uVar23 = uStack_b0;
          }
          else {
            uVar28 = (ulong)uStack_b0._7_1_;
            uStack_b0._0_7_ = (undefined7)uVar23;
            uStack_b0 = CONCAT17(uStack_b0._7_1_ + 1,(undefined7)uStack_b0) & 0x7fffffffffffffff;
            *(char *)((long)&uStack_c0 + uVar28) = cVar5;
            *(undefined1 *)((long)&uStack_c0 + uVar28 + 1) = 0;
            uVar23 = uStack_b0;
          }
          uStack_b0 = uVar23;
          if (cVar5 == '%') {
            uStack_b0._7_1_ = (byte)(uVar23 >> 0x38);
            if ((long)uVar23 < 0) {
              uVar28 = (uVar23 & 0x7fffffffffffffff) - 1;
              if (uStack_b8 == uVar28) {
                if ((uVar23 & 0x7fffffffffffffff) == 0x7ffffffffffffff8) goto LAB_006c9a84;
                uVar23 = 0x7ffffffffffffff7;
                puVar17 = uStack_c0;
                if (uVar28 < 0x3ffffffffffffff3) goto code_r0x006c9324;
                goto code_r0x006c935c;
              }
code_r0x006c93a4:
              uVar28 = uStack_b8;
              puVar17 = uStack_c0;
              uStack_b8 = uStack_b8 + 1;
            }
            else {
              if (uStack_b0._7_1_ == 0x16) {
                uVar28 = 0x16;
                puVar17 = &uStack_c0;
code_r0x006c9324:
                uVar9 = uVar28 * 2;
                if (uVar9 < uVar28 + 1) {
                  uVar9 = uVar28 + 1;
                }
                if (uVar9 < 0x17) {
                  uVar23 = 0x17;
                }
                else {
                  uVar23 = (uVar9 & 0x7ffffffffffffff8) + 8;
                  if ((uVar9 | 7) != 0x17) {
                    uVar23 = uVar9 | 7;
                  }
                  uVar23 = uVar23 + 1;
                }
code_r0x006c935c:
                puVar10 = (undefined8 *)__Znwm(uVar23);
                if ((uVar28 == 0) || (_memmove(puVar10,puVar17,uVar28), uVar28 != 0x16)) {
                  __ZdlPv(puVar17);
                }
                uStack_b8 = uVar28;
                uStack_c0 = puVar10;
                uStack_b0 = uVar23 | 0x8000000000000000;
                goto code_r0x006c93a4;
              }
              uVar28 = (ulong)uStack_b0._7_1_;
              uStack_b0._0_7_ = (undefined7)uVar23;
              uStack_b0 = CONCAT17(uStack_b0._7_1_ + 1,(undefined7)uStack_b0) & 0x7fffffffffffffff;
              puVar17 = &uStack_c0;
            }
            *(undefined2 *)((long)puVar17 + uVar28) = 0x25;
          }
          pcVar20 = pcVar20 + 1;
          uVar23 = uStack_b0;
        }
      }
      if (uVar19 < *(ulong *)(lVar15 + 0x38)) {
        if (puVar8[0x22] != 0) {
          uVar23 = *(ulong *)(*(long *)(lVar15 + 0x30) + uVar19 * 8);
          if (uVar23 != puVar8[0x23]) {
            uVar28 = 0;
            uVar9 = uVar23 >> 4 ^ uVar23 >> 9;
            do {
              uVar9 = uVar9 & puVar8[0x21] - 1;
              uVar24 = *(ulong *)(puVar8[0x20] + uVar9 * 0x20);
              if (uVar24 == uVar23) {
                lVar16 = puVar8[0x20] + uVar9 * 0x20;
                if (*(int *)(lVar16 + 8) == 5) {
                  pcVar20 = *(char **)(lVar16 + 0x10);
                  uVar1 = *(uint *)(lVar16 + 0xc);
                  uVar23 = (ulong)uVar1;
                  lVar16 = _memchr(pcVar20,0x25,uVar23);
                  if (lVar16 == 0) {
                    __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm
                              (&uStack_c0,pcVar20,uVar23);
                  }
                  else if (uVar1 != 0) {
                    do {
                      cVar5 = *pcVar20;
                      __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE9push_backEc
                                (&uStack_c0,(long)cVar5);
                      if (cVar5 == '%') {
                        __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE9push_backEc
                                  (&uStack_c0,0x25);
                      }
                      uVar23 = uVar23 - 1;
                      pcVar20 = pcVar20 + 1;
                    } while (uVar23 != 0);
                  }
                  goto code_r0x006c9148;
                }
                break;
              }
              uVar28 = uVar28 + 1;
              uVar9 = uVar28 + uVar9;
            } while (uVar24 != puVar8[0x23] && uVar28 <= puVar8[0x21] - 1);
          }
        }
        __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm
                  (&uStack_c0,"%*",2);
      }
code_r0x006c9148:
      uVar19 = uVar19 + 1;
    } while (uVar19 < *(ulong *)(lVar15 + 0x28));
  }
  uVar23 = uStack_b0;
  uVar19 = uStack_b8;
  if (-1 < (long)uStack_b0) {
    uVar19 = uStack_b0 >> 0x38;
  }
  lVar16 = __Znam(uVar19);
  puVar17 = uStack_c0;
  if (-1 < (long)uVar23) {
    puVar17 = &uStack_c0;
  }
  lStack_c8 = lVar16;
  _memcpy(lVar16,puVar17,uVar19);
  plVar12 = (long *)puVar8[0xa7];
  if (plVar12 < (long *)puVar8[0xa8]) {
    lStack_c8 = 0;
    plVar13 = plVar12 + 1;
    *plVar12 = lVar16;
  }
  else {
    plVar13 = (long *)func_0x006cb028(puVar8 + 0xa6,&lStack_c8);
  }
  puVar8[0xa7] = plVar13;
  uVar14 = func_0x006b1354(*puVar8,lVar16,uVar19);
  if ((int)(uint)uVar14 < 0) {
    func_0x006bc388(lVar15 + 0xc,"Exceeded constant limit; simplify the code to compile");
  }
  else {
    uVar3 = *(uint *)((long)puVar8 + 0x484);
    uVar1 = (*(int *)(lVar15 + 0x38) - iStack_100) + 2 + uVar3;
    if (uVar1 < 0x100) {
      *(uint *)((long)puVar8 + 0x484) = uVar1;
      uVar2 = *(uint *)(puVar8 + 0x91);
      if (*(uint *)(puVar8 + 0x91) <= uVar1) {
        uVar2 = uVar1;
      }
      *(uint *)(puVar8 + 0x91) = uVar2;
      if ((uint)uVar14 >> 0xf == 0) {
        func_0x006b1f78(*puVar8,5,uVar3 & 0xff,(int)(short)uVar14);
      }
      else {
        func_0x006b1f78(*puVar8,0x42,uVar3 & 0xff,0);
        func_0x006b24c4(*puVar8,uVar14);
      }
      uVar19 = *(ulong *)(lVar15 + 0x38);
      if (cRam0000000000a336a0 == '\0') {
        if (uVar19 != 0) {
          uVar19 = 0;
          uVar4 = *(undefined4 *)((long)puVar8 + 0x484);
          do {
            uVar14 = *(undefined8 *)(*(long *)(lVar15 + 0x30) + uVar19 * 8);
            uVar1 = uVar3 + 2 + (int)uVar19 & 0xff;
            *(uint *)((long)puVar8 + 0x484) = uVar1 + 1;
            func_0x006c6028(puVar8,uVar14,uVar1,1);
            *(undefined4 *)((long)puVar8 + 0x484) = uVar4;
            uVar19 = uVar19 + 1;
          } while (uVar19 < *(ulong *)(lVar15 + 0x38));
        }
      }
      else if (uVar19 != 0) {
        uVar23 = 0;
        iVar30 = 0;
code_r0x006c988c:
        do {
          uVar28 = *(ulong *)(*(long *)(lVar15 + 0x30) + uVar23 * 8);
          if ((puVar8[0x22] != 0) && (uVar28 != puVar8[0x23])) {
            uVar9 = 0;
            uVar24 = uVar28 >> 4 ^ uVar28 >> 9;
            do {
              uVar24 = uVar24 & puVar8[0x21] - 1;
              uVar25 = *(ulong *)(puVar8[0x20] + uVar24 * 0x20);
              if (uVar25 == uVar28) {
                if (*(int *)(puVar8[0x20] + uVar24 * 0x20 + 8) == 5) {
                  iVar30 = iVar30 + 1;
                  uVar23 = uVar23 + 1;
                  if (uVar23 < uVar19) goto code_r0x006c988c;
                  goto code_r0x006c9988;
                }
                break;
              }
              uVar9 = uVar9 + 1;
              uVar24 = uVar9 + uVar24;
            } while (uVar25 != puVar8[0x23] && uVar9 <= puVar8[0x21] - 1);
          }
          uVar1 = ((uVar3 + 2) - iVar30) + (int)uVar23 & 0xff;
          uVar4 = *(undefined4 *)((long)puVar8 + 0x484);
          *(uint *)((long)puVar8 + 0x484) = uVar1 + 1;
          func_0x006c6028(puVar8,uVar28,uVar1,1);
          *(undefined4 *)((long)puVar8 + 0x484) = uVar4;
          uVar19 = *(ulong *)(lVar15 + 0x38);
          uVar23 = uVar23 + 1;
        } while (uVar23 < uVar19);
      }
code_r0x006c9988:
      uVar14 = func_0x006b1354(*puVar8,"format",6);
      if (-1 < (int)uVar14) {
        uVar31 = *puVar8;
        uVar7 = func_0x006b401c("format",6);
        func_0x006b1ccc(uVar31,0x14,uVar3 & 0xff,uVar3 & 0xff,uVar7);
        func_0x006b24c4(*puVar8,uVar14);
        func_0x006b1ccc(*puVar8,0x15,uVar3 & 0xff,(*(int *)(lVar15 + 0x38) - iStack_100) + 2U & 0xff
                        ,2);
        func_0x006b1ccc(*puVar8,6,param_3,uVar3 & 0xff,0);
        lVar15 = lStack_c8;
        *(uint *)((long)puVar8 + 0x484) = uVar3;
        lStack_c8 = 0;
        if (lVar15 != 0) {
          __ZdaPv();
        }
        if ((long)uStack_b0 < 0) {
          __ZdlPv(uStack_c0);
        }
        return;
      }
      func_0x006bc388(lVar15 + 0xc,"Exceeded constant limit; simplify the code to compile");
    }
    else {
      func_0x006bc388(lVar15 + 0xc,
                      "Out of registers when trying to allocate %d registers: exceeded limit %d");
    }
  }
code_r0x006c9ae0:
                    /* WARNING: Does not return */
  pcVar6 = (code *)SoftwareBreakpoint(1,0x6c9ae4);
  (*pcVar6)();
code_r0x006c8df4:
  uVar23 = uVar23 + 1;
  uVar28 = uVar23 + uVar28;
  if (puVar8[0x21] - 1 < uVar23) goto LAB_006c8da4;
  goto LAB_006c8dd8;
}

