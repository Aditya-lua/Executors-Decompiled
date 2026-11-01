
/* WARNING: Possible PIC construction at 0x0047148c: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x00471490) */
/* WARNING: Removing unreachable block (ram,0x0047149c) */
/* WARNING: Removing unreachable block (ram,0x004714c0) */
/* WARNING: Removing unreachable block (ram,0x004714cc) */
/* WARNING: Removing unreachable block (ram,0x004714e0) */
/* WARNING: Removing unreachable block (ram,0x004714e8) */
/* WARNING: Removing unreachable block (ram,0x004714fc) */
/* WARNING: Removing unreachable block (ram,0x00471504) */
/* WARNING: Removing unreachable block (ram,0x00471518) */
/* WARNING: Removing unreachable block (ram,0x00471520) */
/* WARNING: Removing unreachable block (ram,0x0047152c) */
/* WARNING: Removing unreachable block (ram,0x00471534) */
/* WARNING: Removing unreachable block (ram,0x00471544) */
/* WARNING: Removing unreachable block (ram,0x00471568) */
/* WARNING: Removing unreachable block (ram,0x00471580) */
/* WARNING: Removing unreachable block (ram,0x00471584) */
/* WARNING: Removing unreachable block (ram,0x0047158c) */
/* WARNING: Removing unreachable block (ram,0x00471464) */
/* WARNING: Removing unreachable block (ram,0x00471478) */
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

ulong * FUN_004709bc(ulong *param_1,undefined8 param_2,undefined8 param_3,undefined8 *param_4,
                    ulong param_5)

