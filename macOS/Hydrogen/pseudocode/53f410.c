
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_0053f410(void)

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
  undefined8 *puVar23;
  dword *pdVar24;
  long *plVar25;
  uint *puVar27;
  uint *puVar26;
  long *plVar28;
  ulong uVar29;
  ulong uVar30;
  dword *pdVar31;
  undefined8 *puVar32;
  long *plVar33;
  dword *pdVar34;
  undefined *puVar35;
  uint *puVar36;
  byte bVar37;
  undefined8 *puVar38;
  ulong uVar39;
  undefined8 *puVar40;
  ulong uVar41;
  long lVar42;
  ulong uVar43;
  long lVar44;
  ulong uVar45;
  long unaff_x19;
  long *plVar46;
  long lVar47;
  ulong *puVar48;
  long lVar49;
  uint *unaff_x20;
  dword *pdVar50;
  long *plVar51;
  dword dVar52;
  uint *unaff_x21;
  undefined8 uVar53;
  long lVar54;
  undefined1 *unaff_x22;
  dword *pdVar55;
  undefined8 *puVar56;
  long *unaff_x23;
  long *plVar57;
  uint uVar58;
  ulong unaff_x24;
  long lVar59;
  long unaff_x25;
  uint *puVar60;
  long lVar61;
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
  
code_r0x0053f410:
  lVar61 = unaff_x23[1];
  if (unaff_x19 != 0) {
    _memmove(lVar61 + 0x108,lVar61,unaff_x19 * 0x108);
  }
  _memcpy(lVar61,&uStack0000000000000100,0x108);
  unaff_x23[2] = unaff_x19 + 1;
  lVar61 = *(long *)(unaff_x25 + 0xd8);
  uVar29 = (ulong)in_stack_000002b8;
