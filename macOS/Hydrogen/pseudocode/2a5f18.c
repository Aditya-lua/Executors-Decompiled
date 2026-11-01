
/* WARNING: Removing unreachable block (ram,0x002a6b74) */

ulong FUN_002a5f18(undefined8 param_1,undefined8 param_2,char *param_3,char *param_4,char *param_5)

{
  uint uVar1;
  undefined1 auVar2 [16];
  int iVar3;
  long lVar4;
  ulong uVar5;
  long lVar6;
  ulong uVar7;
  long lVar8;
  undefined8 uVar9;
  undefined8 uVar10;
  ulong uVar11;
  char *pcVar12;
  ulong uVar13;
  ulong uVar14;
  ulong *puVar15;
  ulong uVar16;
  ulong uVar17;
  undefined1 *puVar18;
  undefined8 *puVar19;
  ulong uVar20;
  ulong *puVar21;
  qword *pqVar22;
  char *pcVar23;
  long unaff_x19;
  undefined4 *unaff_x20;
  undefined8 *unaff_x22;
  ulong unaff_x23;
  undefined8 *unaff_x24;
  ulong *unaff_x25;
  uint unaff_w26;
  char *pcVar24;
  ulong uVar25;
  ulong *unaff_x27;
  undefined8 *puVar26;
  uint unaff_w28;
  long unaff_x29;
  byte bVar27;
  byte bVar28;
  byte bVar29;
  byte bVar30;
  byte bVar31;
  byte bVar32;
  byte bVar33;
  byte bVar34;
  byte bVar35;
  byte bVar36;
  byte bVar37;
  byte bVar38;
  byte bVar39;
  byte bVar40;
  byte bVar41;
  byte bVar42;
  byte bVar43;
  byte bVar44;
  byte bVar45;
  byte bVar46;
  byte bVar47;
  byte bVar48;
  byte bVar49;
  byte bVar50;
  byte bVar51;
  byte bVar52;
  byte bVar53;
  byte bVar54;
  byte bVar55;
  byte bVar56;
  byte bVar57;
  byte bVar58;
  byte bVar59;
  byte bVar60;
  byte bVar61;
  byte bVar62;
  byte bVar63;
  byte bVar64;
  byte bVar65;
  byte bVar66;
  byte bVar67;
  byte bVar68;
  byte bVar69;
  byte bVar70;
  byte bVar71;
  byte bVar72;
  byte bVar73;
  byte bVar74;
  byte bVar75;
  byte bVar77;
  byte bVar78;
  byte bVar79;
  byte bVar80;
  byte bVar81;
  byte bVar82;
  undefined8 uVar76;
  byte bVar83;
  byte bVar84;
  byte bVar87;
  byte bVar88;
  byte bVar89;
  byte bVar90;
  byte bVar91;
  byte bVar92;
  qword qVar85;
  undefined8 uVar86;
  byte bVar93;
  undefined8 uVar94;
  qword qVar95;
  undefined8 uVar96;
  undefined8 uVar97;
  undefined8 uVar98;
  undefined8 uVar99;
  undefined8 uVar100;
  undefined8 uVar101;
  undefined8 uVar102;
  undefined8 uVar103;
  undefined8 uVar104;
  undefined8 uVar105;
  undefined8 uVar106;
  undefined1 auVar107 [16];
  ulong uStack0000000000000030;
  ulong *in_stack_00000060;
  ulong *in_stack_00000068;
  ulong *in_stack_00000070;
  undefined8 uStack_58;
  undefined8 uStack_50;
  undefined8 uStack_48;
  
  lVar4 = func_0x0029bd80();
  uVar5 = 0;
  if ((((lVar4 == 0) ||
       (uVar5 = func_0x0029c0b0(*(undefined8 *)(unaff_x29 + -0x58)), (int)uVar5 == 0)) ||
      (uVar5 = func_0x0029c0b0(*(undefined8 *)(unaff_x29 + -0x60)), (int)uVar5 == 0)) ||
     (((uVar5 = func_0x0029c3cc(), (int)uVar5 == 0 || (uVar5 = func_0x0029c3cc(), (int)uVar5 == 0))
      || ((uVar5 = func_0x0029c3cc(*(undefined8 *)(unaff_x29 + -0x58)), (int)uVar5 == 0 ||
          (uVar5 = func_0x0029c3cc(in_stack_00000070), (int)uVar5 == 0)))))) {
LAB_002a6abc:
    if (*(char *)(unaff_x19 + 0x28) != '\0') {
      return uVar5;
    }
    if (*(long *)(unaff_x19 + 0x10) != 0) {
      lVar4 = *(long *)(unaff_x19 + 0x10) + -1;
      *(long *)(unaff_x19 + 0x10) = lVar4;
      *(undefined8 *)(unaff_x19 + 0x20) = *(undefined8 *)(*(long *)(unaff_x19 + 8) + lVar4 * 8);
      return uVar5;
    }
    func_0x0079db4c(uVar5);
code_r0x002a6ae8:
    func_0x0079dea4();
  }
  else {
    pcVar24 = (char *)(long)(int)unaff_w26;
    uVar5 = func_0x0029c3cc(*(undefined8 *)(unaff_x29 + -0x68),pcVar24);
    if ((((int)uVar5 == 0) ||
        (uVar5 = func_0x0029c3cc(*(undefined8 *)(unaff_x29 + -0x60),pcVar24), (int)uVar5 == 0)) ||
       ((uVar5 = func_0x0029c3cc(in_stack_00000068), (int)uVar5 == 0 ||
        (uVar5 = func_0x0029c3cc(in_stack_00000060), (int)uVar5 == 0)))) goto LAB_002a6abc;
    uVar5 = (long)(pcVar24 + unaff_x23) * 0x40;
    if (uVar5 < (ulong)((long)pcVar24 << 6)) {
      param_3 = (char *)((long)&segment_command_00000020.flags + 2);
      param_5 = "\b\x04";
LAB_002a6ab4:
      param_4 = "/aws-lc/crypto/fipsmodule/bn/gcd_extra.c";
      func_0x0028f83c(3,0,param_3,"/aws-lc/crypto/fipsmodule/bn/gcd_extra.c",param_5);
      uVar5 = 0;
      goto LAB_002a6abc;
    }
    if (pcVar24 + unaff_x23 != (char *)0x0) {
      if (uVar5 < 2) {
        uVar5 = 1;
      }
      lVar4 = unaff_x23 * 8;
      uStack0000000000000030 = 0;
      uVar13 = unaff_x23 & 0xfffffffffffffff8;
      pcVar12 = (char *)((ulong)pcVar24 & 0xfffffffffffffff8);
      do {
        uVar25 = -(*(ulong *)*unaff_x25 & 1) & -(*(ulong *)*unaff_x27 & 1);
        lVar6 = func_0x00382cc0(*in_stack_00000068);
        uVar11 = *unaff_x27;
        uVar14 = lVar6 - 1U & uVar25;
        uVar7 = *in_stack_00000068;
        bVar27 = (byte)uVar14;
        bVar28 = (byte)(uVar14 >> 8);
        bVar29 = (byte)(uVar14 >> 0x10);
        bVar30 = (byte)(uVar14 >> 0x18);
        bVar31 = (byte)(uVar14 >> 0x20);
        bVar32 = (byte)(uVar14 >> 0x28);
        bVar33 = (byte)(uVar14 >> 0x30);
        bVar34 = (byte)(uVar14 >> 0x38);
        if (unaff_w28 != 0) {
          uVar16 = ~uVar14;
          if ((unaff_w28 < 8) || (uVar11 < uVar7 + lVar4 && uVar7 < uVar11 + lVar4)) {
            uVar17 = 0;
          }
          else {
            puVar26 = (undefined8 *)(uVar11 + 0x20);
            puVar19 = (undefined8 *)(uVar7 + 0x20);
            uVar17 = uVar13;
            do {
              uVar10 = puVar19[-3];
              uVar9 = puVar19[-4];
              uVar86 = puVar19[-1];
              uVar76 = puVar19[-2];
              uVar96 = puVar19[1];
              uVar94 = *puVar19;
              uVar98 = puVar19[3];
              uVar97 = puVar19[2];
              uVar100 = puVar26[-3];
              uVar99 = puVar26[-4];
              uVar102 = puVar26[-1];
              uVar101 = puVar26[-2];
              uVar104 = puVar26[1];
              uVar103 = *puVar26;
              uVar106 = puVar26[3];
              uVar105 = puVar26[2];
              bVar35 = (byte)uVar16;
              bVar36 = (byte)(uVar16 >> 8);
              bVar37 = (byte)(uVar16 >> 0x10);
              bVar38 = (byte)(uVar16 >> 0x18);
              bVar39 = (byte)(uVar16 >> 0x20);
              bVar40 = (byte)(uVar16 >> 0x28);
              bVar41 = (byte)(uVar16 >> 0x30);
              bVar42 = (byte)(uVar16 >> 0x38);
              puVar26[-3] = CONCAT17((byte)((ulong)uVar100 >> 0x38) & bVar42 |
                                     (byte)((ulong)uVar10 >> 0x38) & bVar34,
                                     CONCAT16((byte)((ulong)uVar100 >> 0x30) & bVar41 |
                                              (byte)((ulong)uVar10 >> 0x30) & bVar33,
                                              CONCAT15((byte)((ulong)uVar100 >> 0x28) & bVar40 |
                                                       (byte)((ulong)uVar10 >> 0x28) & bVar32,
                                                       CONCAT14((byte)((ulong)uVar100 >> 0x20) &
                                                                bVar39 | (byte)((ulong)uVar10 >>
                                                                               0x20) & bVar31,
                                                                CONCAT13((byte)((ulong)uVar100 >>
                                                                               0x18) & bVar38 |
                                                                         (byte)((ulong)uVar10 >>
                                                                               0x18) & bVar30,
                                                                         CONCAT12((byte)((ulong)
                                                  uVar100 >> 0x10) & bVar37 |
                                                  (byte)((ulong)uVar10 >> 0x10) & bVar29,
                                                  CONCAT11((byte)((ulong)uVar100 >> 8) & bVar36 |
                                                           (byte)((ulong)uVar10 >> 8) & bVar28,
                                                           (byte)uVar100 & bVar35 |
                                                           (byte)uVar10 & bVar27)))))));
              puVar26[-4] = CONCAT17((byte)((ulong)uVar99 >> 0x38) & bVar42 |
                                     (byte)((ulong)uVar9 >> 0x38) & bVar34,
                                     CONCAT16((byte)((ulong)uVar99 >> 0x30) & bVar41 |
                                              (byte)((ulong)uVar9 >> 0x30) & bVar33,
                                              CONCAT15((byte)((ulong)uVar99 >> 0x28) & bVar40 |
                                                       (byte)((ulong)uVar9 >> 0x28) & bVar32,
                                                       CONCAT14((byte)((ulong)uVar99 >> 0x20) &
                                                                bVar39 | (byte)((ulong)uVar9 >> 0x20
                                                                               ) & bVar31,
                                                                CONCAT13((byte)((ulong)uVar99 >>
                                                                               0x18) & bVar38 |
                                                                         (byte)((ulong)uVar9 >> 0x18
                                                                               ) & bVar30,
                                                                         CONCAT12((byte)((ulong)
                                                  uVar99 >> 0x10) & bVar37 |
                                                  (byte)((ulong)uVar9 >> 0x10) & bVar29,
                                                  CONCAT11((byte)((ulong)uVar99 >> 8) & bVar36 |
                                                           (byte)((ulong)uVar9 >> 8) & bVar28,
                                                           (byte)uVar99 & bVar35 |
                                                           (byte)uVar9 & bVar27)))))));
              puVar26[-1] = CONCAT17((byte)((ulong)uVar102 >> 0x38) & bVar42 |
                                     (byte)((ulong)uVar86 >> 0x38) & bVar34,
                                     CONCAT16((byte)((ulong)uVar102 >> 0x30) & bVar41 |
                                              (byte)((ulong)uVar86 >> 0x30) & bVar33,
                                              CONCAT15((byte)((ulong)uVar102 >> 0x28) & bVar40 |
                                                       (byte)((ulong)uVar86 >> 0x28) & bVar32,
                                                       CONCAT14((byte)((ulong)uVar102 >> 0x20) &
                                                                bVar39 | (byte)((ulong)uVar86 >>
                                                                               0x20) & bVar31,
                                                                CONCAT13((byte)((ulong)uVar102 >>
                                                                               0x18) & bVar38 |
                                                                         (byte)((ulong)uVar86 >>
                                                                               0x18) & bVar30,
                                                                         CONCAT12((byte)((ulong)
                                                  uVar102 >> 0x10) & bVar37 |
                                                  (byte)((ulong)uVar86 >> 0x10) & bVar29,
                                                  CONCAT11((byte)((ulong)uVar102 >> 8) & bVar36 |
                                                           (byte)((ulong)uVar86 >> 8) & bVar28,
                                                           (byte)uVar102 & bVar35 |
                                                           (byte)uVar86 & bVar27)))))));
              puVar26[-2] = CONCAT17((byte)((ulong)uVar101 >> 0x38) & bVar42 |
                                     (byte)((ulong)uVar76 >> 0x38) & bVar34,
                                     CONCAT16((byte)((ulong)uVar101 >> 0x30) & bVar41 |
                                              (byte)((ulong)uVar76 >> 0x30) & bVar33,
                                              CONCAT15((byte)((ulong)uVar101 >> 0x28) & bVar40 |
                                                       (byte)((ulong)uVar76 >> 0x28) & bVar32,
                                                       CONCAT14((byte)((ulong)uVar101 >> 0x20) &
                                                                bVar39 | (byte)((ulong)uVar76 >>
                                                                               0x20) & bVar31,
                                                                CONCAT13((byte)((ulong)uVar101 >>
                                                                               0x18) & bVar38 |
                                                                         (byte)((ulong)uVar76 >>
                                                                               0x18) & bVar30,
                                                                         CONCAT12((byte)((ulong)
                                                  uVar101 >> 0x10) & bVar37 |
                                                  (byte)((ulong)uVar76 >> 0x10) & bVar29,
                                                  CONCAT11((byte)((ulong)uVar101 >> 8) & bVar36 |
                                                           (byte)((ulong)uVar76 >> 8) & bVar28,
                                                           (byte)uVar101 & bVar35 |
                                                           (byte)uVar76 & bVar27)))))));
              puVar26[1] = CONCAT17((byte)((ulong)uVar104 >> 0x38) & bVar42 |
                                    (byte)((ulong)uVar96 >> 0x38) & bVar34,
                                    CONCAT16((byte)((ulong)uVar104 >> 0x30) & bVar41 |
                                             (byte)((ulong)uVar96 >> 0x30) & bVar33,
                                             CONCAT15((byte)((ulong)uVar104 >> 0x28) & bVar40 |
                                                      (byte)((ulong)uVar96 >> 0x28) & bVar32,
                                                      CONCAT14((byte)((ulong)uVar104 >> 0x20) &
                                                               bVar39 | (byte)((ulong)uVar96 >> 0x20
                                                                              ) & bVar31,
                                                               CONCAT13((byte)((ulong)uVar104 >>
                                                                              0x18) & bVar38 |
                                                                        (byte)((ulong)uVar96 >> 0x18
                                                                              ) & bVar30,
                                                                        CONCAT12((byte)((ulong)
                                                  uVar104 >> 0x10) & bVar37 |
                                                  (byte)((ulong)uVar96 >> 0x10) & bVar29,
                                                  CONCAT11((byte)((ulong)uVar104 >> 8) & bVar36 |
                                                           (byte)((ulong)uVar96 >> 8) & bVar28,
                                                           (byte)uVar104 & bVar35 |
                                                           (byte)uVar96 & bVar27)))))));
              *puVar26 = CONCAT17((byte)((ulong)uVar103 >> 0x38) & bVar42 |
                                  (byte)((ulong)uVar94 >> 0x38) & bVar34,
                                  CONCAT16((byte)((ulong)uVar103 >> 0x30) & bVar41 |
                                           (byte)((ulong)uVar94 >> 0x30) & bVar33,
                                           CONCAT15((byte)((ulong)uVar103 >> 0x28) & bVar40 |
                                                    (byte)((ulong)uVar94 >> 0x28) & bVar32,
                                                    CONCAT14((byte)((ulong)uVar103 >> 0x20) & bVar39
                                                             | (byte)((ulong)uVar94 >> 0x20) &
                                                               bVar31,CONCAT13((byte)((ulong)uVar103
                                                                                     >> 0x18) &
                                                                               bVar38 | (byte)((
                                                  ulong)uVar94 >> 0x18) & bVar30,
                                                  CONCAT12((byte)((ulong)uVar103 >> 0x10) & bVar37 |
                                                           (byte)((ulong)uVar94 >> 0x10) & bVar29,
                                                           CONCAT11((byte)((ulong)uVar103 >> 8) &
                                                                    bVar36 | (byte)((ulong)uVar94 >>
                                                                                   8) & bVar28,
                                                                    (byte)uVar103 & bVar35 |
                                                                    (byte)uVar94 & bVar27)))))));
              puVar26[3] = CONCAT17((byte)((ulong)uVar106 >> 0x38) & bVar42 |
                                    (byte)((ulong)uVar98 >> 0x38) & bVar34,
                                    CONCAT16((byte)((ulong)uVar106 >> 0x30) & bVar41 |
                                             (byte)((ulong)uVar98 >> 0x30) & bVar33,
                                             CONCAT15((byte)((ulong)uVar106 >> 0x28) & bVar40 |
                                                      (byte)((ulong)uVar98 >> 0x28) & bVar32,
                                                      CONCAT14((byte)((ulong)uVar106 >> 0x20) &
                                                               bVar39 | (byte)((ulong)uVar98 >> 0x20
                                                                              ) & bVar31,
                                                               CONCAT13((byte)((ulong)uVar106 >>
                                                                              0x18) & bVar38 |
                                                                        (byte)((ulong)uVar98 >> 0x18
                                                                              ) & bVar30,
                                                                        CONCAT12((byte)((ulong)
                                                  uVar106 >> 0x10) & bVar37 |
                                                  (byte)((ulong)uVar98 >> 0x10) & bVar29,
                                                  CONCAT11((byte)((ulong)uVar106 >> 8) & bVar36 |
                                                           (byte)((ulong)uVar98 >> 8) & bVar28,
                                                           (byte)uVar106 & bVar35 |
                                                           (byte)uVar98 & bVar27)))))));
              puVar26[2] = CONCAT17((byte)((ulong)uVar105 >> 0x38) & bVar42 |
                                    (byte)((ulong)uVar97 >> 0x38) & bVar34,
                                    CONCAT16((byte)((ulong)uVar105 >> 0x30) & bVar41 |
                                             (byte)((ulong)uVar97 >> 0x30) & bVar33,
                                             CONCAT15((byte)((ulong)uVar105 >> 0x28) & bVar40 |
                                                      (byte)((ulong)uVar97 >> 0x28) & bVar32,
                                                      CONCAT14((byte)((ulong)uVar105 >> 0x20) &
                                                               bVar39 | (byte)((ulong)uVar97 >> 0x20
                                                                              ) & bVar31,
                                                               CONCAT13((byte)((ulong)uVar105 >>
                                                                              0x18) & bVar38 |
                                                                        (byte)((ulong)uVar97 >> 0x18
                                                                              ) & bVar30,
                                                                        CONCAT12((byte)((ulong)
                                                  uVar105 >> 0x10) & bVar37 |
                                                  (byte)((ulong)uVar97 >> 0x10) & bVar29,
                                                  CONCAT11((byte)((ulong)uVar105 >> 8) & bVar36 |
                                                           (byte)((ulong)uVar97 >> 8) & bVar28,
                                                           (byte)uVar105 & bVar35 |
                                                           (byte)uVar97 & bVar27)))))));
              uVar17 = uVar17 - 8;
              puVar26 = puVar26 + 8;
              puVar19 = puVar19 + 8;
            } while (uVar17 != 0);
            uVar17 = uVar13;
            if (uVar13 == unaff_x23) goto LAB_002a6148;
          }
          lVar8 = unaff_x23 - uVar17;
          puVar15 = (ulong *)(uVar11 + uVar17 * 8);
          puVar21 = (ulong *)(uVar7 + uVar17 * 8);
          do {
            *puVar15 = *puVar15 & uVar16 | *puVar21 & uVar14;
            lVar8 = lVar8 + -1;
            puVar15 = puVar15 + 1;
            puVar21 = puVar21 + 1;
          } while (lVar8 != 0);
        }
LAB_002a6148:
        func_0x00382cc0(uVar7,*unaff_x25);
        uVar25 = uVar25 & -lVar6;
        uVar7 = *in_stack_00000068;
        bVar35 = (byte)uVar25;
        bVar36 = (byte)(uVar25 >> 8);
        bVar37 = (byte)(uVar25 >> 0x10);
        bVar38 = (byte)(uVar25 >> 0x18);
        bVar39 = (byte)(uVar25 >> 0x20);
        bVar40 = (byte)(uVar25 >> 0x28);
        bVar41 = (byte)(uVar25 >> 0x30);
        bVar42 = (byte)(uVar25 >> 0x38);
        if ((int)unaff_x23 != 0) {
          uVar16 = *unaff_x25;
          uVar11 = ~uVar25;
          if ((unaff_w28 < 8) || ((uVar16 < uVar7 + lVar4 && (uVar7 < uVar16 + lVar4)))) {
            uVar17 = 0;
          }
          else {
            puVar26 = (undefined8 *)(uVar16 + 0x20);
            puVar19 = (undefined8 *)(uVar7 + 0x20);
            uVar17 = uVar13;
            do {
              uVar10 = puVar19[-3];
              uVar9 = puVar19[-4];
              uVar86 = puVar19[-1];
              uVar76 = puVar19[-2];
              uVar96 = puVar19[1];
              uVar94 = *puVar19;
              uVar98 = puVar19[3];
              uVar97 = puVar19[2];
              uVar100 = puVar26[-3];
              uVar99 = puVar26[-4];
              uVar102 = puVar26[-1];
              uVar101 = puVar26[-2];
              uVar104 = puVar26[1];
              uVar103 = *puVar26;
              uVar106 = puVar26[3];
              uVar105 = puVar26[2];
              bVar43 = (byte)uVar11;
              bVar44 = (byte)(uVar11 >> 8);
              bVar45 = (byte)(uVar11 >> 0x10);
              bVar46 = (byte)(uVar11 >> 0x18);
              bVar47 = (byte)(uVar11 >> 0x20);
              bVar48 = (byte)(uVar11 >> 0x28);
              bVar49 = (byte)(uVar11 >> 0x30);
              bVar50 = (byte)(uVar11 >> 0x38);
              puVar26[-3] = CONCAT17((byte)((ulong)uVar100 >> 0x38) & bVar50 |
                                     (byte)((ulong)uVar10 >> 0x38) & bVar42,
                                     CONCAT16((byte)((ulong)uVar100 >> 0x30) & bVar49 |
                                              (byte)((ulong)uVar10 >> 0x30) & bVar41,
                                              CONCAT15((byte)((ulong)uVar100 >> 0x28) & bVar48 |
                                                       (byte)((ulong)uVar10 >> 0x28) & bVar40,
                                                       CONCAT14((byte)((ulong)uVar100 >> 0x20) &
                                                                bVar47 | (byte)((ulong)uVar10 >>
                                                                               0x20) & bVar39,
                                                                CONCAT13((byte)((ulong)uVar100 >>
                                                                               0x18) & bVar46 |
                                                                         (byte)((ulong)uVar10 >>
                                                                               0x18) & bVar38,
                                                                         CONCAT12((byte)((ulong)
                                                  uVar100 >> 0x10) & bVar45 |
                                                  (byte)((ulong)uVar10 >> 0x10) & bVar37,
                                                  CONCAT11((byte)((ulong)uVar100 >> 8) & bVar44 |
                                                           (byte)((ulong)uVar10 >> 8) & bVar36,
                                                           (byte)uVar100 & bVar43 |
                                                           (byte)uVar10 & bVar35)))))));
              puVar26[-4] = CONCAT17((byte)((ulong)uVar99 >> 0x38) & bVar50 |
                                     (byte)((ulong)uVar9 >> 0x38) & bVar42,
                                     CONCAT16((byte)((ulong)uVar99 >> 0x30) & bVar49 |
                                              (byte)((ulong)uVar9 >> 0x30) & bVar41,
                                              CONCAT15((byte)((ulong)uVar99 >> 0x28) & bVar48 |
                                                       (byte)((ulong)uVar9 >> 0x28) & bVar40,
                                                       CONCAT14((byte)((ulong)uVar99 >> 0x20) &
                                                                bVar47 | (byte)((ulong)uVar9 >> 0x20
                                                                               ) & bVar39,
                                                                CONCAT13((byte)((ulong)uVar99 >>
                                                                               0x18) & bVar46 |
                                                                         (byte)((ulong)uVar9 >> 0x18
                                                                               ) & bVar38,
                                                                         CONCAT12((byte)((ulong)
                                                  uVar99 >> 0x10) & bVar45 |
                                                  (byte)((ulong)uVar9 >> 0x10) & bVar37,
                                                  CONCAT11((byte)((ulong)uVar99 >> 8) & bVar44 |
                                                           (byte)((ulong)uVar9 >> 8) & bVar36,
                                                           (byte)uVar99 & bVar43 |
                                                           (byte)uVar9 & bVar35)))))));
              puVar26[-1] = CONCAT17((byte)((ulong)uVar102 >> 0x38) & bVar50 |
                                     (byte)((ulong)uVar86 >> 0x38) & bVar42,
                                     CONCAT16((byte)((ulong)uVar102 >> 0x30) & bVar49 |
                                              (byte)((ulong)uVar86 >> 0x30) & bVar41,
                                              CONCAT15((byte)((ulong)uVar102 >> 0x28) & bVar48 |
                                                       (byte)((ulong)uVar86 >> 0x28) & bVar40,
                                                       CONCAT14((byte)((ulong)uVar102 >> 0x20) &
                                                                bVar47 | (byte)((ulong)uVar86 >>
                                                                               0x20) & bVar39,
                                                                CONCAT13((byte)((ulong)uVar102 >>
                                                                               0x18) & bVar46 |
                                                                         (byte)((ulong)uVar86 >>
                                                                               0x18) & bVar38,
                                                                         CONCAT12((byte)((ulong)
                                                  uVar102 >> 0x10) & bVar45 |
                                                  (byte)((ulong)uVar86 >> 0x10) & bVar37,
                                                  CONCAT11((byte)((ulong)uVar102 >> 8) & bVar44 |
                                                           (byte)((ulong)uVar86 >> 8) & bVar36,
                                                           (byte)uVar102 & bVar43 |
                                                           (byte)uVar86 & bVar35)))))));
              puVar26[-2] = CONCAT17((byte)((ulong)uVar101 >> 0x38) & bVar50 |
                                     (byte)((ulong)uVar76 >> 0x38) & bVar42,
                                     CONCAT16((byte)((ulong)uVar101 >> 0x30) & bVar49 |
                                              (byte)((ulong)uVar76 >> 0x30) & bVar41,
                                              CONCAT15((byte)((ulong)uVar101 >> 0x28) & bVar48 |
                                                       (byte)((ulong)uVar76 >> 0x28) & bVar40,
                                                       CONCAT14((byte)((ulong)uVar101 >> 0x20) &
                                                                bVar47 | (byte)((ulong)uVar76 >>
                                                                               0x20) & bVar39,
                                                                CONCAT13((byte)((ulong)uVar101 >>
                                                                               0x18) & bVar46 |
                                                                         (byte)((ulong)uVar76 >>
                                                                               0x18) & bVar38,
                                                                         CONCAT12((byte)((ulong)
                                                  uVar101 >> 0x10) & bVar45 |
                                                  (byte)((ulong)uVar76 >> 0x10) & bVar37,
                                                  CONCAT11((byte)((ulong)uVar101 >> 8) & bVar44 |
                                                           (byte)((ulong)uVar76 >> 8) & bVar36,
                                                           (byte)uVar101 & bVar43 |
                                                           (byte)uVar76 & bVar35)))))));
              puVar26[1] = CONCAT17((byte)((ulong)uVar104 >> 0x38) & bVar50 |
                                    (byte)((ulong)uVar96 >> 0x38) & bVar42,
                                    CONCAT16((byte)((ulong)uVar104 >> 0x30) & bVar49 |
                                             (byte)((ulong)uVar96 >> 0x30) & bVar41,
                                             CONCAT15((byte)((ulong)uVar104 >> 0x28) & bVar48 |
                                                      (byte)((ulong)uVar96 >> 0x28) & bVar40,
                                                      CONCAT14((byte)((ulong)uVar104 >> 0x20) &
                                                               bVar47 | (byte)((ulong)uVar96 >> 0x20
                                                                              ) & bVar39,
                                                               CONCAT13((byte)((ulong)uVar104 >>
                                                                              0x18) & bVar46 |
                                                                        (byte)((ulong)uVar96 >> 0x18
                                                                              ) & bVar38,
                                                                        CONCAT12((byte)((ulong)
                                                  uVar104 >> 0x10) & bVar45 |
                                                  (byte)((ulong)uVar96 >> 0x10) & bVar37,
                                                  CONCAT11((byte)((ulong)uVar104 >> 8) & bVar44 |
                                                           (byte)((ulong)uVar96 >> 8) & bVar36,
                                                           (byte)uVar104 & bVar43 |
                                                           (byte)uVar96 & bVar35)))))));
              *puVar26 = CONCAT17((byte)((ulong)uVar103 >> 0x38) & bVar50 |
                                  (byte)((ulong)uVar94 >> 0x38) & bVar42,
                                  CONCAT16((byte)((ulong)uVar103 >> 0x30) & bVar49 |
                                           (byte)((ulong)uVar94 >> 0x30) & bVar41,
                                           CONCAT15((byte)((ulong)uVar103 >> 0x28) & bVar48 |
                                                    (byte)((ulong)uVar94 >> 0x28) & bVar40,
                                                    CONCAT14((byte)((ulong)uVar103 >> 0x20) & bVar47
                                                             | (byte)((ulong)uVar94 >> 0x20) &
                                                               bVar39,CONCAT13((byte)((ulong)uVar103
                                                                                     >> 0x18) &
                                                                               bVar46 | (byte)((
                                                  ulong)uVar94 >> 0x18) & bVar38,
                                                  CONCAT12((byte)((ulong)uVar103 >> 0x10) & bVar45 |
                                                           (byte)((ulong)uVar94 >> 0x10) & bVar37,
                                                           CONCAT11((byte)((ulong)uVar103 >> 8) &
                                                                    bVar44 | (byte)((ulong)uVar94 >>
                                                                                   8) & bVar36,
                                                                    (byte)uVar103 & bVar43 |
                                                                    (byte)uVar94 & bVar35)))))));
              puVar26[3] = CONCAT17((byte)((ulong)uVar106 >> 0x38) & bVar50 |
                                    (byte)((ulong)uVar98 >> 0x38) & bVar42,
                                    CONCAT16((byte)((ulong)uVar106 >> 0x30) & bVar49 |
                                             (byte)((ulong)uVar98 >> 0x30) & bVar41,
                                             CONCAT15((byte)((ulong)uVar106 >> 0x28) & bVar48 |
                                                      (byte)((ulong)uVar98 >> 0x28) & bVar40,
                                                      CONCAT14((byte)((ulong)uVar106 >> 0x20) &
                                                               bVar47 | (byte)((ulong)uVar98 >> 0x20
                                                                              ) & bVar39,
                                                               CONCAT13((byte)((ulong)uVar106 >>
                                                                              0x18) & bVar46 |
                                                                        (byte)((ulong)uVar98 >> 0x18
                                                                              ) & bVar38,
                                                                        CONCAT12((byte)((ulong)
                                                  uVar106 >> 0x10) & bVar45 |
                                                  (byte)((ulong)uVar98 >> 0x10) & bVar37,
                                                  CONCAT11((byte)((ulong)uVar106 >> 8) & bVar44 |
                                                           (byte)((ulong)uVar98 >> 8) & bVar36,
                                                           (byte)uVar106 & bVar43 |
                                                           (byte)uVar98 & bVar35)))))));
              puVar26[2] = CONCAT17((byte)((ulong)uVar105 >> 0x38) & bVar50 |
                                    (byte)((ulong)uVar97 >> 0x38) & bVar42,
                                    CONCAT16((byte)((ulong)uVar105 >> 0x30) & bVar49 |
                                             (byte)((ulong)uVar97 >> 0x30) & bVar41,
                                             CONCAT15((byte)((ulong)uVar105 >> 0x28) & bVar48 |
                                                      (byte)((ulong)uVar97 >> 0x28) & bVar40,
                                                      CONCAT14((byte)((ulong)uVar105 >> 0x20) &
                                                               bVar47 | (byte)((ulong)uVar97 >> 0x20
                                                                              ) & bVar39,
                                                               CONCAT13((byte)((ulong)uVar105 >>
                                                                              0x18) & bVar46 |
                                                                        (byte)((ulong)uVar97 >> 0x18
                                                                              ) & bVar38,
                                                                        CONCAT12((byte)((ulong)
                                                  uVar105 >> 0x10) & bVar45 |
                                                  (byte)((ulong)uVar97 >> 0x10) & bVar37,
                                                  CONCAT11((byte)((ulong)uVar105 >> 8) & bVar44 |
                                                           (byte)((ulong)uVar97 >> 8) & bVar36,
                                                           (byte)uVar105 & bVar43 |
                                                           (byte)uVar97 & bVar35)))))));
              uVar17 = uVar17 - 8;
              puVar26 = puVar26 + 8;
              puVar19 = puVar19 + 8;
            } while (uVar17 != 0);
            uVar17 = uVar13;
            if (uVar13 == unaff_x23) goto code_r0x002a61dc;
          }
          lVar6 = unaff_x23 - uVar17;
          puVar15 = (ulong *)(uVar16 + uVar17 * 8);
          puVar21 = (ulong *)(uVar7 + uVar17 * 8);
          do {
            *puVar15 = *puVar15 & uVar11 | *puVar21 & uVar25;
            lVar6 = lVar6 + -1;
            puVar15 = puVar15 + 1;
            puVar21 = puVar21 + 1;
          } while (lVar6 != 0);
        }
code_r0x002a61dc:
        lVar6 = func_0x00382c70(uVar7,**(undefined8 **)(unaff_x29 + -0x58),*in_stack_00000070);
        lVar8 = func_0x00382cc0(*in_stack_00000060,*in_stack_00000068,*unaff_x22);
        uVar11 = lVar6 - lVar8;
        uVar7 = *in_stack_00000068;
        bVar43 = (byte)uVar11;
        bVar44 = (byte)(uVar11 >> 8);
        bVar45 = (byte)(uVar11 >> 0x10);
        bVar46 = (byte)(uVar11 >> 0x18);
        bVar47 = (byte)(uVar11 >> 0x20);
        bVar48 = (byte)(uVar11 >> 0x28);
        bVar49 = (byte)(uVar11 >> 0x30);
        bVar50 = (byte)(uVar11 >> 0x38);
        if (unaff_w28 != 0) {
          uVar17 = *in_stack_00000060;
          uVar16 = ~uVar11;
          if ((unaff_w28 < 8) || ((uVar7 < uVar17 + lVar4 && (uVar17 < uVar7 + lVar4)))) {
            uVar20 = 0;
code_r0x002a6260:
            lVar6 = unaff_x23 - uVar20;
            puVar15 = (ulong *)(uVar17 + uVar20 * 8);
            puVar21 = (ulong *)(uVar7 + uVar20 * 8);
            do {
              *puVar21 = *puVar15 & uVar16 | *puVar21 & uVar11;
              lVar6 = lVar6 + -1;
              puVar15 = puVar15 + 1;
              puVar21 = puVar21 + 1;
            } while (lVar6 != 0);
          }
          else {
            puVar26 = (undefined8 *)(uVar17 + 0x20);
            puVar19 = (undefined8 *)(uVar7 + 0x20);
            uVar20 = uVar13;
            do {
              uVar10 = puVar19[-3];
              uVar9 = puVar19[-4];
              uVar86 = puVar19[-1];
              uVar76 = puVar19[-2];
              uVar96 = puVar19[1];
              uVar94 = *puVar19;
              uVar98 = puVar19[3];
              uVar97 = puVar19[2];
              uVar100 = puVar26[-3];
              uVar99 = puVar26[-4];
              uVar102 = puVar26[-1];
              uVar101 = puVar26[-2];
              uVar104 = puVar26[1];
              uVar103 = *puVar26;
              uVar106 = puVar26[3];
              uVar105 = puVar26[2];
              bVar51 = (byte)uVar16;
              bVar52 = (byte)(uVar16 >> 8);
              bVar53 = (byte)(uVar16 >> 0x10);
              bVar54 = (byte)(uVar16 >> 0x18);
              bVar55 = (byte)(uVar16 >> 0x20);
              bVar56 = (byte)(uVar16 >> 0x28);
              bVar57 = (byte)(uVar16 >> 0x30);
              bVar58 = (byte)(uVar16 >> 0x38);
              puVar19[-3] = CONCAT17((byte)((ulong)uVar100 >> 0x38) & bVar58 |
                                     (byte)((ulong)uVar10 >> 0x38) & bVar50,
                                     CONCAT16((byte)((ulong)uVar100 >> 0x30) & bVar57 |
                                              (byte)((ulong)uVar10 >> 0x30) & bVar49,
                                              CONCAT15((byte)((ulong)uVar100 >> 0x28) & bVar56 |
                                                       (byte)((ulong)uVar10 >> 0x28) & bVar48,
                                                       CONCAT14((byte)((ulong)uVar100 >> 0x20) &
                                                                bVar55 | (byte)((ulong)uVar10 >>
                                                                               0x20) & bVar47,
                                                                CONCAT13((byte)((ulong)uVar100 >>
                                                                               0x18) & bVar54 |
                                                                         (byte)((ulong)uVar10 >>
                                                                               0x18) & bVar46,
                                                                         CONCAT12((byte)((ulong)
                                                  uVar100 >> 0x10) & bVar53 |
                                                  (byte)((ulong)uVar10 >> 0x10) & bVar45,
                                                  CONCAT11((byte)((ulong)uVar100 >> 8) & bVar52 |
                                                           (byte)((ulong)uVar10 >> 8) & bVar44,
                                                           (byte)uVar100 & bVar51 |
                                                           (byte)uVar10 & bVar43)))))));
              puVar19[-4] = CONCAT17((byte)((ulong)uVar99 >> 0x38) & bVar58 |
                                     (byte)((ulong)uVar9 >> 0x38) & bVar50,
                                     CONCAT16((byte)((ulong)uVar99 >> 0x30) & bVar57 |
                                              (byte)((ulong)uVar9 >> 0x30) & bVar49,
                                              CONCAT15((byte)((ulong)uVar99 >> 0x28) & bVar56 |
                                                       (byte)((ulong)uVar9 >> 0x28) & bVar48,
                                                       CONCAT14((byte)((ulong)uVar99 >> 0x20) &
                                                                bVar55 | (byte)((ulong)uVar9 >> 0x20
                                                                               ) & bVar47,
                                                                CONCAT13((byte)((ulong)uVar99 >>
                                                                               0x18) & bVar54 |
                                                                         (byte)((ulong)uVar9 >> 0x18
                                                                               ) & bVar46,
                                                                         CONCAT12((byte)((ulong)
                                                  uVar99 >> 0x10) & bVar53 |
                                                  (byte)((ulong)uVar9 >> 0x10) & bVar45,
                                                  CONCAT11((byte)((ulong)uVar99 >> 8) & bVar52 |
                                                           (byte)((ulong)uVar9 >> 8) & bVar44,
                                                           (byte)uVar99 & bVar51 |
                                                           (byte)uVar9 & bVar43)))))));
              puVar19[-1] = CONCAT17((byte)((ulong)uVar102 >> 0x38) & bVar58 |
                                     (byte)((ulong)uVar86 >> 0x38) & bVar50,
                                     CONCAT16((byte)((ulong)uVar102 >> 0x30) & bVar57 |
                                              (byte)((ulong)uVar86 >> 0x30) & bVar49,
                                              CONCAT15((byte)((ulong)uVar102 >> 0x28) & bVar56 |
                                                       (byte)((ulong)uVar86 >> 0x28) & bVar48,
                                                       CONCAT14((byte)((ulong)uVar102 >> 0x20) &
                                                                bVar55 | (byte)((ulong)uVar86 >>
                                                                               0x20) & bVar47,
                                                                CONCAT13((byte)((ulong)uVar102 >>
                                                                               0x18) & bVar54 |
                                                                         (byte)((ulong)uVar86 >>
                                                                               0x18) & bVar46,
                                                                         CONCAT12((byte)((ulong)
                                                  uVar102 >> 0x10) & bVar53 |
                                                  (byte)((ulong)uVar86 >> 0x10) & bVar45,
                                                  CONCAT11((byte)((ulong)uVar102 >> 8) & bVar52 |
                                                           (byte)((ulong)uVar86 >> 8) & bVar44,
                                                           (byte)uVar102 & bVar51 |
                                                           (byte)uVar86 & bVar43)))))));
              puVar19[-2] = CONCAT17((byte)((ulong)uVar101 >> 0x38) & bVar58 |
                                     (byte)((ulong)uVar76 >> 0x38) & bVar50,
                                     CONCAT16((byte)((ulong)uVar101 >> 0x30) & bVar57 |
                                              (byte)((ulong)uVar76 >> 0x30) & bVar49,
                                              CONCAT15((byte)((ulong)uVar101 >> 0x28) & bVar56 |
                                                       (byte)((ulong)uVar76 >> 0x28) & bVar48,
                                                       CONCAT14((byte)((ulong)uVar101 >> 0x20) &
                                                                bVar55 | (byte)((ulong)uVar76 >>
                                                                               0x20) & bVar47,
                                                                CONCAT13((byte)((ulong)uVar101 >>
                                                                               0x18) & bVar54 |
                                                                         (byte)((ulong)uVar76 >>
                                                                               0x18) & bVar46,
                                                                         CONCAT12((byte)((ulong)
                                                  uVar101 >> 0x10) & bVar53 |
                                                  (byte)((ulong)uVar76 >> 0x10) & bVar45,
                                                  CONCAT11((byte)((ulong)uVar101 >> 8) & bVar52 |
                                                           (byte)((ulong)uVar76 >> 8) & bVar44,
                                                           (byte)uVar101 & bVar51 |
                                                           (byte)uVar76 & bVar43)))))));
              puVar19[1] = CONCAT17((byte)((ulong)uVar104 >> 0x38) & bVar58 |
                                    (byte)((ulong)uVar96 >> 0x38) & bVar50,
                                    CONCAT16((byte)((ulong)uVar104 >> 0x30) & bVar57 |
                                             (byte)((ulong)uVar96 >> 0x30) & bVar49,
                                             CONCAT15((byte)((ulong)uVar104 >> 0x28) & bVar56 |
                                                      (byte)((ulong)uVar96 >> 0x28) & bVar48,
                                                      CONCAT14((byte)((ulong)uVar104 >> 0x20) &
                                                               bVar55 | (byte)((ulong)uVar96 >> 0x20
                                                                              ) & bVar47,
                                                               CONCAT13((byte)((ulong)uVar104 >>
                                                                              0x18) & bVar54 |
                                                                        (byte)((ulong)uVar96 >> 0x18
                                                                              ) & bVar46,
                                                                        CONCAT12((byte)((ulong)
                                                  uVar104 >> 0x10) & bVar53 |
                                                  (byte)((ulong)uVar96 >> 0x10) & bVar45,
                                                  CONCAT11((byte)((ulong)uVar104 >> 8) & bVar52 |
                                                           (byte)((ulong)uVar96 >> 8) & bVar44,
                                                           (byte)uVar104 & bVar51 |
                                                           (byte)uVar96 & bVar43)))))));
              *puVar19 = CONCAT17((byte)((ulong)uVar103 >> 0x38) & bVar58 |
                                  (byte)((ulong)uVar94 >> 0x38) & bVar50,
                                  CONCAT16((byte)((ulong)uVar103 >> 0x30) & bVar57 |
                                           (byte)((ulong)uVar94 >> 0x30) & bVar49,
                                           CONCAT15((byte)((ulong)uVar103 >> 0x28) & bVar56 |
                                                    (byte)((ulong)uVar94 >> 0x28) & bVar48,
                                                    CONCAT14((byte)((ulong)uVar103 >> 0x20) & bVar55
                                                             | (byte)((ulong)uVar94 >> 0x20) &
                                                               bVar47,CONCAT13((byte)((ulong)uVar103
                                                                                     >> 0x18) &
                                                                               bVar54 | (byte)((
                                                  ulong)uVar94 >> 0x18) & bVar46,
                                                  CONCAT12((byte)((ulong)uVar103 >> 0x10) & bVar53 |
                                                           (byte)((ulong)uVar94 >> 0x10) & bVar45,
                                                           CONCAT11((byte)((ulong)uVar103 >> 8) &
                                                                    bVar52 | (byte)((ulong)uVar94 >>
                                                                                   8) & bVar44,
                                                                    (byte)uVar103 & bVar51 |
                                                                    (byte)uVar94 & bVar43)))))));
              puVar19[3] = CONCAT17((byte)((ulong)uVar106 >> 0x38) & bVar58 |
                                    (byte)((ulong)uVar98 >> 0x38) & bVar50,
                                    CONCAT16((byte)((ulong)uVar106 >> 0x30) & bVar57 |
                                             (byte)((ulong)uVar98 >> 0x30) & bVar49,
                                             CONCAT15((byte)((ulong)uVar106 >> 0x28) & bVar56 |
                                                      (byte)((ulong)uVar98 >> 0x28) & bVar48,
                                                      CONCAT14((byte)((ulong)uVar106 >> 0x20) &
                                                               bVar55 | (byte)((ulong)uVar98 >> 0x20
                                                                              ) & bVar47,
                                                               CONCAT13((byte)((ulong)uVar106 >>
                                                                              0x18) & bVar54 |
                                                                        (byte)((ulong)uVar98 >> 0x18
                                                                              ) & bVar46,
                                                                        CONCAT12((byte)((ulong)
                                                  uVar106 >> 0x10) & bVar53 |
                                                  (byte)((ulong)uVar98 >> 0x10) & bVar45,
                                                  CONCAT11((byte)((ulong)uVar106 >> 8) & bVar52 |
                                                           (byte)((ulong)uVar98 >> 8) & bVar44,
                                                           (byte)uVar106 & bVar51 |
                                                           (byte)uVar98 & bVar43)))))));
              puVar19[2] = CONCAT17((byte)((ulong)uVar105 >> 0x38) & bVar58 |
                                    (byte)((ulong)uVar97 >> 0x38) & bVar50,
                                    CONCAT16((byte)((ulong)uVar105 >> 0x30) & bVar57 |
                                             (byte)((ulong)uVar97 >> 0x30) & bVar49,
                                             CONCAT15((byte)((ulong)uVar105 >> 0x28) & bVar56 |
                                                      (byte)((ulong)uVar97 >> 0x28) & bVar48,
                                                      CONCAT14((byte)((ulong)uVar105 >> 0x20) &
                                                               bVar55 | (byte)((ulong)uVar97 >> 0x20
                                                                              ) & bVar47,
                                                               CONCAT13((byte)((ulong)uVar105 >>
                                                                              0x18) & bVar54 |
                                                                        (byte)((ulong)uVar97 >> 0x18
                                                                              ) & bVar46,
                                                                        CONCAT12((byte)((ulong)
                                                  uVar105 >> 0x10) & bVar53 |
                                                  (byte)((ulong)uVar97 >> 0x10) & bVar45,
                                                  CONCAT11((byte)((ulong)uVar105 >> 8) & bVar52 |
                                                           (byte)((ulong)uVar97 >> 8) & bVar44,
                                                           (byte)uVar105 & bVar51 |
                                                           (byte)uVar97 & bVar43)))))));
              uVar20 = uVar20 - 8;
              puVar26 = puVar26 + 8;
              puVar19 = puVar19 + 8;
            } while (uVar20 != 0);
            uVar20 = uVar13;
            if (uVar13 != unaff_x23) goto code_r0x002a6260;
          }
          uVar17 = **(ulong **)(unaff_x29 + -0x58);
          uVar16 = ~uVar25;
          if ((unaff_w28 < 8) || (uVar17 < uVar7 + lVar4 && uVar7 < uVar17 + lVar4)) {
            uVar20 = 0;
code_r0x002a6340:
            lVar6 = unaff_x23 - uVar20;
            puVar15 = (ulong *)(uVar17 + uVar20 * 8);
            puVar21 = (ulong *)(uVar7 + uVar20 * 8);
            do {
              *puVar15 = *puVar15 & uVar16 | *puVar21 & uVar25;
              lVar6 = lVar6 + -1;
              puVar15 = puVar15 + 1;
              puVar21 = puVar21 + 1;
            } while (lVar6 != 0);
          }
          else {
            puVar26 = (undefined8 *)(uVar17 + 0x20);
            puVar19 = (undefined8 *)(uVar7 + 0x20);
            uVar20 = uVar13;
            do {
              uVar10 = puVar19[-3];
              uVar9 = puVar19[-4];
              uVar86 = puVar19[-1];
              uVar76 = puVar19[-2];
              uVar96 = puVar19[1];
              uVar94 = *puVar19;
              uVar98 = puVar19[3];
              uVar97 = puVar19[2];
              uVar100 = puVar26[-3];
              uVar99 = puVar26[-4];
              uVar102 = puVar26[-1];
              uVar101 = puVar26[-2];
              uVar104 = puVar26[1];
              uVar103 = *puVar26;
              uVar106 = puVar26[3];
              uVar105 = puVar26[2];
              bVar51 = (byte)uVar16;
              bVar52 = (byte)(uVar16 >> 8);
              bVar53 = (byte)(uVar16 >> 0x10);
              bVar54 = (byte)(uVar16 >> 0x18);
              bVar55 = (byte)(uVar16 >> 0x20);
              bVar56 = (byte)(uVar16 >> 0x28);
              bVar57 = (byte)(uVar16 >> 0x30);
              bVar58 = (byte)(uVar16 >> 0x38);
              puVar26[-3] = CONCAT17((byte)((ulong)uVar100 >> 0x38) & bVar58 |
                                     (byte)((ulong)uVar10 >> 0x38) & bVar42,
                                     CONCAT16((byte)((ulong)uVar100 >> 0x30) & bVar57 |
                                              (byte)((ulong)uVar10 >> 0x30) & bVar41,
                                              CONCAT15((byte)((ulong)uVar100 >> 0x28) & bVar56 |
                                                       (byte)((ulong)uVar10 >> 0x28) & bVar40,
                                                       CONCAT14((byte)((ulong)uVar100 >> 0x20) &
                                                                bVar55 | (byte)((ulong)uVar10 >>
                                                                               0x20) & bVar39,
                                                                CONCAT13((byte)((ulong)uVar100 >>
                                                                               0x18) & bVar54 |
                                                                         (byte)((ulong)uVar10 >>
                                                                               0x18) & bVar38,
                                                                         CONCAT12((byte)((ulong)
                                                  uVar100 >> 0x10) & bVar53 |
                                                  (byte)((ulong)uVar10 >> 0x10) & bVar37,
                                                  CONCAT11((byte)((ulong)uVar100 >> 8) & bVar52 |
                                                           (byte)((ulong)uVar10 >> 8) & bVar36,
                                                           (byte)uVar100 & bVar51 |
                                                           (byte)uVar10 & bVar35)))))));
              puVar26[-4] = CONCAT17((byte)((ulong)uVar99 >> 0x38) & bVar58 |
                                     (byte)((ulong)uVar9 >> 0x38) & bVar42,
                                     CONCAT16((byte)((ulong)uVar99 >> 0x30) & bVar57 |
                                              (byte)((ulong)uVar9 >> 0x30) & bVar41,
                                              CONCAT15((byte)((ulong)uVar99 >> 0x28) & bVar56 |
                                                       (byte)((ulong)uVar9 >> 0x28) & bVar40,
                                                       CONCAT14((byte)((ulong)uVar99 >> 0x20) &
                                                                bVar55 | (byte)((ulong)uVar9 >> 0x20
                                                                               ) & bVar39,
                                                                CONCAT13((byte)((ulong)uVar99 >>
                                                                               0x18) & bVar54 |
                                                                         (byte)((ulong)uVar9 >> 0x18
                                                                               ) & bVar38,
                                                                         CONCAT12((byte)((ulong)
                                                  uVar99 >> 0x10) & bVar53 |
                                                  (byte)((ulong)uVar9 >> 0x10) & bVar37,
                                                  CONCAT11((byte)((ulong)uVar99 >> 8) & bVar52 |
                                                           (byte)((ulong)uVar9 >> 8) & bVar36,
                                                           (byte)uVar99 & bVar51 |
                                                           (byte)uVar9 & bVar35)))))));
              puVar26[-1] = CONCAT17((byte)((ulong)uVar102 >> 0x38) & bVar58 |
                                     (byte)((ulong)uVar86 >> 0x38) & bVar42,
                                     CONCAT16((byte)((ulong)uVar102 >> 0x30) & bVar57 |
                                              (byte)((ulong)uVar86 >> 0x30) & bVar41,
                                              CONCAT15((byte)((ulong)uVar102 >> 0x28) & bVar56 |
                                                       (byte)((ulong)uVar86 >> 0x28) & bVar40,
                                                       CONCAT14((byte)((ulong)uVar102 >> 0x20) &
                                                                bVar55 | (byte)((ulong)uVar86 >>
                                                                               0x20) & bVar39,
                                                                CONCAT13((byte)((ulong)uVar102 >>
                                                                               0x18) & bVar54 |
                                                                         (byte)((ulong)uVar86 >>
                                                                               0x18) & bVar38,
                                                                         CONCAT12((byte)((ulong)
                                                  uVar102 >> 0x10) & bVar53 |
                                                  (byte)((ulong)uVar86 >> 0x10) & bVar37,
                                                  CONCAT11((byte)((ulong)uVar102 >> 8) & bVar52 |
                                                           (byte)((ulong)uVar86 >> 8) & bVar36,
                                                           (byte)uVar102 & bVar51 |
                                                           (byte)uVar86 & bVar35)))))));
              puVar26[-2] = CONCAT17((byte)((ulong)uVar101 >> 0x38) & bVar58 |
                                     (byte)((ulong)uVar76 >> 0x38) & bVar42,
                                     CONCAT16((byte)((ulong)uVar101 >> 0x30) & bVar57 |
                                              (byte)((ulong)uVar76 >> 0x30) & bVar41,
                                              CONCAT15((byte)((ulong)uVar101 >> 0x28) & bVar56 |
                                                       (byte)((ulong)uVar76 >> 0x28) & bVar40,
                                                       CONCAT14((byte)((ulong)uVar101 >> 0x20) &
                                                                bVar55 | (byte)((ulong)uVar76 >>
                                                                               0x20) & bVar39,
                                                                CONCAT13((byte)((ulong)uVar101 >>
                                                                               0x18) & bVar54 |
                                                                         (byte)((ulong)uVar76 >>
                                                                               0x18) & bVar38,
                                                                         CONCAT12((byte)((ulong)
                                                  uVar101 >> 0x10) & bVar53 |
                                                  (byte)((ulong)uVar76 >> 0x10) & bVar37,
                                                  CONCAT11((byte)((ulong)uVar101 >> 8) & bVar52 |
                                                           (byte)((ulong)uVar76 >> 8) & bVar36,
                                                           (byte)uVar101 & bVar51 |
                                                           (byte)uVar76 & bVar35)))))));
              puVar26[1] = CONCAT17((byte)((ulong)uVar104 >> 0x38) & bVar58 |
                                    (byte)((ulong)uVar96 >> 0x38) & bVar42,
                                    CONCAT16((byte)((ulong)uVar104 >> 0x30) & bVar57 |
                                             (byte)((ulong)uVar96 >> 0x30) & bVar41,
                                             CONCAT15((byte)((ulong)uVar104 >> 0x28) & bVar56 |
                                                      (byte)((ulong)uVar96 >> 0x28) & bVar40,
                                                      CONCAT14((byte)((ulong)uVar104 >> 0x20) &
                                                               bVar55 | (byte)((ulong)uVar96 >> 0x20
                                                                              ) & bVar39,
                                                               CONCAT13((byte)((ulong)uVar104 >>
                                                                              0x18) & bVar54 |
                                                                        (byte)((ulong)uVar96 >> 0x18
                                                                              ) & bVar38,
                                                                        CONCAT12((byte)((ulong)
                                                  uVar104 >> 0x10) & bVar53 |
                                                  (byte)((ulong)uVar96 >> 0x10) & bVar37,
                                                  CONCAT11((byte)((ulong)uVar104 >> 8) & bVar52 |
                                                           (byte)((ulong)uVar96 >> 8) & bVar36,
                                                           (byte)uVar104 & bVar51 |
                                                           (byte)uVar96 & bVar35)))))));
              *puVar26 = CONCAT17((byte)((ulong)uVar103 >> 0x38) & bVar58 |
                                  (byte)((ulong)uVar94 >> 0x38) & bVar42,
                                  CONCAT16((byte)((ulong)uVar103 >> 0x30) & bVar57 |
                                           (byte)((ulong)uVar94 >> 0x30) & bVar41,
                                           CONCAT15((byte)((ulong)uVar103 >> 0x28) & bVar56 |
                                                    (byte)((ulong)uVar94 >> 0x28) & bVar40,
                                                    CONCAT14((byte)((ulong)uVar103 >> 0x20) & bVar55
                                                             | (byte)((ulong)uVar94 >> 0x20) &
                                                               bVar39,CONCAT13((byte)((ulong)uVar103
                                                                                     >> 0x18) &
                                                                               bVar54 | (byte)((
                                                  ulong)uVar94 >> 0x18) & bVar38,
                                                  CONCAT12((byte)((ulong)uVar103 >> 0x10) & bVar53 |
                                                           (byte)((ulong)uVar94 >> 0x10) & bVar37,
                                                           CONCAT11((byte)((ulong)uVar103 >> 8) &
                                                                    bVar52 | (byte)((ulong)uVar94 >>
                                                                                   8) & bVar36,
                                                                    (byte)uVar103 & bVar51 |
                                                                    (byte)uVar94 & bVar35)))))));
              puVar26[3] = CONCAT17((byte)((ulong)uVar106 >> 0x38) & bVar58 |
                                    (byte)((ulong)uVar98 >> 0x38) & bVar42,
                                    CONCAT16((byte)((ulong)uVar106 >> 0x30) & bVar57 |
                                             (byte)((ulong)uVar98 >> 0x30) & bVar41,
                                             CONCAT15((byte)((ulong)uVar106 >> 0x28) & bVar56 |
                                                      (byte)((ulong)uVar98 >> 0x28) & bVar40,
                                                      CONCAT14((byte)((ulong)uVar106 >> 0x20) &
                                                               bVar55 | (byte)((ulong)uVar98 >> 0x20
                                                                              ) & bVar39,
                                                               CONCAT13((byte)((ulong)uVar106 >>
                                                                              0x18) & bVar54 |
                                                                        (byte)((ulong)uVar98 >> 0x18
                                                                              ) & bVar38,
                                                                        CONCAT12((byte)((ulong)
                                                  uVar106 >> 0x10) & bVar53 |
                                                  (byte)((ulong)uVar98 >> 0x10) & bVar37,
                                                  CONCAT11((byte)((ulong)uVar106 >> 8) & bVar52 |
                                                           (byte)((ulong)uVar98 >> 8) & bVar36,
                                                           (byte)uVar106 & bVar51 |
                                                           (byte)uVar98 & bVar35)))))));
              puVar26[2] = CONCAT17((byte)((ulong)uVar105 >> 0x38) & bVar58 |
                                    (byte)((ulong)uVar97 >> 0x38) & bVar42,
                                    CONCAT16((byte)((ulong)uVar105 >> 0x30) & bVar57 |
                                             (byte)((ulong)uVar97 >> 0x30) & bVar41,
                                             CONCAT15((byte)((ulong)uVar105 >> 0x28) & bVar56 |
                                                      (byte)((ulong)uVar97 >> 0x28) & bVar40,
                                                      CONCAT14((byte)((ulong)uVar105 >> 0x20) &
                                                               bVar55 | (byte)((ulong)uVar97 >> 0x20
                                                                              ) & bVar39,
                                                               CONCAT13((byte)((ulong)uVar105 >>
                                                                              0x18) & bVar54 |
                                                                        (byte)((ulong)uVar97 >> 0x18
                                                                              ) & bVar38,
                                                                        CONCAT12((byte)((ulong)
                                                  uVar105 >> 0x10) & bVar53 |
                                                  (byte)((ulong)uVar97 >> 0x10) & bVar37,
                                                  CONCAT11((byte)((ulong)uVar105 >> 8) & bVar52 |
                                                           (byte)((ulong)uVar97 >> 8) & bVar36,
                                                           (byte)uVar105 & bVar51 |
                                                           (byte)uVar97 & bVar35)))))));
              uVar20 = uVar20 - 8;
              puVar26 = puVar26 + 8;
              puVar19 = puVar19 + 8;
            } while (uVar20 != 0);
            uVar20 = uVar13;
            if (uVar13 != unaff_x23) goto code_r0x002a6340;
          }
          uVar17 = *in_stack_00000070;
          uVar16 = ~uVar14;
          if ((unaff_w28 < 8) || (uVar17 < uVar7 + lVar4 && uVar7 < uVar17 + lVar4)) {
            uVar20 = 0;
          }
          else {
            puVar26 = (undefined8 *)(uVar17 + 0x20);
            puVar19 = (undefined8 *)(uVar7 + 0x20);
            uVar20 = uVar13;
            do {
              uVar10 = puVar19[-3];
              uVar9 = puVar19[-4];
              uVar86 = puVar19[-1];
              uVar76 = puVar19[-2];
              uVar96 = puVar19[1];
              uVar94 = *puVar19;
              uVar98 = puVar19[3];
              uVar97 = puVar19[2];
              uVar100 = puVar26[-3];
              uVar99 = puVar26[-4];
              uVar102 = puVar26[-1];
              uVar101 = puVar26[-2];
              uVar104 = puVar26[1];
              uVar103 = *puVar26;
              uVar106 = puVar26[3];
              uVar105 = puVar26[2];
              bVar51 = (byte)uVar16;
              bVar52 = (byte)(uVar16 >> 8);
              bVar53 = (byte)(uVar16 >> 0x10);
              bVar54 = (byte)(uVar16 >> 0x18);
              bVar55 = (byte)(uVar16 >> 0x20);
              bVar56 = (byte)(uVar16 >> 0x28);
              bVar57 = (byte)(uVar16 >> 0x30);
              bVar58 = (byte)(uVar16 >> 0x38);
              puVar26[-3] = CONCAT17((byte)((ulong)uVar100 >> 0x38) & bVar58 |
                                     (byte)((ulong)uVar10 >> 0x38) & bVar34,
                                     CONCAT16((byte)((ulong)uVar100 >> 0x30) & bVar57 |
                                              (byte)((ulong)uVar10 >> 0x30) & bVar33,
                                              CONCAT15((byte)((ulong)uVar100 >> 0x28) & bVar56 |
                                                       (byte)((ulong)uVar10 >> 0x28) & bVar32,
                                                       CONCAT14((byte)((ulong)uVar100 >> 0x20) &
                                                                bVar55 | (byte)((ulong)uVar10 >>
                                                                               0x20) & bVar31,
                                                                CONCAT13((byte)((ulong)uVar100 >>
                                                                               0x18) & bVar54 |
                                                                         (byte)((ulong)uVar10 >>
                                                                               0x18) & bVar30,
                                                                         CONCAT12((byte)((ulong)
                                                  uVar100 >> 0x10) & bVar53 |
                                                  (byte)((ulong)uVar10 >> 0x10) & bVar29,
                                                  CONCAT11((byte)((ulong)uVar100 >> 8) & bVar52 |
                                                           (byte)((ulong)uVar10 >> 8) & bVar28,
                                                           (byte)uVar100 & bVar51 |
                                                           (byte)uVar10 & bVar27)))))));
              puVar26[-4] = CONCAT17((byte)((ulong)uVar99 >> 0x38) & bVar58 |
                                     (byte)((ulong)uVar9 >> 0x38) & bVar34,
                                     CONCAT16((byte)((ulong)uVar99 >> 0x30) & bVar57 |
                                              (byte)((ulong)uVar9 >> 0x30) & bVar33,
                                              CONCAT15((byte)((ulong)uVar99 >> 0x28) & bVar56 |
                                                       (byte)((ulong)uVar9 >> 0x28) & bVar32,
                                                       CONCAT14((byte)((ulong)uVar99 >> 0x20) &
                                                                bVar55 | (byte)((ulong)uVar9 >> 0x20
                                                                               ) & bVar31,
                                                                CONCAT13((byte)((ulong)uVar99 >>
                                                                               0x18) & bVar54 |
                                                                         (byte)((ulong)uVar9 >> 0x18
                                                                               ) & bVar30,
                                                                         CONCAT12((byte)((ulong)
                                                  uVar99 >> 0x10) & bVar53 |
                                                  (byte)((ulong)uVar9 >> 0x10) & bVar29,
                                                  CONCAT11((byte)((ulong)uVar99 >> 8) & bVar52 |
                                                           (byte)((ulong)uVar9 >> 8) & bVar28,
                                                           (byte)uVar99 & bVar51 |
                                                           (byte)uVar9 & bVar27)))))));
              puVar26[-1] = CONCAT17((byte)((ulong)uVar102 >> 0x38) & bVar58 |
                                     (byte)((ulong)uVar86 >> 0x38) & bVar34,
                                     CONCAT16((byte)((ulong)uVar102 >> 0x30) & bVar57 |
                                              (byte)((ulong)uVar86 >> 0x30) & bVar33,
                                              CONCAT15((byte)((ulong)uVar102 >> 0x28) & bVar56 |
                                                       (byte)((ulong)uVar86 >> 0x28) & bVar32,
                                                       CONCAT14((byte)((ulong)uVar102 >> 0x20) &
                                                                bVar55 | (byte)((ulong)uVar86 >>
                                                                               0x20) & bVar31,
                                                                CONCAT13((byte)((ulong)uVar102 >>
                                                                               0x18) & bVar54 |
                                                                         (byte)((ulong)uVar86 >>
                                                                               0x18) & bVar30,
                                                                         CONCAT12((byte)((ulong)
                                                  uVar102 >> 0x10) & bVar53 |
                                                  (byte)((ulong)uVar86 >> 0x10) & bVar29,
                                                  CONCAT11((byte)((ulong)uVar102 >> 8) & bVar52 |
                                                           (byte)((ulong)uVar86 >> 8) & bVar28,
                                                           (byte)uVar102 & bVar51 |
                                                           (byte)uVar86 & bVar27)))))));
              puVar26[-2] = CONCAT17((byte)((ulong)uVar101 >> 0x38) & bVar58 |
                                     (byte)((ulong)uVar76 >> 0x38) & bVar34,
                                     CONCAT16((byte)((ulong)uVar101 >> 0x30) & bVar57 |
                                              (byte)((ulong)uVar76 >> 0x30) & bVar33,
                                              CONCAT15((byte)((ulong)uVar101 >> 0x28) & bVar56 |
                                                       (byte)((ulong)uVar76 >> 0x28) & bVar32,
                                                       CONCAT14((byte)((ulong)uVar101 >> 0x20) &
                                                                bVar55 | (byte)((ulong)uVar76 >>
                                                                               0x20) & bVar31,
                                                                CONCAT13((byte)((ulong)uVar101 >>
                                                                               0x18) & bVar54 |
                                                                         (byte)((ulong)uVar76 >>
                                                                               0x18) & bVar30,
                                                                         CONCAT12((byte)((ulong)
                                                  uVar101 >> 0x10) & bVar53 |
                                                  (byte)((ulong)uVar76 >> 0x10) & bVar29,
                                                  CONCAT11((byte)((ulong)uVar101 >> 8) & bVar52 |
                                                           (byte)((ulong)uVar76 >> 8) & bVar28,
                                                           (byte)uVar101 & bVar51 |
                                                           (byte)uVar76 & bVar27)))))));
              puVar26[1] = CONCAT17((byte)((ulong)uVar104 >> 0x38) & bVar58 |
                                    (byte)((ulong)uVar96 >> 0x38) & bVar34,
                                    CONCAT16((byte)((ulong)uVar104 >> 0x30) & bVar57 |
                                             (byte)((ulong)uVar96 >> 0x30) & bVar33,
                                             CONCAT15((byte)((ulong)uVar104 >> 0x28) & bVar56 |
                                                      (byte)((ulong)uVar96 >> 0x28) & bVar32,
                                                      CONCAT14((byte)((ulong)uVar104 >> 0x20) &
                                                               bVar55 | (byte)((ulong)uVar96 >> 0x20
                                                                              ) & bVar31,
                                                               CONCAT13((byte)((ulong)uVar104 >>
                                                                              0x18) & bVar54 |
                                                                        (byte)((ulong)uVar96 >> 0x18
                                                                              ) & bVar30,
                                                                        CONCAT12((byte)((ulong)
                                                  uVar104 >> 0x10) & bVar53 |
                                                  (byte)((ulong)uVar96 >> 0x10) & bVar29,
                                                  CONCAT11((byte)((ulong)uVar104 >> 8) & bVar52 |
                                                           (byte)((ulong)uVar96 >> 8) & bVar28,
                                                           (byte)uVar104 & bVar51 |
                                                           (byte)uVar96 & bVar27)))))));
              *puVar26 = CONCAT17((byte)((ulong)uVar103 >> 0x38) & bVar58 |
                                  (byte)((ulong)uVar94 >> 0x38) & bVar34,
                                  CONCAT16((byte)((ulong)uVar103 >> 0x30) & bVar57 |
                                           (byte)((ulong)uVar94 >> 0x30) & bVar33,
                                           CONCAT15((byte)((ulong)uVar103 >> 0x28) & bVar56 |
                                                    (byte)((ulong)uVar94 >> 0x28) & bVar32,
                                                    CONCAT14((byte)((ulong)uVar103 >> 0x20) & bVar55
                                                             | (byte)((ulong)uVar94 >> 0x20) &
                                                               bVar31,CONCAT13((byte)((ulong)uVar103
                                                                                     >> 0x18) &
                                                                               bVar54 | (byte)((
                                                  ulong)uVar94 >> 0x18) & bVar30,
                                                  CONCAT12((byte)((ulong)uVar103 >> 0x10) & bVar53 |
                                                           (byte)((ulong)uVar94 >> 0x10) & bVar29,
                                                           CONCAT11((byte)((ulong)uVar103 >> 8) &
                                                                    bVar52 | (byte)((ulong)uVar94 >>
                                                                                   8) & bVar28,
                                                                    (byte)uVar103 & bVar51 |
                                                                    (byte)uVar94 & bVar27)))))));
              puVar26[3] = CONCAT17((byte)((ulong)uVar106 >> 0x38) & bVar58 |
                                    (byte)((ulong)uVar98 >> 0x38) & bVar34,
                                    CONCAT16((byte)((ulong)uVar106 >> 0x30) & bVar57 |
                                             (byte)((ulong)uVar98 >> 0x30) & bVar33,
                                             CONCAT15((byte)((ulong)uVar106 >> 0x28) & bVar56 |
                                                      (byte)((ulong)uVar98 >> 0x28) & bVar32,
                                                      CONCAT14((byte)((ulong)uVar106 >> 0x20) &
                                                               bVar55 | (byte)((ulong)uVar98 >> 0x20
                                                                              ) & bVar31,
                                                               CONCAT13((byte)((ulong)uVar106 >>
                                                                              0x18) & bVar54 |
                                                                        (byte)((ulong)uVar98 >> 0x18
                                                                              ) & bVar30,
                                                                        CONCAT12((byte)((ulong)
                                                  uVar106 >> 0x10) & bVar53 |
                                                  (byte)((ulong)uVar98 >> 0x10) & bVar29,
                                                  CONCAT11((byte)((ulong)uVar106 >> 8) & bVar52 |
                                                           (byte)((ulong)uVar98 >> 8) & bVar28,
                                                           (byte)uVar106 & bVar51 |
                                                           (byte)uVar98 & bVar27)))))));
              puVar26[2] = CONCAT17((byte)((ulong)uVar105 >> 0x38) & bVar58 |
                                    (byte)((ulong)uVar97 >> 0x38) & bVar34,
                                    CONCAT16((byte)((ulong)uVar105 >> 0x30) & bVar57 |
                                             (byte)((ulong)uVar97 >> 0x30) & bVar33,
                                             CONCAT15((byte)((ulong)uVar105 >> 0x28) & bVar56 |
                                                      (byte)((ulong)uVar97 >> 0x28) & bVar32,
                                                      CONCAT14((byte)((ulong)uVar105 >> 0x20) &
                                                               bVar55 | (byte)((ulong)uVar97 >> 0x20
                                                                              ) & bVar31,
                                                               CONCAT13((byte)((ulong)uVar105 >>
                                                                              0x18) & bVar54 |
                                                                        (byte)((ulong)uVar97 >> 0x18
                                                                              ) & bVar30,
                                                                        CONCAT12((byte)((ulong)
                                                  uVar105 >> 0x10) & bVar53 |
                                                  (byte)((ulong)uVar97 >> 0x10) & bVar29,
                                                  CONCAT11((byte)((ulong)uVar105 >> 8) & bVar52 |
                                                           (byte)((ulong)uVar97 >> 8) & bVar28,
                                                           (byte)uVar105 & bVar51 |
                                                           (byte)uVar97 & bVar27)))))));
              uVar20 = uVar20 - 8;
              puVar26 = puVar26 + 8;
              puVar19 = puVar19 + 8;
            } while (uVar20 != 0);
            uVar20 = uVar13;
            if (uVar13 == unaff_x23) goto code_r0x002a6450;
          }
          lVar6 = unaff_x23 - uVar20;
          puVar15 = (ulong *)(uVar17 + uVar20 * 8);
          puVar21 = (ulong *)(uVar7 + uVar20 * 8);
          do {
            *puVar15 = *puVar15 & uVar16 | *puVar21 & uVar14;
            lVar6 = lVar6 + -1;
            puVar15 = puVar15 + 1;
            puVar21 = puVar21 + 1;
          } while (lVar6 != 0);
        }
code_r0x002a6450:
        func_0x00382c70(uVar7,**(undefined8 **)(unaff_x29 + -0x68),
                        **(undefined8 **)(unaff_x29 + -0x60),pcVar24);
        param_4 = pcVar24;
        func_0x00382cc0(*in_stack_00000060,*in_stack_00000068,*unaff_x24);
        param_3 = (char *)*in_stack_00000068;
        if (unaff_w26 != 0) {
          puVar18 = (undefined1 *)*in_stack_00000060;
          uVar7 = ~uVar11;
          if ((unaff_w26 < 8) ||
             (param_3 < puVar18 + (long)pcVar24 * 8 && puVar18 < param_3 + (long)pcVar24 * 8)) {
            pcVar23 = (char *)0x0;
code_r0x002a653c:
            lVar6 = (long)pcVar24 - (long)pcVar23;
            puVar15 = (ulong *)(puVar18 + (long)pcVar23 * 8);
            pcVar23 = param_3 + (long)pcVar23 * 8;
            do {
              *(ulong *)pcVar23 = *puVar15 & uVar7 | *(ulong *)pcVar23 & uVar11;
              lVar6 = lVar6 + -1;
              puVar15 = puVar15 + 1;
              pcVar23 = pcVar23 + 8;
            } while (lVar6 != 0);
          }
          else {
            puVar26 = (undefined8 *)(puVar18 + 0x20);
            pqVar22 = (qword *)(param_3 + 0x20);
            pcVar23 = pcVar12;
            do {
              uVar10 = pqVar22[-3];
              uVar9 = pqVar22[-4];
              qVar85 = pqVar22[-1];
              uVar76 = pqVar22[-2];
              uVar86 = pqVar22[1];
              qVar95 = *pqVar22;
              uVar96 = pqVar22[3];
              uVar94 = pqVar22[2];
              uVar98 = puVar26[-3];
              uVar97 = puVar26[-4];
              uVar100 = puVar26[-1];
              uVar99 = puVar26[-2];
              uVar102 = puVar26[1];
              uVar101 = *puVar26;
              uVar104 = puVar26[3];
              uVar103 = puVar26[2];
              bVar51 = (byte)uVar7;
              bVar52 = (byte)(uVar7 >> 8);
              bVar53 = (byte)(uVar7 >> 0x10);
              bVar54 = (byte)(uVar7 >> 0x18);
              bVar55 = (byte)(uVar7 >> 0x20);
              bVar56 = (byte)(uVar7 >> 0x28);
              bVar57 = (byte)(uVar7 >> 0x30);
              bVar58 = (byte)(uVar7 >> 0x38);
              pqVar22[-3] = CONCAT17((byte)((ulong)uVar98 >> 0x38) & bVar58 |
                                     (byte)((ulong)uVar10 >> 0x38) & bVar50,
                                     CONCAT16((byte)((ulong)uVar98 >> 0x30) & bVar57 |
                                              (byte)((ulong)uVar10 >> 0x30) & bVar49,
                                              CONCAT15((byte)((ulong)uVar98 >> 0x28) & bVar56 |
                                                       (byte)((ulong)uVar10 >> 0x28) & bVar48,
                                                       CONCAT14((byte)((ulong)uVar98 >> 0x20) &
                                                                bVar55 | (byte)((ulong)uVar10 >>
                                                                               0x20) & bVar47,
                                                                CONCAT13((byte)((ulong)uVar98 >>
                                                                               0x18) & bVar54 |
                                                                         (byte)((ulong)uVar10 >>
                                                                               0x18) & bVar46,
                                                                         CONCAT12((byte)((ulong)
                                                  uVar98 >> 0x10) & bVar53 |
                                                  (byte)((ulong)uVar10 >> 0x10) & bVar45,
                                                  CONCAT11((byte)((ulong)uVar98 >> 8) & bVar52 |
                                                           (byte)((ulong)uVar10 >> 8) & bVar44,
                                                           (byte)uVar98 & bVar51 |
                                                           (byte)uVar10 & bVar43)))))));
              pqVar22[-4] = CONCAT17((byte)((ulong)uVar97 >> 0x38) & bVar58 |
                                     (byte)((ulong)uVar9 >> 0x38) & bVar50,
                                     CONCAT16((byte)((ulong)uVar97 >> 0x30) & bVar57 |
                                              (byte)((ulong)uVar9 >> 0x30) & bVar49,
                                              CONCAT15((byte)((ulong)uVar97 >> 0x28) & bVar56 |
                                                       (byte)((ulong)uVar9 >> 0x28) & bVar48,
                                                       CONCAT14((byte)((ulong)uVar97 >> 0x20) &
                                                                bVar55 | (byte)((ulong)uVar9 >> 0x20
                                                                               ) & bVar47,
                                                                CONCAT13((byte)((ulong)uVar97 >>
                                                                               0x18) & bVar54 |
                                                                         (byte)((ulong)uVar9 >> 0x18
                                                                               ) & bVar46,
                                                                         CONCAT12((byte)((ulong)
                                                  uVar97 >> 0x10) & bVar53 |
                                                  (byte)((ulong)uVar9 >> 0x10) & bVar45,
                                                  CONCAT11((byte)((ulong)uVar97 >> 8) & bVar52 |
                                                           (byte)((ulong)uVar9 >> 8) & bVar44,
                                                           (byte)uVar97 & bVar51 |
                                                           (byte)uVar9 & bVar43)))))));
              pqVar22[-1] = CONCAT17((byte)((ulong)uVar100 >> 0x38) & bVar58 |
                                     (byte)(qVar85 >> 0x38) & bVar50,
                                     CONCAT16((byte)((ulong)uVar100 >> 0x30) & bVar57 |
                                              (byte)(qVar85 >> 0x30) & bVar49,
                                              CONCAT15((byte)((ulong)uVar100 >> 0x28) & bVar56 |
                                                       (byte)(qVar85 >> 0x28) & bVar48,
                                                       CONCAT14((byte)((ulong)uVar100 >> 0x20) &
                                                                bVar55 | (byte)(qVar85 >> 0x20) &
                                                                         bVar47,
                                                                CONCAT13((byte)((ulong)uVar100 >>
                                                                               0x18) & bVar54 |
                                                                         (byte)(qVar85 >> 0x18) &
                                                                         bVar46,CONCAT12((byte)((
                                                  ulong)uVar100 >> 0x10) & bVar53 |
                                                  (byte)(qVar85 >> 0x10) & bVar45,
                                                  CONCAT11((byte)((ulong)uVar100 >> 8) & bVar52 |
                                                           (byte)(qVar85 >> 8) & bVar44,
                                                           (byte)uVar100 & bVar51 |
                                                           (byte)qVar85 & bVar43)))))));
              pqVar22[-2] = CONCAT17((byte)((ulong)uVar99 >> 0x38) & bVar58 |
                                     (byte)((ulong)uVar76 >> 0x38) & bVar50,
                                     CONCAT16((byte)((ulong)uVar99 >> 0x30) & bVar57 |
                                              (byte)((ulong)uVar76 >> 0x30) & bVar49,
                                              CONCAT15((byte)((ulong)uVar99 >> 0x28) & bVar56 |
                                                       (byte)((ulong)uVar76 >> 0x28) & bVar48,
                                                       CONCAT14((byte)((ulong)uVar99 >> 0x20) &
                                                                bVar55 | (byte)((ulong)uVar76 >>
                                                                               0x20) & bVar47,
                                                                CONCAT13((byte)((ulong)uVar99 >>
                                                                               0x18) & bVar54 |
                                                                         (byte)((ulong)uVar76 >>
                                                                               0x18) & bVar46,
                                                                         CONCAT12((byte)((ulong)
                                                  uVar99 >> 0x10) & bVar53 |
                                                  (byte)((ulong)uVar76 >> 0x10) & bVar45,
                                                  CONCAT11((byte)((ulong)uVar99 >> 8) & bVar52 |
                                                           (byte)((ulong)uVar76 >> 8) & bVar44,
                                                           (byte)uVar99 & bVar51 |
                                                           (byte)uVar76 & bVar43)))))));
              pqVar22[1] = CONCAT17((byte)((ulong)uVar102 >> 0x38) & bVar58 |
                                    (byte)((ulong)uVar86 >> 0x38) & bVar50,
                                    CONCAT16((byte)((ulong)uVar102 >> 0x30) & bVar57 |
                                             (byte)((ulong)uVar86 >> 0x30) & bVar49,
                                             CONCAT15((byte)((ulong)uVar102 >> 0x28) & bVar56 |
                                                      (byte)((ulong)uVar86 >> 0x28) & bVar48,
                                                      CONCAT14((byte)((ulong)uVar102 >> 0x20) &
                                                               bVar55 | (byte)((ulong)uVar86 >> 0x20
                                                                              ) & bVar47,
                                                               CONCAT13((byte)((ulong)uVar102 >>
                                                                              0x18) & bVar54 |
                                                                        (byte)((ulong)uVar86 >> 0x18
                                                                              ) & bVar46,
                                                                        CONCAT12((byte)((ulong)
                                                  uVar102 >> 0x10) & bVar53 |
                                                  (byte)((ulong)uVar86 >> 0x10) & bVar45,
                                                  CONCAT11((byte)((ulong)uVar102 >> 8) & bVar52 |
                                                           (byte)((ulong)uVar86 >> 8) & bVar44,
                                                           (byte)uVar102 & bVar51 |
                                                           (byte)uVar86 & bVar43)))))));
              *pqVar22 = CONCAT17((byte)((ulong)uVar101 >> 0x38) & bVar58 |
                                  (byte)(qVar95 >> 0x38) & bVar50,
                                  CONCAT16((byte)((ulong)uVar101 >> 0x30) & bVar57 |
                                           (byte)(qVar95 >> 0x30) & bVar49,
                                           CONCAT15((byte)((ulong)uVar101 >> 0x28) & bVar56 |
                                                    (byte)(qVar95 >> 0x28) & bVar48,
                                                    CONCAT14((byte)((ulong)uVar101 >> 0x20) & bVar55
                                                             | (byte)(qVar95 >> 0x20) & bVar47,
                                                             CONCAT13((byte)((ulong)uVar101 >> 0x18)
                                                                      & bVar54 |
                                                                      (byte)(qVar95 >> 0x18) &
                                                                      bVar46,CONCAT12((byte)((ulong)
                                                  uVar101 >> 0x10) & bVar53 |
                                                  (byte)(qVar95 >> 0x10) & bVar45,
                                                  CONCAT11((byte)((ulong)uVar101 >> 8) & bVar52 |
                                                           (byte)(qVar95 >> 8) & bVar44,
                                                           (byte)uVar101 & bVar51 |
                                                           (byte)qVar95 & bVar43)))))));
              pqVar22[3] = CONCAT17((byte)((ulong)uVar104 >> 0x38) & bVar58 |
                                    (byte)((ulong)uVar96 >> 0x38) & bVar50,
                                    CONCAT16((byte)((ulong)uVar104 >> 0x30) & bVar57 |
                                             (byte)((ulong)uVar96 >> 0x30) & bVar49,
                                             CONCAT15((byte)((ulong)uVar104 >> 0x28) & bVar56 |
                                                      (byte)((ulong)uVar96 >> 0x28) & bVar48,
                                                      CONCAT14((byte)((ulong)uVar104 >> 0x20) &
                                                               bVar55 | (byte)((ulong)uVar96 >> 0x20
                                                                              ) & bVar47,
                                                               CONCAT13((byte)((ulong)uVar104 >>
                                                                              0x18) & bVar54 |
                                                                        (byte)((ulong)uVar96 >> 0x18
                                                                              ) & bVar46,
                                                                        CONCAT12((byte)((ulong)
                                                  uVar104 >> 0x10) & bVar53 |
                                                  (byte)((ulong)uVar96 >> 0x10) & bVar45,
                                                  CONCAT11((byte)((ulong)uVar104 >> 8) & bVar52 |
                                                           (byte)((ulong)uVar96 >> 8) & bVar44,
                                                           (byte)uVar104 & bVar51 |
                                                           (byte)uVar96 & bVar43)))))));
              pqVar22[2] = CONCAT17((byte)((ulong)uVar103 >> 0x38) & bVar58 |
                                    (byte)((ulong)uVar94 >> 0x38) & bVar50,
                                    CONCAT16((byte)((ulong)uVar103 >> 0x30) & bVar57 |
                                             (byte)((ulong)uVar94 >> 0x30) & bVar49,
                                             CONCAT15((byte)((ulong)uVar103 >> 0x28) & bVar56 |
                                                      (byte)((ulong)uVar94 >> 0x28) & bVar48,
                                                      CONCAT14((byte)((ulong)uVar103 >> 0x20) &
                                                               bVar55 | (byte)((ulong)uVar94 >> 0x20
                                                                              ) & bVar47,
                                                               CONCAT13((byte)((ulong)uVar103 >>
                                                                              0x18) & bVar54 |
                                                                        (byte)((ulong)uVar94 >> 0x18
                                                                              ) & bVar46,
                                                                        CONCAT12((byte)((ulong)
                                                  uVar103 >> 0x10) & bVar53 |
                                                  (byte)((ulong)uVar94 >> 0x10) & bVar45,
                                                  CONCAT11((byte)((ulong)uVar103 >> 8) & bVar52 |
                                                           (byte)((ulong)uVar94 >> 8) & bVar44,
                                                           (byte)uVar103 & bVar51 |
                                                           (byte)uVar94 & bVar43)))))));
              pcVar23 = pcVar23 + -8;
              puVar26 = puVar26 + 8;
              pqVar22 = pqVar22 + 8;
            } while (pcVar23 != (char *)0x0);
            pcVar23 = pcVar12;
            if (pcVar12 != pcVar24) goto code_r0x002a653c;
          }
          puVar18 = (undefined1 *)**(undefined8 **)(unaff_x29 + -0x68);
          uVar7 = ~uVar25;
          if ((unaff_w26 < 8) ||
             (puVar18 < param_3 + (long)pcVar24 * 8 && param_3 < puVar18 + (long)pcVar24 * 8)) {
            pcVar23 = (char *)0x0;
code_r0x002a661c:
            lVar6 = (long)pcVar24 - (long)pcVar23;
            puVar15 = (ulong *)(puVar18 + (long)pcVar23 * 8);
            pcVar23 = param_3 + (long)pcVar23 * 8;
            do {
              *puVar15 = *puVar15 & uVar7 | *(ulong *)pcVar23 & uVar25;
              lVar6 = lVar6 + -1;
              puVar15 = puVar15 + 1;
              pcVar23 = pcVar23 + 8;
            } while (lVar6 != 0);
          }
          else {
            puVar26 = (undefined8 *)(puVar18 + 0x20);
            pqVar22 = (qword *)(param_3 + 0x20);
            pcVar23 = pcVar12;
            do {
              uVar10 = pqVar22[-3];
              uVar9 = pqVar22[-4];
              qVar85 = pqVar22[-1];
              uVar76 = pqVar22[-2];
              uVar86 = pqVar22[1];
              qVar95 = *pqVar22;
              uVar96 = pqVar22[3];
              uVar94 = pqVar22[2];
              uVar98 = puVar26[-3];
              uVar97 = puVar26[-4];
              uVar100 = puVar26[-1];
              uVar99 = puVar26[-2];
              uVar102 = puVar26[1];
              uVar101 = *puVar26;
              uVar104 = puVar26[3];
              uVar103 = puVar26[2];
              bVar43 = (byte)uVar7;
              bVar44 = (byte)(uVar7 >> 8);
              bVar45 = (byte)(uVar7 >> 0x10);
              bVar46 = (byte)(uVar7 >> 0x18);
              bVar47 = (byte)(uVar7 >> 0x20);
              bVar48 = (byte)(uVar7 >> 0x28);
              bVar49 = (byte)(uVar7 >> 0x30);
              bVar50 = (byte)(uVar7 >> 0x38);
              puVar26[-3] = CONCAT17((byte)((ulong)uVar98 >> 0x38) & bVar50 |
                                     (byte)((ulong)uVar10 >> 0x38) & bVar42,
                                     CONCAT16((byte)((ulong)uVar98 >> 0x30) & bVar49 |
                                              (byte)((ulong)uVar10 >> 0x30) & bVar41,
                                              CONCAT15((byte)((ulong)uVar98 >> 0x28) & bVar48 |
                                                       (byte)((ulong)uVar10 >> 0x28) & bVar40,
                                                       CONCAT14((byte)((ulong)uVar98 >> 0x20) &
                                                                bVar47 | (byte)((ulong)uVar10 >>
                                                                               0x20) & bVar39,
                                                                CONCAT13((byte)((ulong)uVar98 >>
                                                                               0x18) & bVar46 |
                                                                         (byte)((ulong)uVar10 >>
                                                                               0x18) & bVar38,
                                                                         CONCAT12((byte)((ulong)
                                                  uVar98 >> 0x10) & bVar45 |
                                                  (byte)((ulong)uVar10 >> 0x10) & bVar37,
                                                  CONCAT11((byte)((ulong)uVar98 >> 8) & bVar44 |
                                                           (byte)((ulong)uVar10 >> 8) & bVar36,
                                                           (byte)uVar98 & bVar43 |
                                                           (byte)uVar10 & bVar35)))))));
              puVar26[-4] = CONCAT17((byte)((ulong)uVar97 >> 0x38) & bVar50 |
                                     (byte)((ulong)uVar9 >> 0x38) & bVar42,
                                     CONCAT16((byte)((ulong)uVar97 >> 0x30) & bVar49 |
                                              (byte)((ulong)uVar9 >> 0x30) & bVar41,
                                              CONCAT15((byte)((ulong)uVar97 >> 0x28) & bVar48 |
                                                       (byte)((ulong)uVar9 >> 0x28) & bVar40,
                                                       CONCAT14((byte)((ulong)uVar97 >> 0x20) &
                                                                bVar47 | (byte)((ulong)uVar9 >> 0x20
                                                                               ) & bVar39,
                                                                CONCAT13((byte)((ulong)uVar97 >>
                                                                               0x18) & bVar46 |
                                                                         (byte)((ulong)uVar9 >> 0x18
                                                                               ) & bVar38,
                                                                         CONCAT12((byte)((ulong)
                                                  uVar97 >> 0x10) & bVar45 |
                                                  (byte)((ulong)uVar9 >> 0x10) & bVar37,
                                                  CONCAT11((byte)((ulong)uVar97 >> 8) & bVar44 |
                                                           (byte)((ulong)uVar9 >> 8) & bVar36,
                                                           (byte)uVar97 & bVar43 |
                                                           (byte)uVar9 & bVar35)))))));
              puVar26[-1] = CONCAT17((byte)((ulong)uVar100 >> 0x38) & bVar50 |
                                     (byte)(qVar85 >> 0x38) & bVar42,
                                     CONCAT16((byte)((ulong)uVar100 >> 0x30) & bVar49 |
                                              (byte)(qVar85 >> 0x30) & bVar41,
                                              CONCAT15((byte)((ulong)uVar100 >> 0x28) & bVar48 |
                                                       (byte)(qVar85 >> 0x28) & bVar40,
                                                       CONCAT14((byte)((ulong)uVar100 >> 0x20) &
                                                                bVar47 | (byte)(qVar85 >> 0x20) &
                                                                         bVar39,
                                                                CONCAT13((byte)((ulong)uVar100 >>
                                                                               0x18) & bVar46 |
                                                                         (byte)(qVar85 >> 0x18) &
                                                                         bVar38,CONCAT12((byte)((
                                                  ulong)uVar100 >> 0x10) & bVar45 |
                                                  (byte)(qVar85 >> 0x10) & bVar37,
                                                  CONCAT11((byte)((ulong)uVar100 >> 8) & bVar44 |
                                                           (byte)(qVar85 >> 8) & bVar36,
                                                           (byte)uVar100 & bVar43 |
                                                           (byte)qVar85 & bVar35)))))));
              puVar26[-2] = CONCAT17((byte)((ulong)uVar99 >> 0x38) & bVar50 |
                                     (byte)((ulong)uVar76 >> 0x38) & bVar42,
                                     CONCAT16((byte)((ulong)uVar99 >> 0x30) & bVar49 |
                                              (byte)((ulong)uVar76 >> 0x30) & bVar41,
                                              CONCAT15((byte)((ulong)uVar99 >> 0x28) & bVar48 |
                                                       (byte)((ulong)uVar76 >> 0x28) & bVar40,
                                                       CONCAT14((byte)((ulong)uVar99 >> 0x20) &
                                                                bVar47 | (byte)((ulong)uVar76 >>
                                                                               0x20) & bVar39,
                                                                CONCAT13((byte)((ulong)uVar99 >>
                                                                               0x18) & bVar46 |
                                                                         (byte)((ulong)uVar76 >>
                                                                               0x18) & bVar38,
                                                                         CONCAT12((byte)((ulong)
                                                  uVar99 >> 0x10) & bVar45 |
                                                  (byte)((ulong)uVar76 >> 0x10) & bVar37,
                                                  CONCAT11((byte)((ulong)uVar99 >> 8) & bVar44 |
                                                           (byte)((ulong)uVar76 >> 8) & bVar36,
                                                           (byte)uVar99 & bVar43 |
                                                           (byte)uVar76 & bVar35)))))));
              puVar26[1] = CONCAT17((byte)((ulong)uVar102 >> 0x38) & bVar50 |
                                    (byte)((ulong)uVar86 >> 0x38) & bVar42,
                                    CONCAT16((byte)((ulong)uVar102 >> 0x30) & bVar49 |
                                             (byte)((ulong)uVar86 >> 0x30) & bVar41,
                                             CONCAT15((byte)((ulong)uVar102 >> 0x28) & bVar48 |
                                                      (byte)((ulong)uVar86 >> 0x28) & bVar40,
                                                      CONCAT14((byte)((ulong)uVar102 >> 0x20) &
                                                               bVar47 | (byte)((ulong)uVar86 >> 0x20
                                                                              ) & bVar39,
                                                               CONCAT13((byte)((ulong)uVar102 >>
                                                                              0x18) & bVar46 |
                                                                        (byte)((ulong)uVar86 >> 0x18
                                                                              ) & bVar38,
                                                                        CONCAT12((byte)((ulong)
                                                  uVar102 >> 0x10) & bVar45 |
                                                  (byte)((ulong)uVar86 >> 0x10) & bVar37,
                                                  CONCAT11((byte)((ulong)uVar102 >> 8) & bVar44 |
                                                           (byte)((ulong)uVar86 >> 8) & bVar36,
                                                           (byte)uVar102 & bVar43 |
                                                           (byte)uVar86 & bVar35)))))));
              *puVar26 = CONCAT17((byte)((ulong)uVar101 >> 0x38) & bVar50 |
                                  (byte)(qVar95 >> 0x38) & bVar42,
                                  CONCAT16((byte)((ulong)uVar101 >> 0x30) & bVar49 |
                                           (byte)(qVar95 >> 0x30) & bVar41,
                                           CONCAT15((byte)((ulong)uVar101 >> 0x28) & bVar48 |
                                                    (byte)(qVar95 >> 0x28) & bVar40,
                                                    CONCAT14((byte)((ulong)uVar101 >> 0x20) & bVar47
                                                             | (byte)(qVar95 >> 0x20) & bVar39,
                                                             CONCAT13((byte)((ulong)uVar101 >> 0x18)
                                                                      & bVar46 |
                                                                      (byte)(qVar95 >> 0x18) &
                                                                      bVar38,CONCAT12((byte)((ulong)
                                                  uVar101 >> 0x10) & bVar45 |
                                                  (byte)(qVar95 >> 0x10) & bVar37,
                                                  CONCAT11((byte)((ulong)uVar101 >> 8) & bVar44 |
                                                           (byte)(qVar95 >> 8) & bVar36,
                                                           (byte)uVar101 & bVar43 |
                                                           (byte)qVar95 & bVar35)))))));
              puVar26[3] = CONCAT17((byte)((ulong)uVar104 >> 0x38) & bVar50 |
                                    (byte)((ulong)uVar96 >> 0x38) & bVar42,
                                    CONCAT16((byte)((ulong)uVar104 >> 0x30) & bVar49 |
                                             (byte)((ulong)uVar96 >> 0x30) & bVar41,
                                             CONCAT15((byte)((ulong)uVar104 >> 0x28) & bVar48 |
                                                      (byte)((ulong)uVar96 >> 0x28) & bVar40,
                                                      CONCAT14((byte)((ulong)uVar104 >> 0x20) &
                                                               bVar47 | (byte)((ulong)uVar96 >> 0x20
                                                                              ) & bVar39,
                                                               CONCAT13((byte)((ulong)uVar104 >>
                                                                              0x18) & bVar46 |
                                                                        (byte)((ulong)uVar96 >> 0x18
                                                                              ) & bVar38,
                                                                        CONCAT12((byte)((ulong)
                                                  uVar104 >> 0x10) & bVar45 |
                                                  (byte)((ulong)uVar96 >> 0x10) & bVar37,
                                                  CONCAT11((byte)((ulong)uVar104 >> 8) & bVar44 |
                                                           (byte)((ulong)uVar96 >> 8) & bVar36,
                                                           (byte)uVar104 & bVar43 |
                                                           (byte)uVar96 & bVar35)))))));
              puVar26[2] = CONCAT17((byte)((ulong)uVar103 >> 0x38) & bVar50 |
                                    (byte)((ulong)uVar94 >> 0x38) & bVar42,
                                    CONCAT16((byte)((ulong)uVar103 >> 0x30) & bVar49 |
                                             (byte)((ulong)uVar94 >> 0x30) & bVar41,
                                             CONCAT15((byte)((ulong)uVar103 >> 0x28) & bVar48 |
                                                      (byte)((ulong)uVar94 >> 0x28) & bVar40,
                                                      CONCAT14((byte)((ulong)uVar103 >> 0x20) &
                                                               bVar47 | (byte)((ulong)uVar94 >> 0x20
                                                                              ) & bVar39,
                                                               CONCAT13((byte)((ulong)uVar103 >>
                                                                              0x18) & bVar46 |
                                                                        (byte)((ulong)uVar94 >> 0x18
                                                                              ) & bVar38,
                                                                        CONCAT12((byte)((ulong)
                                                  uVar103 >> 0x10) & bVar45 |
                                                  (byte)((ulong)uVar94 >> 0x10) & bVar37,
                                                  CONCAT11((byte)((ulong)uVar103 >> 8) & bVar44 |
                                                           (byte)((ulong)uVar94 >> 8) & bVar36,
                                                           (byte)uVar103 & bVar43 |
                                                           (byte)uVar94 & bVar35)))))));
              pcVar23 = pcVar23 + -8;
              puVar26 = puVar26 + 8;
              pqVar22 = pqVar22 + 8;
            } while (pcVar23 != (char *)0x0);
            pcVar23 = pcVar12;
            if (pcVar12 != pcVar24) goto code_r0x002a661c;
          }
          puVar18 = (undefined1 *)**(undefined8 **)(unaff_x29 + -0x60);
          uVar7 = ~uVar14;
          if ((unaff_w26 < 8) ||
             (puVar18 < param_3 + (long)pcVar24 * 8 && param_3 < puVar18 + (long)pcVar24 * 8)) {
            pcVar23 = (char *)0x0;
          }
          else {
            puVar26 = (undefined8 *)(puVar18 + 0x20);
            pqVar22 = (qword *)(param_3 + 0x20);
            pcVar23 = pcVar12;
            do {
              uVar10 = pqVar22[-3];
              uVar9 = pqVar22[-4];
              qVar85 = pqVar22[-1];
              uVar76 = pqVar22[-2];
              uVar86 = pqVar22[1];
              qVar95 = *pqVar22;
              uVar96 = pqVar22[3];
              uVar94 = pqVar22[2];
              uVar98 = puVar26[-3];
              uVar97 = puVar26[-4];
              uVar100 = puVar26[-1];
              uVar99 = puVar26[-2];
              uVar102 = puVar26[1];
              uVar101 = *puVar26;
              uVar104 = puVar26[3];
              uVar103 = puVar26[2];
              bVar35 = (byte)uVar7;
              bVar36 = (byte)(uVar7 >> 8);
              bVar37 = (byte)(uVar7 >> 0x10);
              bVar38 = (byte)(uVar7 >> 0x18);
              bVar39 = (byte)(uVar7 >> 0x20);
              bVar40 = (byte)(uVar7 >> 0x28);
              bVar41 = (byte)(uVar7 >> 0x30);
              bVar42 = (byte)(uVar7 >> 0x38);
              puVar26[-3] = CONCAT17((byte)((ulong)uVar98 >> 0x38) & bVar42 |
                                     (byte)((ulong)uVar10 >> 0x38) & bVar34,
                                     CONCAT16((byte)((ulong)uVar98 >> 0x30) & bVar41 |
                                              (byte)((ulong)uVar10 >> 0x30) & bVar33,
                                              CONCAT15((byte)((ulong)uVar98 >> 0x28) & bVar40 |
                                                       (byte)((ulong)uVar10 >> 0x28) & bVar32,
                                                       CONCAT14((byte)((ulong)uVar98 >> 0x20) &
                                                                bVar39 | (byte)((ulong)uVar10 >>
                                                                               0x20) & bVar31,
                                                                CONCAT13((byte)((ulong)uVar98 >>
                                                                               0x18) & bVar38 |
                                                                         (byte)((ulong)uVar10 >>
                                                                               0x18) & bVar30,
                                                                         CONCAT12((byte)((ulong)
                                                  uVar98 >> 0x10) & bVar37 |
                                                  (byte)((ulong)uVar10 >> 0x10) & bVar29,
                                                  CONCAT11((byte)((ulong)uVar98 >> 8) & bVar36 |
                                                           (byte)((ulong)uVar10 >> 8) & bVar28,
                                                           (byte)uVar98 & bVar35 |
                                                           (byte)uVar10 & bVar27)))))));
              puVar26[-4] = CONCAT17((byte)((ulong)uVar97 >> 0x38) & bVar42 |
                                     (byte)((ulong)uVar9 >> 0x38) & bVar34,
                                     CONCAT16((byte)((ulong)uVar97 >> 0x30) & bVar41 |
                                              (byte)((ulong)uVar9 >> 0x30) & bVar33,
                                              CONCAT15((byte)((ulong)uVar97 >> 0x28) & bVar40 |
                                                       (byte)((ulong)uVar9 >> 0x28) & bVar32,
                                                       CONCAT14((byte)((ulong)uVar97 >> 0x20) &
                                                                bVar39 | (byte)((ulong)uVar9 >> 0x20
                                                                               ) & bVar31,
                                                                CONCAT13((byte)((ulong)uVar97 >>
                                                                               0x18) & bVar38 |
                                                                         (byte)((ulong)uVar9 >> 0x18
                                                                               ) & bVar30,
                                                                         CONCAT12((byte)((ulong)
                                                  uVar97 >> 0x10) & bVar37 |
                                                  (byte)((ulong)uVar9 >> 0x10) & bVar29,
                                                  CONCAT11((byte)((ulong)uVar97 >> 8) & bVar36 |
                                                           (byte)((ulong)uVar9 >> 8) & bVar28,
                                                           (byte)uVar97 & bVar35 |
                                                           (byte)uVar9 & bVar27)))))));
              puVar26[-1] = CONCAT17((byte)((ulong)uVar100 >> 0x38) & bVar42 |
                                     (byte)(qVar85 >> 0x38) & bVar34,
                                     CONCAT16((byte)((ulong)uVar100 >> 0x30) & bVar41 |
                                              (byte)(qVar85 >> 0x30) & bVar33,
                                              CONCAT15((byte)((ulong)uVar100 >> 0x28) & bVar40 |
                                                       (byte)(qVar85 >> 0x28) & bVar32,
                                                       CONCAT14((byte)((ulong)uVar100 >> 0x20) &
                                                                bVar39 | (byte)(qVar85 >> 0x20) &
                                                                         bVar31,
                                                                CONCAT13((byte)((ulong)uVar100 >>
                                                                               0x18) & bVar38 |
                                                                         (byte)(qVar85 >> 0x18) &
                                                                         bVar30,CONCAT12((byte)((
                                                  ulong)uVar100 >> 0x10) & bVar37 |
                                                  (byte)(qVar85 >> 0x10) & bVar29,
                                                  CONCAT11((byte)((ulong)uVar100 >> 8) & bVar36 |
                                                           (byte)(qVar85 >> 8) & bVar28,
                                                           (byte)uVar100 & bVar35 |
                                                           (byte)qVar85 & bVar27)))))));
              puVar26[-2] = CONCAT17((byte)((ulong)uVar99 >> 0x38) & bVar42 |
                                     (byte)((ulong)uVar76 >> 0x38) & bVar34,
                                     CONCAT16((byte)((ulong)uVar99 >> 0x30) & bVar41 |
                                              (byte)((ulong)uVar76 >> 0x30) & bVar33,
                                              CONCAT15((byte)((ulong)uVar99 >> 0x28) & bVar40 |
                                                       (byte)((ulong)uVar76 >> 0x28) & bVar32,
                                                       CONCAT14((byte)((ulong)uVar99 >> 0x20) &
                                                                bVar39 | (byte)((ulong)uVar76 >>
                                                                               0x20) & bVar31,
                                                                CONCAT13((byte)((ulong)uVar99 >>
                                                                               0x18) & bVar38 |
                                                                         (byte)((ulong)uVar76 >>
                                                                               0x18) & bVar30,
                                                                         CONCAT12((byte)((ulong)
                                                  uVar99 >> 0x10) & bVar37 |
                                                  (byte)((ulong)uVar76 >> 0x10) & bVar29,
                                                  CONCAT11((byte)((ulong)uVar99 >> 8) & bVar36 |
                                                           (byte)((ulong)uVar76 >> 8) & bVar28,
                                                           (byte)uVar99 & bVar35 |
                                                           (byte)uVar76 & bVar27)))))));
              puVar26[1] = CONCAT17((byte)((ulong)uVar102 >> 0x38) & bVar42 |
                                    (byte)((ulong)uVar86 >> 0x38) & bVar34,
                                    CONCAT16((byte)((ulong)uVar102 >> 0x30) & bVar41 |
                                             (byte)((ulong)uVar86 >> 0x30) & bVar33,
                                             CONCAT15((byte)((ulong)uVar102 >> 0x28) & bVar40 |
                                                      (byte)((ulong)uVar86 >> 0x28) & bVar32,
                                                      CONCAT14((byte)((ulong)uVar102 >> 0x20) &
                                                               bVar39 | (byte)((ulong)uVar86 >> 0x20
                                                                              ) & bVar31,
                                                               CONCAT13((byte)((ulong)uVar102 >>
                                                                              0x18) & bVar38 |
                                                                        (byte)((ulong)uVar86 >> 0x18
                                                                              ) & bVar30,
                                                                        CONCAT12((byte)((ulong)
                                                  uVar102 >> 0x10) & bVar37 |
                                                  (byte)((ulong)uVar86 >> 0x10) & bVar29,
                                                  CONCAT11((byte)((ulong)uVar102 >> 8) & bVar36 |
                                                           (byte)((ulong)uVar86 >> 8) & bVar28,
                                                           (byte)uVar102 & bVar35 |
                                                           (byte)uVar86 & bVar27)))))));
              *puVar26 = CONCAT17((byte)((ulong)uVar101 >> 0x38) & bVar42 |
                                  (byte)(qVar95 >> 0x38) & bVar34,
                                  CONCAT16((byte)((ulong)uVar101 >> 0x30) & bVar41 |
                                           (byte)(qVar95 >> 0x30) & bVar33,
                                           CONCAT15((byte)((ulong)uVar101 >> 0x28) & bVar40 |
                                                    (byte)(qVar95 >> 0x28) & bVar32,
                                                    CONCAT14((byte)((ulong)uVar101 >> 0x20) & bVar39
                                                             | (byte)(qVar95 >> 0x20) & bVar31,
                                                             CONCAT13((byte)((ulong)uVar101 >> 0x18)
                                                                      & bVar38 |
                                                                      (byte)(qVar95 >> 0x18) &
                                                                      bVar30,CONCAT12((byte)((ulong)
                                                  uVar101 >> 0x10) & bVar37 |
                                                  (byte)(qVar95 >> 0x10) & bVar29,
                                                  CONCAT11((byte)((ulong)uVar101 >> 8) & bVar36 |
                                                           (byte)(qVar95 >> 8) & bVar28,
                                                           (byte)uVar101 & bVar35 |
                                                           (byte)qVar95 & bVar27)))))));
              puVar26[3] = CONCAT17((byte)((ulong)uVar104 >> 0x38) & bVar42 |
                                    (byte)((ulong)uVar96 >> 0x38) & bVar34,
                                    CONCAT16((byte)((ulong)uVar104 >> 0x30) & bVar41 |
                                             (byte)((ulong)uVar96 >> 0x30) & bVar33,
                                             CONCAT15((byte)((ulong)uVar104 >> 0x28) & bVar40 |
                                                      (byte)((ulong)uVar96 >> 0x28) & bVar32,
                                                      CONCAT14((byte)((ulong)uVar104 >> 0x20) &
                                                               bVar39 | (byte)((ulong)uVar96 >> 0x20
                                                                              ) & bVar31,
                                                               CONCAT13((byte)((ulong)uVar104 >>
                                                                              0x18) & bVar38 |
                                                                        (byte)((ulong)uVar96 >> 0x18
                                                                              ) & bVar30,
                                                                        CONCAT12((byte)((ulong)
                                                  uVar104 >> 0x10) & bVar37 |
                                                  (byte)((ulong)uVar96 >> 0x10) & bVar29,
                                                  CONCAT11((byte)((ulong)uVar104 >> 8) & bVar36 |
                                                           (byte)((ulong)uVar96 >> 8) & bVar28,
                                                           (byte)uVar104 & bVar35 |
                                                           (byte)uVar96 & bVar27)))))));
              puVar26[2] = CONCAT17((byte)((ulong)uVar103 >> 0x38) & bVar42 |
                                    (byte)((ulong)uVar94 >> 0x38) & bVar34,
                                    CONCAT16((byte)((ulong)uVar103 >> 0x30) & bVar41 |
                                             (byte)((ulong)uVar94 >> 0x30) & bVar33,
                                             CONCAT15((byte)((ulong)uVar103 >> 0x28) & bVar40 |
                                                      (byte)((ulong)uVar94 >> 0x28) & bVar32,
                                                      CONCAT14((byte)((ulong)uVar103 >> 0x20) &
                                                               bVar39 | (byte)((ulong)uVar94 >> 0x20
                                                                              ) & bVar31,
                                                               CONCAT13((byte)((ulong)uVar103 >>
                                                                              0x18) & bVar38 |
                                                                        (byte)((ulong)uVar94 >> 0x18
                                                                              ) & bVar30,
                                                                        CONCAT12((byte)((ulong)
                                                  uVar103 >> 0x10) & bVar37 |
                                                  (byte)((ulong)uVar94 >> 0x10) & bVar29,
                                                  CONCAT11((byte)((ulong)uVar103 >> 8) & bVar36 |
                                                           (byte)((ulong)uVar94 >> 8) & bVar28,
                                                           (byte)uVar103 & bVar35 |
                                                           (byte)uVar94 & bVar27)))))));
              pcVar23 = pcVar23 + -8;
              puVar26 = puVar26 + 8;
              pqVar22 = pqVar22 + 8;
            } while (pcVar23 != (char *)0x0);
            pcVar23 = pcVar12;
            if (pcVar12 == pcVar24) goto code_r0x002a672c;
          }
          lVar6 = (long)pcVar24 - (long)pcVar23;
          puVar15 = (ulong *)(puVar18 + (long)pcVar23 * 8);
          pcVar23 = param_3 + (long)pcVar23 * 8;
          do {
            *puVar15 = *puVar15 & uVar7 | *(ulong *)pcVar23 & uVar14;
            lVar6 = lVar6 + -1;
            puVar15 = puVar15 + 1;
            pcVar23 = pcVar23 + 8;
          } while (lVar6 != 0);
        }
code_r0x002a672c:
        if ((*(ulong *)*unaff_x25 & 1) == (*(ulong *)*unaff_x27 & 1)) goto code_r0x002a6ae8;
        param_3 = (char *)((*(ulong *)*unaff_x27 & 1) - 1);
        uVar7 = (*(ulong *)*unaff_x25 & 1) - 1;
        func_0x002a8410();
        puVar26 = *(undefined8 **)(unaff_x29 + -0x68);
        uVar11 = (-(*(ulong *)*puVar26 & 1) | -(*(ulong *)**(undefined8 **)(unaff_x29 + -0x58) & 1))
                 & uVar7;
        uVar9 = func_0x002a85f8((ulong *)**(undefined8 **)(unaff_x29 + -0x58),uVar11,*unaff_x22,
                                *in_stack_00000068);
        uVar10 = func_0x002a85f8(*puVar26,uVar11,*unaff_x24,*in_stack_00000068,pcVar24);
        func_0x002a8714(**(undefined8 **)(unaff_x29 + -0x58),uVar9,uVar7,*in_stack_00000068);
        func_0x002a8714(**(undefined8 **)(unaff_x29 + -0x68),uVar10,uVar7,*in_stack_00000068,pcVar24
                       );
        func_0x002a8410(*unaff_x27,param_3,*in_stack_00000068);
        uVar7 = (-(*(ulong *)**(undefined8 **)(unaff_x29 + -0x60) & 1) |
                -(*(ulong *)*in_stack_00000070 & 1)) & (ulong)param_3;
        uVar9 = func_0x002a85f8((ulong *)*in_stack_00000070,uVar7,*unaff_x22,*in_stack_00000068);
        uVar10 = func_0x002a85f8(**(undefined8 **)(unaff_x29 + -0x60),uVar7,*unaff_x24,
                                 *in_stack_00000068,pcVar24);
        func_0x002a8714(*in_stack_00000070,uVar9,param_3,*in_stack_00000068);
        param_4 = (char *)*in_stack_00000068;
        param_5 = pcVar24;
        func_0x002a8714(**(undefined8 **)(unaff_x29 + -0x60),uVar10,param_3,param_4,pcVar24);
        uStack0000000000000030 = uStack0000000000000030 + 1;
      } while (uStack0000000000000030 != uVar5);
    }
    uVar1 = (uint)unaff_x27[1];
    uVar5 = (ulong)(int)uVar1;
    if (uVar1 == 0) {
LAB_002a6a70:
      iVar3 = func_0x0029dd44();
      if (iVar3 != 0) {
        lVar4 = func_0x0029bd80();
        uVar5 = (ulong)(lVar4 != 0);
        goto LAB_002a6abc;
      }
      *unaff_x20 = 1;
      param_3 = section_00000068.sectname + 8;
      param_5 = "";
      goto LAB_002a6ab4;
    }
    if (uVar1 < 8) {
      uVar7 = 0;
      uVar13 = 0;
LAB_002a6a54:
      lVar4 = uVar5 - uVar7;
      puVar15 = (ulong *)(*unaff_x27 + uVar7 * 8);
      do {
        uVar13 = *puVar15 | uVar13;
        lVar4 = lVar4 + -1;
        puVar15 = puVar15 + 1;
      } while (lVar4 != 0);
    }
    else {
      uVar7 = uVar5 & 0xfffffffffffffff8;
      bVar27 = 0;
      bVar28 = 0;
      bVar29 = 0;
      bVar30 = 0;
      bVar31 = 0;
      bVar32 = 0;
      bVar33 = 0;
      bVar34 = 0;
      bVar35 = 0;
      bVar36 = 0;
      bVar37 = 0;
      bVar38 = 0;
      bVar39 = 0;
      bVar40 = 0;
      bVar41 = 0;
      bVar42 = 0;
      bVar43 = 0;
      bVar44 = 0;
      bVar45 = 0;
      bVar46 = 0;
      bVar47 = 0;
      bVar48 = 0;
      bVar49 = 0;
      bVar50 = 0;
      bVar51 = 0;
      bVar52 = 0;
      bVar53 = 0;
      bVar54 = 0;
      bVar55 = 0;
      bVar56 = 0;
      bVar57 = 0;
      bVar58 = 0;
      uVar9 = 0;
      uVar10 = 0;
      uVar76 = 0;
      uVar86 = 0;
      puVar26 = (undefined8 *)(*unaff_x27 + 0x20);
      uVar13 = uVar7;
      do {
        uVar96 = puVar26[-3];
        uVar94 = puVar26[-4];
        uVar98 = puVar26[-1];
        uVar97 = puVar26[-2];
        uVar100 = puVar26[1];
        uVar99 = *puVar26;
        uVar102 = puVar26[3];
        uVar101 = puVar26[2];
        bVar27 = (byte)uVar94 | bVar27;
        bVar28 = (byte)((ulong)uVar94 >> 8) | bVar28;
        bVar29 = (byte)((ulong)uVar94 >> 0x10) | bVar29;
        bVar30 = (byte)((ulong)uVar94 >> 0x18) | bVar30;
        bVar31 = (byte)((ulong)uVar94 >> 0x20) | bVar31;
        bVar32 = (byte)((ulong)uVar94 >> 0x28) | bVar32;
        bVar33 = (byte)((ulong)uVar94 >> 0x30) | bVar33;
        bVar34 = (byte)((ulong)uVar94 >> 0x38) | bVar34;
        bVar35 = (byte)uVar96 | bVar35;
        bVar36 = (byte)((ulong)uVar96 >> 8) | bVar36;
        bVar37 = (byte)((ulong)uVar96 >> 0x10) | bVar37;
        bVar38 = (byte)((ulong)uVar96 >> 0x18) | bVar38;
        bVar39 = (byte)((ulong)uVar96 >> 0x20) | bVar39;
        bVar40 = (byte)((ulong)uVar96 >> 0x28) | bVar40;
        bVar41 = (byte)((ulong)uVar96 >> 0x30) | bVar41;
        bVar42 = (byte)((ulong)uVar96 >> 0x38) | bVar42;
        bVar43 = (byte)uVar97 | bVar43;
        bVar44 = (byte)((ulong)uVar97 >> 8) | bVar44;
        bVar45 = (byte)((ulong)uVar97 >> 0x10) | bVar45;
        bVar46 = (byte)((ulong)uVar97 >> 0x18) | bVar46;
        bVar47 = (byte)((ulong)uVar97 >> 0x20) | bVar47;
        bVar48 = (byte)((ulong)uVar97 >> 0x28) | bVar48;
        bVar49 = (byte)((ulong)uVar97 >> 0x30) | bVar49;
        bVar50 = (byte)((ulong)uVar97 >> 0x38) | bVar50;
        bVar51 = (byte)uVar98 | bVar51;
        bVar52 = (byte)((ulong)uVar98 >> 8) | bVar52;
        bVar53 = (byte)((ulong)uVar98 >> 0x10) | bVar53;
        bVar54 = (byte)((ulong)uVar98 >> 0x18) | bVar54;
        bVar55 = (byte)((ulong)uVar98 >> 0x20) | bVar55;
        bVar56 = (byte)((ulong)uVar98 >> 0x28) | bVar56;
        bVar57 = (byte)((ulong)uVar98 >> 0x30) | bVar57;
        bVar58 = (byte)((ulong)uVar98 >> 0x38) | bVar58;
        bVar59 = (byte)uVar99 | (byte)uVar9;
        bVar60 = (byte)((ulong)uVar99 >> 8) | (byte)((ulong)uVar9 >> 8);
        bVar61 = (byte)((ulong)uVar99 >> 0x10) | (byte)((ulong)uVar9 >> 0x10);
        bVar62 = (byte)((ulong)uVar99 >> 0x18) | (byte)((ulong)uVar9 >> 0x18);
        bVar63 = (byte)((ulong)uVar99 >> 0x20) | (byte)((ulong)uVar9 >> 0x20);
        bVar64 = (byte)((ulong)uVar99 >> 0x28) | (byte)((ulong)uVar9 >> 0x28);
        bVar65 = (byte)((ulong)uVar99 >> 0x30) | (byte)((ulong)uVar9 >> 0x30);
        bVar66 = (byte)((ulong)uVar99 >> 0x38) | (byte)((ulong)uVar9 >> 0x38);
        uVar9 = CONCAT17(bVar66,CONCAT16(bVar65,CONCAT15(bVar64,CONCAT14(bVar63,CONCAT13(bVar62,
                                                  CONCAT12(bVar61,CONCAT11(bVar60,bVar59)))))));
        bVar67 = (byte)uVar100 | (byte)uVar10;
        bVar68 = (byte)((ulong)uVar100 >> 8) | (byte)((ulong)uVar10 >> 8);
        bVar69 = (byte)((ulong)uVar100 >> 0x10) | (byte)((ulong)uVar10 >> 0x10);
        bVar70 = (byte)((ulong)uVar100 >> 0x18) | (byte)((ulong)uVar10 >> 0x18);
        bVar71 = (byte)((ulong)uVar100 >> 0x20) | (byte)((ulong)uVar10 >> 0x20);
        bVar72 = (byte)((ulong)uVar100 >> 0x28) | (byte)((ulong)uVar10 >> 0x28);
        bVar73 = (byte)((ulong)uVar100 >> 0x30) | (byte)((ulong)uVar10 >> 0x30);
        bVar74 = (byte)((ulong)uVar100 >> 0x38) | (byte)((ulong)uVar10 >> 0x38);
        uVar10 = CONCAT17(bVar74,CONCAT16(bVar73,CONCAT15(bVar72,CONCAT14(bVar71,CONCAT13(bVar70,
                                                  CONCAT12(bVar69,CONCAT11(bVar68,bVar67)))))));
        bVar75 = (byte)uVar101 | (byte)uVar76;
        bVar77 = (byte)((ulong)uVar101 >> 8) | (byte)((ulong)uVar76 >> 8);
        bVar78 = (byte)((ulong)uVar101 >> 0x10) | (byte)((ulong)uVar76 >> 0x10);
        bVar79 = (byte)((ulong)uVar101 >> 0x18) | (byte)((ulong)uVar76 >> 0x18);
        bVar80 = (byte)((ulong)uVar101 >> 0x20) | (byte)((ulong)uVar76 >> 0x20);
        bVar81 = (byte)((ulong)uVar101 >> 0x28) | (byte)((ulong)uVar76 >> 0x28);
        bVar82 = (byte)((ulong)uVar101 >> 0x30) | (byte)((ulong)uVar76 >> 0x30);
        bVar83 = (byte)((ulong)uVar101 >> 0x38) | (byte)((ulong)uVar76 >> 0x38);
        uVar76 = CONCAT17(bVar83,CONCAT16(bVar82,CONCAT15(bVar81,CONCAT14(bVar80,CONCAT13(bVar79,
                                                  CONCAT12(bVar78,CONCAT11(bVar77,bVar75)))))));
        bVar84 = (byte)uVar102 | (byte)uVar86;
        bVar87 = (byte)((ulong)uVar102 >> 8) | (byte)((ulong)uVar86 >> 8);
        bVar88 = (byte)((ulong)uVar102 >> 0x10) | (byte)((ulong)uVar86 >> 0x10);
        bVar89 = (byte)((ulong)uVar102 >> 0x18) | (byte)((ulong)uVar86 >> 0x18);
        bVar90 = (byte)((ulong)uVar102 >> 0x20) | (byte)((ulong)uVar86 >> 0x20);
        bVar91 = (byte)((ulong)uVar102 >> 0x28) | (byte)((ulong)uVar86 >> 0x28);
        bVar92 = (byte)((ulong)uVar102 >> 0x30) | (byte)((ulong)uVar86 >> 0x30);
        bVar93 = (byte)((ulong)uVar102 >> 0x38) | (byte)((ulong)uVar86 >> 0x38);
        uVar86 = CONCAT17(bVar93,CONCAT16(bVar92,CONCAT15(bVar91,CONCAT14(bVar90,CONCAT13(bVar89,
                                                  CONCAT12(bVar88,CONCAT11(bVar87,bVar84)))))));
        uVar13 = uVar13 - 8;
        puVar26 = puVar26 + 8;
      } while (uVar13 != 0);
      bVar75 = bVar75 | bVar59 | bVar43 | bVar27;
      bVar77 = bVar77 | bVar60 | bVar44 | bVar28;
      bVar78 = bVar78 | bVar61 | bVar45 | bVar29;
      bVar79 = bVar79 | bVar62 | bVar46 | bVar30;
      bVar80 = bVar80 | bVar63 | bVar47 | bVar31;
      bVar81 = bVar81 | bVar64 | bVar48 | bVar32;
      bVar82 = bVar82 | bVar65 | bVar49 | bVar33;
      bVar83 = bVar83 | bVar66 | bVar50 | bVar34;
      bVar84 = bVar84 | bVar67 | bVar51 | bVar35;
      bVar87 = bVar87 | bVar68 | bVar52 | bVar36;
      bVar88 = bVar88 | bVar69 | bVar53 | bVar37;
      bVar89 = bVar89 | bVar70 | bVar54 | bVar38;
      bVar90 = bVar90 | bVar71 | bVar55 | bVar39;
      bVar91 = bVar91 | bVar72 | bVar56 | bVar40;
      bVar92 = bVar92 | bVar73 | bVar57 | bVar41;
      bVar93 = bVar93 | bVar74 | bVar58 | bVar42;
      auVar107[1] = bVar77;
      auVar107[0] = bVar75;
      auVar107[2] = bVar78;
      auVar107[3] = bVar79;
      auVar107[4] = bVar80;
      auVar107[5] = bVar81;
      auVar107[6] = bVar82;
      auVar107[7] = bVar83;
      auVar107[8] = bVar84;
      auVar107[9] = bVar87;
      auVar107[10] = bVar88;
      auVar107[0xb] = bVar89;
      auVar107[0xc] = bVar90;
      auVar107[0xd] = bVar91;
      auVar107[0xe] = bVar92;
      auVar107[0xf] = bVar93;
      auVar2[1] = bVar77;
      auVar2[0] = bVar75;
      auVar2[2] = bVar78;
      auVar2[3] = bVar79;
      auVar2[4] = bVar80;
      auVar2[5] = bVar81;
      auVar2[6] = bVar82;
      auVar2[7] = bVar83;
      auVar2[8] = bVar84;
      auVar2[9] = bVar87;
      auVar2[10] = bVar88;
      auVar2[0xb] = bVar89;
      auVar2[0xc] = bVar90;
      auVar2[0xd] = bVar91;
      auVar2[0xe] = bVar92;
      auVar2[0xf] = bVar93;
      auVar107 = NEON_ext(auVar107,auVar2,8,1);
      uVar13 = CONCAT17(bVar83 | auVar107[7],
                        CONCAT16(bVar82 | auVar107[6],
                                 CONCAT15(bVar81 | auVar107[5],
                                          CONCAT14(bVar80 | auVar107[4],
                                                   CONCAT13(bVar79 | auVar107[3],
                                                            CONCAT12(bVar78 | auVar107[2],
                                                                     CONCAT11(bVar77 | auVar107[1],
                                                                              bVar75 | auVar107[0]))
                                                           )))));
      if (uVar7 != uVar5) goto LAB_002a6a54;
    }
    if (uVar13 == 0) goto LAB_002a6a70;
  }
  auVar107 = func_0x0079de7c();
  uVar9 = auVar107._0_8_;
  *auVar107._8_8_ = 0;
  if (((*(int *)(param_3 + 0x10) != 0) || (*(int *)(param_4 + 0x28) != 0)) ||
     (iVar3 = func_0x0029d99c(*(undefined8 *)param_3,(long)*(int *)(param_3 + 8),
                              *(undefined8 *)(param_4 + 0x18),(long)*(int *)(param_4 + 0x20)),
     -1 < iVar3)) {
    func_0x0028f83c(3,0,0x6b,"/aws-lc/crypto/fipsmodule/bn/gcd.c",0x14e);
    return 0;
  }
  uStack_58 = 0;
  uStack_50 = 0;
  uStack_48 = 0;
  iVar3 = func_0x0029afb8(&uStack_58,(long)*(int *)(param_4 + 0x20));
  if ((iVar3 != 0) &&
     (iVar3 = func_0x002afddc(uStack_58,1,*(undefined8 *)(param_4 + 0x18),
                              (long)*(int *)(param_4 + 0x20),&UNK_008310d0), iVar3 != 0)) {
    uStack_48 = uStack_48 & 0xffffffff00000000;
    uStack_50 = CONCAT44(uStack_50._4_4_,*(undefined4 *)(param_4 + 0x20));
    iVar3 = func_0x002a3110(uVar9,&uStack_58,param_3,param_4,param_5);
    if ((iVar3 != 0) &&
       (iVar3 = func_0x002a50c8(uVar9,auVar107._8_8_,uVar9,param_4 + 0x18,param_5), iVar3 != 0)) {
      uVar5 = func_0x002a3110(uVar9,&uStack_58,uVar9,param_4,param_5);
      goto code_r0x002a6c38;
    }
  }
  uVar5 = 0;
code_r0x002a6c38:
  if ((uStack_48._4_4_ >> 1 & 1) == 0) {
    func_0x0036e3d8(uStack_58);
  }
  if ((uStack_48._4_4_ & 1) != 0) {
    func_0x0036e3d8(&uStack_58);
  }
  return uVar5;
}

