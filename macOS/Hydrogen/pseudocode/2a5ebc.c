
/* WARNING: Removing unreachable block (ram,0x002a6b74) */

ulong FUN_002a5ebc(long param_1,ulong param_2,undefined8 param_3,char *param_4,char *param_5,
                  char *param_6)

{
  uint uVar1;
  undefined1 auVar2 [16];
  int iVar3;
  long lVar4;
  long lVar5;
  ulong uVar6;
  long lVar7;
  undefined8 uVar8;
  undefined8 uVar9;
  ulong uVar10;
  undefined4 uVar11;
  ulong uVar12;
  char *pcVar13;
  ulong *in_x9;
  ulong uVar14;
  ulong uVar15;
  ulong *puVar16;
  ulong uVar17;
  ulong uVar18;
  undefined1 *puVar19;
  undefined8 *puVar20;
  ulong uVar21;
  ulong *puVar22;
  qword *pqVar23;
  char *pcVar24;
  long unaff_x19;
  undefined4 *unaff_x20;
  undefined8 *unaff_x22;
  ulong unaff_x23;
  ulong *unaff_x24;
  ulong *unaff_x25;
  uint unaff_w26;
  char *pcVar25;
  ulong uVar26;
  ulong *unaff_x27;
  undefined8 *puVar27;
  uint unaff_w28;
  long unaff_x29;
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
  byte bVar76;
  byte bVar78;
  byte bVar79;
  byte bVar80;
  byte bVar81;
  byte bVar82;
  byte bVar83;
  undefined8 uVar77;
  byte bVar84;
  byte bVar85;
  byte bVar88;
  byte bVar89;
  byte bVar90;
  byte bVar91;
  byte bVar92;
  byte bVar93;
  qword qVar86;
  undefined8 uVar87;
  byte bVar94;
  undefined8 uVar95;
  qword qVar96;
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
  undefined8 uVar107;
  undefined1 auVar108 [16];
  ulong uStack0000000000000030;
  ulong *in_stack_00000068;
  ulong *in_stack_00000070;
  undefined8 uStack_58;
  undefined8 uStack_50;
  undefined8 uStack_48;
  
  if (((param_1 == 0) || (in_stack_00000068 == (ulong *)0x0)) || (in_x9 == (ulong *)0x0)) {
LAB_002a6abc:
    if (*(char *)(unaff_x19 + 0x28) != '\0') {
      return param_2;
    }
    if (*(long *)(unaff_x19 + 0x10) != 0) {
      lVar4 = *(long *)(unaff_x19 + 0x10) + -1;
      *(long *)(unaff_x19 + 0x10) = lVar4;
      *(undefined8 *)(unaff_x19 + 0x20) = *(undefined8 *)(*(long *)(unaff_x19 + 8) + lVar4 * 8);
      return param_2;
    }
    func_0x0079db4c(param_2);
code_r0x002a6ae8:
    func_0x0079dea4();
  }
  else {
    if (unaff_x25 != unaff_x24) {
      param_2 = func_0x0029afb8();
      if ((int)param_2 == 0) goto LAB_002a6abc;
      uVar11 = 0;
      if ((int)unaff_x24[1] != 0) {
        param_4 = (char *)((long)(int)unaff_x24[1] << 3);
        _memcpy(*unaff_x25,*unaff_x24);
        uVar11 = (undefined4)unaff_x24[1];
      }
      *(undefined4 *)(unaff_x25 + 1) = uVar11;
      *(int *)(unaff_x25 + 2) = (int)unaff_x24[2];
    }
    lVar4 = func_0x0029bd80();
    param_2 = 0;
    if (((((lVar4 == 0) ||
          (param_2 = func_0x0029c0b0(*(undefined8 *)(unaff_x29 + -0x58)), (int)param_2 == 0)) ||
         ((param_2 = func_0x0029c0b0(*(undefined8 *)(unaff_x29 + -0x60)), (int)param_2 == 0 ||
          ((param_2 = func_0x0029c3cc(), (int)param_2 == 0 ||
           (param_2 = func_0x0029c3cc(), (int)param_2 == 0)))))) ||
        (param_2 = func_0x0029c3cc(*(undefined8 *)(unaff_x29 + -0x58)), (int)param_2 == 0)) ||
       (param_2 = func_0x0029c3cc(in_stack_00000070), (int)param_2 == 0)) goto LAB_002a6abc;
    pcVar25 = (char *)(long)(int)unaff_w26;
    param_2 = func_0x0029c3cc(*(undefined8 *)(unaff_x29 + -0x68),pcVar25);
    if (((((int)param_2 == 0) ||
         (param_2 = func_0x0029c3cc(*(undefined8 *)(unaff_x29 + -0x60),pcVar25), (int)param_2 == 0))
        || (param_2 = func_0x0029c3cc(in_stack_00000068), (int)param_2 == 0)) ||
       (param_2 = func_0x0029c3cc(in_x9), (int)param_2 == 0)) goto LAB_002a6abc;
    uVar12 = (long)(pcVar25 + unaff_x23) * 0x40;
    if (uVar12 < (ulong)((long)pcVar25 << 6)) {
      param_4 = (char *)((long)&segment_command_00000020.flags + 2);
      param_6 = "\b\x04";
code_r0x002a6ab4:
      param_5 = "/aws-lc/crypto/fipsmodule/bn/gcd_extra.c";
      func_0x0028f83c(3,0,param_4,"/aws-lc/crypto/fipsmodule/bn/gcd_extra.c",param_6);
      param_2 = 0;
      goto LAB_002a6abc;
    }
    if (pcVar25 + unaff_x23 != (char *)0x0) {
      if (uVar12 < 2) {
        uVar12 = 1;
      }
      lVar4 = unaff_x23 * 8;
      uStack0000000000000030 = 0;
      uVar14 = unaff_x23 & 0xfffffffffffffff8;
      pcVar13 = (char *)((ulong)pcVar25 & 0xfffffffffffffff8);
      do {
        uVar26 = -(*(ulong *)*unaff_x25 & 1) & -(*(ulong *)*unaff_x27 & 1);
        lVar5 = func_0x00382cc0(*in_stack_00000068);
        uVar10 = *unaff_x27;
        uVar15 = lVar5 - 1U & uVar26;
        uVar6 = *in_stack_00000068;
        bVar28 = (byte)uVar15;
        bVar29 = (byte)(uVar15 >> 8);
        bVar30 = (byte)(uVar15 >> 0x10);
        bVar31 = (byte)(uVar15 >> 0x18);
        bVar32 = (byte)(uVar15 >> 0x20);
        bVar33 = (byte)(uVar15 >> 0x28);
        bVar34 = (byte)(uVar15 >> 0x30);
        bVar35 = (byte)(uVar15 >> 0x38);
        if (unaff_w28 != 0) {
          uVar17 = ~uVar15;
          if ((unaff_w28 < 8) || (uVar10 < uVar6 + lVar4 && uVar6 < uVar10 + lVar4)) {
            uVar18 = 0;
          }
          else {
            puVar27 = (undefined8 *)(uVar10 + 0x20);
            puVar20 = (undefined8 *)(uVar6 + 0x20);
            uVar18 = uVar14;
            do {
              uVar9 = puVar20[-3];
              uVar8 = puVar20[-4];
              uVar87 = puVar20[-1];
              uVar77 = puVar20[-2];
              uVar97 = puVar20[1];
              uVar95 = *puVar20;
              uVar99 = puVar20[3];
              uVar98 = puVar20[2];
              uVar101 = puVar27[-3];
              uVar100 = puVar27[-4];
              uVar103 = puVar27[-1];
              uVar102 = puVar27[-2];
              uVar105 = puVar27[1];
              uVar104 = *puVar27;
              uVar107 = puVar27[3];
              uVar106 = puVar27[2];
              bVar36 = (byte)uVar17;
              bVar37 = (byte)(uVar17 >> 8);
              bVar38 = (byte)(uVar17 >> 0x10);
              bVar39 = (byte)(uVar17 >> 0x18);
              bVar40 = (byte)(uVar17 >> 0x20);
              bVar41 = (byte)(uVar17 >> 0x28);
              bVar42 = (byte)(uVar17 >> 0x30);
              bVar43 = (byte)(uVar17 >> 0x38);
              puVar27[-3] = CONCAT17((byte)((ulong)uVar101 >> 0x38) & bVar43 |
                                     (byte)((ulong)uVar9 >> 0x38) & bVar35,
                                     CONCAT16((byte)((ulong)uVar101 >> 0x30) & bVar42 |
                                              (byte)((ulong)uVar9 >> 0x30) & bVar34,
                                              CONCAT15((byte)((ulong)uVar101 >> 0x28) & bVar41 |
                                                       (byte)((ulong)uVar9 >> 0x28) & bVar33,
                                                       CONCAT14((byte)((ulong)uVar101 >> 0x20) &
                                                                bVar40 | (byte)((ulong)uVar9 >> 0x20
                                                                               ) & bVar32,
                                                                CONCAT13((byte)((ulong)uVar101 >>
                                                                               0x18) & bVar39 |
                                                                         (byte)((ulong)uVar9 >> 0x18
                                                                               ) & bVar31,
                                                                         CONCAT12((byte)((ulong)
                                                  uVar101 >> 0x10) & bVar38 |
                                                  (byte)((ulong)uVar9 >> 0x10) & bVar30,
                                                  CONCAT11((byte)((ulong)uVar101 >> 8) & bVar37 |
                                                           (byte)((ulong)uVar9 >> 8) & bVar29,
                                                           (byte)uVar101 & bVar36 |
                                                           (byte)uVar9 & bVar28)))))));
              puVar27[-4] = CONCAT17((byte)((ulong)uVar100 >> 0x38) & bVar43 |
                                     (byte)((ulong)uVar8 >> 0x38) & bVar35,
                                     CONCAT16((byte)((ulong)uVar100 >> 0x30) & bVar42 |
                                              (byte)((ulong)uVar8 >> 0x30) & bVar34,
                                              CONCAT15((byte)((ulong)uVar100 >> 0x28) & bVar41 |
                                                       (byte)((ulong)uVar8 >> 0x28) & bVar33,
                                                       CONCAT14((byte)((ulong)uVar100 >> 0x20) &
                                                                bVar40 | (byte)((ulong)uVar8 >> 0x20
                                                                               ) & bVar32,
                                                                CONCAT13((byte)((ulong)uVar100 >>
                                                                               0x18) & bVar39 |
                                                                         (byte)((ulong)uVar8 >> 0x18
                                                                               ) & bVar31,
                                                                         CONCAT12((byte)((ulong)
                                                  uVar100 >> 0x10) & bVar38 |
                                                  (byte)((ulong)uVar8 >> 0x10) & bVar30,
                                                  CONCAT11((byte)((ulong)uVar100 >> 8) & bVar37 |
                                                           (byte)((ulong)uVar8 >> 8) & bVar29,
                                                           (byte)uVar100 & bVar36 |
                                                           (byte)uVar8 & bVar28)))))));
              puVar27[-1] = CONCAT17((byte)((ulong)uVar103 >> 0x38) & bVar43 |
                                     (byte)((ulong)uVar87 >> 0x38) & bVar35,
                                     CONCAT16((byte)((ulong)uVar103 >> 0x30) & bVar42 |
                                              (byte)((ulong)uVar87 >> 0x30) & bVar34,
                                              CONCAT15((byte)((ulong)uVar103 >> 0x28) & bVar41 |
                                                       (byte)((ulong)uVar87 >> 0x28) & bVar33,
                                                       CONCAT14((byte)((ulong)uVar103 >> 0x20) &
                                                                bVar40 | (byte)((ulong)uVar87 >>
                                                                               0x20) & bVar32,
                                                                CONCAT13((byte)((ulong)uVar103 >>
                                                                               0x18) & bVar39 |
                                                                         (byte)((ulong)uVar87 >>
                                                                               0x18) & bVar31,
                                                                         CONCAT12((byte)((ulong)
                                                  uVar103 >> 0x10) & bVar38 |
                                                  (byte)((ulong)uVar87 >> 0x10) & bVar30,
                                                  CONCAT11((byte)((ulong)uVar103 >> 8) & bVar37 |
                                                           (byte)((ulong)uVar87 >> 8) & bVar29,
                                                           (byte)uVar103 & bVar36 |
                                                           (byte)uVar87 & bVar28)))))));
              puVar27[-2] = CONCAT17((byte)((ulong)uVar102 >> 0x38) & bVar43 |
                                     (byte)((ulong)uVar77 >> 0x38) & bVar35,
                                     CONCAT16((byte)((ulong)uVar102 >> 0x30) & bVar42 |
                                              (byte)((ulong)uVar77 >> 0x30) & bVar34,
                                              CONCAT15((byte)((ulong)uVar102 >> 0x28) & bVar41 |
                                                       (byte)((ulong)uVar77 >> 0x28) & bVar33,
                                                       CONCAT14((byte)((ulong)uVar102 >> 0x20) &
                                                                bVar40 | (byte)((ulong)uVar77 >>
                                                                               0x20) & bVar32,
                                                                CONCAT13((byte)((ulong)uVar102 >>
                                                                               0x18) & bVar39 |
                                                                         (byte)((ulong)uVar77 >>
                                                                               0x18) & bVar31,
                                                                         CONCAT12((byte)((ulong)
                                                  uVar102 >> 0x10) & bVar38 |
                                                  (byte)((ulong)uVar77 >> 0x10) & bVar30,
                                                  CONCAT11((byte)((ulong)uVar102 >> 8) & bVar37 |
                                                           (byte)((ulong)uVar77 >> 8) & bVar29,
                                                           (byte)uVar102 & bVar36 |
                                                           (byte)uVar77 & bVar28)))))));
              puVar27[1] = CONCAT17((byte)((ulong)uVar105 >> 0x38) & bVar43 |
                                    (byte)((ulong)uVar97 >> 0x38) & bVar35,
                                    CONCAT16((byte)((ulong)uVar105 >> 0x30) & bVar42 |
                                             (byte)((ulong)uVar97 >> 0x30) & bVar34,
                                             CONCAT15((byte)((ulong)uVar105 >> 0x28) & bVar41 |
                                                      (byte)((ulong)uVar97 >> 0x28) & bVar33,
                                                      CONCAT14((byte)((ulong)uVar105 >> 0x20) &
                                                               bVar40 | (byte)((ulong)uVar97 >> 0x20
                                                                              ) & bVar32,
                                                               CONCAT13((byte)((ulong)uVar105 >>
                                                                              0x18) & bVar39 |
                                                                        (byte)((ulong)uVar97 >> 0x18
                                                                              ) & bVar31,
                                                                        CONCAT12((byte)((ulong)
                                                  uVar105 >> 0x10) & bVar38 |
                                                  (byte)((ulong)uVar97 >> 0x10) & bVar30,
                                                  CONCAT11((byte)((ulong)uVar105 >> 8) & bVar37 |
                                                           (byte)((ulong)uVar97 >> 8) & bVar29,
                                                           (byte)uVar105 & bVar36 |
                                                           (byte)uVar97 & bVar28)))))));
              *puVar27 = CONCAT17((byte)((ulong)uVar104 >> 0x38) & bVar43 |
                                  (byte)((ulong)uVar95 >> 0x38) & bVar35,
                                  CONCAT16((byte)((ulong)uVar104 >> 0x30) & bVar42 |
                                           (byte)((ulong)uVar95 >> 0x30) & bVar34,
                                           CONCAT15((byte)((ulong)uVar104 >> 0x28) & bVar41 |
                                                    (byte)((ulong)uVar95 >> 0x28) & bVar33,
                                                    CONCAT14((byte)((ulong)uVar104 >> 0x20) & bVar40
                                                             | (byte)((ulong)uVar95 >> 0x20) &
                                                               bVar32,CONCAT13((byte)((ulong)uVar104
                                                                                     >> 0x18) &
                                                                               bVar39 | (byte)((
                                                  ulong)uVar95 >> 0x18) & bVar31,
                                                  CONCAT12((byte)((ulong)uVar104 >> 0x10) & bVar38 |
                                                           (byte)((ulong)uVar95 >> 0x10) & bVar30,
                                                           CONCAT11((byte)((ulong)uVar104 >> 8) &
                                                                    bVar37 | (byte)((ulong)uVar95 >>
                                                                                   8) & bVar29,
                                                                    (byte)uVar104 & bVar36 |
                                                                    (byte)uVar95 & bVar28)))))));
              puVar27[3] = CONCAT17((byte)((ulong)uVar107 >> 0x38) & bVar43 |
                                    (byte)((ulong)uVar99 >> 0x38) & bVar35,
                                    CONCAT16((byte)((ulong)uVar107 >> 0x30) & bVar42 |
                                             (byte)((ulong)uVar99 >> 0x30) & bVar34,
                                             CONCAT15((byte)((ulong)uVar107 >> 0x28) & bVar41 |
                                                      (byte)((ulong)uVar99 >> 0x28) & bVar33,
                                                      CONCAT14((byte)((ulong)uVar107 >> 0x20) &
                                                               bVar40 | (byte)((ulong)uVar99 >> 0x20
                                                                              ) & bVar32,
                                                               CONCAT13((byte)((ulong)uVar107 >>
                                                                              0x18) & bVar39 |
                                                                        (byte)((ulong)uVar99 >> 0x18
                                                                              ) & bVar31,
                                                                        CONCAT12((byte)((ulong)
                                                  uVar107 >> 0x10) & bVar38 |
                                                  (byte)((ulong)uVar99 >> 0x10) & bVar30,
                                                  CONCAT11((byte)((ulong)uVar107 >> 8) & bVar37 |
                                                           (byte)((ulong)uVar99 >> 8) & bVar29,
                                                           (byte)uVar107 & bVar36 |
                                                           (byte)uVar99 & bVar28)))))));
              puVar27[2] = CONCAT17((byte)((ulong)uVar106 >> 0x38) & bVar43 |
                                    (byte)((ulong)uVar98 >> 0x38) & bVar35,
                                    CONCAT16((byte)((ulong)uVar106 >> 0x30) & bVar42 |
                                             (byte)((ulong)uVar98 >> 0x30) & bVar34,
                                             CONCAT15((byte)((ulong)uVar106 >> 0x28) & bVar41 |
                                                      (byte)((ulong)uVar98 >> 0x28) & bVar33,
                                                      CONCAT14((byte)((ulong)uVar106 >> 0x20) &
                                                               bVar40 | (byte)((ulong)uVar98 >> 0x20
                                                                              ) & bVar32,
                                                               CONCAT13((byte)((ulong)uVar106 >>
                                                                              0x18) & bVar39 |
                                                                        (byte)((ulong)uVar98 >> 0x18
                                                                              ) & bVar31,
                                                                        CONCAT12((byte)((ulong)
                                                  uVar106 >> 0x10) & bVar38 |
                                                  (byte)((ulong)uVar98 >> 0x10) & bVar30,
                                                  CONCAT11((byte)((ulong)uVar106 >> 8) & bVar37 |
                                                           (byte)((ulong)uVar98 >> 8) & bVar29,
                                                           (byte)uVar106 & bVar36 |
                                                           (byte)uVar98 & bVar28)))))));
              uVar18 = uVar18 - 8;
              puVar27 = puVar27 + 8;
              puVar20 = puVar20 + 8;
            } while (uVar18 != 0);
            uVar18 = uVar14;
            if (uVar14 == unaff_x23) goto code_r0x002a6148;
          }
          lVar7 = unaff_x23 - uVar18;
          puVar16 = (ulong *)(uVar10 + uVar18 * 8);
          puVar22 = (ulong *)(uVar6 + uVar18 * 8);
          do {
            *puVar16 = *puVar16 & uVar17 | *puVar22 & uVar15;
            lVar7 = lVar7 + -1;
            puVar16 = puVar16 + 1;
            puVar22 = puVar22 + 1;
          } while (lVar7 != 0);
        }
code_r0x002a6148:
        func_0x00382cc0(uVar6,*unaff_x25);
        uVar26 = uVar26 & -lVar5;
        uVar6 = *in_stack_00000068;
        bVar36 = (byte)uVar26;
        bVar37 = (byte)(uVar26 >> 8);
        bVar38 = (byte)(uVar26 >> 0x10);
        bVar39 = (byte)(uVar26 >> 0x18);
        bVar40 = (byte)(uVar26 >> 0x20);
        bVar41 = (byte)(uVar26 >> 0x28);
        bVar42 = (byte)(uVar26 >> 0x30);
        bVar43 = (byte)(uVar26 >> 0x38);
        if ((int)unaff_x23 != 0) {
          uVar17 = *unaff_x25;
          uVar10 = ~uVar26;
          if ((unaff_w28 < 8) || ((uVar17 < uVar6 + lVar4 && (uVar6 < uVar17 + lVar4)))) {
            uVar18 = 0;
          }
          else {
            puVar27 = (undefined8 *)(uVar17 + 0x20);
            puVar20 = (undefined8 *)(uVar6 + 0x20);
            uVar18 = uVar14;
            do {
              uVar9 = puVar20[-3];
              uVar8 = puVar20[-4];
              uVar87 = puVar20[-1];
              uVar77 = puVar20[-2];
              uVar97 = puVar20[1];
              uVar95 = *puVar20;
              uVar99 = puVar20[3];
              uVar98 = puVar20[2];
              uVar101 = puVar27[-3];
              uVar100 = puVar27[-4];
              uVar103 = puVar27[-1];
              uVar102 = puVar27[-2];
              uVar105 = puVar27[1];
              uVar104 = *puVar27;
              uVar107 = puVar27[3];
              uVar106 = puVar27[2];
              bVar44 = (byte)uVar10;
              bVar45 = (byte)(uVar10 >> 8);
              bVar46 = (byte)(uVar10 >> 0x10);
              bVar47 = (byte)(uVar10 >> 0x18);
              bVar48 = (byte)(uVar10 >> 0x20);
              bVar49 = (byte)(uVar10 >> 0x28);
              bVar50 = (byte)(uVar10 >> 0x30);
              bVar51 = (byte)(uVar10 >> 0x38);
              puVar27[-3] = CONCAT17((byte)((ulong)uVar101 >> 0x38) & bVar51 |
                                     (byte)((ulong)uVar9 >> 0x38) & bVar43,
                                     CONCAT16((byte)((ulong)uVar101 >> 0x30) & bVar50 |
                                              (byte)((ulong)uVar9 >> 0x30) & bVar42,
                                              CONCAT15((byte)((ulong)uVar101 >> 0x28) & bVar49 |
                                                       (byte)((ulong)uVar9 >> 0x28) & bVar41,
                                                       CONCAT14((byte)((ulong)uVar101 >> 0x20) &
                                                                bVar48 | (byte)((ulong)uVar9 >> 0x20
                                                                               ) & bVar40,
                                                                CONCAT13((byte)((ulong)uVar101 >>
                                                                               0x18) & bVar47 |
                                                                         (byte)((ulong)uVar9 >> 0x18
                                                                               ) & bVar39,
                                                                         CONCAT12((byte)((ulong)
                                                  uVar101 >> 0x10) & bVar46 |
                                                  (byte)((ulong)uVar9 >> 0x10) & bVar38,
                                                  CONCAT11((byte)((ulong)uVar101 >> 8) & bVar45 |
                                                           (byte)((ulong)uVar9 >> 8) & bVar37,
                                                           (byte)uVar101 & bVar44 |
                                                           (byte)uVar9 & bVar36)))))));
              puVar27[-4] = CONCAT17((byte)((ulong)uVar100 >> 0x38) & bVar51 |
                                     (byte)((ulong)uVar8 >> 0x38) & bVar43,
                                     CONCAT16((byte)((ulong)uVar100 >> 0x30) & bVar50 |
                                              (byte)((ulong)uVar8 >> 0x30) & bVar42,
                                              CONCAT15((byte)((ulong)uVar100 >> 0x28) & bVar49 |
                                                       (byte)((ulong)uVar8 >> 0x28) & bVar41,
                                                       CONCAT14((byte)((ulong)uVar100 >> 0x20) &
                                                                bVar48 | (byte)((ulong)uVar8 >> 0x20
                                                                               ) & bVar40,
                                                                CONCAT13((byte)((ulong)uVar100 >>
                                                                               0x18) & bVar47 |
                                                                         (byte)((ulong)uVar8 >> 0x18
                                                                               ) & bVar39,
                                                                         CONCAT12((byte)((ulong)
                                                  uVar100 >> 0x10) & bVar46 |
                                                  (byte)((ulong)uVar8 >> 0x10) & bVar38,
                                                  CONCAT11((byte)((ulong)uVar100 >> 8) & bVar45 |
                                                           (byte)((ulong)uVar8 >> 8) & bVar37,
                                                           (byte)uVar100 & bVar44 |
                                                           (byte)uVar8 & bVar36)))))));
              puVar27[-1] = CONCAT17((byte)((ulong)uVar103 >> 0x38) & bVar51 |
                                     (byte)((ulong)uVar87 >> 0x38) & bVar43,
                                     CONCAT16((byte)((ulong)uVar103 >> 0x30) & bVar50 |
                                              (byte)((ulong)uVar87 >> 0x30) & bVar42,
                                              CONCAT15((byte)((ulong)uVar103 >> 0x28) & bVar49 |
                                                       (byte)((ulong)uVar87 >> 0x28) & bVar41,
                                                       CONCAT14((byte)((ulong)uVar103 >> 0x20) &
                                                                bVar48 | (byte)((ulong)uVar87 >>
                                                                               0x20) & bVar40,
                                                                CONCAT13((byte)((ulong)uVar103 >>
                                                                               0x18) & bVar47 |
                                                                         (byte)((ulong)uVar87 >>
                                                                               0x18) & bVar39,
                                                                         CONCAT12((byte)((ulong)
                                                  uVar103 >> 0x10) & bVar46 |
                                                  (byte)((ulong)uVar87 >> 0x10) & bVar38,
                                                  CONCAT11((byte)((ulong)uVar103 >> 8) & bVar45 |
                                                           (byte)((ulong)uVar87 >> 8) & bVar37,
                                                           (byte)uVar103 & bVar44 |
                                                           (byte)uVar87 & bVar36)))))));
              puVar27[-2] = CONCAT17((byte)((ulong)uVar102 >> 0x38) & bVar51 |
                                     (byte)((ulong)uVar77 >> 0x38) & bVar43,
                                     CONCAT16((byte)((ulong)uVar102 >> 0x30) & bVar50 |
                                              (byte)((ulong)uVar77 >> 0x30) & bVar42,
                                              CONCAT15((byte)((ulong)uVar102 >> 0x28) & bVar49 |
                                                       (byte)((ulong)uVar77 >> 0x28) & bVar41,
                                                       CONCAT14((byte)((ulong)uVar102 >> 0x20) &
                                                                bVar48 | (byte)((ulong)uVar77 >>
                                                                               0x20) & bVar40,
                                                                CONCAT13((byte)((ulong)uVar102 >>
                                                                               0x18) & bVar47 |
                                                                         (byte)((ulong)uVar77 >>
                                                                               0x18) & bVar39,
                                                                         CONCAT12((byte)((ulong)
                                                  uVar102 >> 0x10) & bVar46 |
                                                  (byte)((ulong)uVar77 >> 0x10) & bVar38,
                                                  CONCAT11((byte)((ulong)uVar102 >> 8) & bVar45 |
                                                           (byte)((ulong)uVar77 >> 8) & bVar37,
                                                           (byte)uVar102 & bVar44 |
                                                           (byte)uVar77 & bVar36)))))));
              puVar27[1] = CONCAT17((byte)((ulong)uVar105 >> 0x38) & bVar51 |
                                    (byte)((ulong)uVar97 >> 0x38) & bVar43,
                                    CONCAT16((byte)((ulong)uVar105 >> 0x30) & bVar50 |
                                             (byte)((ulong)uVar97 >> 0x30) & bVar42,
                                             CONCAT15((byte)((ulong)uVar105 >> 0x28) & bVar49 |
                                                      (byte)((ulong)uVar97 >> 0x28) & bVar41,
                                                      CONCAT14((byte)((ulong)uVar105 >> 0x20) &
                                                               bVar48 | (byte)((ulong)uVar97 >> 0x20
                                                                              ) & bVar40,
                                                               CONCAT13((byte)((ulong)uVar105 >>
                                                                              0x18) & bVar47 |
                                                                        (byte)((ulong)uVar97 >> 0x18
                                                                              ) & bVar39,
                                                                        CONCAT12((byte)((ulong)
                                                  uVar105 >> 0x10) & bVar46 |
                                                  (byte)((ulong)uVar97 >> 0x10) & bVar38,
                                                  CONCAT11((byte)((ulong)uVar105 >> 8) & bVar45 |
                                                           (byte)((ulong)uVar97 >> 8) & bVar37,
                                                           (byte)uVar105 & bVar44 |
                                                           (byte)uVar97 & bVar36)))))));
              *puVar27 = CONCAT17((byte)((ulong)uVar104 >> 0x38) & bVar51 |
                                  (byte)((ulong)uVar95 >> 0x38) & bVar43,
                                  CONCAT16((byte)((ulong)uVar104 >> 0x30) & bVar50 |
                                           (byte)((ulong)uVar95 >> 0x30) & bVar42,
                                           CONCAT15((byte)((ulong)uVar104 >> 0x28) & bVar49 |
                                                    (byte)((ulong)uVar95 >> 0x28) & bVar41,
                                                    CONCAT14((byte)((ulong)uVar104 >> 0x20) & bVar48
                                                             | (byte)((ulong)uVar95 >> 0x20) &
                                                               bVar40,CONCAT13((byte)((ulong)uVar104
                                                                                     >> 0x18) &
                                                                               bVar47 | (byte)((
                                                  ulong)uVar95 >> 0x18) & bVar39,
                                                  CONCAT12((byte)((ulong)uVar104 >> 0x10) & bVar46 |
                                                           (byte)((ulong)uVar95 >> 0x10) & bVar38,
                                                           CONCAT11((byte)((ulong)uVar104 >> 8) &
                                                                    bVar45 | (byte)((ulong)uVar95 >>
                                                                                   8) & bVar37,
                                                                    (byte)uVar104 & bVar44 |
                                                                    (byte)uVar95 & bVar36)))))));
              puVar27[3] = CONCAT17((byte)((ulong)uVar107 >> 0x38) & bVar51 |
                                    (byte)((ulong)uVar99 >> 0x38) & bVar43,
                                    CONCAT16((byte)((ulong)uVar107 >> 0x30) & bVar50 |
                                             (byte)((ulong)uVar99 >> 0x30) & bVar42,
                                             CONCAT15((byte)((ulong)uVar107 >> 0x28) & bVar49 |
                                                      (byte)((ulong)uVar99 >> 0x28) & bVar41,
                                                      CONCAT14((byte)((ulong)uVar107 >> 0x20) &
                                                               bVar48 | (byte)((ulong)uVar99 >> 0x20
                                                                              ) & bVar40,
                                                               CONCAT13((byte)((ulong)uVar107 >>
                                                                              0x18) & bVar47 |
                                                                        (byte)((ulong)uVar99 >> 0x18
                                                                              ) & bVar39,
                                                                        CONCAT12((byte)((ulong)
                                                  uVar107 >> 0x10) & bVar46 |
                                                  (byte)((ulong)uVar99 >> 0x10) & bVar38,
                                                  CONCAT11((byte)((ulong)uVar107 >> 8) & bVar45 |
                                                           (byte)((ulong)uVar99 >> 8) & bVar37,
                                                           (byte)uVar107 & bVar44 |
                                                           (byte)uVar99 & bVar36)))))));
              puVar27[2] = CONCAT17((byte)((ulong)uVar106 >> 0x38) & bVar51 |
                                    (byte)((ulong)uVar98 >> 0x38) & bVar43,
                                    CONCAT16((byte)((ulong)uVar106 >> 0x30) & bVar50 |
                                             (byte)((ulong)uVar98 >> 0x30) & bVar42,
                                             CONCAT15((byte)((ulong)uVar106 >> 0x28) & bVar49 |
                                                      (byte)((ulong)uVar98 >> 0x28) & bVar41,
                                                      CONCAT14((byte)((ulong)uVar106 >> 0x20) &
                                                               bVar48 | (byte)((ulong)uVar98 >> 0x20
                                                                              ) & bVar40,
                                                               CONCAT13((byte)((ulong)uVar106 >>
                                                                              0x18) & bVar47 |
                                                                        (byte)((ulong)uVar98 >> 0x18
                                                                              ) & bVar39,
                                                                        CONCAT12((byte)((ulong)
                                                  uVar106 >> 0x10) & bVar46 |
                                                  (byte)((ulong)uVar98 >> 0x10) & bVar38,
                                                  CONCAT11((byte)((ulong)uVar106 >> 8) & bVar45 |
                                                           (byte)((ulong)uVar98 >> 8) & bVar37,
                                                           (byte)uVar106 & bVar44 |
                                                           (byte)uVar98 & bVar36)))))));
              uVar18 = uVar18 - 8;
              puVar27 = puVar27 + 8;
              puVar20 = puVar20 + 8;
            } while (uVar18 != 0);
            uVar18 = uVar14;
            if (uVar14 == unaff_x23) goto code_r0x002a61dc;
          }
          lVar5 = unaff_x23 - uVar18;
          puVar16 = (ulong *)(uVar17 + uVar18 * 8);
          puVar22 = (ulong *)(uVar6 + uVar18 * 8);
          do {
            *puVar16 = *puVar16 & uVar10 | *puVar22 & uVar26;
            lVar5 = lVar5 + -1;
            puVar16 = puVar16 + 1;
            puVar22 = puVar22 + 1;
          } while (lVar5 != 0);
        }
code_r0x002a61dc:
        lVar5 = func_0x00382c70(uVar6,**(undefined8 **)(unaff_x29 + -0x58),*in_stack_00000070);
        lVar7 = func_0x00382cc0(*in_x9,*in_stack_00000068,*unaff_x22);
        uVar10 = lVar5 - lVar7;
        uVar6 = *in_stack_00000068;
        bVar44 = (byte)uVar10;
        bVar45 = (byte)(uVar10 >> 8);
        bVar46 = (byte)(uVar10 >> 0x10);
        bVar47 = (byte)(uVar10 >> 0x18);
        bVar48 = (byte)(uVar10 >> 0x20);
        bVar49 = (byte)(uVar10 >> 0x28);
        bVar50 = (byte)(uVar10 >> 0x30);
        bVar51 = (byte)(uVar10 >> 0x38);
        if (unaff_w28 != 0) {
          uVar18 = *in_x9;
          uVar17 = ~uVar10;
          if ((unaff_w28 < 8) || ((uVar6 < uVar18 + lVar4 && (uVar18 < uVar6 + lVar4)))) {
            uVar21 = 0;
code_r0x002a6260:
            lVar5 = unaff_x23 - uVar21;
            puVar16 = (ulong *)(uVar18 + uVar21 * 8);
            puVar22 = (ulong *)(uVar6 + uVar21 * 8);
            do {
              *puVar22 = *puVar16 & uVar17 | *puVar22 & uVar10;
              lVar5 = lVar5 + -1;
              puVar16 = puVar16 + 1;
              puVar22 = puVar22 + 1;
            } while (lVar5 != 0);
          }
          else {
            puVar27 = (undefined8 *)(uVar18 + 0x20);
            puVar20 = (undefined8 *)(uVar6 + 0x20);
            uVar21 = uVar14;
            do {
              uVar9 = puVar20[-3];
              uVar8 = puVar20[-4];
              uVar87 = puVar20[-1];
              uVar77 = puVar20[-2];
              uVar97 = puVar20[1];
              uVar95 = *puVar20;
              uVar99 = puVar20[3];
              uVar98 = puVar20[2];
              uVar101 = puVar27[-3];
              uVar100 = puVar27[-4];
              uVar103 = puVar27[-1];
              uVar102 = puVar27[-2];
              uVar105 = puVar27[1];
              uVar104 = *puVar27;
              uVar107 = puVar27[3];
              uVar106 = puVar27[2];
              bVar52 = (byte)uVar17;
              bVar53 = (byte)(uVar17 >> 8);
              bVar54 = (byte)(uVar17 >> 0x10);
              bVar55 = (byte)(uVar17 >> 0x18);
              bVar56 = (byte)(uVar17 >> 0x20);
              bVar57 = (byte)(uVar17 >> 0x28);
              bVar58 = (byte)(uVar17 >> 0x30);
              bVar59 = (byte)(uVar17 >> 0x38);
              puVar20[-3] = CONCAT17((byte)((ulong)uVar101 >> 0x38) & bVar59 |
                                     (byte)((ulong)uVar9 >> 0x38) & bVar51,
                                     CONCAT16((byte)((ulong)uVar101 >> 0x30) & bVar58 |
                                              (byte)((ulong)uVar9 >> 0x30) & bVar50,
                                              CONCAT15((byte)((ulong)uVar101 >> 0x28) & bVar57 |
                                                       (byte)((ulong)uVar9 >> 0x28) & bVar49,
                                                       CONCAT14((byte)((ulong)uVar101 >> 0x20) &
                                                                bVar56 | (byte)((ulong)uVar9 >> 0x20
                                                                               ) & bVar48,
                                                                CONCAT13((byte)((ulong)uVar101 >>
                                                                               0x18) & bVar55 |
                                                                         (byte)((ulong)uVar9 >> 0x18
                                                                               ) & bVar47,
                                                                         CONCAT12((byte)((ulong)
                                                  uVar101 >> 0x10) & bVar54 |
                                                  (byte)((ulong)uVar9 >> 0x10) & bVar46,
                                                  CONCAT11((byte)((ulong)uVar101 >> 8) & bVar53 |
                                                           (byte)((ulong)uVar9 >> 8) & bVar45,
                                                           (byte)uVar101 & bVar52 |
                                                           (byte)uVar9 & bVar44)))))));
              puVar20[-4] = CONCAT17((byte)((ulong)uVar100 >> 0x38) & bVar59 |
                                     (byte)((ulong)uVar8 >> 0x38) & bVar51,
                                     CONCAT16((byte)((ulong)uVar100 >> 0x30) & bVar58 |
                                              (byte)((ulong)uVar8 >> 0x30) & bVar50,
                                              CONCAT15((byte)((ulong)uVar100 >> 0x28) & bVar57 |
                                                       (byte)((ulong)uVar8 >> 0x28) & bVar49,
                                                       CONCAT14((byte)((ulong)uVar100 >> 0x20) &
                                                                bVar56 | (byte)((ulong)uVar8 >> 0x20
                                                                               ) & bVar48,
                                                                CONCAT13((byte)((ulong)uVar100 >>
                                                                               0x18) & bVar55 |
                                                                         (byte)((ulong)uVar8 >> 0x18
                                                                               ) & bVar47,
                                                                         CONCAT12((byte)((ulong)
                                                  uVar100 >> 0x10) & bVar54 |
                                                  (byte)((ulong)uVar8 >> 0x10) & bVar46,
                                                  CONCAT11((byte)((ulong)uVar100 >> 8) & bVar53 |
                                                           (byte)((ulong)uVar8 >> 8) & bVar45,
                                                           (byte)uVar100 & bVar52 |
                                                           (byte)uVar8 & bVar44)))))));
              puVar20[-1] = CONCAT17((byte)((ulong)uVar103 >> 0x38) & bVar59 |
                                     (byte)((ulong)uVar87 >> 0x38) & bVar51,
                                     CONCAT16((byte)((ulong)uVar103 >> 0x30) & bVar58 |
                                              (byte)((ulong)uVar87 >> 0x30) & bVar50,
                                              CONCAT15((byte)((ulong)uVar103 >> 0x28) & bVar57 |
                                                       (byte)((ulong)uVar87 >> 0x28) & bVar49,
                                                       CONCAT14((byte)((ulong)uVar103 >> 0x20) &
                                                                bVar56 | (byte)((ulong)uVar87 >>
                                                                               0x20) & bVar48,
                                                                CONCAT13((byte)((ulong)uVar103 >>
                                                                               0x18) & bVar55 |
                                                                         (byte)((ulong)uVar87 >>
                                                                               0x18) & bVar47,
                                                                         CONCAT12((byte)((ulong)
                                                  uVar103 >> 0x10) & bVar54 |
                                                  (byte)((ulong)uVar87 >> 0x10) & bVar46,
                                                  CONCAT11((byte)((ulong)uVar103 >> 8) & bVar53 |
                                                           (byte)((ulong)uVar87 >> 8) & bVar45,
                                                           (byte)uVar103 & bVar52 |
                                                           (byte)uVar87 & bVar44)))))));
              puVar20[-2] = CONCAT17((byte)((ulong)uVar102 >> 0x38) & bVar59 |
                                     (byte)((ulong)uVar77 >> 0x38) & bVar51,
                                     CONCAT16((byte)((ulong)uVar102 >> 0x30) & bVar58 |
                                              (byte)((ulong)uVar77 >> 0x30) & bVar50,
                                              CONCAT15((byte)((ulong)uVar102 >> 0x28) & bVar57 |
                                                       (byte)((ulong)uVar77 >> 0x28) & bVar49,
                                                       CONCAT14((byte)((ulong)uVar102 >> 0x20) &
                                                                bVar56 | (byte)((ulong)uVar77 >>
                                                                               0x20) & bVar48,
                                                                CONCAT13((byte)((ulong)uVar102 >>
                                                                               0x18) & bVar55 |
                                                                         (byte)((ulong)uVar77 >>
                                                                               0x18) & bVar47,
                                                                         CONCAT12((byte)((ulong)
                                                  uVar102 >> 0x10) & bVar54 |
                                                  (byte)((ulong)uVar77 >> 0x10) & bVar46,
                                                  CONCAT11((byte)((ulong)uVar102 >> 8) & bVar53 |
                                                           (byte)((ulong)uVar77 >> 8) & bVar45,
                                                           (byte)uVar102 & bVar52 |
                                                           (byte)uVar77 & bVar44)))))));
              puVar20[1] = CONCAT17((byte)((ulong)uVar105 >> 0x38) & bVar59 |
                                    (byte)((ulong)uVar97 >> 0x38) & bVar51,
                                    CONCAT16((byte)((ulong)uVar105 >> 0x30) & bVar58 |
                                             (byte)((ulong)uVar97 >> 0x30) & bVar50,
                                             CONCAT15((byte)((ulong)uVar105 >> 0x28) & bVar57 |
                                                      (byte)((ulong)uVar97 >> 0x28) & bVar49,
                                                      CONCAT14((byte)((ulong)uVar105 >> 0x20) &
                                                               bVar56 | (byte)((ulong)uVar97 >> 0x20
                                                                              ) & bVar48,
                                                               CONCAT13((byte)((ulong)uVar105 >>
                                                                              0x18) & bVar55 |
                                                                        (byte)((ulong)uVar97 >> 0x18
                                                                              ) & bVar47,
                                                                        CONCAT12((byte)((ulong)
                                                  uVar105 >> 0x10) & bVar54 |
                                                  (byte)((ulong)uVar97 >> 0x10) & bVar46,
                                                  CONCAT11((byte)((ulong)uVar105 >> 8) & bVar53 |
                                                           (byte)((ulong)uVar97 >> 8) & bVar45,
                                                           (byte)uVar105 & bVar52 |
                                                           (byte)uVar97 & bVar44)))))));
              *puVar20 = CONCAT17((byte)((ulong)uVar104 >> 0x38) & bVar59 |
                                  (byte)((ulong)uVar95 >> 0x38) & bVar51,
                                  CONCAT16((byte)((ulong)uVar104 >> 0x30) & bVar58 |
                                           (byte)((ulong)uVar95 >> 0x30) & bVar50,
                                           CONCAT15((byte)((ulong)uVar104 >> 0x28) & bVar57 |
                                                    (byte)((ulong)uVar95 >> 0x28) & bVar49,
                                                    CONCAT14((byte)((ulong)uVar104 >> 0x20) & bVar56
                                                             | (byte)((ulong)uVar95 >> 0x20) &
                                                               bVar48,CONCAT13((byte)((ulong)uVar104
                                                                                     >> 0x18) &
                                                                               bVar55 | (byte)((
                                                  ulong)uVar95 >> 0x18) & bVar47,
                                                  CONCAT12((byte)((ulong)uVar104 >> 0x10) & bVar54 |
                                                           (byte)((ulong)uVar95 >> 0x10) & bVar46,
                                                           CONCAT11((byte)((ulong)uVar104 >> 8) &
                                                                    bVar53 | (byte)((ulong)uVar95 >>
                                                                                   8) & bVar45,
                                                                    (byte)uVar104 & bVar52 |
                                                                    (byte)uVar95 & bVar44)))))));
              puVar20[3] = CONCAT17((byte)((ulong)uVar107 >> 0x38) & bVar59 |
                                    (byte)((ulong)uVar99 >> 0x38) & bVar51,
                                    CONCAT16((byte)((ulong)uVar107 >> 0x30) & bVar58 |
                                             (byte)((ulong)uVar99 >> 0x30) & bVar50,
                                             CONCAT15((byte)((ulong)uVar107 >> 0x28) & bVar57 |
                                                      (byte)((ulong)uVar99 >> 0x28) & bVar49,
                                                      CONCAT14((byte)((ulong)uVar107 >> 0x20) &
                                                               bVar56 | (byte)((ulong)uVar99 >> 0x20
                                                                              ) & bVar48,
                                                               CONCAT13((byte)((ulong)uVar107 >>
                                                                              0x18) & bVar55 |
                                                                        (byte)((ulong)uVar99 >> 0x18
                                                                              ) & bVar47,
                                                                        CONCAT12((byte)((ulong)
                                                  uVar107 >> 0x10) & bVar54 |
                                                  (byte)((ulong)uVar99 >> 0x10) & bVar46,
                                                  CONCAT11((byte)((ulong)uVar107 >> 8) & bVar53 |
                                                           (byte)((ulong)uVar99 >> 8) & bVar45,
                                                           (byte)uVar107 & bVar52 |
                                                           (byte)uVar99 & bVar44)))))));
              puVar20[2] = CONCAT17((byte)((ulong)uVar106 >> 0x38) & bVar59 |
                                    (byte)((ulong)uVar98 >> 0x38) & bVar51,
                                    CONCAT16((byte)((ulong)uVar106 >> 0x30) & bVar58 |
                                             (byte)((ulong)uVar98 >> 0x30) & bVar50,
                                             CONCAT15((byte)((ulong)uVar106 >> 0x28) & bVar57 |
                                                      (byte)((ulong)uVar98 >> 0x28) & bVar49,
                                                      CONCAT14((byte)((ulong)uVar106 >> 0x20) &
                                                               bVar56 | (byte)((ulong)uVar98 >> 0x20
                                                                              ) & bVar48,
                                                               CONCAT13((byte)((ulong)uVar106 >>
                                                                              0x18) & bVar55 |
                                                                        (byte)((ulong)uVar98 >> 0x18
                                                                              ) & bVar47,
                                                                        CONCAT12((byte)((ulong)
                                                  uVar106 >> 0x10) & bVar54 |
                                                  (byte)((ulong)uVar98 >> 0x10) & bVar46,
                                                  CONCAT11((byte)((ulong)uVar106 >> 8) & bVar53 |
                                                           (byte)((ulong)uVar98 >> 8) & bVar45,
                                                           (byte)uVar106 & bVar52 |
                                                           (byte)uVar98 & bVar44)))))));
              uVar21 = uVar21 - 8;
              puVar27 = puVar27 + 8;
              puVar20 = puVar20 + 8;
            } while (uVar21 != 0);
            uVar21 = uVar14;
            if (uVar14 != unaff_x23) goto code_r0x002a6260;
          }
          uVar18 = **(ulong **)(unaff_x29 + -0x58);
          uVar17 = ~uVar26;
          if ((unaff_w28 < 8) || (uVar18 < uVar6 + lVar4 && uVar6 < uVar18 + lVar4)) {
            uVar21 = 0;
code_r0x002a6340:
            lVar5 = unaff_x23 - uVar21;
            puVar16 = (ulong *)(uVar18 + uVar21 * 8);
            puVar22 = (ulong *)(uVar6 + uVar21 * 8);
            do {
              *puVar16 = *puVar16 & uVar17 | *puVar22 & uVar26;
              lVar5 = lVar5 + -1;
              puVar16 = puVar16 + 1;
              puVar22 = puVar22 + 1;
            } while (lVar5 != 0);
          }
          else {
            puVar27 = (undefined8 *)(uVar18 + 0x20);
            puVar20 = (undefined8 *)(uVar6 + 0x20);
            uVar21 = uVar14;
            do {
              uVar9 = puVar20[-3];
              uVar8 = puVar20[-4];
              uVar87 = puVar20[-1];
              uVar77 = puVar20[-2];
              uVar97 = puVar20[1];
              uVar95 = *puVar20;
              uVar99 = puVar20[3];
              uVar98 = puVar20[2];
              uVar101 = puVar27[-3];
              uVar100 = puVar27[-4];
              uVar103 = puVar27[-1];
              uVar102 = puVar27[-2];
              uVar105 = puVar27[1];
              uVar104 = *puVar27;
              uVar107 = puVar27[3];
              uVar106 = puVar27[2];
              bVar52 = (byte)uVar17;
              bVar53 = (byte)(uVar17 >> 8);
              bVar54 = (byte)(uVar17 >> 0x10);
              bVar55 = (byte)(uVar17 >> 0x18);
              bVar56 = (byte)(uVar17 >> 0x20);
              bVar57 = (byte)(uVar17 >> 0x28);
              bVar58 = (byte)(uVar17 >> 0x30);
              bVar59 = (byte)(uVar17 >> 0x38);
              puVar27[-3] = CONCAT17((byte)((ulong)uVar101 >> 0x38) & bVar59 |
                                     (byte)((ulong)uVar9 >> 0x38) & bVar43,
                                     CONCAT16((byte)((ulong)uVar101 >> 0x30) & bVar58 |
                                              (byte)((ulong)uVar9 >> 0x30) & bVar42,
                                              CONCAT15((byte)((ulong)uVar101 >> 0x28) & bVar57 |
                                                       (byte)((ulong)uVar9 >> 0x28) & bVar41,
                                                       CONCAT14((byte)((ulong)uVar101 >> 0x20) &
                                                                bVar56 | (byte)((ulong)uVar9 >> 0x20
                                                                               ) & bVar40,
                                                                CONCAT13((byte)((ulong)uVar101 >>
                                                                               0x18) & bVar55 |
                                                                         (byte)((ulong)uVar9 >> 0x18
                                                                               ) & bVar39,
                                                                         CONCAT12((byte)((ulong)
                                                  uVar101 >> 0x10) & bVar54 |
                                                  (byte)((ulong)uVar9 >> 0x10) & bVar38,
                                                  CONCAT11((byte)((ulong)uVar101 >> 8) & bVar53 |
                                                           (byte)((ulong)uVar9 >> 8) & bVar37,
                                                           (byte)uVar101 & bVar52 |
                                                           (byte)uVar9 & bVar36)))))));
              puVar27[-4] = CONCAT17((byte)((ulong)uVar100 >> 0x38) & bVar59 |
                                     (byte)((ulong)uVar8 >> 0x38) & bVar43,
                                     CONCAT16((byte)((ulong)uVar100 >> 0x30) & bVar58 |
                                              (byte)((ulong)uVar8 >> 0x30) & bVar42,
                                              CONCAT15((byte)((ulong)uVar100 >> 0x28) & bVar57 |
                                                       (byte)((ulong)uVar8 >> 0x28) & bVar41,
                                                       CONCAT14((byte)((ulong)uVar100 >> 0x20) &
                                                                bVar56 | (byte)((ulong)uVar8 >> 0x20
                                                                               ) & bVar40,
                                                                CONCAT13((byte)((ulong)uVar100 >>
                                                                               0x18) & bVar55 |
                                                                         (byte)((ulong)uVar8 >> 0x18
                                                                               ) & bVar39,
                                                                         CONCAT12((byte)((ulong)
                                                  uVar100 >> 0x10) & bVar54 |
                                                  (byte)((ulong)uVar8 >> 0x10) & bVar38,
                                                  CONCAT11((byte)((ulong)uVar100 >> 8) & bVar53 |
                                                           (byte)((ulong)uVar8 >> 8) & bVar37,
                                                           (byte)uVar100 & bVar52 |
                                                           (byte)uVar8 & bVar36)))))));
              puVar27[-1] = CONCAT17((byte)((ulong)uVar103 >> 0x38) & bVar59 |
                                     (byte)((ulong)uVar87 >> 0x38) & bVar43,
                                     CONCAT16((byte)((ulong)uVar103 >> 0x30) & bVar58 |
                                              (byte)((ulong)uVar87 >> 0x30) & bVar42,
                                              CONCAT15((byte)((ulong)uVar103 >> 0x28) & bVar57 |
                                                       (byte)((ulong)uVar87 >> 0x28) & bVar41,
                                                       CONCAT14((byte)((ulong)uVar103 >> 0x20) &
                                                                bVar56 | (byte)((ulong)uVar87 >>
                                                                               0x20) & bVar40,
                                                                CONCAT13((byte)((ulong)uVar103 >>
                                                                               0x18) & bVar55 |
                                                                         (byte)((ulong)uVar87 >>
                                                                               0x18) & bVar39,
                                                                         CONCAT12((byte)((ulong)
                                                  uVar103 >> 0x10) & bVar54 |
                                                  (byte)((ulong)uVar87 >> 0x10) & bVar38,
                                                  CONCAT11((byte)((ulong)uVar103 >> 8) & bVar53 |
                                                           (byte)((ulong)uVar87 >> 8) & bVar37,
                                                           (byte)uVar103 & bVar52 |
                                                           (byte)uVar87 & bVar36)))))));
              puVar27[-2] = CONCAT17((byte)((ulong)uVar102 >> 0x38) & bVar59 |
                                     (byte)((ulong)uVar77 >> 0x38) & bVar43,
                                     CONCAT16((byte)((ulong)uVar102 >> 0x30) & bVar58 |
                                              (byte)((ulong)uVar77 >> 0x30) & bVar42,
                                              CONCAT15((byte)((ulong)uVar102 >> 0x28) & bVar57 |
                                                       (byte)((ulong)uVar77 >> 0x28) & bVar41,
                                                       CONCAT14((byte)((ulong)uVar102 >> 0x20) &
                                                                bVar56 | (byte)((ulong)uVar77 >>
                                                                               0x20) & bVar40,
                                                                CONCAT13((byte)((ulong)uVar102 >>
                                                                               0x18) & bVar55 |
                                                                         (byte)((ulong)uVar77 >>
                                                                               0x18) & bVar39,
                                                                         CONCAT12((byte)((ulong)
                                                  uVar102 >> 0x10) & bVar54 |
                                                  (byte)((ulong)uVar77 >> 0x10) & bVar38,
                                                  CONCAT11((byte)((ulong)uVar102 >> 8) & bVar53 |
                                                           (byte)((ulong)uVar77 >> 8) & bVar37,
                                                           (byte)uVar102 & bVar52 |
                                                           (byte)uVar77 & bVar36)))))));
              puVar27[1] = CONCAT17((byte)((ulong)uVar105 >> 0x38) & bVar59 |
                                    (byte)((ulong)uVar97 >> 0x38) & bVar43,
                                    CONCAT16((byte)((ulong)uVar105 >> 0x30) & bVar58 |
                                             (byte)((ulong)uVar97 >> 0x30) & bVar42,
                                             CONCAT15((byte)((ulong)uVar105 >> 0x28) & bVar57 |
                                                      (byte)((ulong)uVar97 >> 0x28) & bVar41,
                                                      CONCAT14((byte)((ulong)uVar105 >> 0x20) &
                                                               bVar56 | (byte)((ulong)uVar97 >> 0x20
                                                                              ) & bVar40,
                                                               CONCAT13((byte)((ulong)uVar105 >>
                                                                              0x18) & bVar55 |
                                                                        (byte)((ulong)uVar97 >> 0x18
                                                                              ) & bVar39,
                                                                        CONCAT12((byte)((ulong)
                                                  uVar105 >> 0x10) & bVar54 |
                                                  (byte)((ulong)uVar97 >> 0x10) & bVar38,
                                                  CONCAT11((byte)((ulong)uVar105 >> 8) & bVar53 |
                                                           (byte)((ulong)uVar97 >> 8) & bVar37,
                                                           (byte)uVar105 & bVar52 |
                                                           (byte)uVar97 & bVar36)))))));
              *puVar27 = CONCAT17((byte)((ulong)uVar104 >> 0x38) & bVar59 |
                                  (byte)((ulong)uVar95 >> 0x38) & bVar43,
                                  CONCAT16((byte)((ulong)uVar104 >> 0x30) & bVar58 |
                                           (byte)((ulong)uVar95 >> 0x30) & bVar42,
                                           CONCAT15((byte)((ulong)uVar104 >> 0x28) & bVar57 |
                                                    (byte)((ulong)uVar95 >> 0x28) & bVar41,
                                                    CONCAT14((byte)((ulong)uVar104 >> 0x20) & bVar56
                                                             | (byte)((ulong)uVar95 >> 0x20) &
                                                               bVar40,CONCAT13((byte)((ulong)uVar104
                                                                                     >> 0x18) &
                                                                               bVar55 | (byte)((
                                                  ulong)uVar95 >> 0x18) & bVar39,
                                                  CONCAT12((byte)((ulong)uVar104 >> 0x10) & bVar54 |
                                                           (byte)((ulong)uVar95 >> 0x10) & bVar38,
                                                           CONCAT11((byte)((ulong)uVar104 >> 8) &
                                                                    bVar53 | (byte)((ulong)uVar95 >>
                                                                                   8) & bVar37,
                                                                    (byte)uVar104 & bVar52 |
                                                                    (byte)uVar95 & bVar36)))))));
              puVar27[3] = CONCAT17((byte)((ulong)uVar107 >> 0x38) & bVar59 |
                                    (byte)((ulong)uVar99 >> 0x38) & bVar43,
                                    CONCAT16((byte)((ulong)uVar107 >> 0x30) & bVar58 |
                                             (byte)((ulong)uVar99 >> 0x30) & bVar42,
                                             CONCAT15((byte)((ulong)uVar107 >> 0x28) & bVar57 |
                                                      (byte)((ulong)uVar99 >> 0x28) & bVar41,
                                                      CONCAT14((byte)((ulong)uVar107 >> 0x20) &
                                                               bVar56 | (byte)((ulong)uVar99 >> 0x20
                                                                              ) & bVar40,
                                                               CONCAT13((byte)((ulong)uVar107 >>
                                                                              0x18) & bVar55 |
                                                                        (byte)((ulong)uVar99 >> 0x18
                                                                              ) & bVar39,
                                                                        CONCAT12((byte)((ulong)
                                                  uVar107 >> 0x10) & bVar54 |
                                                  (byte)((ulong)uVar99 >> 0x10) & bVar38,
                                                  CONCAT11((byte)((ulong)uVar107 >> 8) & bVar53 |
                                                           (byte)((ulong)uVar99 >> 8) & bVar37,
                                                           (byte)uVar107 & bVar52 |
                                                           (byte)uVar99 & bVar36)))))));
              puVar27[2] = CONCAT17((byte)((ulong)uVar106 >> 0x38) & bVar59 |
                                    (byte)((ulong)uVar98 >> 0x38) & bVar43,
                                    CONCAT16((byte)((ulong)uVar106 >> 0x30) & bVar58 |
                                             (byte)((ulong)uVar98 >> 0x30) & bVar42,
                                             CONCAT15((byte)((ulong)uVar106 >> 0x28) & bVar57 |
                                                      (byte)((ulong)uVar98 >> 0x28) & bVar41,
                                                      CONCAT14((byte)((ulong)uVar106 >> 0x20) &
                                                               bVar56 | (byte)((ulong)uVar98 >> 0x20
                                                                              ) & bVar40,
                                                               CONCAT13((byte)((ulong)uVar106 >>
                                                                              0x18) & bVar55 |
                                                                        (byte)((ulong)uVar98 >> 0x18
                                                                              ) & bVar39,
                                                                        CONCAT12((byte)((ulong)
                                                  uVar106 >> 0x10) & bVar54 |
                                                  (byte)((ulong)uVar98 >> 0x10) & bVar38,
                                                  CONCAT11((byte)((ulong)uVar106 >> 8) & bVar53 |
                                                           (byte)((ulong)uVar98 >> 8) & bVar37,
                                                           (byte)uVar106 & bVar52 |
                                                           (byte)uVar98 & bVar36)))))));
              uVar21 = uVar21 - 8;
              puVar27 = puVar27 + 8;
              puVar20 = puVar20 + 8;
            } while (uVar21 != 0);
            uVar21 = uVar14;
            if (uVar14 != unaff_x23) goto code_r0x002a6340;
          }
          uVar18 = *in_stack_00000070;
          uVar17 = ~uVar15;
          if ((unaff_w28 < 8) || (uVar18 < uVar6 + lVar4 && uVar6 < uVar18 + lVar4)) {
            uVar21 = 0;
          }
          else {
            puVar27 = (undefined8 *)(uVar18 + 0x20);
            puVar20 = (undefined8 *)(uVar6 + 0x20);
            uVar21 = uVar14;
            do {
              uVar9 = puVar20[-3];
              uVar8 = puVar20[-4];
              uVar87 = puVar20[-1];
              uVar77 = puVar20[-2];
              uVar97 = puVar20[1];
              uVar95 = *puVar20;
              uVar99 = puVar20[3];
              uVar98 = puVar20[2];
              uVar101 = puVar27[-3];
              uVar100 = puVar27[-4];
              uVar103 = puVar27[-1];
              uVar102 = puVar27[-2];
              uVar105 = puVar27[1];
              uVar104 = *puVar27;
              uVar107 = puVar27[3];
              uVar106 = puVar27[2];
              bVar52 = (byte)uVar17;
              bVar53 = (byte)(uVar17 >> 8);
              bVar54 = (byte)(uVar17 >> 0x10);
              bVar55 = (byte)(uVar17 >> 0x18);
              bVar56 = (byte)(uVar17 >> 0x20);
              bVar57 = (byte)(uVar17 >> 0x28);
              bVar58 = (byte)(uVar17 >> 0x30);
              bVar59 = (byte)(uVar17 >> 0x38);
              puVar27[-3] = CONCAT17((byte)((ulong)uVar101 >> 0x38) & bVar59 |
                                     (byte)((ulong)uVar9 >> 0x38) & bVar35,
                                     CONCAT16((byte)((ulong)uVar101 >> 0x30) & bVar58 |
                                              (byte)((ulong)uVar9 >> 0x30) & bVar34,
                                              CONCAT15((byte)((ulong)uVar101 >> 0x28) & bVar57 |
                                                       (byte)((ulong)uVar9 >> 0x28) & bVar33,
                                                       CONCAT14((byte)((ulong)uVar101 >> 0x20) &
                                                                bVar56 | (byte)((ulong)uVar9 >> 0x20
                                                                               ) & bVar32,
                                                                CONCAT13((byte)((ulong)uVar101 >>
                                                                               0x18) & bVar55 |
                                                                         (byte)((ulong)uVar9 >> 0x18
                                                                               ) & bVar31,
                                                                         CONCAT12((byte)((ulong)
                                                  uVar101 >> 0x10) & bVar54 |
                                                  (byte)((ulong)uVar9 >> 0x10) & bVar30,
                                                  CONCAT11((byte)((ulong)uVar101 >> 8) & bVar53 |
                                                           (byte)((ulong)uVar9 >> 8) & bVar29,
                                                           (byte)uVar101 & bVar52 |
                                                           (byte)uVar9 & bVar28)))))));
              puVar27[-4] = CONCAT17((byte)((ulong)uVar100 >> 0x38) & bVar59 |
                                     (byte)((ulong)uVar8 >> 0x38) & bVar35,
                                     CONCAT16((byte)((ulong)uVar100 >> 0x30) & bVar58 |
                                              (byte)((ulong)uVar8 >> 0x30) & bVar34,
                                              CONCAT15((byte)((ulong)uVar100 >> 0x28) & bVar57 |
                                                       (byte)((ulong)uVar8 >> 0x28) & bVar33,
                                                       CONCAT14((byte)((ulong)uVar100 >> 0x20) &
                                                                bVar56 | (byte)((ulong)uVar8 >> 0x20
                                                                               ) & bVar32,
                                                                CONCAT13((byte)((ulong)uVar100 >>
                                                                               0x18) & bVar55 |
                                                                         (byte)((ulong)uVar8 >> 0x18
                                                                               ) & bVar31,
                                                                         CONCAT12((byte)((ulong)
                                                  uVar100 >> 0x10) & bVar54 |
                                                  (byte)((ulong)uVar8 >> 0x10) & bVar30,
                                                  CONCAT11((byte)((ulong)uVar100 >> 8) & bVar53 |
                                                           (byte)((ulong)uVar8 >> 8) & bVar29,
                                                           (byte)uVar100 & bVar52 |
                                                           (byte)uVar8 & bVar28)))))));
              puVar27[-1] = CONCAT17((byte)((ulong)uVar103 >> 0x38) & bVar59 |
                                     (byte)((ulong)uVar87 >> 0x38) & bVar35,
                                     CONCAT16((byte)((ulong)uVar103 >> 0x30) & bVar58 |
                                              (byte)((ulong)uVar87 >> 0x30) & bVar34,
                                              CONCAT15((byte)((ulong)uVar103 >> 0x28) & bVar57 |
                                                       (byte)((ulong)uVar87 >> 0x28) & bVar33,
                                                       CONCAT14((byte)((ulong)uVar103 >> 0x20) &
                                                                bVar56 | (byte)((ulong)uVar87 >>
                                                                               0x20) & bVar32,
                                                                CONCAT13((byte)((ulong)uVar103 >>
                                                                               0x18) & bVar55 |
                                                                         (byte)((ulong)uVar87 >>
                                                                               0x18) & bVar31,
                                                                         CONCAT12((byte)((ulong)
                                                  uVar103 >> 0x10) & bVar54 |
                                                  (byte)((ulong)uVar87 >> 0x10) & bVar30,
                                                  CONCAT11((byte)((ulong)uVar103 >> 8) & bVar53 |
                                                           (byte)((ulong)uVar87 >> 8) & bVar29,
                                                           (byte)uVar103 & bVar52 |
                                                           (byte)uVar87 & bVar28)))))));
              puVar27[-2] = CONCAT17((byte)((ulong)uVar102 >> 0x38) & bVar59 |
                                     (byte)((ulong)uVar77 >> 0x38) & bVar35,
                                     CONCAT16((byte)((ulong)uVar102 >> 0x30) & bVar58 |
                                              (byte)((ulong)uVar77 >> 0x30) & bVar34,
                                              CONCAT15((byte)((ulong)uVar102 >> 0x28) & bVar57 |
                                                       (byte)((ulong)uVar77 >> 0x28) & bVar33,
                                                       CONCAT14((byte)((ulong)uVar102 >> 0x20) &
                                                                bVar56 | (byte)((ulong)uVar77 >>
                                                                               0x20) & bVar32,
                                                                CONCAT13((byte)((ulong)uVar102 >>
                                                                               0x18) & bVar55 |
                                                                         (byte)((ulong)uVar77 >>
                                                                               0x18) & bVar31,
                                                                         CONCAT12((byte)((ulong)
                                                  uVar102 >> 0x10) & bVar54 |
                                                  (byte)((ulong)uVar77 >> 0x10) & bVar30,
                                                  CONCAT11((byte)((ulong)uVar102 >> 8) & bVar53 |
                                                           (byte)((ulong)uVar77 >> 8) & bVar29,
                                                           (byte)uVar102 & bVar52 |
                                                           (byte)uVar77 & bVar28)))))));
              puVar27[1] = CONCAT17((byte)((ulong)uVar105 >> 0x38) & bVar59 |
                                    (byte)((ulong)uVar97 >> 0x38) & bVar35,
                                    CONCAT16((byte)((ulong)uVar105 >> 0x30) & bVar58 |
                                             (byte)((ulong)uVar97 >> 0x30) & bVar34,
                                             CONCAT15((byte)((ulong)uVar105 >> 0x28) & bVar57 |
                                                      (byte)((ulong)uVar97 >> 0x28) & bVar33,
                                                      CONCAT14((byte)((ulong)uVar105 >> 0x20) &
                                                               bVar56 | (byte)((ulong)uVar97 >> 0x20
                                                                              ) & bVar32,
                                                               CONCAT13((byte)((ulong)uVar105 >>
                                                                              0x18) & bVar55 |
                                                                        (byte)((ulong)uVar97 >> 0x18
                                                                              ) & bVar31,
                                                                        CONCAT12((byte)((ulong)
                                                  uVar105 >> 0x10) & bVar54 |
                                                  (byte)((ulong)uVar97 >> 0x10) & bVar30,
                                                  CONCAT11((byte)((ulong)uVar105 >> 8) & bVar53 |
                                                           (byte)((ulong)uVar97 >> 8) & bVar29,
                                                           (byte)uVar105 & bVar52 |
                                                           (byte)uVar97 & bVar28)))))));
              *puVar27 = CONCAT17((byte)((ulong)uVar104 >> 0x38) & bVar59 |
                                  (byte)((ulong)uVar95 >> 0x38) & bVar35,
                                  CONCAT16((byte)((ulong)uVar104 >> 0x30) & bVar58 |
                                           (byte)((ulong)uVar95 >> 0x30) & bVar34,
                                           CONCAT15((byte)((ulong)uVar104 >> 0x28) & bVar57 |
                                                    (byte)((ulong)uVar95 >> 0x28) & bVar33,
                                                    CONCAT14((byte)((ulong)uVar104 >> 0x20) & bVar56
                                                             | (byte)((ulong)uVar95 >> 0x20) &
                                                               bVar32,CONCAT13((byte)((ulong)uVar104
                                                                                     >> 0x18) &
                                                                               bVar55 | (byte)((
                                                  ulong)uVar95 >> 0x18) & bVar31,
                                                  CONCAT12((byte)((ulong)uVar104 >> 0x10) & bVar54 |
                                                           (byte)((ulong)uVar95 >> 0x10) & bVar30,
                                                           CONCAT11((byte)((ulong)uVar104 >> 8) &
                                                                    bVar53 | (byte)((ulong)uVar95 >>
                                                                                   8) & bVar29,
                                                                    (byte)uVar104 & bVar52 |
                                                                    (byte)uVar95 & bVar28)))))));
              puVar27[3] = CONCAT17((byte)((ulong)uVar107 >> 0x38) & bVar59 |
                                    (byte)((ulong)uVar99 >> 0x38) & bVar35,
                                    CONCAT16((byte)((ulong)uVar107 >> 0x30) & bVar58 |
                                             (byte)((ulong)uVar99 >> 0x30) & bVar34,
                                             CONCAT15((byte)((ulong)uVar107 >> 0x28) & bVar57 |
                                                      (byte)((ulong)uVar99 >> 0x28) & bVar33,
                                                      CONCAT14((byte)((ulong)uVar107 >> 0x20) &
                                                               bVar56 | (byte)((ulong)uVar99 >> 0x20
                                                                              ) & bVar32,
                                                               CONCAT13((byte)((ulong)uVar107 >>
                                                                              0x18) & bVar55 |
                                                                        (byte)((ulong)uVar99 >> 0x18
                                                                              ) & bVar31,
                                                                        CONCAT12((byte)((ulong)
                                                  uVar107 >> 0x10) & bVar54 |
                                                  (byte)((ulong)uVar99 >> 0x10) & bVar30,
                                                  CONCAT11((byte)((ulong)uVar107 >> 8) & bVar53 |
                                                           (byte)((ulong)uVar99 >> 8) & bVar29,
                                                           (byte)uVar107 & bVar52 |
                                                           (byte)uVar99 & bVar28)))))));
              puVar27[2] = CONCAT17((byte)((ulong)uVar106 >> 0x38) & bVar59 |
                                    (byte)((ulong)uVar98 >> 0x38) & bVar35,
                                    CONCAT16((byte)((ulong)uVar106 >> 0x30) & bVar58 |
                                             (byte)((ulong)uVar98 >> 0x30) & bVar34,
                                             CONCAT15((byte)((ulong)uVar106 >> 0x28) & bVar57 |
                                                      (byte)((ulong)uVar98 >> 0x28) & bVar33,
                                                      CONCAT14((byte)((ulong)uVar106 >> 0x20) &
                                                               bVar56 | (byte)((ulong)uVar98 >> 0x20
                                                                              ) & bVar32,
                                                               CONCAT13((byte)((ulong)uVar106 >>
                                                                              0x18) & bVar55 |
                                                                        (byte)((ulong)uVar98 >> 0x18
                                                                              ) & bVar31,
                                                                        CONCAT12((byte)((ulong)
                                                  uVar106 >> 0x10) & bVar54 |
                                                  (byte)((ulong)uVar98 >> 0x10) & bVar30,
                                                  CONCAT11((byte)((ulong)uVar106 >> 8) & bVar53 |
                                                           (byte)((ulong)uVar98 >> 8) & bVar29,
                                                           (byte)uVar106 & bVar52 |
                                                           (byte)uVar98 & bVar28)))))));
              uVar21 = uVar21 - 8;
              puVar27 = puVar27 + 8;
              puVar20 = puVar20 + 8;
            } while (uVar21 != 0);
            uVar21 = uVar14;
            if (uVar14 == unaff_x23) goto code_r0x002a6450;
          }
          lVar5 = unaff_x23 - uVar21;
          puVar16 = (ulong *)(uVar18 + uVar21 * 8);
          puVar22 = (ulong *)(uVar6 + uVar21 * 8);
          do {
            *puVar16 = *puVar16 & uVar17 | *puVar22 & uVar15;
            lVar5 = lVar5 + -1;
            puVar16 = puVar16 + 1;
            puVar22 = puVar22 + 1;
          } while (lVar5 != 0);
        }
code_r0x002a6450:
        func_0x00382c70(uVar6,**(undefined8 **)(unaff_x29 + -0x68),
                        **(undefined8 **)(unaff_x29 + -0x60),pcVar25);
        param_5 = pcVar25;
        func_0x00382cc0(*in_x9,*in_stack_00000068,*unaff_x24);
        param_4 = (char *)*in_stack_00000068;
        if (unaff_w26 != 0) {
          puVar19 = (undefined1 *)*in_x9;
          uVar6 = ~uVar10;
          if ((unaff_w26 < 8) ||
             (param_4 < puVar19 + (long)pcVar25 * 8 && puVar19 < param_4 + (long)pcVar25 * 8)) {
            pcVar24 = (char *)0x0;
code_r0x002a653c:
            lVar5 = (long)pcVar25 - (long)pcVar24;
            puVar16 = (ulong *)(puVar19 + (long)pcVar24 * 8);
            pcVar24 = param_4 + (long)pcVar24 * 8;
            do {
              *(ulong *)pcVar24 = *puVar16 & uVar6 | *(ulong *)pcVar24 & uVar10;
              lVar5 = lVar5 + -1;
              puVar16 = puVar16 + 1;
              pcVar24 = pcVar24 + 8;
            } while (lVar5 != 0);
          }
          else {
            puVar27 = (undefined8 *)(puVar19 + 0x20);
            pqVar23 = (qword *)(param_4 + 0x20);
            pcVar24 = pcVar13;
            do {
              uVar9 = pqVar23[-3];
              uVar8 = pqVar23[-4];
              qVar86 = pqVar23[-1];
              uVar77 = pqVar23[-2];
              uVar87 = pqVar23[1];
              qVar96 = *pqVar23;
              uVar97 = pqVar23[3];
              uVar95 = pqVar23[2];
              uVar99 = puVar27[-3];
              uVar98 = puVar27[-4];
              uVar101 = puVar27[-1];
              uVar100 = puVar27[-2];
              uVar103 = puVar27[1];
              uVar102 = *puVar27;
              uVar105 = puVar27[3];
              uVar104 = puVar27[2];
              bVar52 = (byte)uVar6;
              bVar53 = (byte)(uVar6 >> 8);
              bVar54 = (byte)(uVar6 >> 0x10);
              bVar55 = (byte)(uVar6 >> 0x18);
              bVar56 = (byte)(uVar6 >> 0x20);
              bVar57 = (byte)(uVar6 >> 0x28);
              bVar58 = (byte)(uVar6 >> 0x30);
              bVar59 = (byte)(uVar6 >> 0x38);
              pqVar23[-3] = CONCAT17((byte)((ulong)uVar99 >> 0x38) & bVar59 |
                                     (byte)((ulong)uVar9 >> 0x38) & bVar51,
                                     CONCAT16((byte)((ulong)uVar99 >> 0x30) & bVar58 |
                                              (byte)((ulong)uVar9 >> 0x30) & bVar50,
                                              CONCAT15((byte)((ulong)uVar99 >> 0x28) & bVar57 |
                                                       (byte)((ulong)uVar9 >> 0x28) & bVar49,
                                                       CONCAT14((byte)((ulong)uVar99 >> 0x20) &
                                                                bVar56 | (byte)((ulong)uVar9 >> 0x20
                                                                               ) & bVar48,
                                                                CONCAT13((byte)((ulong)uVar99 >>
                                                                               0x18) & bVar55 |
                                                                         (byte)((ulong)uVar9 >> 0x18
                                                                               ) & bVar47,
                                                                         CONCAT12((byte)((ulong)
                                                  uVar99 >> 0x10) & bVar54 |
                                                  (byte)((ulong)uVar9 >> 0x10) & bVar46,
                                                  CONCAT11((byte)((ulong)uVar99 >> 8) & bVar53 |
                                                           (byte)((ulong)uVar9 >> 8) & bVar45,
                                                           (byte)uVar99 & bVar52 |
                                                           (byte)uVar9 & bVar44)))))));
              pqVar23[-4] = CONCAT17((byte)((ulong)uVar98 >> 0x38) & bVar59 |
                                     (byte)((ulong)uVar8 >> 0x38) & bVar51,
                                     CONCAT16((byte)((ulong)uVar98 >> 0x30) & bVar58 |
                                              (byte)((ulong)uVar8 >> 0x30) & bVar50,
                                              CONCAT15((byte)((ulong)uVar98 >> 0x28) & bVar57 |
                                                       (byte)((ulong)uVar8 >> 0x28) & bVar49,
                                                       CONCAT14((byte)((ulong)uVar98 >> 0x20) &
                                                                bVar56 | (byte)((ulong)uVar8 >> 0x20
                                                                               ) & bVar48,
                                                                CONCAT13((byte)((ulong)uVar98 >>
                                                                               0x18) & bVar55 |
                                                                         (byte)((ulong)uVar8 >> 0x18
                                                                               ) & bVar47,
                                                                         CONCAT12((byte)((ulong)
                                                  uVar98 >> 0x10) & bVar54 |
                                                  (byte)((ulong)uVar8 >> 0x10) & bVar46,
                                                  CONCAT11((byte)((ulong)uVar98 >> 8) & bVar53 |
                                                           (byte)((ulong)uVar8 >> 8) & bVar45,
                                                           (byte)uVar98 & bVar52 |
                                                           (byte)uVar8 & bVar44)))))));
              pqVar23[-1] = CONCAT17((byte)((ulong)uVar101 >> 0x38) & bVar59 |
                                     (byte)(qVar86 >> 0x38) & bVar51,
                                     CONCAT16((byte)((ulong)uVar101 >> 0x30) & bVar58 |
                                              (byte)(qVar86 >> 0x30) & bVar50,
                                              CONCAT15((byte)((ulong)uVar101 >> 0x28) & bVar57 |
                                                       (byte)(qVar86 >> 0x28) & bVar49,
                                                       CONCAT14((byte)((ulong)uVar101 >> 0x20) &
                                                                bVar56 | (byte)(qVar86 >> 0x20) &
                                                                         bVar48,
                                                                CONCAT13((byte)((ulong)uVar101 >>
                                                                               0x18) & bVar55 |
                                                                         (byte)(qVar86 >> 0x18) &
                                                                         bVar47,CONCAT12((byte)((
                                                  ulong)uVar101 >> 0x10) & bVar54 |
                                                  (byte)(qVar86 >> 0x10) & bVar46,
                                                  CONCAT11((byte)((ulong)uVar101 >> 8) & bVar53 |
                                                           (byte)(qVar86 >> 8) & bVar45,
                                                           (byte)uVar101 & bVar52 |
                                                           (byte)qVar86 & bVar44)))))));
              pqVar23[-2] = CONCAT17((byte)((ulong)uVar100 >> 0x38) & bVar59 |
                                     (byte)((ulong)uVar77 >> 0x38) & bVar51,
                                     CONCAT16((byte)((ulong)uVar100 >> 0x30) & bVar58 |
                                              (byte)((ulong)uVar77 >> 0x30) & bVar50,
                                              CONCAT15((byte)((ulong)uVar100 >> 0x28) & bVar57 |
                                                       (byte)((ulong)uVar77 >> 0x28) & bVar49,
                                                       CONCAT14((byte)((ulong)uVar100 >> 0x20) &
                                                                bVar56 | (byte)((ulong)uVar77 >>
                                                                               0x20) & bVar48,
                                                                CONCAT13((byte)((ulong)uVar100 >>
                                                                               0x18) & bVar55 |
                                                                         (byte)((ulong)uVar77 >>
                                                                               0x18) & bVar47,
                                                                         CONCAT12((byte)((ulong)
                                                  uVar100 >> 0x10) & bVar54 |
                                                  (byte)((ulong)uVar77 >> 0x10) & bVar46,
                                                  CONCAT11((byte)((ulong)uVar100 >> 8) & bVar53 |
                                                           (byte)((ulong)uVar77 >> 8) & bVar45,
                                                           (byte)uVar100 & bVar52 |
                                                           (byte)uVar77 & bVar44)))))));
              pqVar23[1] = CONCAT17((byte)((ulong)uVar103 >> 0x38) & bVar59 |
                                    (byte)((ulong)uVar87 >> 0x38) & bVar51,
                                    CONCAT16((byte)((ulong)uVar103 >> 0x30) & bVar58 |
                                             (byte)((ulong)uVar87 >> 0x30) & bVar50,
                                             CONCAT15((byte)((ulong)uVar103 >> 0x28) & bVar57 |
                                                      (byte)((ulong)uVar87 >> 0x28) & bVar49,
                                                      CONCAT14((byte)((ulong)uVar103 >> 0x20) &
                                                               bVar56 | (byte)((ulong)uVar87 >> 0x20
                                                                              ) & bVar48,
                                                               CONCAT13((byte)((ulong)uVar103 >>
                                                                              0x18) & bVar55 |
                                                                        (byte)((ulong)uVar87 >> 0x18
                                                                              ) & bVar47,
                                                                        CONCAT12((byte)((ulong)
                                                  uVar103 >> 0x10) & bVar54 |
                                                  (byte)((ulong)uVar87 >> 0x10) & bVar46,
                                                  CONCAT11((byte)((ulong)uVar103 >> 8) & bVar53 |
                                                           (byte)((ulong)uVar87 >> 8) & bVar45,
                                                           (byte)uVar103 & bVar52 |
                                                           (byte)uVar87 & bVar44)))))));
              *pqVar23 = CONCAT17((byte)((ulong)uVar102 >> 0x38) & bVar59 |
                                  (byte)(qVar96 >> 0x38) & bVar51,
                                  CONCAT16((byte)((ulong)uVar102 >> 0x30) & bVar58 |
                                           (byte)(qVar96 >> 0x30) & bVar50,
                                           CONCAT15((byte)((ulong)uVar102 >> 0x28) & bVar57 |
                                                    (byte)(qVar96 >> 0x28) & bVar49,
                                                    CONCAT14((byte)((ulong)uVar102 >> 0x20) & bVar56
                                                             | (byte)(qVar96 >> 0x20) & bVar48,
                                                             CONCAT13((byte)((ulong)uVar102 >> 0x18)
                                                                      & bVar55 |
                                                                      (byte)(qVar96 >> 0x18) &
                                                                      bVar47,CONCAT12((byte)((ulong)
                                                  uVar102 >> 0x10) & bVar54 |
                                                  (byte)(qVar96 >> 0x10) & bVar46,
                                                  CONCAT11((byte)((ulong)uVar102 >> 8) & bVar53 |
                                                           (byte)(qVar96 >> 8) & bVar45,
                                                           (byte)uVar102 & bVar52 |
                                                           (byte)qVar96 & bVar44)))))));
              pqVar23[3] = CONCAT17((byte)((ulong)uVar105 >> 0x38) & bVar59 |
                                    (byte)((ulong)uVar97 >> 0x38) & bVar51,
                                    CONCAT16((byte)((ulong)uVar105 >> 0x30) & bVar58 |
                                             (byte)((ulong)uVar97 >> 0x30) & bVar50,
                                             CONCAT15((byte)((ulong)uVar105 >> 0x28) & bVar57 |
                                                      (byte)((ulong)uVar97 >> 0x28) & bVar49,
                                                      CONCAT14((byte)((ulong)uVar105 >> 0x20) &
                                                               bVar56 | (byte)((ulong)uVar97 >> 0x20
                                                                              ) & bVar48,
                                                               CONCAT13((byte)((ulong)uVar105 >>
                                                                              0x18) & bVar55 |
                                                                        (byte)((ulong)uVar97 >> 0x18
                                                                              ) & bVar47,
                                                                        CONCAT12((byte)((ulong)
                                                  uVar105 >> 0x10) & bVar54 |
                                                  (byte)((ulong)uVar97 >> 0x10) & bVar46,
                                                  CONCAT11((byte)((ulong)uVar105 >> 8) & bVar53 |
                                                           (byte)((ulong)uVar97 >> 8) & bVar45,
                                                           (byte)uVar105 & bVar52 |
                                                           (byte)uVar97 & bVar44)))))));
              pqVar23[2] = CONCAT17((byte)((ulong)uVar104 >> 0x38) & bVar59 |
                                    (byte)((ulong)uVar95 >> 0x38) & bVar51,
                                    CONCAT16((byte)((ulong)uVar104 >> 0x30) & bVar58 |
                                             (byte)((ulong)uVar95 >> 0x30) & bVar50,
                                             CONCAT15((byte)((ulong)uVar104 >> 0x28) & bVar57 |
                                                      (byte)((ulong)uVar95 >> 0x28) & bVar49,
                                                      CONCAT14((byte)((ulong)uVar104 >> 0x20) &
                                                               bVar56 | (byte)((ulong)uVar95 >> 0x20
                                                                              ) & bVar48,
                                                               CONCAT13((byte)((ulong)uVar104 >>
                                                                              0x18) & bVar55 |
                                                                        (byte)((ulong)uVar95 >> 0x18
                                                                              ) & bVar47,
                                                                        CONCAT12((byte)((ulong)
                                                  uVar104 >> 0x10) & bVar54 |
                                                  (byte)((ulong)uVar95 >> 0x10) & bVar46,
                                                  CONCAT11((byte)((ulong)uVar104 >> 8) & bVar53 |
                                                           (byte)((ulong)uVar95 >> 8) & bVar45,
                                                           (byte)uVar104 & bVar52 |
                                                           (byte)uVar95 & bVar44)))))));
              pcVar24 = pcVar24 + -8;
              puVar27 = puVar27 + 8;
              pqVar23 = pqVar23 + 8;
            } while (pcVar24 != (char *)0x0);
            pcVar24 = pcVar13;
            if (pcVar13 != pcVar25) goto code_r0x002a653c;
          }
          puVar19 = (undefined1 *)**(undefined8 **)(unaff_x29 + -0x68);
          uVar6 = ~uVar26;
          if ((unaff_w26 < 8) ||
             (puVar19 < param_4 + (long)pcVar25 * 8 && param_4 < puVar19 + (long)pcVar25 * 8)) {
            pcVar24 = (char *)0x0;
code_r0x002a661c:
            lVar5 = (long)pcVar25 - (long)pcVar24;
            puVar16 = (ulong *)(puVar19 + (long)pcVar24 * 8);
            pcVar24 = param_4 + (long)pcVar24 * 8;
            do {
              *puVar16 = *puVar16 & uVar6 | *(ulong *)pcVar24 & uVar26;
              lVar5 = lVar5 + -1;
              puVar16 = puVar16 + 1;
              pcVar24 = pcVar24 + 8;
            } while (lVar5 != 0);
          }
          else {
            puVar27 = (undefined8 *)(puVar19 + 0x20);
            pqVar23 = (qword *)(param_4 + 0x20);
            pcVar24 = pcVar13;
            do {
              uVar9 = pqVar23[-3];
              uVar8 = pqVar23[-4];
              qVar86 = pqVar23[-1];
              uVar77 = pqVar23[-2];
              uVar87 = pqVar23[1];
              qVar96 = *pqVar23;
              uVar97 = pqVar23[3];
              uVar95 = pqVar23[2];
              uVar99 = puVar27[-3];
              uVar98 = puVar27[-4];
              uVar101 = puVar27[-1];
              uVar100 = puVar27[-2];
              uVar103 = puVar27[1];
              uVar102 = *puVar27;
              uVar105 = puVar27[3];
              uVar104 = puVar27[2];
              bVar44 = (byte)uVar6;
              bVar45 = (byte)(uVar6 >> 8);
              bVar46 = (byte)(uVar6 >> 0x10);
              bVar47 = (byte)(uVar6 >> 0x18);
              bVar48 = (byte)(uVar6 >> 0x20);
              bVar49 = (byte)(uVar6 >> 0x28);
              bVar50 = (byte)(uVar6 >> 0x30);
              bVar51 = (byte)(uVar6 >> 0x38);
              puVar27[-3] = CONCAT17((byte)((ulong)uVar99 >> 0x38) & bVar51 |
                                     (byte)((ulong)uVar9 >> 0x38) & bVar43,
                                     CONCAT16((byte)((ulong)uVar99 >> 0x30) & bVar50 |
                                              (byte)((ulong)uVar9 >> 0x30) & bVar42,
                                              CONCAT15((byte)((ulong)uVar99 >> 0x28) & bVar49 |
                                                       (byte)((ulong)uVar9 >> 0x28) & bVar41,
                                                       CONCAT14((byte)((ulong)uVar99 >> 0x20) &
                                                                bVar48 | (byte)((ulong)uVar9 >> 0x20
                                                                               ) & bVar40,
                                                                CONCAT13((byte)((ulong)uVar99 >>
                                                                               0x18) & bVar47 |
                                                                         (byte)((ulong)uVar9 >> 0x18
                                                                               ) & bVar39,
                                                                         CONCAT12((byte)((ulong)
                                                  uVar99 >> 0x10) & bVar46 |
                                                  (byte)((ulong)uVar9 >> 0x10) & bVar38,
                                                  CONCAT11((byte)((ulong)uVar99 >> 8) & bVar45 |
                                                           (byte)((ulong)uVar9 >> 8) & bVar37,
                                                           (byte)uVar99 & bVar44 |
                                                           (byte)uVar9 & bVar36)))))));
              puVar27[-4] = CONCAT17((byte)((ulong)uVar98 >> 0x38) & bVar51 |
                                     (byte)((ulong)uVar8 >> 0x38) & bVar43,
                                     CONCAT16((byte)((ulong)uVar98 >> 0x30) & bVar50 |
                                              (byte)((ulong)uVar8 >> 0x30) & bVar42,
                                              CONCAT15((byte)((ulong)uVar98 >> 0x28) & bVar49 |
                                                       (byte)((ulong)uVar8 >> 0x28) & bVar41,
                                                       CONCAT14((byte)((ulong)uVar98 >> 0x20) &
                                                                bVar48 | (byte)((ulong)uVar8 >> 0x20
                                                                               ) & bVar40,
                                                                CONCAT13((byte)((ulong)uVar98 >>
                                                                               0x18) & bVar47 |
                                                                         (byte)((ulong)uVar8 >> 0x18
                                                                               ) & bVar39,
                                                                         CONCAT12((byte)((ulong)
                                                  uVar98 >> 0x10) & bVar46 |
                                                  (byte)((ulong)uVar8 >> 0x10) & bVar38,
                                                  CONCAT11((byte)((ulong)uVar98 >> 8) & bVar45 |
                                                           (byte)((ulong)uVar8 >> 8) & bVar37,
                                                           (byte)uVar98 & bVar44 |
                                                           (byte)uVar8 & bVar36)))))));
              puVar27[-1] = CONCAT17((byte)((ulong)uVar101 >> 0x38) & bVar51 |
                                     (byte)(qVar86 >> 0x38) & bVar43,
                                     CONCAT16((byte)((ulong)uVar101 >> 0x30) & bVar50 |
                                              (byte)(qVar86 >> 0x30) & bVar42,
                                              CONCAT15((byte)((ulong)uVar101 >> 0x28) & bVar49 |
                                                       (byte)(qVar86 >> 0x28) & bVar41,
                                                       CONCAT14((byte)((ulong)uVar101 >> 0x20) &
                                                                bVar48 | (byte)(qVar86 >> 0x20) &
                                                                         bVar40,
                                                                CONCAT13((byte)((ulong)uVar101 >>
                                                                               0x18) & bVar47 |
                                                                         (byte)(qVar86 >> 0x18) &
                                                                         bVar39,CONCAT12((byte)((
                                                  ulong)uVar101 >> 0x10) & bVar46 |
                                                  (byte)(qVar86 >> 0x10) & bVar38,
                                                  CONCAT11((byte)((ulong)uVar101 >> 8) & bVar45 |
                                                           (byte)(qVar86 >> 8) & bVar37,
                                                           (byte)uVar101 & bVar44 |
                                                           (byte)qVar86 & bVar36)))))));
              puVar27[-2] = CONCAT17((byte)((ulong)uVar100 >> 0x38) & bVar51 |
                                     (byte)((ulong)uVar77 >> 0x38) & bVar43,
                                     CONCAT16((byte)((ulong)uVar100 >> 0x30) & bVar50 |
                                              (byte)((ulong)uVar77 >> 0x30) & bVar42,
                                              CONCAT15((byte)((ulong)uVar100 >> 0x28) & bVar49 |
                                                       (byte)((ulong)uVar77 >> 0x28) & bVar41,
                                                       CONCAT14((byte)((ulong)uVar100 >> 0x20) &
                                                                bVar48 | (byte)((ulong)uVar77 >>
                                                                               0x20) & bVar40,
                                                                CONCAT13((byte)((ulong)uVar100 >>
                                                                               0x18) & bVar47 |
                                                                         (byte)((ulong)uVar77 >>
                                                                               0x18) & bVar39,
                                                                         CONCAT12((byte)((ulong)
                                                  uVar100 >> 0x10) & bVar46 |
                                                  (byte)((ulong)uVar77 >> 0x10) & bVar38,
                                                  CONCAT11((byte)((ulong)uVar100 >> 8) & bVar45 |
                                                           (byte)((ulong)uVar77 >> 8) & bVar37,
                                                           (byte)uVar100 & bVar44 |
                                                           (byte)uVar77 & bVar36)))))));
              puVar27[1] = CONCAT17((byte)((ulong)uVar103 >> 0x38) & bVar51 |
                                    (byte)((ulong)uVar87 >> 0x38) & bVar43,
                                    CONCAT16((byte)((ulong)uVar103 >> 0x30) & bVar50 |
                                             (byte)((ulong)uVar87 >> 0x30) & bVar42,
                                             CONCAT15((byte)((ulong)uVar103 >> 0x28) & bVar49 |
                                                      (byte)((ulong)uVar87 >> 0x28) & bVar41,
                                                      CONCAT14((byte)((ulong)uVar103 >> 0x20) &
                                                               bVar48 | (byte)((ulong)uVar87 >> 0x20
                                                                              ) & bVar40,
                                                               CONCAT13((byte)((ulong)uVar103 >>
                                                                              0x18) & bVar47 |
                                                                        (byte)((ulong)uVar87 >> 0x18
                                                                              ) & bVar39,
                                                                        CONCAT12((byte)((ulong)
                                                  uVar103 >> 0x10) & bVar46 |
                                                  (byte)((ulong)uVar87 >> 0x10) & bVar38,
                                                  CONCAT11((byte)((ulong)uVar103 >> 8) & bVar45 |
                                                           (byte)((ulong)uVar87 >> 8) & bVar37,
                                                           (byte)uVar103 & bVar44 |
                                                           (byte)uVar87 & bVar36)))))));
              *puVar27 = CONCAT17((byte)((ulong)uVar102 >> 0x38) & bVar51 |
                                  (byte)(qVar96 >> 0x38) & bVar43,
                                  CONCAT16((byte)((ulong)uVar102 >> 0x30) & bVar50 |
                                           (byte)(qVar96 >> 0x30) & bVar42,
                                           CONCAT15((byte)((ulong)uVar102 >> 0x28) & bVar49 |
                                                    (byte)(qVar96 >> 0x28) & bVar41,
                                                    CONCAT14((byte)((ulong)uVar102 >> 0x20) & bVar48
                                                             | (byte)(qVar96 >> 0x20) & bVar40,
                                                             CONCAT13((byte)((ulong)uVar102 >> 0x18)
                                                                      & bVar47 |
                                                                      (byte)(qVar96 >> 0x18) &
                                                                      bVar39,CONCAT12((byte)((ulong)
                                                  uVar102 >> 0x10) & bVar46 |
                                                  (byte)(qVar96 >> 0x10) & bVar38,
                                                  CONCAT11((byte)((ulong)uVar102 >> 8) & bVar45 |
                                                           (byte)(qVar96 >> 8) & bVar37,
                                                           (byte)uVar102 & bVar44 |
                                                           (byte)qVar96 & bVar36)))))));
              puVar27[3] = CONCAT17((byte)((ulong)uVar105 >> 0x38) & bVar51 |
                                    (byte)((ulong)uVar97 >> 0x38) & bVar43,
                                    CONCAT16((byte)((ulong)uVar105 >> 0x30) & bVar50 |
                                             (byte)((ulong)uVar97 >> 0x30) & bVar42,
                                             CONCAT15((byte)((ulong)uVar105 >> 0x28) & bVar49 |
                                                      (byte)((ulong)uVar97 >> 0x28) & bVar41,
                                                      CONCAT14((byte)((ulong)uVar105 >> 0x20) &
                                                               bVar48 | (byte)((ulong)uVar97 >> 0x20
                                                                              ) & bVar40,
                                                               CONCAT13((byte)((ulong)uVar105 >>
                                                                              0x18) & bVar47 |
                                                                        (byte)((ulong)uVar97 >> 0x18
                                                                              ) & bVar39,
                                                                        CONCAT12((byte)((ulong)
                                                  uVar105 >> 0x10) & bVar46 |
                                                  (byte)((ulong)uVar97 >> 0x10) & bVar38,
                                                  CONCAT11((byte)((ulong)uVar105 >> 8) & bVar45 |
                                                           (byte)((ulong)uVar97 >> 8) & bVar37,
                                                           (byte)uVar105 & bVar44 |
                                                           (byte)uVar97 & bVar36)))))));
              puVar27[2] = CONCAT17((byte)((ulong)uVar104 >> 0x38) & bVar51 |
                                    (byte)((ulong)uVar95 >> 0x38) & bVar43,
                                    CONCAT16((byte)((ulong)uVar104 >> 0x30) & bVar50 |
                                             (byte)((ulong)uVar95 >> 0x30) & bVar42,
                                             CONCAT15((byte)((ulong)uVar104 >> 0x28) & bVar49 |
                                                      (byte)((ulong)uVar95 >> 0x28) & bVar41,
                                                      CONCAT14((byte)((ulong)uVar104 >> 0x20) &
                                                               bVar48 | (byte)((ulong)uVar95 >> 0x20
                                                                              ) & bVar40,
                                                               CONCAT13((byte)((ulong)uVar104 >>
                                                                              0x18) & bVar47 |
                                                                        (byte)((ulong)uVar95 >> 0x18
                                                                              ) & bVar39,
                                                                        CONCAT12((byte)((ulong)
                                                  uVar104 >> 0x10) & bVar46 |
                                                  (byte)((ulong)uVar95 >> 0x10) & bVar38,
                                                  CONCAT11((byte)((ulong)uVar104 >> 8) & bVar45 |
                                                           (byte)((ulong)uVar95 >> 8) & bVar37,
                                                           (byte)uVar104 & bVar44 |
                                                           (byte)uVar95 & bVar36)))))));
              pcVar24 = pcVar24 + -8;
              puVar27 = puVar27 + 8;
              pqVar23 = pqVar23 + 8;
            } while (pcVar24 != (char *)0x0);
            pcVar24 = pcVar13;
            if (pcVar13 != pcVar25) goto code_r0x002a661c;
          }
          puVar19 = (undefined1 *)**(undefined8 **)(unaff_x29 + -0x60);
          uVar6 = ~uVar15;
          if ((unaff_w26 < 8) ||
             (puVar19 < param_4 + (long)pcVar25 * 8 && param_4 < puVar19 + (long)pcVar25 * 8)) {
            pcVar24 = (char *)0x0;
          }
          else {
            puVar27 = (undefined8 *)(puVar19 + 0x20);
            pqVar23 = (qword *)(param_4 + 0x20);
            pcVar24 = pcVar13;
            do {
              uVar9 = pqVar23[-3];
              uVar8 = pqVar23[-4];
              qVar86 = pqVar23[-1];
              uVar77 = pqVar23[-2];
              uVar87 = pqVar23[1];
              qVar96 = *pqVar23;
              uVar97 = pqVar23[3];
              uVar95 = pqVar23[2];
              uVar99 = puVar27[-3];
              uVar98 = puVar27[-4];
              uVar101 = puVar27[-1];
              uVar100 = puVar27[-2];
              uVar103 = puVar27[1];
              uVar102 = *puVar27;
              uVar105 = puVar27[3];
              uVar104 = puVar27[2];
              bVar36 = (byte)uVar6;
              bVar37 = (byte)(uVar6 >> 8);
              bVar38 = (byte)(uVar6 >> 0x10);
              bVar39 = (byte)(uVar6 >> 0x18);
              bVar40 = (byte)(uVar6 >> 0x20);
              bVar41 = (byte)(uVar6 >> 0x28);
              bVar42 = (byte)(uVar6 >> 0x30);
              bVar43 = (byte)(uVar6 >> 0x38);
              puVar27[-3] = CONCAT17((byte)((ulong)uVar99 >> 0x38) & bVar43 |
                                     (byte)((ulong)uVar9 >> 0x38) & bVar35,
                                     CONCAT16((byte)((ulong)uVar99 >> 0x30) & bVar42 |
                                              (byte)((ulong)uVar9 >> 0x30) & bVar34,
                                              CONCAT15((byte)((ulong)uVar99 >> 0x28) & bVar41 |
                                                       (byte)((ulong)uVar9 >> 0x28) & bVar33,
                                                       CONCAT14((byte)((ulong)uVar99 >> 0x20) &
                                                                bVar40 | (byte)((ulong)uVar9 >> 0x20
                                                                               ) & bVar32,
                                                                CONCAT13((byte)((ulong)uVar99 >>
                                                                               0x18) & bVar39 |
                                                                         (byte)((ulong)uVar9 >> 0x18
                                                                               ) & bVar31,
                                                                         CONCAT12((byte)((ulong)
                                                  uVar99 >> 0x10) & bVar38 |
                                                  (byte)((ulong)uVar9 >> 0x10) & bVar30,
                                                  CONCAT11((byte)((ulong)uVar99 >> 8) & bVar37 |
                                                           (byte)((ulong)uVar9 >> 8) & bVar29,
                                                           (byte)uVar99 & bVar36 |
                                                           (byte)uVar9 & bVar28)))))));
              puVar27[-4] = CONCAT17((byte)((ulong)uVar98 >> 0x38) & bVar43 |
                                     (byte)((ulong)uVar8 >> 0x38) & bVar35,
                                     CONCAT16((byte)((ulong)uVar98 >> 0x30) & bVar42 |
                                              (byte)((ulong)uVar8 >> 0x30) & bVar34,
                                              CONCAT15((byte)((ulong)uVar98 >> 0x28) & bVar41 |
                                                       (byte)((ulong)uVar8 >> 0x28) & bVar33,
                                                       CONCAT14((byte)((ulong)uVar98 >> 0x20) &
                                                                bVar40 | (byte)((ulong)uVar8 >> 0x20
                                                                               ) & bVar32,
                                                                CONCAT13((byte)((ulong)uVar98 >>
                                                                               0x18) & bVar39 |
                                                                         (byte)((ulong)uVar8 >> 0x18
                                                                               ) & bVar31,
                                                                         CONCAT12((byte)((ulong)
                                                  uVar98 >> 0x10) & bVar38 |
                                                  (byte)((ulong)uVar8 >> 0x10) & bVar30,
                                                  CONCAT11((byte)((ulong)uVar98 >> 8) & bVar37 |
                                                           (byte)((ulong)uVar8 >> 8) & bVar29,
                                                           (byte)uVar98 & bVar36 |
                                                           (byte)uVar8 & bVar28)))))));
              puVar27[-1] = CONCAT17((byte)((ulong)uVar101 >> 0x38) & bVar43 |
                                     (byte)(qVar86 >> 0x38) & bVar35,
                                     CONCAT16((byte)((ulong)uVar101 >> 0x30) & bVar42 |
                                              (byte)(qVar86 >> 0x30) & bVar34,
                                              CONCAT15((byte)((ulong)uVar101 >> 0x28) & bVar41 |
                                                       (byte)(qVar86 >> 0x28) & bVar33,
                                                       CONCAT14((byte)((ulong)uVar101 >> 0x20) &
                                                                bVar40 | (byte)(qVar86 >> 0x20) &
                                                                         bVar32,
                                                                CONCAT13((byte)((ulong)uVar101 >>
                                                                               0x18) & bVar39 |
                                                                         (byte)(qVar86 >> 0x18) &
                                                                         bVar31,CONCAT12((byte)((
                                                  ulong)uVar101 >> 0x10) & bVar38 |
                                                  (byte)(qVar86 >> 0x10) & bVar30,
                                                  CONCAT11((byte)((ulong)uVar101 >> 8) & bVar37 |
                                                           (byte)(qVar86 >> 8) & bVar29,
                                                           (byte)uVar101 & bVar36 |
                                                           (byte)qVar86 & bVar28)))))));
              puVar27[-2] = CONCAT17((byte)((ulong)uVar100 >> 0x38) & bVar43 |
                                     (byte)((ulong)uVar77 >> 0x38) & bVar35,
                                     CONCAT16((byte)((ulong)uVar100 >> 0x30) & bVar42 |
                                              (byte)((ulong)uVar77 >> 0x30) & bVar34,
                                              CONCAT15((byte)((ulong)uVar100 >> 0x28) & bVar41 |
                                                       (byte)((ulong)uVar77 >> 0x28) & bVar33,
                                                       CONCAT14((byte)((ulong)uVar100 >> 0x20) &
                                                                bVar40 | (byte)((ulong)uVar77 >>
                                                                               0x20) & bVar32,
                                                                CONCAT13((byte)((ulong)uVar100 >>
                                                                               0x18) & bVar39 |
                                                                         (byte)((ulong)uVar77 >>
                                                                               0x18) & bVar31,
                                                                         CONCAT12((byte)((ulong)
                                                  uVar100 >> 0x10) & bVar38 |
                                                  (byte)((ulong)uVar77 >> 0x10) & bVar30,
                                                  CONCAT11((byte)((ulong)uVar100 >> 8) & bVar37 |
                                                           (byte)((ulong)uVar77 >> 8) & bVar29,
                                                           (byte)uVar100 & bVar36 |
                                                           (byte)uVar77 & bVar28)))))));
              puVar27[1] = CONCAT17((byte)((ulong)uVar103 >> 0x38) & bVar43 |
                                    (byte)((ulong)uVar87 >> 0x38) & bVar35,
                                    CONCAT16((byte)((ulong)uVar103 >> 0x30) & bVar42 |
                                             (byte)((ulong)uVar87 >> 0x30) & bVar34,
                                             CONCAT15((byte)((ulong)uVar103 >> 0x28) & bVar41 |
                                                      (byte)((ulong)uVar87 >> 0x28) & bVar33,
                                                      CONCAT14((byte)((ulong)uVar103 >> 0x20) &
                                                               bVar40 | (byte)((ulong)uVar87 >> 0x20
                                                                              ) & bVar32,
                                                               CONCAT13((byte)((ulong)uVar103 >>
                                                                              0x18) & bVar39 |
                                                                        (byte)((ulong)uVar87 >> 0x18
                                                                              ) & bVar31,
                                                                        CONCAT12((byte)((ulong)
                                                  uVar103 >> 0x10) & bVar38 |
                                                  (byte)((ulong)uVar87 >> 0x10) & bVar30,
                                                  CONCAT11((byte)((ulong)uVar103 >> 8) & bVar37 |
                                                           (byte)((ulong)uVar87 >> 8) & bVar29,
                                                           (byte)uVar103 & bVar36 |
                                                           (byte)uVar87 & bVar28)))))));
              *puVar27 = CONCAT17((byte)((ulong)uVar102 >> 0x38) & bVar43 |
                                  (byte)(qVar96 >> 0x38) & bVar35,
                                  CONCAT16((byte)((ulong)uVar102 >> 0x30) & bVar42 |
                                           (byte)(qVar96 >> 0x30) & bVar34,
                                           CONCAT15((byte)((ulong)uVar102 >> 0x28) & bVar41 |
                                                    (byte)(qVar96 >> 0x28) & bVar33,
                                                    CONCAT14((byte)((ulong)uVar102 >> 0x20) & bVar40
                                                             | (byte)(qVar96 >> 0x20) & bVar32,
                                                             CONCAT13((byte)((ulong)uVar102 >> 0x18)
                                                                      & bVar39 |
                                                                      (byte)(qVar96 >> 0x18) &
                                                                      bVar31,CONCAT12((byte)((ulong)
                                                  uVar102 >> 0x10) & bVar38 |
                                                  (byte)(qVar96 >> 0x10) & bVar30,
                                                  CONCAT11((byte)((ulong)uVar102 >> 8) & bVar37 |
                                                           (byte)(qVar96 >> 8) & bVar29,
                                                           (byte)uVar102 & bVar36 |
                                                           (byte)qVar96 & bVar28)))))));
              puVar27[3] = CONCAT17((byte)((ulong)uVar105 >> 0x38) & bVar43 |
                                    (byte)((ulong)uVar97 >> 0x38) & bVar35,
                                    CONCAT16((byte)((ulong)uVar105 >> 0x30) & bVar42 |
                                             (byte)((ulong)uVar97 >> 0x30) & bVar34,
                                             CONCAT15((byte)((ulong)uVar105 >> 0x28) & bVar41 |
                                                      (byte)((ulong)uVar97 >> 0x28) & bVar33,
                                                      CONCAT14((byte)((ulong)uVar105 >> 0x20) &
                                                               bVar40 | (byte)((ulong)uVar97 >> 0x20
                                                                              ) & bVar32,
                                                               CONCAT13((byte)((ulong)uVar105 >>
                                                                              0x18) & bVar39 |
                                                                        (byte)((ulong)uVar97 >> 0x18
                                                                              ) & bVar31,
                                                                        CONCAT12((byte)((ulong)
                                                  uVar105 >> 0x10) & bVar38 |
                                                  (byte)((ulong)uVar97 >> 0x10) & bVar30,
                                                  CONCAT11((byte)((ulong)uVar105 >> 8) & bVar37 |
                                                           (byte)((ulong)uVar97 >> 8) & bVar29,
                                                           (byte)uVar105 & bVar36 |
                                                           (byte)uVar97 & bVar28)))))));
              puVar27[2] = CONCAT17((byte)((ulong)uVar104 >> 0x38) & bVar43 |
                                    (byte)((ulong)uVar95 >> 0x38) & bVar35,
                                    CONCAT16((byte)((ulong)uVar104 >> 0x30) & bVar42 |
                                             (byte)((ulong)uVar95 >> 0x30) & bVar34,
                                             CONCAT15((byte)((ulong)uVar104 >> 0x28) & bVar41 |
                                                      (byte)((ulong)uVar95 >> 0x28) & bVar33,
                                                      CONCAT14((byte)((ulong)uVar104 >> 0x20) &
                                                               bVar40 | (byte)((ulong)uVar95 >> 0x20
                                                                              ) & bVar32,
                                                               CONCAT13((byte)((ulong)uVar104 >>
                                                                              0x18) & bVar39 |
                                                                        (byte)((ulong)uVar95 >> 0x18
                                                                              ) & bVar31,
                                                                        CONCAT12((byte)((ulong)
                                                  uVar104 >> 0x10) & bVar38 |
                                                  (byte)((ulong)uVar95 >> 0x10) & bVar30,
                                                  CONCAT11((byte)((ulong)uVar104 >> 8) & bVar37 |
                                                           (byte)((ulong)uVar95 >> 8) & bVar29,
                                                           (byte)uVar104 & bVar36 |
                                                           (byte)uVar95 & bVar28)))))));
              pcVar24 = pcVar24 + -8;
              puVar27 = puVar27 + 8;
              pqVar23 = pqVar23 + 8;
            } while (pcVar24 != (char *)0x0);
            pcVar24 = pcVar13;
            if (pcVar13 == pcVar25) goto code_r0x002a672c;
          }
          lVar5 = (long)pcVar25 - (long)pcVar24;
          puVar16 = (ulong *)(puVar19 + (long)pcVar24 * 8);
          pcVar24 = param_4 + (long)pcVar24 * 8;
          do {
            *puVar16 = *puVar16 & uVar6 | *(ulong *)pcVar24 & uVar15;
            lVar5 = lVar5 + -1;
            puVar16 = puVar16 + 1;
            pcVar24 = pcVar24 + 8;
          } while (lVar5 != 0);
        }
code_r0x002a672c:
        if ((*(ulong *)*unaff_x25 & 1) == (*(ulong *)*unaff_x27 & 1)) goto code_r0x002a6ae8;
        param_4 = (char *)((*(ulong *)*unaff_x27 & 1) - 1);
        uVar6 = (*(ulong *)*unaff_x25 & 1) - 1;
        func_0x002a8410();
        puVar27 = *(undefined8 **)(unaff_x29 + -0x68);
        uVar10 = (-(*(ulong *)*puVar27 & 1) | -(*(ulong *)**(undefined8 **)(unaff_x29 + -0x58) & 1))
                 & uVar6;
        uVar8 = func_0x002a85f8((ulong *)**(undefined8 **)(unaff_x29 + -0x58),uVar10,*unaff_x22,
                                *in_stack_00000068);
        uVar9 = func_0x002a85f8(*puVar27,uVar10,*unaff_x24,*in_stack_00000068,pcVar25);
        func_0x002a8714(**(undefined8 **)(unaff_x29 + -0x58),uVar8,uVar6,*in_stack_00000068);
        func_0x002a8714(**(undefined8 **)(unaff_x29 + -0x68),uVar9,uVar6,*in_stack_00000068,pcVar25)
        ;
        func_0x002a8410(*unaff_x27,param_4,*in_stack_00000068);
        uVar6 = (-(*(ulong *)**(undefined8 **)(unaff_x29 + -0x60) & 1) |
                -(*(ulong *)*in_stack_00000070 & 1)) & (ulong)param_4;
        uVar8 = func_0x002a85f8((ulong *)*in_stack_00000070,uVar6,*unaff_x22,*in_stack_00000068);
        uVar9 = func_0x002a85f8(**(undefined8 **)(unaff_x29 + -0x60),uVar6,*unaff_x24,
                                *in_stack_00000068,pcVar25);
        func_0x002a8714(*in_stack_00000070,uVar8,param_4,*in_stack_00000068);
        param_5 = (char *)*in_stack_00000068;
        param_6 = pcVar25;
        func_0x002a8714(**(undefined8 **)(unaff_x29 + -0x60),uVar9,param_4,param_5,pcVar25);
        uStack0000000000000030 = uStack0000000000000030 + 1;
      } while (uStack0000000000000030 != uVar12);
    }
    uVar1 = (uint)unaff_x27[1];
    uVar12 = (ulong)(int)uVar1;
    if (uVar1 == 0) {
code_r0x002a6a70:
      iVar3 = func_0x0029dd44();
      if (iVar3 != 0) {
        lVar4 = func_0x0029bd80();
        param_2 = (ulong)(lVar4 != 0);
        goto LAB_002a6abc;
      }
      *unaff_x20 = 1;
      param_4 = section_00000068.sectname + 8;
      param_6 = "";
      goto code_r0x002a6ab4;
    }
    if (uVar1 < 8) {
      uVar6 = 0;
      uVar14 = 0;
code_r0x002a6a54:
      lVar4 = uVar12 - uVar6;
      puVar16 = (ulong *)(*unaff_x27 + uVar6 * 8);
      do {
        uVar14 = *puVar16 | uVar14;
        lVar4 = lVar4 + -1;
        puVar16 = puVar16 + 1;
      } while (lVar4 != 0);
    }
    else {
      uVar6 = uVar12 & 0xfffffffffffffff8;
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
      bVar59 = 0;
      uVar8 = 0;
      uVar9 = 0;
      uVar77 = 0;
      uVar87 = 0;
      puVar27 = (undefined8 *)(*unaff_x27 + 0x20);
      uVar14 = uVar6;
      do {
        uVar97 = puVar27[-3];
        uVar95 = puVar27[-4];
        uVar99 = puVar27[-1];
        uVar98 = puVar27[-2];
        uVar101 = puVar27[1];
        uVar100 = *puVar27;
        uVar103 = puVar27[3];
        uVar102 = puVar27[2];
        bVar28 = (byte)uVar95 | bVar28;
        bVar29 = (byte)((ulong)uVar95 >> 8) | bVar29;
        bVar30 = (byte)((ulong)uVar95 >> 0x10) | bVar30;
        bVar31 = (byte)((ulong)uVar95 >> 0x18) | bVar31;
        bVar32 = (byte)((ulong)uVar95 >> 0x20) | bVar32;
        bVar33 = (byte)((ulong)uVar95 >> 0x28) | bVar33;
        bVar34 = (byte)((ulong)uVar95 >> 0x30) | bVar34;
        bVar35 = (byte)((ulong)uVar95 >> 0x38) | bVar35;
        bVar36 = (byte)uVar97 | bVar36;
        bVar37 = (byte)((ulong)uVar97 >> 8) | bVar37;
        bVar38 = (byte)((ulong)uVar97 >> 0x10) | bVar38;
        bVar39 = (byte)((ulong)uVar97 >> 0x18) | bVar39;
        bVar40 = (byte)((ulong)uVar97 >> 0x20) | bVar40;
        bVar41 = (byte)((ulong)uVar97 >> 0x28) | bVar41;
        bVar42 = (byte)((ulong)uVar97 >> 0x30) | bVar42;
        bVar43 = (byte)((ulong)uVar97 >> 0x38) | bVar43;
        bVar44 = (byte)uVar98 | bVar44;
        bVar45 = (byte)((ulong)uVar98 >> 8) | bVar45;
        bVar46 = (byte)((ulong)uVar98 >> 0x10) | bVar46;
        bVar47 = (byte)((ulong)uVar98 >> 0x18) | bVar47;
        bVar48 = (byte)((ulong)uVar98 >> 0x20) | bVar48;
        bVar49 = (byte)((ulong)uVar98 >> 0x28) | bVar49;
        bVar50 = (byte)((ulong)uVar98 >> 0x30) | bVar50;
        bVar51 = (byte)((ulong)uVar98 >> 0x38) | bVar51;
        bVar52 = (byte)uVar99 | bVar52;
        bVar53 = (byte)((ulong)uVar99 >> 8) | bVar53;
        bVar54 = (byte)((ulong)uVar99 >> 0x10) | bVar54;
        bVar55 = (byte)((ulong)uVar99 >> 0x18) | bVar55;
        bVar56 = (byte)((ulong)uVar99 >> 0x20) | bVar56;
        bVar57 = (byte)((ulong)uVar99 >> 0x28) | bVar57;
        bVar58 = (byte)((ulong)uVar99 >> 0x30) | bVar58;
        bVar59 = (byte)((ulong)uVar99 >> 0x38) | bVar59;
        bVar60 = (byte)uVar100 | (byte)uVar8;
        bVar61 = (byte)((ulong)uVar100 >> 8) | (byte)((ulong)uVar8 >> 8);
        bVar62 = (byte)((ulong)uVar100 >> 0x10) | (byte)((ulong)uVar8 >> 0x10);
        bVar63 = (byte)((ulong)uVar100 >> 0x18) | (byte)((ulong)uVar8 >> 0x18);
        bVar64 = (byte)((ulong)uVar100 >> 0x20) | (byte)((ulong)uVar8 >> 0x20);
        bVar65 = (byte)((ulong)uVar100 >> 0x28) | (byte)((ulong)uVar8 >> 0x28);
        bVar66 = (byte)((ulong)uVar100 >> 0x30) | (byte)((ulong)uVar8 >> 0x30);
        bVar67 = (byte)((ulong)uVar100 >> 0x38) | (byte)((ulong)uVar8 >> 0x38);
        uVar8 = CONCAT17(bVar67,CONCAT16(bVar66,CONCAT15(bVar65,CONCAT14(bVar64,CONCAT13(bVar63,
                                                  CONCAT12(bVar62,CONCAT11(bVar61,bVar60)))))));
        bVar68 = (byte)uVar101 | (byte)uVar9;
        bVar69 = (byte)((ulong)uVar101 >> 8) | (byte)((ulong)uVar9 >> 8);
        bVar70 = (byte)((ulong)uVar101 >> 0x10) | (byte)((ulong)uVar9 >> 0x10);
        bVar71 = (byte)((ulong)uVar101 >> 0x18) | (byte)((ulong)uVar9 >> 0x18);
        bVar72 = (byte)((ulong)uVar101 >> 0x20) | (byte)((ulong)uVar9 >> 0x20);
        bVar73 = (byte)((ulong)uVar101 >> 0x28) | (byte)((ulong)uVar9 >> 0x28);
        bVar74 = (byte)((ulong)uVar101 >> 0x30) | (byte)((ulong)uVar9 >> 0x30);
        bVar75 = (byte)((ulong)uVar101 >> 0x38) | (byte)((ulong)uVar9 >> 0x38);
        uVar9 = CONCAT17(bVar75,CONCAT16(bVar74,CONCAT15(bVar73,CONCAT14(bVar72,CONCAT13(bVar71,
                                                  CONCAT12(bVar70,CONCAT11(bVar69,bVar68)))))));
        bVar76 = (byte)uVar102 | (byte)uVar77;
        bVar78 = (byte)((ulong)uVar102 >> 8) | (byte)((ulong)uVar77 >> 8);
        bVar79 = (byte)((ulong)uVar102 >> 0x10) | (byte)((ulong)uVar77 >> 0x10);
        bVar80 = (byte)((ulong)uVar102 >> 0x18) | (byte)((ulong)uVar77 >> 0x18);
        bVar81 = (byte)((ulong)uVar102 >> 0x20) | (byte)((ulong)uVar77 >> 0x20);
        bVar82 = (byte)((ulong)uVar102 >> 0x28) | (byte)((ulong)uVar77 >> 0x28);
        bVar83 = (byte)((ulong)uVar102 >> 0x30) | (byte)((ulong)uVar77 >> 0x30);
        bVar84 = (byte)((ulong)uVar102 >> 0x38) | (byte)((ulong)uVar77 >> 0x38);
        uVar77 = CONCAT17(bVar84,CONCAT16(bVar83,CONCAT15(bVar82,CONCAT14(bVar81,CONCAT13(bVar80,
                                                  CONCAT12(bVar79,CONCAT11(bVar78,bVar76)))))));
        bVar85 = (byte)uVar103 | (byte)uVar87;
        bVar88 = (byte)((ulong)uVar103 >> 8) | (byte)((ulong)uVar87 >> 8);
        bVar89 = (byte)((ulong)uVar103 >> 0x10) | (byte)((ulong)uVar87 >> 0x10);
        bVar90 = (byte)((ulong)uVar103 >> 0x18) | (byte)((ulong)uVar87 >> 0x18);
        bVar91 = (byte)((ulong)uVar103 >> 0x20) | (byte)((ulong)uVar87 >> 0x20);
        bVar92 = (byte)((ulong)uVar103 >> 0x28) | (byte)((ulong)uVar87 >> 0x28);
        bVar93 = (byte)((ulong)uVar103 >> 0x30) | (byte)((ulong)uVar87 >> 0x30);
        bVar94 = (byte)((ulong)uVar103 >> 0x38) | (byte)((ulong)uVar87 >> 0x38);
        uVar87 = CONCAT17(bVar94,CONCAT16(bVar93,CONCAT15(bVar92,CONCAT14(bVar91,CONCAT13(bVar90,
                                                  CONCAT12(bVar89,CONCAT11(bVar88,bVar85)))))));
        uVar14 = uVar14 - 8;
        puVar27 = puVar27 + 8;
      } while (uVar14 != 0);
      bVar76 = bVar76 | bVar60 | bVar44 | bVar28;
      bVar78 = bVar78 | bVar61 | bVar45 | bVar29;
      bVar79 = bVar79 | bVar62 | bVar46 | bVar30;
      bVar80 = bVar80 | bVar63 | bVar47 | bVar31;
      bVar81 = bVar81 | bVar64 | bVar48 | bVar32;
      bVar82 = bVar82 | bVar65 | bVar49 | bVar33;
      bVar83 = bVar83 | bVar66 | bVar50 | bVar34;
      bVar84 = bVar84 | bVar67 | bVar51 | bVar35;
      bVar85 = bVar85 | bVar68 | bVar52 | bVar36;
      bVar88 = bVar88 | bVar69 | bVar53 | bVar37;
      bVar89 = bVar89 | bVar70 | bVar54 | bVar38;
      bVar90 = bVar90 | bVar71 | bVar55 | bVar39;
      bVar91 = bVar91 | bVar72 | bVar56 | bVar40;
      bVar92 = bVar92 | bVar73 | bVar57 | bVar41;
      bVar93 = bVar93 | bVar74 | bVar58 | bVar42;
      bVar94 = bVar94 | bVar75 | bVar59 | bVar43;
      auVar108[1] = bVar78;
      auVar108[0] = bVar76;
      auVar108[2] = bVar79;
      auVar108[3] = bVar80;
      auVar108[4] = bVar81;
      auVar108[5] = bVar82;
      auVar108[6] = bVar83;
      auVar108[7] = bVar84;
      auVar108[8] = bVar85;
      auVar108[9] = bVar88;
      auVar108[10] = bVar89;
      auVar108[0xb] = bVar90;
      auVar108[0xc] = bVar91;
      auVar108[0xd] = bVar92;
      auVar108[0xe] = bVar93;
      auVar108[0xf] = bVar94;
      auVar2[1] = bVar78;
      auVar2[0] = bVar76;
      auVar2[2] = bVar79;
      auVar2[3] = bVar80;
      auVar2[4] = bVar81;
      auVar2[5] = bVar82;
      auVar2[6] = bVar83;
      auVar2[7] = bVar84;
      auVar2[8] = bVar85;
      auVar2[9] = bVar88;
      auVar2[10] = bVar89;
      auVar2[0xb] = bVar90;
      auVar2[0xc] = bVar91;
      auVar2[0xd] = bVar92;
      auVar2[0xe] = bVar93;
      auVar2[0xf] = bVar94;
      auVar108 = NEON_ext(auVar108,auVar2,8,1);
      uVar14 = CONCAT17(bVar84 | auVar108[7],
                        CONCAT16(bVar83 | auVar108[6],
                                 CONCAT15(bVar82 | auVar108[5],
                                          CONCAT14(bVar81 | auVar108[4],
                                                   CONCAT13(bVar80 | auVar108[3],
                                                            CONCAT12(bVar79 | auVar108[2],
                                                                     CONCAT11(bVar78 | auVar108[1],
                                                                              bVar76 | auVar108[0]))
                                                           )))));
      if (uVar6 != uVar12) goto code_r0x002a6a54;
    }
    if (uVar14 == 0) goto code_r0x002a6a70;
  }
  auVar108 = func_0x0079de7c();
  uVar8 = auVar108._0_8_;
  *auVar108._8_8_ = 0;
  if (((*(int *)(param_4 + 0x10) != 0) || (*(int *)(param_5 + 0x28) != 0)) ||
     (iVar3 = func_0x0029d99c(*(undefined8 *)param_4,(long)*(int *)(param_4 + 8),
                              *(undefined8 *)(param_5 + 0x18),(long)*(int *)(param_5 + 0x20)),
     -1 < iVar3)) {
    func_0x0028f83c(3,0,0x6b,"/aws-lc/crypto/fipsmodule/bn/gcd.c",0x14e);
    return 0;
  }
  uStack_58 = 0;
  uStack_50 = 0;
  uStack_48 = 0;
  iVar3 = func_0x0029afb8(&uStack_58,(long)*(int *)(param_5 + 0x20));
  if ((iVar3 != 0) &&
     (iVar3 = func_0x002afddc(uStack_58,1,*(undefined8 *)(param_5 + 0x18),
                              (long)*(int *)(param_5 + 0x20),&UNK_008310d0), iVar3 != 0)) {
    uStack_48 = uStack_48 & 0xffffffff00000000;
    uStack_50 = CONCAT44(uStack_50._4_4_,*(undefined4 *)(param_5 + 0x20));
    iVar3 = func_0x002a3110(uVar8,&uStack_58,param_4,param_5,param_6);
    if ((iVar3 != 0) &&
       (iVar3 = func_0x002a50c8(uVar8,auVar108._8_8_,uVar8,param_5 + 0x18,param_6), iVar3 != 0)) {
      uVar12 = func_0x002a3110(uVar8,&uStack_58,uVar8,param_5,param_6);
      goto code_r0x002a6c38;
    }
  }
  uVar12 = 0;
code_r0x002a6c38:
  if ((uStack_48._4_4_ >> 1 & 1) == 0) {
    func_0x0036e3d8(uStack_58);
  }
  if ((uStack_48._4_4_ & 1) != 0) {
    func_0x0036e3d8(&uStack_58);
  }
  return uVar12;
}