code_r0x0053f44c:
code_r0x0053f458:
  uVar66 = _UNK_009ee250;
  uVar53 = _UNK_009ee248;
  uVar65 = _UNK_009ee238;
  *(undefined8 *)(unaff_x29 + -0x78) = _UNK_009ee240;
  *(undefined8 *)(unaff_x29 + -0x80) = uVar65;
  *(undefined8 *)(unaff_x29 + -0x68) = uVar66;
  *(undefined8 *)(unaff_x29 + -0x70) = uVar53;
  if ((uVar29 < *(ulong *)(lVar61 + 0x28)) &&
     (puVar23 = (undefined8 *)(*(long *)(lVar61 + 0x20) + uVar29 * 0x20),
     (uint *)*puVar23 != unaff_x21)) {
    uStack00000000000000d0 = (ulong)*(uint *)((long)puVar23 + 0x1c) << 0x20 | 0xffffffff;
    uVar30 = 0;
    puVar35 = &UNK_008abc00;
    lVar22 = *(long *)(lVar61 + 0x38);
    uVar29 = *(ulong *)(lVar61 + 0x40);
  }
  else {
    uStack00000000000000d0 = 0xffffffffffffffff;
    uVar30 = 0;
    puVar35 = &UNK_008abc00;
    lVar22 = *(long *)(lVar61 + 0x38);
    uVar29 = *(ulong *)(lVar61 + 0x40);
  }
  do {
    uVar39 = uStack00000000000000d0 & 0xffffffff;
    if (uVar39 < uVar29) {
      lVar22 = lVar22 + uVar39 * (unaff_x24 & 0xffffffff);
      uStack00000000000000d0 =
           uStack00000000000000d0 & 0xffffffff00000000 | (ulong)*(uint *)(lVar22 + 0x20);
      uVar62 = (ulong)*(uint *)(lVar22 + 0x2c);
    }
    else {
      uStack00000000000000d0 = uStack00000000000000d0 >> 0x20;
      do {
        if (uVar29 <= uStack00000000000000d0) goto LAB_0053fe98;
        lVar61 = lVar22 + uStack00000000000000d0 * unaff_x24;
        uStack00000000000000d0 = (ulong)*(uint *)(lVar61 + 0x24);
        uVar2 = *(uint *)(lVar61 + 0x28);
        uVar62 = (ulong)uVar2;
      } while (uVar2 == 0xffffffff);
      uStack00000000000000d0 = uVar39 | uStack00000000000000d0 << 0x20;
    }
LAB_0053f61c:
    func_0x004d1c68(unaff_x29 + -0x80,uVar62);
    lVar61 = *(long *)(unaff_x25 + 0xd8);
    if ((uVar62 < *(ulong *)(lVar61 + 0x28)) &&
       (puVar23 = (undefined8 *)(*(long *)(lVar61 + 0x20) + uVar62 * 0x20),
       (uint *)*puVar23 != unaff_x21)) {
      uVar65 = puVar23[3];
    }
    else {
      uVar65 = 0xffffffffffffffff;
    }
    uStack0000000000000100._0_4_ = 0;
    uStack0000000000000100._4_4_ = 0;
    iStack0000000000000108 = (int)*(undefined8 *)(lVar61 + 0x38);
    uStack000000000000010c = (undefined4)((ulong)*(undefined8 *)(lVar61 + 0x38) >> 0x20);
    uStack0000000000000110 = (undefined4)*(undefined8 *)(lVar61 + 0x40);
    uStack0000000000000114 = (undefined4)((ulong)*(undefined8 *)(lVar61 + 0x40) >> 0x20);
    uStack0000000000000118._0_4_ = (undefined4)uVar65;
    uStack0000000000000118._4_4_ = (undefined4)((ulong)uVar65 >> 0x20);
    in_stack_00000120 = (dword *)CONCAT44(in_stack_00000120._4_4_,(int)uVar62);
    func_0x0055b13c(unaff_x29 + -0xf0,&uStack0000000000000100,&UNK_009ec388);
    plVar46 = *(long **)(unaff_x29 + -0xe8);
    lVar61 = *(long *)(unaff_x29 + -0xe0);
    if ((lVar61 == 1) && (*(char *)(*plVar46 + 0x18) != '\0')) {
      func_0x007a247c(&UNK_008aaee6,0x4c,&UNK_009ece10);
      goto code_r0x0054319c;
    }
    _iStack0000000000000108 = plVar46 + lVar61 * 3;
    uStack0000000000000100._0_4_ = (uint)plVar46;
    uStack0000000000000100._4_4_ = (undefined4)((ulong)plVar46 >> 0x20);
    _uStack0000000000000110 = (long *)(auStack_7ffffffe + 0x800002b6);
    func_0x00559710(unaff_x29 + -0xd8,&uStack0000000000000100,&UNK_009ec388);
    lVar22 = *(long *)(unaff_x29 + -200);
    if (lVar22 != 0) {
      puVar60 = *(uint **)(unaff_x29 + -0xd0);
      puVar18 = puVar60 + 1;
      puVar36 = puVar60;
      do {
        puVar26 = puVar18;
        uVar2 = *puVar36;
        uVar29 = (ulong)uVar2;
        if ((*(ulong *)(*(long *)(in_stack_000000f8 + 0xd8) + 0x40) <= uVar29) ||
           (puVar23 = (undefined8 *)
                      (*(long *)(*(long *)(in_stack_000000f8 + 0xd8) + 0x38) +
                      uVar29 * (unaff_x24 & 0xffffffff)), (uint *)*puVar23 == unaff_x21)) {
          func_0x007a23bc(&UNK_009ece28);
          goto code_r0x0054319c;
        }
        uVar65 = 0;
        plVar46 = (long *)puVar23[2];
        auVar74._8_8_ = 0;
        auVar74._0_8_ = plVar46;
        uVar30 = in_stack_00000080;
        if ((SUB168(auVar74 * ZEXT816(0x18),8) != 0) ||
           (uVar39 = (long)plVar46 * 0x18, 0x7ffffffffffffff8 < uVar39)) {
code_r0x00542f30:
          in_stack_00000080 = uVar30;
          func_0x007a1f00(uVar65,in_stack_00000080,&UNK_009ece40);
          goto code_r0x0054319c;
        }
        plVar57 = (long *)puVar23[1];
        if (uVar39 == 0) {
          plVar17 = (long *)0x0;
          in_stack_00000080 = 8;
        }
        else {
          in_stack_00000080 = func_0x00187bd0(uVar39,8);
          uVar65 = 8;
          uVar30 = uVar39;
          if (in_stack_00000080 == 0) goto code_r0x00542f30;
          plVar17 = plVar46;
        }
        uStack0000000000000100._0_4_ = (uint)plVar17;
        uStack0000000000000100._4_4_ = (undefined4)((ulong)plVar17 >> 0x20);
        iStack0000000000000108 = (int)in_stack_00000080;
        uStack000000000000010c = (undefined4)(in_stack_00000080 >> 0x20);
        uStack0000000000000110 = 0;
        uStack0000000000000114 = 0;
        pdVar63 = (dword *)((long)plVar46 * 0x40);
        if ((ulong)plVar46 >> 0x3a != 0 || (dword *)0x7ffffffffffffff8 < pdVar63) {
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
          in_stack_00000288 = plVar46;
        }
        in_stack_00000278 = (dword *)CONCAT44(uStack000000000000010c,iStack0000000000000108);
        in_stack_00000270 =
             (dword *)CONCAT44(uStack0000000000000100._4_4_,(uint)uStack0000000000000100);
        in_stack_00000280 = (dword *)CONCAT44(uStack0000000000000114,uStack0000000000000110);
        in_stack_00000298 = (long *)0x0;
        in_stack_000002a0 = (undefined8 *)CONCAT62((int6)((ulong)in_stack_000002a0 >> 0x10),0x100);
        if (plVar46 != (long *)0x0) {
          in_stack_000000c0 = (long *)((ulong)in_stack_000000c0 & 0xffffffffffffff00);
          plVar17 = plVar57 + 9;
          plVar33 = plVar57;
          do {
            plVar25 = plVar17;
            plVar17 = (long *)func_0x00187bd0(0x28,8);
            if (plVar17 == (long *)0x0) {
              func_0x007a1f18(8,0x28);
              goto code_r0x0054319c;
            }
            *plVar17 = 1;
            plVar17[1] = (long)in_stack_000000c0;
            plVar17[2] = (long)unaff_x21;
            *(long **)(unaff_x29 + -0xc0) = plVar17;
            if ((plVar33[1] == 0) &&
               (puVar23 = (undefined8 *)func_0x00578610(in_stack_000000f8,plVar33 + 2),
               puVar23 != (undefined8 *)0x0)) {
              lVar15 = *plVar17;
              *plVar17 = lVar15 + 1;
              if (lVar15 < 0) {
code_r0x00541b94:
                func_0x007a05dc();
              }
              else {
                uStack0000000000000100._0_4_ = (uint)plVar17;
                uStack0000000000000100._4_4_ = (undefined4)((ulong)plVar17 >> 0x20);
                lVar15 = *(long *)*puVar23;
                *(long *)*puVar23 = lVar15 + 1;
                if (-1 < lVar15) {
                  uVar53 = *puVar23;
                  uVar65 = func_0x005787f4(*(undefined8 *)(in_stack_000000f8 + 0x38),
                                           *(undefined8 *)(in_stack_000000f8 + 0x40),plVar17);
                  func_0x00589494(in_stack_000000f8,uVar65,plVar17,uVar53);
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
            lVar15 = plVar33[1];
            uStack0000000000000128 = (dword *)plVar33[6];
            in_stack_00000120 = (dword *)plVar33[5];
            in_stack_00000138 = (long *)plVar33[8];
            in_stack_00000130 = (dword *)plVar33[7];
            iStack0000000000000108 = (int)plVar33[2];
            uStack000000000000010c = (undefined4)((ulong)plVar33[2] >> 0x20);
            uStack0000000000000100._0_4_ = (uint)lVar15;
            uStack0000000000000100._4_4_ = (undefined4)((ulong)lVar15 >> 0x20);
            uStack0000000000000118._0_4_ = (undefined4)plVar33[4];
            uStack0000000000000118._4_4_ = (undefined4)((ulong)plVar33[4] >> 0x20);
            uStack0000000000000110 = (undefined4)plVar33[3];
            uStack0000000000000114 = (undefined4)((ulong)plVar33[3] >> 0x20);
            plVar33[1] = 0;
            plVar33[2] = (long)plVar17;
            plVar33[4] = (long)in_stack_00000218;
            plVar33[3] = (long)in_stack_00000210;
            plVar33[6] = in_stack_00000228;
            plVar33[5] = (long)in_stack_00000220;
            plVar33[8] = in_stack_00000238;
            plVar33[7] = in_stack_00000230;
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
            uVar39 = (*plVar33 + 8) * 0x517cc1b727220a95;
            bVar37 = (byte)(uVar39 >> 0x39);
            uVar39 = uVar39 & (ulong)in_stack_00000258;
            uVar65 = *(undefined8 *)((long)in_stack_00000250 + uVar39);
            uVar30 = CONCAT17(-((byte)((ulong)uVar65 >> 0x38) == bVar37),
                              CONCAT16(-((byte)((ulong)uVar65 >> 0x30) == bVar37),
                                       CONCAT15(-((byte)((ulong)uVar65 >> 0x28) == bVar37),
                                                CONCAT14(-((byte)((ulong)uVar65 >> 0x20) == bVar37),
                                                         CONCAT13(-((byte)((ulong)uVar65 >> 0x18) ==
                                                                   bVar37),CONCAT12(-((byte)((ulong)
                                                  uVar65 >> 0x10) == bVar37),
                                                  CONCAT11(-((byte)((ulong)uVar65 >> 8) == bVar37),
                                                           -((byte)uVar65 == bVar37)))))))) &
                     0x8080808080808080;
            while( true ) {
              while (uVar30 == 0) {
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
                uVar39 = uVar39 + lVar15 & (ulong)in_stack_00000258;
                uVar65 = *(undefined8 *)((long)in_stack_00000250 + uVar39);
                uVar30 = CONCAT17(-((byte)((ulong)uVar65 >> 0x38) == bVar37),
                                  CONCAT16(-((byte)((ulong)uVar65 >> 0x30) == bVar37),
                                           CONCAT15(-((byte)((ulong)uVar65 >> 0x28) == bVar37),
                                                    CONCAT14(-((byte)((ulong)uVar65 >> 0x20) ==
                                                              bVar37),CONCAT13(-((byte)((ulong)
                                                  uVar65 >> 0x18) == bVar37),
                                                  CONCAT12(-((byte)((ulong)uVar65 >> 0x10) == bVar37
                                                            ),CONCAT11(-((byte)((ulong)uVar65 >> 8)
                                                                        == bVar37),
                                                                       -((byte)uVar65 == bVar37)))))
                                                  ))) & 0x8080808080808080;
              }
              uVar43 = (uVar30 >> 7 & 0xff00ff00ff00ff00) >> 8 |
                       (uVar30 >> 7 & 0xff00ff00ff00ff) << 8;
              uVar43 = (uVar43 & 0xffff0000ffff0000) >> 0x10 | (uVar43 & 0xffff0000ffff) << 0x10;
              uVar43 = uVar39 + ((ulong)LZCOUNT(uVar43 >> 0x20 | uVar43 << 0x20) >> 3) &
                       (ulong)in_stack_00000258;
              if (*plVar33 == *(long *)(in_stack_00000250 + uVar43 * -4 + -4)) break;
              uVar30 = uVar30 - 1 & uVar30;
            }
            lVar15 = **(long **)(in_stack_00000250 + uVar43 * -4 + -2);
            **(long **)(in_stack_00000250 + uVar43 * -4 + -2) = lVar15 + 1;
            if (lVar15 < 0) {
              func_0x007a05dc();
              goto code_r0x0054319c;
            }
            lVar47 = *(long *)(in_stack_00000250 + uVar43 * -4 + -2);
            lVar15 = *(long *)*plVar33;
            *(long *)*plVar33 = lVar15 + -1;
            LORelease();
            if (lVar15 == 1) {
              func_0x005d2ac4(plVar33);
            }
            *plVar33 = lVar47;
            lVar15 = 0;
            if (plVar25 != plVar57 + (long)plVar46 * 9) {
              lVar15 = 0x48;
            }
            plVar17 = (long *)((long)plVar25 + lVar15);
            plVar33 = plVar25;
          } while (plVar25 != plVar57 + (long)plVar46 * 9);
        }
        unaff_x24 = 0x30;
        if (in_stack_00000280 != (dword *)0x0) {
          lVar15 = *(long *)(in_stack_000000f8 + 0xd8);
          uVar30 = uVar62;
          if (lVar61 == 1) {
code_r0x0053fd90:
            if (uVar30 < *(ulong *)(lVar15 + 0x28)) {
              puVar23 = (undefined8 *)(*(long *)(lVar15 + 0x20) + uVar30 * 0x20);
              if ((uint *)*puVar23 != unaff_x21) {
                uStack0000000000000118._0_4_ = 0xf;
                uStack0000000000000118._4_4_ = 0;
                puVar18 = (uint *)puVar23[2];
                in_stack_00000120 = in_stack_00000270;
                uStack0000000000000128 = in_stack_00000278;
                in_stack_00000130 = in_stack_00000280;
                in_stack_00000138 = in_stack_00000288;
                in_stack_00000140 = in_stack_00000290;
                in_stack_00000148 = in_stack_00000298;
                in_stack_00000150 = in_stack_000002a0;
                if (puVar18 == (uint *)*puVar23) {
                  func_0x005bd0a4(puVar23,&UNK_009eceb8);
                }
                _memcpy(puVar23[1] + (long)puVar18 * 0x108,&uStack0000000000000100,0x108);
                puVar23[2] = (long)puVar18 + 1;
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
            uVar30 = func_0x00594d74(lVar15 + 0x18,&uStack0000000000000100);
            lVar15 = *(long *)(in_stack_000000f8 + 0xd8);
            uVar39 = *(ulong *)(lVar15 + 0x40);
            if ((uVar29 < uVar39) &&
               (puVar23 = (undefined8 *)(*(long *)(lVar15 + 0x38) + uVar29 * 0x30),
               (uint *)*puVar23 != unaff_x21)) {
              uVar43 = (ulong)*(uint *)(puVar23 + 5);
              if ((uVar43 < *(ulong *)(lVar15 + 0x28)) &&
                 (puVar23 = (undefined8 *)(*(long *)(lVar15 + 0x20) + uVar43 * 0x20),
                 (uint *)*puVar23 != unaff_x21)) {
                if ((puVar23[2] != 0) &&
                   (lVar47 = *(long *)(puVar23[1] + puVar23[2] * 0x108 + -0xf0),
                   lVar47 == 0x19 || lVar47 == 0x16)) {
                  func_0x004d1c68(in_stack_000000f8 + 0x200,uVar30);
                  lVar15 = *(long *)(in_stack_000000f8 + 0xd8);
                  uVar39 = *(ulong *)(lVar15 + 0x40);
                }
                if (uVar29 < uVar39) {
                  lVar47 = *(long *)(lVar15 + 0x38);
                  puVar23 = (undefined8 *)(lVar47 + uVar29 * 0x30);
                  if ((uint *)*puVar23 != unaff_x21) {
                    uVar43 = puVar23[5];
                    uVar41 = *(ulong *)(lVar15 + 0x28);
                    uVar45 = uVar43 & 0xffffffff;
                    if (uVar45 < uVar41) {
                      uVar58 = *(uint *)((long)puVar23 + 0x24);
                      lVar44 = *(long *)(lVar15 + 0x20);
                      puVar18 = (uint *)(lVar44 + uVar45 * 0x20 + 0x18);
                      uVar6 = *puVar18;
                      while (uVar45 = (ulong)uVar6, uVar45 != uVar29) {
                        if (uVar39 <= uVar45) goto code_r0x0053fc20;
                        puVar18 = (uint *)(lVar47 + uVar45 * 0x30 + 0x20);
                        uVar6 = *puVar18;
                      }
                      *puVar18 = *(uint *)(puVar23 + 4);
code_r0x0053fc20:
                      uVar43 = uVar43 >> 0x20;
                      if (uVar43 < uVar41) {
                        puVar18 = (uint *)(lVar44 + uVar43 * 0x20 + 0x1c);
                        uVar6 = *puVar18;
                        while (uVar43 = (ulong)uVar6, uVar43 != uVar29) {
                          if (uVar39 <= uVar43) goto code_r0x0053fc58;
                          puVar18 = (uint *)(lVar47 + uVar43 * 0x30 + 0x24);
                          uVar6 = *puVar18;
                        }
                        *puVar18 = uVar58;
                      }
                    }
code_r0x0053fc58:
                    *(undefined4 *)(puVar23 + 4) = *(undefined4 *)(lVar15 + 0x5c);
                    *(undefined8 *)((long)puVar23 + 0x24) = 0xffffffffffffffff;
                    *(undefined4 *)((long)puVar23 + 0x2c) = 0xffffffff;
                    *(uint *)(lVar15 + 0x5c) = uVar2;
                    *(long *)(lVar15 + 0x50) = *(long *)(lVar15 + 0x50) + -1;
                    in_stack_00000210 = (dword *)*puVar23;
                    *puVar23 = unaff_x21;
                    if (in_stack_00000210 != unaff_x21) {
                      in_stack_00000220 = (dword *)puVar23[2];
                      in_stack_00000218 = (undefined8 *)puVar23[1];
                      in_stack_00000228 = puVar23[3];
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
                        func_0x00584c34(unaff_x29 + -0xc0,uVar65,uVar30,&uStack0000000000000100);
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
                        func_0x00594a8c(*(long *)(in_stack_000000f8 + 0xd8) + 0x18,uVar62,uVar30,
                                        &uStack0000000000000100);
                        func_0x004d1c68(unaff_x29 + -0x80,uVar30);
                        lVar15 = *(long *)(in_stack_000000f8 + 0xd8);
                        uVar30 = uVar30 & 0xffffffff;
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
        puVar18 = puVar26 + (puVar26 != puVar60 + lVar22);
        puVar36 = puVar26;
        in_stack_00000018 = in_stack_00000290;
      } while (puVar26 != puVar60 + lVar22);
    }
    if (*(long *)(unaff_x29 + -0xd8) != 0) {
      func_0x00187bd4(*(undefined8 *)(unaff_x29 + -0xd0),*(long *)(unaff_x29 + -0xd8) << 2,4);
    }
    if (*(long *)(unaff_x29 + -0xf0) != 0) {
      func_0x00187bd4(*(undefined8 *)(unaff_x29 + -0xe8),*(long *)(unaff_x29 + -0xf0) * 0x18,8);
    }
    puVar35 = *(undefined **)(unaff_x29 + -0x80);
    uVar30 = *(ulong *)(unaff_x29 + -0x78);
    lVar22 = *(long *)(*(long *)(in_stack_000000f8 + 0xd8) + 0x38);
    uVar29 = *(ulong *)(*(long *)(in_stack_000000f8 + 0xd8) + 0x40);
    unaff_x25 = in_stack_000000f8;
    if (*(long *)(unaff_x29 + -0x68) != 0) {
      uVar39 = uStack00000000000000d0 & 0xffffffff;
      if (uVar39 < uVar29) goto LAB_0053f504;
      do {
        uStack00000000000000d0 = uStack00000000000000d0 >> 0x20;
        do {
          if (uVar29 <= uStack00000000000000d0) goto LAB_0053fe98;
          lVar61 = lVar22 + uStack00000000000000d0 * unaff_x24;
          uStack00000000000000d0 = (ulong)*(uint *)(lVar61 + 0x24);
          uVar2 = *(uint *)(lVar61 + 0x28);
        } while (uVar2 == 0xffffffff);
        uStack00000000000000d0 = uVar39 | uStack00000000000000d0 << 0x20;
        while( true ) {
          uVar62 = (ulong)uVar2;
          lVar61 = 0;
          bVar37 = (byte)(uVar62 * 0x517cc1b727220a95 >> 0x39);
          uVar43 = uVar62 * 0x517cc1b727220a95 & uVar30;
          uVar65 = *(undefined8 *)(puVar35 + uVar43);
          uVar39 = CONCAT17(-((byte)((ulong)uVar65 >> 0x38) == bVar37),
                            CONCAT16(-((byte)((ulong)uVar65 >> 0x30) == bVar37),
                                     CONCAT15(-((byte)((ulong)uVar65 >> 0x28) == bVar37),
                                              CONCAT14(-((byte)((ulong)uVar65 >> 0x20) == bVar37),
                                                       CONCAT13(-((byte)((ulong)uVar65 >> 0x18) ==
                                                                 bVar37),CONCAT12(-((byte)((ulong)
                                                  uVar65 >> 0x10) == bVar37),
                                                  CONCAT11(-((byte)((ulong)uVar65 >> 8) == bVar37),
                                                           -((byte)uVar65 == bVar37)))))))) &
                   0x8080808080808080;
          while( true ) {
            while (uVar39 == 0) {
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
              lVar61 = lVar61 + 8;
              uVar43 = uVar43 + lVar61 & uVar30;
              uVar65 = *(undefined8 *)(puVar35 + uVar43);
              uVar39 = CONCAT17(-((byte)((ulong)uVar65 >> 0x38) == bVar37),
                                CONCAT16(-((byte)((ulong)uVar65 >> 0x30) == bVar37),
                                         CONCAT15(-((byte)((ulong)uVar65 >> 0x28) == bVar37),
                                                  CONCAT14(-((byte)((ulong)uVar65 >> 0x20) == bVar37
                                                            ),CONCAT13(-((byte)((ulong)uVar65 >>
                                                                               0x18) == bVar37),
                                                                       CONCAT12(-((byte)((ulong)
                                                  uVar65 >> 0x10) == bVar37),
                                                  CONCAT11(-((byte)((ulong)uVar65 >> 8) == bVar37),
                                                           -((byte)uVar65 == bVar37)))))))) &
                       0x8080808080808080;
            }
            uVar41 = (uVar39 >> 7 & 0xff00ff00ff00ff00) >> 8 | (uVar39 >> 7 & 0xff00ff00ff00ff) << 8
            ;
            uVar41 = (uVar41 & 0xffff0000ffff0000) >> 0x10 | (uVar41 & 0xffff0000ffff) << 0x10;
            if (uVar2 == *(uint *)(puVar35 +
                                  (uVar43 + ((ulong)LZCOUNT(uVar41 >> 0x20 | uVar41 << 0x20) >> 3) &
                                  uVar30) * -4 + -4)) break;
            uVar39 = uVar39 - 1 & uVar39;
          }
          uVar39 = uStack00000000000000d0 & 0xffffffff;
          if (uVar29 <= uVar39) break;
LAB_0053f504:
          lVar61 = lVar22 + uVar39 * (unaff_x24 & 0xffffffff);
          uStack00000000000000d0 =
               uStack00000000000000d0 & 0xffffffff00000000 | (ulong)*(uint *)(lVar61 + 0x20);
          uVar2 = *(uint *)(lVar61 + 0x2c);
        }
      } while( true );
    }
  } while( true );
code_r0x0053f2f4:
  if ((*(ulong *)(lVar61 + 0x28) <= uVar29) ||
     (unaff_x23 = (long *)(*(long *)(lVar61 + 0x20) + uVar29 * 0x20),
     (uint *)*unaff_x23 == unaff_x21)) goto code_r0x0054307c;
  func_0x00559858(unaff_x29 + -0xc0,auStack_7ffffffe + 0x8000020e,&UNK_009ec388);
  in_stack_00000228 = (long)in_stack_00000050 + (long)in_stack_00000058 + 1;
  lVar61 = *(long *)in_stack_00000050;
  in_stack_00000220 = in_stack_00000050 + 2;
  in_stack_00000218 =
       (undefined8 *)
       (CONCAT17(-(-1 < lVar61),
                 CONCAT16(-(-1 < (char)((ulong)lVar61 >> 0x30)),
                          CONCAT15(-(-1 < (char)((ulong)lVar61 >> 0x28)),
                                   CONCAT14(-(-1 < (char)((ulong)lVar61 >> 0x20)),
                                            CONCAT13(-(-1 < (char)((ulong)lVar61 >> 0x18)),
                                                     CONCAT12(-(-1 < (char)((ulong)lVar61 >> 0x10)),
                                                              CONCAT11(-(-1 < (char)((ulong)lVar61
                                                                                    >> 8)),
                                                                       -(-1 < (char)lVar61)))))))) &
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
  in_stack_00000210 = in_stack_00000050;
  in_stack_00000230 = in_stack_00000048;
  if (unaff_x19 == *unaff_x23) {
    func_0x005bd0a4(unaff_x23,&UNK_009ecdf8);
  }
  goto code_r0x0053f410;
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
    uVar29 = (long)in_stack_00000278 * 4 + 0xbU & 0xfffffffffffffff8;
    lVar15 = (long)in_stack_00000278 + uVar29 + 9;
    if (lVar15 != 0) {
      func_0x00187bd4((long)in_stack_00000270 - uVar29,lVar15,8);
    }
  }
  plVar57 = (long *)CONCAT44(uStack0000000000000100._4_4_,(uint)uStack0000000000000100);
  if (lVar61 == lVar22) goto code_r0x00540290;
  goto code_r0x00540178;
code_r0x00540544:
  in_stack_00000098 = (uint *)(uVar29 & 0xffffffff);
  if (uVar39 == 3) {
code_r0x005405d0:
    if (puVar38 == puVar23) goto code_r0x00540708;
    in_stack_00000188 = puVar38 + 1;
    uVar39 = 3;
    puVar32 = puVar38;
    puVar38 = in_stack_00000188;
  }
  else {
    if (plVar57 != (long *)0x0) {
      if (uStack00000000000000d0 == 0) {
        in_stack_00000160 = (long *)0x0;
        goto code_r0x005405bc;
      }
      plVar17 = plVar46;
      if (uVar30 == 0) {
        do {
          plVar46 = plVar17 + 1;
          lVar44 = *plVar17;
          plVar57 = plVar57 + -8;
          uVar30 = CONCAT17(-(-1 < lVar44),
                            CONCAT16(-(-1 < (char)((ulong)lVar44 >> 0x30)),
                                     CONCAT15(-(-1 < (char)((ulong)lVar44 >> 0x28)),
                                              CONCAT14(-(-1 < (char)((ulong)lVar44 >> 0x20)),
                                                       CONCAT13(-(-1 < (char)((ulong)lVar44 >> 0x18)
                                                                 ),CONCAT12(-(-1 < (char)((ulong)
                                                  lVar44 >> 0x10)),
                                                  CONCAT11(-(-1 < (char)((ulong)lVar44 >> 8)),
                                                           -(-1 < (char)lVar44)))))))) &
                   0x8080808080808080;
          plVar17 = plVar46;
        } while (uVar30 == 0);
        in_stack_00000160 = plVar57;
        in_stack_00000170 = plVar46;
      }
      uVar62 = (uVar30 >> 7 & 0xff00ff00ff00ff00) >> 8 | (uVar30 >> 7 & 0xff00ff00ff00ff) << 8;
      uVar62 = (uVar62 & 0xffff0000ffff0000) >> 0x10 | (uVar62 & 0xffff0000ffff) << 0x10;
      uVar30 = uVar30 - 1 & uVar30;
      uStack00000000000000d0 = uStack00000000000000d0 + -1;
      puVar32 = (undefined8 *)
                ((long)plVar57 + (-8 - (LZCOUNT(uVar62 >> 0x20 | uVar62 << 0x20) & 0x78U)));
      in_stack_00000168 = uVar30;
      in_stack_00000180 = uStack00000000000000d0;
      goto code_r0x005405f0;
    }
code_r0x005405bc:
    if (uVar39 == 2) {
code_r0x005405c4:
      plVar57 = (long *)0x0;
      uStack0000000000000100._0_4_ = 3;
      uStack0000000000000100._4_4_ = 0;
      goto code_r0x005405d0;
    }
    if (((uVar39 & 1) == 0) || (in_stack_000000b0 == in_stack_000000c0)) {
      if (puVar56 == puVar40) goto code_r0x005405c4;
      plVar57 = (long *)0x0;
      in_stack_00000150 = puVar56 + 3;
      in_stack_00000120 = (dword *)(puVar56 + 1);
      _uStack0000000000000110 = (long *)((long)&MACH_HEADER.magic + 2);
      uStack0000000000000118._0_4_ = SUB84(puVar56,0);
      uStack0000000000000118._4_4_ = (undefined4)((ulong)puVar56 >> 0x20);
      _iStack0000000000000108 = (long *)((long)&MACH_HEADER.magic + 1);
      uStack0000000000000100._0_4_ = 1;
      uStack0000000000000100._4_4_ = 0;
      in_stack_000000c0 = (long *)((long)&MACH_HEADER.magic + 1);
      in_stack_000000b0 = (long *)((long)&MACH_HEADER.magic + 2);
      uVar39 = 1;
      puVar32 = puVar56;
      puVar56 = in_stack_00000150;
    }
    else {
      puVar32 = &uStack0000000000000118 + (long)in_stack_000000c0;
      in_stack_000000c0 = (long *)((long)in_stack_000000c0 + 1);
      _iStack0000000000000108 = in_stack_000000c0;
      if ((undefined8 *)*puVar32 == (undefined8 *)0x0) goto code_r0x005405c4;
      plVar57 = (long *)0x0;
      puVar32 = (undefined8 *)*puVar32;
    }
  }
code_r0x005405f0:
  lVar44 = lVar47 + 1;
  plVar17 = (long *)*puVar32;
  in_stack_00000198 = lVar44;
  if (*(long *)(in_stack_000000f8 + 0x198) != 0) {
    lVar42 = 0;
    uVar62 = (long)(plVar17 + 1) * 0x517cc1b727220a95;
    bVar37 = (byte)(uVar62 >> 0x39);
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
      for (uVar43 = CONCAT17(-(bVar73 == bVar37),
                             CONCAT16(-(bVar72 == bVar37),
                                      CONCAT15(-(bVar71 == bVar37),
                                               CONCAT14(-(bVar70 == bVar37),
                                                        CONCAT13(-(bVar69 == bVar37),
                                                                 CONCAT12(-(bVar68 == bVar37),
                                                                          CONCAT11(-(bVar67 ==
                                                                                    bVar37),-((byte)
                                                  uVar65 == bVar37)))))))) & 0x8080808080808080;
          uVar43 != 0; uVar43 = uVar43 - 1 & uVar43) {
        uVar41 = (uVar43 >> 7 & 0xff00ff00ff00ff00) >> 8 | (uVar43 >> 7 & 0xff00ff00ff00ff) << 8;
        uVar41 = (uVar41 & 0xffff0000ffff0000) >> 0x10 | (uVar41 & 0xffff0000ffff) << 0x10;
        if (plVar17 ==
            *(long **)(*(long *)(in_stack_000000f8 + 0x180) + -0x28 +
                      (uVar62 + ((ulong)LZCOUNT(uVar41 >> 0x20 | uVar41 << 0x20) >> 3) &
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
      lVar42 = lVar42 + 8;
      uVar62 = uVar62 + lVar42;
    }
  }
  lVar42 = *plVar17;
  *plVar17 = lVar42 + 1;
  if (lVar42 < 0) {
    func_0x007a05dc();
    goto code_r0x0054319c;
  }
  uVar65 = *puVar32;
  *(undefined8 *)(unaff_x29 + -0x80) = 0;
  *(int *)(unaff_x29 + -0x78) = iVar21;
  *(undefined8 *)(unaff_x29 + -0x70) = 0;
  *(long *)(unaff_x29 + -0x68) = lVar47;
  func_0x005627a8(auStack_7ffffffe + 0x8000024e,in_stack_000000f8 + 0x180,uVar65,unaff_x29 + -0x80);
code_r0x00540668:
  lVar47 = lVar44;
  goto code_r0x00540544;
code_r0x00540708:
  lVar47 = *(long *)(in_stack_000000f8 + 0xd8);
  uVar30 = *(ulong *)(lVar47 + 0x28);
  if (in_stack_00000098 < uVar30) {
code_r0x00540720:
    plVar46 = (long *)(*(long *)(lVar47 + 0x20) + (uVar29 & 0xffffffff) * 0x20);
    if (*plVar46 == -0x8000000000000000) goto code_r0x00540738;
    uVar39 = (ulong)*(uint *)((long)plVar46 + 0x1c) << 0x20 | 0xffffffff;
    plVar46 = uStack0000000000000100;
  }
  else {
code_r0x00540738:
    uVar39 = 0xffffffffffffffff;
    plVar46 = uStack0000000000000100;
  }
  lVar44 = *(long *)(lVar47 + 0x38);
  uVar62 = *(ulong *)(lVar47 + 0x40);
  do {
    uVar43 = uVar39 & 0xffffffff;
    uStack0000000000000100._0_4_ = (uint)lVar61;
    uVar8 = (uint)uStack0000000000000100;
    uStack0000000000000100._4_4_ = (undefined4)((ulong)lVar61 >> 0x20);
    uVar10 = uStack0000000000000100._4_4_;
    uStack0000000000000100 = plVar46;
    if (uVar62 <= uVar43) {
      uVar39 = uVar39 >> 0x20;
      do {
        uVar41 = uVar39;
        if (uVar62 <= uVar41) goto code_r0x00540940;
        lVar42 = lVar44 + uVar41 * 0x30;
        uVar39 = (ulong)*(uint *)(lVar42 + 0x24);
      } while (*(int *)(lVar42 + 0x28) == -1);
      uVar39 = uVar43 | uVar39 << 0x20;
      if (uVar41 < uVar62) goto code_r0x005407b0;
code_r0x00542dbc:
      func_0x007a23bc(&UNK_009f08a0);
      goto code_r0x0054319c;
    }
    uVar41 = uVar39 & 0xffffffff;
    uVar39 = uVar39 & 0xffffffff00000000 | (ulong)*(uint *)(lVar44 + uVar43 * 0x30 + 0x20);
    if (uVar62 <= uVar41) goto code_r0x00542dbc;
code_r0x005407b0:
    plVar57 = (long *)(lVar44 + uVar41 * 0x30);
    if (*plVar57 == -0x8000000000000000) goto code_r0x00542dbc;
  } while (*(int *)((long)plVar57 + 0x2c) != iVar21);
  uVar39 = plVar57[2];
  if (uVar39 == 0) goto code_r0x00540940;
  lVar47 = plVar57[1];
  lVar44 = uVar39 << 4;
  puVar23 = (undefined8 *)func_0x00187bd0(lVar44,8);
  if (puVar23 == (undefined8 *)0x0) {
    func_0x007a1f00(8,lVar44,&UNK_009ec388);
    goto code_r0x0054319c;
  }
  if (uVar39 < 8) {
    uVar30 = 0;
code_r0x005408b4:
    plVar46 = puVar23 + uVar30 * 2 + 1;
    lVar47 = lVar47 + uVar30 * 0x48;
    do {
      plVar46[-1] = uVar30;
      *plVar46 = lVar47;
      uVar30 = uVar30 + 1;
      plVar46 = plVar46 + 2;
      lVar47 = lVar47 + 0x48;
    } while (uVar39 != uVar30);
  }
  else {
    uVar30 = uVar39 & 0xfffffffffffffff8;
    uVar62 = uVar30;
    plVar46 = puVar23 + 8;
    lVar42 = lVar22;
    lVar49 = lVar15;
    do {
      lVar54 = lVar47 + lVar42 * 0x48;
      lVar59 = lVar47 + lVar49 * 0x48;
      plVar46[-8] = lVar42;
      plVar46[-7] = lVar54;
      plVar46[-6] = lVar49;
      plVar46[-5] = lVar59;
      plVar46[-4] = lVar42 + 2;
      plVar46[-3] = lVar54 + 0x90;
      plVar46[-2] = lVar49 + 2;
      plVar46[-1] = lVar59 + 0x90;
      *plVar46 = lVar42 + 4;
      plVar46[1] = lVar54 + 0x120;
      plVar46[2] = lVar49 + 4;
      plVar46[3] = lVar59 + 0x120;
      plVar46[4] = lVar42 + 6;
      plVar46[5] = lVar54 + 0x1b0;
      plVar46[6] = lVar49 + 6;
      plVar46[7] = lVar59 + 0x1b0;
      lVar42 = lVar42 + 8;
      lVar49 = lVar49 + 8;
      uVar62 = uVar62 - 8;
      plVar46 = plVar46 + 0x10;
    } while (uVar62 != 0);
    if (uVar39 != uVar30) goto code_r0x005408b4;
  }
  puVar56 = puVar23;
  plVar46 = _iStack0000000000000108;
  do {
    uStack000000000000010c = (undefined4)((ulong)plVar46 >> 0x20);
    uVar65 = *puVar56;
    puVar38 = (undefined8 *)puVar56[1];
    plVar57 = (long *)*puVar38;
    lVar47 = *plVar57;
    *plVar57 = lVar47 + 1;
    if (lVar47 < 0) {
      _iStack0000000000000108 = plVar46;
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
    func_0x005627a8(unaff_x29 + -0x80,in_stack_000000f8 + 0x180,*puVar38,&uStack0000000000000100);
    plVar46 = (long *)CONCAT44(uStack000000000000010c,iStack0000000000000108);
    puVar56 = puVar56 + 2;
  } while (puVar56 != puVar23 + uVar39 * 2);
  func_0x00187bd4(puVar23,lVar44,8);
  plVar46 = (long *)CONCAT44(uStack0000000000000100._4_4_,(uint)uStack0000000000000100);
  lVar47 = *(long *)(in_stack_000000f8 + 0xd8);
  uVar30 = *(ulong *)(lVar47 + 0x28);
code_r0x00540940:
  uStack0000000000000100 = plVar46;
  if ((uVar30 <= (uVar29 & 0xffffffff)) ||
     (plVar46 = (long *)(*(long *)(lVar47 + 0x20) + (uVar29 & 0xffffffff) * 0x20),
     *plVar46 == -0x8000000000000000)) {
    in_stack_00000018 = (dword *)&UNK_009ec788;
code_r0x00542e54:
    func_0x007a23bc(in_stack_00000018);
    goto code_r0x0054319c;
  }
  lVar47 = plVar46[2];
  if (lVar47 != 0) {
    lVar44 = 0;
    lVar49 = plVar46[1];
    lVar42 = lVar49;
    do {
      uVar11 = uStack0000000000000118._4_4_;
      uVar9 = (undefined4)uStack0000000000000118;
      uVar30 = *(long *)(lVar42 + 0x18) - 0xc;
      if (0x14 < uVar30) {
        uVar30 = 9;
      }
      uStack0000000000000118._0_4_ = (undefined4)lVar44;
      uVar12 = (undefined4)uStack0000000000000118;
      uStack0000000000000118._4_4_ = (undefined4)((ulong)lVar44 >> 0x20);
      uVar13 = uStack0000000000000118._4_4_;
      uStack0000000000000118._0_4_ = uVar9;
      uStack0000000000000118._4_4_ = uVar11;
      if ((long)uVar30 < 0xb) {
        if ((long)uVar30 < 4) {
          if (2 < uVar30) {
            func_0x005d8b44(&uStack0000000000000100,lVar42 + 0x20);
            plVar46 = _iStack0000000000000108;
            plVar57 = uStack0000000000000100;
            goto code_r0x00540a60;
          }
        }
        else if (4 < uVar30 - 4) {
          if (uVar30 == 9) {
            func_0x005da864(&uStack0000000000000100,lVar42);
            plVar46 = _iStack0000000000000108;
            plVar57 = uStack0000000000000100;
          }
          else {
            func_0x005db050(&uStack0000000000000100,lVar42 + 0x20);
            plVar46 = _iStack0000000000000108;
            plVar57 = uStack0000000000000100;
          }
          goto code_r0x00540a60;
        }
      }
      else {
        if ((long)uVar30 < 0xe) {
          if (uVar30 == 0xb) {
            func_0x005db52c(&uStack0000000000000100,lVar42 + 0x20);
            plVar46 = _iStack0000000000000108;
            plVar57 = uStack0000000000000100;
          }
          else if (uVar30 == 0xc) {
            func_0x005dbd2c(&uStack0000000000000100,lVar42 + 0x20);
            plVar46 = _iStack0000000000000108;
            plVar57 = uStack0000000000000100;
          }
          else {
            func_0x005dc268(&uStack0000000000000100,lVar42 + 0x20);
            plVar46 = _iStack0000000000000108;
            plVar57 = uStack0000000000000100;
          }
        }
        else {
          if (uVar30 - 0xf < 6) goto code_r0x00540ac8;
          func_0x005dc564(&uStack0000000000000100,lVar42 + 0x20);
          plVar46 = _iStack0000000000000108;
          plVar57 = uStack0000000000000100;
        }
code_r0x00540a60:
        _iStack0000000000000108 = plVar46;
        uStack0000000000000100 = plVar57;
        if (_uStack0000000000000110 != (long *)0x0) {
          lVar54 = 0;
          lVar59 = (long)_uStack0000000000000110 * 8;
          plVar17 = plVar46;
          do {
            uStack000000000000010c = (undefined4)((ulong)plVar17 >> 0x20);
            puVar23 = *(undefined8 **)((long)plVar46 + lVar54);
            plVar33 = (long *)*puVar23;
            lVar16 = *plVar33;
            *plVar33 = lVar16 + 1;
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
            func_0x005627a8(unaff_x29 + -0x80,in_stack_000000f8 + 0x180,*puVar23,
                            &uStack0000000000000100);
            lVar54 = lVar54 + 8;
            plVar17 = _iStack0000000000000108;
          } while (lVar59 != lVar54);
        }
        if (plVar57 != (long *)0x0) {
          func_0x00187bd4(plVar46,(long)plVar57 << 3,8);
        }
      }
code_r0x00540ac8:
      lVar54 = lVar42 + 0x108;
      lVar44 = lVar44 + 1;
      switch(*(undefined8 *)(lVar42 + 0x18)) {
      case 0xc:
      case 0x11:
      case 0x12:
      case 0x1c:
      case 0x1d:
      case 0x1e:
      case 0x20:
        goto code_r0x00540980;
      case 0xd:
        func_0x005ce8b4(&uStack0000000000000100,lVar42 + 0x20);
        plVar46 = _iStack0000000000000108;
        plVar57 = uStack0000000000000100;
        break;
      case 0xe:
        func_0x005ceb14(&uStack0000000000000100,lVar42 + 0x20);
        plVar46 = _iStack0000000000000108;
        plVar57 = uStack0000000000000100;
        break;
      case 0xf:
        func_0x005d8a94(&uStack0000000000000100,lVar42 + 0x20);
        plVar46 = _iStack0000000000000108;
        plVar57 = uStack0000000000000100;
        break;
      case 0x10:
        func_0x005cf080(&uStack0000000000000100,lVar42 + 0x20);
        plVar46 = _iStack0000000000000108;
        plVar57 = uStack0000000000000100;
        break;
      case 0x13:
        func_0x005cf918(&uStack0000000000000100,lVar42 + 0x20);
        plVar46 = _iStack0000000000000108;
        plVar57 = uStack0000000000000100;
        break;
      case 0x14:
        func_0x005cf918(&uStack0000000000000100,lVar42 + 0x20);
        plVar46 = _iStack0000000000000108;
        plVar57 = uStack0000000000000100;
        break;
      default:
        func_0x005da664(&uStack0000000000000100,lVar42);
        plVar46 = _iStack0000000000000108;
        plVar57 = uStack0000000000000100;
        break;
      case 0x16:
        func_0x005dae50(&uStack0000000000000100,lVar42 + 0x20);
        plVar46 = _iStack0000000000000108;
        plVar57 = uStack0000000000000100;
        break;
      case 0x17:
        func_0x005db32c(&uStack0000000000000100,lVar42 + 0x20);
        plVar46 = _iStack0000000000000108;
        plVar57 = uStack0000000000000100;
        break;
      case 0x18:
        func_0x005dbc7c(&uStack0000000000000100,lVar42 + 0x20);
        plVar46 = _iStack0000000000000108;
        plVar57 = uStack0000000000000100;
        break;
      case 0x19:
        func_0x005dc110(&uStack0000000000000100,lVar42 + 0x20);
        plVar46 = _iStack0000000000000108;
        plVar57 = uStack0000000000000100;
        break;
      case 0x1a:
        func_0x005dc4ec(&uStack0000000000000100,lVar42 + 0x20);
        plVar46 = _iStack0000000000000108;
        plVar57 = uStack0000000000000100;
        break;
      case 0x1b:
        func_0x005d7560(&uStack0000000000000100,lVar42);
        plVar46 = _iStack0000000000000108;
        plVar57 = uStack0000000000000100;
        break;
      case 0x1f:
        func_0x005cf3e8(&uStack0000000000000100,lVar42 + 0x20);
        plVar46 = _iStack0000000000000108;
        plVar57 = uStack0000000000000100;
      }
      _iStack0000000000000108 = plVar46;
      uStack0000000000000100 = plVar57;
      if (_uStack0000000000000110 != (long *)0x0) {
        plVar17 = plVar46 + (long)_uStack0000000000000110;
        plVar33 = plVar46;
code_r0x00540c64:
        plVar25 = plVar33 + 1;
        puVar23 = (undefined8 *)*plVar33;
        plVar33 = (long *)*puVar23;
        lVar42 = *plVar33;
        *plVar33 = lVar42 + 1;
        if (-1 < lVar42) {
          lVar42 = 0;
          plVar64 = (long *)*puVar23;
          uStack0000000000000100._0_4_ = (uint)plVar64;
          uStack0000000000000100._4_4_ = (undefined4)((ulong)plVar64 >> 0x20);
          uVar43 = (long)(plVar64 + 1) * 0x517cc1b727220a95;
          plVar33 = *(long **)(in_stack_000000f8 + 0x1a0);
          uVar39 = *(ulong *)(in_stack_000000f8 + 0x1a8);
          bVar37 = (byte)(uVar43 >> 0x38);
          bVar67 = bVar37 >> 1;
          uVar62 = uVar43 & uVar39;
          uVar65 = *(undefined8 *)((long)plVar33 + uVar62);
          uVar30 = CONCAT17(-((byte)((ulong)uVar65 >> 0x38) == bVar67),
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
            if (uVar30 == 0) {
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
                plVar33 = (long *)(unaff_x25 + 0x1a0);
                if (plVar64 == (long *)0x0) goto code_r0x00540de8;
                plVar33 = *(long **)(in_stack_000000f8 + 0x1a0);
                uVar39 = *(ulong *)(in_stack_000000f8 + 0x1a8);
                uVar43 = uVar39 & uVar43;
                lVar42 = *(long *)((long)plVar33 + uVar43);
                uVar30 = CONCAT17(-(lVar42 < 0),
                                  CONCAT16(-((char)((ulong)lVar42 >> 0x30) < '\0'),
                                           CONCAT15(-((char)((ulong)lVar42 >> 0x28) < '\0'),
                                                    CONCAT14(-((char)((ulong)lVar42 >> 0x20) < '\0')
                                                             ,CONCAT13(-((char)((ulong)lVar42 >>
                                                                               0x18) < '\0'),
                                                                       CONCAT12(-((char)((ulong)
                                                  lVar42 >> 0x10) < '\0'),
                                                  CONCAT11(-((char)((ulong)lVar42 >> 8) < '\0'),
                                                           -((char)lVar42 < '\0'))))))));
              }
              else {
                uVar43 = uVar39 & uVar43;
                lVar42 = *(long *)((long)plVar33 + uVar43);
                uVar30 = CONCAT17(-(lVar42 < 0),
                                  CONCAT16(-((char)((ulong)lVar42 >> 0x30) < '\0'),
                                           CONCAT15(-((char)((ulong)lVar42 >> 0x28) < '\0'),
                                                    CONCAT14(-((char)((ulong)lVar42 >> 0x20) < '\0')
                                                             ,CONCAT13(-((char)((ulong)lVar42 >>
                                                                               0x18) < '\0'),
                                                                       CONCAT12(-((char)((ulong)
                                                  lVar42 >> 0x10) < '\0'),
                                                  CONCAT11(-((char)((ulong)lVar42 >> 8) < '\0'),
                                                           -((char)lVar42 < '\0'))))))));
              }
              if (uVar30 == 0) {
                lVar42 = 8;
                do {
                  uVar43 = uVar43 + lVar42 & uVar39;
                  lVar59 = *(long *)((long)plVar33 + uVar43);
                  uVar30 = CONCAT17(-(lVar59 < 0),
                                    CONCAT16(-((char)((ulong)lVar59 >> 0x30) < '\0'),
                                             CONCAT15(-((char)((ulong)lVar59 >> 0x28) < '\0'),
                                                      CONCAT14(-((char)((ulong)lVar59 >> 0x20) <
                                                                '\0'),CONCAT13(-((char)((ulong)
                                                  lVar59 >> 0x18) < '\0'),
                                                  CONCAT12(-((char)((ulong)lVar59 >> 0x10) < '\0'),
                                                           CONCAT11(-((char)((ulong)lVar59 >> 8) <
                                                                     '\0'),-((char)lVar59 < '\0'))))
                                                  ))));
                  lVar42 = lVar42 + 8;
                } while (uVar30 == 0);
              }
              uVar30 = (uVar30 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar30 & 0x5555555555555555) << 1;
              uVar30 = (uVar30 & 0xcccccccccccccccc) >> 2 | (uVar30 & 0x3333333333333333) << 2;
              uVar30 = (uVar30 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar30 & 0xf0f0f0f0f0f0f0f) << 4;
              uVar30 = (uVar30 & 0xff00ff00ff00ff00) >> 8 | (uVar30 & 0xff00ff00ff00ff) << 8;
              uVar30 = (uVar30 & 0xffff0000ffff0000) >> 0x10 | (uVar30 & 0xffff0000ffff) << 0x10;
              uVar62 = uVar43 + ((ulong)LZCOUNT(uVar30 >> 0x20 | uVar30 << 0x20) >> 3) & uVar39;
              uVar30 = (ulong)*(char *)((long)plVar33 + uVar62);
              if (-1 < *(char *)((long)plVar33 + uVar62)) {
                lVar42 = *plVar33;
                uVar30 = CONCAT17(-(lVar42 < 0),
                                  CONCAT16(-((char)((ulong)lVar42 >> 0x30) < '\0'),
                                           CONCAT15(-((char)((ulong)lVar42 >> 0x28) < '\0'),
                                                    CONCAT14(-((char)((ulong)lVar42 >> 0x20) < '\0')
                                                             ,CONCAT13(-((char)((ulong)lVar42 >>
                                                                               0x18) < '\0'),
                                                                       CONCAT12(-((char)((ulong)
                                                  lVar42 >> 0x10) < '\0'),
                                                  CONCAT11(-((char)((ulong)lVar42 >> 8) < '\0'),
                                                           -((char)lVar42 < '\0'))))))));
                uVar30 = (uVar30 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar30 & 0x5555555555555555) << 1;
                uVar30 = (uVar30 & 0xcccccccccccccccc) >> 2 | (uVar30 & 0x3333333333333333) << 2;
                uVar30 = (uVar30 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar30 & 0xf0f0f0f0f0f0f0f) << 4;
                uVar30 = (uVar30 & 0xff00ff00ff00ff00) >> 8 | (uVar30 & 0xff00ff00ff00ff) << 8;
                uVar30 = (uVar30 & 0xffff0000ffff0000) >> 0x10 | (uVar30 & 0xffff0000ffff) << 0x10;
                uVar62 = (ulong)LZCOUNT(uVar30 >> 0x20 | uVar30 << 0x20) >> 3;
                uVar30 = (ulong)*(byte *)((long)plVar33 + uVar62);
              }
              *(byte *)((long)plVar33 + uVar62) = bVar37 >> 1;
              *(byte *)((long)plVar33 + (uVar62 - 8 & uVar39) + 8) = bVar37 >> 1;
              plVar33 = plVar33 + uVar62 * -5;
              *(ulong *)(in_stack_000000f8 + 0x1b0) =
                   *(long *)(in_stack_000000f8 + 0x1b0) - (uVar30 & 1);
              plVar33[-5] = (long)plVar64;
              lVar42 = _UNK_009ec480;
              plVar51 = _UNK_009ec478;
              plVar64 = _UNK_009ec468;
              plVar33[-3] = (long)_UNK_009ec470;
              plVar33[-4] = (long)plVar64;
              plVar33[-1] = lVar42;
              plVar33[-2] = (long)plVar51;
              *(long *)(in_stack_000000f8 + 0x1b8) = *(long *)(in_stack_000000f8 + 0x1b8) + 1;
              goto code_r0x00540de8;
            }
code_r0x00540cc4:
            uVar41 = (uVar30 >> 7 & 0xff00ff00ff00ff00) >> 8 | (uVar30 >> 7 & 0xff00ff00ff00ff) << 8
            ;
            uVar41 = (uVar41 & 0xffff0000ffff0000) >> 0x10 | (uVar41 & 0xffff0000ffff) << 0x10;
            uVar41 = uVar62 + ((ulong)LZCOUNT(uVar41 >> 0x20 | uVar41 << 0x20) >> 3) & uVar39;
            if ((long *)plVar33[uVar41 * -5 + -5] == plVar64) goto code_r0x00540d2c;
            uVar30 = uVar30 - 1 & uVar30;
          } while( true );
        }
        func_0x007a05dc();
        goto code_r0x0054319c;
      }
code_r0x00540e94:
      if (plVar57 != (long *)0x0) {
        func_0x00187bd4(plVar46,(long)plVar57 << 3,8);
      }
code_r0x00540980:
      lVar42 = lVar54;
    } while (lVar54 != lVar49 + lVar47 * 0x108);
  }
  lVar61 = lVar61 + 1;
  lVar47 = in_stack_000000f8;
  goto code_r0x0054033c;
code_r0x00540d08:
  lVar42 = lVar42 + 8;
  uVar62 = uVar62 + lVar42 & uVar39;
  uVar65 = *(undefined8 *)((long)plVar33 + uVar62);
  uVar30 = CONCAT17(-((byte)((ulong)uVar65 >> 0x38) == bVar67),
                    CONCAT16(-((byte)((ulong)uVar65 >> 0x30) == bVar67),
                             CONCAT15(-((byte)((ulong)uVar65 >> 0x28) == bVar67),
                                      CONCAT14(-((byte)((ulong)uVar65 >> 0x20) == bVar67),
                                               CONCAT13(-((byte)((ulong)uVar65 >> 0x18) == bVar67),
                                                        CONCAT12(-((byte)((ulong)uVar65 >> 0x10) ==
                                                                  bVar67),CONCAT11(-((byte)((ulong)
                                                  uVar65 >> 8) == bVar67),-((byte)uVar65 == bVar67))
                                                  )))))) & 0x8080808080808080;
  if (uVar30 != 0) goto code_r0x00540cc4;
  goto code_r0x00540cf4;
code_r0x00540d2c:
  lVar42 = *plVar64;
  *plVar64 = lVar42 + -1;
  LORelease();
  if (lVar42 == 1) {
    func_0x005d2ac4(&uStack0000000000000100);
  }
  plVar33 = plVar33 + uVar41 * -5;
code_r0x00540de8:
  iStack0000000000000108 = 1;
  uStack000000000000010c = 0;
  uStack0000000000000100._0_4_ = uVar8;
  uStack0000000000000100._4_4_ = uVar10;
  uStack0000000000000110 = uVar12;
  uStack0000000000000114 = uVar13;
  func_0x00562f08(unaff_x29 + -0x80,plVar33 + -4,uVar29,&uStack0000000000000100);
  plVar33 = plVar25;
  if (plVar25 == plVar17) goto code_r0x00540e94;
  goto code_r0x00540c64;
code_r0x00542e20:
  func_0x007a23bc(puStack0000000000000060);
  goto code_r0x0054319c;
code_r0x00542dec:
  func_0x007a05dc();
  goto code_r0x0054319c;
LAB_0053fe98:
  if (uVar30 != 0) {
    uVar29 = uVar30 * 4 + 0xb & 0xfffffffffffffff8;
    lVar61 = uVar30 + uVar29 + 9;
    if (lVar61 != 0) {
      func_0x00187bd4((long)puVar35 - uVar29,lVar61,8);
    }
  }
  func_0x0053a3f4(auStack_7ffffffe + 0x8000024e);
  if (in_stack_00000098 != unaff_x20) {
    puVar18 = in_stack_00000098 + 1;
    in_stack_000002b8 = *in_stack_00000098;
    uVar29 = (ulong)in_stack_000002b8;
    lVar61 = *(long *)(unaff_x25 + 0xd8);
    if ((uVar29 < *(ulong *)(lVar61 + 0x28)) &&
       (puVar23 = (undefined8 *)(*(long *)(lVar61 + 0x20) + uVar29 * 0x20),
       (uint *)*puVar23 != unaff_x21)) {
      uVar30 = (ulong)*(uint *)((long)puVar23 + 0x1c) << 0x20 | 0xffffffff;
    }
    else {
      uVar30 = 0xffffffffffffffff;
    }
    lVar22 = *(long *)(lVar61 + 0x38);
    uVar39 = *(ulong *)(lVar61 + 0x40);
    do {
      uVar62 = uVar30 & 0xffffffff;
      in_stack_00000098 = puVar18;
      in_stack_00000250 = in_stack_00000050;
      in_stack_00000258 = in_stack_00000058;
      in_stack_00000260 = (long)in_stack_00000040;
      in_stack_00000268 = in_stack_00000048;
      if (uVar39 <= uVar62) {
        uVar30 = uVar30 >> 0x20;
        do {
          uVar43 = uVar30;
          if (uVar39 <= uVar43) goto code_r0x0053f458;
          lVar15 = lVar22 + uVar43 * unaff_x24;
          uVar30 = (ulong)*(uint *)(lVar15 + 0x24);
        } while (*(int *)(lVar15 + 0x28) == -1);
        uVar30 = uVar62 | uVar30 << 0x20;
        if (uVar43 < uVar39) goto code_r0x0053f1b4;
code_r0x00542e04:
        func_0x007a23bc(&UNK_009f08a0);
        goto code_r0x0054319c;
      }
      uVar43 = uVar30 & 0xffffffff;
      uVar30 = uVar30 & 0xffffffff00000000 |
               (ulong)*(uint *)(lVar22 + uVar62 * (unaff_x24 & 0xffffffff) + 0x20);
      if (uVar39 <= uVar43) goto code_r0x00542e04;
code_r0x0053f1b4:
      puVar23 = (undefined8 *)(lVar22 + uVar43 * unaff_x24);
      if ((uint *)*puVar23 == unaff_x21) goto code_r0x00542e04;
    } while (*(uint *)((long)puVar23 + 0x2c) != uVar29);
    if (puVar23[2] == 0) goto code_r0x0053f458;
    puVar56 = (undefined8 *)puVar23[1];
    lVar61 = puVar23[2] * 0x48;
    do {
      in_stack_00000210 = (dword *)func_0x00187bd0(0x28,8);
      if (in_stack_00000210 == (dword *)0x0) {
        func_0x007a1f18(8,0x28);
        goto code_r0x0054319c;
      }
      *(undefined8 *)(in_stack_00000210 + 2) = in_stack_000000b8;
      *(long **)in_stack_00000210 = in_stack_000000b0;
      *(uint **)(in_stack_00000210 + 4) = unaff_x21;
      puVar23 = (undefined8 *)func_0x00578610(unaff_x25,puVar56);
      if (puVar23 != (undefined8 *)0x0) {
        lVar22 = *(long *)in_stack_00000210;
        *(long *)in_stack_00000210 = lVar22 + unaff_x27;
        if (lVar22 < 0) {
code_r0x00541b60:
          func_0x007a05dc();
        }
        else {
          uStack0000000000000100._0_4_ = (uint)in_stack_00000210;
          uStack0000000000000100._4_4_ = (undefined4)((ulong)in_stack_00000210 >> 0x20);
          lVar22 = *(long *)*puVar23;
          *(long *)*puVar23 = lVar22 + unaff_x27;
          if (-1 < lVar22) {
            uVar53 = *puVar23;
            uVar65 = func_0x005787f4(*(undefined8 *)(unaff_x25 + 0x38),
                                     *(undefined8 *)(unaff_x25 + 0x40),in_stack_00000210);
            func_0x00589494(unaff_x25,uVar65,in_stack_00000210,uVar53);
            unaff_x27 = 1;
            in_stack_00000270 = extraout_x1;
            if (extraout_x1 != (dword *)0x0) {
              lVar22 = *(long *)extraout_x1;
              *(long *)extraout_x1 = lVar22 + -1;
              LORelease();
              if (lVar22 == 1) {
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
      lVar22 = *(long *)*puVar56;
      *(long *)*puVar56 = lVar22 + unaff_x27;
      if (lVar22 < 0) goto code_r0x00541b60;
      plVar46 = (long *)func_0x0056237c(auStack_7ffffffe + 0x8000024e,*puVar56,in_stack_00000210);
      uStack0000000000000100._0_4_ = (uint)plVar46;
      uStack0000000000000100._4_4_ = (undefined4)((ulong)plVar46 >> 0x20);
      if (plVar46 != (long *)0x0) {
        lVar22 = *plVar46;
        *plVar46 = lVar22 + -1;
        LORelease();
        if (lVar22 == 1) {
          func_0x005d2ac4(&uStack0000000000000100);
        }
      }
      puVar56 = puVar56 + 9;
      lVar61 = lVar61 + -0x48;
    } while (lVar61 != 0);
    lVar61 = *(long *)(unaff_x25 + 0xd8);
    uVar29 = (ulong)in_stack_000002b8;
    if (in_stack_00000048 != 0) goto code_r0x0053f2f4;
    goto code_r0x0053f44c;
  }
  if (in_stack_000000a0 != 0) {
    func_0x00187bd4(unaff_x28,in_stack_000000a0 << 2,4);
  }
  puVar48 = (ulong *)(*(long *)(*(long *)(unaff_x25 + 0xd8) + 0x38) + 0x10);
  plVar46 = (long *)(auStack_7ffffffe + 0x8000026e);
  for (lVar61 = *(long *)(*(long *)(unaff_x25 + 0xd8) + 0x40) * 0x30; lVar61 != 0;
      lVar61 = lVar61 + -0x30) {
    if (puVar48[-2] != 0x8000000000000000) {
      uVar29 = *puVar48;
      uStack0000000000000100 = plVar46;
      if (1 < uVar29) {
        if (uVar29 < 0x15) {
          func_0x00576528(puVar48[-1],uVar29,1,&uStack0000000000000100);
        }
        else {
          func_0x00576bac(puVar48[-1],uVar29,&uStack0000000000000100);
        }
      }
    }
    puVar48 = puVar48 + 6;
  }
  func_0x0058d7e0(&uStack0000000000000100,*(undefined8 *)(unaff_x25 + 0xd8));
  lVar61 = *(long *)(unaff_x25 + 0x1e8);
  if (lVar61 != 0) {
    lVar22 = *(long *)(unaff_x25 + 0x1f8);
    if (lVar22 != 0) {
      plVar46 = *(long **)(unaff_x25 + 0x1e0);
      plVar57 = plVar46 + 1;
      lVar15 = *plVar46;
      uVar29 = CONCAT17(-(-1 < lVar15),
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
        while (uVar29 == 0) {
          lVar15 = *plVar57;
          plVar46 = plVar46 + -0x48;
          plVar57 = plVar57 + 1;
          uVar29 = CONCAT17(-(-1 < lVar15),
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
        uVar30 = (uVar29 >> 7 & 0xff00ff00ff00ff00) >> 8 | (uVar29 >> 7 & 0xff00ff00ff00ff) << 8;
        uVar30 = (uVar30 & 0xffff0000ffff0000) >> 0x10 | (uVar30 & 0xffff0000ffff) << 0x10;
        func_0x00539e0c(plVar46 + (long)-(int)((ulong)LZCOUNT(uVar30 >> 0x20 | uVar30 << 0x20) >> 3)
                                  * 9 + -8);
        uVar29 = uVar29 - 1 & uVar29;
        lVar22 = lVar22 + -1;
      } while (lVar22 != 0);
    }
    lVar22 = lVar61 * 0x49 + 0x51;
    if (lVar22 != 0) {
      func_0x00187bd4(*(long *)(unaff_x25 + 0x1e0) + lVar61 * -0x48 + -0x48,lVar22,8);
    }
  }
  *(long **)(unaff_x25 + 0x1e8) = _iStack0000000000000108;
  *(long **)(unaff_x25 + 0x1e0) = uStack0000000000000100;
  *(long **)(unaff_x25 + 0x1f8) = uStack0000000000000118;
  *(long **)(unaff_x25 + 0x1f0) = _uStack0000000000000110;
  lVar61 = *(long *)(unaff_x25 + 0xd8);
  if (*(int *)(lVar61 + 0x78) == 1) {
    func_0x0058b00c(auStack_7ffffffe + 0x8000020e,lVar61 + 0x18,*(undefined4 *)(lVar61 + 0x7c));
    plVar46 = *(long **)(*(long *)(unaff_x25 + 0xd8) + 0x20);
    lVar61 = *(long *)(*(long *)(unaff_x25 + 0xd8) + 0x28);
    plVar17 = plVar46;
    uVar2 = 0;
    plVar57 = uStack0000000000000100;
code_r0x005400d8:
    uVar58 = uVar2;
    uStack0000000000000100._4_4_ = (undefined4)((ulong)plVar57 >> 0x20);
    if (plVar17 != plVar46 + lVar61 * 4) {
      plVar33 = plVar17 + 4;
      lVar22 = *plVar17;
      uVar2 = uVar58 + 1;
      plVar17 = plVar33;
      if (lVar22 != -0x8000000000000000) {
        plVar57 = (long *)CONCAT44(uStack0000000000000100._4_4_,uVar58);
        if (in_stack_00000240 != uVar58 && in_stack_00000228 != 0) {
          uStack0000000000000100._0_4_ = uVar58;
          uVar29 = func_0x005763e4(auStack_7ffffffe + 0x8000022e,&uStack0000000000000100);
          plVar57 = (long *)CONCAT44(uStack0000000000000100._4_4_,(uint)uStack0000000000000100);
          lVar22 = 0;
          bVar37 = (byte)(uVar29 >> 0x39);
          while( true ) {
            uVar29 = uVar29 & (ulong)in_stack_00000218;
            uVar65 = *(undefined8 *)((long)in_stack_00000210 + uVar29);
            bVar67 = (byte)((ulong)uVar65 >> 8);
            bVar68 = (byte)((ulong)uVar65 >> 0x10);
            bVar69 = (byte)((ulong)uVar65 >> 0x18);
            bVar70 = (byte)((ulong)uVar65 >> 0x20);
            bVar71 = (byte)((ulong)uVar65 >> 0x28);
            bVar72 = (byte)((ulong)uVar65 >> 0x30);
            bVar73 = (byte)((ulong)uVar65 >> 0x38);
            for (uVar30 = CONCAT17(-(bVar73 == bVar37),
                                   CONCAT16(-(bVar72 == bVar37),
                                            CONCAT15(-(bVar71 == bVar37),
                                                     CONCAT14(-(bVar70 == bVar37),
                                                              CONCAT13(-(bVar69 == bVar37),
                                                                       CONCAT12(-(bVar68 == bVar37),
                                                                                CONCAT11(-(bVar67 ==
                                                                                          bVar37),-(
                                                  (byte)uVar65 == bVar37)))))))) &
                          0x8080808080808080; uVar30 != 0; uVar30 = uVar30 - 1 & uVar30) {
              uVar39 = (uVar30 >> 7 & 0xff00ff00ff00ff00) >> 8 |
                       (uVar30 >> 7 & 0xff00ff00ff00ff) << 8;
              uVar39 = (uVar39 & 0xffff0000ffff0000) >> 0x10 | (uVar39 & 0xffff0000ffff) << 0x10;
              uVar39 = uVar29 + ((ulong)LZCOUNT(uVar39 >> 0x20 | uVar39 << 0x20) >> 3) &
                       (ulong)in_stack_00000218;
              if (in_stack_00000210[uVar39 * -2 + -2] == uVar58) {
                func_0x0058cb44(unaff_x25 + 0x48,in_stack_00000210[uVar39 * -2 + -1],uVar58);
                plVar57 = (long *)CONCAT44(uStack0000000000000100._4_4_,(uint)uStack0000000000000100
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
            lVar22 = lVar22 + 8;
            uVar29 = uVar29 + lVar22;
          }
        }
      }
      goto code_r0x005400d8;
    }
    if (*(ulong *)(unaff_x25 + 0x1d0) < *(ulong *)(unaff_x25 + 0x78)) {
      uStack0000000000000100 = plVar57;
      func_0x007ab0a0(unaff_x25 + 0x1c0,*(ulong *)(unaff_x25 + 0x78),unaff_x25 + 0x1e0,1);
      plVar57 = uStack0000000000000100;
    }
    uVar7 = _UNK_009ee250;
    uVar66 = _UNK_009ee248;
    uVar53 = _UNK_009ee240;
    uVar65 = _UNK_009ee238;
    uStack0000000000000100._4_4_ = (undefined4)((ulong)plVar57 >> 0x20);
    if (*(long *)(unaff_x25 + 0x58) != 0) {
      lVar61 = *(long *)(unaff_x25 + 0x50);
      lVar22 = lVar61 + *(long *)(unaff_x25 + 0x58) * 0x28;
code_r0x00540178:
      dVar3 = *(dword *)(lVar61 + 0x20);
      lVar61 = lVar61 + 0x28;
      *(undefined8 *)(unaff_x29 + -0x78) = uVar53;
      *(undefined8 *)(unaff_x29 + -0x80) = uVar65;
      *(undefined8 *)(unaff_x29 + -0x68) = uVar7;
      *(undefined8 *)(unaff_x29 + -0x70) = uVar66;
      dVar52 = dVar3;
      do {
        uStack0000000000000100._0_4_ = dVar52;
        if (*(long *)(unaff_x25 + 0x78) == 0) {
code_r0x005401d8:
          pdVar63 = &MACH_HEADER.cputype;
          pdVar34 = &MACH_HEADER.cputype;
        }
        else {
          uVar19 = func_0x0057890c(*(undefined8 *)(unaff_x25 + 0x80),
                                   *(undefined8 *)(unaff_x25 + 0x88),dVar52);
          auVar74 = func_0x00589d94(unaff_x25 + 0x48,uVar19,&uStack0000000000000100);
          uVar29 = auVar74._8_8_;
          if ((auVar74._0_8_ & 1) == 0) goto code_r0x005401d8;
          if (*(ulong *)(unaff_x25 + 0x58) <= uVar29) {
            func_0x007a2570(uVar29,*(ulong *)(unaff_x25 + 0x58),&UNK_009f0070);
            goto code_r0x0054319c;
          }
          lVar15 = *(long *)(unaff_x25 + 0x50) + uVar29 * 0x28;
          pdVar34 = *(dword **)(lVar15 + 8);
          pdVar63 = pdVar34 + *(long *)(lVar15 + 0x10) * 2;
        }
        do {
          if (pdVar34 == pdVar63) goto code_r0x0054023c;
          pdVar31 = pdVar34 + 2;
          dVar4 = *pdVar34;
          pdVar20 = pdVar34 + 1;
          pdVar34 = pdVar31;
        } while (dVar4 != dVar52 && (char)*pdVar20 == '\0');
        while (pdVar31 != pdVar63) {
          dVar5 = *pdVar31;
          pdVar34 = pdVar31 + 1;
          pdVar31 = pdVar31 + 2;
          if (dVar5 == dVar52 || (char)*pdVar34 != '\0') goto code_r0x0054023c;
        }
        func_0x004d1c68(unaff_x29 + -0x80,dVar4);
        dVar52 = dVar4;
      } while( true );
    }
code_r0x00540290:
    uStack0000000000000100 = plVar57;
    if (*(int *)(*(long *)(unaff_x25 + 0xd8) + 0x78) != 1) {
      func_0x007a23bc(&UNK_009ec758);
      goto code_r0x0054319c;
    }
    func_0x0058bce0(auStack_7ffffffe + 0x8000026e,unaff_x25 + 0x48,
                    *(undefined4 *)(*(long *)(unaff_x25 + 0xd8) + 0x7c));
    lVar15 = _UNK_007fc2d8;
    lVar22 = _UNK_007fc2d0;
    lVar61 = 0;
    in_stack_00000010 = 0x26;
    in_stack_00000018 = (dword *)&UNK_009ec770;
    puStack0000000000000000 = &UNK_008aae23;
    in_stack_00000008 = &UNK_009ec7b8;
    lVar47 = unaff_x25;
code_r0x0054033c:
    auVar74 = func_0x0058be04(auStack_7ffffffe + 0x8000026e,*(long *)(lVar47 + 0xd8) + 0x18);
    uVar29 = auVar74._8_8_;
    if ((auVar74._0_8_ & 1) != 0) {
      lVar47 = *(long *)(in_stack_000000f8 + 0xd8);
      if ((*(uint *)(lVar47 + 0x78) & 1) == 0) goto code_r0x00542e54;
      iVar21 = auVar74._8_4_;
      if (iVar21 != *(int *)(lVar47 + 0x7c)) {
        uVar30 = *(ulong *)(lVar47 + 0x28);
        if ((uVar29 & 0xffffffff) < uVar30) goto code_r0x00540720;
        goto code_r0x00540738;
      }
      if (lVar61 == 0) {
        if (((uVar29 & 0xffffffff) < *(ulong *)(lVar47 + 0x28)) &&
           (plVar46 = (long *)(*(long *)(lVar47 + 0x20) + (uVar29 & 0xffffffff) * 0x20),
           *plVar46 != -0x8000000000000000)) {
          uVar30 = (ulong)*(uint *)((long)plVar46 + 0x1c) << 0x20 | 0xffffffff;
        }
        else {
          uVar30 = 0xffffffffffffffff;
        }
        lVar44 = *(long *)(lVar47 + 0x38);
        uVar39 = *(ulong *)(lVar47 + 0x40);
        while (uVar62 = uVar30 & 0xffffffff, uVar62 < uVar39) {
          uVar43 = uVar30 & 0xffffffff;
          uVar30 = uVar30 & 0xffffffff00000000 | (ulong)*(uint *)(lVar44 + uVar62 * 0x30 + 0x20);
          if (uVar39 <= uVar43) goto code_r0x00542e2c;
code_r0x0054042c:
          plVar46 = (long *)(lVar44 + uVar43 * 0x30);
          if (*plVar46 == -0x8000000000000000) goto code_r0x00542e2c;
          if ((*(int *)((long)plVar46 + 0x2c) == iVar21) && (plVar46[2] != 0)) {
            in_stack_00000010 = 0x5b;
            puStack0000000000000000 = &UNK_008aadc8;
            in_stack_00000008 = &UNK_009ec7a0;
            goto code_r0x00542f64;
          }
        }
        uVar30 = uVar30 >> 0x20;
        do {
          uVar43 = uVar30;
          if (uVar39 <= uVar43) {
            uVar39 = 0;
            plVar57 = *(long **)(in_stack_000000f8 + 0xe0);
            in_stack_00000178 = (long)plVar57 + *(long *)(in_stack_000000f8 + 0xe8) + 1;
            lVar44 = *plVar57;
            plVar46 = plVar57 + 1;
            uVar30 = CONCAT17(-(-1 < lVar44),
                              CONCAT16(-(-1 < (char)((ulong)lVar44 >> 0x30)),
                                       CONCAT15(-(-1 < (char)((ulong)lVar44 >> 0x28)),
                                                CONCAT14(-(-1 < (char)((ulong)lVar44 >> 0x20)),
                                                         CONCAT13(-(-1 < (char)((ulong)lVar44 >>
                                                                               0x18)),
                                                                  CONCAT12(-(-1 < (char)((ulong)
                                                  lVar44 >> 0x10)),
                                                  CONCAT11(-(-1 < (char)((ulong)lVar44 >> 8)),
                                                           -(-1 < (char)lVar44)))))))) &
                     0x8080808080808080;
            uStack00000000000000d0 = *(long *)(in_stack_000000f8 + 0xf8);
            puVar56 = *(undefined8 **)(in_stack_000000f8 + 8);
            puVar40 = puVar56 + *(long *)(in_stack_000000f8 + 0x10) * 3;
            puVar38 = *(undefined8 **)(lVar47 + 8);
            puVar23 = puVar38 + *(long *)(lVar47 + 0x10);
            uStack0000000000000100._0_4_ = 0;
            uStack0000000000000100._4_4_ = 0;
            uStack0000000000000128 = (dword *)0x0;
            in_stack_00000198 = 0;
            in_stack_000000b0 = _uStack0000000000000110;
            in_stack_000000c0 = _iStack0000000000000108;
            lVar47 = 0;
            in_stack_00000150 = puVar56;
            in_stack_00000158 = puVar40;
            in_stack_00000160 = plVar57;
            in_stack_00000168 = uVar30;
            in_stack_00000170 = plVar46;
            in_stack_00000180 = uStack00000000000000d0;
            in_stack_00000188 = puVar38;
            in_stack_00000190 = puVar23;
            goto code_r0x00540544;
          }
          lVar42 = lVar44 + uVar43 * 0x30;
          uVar30 = (ulong)*(uint *)(lVar42 + 0x24);
        } while (*(int *)(lVar42 + 0x28) == -1);
        uVar30 = uVar62 | uVar30 << 0x20;
        if (uVar43 < uVar39) goto code_r0x0054042c;
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
      uVar29 = (long)in_stack_00000290 * 4 + 0xbU & 0xfffffffffffffff8;
      lVar61 = (long)in_stack_00000290 + uVar29 + 9;
      if (lVar61 != 0) {
        func_0x00187bd4((long)in_stack_00000288 - uVar29,lVar61,8);
      }
    }
    if ((in_stack_00000218 != (undefined8 *)0x0) &&
       (lVar61 = (long)in_stack_00000218 * 9 + 0x11, lVar61 != 0)) {
      func_0x00187bd4(in_stack_00000210 + (long)in_stack_00000218 * -2 + -2,lVar61,8);
    }
    if ((*(uint *)(*(long *)(in_stack_000000f8 + 0xd8) + 0x78) & 1) == 0) {
      puVar35 = &UNK_009ecd38;
    }
    else {
      func_0x0058bfd4(&uStack0000000000000100,in_stack_000000f8 + 0x48,
                      *(undefined4 *)(*(long *)(in_stack_000000f8 + 0xd8) + 0x7c));
      in_stack_000000b0 = (long *)&UNK_009ecd50;
      while( true ) {
        auVar74 = func_0x0058c4fc(&uStack0000000000000100,*(long *)(in_stack_000000f8 + 0xd8) + 0x18
                                 );
        if ((auVar74._0_8_ & 1) == 0) break;
        lVar61 = *(long *)(in_stack_000000f8 + 0xd8);
        uVar29 = auVar74._8_8_ & 0xffffffff;
        if (uVar29 < *(ulong *)(lVar61 + 0x28)) {
          plVar46 = (long *)(*(long *)(lVar61 + 0x20) + uVar29 * 0x20);
          if (*plVar46 == -0x8000000000000000) {
            uVar30 = 0xffffffffffffffff;
          }
          else {
            uVar30 = (ulong)*(uint *)((long)plVar46 + 0x1c) << 0x20 | 0xffffffff;
          }
        }
        else {
          uVar30 = 0xffffffffffffffff;
        }
        lVar22 = *(long *)(lVar61 + 0x38);
        uVar39 = *(ulong *)(lVar61 + 0x40);
        do {
          uVar62 = uVar30 & 0xffffffff;
          if (uVar39 <= uVar62) {
            uVar30 = uVar30 >> 0x20;
            do {
              uVar43 = uVar30;
              if (uVar39 <= uVar43) {
                in_stack_00000250 = (dword *)0x0;
                in_stack_00000258 = &MACH_HEADER.cpusubtype;
                in_stack_00000260 = 0;
                goto code_r0x005410a0;
              }
              lVar61 = lVar22 + uVar43 * 0x30;
              uVar30 = (ulong)*(uint *)(lVar61 + 0x24);
            } while (*(int *)(lVar61 + 0x28) == -1);
            uVar30 = uVar62 | uVar30 << 0x20;
            if (uVar43 < uVar39) goto code_r0x0054103c;
code_r0x00542fb0:
            func_0x007a23bc(&UNK_009f08a0);
            goto code_r0x0054319c;
          }
          uVar43 = uVar30 & 0xffffffff;
          uVar30 = uVar30 & 0xffffffff00000000 | (ulong)*(uint *)(lVar22 + uVar62 * 0x30 + 0x20);
          if (uVar39 <= uVar43) goto code_r0x00542fb0;
code_r0x0054103c:
          plVar46 = (long *)(lVar22 + uVar43 * 0x30);
          if (*plVar46 == -0x8000000000000000) goto code_r0x00542fb0;
        } while (*(int *)((long)plVar46 + 0x2c) != auVar74._8_4_);
        func_0x0055ae6c(auStack_7ffffffe + 0x8000024e,plVar46[1],plVar46[1] + plVar46[2] * 0x48,
                        &UNK_009ec388);
code_r0x005410a0:
        in_stack_00000278 = in_stack_00000258;
        for (lVar61 = in_stack_00000260 * 8; lVar61 != 0; lVar61 = lVar61 + -8) {
          func_0x00547df0(in_stack_000000f8,*(undefined8 *)in_stack_00000278);
          in_stack_00000278 = in_stack_00000278 + 2;
        }
        func_0x005928cc(auStack_7ffffffe + 0x8000026e);
        if ((*(ulong *)(*(long *)(in_stack_000000f8 + 0xd8) + 0x28) <= uVar29) ||
           (plVar46 = (long *)(*(long *)(*(long *)(in_stack_000000f8 + 0xd8) + 0x20) + uVar29 * 0x20
                              ), *plVar46 == -0x8000000000000000)) {
code_r0x00542f20:
          func_0x007a23bc(in_stack_000000b0);
          goto code_r0x0054319c;
        }
        uVar30 = plVar46[2];
        in_stack_00000270 = in_stack_00000258;
        in_stack_00000280 = in_stack_00000250;
        if (uVar30 != 0) {
          uVar39 = 0;
          uVar62 = 1;
          puVar23 = in_stack_00000218;
          while( true ) {
            if ((*(ulong *)(*(long *)(in_stack_000000f8 + 0xd8) + 0x28) <= uVar29) ||
               (plVar46 = (long *)(*(long *)(*(long *)(in_stack_000000f8 + 0xd8) + 0x20) +
                                  uVar29 * 0x20), *plVar46 == -0x8000000000000000)) {
              in_stack_000000b0 = (long *)&UNK_009ecd68;
              goto code_r0x00542f20;
            }
            if ((ulong)plVar46[2] <= uVar39) {
              func_0x007a2570(uVar39,plVar46[2],&UNK_009ecd80);
              goto code_r0x0054319c;
            }
            lVar61 = plVar46[1] + uVar39 * 0x108;
            in_stack_00000218 = puVar23;
            if (*(long *)(lVar61 + 0x18) == 0xf) {
              in_stack_00000270 = *(dword **)(lVar61 + 0x28);
              in_stack_00000278 = in_stack_00000270 + *(long *)(lVar61 + 0x30) * 6;
              in_stack_00000280 = (dword *)0x0;
              func_0x0055a048(auStack_7ffffffe + 0x8000020e,auStack_7ffffffe + 0x8000026e,
                              &UNK_009ec388);
              *(undefined8 **)(unaff_x29 + -0x80) = puVar23;
              *(undefined8 **)(unaff_x29 + -0x78) = puVar23;
              *(dword **)(unaff_x29 + -0x70) = in_stack_00000210;
              *(undefined8 **)(unaff_x29 + -0x68) = puVar23 + (long)in_stack_00000220 * 2;
              if (in_stack_00000220 != (dword *)0x0) {
                do {
                  *(undefined8 **)(unaff_x29 + -0x78) = puVar23 + 2;
                  plVar46 = (long *)*puVar23;
                  plVar57 = (long *)puVar23[1];
                  if (plVar57 != (long *)0x0) {
                    *(long **)(unaff_x29 + -0xf0) = plVar57;
                    lVar61 = *plVar57;
                    *plVar57 = lVar61 + 1;
                    if (lVar61 < 0) {
                      func_0x007a05dc();
                      goto code_r0x0054319c;
                    }
                    plVar57 = (long *)func_0x00547df0(in_stack_000000f8,
                                                      *(undefined8 *)(unaff_x29 + -0xf0));
                    uVar39 = *(ulong *)*plVar57;
                    *(ulong *)*plVar57 = uVar39 + 1;
                    if (0xfffffffffffffffe < uVar39) goto code_r0x0054319c;
                    lVar61 = *plVar57;
                    *(long *)(unaff_x29 + -0xd8) = lVar61;
                    if (*(long *)(lVar61 + 0x10) != 0) {
                      func_0x007a2334(&UNK_009ecdc8);
                      goto code_r0x0054319c;
                    }
                    *(undefined8 *)(lVar61 + 0x10) = 0xffffffffffffffff;
                    lVar22 = *plVar46;
                    *plVar46 = lVar22 + 1;
                    if (lVar22 < 0) {
                      func_0x007a05dc();
                      goto code_r0x0054319c;
                    }
                    func_0x00563744(lVar61 + 0x18,plVar46);
                    *(long *)(lVar61 + 0x10) = *(long *)(lVar61 + 0x10) + 1;
                    lVar61 = *plVar46;
                    *plVar46 = lVar61 + 1;
                    if (lVar61 < 0) {
                      func_0x007a05dc();
                      goto code_r0x0054319c;
                    }
                    uVar39 = **(ulong **)(unaff_x29 + -0xd8);
                    **(ulong **)(unaff_x29 + -0xd8) = uVar39 + 1;
                    if (0xfffffffffffffffe < uVar39) goto code_r0x0054319c;
                    lVar61 = func_0x00563530(in_stack_000000f8 + 0x100,plVar46,
                                             *(undefined8 *)(unaff_x29 + -0xd8));
                    if (lVar61 != 0) {
                      *(long *)(unaff_x29 + -0xc0) = lVar61;
                      uVar66 = _UNK_009ee250;
                      uVar53 = _UNK_009ee248;
                      uVar65 = _UNK_009ee238;
                      if (*(long *)(lVar61 + 0x10) != 0) {
                        func_0x007a2334(&UNK_009ecd98);
                        goto code_r0x0054319c;
                      }
                      in_stack_00000218 = *(undefined8 **)(lVar61 + 0x20);
                      in_stack_00000210 = *(dword **)(lVar61 + 0x18);
                      lVar22 = *(long *)(lVar61 + 0x30);
                      in_stack_00000220 = *(dword **)(lVar61 + 0x28);
                      *(undefined8 *)(lVar61 + 0x20) = _UNK_009ee240;
                      *(undefined8 *)(lVar61 + 0x18) = uVar65;
                      *(undefined8 *)(lVar61 + 0x30) = uVar66;
                      *(undefined8 *)(lVar61 + 0x28) = uVar53;
                      pdVar63 = in_stack_00000210 + 2;
                      if (lVar22 != 0) {
                        lVar61 = *(long *)in_stack_00000210;
                        uVar39 = CONCAT17(-(-1 < lVar61),
                                          CONCAT16(-(-1 < (char)((ulong)lVar61 >> 0x30)),
                                                   CONCAT15(-(-1 < (char)((ulong)lVar61 >> 0x28)),
                                                            CONCAT14(-(-1 < (char)((ulong)lVar61 >>
                                                                                  0x20)),
                                                                     CONCAT13(-(-1 < (char)((ulong)
                                                  lVar61 >> 0x18)),
                                                  CONCAT12(-(-1 < (char)((ulong)lVar61 >> 0x10)),
                                                           CONCAT11(-(-1 < (char)((ulong)lVar61 >> 8
                                                                                 )),
                                                                    -(-1 < (char)lVar61)))))))) &
                                 0x8080808080808080;
                        pdVar34 = in_stack_00000210;
                        do {
                          while (uVar39 == 0) {
                            lVar61 = *(long *)pdVar63;
                            pdVar34 = pdVar34 + -0x10;
                            pdVar63 = pdVar63 + 2;
                            uVar39 = CONCAT17(-(-1 < lVar61),
                                              CONCAT16(-(-1 < (char)((ulong)lVar61 >> 0x30)),
                                                       CONCAT15(-(-1 < (char)((ulong)lVar61 >> 0x28)
                                                                 ),CONCAT14(-(-1 < (char)((ulong)
                                                  lVar61 >> 0x20)),
                                                  CONCAT13(-(-1 < (char)((ulong)lVar61 >> 0x18)),
                                                           CONCAT12(-(-1 < (char)((ulong)lVar61 >>
                                                                                 0x10)),
                                                                    CONCAT11(-(-1 < (char)((ulong)
                                                  lVar61 >> 8)),-(-1 < (char)lVar61)))))))) &
                                     0x8080808080808080;
                          }
                          uVar43 = (uVar39 >> 7 & 0xff00ff00ff00ff00) >> 8 |
                                   (uVar39 >> 7 & 0xff00ff00ff00ff) << 8;
                          uVar43 = (uVar43 & 0xffff0000ffff0000) >> 0x10 |
                                   (uVar43 & 0xffff0000ffff) << 0x10;
                          uVar43 = LZCOUNT(uVar43 >> 0x20 | uVar43 << 0x20) & 0x78;
                          plVar57 = *(long **)((long)pdVar34 + (-8 - uVar43));
                          lVar61 = *plVar57;
                          *plVar57 = lVar61 + 1;
                          if (lVar61 < 0) {
                            func_0x007a05dc();
                            goto code_r0x0054319c;
                          }
                          uVar65 = *(undefined8 *)((long)pdVar34 + (-8 - uVar43));
                          uVar43 = **(ulong **)(unaff_x29 + -0xd8);
                          **(ulong **)(unaff_x29 + -0xd8) = uVar43 + 1;
                          if (0xfffffffffffffffe < uVar43) goto code_r0x0054319c;
                          plVar57 = (long *)func_0x00563530(in_stack_000000f8 + 0x100,uVar65,
                                                            *(undefined8 *)(unaff_x29 + -0xd8));
                          if ((plVar57 != (long *)0x0) &&
                             (lVar61 = *plVar57, *plVar57 = lVar61 + -1, lVar61 + -1 == 0)) {
                            func_0x0057e714(auStack_7ffffffe + 0x8000026e);
                          }
                          uVar39 = uVar39 - 1 & uVar39;
                          lVar22 = lVar22 + -1;
                        } while (lVar22 != 0);
                      }
                      lVar61 = *(long *)(unaff_x29 + -0xd8);
                      if (*(long *)(lVar61 + 0x10) != 0) {
                        func_0x007a2334(&UNK_009ecdb0);
                        goto code_r0x0054319c;
                      }
                      *(undefined8 *)(lVar61 + 0x10) = 0xffffffffffffffff;
                      in_stack_00000278 = (dword *)((long)in_stack_00000218 * 9 + 0x11);
                      in_stack_00000280 = in_stack_00000210 + (long)in_stack_00000218 * -2 + -2;
                      in_stack_00000270 =
                           (dword *)((ulong)(in_stack_00000218 != (undefined8 *)0x0) << 3);
                      func_0x00560524(lVar61 + 0x18,auStack_7ffffffe + 0x8000026e);
                      *(long *)(lVar61 + 0x10) = *(long *)(lVar61 + 0x10) + 1;
                      lVar61 = **(long **)(unaff_x29 + -0xc0) + -1;
                      **(long **)(unaff_x29 + -0xc0) = lVar61;
                      if (lVar61 == 0) {
                        func_0x0057e714(unaff_x29 + -0xc0);
                      }
                    }
                    lVar61 = **(long **)(unaff_x29 + -0xd8) + -1;
                    **(long **)(unaff_x29 + -0xd8) = lVar61;
                    if (lVar61 == 0) {
                      func_0x0057e714(unaff_x29 + -0xd8);
                    }
                    lVar61 = **(long **)(unaff_x29 + -0xf0);
                    **(long **)(unaff_x29 + -0xf0) = lVar61 + -1;
                    LORelease();
                    if (lVar61 == 1) {
                      func_0x005d2ac4(unaff_x29 + -0xf0);
                    }
                  }
                  lVar61 = *plVar46;
                  *plVar46 = lVar61 + -1;
                  LORelease();
                  if (lVar61 == 1) {
                    func_0x005d2ac4(auStack_7ffffffe + 0x800002b6);
                  }
                  puVar23 = *(undefined8 **)(unaff_x29 + -0x78);
                } while (puVar23 != *(undefined8 **)(unaff_x29 + -0x68));
              }
              func_0x00592d18(unaff_x29 + -0x80);
            }
            if (uVar30 <= uVar62) break;
            uVar39 = uVar62;
            uVar62 = uVar62 + 1;
            puVar23 = in_stack_00000218;
          }
        }
      }
      func_0x0053cd04(&uStack0000000000000100);
      func_0x00559ad0(&uStack0000000000000100,*(long *)(in_stack_000000f8 + 8),
                      *(long *)(in_stack_000000f8 + 8) + *(long *)(in_stack_000000f8 + 0x10) * 0x18,
                      &UNK_009ec388);
      uStack0000000000000118 = _iStack0000000000000108 + (long)_uStack0000000000000110 * 2;
      bVar1 = _uStack0000000000000110 != (long *)0x0;
      plVar46 = _iStack0000000000000108;
      _uStack0000000000000110 = uStack0000000000000100;
      if (bVar1) {
        do {
          plVar57 = (long *)_iStack0000000000000108[1];
          *(long *)(unaff_x29 + -0xc0) = *_iStack0000000000000108;
          lVar61 = *plVar57;
          *plVar57 = lVar61 + 1;
          uStack0000000000000100 = plVar46;
          if (lVar61 < 0) {
            _iStack0000000000000108 = _iStack0000000000000108 + 2;
            func_0x007a05dc();
            goto code_r0x0054319c;
          }
          _iStack0000000000000108 = _iStack0000000000000108 + 2;
          plVar46 = (long *)func_0x00544148(in_stack_000000f8,plVar57);
          uVar29 = *(ulong *)*plVar46;
          *(ulong *)*plVar46 = uVar29 + 1;
          if (0xfffffffffffffffe < uVar29) goto code_r0x0054319c;
          lVar61 = *plVar46;
          *(long *)(unaff_x29 + -0x80) = lVar61;
          if (*(long *)(in_stack_000000f8 + 0x198) == 0) {
code_r0x005416f4:
            func_0x007a23d8(&UNK_008aad91,0x16,&UNK_009ec4a0);
            goto code_r0x0054319c;
          }
          lVar22 = 0;
          plVar46 = *(long **)(unaff_x29 + -0xc0);
          lVar15 = *(long *)(in_stack_000000f8 + 0x180);
          uVar30 = *(ulong *)(in_stack_000000f8 + 0x188);
          bVar37 = (byte)((ulong)((long)(plVar46 + 1) * 0x517cc1b727220a95) >> 0x39);
          uVar39 = (long)(plVar46 + 1) * 0x517cc1b727220a95 & uVar30;
          uVar65 = *(undefined8 *)(lVar15 + uVar39);
          uVar29 = CONCAT17(-((byte)((ulong)uVar65 >> 0x38) == bVar37),
                            CONCAT16(-((byte)((ulong)uVar65 >> 0x30) == bVar37),
                                     CONCAT15(-((byte)((ulong)uVar65 >> 0x28) == bVar37),
                                              CONCAT14(-((byte)((ulong)uVar65 >> 0x20) == bVar37),
                                                       CONCAT13(-((byte)((ulong)uVar65 >> 0x18) ==
                                                                 bVar37),CONCAT12(-((byte)((ulong)
                                                  uVar65 >> 0x10) == bVar37),
                                                  CONCAT11(-((byte)((ulong)uVar65 >> 8) == bVar37),
                                                           -((byte)uVar65 == bVar37)))))))) &
                   0x8080808080808080;
          while( true ) {
            while (uVar29 == 0) {
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
              lVar22 = lVar22 + 8;
              uVar39 = uVar39 + lVar22 & uVar30;
              uVar65 = *(undefined8 *)(lVar15 + uVar39);
              uVar29 = CONCAT17(-((byte)((ulong)uVar65 >> 0x38) == bVar37),
                                CONCAT16(-((byte)((ulong)uVar65 >> 0x30) == bVar37),
                                         CONCAT15(-((byte)((ulong)uVar65 >> 0x28) == bVar37),
                                                  CONCAT14(-((byte)((ulong)uVar65 >> 0x20) == bVar37
                                                            ),CONCAT13(-((byte)((ulong)uVar65 >>
                                                                               0x18) == bVar37),
                                                                       CONCAT12(-((byte)((ulong)
                                                  uVar65 >> 0x10) == bVar37),
                                                  CONCAT11(-((byte)((ulong)uVar65 >> 8) == bVar37),
                                                           -((byte)uVar65 == bVar37)))))))) &
                       0x8080808080808080;
            }
            uVar62 = (uVar29 >> 7 & 0xff00ff00ff00ff00) >> 8 | (uVar29 >> 7 & 0xff00ff00ff00ff) << 8
            ;
            uVar62 = (uVar62 & 0xffff0000ffff0000) >> 0x10 | (uVar62 & 0xffff0000ffff) << 0x10;
            uVar62 = uVar39 + ((ulong)LZCOUNT(uVar62 >> 0x20 | uVar62 << 0x20) >> 3) & uVar30;
            if (plVar46 == *(long **)(lVar15 + -0x28 + uVar62 * -0x28)) break;
            uVar29 = uVar29 - 1 & uVar29;
          }
          if (*(long *)(lVar61 + 0x10) != 0) {
            func_0x007a2334(&UNK_009ec4b8);
            goto code_r0x0054319c;
          }
          lVar15 = lVar15 + uVar62 * -0x28;
          in_stack_00000280 = *(dword **)(lVar15 + -8);
          in_stack_00000278 = *(dword **)(lVar15 + -0x10);
          *(undefined8 *)(lVar61 + 0x10) = 0xffffffffffffffff;
          lVar22 = *plVar46;
          *plVar46 = lVar22 + 1;
          if (lVar22 < 0) {
            func_0x007a05dc();
            goto code_r0x0054319c;
          }
          plVar46 = (long *)func_0x00582704(lVar61 + 0x18,auStack_7ffffffe + 0x8000026e,
                                            *(undefined8 *)(unaff_x29 + -0xc0));
          if (plVar46 != (long *)0x0) {
            lVar22 = *plVar46;
            *plVar46 = lVar22 + -1;
            LORelease();
            if (lVar22 == 1) {
              func_0x005d2ac4(auStack_7ffffffe + 0x8000020e);
            }
          }
          *(long *)(lVar61 + 0x10) = *(long *)(lVar61 + 0x10) + 1;
          lVar61 = **(long **)(unaff_x29 + -0xc0);
          **(long **)(unaff_x29 + -0xc0) = lVar61 + 1;
          if (lVar61 < 0) {
            func_0x007a05dc();
            goto code_r0x0054319c;
          }
          in_stack_00000270 =
               (dword *)func_0x00562594(in_stack_000000f8 + 0x120,*(undefined8 *)(unaff_x29 + -0xc0)
                                        ,*(undefined8 *)(unaff_x29 + -0x80));
          if ((in_stack_00000270 != (dword *)0x0) &&
             (lVar61 = *(long *)in_stack_00000270, *(long *)in_stack_00000270 = lVar61 + -1,
             lVar61 + -1 == 0)) {
            func_0x0057e6ac(auStack_7ffffffe + 0x8000026e);
          }
          lVar61 = *plVar57;
          *plVar57 = lVar61 + -1;
          LORelease();
          if (lVar61 == 1) {
            func_0x005d2ac4(auStack_7ffffffe + 0x8000024e);
          }
          lVar61 = **(long **)(unaff_x29 + -0xc0);
          **(long **)(unaff_x29 + -0xc0) = lVar61 + -1;
          LORelease();
          plVar46 = uStack0000000000000100;
          if (lVar61 == 1) {
            func_0x005d2ac4(unaff_x29 + -0xc0);
            plVar46 = uStack0000000000000100;
          }
        } while (_iStack0000000000000108 != uStack0000000000000118);
      }
      uStack0000000000000100 = plVar46;
      func_0x005927a0(&uStack0000000000000100);
      lVar61 = *(long *)(*(long *)(in_stack_000000f8 + 0xd8) + 0x20);
      _iStack0000000000000108 =
           (long *)(lVar61 + *(long *)(*(long *)(in_stack_000000f8 + 0xd8) + 0x28) * 0x20);
      uStack0000000000000100._0_4_ = (uint)lVar61;
      uStack0000000000000100._4_4_ = (undefined4)((ulong)lVar61 >> 0x20);
      uStack0000000000000110 = 0;
      uStack0000000000000114 = 0;
      func_0x00559d3c(auStack_7ffffffe + 0x8000026e,&uStack0000000000000100,&UNK_009ec388);
      pdVar34 = in_stack_00000270;
      pdVar63 = in_stack_00000278;
      if (in_stack_00000280 != (dword *)0x0) {
        pdVar20 = in_stack_00000278 + (long)in_stack_00000280;
        pdVar31 = in_stack_00000278;
        pdVar75 = in_stack_00000270;
        pdVar76 = in_stack_00000278;
        do {
          pdVar50 = pdVar31 + 1;
          uVar2 = *pdVar31;
          lVar61 = *(long *)(in_stack_000000f8 + 0xd8);
          if (((ulong)uVar2 < *(ulong *)(lVar61 + 0x28)) &&
             (plVar46 = (long *)(*(long *)(lVar61 + 0x20) + (ulong)uVar2 * 0x20),
             *plVar46 != -0x8000000000000000)) {
            lVar22 = plVar46[3];
          }
          else {
            lVar22 = -1;
          }
          uStack0000000000000100._0_4_ = 1;
          uStack0000000000000100._4_4_ = 0;
          iStack0000000000000108 = (int)*(undefined8 *)(lVar61 + 0x38);
          uStack000000000000010c = (undefined4)((ulong)*(undefined8 *)(lVar61 + 0x38) >> 0x20);
          uStack0000000000000110 = (undefined4)*(undefined8 *)(lVar61 + 0x40);
          uStack0000000000000114 = (undefined4)((ulong)*(undefined8 *)(lVar61 + 0x40) >> 0x20);
          uStack0000000000000118._0_4_ = (undefined4)lVar22;
          uStack0000000000000118._4_4_ = (undefined4)((ulong)lVar22 >> 0x20);
          in_stack_00000120 = (dword *)CONCAT44(in_stack_00000120._4_4_,uVar2);
          func_0x0055915c(auStack_7ffffffe + 0x8000026e,&uStack0000000000000100,&UNK_009ec388);
          pdVar34 = pdVar75;
          pdVar63 = pdVar76;
          if (in_stack_00000280 != (dword *)0x0) {
            pdVar31 = pdVar76 + (long)in_stack_00000280;
            pdVar24 = pdVar76;
            do {
              pdVar55 = pdVar24 + 1;
              if (*(ulong *)(*(long *)(in_stack_000000f8 + 0xd8) + 0x40) <= (ulong)*pdVar24) {
code_r0x00543118:
                func_0x007a23bc(&UNK_009ec800);
                goto code_r0x0054319c;
              }
              puVar23 = (undefined8 *)
                        (*(long *)(*(long *)(in_stack_000000f8 + 0xd8) + 0x38) +
                        (ulong)*pdVar24 * 0x30);
              in_stack_00000280 = (dword *)*puVar23;
              if (in_stack_00000280 == (dword *)0x8000000000000000) goto code_r0x00543118;
              pdVar34 = (dword *)puVar23[1];
              lVar61 = puVar23[2];
              *puVar23 = 0;
              puVar23[1] = 8;
              puVar23[2] = 0;
              pdVar24 = pdVar34;
              pdVar63 = pdVar34;
              if (lVar61 != 0) {
                do {
                  pdVar63 = pdVar24 + 0x12;
                  lVar22 = *(long *)(pdVar24 + 2);
                  if (lVar22 == 0xc) break;
                  plVar46 = *(long **)(pdVar24 + 4);
                  *(undefined8 *)(unaff_x29 + -0xc0) = *(undefined8 *)pdVar24;
                  if (lVar22 != 0) {
                    uStack0000000000000128 = *(dword **)(pdVar24 + 0xc);
                    in_stack_00000120 = *(dword **)(pdVar24 + 10);
                    in_stack_00000138 = *(long **)(pdVar24 + 0x10);
                    in_stack_00000130 = *(dword **)(pdVar24 + 0xe);
                    uStack0000000000000118._0_4_ = (undefined4)*(undefined8 *)(pdVar24 + 8);
                    uStack0000000000000118._4_4_ =
                         (undefined4)((ulong)*(undefined8 *)(pdVar24 + 8) >> 0x20);
                    uStack0000000000000110 = (undefined4)*(undefined8 *)(pdVar24 + 6);
                    uStack0000000000000114 =
                         (undefined4)((ulong)*(undefined8 *)(pdVar24 + 6) >> 0x20);
                    uStack0000000000000100._0_4_ = (uint)lVar22;
                    uStack0000000000000100._4_4_ = (undefined4)((ulong)lVar22 >> 0x20);
                    iStack0000000000000108 = (int)plVar46;
                    uStack000000000000010c = (undefined4)((ulong)plVar46 >> 0x20);
                    func_0x007a2810(&UNK_008aabcc,0x2b,&uStack0000000000000100,&UNK_009ec3a0,
                                    &UNK_009ec818);
                    goto code_r0x0054319c;
                  }
                  plVar57 = (long *)func_0x00544148(in_stack_000000f8);
                  uVar29 = *(ulong *)*plVar57;
                  *(ulong *)*plVar57 = uVar29 + 1;
                  if (0xfffffffffffffffe < uVar29) goto code_r0x0054319c;
                  lVar22 = *plVar57;
                  *(long *)(unaff_x29 + -0x80) = lVar22;
                  if (*(long *)(in_stack_000000f8 + 0x198) == 0) {
code_r0x00541b68:
                    func_0x007a23d8(&UNK_008aad91,0x16,&UNK_009ec830);
                    goto code_r0x0054319c;
                  }
                  lVar15 = 0;
                  lVar47 = *(long *)(in_stack_000000f8 + 0x180);
                  uVar30 = *(ulong *)(in_stack_000000f8 + 0x188);
                  bVar37 = (byte)((ulong)((long)(plVar46 + 1) * 0x517cc1b727220a95) >> 0x39);
                  uVar39 = (long)(plVar46 + 1) * 0x517cc1b727220a95 & uVar30;
                  uVar65 = *(undefined8 *)(lVar47 + uVar39);
                  uVar29 = CONCAT17(-((byte)((ulong)uVar65 >> 0x38) == bVar37),
                                    CONCAT16(-((byte)((ulong)uVar65 >> 0x30) == bVar37),
                                             CONCAT15(-((byte)((ulong)uVar65 >> 0x28) == bVar37),
                                                      CONCAT14(-((byte)((ulong)uVar65 >> 0x20) ==
                                                                bVar37),CONCAT13(-((byte)((ulong)
                                                  uVar65 >> 0x18) == bVar37),
                                                  CONCAT12(-((byte)((ulong)uVar65 >> 0x10) == bVar37
                                                            ),CONCAT11(-((byte)((ulong)uVar65 >> 8)
                                                                        == bVar37),
                                                                       -((byte)uVar65 == bVar37)))))
                                                  ))) & 0x8080808080808080;
                  while( true ) {
                    while (uVar29 == 0) {
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
                      uVar39 = uVar39 + lVar15 & uVar30;
                      uVar65 = *(undefined8 *)(lVar47 + uVar39);
                      uVar29 = CONCAT17(-((byte)((ulong)uVar65 >> 0x38) == bVar37),
                                        CONCAT16(-((byte)((ulong)uVar65 >> 0x30) == bVar37),
                                                 CONCAT15(-((byte)((ulong)uVar65 >> 0x28) == bVar37)
                                                          ,CONCAT14(-((byte)((ulong)uVar65 >> 0x20)
                                                                     == bVar37),
                                                                    CONCAT13(-((byte)((ulong)uVar65
                                                                                     >> 0x18) ==
                                                                              bVar37),CONCAT12(-((
                                                  byte)((ulong)uVar65 >> 0x10) == bVar37),
                                                  CONCAT11(-((byte)((ulong)uVar65 >> 8) == bVar37),
                                                           -((byte)uVar65 == bVar37)))))))) &
                               0x8080808080808080;
                    }
                    uVar62 = (uVar29 >> 7 & 0xff00ff00ff00ff00) >> 8 |
                             (uVar29 >> 7 & 0xff00ff00ff00ff) << 8;
                    uVar62 = (uVar62 & 0xffff0000ffff0000) >> 0x10 |
                             (uVar62 & 0xffff0000ffff) << 0x10;
                    uVar62 = uVar39 + ((ulong)LZCOUNT(uVar62 >> 0x20 | uVar62 << 0x20) >> 3) &
                             uVar30;
                    if (plVar46 == *(long **)(lVar47 + -0x28 + uVar62 * -0x28)) break;
                    uVar29 = uVar29 - 1 & uVar29;
                  }
                  if (*(long *)(lVar22 + 0x10) != 0) {
                    func_0x007a2334(&UNK_009ec848);
                    goto code_r0x0054319c;
                  }
                  lVar47 = lVar47 + uVar62 * -0x28;
                  uVar65 = *(undefined8 *)(lVar47 + -0x20);
                  uVar66 = *(undefined8 *)(lVar47 + -8);
                  uVar53 = *(undefined8 *)(lVar47 + -0x10);
                  *(undefined8 *)(lVar22 + 0x10) = 0xffffffffffffffff;
                  uStack0000000000000100._0_4_ = (uint)uVar65;
                  uStack0000000000000100._4_4_ = (undefined4)((ulong)uVar65 >> 0x20);
                  uStack0000000000000110 = (undefined4)uVar66;
                  uStack0000000000000114 = (undefined4)((ulong)uVar66 >> 0x20);
                  iStack0000000000000108 = (int)uVar53;
                  uStack000000000000010c = (undefined4)((ulong)uVar53 >> 0x20);
                  lVar15 = *plVar46;
                  *plVar46 = lVar15 + 1;
                  if (lVar15 < 0) {
                    func_0x007a05dc();
                    goto code_r0x0054319c;
                  }
                  plVar57 = (long *)func_0x00582704(lVar22 + 0x18,&uStack0000000000000100,plVar46);
                  if (plVar57 != (long *)0x0) {
                    lVar15 = *plVar57;
                    *plVar57 = lVar15 + -1;
                    LORelease();
                    if (lVar15 == 1) {
                      func_0x005d2ac4(auStack_7ffffffe + 0x8000020e);
                    }
                  }
                  *(long *)(lVar22 + 0x10) = *(long *)(lVar22 + 0x10) + 1;
                  plVar46 = (long *)func_0x00562594(in_stack_000000f8 + 0x120,plVar46,
                                                    *(undefined8 *)(unaff_x29 + -0x80));
                  uStack0000000000000100._0_4_ = (uint)plVar46;
                  uStack0000000000000100._4_4_ = (undefined4)((ulong)plVar46 >> 0x20);
                  if ((plVar46 != (long *)0x0) &&
                     (lVar22 = *plVar46, *plVar46 = lVar22 + -1, lVar22 + -1 == 0)) {
                    func_0x0057e6ac(&uStack0000000000000100);
                  }
                  pdVar24 = pdVar63;
                } while (pdVar63 != pdVar34 + lVar61 * 0x12);
              }
              func_0x00592bf8(auStack_7ffffffe + 0x8000026e);
              pdVar24 = pdVar55;
            } while (pdVar55 != pdVar31);
          }
          if (pdVar75 != (dword *)0x0) {
            func_0x00187bd4(pdVar76,(long)pdVar75 << 2,4);
          }
          pdVar31 = pdVar50;
          pdVar75 = pdVar34;
          pdVar76 = pdVar63;
        } while (pdVar50 != pdVar20);
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
            lVar61 = 0;
            uVar29 = (auVar74._8_8_ & 0xffffffff) * 0x517cc1b727220a95;
            bVar37 = (byte)(uVar29 >> 0x39);
            while( true ) {
              uVar29 = uVar29 & *(ulong *)(in_stack_000000f8 + 0x208);
              uVar65 = *(undefined8 *)(*(long *)(in_stack_000000f8 + 0x200) + uVar29);
              bVar67 = (byte)((ulong)uVar65 >> 8);
              bVar68 = (byte)((ulong)uVar65 >> 0x10);
              bVar69 = (byte)((ulong)uVar65 >> 0x18);
              bVar70 = (byte)((ulong)uVar65 >> 0x20);
              bVar71 = (byte)((ulong)uVar65 >> 0x28);
              bVar72 = (byte)((ulong)uVar65 >> 0x30);
              bVar73 = (byte)((ulong)uVar65 >> 0x38);
              for (uVar30 = CONCAT17(-(bVar73 == bVar37),
                                     CONCAT16(-(bVar72 == bVar37),
                                              CONCAT15(-(bVar71 == bVar37),
                                                       CONCAT14(-(bVar70 == bVar37),
                                                                CONCAT13(-(bVar69 == bVar37),
                                                                         CONCAT12(-(bVar68 == bVar37
                                                                                   ),CONCAT11(-(
                                                  bVar67 == bVar37),-((byte)uVar65 == bVar37))))))))
                            & 0x8080808080808080; uVar30 != 0; uVar30 = uVar30 - 1 & uVar30) {
                uVar39 = (uVar30 >> 7 & 0xff00ff00ff00ff00) >> 8 |
                         (uVar30 >> 7 & 0xff00ff00ff00ff) << 8;
                uVar39 = (uVar39 & 0xffff0000ffff0000) >> 0x10 | (uVar39 & 0xffff0000ffff) << 0x10;
                if (auVar74._8_4_ ==
                    *(int *)(*(long *)(in_stack_000000f8 + 0x200) + -4 +
                            (uVar29 + ((ulong)LZCOUNT(uVar39 >> 0x20 | uVar39 << 0x20) >> 3) &
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
              lVar61 = lVar61 + 8;
              uVar29 = uVar29 + lVar61;
            }
          }
          goto code_r0x00541b04;
        }
        if ((*(uint *)(*(long *)(in_stack_000000f8 + 0xd8) + 0x78) & 1) != 0) {
          func_0x0058bce0(&uStack0000000000000100,in_stack_000000f8 + 0x48,
                          *(undefined4 *)(*(long *)(in_stack_000000f8 + 0xd8) + 0x7c));
          while( true ) {
            uVar29 = func_0x0058be04(&uStack0000000000000100,
                                     *(long *)(in_stack_000000f8 + 0xd8) + 0x18);
            if ((uVar29 & 1) == 0) break;
            func_0x005444ec(in_stack_000000f8);
          }
          if (CONCAT44(uStack0000000000000100._4_4_,(uint)uStack0000000000000100) != 0) {
            func_0x00187bd4(_iStack0000000000000108,
                            CONCAT44(uStack0000000000000100._4_4_,(uint)uStack0000000000000100) << 2
                            ,4);
          }
          func_0x004d0c00(&uStack0000000000000118);
          if (pdVar34 != (dword *)0x0) {
            func_0x00187bd4(pdVar63,(long)pdVar34 << 2,4);
          }
          func_0x004d0c00(auStack_7ffffffe + 0x80000286);
          lVar22 = _UNK_009ec480;
          plVar33 = _UNK_009ec478;
          puVar18 = _UNK_009ec470;
          plVar17 = _UNK_009ec468;
          uVar65 = *(undefined8 *)(in_stack_000000f8 + 0xd8);
          plVar57 = *(long **)(in_stack_000000f8 + 0x120);
          lVar61 = (long)plVar57 + *(long *)(in_stack_000000f8 + 0x128) + 1;
          lVar15 = *plVar57;
          plVar46 = plVar57 + 1;
          puVar36 = (uint *)(CONCAT17(-(-1 < lVar15),
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
            puVar23 = auVar74._0_8_;
            if (puVar23 == (undefined8 *)0x0) break;
            lVar15 = *auVar74._8_8_;
            if (0x7ffffffffffffffe < *(ulong *)(lVar15 + 0x10)) {
              func_0x007a2378(&UNK_009ec710);
              goto code_r0x0054319c;
            }
            *(ulong *)(lVar15 + 0x10) = *(ulong *)(lVar15 + 0x10) + 1;
            pdVar34 = *(dword **)(lVar15 + 0x18);
            if (pdVar34 == (dword *)0x0) {
              in_stack_00000140 = (dword *)0x0;
            }
            else {
              in_stack_00000138 = *(long **)(lVar15 + 0x20);
              in_stack_00000140 = *(dword **)(lVar15 + 0x28);
              _iStack0000000000000108 = (long *)0x0;
              uStack0000000000000110 = SUB84(pdVar34,0);
              uStack0000000000000114 = (undefined4)((ulong)pdVar34 >> 0x20);
              uStack0000000000000128 = (dword *)0x0;
              in_stack_00000130 = pdVar34;
              uStack0000000000000118 = in_stack_00000138;
            }
            bVar1 = pdVar34 != (dword *)0x0;
            in_stack_00000120 = (dword *)(ulong)bVar1;
            uStack0000000000000100._0_4_ = (uint)bVar1;
            uStack0000000000000100._4_4_ = 0;
            auVar74 = func_0x0058027c(&uStack0000000000000100);
            puVar56 = auVar74._8_8_;
            if (auVar74._0_8_ == 0) {
              func_0x007a23bc(&UNK_009ec728);
              goto code_r0x0054319c;
            }
            plVar25 = (long *)*puVar23;
            if (plVar25 != (long *)*puVar56) {
              lVar47 = *plVar25;
              *plVar25 = lVar47 + 1;
              if (lVar47 < 0) {
                func_0x007a05dc();
                goto code_r0x0054319c;
              }
              uVar53 = *puVar23;
              uStack0000000000000100._0_4_ = (uint)uVar53;
              uStack0000000000000100._4_4_ = (undefined4)((ulong)uVar53 >> 0x20);
              lVar47 = *(long *)*puVar56;
              *(long *)*puVar56 = lVar47 + 1;
              if (lVar47 < 0) {
                func_0x007a05dc();
                goto code_r0x0054319c;
              }
              plVar25 = (long *)func_0x0056237c(auStack_7ffffffe + 0x8000020e,uVar53,*puVar56);
              *(long **)(unaff_x29 + -0x80) = plVar25;
              if (plVar25 != (long *)0x0) {
                lVar47 = *plVar25;
                *plVar25 = lVar47 + -1;
                LORelease();
                if (lVar47 == 1) {
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
          uStack0000000000000118._0_4_ = (undefined4)lVar22;
          uStack0000000000000118._4_4_ = (undefined4)((ulong)lVar22 >> 0x20);
          uStack0000000000000110 = SUB84(plVar33,0);
          uStack0000000000000114 = (undefined4)((ulong)plVar33 >> 0x20);
          func_0x0054ade4(uVar65,&uStack0000000000000100);
          lVar47 = *(long *)(in_stack_000000f8 + 0xd8);
          lVar15 = *(long *)(lVar47 + 0x20);
          _iStack0000000000000108 = (long *)(lVar15 + *(long *)(lVar47 + 0x28) * 0x20);
          uStack0000000000000100._0_4_ = (uint)lVar15;
          uStack0000000000000100._4_4_ = (undefined4)((ulong)lVar15 >> 0x20);
          uStack0000000000000110 = 0;
          uStack0000000000000114 = 0;
          func_0x00559d3c(auStack_7ffffffe + 0x8000026e,&uStack0000000000000100,&UNK_009ec388);
          if (plVar46 != (long *)0x0) {
            puVar60 = puVar36 + (long)plVar46;
            in_stack_00000050 = (dword *)&UNK_009ec4d0;
            in_stack_00000040 = &UNK_009ec680;
            puStack0000000000000060 = &UNK_009ec638;
            puVar26 = puVar36;
            plVar25 = plVar57;
            puVar77 = puVar36;
            do {
              puVar27 = puVar26 + 1;
              uVar30 = (ulong)*puVar26;
              pdVar34 = &MACH_HEADER.cpusubtype;
              lVar15 = 0;
              uVar29 = *(ulong *)(lVar47 + 0x28);
              if ((uVar29 <= uVar30) ||
                 (plVar64 = (long *)(*(long *)(lVar47 + 0x20) + uVar30 * 0x20),
                 *plVar64 == -0x8000000000000000)) {
code_r0x00543020:
                func_0x007a23bc(in_stack_00000050);
                goto code_r0x0054319c;
              }
              if (plVar64[2] != 0) {
                lVar42 = 0;
                lVar44 = plVar64[1];
                lVar49 = lVar44 + plVar64[2] * 0x108;
                do {
                  uVar10 = uStack0000000000000100._4_4_;
                  uVar8 = (uint)uStack0000000000000100;
                  uStack0000000000000100._0_4_ = uVar8;
                  uStack0000000000000100._4_4_ = uVar10;
                  if (*(long *)(lVar44 + 0x18) == 0xf) {
                    if ((*(byte *)(lVar44 + 0x51) & 1) != 0) {
                      uVar29 = *(ulong *)(lVar44 + 0x30);
                      uStack0000000000000100._0_4_ = (uint)lVar42;
                      uVar9 = (uint)uStack0000000000000100;
                      uStack0000000000000100._4_4_ = (undefined4)((ulong)lVar42 >> 0x20);
                      uVar11 = uStack0000000000000100._4_4_;
                      if (uVar29 == 1) {
                        if (*(long *)(lVar44 + 0x48) == 0) {
                          uStack0000000000000100._0_4_ = uVar8;
                          uStack0000000000000100._4_4_ = uVar10;
                          func_0x007a2570(0,0,&UNK_009ec500);
                          goto code_r0x0054319c;
                        }
                        if (**(long **)(lVar44 + 0x40) == 0) {
                          if (**(long **)(lVar44 + 0x28) != -0x8000000000000000) {
                            in_stack_00000050 = (dword *)&UNK_009ec6f8;
                            uStack0000000000000100._0_4_ = uVar8;
                            uStack0000000000000100._4_4_ = uVar10;
                            goto code_r0x00543020;
                          }
                          if ((*(long **)(lVar44 + 0x40))[1] == (*(long **)(lVar44 + 0x28))[1]) {
                            iStack0000000000000108 = 0;
                            uStack000000000000010c = 0;
                            uStack0000000000000110 = 8;
                            uStack0000000000000114 = 0;
                            uStack0000000000000118._0_4_ = 0;
                            uStack0000000000000118._4_4_ = 0;
                            if (lVar15 == 0) {
                              func_0x00582c4c(auStack_7ffffffe + 0x800002b6,&UNK_009ec518);
                            }
                            lVar54 = lVar15 * 0x20;
                            *(long **)(lVar54 + 0x10) = _iStack0000000000000108;
                            *(ulong *)(lVar54 + 8) =
                                 CONCAT44(uStack0000000000000100._4_4_,(uint)uStack0000000000000100)
                            ;
                            *(ulong *)(lVar54 + 0x20) =
                                 CONCAT44(uStack0000000000000118._4_4_,
                                          (undefined4)uStack0000000000000118);
                            *(ulong *)(lVar54 + 0x18) =
                                 CONCAT44(uStack0000000000000114,uStack0000000000000110);
                            lVar15 = lVar15 + 1;
                            goto code_r0x00541e58;
                          }
                        }
                        *(undefined1 *)(lVar44 + 0x51) = 0;
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
                        if (uVar29 != 0) {
                          lVar54 = 0;
                          lVar61 = 0;
                          uVar39 = 0;
                          do {
                            while( true ) {
                              uVar62 = *(ulong *)(lVar44 + 0x30);
                              if (uVar62 <= uVar39) goto code_r0x00543108;
                              plVar46 = (long *)(*(long *)(lVar44 + 0x28) + lVar54);
                              if (*plVar46 != -0x8000000000000000) {
                                puStack0000000000000060 = &UNK_009ec698;
                                goto code_r0x00542e20;
                              }
                              uVar62 = *(ulong *)(lVar44 + 0x48);
                              if (uVar62 <= uVar39) {
                                in_stack_00000040 = &UNK_009ec6b0;
                                goto code_r0x00543108;
                              }
                              plVar25 = (long *)(*(long *)(lVar44 + 0x40) + lVar61);
                              if (*plVar25 == 0) break;
                              puVar23 = (undefined8 *)func_0x00187bd0(0x18,8);
                              if (puVar23 == (undefined8 *)0x0) {
                                func_0x007a1f18(8,0x18);
                                goto code_r0x0054319c;
                              }
                              lVar59 = *(long *)plVar46[1];
                              *(long *)plVar46[1] = lVar59 + 1;
                              if (lVar59 < 0) {
                                func_0x007a05dc();
                                goto code_r0x0054319c;
                              }
                              lVar59 = plVar46[1];
                              *puVar23 = 0x8000000000000000;
                              puVar23[1] = lVar59;
                              *(undefined8 *)(unaff_x29 + -0x80) = 1;
                              *(undefined8 **)(unaff_x29 + -0x78) = puVar23;
                              *(undefined8 *)(unaff_x29 + -0x70) = 1;
                              pdVar20 = (dword *)func_0x00187bd0(0x40,8);
                              if (pdVar20 == (dword *)0x0) {
                                func_0x007a1f18(8,0x40);
                                goto code_r0x0054319c;
                              }
                              func_0x0053e7a8(&uStack0000000000000100,plVar25);
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
                              lVar59 = *(long *)(unaff_x29 + -0xb0);
                              in_stack_00000120 = pdVar20;
                              if (lVar59 == *(long *)(unaff_x29 + -0xc0)) {
                                func_0x00582d00(unaff_x29 + -0xc0,&UNK_009ec6e0);
                              }
                              puVar23 = (undefined8 *)(*(long *)(unaff_x29 + -0xb8) + lVar59 * 0x38)
                              ;
                              puVar23[1] = _iStack0000000000000108;
                              *puVar23 = CONCAT44(uStack0000000000000100._4_4_,
                                                  (uint)uStack0000000000000100);
                              puVar23[3] = CONCAT44(uStack0000000000000118._4_4_,
                                                    (undefined4)uStack0000000000000118);
                              puVar23[2] = CONCAT44(uStack0000000000000114,uStack0000000000000110);
                              puVar23[5] = uStack0000000000000128;
                              puVar23[4] = in_stack_00000120;
                              puVar23[6] = in_stack_00000130;
                              *(long *)(unaff_x29 + -0xb0) = lVar59 + 1;
                              uVar39 = uVar39 + 1;
                              lVar61 = lVar61 + 0x40;
                              lVar54 = lVar54 + 0x18;
                              if (uVar29 == uVar39) goto code_r0x00542188;
                            }
                            lVar59 = *(long *)plVar25[1];
                            *(long *)plVar25[1] = lVar59 + 1;
                            if (lVar59 < 0) goto code_r0x00542dec;
                            plVar64 = (long *)plVar25[1];
                            uStack0000000000000100._0_4_ = (uint)plVar64;
                            uStack0000000000000100._4_4_ = (undefined4)((ulong)plVar64 >> 0x20);
                            lVar59 = *plVar64;
                            *plVar64 = lVar59 + 1;
                            if (lVar59 < 0) {
                              func_0x007a05dc();
                              goto code_r0x0054319c;
                            }
                            plVar64 = (long *)func_0x0056237c(auStack_7ffffffe + 0x8000020e,plVar64,
                                                              plVar25[1]);
                            *(long **)(unaff_x29 + -0x80) = plVar64;
                            if (plVar64 != (long *)0x0) {
                              lVar59 = *plVar64;
                              *plVar64 = lVar59 + -1;
                              LORelease();
                              if (lVar59 == 1) {
                                func_0x005d2ac4(unaff_x29 + -0x80);
                              }
                            }
                            lVar59 = *(long *)plVar46[1];
                            *(long *)plVar46[1] = lVar59 + 1;
                            if (lVar59 < 0) goto code_r0x00542dec;
                            lVar16 = plVar46[1];
                            uStack0000000000000100._0_4_ = (uint)lVar16;
                            uStack0000000000000100._4_4_ = (undefined4)((ulong)lVar16 >> 0x20);
                            lVar59 = *(long *)plVar25[1];
                            *(long *)plVar25[1] = lVar59 + 1;
                            if (lVar59 < 0) {
                              func_0x007a05dc();
                              goto code_r0x0054319c;
                            }
                            plVar25 = (long *)func_0x0056237c(auStack_7ffffffe + 0x8000026e,lVar16,
                                                              plVar25[1]);
                            *(long **)(unaff_x29 + -0x80) = plVar25;
                            if (plVar25 != (long *)0x0) {
                              lVar59 = *plVar25;
                              *plVar25 = lVar59 + -1;
                              LORelease();
                              if (lVar59 == 1) {
                                func_0x005d2ac4(unaff_x29 + -0x80);
                              }
                            }
                            lVar59 = *(long *)plVar46[1];
                            *(long *)plVar46[1] = lVar59 + 1;
                            if (lVar59 < 0) goto code_r0x00542dec;
                            lVar59 = plVar46[1];
                            uStack0000000000000100._0_4_ = (uint)lVar59;
                            uStack0000000000000100._4_4_ = (undefined4)((ulong)lVar59 >> 0x20);
                            lVar16 = *(long *)(unaff_x29 + -200);
                            if (lVar16 == *(long *)(unaff_x29 + -0xd8)) {
                              func_0x0058321c(unaff_x29 + -0xd8,&UNK_009ec6c8);
                            }
                            *(long *)(*(long *)(unaff_x29 + -0xd0) + lVar16 * 8) = lVar59;
                            *(long *)(unaff_x29 + -200) = lVar16 + 1;
                            uVar39 = uVar39 + 1;
                            lVar61 = lVar61 + 0x40;
                            lVar54 = lVar54 + 0x18;
                          } while (uVar29 != uVar39);
code_r0x00542188:
                          uVar29 = *(ulong *)(lVar44 + 0x30);
                          if (uVar29 != 0) {
                            uVar62 = 1;
                            uVar39 = 0;
                            while( true ) {
                              uVar43 = uVar62;
                              uVar62 = *(ulong *)(lVar44 + 0x30);
                              if (uVar62 <= uVar39) {
                                in_stack_00000040 = &UNK_009ec620;
                                goto code_r0x00543108;
                              }
                              plVar46 = (long *)(*(long *)(lVar44 + 0x28) + uVar39 * 0x18);
                              plVar25 = plVar46 + 1;
                              if (*plVar46 != -0x8000000000000000) goto code_r0x00542e20;
                              if (lVar22 != 0) {
                                lVar61 = 0;
                                uVar62 = (*plVar25 + 8) * 0x517cc1b727220a95;
                                bVar37 = (byte)(uVar62 >> 0x39);
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
                                  uVar41 = CONCAT17(-(bVar73 == bVar37),
                                                    CONCAT16(-(bVar72 == bVar37),
                                                             CONCAT15(-(bVar71 == bVar37),
                                                                      CONCAT14(-(bVar70 == bVar37),
                                                                               CONCAT13(-(bVar69 ==
                                                                                         bVar37),
                                                  CONCAT12(-(bVar68 == bVar37),
                                                           CONCAT11(-(bVar67 == bVar37),
                                                                    -((byte)uVar65 == bVar37))))))))
                                           & 0x8080808080808080;
                                  if (uVar41 != 0) {
                                    do {
                                      uVar45 = (uVar41 >> 7 & 0xff00ff00ff00ff00) >> 8 |
                                               (uVar41 >> 7 & 0xff00ff00ff00ff) << 8;
                                      uVar45 = (uVar45 & 0xffff0000ffff0000) >> 0x10 |
                                               (uVar45 & 0xffff0000ffff) << 0x10;
                                      if (*plVar25 ==
                                          plVar17[(uVar62 + ((ulong)LZCOUNT(uVar45 >> 0x20 |
                                                                            uVar45 << 0x20) >> 3) &
                                                  (ulong)puVar18) * -2 + -2]) goto code_r0x005422dc;
                                      uVar41 = uVar41 - 1 & uVar41;
                                    } while (uVar41 != 0);
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
                                  lVar61 = lVar61 + 8;
                                  uVar62 = uVar62 + lVar61;
                                }
                              }
                              uVar62 = *(ulong *)(lVar44 + 0x48);
                              if (uVar62 <= uVar39) break;
                              if (*(long *)(*(long *)(lVar44 + 0x40) + uVar39 * 0x40) == 0) {
                                lVar61 = *(long *)*plVar25;
                                *(long *)*plVar25 = lVar61 + 1;
                                if (lVar61 < 0) goto code_r0x00542dec;
                                lVar54 = *plVar25;
                                uStack0000000000000100._0_4_ = (uint)lVar54;
                                uStack0000000000000100._4_4_ = (undefined4)((ulong)lVar54 >> 0x20);
                                lVar61 = *(long *)(unaff_x29 + -0xe0);
                                if (lVar61 == *(long *)(unaff_x29 + -0xf0)) {
                                  func_0x0058321c(unaff_x29 + -0xf0,&UNK_009ec668);
                                }
                                *(long *)(*(long *)(unaff_x29 + -0xe8) + lVar61 * 8) = lVar54;
                                *(long *)(unaff_x29 + -0xe0) = lVar61 + 1;
                              }
code_r0x005422dc:
                              if (uVar29 <= uVar43) goto code_r0x005422e8;
                              uVar62 = uVar43 + 1;
                              uVar39 = uVar43;
                            }
                            in_stack_00000040 = &UNK_009ec650;
code_r0x00543108:
                            func_0x007a2570(uVar39,uVar62,in_stack_00000040);
                            goto code_r0x0054319c;
                          }
                        }
code_r0x005422e8:
                        *(undefined8 *)(unaff_x29 + -0xa8) = 0;
                        lVar61 = 0;
                        lVar54 = *(long *)(unaff_x29 + -200);
                        while (lVar54 != 0) {
                          *(long *)(unaff_x29 + -200) = lVar54 + -1;
                          *(undefined8 *)(unaff_x29 + -0xa0) =
                               *(undefined8 *)(*(long *)(unaff_x29 + -0xd0) + (lVar54 + -1) * 8);
                          while (*(long *)(unaff_x29 + -0xe0) != 0) {
                            lVar54 = *(long *)(unaff_x29 + -0xe0) + -1;
                            *(long *)(unaff_x29 + -0xe0) = lVar54;
                            lVar54 = *(long *)(*(long *)(unaff_x29 + -0xe8) + lVar54 * 8);
                            *(long *)(unaff_x29 + -0x98) = lVar54;
                            if (lVar22 == 0) {
code_r0x00542d3c:
                              func_0x007a23d8(&UNK_008aad91,0x16,&UNK_009ec530);
                              goto code_r0x0054319c;
                            }
                            lVar59 = 0;
                            uVar39 = (lVar54 + 8) * 0x517cc1b727220a95;
                            bVar37 = (byte)(uVar39 >> 0x39);
                            uVar39 = uVar39 & (ulong)puVar18;
                            uVar65 = *(undefined8 *)((long)plVar17 + uVar39);
                            uVar29 = CONCAT17(-((byte)((ulong)uVar65 >> 0x38) == bVar37),
                                              CONCAT16(-((byte)((ulong)uVar65 >> 0x30) == bVar37),
                                                       CONCAT15(-((byte)((ulong)uVar65 >> 0x28) ==
                                                                 bVar37),CONCAT14(-((byte)((ulong)
                                                  uVar65 >> 0x20) == bVar37),
                                                  CONCAT13(-((byte)((ulong)uVar65 >> 0x18) == bVar37
                                                            ),CONCAT12(-((byte)((ulong)uVar65 >>
                                                                               0x10) == bVar37),
                                                                       CONCAT11(-((byte)((ulong)
                                                  uVar65 >> 8) == bVar37),-((byte)uVar65 == bVar37))
                                                  )))))) & 0x8080808080808080;
                            while( true ) {
                              while (uVar29 == 0) {
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
                                lVar59 = lVar59 + 8;
                                uVar39 = uVar39 + lVar59 & (ulong)puVar18;
                                uVar65 = *(undefined8 *)((long)plVar17 + uVar39);
                                uVar29 = CONCAT17(-((byte)((ulong)uVar65 >> 0x38) == bVar37),
                                                  CONCAT16(-((byte)((ulong)uVar65 >> 0x30) == bVar37
                                                            ),CONCAT15(-((byte)((ulong)uVar65 >>
                                                                               0x28) == bVar37),
                                                                       CONCAT14(-((byte)((ulong)
                                                  uVar65 >> 0x20) == bVar37),
                                                  CONCAT13(-((byte)((ulong)uVar65 >> 0x18) == bVar37
                                                            ),CONCAT12(-((byte)((ulong)uVar65 >>
                                                                               0x10) == bVar37),
                                                                       CONCAT11(-((byte)((ulong)
                                                  uVar65 >> 8) == bVar37),-((byte)uVar65 == bVar37))
                                                  )))))) & 0x8080808080808080;
                              }
                              uVar62 = (uVar29 >> 7 & 0xff00ff00ff00ff00) >> 8 |
                                       (uVar29 >> 7 & 0xff00ff00ff00ff) << 8;
                              uVar62 = (uVar62 & 0xffff0000ffff0000) >> 0x10 |
                                       (uVar62 & 0xffff0000ffff) << 0x10;
                              uVar62 = uVar39 + ((ulong)LZCOUNT(uVar62 >> 0x20 | uVar62 << 0x20) >>
                                                3) & (ulong)puVar18;
                              if (lVar54 == plVar17[uVar62 * -2 + -2]) break;
                              uVar29 = uVar29 - 1 & uVar29;
                            }
                            lVar54 = *(long *)plVar17[uVar62 * -2 + -1];
                            *(long *)plVar17[uVar62 * -2 + -1] = lVar54 + 1;
                            if (lVar54 < 0) {
                              func_0x007a05dc();
                              goto code_r0x0054319c;
                            }
                            lVar54 = plVar17[uVar62 * -2 + -1];
                            *(long *)(unaff_x29 + -0x90) = lVar54;
                            if (lVar22 == 0) {
code_r0x00542d58:
                              func_0x007a23d8(&UNK_008aad91,0x16,&UNK_009ec548);
                              goto code_r0x0054319c;
                            }
                            lVar59 = 0;
                            uVar39 = (lVar54 + 8) * 0x517cc1b727220a95;
                            bVar37 = (byte)(uVar39 >> 0x39);
                            uVar39 = uVar39 & (ulong)puVar18;
                            uVar65 = *(undefined8 *)((long)plVar17 + uVar39);
                            uVar29 = CONCAT17(-((byte)((ulong)uVar65 >> 0x38) == bVar37),
                                              CONCAT16(-((byte)((ulong)uVar65 >> 0x30) == bVar37),
                                                       CONCAT15(-((byte)((ulong)uVar65 >> 0x28) ==
                                                                 bVar37),CONCAT14(-((byte)((ulong)
                                                  uVar65 >> 0x20) == bVar37),
                                                  CONCAT13(-((byte)((ulong)uVar65 >> 0x18) == bVar37
                                                            ),CONCAT12(-((byte)((ulong)uVar65 >>
                                                                               0x10) == bVar37),
                                                                       CONCAT11(-((byte)((ulong)
                                                  uVar65 >> 8) == bVar37),-((byte)uVar65 == bVar37))
                                                  )))))) & 0x8080808080808080;
                            while( true ) {
                              while (uVar29 == 0) {
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
                                lVar59 = lVar59 + 8;
                                uVar39 = uVar39 + lVar59 & (ulong)puVar18;
                                uVar65 = *(undefined8 *)((long)plVar17 + uVar39);
                                uVar29 = CONCAT17(-((byte)((ulong)uVar65 >> 0x38) == bVar37),
                                                  CONCAT16(-((byte)((ulong)uVar65 >> 0x30) == bVar37
                                                            ),CONCAT15(-((byte)((ulong)uVar65 >>
                                                                               0x28) == bVar37),
                                                                       CONCAT14(-((byte)((ulong)
                                                  uVar65 >> 0x20) == bVar37),
                                                  CONCAT13(-((byte)((ulong)uVar65 >> 0x18) == bVar37
                                                            ),CONCAT12(-((byte)((ulong)uVar65 >>
                                                                               0x10) == bVar37),
                                                                       CONCAT11(-((byte)((ulong)
                                                  uVar65 >> 8) == bVar37),-((byte)uVar65 == bVar37))
                                                  )))))) & 0x8080808080808080;
                              }
                              uVar62 = (uVar29 >> 7 & 0xff00ff00ff00ff00) >> 8 |
                                       (uVar29 >> 7 & 0xff00ff00ff00ff) << 8;
                              uVar62 = (uVar62 & 0xffff0000ffff0000) >> 0x10 |
                                       (uVar62 & 0xffff0000ffff) << 0x10;
                              uVar62 = uVar39 + ((ulong)LZCOUNT(uVar62 >> 0x20 | uVar62 << 0x20) >>
                                                3) & (ulong)puVar18;
                              if (lVar54 == plVar17[uVar62 * -2 + -2]) break;
                              uVar29 = uVar29 - 1 & uVar29;
                            }
                            lVar54 = *(long *)plVar17[uVar62 * -2 + -1];
                            *(long *)plVar17[uVar62 * -2 + -1] = lVar54 + 1;
                            if (lVar54 < 0) {
                              func_0x007a05dc();
                              goto code_r0x0054319c;
                            }
                            *(long *)(unaff_x29 + -0x88) = plVar17[uVar62 * -2 + -1];
                            puVar23 = (undefined8 *)func_0x00187bd0(0x18,8);
                            if (puVar23 == (undefined8 *)0x0) {
                              func_0x007a1f18(8,0x18);
                              goto code_r0x0054319c;
                            }
                            lVar54 = **(long **)(unaff_x29 + -0x98);
                            **(long **)(unaff_x29 + -0x98) = lVar54 + 1;
                            if (lVar54 < 0) {
                              func_0x007a05dc();
                              goto code_r0x0054319c;
                            }
                            uVar65 = *(undefined8 *)(unaff_x29 + -0x98);
                            *puVar23 = 0x8000000000000000;
                            puVar23[1] = uVar65;
                            *(undefined8 *)(unaff_x29 + -0x80) = 1;
                            *(undefined8 **)(unaff_x29 + -0x78) = puVar23;
                            *(undefined8 *)(unaff_x29 + -0x70) = 1;
                            pdVar20 = (dword *)func_0x00187bd0(0x40,8);
                            if (pdVar20 == (dword *)0x0) {
                              func_0x007a1f18(8,0x40);
                              goto code_r0x0054319c;
                            }
                            lVar54 = **(long **)(unaff_x29 + -0x88);
                            **(long **)(unaff_x29 + -0x88) = lVar54 + 1;
                            if (lVar54 < 0) {
                              func_0x007a05dc();
                              goto code_r0x0054319c;
                            }
                            plVar46 = *(long **)(unaff_x29 + -0x88);
                            *(undefined8 *)pdVar20 = 0;
                            *(long **)(pdVar20 + 2) = plVar46;
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
                            if (lVar61 == 0) {
                              func_0x00582d00(auStack_7ffffffe + 0x8000024e,&UNK_009ec560);
                              plVar46 = *(long **)(unaff_x29 + -0x88);
                            }
                            lVar54 = lVar61 * 0x38;
                            *(ulong *)(lVar54 + 0x10) =
                                 CONCAT44(uStack000000000000010c,iStack0000000000000108);
                            *(ulong *)(lVar54 + 8) =
                                 CONCAT44(uStack0000000000000100._4_4_,(uint)uStack0000000000000100)
                            ;
                            *(ulong *)(lVar54 + 0x20) =
                                 CONCAT44(uStack0000000000000118._4_4_,
                                          (undefined4)uStack0000000000000118);
                            *(ulong *)(lVar54 + 0x18) =
                                 CONCAT44(uStack0000000000000114,uStack0000000000000110);
                            *(dword **)(lVar54 + 0x30) = uStack0000000000000128;
                            *(dword **)(lVar54 + 0x28) = in_stack_00000120;
                            *(dword **)(lVar54 + 0x38) = in_stack_00000130;
                            lVar61 = lVar61 + 1;
                            plVar25 = *(long **)(unaff_x29 + -0x90);
                            if ((plVar25 == plVar46) && (lVar22 != 0)) {
                              lVar54 = 0;
                              bVar37 = (byte)((ulong)((long)(plVar25 + 1) * 0x517cc1b727220a95) >>
                                             0x39);
                              uVar39 = (long)(plVar25 + 1) * 0x517cc1b727220a95 & (ulong)puVar18;
                              uVar65 = *(undefined8 *)((long)plVar17 + uVar39);
                              uVar29 = CONCAT17(-((byte)((ulong)uVar65 >> 0x38) == bVar37),
                                                CONCAT16(-((byte)((ulong)uVar65 >> 0x30) == bVar37),
                                                         CONCAT15(-((byte)((ulong)uVar65 >> 0x28) ==
                                                                   bVar37),CONCAT14(-((byte)((ulong)
                                                  uVar65 >> 0x20) == bVar37),
                                                  CONCAT13(-((byte)((ulong)uVar65 >> 0x18) == bVar37
                                                            ),CONCAT12(-((byte)((ulong)uVar65 >>
                                                                               0x10) == bVar37),
                                                                       CONCAT11(-((byte)((ulong)
                                                  uVar65 >> 8) == bVar37),-((byte)uVar65 == bVar37))
                                                  )))))) & 0x8080808080808080;
                              while( true ) {
                                while (uVar29 == 0) {
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
                                  lVar54 = lVar54 + 8;
                                  uVar39 = uVar39 + lVar54 & (ulong)puVar18;
                                  uVar65 = *(undefined8 *)((long)plVar17 + uVar39);
                                  uVar29 = CONCAT17(-((byte)((ulong)uVar65 >> 0x38) == bVar37),
                                                    CONCAT16(-((byte)((ulong)uVar65 >> 0x30) ==
                                                              bVar37),CONCAT15(-((byte)((ulong)
                                                  uVar65 >> 0x28) == bVar37),
                                                  CONCAT14(-((byte)((ulong)uVar65 >> 0x20) == bVar37
                                                            ),CONCAT13(-((byte)((ulong)uVar65 >>
                                                                               0x18) == bVar37),
                                                                       CONCAT12(-((byte)((ulong)
                                                  uVar65 >> 0x10) == bVar37),
                                                  CONCAT11(-((byte)((ulong)uVar65 >> 8) == bVar37),
                                                           -((byte)uVar65 == bVar37)))))))) &
                                           0x8080808080808080;
                                }
                                uVar62 = (uVar29 >> 7 & 0xff00ff00ff00ff00) >> 8 |
                                         (uVar29 >> 7 & 0xff00ff00ff00ff) << 8;
                                uVar62 = (uVar62 & 0xffff0000ffff0000) >> 0x10 |
                                         (uVar62 & 0xffff0000ffff) << 0x10;
                                if (plVar46 ==
                                    (long *)plVar17[(uVar39 + ((ulong)LZCOUNT(uVar62 >> 0x20 |
                                                                              uVar62 << 0x20) >> 3)
                                                    & (ulong)puVar18) * -2 + -2]) break;
                                uVar29 = uVar29 - 1 & uVar29;
                              }
                              lVar54 = *plVar25;
                              *plVar25 = lVar54 + 1;
                              if (lVar54 < 0) {
                                func_0x007a05dc();
                                goto code_r0x0054319c;
                              }
                              uVar65 = *(undefined8 *)(unaff_x29 + -0x90);
                              uStack0000000000000100._0_4_ = (uint)uVar65;
                              uStack0000000000000100._4_4_ = (undefined4)((ulong)uVar65 >> 0x20);
                              lVar54 = *(long *)(unaff_x29 + -0xe0);
                              if (lVar54 == *(long *)(unaff_x29 + -0xf0)) {
                                func_0x0058321c(unaff_x29 + -0xf0,&UNK_009ec578);
                              }
                              *(undefined8 *)(*(long *)(unaff_x29 + -0xe8) + lVar54 * 8) = uVar65;
                              *(long *)(unaff_x29 + -0xe0) = lVar54 + 1;
                              plVar25 = *(long **)(unaff_x29 + -0x90);
                            }
code_r0x005426bc:
                            plVar46 = (long *)func_0x0056237c(auStack_7ffffffe + 0x8000020e,plVar25,
                                                              *(undefined8 *)(unaff_x29 + -0x98));
                            uStack0000000000000100._0_4_ = (uint)plVar46;
                            uStack0000000000000100._4_4_ = (undefined4)((ulong)plVar46 >> 0x20);
                            if (plVar46 != (long *)0x0) {
                              lVar54 = *plVar46;
                              *plVar46 = lVar54 + -1;
                              LORelease();
                              if (lVar54 == 1) {
                                func_0x005d2ac4(&uStack0000000000000100);
                              }
                            }
                            lVar54 = **(long **)(unaff_x29 + -0x88);
                            **(long **)(unaff_x29 + -0x88) = lVar54 + -1;
                            LORelease();
                            if (lVar54 == 1) {
                              func_0x005d2ac4(unaff_x29 + -0x88);
                            }
                          }
                          if (lVar22 == 0) {
code_r0x00542d88:
                            puVar35 = &UNK_009ec590;
code_r0x00542d9c:
                            func_0x007a23d8(&UNK_008aad91,0x16,puVar35);
                            goto code_r0x0054319c;
                          }
                          lVar54 = 0;
                          plVar46 = *(long **)(unaff_x29 + -0xa0);
                          bVar37 = (byte)((ulong)((long)(plVar46 + 1) * 0x517cc1b727220a95) >> 0x39)
                          ;
                          uVar39 = (long)(plVar46 + 1) * 0x517cc1b727220a95 & (ulong)puVar18;
                          uVar65 = *(undefined8 *)((long)plVar17 + uVar39);
                          uVar29 = CONCAT17(-((byte)((ulong)uVar65 >> 0x38) == bVar37),
                                            CONCAT16(-((byte)((ulong)uVar65 >> 0x30) == bVar37),
                                                     CONCAT15(-((byte)((ulong)uVar65 >> 0x28) ==
                                                               bVar37),CONCAT14(-((byte)((ulong)
                                                  uVar65 >> 0x20) == bVar37),
                                                  CONCAT13(-((byte)((ulong)uVar65 >> 0x18) == bVar37
                                                            ),CONCAT12(-((byte)((ulong)uVar65 >>
                                                                               0x10) == bVar37),
                                                                       CONCAT11(-((byte)((ulong)
                                                  uVar65 >> 8) == bVar37),-((byte)uVar65 == bVar37))
                                                  )))))) & 0x8080808080808080;
                          while( true ) {
                            while (uVar29 == 0) {
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
                              lVar54 = lVar54 + 8;
                              uVar39 = uVar39 + lVar54 & (ulong)puVar18;
                              uVar65 = *(undefined8 *)((long)plVar17 + uVar39);
                              uVar29 = CONCAT17(-((byte)((ulong)uVar65 >> 0x38) == bVar37),
                                                CONCAT16(-((byte)((ulong)uVar65 >> 0x30) == bVar37),
                                                         CONCAT15(-((byte)((ulong)uVar65 >> 0x28) ==
                                                                   bVar37),CONCAT14(-((byte)((ulong)
                                                  uVar65 >> 0x20) == bVar37),
                                                  CONCAT13(-((byte)((ulong)uVar65 >> 0x18) == bVar37
                                                            ),CONCAT12(-((byte)((ulong)uVar65 >>
                                                                               0x10) == bVar37),
                                                                       CONCAT11(-((byte)((ulong)
                                                  uVar65 >> 8) == bVar37),-((byte)uVar65 == bVar37))
                                                  )))))) & 0x8080808080808080;
                            }
                            uVar62 = (uVar29 >> 7 & 0xff00ff00ff00ff00) >> 8 |
                                     (uVar29 >> 7 & 0xff00ff00ff00ff) << 8;
                            uVar62 = (uVar62 & 0xffff0000ffff0000) >> 0x10 |
                                     (uVar62 & 0xffff0000ffff) << 0x10;
                            uVar62 = uVar39 + ((ulong)LZCOUNT(uVar62 >> 0x20 | uVar62 << 0x20) >> 3)
                                     & (ulong)puVar18;
                            if (plVar46 == (long *)plVar17[uVar62 * -2 + -2]) break;
                            uVar29 = uVar29 - 1 & uVar29;
                          }
                          if (lVar22 == 0) {
code_r0x00542d94:
                            puVar35 = &UNK_009ec5a8;
                            goto code_r0x00542d9c;
                          }
                          lVar54 = 0;
                          uVar39 = (plVar17[uVar62 * -2 + -1] + 8) * 0x517cc1b727220a95;
                          bVar37 = (byte)(uVar39 >> 0x39);
                          uVar39 = uVar39 & (ulong)puVar18;
                          uVar65 = *(undefined8 *)((long)plVar17 + uVar39);
                          uVar29 = CONCAT17(-((byte)((ulong)uVar65 >> 0x38) == bVar37),
                                            CONCAT16(-((byte)((ulong)uVar65 >> 0x30) == bVar37),
                                                     CONCAT15(-((byte)((ulong)uVar65 >> 0x28) ==
                                                               bVar37),CONCAT14(-((byte)((ulong)
                                                  uVar65 >> 0x20) == bVar37),
                                                  CONCAT13(-((byte)((ulong)uVar65 >> 0x18) == bVar37
                                                            ),CONCAT12(-((byte)((ulong)uVar65 >>
                                                                               0x10) == bVar37),
                                                                       CONCAT11(-((byte)((ulong)
                                                  uVar65 >> 8) == bVar37),-((byte)uVar65 == bVar37))
                                                  )))))) & 0x8080808080808080;
                          while( true ) {
                            while (uVar29 == 0) {
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
                              lVar54 = lVar54 + 8;
                              uVar39 = uVar39 + lVar54 & (ulong)puVar18;
                              uVar65 = *(undefined8 *)((long)plVar17 + uVar39);
                              uVar29 = CONCAT17(-((byte)((ulong)uVar65 >> 0x38) == bVar37),
                                                CONCAT16(-((byte)((ulong)uVar65 >> 0x30) == bVar37),
                                                         CONCAT15(-((byte)((ulong)uVar65 >> 0x28) ==
                                                                   bVar37),CONCAT14(-((byte)((ulong)
                                                  uVar65 >> 0x20) == bVar37),
                                                  CONCAT13(-((byte)((ulong)uVar65 >> 0x18) == bVar37
                                                            ),CONCAT12(-((byte)((ulong)uVar65 >>
                                                                               0x10) == bVar37),
                                                                       CONCAT11(-((byte)((ulong)
                                                  uVar65 >> 8) == bVar37),-((byte)uVar65 == bVar37))
                                                  )))))) & 0x8080808080808080;
                            }
                            uVar43 = (uVar29 >> 7 & 0xff00ff00ff00ff00) >> 8 |
                                     (uVar29 >> 7 & 0xff00ff00ff00ff) << 8;
                            uVar43 = (uVar43 & 0xffff0000ffff0000) >> 0x10 |
                                     (uVar43 & 0xffff0000ffff) << 0x10;
                            uVar43 = uVar39 + ((ulong)LZCOUNT(uVar43 >> 0x20 | uVar43 << 0x20) >> 3)
                                     & (ulong)puVar18;
                            if (plVar17[uVar62 * -2 + -1] == plVar17[uVar43 * -2 + -2]) break;
                            uVar29 = uVar29 - 1 & uVar29;
                          }
                          if (plVar46 == (long *)plVar17[uVar43 * -2 + -1]) {
                            lVar54 = *plVar46;
                            *plVar46 = lVar54 + -1;
                            LORelease();
                            if (lVar54 == 1) {
                              func_0x005d2ac4(unaff_x29 + -0xa0);
                            }
                          }
                          else {
                            if (*(long *)(unaff_x29 + -0xa8) == 0) {
                              puVar23 = (undefined8 *)func_0x00187bd0(0x28,8);
                              if (puVar23 == (undefined8 *)0x0) {
                                func_0x007a1f18(8,0x28);
                                goto code_r0x0054319c;
                              }
                              *puVar23 = 1;
                              *(undefined1 *)(puVar23 + 1) = 0;
                              puVar23[2] = 0x8000000000000000;
                              *(undefined8 **)(unaff_x29 + -0xa8) = puVar23;
                            }
                            puVar23 = (undefined8 *)func_0x00187bd0(0x18,8);
                            if (puVar23 == (undefined8 *)0x0) {
                              func_0x007a1f18(8,0x18);
                              goto code_r0x0054319c;
                            }
                            lVar54 = **(long **)(unaff_x29 + -0xa8);
                            **(long **)(unaff_x29 + -0xa8) = lVar54 + 1;
                            if (lVar54 < 0) {
                              func_0x007a05dc();
                              goto code_r0x0054319c;
                            }
                            uVar65 = *(undefined8 *)(unaff_x29 + -0xa8);
                            *puVar23 = 0x8000000000000000;
                            puVar23[1] = uVar65;
                            *(undefined8 *)(unaff_x29 + -0x80) = 1;
                            *(undefined8 **)(unaff_x29 + -0x78) = puVar23;
                            *(undefined8 *)(unaff_x29 + -0x70) = 1;
                            pdVar20 = (dword *)func_0x00187bd0(0x40,8);
                            if (pdVar20 == (dword *)0x0) {
                              func_0x007a1f18(8,0x40);
                              goto code_r0x0054319c;
                            }
                            lVar54 = **(long **)(unaff_x29 + -0xa0);
                            **(long **)(unaff_x29 + -0xa0) = lVar54 + 1;
                            if (lVar54 < 0) {
                              func_0x007a05dc();
                              goto code_r0x0054319c;
                            }
                            plVar46 = *(long **)(unaff_x29 + -0xa0);
                            *(undefined8 *)pdVar20 = 0;
                            *(long **)(pdVar20 + 2) = plVar46;
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
                            if (lVar61 == 0) {
                              func_0x00582d00(auStack_7ffffffe + 0x8000024e,&UNK_009ec5c0);
                              plVar46 = *(long **)(unaff_x29 + -0xa0);
                            }
                            lVar54 = lVar61 * 0x38;
                            *(ulong *)(lVar54 + 0x10) =
                                 CONCAT44(uStack000000000000010c,iStack0000000000000108);
                            *(ulong *)(lVar54 + 8) =
                                 CONCAT44(uStack0000000000000100._4_4_,(uint)uStack0000000000000100)
                            ;
                            *(ulong *)(lVar54 + 0x20) =
                                 CONCAT44(uStack0000000000000118._4_4_,
                                          (undefined4)uStack0000000000000118);
                            *(ulong *)(lVar54 + 0x18) =
                                 CONCAT44(uStack0000000000000114,uStack0000000000000110);
                            *(dword **)(lVar54 + 0x30) = uStack0000000000000128;
                            *(dword **)(lVar54 + 0x28) = in_stack_00000120;
                            *(dword **)(lVar54 + 0x38) = in_stack_00000130;
                            lVar61 = lVar61 + 1;
                            lVar54 = *plVar46;
                            *plVar46 = lVar54 + 1;
                            if (lVar54 < 0) {
                              func_0x007a05dc();
                              goto code_r0x0054319c;
                            }
                            uVar65 = *(undefined8 *)(unaff_x29 + -0xa0);
                            uStack0000000000000100._0_4_ = (uint)uVar65;
                            uStack0000000000000100._4_4_ = (undefined4)((ulong)uVar65 >> 0x20);
                            lVar54 = **(long **)(unaff_x29 + -0xa8);
                            **(long **)(unaff_x29 + -0xa8) = lVar54 + 1;
                            if (lVar54 < 0) {
                              func_0x007a05dc();
                              goto code_r0x0054319c;
                            }
                            plVar46 = (long *)func_0x0056237c(auStack_7ffffffe + 0x8000020e,uVar65,
                                                              *(undefined8 *)(unaff_x29 + -0xa8));
                            *(long **)(unaff_x29 + -0x80) = plVar46;
                            if (plVar46 != (long *)0x0) {
                              lVar54 = *plVar46;
                              *plVar46 = lVar54 + -1;
                              LORelease();
                              if (lVar54 == 1) {
                                func_0x005d2ac4(unaff_x29 + -0x80);
                              }
                            }
                            uVar65 = *(undefined8 *)(unaff_x29 + -0xa0);
                            uStack0000000000000100._0_4_ = (uint)uVar65;
                            uStack0000000000000100._4_4_ = (undefined4)((ulong)uVar65 >> 0x20);
                            lVar54 = *(long *)(unaff_x29 + -0xe0);
                            if (lVar54 == *(long *)(unaff_x29 + -0xf0)) {
                              func_0x0058321c(unaff_x29 + -0xf0,&UNK_009ec5d8);
                            }
                            *(undefined8 *)(*(long *)(unaff_x29 + -0xe8) + lVar54 * 8) = uVar65;
                            *(long *)(unaff_x29 + -0xe0) = lVar54 + 1;
                          }
                          lVar54 = *(long *)(unaff_x29 + -200);
                        }
                        lVar54 = *(long *)(unaff_x29 + -0xb8);
                        uStack0000000000000118 =
                             (long *)(lVar54 + *(long *)(unaff_x29 + -0xb0) * 0x38);
                        uStack0000000000000100._0_4_ = (uint)lVar54;
                        uStack0000000000000100._4_4_ = (undefined4)((ulong)lVar54 >> 0x20);
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
                        uStack0000000000000118._0_4_ = (undefined4)lVar61;
                        uStack0000000000000118._4_4_ = (undefined4)((ulong)lVar61 >> 0x20);
                        uStack0000000000000100._0_4_ = uVar9;
                        uStack0000000000000100._4_4_ = uVar11;
                        if (lVar15 == 0) {
                          func_0x00582c4c(auStack_7ffffffe + 0x800002b6,&UNK_009ec608);
                        }
                        lVar61 = lVar15 * 0x20;
                        *(ulong *)(lVar61 + 0x10) =
                             CONCAT44(uStack000000000000010c,iStack0000000000000108);
                        *(ulong *)(lVar61 + 8) =
                             CONCAT44(uStack0000000000000100._4_4_,(uint)uStack0000000000000100);
                        *(ulong *)(lVar61 + 0x20) =
                             CONCAT44(uStack0000000000000118._4_4_,
                                      (undefined4)uStack0000000000000118);
                        *(ulong *)(lVar61 + 0x18) =
                             CONCAT44(uStack0000000000000114,uStack0000000000000110);
                        lVar15 = lVar15 + 1;
                        plVar46 = *(long **)(unaff_x29 + -0xa8);
                        if (plVar46 != (long *)0x0) {
                          lVar61 = *plVar46;
                          *plVar46 = lVar61 + -1;
                          LORelease();
                          if (lVar61 == 1) {
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
                        plVar25 = plVar17;
                        puVar77 = puVar18;
                        plVar46 = plVar33;
                        lVar61 = lVar22;
                        if (*(long *)(unaff_x29 + -0xf0) != 0) {
                          func_0x00187bd4(*(undefined8 *)(unaff_x29 + -0xe8),
                                          *(long *)(unaff_x29 + -0xf0) << 3,8);
                        }
                      }
                    }
                  }
code_r0x00541e58:
                  lVar44 = lVar44 + 0x108;
                  lVar42 = lVar42 + 1;
                } while (lVar44 != lVar49);
                uVar29 = *(ulong *)(lVar47 + 0x28);
              }
              if ((uVar29 <= uVar30) ||
                 (plVar64 = (long *)(*(long *)(lVar47 + 0x20) + uVar30 * 0x20),
                 *plVar64 == -0x8000000000000000)) {
                in_stack_00000050 = (dword *)&UNK_009ec4e8;
                goto code_r0x00543020;
              }
              *(undefined8 *)(unaff_x29 + -0x80) = 8;
              *(undefined8 *)(unaff_x29 + -0x78) = 8;
              *(undefined8 *)(unaff_x29 + -0x70) = 0;
              *(long *)(unaff_x29 + -0x68) = lVar15 * 0x20 + 8;
              if (lVar15 != 0) {
                plVar51 = (long *)(lVar15 << 5);
                do {
                  plVar28 = (long *)plVar51[-2];
                  if (plVar28 == (long *)0x8000000000000000) {
                    pdVar34 = (dword *)(plVar51 + -3);
                    break;
                  }
                  pdVar20 = (dword *)plVar51[-1];
                  lVar15 = *plVar51;
                  func_0x00556400(auStack_7ffffffe + 0x8000026e,plVar64,plVar51[-3],plVar51[-3] + 1)
                  ;
                  iStack0000000000000108 = (int)puVar77;
                  uStack000000000000010c = (undefined4)((ulong)puVar77 >> 0x20);
                  uStack0000000000000100._0_4_ = (uint)plVar25;
                  uStack0000000000000100._4_4_ = (undefined4)((ulong)plVar25 >> 0x20);
                  uStack0000000000000118._0_4_ = (undefined4)lVar61;
                  uStack0000000000000118._4_4_ = (undefined4)((ulong)lVar61 >> 0x20);
                  uStack0000000000000110 = SUB84(plVar46,0);
                  uStack0000000000000114 = (undefined4)((ulong)plVar46 >> 0x20);
                  in_stack_00000120 = pdVar63;
                  uStack0000000000000128 = pdVar20;
                  in_stack_00000130 = pdVar20;
                  in_stack_00000138 = plVar28;
                  in_stack_00000140 = pdVar20 + lVar15 * 0xe;
                  func_0x005835b8(&uStack0000000000000100,&UNK_009ec370);
                  func_0x0057eaa0(&uStack0000000000000100);
                  func_0x005936cc(&uStack0000000000000128);
                  plVar51 = plVar51 + -4;
                } while (plVar51 != (long *)0x0);
                *(dword **)(unaff_x29 + -0x68) = pdVar34;
              }
              func_0x00592f2c(unaff_x29 + -0x80);
              puVar26 = puVar27;
            } while (puVar27 != puVar60);
          }
          if (plVar57 != (long *)0x0) {
            func_0x00187bd4(puVar36,(long)plVar57 << 2,4);
          }
          func_0x0053defc(in_stack_000000f8);
          return;
        }
        func_0x007a23bc(&UNK_009ec9c8);
        goto code_r0x0054319c;
      }
      puVar35 = &UNK_009ec9b0;
    }
  }
  else {
    puVar35 = &UNK_009ec740;
  }
  func_0x007a23bc(puVar35);
code_r0x0054319c:
                    /* WARNING: Does not return */
  pcVar14 = (code *)SoftwareBreakpoint(1,0x5431a0);
  (*pcVar14)();
}

