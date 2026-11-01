
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_0053f438(long param_1,undefined8 *param_2,undefined8 param_3)

{
  bool bVar1;
  uint uVar2;
  dword dVar3;
  dword dVar4;
  dword dVar5;
  uint uVar6;
  undefined8 uVar7;
  undefined4 uVar8;
  undefined4 uVar9;
  undefined4 uVar10;
  undefined4 uVar11;
  undefined4 uVar12;
  undefined4 uVar13;
  code *pcVar14;
  long lVar15;
  long lVar16;
  long *plVar17;
  uint *puVar18;
  undefined8 uVar19;
  dword *pdVar20;
  int iVar21;
  dword *extraout_x1;
  dword *extraout_x1_00;
  long lVar22;
  long lVar23;
  undefined8 *puVar24;
  dword *pdVar25;
  long *plVar26;
  uint *puVar28;
  uint *puVar27;
  long *plVar29;
  ulong uVar30;
  ulong uVar31;
  dword *pdVar32;
  undefined8 *puVar33;
  long *plVar34;
  dword *pdVar35;
  undefined *puVar36;
  uint *puVar37;
  byte bVar38;
  undefined8 *puVar39;
  ulong uVar40;
  undefined8 *puVar41;
  ulong uVar42;
  long lVar43;
  ulong uVar44;
  long lVar45;
  ulong uVar46;
  long unaff_x19;
  long *plVar47;
  long lVar48;
  ulong *puVar49;
  long lVar50;
  uint *unaff_x20;
  dword *pdVar51;
  long *plVar52;
  dword dVar53;
  uint *unaff_x21;
  undefined8 uVar54;
  long lVar55;
  undefined1 *unaff_x22;
  dword *pdVar56;
  undefined8 *puVar57;
  long *unaff_x23;
  long *plVar58;
  uint uVar59;
  ulong unaff_x24;
  long lVar60;
  long unaff_x25;
  uint *puVar61;
  ulong uVar62;
  long unaff_x27;
  dword *pdVar63;
  undefined8 unaff_x28;
  long *plVar64;
  long unaff_x29;
  undefined8 uVar65;
  undefined8 uVar66;
  byte bVar67;
  byte bVar68;
  byte bVar69;
  byte bVar70;
  byte bVar71;
  byte bVar72;
  byte bVar73;
  undefined1 auVar74 [16];
  undefined *puStack0000000000000000;
  undefined *in_stack_00000008;
  undefined8 in_stack_00000010;
  dword *in_stack_00000018;
  undefined *in_stack_00000040;
  long in_stack_00000048;
  dword *in_stack_00000050;
  dword *in_stack_00000058;
  undefined *puStack0000000000000060;
  ulong in_stack_00000080;
  uint *in_stack_00000098;
  long in_stack_000000a0;
  long *in_stack_000000b0;
  undefined8 in_stack_000000b8;
  long *in_stack_000000c0;
  ulong uStack00000000000000d0;
  long in_stack_000000f8;
  undefined8 uStack0000000000000100;
  int iStack0000000000000108;
  undefined4 uStack000000000000010c;
  undefined4 uStack0000000000000110;
  undefined4 uStack0000000000000114;
  undefined8 uStack0000000000000118;
  dword *in_stack_00000120;
  undefined8 uStack0000000000000128;
  dword *in_stack_00000130;
  long *in_stack_00000138;
  dword *in_stack_00000140;
  long *in_stack_00000148;
  undefined8 *in_stack_00000150;
  undefined8 *in_stack_00000158;
  long *in_stack_00000160;
  ulong in_stack_00000168;
  long *in_stack_00000170;
  long in_stack_00000178;
  long in_stack_00000180;
  undefined8 *in_stack_00000188;
  undefined8 *in_stack_00000190;
  long in_stack_00000198;
  dword *in_stack_00000210;
  undefined8 *in_stack_00000218;
  dword *in_stack_00000220;
  long in_stack_00000228;
  long in_stack_00000230;
  long in_stack_00000238;
  uint in_stack_00000240;
  dword *in_stack_00000250;
  dword *in_stack_00000258;
  long in_stack_00000260;
  long in_stack_00000268;
  dword *in_stack_00000270;
  dword *pdVar75;
  dword *in_stack_00000278;
  dword *pdVar76;
  uint *puVar77;
  dword *in_stack_00000280;
  long *in_stack_00000288;
  dword *in_stack_00000290;
  long *in_stack_00000298;
  undefined8 *in_stack_000002a0;
  uint in_stack_000002b8;
  undefined1 auStack_7ffffffe [6];
  long alStack_7ffffff8 [268435455];
  
code_r0x0053f438:
  _memcpy(param_1,param_2,param_3);
  unaff_x23[2] = unaff_x19 + 1;
  lVar22 = *(long *)(unaff_x25 + 0xd8);
  uVar30 = (ulong)in_stack_000002b8;
code_r0x0053f44c:
code_r0x0053f458:
  uVar66 = _UNK_009ee250;
  uVar54 = _UNK_009ee248;
  uVar65 = _UNK_009ee238;
  *(undefined8 *)(unaff_x29 + -0x78) = _UNK_009ee240;
  *(undefined8 *)(unaff_x29 + -0x80) = uVar65;
  *(undefined8 *)(unaff_x29 + -0x68) = uVar66;
  *(undefined8 *)(unaff_x29 + -0x70) = uVar54;
  if ((uVar30 < *(ulong *)(lVar22 + 0x28)) &&
     (puVar24 = (undefined8 *)(*(long *)(lVar22 + 0x20) + uVar30 * 0x20),
     (uint *)*puVar24 != unaff_x21)) {
    uStack00000000000000d0 = (ulong)*(uint *)((long)puVar24 + 0x1c) << 0x20 | 0xffffffff;
    uVar31 = 0;
    puVar36 = &UNK_008abc00;
    lVar23 = *(long *)(lVar22 + 0x38);
    uVar30 = *(ulong *)(lVar22 + 0x40);
  }
  else {
    uStack00000000000000d0 = 0xffffffffffffffff;
    uVar31 = 0;
    puVar36 = &UNK_008abc00;
    lVar23 = *(long *)(lVar22 + 0x38);
    uVar30 = *(ulong *)(lVar22 + 0x40);
  }
  do {
    uVar40 = uStack00000000000000d0 & 0xffffffff;
    if (uVar40 < uVar30) {
      lVar23 = lVar23 + uVar40 * (unaff_x24 & 0xffffffff);
      uStack00000000000000d0 =
           uStack00000000000000d0 & 0xffffffff00000000 | (ulong)*(uint *)(lVar23 + 0x20);
      uVar62 = (ulong)*(uint *)(lVar23 + 0x2c);
    }
    else {
      uStack00000000000000d0 = uStack00000000000000d0 >> 0x20;
      do {
        if (uVar30 <= uStack00000000000000d0) goto LAB_0053fe98;
        lVar22 = lVar23 + uStack00000000000000d0 * unaff_x24;
        uStack00000000000000d0 = (ulong)*(uint *)(lVar22 + 0x24);
        uVar2 = *(uint *)(lVar22 + 0x28);
        uVar62 = (ulong)uVar2;
      } while (uVar2 == 0xffffffff);
      uStack00000000000000d0 = uVar40 | uStack00000000000000d0 << 0x20;
    }
LAB_0053f61c:
    func_0x004d1c68(unaff_x29 + -0x80,uVar62);
    lVar22 = *(long *)(unaff_x25 + 0xd8);
    if ((uVar62 < *(ulong *)(lVar22 + 0x28)) &&
       (puVar24 = (undefined8 *)(*(long *)(lVar22 + 0x20) + uVar62 * 0x20),
       (uint *)*puVar24 != unaff_x21)) {
      uVar65 = puVar24[3];
    }
    else {
      uVar65 = 0xffffffffffffffff;
    }
    uStack0000000000000100._0_4_ = 0;
    uStack0000000000000100._4_4_ = 0;
    iStack0000000000000108 = (int)*(undefined8 *)(lVar22 + 0x38);
    uStack000000000000010c = (undefined4)((ulong)*(undefined8 *)(lVar22 + 0x38) >> 0x20);
    uStack0000000000000110 = (undefined4)*(undefined8 *)(lVar22 + 0x40);
    uStack0000000000000114 = (undefined4)((ulong)*(undefined8 *)(lVar22 + 0x40) >> 0x20);
    uStack0000000000000118._0_4_ = (undefined4)uVar65;
    uStack0000000000000118._4_4_ = (undefined4)((ulong)uVar65 >> 0x20);
    in_stack_00000120 = (dword *)CONCAT44(in_stack_00000120._4_4_,(int)uVar62);
    func_0x0055b13c(unaff_x29 + -0xf0,&uStack0000000000000100,&UNK_009ec388);
    plVar47 = *(long **)(unaff_x29 + -0xe8);
    lVar22 = *(long *)(unaff_x29 + -0xe0);
    if ((lVar22 == 1) && (*(char *)(*plVar47 + 0x18) != '\0')) {
      func_0x007a247c(&UNK_008aaee6,0x4c,&UNK_009ece10);
      goto code_r0x0054319c;
    }
    _iStack0000000000000108 = plVar47 + lVar22 * 3;
    uStack0000000000000100._0_4_ = (uint)plVar47;
    uStack0000000000000100._4_4_ = (undefined4)((ulong)plVar47 >> 0x20);
    _uStack0000000000000110 = (long *)(auStack_7ffffffe + 0x800002b6);
    func_0x00559710(unaff_x29 + -0xd8,&uStack0000000000000100,&UNK_009ec388);
    lVar23 = *(long *)(unaff_x29 + -200);
    if (lVar23 != 0) {
      puVar61 = *(uint **)(unaff_x29 + -0xd0);
      puVar18 = puVar61 + 1;
      puVar37 = puVar61;
      do {
        puVar27 = puVar18;
        uVar2 = *puVar37;
        uVar30 = (ulong)uVar2;
        if ((*(ulong *)(*(long *)(in_stack_000000f8 + 0xd8) + 0x40) <= uVar30) ||
           (puVar24 = (undefined8 *)
                      (*(long *)(*(long *)(in_stack_000000f8 + 0xd8) + 0x38) +
                      uVar30 * (unaff_x24 & 0xffffffff)), (uint *)*puVar24 == unaff_x21)) {
          func_0x007a23bc(&UNK_009ece28);
          goto code_r0x0054319c;
        }
        uVar65 = 0;
        plVar47 = (long *)puVar24[2];
        auVar74._8_8_ = 0;
        auVar74._0_8_ = plVar47;
        uVar31 = in_stack_00000080;
        if ((SUB168(auVar74 * ZEXT816(0x18),8) != 0) ||
           (uVar40 = (long)plVar47 * 0x18, 0x7ffffffffffffff8 < uVar40)) {
code_r0x00542f30:
          in_stack_00000080 = uVar31;
          func_0x007a1f00(uVar65,in_stack_00000080,&UNK_009ece40);
          goto code_r0x0054319c;
        }
        plVar58 = (long *)puVar24[1];
        if (uVar40 == 0) {
          plVar17 = (long *)0x0;
          in_stack_00000080 = 8;
        }
        else {
          in_stack_00000080 = func_0x00187bd0(uVar40,8);
          uVar65 = 8;
          uVar31 = uVar40;
          if (in_stack_00000080 == 0) goto code_r0x00542f30;
          plVar17 = plVar47;
        }
        uStack0000000000000100._0_4_ = (uint)plVar17;
        uStack0000000000000100._4_4_ = (undefined4)((ulong)plVar17 >> 0x20);
        iStack0000000000000108 = (int)in_stack_00000080;
        uStack000000000000010c = (undefined4)(in_stack_00000080 >> 0x20);
        uStack0000000000000110 = 0;
        uStack0000000000000114 = 0;
        pdVar63 = (dword *)((long)plVar47 * 0x40);
        if ((ulong)plVar47 >> 0x3a != 0 || (dword *)0x7ffffffffffffff8 < pdVar63) {
          in_stack_00000010 = 0;
code_r0x00542f80:
          func_0x007a1f00(in_stack_00000010,in_stack_00000018,&UNK_009ece58);
          goto code_r0x0054319c;
        }
        if (pdVar63 == (dword *)0x0) {
          in_stack_00000288 = (long *)0x0;
          in_stack_00000290 = &MACH_HEADER.cpusubtype;
        }
        else {
          in_stack_00000290 = (dword *)func_0x00187bd0(pdVar63,8);
          in_stack_00000018 = pdVar63;
          if (in_stack_00000290 == (dword *)0x0) goto code_r0x00542f80;
          in_stack_00000288 = plVar47;
        }
        in_stack_00000278 = (dword *)CONCAT44(uStack000000000000010c,iStack0000000000000108);
        in_stack_00000270 =
             (dword *)CONCAT44(uStack0000000000000100._4_4_,(uint)uStack0000000000000100);
        in_stack_00000280 = (dword *)CONCAT44(uStack0000000000000114,uStack0000000000000110);
        in_stack_00000298 = (long *)0x0;
        in_stack_000002a0 = (undefined8 *)CONCAT62((int6)((ulong)in_stack_000002a0 >> 0x10),0x100);
        if (plVar47 != (long *)0x0) {
          in_stack_000000c0 = (long *)((ulong)in_stack_000000c0 & 0xffffffffffffff00);
          plVar17 = plVar58 + 9;
          plVar34 = plVar58;
          do {
            plVar26 = plVar17;
            plVar17 = (long *)func_0x00187bd0(0x28,8);
            if (plVar17 == (long *)0x0) {
              func_0x007a1f18(8,0x28);
              goto code_r0x0054319c;
            }
            *plVar17 = 1;
            plVar17[1] = (long)in_stack_000000c0;
            plVar17[2] = (long)unaff_x21;
            *(long **)(unaff_x29 + -0xc0) = plVar17;
            if ((plVar34[1] == 0) &&
               (puVar24 = (undefined8 *)func_0x00578610(in_stack_000000f8,plVar34 + 2),
               puVar24 != (undefined8 *)0x0)) {
              lVar15 = *plVar17;
              *plVar17 = lVar15 + 1;
              if (lVar15 < 0) {
code_r0x00541b94:
                func_0x007a05dc();
              }
              else {
                uStack0000000000000100._0_4_ = (uint)plVar17;
                uStack0000000000000100._4_4_ = (undefined4)((ulong)plVar17 >> 0x20);
                lVar15 = *(long *)*puVar24;
                *(long *)*puVar24 = lVar15 + 1;
                if (-1 < lVar15) {
                  uVar54 = *puVar24;
                  uVar65 = func_0x005787f4(*(undefined8 *)(in_stack_000000f8 + 0x38),
                                           *(undefined8 *)(in_stack_000000f8 + 0x40),plVar17);
                  func_0x00589494(in_stack_000000f8,uVar65,plVar17,uVar54);
                  unaff_x22 = auStack_7ffffffe + 0x8000026e;
                  unaff_x21 = (uint *)0x8000000000000000;
                  if (extraout_x1_00 != (dword *)0x0) {
                    lVar15 = *(long *)extraout_x1_00;
                    *(long *)extraout_x1_00 = lVar15 + -1;
                    LORelease();
                    if (lVar15 == 1) {
                      func_0x005d2ac4(auStack_7ffffffe + 0x8000020e);
                    }
                  }
                  plVar17 = *(long **)(unaff_x29 + -0xc0);
                  in_stack_00000210 = extraout_x1_00;
                  goto code_r0x0053f924;
                }
                func_0x007a05dc();
              }
              goto code_r0x0054319c;
            }
code_r0x0053f924:
            lVar15 = *plVar17;
            *plVar17 = lVar15 + 1;
            if (lVar15 < 0) goto code_r0x00541b94;
            uStack0000000000000100._0_4_ = (uint)unaff_x21;
            uStack0000000000000100._4_4_ = (undefined4)((ulong)unaff_x21 >> 0x20);
            iStack0000000000000108 = (int)plVar17;
            uStack000000000000010c = (undefined4)((ulong)plVar17 >> 0x20);
            if (in_stack_00000280 == in_stack_00000270) {
              func_0x00582b88(auStack_7ffffffe + 0x8000026e,&UNK_009eced0);
            }
            pdVar63 = in_stack_00000278 + (long)in_stack_00000280 * 6;
            *(ulong *)(pdVar63 + 4) = CONCAT44(uStack0000000000000114,uStack0000000000000110);
            *(ulong *)(pdVar63 + 2) = CONCAT44(uStack000000000000010c,iStack0000000000000108);
            *(ulong *)pdVar63 = CONCAT44(uStack0000000000000100._4_4_,(uint)uStack0000000000000100);
            in_stack_00000280 = (dword *)((long)in_stack_00000280 + 1);
            lVar15 = plVar34[1];
            uStack0000000000000128 = (dword *)plVar34[6];
            in_stack_00000120 = (dword *)plVar34[5];
            in_stack_00000138 = (long *)plVar34[8];
            in_stack_00000130 = (dword *)plVar34[7];
            iStack0000000000000108 = (int)plVar34[2];
            uStack000000000000010c = (undefined4)((ulong)plVar34[2] >> 0x20);
            uStack0000000000000100._0_4_ = (uint)lVar15;
            uStack0000000000000100._4_4_ = (undefined4)((ulong)lVar15 >> 0x20);
            uStack0000000000000118._0_4_ = (undefined4)plVar34[4];
            uStack0000000000000118._4_4_ = (undefined4)((ulong)plVar34[4] >> 0x20);
            uStack0000000000000110 = (undefined4)plVar34[3];
            uStack0000000000000114 = (undefined4)((ulong)plVar34[3] >> 0x20);
            plVar34[1] = 0;
            plVar34[2] = (long)plVar17;
            plVar34[4] = (long)in_stack_00000218;
            plVar34[3] = (long)in_stack_00000210;
            plVar34[6] = in_stack_00000228;
            plVar34[5] = (long)in_stack_00000220;
            plVar34[8] = in_stack_00000238;
            plVar34[7] = in_stack_00000230;
            if (in_stack_00000298 == in_stack_00000288) {
              func_0x00582ff0(unaff_x22 + 0x18,&UNK_009ecee8);
            }
            pdVar63 = in_stack_00000290 + (long)in_stack_00000298 * 0x10;
            *(ulong *)(pdVar63 + 2) = CONCAT44(uStack000000000000010c,iStack0000000000000108);
            *(ulong *)pdVar63 = CONCAT44(uStack0000000000000100._4_4_,(uint)uStack0000000000000100);
            *(ulong *)(pdVar63 + 6) =
                 CONCAT44(uStack0000000000000118._4_4_,(undefined4)uStack0000000000000118);
            *(ulong *)(pdVar63 + 4) = CONCAT44(uStack0000000000000114,uStack0000000000000110);
            *(dword **)(pdVar63 + 10) = uStack0000000000000128;
            *(dword **)(pdVar63 + 8) = in_stack_00000120;
            *(long **)(pdVar63 + 0xe) = in_stack_00000138;
            *(dword **)(pdVar63 + 0xc) = in_stack_00000130;
            in_stack_00000298 = (long *)((long)in_stack_00000298 + 1);
            unaff_x21 = (uint *)0x8000000000000000;
            if (in_stack_00000268 == 0) {
code_r0x0053ff0c:
              func_0x007a23d8(&UNK_008aad91,0x16,&UNK_009ecf00);
              goto code_r0x0054319c;
            }
            lVar15 = 0;
            uVar40 = (*plVar34 + 8) * 0x517cc1b727220a95;
            bVar38 = (byte)(uVar40 >> 0x39);
            uVar40 = uVar40 & (ulong)in_stack_00000258;
            uVar65 = *(undefined8 *)((long)in_stack_00000250 + uVar40);
            uVar31 = CONCAT17(-((byte)((ulong)uVar65 >> 0x38) == bVar38),
                              CONCAT16(-((byte)((ulong)uVar65 >> 0x30) == bVar38),
                                       CONCAT15(-((byte)((ulong)uVar65 >> 0x28) == bVar38),
                                                CONCAT14(-((byte)((ulong)uVar65 >> 0x20) == bVar38),
                                                         CONCAT13(-((byte)((ulong)uVar65 >> 0x18) ==
                                                                   bVar38),CONCAT12(-((byte)((ulong)
                                                  uVar65 >> 0x10) == bVar38),
                                                  CONCAT11(-((byte)((ulong)uVar65 >> 8) == bVar38),
                                                           -((byte)uVar65 == bVar38)))))))) &
                     0x8080808080808080;
            while( true ) {
              while (uVar31 == 0) {
                bVar67 = NEON_umaxv(CONCAT17(-((char)((ulong)uVar65 >> 0x38) == -1),
                                             CONCAT16(-((char)((ulong)uVar65 >> 0x30) == -1),
                                                      CONCAT15(-((char)((ulong)uVar65 >> 0x28) == -1
                                                                ),CONCAT14(-((char)((ulong)uVar65 >>
                                                                                   0x20) == -1),
                                                                           CONCAT13(-((char)((ulong)
                                                  uVar65 >> 0x18) == -1),
                                                  CONCAT12(-((char)((ulong)uVar65 >> 0x10) == -1),
                                                           CONCAT11(-((char)((ulong)uVar65 >> 8) ==
                                                                     -1),-((char)uVar65 == -1)))))))
                                            ),1);
                if ((bVar67 & 1) != 0) goto code_r0x0053ff0c;
                lVar15 = lVar15 + 8;
                uVar40 = uVar40 + lVar15 & (ulong)in_stack_00000258;
                uVar65 = *(undefined8 *)((long)in_stack_00000250 + uVar40);
                uVar31 = CONCAT17(-((byte)((ulong)uVar65 >> 0x38) == bVar38),
                                  CONCAT16(-((byte)((ulong)uVar65 >> 0x30) == bVar38),
                                           CONCAT15(-((byte)((ulong)uVar65 >> 0x28) == bVar38),
                                                    CONCAT14(-((byte)((ulong)uVar65 >> 0x20) ==
                                                              bVar38),CONCAT13(-((byte)((ulong)
                                                  uVar65 >> 0x18) == bVar38),
                                                  CONCAT12(-((byte)((ulong)uVar65 >> 0x10) == bVar38
                                                            ),CONCAT11(-((byte)((ulong)uVar65 >> 8)
                                                                        == bVar38),
                                                                       -((byte)uVar65 == bVar38)))))
                                                  ))) & 0x8080808080808080;
              }
              uVar44 = (uVar31 >> 7 & 0xff00ff00ff00ff00) >> 8 |
                       (uVar31 >> 7 & 0xff00ff00ff00ff) << 8;
              uVar44 = (uVar44 & 0xffff0000ffff0000) >> 0x10 | (uVar44 & 0xffff0000ffff) << 0x10;
              uVar44 = uVar40 + ((ulong)LZCOUNT(uVar44 >> 0x20 | uVar44 << 0x20) >> 3) &
                       (ulong)in_stack_00000258;
              if (*plVar34 == *(long *)(in_stack_00000250 + uVar44 * -4 + -4)) break;
              uVar31 = uVar31 - 1 & uVar31;
            }
            lVar15 = **(long **)(in_stack_00000250 + uVar44 * -4 + -2);
            **(long **)(in_stack_00000250 + uVar44 * -4 + -2) = lVar15 + 1;
            if (lVar15 < 0) {
              func_0x007a05dc();
              goto code_r0x0054319c;
            }
            lVar48 = *(long *)(in_stack_00000250 + uVar44 * -4 + -2);
            lVar15 = *(long *)*plVar34;
            *(long *)*plVar34 = lVar15 + -1;
            LORelease();
            if (lVar15 == 1) {
              func_0x005d2ac4(plVar34);
            }
            *plVar34 = lVar48;
            lVar15 = 0;
            if (plVar26 != plVar58 + (long)plVar47 * 9) {
              lVar15 = 0x48;
            }
            plVar17 = (long *)((long)plVar26 + lVar15);
            plVar34 = plVar26;
          } while (plVar26 != plVar58 + (long)plVar47 * 9);
        }
        unaff_x24 = 0x30;
        if (in_stack_00000280 != (dword *)0x0) {
          lVar15 = *(long *)(in_stack_000000f8 + 0xd8);
          uVar31 = uVar62;
          if (lVar22 == 1) {
code_r0x0053fd90:
            if (uVar31 < *(ulong *)(lVar15 + 0x28)) {
              puVar24 = (undefined8 *)(*(long *)(lVar15 + 0x20) + uVar31 * 0x20);
              if ((uint *)*puVar24 != unaff_x21) {
                uStack0000000000000118._0_4_ = 0xf;
                uStack0000000000000118._4_4_ = 0;
                puVar18 = (uint *)puVar24[2];
                in_stack_00000120 = in_stack_00000270;
                uStack0000000000000128 = in_stack_00000278;
                in_stack_00000130 = in_stack_00000280;
                in_stack_00000138 = in_stack_00000288;
                in_stack_00000140 = in_stack_00000290;
                in_stack_00000148 = in_stack_00000298;
                in_stack_00000150 = in_stack_000002a0;
                if (puVar18 == (uint *)*puVar24) {
                  func_0x005bd0a4(puVar24,&UNK_009eceb8);
                }
                _memcpy(puVar24[1] + (long)puVar18 * 0x108,&uStack0000000000000100,0x108);
                puVar24[2] = (long)puVar18 + 1;
                goto LAB_0053fe30;
              }
            }
          }
          else {
            uStack0000000000000100._0_4_ = 0;
            uStack0000000000000100._4_4_ = 0;
            iStack0000000000000108 = 8;
            uStack000000000000010c = 0;
            uStack0000000000000110 = 0;
            uStack0000000000000114 = 0;
            uVar31 = func_0x00594d74(lVar15 + 0x18,&uStack0000000000000100);
            lVar15 = *(long *)(in_stack_000000f8 + 0xd8);
            uVar40 = *(ulong *)(lVar15 + 0x40);
            if ((uVar30 < uVar40) &&
               (puVar24 = (undefined8 *)(*(long *)(lVar15 + 0x38) + uVar30 * 0x30),
               (uint *)*puVar24 != unaff_x21)) {
              uVar44 = (ulong)*(uint *)(puVar24 + 5);
              if ((uVar44 < *(ulong *)(lVar15 + 0x28)) &&
                 (puVar24 = (undefined8 *)(*(long *)(lVar15 + 0x20) + uVar44 * 0x20),
                 (uint *)*puVar24 != unaff_x21)) {
                if ((puVar24[2] != 0) &&
                   (lVar48 = *(long *)(puVar24[1] + puVar24[2] * 0x108 + -0xf0),
                   lVar48 == 0x19 || lVar48 == 0x16)) {
                  func_0x004d1c68(in_stack_000000f8 + 0x200,uVar31);
                  lVar15 = *(long *)(in_stack_000000f8 + 0xd8);
                  uVar40 = *(ulong *)(lVar15 + 0x40);
                }
                if (uVar30 < uVar40) {
                  lVar48 = *(long *)(lVar15 + 0x38);
                  puVar24 = (undefined8 *)(lVar48 + uVar30 * 0x30);
                  if ((uint *)*puVar24 != unaff_x21) {
                    uVar44 = puVar24[5];
                    uVar42 = *(ulong *)(lVar15 + 0x28);
                    uVar46 = uVar44 & 0xffffffff;
                    if (uVar46 < uVar42) {
                      uVar59 = *(uint *)((long)puVar24 + 0x24);
                      lVar45 = *(long *)(lVar15 + 0x20);
                      puVar18 = (uint *)(lVar45 + uVar46 * 0x20 + 0x18);
                      uVar6 = *puVar18;
                      while (uVar46 = (ulong)uVar6, uVar46 != uVar30) {
                        if (uVar40 <= uVar46) goto code_r0x0053fc20;
                        puVar18 = (uint *)(lVar48 + uVar46 * 0x30 + 0x20);
                        uVar6 = *puVar18;
                      }
                      *puVar18 = *(uint *)(puVar24 + 4);
code_r0x0053fc20:
                      uVar44 = uVar44 >> 0x20;
                      if (uVar44 < uVar42) {
                        puVar18 = (uint *)(lVar45 + uVar44 * 0x20 + 0x1c);
                        uVar6 = *puVar18;
                        while (uVar44 = (ulong)uVar6, uVar44 != uVar30) {
                          if (uVar40 <= uVar44) goto code_r0x0053fc58;
                          puVar18 = (uint *)(lVar48 + uVar44 * 0x30 + 0x24);
                          uVar6 = *puVar18;
                        }
                        *puVar18 = uVar59;
                      }
                    }
code_r0x0053fc58:
                    *(undefined4 *)(puVar24 + 4) = *(undefined4 *)(lVar15 + 0x5c);
                    *(undefined8 *)((long)puVar24 + 0x24) = 0xffffffffffffffff;
                    *(undefined4 *)((long)puVar24 + 0x2c) = 0xffffffff;
                    *(uint *)(lVar15 + 0x5c) = uVar2;
                    *(long *)(lVar15 + 0x50) = *(long *)(lVar15 + 0x50) + -1;
                    in_stack_00000210 = (dword *)*puVar24;
                    *puVar24 = unaff_x21;
                    if (in_stack_00000210 != unaff_x21) {
                      in_stack_00000220 = (dword *)puVar24[2];
                      in_stack_00000218 = (undefined8 *)puVar24[1];
                      in_stack_00000228 = puVar24[3];
                      uVar65 = *(undefined8 *)(in_stack_000000f8 + 0xd8);
                      puVar18 = (uint *)func_0x00187bd0(0x28,8);
                      if (puVar18 != (uint *)0x0) {
                        uStack000000000000010c = SUB84(in_stack_00000218,0);
                        uStack0000000000000100._4_4_ = SUB84(in_stack_00000210,0);
                        iStack0000000000000108 = (int)((ulong)in_stack_00000210 >> 0x20);
                        uStack0000000000000118._0_4_ =
                             (undefined4)((ulong)in_stack_00000220 >> 0x20);
                        *puVar18 = in_stack_000002b8;
                        *(ulong *)(puVar18 + 3) =
                             CONCAT44(uStack000000000000010c,iStack0000000000000108);
                        *(ulong *)(puVar18 + 1) =
                             CONCAT44(uStack0000000000000100._4_4_,(uint)uStack0000000000000100);
                        *(dword **)(puVar18 + 6) = in_stack_00000220;
                        *(undefined8 **)(puVar18 + 4) = in_stack_00000218;
                        *(undefined1 *)(puVar18 + 8) = 0;
                        uStack0000000000000100._0_4_ = 1;
                        uStack0000000000000100._4_4_ = 0;
                        iStack0000000000000108 = (int)puVar18;
                        uStack000000000000010c = (undefined4)((ulong)puVar18 >> 0x20);
                        uStack0000000000000110 = 1;
                        uStack0000000000000114 = 0;
                        func_0x00584c34(unaff_x29 + -0xc0,uVar65,uVar31,&uStack0000000000000100);
                        func_0x005581a0(unaff_x29 + -0xc0);
                        if (*(long *)(unaff_x29 + -0xc0) != 0) {
                          func_0x00187bd4(*(undefined8 *)(unaff_x29 + -0xb8),
                                          *(long *)(unaff_x29 + -0xc0) * 0x28,8);
                        }
                        uStack0000000000000118._0_4_ =
                             CONCAT31(uStack0000000000000118._1_3_,(char)in_stack_00000228);
                        uStack0000000000000100._0_4_ = 0;
                        uStack0000000000000100._4_4_ = 0;
                        iStack0000000000000108 = 8;
                        uStack000000000000010c = 0;
                        uStack0000000000000110 = 0;
                        uStack0000000000000114 = 0;
                        func_0x00594a8c(*(long *)(in_stack_000000f8 + 0xd8) + 0x18,uVar62,uVar31,
                                        &uStack0000000000000100);
                        func_0x004d1c68(unaff_x29 + -0x80,uVar31);
                        lVar15 = *(long *)(in_stack_000000f8 + 0xd8);
                        uVar31 = uVar31 & 0xffffffff;
                        goto code_r0x0053fd90;
                      }
                      func_0x007a1f18(8,0x28);
                      goto code_r0x0054319c;
                    }
                  }
                }
                in_stack_00000008 = &UNK_009ece88;
              }
              else {
                in_stack_00000008 = &UNK_009ec878;
              }
            }
            else {
              in_stack_00000008 = &UNK_009ece70;
            }
          }
          func_0x007a23bc(in_stack_00000008);
          goto code_r0x0054319c;
        }
        func_0x0053dc88(auStack_7ffffffe + 0x8000026e);
LAB_0053fe30:
        unaff_x27 = 1;
        puVar18 = puVar27 + (puVar27 != puVar61 + lVar23);
        puVar37 = puVar27;
        in_stack_00000018 = in_stack_00000290;
      } while (puVar27 != puVar61 + lVar23);
    }
    if (*(long *)(unaff_x29 + -0xd8) != 0) {
      func_0x00187bd4(*(undefined8 *)(unaff_x29 + -0xd0),*(long *)(unaff_x29 + -0xd8) << 2,4);
    }
    if (*(long *)(unaff_x29 + -0xf0) != 0) {
      func_0x00187bd4(*(undefined8 *)(unaff_x29 + -0xe8),*(long *)(unaff_x29 + -0xf0) * 0x18,8);
    }
    puVar36 = *(undefined **)(unaff_x29 + -0x80);
    uVar31 = *(ulong *)(unaff_x29 + -0x78);
    lVar23 = *(long *)(*(long *)(in_stack_000000f8 + 0xd8) + 0x38);
    uVar30 = *(ulong *)(*(long *)(in_stack_000000f8 + 0xd8) + 0x40);
    unaff_x25 = in_stack_000000f8;
    if (*(long *)(unaff_x29 + -0x68) != 0) {
      uVar40 = uStack00000000000000d0 & 0xffffffff;
      if (uVar40 < uVar30) goto LAB_0053f504;
      do {
        uStack00000000000000d0 = uStack00000000000000d0 >> 0x20;
        do {
          if (uVar30 <= uStack00000000000000d0) goto LAB_0053fe98;
          lVar22 = lVar23 + uStack00000000000000d0 * unaff_x24;
          uStack00000000000000d0 = (ulong)*(uint *)(lVar22 + 0x24);
          uVar2 = *(uint *)(lVar22 + 0x28);
        } while (uVar2 == 0xffffffff);
        uStack00000000000000d0 = uVar40 | uStack00000000000000d0 << 0x20;
        while( true ) {
          uVar62 = (ulong)uVar2;
          lVar22 = 0;
          bVar38 = (byte)(uVar62 * 0x517cc1b727220a95 >> 0x39);
          uVar44 = uVar62 * 0x517cc1b727220a95 & uVar31;
          uVar65 = *(undefined8 *)(puVar36 + uVar44);
          uVar40 = CONCAT17(-((byte)((ulong)uVar65 >> 0x38) == bVar38),
                            CONCAT16(-((byte)((ulong)uVar65 >> 0x30) == bVar38),
                                     CONCAT15(-((byte)((ulong)uVar65 >> 0x28) == bVar38),
                                              CONCAT14(-((byte)((ulong)uVar65 >> 0x20) == bVar38),
                                                       CONCAT13(-((byte)((ulong)uVar65 >> 0x18) ==
                                                                 bVar38),CONCAT12(-((byte)((ulong)
                                                  uVar65 >> 0x10) == bVar38),
                                                  CONCAT11(-((byte)((ulong)uVar65 >> 8) == bVar38),
                                                           -((byte)uVar65 == bVar38)))))))) &
                   0x8080808080808080;
          while( true ) {
            while (uVar40 == 0) {
              bVar67 = NEON_umaxv(CONCAT17(-((char)((ulong)uVar65 >> 0x38) == -1),
                                           CONCAT16(-((char)((ulong)uVar65 >> 0x30) == -1),
                                                    CONCAT15(-((char)((ulong)uVar65 >> 0x28) == -1),
                                                             CONCAT14(-((char)((ulong)uVar65 >> 0x20
                                                                              ) == -1),
                                                                      CONCAT13(-((char)((ulong)
                                                  uVar65 >> 0x18) == -1),
                                                  CONCAT12(-((char)((ulong)uVar65 >> 0x10) == -1),
                                                           CONCAT11(-((char)((ulong)uVar65 >> 8) ==
                                                                     -1),-((char)uVar65 == -1)))))))
                                          ),1);
              if ((bVar67 & 1) != 0) goto LAB_0053f61c;
              lVar22 = lVar22 + 8;
              uVar44 = uVar44 + lVar22 & uVar31;
              uVar65 = *(undefined8 *)(puVar36 + uVar44);
              uVar40 = CONCAT17(-((byte)((ulong)uVar65 >> 0x38) == bVar38),
                                CONCAT16(-((byte)((ulong)uVar65 >> 0x30) == bVar38),
                                         CONCAT15(-((byte)((ulong)uVar65 >> 0x28) == bVar38),
                                                  CONCAT14(-((byte)((ulong)uVar65 >> 0x20) == bVar38
                                                            ),CONCAT13(-((byte)((ulong)uVar65 >>
                                                                               0x18) == bVar38),
                                                                       CONCAT12(-((byte)((ulong)
                                                  uVar65 >> 0x10) == bVar38),
                                                  CONCAT11(-((byte)((ulong)uVar65 >> 8) == bVar38),
                                                           -((byte)uVar65 == bVar38)))))))) &
                       0x8080808080808080;
            }
            uVar42 = (uVar40 >> 7 & 0xff00ff00ff00ff00) >> 8 | (uVar40 >> 7 & 0xff00ff00ff00ff) << 8
            ;
            uVar42 = (uVar42 & 0xffff0000ffff0000) >> 0x10 | (uVar42 & 0xffff0000ffff) << 0x10;
            if (uVar2 == *(uint *)(puVar36 +
                                  (uVar44 + ((ulong)LZCOUNT(uVar42 >> 0x20 | uVar42 << 0x20) >> 3) &
                                  uVar31) * -4 + -4)) break;
            uVar40 = uVar40 - 1 & uVar40;
          }
          uVar40 = uStack00000000000000d0 & 0xffffffff;
          if (uVar30 <= uVar40) break;
LAB_0053f504:
          lVar22 = lVar23 + uVar40 * (unaff_x24 & 0xffffffff);
          uStack00000000000000d0 =
               uStack00000000000000d0 & 0xffffffff00000000 | (ulong)*(uint *)(lVar22 + 0x20);
          uVar2 = *(uint *)(lVar22 + 0x2c);
        }
      } while( true );
    }
  } while( true );
code_r0x0053f2f4:
  if ((*(ulong *)(lVar22 + 0x28) <= uVar30) ||
     (unaff_x23 = (long *)(*(long *)(lVar22 + 0x20) + uVar30 * 0x20),
     (uint *)*unaff_x23 == unaff_x21)) goto code_r0x0054307c;
  func_0x00559858(unaff_x29 + -0xc0,auStack_7ffffffe + 0x8000020e,&UNK_009ec388);
  in_stack_00000228 = (long)in_stack_00000050 + (long)in_stack_00000058 + 1;
  lVar22 = *(long *)in_stack_00000050;
  in_stack_00000220 = in_stack_00000050 + 2;
  in_stack_00000218 =
       (undefined8 *)
       (CONCAT17(-(-1 < lVar22),
                 CONCAT16(-(-1 < (char)((ulong)lVar22 >> 0x30)),
                          CONCAT15(-(-1 < (char)((ulong)lVar22 >> 0x28)),
                                   CONCAT14(-(-1 < (char)((ulong)lVar22 >> 0x20)),
                                            CONCAT13(-(-1 < (char)((ulong)lVar22 >> 0x18)),
                                                     CONCAT12(-(-1 < (char)((ulong)lVar22 >> 0x10)),
                                                              CONCAT11(-(-1 < (char)((ulong)lVar22
                                                                                    >> 8)),
                                                                       -(-1 < (char)lVar22)))))))) &
       0x8080808080808080);
  func_0x00558f08(unaff_x29 + -0x80,auStack_7ffffffe + 0x8000020e,&UNK_009ec388);
  in_stack_00000280 = *(dword **)(unaff_x29 + -0xb0);
  in_stack_00000278 = *(dword **)(unaff_x29 + -0xb8);
  in_stack_00000270 = *(dword **)(unaff_x29 + -0xc0);
  uVar65 = *(undefined8 *)(unaff_x29 + -0x80);
  *(undefined8 *)(unaff_x22 + 0x20) = *(undefined8 *)(unaff_x29 + -0x78);
  *(undefined8 *)(unaff_x22 + 0x18) = uVar65;
  *(undefined8 *)(unaff_x22 + 0x28) = *(undefined8 *)(unaff_x29 + -0x70);
  in_stack_00000150 = (undefined8 *)CONCAT62(in_stack_00000150._2_6_,0x100);
  uStack0000000000000118._0_4_ = 0xf;
  uStack0000000000000118._4_4_ = 0;
  unaff_x19 = unaff_x23[2];
  in_stack_00000120 = in_stack_00000270;
  uStack0000000000000128 = in_stack_00000278;
  in_stack_00000130 = in_stack_00000280;
  in_stack_00000138 = in_stack_00000288;
  in_stack_00000140 = in_stack_00000290;
  in_stack_00000148 = in_stack_00000298;
  if (unaff_x19 == *unaff_x23) {
    func_0x005bd0a4(unaff_x23,&UNK_009ecdf8);
  }
  param_1 = unaff_x23[1];
  if (unaff_x19 != 0) {
    _memmove(param_1 + 0x108,param_1,unaff_x19 * 0x108);
  }
  param_2 = &uStack0000000000000100;
  param_3 = 0x108;
  in_stack_00000210 = in_stack_00000050;
  in_stack_00000230 = in_stack_00000048;
  goto code_r0x0053f438;
code_r0x0054307c:
  func_0x007a23bc(&UNK_009ecde0);
  goto code_r0x0054319c;
code_r0x0054023c:
  iStack0000000000000108 = (int)*(undefined8 *)(unaff_x29 + -0x78);
  uStack000000000000010c = (undefined4)((ulong)*(undefined8 *)(unaff_x29 + -0x78) >> 0x20);
  uStack0000000000000100._0_4_ = (uint)*(undefined8 *)(unaff_x29 + -0x80);
  uStack0000000000000100._4_4_ = (undefined4)((ulong)*(undefined8 *)(unaff_x29 + -0x80) >> 0x20);
  uStack0000000000000118._0_4_ = (undefined4)*(undefined8 *)(unaff_x29 + -0x68);
  uStack0000000000000118._4_4_ = (undefined4)((ulong)*(undefined8 *)(unaff_x29 + -0x68) >> 0x20);
  uStack0000000000000110 = (undefined4)*(undefined8 *)(unaff_x29 + -0x70);
  uStack0000000000000114 = (undefined4)((ulong)*(undefined8 *)(unaff_x29 + -0x70) >> 0x20);
  func_0x0056401c(auStack_7ffffffe + 0x8000026e,unaff_x25 + 0x1c0,dVar3,&uStack0000000000000100);
  if ((in_stack_00000270 != (dword *)0x0) && (in_stack_00000278 != (dword *)0x0)) {
    uVar30 = (long)in_stack_00000278 * 4 + 0xbU & 0xfffffffffffffff8;
    lVar15 = (long)in_stack_00000278 + uVar30 + 9;
    if (lVar15 != 0) {
      func_0x00187bd4((long)in_stack_00000270 - uVar30,lVar15,8);
    }
  }
  plVar58 = (long *)CONCAT44(uStack0000000000000100._4_4_,(uint)uStack0000000000000100);
  if (lVar22 == lVar23) goto code_r0x00540290;
  goto code_r0x00540178;
code_r0x00540544:
  in_stack_00000098 = (uint *)(uVar30 & 0xffffffff);
  if (uVar40 == 3) {
code_r0x005405d0:
    if (puVar39 == puVar24) goto code_r0x00540708;
    in_stack_00000188 = puVar39 + 1;
    uVar40 = 3;
    puVar33 = puVar39;
    puVar39 = in_stack_00000188;
  }
  else {
    if (plVar58 != (long *)0x0) {
      if (uStack00000000000000d0 == 0) {
        in_stack_00000160 = (long *)0x0;
        goto code_r0x005405bc;
      }
      plVar17 = plVar47;
      if (uVar31 == 0) {
        do {
          plVar47 = plVar17 + 1;
          lVar45 = *plVar17;
          plVar58 = plVar58 + -8;
          uVar31 = CONCAT17(-(-1 < lVar45),
                            CONCAT16(-(-1 < (char)((ulong)lVar45 >> 0x30)),
                                     CONCAT15(-(-1 < (char)((ulong)lVar45 >> 0x28)),
                                              CONCAT14(-(-1 < (char)((ulong)lVar45 >> 0x20)),
                                                       CONCAT13(-(-1 < (char)((ulong)lVar45 >> 0x18)
                                                                 ),CONCAT12(-(-1 < (char)((ulong)
                                                  lVar45 >> 0x10)),
                                                  CONCAT11(-(-1 < (char)((ulong)lVar45 >> 8)),
                                                           -(-1 < (char)lVar45)))))))) &
                   0x8080808080808080;
          plVar17 = plVar47;
        } while (uVar31 == 0);
        in_stack_00000160 = plVar58;
        in_stack_00000170 = plVar47;
      }
      uVar62 = (uVar31 >> 7 & 0xff00ff00ff00ff00) >> 8 | (uVar31 >> 7 & 0xff00ff00ff00ff) << 8;
      uVar62 = (uVar62 & 0xffff0000ffff0000) >> 0x10 | (uVar62 & 0xffff0000ffff) << 0x10;
      uVar31 = uVar31 - 1 & uVar31;
      uStack00000000000000d0 = uStack00000000000000d0 + -1;
      puVar33 = (undefined8 *)
                ((long)plVar58 + (-8 - (LZCOUNT(uVar62 >> 0x20 | uVar62 << 0x20) & 0x78U)));
      in_stack_00000168 = uVar31;
      in_stack_00000180 = uStack00000000000000d0;
      goto code_r0x005405f0;
    }
code_r0x005405bc:
    if (uVar40 == 2) {
code_r0x005405c4:
      plVar58 = (long *)0x0;
      uStack0000000000000100._0_4_ = 3;
      uStack0000000000000100._4_4_ = 0;
      goto code_r0x005405d0;
    }
    if (((uVar40 & 1) == 0) || (in_stack_000000b0 == in_stack_000000c0)) {
      if (puVar57 == puVar41) goto code_r0x005405c4;
      plVar58 = (long *)0x0;
      in_stack_00000150 = puVar57 + 3;
      in_stack_00000120 = (dword *)(puVar57 + 1);
      _uStack0000000000000110 = (long *)((long)&MACH_HEADER.magic + 2);
      uStack0000000000000118._0_4_ = SUB84(puVar57,0);
      uStack0000000000000118._4_4_ = (undefined4)((ulong)puVar57 >> 0x20);
      _iStack0000000000000108 = (long *)((long)&MACH_HEADER.magic + 1);
      uStack0000000000000100._0_4_ = 1;
      uStack0000000000000100._4_4_ = 0;
      in_stack_000000c0 = (long *)((long)&MACH_HEADER.magic + 1);
      in_stack_000000b0 = (long *)((long)&MACH_HEADER.magic + 2);
      uVar40 = 1;
      puVar33 = puVar57;
      puVar57 = in_stack_00000150;
    }
    else {
      puVar33 = &uStack0000000000000118 + (long)in_stack_000000c0;
      in_stack_000000c0 = (long *)((long)in_stack_000000c0 + 1);
      _iStack0000000000000108 = in_stack_000000c0;
      if ((undefined8 *)*puVar33 == (undefined8 *)0x0) goto code_r0x005405c4;
      plVar58 = (long *)0x0;
      puVar33 = (undefined8 *)*puVar33;
    }
  }
code_r0x005405f0:
  lVar45 = lVar48 + 1;
  plVar17 = (long *)*puVar33;
  in_stack_00000198 = lVar45;
  if (*(long *)(in_stack_000000f8 + 0x198) != 0) {
    lVar43 = 0;
    uVar62 = (long)(plVar17 + 1) * 0x517cc1b727220a95;
    bVar38 = (byte)(uVar62 >> 0x39);
    while( true ) {
      uVar62 = uVar62 & *(ulong *)(in_stack_000000f8 + 0x188);
      uVar65 = *(undefined8 *)(*(long *)(in_stack_000000f8 + 0x180) + uVar62);
      bVar67 = (byte)((ulong)uVar65 >> 8);
      bVar68 = (byte)((ulong)uVar65 >> 0x10);
      bVar69 = (byte)((ulong)uVar65 >> 0x18);
      bVar70 = (byte)((ulong)uVar65 >> 0x20);
      bVar71 = (byte)((ulong)uVar65 >> 0x28);
      bVar72 = (byte)((ulong)uVar65 >> 0x30);
      bVar73 = (byte)((ulong)uVar65 >> 0x38);
      for (uVar44 = CONCAT17(-(bVar73 == bVar38),
                             CONCAT16(-(bVar72 == bVar38),
                                      CONCAT15(-(bVar71 == bVar38),
                                               CONCAT14(-(bVar70 == bVar38),
                                                        CONCAT13(-(bVar69 == bVar38),
                                                                 CONCAT12(-(bVar68 == bVar38),
                                                                          CONCAT11(-(bVar67 ==
                                                                                    bVar38),-((byte)
                                                  uVar65 == bVar38)))))))) & 0x8080808080808080;
          uVar44 != 0; uVar44 = uVar44 - 1 & uVar44) {
        uVar42 = (uVar44 >> 7 & 0xff00ff00ff00ff00) >> 8 | (uVar44 >> 7 & 0xff00ff00ff00ff) << 8;
        uVar42 = (uVar42 & 0xffff0000ffff0000) >> 0x10 | (uVar42 & 0xffff0000ffff) << 0x10;
        if (plVar17 ==
            *(long **)(*(long *)(in_stack_000000f8 + 0x180) + -0x28 +
                      (uVar62 + ((ulong)LZCOUNT(uVar42 >> 0x20 | uVar42 << 0x20) >> 3) &
                      *(ulong *)(in_stack_000000f8 + 0x188)) * -0x28)) goto code_r0x00540668;
      }
      bVar67 = NEON_umaxv(CONCAT17(-(bVar73 == 0xff),
                                   CONCAT16(-(bVar72 == 0xff),
                                            CONCAT15(-(bVar71 == 0xff),
                                                     CONCAT14(-(bVar70 == 0xff),
                                                              CONCAT13(-(bVar69 == 0xff),
                                                                       CONCAT12(-(bVar68 == 0xff),
                                                                                CONCAT11(-(bVar67 ==
                                                                                          0xff),-((
                                                  byte)uVar65 == 0xff)))))))),1);
      if ((bVar67 & 1) != 0) break;
      lVar43 = lVar43 + 8;
      uVar62 = uVar62 + lVar43;
    }
  }
  lVar43 = *plVar17;
  *plVar17 = lVar43 + 1;
  if (lVar43 < 0) {
    func_0x007a05dc();
    goto code_r0x0054319c;
  }
  uVar65 = *puVar33;
  *(undefined8 *)(unaff_x29 + -0x80) = 0;
  *(int *)(unaff_x29 + -0x78) = iVar21;
  *(undefined8 *)(unaff_x29 + -0x70) = 0;
  *(long *)(unaff_x29 + -0x68) = lVar48;
  func_0x005627a8(auStack_7ffffffe + 0x8000024e,in_stack_000000f8 + 0x180,uVar65,unaff_x29 + -0x80);
code_r0x00540668:
  lVar48 = lVar45;
  goto code_r0x00540544;
code_r0x00540708:
  lVar48 = *(long *)(in_stack_000000f8 + 0xd8);
  uVar31 = *(ulong *)(lVar48 + 0x28);
  if (in_stack_00000098 < uVar31) {
code_r0x00540720:
    plVar47 = (long *)(*(long *)(lVar48 + 0x20) + (uVar30 & 0xffffffff) * 0x20);
    if (*plVar47 == -0x8000000000000000) goto code_r0x00540738;
    uVar40 = (ulong)*(uint *)((long)plVar47 + 0x1c) << 0x20 | 0xffffffff;
    plVar47 = uStack0000000000000100;
  }
  else {
code_r0x00540738:
    uVar40 = 0xffffffffffffffff;
    plVar47 = uStack0000000000000100;
  }
  lVar45 = *(long *)(lVar48 + 0x38);
  uVar62 = *(ulong *)(lVar48 + 0x40);
  do {
    uVar44 = uVar40 & 0xffffffff;
    uStack0000000000000100._0_4_ = (uint)lVar22;
    uVar8 = (uint)uStack0000000000000100;
    uStack0000000000000100._4_4_ = (undefined4)((ulong)lVar22 >> 0x20);
    uVar10 = uStack0000000000000100._4_4_;
    uStack0000000000000100 = plVar47;
    if (uVar62 <= uVar44) {
      uVar40 = uVar40 >> 0x20;
      do {
        uVar42 = uVar40;
        if (uVar62 <= uVar42) goto code_r0x00540940;
        lVar43 = lVar45 + uVar42 * 0x30;
        uVar40 = (ulong)*(uint *)(lVar43 + 0x24);
      } while (*(int *)(lVar43 + 0x28) == -1);
      uVar40 = uVar44 | uVar40 << 0x20;
      if (uVar42 < uVar62) goto code_r0x005407b0;
code_r0x00542dbc:
      func_0x007a23bc(&UNK_009f08a0);
      goto code_r0x0054319c;
    }
    uVar42 = uVar40 & 0xffffffff;
    uVar40 = uVar40 & 0xffffffff00000000 | (ulong)*(uint *)(lVar45 + uVar44 * 0x30 + 0x20);
    if (uVar62 <= uVar42) goto code_r0x00542dbc;
code_r0x005407b0:
    plVar58 = (long *)(lVar45 + uVar42 * 0x30);
    if (*plVar58 == -0x8000000000000000) goto code_r0x00542dbc;
  } while (*(int *)((long)plVar58 + 0x2c) != iVar21);
  uVar40 = plVar58[2];
  if (uVar40 == 0) goto code_r0x00540940;
  lVar48 = plVar58[1];
  lVar45 = uVar40 << 4;
  puVar24 = (undefined8 *)func_0x00187bd0(lVar45,8);
  if (puVar24 == (undefined8 *)0x0) {
    func_0x007a1f00(8,lVar45,&UNK_009ec388);
    goto code_r0x0054319c;
  }
  if (uVar40 < 8) {
    uVar31 = 0;
code_r0x005408b4:
    plVar47 = puVar24 + uVar31 * 2 + 1;
    lVar48 = lVar48 + uVar31 * 0x48;
    do {
      plVar47[-1] = uVar31;
      *plVar47 = lVar48;
      uVar31 = uVar31 + 1;
      plVar47 = plVar47 + 2;
      lVar48 = lVar48 + 0x48;
    } while (uVar40 != uVar31);
  }
  else {
    uVar31 = uVar40 & 0xfffffffffffffff8;
    uVar62 = uVar31;
    plVar47 = puVar24 + 8;
    lVar43 = lVar23;
    lVar50 = lVar15;
    do {
      lVar55 = lVar48 + lVar43 * 0x48;
      lVar60 = lVar48 + lVar50 * 0x48;
      plVar47[-8] = lVar43;
      plVar47[-7] = lVar55;
      plVar47[-6] = lVar50;
      plVar47[-5] = lVar60;
      plVar47[-4] = lVar43 + 2;
      plVar47[-3] = lVar55 + 0x90;
      plVar47[-2] = lVar50 + 2;
      plVar47[-1] = lVar60 + 0x90;
      *plVar47 = lVar43 + 4;
      plVar47[1] = lVar55 + 0x120;
      plVar47[2] = lVar50 + 4;
      plVar47[3] = lVar60 + 0x120;
      plVar47[4] = lVar43 + 6;
      plVar47[5] = lVar55 + 0x1b0;
      plVar47[6] = lVar50 + 6;
      plVar47[7] = lVar60 + 0x1b0;
      lVar43 = lVar43 + 8;
      lVar50 = lVar50 + 8;
      uVar62 = uVar62 - 8;
      plVar47 = plVar47 + 0x10;
    } while (uVar62 != 0);
    if (uVar40 != uVar31) goto code_r0x005408b4;
  }
  puVar57 = puVar24;
  plVar47 = _iStack0000000000000108;
  do {
    uStack000000000000010c = (undefined4)((ulong)plVar47 >> 0x20);
    uVar65 = *puVar57;
    puVar39 = (undefined8 *)puVar57[1];
    plVar58 = (long *)*puVar39;
    lVar48 = *plVar58;
    *plVar58 = lVar48 + 1;
    if (lVar48 < 0) {
      _iStack0000000000000108 = plVar47;
      func_0x007a05dc();
      goto code_r0x0054319c;
    }
    uStack0000000000000110 = 0;
    uStack0000000000000114 = 0;
    uStack0000000000000118._0_4_ = (undefined4)uVar65;
    uStack0000000000000118._4_4_ = (undefined4)((ulong)uVar65 >> 0x20);
    uStack0000000000000100._0_4_ = uVar8;
    uStack0000000000000100._4_4_ = uVar10;
    iStack0000000000000108 = iVar21;
    func_0x005627a8(unaff_x29 + -0x80,in_stack_000000f8 + 0x180,*puVar39,&uStack0000000000000100);
    plVar47 = (long *)CONCAT44(uStack000000000000010c,iStack0000000000000108);
    puVar57 = puVar57 + 2;
  } while (puVar57 != puVar24 + uVar40 * 2);
  func_0x00187bd4(puVar24,lVar45,8);
  plVar47 = (long *)CONCAT44(uStack0000000000000100._4_4_,(uint)uStack0000000000000100);
  lVar48 = *(long *)(in_stack_000000f8 + 0xd8);
  uVar31 = *(ulong *)(lVar48 + 0x28);
code_r0x00540940:
  uStack0000000000000100 = plVar47;
  if ((uVar31 <= (uVar30 & 0xffffffff)) ||
     (plVar47 = (long *)(*(long *)(lVar48 + 0x20) + (uVar30 & 0xffffffff) * 0x20),
     *plVar47 == -0x8000000000000000)) {
    in_stack_00000018 = (dword *)&UNK_009ec788;
code_r0x00542e54:
    func_0x007a23bc(in_stack_00000018);
    goto code_r0x0054319c;
  }
  lVar48 = plVar47[2];
  if (lVar48 != 0) {
    lVar45 = 0;
    lVar50 = plVar47[1];
    lVar43 = lVar50;
    do {
      uVar11 = uStack0000000000000118._4_4_;
      uVar9 = (undefined4)uStack0000000000000118;
      uVar31 = *(long *)(lVar43 + 0x18) - 0xc;
      if (0x14 < uVar31) {
        uVar31 = 9;
      }
      uStack0000000000000118._0_4_ = (undefined4)lVar45;
      uVar12 = (undefined4)uStack0000000000000118;
      uStack0000000000000118._4_4_ = (undefined4)((ulong)lVar45 >> 0x20);
      uVar13 = uStack0000000000000118._4_4_;
      uStack0000000000000118._0_4_ = uVar9;
      uStack0000000000000118._4_4_ = uVar11;
      if ((long)uVar31 < 0xb) {
        if ((long)uVar31 < 4) {
          if (2 < uVar31) {
            func_0x005d8b44(&uStack0000000000000100,lVar43 + 0x20);
            plVar47 = _iStack0000000000000108;
            plVar58 = uStack0000000000000100;
            goto code_r0x00540a60;
          }
        }
        else if (4 < uVar31 - 4) {
          if (uVar31 == 9) {
            func_0x005da864(&uStack0000000000000100,lVar43);
            plVar47 = _iStack0000000000000108;
            plVar58 = uStack0000000000000100;
          }
          else {
            func_0x005db050(&uStack0000000000000100,lVar43 + 0x20);
            plVar47 = _iStack0000000000000108;
            plVar58 = uStack0000000000000100;
          }
          goto code_r0x00540a60;
        }
      }
      else {
        if ((long)uVar31 < 0xe) {
          if (uVar31 == 0xb) {
            func_0x005db52c(&uStack0000000000000100,lVar43 + 0x20);
            plVar47 = _iStack0000000000000108;
            plVar58 = uStack0000000000000100;
          }
          else if (uVar31 == 0xc) {
            func_0x005dbd2c(&uStack0000000000000100,lVar43 + 0x20);
            plVar47 = _iStack0000000000000108;
            plVar58 = uStack0000000000000100;
          }
          else {
            func_0x005dc268(&uStack0000000000000100,lVar43 + 0x20);
            plVar47 = _iStack0000000000000108;
            plVar58 = uStack0000000000000100;
          }
        }
        else {
          if (uVar31 - 0xf < 6) goto code_r0x00540ac8;
          func_0x005dc564(&uStack0000000000000100,lVar43 + 0x20);
          plVar47 = _iStack0000000000000108;
          plVar58 = uStack0000000000000100;
        }
code_r0x00540a60:
        _iStack0000000000000108 = plVar47;
        uStack0000000000000100 = plVar58;
        if (_uStack0000000000000110 != (long *)0x0) {
          lVar55 = 0;
          lVar60 = (long)_uStack0000000000000110 * 8;
          plVar17 = plVar47;
          do {
            uStack000000000000010c = (undefined4)((ulong)plVar17 >> 0x20);
            puVar24 = *(undefined8 **)((long)plVar47 + lVar55);
            plVar34 = (long *)*puVar24;
            lVar16 = *plVar34;
            *plVar34 = lVar16 + 1;
            if (lVar16 < 0) {
              _iStack0000000000000108 = plVar17;
              func_0x007a05dc();
              goto code_r0x0054319c;
            }
            uStack0000000000000110 = 1;
            uStack0000000000000114 = 0;
            uStack0000000000000100._0_4_ = uVar8;
            uStack0000000000000100._4_4_ = uVar10;
            iStack0000000000000108 = iVar21;
            uStack0000000000000118._0_4_ = uVar12;
            uStack0000000000000118._4_4_ = uVar13;
            func_0x005627a8(unaff_x29 + -0x80,in_stack_000000f8 + 0x180,*puVar24,
                            &uStack0000000000000100);
            lVar55 = lVar55 + 8;
            plVar17 = _iStack0000000000000108;
          } while (lVar60 != lVar55);
        }
        if (plVar58 != (long *)0x0) {
          func_0x00187bd4(plVar47,(long)plVar58 << 3,8);
        }
      }
code_r0x00540ac8:
      lVar55 = lVar43 + 0x108;
      lVar45 = lVar45 + 1;
      switch(*(undefined8 *)(lVar43 + 0x18)) {
      case 0xc:
      case 0x11:
      case 0x12:
      case 0x1c:
      case 0x1d:
      case 0x1e:
      case 0x20:
        goto code_r0x00540980;
      case 0xd:
        func_0x005ce8b4(&uStack0000000000000100,lVar43 + 0x20);
        plVar47 = _iStack0000000000000108;
        plVar58 = uStack0000000000000100;
        break;
      case 0xe:
        func_0x005ceb14(&uStack0000000000000100,lVar43 + 0x20);
        plVar47 = _iStack0000000000000108;
        plVar58 = uStack0000000000000100;
        break;
      case 0xf:
        func_0x005d8a94(&uStack0000000000000100,lVar43 + 0x20);
        plVar47 = _iStack0000000000000108;
        plVar58 = uStack0000000000000100;
        break;
      case 0x10:
        func_0x005cf080(&uStack0000000000000100,lVar43 + 0x20);
        plVar47 = _iStack0000000000000108;
        plVar58 = uStack0000000000000100;
        break;
      case 0x13:
        func_0x005cf918(&uStack0000000000000100,lVar43 + 0x20);
        plVar47 = _iStack0000000000000108;
        plVar58 = uStack0000000000000100;
        break;
      case 0x14:
        func_0x005cf918(&uStack0000000000000100,lVar43 + 0x20);
        plVar47 = _iStack0000000000000108;
        plVar58 = uStack0000000000000100;
        break;
      default:
        func_0x005da664(&uStack0000000000000100,lVar43);
        plVar47 = _iStack0000000000000108;
        plVar58 = uStack0000000000000100;
        break;
      case 0x16:
        func_0x005dae50(&uStack0000000000000100,lVar43 + 0x20);
        plVar47 = _iStack0000000000000108;
        plVar58 = uStack0000000000000100;
        break;
      case 0x17:
        func_0x005db32c(&uStack0000000000000100,lVar43 + 0x20);
        plVar47 = _iStack0000000000000108;
        plVar58 = uStack0000000000000100;
        break;
      case 0x18:
        func_0x005dbc7c(&uStack0000000000000100,lVar43 + 0x20);
        plVar47 = _iStack0000000000000108;
        plVar58 = uStack0000000000000100;
        break;
      case 0x19:
        func_0x005dc110(&uStack0000000000000100,lVar43 + 0x20);
        plVar47 = _iStack0000000000000108;
        plVar58 = uStack0000000000000100;
        break;
      case 0x1a:
        func_0x005dc4ec(&uStack0000000000000100,lVar43 + 0x20);
        plVar47 = _iStack0000000000000108;
        plVar58 = uStack0000000000000100;
        break;
      case 0x1b:
        func_0x005d7560(&uStack0000000000000100,lVar43);
        plVar47 = _iStack0000000000000108;
        plVar58 = uStack0000000000000100;
        break;
      case 0x1f:
        func_0x005cf3e8(&uStack0000000000000100,lVar43 + 0x20);
        plVar47 = _iStack0000000000000108;
        plVar58 = uStack0000000000000100;
      }
      _iStack0000000000000108 = plVar47;
      uStack0000000000000100 = plVar58;
      if (_uStack0000000000000110 != (long *)0x0) {
        plVar17 = plVar47 + (long)_uStack0000000000000110;
        plVar34 = plVar47;
code_r0x00540c64:
        plVar26 = plVar34 + 1;
        puVar24 = (undefined8 *)*plVar34;
        plVar34 = (long *)*puVar24;
        lVar43 = *plVar34;
        *plVar34 = lVar43 + 1;
        if (-1 < lVar43) {
          lVar43 = 0;
          plVar64 = (long *)*puVar24;
          uStack0000000000000100._0_4_ = (uint)plVar64;
          uStack0000000000000100._4_4_ = (undefined4)((ulong)plVar64 >> 0x20);
          uVar44 = (long)(plVar64 + 1) * 0x517cc1b727220a95;
          plVar34 = *(long **)(in_stack_000000f8 + 0x1a0);
          uVar40 = *(ulong *)(in_stack_000000f8 + 0x1a8);
          bVar38 = (byte)(uVar44 >> 0x38);
          bVar67 = bVar38 >> 1;
          uVar62 = uVar44 & uVar40;
          uVar65 = *(undefined8 *)((long)plVar34 + uVar62);
          uVar31 = CONCAT17(-((byte)((ulong)uVar65 >> 0x38) == bVar67),
                            CONCAT16(-((byte)((ulong)uVar65 >> 0x30) == bVar67),
                                     CONCAT15(-((byte)((ulong)uVar65 >> 0x28) == bVar67),
                                              CONCAT14(-((byte)((ulong)uVar65 >> 0x20) == bVar67),
                                                       CONCAT13(-((byte)((ulong)uVar65 >> 0x18) ==
                                                                 bVar67),CONCAT12(-((byte)((ulong)
                                                  uVar65 >> 0x10) == bVar67),
                                                  CONCAT11(-((byte)((ulong)uVar65 >> 8) == bVar67),
                                                           -((byte)uVar65 == bVar67)))))))) &
                   0x8080808080808080;
          do {
            if (uVar31 == 0) {
code_r0x00540cf4:
              bVar68 = NEON_umaxv(CONCAT17(-((char)((ulong)uVar65 >> 0x38) == -1),
                                           CONCAT16(-((char)((ulong)uVar65 >> 0x30) == -1),
                                                    CONCAT15(-((char)((ulong)uVar65 >> 0x28) == -1),
                                                             CONCAT14(-((char)((ulong)uVar65 >> 0x20
                                                                              ) == -1),
                                                                      CONCAT13(-((char)((ulong)
                                                  uVar65 >> 0x18) == -1),
                                                  CONCAT12(-((char)((ulong)uVar65 >> 0x10) == -1),
                                                           CONCAT11(-((char)((ulong)uVar65 >> 8) ==
                                                                     -1),-((char)uVar65 == -1)))))))
                                          ),1);
              if ((bVar68 & 1) == 0) goto code_r0x00540d08;
              if (*(long *)(in_stack_000000f8 + 0x1b0) == 0) {
                func_0x007a89dc((long *)(unaff_x25 + 0x1a0),1,in_stack_000000f8 + 0x1c0,1);
                plVar64 = (long *)CONCAT44(uStack0000000000000100._4_4_,(uint)uStack0000000000000100
                                          );
                plVar34 = (long *)(unaff_x25 + 0x1a0);
                if (plVar64 == (long *)0x0) goto code_r0x00540de8;
                plVar34 = *(long **)(in_stack_000000f8 + 0x1a0);
                uVar40 = *(ulong *)(in_stack_000000f8 + 0x1a8);
                uVar44 = uVar40 & uVar44;
                lVar43 = *(long *)((long)plVar34 + uVar44);
                uVar31 = CONCAT17(-(lVar43 < 0),
                                  CONCAT16(-((char)((ulong)lVar43 >> 0x30) < '\0'),
                                           CONCAT15(-((char)((ulong)lVar43 >> 0x28) < '\0'),
                                                    CONCAT14(-((char)((ulong)lVar43 >> 0x20) < '\0')
                                                             ,CONCAT13(-((char)((ulong)lVar43 >>
                                                                               0x18) < '\0'),
                                                                       CONCAT12(-((char)((ulong)
                                                  lVar43 >> 0x10) < '\0'),
                                                  CONCAT11(-((char)((ulong)lVar43 >> 8) < '\0'),
                                                           -((char)lVar43 < '\0'))))))));
              }
              else {
                uVar44 = uVar40 & uVar44;
                lVar43 = *(long *)((long)plVar34 + uVar44);
                uVar31 = CONCAT17(-(lVar43 < 0),
                                  CONCAT16(-((char)((ulong)lVar43 >> 0x30) < '\0'),
                                           CONCAT15(-((char)((ulong)lVar43 >> 0x28) < '\0'),
                                                    CONCAT14(-((char)((ulong)lVar43 >> 0x20) < '\0')
                                                             ,CONCAT13(-((char)((ulong)lVar43 >>
                                                                               0x18) < '\0'),
                                                                       CONCAT12(-((char)((ulong)
                                                  lVar43 >> 0x10) < '\0'),
                                                  CONCAT11(-((char)((ulong)lVar43 >> 8) < '\0'),
                                                           -((char)lVar43 < '\0'))))))));
              }
              if (uVar31 == 0) {
                lVar43 = 8;
                do {
                  uVar44 = uVar44 + lVar43 & uVar40;
                  lVar60 = *(long *)((long)plVar34 + uVar44);
                  uVar31 = CONCAT17(-(lVar60 < 0),
                                    CONCAT16(-((char)((ulong)lVar60 >> 0x30) < '\0'),
                                             CONCAT15(-((char)((ulong)lVar60 >> 0x28) < '\0'),
                                                      CONCAT14(-((char)((ulong)lVar60 >> 0x20) <
                                                                '\0'),CONCAT13(-((char)((ulong)
                                                  lVar60 >> 0x18) < '\0'),
                                                  CONCAT12(-((char)((ulong)lVar60 >> 0x10) < '\0'),
                                                           CONCAT11(-((char)((ulong)lVar60 >> 8) <
                                                                     '\0'),-((char)lVar60 < '\0'))))
                                                  ))));
                  lVar43 = lVar43 + 8;
                } while (uVar31 == 0);
              }
              uVar31 = (uVar31 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar31 & 0x5555555555555555) << 1;
              uVar31 = (uVar31 & 0xcccccccccccccccc) >> 2 | (uVar31 & 0x3333333333333333) << 2;
              uVar31 = (uVar31 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar31 & 0xf0f0f0f0f0f0f0f) << 4;
              uVar31 = (uVar31 & 0xff00ff00ff00ff00) >> 8 | (uVar31 & 0xff00ff00ff00ff) << 8;
              uVar31 = (uVar31 & 0xffff0000ffff0000) >> 0x10 | (uVar31 & 0xffff0000ffff) << 0x10;
              uVar62 = uVar44 + ((ulong)LZCOUNT(uVar31 >> 0x20 | uVar31 << 0x20) >> 3) & uVar40;
              uVar31 = (ulong)*(char *)((long)plVar34 + uVar62);
              if (-1 < *(char *)((long)plVar34 + uVar62)) {
                lVar43 = *plVar34;
                uVar31 = CONCAT17(-(lVar43 < 0),
                                  CONCAT16(-((char)((ulong)lVar43 >> 0x30) < '\0'),
                                           CONCAT15(-((char)((ulong)lVar43 >> 0x28) < '\0'),
                                                    CONCAT14(-((char)((ulong)lVar43 >> 0x20) < '\0')
                                                             ,CONCAT13(-((char)((ulong)lVar43 >>
                                                                               0x18) < '\0'),
                                                                       CONCAT12(-((char)((ulong)
                                                  lVar43 >> 0x10) < '\0'),
                                                  CONCAT11(-((char)((ulong)lVar43 >> 8) < '\0'),
                                                           -((char)lVar43 < '\0'))))))));
                uVar31 = (uVar31 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar31 & 0x5555555555555555) << 1;
                uVar31 = (uVar31 & 0xcccccccccccccccc) >> 2 | (uVar31 & 0x3333333333333333) << 2;
                uVar31 = (uVar31 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar31 & 0xf0f0f0f0f0f0f0f) << 4;
                uVar31 = (uVar31 & 0xff00ff00ff00ff00) >> 8 | (uVar31 & 0xff00ff00ff00ff) << 8;
                uVar31 = (uVar31 & 0xffff0000ffff0000) >> 0x10 | (uVar31 & 0xffff0000ffff) << 0x10;
                uVar62 = (ulong)LZCOUNT(uVar31 >> 0x20 | uVar31 << 0x20) >> 3;
                uVar31 = (ulong)*(byte *)((long)plVar34 + uVar62);
              }
              *(byte *)((long)plVar34 + uVar62) = bVar38 >> 1;
              *(byte *)((long)plVar34 + (uVar62 - 8 & uVar40) + 8) = bVar38 >> 1;
              plVar34 = plVar34 + uVar62 * -5;
              *(ulong *)(in_stack_000000f8 + 0x1b0) =
                   *(long *)(in_stack_000000f8 + 0x1b0) - (uVar31 & 1);
              plVar34[-5] = (long)plVar64;
              lVar43 = _UNK_009ec480;
              plVar52 = _UNK_009ec478;
              plVar64 = _UNK_009ec468;
              plVar34[-3] = (long)_UNK_009ec470;
              plVar34[-4] = (long)plVar64;
              plVar34[-1] = lVar43;
              plVar34[-2] = (long)plVar52;
              *(long *)(in_stack_000000f8 + 0x1b8) = *(long *)(in_stack_000000f8 + 0x1b8) + 1;
              goto code_r0x00540de8;
            }
code_r0x00540cc4:
            uVar42 = (uVar31 >> 7 & 0xff00ff00ff00ff00) >> 8 | (uVar31 >> 7 & 0xff00ff00ff00ff) << 8
            ;
            uVar42 = (uVar42 & 0xffff0000ffff0000) >> 0x10 | (uVar42 & 0xffff0000ffff) << 0x10;
            uVar42 = uVar62 + ((ulong)LZCOUNT(uVar42 >> 0x20 | uVar42 << 0x20) >> 3) & uVar40;
            if ((long *)plVar34[uVar42 * -5 + -5] == plVar64) goto code_r0x00540d2c;
            uVar31 = uVar31 - 1 & uVar31;
          } while( true );
        }
        func_0x007a05dc();
        goto code_r0x0054319c;
      }
code_r0x00540e94:
      if (plVar58 != (long *)0x0) {
        func_0x00187bd4(plVar47,(long)plVar58 << 3,8);
      }
code_r0x00540980:
      lVar43 = lVar55;
    } while (lVar55 != lVar50 + lVar48 * 0x108);
  }
  lVar22 = lVar22 + 1;
  lVar48 = in_stack_000000f8;
  goto code_r0x0054033c;
code_r0x00540d08:
  lVar43 = lVar43 + 8;
  uVar62 = uVar62 + lVar43 & uVar40;
  uVar65 = *(undefined8 *)((long)plVar34 + uVar62);
  uVar31 = CONCAT17(-((byte)((ulong)uVar65 >> 0x38) == bVar67),
                    CONCAT16(-((byte)((ulong)uVar65 >> 0x30) == bVar67),
                             CONCAT15(-((byte)((ulong)uVar65 >> 0x28) == bVar67),
                                      CONCAT14(-((byte)((ulong)uVar65 >> 0x20) == bVar67),
                                               CONCAT13(-((byte)((ulong)uVar65 >> 0x18) == bVar67),
                                                        CONCAT12(-((byte)((ulong)uVar65 >> 0x10) ==
                                                                  bVar67),CONCAT11(-((byte)((ulong)
                                                  uVar65 >> 8) == bVar67),-((byte)uVar65 == bVar67))
                                                  )))))) & 0x8080808080808080;
  if (uVar31 != 0) goto code_r0x00540cc4;
  goto code_r0x00540cf4;
code_r0x00540d2c:
  lVar43 = *plVar64;
  *plVar64 = lVar43 + -1;
  LORelease();
  if (lVar43 == 1) {
    func_0x005d2ac4(&uStack0000000000000100);
  }
  plVar34 = plVar34 + uVar42 * -5;
code_r0x00540de8:
  iStack0000000000000108 = 1;
  uStack000000000000010c = 0;
  uStack0000000000000100._0_4_ = uVar8;
  uStack0000000000000100._4_4_ = uVar10;
  uStack0000000000000110 = uVar12;
  uStack0000000000000114 = uVar13;
  func_0x00562f08(unaff_x29 + -0x80,plVar34 + -4,uVar30,&uStack0000000000000100);
  plVar34 = plVar26;
  if (plVar26 == plVar17) goto code_r0x00540e94;
  goto code_r0x00540c64;
code_r0x00542e20:
  func_0x007a23bc(puStack0000000000000060);
  goto code_r0x0054319c;
code_r0x00542dec:
  func_0x007a05dc();
  goto code_r0x0054319c;
LAB_0053fe98:
  if (uVar31 != 0) {
    uVar30 = uVar31 * 4 + 0xb & 0xfffffffffffffff8;
    lVar22 = uVar31 + uVar30 + 9;
    if (lVar22 != 0) {
      func_0x00187bd4((long)puVar36 - uVar30,lVar22,8);
    }
  }
  func_0x0053a3f4(auStack_7ffffffe + 0x8000024e);
  if (in_stack_00000098 != unaff_x20) {
    puVar18 = in_stack_00000098 + 1;
    in_stack_000002b8 = *in_stack_00000098;
    uVar30 = (ulong)in_stack_000002b8;
    lVar22 = *(long *)(unaff_x25 + 0xd8);
    if ((uVar30 < *(ulong *)(lVar22 + 0x28)) &&
       (puVar24 = (undefined8 *)(*(long *)(lVar22 + 0x20) + uVar30 * 0x20),
       (uint *)*puVar24 != unaff_x21)) {
      uVar31 = (ulong)*(uint *)((long)puVar24 + 0x1c) << 0x20 | 0xffffffff;
    }
    else {
      uVar31 = 0xffffffffffffffff;
    }
    lVar23 = *(long *)(lVar22 + 0x38);
    uVar40 = *(ulong *)(lVar22 + 0x40);
    do {
      uVar62 = uVar31 & 0xffffffff;
      in_stack_00000098 = puVar18;
      in_stack_00000250 = in_stack_00000050;
      in_stack_00000258 = in_stack_00000058;
      in_stack_00000260 = (long)in_stack_00000040;
      in_stack_00000268 = in_stack_00000048;
      if (uVar40 <= uVar62) {
        uVar31 = uVar31 >> 0x20;
        do {
          uVar44 = uVar31;
          if (uVar40 <= uVar44) goto code_r0x0053f458;
          lVar15 = lVar23 + uVar44 * unaff_x24;
          uVar31 = (ulong)*(uint *)(lVar15 + 0x24);
        } while (*(int *)(lVar15 + 0x28) == -1);
        uVar31 = uVar62 | uVar31 << 0x20;
        if (uVar44 < uVar40) goto code_r0x0053f1b4;
code_r0x00542e04:
        func_0x007a23bc(&UNK_009f08a0);
        goto code_r0x0054319c;
      }
      uVar44 = uVar31 & 0xffffffff;
      uVar31 = uVar31 & 0xffffffff00000000 |
               (ulong)*(uint *)(lVar23 + uVar62 * (unaff_x24 & 0xffffffff) + 0x20);
      if (uVar40 <= uVar44) goto code_r0x00542e04;
code_r0x0053f1b4:
      puVar24 = (undefined8 *)(lVar23 + uVar44 * unaff_x24);
      if ((uint *)*puVar24 == unaff_x21) goto code_r0x00542e04;
    } while (*(uint *)((long)puVar24 + 0x2c) != uVar30);
    if (puVar24[2] == 0) goto code_r0x0053f458;
    puVar57 = (undefined8 *)puVar24[1];
    lVar22 = puVar24[2] * 0x48;
    do {
      in_stack_00000210 = (dword *)func_0x00187bd0(0x28,8);
      if (in_stack_00000210 == (dword *)0x0) {
        func_0x007a1f18(8,0x28);
        goto code_r0x0054319c;
      }
      *(undefined8 *)(in_stack_00000210 + 2) = in_stack_000000b8;
      *(long **)in_stack_00000210 = in_stack_000000b0;
      *(uint **)(in_stack_00000210 + 4) = unaff_x21;
      puVar24 = (undefined8 *)func_0x00578610(unaff_x25,puVar57);
      if (puVar24 != (undefined8 *)0x0) {
        lVar23 = *(long *)in_stack_00000210;
        *(long *)in_stack_00000210 = lVar23 + unaff_x27;
        if (lVar23 < 0) {
code_r0x00541b60:
          func_0x007a05dc();
        }
        else {
          uStack0000000000000100._0_4_ = (uint)in_stack_00000210;
          uStack0000000000000100._4_4_ = (undefined4)((ulong)in_stack_00000210 >> 0x20);
          lVar23 = *(long *)*puVar24;
          *(long *)*puVar24 = lVar23 + unaff_x27;
          if (-1 < lVar23) {
            uVar54 = *puVar24;
            uVar65 = func_0x005787f4(*(undefined8 *)(unaff_x25 + 0x38),
                                     *(undefined8 *)(unaff_x25 + 0x40),in_stack_00000210);
            func_0x00589494(unaff_x25,uVar65,in_stack_00000210,uVar54);
            unaff_x27 = 1;
            in_stack_00000270 = extraout_x1;
            if (extraout_x1 != (dword *)0x0) {
              lVar23 = *(long *)extraout_x1;
              *(long *)extraout_x1 = lVar23 + -1;
              LORelease();
              if (lVar23 == 1) {
                func_0x005d2ac4(auStack_7ffffffe + 0x8000026e);
              }
            }
            goto code_r0x0053f29c;
          }
          func_0x007a05dc();
        }
        goto code_r0x0054319c;
      }
code_r0x0053f29c:
      lVar23 = *(long *)*puVar57;
      *(long *)*puVar57 = lVar23 + unaff_x27;
      if (lVar23 < 0) goto code_r0x00541b60;
      plVar47 = (long *)func_0x0056237c(auStack_7ffffffe + 0x8000024e,*puVar57,in_stack_00000210);
      uStack0000000000000100._0_4_ = (uint)plVar47;
      uStack0000000000000100._4_4_ = (undefined4)((ulong)plVar47 >> 0x20);
      if (plVar47 != (long *)0x0) {
        lVar23 = *plVar47;
        *plVar47 = lVar23 + -1;
        LORelease();
        if (lVar23 == 1) {
          func_0x005d2ac4(&uStack0000000000000100);
        }
      }
      puVar57 = puVar57 + 9;
      lVar22 = lVar22 + -0x48;
    } while (lVar22 != 0);
    lVar22 = *(long *)(unaff_x25 + 0xd8);
    uVar30 = (ulong)in_stack_000002b8;
    if (in_stack_00000048 != 0) goto code_r0x0053f2f4;
    goto code_r0x0053f44c;
  }
  if (in_stack_000000a0 != 0) {
    func_0x00187bd4(unaff_x28,in_stack_000000a0 << 2,4);
  }
  puVar49 = (ulong *)(*(long *)(*(long *)(unaff_x25 + 0xd8) + 0x38) + 0x10);
  plVar47 = (long *)(auStack_7ffffffe + 0x8000026e);
  for (lVar22 = *(long *)(*(long *)(unaff_x25 + 0xd8) + 0x40) * 0x30; lVar22 != 0;
      lVar22 = lVar22 + -0x30) {
    if (puVar49[-2] != 0x8000000000000000) {
      uVar30 = *puVar49;
      uStack0000000000000100 = plVar47;
      if (1 < uVar30) {
        if (uVar30 < 0x15) {
          func_0x00576528(puVar49[-1],uVar30,1,&uStack0000000000000100);
        }
        else {
          func_0x00576bac(puVar49[-1],uVar30,&uStack0000000000000100);
        }
      }
    }
    puVar49 = puVar49 + 6;
  }
  func_0x0058d7e0(&uStack0000000000000100,*(undefined8 *)(unaff_x25 + 0xd8));
  lVar22 = *(long *)(unaff_x25 + 0x1e8);
  if (lVar22 != 0) {
    lVar23 = *(long *)(unaff_x25 + 0x1f8);
    if (lVar23 != 0) {
      plVar47 = *(long **)(unaff_x25 + 0x1e0);
      plVar58 = plVar47 + 1;
      lVar15 = *plVar47;
      uVar30 = CONCAT17(-(-1 < lVar15),
                        CONCAT16(-(-1 < (char)((ulong)lVar15 >> 0x30)),
                                 CONCAT15(-(-1 < (char)((ulong)lVar15 >> 0x28)),
                                          CONCAT14(-(-1 < (char)((ulong)lVar15 >> 0x20)),
                                                   CONCAT13(-(-1 < (char)((ulong)lVar15 >> 0x18)),
                                                            CONCAT12(-(-1 < (char)((ulong)lVar15 >>
                                                                                  0x10)),
                                                                     CONCAT11(-(-1 < (char)((ulong)
                                                  lVar15 >> 8)),-(-1 < (char)lVar15)))))))) &
               0x8080808080808080;
      do {
        while (uVar30 == 0) {
          lVar15 = *plVar58;
          plVar47 = plVar47 + -0x48;
          plVar58 = plVar58 + 1;
          uVar30 = CONCAT17(-(-1 < lVar15),
                            CONCAT16(-(-1 < (char)((ulong)lVar15 >> 0x30)),
                                     CONCAT15(-(-1 < (char)((ulong)lVar15 >> 0x28)),
                                              CONCAT14(-(-1 < (char)((ulong)lVar15 >> 0x20)),
                                                       CONCAT13(-(-1 < (char)((ulong)lVar15 >> 0x18)
                                                                 ),CONCAT12(-(-1 < (char)((ulong)
                                                  lVar15 >> 0x10)),
                                                  CONCAT11(-(-1 < (char)((ulong)lVar15 >> 8)),
                                                           -(-1 < (char)lVar15)))))))) &
                   0x8080808080808080;
        }
        uVar31 = (uVar30 >> 7 & 0xff00ff00ff00ff00) >> 8 | (uVar30 >> 7 & 0xff00ff00ff00ff) << 8;
        uVar31 = (uVar31 & 0xffff0000ffff0000) >> 0x10 | (uVar31 & 0xffff0000ffff) << 0x10;
        func_0x00539e0c(plVar47 + (long)-(int)((ulong)LZCOUNT(uVar31 >> 0x20 | uVar31 << 0x20) >> 3)
                                  * 9 + -8);
        uVar30 = uVar30 - 1 & uVar30;
        lVar23 = lVar23 + -1;
      } while (lVar23 != 0);
    }
    lVar23 = lVar22 * 0x49 + 0x51;
    if (lVar23 != 0) {
      func_0x00187bd4(*(long *)(unaff_x25 + 0x1e0) + lVar22 * -0x48 + -0x48,lVar23,8);
    }
  }
  *(long **)(unaff_x25 + 0x1e8) = _iStack0000000000000108;
  *(long **)(unaff_x25 + 0x1e0) = uStack0000000000000100;
  *(long **)(unaff_x25 + 0x1f8) = uStack0000000000000118;
  *(long **)(unaff_x25 + 0x1f0) = _uStack0000000000000110;
  lVar22 = *(long *)(unaff_x25 + 0xd8);
  if (*(int *)(lVar22 + 0x78) == 1) {
    func_0x0058b00c(auStack_7ffffffe + 0x8000020e,lVar22 + 0x18,*(undefined4 *)(lVar22 + 0x7c));
    plVar47 = *(long **)(*(long *)(unaff_x25 + 0xd8) + 0x20);
    lVar22 = *(long *)(*(long *)(unaff_x25 + 0xd8) + 0x28);
    plVar17 = plVar47;
    uVar2 = 0;
    plVar58 = uStack0000000000000100;
code_r0x005400d8:
    uVar59 = uVar2;
    uStack0000000000000100._4_4_ = (undefined4)((ulong)plVar58 >> 0x20);
    if (plVar17 != plVar47 + lVar22 * 4) {
      plVar34 = plVar17 + 4;
      lVar23 = *plVar17;
      uVar2 = uVar59 + 1;
      plVar17 = plVar34;
      if (lVar23 != -0x8000000000000000) {
        plVar58 = (long *)CONCAT44(uStack0000000000000100._4_4_,uVar59);
        if (in_stack_00000240 != uVar59 && in_stack_00000228 != 0) {
          uStack0000000000000100._0_4_ = uVar59;
          uVar30 = func_0x005763e4(auStack_7ffffffe + 0x8000022e,&uStack0000000000000100);
          plVar58 = (long *)CONCAT44(uStack0000000000000100._4_4_,(uint)uStack0000000000000100);
          lVar23 = 0;
          bVar38 = (byte)(uVar30 >> 0x39);
          while( true ) {
            uVar30 = uVar30 & (ulong)in_stack_00000218;
            uVar65 = *(undefined8 *)((long)in_stack_00000210 + uVar30);
            bVar67 = (byte)((ulong)uVar65 >> 8);
            bVar68 = (byte)((ulong)uVar65 >> 0x10);
            bVar69 = (byte)((ulong)uVar65 >> 0x18);
            bVar70 = (byte)((ulong)uVar65 >> 0x20);
            bVar71 = (byte)((ulong)uVar65 >> 0x28);
            bVar72 = (byte)((ulong)uVar65 >> 0x30);
            bVar73 = (byte)((ulong)uVar65 >> 0x38);
            for (uVar31 = CONCAT17(-(bVar73 == bVar38),
                                   CONCAT16(-(bVar72 == bVar38),
                                            CONCAT15(-(bVar71 == bVar38),
                                                     CONCAT14(-(bVar70 == bVar38),
                                                              CONCAT13(-(bVar69 == bVar38),
                                                                       CONCAT12(-(bVar68 == bVar38),
                                                                                CONCAT11(-(bVar67 ==
                                                                                          bVar38),-(
                                                  (byte)uVar65 == bVar38)))))))) &
                          0x8080808080808080; uVar31 != 0; uVar31 = uVar31 - 1 & uVar31) {
              uVar40 = (uVar31 >> 7 & 0xff00ff00ff00ff00) >> 8 |
                       (uVar31 >> 7 & 0xff00ff00ff00ff) << 8;
              uVar40 = (uVar40 & 0xffff0000ffff0000) >> 0x10 | (uVar40 & 0xffff0000ffff) << 0x10;
              uVar40 = uVar30 + ((ulong)LZCOUNT(uVar40 >> 0x20 | uVar40 << 0x20) >> 3) &
                       (ulong)in_stack_00000218;
              if (in_stack_00000210[uVar40 * -2 + -2] == uVar59) {
                func_0x0058cb44(unaff_x25 + 0x48,in_stack_00000210[uVar40 * -2 + -1],uVar59);
                plVar58 = (long *)CONCAT44(uStack0000000000000100._4_4_,(uint)uStack0000000000000100
                                          );
                goto code_r0x005400d8;
              }
            }
            bVar67 = NEON_umaxv(CONCAT17(-(bVar73 == 0xff),
                                         CONCAT16(-(bVar72 == 0xff),
                                                  CONCAT15(-(bVar71 == 0xff),
                                                           CONCAT14(-(bVar70 == 0xff),
                                                                    CONCAT13(-(bVar69 == 0xff),
                                                                             CONCAT12(-(bVar68 ==
                                                                                       0xff),
                                                  CONCAT11(-(bVar67 == 0xff),-((byte)uVar65 == 0xff)
                                                          ))))))),1);
            if ((bVar67 & 1) != 0) break;
            lVar23 = lVar23 + 8;
            uVar30 = uVar30 + lVar23;
          }
        }
      }
      goto code_r0x005400d8;
    }
    if (*(ulong *)(unaff_x25 + 0x1d0) < *(ulong *)(unaff_x25 + 0x78)) {
      uStack0000000000000100 = plVar58;
      func_0x007ab0a0(unaff_x25 + 0x1c0,*(ulong *)(unaff_x25 + 0x78),unaff_x25 + 0x1e0,1);
      plVar58 = uStack0000000000000100;
    }
    uVar7 = _UNK_009ee250;
    uVar66 = _UNK_009ee248;
    uVar54 = _UNK_009ee240;
    uVar65 = _UNK_009ee238;
    uStack0000000000000100._4_4_ = (undefined4)((ulong)plVar58 >> 0x20);
    if (*(long *)(unaff_x25 + 0x58) != 0) {
      lVar22 = *(long *)(unaff_x25 + 0x50);
      lVar23 = lVar22 + *(long *)(unaff_x25 + 0x58) * 0x28;
code_r0x00540178:
      dVar3 = *(dword *)(lVar22 + 0x20);
      lVar22 = lVar22 + 0x28;
      *(undefined8 *)(unaff_x29 + -0x78) = uVar54;
      *(undefined8 *)(unaff_x29 + -0x80) = uVar65;
      *(undefined8 *)(unaff_x29 + -0x68) = uVar7;
      *(undefined8 *)(unaff_x29 + -0x70) = uVar66;
      dVar53 = dVar3;
      do {
        uStack0000000000000100._0_4_ = dVar53;
        if (*(long *)(unaff_x25 + 0x78) == 0) {
code_r0x005401d8:
          pdVar63 = &MACH_HEADER.cputype;
          pdVar35 = &MACH_HEADER.cputype;
        }
        else {
          uVar19 = func_0x0057890c(*(undefined8 *)(unaff_x25 + 0x80),
                                   *(undefined8 *)(unaff_x25 + 0x88),dVar53);
          auVar74 = func_0x00589d94(unaff_x25 + 0x48,uVar19,&uStack0000000000000100);
          uVar30 = auVar74._8_8_;
          if ((auVar74._0_8_ & 1) == 0) goto code_r0x005401d8;
          if (*(ulong *)(unaff_x25 + 0x58) <= uVar30) {
            func_0x007a2570(uVar30,*(ulong *)(unaff_x25 + 0x58),&UNK_009f0070);
            goto code_r0x0054319c;
          }
          lVar15 = *(long *)(unaff_x25 + 0x50) + uVar30 * 0x28;
          pdVar35 = *(dword **)(lVar15 + 8);
          pdVar63 = pdVar35 + *(long *)(lVar15 + 0x10) * 2;
        }
        do {
          if (pdVar35 == pdVar63) goto code_r0x0054023c;
          pdVar32 = pdVar35 + 2;
          dVar4 = *pdVar35;
          pdVar20 = pdVar35 + 1;
          pdVar35 = pdVar32;
        } while (dVar4 != dVar53 && (char)*pdVar20 == '\0');
        while (pdVar32 != pdVar63) {
          dVar5 = *pdVar32;
          pdVar35 = pdVar32 + 1;
          pdVar32 = pdVar32 + 2;
          if (dVar5 == dVar53 || (char)*pdVar35 != '\0') goto code_r0x0054023c;
        }
        func_0x004d1c68(unaff_x29 + -0x80,dVar4);
        dVar53 = dVar4;
      } while( true );
    }
code_r0x00540290:
    uStack0000000000000100 = plVar58;
    if (*(int *)(*(long *)(unaff_x25 + 0xd8) + 0x78) != 1) {
      func_0x007a23bc(&UNK_009ec758);
      goto code_r0x0054319c;
    }
    func_0x0058bce0(auStack_7ffffffe + 0x8000026e,unaff_x25 + 0x48,
                    *(undefined4 *)(*(long *)(unaff_x25 + 0xd8) + 0x7c));
    lVar15 = _UNK_007fc2d8;
    lVar23 = _UNK_007fc2d0;
    lVar22 = 0;
    in_stack_00000010 = 0x26;
    in_stack_00000018 = (dword *)&UNK_009ec770;
    puStack0000000000000000 = &UNK_008aae23;
    in_stack_00000008 = &UNK_009ec7b8;
    lVar48 = unaff_x25;
code_r0x0054033c:
    auVar74 = func_0x0058be04(auStack_7ffffffe + 0x8000026e,*(long *)(lVar48 + 0xd8) + 0x18);
    uVar30 = auVar74._8_8_;
    if ((auVar74._0_8_ & 1) != 0) {
      lVar48 = *(long *)(in_stack_000000f8 + 0xd8);
      if ((*(uint *)(lVar48 + 0x78) & 1) == 0) goto code_r0x00542e54;
      iVar21 = auVar74._8_4_;
      if (iVar21 != *(int *)(lVar48 + 0x7c)) {
        uVar31 = *(ulong *)(lVar48 + 0x28);
        if ((uVar30 & 0xffffffff) < uVar31) goto code_r0x00540720;
        goto code_r0x00540738;
      }
      if (lVar22 == 0) {
        if (((uVar30 & 0xffffffff) < *(ulong *)(lVar48 + 0x28)) &&
           (plVar47 = (long *)(*(long *)(lVar48 + 0x20) + (uVar30 & 0xffffffff) * 0x20),
           *plVar47 != -0x8000000000000000)) {
          uVar31 = (ulong)*(uint *)((long)plVar47 + 0x1c) << 0x20 | 0xffffffff;
        }
        else {
          uVar31 = 0xffffffffffffffff;
        }
        lVar45 = *(long *)(lVar48 + 0x38);
        uVar40 = *(ulong *)(lVar48 + 0x40);
        while (uVar62 = uVar31 & 0xffffffff, uVar62 < uVar40) {
          uVar44 = uVar31 & 0xffffffff;
          uVar31 = uVar31 & 0xffffffff00000000 | (ulong)*(uint *)(lVar45 + uVar62 * 0x30 + 0x20);
          if (uVar40 <= uVar44) goto code_r0x00542e2c;
code_r0x0054042c:
          plVar47 = (long *)(lVar45 + uVar44 * 0x30);
          if (*plVar47 == -0x8000000000000000) goto code_r0x00542e2c;
          if ((*(int *)((long)plVar47 + 0x2c) == iVar21) && (plVar47[2] != 0)) {
            in_stack_00000010 = 0x5b;
            puStack0000000000000000 = &UNK_008aadc8;
            in_stack_00000008 = &UNK_009ec7a0;
            goto code_r0x00542f64;
          }
        }
        uVar31 = uVar31 >> 0x20;
        do {
          uVar44 = uVar31;
          if (uVar40 <= uVar44) {
            uVar40 = 0;
            plVar58 = *(long **)(in_stack_000000f8 + 0xe0);
            in_stack_00000178 = (long)plVar58 + *(long *)(in_stack_000000f8 + 0xe8) + 1;
            lVar45 = *plVar58;
            plVar47 = plVar58 + 1;
            uVar31 = CONCAT17(-(-1 < lVar45),
                              CONCAT16(-(-1 < (char)((ulong)lVar45 >> 0x30)),
                                       CONCAT15(-(-1 < (char)((ulong)lVar45 >> 0x28)),
                                                CONCAT14(-(-1 < (char)((ulong)lVar45 >> 0x20)),
                                                         CONCAT13(-(-1 < (char)((ulong)lVar45 >>
                                                                               0x18)),
                                                                  CONCAT12(-(-1 < (char)((ulong)
                                                  lVar45 >> 0x10)),
                                                  CONCAT11(-(-1 < (char)((ulong)lVar45 >> 8)),
                                                           -(-1 < (char)lVar45)))))))) &
                     0x8080808080808080;
            uStack00000000000000d0 = *(long *)(in_stack_000000f8 + 0xf8);
            puVar57 = *(undefined8 **)(in_stack_000000f8 + 8);
            puVar41 = puVar57 + *(long *)(in_stack_000000f8 + 0x10) * 3;
            puVar39 = *(undefined8 **)(lVar48 + 8);
            puVar24 = puVar39 + *(long *)(lVar48 + 0x10);
            uStack0000000000000100._0_4_ = 0;
            uStack0000000000000100._4_4_ = 0;
            uStack0000000000000128 = (dword *)0x0;
            in_stack_00000198 = 0;
            in_stack_000000b0 = _uStack0000000000000110;
            in_stack_000000c0 = _iStack0000000000000108;
            lVar48 = 0;
            in_stack_00000150 = puVar57;
            in_stack_00000158 = puVar41;
            in_stack_00000160 = plVar58;
            in_stack_00000168 = uVar31;
            in_stack_00000170 = plVar47;
            in_stack_00000180 = uStack00000000000000d0;
            in_stack_00000188 = puVar39;
            in_stack_00000190 = puVar24;
            goto code_r0x00540544;
          }
          lVar43 = lVar45 + uVar44 * 0x30;
          uVar31 = (ulong)*(uint *)(lVar43 + 0x24);
        } while (*(int *)(lVar43 + 0x28) == -1);
        uVar31 = uVar62 | uVar31 << 0x20;
        if (uVar44 < uVar40) goto code_r0x0054042c;
code_r0x00542e2c:
        in_stack_00000018 = (dword *)&UNK_009ec488;
        goto code_r0x00542e54;
      }
code_r0x00542f64:
      func_0x007a247c(puStack0000000000000000,in_stack_00000010,in_stack_00000008);
      goto code_r0x0054319c;
    }
    if (in_stack_00000270 != (dword *)0x0) {
      func_0x00187bd4(in_stack_00000278,(long)in_stack_00000270 << 2,4);
    }
    if (in_stack_00000290 != (dword *)0x0) {
      uVar30 = (long)in_stack_00000290 * 4 + 0xbU & 0xfffffffffffffff8;
      lVar22 = (long)in_stack_00000290 + uVar30 + 9;
      if (lVar22 != 0) {
        func_0x00187bd4((long)in_stack_00000288 - uVar30,lVar22,8);
      }
    }
    if ((in_stack_00000218 != (undefined8 *)0x0) &&
       (lVar22 = (long)in_stack_00000218 * 9 + 0x11, lVar22 != 0)) {
      func_0x00187bd4(in_stack_00000210 + (long)in_stack_00000218 * -2 + -2,lVar22,8);
    }
    if ((*(uint *)(*(long *)(in_stack_000000f8 + 0xd8) + 0x78) & 1) == 0) {
      puVar36 = &UNK_009ecd38;
    }
    else {
      func_0x0058bfd4(&uStack0000000000000100,in_stack_000000f8 + 0x48,
                      *(undefined4 *)(*(long *)(in_stack_000000f8 + 0xd8) + 0x7c));
      in_stack_000000b0 = (long *)&UNK_009ecd50;
      while( true ) {
        auVar74 = func_0x0058c4fc(&uStack0000000000000100,*(long *)(in_stack_000000f8 + 0xd8) + 0x18
                                 );
        if ((auVar74._0_8_ & 1) == 0) break;
        lVar22 = *(long *)(in_stack_000000f8 + 0xd8);
        uVar30 = auVar74._8_8_ & 0xffffffff;
        if (uVar30 < *(ulong *)(lVar22 + 0x28)) {
          plVar47 = (long *)(*(long *)(lVar22 + 0x20) + uVar30 * 0x20);
          if (*plVar47 == -0x8000000000000000) {
            uVar31 = 0xffffffffffffffff;
          }
          else {
            uVar31 = (ulong)*(uint *)((long)plVar47 + 0x1c) << 0x20 | 0xffffffff;
          }
        }
        else {
          uVar31 = 0xffffffffffffffff;
        }
        lVar23 = *(long *)(lVar22 + 0x38);
        uVar40 = *(ulong *)(lVar22 + 0x40);
        do {
          uVar62 = uVar31 & 0xffffffff;
          if (uVar40 <= uVar62) {
            uVar31 = uVar31 >> 0x20;
            do {
              uVar44 = uVar31;
              if (uVar40 <= uVar44) {
                in_stack_00000250 = (dword *)0x0;
                in_stack_00000258 = &MACH_HEADER.cpusubtype;
                in_stack_00000260 = 0;
                goto code_r0x005410a0;
              }
              lVar22 = lVar23 + uVar44 * 0x30;
              uVar31 = (ulong)*(uint *)(lVar22 + 0x24);
            } while (*(int *)(lVar22 + 0x28) == -1);
            uVar31 = uVar62 | uVar31 << 0x20;
            if (uVar44 < uVar40) goto code_r0x0054103c;
code_r0x00542fb0:
            func_0x007a23bc(&UNK_009f08a0);
            goto code_r0x0054319c;
          }
          uVar44 = uVar31 & 0xffffffff;
          uVar31 = uVar31 & 0xffffffff00000000 | (ulong)*(uint *)(lVar23 + uVar62 * 0x30 + 0x20);
          if (uVar40 <= uVar44) goto code_r0x00542fb0;
code_r0x0054103c:
          plVar47 = (long *)(lVar23 + uVar44 * 0x30);
          if (*plVar47 == -0x8000000000000000) goto code_r0x00542fb0;
        } while (*(int *)((long)plVar47 + 0x2c) != auVar74._8_4_);
        func_0x0055ae6c(auStack_7ffffffe + 0x8000024e,plVar47[1],plVar47[1] + plVar47[2] * 0x48,
                        &UNK_009ec388);
code_r0x005410a0:
        in_stack_00000278 = in_stack_00000258;
        for (lVar22 = in_stack_00000260 * 8; lVar22 != 0; lVar22 = lVar22 + -8) {
          func_0x00547df0(in_stack_000000f8,*(undefined8 *)in_stack_00000278);
          in_stack_00000278 = in_stack_00000278 + 2;
        }
        func_0x005928cc(auStack_7ffffffe + 0x8000026e);
        if ((*(ulong *)(*(long *)(in_stack_000000f8 + 0xd8) + 0x28) <= uVar30) ||
           (plVar47 = (long *)(*(long *)(*(long *)(in_stack_000000f8 + 0xd8) + 0x20) + uVar30 * 0x20
                              ), *plVar47 == -0x8000000000000000)) {
code_r0x00542f20:
          func_0x007a23bc(in_stack_000000b0);
          goto code_r0x0054319c;
        }
        uVar31 = plVar47[2];
        in_stack_00000270 = in_stack_00000258;
        in_stack_00000280 = in_stack_00000250;
        if (uVar31 != 0) {
          uVar40 = 0;
          uVar62 = 1;
          puVar24 = in_stack_00000218;
          while( true ) {
            if ((*(ulong *)(*(long *)(in_stack_000000f8 + 0xd8) + 0x28) <= uVar30) ||
               (plVar47 = (long *)(*(long *)(*(long *)(in_stack_000000f8 + 0xd8) + 0x20) +
                                  uVar30 * 0x20), *plVar47 == -0x8000000000000000)) {
              in_stack_000000b0 = (long *)&UNK_009ecd68;
              goto code_r0x00542f20;
            }
            if ((ulong)plVar47[2] <= uVar40) {
              func_0x007a2570(uVar40,plVar47[2],&UNK_009ecd80);
              goto code_r0x0054319c;
            }
            lVar22 = plVar47[1] + uVar40 * 0x108;
            in_stack_00000218 = puVar24;
            if (*(long *)(lVar22 + 0x18) == 0xf) {
              in_stack_00000270 = *(dword **)(lVar22 + 0x28);
              in_stack_00000278 = in_stack_00000270 + *(long *)(lVar22 + 0x30) * 6;
              in_stack_00000280 = (dword *)0x0;
              func_0x0055a048(auStack_7ffffffe + 0x8000020e,auStack_7ffffffe + 0x8000026e,
                              &UNK_009ec388);
              *(undefined8 **)(unaff_x29 + -0x80) = puVar24;
              *(undefined8 **)(unaff_x29 + -0x78) = puVar24;
              *(dword **)(unaff_x29 + -0x70) = in_stack_00000210;
              *(undefined8 **)(unaff_x29 + -0x68) = puVar24 + (long)in_stack_00000220 * 2;
              if (in_stack_00000220 != (dword *)0x0) {
                do {
                  *(undefined8 **)(unaff_x29 + -0x78) = puVar24 + 2;
                  plVar47 = (long *)*puVar24;
                  plVar58 = (long *)puVar24[1];
                  if (plVar58 != (long *)0x0) {
                    *(long **)(unaff_x29 + -0xf0) = plVar58;
                    lVar22 = *plVar58;
                    *plVar58 = lVar22 + 1;
                    if (lVar22 < 0) {
                      func_0x007a05dc();
                      goto code_r0x0054319c;
                    }
                    plVar58 = (long *)func_0x00547df0(in_stack_000000f8,
                                                      *(undefined8 *)(unaff_x29 + -0xf0));
                    uVar40 = *(ulong *)*plVar58;
                    *(ulong *)*plVar58 = uVar40 + 1;
                    if (0xfffffffffffffffe < uVar40) goto code_r0x0054319c;
                    lVar22 = *plVar58;
                    *(long *)(unaff_x29 + -0xd8) = lVar22;
                    if (*(long *)(lVar22 + 0x10) != 0) {
                      func_0x007a2334(&UNK_009ecdc8);
                      goto code_r0x0054319c;
                    }
                    *(undefined8 *)(lVar22 + 0x10) = 0xffffffffffffffff;
                    lVar23 = *plVar47;
                    *plVar47 = lVar23 + 1;
                    if (lVar23 < 0) {
                      func_0x007a05dc();
                      goto code_r0x0054319c;
                    }
                    func_0x00563744(lVar22 + 0x18,plVar47);
                    *(long *)(lVar22 + 0x10) = *(long *)(lVar22 + 0x10) + 1;
                    lVar22 = *plVar47;
                    *plVar47 = lVar22 + 1;
                    if (lVar22 < 0) {
                      func_0x007a05dc();
                      goto code_r0x0054319c;
                    }
                    uVar40 = **(ulong **)(unaff_x29 + -0xd8);
                    **(ulong **)(unaff_x29 + -0xd8) = uVar40 + 1;
                    if (0xfffffffffffffffe < uVar40) goto code_r0x0054319c;
                    lVar22 = func_0x00563530(in_stack_000000f8 + 0x100,plVar47,
                                             *(undefined8 *)(unaff_x29 + -0xd8));
                    if (lVar22 != 0) {
                      *(long *)(unaff_x29 + -0xc0) = lVar22;
                      uVar66 = _UNK_009ee250;
                      uVar54 = _UNK_009ee248;
                      uVar65 = _UNK_009ee238;
                      if (*(long *)(lVar22 + 0x10) != 0) {
                        func_0x007a2334(&UNK_009ecd98);
                        goto code_r0x0054319c;
                      }
                      in_stack_00000218 = *(undefined8 **)(lVar22 + 0x20);
                      in_stack_00000210 = *(dword **)(lVar22 + 0x18);
                      lVar23 = *(long *)(lVar22 + 0x30);
                      in_stack_00000220 = *(dword **)(lVar22 + 0x28);
                      *(undefined8 *)(lVar22 + 0x20) = _UNK_009ee240;
                      *(undefined8 *)(lVar22 + 0x18) = uVar65;
                      *(undefined8 *)(lVar22 + 0x30) = uVar66;
                      *(undefined8 *)(lVar22 + 0x28) = uVar54;
                      pdVar63 = in_stack_00000210 + 2;
                      if (lVar23 != 0) {
                        lVar22 = *(long *)in_stack_00000210;
                        uVar40 = CONCAT17(-(-1 < lVar22),
                                          CONCAT16(-(-1 < (char)((ulong)lVar22 >> 0x30)),
                                                   CONCAT15(-(-1 < (char)((ulong)lVar22 >> 0x28)),
                                                            CONCAT14(-(-1 < (char)((ulong)lVar22 >>
                                                                                  0x20)),
                                                                     CONCAT13(-(-1 < (char)((ulong)
                                                  lVar22 >> 0x18)),
                                                  CONCAT12(-(-1 < (char)((ulong)lVar22 >> 0x10)),
                                                           CONCAT11(-(-1 < (char)((ulong)lVar22 >> 8
                                                                                 )),
                                                                    -(-1 < (char)lVar22)))))))) &
                                 0x8080808080808080;
                        pdVar35 = in_stack_00000210;
                        do {
                          while (uVar40 == 0) {
                            lVar22 = *(long *)pdVar63;
                            pdVar35 = pdVar35 + -0x10;
                            pdVar63 = pdVar63 + 2;
                            uVar40 = CONCAT17(-(-1 < lVar22),
                                              CONCAT16(-(-1 < (char)((ulong)lVar22 >> 0x30)),
                                                       CONCAT15(-(-1 < (char)((ulong)lVar22 >> 0x28)
                                                                 ),CONCAT14(-(-1 < (char)((ulong)
                                                  lVar22 >> 0x20)),
                                                  CONCAT13(-(-1 < (char)((ulong)lVar22 >> 0x18)),
                                                           CONCAT12(-(-1 < (char)((ulong)lVar22 >>
                                                                                 0x10)),
                                                                    CONCAT11(-(-1 < (char)((ulong)
                                                  lVar22 >> 8)),-(-1 < (char)lVar22)))))))) &
                                     0x8080808080808080;
                          }
                          uVar44 = (uVar40 >> 7 & 0xff00ff00ff00ff00) >> 8 |
                                   (uVar40 >> 7 & 0xff00ff00ff00ff) << 8;
                          uVar44 = (uVar44 & 0xffff0000ffff0000) >> 0x10 |
                                   (uVar44 & 0xffff0000ffff) << 0x10;
                          uVar44 = LZCOUNT(uVar44 >> 0x20 | uVar44 << 0x20) & 0x78;
                          plVar58 = *(long **)((long)pdVar35 + (-8 - uVar44));
                          lVar22 = *plVar58;
                          *plVar58 = lVar22 + 1;
                          if (lVar22 < 0) {
                            func_0x007a05dc();
                            goto code_r0x0054319c;
                          }
                          uVar65 = *(undefined8 *)((long)pdVar35 + (-8 - uVar44));
                          uVar44 = **(ulong **)(unaff_x29 + -0xd8);
                          **(ulong **)(unaff_x29 + -0xd8) = uVar44 + 1;
                          if (0xfffffffffffffffe < uVar44) goto code_r0x0054319c;
                          plVar58 = (long *)func_0x00563530(in_stack_000000f8 + 0x100,uVar65,
                                                            *(undefined8 *)(unaff_x29 + -0xd8));
                          if ((plVar58 != (long *)0x0) &&
                             (lVar22 = *plVar58, *plVar58 = lVar22 + -1, lVar22 + -1 == 0)) {
                            func_0x0057e714(auStack_7ffffffe + 0x8000026e);
                          }
                          uVar40 = uVar40 - 1 & uVar40;
                          lVar23 = lVar23 + -1;
                        } while (lVar23 != 0);
                      }
                      lVar22 = *(long *)(unaff_x29 + -0xd8);
                      if (*(long *)(lVar22 + 0x10) != 0) {
                        func_0x007a2334(&UNK_009ecdb0);
                        goto code_r0x0054319c;
                      }
                      *(undefined8 *)(lVar22 + 0x10) = 0xffffffffffffffff;
                      in_stack_00000278 = (dword *)((long)in_stack_00000218 * 9 + 0x11);
                      in_stack_00000280 = in_stack_00000210 + (long)in_stack_00000218 * -2 + -2;
                      in_stack_00000270 =
                           (dword *)((ulong)(in_stack_00000218 != (undefined8 *)0x0) << 3);
                      func_0x00560524(lVar22 + 0x18,auStack_7ffffffe + 0x8000026e);
                      *(long *)(lVar22 + 0x10) = *(long *)(lVar22 + 0x10) + 1;
                      lVar22 = **(long **)(unaff_x29 + -0xc0) + -1;
                      **(long **)(unaff_x29 + -0xc0) = lVar22;
                      if (lVar22 == 0) {
                        func_0x0057e714(unaff_x29 + -0xc0);
                      }
                    }
                    lVar22 = **(long **)(unaff_x29 + -0xd8) + -1;
                    **(long **)(unaff_x29 + -0xd8) = lVar22;
                    if (lVar22 == 0) {
                      func_0x0057e714(unaff_x29 + -0xd8);
                    }
                    lVar22 = **(long **)(unaff_x29 + -0xf0);
                    **(long **)(unaff_x29 + -0xf0) = lVar22 + -1;
                    LORelease();
                    if (lVar22 == 1) {
                      func_0x005d2ac4(unaff_x29 + -0xf0);
                    }
                  }
                  lVar22 = *plVar47;
                  *plVar47 = lVar22 + -1;
                  LORelease();
                  if (lVar22 == 1) {
                    func_0x005d2ac4(auStack_7ffffffe + 0x800002b6);
                  }
                  puVar24 = *(undefined8 **)(unaff_x29 + -0x78);
                } while (puVar24 != *(undefined8 **)(unaff_x29 + -0x68));
              }
              func_0x00592d18(unaff_x29 + -0x80);
            }
            if (uVar31 <= uVar62) break;
            uVar40 = uVar62;
            uVar62 = uVar62 + 1;
            puVar24 = in_stack_00000218;
          }
        }
      }
      func_0x0053cd04(&uStack0000000000000100);
      func_0x00559ad0(&uStack0000000000000100,*(long *)(in_stack_000000f8 + 8),
                      *(long *)(in_stack_000000f8 + 8) + *(long *)(in_stack_000000f8 + 0x10) * 0x18,
                      &UNK_009ec388);
      uStack0000000000000118 = _iStack0000000000000108 + (long)_uStack0000000000000110 * 2;
      bVar1 = _uStack0000000000000110 != (long *)0x0;
      plVar47 = _iStack0000000000000108;
      _uStack0000000000000110 = uStack0000000000000100;
      if (bVar1) {
        do {
          plVar58 = (long *)_iStack0000000000000108[1];
          *(long *)(unaff_x29 + -0xc0) = *_iStack0000000000000108;
          lVar22 = *plVar58;
          *plVar58 = lVar22 + 1;
          uStack0000000000000100 = plVar47;
          if (lVar22 < 0) {
            _iStack0000000000000108 = _iStack0000000000000108 + 2;
            func_0x007a05dc();
            goto code_r0x0054319c;
          }
          _iStack0000000000000108 = _iStack0000000000000108 + 2;
          plVar47 = (long *)func_0x00544148(in_stack_000000f8,plVar58);
          uVar30 = *(ulong *)*plVar47;
          *(ulong *)*plVar47 = uVar30 + 1;
          if (0xfffffffffffffffe < uVar30) goto code_r0x0054319c;
          lVar22 = *plVar47;
          *(long *)(unaff_x29 + -0x80) = lVar22;
          if (*(long *)(in_stack_000000f8 + 0x198) == 0) {
code_r0x005416f4:
            func_0x007a23d8(&UNK_008aad91,0x16,&UNK_009ec4a0);
            goto code_r0x0054319c;
          }
          lVar23 = 0;
          plVar47 = *(long **)(unaff_x29 + -0xc0);
          lVar15 = *(long *)(in_stack_000000f8 + 0x180);
          uVar31 = *(ulong *)(in_stack_000000f8 + 0x188);
          bVar38 = (byte)((ulong)((long)(plVar47 + 1) * 0x517cc1b727220a95) >> 0x39);
          uVar40 = (long)(plVar47 + 1) * 0x517cc1b727220a95 & uVar31;
          uVar65 = *(undefined8 *)(lVar15 + uVar40);
          uVar30 = CONCAT17(-((byte)((ulong)uVar65 >> 0x38) == bVar38),
                            CONCAT16(-((byte)((ulong)uVar65 >> 0x30) == bVar38),
                                     CONCAT15(-((byte)((ulong)uVar65 >> 0x28) == bVar38),
                                              CONCAT14(-((byte)((ulong)uVar65 >> 0x20) == bVar38),
                                                       CONCAT13(-((byte)((ulong)uVar65 >> 0x18) ==
                                                                 bVar38),CONCAT12(-((byte)((ulong)
                                                  uVar65 >> 0x10) == bVar38),
                                                  CONCAT11(-((byte)((ulong)uVar65 >> 8) == bVar38),
                                                           -((byte)uVar65 == bVar38)))))))) &
                   0x8080808080808080;
          while( true ) {
            while (uVar30 == 0) {
              bVar67 = NEON_umaxv(CONCAT17(-((char)((ulong)uVar65 >> 0x38) == -1),
                                           CONCAT16(-((char)((ulong)uVar65 >> 0x30) == -1),
                                                    CONCAT15(-((char)((ulong)uVar65 >> 0x28) == -1),
                                                             CONCAT14(-((char)((ulong)uVar65 >> 0x20
                                                                              ) == -1),
                                                                      CONCAT13(-((char)((ulong)
                                                  uVar65 >> 0x18) == -1),
                                                  CONCAT12(-((char)((ulong)uVar65 >> 0x10) == -1),
                                                           CONCAT11(-((char)((ulong)uVar65 >> 8) ==
                                                                     -1),-((char)uVar65 == -1)))))))
                                          ),1);
              if ((bVar67 & 1) != 0) goto code_r0x005416f4;
              lVar23 = lVar23 + 8;
              uVar40 = uVar40 + lVar23 & uVar31;
              uVar65 = *(undefined8 *)(lVar15 + uVar40);
              uVar30 = CONCAT17(-((byte)((ulong)uVar65 >> 0x38) == bVar38),
                                CONCAT16(-((byte)((ulong)uVar65 >> 0x30) == bVar38),
                                         CONCAT15(-((byte)((ulong)uVar65 >> 0x28) == bVar38),
                                                  CONCAT14(-((byte)((ulong)uVar65 >> 0x20) == bVar38
                                                            ),CONCAT13(-((byte)((ulong)uVar65 >>
                                                                               0x18) == bVar38),
                                                                       CONCAT12(-((byte)((ulong)
                                                  uVar65 >> 0x10) == bVar38),
                                                  CONCAT11(-((byte)((ulong)uVar65 >> 8) == bVar38),
                                                           -((byte)uVar65 == bVar38)))))))) &
                       0x8080808080808080;
            }
            uVar62 = (uVar30 >> 7 & 0xff00ff00ff00ff00) >> 8 | (uVar30 >> 7 & 0xff00ff00ff00ff) << 8
            ;
            uVar62 = (uVar62 & 0xffff0000ffff0000) >> 0x10 | (uVar62 & 0xffff0000ffff) << 0x10;
            uVar62 = uVar40 + ((ulong)LZCOUNT(uVar62 >> 0x20 | uVar62 << 0x20) >> 3) & uVar31;
            if (plVar47 == *(long **)(lVar15 + -0x28 + uVar62 * -0x28)) break;
            uVar30 = uVar30 - 1 & uVar30;
          }
          if (*(long *)(lVar22 + 0x10) != 0) {
            func_0x007a2334(&UNK_009ec4b8);
            goto code_r0x0054319c;
          }
          lVar15 = lVar15 + uVar62 * -0x28;
          in_stack_00000280 = *(dword **)(lVar15 + -8);
          in_stack_00000278 = *(dword **)(lVar15 + -0x10);
          *(undefined8 *)(lVar22 + 0x10) = 0xffffffffffffffff;
          lVar23 = *plVar47;
          *plVar47 = lVar23 + 1;
          if (lVar23 < 0) {
            func_0x007a05dc();
            goto code_r0x0054319c;
          }
          plVar47 = (long *)func_0x00582704(lVar22 + 0x18,auStack_7ffffffe + 0x8000026e,
                                            *(undefined8 *)(unaff_x29 + -0xc0));
          if (plVar47 != (long *)0x0) {
            lVar23 = *plVar47;
            *plVar47 = lVar23 + -1;
            LORelease();
            if (lVar23 == 1) {
              func_0x005d2ac4(auStack_7ffffffe + 0x8000020e);
            }
          }
          *(long *)(lVar22 + 0x10) = *(long *)(lVar22 + 0x10) + 1;
          lVar22 = **(long **)(unaff_x29 + -0xc0);
          **(long **)(unaff_x29 + -0xc0) = lVar22 + 1;
          if (lVar22 < 0) {
            func_0x007a05dc();
            goto code_r0x0054319c;
          }
          in_stack_00000270 =
               (dword *)func_0x00562594(in_stack_000000f8 + 0x120,*(undefined8 *)(unaff_x29 + -0xc0)
                                        ,*(undefined8 *)(unaff_x29 + -0x80));
          if ((in_stack_00000270 != (dword *)0x0) &&
             (lVar22 = *(long *)in_stack_00000270, *(long *)in_stack_00000270 = lVar22 + -1,
             lVar22 + -1 == 0)) {
            func_0x0057e6ac(auStack_7ffffffe + 0x8000026e);
          }
          lVar22 = *plVar58;
          *plVar58 = lVar22 + -1;
          LORelease();
          if (lVar22 == 1) {
            func_0x005d2ac4(auStack_7ffffffe + 0x8000024e);
          }
          lVar22 = **(long **)(unaff_x29 + -0xc0);
          **(long **)(unaff_x29 + -0xc0) = lVar22 + -1;
          LORelease();
          plVar47 = uStack0000000000000100;
          if (lVar22 == 1) {
            func_0x005d2ac4(unaff_x29 + -0xc0);
            plVar47 = uStack0000000000000100;
          }
        } while (_iStack0000000000000108 != uStack0000000000000118);
      }
      uStack0000000000000100 = plVar47;
      func_0x005927a0(&uStack0000000000000100);
      lVar22 = *(long *)(*(long *)(in_stack_000000f8 + 0xd8) + 0x20);
      _iStack0000000000000108 =
           (long *)(lVar22 + *(long *)(*(long *)(in_stack_000000f8 + 0xd8) + 0x28) * 0x20);
      uStack0000000000000100._0_4_ = (uint)lVar22;
      uStack0000000000000100._4_4_ = (undefined4)((ulong)lVar22 >> 0x20);
      uStack0000000000000110 = 0;
      uStack0000000000000114 = 0;
      func_0x00559d3c(auStack_7ffffffe + 0x8000026e,&uStack0000000000000100,&UNK_009ec388);
      pdVar35 = in_stack_00000270;
      pdVar63 = in_stack_00000278;
      if (in_stack_00000280 != (dword *)0x0) {
        pdVar20 = in_stack_00000278 + (long)in_stack_00000280;
        pdVar32 = in_stack_00000278;
        pdVar75 = in_stack_00000270;
        pdVar76 = in_stack_00000278;
        do {
          pdVar51 = pdVar32 + 1;
          uVar2 = *pdVar32;
          lVar22 = *(long *)(in_stack_000000f8 + 0xd8);
          if (((ulong)uVar2 < *(ulong *)(lVar22 + 0x28)) &&
             (plVar47 = (long *)(*(long *)(lVar22 + 0x20) + (ulong)uVar2 * 0x20),
             *plVar47 != -0x8000000000000000)) {
            lVar23 = plVar47[3];
          }
          else {
            lVar23 = -1;
          }
          uStack0000000000000100._0_4_ = 1;
          uStack0000000000000100._4_4_ = 0;
          iStack0000000000000108 = (int)*(undefined8 *)(lVar22 + 0x38);
          uStack000000000000010c = (undefined4)((ulong)*(undefined8 *)(lVar22 + 0x38) >> 0x20);
          uStack0000000000000110 = (undefined4)*(undefined8 *)(lVar22 + 0x40);
          uStack0000000000000114 = (undefined4)((ulong)*(undefined8 *)(lVar22 + 0x40) >> 0x20);
          uStack0000000000000118._0_4_ = (undefined4)lVar23;
          uStack0000000000000118._4_4_ = (undefined4)((ulong)lVar23 >> 0x20);
          in_stack_00000120 = (dword *)CONCAT44(in_stack_00000120._4_4_,uVar2);
          func_0x0055915c(auStack_7ffffffe + 0x8000026e,&uStack0000000000000100,&UNK_009ec388);
          pdVar35 = pdVar75;
          pdVar63 = pdVar76;
          if (in_stack_00000280 != (dword *)0x0) {
            pdVar32 = pdVar76 + (long)in_stack_00000280;
            pdVar25 = pdVar76;
            do {
              pdVar56 = pdVar25 + 1;
              if (*(ulong *)(*(long *)(in_stack_000000f8 + 0xd8) + 0x40) <= (ulong)*pdVar25) {
code_r0x00543118:
                func_0x007a23bc(&UNK_009ec800);
                goto code_r0x0054319c;
              }
              puVar24 = (undefined8 *)
                        (*(long *)(*(long *)(in_stack_000000f8 + 0xd8) + 0x38) +
                        (ulong)*pdVar25 * 0x30);
              in_stack_00000280 = (dword *)*puVar24;
              if (in_stack_00000280 == (dword *)0x8000000000000000) goto code_r0x00543118;
              pdVar35 = (dword *)puVar24[1];
              lVar22 = puVar24[2];
              *puVar24 = 0;
              puVar24[1] = 8;
              puVar24[2] = 0;
              pdVar25 = pdVar35;
              pdVar63 = pdVar35;
              if (lVar22 != 0) {
                do {
                  pdVar63 = pdVar25 + 0x12;
                  lVar23 = *(long *)(pdVar25 + 2);
                  if (lVar23 == 0xc) break;
                  plVar47 = *(long **)(pdVar25 + 4);
                  *(undefined8 *)(unaff_x29 + -0xc0) = *(undefined8 *)pdVar25;
                  if (lVar23 != 0) {
                    uStack0000000000000128 = *(dword **)(pdVar25 + 0xc);
                    in_stack_00000120 = *(dword **)(pdVar25 + 10);
                    in_stack_00000138 = *(long **)(pdVar25 + 0x10);
                    in_stack_00000130 = *(dword **)(pdVar25 + 0xe);
                    uStack0000000000000118._0_4_ = (undefined4)*(undefined8 *)(pdVar25 + 8);
                    uStack0000000000000118._4_4_ =
                         (undefined4)((ulong)*(undefined8 *)(pdVar25 + 8) >> 0x20);
                    uStack0000000000000110 = (undefined4)*(undefined8 *)(pdVar25 + 6);
                    uStack0000000000000114 =
                         (undefined4)((ulong)*(undefined8 *)(pdVar25 + 6) >> 0x20);
                    uStack0000000000000100._0_4_ = (uint)lVar23;
                    uStack0000000000000100._4_4_ = (undefined4)((ulong)lVar23 >> 0x20);
                    iStack0000000000000108 = (int)plVar47;
                    uStack000000000000010c = (undefined4)((ulong)plVar47 >> 0x20);
                    func_0x007a2810(&UNK_008aabcc,0x2b,&uStack0000000000000100,&UNK_009ec3a0,
                                    &UNK_009ec818);
                    goto code_r0x0054319c;
                  }
                  plVar58 = (long *)func_0x00544148(in_stack_000000f8);
                  uVar30 = *(ulong *)*plVar58;
                  *(ulong *)*plVar58 = uVar30 + 1;
                  if (0xfffffffffffffffe < uVar30) goto code_r0x0054319c;
                  lVar23 = *plVar58;
                  *(long *)(unaff_x29 + -0x80) = lVar23;
                  if (*(long *)(in_stack_000000f8 + 0x198) == 0) {
code_r0x00541b68:
                    func_0x007a23d8(&UNK_008aad91,0x16,&UNK_009ec830);
                    goto code_r0x0054319c;
                  }
                  lVar15 = 0;
                  lVar48 = *(long *)(in_stack_000000f8 + 0x180);
                  uVar31 = *(ulong *)(in_stack_000000f8 + 0x188);
                  bVar38 = (byte)((ulong)((long)(plVar47 + 1) * 0x517cc1b727220a95) >> 0x39);
                  uVar40 = (long)(plVar47 + 1) * 0x517cc1b727220a95 & uVar31;
                  uVar65 = *(undefined8 *)(lVar48 + uVar40);
                  uVar30 = CONCAT17(-((byte)((ulong)uVar65 >> 0x38) == bVar38),
                                    CONCAT16(-((byte)((ulong)uVar65 >> 0x30) == bVar38),
                                             CONCAT15(-((byte)((ulong)uVar65 >> 0x28) == bVar38),
                                                      CONCAT14(-((byte)((ulong)uVar65 >> 0x20) ==
                                                                bVar38),CONCAT13(-((byte)((ulong)
                                                  uVar65 >> 0x18) == bVar38),
                                                  CONCAT12(-((byte)((ulong)uVar65 >> 0x10) == bVar38
                                                            ),CONCAT11(-((byte)((ulong)uVar65 >> 8)
                                                                        == bVar38),
                                                                       -((byte)uVar65 == bVar38)))))
                                                  ))) & 0x8080808080808080;
                  while( true ) {
                    while (uVar30 == 0) {
                      bVar67 = NEON_umaxv(CONCAT17(-((char)((ulong)uVar65 >> 0x38) == -1),
                                                   CONCAT16(-((char)((ulong)uVar65 >> 0x30) == -1),
                                                            CONCAT15(-((char)((ulong)uVar65 >> 0x28)
                                                                      == -1),CONCAT14(-((char)((
                                                  ulong)uVar65 >> 0x20) == -1),
                                                  CONCAT13(-((char)((ulong)uVar65 >> 0x18) == -1),
                                                           CONCAT12(-((char)((ulong)uVar65 >> 0x10)
                                                                     == -1),CONCAT11(-((char)((ulong
                                                  )uVar65 >> 8) == -1),-((char)uVar65 == -1)))))))),
                                          1);
                      if ((bVar67 & 1) != 0) goto code_r0x00541b68;
                      lVar15 = lVar15 + 8;
                      uVar40 = uVar40 + lVar15 & uVar31;
                      uVar65 = *(undefined8 *)(lVar48 + uVar40);
                      uVar30 = CONCAT17(-((byte)((ulong)uVar65 >> 0x38) == bVar38),
                                        CONCAT16(-((byte)((ulong)uVar65 >> 0x30) == bVar38),
                                                 CONCAT15(-((byte)((ulong)uVar65 >> 0x28) == bVar38)
                                                          ,CONCAT14(-((byte)((ulong)uVar65 >> 0x20)
                                                                     == bVar38),
                                                                    CONCAT13(-((byte)((ulong)uVar65
                                                                                     >> 0x18) ==
                                                                              bVar38),CONCAT12(-((
                                                  byte)((ulong)uVar65 >> 0x10) == bVar38),
                                                  CONCAT11(-((byte)((ulong)uVar65 >> 8) == bVar38),
                                                           -((byte)uVar65 == bVar38)))))))) &
                               0x8080808080808080;
                    }
                    uVar62 = (uVar30 >> 7 & 0xff00ff00ff00ff00) >> 8 |
                             (uVar30 >> 7 & 0xff00ff00ff00ff) << 8;
                    uVar62 = (uVar62 & 0xffff0000ffff0000) >> 0x10 |
                             (uVar62 & 0xffff0000ffff) << 0x10;
                    uVar62 = uVar40 + ((ulong)LZCOUNT(uVar62 >> 0x20 | uVar62 << 0x20) >> 3) &
                             uVar31;
                    if (plVar47 == *(long **)(lVar48 + -0x28 + uVar62 * -0x28)) break;
                    uVar30 = uVar30 - 1 & uVar30;
                  }
                  if (*(long *)(lVar23 + 0x10) != 0) {
                    func_0x007a2334(&UNK_009ec848);
                    goto code_r0x0054319c;
                  }
                  lVar48 = lVar48 + uVar62 * -0x28;
                  uVar65 = *(undefined8 *)(lVar48 + -0x20);
                  uVar66 = *(undefined8 *)(lVar48 + -8);
                  uVar54 = *(undefined8 *)(lVar48 + -0x10);
                  *(undefined8 *)(lVar23 + 0x10) = 0xffffffffffffffff;
                  uStack0000000000000100._0_4_ = (uint)uVar65;
                  uStack0000000000000100._4_4_ = (undefined4)((ulong)uVar65 >> 0x20);
                  uStack0000000000000110 = (undefined4)uVar66;
                  uStack0000000000000114 = (undefined4)((ulong)uVar66 >> 0x20);
                  iStack0000000000000108 = (int)uVar54;
                  uStack000000000000010c = (undefined4)((ulong)uVar54 >> 0x20);
                  lVar15 = *plVar47;
                  *plVar47 = lVar15 + 1;
                  if (lVar15 < 0) {
                    func_0x007a05dc();
                    goto code_r0x0054319c;
                  }
                  plVar58 = (long *)func_0x00582704(lVar23 + 0x18,&uStack0000000000000100,plVar47);
                  if (plVar58 != (long *)0x0) {
                    lVar15 = *plVar58;
                    *plVar58 = lVar15 + -1;
                    LORelease();
                    if (lVar15 == 1) {
                      func_0x005d2ac4(auStack_7ffffffe + 0x8000020e);
                    }
                  }
                  *(long *)(lVar23 + 0x10) = *(long *)(lVar23 + 0x10) + 1;
                  plVar47 = (long *)func_0x00562594(in_stack_000000f8 + 0x120,plVar47,
                                                    *(undefined8 *)(unaff_x29 + -0x80));
                  uStack0000000000000100._0_4_ = (uint)plVar47;
                  uStack0000000000000100._4_4_ = (undefined4)((ulong)plVar47 >> 0x20);
                  if ((plVar47 != (long *)0x0) &&
                     (lVar23 = *plVar47, *plVar47 = lVar23 + -1, lVar23 + -1 == 0)) {
                    func_0x0057e6ac(&uStack0000000000000100);
                  }
                  pdVar25 = pdVar63;
                } while (pdVar63 != pdVar35 + lVar22 * 0x12);
              }
              func_0x00592bf8(auStack_7ffffffe + 0x8000026e);
              pdVar25 = pdVar56;
            } while (pdVar56 != pdVar32);
          }
          if (pdVar75 != (dword *)0x0) {
            func_0x00187bd4(pdVar76,(long)pdVar75 << 2,4);
          }
          pdVar32 = pdVar51;
          pdVar75 = pdVar35;
          pdVar76 = pdVar63;
        } while (pdVar51 != pdVar20);
      }
      if (in_stack_00000270 != (dword *)0x0) {
        func_0x00187bd4(in_stack_00000278,(long)in_stack_00000270 << 2,4);
      }
      if (*(int *)(*(long *)(in_stack_000000f8 + 0xd8) + 0x78) == 1) {
        func_0x0058bce0(auStack_7ffffffe + 0x8000026e,in_stack_000000f8 + 0x48,
                        *(undefined4 *)(*(long *)(in_stack_000000f8 + 0xd8) + 0x7c));
code_r0x00541b04:
        auVar74 = func_0x0058be04(auStack_7ffffffe + 0x8000026e,
                                  *(long *)(in_stack_000000f8 + 0xd8) + 0x18);
        if ((auVar74._0_8_ & 1) != 0) {
          if (*(long *)(in_stack_000000f8 + 0x218) != 0) {
            lVar22 = 0;
            uVar30 = (auVar74._8_8_ & 0xffffffff) * 0x517cc1b727220a95;
            bVar38 = (byte)(uVar30 >> 0x39);
            while( true ) {
              uVar30 = uVar30 & *(ulong *)(in_stack_000000f8 + 0x208);
              uVar65 = *(undefined8 *)(*(long *)(in_stack_000000f8 + 0x200) + uVar30);
              bVar67 = (byte)((ulong)uVar65 >> 8);
              bVar68 = (byte)((ulong)uVar65 >> 0x10);
              bVar69 = (byte)((ulong)uVar65 >> 0x18);
              bVar70 = (byte)((ulong)uVar65 >> 0x20);
              bVar71 = (byte)((ulong)uVar65 >> 0x28);
              bVar72 = (byte)((ulong)uVar65 >> 0x30);
              bVar73 = (byte)((ulong)uVar65 >> 0x38);
              for (uVar31 = CONCAT17(-(bVar73 == bVar38),
                                     CONCAT16(-(bVar72 == bVar38),
                                              CONCAT15(-(bVar71 == bVar38),
                                                       CONCAT14(-(bVar70 == bVar38),
                                                                CONCAT13(-(bVar69 == bVar38),
                                                                         CONCAT12(-(bVar68 == bVar38
                                                                                   ),CONCAT11(-(
                                                  bVar67 == bVar38),-((byte)uVar65 == bVar38))))))))
                            & 0x8080808080808080; uVar31 != 0; uVar31 = uVar31 - 1 & uVar31) {
                uVar40 = (uVar31 >> 7 & 0xff00ff00ff00ff00) >> 8 |
                         (uVar31 >> 7 & 0xff00ff00ff00ff) << 8;
                uVar40 = (uVar40 & 0xffff0000ffff0000) >> 0x10 | (uVar40 & 0xffff0000ffff) << 0x10;
                if (auVar74._8_4_ ==
                    *(int *)(*(long *)(in_stack_000000f8 + 0x200) + -4 +
                            (uVar30 + ((ulong)LZCOUNT(uVar40 >> 0x20 | uVar40 << 0x20) >> 3) &
                            *(ulong *)(in_stack_000000f8 + 0x208)) * -4)) {
                  func_0x005444ec(in_stack_000000f8);
                  goto code_r0x00541b04;
                }
              }
              bVar67 = NEON_umaxv(CONCAT17(-(bVar73 == 0xff),
                                           CONCAT16(-(bVar72 == 0xff),
                                                    CONCAT15(-(bVar71 == 0xff),
                                                             CONCAT14(-(bVar70 == 0xff),
                                                                      CONCAT13(-(bVar69 == 0xff),
                                                                               CONCAT12(-(bVar68 ==
                                                                                         0xff),
                                                  CONCAT11(-(bVar67 == 0xff),-((byte)uVar65 == 0xff)
                                                          ))))))),1);
              if ((bVar67 & 1) != 0) break;
              lVar22 = lVar22 + 8;
              uVar30 = uVar30 + lVar22;
            }
          }
          goto code_r0x00541b04;
        }
        if ((*(uint *)(*(long *)(in_stack_000000f8 + 0xd8) + 0x78) & 1) != 0) {
          func_0x0058bce0(&uStack0000000000000100,in_stack_000000f8 + 0x48,
                          *(undefined4 *)(*(long *)(in_stack_000000f8 + 0xd8) + 0x7c));
          while( true ) {
            uVar30 = func_0x0058be04(&uStack0000000000000100,
                                     *(long *)(in_stack_000000f8 + 0xd8) + 0x18);
            if ((uVar30 & 1) == 0) break;
            func_0x005444ec(in_stack_000000f8);
          }
          if (CONCAT44(uStack0000000000000100._4_4_,(uint)uStack0000000000000100) != 0) {
            func_0x00187bd4(_iStack0000000000000108,
                            CONCAT44(uStack0000000000000100._4_4_,(uint)uStack0000000000000100) << 2
                            ,4);
          }
          func_0x004d0c00(&uStack0000000000000118);
          if (pdVar35 != (dword *)0x0) {
            func_0x00187bd4(pdVar63,(long)pdVar35 << 2,4);
          }
          func_0x004d0c00(auStack_7ffffffe + 0x80000286);
          lVar23 = _UNK_009ec480;
          plVar34 = _UNK_009ec478;
          puVar18 = _UNK_009ec470;
          plVar17 = _UNK_009ec468;
          uVar65 = *(undefined8 *)(in_stack_000000f8 + 0xd8);
          plVar58 = *(long **)(in_stack_000000f8 + 0x120);
          lVar22 = (long)plVar58 + *(long *)(in_stack_000000f8 + 0x128) + 1;
          lVar15 = *plVar58;
          plVar47 = plVar58 + 1;
          puVar37 = (uint *)(CONCAT17(-(-1 < lVar15),
                                      CONCAT16(-(-1 < (char)((ulong)lVar15 >> 0x30)),
                                               CONCAT15(-(-1 < (char)((ulong)lVar15 >> 0x28)),
                                                        CONCAT14(-(-1 < (char)((ulong)lVar15 >> 0x20
                                                                              )),
                                                                 CONCAT13(-(-1 < (char)((ulong)
                                                  lVar15 >> 0x18)),
                                                  CONCAT12(-(-1 < (char)((ulong)lVar15 >> 0x10)),
                                                           CONCAT11(-(-1 < (char)((ulong)lVar15 >> 8
                                                                                 )),
                                                                    -(-1 < (char)lVar15)))))))) &
                            0x8080808080808080);
          pdVar63 = *(dword **)(in_stack_000000f8 + 0x138);
          while( true ) {
            auVar74 = func_0x0049dcc0(auStack_7ffffffe + 0x8000026e);
            puVar24 = auVar74._0_8_;
            if (puVar24 == (undefined8 *)0x0) break;
            lVar15 = *auVar74._8_8_;
            if (0x7ffffffffffffffe < *(ulong *)(lVar15 + 0x10)) {
              func_0x007a2378(&UNK_009ec710);
              goto code_r0x0054319c;
            }
            *(ulong *)(lVar15 + 0x10) = *(ulong *)(lVar15 + 0x10) + 1;
            pdVar35 = *(dword **)(lVar15 + 0x18);
            if (pdVar35 == (dword *)0x0) {
              in_stack_00000140 = (dword *)0x0;
            }
            else {
              in_stack_00000138 = *(long **)(lVar15 + 0x20);
              in_stack_00000140 = *(dword **)(lVar15 + 0x28);
              _iStack0000000000000108 = (long *)0x0;
              uStack0000000000000110 = SUB84(pdVar35,0);
              uStack0000000000000114 = (undefined4)((ulong)pdVar35 >> 0x20);
              uStack0000000000000128 = (dword *)0x0;
              in_stack_00000130 = pdVar35;
              uStack0000000000000118 = in_stack_00000138;
            }
            bVar1 = pdVar35 != (dword *)0x0;
            in_stack_00000120 = (dword *)(ulong)bVar1;
            uStack0000000000000100._0_4_ = (uint)bVar1;
            uStack0000000000000100._4_4_ = 0;
            auVar74 = func_0x0058027c(&uStack0000000000000100);
            puVar57 = auVar74._8_8_;
            if (auVar74._0_8_ == 0) {
              func_0x007a23bc(&UNK_009ec728);
              goto code_r0x0054319c;
            }
            plVar26 = (long *)*puVar24;
            if (plVar26 != (long *)*puVar57) {
              lVar48 = *plVar26;
              *plVar26 = lVar48 + 1;
              if (lVar48 < 0) {
                func_0x007a05dc();
                goto code_r0x0054319c;
              }
              uVar54 = *puVar24;
              uStack0000000000000100._0_4_ = (uint)uVar54;
              uStack0000000000000100._4_4_ = (undefined4)((ulong)uVar54 >> 0x20);
              lVar48 = *(long *)*puVar57;
              *(long *)*puVar57 = lVar48 + 1;
              if (lVar48 < 0) {
                func_0x007a05dc();
                goto code_r0x0054319c;
              }
              plVar26 = (long *)func_0x0056237c(auStack_7ffffffe + 0x8000020e,uVar54,*puVar57);
              *(long **)(unaff_x29 + -0x80) = plVar26;
              if (plVar26 != (long *)0x0) {
                lVar48 = *plVar26;
                *plVar26 = lVar48 + -1;
                LORelease();
                if (lVar48 == 1) {
                  func_0x005d2ac4(unaff_x29 + -0x80);
                }
              }
            }
            *(long *)(lVar15 + 0x10) = *(long *)(lVar15 + 0x10) + -1;
          }
          iStack0000000000000108 = (int)puVar18;
          uStack000000000000010c = (undefined4)((ulong)puVar18 >> 0x20);
          uStack0000000000000100._0_4_ = (uint)plVar17;
          uStack0000000000000100._4_4_ = (undefined4)((ulong)plVar17 >> 0x20);
          uStack0000000000000118._0_4_ = (undefined4)lVar23;
          uStack0000000000000118._4_4_ = (undefined4)((ulong)lVar23 >> 0x20);
          uStack0000000000000110 = SUB84(plVar34,0);
          uStack0000000000000114 = (undefined4)((ulong)plVar34 >> 0x20);
          func_0x0054ade4(uVar65,&uStack0000000000000100);
          lVar48 = *(long *)(in_stack_000000f8 + 0xd8);
          lVar15 = *(long *)(lVar48 + 0x20);
          _iStack0000000000000108 = (long *)(lVar15 + *(long *)(lVar48 + 0x28) * 0x20);
          uStack0000000000000100._0_4_ = (uint)lVar15;
          uStack0000000000000100._4_4_ = (undefined4)((ulong)lVar15 >> 0x20);
          uStack0000000000000110 = 0;
          uStack0000000000000114 = 0;
          func_0x00559d3c(auStack_7ffffffe + 0x8000026e,&uStack0000000000000100,&UNK_009ec388);
          if (plVar47 != (long *)0x0) {
            puVar61 = puVar37 + (long)plVar47;
            in_stack_00000050 = (dword *)&UNK_009ec4d0;
            in_stack_00000040 = &UNK_009ec680;
            puStack0000000000000060 = &UNK_009ec638;
            puVar27 = puVar37;
            plVar26 = plVar58;
            puVar77 = puVar37;
            do {
              puVar28 = puVar27 + 1;
              uVar31 = (ulong)*puVar27;
              pdVar35 = &MACH_HEADER.cpusubtype;
              lVar15 = 0;
              uVar30 = *(ulong *)(lVar48 + 0x28);
              if ((uVar30 <= uVar31) ||
                 (plVar64 = (long *)(*(long *)(lVar48 + 0x20) + uVar31 * 0x20),
                 *plVar64 == -0x8000000000000000)) {
code_r0x00543020:
                func_0x007a23bc(in_stack_00000050);
                goto code_r0x0054319c;
              }
              if (plVar64[2] != 0) {
                lVar43 = 0;
                lVar45 = plVar64[1];
                lVar50 = lVar45 + plVar64[2] * 0x108;
                do {
                  uVar10 = uStack0000000000000100._4_4_;
                  uVar8 = (uint)uStack0000000000000100;
                  uStack0000000000000100._0_4_ = uVar8;
                  uStack0000000000000100._4_4_ = uVar10;
                  if (*(long *)(lVar45 + 0x18) == 0xf) {
                    if ((*(byte *)(lVar45 + 0x51) & 1) != 0) {
                      uVar30 = *(ulong *)(lVar45 + 0x30);
                      uStack0000000000000100._0_4_ = (uint)lVar43;
                      uVar9 = (uint)uStack0000000000000100;
                      uStack0000000000000100._4_4_ = (undefined4)((ulong)lVar43 >> 0x20);
                      uVar11 = uStack0000000000000100._4_4_;
                      if (uVar30 == 1) {
                        if (*(long *)(lVar45 + 0x48) == 0) {
                          uStack0000000000000100._0_4_ = uVar8;
                          uStack0000000000000100._4_4_ = uVar10;
                          func_0x007a2570(0,0,&UNK_009ec500);
                          goto code_r0x0054319c;
                        }
                        if (**(long **)(lVar45 + 0x40) == 0) {
                          if (**(long **)(lVar45 + 0x28) != -0x8000000000000000) {
                            in_stack_00000050 = (dword *)&UNK_009ec6f8;
                            uStack0000000000000100._0_4_ = uVar8;
                            uStack0000000000000100._4_4_ = uVar10;
                            goto code_r0x00543020;
                          }
                          if ((*(long **)(lVar45 + 0x40))[1] == (*(long **)(lVar45 + 0x28))[1]) {
                            iStack0000000000000108 = 0;
                            uStack000000000000010c = 0;
                            uStack0000000000000110 = 8;
                            uStack0000000000000114 = 0;
                            uStack0000000000000118._0_4_ = 0;
                            uStack0000000000000118._4_4_ = 0;
                            if (lVar15 == 0) {
                              func_0x00582c4c(auStack_7ffffffe + 0x800002b6,&UNK_009ec518);
                            }
                            lVar55 = lVar15 * 0x20;
                            *(long **)(lVar55 + 0x10) = _iStack0000000000000108;
                            *(ulong *)(lVar55 + 8) =
                                 CONCAT44(uStack0000000000000100._4_4_,(uint)uStack0000000000000100)
                            ;
                            *(ulong *)(lVar55 + 0x20) =
                                 CONCAT44(uStack0000000000000118._4_4_,
                                          (undefined4)uStack0000000000000118);
                            *(ulong *)(lVar55 + 0x18) =
                                 CONCAT44(uStack0000000000000114,uStack0000000000000110);
                            lVar15 = lVar15 + 1;
                            goto code_r0x00541e58;
                          }
                        }
                        *(undefined1 *)(lVar45 + 0x51) = 0;
                        uStack0000000000000100._0_4_ = uVar8;
                        uStack0000000000000100._4_4_ = uVar10;
                      }
                      else {
                        *(undefined8 *)(unaff_x29 + -0xf0) = 0;
                        *(undefined8 *)(unaff_x29 + -0xe8) = 8;
                        *(undefined8 *)(unaff_x29 + -0xe0) = 0;
                        *(undefined8 *)(unaff_x29 + -0xd8) = 0;
                        *(undefined8 *)(unaff_x29 + -0xd0) = 8;
                        *(undefined8 *)(unaff_x29 + -200) = 0;
                        *(undefined8 *)(unaff_x29 + -0xc0) = 0;
                        *(undefined8 *)(unaff_x29 + -0xb8) = 8;
                        *(undefined8 *)(unaff_x29 + -0xb0) = 0;
                        uStack0000000000000100._0_4_ = uVar8;
                        uStack0000000000000100._4_4_ = uVar10;
                        if (uVar30 != 0) {
                          lVar55 = 0;
                          lVar22 = 0;
                          uVar40 = 0;
                          do {
                            while( true ) {
                              uVar62 = *(ulong *)(lVar45 + 0x30);
                              if (uVar62 <= uVar40) goto code_r0x00543108;
                              plVar47 = (long *)(*(long *)(lVar45 + 0x28) + lVar55);
                              if (*plVar47 != -0x8000000000000000) {
                                puStack0000000000000060 = &UNK_009ec698;
                                goto code_r0x00542e20;
                              }
                              uVar62 = *(ulong *)(lVar45 + 0x48);
                              if (uVar62 <= uVar40) {
                                in_stack_00000040 = &UNK_009ec6b0;
                                goto code_r0x00543108;
                              }
                              plVar26 = (long *)(*(long *)(lVar45 + 0x40) + lVar22);
                              if (*plVar26 == 0) break;
                              puVar24 = (undefined8 *)func_0x00187bd0(0x18,8);
                              if (puVar24 == (undefined8 *)0x0) {
                                func_0x007a1f18(8,0x18);
                                goto code_r0x0054319c;
                              }
                              lVar60 = *(long *)plVar47[1];
                              *(long *)plVar47[1] = lVar60 + 1;
                              if (lVar60 < 0) {
                                func_0x007a05dc();
                                goto code_r0x0054319c;
                              }
                              lVar60 = plVar47[1];
                              *puVar24 = 0x8000000000000000;
                              puVar24[1] = lVar60;
                              *(undefined8 *)(unaff_x29 + -0x80) = 1;
                              *(undefined8 **)(unaff_x29 + -0x78) = puVar24;
                              *(undefined8 *)(unaff_x29 + -0x70) = 1;
                              pdVar20 = (dword *)func_0x00187bd0(0x40,8);
                              if (pdVar20 == (dword *)0x0) {
                                func_0x007a1f18(8,0x40);
                                goto code_r0x0054319c;
                              }
                              func_0x0053e7a8(&uStack0000000000000100,plVar26);
                              *(long **)(pdVar20 + 2) = _iStack0000000000000108;
                              *(ulong *)pdVar20 =
                                   CONCAT44(uStack0000000000000100._4_4_,
                                            (uint)uStack0000000000000100);
                              *(ulong *)(pdVar20 + 6) =
                                   CONCAT44(uStack0000000000000118._4_4_,
                                            (undefined4)uStack0000000000000118);
                              *(ulong *)(pdVar20 + 4) =
                                   CONCAT44(uStack0000000000000114,uStack0000000000000110);
                              *(dword **)(pdVar20 + 10) = uStack0000000000000128;
                              *(dword **)(pdVar20 + 8) = in_stack_00000120;
                              *(long **)(pdVar20 + 0xe) = in_stack_00000138;
                              *(dword **)(pdVar20 + 0xc) = in_stack_00000130;
                              iStack0000000000000108 = (int)*(undefined8 *)(unaff_x29 + -0x78);
                              uStack000000000000010c =
                                   (undefined4)((ulong)*(undefined8 *)(unaff_x29 + -0x78) >> 0x20);
                              uStack0000000000000100._0_4_ =
                                   (uint)*(undefined8 *)(unaff_x29 + -0x80);
                              uStack0000000000000100._4_4_ =
                                   (undefined4)((ulong)*(undefined8 *)(unaff_x29 + -0x80) >> 0x20);
                              uStack0000000000000110 =
                                   (undefined4)*(undefined8 *)(unaff_x29 + -0x70);
                              uStack0000000000000114 =
                                   (undefined4)((ulong)*(undefined8 *)(unaff_x29 + -0x70) >> 0x20);
                              uStack0000000000000118._0_4_ = 1;
                              uStack0000000000000118._4_4_ = 0;
                              uStack0000000000000128 = (dword *)((long)&MACH_HEADER.magic + 1);
                              in_stack_00000130 =
                                   (dword *)((ulong)in_stack_00000130 & 0xffffffffffff0000);
                              lVar60 = *(long *)(unaff_x29 + -0xb0);
                              in_stack_00000120 = pdVar20;
                              if (lVar60 == *(long *)(unaff_x29 + -0xc0)) {
                                func_0x00582d00(unaff_x29 + -0xc0,&UNK_009ec6e0);
                              }
                              puVar24 = (undefined8 *)(*(long *)(unaff_x29 + -0xb8) + lVar60 * 0x38)
                              ;
                              puVar24[1] = _iStack0000000000000108;
                              *puVar24 = CONCAT44(uStack0000000000000100._4_4_,
                                                  (uint)uStack0000000000000100);
                              puVar24[3] = CONCAT44(uStack0000000000000118._4_4_,
                                                    (undefined4)uStack0000000000000118);
                              puVar24[2] = CONCAT44(uStack0000000000000114,uStack0000000000000110);
                              puVar24[5] = uStack0000000000000128;
                              puVar24[4] = in_stack_00000120;
                              puVar24[6] = in_stack_00000130;
                              *(long *)(unaff_x29 + -0xb0) = lVar60 + 1;
                              uVar40 = uVar40 + 1;
                              lVar22 = lVar22 + 0x40;
                              lVar55 = lVar55 + 0x18;
                              if (uVar30 == uVar40) goto code_r0x00542188;
                            }
                            lVar60 = *(long *)plVar26[1];
                            *(long *)plVar26[1] = lVar60 + 1;
                            if (lVar60 < 0) goto code_r0x00542dec;
                            plVar64 = (long *)plVar26[1];
                            uStack0000000000000100._0_4_ = (uint)plVar64;
                            uStack0000000000000100._4_4_ = (undefined4)((ulong)plVar64 >> 0x20);
                            lVar60 = *plVar64;
                            *plVar64 = lVar60 + 1;
                            if (lVar60 < 0) {
                              func_0x007a05dc();
                              goto code_r0x0054319c;
                            }
                            plVar64 = (long *)func_0x0056237c(auStack_7ffffffe + 0x8000020e,plVar64,
                                                              plVar26[1]);
                            *(long **)(unaff_x29 + -0x80) = plVar64;
                            if (plVar64 != (long *)0x0) {
                              lVar60 = *plVar64;
                              *plVar64 = lVar60 + -1;
                              LORelease();
                              if (lVar60 == 1) {
                                func_0x005d2ac4(unaff_x29 + -0x80);
                              }
                            }
                            lVar60 = *(long *)plVar47[1];
                            *(long *)plVar47[1] = lVar60 + 1;
                            if (lVar60 < 0) goto code_r0x00542dec;
                            lVar16 = plVar47[1];
                            uStack0000000000000100._0_4_ = (uint)lVar16;
                            uStack0000000000000100._4_4_ = (undefined4)((ulong)lVar16 >> 0x20);
                            lVar60 = *(long *)plVar26[1];
                            *(long *)plVar26[1] = lVar60 + 1;
                            if (lVar60 < 0) {
                              func_0x007a05dc();
                              goto code_r0x0054319c;
                            }
                            plVar26 = (long *)func_0x0056237c(auStack_7ffffffe + 0x8000026e,lVar16,
                                                              plVar26[1]);
                            *(long **)(unaff_x29 + -0x80) = plVar26;
                            if (plVar26 != (long *)0x0) {
                              lVar60 = *plVar26;
                              *plVar26 = lVar60 + -1;
                              LORelease();
                              if (lVar60 == 1) {
                                func_0x005d2ac4(unaff_x29 + -0x80);
                              }
                            }
                            lVar60 = *(long *)plVar47[1];
                            *(long *)plVar47[1] = lVar60 + 1;
                            if (lVar60 < 0) goto code_r0x00542dec;
                            lVar60 = plVar47[1];
                            uStack0000000000000100._0_4_ = (uint)lVar60;
                            uStack0000000000000100._4_4_ = (undefined4)((ulong)lVar60 >> 0x20);
                            lVar16 = *(long *)(unaff_x29 + -200);
                            if (lVar16 == *(long *)(unaff_x29 + -0xd8)) {
                              func_0x0058321c(unaff_x29 + -0xd8,&UNK_009ec6c8);
                            }
                            *(long *)(*(long *)(unaff_x29 + -0xd0) + lVar16 * 8) = lVar60;
                            *(long *)(unaff_x29 + -200) = lVar16 + 1;
                            uVar40 = uVar40 + 1;
                            lVar22 = lVar22 + 0x40;
                            lVar55 = lVar55 + 0x18;
                          } while (uVar30 != uVar40);
code_r0x00542188:
                          uVar30 = *(ulong *)(lVar45 + 0x30);
                          if (uVar30 != 0) {
                            uVar62 = 1;
                            uVar40 = 0;
                            while( true ) {
                              uVar44 = uVar62;
                              uVar62 = *(ulong *)(lVar45 + 0x30);
                              if (uVar62 <= uVar40) {
                                in_stack_00000040 = &UNK_009ec620;
                                goto code_r0x00543108;
                              }
                              plVar47 = (long *)(*(long *)(lVar45 + 0x28) + uVar40 * 0x18);
                              plVar26 = plVar47 + 1;
                              if (*plVar47 != -0x8000000000000000) goto code_r0x00542e20;
                              if (lVar23 != 0) {
                                lVar22 = 0;
                                uVar62 = (*plVar26 + 8) * 0x517cc1b727220a95;
                                bVar38 = (byte)(uVar62 >> 0x39);
                                while( true ) {
                                  uVar62 = uVar62 & (ulong)puVar18;
                                  uVar65 = *(undefined8 *)((long)plVar17 + uVar62);
                                  bVar67 = (byte)((ulong)uVar65 >> 8);
                                  bVar68 = (byte)((ulong)uVar65 >> 0x10);
                                  bVar69 = (byte)((ulong)uVar65 >> 0x18);
                                  bVar70 = (byte)((ulong)uVar65 >> 0x20);
                                  bVar71 = (byte)((ulong)uVar65 >> 0x28);
                                  bVar72 = (byte)((ulong)uVar65 >> 0x30);
                                  bVar73 = (byte)((ulong)uVar65 >> 0x38);
                                  uVar42 = CONCAT17(-(bVar73 == bVar38),
                                                    CONCAT16(-(bVar72 == bVar38),
                                                             CONCAT15(-(bVar71 == bVar38),
                                                                      CONCAT14(-(bVar70 == bVar38),
                                                                               CONCAT13(-(bVar69 ==
                                                                                         bVar38),
                                                  CONCAT12(-(bVar68 == bVar38),
                                                           CONCAT11(-(bVar67 == bVar38),
                                                                    -((byte)uVar65 == bVar38))))))))
                                           & 0x8080808080808080;
                                  if (uVar42 != 0) {
                                    do {
                                      uVar46 = (uVar42 >> 7 & 0xff00ff00ff00ff00) >> 8 |
                                               (uVar42 >> 7 & 0xff00ff00ff00ff) << 8;
                                      uVar46 = (uVar46 & 0xffff0000ffff0000) >> 0x10 |
                                               (uVar46 & 0xffff0000ffff) << 0x10;
                                      if (*plVar26 ==
                                          plVar17[(uVar62 + ((ulong)LZCOUNT(uVar46 >> 0x20 |
                                                                            uVar46 << 0x20) >> 3) &
                                                  (ulong)puVar18) * -2 + -2]) goto code_r0x005422dc;
                                      uVar42 = uVar42 - 1 & uVar42;
                                    } while (uVar42 != 0);
                                  }
                                  bVar67 = NEON_umaxv(CONCAT17(-(bVar73 == 0xff),
                                                               CONCAT16(-(bVar72 == 0xff),
                                                                        CONCAT15(-(bVar71 == 0xff),
                                                                                 CONCAT14(-(bVar70 
                                                  == 0xff),CONCAT13(-(bVar69 == 0xff),
                                                                    CONCAT12(-(bVar68 == 0xff),
                                                                             CONCAT11(-(bVar67 ==
                                                                                       0xff),-((byte
                                                  )uVar65 == 0xff)))))))),1);
                                  if ((bVar67 & 1) != 0) break;
                                  lVar22 = lVar22 + 8;
                                  uVar62 = uVar62 + lVar22;
                                }
                              }
                              uVar62 = *(ulong *)(lVar45 + 0x48);
                              if (uVar62 <= uVar40) break;
                              if (*(long *)(*(long *)(lVar45 + 0x40) + uVar40 * 0x40) == 0) {
                                lVar22 = *(long *)*plVar26;
                                *(long *)*plVar26 = lVar22 + 1;
                                if (lVar22 < 0) goto code_r0x00542dec;
                                lVar55 = *plVar26;
                                uStack0000000000000100._0_4_ = (uint)lVar55;
                                uStack0000000000000100._4_4_ = (undefined4)((ulong)lVar55 >> 0x20);
                                lVar22 = *(long *)(unaff_x29 + -0xe0);
                                if (lVar22 == *(long *)(unaff_x29 + -0xf0)) {
                                  func_0x0058321c(unaff_x29 + -0xf0,&UNK_009ec668);
                                }
                                *(long *)(*(long *)(unaff_x29 + -0xe8) + lVar22 * 8) = lVar55;
                                *(long *)(unaff_x29 + -0xe0) = lVar22 + 1;
                              }
code_r0x005422dc:
                              if (uVar30 <= uVar44) goto code_r0x005422e8;
                              uVar62 = uVar44 + 1;
                              uVar40 = uVar44;
                            }
                            in_stack_00000040 = &UNK_009ec650;
code_r0x00543108:
                            func_0x007a2570(uVar40,uVar62,in_stack_00000040);
                            goto code_r0x0054319c;
                          }
                        }
code_r0x005422e8:
                        *(undefined8 *)(unaff_x29 + -0xa8) = 0;
                        lVar22 = 0;
                        lVar55 = *(long *)(unaff_x29 + -200);
                        while (lVar55 != 0) {
                          *(long *)(unaff_x29 + -200) = lVar55 + -1;
                          *(undefined8 *)(unaff_x29 + -0xa0) =
                               *(undefined8 *)(*(long *)(unaff_x29 + -0xd0) + (lVar55 + -1) * 8);
                          while (*(long *)(unaff_x29 + -0xe0) != 0) {
                            lVar55 = *(long *)(unaff_x29 + -0xe0) + -1;
                            *(long *)(unaff_x29 + -0xe0) = lVar55;
                            lVar55 = *(long *)(*(long *)(unaff_x29 + -0xe8) + lVar55 * 8);
                            *(long *)(unaff_x29 + -0x98) = lVar55;
                            if (lVar23 == 0) {
code_r0x00542d3c:
                              func_0x007a23d8(&UNK_008aad91,0x16,&UNK_009ec530);
                              goto code_r0x0054319c;
                            }
                            lVar60 = 0;
                            uVar40 = (lVar55 + 8) * 0x517cc1b727220a95;
                            bVar38 = (byte)(uVar40 >> 0x39);
                            uVar40 = uVar40 & (ulong)puVar18;
                            uVar65 = *(undefined8 *)((long)plVar17 + uVar40);
                            uVar30 = CONCAT17(-((byte)((ulong)uVar65 >> 0x38) == bVar38),
                                              CONCAT16(-((byte)((ulong)uVar65 >> 0x30) == bVar38),
                                                       CONCAT15(-((byte)((ulong)uVar65 >> 0x28) ==
                                                                 bVar38),CONCAT14(-((byte)((ulong)
                                                  uVar65 >> 0x20) == bVar38),
                                                  CONCAT13(-((byte)((ulong)uVar65 >> 0x18) == bVar38
                                                            ),CONCAT12(-((byte)((ulong)uVar65 >>
                                                                               0x10) == bVar38),
                                                                       CONCAT11(-((byte)((ulong)
                                                  uVar65 >> 8) == bVar38),-((byte)uVar65 == bVar38))
                                                  )))))) & 0x8080808080808080;
                            while( true ) {
                              while (uVar30 == 0) {
                                bVar67 = NEON_umaxv(CONCAT17(-((char)((ulong)uVar65 >> 0x38) == -1),
                                                             CONCAT16(-((char)((ulong)uVar65 >> 0x30
                                                                              ) == -1),
                                                                      CONCAT15(-((char)((ulong)
                                                  uVar65 >> 0x28) == -1),
                                                  CONCAT14(-((char)((ulong)uVar65 >> 0x20) == -1),
                                                           CONCAT13(-((char)((ulong)uVar65 >> 0x18)
                                                                     == -1),CONCAT12(-((char)((ulong
                                                  )uVar65 >> 0x10) == -1),
                                                  CONCAT11(-((char)((ulong)uVar65 >> 8) == -1),
                                                           -((char)uVar65 == -1)))))))),1);
                                if ((bVar67 & 1) != 0) goto code_r0x00542d3c;
                                lVar60 = lVar60 + 8;
                                uVar40 = uVar40 + lVar60 & (ulong)puVar18;
                                uVar65 = *(undefined8 *)((long)plVar17 + uVar40);
                                uVar30 = CONCAT17(-((byte)((ulong)uVar65 >> 0x38) == bVar38),
                                                  CONCAT16(-((byte)((ulong)uVar65 >> 0x30) == bVar38
                                                            ),CONCAT15(-((byte)((ulong)uVar65 >>
                                                                               0x28) == bVar38),
                                                                       CONCAT14(-((byte)((ulong)
                                                  uVar65 >> 0x20) == bVar38),
                                                  CONCAT13(-((byte)((ulong)uVar65 >> 0x18) == bVar38
                                                            ),CONCAT12(-((byte)((ulong)uVar65 >>
                                                                               0x10) == bVar38),
                                                                       CONCAT11(-((byte)((ulong)
                                                  uVar65 >> 8) == bVar38),-((byte)uVar65 == bVar38))
                                                  )))))) & 0x8080808080808080;
                              }
                              uVar62 = (uVar30 >> 7 & 0xff00ff00ff00ff00) >> 8 |
                                       (uVar30 >> 7 & 0xff00ff00ff00ff) << 8;
                              uVar62 = (uVar62 & 0xffff0000ffff0000) >> 0x10 |
                                       (uVar62 & 0xffff0000ffff) << 0x10;
                              uVar62 = uVar40 + ((ulong)LZCOUNT(uVar62 >> 0x20 | uVar62 << 0x20) >>
                                                3) & (ulong)puVar18;
                              if (lVar55 == plVar17[uVar62 * -2 + -2]) break;
                              uVar30 = uVar30 - 1 & uVar30;
                            }
                            lVar55 = *(long *)plVar17[uVar62 * -2 + -1];
                            *(long *)plVar17[uVar62 * -2 + -1] = lVar55 + 1;
                            if (lVar55 < 0) {
                              func_0x007a05dc();
                              goto code_r0x0054319c;
                            }
                            lVar55 = plVar17[uVar62 * -2 + -1];
                            *(long *)(unaff_x29 + -0x90) = lVar55;
                            if (lVar23 == 0) {
code_r0x00542d58:
                              func_0x007a23d8(&UNK_008aad91,0x16,&UNK_009ec548);
                              goto code_r0x0054319c;
                            }
                            lVar60 = 0;
                            uVar40 = (lVar55 + 8) * 0x517cc1b727220a95;
                            bVar38 = (byte)(uVar40 >> 0x39);
                            uVar40 = uVar40 & (ulong)puVar18;
                            uVar65 = *(undefined8 *)((long)plVar17 + uVar40);
                            uVar30 = CONCAT17(-((byte)((ulong)uVar65 >> 0x38) == bVar38),
                                              CONCAT16(-((byte)((ulong)uVar65 >> 0x30) == bVar38),
                                                       CONCAT15(-((byte)((ulong)uVar65 >> 0x28) ==
                                                                 bVar38),CONCAT14(-((byte)((ulong)
                                                  uVar65 >> 0x20) == bVar38),
                                                  CONCAT13(-((byte)((ulong)uVar65 >> 0x18) == bVar38
                                                            ),CONCAT12(-((byte)((ulong)uVar65 >>
                                                                               0x10) == bVar38),
                                                                       CONCAT11(-((byte)((ulong)
                                                  uVar65 >> 8) == bVar38),-((byte)uVar65 == bVar38))
                                                  )))))) & 0x8080808080808080;
                            while( true ) {
                              while (uVar30 == 0) {
                                bVar67 = NEON_umaxv(CONCAT17(-((char)((ulong)uVar65 >> 0x38) == -1),
                                                             CONCAT16(-((char)((ulong)uVar65 >> 0x30
                                                                              ) == -1),
                                                                      CONCAT15(-((char)((ulong)
                                                  uVar65 >> 0x28) == -1),
                                                  CONCAT14(-((char)((ulong)uVar65 >> 0x20) == -1),
                                                           CONCAT13(-((char)((ulong)uVar65 >> 0x18)
                                                                     == -1),CONCAT12(-((char)((ulong
                                                  )uVar65 >> 0x10) == -1),
                                                  CONCAT11(-((char)((ulong)uVar65 >> 8) == -1),
                                                           -((char)uVar65 == -1)))))))),1);
                                if ((bVar67 & 1) != 0) goto code_r0x00542d58;
                                lVar60 = lVar60 + 8;
                                uVar40 = uVar40 + lVar60 & (ulong)puVar18;
                                uVar65 = *(undefined8 *)((long)plVar17 + uVar40);
                                uVar30 = CONCAT17(-((byte)((ulong)uVar65 >> 0x38) == bVar38),
                                                  CONCAT16(-((byte)((ulong)uVar65 >> 0x30) == bVar38
                                                            ),CONCAT15(-((byte)((ulong)uVar65 >>
                                                                               0x28) == bVar38),
                                                                       CONCAT14(-((byte)((ulong)
                                                  uVar65 >> 0x20) == bVar38),
                                                  CONCAT13(-((byte)((ulong)uVar65 >> 0x18) == bVar38
                                                            ),CONCAT12(-((byte)((ulong)uVar65 >>
                                                                               0x10) == bVar38),
                                                                       CONCAT11(-((byte)((ulong)
                                                  uVar65 >> 8) == bVar38),-((byte)uVar65 == bVar38))
                                                  )))))) & 0x8080808080808080;
                              }
                              uVar62 = (uVar30 >> 7 & 0xff00ff00ff00ff00) >> 8 |
                                       (uVar30 >> 7 & 0xff00ff00ff00ff) << 8;
                              uVar62 = (uVar62 & 0xffff0000ffff0000) >> 0x10 |
                                       (uVar62 & 0xffff0000ffff) << 0x10;
                              uVar62 = uVar40 + ((ulong)LZCOUNT(uVar62 >> 0x20 | uVar62 << 0x20) >>
                                                3) & (ulong)puVar18;
                              if (lVar55 == plVar17[uVar62 * -2 + -2]) break;
                              uVar30 = uVar30 - 1 & uVar30;
                            }
                            lVar55 = *(long *)plVar17[uVar62 * -2 + -1];
                            *(long *)plVar17[uVar62 * -2 + -1] = lVar55 + 1;
                            if (lVar55 < 0) {
                              func_0x007a05dc();
                              goto code_r0x0054319c;
                            }
                            *(long *)(unaff_x29 + -0x88) = plVar17[uVar62 * -2 + -1];
                            puVar24 = (undefined8 *)func_0x00187bd0(0x18,8);
                            if (puVar24 == (undefined8 *)0x0) {
                              func_0x007a1f18(8,0x18);
                              goto code_r0x0054319c;
                            }
                            lVar55 = **(long **)(unaff_x29 + -0x98);
                            **(long **)(unaff_x29 + -0x98) = lVar55 + 1;
                            if (lVar55 < 0) {
                              func_0x007a05dc();
                              goto code_r0x0054319c;
                            }
                            uVar65 = *(undefined8 *)(unaff_x29 + -0x98);
                            *puVar24 = 0x8000000000000000;
                            puVar24[1] = uVar65;
                            *(undefined8 *)(unaff_x29 + -0x80) = 1;
                            *(undefined8 **)(unaff_x29 + -0x78) = puVar24;
                            *(undefined8 *)(unaff_x29 + -0x70) = 1;
                            pdVar20 = (dword *)func_0x00187bd0(0x40,8);
                            if (pdVar20 == (dword *)0x0) {
                              func_0x007a1f18(8,0x40);
                              goto code_r0x0054319c;
                            }
                            lVar55 = **(long **)(unaff_x29 + -0x88);
                            **(long **)(unaff_x29 + -0x88) = lVar55 + 1;
                            if (lVar55 < 0) {
                              func_0x007a05dc();
                              goto code_r0x0054319c;
                            }
                            plVar47 = *(long **)(unaff_x29 + -0x88);
                            *(undefined8 *)pdVar20 = 0;
                            *(long **)(pdVar20 + 2) = plVar47;
                            iStack0000000000000108 = (int)*(undefined8 *)(unaff_x29 + -0x78);
                            uStack000000000000010c =
                                 (undefined4)((ulong)*(undefined8 *)(unaff_x29 + -0x78) >> 0x20);
                            uStack0000000000000100._0_4_ = (uint)*(undefined8 *)(unaff_x29 + -0x80);
                            uStack0000000000000100._4_4_ =
                                 (undefined4)((ulong)*(undefined8 *)(unaff_x29 + -0x80) >> 0x20);
                            uStack0000000000000110 = (undefined4)*(undefined8 *)(unaff_x29 + -0x70);
                            uStack0000000000000114 =
                                 (undefined4)((ulong)*(undefined8 *)(unaff_x29 + -0x70) >> 0x20);
                            uStack0000000000000118._0_4_ = 1;
                            uStack0000000000000118._4_4_ = 0;
                            uStack0000000000000128 = (dword *)((long)&MACH_HEADER.magic + 1);
                            in_stack_00000130 =
                                 (dword *)((ulong)in_stack_00000130 & 0xffffffffffff0000);
                            in_stack_00000120 = pdVar20;
                            if (lVar22 == 0) {
                              func_0x00582d00(auStack_7ffffffe + 0x8000024e,&UNK_009ec560);
                              plVar47 = *(long **)(unaff_x29 + -0x88);
                            }
                            lVar55 = lVar22 * 0x38;
                            *(ulong *)(lVar55 + 0x10) =
                                 CONCAT44(uStack000000000000010c,iStack0000000000000108);
                            *(ulong *)(lVar55 + 8) =
                                 CONCAT44(uStack0000000000000100._4_4_,(uint)uStack0000000000000100)
                            ;
                            *(ulong *)(lVar55 + 0x20) =
                                 CONCAT44(uStack0000000000000118._4_4_,
                                          (undefined4)uStack0000000000000118);
                            *(ulong *)(lVar55 + 0x18) =
                                 CONCAT44(uStack0000000000000114,uStack0000000000000110);
                            *(dword **)(lVar55 + 0x30) = uStack0000000000000128;
                            *(dword **)(lVar55 + 0x28) = in_stack_00000120;
                            *(dword **)(lVar55 + 0x38) = in_stack_00000130;
                            lVar22 = lVar22 + 1;
                            plVar26 = *(long **)(unaff_x29 + -0x90);
                            if ((plVar26 == plVar47) && (lVar23 != 0)) {
                              lVar55 = 0;
                              bVar38 = (byte)((ulong)((long)(plVar26 + 1) * 0x517cc1b727220a95) >>
                                             0x39);
                              uVar40 = (long)(plVar26 + 1) * 0x517cc1b727220a95 & (ulong)puVar18;
                              uVar65 = *(undefined8 *)((long)plVar17 + uVar40);
                              uVar30 = CONCAT17(-((byte)((ulong)uVar65 >> 0x38) == bVar38),
                                                CONCAT16(-((byte)((ulong)uVar65 >> 0x30) == bVar38),
                                                         CONCAT15(-((byte)((ulong)uVar65 >> 0x28) ==
                                                                   bVar38),CONCAT14(-((byte)((ulong)
                                                  uVar65 >> 0x20) == bVar38),
                                                  CONCAT13(-((byte)((ulong)uVar65 >> 0x18) == bVar38
                                                            ),CONCAT12(-((byte)((ulong)uVar65 >>
                                                                               0x10) == bVar38),
                                                                       CONCAT11(-((byte)((ulong)
                                                  uVar65 >> 8) == bVar38),-((byte)uVar65 == bVar38))
                                                  )))))) & 0x8080808080808080;
                              while( true ) {
                                while (uVar30 == 0) {
                                  bVar67 = NEON_umaxv(CONCAT17(-((char)((ulong)uVar65 >> 0x38) == -1
                                                                ),CONCAT16(-((char)((ulong)uVar65 >>
                                                                                   0x30) == -1),
                                                                           CONCAT15(-((char)((ulong)
                                                  uVar65 >> 0x28) == -1),
                                                  CONCAT14(-((char)((ulong)uVar65 >> 0x20) == -1),
                                                           CONCAT13(-((char)((ulong)uVar65 >> 0x18)
                                                                     == -1),CONCAT12(-((char)((ulong
                                                  )uVar65 >> 0x10) == -1),
                                                  CONCAT11(-((char)((ulong)uVar65 >> 8) == -1),
                                                           -((char)uVar65 == -1)))))))),1);
                                  if ((bVar67 & 1) != 0) goto code_r0x005426bc;
                                  lVar55 = lVar55 + 8;
                                  uVar40 = uVar40 + lVar55 & (ulong)puVar18;
                                  uVar65 = *(undefined8 *)((long)plVar17 + uVar40);
                                  uVar30 = CONCAT17(-((byte)((ulong)uVar65 >> 0x38) == bVar38),
                                                    CONCAT16(-((byte)((ulong)uVar65 >> 0x30) ==
                                                              bVar38),CONCAT15(-((byte)((ulong)
                                                  uVar65 >> 0x28) == bVar38),
                                                  CONCAT14(-((byte)((ulong)uVar65 >> 0x20) == bVar38
                                                            ),CONCAT13(-((byte)((ulong)uVar65 >>
                                                                               0x18) == bVar38),
                                                                       CONCAT12(-((byte)((ulong)
                                                  uVar65 >> 0x10) == bVar38),
                                                  CONCAT11(-((byte)((ulong)uVar65 >> 8) == bVar38),
                                                           -((byte)uVar65 == bVar38)))))))) &
                                           0x8080808080808080;
                                }
                                uVar62 = (uVar30 >> 7 & 0xff00ff00ff00ff00) >> 8 |
                                         (uVar30 >> 7 & 0xff00ff00ff00ff) << 8;
                                uVar62 = (uVar62 & 0xffff0000ffff0000) >> 0x10 |
                                         (uVar62 & 0xffff0000ffff) << 0x10;
                                if (plVar47 ==
                                    (long *)plVar17[(uVar40 + ((ulong)LZCOUNT(uVar62 >> 0x20 |
                                                                              uVar62 << 0x20) >> 3)
                                                    & (ulong)puVar18) * -2 + -2]) break;
                                uVar30 = uVar30 - 1 & uVar30;
                              }
                              lVar55 = *plVar26;
                              *plVar26 = lVar55 + 1;
                              if (lVar55 < 0) {
                                func_0x007a05dc();
                                goto code_r0x0054319c;
                              }
                              uVar65 = *(undefined8 *)(unaff_x29 + -0x90);
                              uStack0000000000000100._0_4_ = (uint)uVar65;
                              uStack0000000000000100._4_4_ = (undefined4)((ulong)uVar65 >> 0x20);
                              lVar55 = *(long *)(unaff_x29 + -0xe0);
                              if (lVar55 == *(long *)(unaff_x29 + -0xf0)) {
                                func_0x0058321c(unaff_x29 + -0xf0,&UNK_009ec578);
                              }
                              *(undefined8 *)(*(long *)(unaff_x29 + -0xe8) + lVar55 * 8) = uVar65;
                              *(long *)(unaff_x29 + -0xe0) = lVar55 + 1;
                              plVar26 = *(long **)(unaff_x29 + -0x90);
                            }
code_r0x005426bc:
                            plVar47 = (long *)func_0x0056237c(auStack_7ffffffe + 0x8000020e,plVar26,
                                                              *(undefined8 *)(unaff_x29 + -0x98));
                            uStack0000000000000100._0_4_ = (uint)plVar47;
                            uStack0000000000000100._4_4_ = (undefined4)((ulong)plVar47 >> 0x20);
                            if (plVar47 != (long *)0x0) {
                              lVar55 = *plVar47;
                              *plVar47 = lVar55 + -1;
                              LORelease();
                              if (lVar55 == 1) {
                                func_0x005d2ac4(&uStack0000000000000100);
                              }
                            }
                            lVar55 = **(long **)(unaff_x29 + -0x88);
                            **(long **)(unaff_x29 + -0x88) = lVar55 + -1;
                            LORelease();
                            if (lVar55 == 1) {
                              func_0x005d2ac4(unaff_x29 + -0x88);
                            }
                          }
                          if (lVar23 == 0) {
code_r0x00542d88:
                            puVar36 = &UNK_009ec590;
code_r0x00542d9c:
                            func_0x007a23d8(&UNK_008aad91,0x16,puVar36);
                            goto code_r0x0054319c;
                          }
                          lVar55 = 0;
                          plVar47 = *(long **)(unaff_x29 + -0xa0);
                          bVar38 = (byte)((ulong)((long)(plVar47 + 1) * 0x517cc1b727220a95) >> 0x39)
                          ;
                          uVar40 = (long)(plVar47 + 1) * 0x517cc1b727220a95 & (ulong)puVar18;
                          uVar65 = *(undefined8 *)((long)plVar17 + uVar40);
                          uVar30 = CONCAT17(-((byte)((ulong)uVar65 >> 0x38) == bVar38),
                                            CONCAT16(-((byte)((ulong)uVar65 >> 0x30) == bVar38),
                                                     CONCAT15(-((byte)((ulong)uVar65 >> 0x28) ==
                                                               bVar38),CONCAT14(-((byte)((ulong)
                                                  uVar65 >> 0x20) == bVar38),
                                                  CONCAT13(-((byte)((ulong)uVar65 >> 0x18) == bVar38
                                                            ),CONCAT12(-((byte)((ulong)uVar65 >>
                                                                               0x10) == bVar38),
                                                                       CONCAT11(-((byte)((ulong)
                                                  uVar65 >> 8) == bVar38),-((byte)uVar65 == bVar38))
                                                  )))))) & 0x8080808080808080;
                          while( true ) {
                            while (uVar30 == 0) {
                              bVar67 = NEON_umaxv(CONCAT17(-((char)((ulong)uVar65 >> 0x38) == -1),
                                                           CONCAT16(-((char)((ulong)uVar65 >> 0x30)
                                                                     == -1),CONCAT15(-((char)((ulong
                                                  )uVar65 >> 0x28) == -1),
                                                  CONCAT14(-((char)((ulong)uVar65 >> 0x20) == -1),
                                                           CONCAT13(-((char)((ulong)uVar65 >> 0x18)
                                                                     == -1),CONCAT12(-((char)((ulong
                                                  )uVar65 >> 0x10) == -1),
                                                  CONCAT11(-((char)((ulong)uVar65 >> 8) == -1),
                                                           -((char)uVar65 == -1)))))))),1);
                              if ((bVar67 & 1) != 0) goto code_r0x00542d88;
                              lVar55 = lVar55 + 8;
                              uVar40 = uVar40 + lVar55 & (ulong)puVar18;
                              uVar65 = *(undefined8 *)((long)plVar17 + uVar40);
                              uVar30 = CONCAT17(-((byte)((ulong)uVar65 >> 0x38) == bVar38),
                                                CONCAT16(-((byte)((ulong)uVar65 >> 0x30) == bVar38),
                                                         CONCAT15(-((byte)((ulong)uVar65 >> 0x28) ==
                                                                   bVar38),CONCAT14(-((byte)((ulong)
                                                  uVar65 >> 0x20) == bVar38),
                                                  CONCAT13(-((byte)((ulong)uVar65 >> 0x18) == bVar38
                                                            ),CONCAT12(-((byte)((ulong)uVar65 >>
                                                                               0x10) == bVar38),
                                                                       CONCAT11(-((byte)((ulong)
                                                  uVar65 >> 8) == bVar38),-((byte)uVar65 == bVar38))
                                                  )))))) & 0x8080808080808080;
                            }
                            uVar62 = (uVar30 >> 7 & 0xff00ff00ff00ff00) >> 8 |
                                     (uVar30 >> 7 & 0xff00ff00ff00ff) << 8;
                            uVar62 = (uVar62 & 0xffff0000ffff0000) >> 0x10 |
                                     (uVar62 & 0xffff0000ffff) << 0x10;
                            uVar62 = uVar40 + ((ulong)LZCOUNT(uVar62 >> 0x20 | uVar62 << 0x20) >> 3)
                                     & (ulong)puVar18;
                            if (plVar47 == (long *)plVar17[uVar62 * -2 + -2]) break;
                            uVar30 = uVar30 - 1 & uVar30;
                          }
                          if (lVar23 == 0) {
code_r0x00542d94:
                            puVar36 = &UNK_009ec5a8;
                            goto code_r0x00542d9c;
                          }
                          lVar55 = 0;
                          uVar40 = (plVar17[uVar62 * -2 + -1] + 8) * 0x517cc1b727220a95;
                          bVar38 = (byte)(uVar40 >> 0x39);
                          uVar40 = uVar40 & (ulong)puVar18;
                          uVar65 = *(undefined8 *)((long)plVar17 + uVar40);
                          uVar30 = CONCAT17(-((byte)((ulong)uVar65 >> 0x38) == bVar38),
                                            CONCAT16(-((byte)((ulong)uVar65 >> 0x30) == bVar38),
                                                     CONCAT15(-((byte)((ulong)uVar65 >> 0x28) ==
                                                               bVar38),CONCAT14(-((byte)((ulong)
                                                  uVar65 >> 0x20) == bVar38),
                                                  CONCAT13(-((byte)((ulong)uVar65 >> 0x18) == bVar38
                                                            ),CONCAT12(-((byte)((ulong)uVar65 >>
                                                                               0x10) == bVar38),
                                                                       CONCAT11(-((byte)((ulong)
                                                  uVar65 >> 8) == bVar38),-((byte)uVar65 == bVar38))
                                                  )))))) & 0x8080808080808080;
                          while( true ) {
                            while (uVar30 == 0) {
                              bVar67 = NEON_umaxv(CONCAT17(-((char)((ulong)uVar65 >> 0x38) == -1),
                                                           CONCAT16(-((char)((ulong)uVar65 >> 0x30)
                                                                     == -1),CONCAT15(-((char)((ulong
                                                  )uVar65 >> 0x28) == -1),
                                                  CONCAT14(-((char)((ulong)uVar65 >> 0x20) == -1),
                                                           CONCAT13(-((char)((ulong)uVar65 >> 0x18)
                                                                     == -1),CONCAT12(-((char)((ulong
                                                  )uVar65 >> 0x10) == -1),
                                                  CONCAT11(-((char)((ulong)uVar65 >> 8) == -1),
                                                           -((char)uVar65 == -1)))))))),1);
                              if ((bVar67 & 1) != 0) goto code_r0x00542d94;
                              lVar55 = lVar55 + 8;
                              uVar40 = uVar40 + lVar55 & (ulong)puVar18;
                              uVar65 = *(undefined8 *)((long)plVar17 + uVar40);
                              uVar30 = CONCAT17(-((byte)((ulong)uVar65 >> 0x38) == bVar38),
                                                CONCAT16(-((byte)((ulong)uVar65 >> 0x30) == bVar38),
                                                         CONCAT15(-((byte)((ulong)uVar65 >> 0x28) ==
                                                                   bVar38),CONCAT14(-((byte)((ulong)
                                                  uVar65 >> 0x20) == bVar38),
                                                  CONCAT13(-((byte)((ulong)uVar65 >> 0x18) == bVar38
                                                            ),CONCAT12(-((byte)((ulong)uVar65 >>
                                                                               0x10) == bVar38),
                                                                       CONCAT11(-((byte)((ulong)
                                                  uVar65 >> 8) == bVar38),-((byte)uVar65 == bVar38))
                                                  )))))) & 0x8080808080808080;
                            }
                            uVar44 = (uVar30 >> 7 & 0xff00ff00ff00ff00) >> 8 |
                                     (uVar30 >> 7 & 0xff00ff00ff00ff) << 8;
                            uVar44 = (uVar44 & 0xffff0000ffff0000) >> 0x10 |
                                     (uVar44 & 0xffff0000ffff) << 0x10;
                            uVar44 = uVar40 + ((ulong)LZCOUNT(uVar44 >> 0x20 | uVar44 << 0x20) >> 3)
                                     & (ulong)puVar18;
                            if (plVar17[uVar62 * -2 + -1] == plVar17[uVar44 * -2 + -2]) break;
                            uVar30 = uVar30 - 1 & uVar30;
                          }
                          if (plVar47 == (long *)plVar17[uVar44 * -2 + -1]) {
                            lVar55 = *plVar47;
                            *plVar47 = lVar55 + -1;
                            LORelease();
                            if (lVar55 == 1) {
                              func_0x005d2ac4(unaff_x29 + -0xa0);
                            }
                          }
                          else {
                            if (*(long *)(unaff_x29 + -0xa8) == 0) {
                              puVar24 = (undefined8 *)func_0x00187bd0(0x28,8);
                              if (puVar24 == (undefined8 *)0x0) {
                                func_0x007a1f18(8,0x28);
                                goto code_r0x0054319c;
                              }
                              *puVar24 = 1;
                              *(undefined1 *)(puVar24 + 1) = 0;
                              puVar24[2] = 0x8000000000000000;
                              *(undefined8 **)(unaff_x29 + -0xa8) = puVar24;
                            }
                            puVar24 = (undefined8 *)func_0x00187bd0(0x18,8);
                            if (puVar24 == (undefined8 *)0x0) {
                              func_0x007a1f18(8,0x18);
                              goto code_r0x0054319c;
                            }
                            lVar55 = **(long **)(unaff_x29 + -0xa8);
                            **(long **)(unaff_x29 + -0xa8) = lVar55 + 1;
                            if (lVar55 < 0) {
                              func_0x007a05dc();
                              goto code_r0x0054319c;
                            }
                            uVar65 = *(undefined8 *)(unaff_x29 + -0xa8);
                            *puVar24 = 0x8000000000000000;
                            puVar24[1] = uVar65;
                            *(undefined8 *)(unaff_x29 + -0x80) = 1;
                            *(undefined8 **)(unaff_x29 + -0x78) = puVar24;
                            *(undefined8 *)(unaff_x29 + -0x70) = 1;
                            pdVar20 = (dword *)func_0x00187bd0(0x40,8);
                            if (pdVar20 == (dword *)0x0) {
                              func_0x007a1f18(8,0x40);
                              goto code_r0x0054319c;
                            }
                            lVar55 = **(long **)(unaff_x29 + -0xa0);
                            **(long **)(unaff_x29 + -0xa0) = lVar55 + 1;
                            if (lVar55 < 0) {
                              func_0x007a05dc();
                              goto code_r0x0054319c;
                            }
                            plVar47 = *(long **)(unaff_x29 + -0xa0);
                            *(undefined8 *)pdVar20 = 0;
                            *(long **)(pdVar20 + 2) = plVar47;
                            iStack0000000000000108 = (int)*(undefined8 *)(unaff_x29 + -0x78);
                            uStack000000000000010c =
                                 (undefined4)((ulong)*(undefined8 *)(unaff_x29 + -0x78) >> 0x20);
                            uStack0000000000000100._0_4_ = (uint)*(undefined8 *)(unaff_x29 + -0x80);
                            uStack0000000000000100._4_4_ =
                                 (undefined4)((ulong)*(undefined8 *)(unaff_x29 + -0x80) >> 0x20);
                            uStack0000000000000110 = (undefined4)*(undefined8 *)(unaff_x29 + -0x70);
                            uStack0000000000000114 =
                                 (undefined4)((ulong)*(undefined8 *)(unaff_x29 + -0x70) >> 0x20);
                            uStack0000000000000118._0_4_ = 1;
                            uStack0000000000000118._4_4_ = 0;
                            uStack0000000000000128 = (dword *)((long)&MACH_HEADER.magic + 1);
                            in_stack_00000130 =
                                 (dword *)((ulong)in_stack_00000130 & 0xffffffffffff0000);
                            in_stack_00000120 = pdVar20;
                            if (lVar22 == 0) {
                              func_0x00582d00(auStack_7ffffffe + 0x8000024e,&UNK_009ec5c0);
                              plVar47 = *(long **)(unaff_x29 + -0xa0);
                            }
                            lVar55 = lVar22 * 0x38;
                            *(ulong *)(lVar55 + 0x10) =
                                 CONCAT44(uStack000000000000010c,iStack0000000000000108);
                            *(ulong *)(lVar55 + 8) =
                                 CONCAT44(uStack0000000000000100._4_4_,(uint)uStack0000000000000100)
                            ;
                            *(ulong *)(lVar55 + 0x20) =
                                 CONCAT44(uStack0000000000000118._4_4_,
                                          (undefined4)uStack0000000000000118);
                            *(ulong *)(lVar55 + 0x18) =
                                 CONCAT44(uStack0000000000000114,uStack0000000000000110);
                            *(dword **)(lVar55 + 0x30) = uStack0000000000000128;
                            *(dword **)(lVar55 + 0x28) = in_stack_00000120;
                            *(dword **)(lVar55 + 0x38) = in_stack_00000130;
                            lVar22 = lVar22 + 1;
                            lVar55 = *plVar47;
                            *plVar47 = lVar55 + 1;
                            if (lVar55 < 0) {
                              func_0x007a05dc();
                              goto code_r0x0054319c;
                            }
                            uVar65 = *(undefined8 *)(unaff_x29 + -0xa0);
                            uStack0000000000000100._0_4_ = (uint)uVar65;
                            uStack0000000000000100._4_4_ = (undefined4)((ulong)uVar65 >> 0x20);
                            lVar55 = **(long **)(unaff_x29 + -0xa8);
                            **(long **)(unaff_x29 + -0xa8) = lVar55 + 1;
                            if (lVar55 < 0) {
                              func_0x007a05dc();
                              goto code_r0x0054319c;
                            }
                            plVar47 = (long *)func_0x0056237c(auStack_7ffffffe + 0x8000020e,uVar65,
                                                              *(undefined8 *)(unaff_x29 + -0xa8));
                            *(long **)(unaff_x29 + -0x80) = plVar47;
                            if (plVar47 != (long *)0x0) {
                              lVar55 = *plVar47;
                              *plVar47 = lVar55 + -1;
                              LORelease();
                              if (lVar55 == 1) {
                                func_0x005d2ac4(unaff_x29 + -0x80);
                              }
                            }
                            uVar65 = *(undefined8 *)(unaff_x29 + -0xa0);
                            uStack0000000000000100._0_4_ = (uint)uVar65;
                            uStack0000000000000100._4_4_ = (undefined4)((ulong)uVar65 >> 0x20);
                            lVar55 = *(long *)(unaff_x29 + -0xe0);
                            if (lVar55 == *(long *)(unaff_x29 + -0xf0)) {
                              func_0x0058321c(unaff_x29 + -0xf0,&UNK_009ec5d8);
                            }
                            *(undefined8 *)(*(long *)(unaff_x29 + -0xe8) + lVar55 * 8) = uVar65;
                            *(long *)(unaff_x29 + -0xe0) = lVar55 + 1;
                          }
                          lVar55 = *(long *)(unaff_x29 + -200);
                        }
                        lVar55 = *(long *)(unaff_x29 + -0xb8);
                        uStack0000000000000118 =
                             (long *)(lVar55 + *(long *)(unaff_x29 + -0xb0) * 0x38);
                        uStack0000000000000100._0_4_ = (uint)lVar55;
                        uStack0000000000000100._4_4_ = (undefined4)((ulong)lVar55 >> 0x20);
                        uStack0000000000000110 = (undefined4)*(undefined8 *)(unaff_x29 + -0xc0);
                        uStack0000000000000114 =
                             (undefined4)((ulong)*(undefined8 *)(unaff_x29 + -0xc0) >> 0x20);
                        iStack0000000000000108 = (uint)uStack0000000000000100;
                        uStack000000000000010c = uStack0000000000000100._4_4_;
                        func_0x00552ee8(auStack_7ffffffe + 0x8000024e,&uStack0000000000000100,
                                        &UNK_009ec5f0);
                        uStack0000000000000110 = 8;
                        uStack0000000000000114 = 0;
                        iStack0000000000000108 = 0;
                        uStack000000000000010c = 0;
                        uStack0000000000000118._0_4_ = (undefined4)lVar22;
                        uStack0000000000000118._4_4_ = (undefined4)((ulong)lVar22 >> 0x20);
                        uStack0000000000000100._0_4_ = uVar9;
                        uStack0000000000000100._4_4_ = uVar11;
                        if (lVar15 == 0) {
                          func_0x00582c4c(auStack_7ffffffe + 0x800002b6,&UNK_009ec608);
                        }
                        lVar22 = lVar15 * 0x20;
                        *(ulong *)(lVar22 + 0x10) =
                             CONCAT44(uStack000000000000010c,iStack0000000000000108);
                        *(ulong *)(lVar22 + 8) =
                             CONCAT44(uStack0000000000000100._4_4_,(uint)uStack0000000000000100);
                        *(ulong *)(lVar22 + 0x20) =
                             CONCAT44(uStack0000000000000118._4_4_,
                                      (undefined4)uStack0000000000000118);
                        *(ulong *)(lVar22 + 0x18) =
                             CONCAT44(uStack0000000000000114,uStack0000000000000110);
                        lVar15 = lVar15 + 1;
                        plVar47 = *(long **)(unaff_x29 + -0xa8);
                        if (plVar47 != (long *)0x0) {
                          lVar22 = *plVar47;
                          *plVar47 = lVar22 + -1;
                          LORelease();
                          if (lVar22 == 1) {
                            func_0x005d2ac4(unaff_x29 + -0xa8);
                          }
                        }
                        func_0x0053a3f4(auStack_7ffffffe + 0x8000026e);
                        func_0x0053a3f4(auStack_7ffffffe + 0x8000020e);
                        func_0x00557a6c(unaff_x29 + -0xd8);
                        if (*(long *)(unaff_x29 + -0xd8) != 0) {
                          func_0x00187bd4(*(undefined8 *)(unaff_x29 + -0xd0),
                                          *(long *)(unaff_x29 + -0xd8) << 3,8);
                        }
                        func_0x00557a6c(unaff_x29 + -0xf0);
                        plVar26 = plVar17;
                        puVar77 = puVar18;
                        plVar47 = plVar34;
                        lVar22 = lVar23;
                        if (*(long *)(unaff_x29 + -0xf0) != 0) {
                          func_0x00187bd4(*(undefined8 *)(unaff_x29 + -0xe8),
                                          *(long *)(unaff_x29 + -0xf0) << 3,8);
                        }
                      }
                    }
                  }
code_r0x00541e58:
                  lVar45 = lVar45 + 0x108;
                  lVar43 = lVar43 + 1;
                } while (lVar45 != lVar50);
                uVar30 = *(ulong *)(lVar48 + 0x28);
              }
              if ((uVar30 <= uVar31) ||
                 (plVar64 = (long *)(*(long *)(lVar48 + 0x20) + uVar31 * 0x20),
                 *plVar64 == -0x8000000000000000)) {
                in_stack_00000050 = (dword *)&UNK_009ec4e8;
                goto code_r0x00543020;
              }
              *(undefined8 *)(unaff_x29 + -0x80) = 8;
              *(undefined8 *)(unaff_x29 + -0x78) = 8;
              *(undefined8 *)(unaff_x29 + -0x70) = 0;
              *(long *)(unaff_x29 + -0x68) = lVar15 * 0x20 + 8;
              if (lVar15 != 0) {
                plVar52 = (long *)(lVar15 << 5);
                do {
                  plVar29 = (long *)plVar52[-2];
                  if (plVar29 == (long *)0x8000000000000000) {
                    pdVar35 = (dword *)(plVar52 + -3);
                    break;
                  }
                  pdVar20 = (dword *)plVar52[-1];
                  lVar15 = *plVar52;
                  func_0x00556400(auStack_7ffffffe + 0x8000026e,plVar64,plVar52[-3],plVar52[-3] + 1)
                  ;
                  iStack0000000000000108 = (int)puVar77;
                  uStack000000000000010c = (undefined4)((ulong)puVar77 >> 0x20);
                  uStack0000000000000100._0_4_ = (uint)plVar26;
                  uStack0000000000000100._4_4_ = (undefined4)((ulong)plVar26 >> 0x20);
                  uStack0000000000000118._0_4_ = (undefined4)lVar22;
                  uStack0000000000000118._4_4_ = (undefined4)((ulong)lVar22 >> 0x20);
                  uStack0000000000000110 = SUB84(plVar47,0);
                  uStack0000000000000114 = (undefined4)((ulong)plVar47 >> 0x20);
                  in_stack_00000120 = pdVar63;
                  uStack0000000000000128 = pdVar20;
                  in_stack_00000130 = pdVar20;
                  in_stack_00000138 = plVar29;
                  in_stack_00000140 = pdVar20 + lVar15 * 0xe;
                  func_0x005835b8(&uStack0000000000000100,&UNK_009ec370);
                  func_0x0057eaa0(&uStack0000000000000100);
                  func_0x005936cc(&uStack0000000000000128);
                  plVar52 = plVar52 + -4;
                } while (plVar52 != (long *)0x0);
                *(dword **)(unaff_x29 + -0x68) = pdVar35;
              }
              func_0x00592f2c(unaff_x29 + -0x80);
              puVar27 = puVar28;
            } while (puVar28 != puVar61);
          }
          if (plVar58 != (long *)0x0) {
            func_0x00187bd4(puVar37,(long)plVar58 << 2,4);
          }
          func_0x0053defc(in_stack_000000f8);
          return;
        }
        func_0x007a23bc(&UNK_009ec9c8);
        goto code_r0x0054319c;
      }
      puVar36 = &UNK_009ec9b0;
    }
  }
  else {
    puVar36 = &UNK_009ec740;
  }
  func_0x007a23bc(puVar36);
code_r0x0054319c:
                    /* WARNING: Does not return */
  pcVar14 = (code *)SoftwareBreakpoint(1,0x5431a0);
  (*pcVar14)();
}