{
  uint uVar1;
  byte *pbVar2;
  uint uVar3;
  byte bVar4;
  byte bVar5;
  byte bVar6;
  undefined1 auVar7 [16];
  undefined1 auVar8 [16];
  undefined1 auVar9 [16];
  undefined1 auVar10 [16];
  undefined1 auVar11 [16];
  undefined1 auVar12 [16];
  undefined1 auVar13 [16];
  undefined1 auVar14 [16];
  long lVar15;
  undefined1 **ppuVar16;
  ulong *puVar17;
  undefined8 *puVar18;
  byte *pbVar19;
  undefined *puVar20;
  undefined8 *puVar21;
  undefined8 *extraout_x8;
  ulong uVar22;
  undefined *extraout_x8_00;
  ulong extraout_x8_01;
  char cVar23;
  uint uVar24;
  int iVar25;
  undefined1 *puVar26;
  undefined1 *extraout_x9;
  ulong *puVar27;
  ulong uVar28;
  ulong *puVar29;
  undefined *puVar30;
  uint uVar31;
  undefined8 *extraout_x11;
  undefined8 *extraout_x11_00;
  undefined8 *extraout_x11_01;
  long extraout_x13;
  long extraout_x13_00;
  long extraout_x13_01;
  undefined1 *puVar32;
  long lVar33;
  undefined1 (*pauVar34) [16];
  undefined1 *puVar35;
  undefined8 *puVar36;
  long lVar37;
  long extraout_x17;
  long extraout_x17_00;
  long extraout_x17_01;
  undefined1 *unaff_x19;
  undefined8 *unaff_x20;
  undefined1 uVar38;
  undefined8 *unaff_x21;
  undefined8 *puVar39;
  undefined8 *unaff_x22;
  ulong *unaff_x23;
  ulong *unaff_x24;
  undefined8 unaff_x25;
  undefined8 unaff_x26;
  long unaff_x27;
  long unaff_x28;
  undefined1 **ppuVar40;
  undefined *puVar41;
  char cVar42;
  char cVar43;
  char cVar44;
  char cVar45;
  char cVar46;
  char cVar47;
  char cVar48;
  char cVar49;
  char cVar50;
  char cVar51;
  char cVar52;
  char cVar53;
  char cVar54;
  char cVar55;
  char cVar56;
  char cVar57;
  undefined8 uVar58;
  undefined1 auVar59 [16];
  undefined8 uVar60;
  undefined1 auVar61 [16];
  undefined1 auVar62 [16];
  undefined1 auVar63 [12];
  undefined1 *puStack_30;
  undefined8 uStack_28;
  undefined1 *puStack_20;
  undefined8 uStack_18;
  
  uVar31 = *(byte *)((long)param_1 + 10) + 1;
  *(char *)((long)param_1 + 10) = (char)uVar31;
  if (uVar31 >> 8 == 0) {
    if (*param_1 < 3) {
      *param_1 = 3;
    }
    return param_1;
  }
  auVar62 = func_0x007a2570(3,3,&UNK_009e0b90);
  puVar17 = auVar62._0_8_;
  uStack_18 = 0x470a28;
  uVar28 = *auVar62._8_8_;
  if (uVar28 <= *puVar17) {
    uVar28 = *puVar17;
  }
  if (uVar28 < 4) {
    if (uVar28 == 0) {
LAB_00470a94:
      *puVar17 = uVar28;
      return puVar17;
    }
    uVar31 = 1;
    puVar27 = puVar17 + 1;
    puVar29 = auVar62._8_8_ + 1;
    uVar22 = uVar28;
    do {
      uVar24 = (uint)(byte)*puVar27 + ((byte)*puVar29 ^ 0xff);
      uVar3 = uVar24 & 0xff;
      uVar1 = uVar3 + uVar31;
      uVar31 = uVar1 >> 8;
      if (uVar3 != uVar24) {
        uVar31 = 1;
      }
      *(char *)puVar27 = (char)uVar1;
      uVar22 = uVar22 - 1;
      puVar27 = (ulong *)((long)puVar27 + 1);
      puVar29 = (ulong *)((long)puVar29 + 1);
    } while (uVar22 != 0);
    puStack_20 = (undefined1 *)((long)register0x00000008 + -0x10);
    if (uVar31 != 0) goto LAB_00470a94;
  }
  else {
    puStack_20 = (undefined1 *)((long)register0x00000008 + -0x10);
    func_0x007a28b0(uVar28,3,&UNK_009e0b90);
  }
  auVar63 = func_0x007a247c(&UNK_00894d89,0x1a,&UNK_009e0b90);
  puVar17 = auVar63._0_8_;
  ppuVar40 = &puStack_30;
  uStack_28 = 0x470acc;
  uVar28 = *puVar17;
  if (uVar28 < 4) {
    if (uVar28 != 0) {
      uVar31 = auVar63._8_4_ & 0xff;
      uVar1 = (byte)puVar17[1] * uVar31;
      uVar24 = uVar1 >> 8;
      *(char *)(puVar17 + 1) = (char)uVar1;
      if (uVar28 != 1) {
        uVar1 = uVar24 + *(byte *)((long)puVar17 + 9) * uVar31;
        uVar24 = uVar1 >> 8 & 0xff;
        *(char *)((long)puVar17 + 9) = (char)uVar1;
        if (uVar28 != 2) {
          uVar31 = uVar24 + *(byte *)((long)puVar17 + 10) * uVar31;
          uVar24 = uVar31 >> 8 & 0xff;
          *(char *)((long)puVar17 + 10) = (char)uVar31;
        }
      }
      if (uVar24 != 0) {
        puStack_30 = (undefined1 *)&puStack_20;
        if (uVar28 == 3) goto LAB_00470b60;
        *(char *)((long)puVar17 + (uVar28 | 8)) = (char)uVar24;
        uVar28 = uVar28 + 1;
      }
    }
    *puVar17 = uVar28;
    return puVar17;
  }
  puStack_30 = (undefined1 *)&puStack_20;
  func_0x007a28b0(uVar28,3,&UNK_009e0b90);
LAB_00470b60:
  puVar41 = (undefined *)0x470b74;
  auVar62 = func_0x007a2570(3,3,&UNK_009e0b90);
  ppuVar16 = &puStack_30;
  do {
    puVar18 = auVar62._8_8_;
    puVar17 = auVar62._0_8_;
    *(ulong **)((long)ppuVar16 + -0x40) = unaff_x24;
    *(ulong **)((long)ppuVar16 + -0x38) = unaff_x23;
    *(undefined8 **)((long)ppuVar16 + -0x30) = unaff_x22;
    *(undefined8 **)((long)ppuVar16 + -0x28) = unaff_x21;
    *(undefined8 **)((long)ppuVar16 + -0x20) = unaff_x20;
    *(undefined1 **)((long)ppuVar16 + -0x18) = unaff_x19;
    *(undefined1 ***)((long)ppuVar16 + -0x10) = ppuVar40;
    *(undefined **)((long)ppuVar16 + -8) = puVar41;
    if (puVar18 < &MACH_HEADER.flags) {
      unaff_x19 = (undefined1 *)((ulong)puVar18 >> 3);
      unaff_x22 = (undefined8 *)*puVar17;
      unaff_x20 = puVar18;
      puVar36 = unaff_x22;
      if (unaff_x22 != (undefined8 *)0x0) {
        puVar21 = unaff_x22;
        do {
          puVar21 = (undefined8 *)((long)puVar21 - 1);
          puVar39 = unaff_x21;
          if ((undefined8 *)((long)&MACH_HEADER.magic + 3) < unaff_x22) goto LAB_00470dd8;
          puVar26 = unaff_x19 + (long)puVar21;
          if ((undefined1 *)((long)&MACH_HEADER.magic + 2) < puVar26) goto LAB_00470dc4;
          (unaff_x19 + (long)puVar17 + 7 + (long)puVar21)[1] =
               *(undefined1 *)((long)puVar21 + (long)(puVar17 + 1));
        } while (puVar21 != (undefined8 *)0x0);
      }
      unaff_x21 = (undefined8 *)((ulong)puVar18 & 7);
      if ((undefined8 *)((long)&MACH_HEADER.cputype + 3) < puVar18) {
        _bzero(puVar17 + 1,unaff_x19);
        unaff_x23 = puVar17;
      }
      puVar21 = (undefined8 *)((long)unaff_x22 + (long)unaff_x19);
      if (unaff_x21 == (undefined8 *)0x0) goto LAB_00470d94;
      puVar26 = (undefined1 *)((long)puVar21 - 1);
      if ((undefined1 *)((long)&MACH_HEADER.magic + 2) < puVar26) goto LAB_00470dc4;
      puVar27 = puVar17 + 1;
      uVar31 = -auVar62._8_4_ & 7;
      bVar4 = *(byte *)((long)puVar27 + (long)puVar26) >> (ulong)uVar31;
      puVar18 = puVar21;
      if (bVar4 == 0) {
LAB_00470c3c:
        if (puVar21 <= unaff_x19 + 1) goto LAB_00470d88;
        puVar26 = (undefined1 *)((long)unaff_x22 + -1);
        if (puVar26 < (undefined1 *)0x8) goto LAB_00470d54;
        cVar23 = (char)uVar31;
        uVar38 = SUB81(unaff_x21,0);
        if (puVar26 <= (undefined1 *)((long)&segment_command_00000020.vmaddr + 7)) {
          puVar32 = (undefined1 *)0x0;
          goto LAB_00470d00;
        }
        puVar32 = (undefined1 *)((ulong)puVar26 & 0xffffffffffffffc0);
        pauVar34 = (undefined1 (*) [16])
                   ((undefined1 *)((long)unaff_x22 + (long)unaff_x19) + (long)puVar17 + -0x19);
        cVar42 = -cVar23;
        cVar43 = -cVar23;
        cVar44 = -cVar23;
        cVar45 = -cVar23;
        cVar46 = -cVar23;
        cVar47 = -cVar23;
        cVar48 = -cVar23;
        cVar49 = -cVar23;
        cVar50 = -cVar23;
        cVar51 = -cVar23;
        cVar52 = -cVar23;
        cVar53 = -cVar23;
        cVar54 = -cVar23;
        cVar55 = -cVar23;
        cVar56 = -cVar23;
        cVar57 = -cVar23;
        puVar35 = puVar32;
        do {
          auVar62 = *(undefined1 (*) [16])(*pauVar34 + 1);
          auVar9 = *(undefined1 (*) [16])(pauVar34[-1] + 1);
          auVar14 = *(undefined1 (*) [16])(pauVar34[-2] + 1);
          auVar7 = *pauVar34;
          auVar13 = pauVar34[-2];
          auVar8 = pauVar34[-1];
          auVar61[1] = cVar43;
          auVar61[0] = cVar42;
          auVar61[2] = cVar44;
          auVar61[3] = cVar45;
          auVar61[4] = cVar46;
          auVar61[5] = cVar47;
          auVar61[6] = cVar48;
          auVar61[7] = cVar49;
          auVar61[8] = cVar50;
          auVar61[9] = cVar51;
          auVar61[10] = cVar52;
          auVar61[0xb] = cVar53;
          auVar61[0xc] = cVar54;
          auVar61[0xd] = cVar55;
          auVar61[0xe] = cVar56;
          auVar61[0xf] = cVar57;
          auVar61 = NEON_ushl(pauVar34[1],auVar61,1);
          auVar59[1] = uVar38;
          auVar59[0] = uVar38;
          auVar59[2] = uVar38;
          auVar59[3] = uVar38;
          auVar59[4] = uVar38;
          auVar59[5] = uVar38;
          auVar59[6] = uVar38;
          auVar59[7] = uVar38;
          auVar59[8] = uVar38;
          auVar59[9] = uVar38;
          auVar59[10] = uVar38;
          auVar59[0xb] = uVar38;
          auVar59[0xc] = uVar38;
          auVar59[0xd] = uVar38;
          auVar59[0xe] = uVar38;
          auVar59[0xf] = uVar38;
          auVar59 = NEON_ushl(*(undefined1 (*) [16])(pauVar34[1] + 1),auVar59,1);
          pauVar34[1][9] = auVar61[8] | auVar59[8];
          pauVar34[1][10] = auVar61[9] | auVar59[9];
          pauVar34[1][0xb] = auVar61[10] | auVar59[10];
          pauVar34[1][0xc] = auVar61[0xb] | auVar59[0xb];
          pauVar34[1][0xd] = auVar61[0xc] | auVar59[0xc];
          pauVar34[1][0xe] = auVar61[0xd] | auVar59[0xd];
          pauVar34[1][0xf] = auVar61[0xe] | auVar59[0xe];
          pauVar34[2][0] = auVar61[0xf] | auVar59[0xf];
          pauVar34[1][1] = auVar61[0] | auVar59[0];
          pauVar34[1][2] = auVar61[1] | auVar59[1];
          pauVar34[1][3] = auVar61[2] | auVar59[2];
          pauVar34[1][4] = auVar61[3] | auVar59[3];
          pauVar34[1][5] = auVar61[4] | auVar59[4];
          pauVar34[1][6] = auVar61[5] | auVar59[5];
          pauVar34[1][7] = auVar61[6] | auVar59[6];
          pauVar34[1][8] = auVar61[7] | auVar59[7];
          auVar10[1] = cVar43;
          auVar10[0] = cVar42;
          auVar10[2] = cVar44;
          auVar10[3] = cVar45;
          auVar10[4] = cVar46;
          auVar10[5] = cVar47;
          auVar10[6] = cVar48;
          auVar10[7] = cVar49;
          auVar10[8] = cVar50;
          auVar10[9] = cVar51;
          auVar10[10] = cVar52;
          auVar10[0xb] = cVar53;
          auVar10[0xc] = cVar54;
          auVar10[0xd] = cVar55;
          auVar10[0xe] = cVar56;
          auVar10[0xf] = cVar57;
          auVar59 = NEON_ushl(auVar7,auVar10,1);
          auVar7[1] = uVar38;
          auVar7[0] = uVar38;
          auVar7[2] = uVar38;
          auVar7[3] = uVar38;
          auVar7[4] = uVar38;
          auVar7[5] = uVar38;
          auVar7[6] = uVar38;
          auVar7[7] = uVar38;
          auVar7[8] = uVar38;
          auVar7[9] = uVar38;
          auVar7[10] = uVar38;
          auVar7[0xb] = uVar38;
          auVar7[0xc] = uVar38;
          auVar7[0xd] = uVar38;
          auVar7[0xe] = uVar38;
          auVar7[0xf] = uVar38;
          auVar62 = NEON_ushl(auVar62,auVar7,1);
          (*pauVar34)[9] = auVar59[8] | auVar62[8];
          (*pauVar34)[10] = auVar59[9] | auVar62[9];
          (*pauVar34)[0xb] = auVar59[10] | auVar62[10];
          (*pauVar34)[0xc] = auVar59[0xb] | auVar62[0xb];
          (*pauVar34)[0xd] = auVar59[0xc] | auVar62[0xc];
          (*pauVar34)[0xe] = auVar59[0xd] | auVar62[0xd];
          (*pauVar34)[0xf] = auVar59[0xe] | auVar62[0xe];
          pauVar34[1][0] = auVar59[0xf] | auVar62[0xf];
          (*pauVar34)[1] = auVar59[0] | auVar62[0];
          (*pauVar34)[2] = auVar59[1] | auVar62[1];
          (*pauVar34)[3] = auVar59[2] | auVar62[2];
          (*pauVar34)[4] = auVar59[3] | auVar62[3];
          (*pauVar34)[5] = auVar59[4] | auVar62[4];
          (*pauVar34)[6] = auVar59[5] | auVar62[5];
          (*pauVar34)[7] = auVar59[6] | auVar62[6];
          (*pauVar34)[8] = auVar59[7] | auVar62[7];
          auVar11[1] = cVar43;
          auVar11[0] = cVar42;
          auVar11[2] = cVar44;
          auVar11[3] = cVar45;
          auVar11[4] = cVar46;
          auVar11[5] = cVar47;
          auVar11[6] = cVar48;
          auVar11[7] = cVar49;
          auVar11[8] = cVar50;
          auVar11[9] = cVar51;
          auVar11[10] = cVar52;
          auVar11[0xb] = cVar53;
          auVar11[0xc] = cVar54;
          auVar11[0xd] = cVar55;
          auVar11[0xe] = cVar56;
          auVar11[0xf] = cVar57;
          auVar62 = NEON_ushl(auVar8,auVar11,1);
          auVar8[1] = uVar38;
          auVar8[0] = uVar38;
          auVar8[2] = uVar38;
          auVar8[3] = uVar38;
          auVar8[4] = uVar38;
          auVar8[5] = uVar38;
          auVar8[6] = uVar38;
          auVar8[7] = uVar38;
          auVar8[8] = uVar38;
          auVar8[9] = uVar38;
          auVar8[10] = uVar38;
          auVar8[0xb] = uVar38;
          auVar8[0xc] = uVar38;
          auVar8[0xd] = uVar38;
          auVar8[0xe] = uVar38;
          auVar8[0xf] = uVar38;
          auVar59 = NEON_ushl(auVar9,auVar8,1);
          pauVar34[-1][9] = auVar62[8] | auVar59[8];
          pauVar34[-1][10] = auVar62[9] | auVar59[9];
          pauVar34[-1][0xb] = auVar62[10] | auVar59[10];
          pauVar34[-1][0xc] = auVar62[0xb] | auVar59[0xb];
          pauVar34[-1][0xd] = auVar62[0xc] | auVar59[0xc];
          pauVar34[-1][0xe] = auVar62[0xd] | auVar59[0xd];
          pauVar34[-1][0xf] = auVar62[0xe] | auVar59[0xe];
          (*pauVar34)[0] = auVar62[0xf] | auVar59[0xf];
          pauVar34[-1][1] = auVar62[0] | auVar59[0];
          pauVar34[-1][2] = auVar62[1] | auVar59[1];
          pauVar34[-1][3] = auVar62[2] | auVar59[2];
          pauVar34[-1][4] = auVar62[3] | auVar59[3];
          pauVar34[-1][5] = auVar62[4] | auVar59[4];
          pauVar34[-1][6] = auVar62[5] | auVar59[5];
          pauVar34[-1][7] = auVar62[6] | auVar59[6];
          pauVar34[-1][8] = auVar62[7] | auVar59[7];
          auVar12[1] = cVar43;
          auVar12[0] = cVar42;
          auVar12[2] = cVar44;
          auVar12[3] = cVar45;
          auVar12[4] = cVar46;
          auVar12[5] = cVar47;
          auVar12[6] = cVar48;
          auVar12[7] = cVar49;
          auVar12[8] = cVar50;
          auVar12[9] = cVar51;
          auVar12[10] = cVar52;
          auVar12[0xb] = cVar53;
          auVar12[0xc] = cVar54;
          auVar12[0xd] = cVar55;
          auVar12[0xe] = cVar56;
          auVar12[0xf] = cVar57;
          auVar62 = NEON_ushl(auVar13,auVar12,1);
          auVar9[1] = uVar38;
          auVar9[0] = uVar38;
          auVar9[2] = uVar38;
          auVar9[3] = uVar38;
          auVar9[4] = uVar38;
          auVar9[5] = uVar38;
          auVar9[6] = uVar38;
          auVar9[7] = uVar38;
          auVar9[8] = uVar38;
          auVar9[9] = uVar38;
          auVar9[10] = uVar38;
          auVar9[0xb] = uVar38;
          auVar9[0xc] = uVar38;
          auVar9[0xd] = uVar38;
          auVar9[0xe] = uVar38;
          auVar9[0xf] = uVar38;
          auVar59 = NEON_ushl(auVar14,auVar9,1);
          pauVar34[-2][9] = auVar62[8] | auVar59[8];
          pauVar34[-2][10] = auVar62[9] | auVar59[9];
          pauVar34[-2][0xb] = auVar62[10] | auVar59[10];
          pauVar34[-2][0xc] = auVar62[0xb] | auVar59[0xb];
          pauVar34[-2][0xd] = auVar62[0xc] | auVar59[0xc];
          pauVar34[-2][0xe] = auVar62[0xd] | auVar59[0xd];
          pauVar34[-2][0xf] = auVar62[0xe] | auVar59[0xe];
          pauVar34[-1][0] = auVar62[0xf] | auVar59[0xf];
          pauVar34[-2][1] = auVar62[0] | auVar59[0];
          pauVar34[-2][2] = auVar62[1] | auVar59[1];
          pauVar34[-2][3] = auVar62[2] | auVar59[2];
          pauVar34[-2][4] = auVar62[3] | auVar59[3];
          pauVar34[-2][5] = auVar62[4] | auVar59[4];
          pauVar34[-2][6] = auVar62[5] | auVar59[5];
          pauVar34[-2][7] = auVar62[6] | auVar59[6];
          pauVar34[-2][8] = auVar62[7] | auVar59[7];
          pauVar34 = pauVar34 + -4;
          puVar35 = puVar35 + -0x40;
        } while (puVar35 != (undefined1 *)0x0);
        if (puVar26 != puVar32) {
          if (((ulong)puVar26 & 0x38) == 0) {
            puVar21 = (undefined8 *)((long)puVar21 - (long)puVar32);
          }
          else {
LAB_00470d00:
            puVar35 = (undefined1 *)((ulong)puVar26 & 0xfffffffffffffff8);
            puVar21 = (undefined8 *)((long)puVar21 - (long)puVar35);
            lVar33 = (long)puVar32 - (long)puVar35;
            puVar36 = (undefined8 *)
                      ((long)puVar17 + ((long)((long)unaff_x22 + (long)unaff_x19) - (long)puVar32));
            do {
              uVar60 = NEON_ushl(*(undefined8 *)((long)puVar36 + -1),
                                 CONCAT17(-cVar23,CONCAT16(-cVar23,CONCAT15(-cVar23,CONCAT14(-cVar23
                                                  ,CONCAT13(-cVar23,CONCAT12(-cVar23,CONCAT11(-
                                                  cVar23,-cVar23))))))),1);
              uVar58 = NEON_ushl(*puVar36,CONCAT17(uVar38,CONCAT16(uVar38,CONCAT15(uVar38,CONCAT14(
                                                  uVar38,CONCAT13(uVar38,CONCAT12(uVar38,CONCAT11(
                                                  uVar38,uVar38))))))),1);
              *puVar36 = CONCAT17((byte)((ulong)uVar60 >> 0x38) | (byte)((ulong)uVar58 >> 0x38),
                                  CONCAT16((byte)((ulong)uVar60 >> 0x30) |
                                           (byte)((ulong)uVar58 >> 0x30),
                                           CONCAT15((byte)((ulong)uVar60 >> 0x28) |
                                                    (byte)((ulong)uVar58 >> 0x28),
                                                    CONCAT14((byte)((ulong)uVar60 >> 0x20) |
                                                             (byte)((ulong)uVar58 >> 0x20),
                                                             CONCAT13((byte)((ulong)uVar60 >> 0x18)
                                                                      | (byte)((ulong)uVar58 >> 0x18
                                                                              ),
                                                                      CONCAT12((byte)((ulong)uVar60
                                                                                     >> 0x10) |
                                                                               (byte)((ulong)uVar58
                                                                                     >> 0x10),
                                                                               CONCAT11((byte)((
                                                  ulong)uVar60 >> 8) | (byte)((ulong)uVar58 >> 8),
                                                  (byte)uVar60 | (byte)uVar58)))))));
              lVar33 = lVar33 + 8;
              puVar36 = puVar36 + -1;
            } while (lVar33 != 0);
            if (puVar26 == puVar35) goto LAB_00470d88;
          }
LAB_00470d54:
          pbVar19 = (undefined1 *)((long)puVar21 + (long)puVar17) + 7;
          do {
            puVar21 = (undefined8 *)((long)puVar21 - 1);
            *pbVar19 = pbVar19[-1] >> (ulong)uVar31 | *pbVar19 << (long)unaff_x21;
            pbVar19 = pbVar19 + -1;
          } while (unaff_x19 + 1 < puVar21);
        }
LAB_00470d88:
        *(char *)((long)puVar27 + (long)unaff_x19) =
             *(char *)((long)puVar27 + (long)unaff_x19) << (long)unaff_x21;
        puVar21 = puVar18;
LAB_00470d94:
        *puVar17 = (ulong)puVar21;
        return puVar17;
      }
      puVar39 = unaff_x21;
      if (puVar21 <= (undefined8 *)((long)&MACH_HEADER.magic + 2)) {
        *(byte *)((long)puVar27 + (long)puVar21) = bVar4;
        puVar18 = (undefined8 *)((long)puVar21 + 1);
        goto LAB_00470c3c;
      }
    }
    else {
      func_0x007a247c(&UNK_00894e68,0x1c,&UNK_009e0b90);
      puVar26 = extraout_x9;
LAB_00470dc4:
      func_0x007a2570(puVar26,3,&UNK_009e0b90);
      puVar21 = extraout_x8;
      puVar39 = unaff_x21;
      puVar36 = unaff_x22;
    }
LAB_00470dd8:
    auVar62 = func_0x007a2570(puVar21,3,&UNK_009e0b90);
    uVar28 = auVar62._8_8_;
    puVar17 = auVar62._0_8_;
    *(undefined1 **)((long)ppuVar16 + -0x50) = (undefined1 *)((long)ppuVar16 + -0x10);
    *(undefined **)((long)ppuVar16 + -0x48) =
         &__ZN4core3num6bignum5tests6Big8x38mul_pow517hbdc20233c11f8321E;
    if (2 < uVar28) {
      uVar22 = *puVar17;
      do {
        if (3 < uVar22) goto code_r0x00470f3c;
        if (uVar22 != 0) {
          uVar24 = (uint)(byte)puVar17[1] * 0x7d;
          uVar31 = uVar24 >> 8;
          *(char *)(puVar17 + 1) = (char)uVar24;
          if (uVar22 != 1) {
            uVar24 = uVar31 + (uint)*(byte *)((long)puVar17 + 9) * 0x7d;
            uVar31 = uVar24 >> 8;
            *(char *)((long)puVar17 + 9) = (char)uVar24;
            if (uVar22 != 2) {
              uVar24 = uVar31 + (uint)*(byte *)((long)puVar17 + 10) * 0x7d;
              uVar31 = uVar24 >> 8;
              *(char *)((long)puVar17 + 10) = (char)uVar24;
            }
          }
          if (uVar31 != 0) {
            if (uVar22 == 3) goto code_r0x00470f50;
            *(char *)((long)puVar17 + (uVar22 | 8)) = (char)uVar31;
            uVar22 = uVar22 + 1;
          }
        }
        *puVar17 = uVar22;
        uVar28 = uVar28 - 3;
      } while (2 < uVar28);
    }
    if (uVar28 == 0) {
      iVar25 = 1;
      uVar22 = *puVar17;
      if (3 < uVar22) goto code_r0x00470f3c;
code_r0x00470ec0:
      if (uVar22 == 0) {
code_r0x00470f20:
        *puVar17 = uVar22;
        return puVar17;
      }
      uVar24 = (uint)(byte)puVar17[1] * iVar25;
      uVar31 = uVar24 >> 8;
      *(char *)(puVar17 + 1) = (char)uVar24;
      if (uVar22 != 1) {
        uVar24 = uVar31 + (uint)*(byte *)((long)puVar17 + 9) * iVar25;
        uVar31 = uVar24 >> 8;
        *(char *)((long)puVar17 + 9) = (char)uVar24;
        if (uVar22 != 2) {
          uVar24 = uVar31 + (uint)*(byte *)((long)puVar17 + 10) * iVar25;
          uVar31 = uVar24 >> 8;
          *(char *)((long)puVar17 + 10) = (char)uVar24;
        }
      }
      if (uVar31 == 0) goto code_r0x00470f20;
      if (uVar22 != 3) {
        *(char *)((long)puVar17 + (uVar22 | 8)) = (char)uVar31;
        uVar22 = uVar22 + 1;
        goto code_r0x00470f20;
      }
    }
    else {
      uVar28 = (ulong)CONCAT14(-(uVar28 - 1 < _UNK_007fc2d8),
                               (uint)(byte)-(uVar28 - 1 < _UNK_007fc2d0)) & 0x400000004 ^
               0x500000005;
      iVar25 = (uint)(byte)uVar28 * (uint)(byte)(uVar28 >> 0x20);
      uVar22 = *puVar17;
      if (uVar22 < 4) goto code_r0x00470ec0;
code_r0x00470f3c:
      func_0x007a28b0(uVar22,3,&UNK_009e0b90);
    }
code_r0x00470f50:
    puVar20 = &UNK_009e0b90;
    auVar62 = func_0x007a2570(3,3);
    pbVar19 = auVar62._8_8_;
    puVar17 = auVar62._0_8_;
    *(undefined8 **)((long)ppuVar16 + -0x70) = unaff_x20;
    *(undefined1 **)((long)ppuVar16 + -0x68) = unaff_x19;
    *(undefined1 **)((long)ppuVar16 + -0x60) = (undefined1 *)((long)ppuVar16 + -0x50);
    *(undefined **)((long)ppuVar16 + -0x58) =
         &__ZN4core3num6bignum5tests6Big8x310mul_digits17h5c99aed2bc283509E;
    *(undefined1 *)((long)ppuVar16 + -0x72) = 0;
    *(undefined2 *)((long)ppuVar16 + -0x74) = 0;
    puVar41 = (undefined *)*puVar17;
    if (puVar41 < puVar20) {
      if (puVar41 < (undefined *)0x4) {
        puVar30 = (undefined *)0x0;
        puVar27 = puVar17 + 1;
        pbVar2 = (byte *)((long)puVar27 + (long)puVar41);
        puVar26 = (undefined1 *)((long)ppuVar16 + -0x74);
        puVar18 = (undefined8 *)0x0;
        do {
          lVar33 = 0;
          do {
            lVar37 = lVar33;
            if ((byte *)((long)puVar27 + lVar37) == pbVar2) goto code_r0x004711e0;
            bVar4 = *(byte *)((long)puVar27 + lVar37);
            param_5 = (ulong)bVar4;
            lVar33 = lVar37 + 1;
          } while (bVar4 == 0);
          param_4 = (undefined8 *)((long)puVar18 + lVar33);
          uVar28 = (long)param_4 - 1;
          if (2 < uVar28) goto code_r0x004712a0;
          uVar31 = (uint)(byte)(puVar26 + (long)puVar18)[lVar37] + (uint)*pbVar19 * (uint)bVar4;
          uVar24 = uVar31 >> 8 & 0xff;
          (puVar26 + (long)puVar18)[lVar37] = (char)uVar31;
          if (puVar20 != (undefined *)0x1) {
            if (param_4 == (undefined8 *)((long)&MACH_HEADER.magic + 3)) goto code_r0x00471234;
            bVar6 = (puVar26 + (long)puVar18)[lVar33];
            unaff_x19 = (undefined1 *)(ulong)bVar6;
            uVar31 = uVar24 + bVar6 + (uint)pbVar19[1] * (uint)bVar4;
            uVar24 = uVar31 >> 8 & 0xff;
            (puVar26 + (long)puVar18)[lVar33] = (char)uVar31;
            if (puVar20 != (undefined *)0x2) {
              if (uVar28 != 0) goto code_r0x00471280;
              uVar31 = uVar24 + (byte)(puVar26 + (long)puVar18)[lVar37 + 2] +
                       (uint)pbVar19[2] * (uint)bVar4;
              (puVar26 + (long)puVar18)[lVar37 + 2] = (char)uVar31;
              if (puVar20 != (undefined *)0x3) goto code_r0x0047129c;
              uVar24 = uVar31 >> 8 & 0xff;
            }
          }
          puVar41 = puVar20;
          if (uVar24 != 0) {
            if ((undefined *)0x2 < (undefined *)((long)puVar18 + (long)(puVar20 + -1 + lVar33)))
            goto code_r0x00471218;
            (puVar26 + (long)(puVar20 + -1) + (long)puVar18)[lVar33] = (char)uVar24;
            puVar41 = puVar20 + 1;
          }
          puVar27 = (ulong *)((long)puVar27 + lVar33);
          if (puVar30 <= (undefined *)((long)puVar18 + (long)(puVar41 + lVar37))) {
            puVar30 = (undefined *)((long)puVar18 + (long)(puVar41 + lVar37));
          }
          puVar18 = param_4;
        } while( true );
      }
    }
    else if (puVar41 < (undefined *)0x4) {
      pbVar2 = pbVar19 + (long)puVar20;
      if (puVar41 == (undefined *)0x0) {
        puVar41 = (undefined *)0x0;
        puVar30 = (undefined *)0x0;
        for (; pbVar19 != pbVar2; pbVar19 = pbVar19 + 1) {
          puVar20 = puVar30;
          if (puVar30 <= puVar41) {
            puVar20 = puVar41;
          }
          if (*pbVar19 == 0) {
            puVar20 = puVar30;
          }
          puVar41 = puVar41 + 1;
          puVar30 = puVar20;
        }
code_r0x004711e0:
        *(undefined2 *)(puVar17 + 1) = *(undefined2 *)((long)ppuVar16 + -0x74);
        *(undefined1 *)((long)puVar17 + 10) = *(undefined1 *)((long)ppuVar16 + -0x72);
        *puVar17 = (ulong)puVar30;
        return puVar17;
      }
      puVar30 = (undefined *)0x0;
      uVar28 = puVar17[1];
      bVar4 = *(byte *)((long)puVar17 + 9);
      bVar6 = *(byte *)((long)puVar17 + 10);
      param_4 = (undefined8 *)((long)ppuVar16 + (long)(puVar41 + -0x75));
      lVar33 = 0;
      do {
        param_5 = 0;
        do {
          if (pbVar19 + param_5 == pbVar2) goto code_r0x004711e0;
          bVar5 = pbVar19[param_5];
          param_5 = param_5 + 1;
        } while (bVar5 == 0);
        lVar37 = lVar33 + param_5;
        uVar22 = lVar37 - 1;
        if (2 < uVar22) goto code_r0x004712bc;
        unaff_x19 = (undefined1 *)((long)ppuVar16 + param_5 + lVar33 + -0x74);
        uVar31 = (uint)(byte)unaff_x19[-1] + (uint)(byte)uVar28 * (uint)bVar5;
        unaff_x20 = (undefined8 *)(ulong)uVar31;
        uVar24 = uVar31 >> 8 & 0xff;
        unaff_x19[-1] = (char)uVar31;
        if (puVar41 != (undefined *)0x1) {
          unaff_x19 = (undefined1 *)0x0;
          if (lVar37 == 3) goto code_r0x00471268;
          unaff_x19 = (undefined1 *)((long)ppuVar16 + lVar33 + -0x74);
          uVar31 = uVar24 + (byte)unaff_x19[param_5] + (uint)bVar4 * (uint)bVar5;
          unaff_x20 = (undefined8 *)(ulong)uVar31;
          uVar24 = uVar31 >> 8 & 0xff;
          unaff_x19[param_5] = (char)uVar31;
          if (puVar41 != (undefined *)0x2) {
            if (uVar22 != 0) goto code_r0x004712b4;
            lVar15 = param_5 + lVar33 + -0x74;
            unaff_x19 = (undefined1 *)(ulong)*(byte *)((long)ppuVar16 + lVar15 + 1);
            uVar31 = uVar24 + *(byte *)((long)ppuVar16 + lVar15 + 1) + (uint)bVar6 * (uint)bVar5;
            uVar24 = uVar31 >> 8 & 0xff;
            *(char *)((long)ppuVar16 + lVar15 + 1) = (char)uVar31;
          }
        }
        puVar20 = puVar41;
        if (uVar24 != 0) {
          if ((undefined *)0x2 < puVar41 + param_5 + lVar33 + -1) goto code_r0x0047124c;
          *(char *)((long)param_4 + param_5 + lVar33) = (char)uVar24;
          puVar20 = puVar41 + 1;
        }
        pbVar19 = pbVar19 + param_5;
        if (puVar30 <= puVar20 + param_5 + lVar33 + -1) {
          puVar30 = puVar20 + param_5 + lVar33 + -1;
        }
        lVar33 = lVar37;
      } while( true );
    }
    puVar20 = &UNK_009e0b90;
    func_0x007a28b0(puVar41,3,&UNK_009e0b90);
    puVar18 = extraout_x11;
    lVar33 = extraout_x17;
code_r0x00471218:
    func_0x007a2570((undefined *)((long)puVar18 + (long)(puVar20 + lVar33 + -1)),3,&UNK_009e0b90);
    puVar18 = extraout_x11_00;
    lVar33 = extraout_x17_00;
code_r0x00471234:
    func_0x007a2570((long)puVar18 + lVar33,3,&UNK_009e0b90);
    puVar41 = extraout_x8_00;
    lVar33 = extraout_x13;
code_r0x0047124c:
    func_0x007a2570(puVar41 + param_5 + lVar33 + -1,3,&UNK_009e0b90);
    lVar33 = extraout_x13_00;
code_r0x00471268:
    func_0x007a2570(lVar33 + param_5,3,&UNK_009e0b90);
    puVar18 = extraout_x11_01;
    lVar33 = extraout_x17_01;
code_r0x00471280:
    func_0x007a2570((long)puVar18 + lVar33 + 1,3,&UNK_009e0b90);
code_r0x0047129c:
    uVar28 = 3;
code_r0x004712a0:
    func_0x007a2570(uVar28,3,&UNK_009e0b90);
    lVar33 = extraout_x13_01;
code_r0x004712b4:
    uVar22 = lVar33 + param_5 + 1;
code_r0x004712bc:
    auVar62 = func_0x007a2570(uVar22,3,&UNK_009e0b90);
    uVar28 = auVar62._8_8_;
    puVar17 = auVar62._0_8_;
    *(undefined1 **)((long)ppuVar16 + -0x90) = (undefined1 *)((long)ppuVar16 + -0x60);
    *(undefined **)((long)ppuVar16 + -0x88) =
         &__ZN4core3num6bignum5tests6Big8x313div_rem_small17h1446c80890e35151E;
    if ((uVar28 & 0xff) == 0) {
      func_0x007a247c(&UNK_00894dc0,0x1b,&UNK_009e0b90);
      uVar22 = extraout_x8_01;
    }
    else {
      uVar22 = *puVar17;
      if (uVar22 < 4) {
        if (uVar22 != 0) {
          lVar33 = uVar22 + 7;
          bVar4 = *(byte *)((long)puVar17 + lVar33);
          uVar31 = auVar62._8_4_ & 0xff;
          uVar24 = 0;
          if ((uVar28 & 0xff) != 0) {
            uVar24 = bVar4 / uVar31;
          }
          *(char *)((long)puVar17 + lVar33) = (char)uVar24;
          if (lVar33 != 8) {
            lVar33 = uVar22 + 6;
            bVar6 = *(byte *)((long)puVar17 + lVar33);
            uVar24 = ((uint)bVar4 - uVar24 * auVar62._8_4_) * 0x100;
            uVar1 = 0;
            if ((uVar28 & 0xff) != 0) {
              uVar1 = ((uint)bVar6 | uVar24 & 0xffff) / uVar31;
            }
            *(char *)((long)puVar17 + lVar33) = (char)uVar1;
            if (lVar33 != 8) {
              uVar38 = 0;
              if ((uVar28 & 0xff) != 0) {
                uVar38 = (undefined1)
                         (((uint)*(byte *)((long)puVar17 + uVar22 + 5) |
                          ((bVar6 | uVar24) - uVar1 * uVar31) * 0x100 & 0xffff) / uVar31);
              }
              *(undefined1 *)((long)puVar17 + uVar22 + 5) = uVar38;
            }
          }
        }
        return puVar17;
      }
    }
    unaff_x21 = (undefined8 *)&UNK_009e0b90;
    auVar62 = func_0x007a28b0(uVar22,3);
    unaff_x22 = auVar62._8_8_;
    puVar17 = auVar62._0_8_;
    *(long *)((long)ppuVar16 + -0xf0) = unaff_x28;
    *(long *)((long)ppuVar16 + -0xe8) = unaff_x27;
    *(undefined8 *)((long)ppuVar16 + -0xe0) = unaff_x26;
    *(undefined8 *)((long)ppuVar16 + -0xd8) = unaff_x25;
    *(ulong **)((long)ppuVar16 + -0xd0) = unaff_x24;
    *(ulong **)((long)ppuVar16 + -200) = unaff_x23;
    *(undefined8 **)((long)ppuVar16 + -0xc0) = puVar36;
    *(undefined8 **)((long)ppuVar16 + -0xb8) = puVar39;
    *(undefined8 **)((long)ppuVar16 + -0xb0) = unaff_x20;
    *(undefined1 **)((long)ppuVar16 + -0xa8) = unaff_x19;
    *(undefined1 **)((long)ppuVar16 + -0xa0) = (undefined1 *)((long)ppuVar16 + -0x90);
    *(undefined **)((long)ppuVar16 + -0x98) =
         &__ZN4core3num6bignum5tests6Big8x37div_rem17h75c20e67994627eaE;
    ppuVar40 = (undefined1 **)((long)ppuVar16 + -0xa0);
    unaff_x19 = (undefined1 *)*unaff_x22;
    if ((undefined1 *)((long)&MACH_HEADER.magic + 3) < unaff_x19) {
code_r0x00471620:
      func_0x007a28b0(unaff_x19,3,&UNK_009e0b90);
code_r0x00471634:
      uVar58 = func_0x007a20e8(&UNK_009e0b90);
      func_0x007a2570(uVar58,3,&UNK_009e0b90);
code_r0x00471650:
      auVar62 = func_0x007a247c(&UNK_00894ddb,0x1e,&UNK_009e0b90);
      *(undefined1 ***)((long)ppuVar16 + -0x100) = ppuVar40;
      *(undefined **)((long)ppuVar16 + -0xf8) =
           &
           __ZN73__LT_core__num__bignum__tests__Big8x3_u20_as_u20_core__cmp__PartialEq_GT_2eq17h0e966c840ee3a244E
      ;
      return (ulong *)(ulong)(*(short *)(auVar62._0_8_ + 8) == *(short *)(auVar62._8_8_ + 8) &&
                             *(char *)(auVar62._0_8_ + 10) == *(char *)(auVar62._8_8_ + 10));
    }
    if ((unaff_x19 == (undefined1 *)0x0) ||
       ((*(char *)(unaff_x22 + 1) == '\0' &&
        ((unaff_x19 == (undefined1 *)((long)&MACH_HEADER.magic + 1) ||
         ((*(char *)((long)unaff_x22 + 9) == '\0' &&
          ((unaff_x19 == (undefined1 *)((long)&MACH_HEADER.magic + 2) ||
           ((*(char *)((long)unaff_x22 + 10) == '\0' &&
            (unaff_x19 == (undefined1 *)((long)&MACH_HEADER.magic + 3)))))))))))))
    goto code_r0x00471650;
    unaff_x23 = unaff_x21 + 1;
    *(undefined2 *)unaff_x23 = 0;
    *(undefined1 *)((long)unaff_x21 + 10) = 0;
    *(undefined2 *)(param_4 + 1) = 0;
    *(undefined1 *)((long)param_4 + 10) = 0;
    *param_4 = unaff_x19;
    *unaff_x21 = 1;
    uVar22 = *puVar17;
    uVar28 = uVar22 - 3;
    if (2 < uVar22 && uVar28 != 0) {
      func_0x007a28b0(uVar22,3,&UNK_009e0b90);
      func_0x007a247c(&UNK_00894d89,0x1a,&UNK_009e0b90);
      goto code_r0x00471620;
    }
    if (uVar22 == 0) {
      return puVar17;
    }
    if (*(char *)((long)puVar17 + uVar22 + 7) == '\0') {
      if (uVar22 + 7 == 8) {
        return puVar17;
      }
      if (*(char *)((long)puVar17 + uVar22 + 6) == '\0') {
        if (uVar22 + 6 == 8) {
          return puVar17;
        }
        if (*(char *)((long)puVar17 + uVar22 + 5) == '\0') {
          if (uVar22 + 5 == 8) {
            return puVar17;
          }
          uVar28 = uVar22 | 0xfffffffffffffffc;
        }
      }
      else {
        uVar28 = uVar22 - 2;
      }
    }
    else {
      uVar28 = uVar22 - 1;
    }
    unaff_x24 = puVar17 + 1;
    if (*(byte *)((long)unaff_x24 + uVar28) == 0) goto code_r0x00471634;
    unaff_x27 = (ulong)((uint)LZCOUNT((uint)*(byte *)((long)unaff_x24 + uVar28) << 0x18) ^ 7) +
                uVar28 * 8;
    unaff_x28 = unaff_x27 + 1;
    if (unaff_x28 == 0) {
      return puVar17;
    }
    unaff_x25 = 1;
    unaff_x26 = 1;
    auVar62._8_8_ = (undefined1 *)((long)&MACH_HEADER.magic + 1);
    auVar62._0_8_ = param_4;
    puVar41 = &UNK_00471490;
    ppuVar16 = (undefined1 **)((long)ppuVar16 + -0xf0);
    unaff_x20 = param_4;
  } while( true );
}

