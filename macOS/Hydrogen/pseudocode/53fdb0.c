
/* WARNING: Type propagation algorithm not settling */
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_0053fdb0(uint *param_1)

{
  uint *puVar1;
  bool bVar2;
  uint uVar3;
  dword dVar4;
  dword dVar5;
  dword dVar6;
  uint uVar7;
  ulong uVar8;
  undefined8 uVar9;
  undefined4 uVar10;
  undefined4 uVar11;
  undefined4 uVar12;
  undefined4 uVar13;
  undefined4 uVar14;
  undefined4 uVar15;
  code *pcVar16;
  undefined1 in_ZR;
  long lVar17;
  long *plVar18;
  ulong uVar19;
  undefined8 uVar20;
  dword *pdVar21;
  int iVar22;
  dword *extraout_x1;
  dword *extraout_x1_00;
  undefined *puVar23;
  long lVar24;
  undefined8 *puVar25;
  dword *pdVar26;
  long *plVar27;
  uint *puVar29;
  uint *puVar28;
  long *plVar30;
  dword *pdVar31;
  undefined8 *puVar32;
  long *plVar33;
  dword *pdVar34;
  long lVar35;
  uint *puVar36;
  byte bVar37;
  ulong uVar38;
  undefined8 *puVar39;
  ulong uVar40;
  undefined8 *puVar41;
  ulong uVar42;
  long lVar43;
  ulong uVar44;
  long lVar45;
  ulong uVar46;
  long *plVar47;
  long lVar48;
  uint *puVar49;
  ulong *puVar50;
  long lVar51;
  uint *unaff_x20;
  dword *pdVar52;
  long *plVar53;
  dword dVar54;
  undefined8 uVar55;
  uint *unaff_x21;
  long lVar56;
  undefined1 *unaff_x22;
  dword *pdVar57;
  undefined8 *puVar58;
  long *plVar59;
  undefined8 *unaff_x23;
  uint uVar60;
  ulong unaff_x24;
  long lVar61;
  uint *unaff_x25;
  ulong unaff_x26;
  dword *pdVar62;
  long unaff_x27;
  undefined8 unaff_x28;
  long *plVar63;
  long unaff_x29;
  undefined8 uVar64;
  long lVar65;
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
  uint *in_stack_00000020;
  undefined *in_stack_00000040;
  long in_stack_00000048;
  dword *in_stack_00000050;
  dword *in_stack_00000058;
  undefined *puStack0000000000000060;
  ulong in_stack_00000080;
  uint *in_stack_00000098;
  long in_stack_000000a0;
  long in_stack_000000a8;
  long *in_stack_000000b0;
  undefined8 in_stack_000000b8;
  long *in_stack_000000c0;
  ulong in_stack_000000d0;
  ulong in_stack_000000e0;
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
  
code_r0x0053fdb0:
  if ((bool)in_ZR) {
LAB_00543000:
    func_0x007a23bc(in_stack_00000008);
code_r0x0054319c:
                    /* WARNING: Does not return */
    pcVar16 = (code *)SoftwareBreakpoint(1,0x5431a0);
    (*pcVar16)();
  }
  uStack0000000000000118._0_4_ = 0xf;
  uStack0000000000000118._4_4_ = 0;
  puVar49 = (uint *)unaff_x23[2];
  in_stack_00000120 = in_stack_00000270;
  uStack0000000000000128 = in_stack_00000278;
  in_stack_00000130 = in_stack_00000280;
  in_stack_00000138 = in_stack_00000288;
  in_stack_00000140 = in_stack_00000290;
  in_stack_00000148 = in_stack_00000298;
  in_stack_00000150 = in_stack_000002a0;
  if (puVar49 == param_1) {
    func_0x005bd0a4(unaff_x23,&UNK_009eceb8);
  }
  _memcpy(unaff_x23[1] + (long)puVar49 * 0x108,&uStack0000000000000100,0x108);
  unaff_x23[2] = (long)puVar49 + 1;
  puVar49 = unaff_x25;
LAB_0053fe30:
  unaff_x25 = puVar49 + (puVar49 != in_stack_00000020);
  puVar36 = in_stack_00000098;
  if (puVar49 != in_stack_00000020) goto LAB_0053f6e0;
code_r0x0053fe44:
  if (*(long *)(unaff_x29 + -0xd8) != 0) {
    func_0x00187bd4(*(undefined8 *)(unaff_x29 + -0xd0),*(long *)(unaff_x29 + -0xd8) << 2,4);
  }
  if (*(long *)(unaff_x29 + -0xf0) != 0) {
    func_0x00187bd4(*(undefined8 *)(unaff_x29 + -0xe8),*(long *)(unaff_x29 + -0xf0) * 0x18,8);
  }
  puVar23 = *(undefined **)(unaff_x29 + -0x80);
  uVar19 = *(ulong *)(unaff_x29 + -0x78);
  lVar24 = *(long *)(*(long *)(in_stack_000000f8 + 0xd8) + 0x38);
  uVar38 = *(ulong *)(*(long *)(in_stack_000000f8 + 0xd8) + 0x40);
  if (*(long *)(unaff_x29 + -0x68) != 0) {
    uVar40 = in_stack_000000d0 & 0xffffffff;
    if (uVar40 < uVar38) goto code_r0x0053f504;
    do {
      in_stack_000000d0 = in_stack_000000d0 >> 0x20;
      do {
        puVar49 = puVar36;
        if (uVar38 <= in_stack_000000d0) goto code_r0x0053fe98;
        lVar48 = lVar24 + in_stack_000000d0 * unaff_x24;
        in_stack_000000d0 = (ulong)*(uint *)(lVar48 + 0x24);
        uVar3 = *(uint *)(lVar48 + 0x28);
      } while (uVar3 == 0xffffffff);
      in_stack_000000d0 = uVar40 | in_stack_000000d0 << 0x20;
      while( true ) {
        unaff_x26 = (ulong)uVar3;
        lVar48 = 0;
        bVar37 = (byte)(unaff_x26 * 0x517cc1b727220a95 >> 0x39);
        uVar44 = unaff_x26 * 0x517cc1b727220a95 & uVar19;
        uVar64 = *(undefined8 *)(puVar23 + uVar44);
        uVar40 = CONCAT17(-((byte)((ulong)uVar64 >> 0x38) == bVar37),
                          CONCAT16(-((byte)((ulong)uVar64 >> 0x30) == bVar37),
                                   CONCAT15(-((byte)((ulong)uVar64 >> 0x28) == bVar37),
                                            CONCAT14(-((byte)((ulong)uVar64 >> 0x20) == bVar37),
                                                     CONCAT13(-((byte)((ulong)uVar64 >> 0x18) ==
                                                               bVar37),CONCAT12(-((byte)((ulong)
                                                  uVar64 >> 0x10) == bVar37),
                                                  CONCAT11(-((byte)((ulong)uVar64 >> 8) == bVar37),
                                                           -((byte)uVar64 == bVar37)))))))) &
                 0x8080808080808080;
        while( true ) {
          while (uVar40 == 0) {
            bVar67 = NEON_umaxv(CONCAT17(-((char)((ulong)uVar64 >> 0x38) == -1),
                                         CONCAT16(-((char)((ulong)uVar64 >> 0x30) == -1),
                                                  CONCAT15(-((char)((ulong)uVar64 >> 0x28) == -1),
                                                           CONCAT14(-((char)((ulong)uVar64 >> 0x20)
                                                                     == -1),CONCAT13(-((char)((ulong
                                                  )uVar64 >> 0x18) == -1),
                                                  CONCAT12(-((char)((ulong)uVar64 >> 0x10) == -1),
                                                           CONCAT11(-((char)((ulong)uVar64 >> 8) ==
                                                                     -1),-((char)uVar64 == -1)))))))
                                        ),1);
            if ((bVar67 & 1) != 0) goto code_r0x0053f61c;
            lVar48 = lVar48 + 8;
            uVar44 = uVar44 + lVar48 & uVar19;
            uVar64 = *(undefined8 *)(puVar23 + uVar44);
            uVar40 = CONCAT17(-((byte)((ulong)uVar64 >> 0x38) == bVar37),
                              CONCAT16(-((byte)((ulong)uVar64 >> 0x30) == bVar37),
                                       CONCAT15(-((byte)((ulong)uVar64 >> 0x28) == bVar37),
                                                CONCAT14(-((byte)((ulong)uVar64 >> 0x20) == bVar37),
                                                         CONCAT13(-((byte)((ulong)uVar64 >> 0x18) ==
                                                                   bVar37),CONCAT12(-((byte)((ulong)
                                                  uVar64 >> 0x10) == bVar37),
                                                  CONCAT11(-((byte)((ulong)uVar64 >> 8) == bVar37),
                                                           -((byte)uVar64 == bVar37)))))))) &
                     0x8080808080808080;
          }
          uVar42 = (uVar40 >> 7 & 0xff00ff00ff00ff00) >> 8 | (uVar40 >> 7 & 0xff00ff00ff00ff) << 8;
          uVar42 = (uVar42 & 0xffff0000ffff0000) >> 0x10 | (uVar42 & 0xffff0000ffff) << 0x10;
          if (uVar3 == *(uint *)(puVar23 +
                                (uVar44 + ((ulong)LZCOUNT(uVar42 >> 0x20 | uVar42 << 0x20) >> 3) &
                                uVar19) * -4 + -4)) break;
          uVar40 = uVar40 - 1 & uVar40;
        }
        uVar40 = in_stack_000000d0 & 0xffffffff;
        if (uVar38 <= uVar40) break;
code_r0x0053f504:
        lVar48 = lVar24 + uVar40 * (unaff_x24 & 0xffffffff);
        in_stack_000000d0 = in_stack_000000d0 & 0xffffffff00000000 | (ulong)*(uint *)(lVar48 + 0x20)
        ;
        uVar3 = *(uint *)(lVar48 + 0x2c);
      }
    } while( true );
  }
LAB_0053f5d0:
  uVar40 = in_stack_000000d0 & 0xffffffff;
  if (uVar40 < uVar38) goto code_r0x0053f5dc;
  in_stack_000000d0 = in_stack_000000d0 >> 0x20;
  while (puVar49 = puVar36, in_stack_000000d0 < uVar38) {
    lVar48 = lVar24 + in_stack_000000d0 * unaff_x24;
    in_stack_000000d0 = (ulong)*(uint *)(lVar48 + 0x24);
    uVar3 = *(uint *)(lVar48 + 0x28);
    unaff_x26 = (ulong)uVar3;
    if (uVar3 != 0xffffffff) {
      in_stack_000000d0 = uVar40 | in_stack_000000d0 << 0x20;
      goto code_r0x0053f61c;
    }
  }
code_r0x0053fe98:
  if (uVar19 != 0) {
    uVar38 = uVar19 * 4 + 0xb & 0xfffffffffffffff8;
    lVar24 = uVar19 + uVar38 + 9;
    if (lVar24 != 0) {
      func_0x00187bd4((long)puVar23 - uVar38,lVar24,8);
    }
  }
  func_0x0053a3f4(auStack_7ffffffe + 0x8000024e);
  if (puVar49 != unaff_x20) {
    puVar36 = puVar49 + 1;
    in_stack_000002b8 = *puVar49;
    uVar38 = (ulong)in_stack_000002b8;
    lVar48 = *(long *)(in_stack_000000f8 + 0xd8);
    if ((uVar38 < *(ulong *)(lVar48 + 0x28)) &&
       (puVar25 = (undefined8 *)(*(long *)(lVar48 + 0x20) + uVar38 * 0x20),
       (uint *)*puVar25 != unaff_x21)) {
      uVar19 = (ulong)*(uint *)((long)puVar25 + 0x1c) << 0x20 | 0xffffffff;
    }
    else {
      uVar19 = 0xffffffffffffffff;
    }
    lVar24 = *(long *)(lVar48 + 0x38);
    uVar40 = *(ulong *)(lVar48 + 0x40);
    do {
      uVar44 = uVar19 & 0xffffffff;
      if (uVar40 <= uVar44) {
        uVar19 = uVar19 >> 0x20;
        do {
          uVar42 = uVar19;
          if (uVar40 <= uVar42) goto code_r0x0053f458;
          lVar45 = lVar24 + uVar42 * unaff_x24;
          uVar19 = (ulong)*(uint *)(lVar45 + 0x24);
        } while (*(int *)(lVar45 + 0x28) == -1);
        uVar19 = uVar44 | uVar19 << 0x20;
        if (uVar42 < uVar40) goto code_r0x0053f1b4;
code_r0x00542e04:
        func_0x007a23bc(&UNK_009f08a0);
        goto code_r0x0054319c;
      }
      uVar42 = uVar19 & 0xffffffff;
      uVar19 = uVar19 & 0xffffffff00000000 |
               (ulong)*(uint *)(lVar24 + uVar44 * (unaff_x24 & 0xffffffff) + 0x20);
      if (uVar40 <= uVar42) goto code_r0x00542e04;
code_r0x0053f1b4:
      puVar25 = (undefined8 *)(lVar24 + uVar42 * unaff_x24);
      if ((uint *)*puVar25 == unaff_x21) goto code_r0x00542e04;
    } while (*(uint *)((long)puVar25 + 0x2c) != uVar38);
    if (puVar25[2] != 0) {
      puVar58 = (undefined8 *)puVar25[1];
      lVar24 = puVar25[2] * 0x48;
      do {
        in_stack_00000210 = (dword *)func_0x00187bd0(0x28,8);
        if (in_stack_00000210 == (dword *)0x0) {
          func_0x007a1f18(8,0x28);
          goto code_r0x0054319c;
        }
        *(undefined8 *)(in_stack_00000210 + 2) = in_stack_000000b8;
        *(long **)in_stack_00000210 = in_stack_000000b0;
        *(uint **)(in_stack_00000210 + 4) = unaff_x21;
        puVar25 = (undefined8 *)func_0x00578610(in_stack_000000f8,puVar58);
        if (puVar25 != (undefined8 *)0x0) {
          lVar48 = *(long *)in_stack_00000210;
          *(long *)in_stack_00000210 = lVar48 + unaff_x27;
          if (lVar48 < 0) {
code_r0x00541b60:
            func_0x007a05dc();
          }
          else {
            uStack0000000000000100._0_4_ = (uint)in_stack_00000210;
            uStack0000000000000100._4_4_ = (undefined4)((ulong)in_stack_00000210 >> 0x20);
            lVar48 = *(long *)*puVar25;
            *(long *)*puVar25 = lVar48 + unaff_x27;
            if (-1 < lVar48) {
              uVar55 = *puVar25;
              uVar64 = func_0x005787f4(*(undefined8 *)(in_stack_000000f8 + 0x38),
                                       *(undefined8 *)(in_stack_000000f8 + 0x40),in_stack_00000210);
              func_0x00589494(in_stack_000000f8,uVar64,in_stack_00000210,uVar55);
              unaff_x27 = 1;
              in_stack_00000270 = extraout_x1;
              if (extraout_x1 != (dword *)0x0) {
                lVar48 = *(long *)extraout_x1;
                *(long *)extraout_x1 = lVar48 + -1;
                LORelease();
                if (lVar48 == 1) {
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
        lVar48 = *(long *)*puVar58;
        *(long *)*puVar58 = lVar48 + unaff_x27;
        if (lVar48 < 0) goto code_r0x00541b60;
        plVar47 = (long *)func_0x0056237c(auStack_7ffffffe + 0x8000024e,*puVar58,in_stack_00000210);
        uStack0000000000000100._0_4_ = (uint)plVar47;
        uStack0000000000000100._4_4_ = (undefined4)((ulong)plVar47 >> 0x20);
        if (plVar47 != (long *)0x0) {
          lVar48 = *plVar47;
          *plVar47 = lVar48 + -1;
          LORelease();
          if (lVar48 == 1) {
            func_0x005d2ac4(&uStack0000000000000100);
          }
        }
        puVar58 = puVar58 + 9;
        lVar24 = lVar24 + -0x48;
      } while (lVar24 != 0);
      lVar48 = *(long *)(in_stack_000000f8 + 0xd8);
      if (in_stack_00000048 != 0) {
        if ((*(ulong *)(lVar48 + 0x28) <= (ulong)in_stack_000002b8) ||
           (plVar47 = (long *)(*(long *)(lVar48 + 0x20) + (ulong)in_stack_000002b8 * 0x20),
           (uint *)*plVar47 == unaff_x21)) {
          func_0x007a23bc(&UNK_009ecde0);
          goto code_r0x0054319c;
        }
        func_0x00559858(unaff_x29 + -0xc0,auStack_7ffffffe + 0x8000020e,&UNK_009ec388);
        in_stack_00000228 = (long)in_stack_00000050 + (long)in_stack_00000058 + 1;
        lVar24 = *(long *)in_stack_00000050;
        in_stack_00000220 = in_stack_00000050 + 2;
        in_stack_00000218 =
             (undefined8 *)
             (CONCAT17(-(-1 < lVar24),
                       CONCAT16(-(-1 < (char)((ulong)lVar24 >> 0x30)),
                                CONCAT15(-(-1 < (char)((ulong)lVar24 >> 0x28)),
                                         CONCAT14(-(-1 < (char)((ulong)lVar24 >> 0x20)),
                                                  CONCAT13(-(-1 < (char)((ulong)lVar24 >> 0x18)),
                                                           CONCAT12(-(-1 < (char)((ulong)lVar24 >>
                                                                                 0x10)),
                                                                    CONCAT11(-(-1 < (char)((ulong)
                                                  lVar24 >> 8)),-(-1 < (char)lVar24)))))))) &
             0x8080808080808080);
        func_0x00558f08(unaff_x29 + -0x80,auStack_7ffffffe + 0x8000020e,&UNK_009ec388);
        in_stack_00000280 = *(dword **)(unaff_x29 + -0xb0);
        in_stack_00000278 = *(dword **)(unaff_x29 + -0xb8);
        in_stack_00000270 = *(dword **)(unaff_x29 + -0xc0);
        uVar64 = *(undefined8 *)(unaff_x29 + -0x80);
        *(undefined8 *)(unaff_x22 + 0x20) = *(undefined8 *)(unaff_x29 + -0x78);
        *(undefined8 *)(unaff_x22 + 0x18) = uVar64;
        *(undefined8 *)(unaff_x22 + 0x28) = *(undefined8 *)(unaff_x29 + -0x70);
        in_stack_00000150 = (undefined8 *)CONCAT62(in_stack_00000150._2_6_,0x100);
        uStack0000000000000118._0_4_ = 0xf;
        uStack0000000000000118._4_4_ = 0;
        lVar24 = plVar47[2];
        in_stack_00000120 = in_stack_00000270;
        uStack0000000000000128 = in_stack_00000278;
        in_stack_00000130 = in_stack_00000280;
        in_stack_00000138 = in_stack_00000288;
        in_stack_00000140 = in_stack_00000290;
        in_stack_00000148 = in_stack_00000298;
        if (lVar24 == *plVar47) {
          func_0x005bd0a4(plVar47,&UNK_009ecdf8);
        }
        lVar48 = plVar47[1];
        if (lVar24 != 0) {
          _memmove(lVar48 + 0x108,lVar48,lVar24 * 0x108);
        }
        _memcpy(lVar48,&uStack0000000000000100,0x108);
        plVar47[2] = lVar24 + 1;
        lVar48 = *(long *)(in_stack_000000f8 + 0xd8);
        in_stack_00000210 = in_stack_00000050;
        in_stack_00000230 = in_stack_00000048;
      }
    }
code_r0x0053f458:
    uVar66 = _UNK_009ee250;
    uVar55 = _UNK_009ee248;
    uVar64 = _UNK_009ee238;
    *(undefined8 *)(unaff_x29 + -0x78) = _UNK_009ee240;
    *(undefined8 *)(unaff_x29 + -0x80) = uVar64;
    *(undefined8 *)(unaff_x29 + -0x68) = uVar66;
    *(undefined8 *)(unaff_x29 + -0x70) = uVar55;
    in_stack_00000098 = puVar36;
    in_stack_00000250 = in_stack_00000050;
    in_stack_00000258 = in_stack_00000058;
    in_stack_00000260 = (long)in_stack_00000040;
    in_stack_00000268 = in_stack_00000048;
    if (((ulong)in_stack_000002b8 < *(ulong *)(lVar48 + 0x28)) &&
       (puVar25 = (undefined8 *)(*(long *)(lVar48 + 0x20) + (ulong)in_stack_000002b8 * 0x20),
       (uint *)*puVar25 != unaff_x21)) {
      in_stack_000000d0 = (ulong)*(uint *)((long)puVar25 + 0x1c) << 0x20 | 0xffffffff;
      uVar19 = 0;
      puVar23 = &UNK_008abc00;
      lVar24 = *(long *)(lVar48 + 0x38);
      uVar38 = *(ulong *)(lVar48 + 0x40);
    }
    else {
      in_stack_000000d0 = 0xffffffffffffffff;
      uVar19 = 0;
      puVar23 = &UNK_008abc00;
      lVar24 = *(long *)(lVar48 + 0x38);
      uVar38 = *(ulong *)(lVar48 + 0x40);
    }
    goto LAB_0053f5d0;
  }
  if (in_stack_000000a0 != 0) {
    func_0x00187bd4(unaff_x28,in_stack_000000a0 << 2,4);
  }
  puVar50 = (ulong *)(*(long *)(*(long *)(in_stack_000000f8 + 0xd8) + 0x38) + 0x10);
  plVar47 = (long *)(auStack_7ffffffe + 0x8000026e);
  for (lVar24 = *(long *)(*(long *)(in_stack_000000f8 + 0xd8) + 0x40) * 0x30; lVar24 != 0;
      lVar24 = lVar24 + -0x30) {
    if (puVar50[-2] != 0x8000000000000000) {
      uVar38 = *puVar50;
      uStack0000000000000100 = plVar47;
      if (1 < uVar38) {
        if (uVar38 < 0x15) {
          func_0x00576528(puVar50[-1],uVar38,1,&uStack0000000000000100);
        }
        else {
          func_0x00576bac(puVar50[-1],uVar38,&uStack0000000000000100);
        }
      }
    }
    puVar50 = puVar50 + 6;
  }
  func_0x0058d7e0(&uStack0000000000000100,*(undefined8 *)(in_stack_000000f8 + 0xd8));
  lVar24 = *(long *)(in_stack_000000f8 + 0x1e8);
  if (lVar24 != 0) {
    lVar48 = *(long *)(in_stack_000000f8 + 0x1f8);
    if (lVar48 != 0) {
      plVar47 = *(long **)(in_stack_000000f8 + 0x1e0);
      plVar59 = plVar47 + 1;
      lVar45 = *plVar47;
      uVar38 = CONCAT17(-(-1 < lVar45),
                        CONCAT16(-(-1 < (char)((ulong)lVar45 >> 0x30)),
                                 CONCAT15(-(-1 < (char)((ulong)lVar45 >> 0x28)),
                                          CONCAT14(-(-1 < (char)((ulong)lVar45 >> 0x20)),
                                                   CONCAT13(-(-1 < (char)((ulong)lVar45 >> 0x18)),
                                                            CONCAT12(-(-1 < (char)((ulong)lVar45 >>
                                                                                  0x10)),
                                                                     CONCAT11(-(-1 < (char)((ulong)
                                                  lVar45 >> 8)),-(-1 < (char)lVar45)))))))) &
               0x8080808080808080;
      do {
        while (uVar38 == 0) {
          lVar45 = *plVar59;
          plVar47 = plVar47 + -0x48;
          plVar59 = plVar59 + 1;
          uVar38 = CONCAT17(-(-1 < lVar45),
                            CONCAT16(-(-1 < (char)((ulong)lVar45 >> 0x30)),
                                     CONCAT15(-(-1 < (char)((ulong)lVar45 >> 0x28)),
                                              CONCAT14(-(-1 < (char)((ulong)lVar45 >> 0x20)),
                                                       CONCAT13(-(-1 < (char)((ulong)lVar45 >> 0x18)
                                                                 ),CONCAT12(-(-1 < (char)((ulong)
                                                  lVar45 >> 0x10)),
                                                  CONCAT11(-(-1 < (char)((ulong)lVar45 >> 8)),
                                                           -(-1 < (char)lVar45)))))))) &
                   0x8080808080808080;
        }
        uVar19 = (uVar38 >> 7 & 0xff00ff00ff00ff00) >> 8 | (uVar38 >> 7 & 0xff00ff00ff00ff) << 8;
        uVar19 = (uVar19 & 0xffff0000ffff0000) >> 0x10 | (uVar19 & 0xffff0000ffff) << 0x10;
        func_0x00539e0c(plVar47 + (long)-(int)((ulong)LZCOUNT(uVar19 >> 0x20 | uVar19 << 0x20) >> 3)
                                  * 9 + -8);
        uVar38 = uVar38 - 1 & uVar38;
        lVar48 = lVar48 + -1;
      } while (lVar48 != 0);
    }
    lVar48 = lVar24 * 0x49 + 0x51;
    if (lVar48 != 0) {
      func_0x00187bd4(*(long *)(in_stack_000000f8 + 0x1e0) + lVar24 * -0x48 + -0x48,lVar48,8);
    }
  }
  *(long **)(in_stack_000000f8 + 0x1e8) = _iStack0000000000000108;
  *(long **)(in_stack_000000f8 + 0x1e0) = uStack0000000000000100;
  *(long **)(in_stack_000000f8 + 0x1f8) = uStack0000000000000118;
  *(long **)(in_stack_000000f8 + 0x1f0) = _uStack0000000000000110;
  lVar24 = *(long *)(in_stack_000000f8 + 0xd8);
  if (*(int *)(lVar24 + 0x78) != 1) {
    puVar23 = &UNK_009ec740;
code_r0x00542d04:
    func_0x007a23bc(puVar23);
    goto code_r0x0054319c;
  }
  func_0x0058b00c(auStack_7ffffffe + 0x8000020e,lVar24 + 0x18,*(undefined4 *)(lVar24 + 0x7c));
  plVar47 = *(long **)(*(long *)(in_stack_000000f8 + 0xd8) + 0x20);
  lVar24 = *(long *)(*(long *)(in_stack_000000f8 + 0xd8) + 0x28);
  plVar18 = plVar47;
  uVar3 = 0;
  plVar59 = uStack0000000000000100;
code_r0x005400d8:
  uVar60 = uVar3;
  uStack0000000000000100._4_4_ = (undefined4)((ulong)plVar59 >> 0x20);
  if (plVar18 != plVar47 + lVar24 * 4) {
    plVar33 = plVar18 + 4;
    lVar48 = *plVar18;
    uVar3 = uVar60 + 1;
    plVar18 = plVar33;
    if (lVar48 != -0x8000000000000000) {
      plVar59 = (long *)CONCAT44(uStack0000000000000100._4_4_,uVar60);
      if (in_stack_00000240 != uVar60 && in_stack_00000228 != 0) {
        uStack0000000000000100._0_4_ = uVar60;
        uVar38 = func_0x005763e4(auStack_7ffffffe + 0x8000022e,&uStack0000000000000100);
        plVar59 = (long *)CONCAT44(uStack0000000000000100._4_4_,(uint)uStack0000000000000100);
        lVar48 = 0;
        bVar37 = (byte)(uVar38 >> 0x39);
        while( true ) {
          uVar38 = uVar38 & (ulong)in_stack_00000218;
          uVar64 = *(undefined8 *)((long)in_stack_00000210 + uVar38);
          bVar67 = (byte)((ulong)uVar64 >> 8);
          bVar68 = (byte)((ulong)uVar64 >> 0x10);
          bVar69 = (byte)((ulong)uVar64 >> 0x18);
          bVar70 = (byte)((ulong)uVar64 >> 0x20);
          bVar71 = (byte)((ulong)uVar64 >> 0x28);
          bVar72 = (byte)((ulong)uVar64 >> 0x30);
          bVar73 = (byte)((ulong)uVar64 >> 0x38);
          for (uVar19 = CONCAT17(-(bVar73 == bVar37),
                                 CONCAT16(-(bVar72 == bVar37),
                                          CONCAT15(-(bVar71 == bVar37),
                                                   CONCAT14(-(bVar70 == bVar37),
                                                            CONCAT13(-(bVar69 == bVar37),
                                                                     CONCAT12(-(bVar68 == bVar37),
                                                                              CONCAT11(-(bVar67 ==
                                                                                        bVar37),-((
                                                  byte)uVar64 == bVar37)))))))) & 0x8080808080808080
              ; uVar19 != 0; uVar19 = uVar19 - 1 & uVar19) {
            uVar40 = (uVar19 >> 7 & 0xff00ff00ff00ff00) >> 8 | (uVar19 >> 7 & 0xff00ff00ff00ff) << 8
            ;
            uVar40 = (uVar40 & 0xffff0000ffff0000) >> 0x10 | (uVar40 & 0xffff0000ffff) << 0x10;
            uVar40 = uVar38 + ((ulong)LZCOUNT(uVar40 >> 0x20 | uVar40 << 0x20) >> 3) &
                     (ulong)in_stack_00000218;
            if (in_stack_00000210[uVar40 * -2 + -2] == uVar60) {
              func_0x0058cb44(in_stack_000000f8 + 0x48,in_stack_00000210[uVar40 * -2 + -1],uVar60);
              plVar59 = (long *)CONCAT44(uStack0000000000000100._4_4_,(uint)uStack0000000000000100);
              goto code_r0x005400d8;
            }
          }
          bVar67 = NEON_umaxv(CONCAT17(-(bVar73 == 0xff),
                                       CONCAT16(-(bVar72 == 0xff),
                                                CONCAT15(-(bVar71 == 0xff),
                                                         CONCAT14(-(bVar70 == 0xff),
                                                                  CONCAT13(-(bVar69 == 0xff),
                                                                           CONCAT12(-(bVar68 == 0xff
                                                                                     ),CONCAT11(-(
                                                  bVar67 == 0xff),-((byte)uVar64 == 0xff)))))))),1);
          if ((bVar67 & 1) != 0) break;
          lVar48 = lVar48 + 8;
          uVar38 = uVar38 + lVar48;
        }
      }
    }
    goto code_r0x005400d8;
  }
  if (*(ulong *)(in_stack_000000f8 + 0x1d0) < *(ulong *)(in_stack_000000f8 + 0x78)) {
    uStack0000000000000100 = plVar59;
    func_0x007ab0a0(in_stack_000000f8 + 0x1c0,*(ulong *)(in_stack_000000f8 + 0x78),
                    in_stack_000000f8 + 0x1e0,1);
    plVar59 = uStack0000000000000100;
  }
  uVar9 = _UNK_009ee250;
  uVar66 = _UNK_009ee248;
  uVar55 = _UNK_009ee240;
  uVar64 = _UNK_009ee238;
  uStack0000000000000100._4_4_ = (undefined4)((ulong)plVar59 >> 0x20);
  if (*(long *)(in_stack_000000f8 + 0x58) == 0) goto code_r0x00540290;
  lVar24 = *(long *)(in_stack_000000f8 + 0x50);
  lVar48 = lVar24 + *(long *)(in_stack_000000f8 + 0x58) * 0x28;
code_r0x00540178:
  dVar4 = *(dword *)(lVar24 + 0x20);
  lVar24 = lVar24 + 0x28;
  *(undefined8 *)(unaff_x29 + -0x78) = uVar55;
  *(undefined8 *)(unaff_x29 + -0x80) = uVar64;
  *(undefined8 *)(unaff_x29 + -0x68) = uVar9;
  *(undefined8 *)(unaff_x29 + -0x70) = uVar66;
  dVar54 = dVar4;
  do {
    uStack0000000000000100._0_4_ = dVar54;
    if (*(long *)(in_stack_000000f8 + 0x78) == 0) {
code_r0x005401d8:
      pdVar62 = &MACH_HEADER.cputype;
      pdVar34 = &MACH_HEADER.cputype;
    }
    else {
      uVar20 = func_0x0057890c(*(undefined8 *)(in_stack_000000f8 + 0x80),
                               *(undefined8 *)(in_stack_000000f8 + 0x88),dVar54);
      auVar74 = func_0x00589d94(in_stack_000000f8 + 0x48,uVar20,&uStack0000000000000100);
      uVar38 = auVar74._8_8_;
      if ((auVar74._0_8_ & 1) == 0) goto code_r0x005401d8;
      if (*(ulong *)(in_stack_000000f8 + 0x58) <= uVar38) {
        func_0x007a2570(uVar38,*(ulong *)(in_stack_000000f8 + 0x58),&UNK_009f0070);
        goto code_r0x0054319c;
      }
      lVar45 = *(long *)(in_stack_000000f8 + 0x50) + uVar38 * 0x28;
      pdVar34 = *(dword **)(lVar45 + 8);
      pdVar62 = pdVar34 + *(long *)(lVar45 + 0x10) * 2;
    }
    do {
      if (pdVar34 == pdVar62) goto code_r0x0054023c;
      pdVar31 = pdVar34 + 2;
      dVar5 = *pdVar34;
      pdVar21 = pdVar34 + 1;
      pdVar34 = pdVar31;
    } while (dVar5 != dVar54 && (char)*pdVar21 == '\0');
    while (pdVar31 != pdVar62) {
      dVar6 = *pdVar31;
      pdVar34 = pdVar31 + 1;
      pdVar31 = pdVar31 + 2;
      if (dVar6 == dVar54 || (char)*pdVar34 != '\0') goto code_r0x0054023c;
    }
    func_0x004d1c68(unaff_x29 + -0x80,dVar5);
    dVar54 = dVar5;
  } while( true );
code_r0x0053f5dc:
  lVar24 = lVar24 + uVar40 * (unaff_x24 & 0xffffffff);
  in_stack_000000d0 = in_stack_000000d0 & 0xffffffff00000000 | (ulong)*(uint *)(lVar24 + 0x20);
  unaff_x26 = (ulong)*(uint *)(lVar24 + 0x2c);
code_r0x0053f61c:
  func_0x004d1c68(unaff_x29 + -0x80,unaff_x26);
  lVar24 = *(long *)(in_stack_000000f8 + 0xd8);
  if ((unaff_x26 < *(ulong *)(lVar24 + 0x28)) &&
     (puVar25 = (undefined8 *)(*(long *)(lVar24 + 0x20) + unaff_x26 * 0x20),
     (uint *)*puVar25 != unaff_x21)) {
    uVar64 = puVar25[3];
  }
  else {
    uVar64 = 0xffffffffffffffff;
  }
  uStack0000000000000100._0_4_ = 0;
  uStack0000000000000100._4_4_ = 0;
  iStack0000000000000108 = (int)*(undefined8 *)(lVar24 + 0x38);
  uStack000000000000010c = (undefined4)((ulong)*(undefined8 *)(lVar24 + 0x38) >> 0x20);
  uStack0000000000000110 = (undefined4)*(undefined8 *)(lVar24 + 0x40);
  uStack0000000000000114 = (undefined4)((ulong)*(undefined8 *)(lVar24 + 0x40) >> 0x20);
  uStack0000000000000118._0_4_ = (undefined4)uVar64;
  uStack0000000000000118._4_4_ = (undefined4)((ulong)uVar64 >> 0x20);
  in_stack_00000120 = (dword *)CONCAT44(in_stack_00000120._4_4_,(int)unaff_x26);
  func_0x0055b13c(unaff_x29 + -0xf0,&uStack0000000000000100,&UNK_009ec388);
  plVar47 = *(long **)(unaff_x29 + -0xe8);
  in_stack_000000a8 = *(long *)(unaff_x29 + -0xe0);
  if ((in_stack_000000a8 == 1) && (*(char *)(*plVar47 + 0x18) != '\0')) {
    func_0x007a247c(&UNK_008aaee6,0x4c,&UNK_009ece10);
    goto code_r0x0054319c;
  }
  _iStack0000000000000108 = plVar47 + in_stack_000000a8 * 3;
  uStack0000000000000100._0_4_ = (uint)plVar47;
  uStack0000000000000100._4_4_ = (undefined4)((ulong)plVar47 >> 0x20);
  _uStack0000000000000110 = (long *)(auStack_7ffffffe + 0x800002b6);
  func_0x00559710(unaff_x29 + -0xd8,&uStack0000000000000100,&UNK_009ec388);
  if (*(long *)(unaff_x29 + -200) != 0) goto code_r0x0053f6d0;
  goto code_r0x0053fe44;
code_r0x0053f6d0:
  puVar49 = *(uint **)(unaff_x29 + -0xd0);
  in_stack_00000020 = puVar49 + *(long *)(unaff_x29 + -200);
  unaff_x25 = puVar49 + 1;
  in_stack_000000e0 = unaff_x26;
LAB_0053f6e0:
  uVar3 = *puVar49;
  uVar38 = (ulong)uVar3;
  if ((*(ulong *)(*(long *)(in_stack_000000f8 + 0xd8) + 0x40) <= uVar38) ||
     (puVar25 = (undefined8 *)
                (*(long *)(*(long *)(in_stack_000000f8 + 0xd8) + 0x38) +
                uVar38 * (unaff_x24 & 0xffffffff)), (uint *)*puVar25 == unaff_x21)) {
    func_0x007a23bc(&UNK_009ece28);
    goto code_r0x0054319c;
  }
  uVar64 = 0;
  plVar47 = (long *)puVar25[2];
  auVar74._8_8_ = 0;
  auVar74._0_8_ = plVar47;
  uVar19 = in_stack_00000080;
  if ((SUB168(auVar74 * ZEXT816(0x18),8) != 0) ||
     (uVar40 = (long)plVar47 * 0x18, 0x7ffffffffffffff8 < uVar40)) {
code_r0x00542f30:
    in_stack_00000080 = uVar19;
    func_0x007a1f00(uVar64,in_stack_00000080,&UNK_009ece40);
    goto code_r0x0054319c;
  }
  plVar59 = (long *)puVar25[1];
  if (uVar40 == 0) {
    plVar18 = (long *)0x0;
    in_stack_00000080 = 8;
  }
  else {
    in_stack_00000080 = func_0x00187bd0(uVar40,8);
    uVar64 = 8;
    uVar19 = uVar40;
    if (in_stack_00000080 == 0) goto code_r0x00542f30;
    plVar18 = plVar47;
  }
  uStack0000000000000100._0_4_ = (uint)plVar18;
  uStack0000000000000100._4_4_ = (undefined4)((ulong)plVar18 >> 0x20);
  iStack0000000000000108 = (int)in_stack_00000080;
  uStack000000000000010c = (undefined4)(in_stack_00000080 >> 0x20);
  uStack0000000000000110 = 0;
  uStack0000000000000114 = 0;
  pdVar62 = (dword *)((long)plVar47 * 0x40);
  if ((ulong)plVar47 >> 0x3a != 0 || (dword *)0x7ffffffffffffff8 < pdVar62) {
    in_stack_00000010 = 0;
code_r0x00542f80:
    func_0x007a1f00(in_stack_00000010,in_stack_00000018,&UNK_009ece58);
    goto code_r0x0054319c;
  }
  if (pdVar62 == (dword *)0x0) {
    in_stack_00000288 = (long *)0x0;
    in_stack_00000290 = &MACH_HEADER.cpusubtype;
  }
  else {
    in_stack_00000290 = (dword *)func_0x00187bd0(pdVar62,8);
    in_stack_00000018 = pdVar62;
    if (in_stack_00000290 == (dword *)0x0) goto code_r0x00542f80;
    in_stack_00000288 = plVar47;
  }
  in_stack_00000278 = (dword *)CONCAT44(uStack000000000000010c,iStack0000000000000108);
  in_stack_00000270 = (dword *)CONCAT44(uStack0000000000000100._4_4_,(uint)uStack0000000000000100);
  in_stack_00000280 = (dword *)CONCAT44(uStack0000000000000114,uStack0000000000000110);
  in_stack_00000298 = (long *)0x0;
  in_stack_000002a0 = (undefined8 *)CONCAT62((int6)((ulong)in_stack_000002a0 >> 0x10),0x100);
  if (plVar47 != (long *)0x0) {
    in_stack_000000c0 = (long *)((ulong)in_stack_000000c0 & 0xffffffffffffff00);
    plVar18 = plVar59 + 9;
    plVar33 = plVar59;
    do {
      plVar27 = plVar18;
      plVar18 = (long *)func_0x00187bd0(0x28,8);
      if (plVar18 == (long *)0x0) {
        func_0x007a1f18(8,0x28);
        goto code_r0x0054319c;
      }
      *plVar18 = 1;
      plVar18[1] = (long)in_stack_000000c0;
      plVar18[2] = (long)unaff_x21;
      *(long **)(unaff_x29 + -0xc0) = plVar18;
      if ((plVar33[1] == 0) &&
         (puVar25 = (undefined8 *)func_0x00578610(in_stack_000000f8,plVar33 + 2),
         puVar25 != (undefined8 *)0x0)) {
        lVar24 = *plVar18;
        *plVar18 = lVar24 + 1;
        if (lVar24 < 0) {
code_r0x00541b94:
          func_0x007a05dc();
        }
        else {
          uStack0000000000000100._0_4_ = (uint)plVar18;
          uStack0000000000000100._4_4_ = (undefined4)((ulong)plVar18 >> 0x20);
          lVar24 = *(long *)*puVar25;
          *(long *)*puVar25 = lVar24 + 1;
          if (-1 < lVar24) {
            uVar55 = *puVar25;
            uVar64 = func_0x005787f4(*(undefined8 *)(in_stack_000000f8 + 0x38),
                                     *(undefined8 *)(in_stack_000000f8 + 0x40),plVar18);
            func_0x00589494(in_stack_000000f8,uVar64,plVar18,uVar55);
            unaff_x22 = auStack_7ffffffe + 0x8000026e;
            unaff_x21 = (uint *)0x8000000000000000;
            if (extraout_x1_00 != (dword *)0x0) {
              lVar24 = *(long *)extraout_x1_00;
              *(long *)extraout_x1_00 = lVar24 + -1;
              LORelease();
              if (lVar24 == 1) {
                func_0x005d2ac4(auStack_7ffffffe + 0x8000020e);
              }
            }
            plVar18 = *(long **)(unaff_x29 + -0xc0);
            in_stack_00000210 = extraout_x1_00;
            goto code_r0x0053f924;
          }
          func_0x007a05dc();
        }
        goto code_r0x0054319c;
      }
code_r0x0053f924:
      lVar24 = *plVar18;
      *plVar18 = lVar24 + 1;
      if (lVar24 < 0) goto code_r0x00541b94;
      uStack0000000000000100._0_4_ = (uint)unaff_x21;
      uStack0000000000000100._4_4_ = (undefined4)((ulong)unaff_x21 >> 0x20);
      iStack0000000000000108 = (int)plVar18;
      uStack000000000000010c = (undefined4)((ulong)plVar18 >> 0x20);
      if (in_stack_00000280 == in_stack_00000270) {
        func_0x00582b88(auStack_7ffffffe + 0x8000026e,&UNK_009eced0);
      }
      pdVar62 = in_stack_00000278 + (long)in_stack_00000280 * 6;
      *(ulong *)(pdVar62 + 4) = CONCAT44(uStack0000000000000114,uStack0000000000000110);
      *(ulong *)(pdVar62 + 2) = CONCAT44(uStack000000000000010c,iStack0000000000000108);
      *(ulong *)pdVar62 = CONCAT44(uStack0000000000000100._4_4_,(uint)uStack0000000000000100);
      in_stack_00000280 = (dword *)((long)in_stack_00000280 + 1);
      lVar24 = plVar33[1];
      uStack0000000000000128 = (dword *)plVar33[6];
      in_stack_00000120 = (dword *)plVar33[5];
      in_stack_00000138 = (long *)plVar33[8];
      in_stack_00000130 = (dword *)plVar33[7];
      iStack0000000000000108 = (int)plVar33[2];
      uStack000000000000010c = (undefined4)((ulong)plVar33[2] >> 0x20);
      uStack0000000000000100._0_4_ = (uint)lVar24;
      uStack0000000000000100._4_4_ = (undefined4)((ulong)lVar24 >> 0x20);
      uStack0000000000000118._0_4_ = (undefined4)plVar33[4];
      uStack0000000000000118._4_4_ = (undefined4)((ulong)plVar33[4] >> 0x20);
      uStack0000000000000110 = (undefined4)plVar33[3];
      uStack0000000000000114 = (undefined4)((ulong)plVar33[3] >> 0x20);
      plVar33[1] = 0;
      plVar33[2] = (long)plVar18;
      plVar33[4] = (long)in_stack_00000218;
      plVar33[3] = (long)in_stack_00000210;
      plVar33[6] = in_stack_00000228;
      plVar33[5] = (long)in_stack_00000220;
      plVar33[8] = in_stack_00000238;
      plVar33[7] = in_stack_00000230;
      if (in_stack_00000298 == in_stack_00000288) {
        func_0x00582ff0(unaff_x22 + 0x18,&UNK_009ecee8);
      }
      pdVar62 = in_stack_00000290 + (long)in_stack_00000298 * 0x10;
      *(ulong *)(pdVar62 + 2) = CONCAT44(uStack000000000000010c,iStack0000000000000108);
      *(ulong *)pdVar62 = CONCAT44(uStack0000000000000100._4_4_,(uint)uStack0000000000000100);
      *(ulong *)(pdVar62 + 6) =
           CONCAT44(uStack0000000000000118._4_4_,(undefined4)uStack0000000000000118);
      *(ulong *)(pdVar62 + 4) = CONCAT44(uStack0000000000000114,uStack0000000000000110);
      *(dword **)(pdVar62 + 10) = uStack0000000000000128;
      *(dword **)(pdVar62 + 8) = in_stack_00000120;
      *(long **)(pdVar62 + 0xe) = in_stack_00000138;
      *(dword **)(pdVar62 + 0xc) = in_stack_00000130;
      in_stack_00000298 = (long *)((long)in_stack_00000298 + 1);
      unaff_x21 = (uint *)0x8000000000000000;
      if (in_stack_00000268 == 0) {
code_r0x0053ff0c:
        func_0x007a23d8(&UNK_008aad91,0x16,&UNK_009ecf00);
        goto code_r0x0054319c;
      }
      lVar24 = 0;
      uVar40 = (*plVar33 + 8) * 0x517cc1b727220a95;
      bVar37 = (byte)(uVar40 >> 0x39);
      uVar40 = uVar40 & (ulong)in_stack_00000258;
      uVar64 = *(undefined8 *)((long)in_stack_00000250 + uVar40);
      uVar19 = CONCAT17(-((byte)((ulong)uVar64 >> 0x38) == bVar37),
                        CONCAT16(-((byte)((ulong)uVar64 >> 0x30) == bVar37),
                                 CONCAT15(-((byte)((ulong)uVar64 >> 0x28) == bVar37),
                                          CONCAT14(-((byte)((ulong)uVar64 >> 0x20) == bVar37),
                                                   CONCAT13(-((byte)((ulong)uVar64 >> 0x18) ==
                                                             bVar37),CONCAT12(-((byte)((ulong)uVar64
                                                                                      >> 0x10) ==
                                                                               bVar37),CONCAT11(-((
                                                  byte)((ulong)uVar64 >> 8) == bVar37),
                                                  -((byte)uVar64 == bVar37)))))))) &
               0x8080808080808080;
      while( true ) {
        while (uVar19 == 0) {
          bVar67 = NEON_umaxv(CONCAT17(-((char)((ulong)uVar64 >> 0x38) == -1),
                                       CONCAT16(-((char)((ulong)uVar64 >> 0x30) == -1),
                                                CONCAT15(-((char)((ulong)uVar64 >> 0x28) == -1),
                                                         CONCAT14(-((char)((ulong)uVar64 >> 0x20) ==
                                                                   -1),CONCAT13(-((char)((ulong)
                                                  uVar64 >> 0x18) == -1),
                                                  CONCAT12(-((char)((ulong)uVar64 >> 0x10) == -1),
                                                           CONCAT11(-((char)((ulong)uVar64 >> 8) ==
                                                                     -1),-((char)uVar64 == -1)))))))
                                      ),1);
          if ((bVar67 & 1) != 0) goto code_r0x0053ff0c;
          lVar24 = lVar24 + 8;
          uVar40 = uVar40 + lVar24 & (ulong)in_stack_00000258;
          uVar64 = *(undefined8 *)((long)in_stack_00000250 + uVar40);
          uVar19 = CONCAT17(-((byte)((ulong)uVar64 >> 0x38) == bVar37),
                            CONCAT16(-((byte)((ulong)uVar64 >> 0x30) == bVar37),
                                     CONCAT15(-((byte)((ulong)uVar64 >> 0x28) == bVar37),
                                              CONCAT14(-((byte)((ulong)uVar64 >> 0x20) == bVar37),
                                                       CONCAT13(-((byte)((ulong)uVar64 >> 0x18) ==
                                                                 bVar37),CONCAT12(-((byte)((ulong)
                                                  uVar64 >> 0x10) == bVar37),
                                                  CONCAT11(-((byte)((ulong)uVar64 >> 8) == bVar37),
                                                           -((byte)uVar64 == bVar37)))))))) &
                   0x8080808080808080;
        }
        uVar44 = (uVar19 >> 7 & 0xff00ff00ff00ff00) >> 8 | (uVar19 >> 7 & 0xff00ff00ff00ff) << 8;
        uVar44 = (uVar44 & 0xffff0000ffff0000) >> 0x10 | (uVar44 & 0xffff0000ffff) << 0x10;
        uVar44 = uVar40 + ((ulong)LZCOUNT(uVar44 >> 0x20 | uVar44 << 0x20) >> 3) &
                 (ulong)in_stack_00000258;
        if (*plVar33 == *(long *)(in_stack_00000250 + uVar44 * -4 + -4)) break;
        uVar19 = uVar19 - 1 & uVar19;
      }
      lVar24 = **(long **)(in_stack_00000250 + uVar44 * -4 + -2);
      **(long **)(in_stack_00000250 + uVar44 * -4 + -2) = lVar24 + 1;
      if (lVar24 < 0) {
        func_0x007a05dc();
        goto code_r0x0054319c;
      }
      lVar48 = *(long *)(in_stack_00000250 + uVar44 * -4 + -2);
      lVar24 = *(long *)*plVar33;
      *(long *)*plVar33 = lVar24 + -1;
      LORelease();
      if (lVar24 == 1) {
        func_0x005d2ac4(plVar33);
      }
      *plVar33 = lVar48;
      lVar24 = 0;
      if (plVar27 != plVar59 + (long)plVar47 * 9) {
        lVar24 = 0x48;
      }
      plVar18 = (long *)((long)plVar27 + lVar24);
      plVar33 = plVar27;
    } while (plVar27 != plVar59 + (long)plVar47 * 9);
  }
  unaff_x27 = 1;
  unaff_x24 = 0x30;
  in_stack_00000018 = in_stack_00000290;
  if (in_stack_00000280 != (dword *)0x0) goto code_r0x0053faf8;
  func_0x0053dc88(auStack_7ffffffe + 0x8000026e);
  puVar49 = unaff_x25;
  goto LAB_0053fe30;
code_r0x0053faf8:
  lVar24 = *(long *)(in_stack_000000f8 + 0xd8);
  uVar19 = in_stack_000000e0;
  if (in_stack_000000a8 == 1) {
code_r0x0053fd90:
    unaff_x27 = 1;
    if (*(ulong *)(lVar24 + 0x28) <= uVar19) goto LAB_00543000;
    unaff_x23 = (undefined8 *)(*(long *)(lVar24 + 0x20) + uVar19 * 0x20);
    param_1 = (uint *)*unaff_x23;
    in_ZR = param_1 == unaff_x21;
    goto code_r0x0053fdb0;
  }
  uStack0000000000000100._0_4_ = 0;
  uStack0000000000000100._4_4_ = 0;
  iStack0000000000000108 = 8;
  uStack000000000000010c = 0;
  uStack0000000000000110 = 0;
  uStack0000000000000114 = 0;
  uVar19 = func_0x00594d74(lVar24 + 0x18,&uStack0000000000000100);
  lVar24 = *(long *)(in_stack_000000f8 + 0xd8);
  uVar40 = *(ulong *)(lVar24 + 0x40);
  if ((uVar40 <= uVar38) ||
     (puVar25 = (undefined8 *)(*(long *)(lVar24 + 0x38) + uVar38 * 0x30),
     (uint *)*puVar25 == unaff_x21)) {
    in_stack_00000008 = &UNK_009ece70;
    goto LAB_00543000;
  }
  uVar44 = (ulong)*(uint *)(puVar25 + 5);
  if ((*(ulong *)(lVar24 + 0x28) <= uVar44) ||
     (puVar25 = (undefined8 *)(*(long *)(lVar24 + 0x20) + uVar44 * 0x20),
     (uint *)*puVar25 == unaff_x21)) {
    in_stack_00000008 = &UNK_009ec878;
    goto LAB_00543000;
  }
  if ((puVar25[2] != 0) &&
     (lVar48 = *(long *)(puVar25[1] + puVar25[2] * 0x108 + -0xf0), lVar48 == 0x19 || lVar48 == 0x16)
     ) {
    func_0x004d1c68(in_stack_000000f8 + 0x200,uVar19);
    lVar24 = *(long *)(in_stack_000000f8 + 0xd8);
    uVar40 = *(ulong *)(lVar24 + 0x40);
  }
  if (uVar38 < uVar40) {
    lVar48 = *(long *)(lVar24 + 0x38);
    puVar25 = (undefined8 *)(lVar48 + uVar38 * 0x30);
    if ((uint *)*puVar25 != unaff_x21) {
      uVar44 = puVar25[5];
      uVar42 = *(ulong *)(lVar24 + 0x28);
      uVar46 = uVar44 & 0xffffffff;
      if (uVar46 < uVar42) {
        uVar60 = *(uint *)((long)puVar25 + 0x24);
        lVar45 = *(long *)(lVar24 + 0x20);
        puVar49 = (uint *)(lVar45 + uVar46 * 0x20 + 0x18);
        uVar7 = *puVar49;
        while (uVar46 = (ulong)uVar7, uVar46 != uVar38) {
          if (uVar40 <= uVar46) goto code_r0x0053fc20;
          puVar49 = (uint *)(lVar48 + uVar46 * 0x30 + 0x20);
          uVar7 = *puVar49;
        }
        *puVar49 = *(uint *)(puVar25 + 4);
code_r0x0053fc20:
        uVar44 = uVar44 >> 0x20;
        if (uVar44 < uVar42) {
          puVar49 = (uint *)(lVar45 + uVar44 * 0x20 + 0x1c);
          uVar7 = *puVar49;
          while (uVar44 = (ulong)uVar7, uVar44 != uVar38) {
            if (uVar40 <= uVar44) goto code_r0x0053fc58;
            puVar49 = (uint *)(lVar48 + uVar44 * 0x30 + 0x24);
            uVar7 = *puVar49;
          }
          *puVar49 = uVar60;
        }
      }
code_r0x0053fc58:
      *(undefined4 *)(puVar25 + 4) = *(undefined4 *)(lVar24 + 0x5c);
      *(undefined8 *)((long)puVar25 + 0x24) = 0xffffffffffffffff;
      *(undefined4 *)((long)puVar25 + 0x2c) = 0xffffffff;
      *(uint *)(lVar24 + 0x5c) = uVar3;
      *(long *)(lVar24 + 0x50) = *(long *)(lVar24 + 0x50) + -1;
      in_stack_00000210 = (dword *)*puVar25;
      *puVar25 = unaff_x21;
      if (in_stack_00000210 != unaff_x21) {
        in_stack_00000220 = (dword *)puVar25[2];
        in_stack_00000218 = (undefined8 *)puVar25[1];
        in_stack_00000228 = puVar25[3];
        uVar64 = *(undefined8 *)(in_stack_000000f8 + 0xd8);
        puVar49 = (uint *)func_0x00187bd0(0x28,8);
        if (puVar49 == (uint *)0x0) {
          func_0x007a1f18(8,0x28);
          goto code_r0x0054319c;
        }
        uStack000000000000010c = SUB84(in_stack_00000218,0);
        uStack0000000000000100._4_4_ = SUB84(in_stack_00000210,0);
        iStack0000000000000108 = (int)((ulong)in_stack_00000210 >> 0x20);
        uStack0000000000000118._0_4_ = (undefined4)((ulong)in_stack_00000220 >> 0x20);
        *puVar49 = in_stack_000002b8;
        *(ulong *)(puVar49 + 3) = CONCAT44(uStack000000000000010c,iStack0000000000000108);
        *(ulong *)(puVar49 + 1) =
             CONCAT44(uStack0000000000000100._4_4_,(uint)uStack0000000000000100);
        *(dword **)(puVar49 + 6) = in_stack_00000220;
        *(undefined8 **)(puVar49 + 4) = in_stack_00000218;
        *(undefined1 *)(puVar49 + 8) = 0;
        uStack0000000000000100._0_4_ = 1;
        uStack0000000000000100._4_4_ = 0;
        iStack0000000000000108 = (int)puVar49;
        uStack000000000000010c = (undefined4)((ulong)puVar49 >> 0x20);
        uStack0000000000000110 = 1;
        uStack0000000000000114 = 0;
        func_0x00584c34(unaff_x29 + -0xc0,uVar64,uVar19,&uStack0000000000000100);
        func_0x005581a0(unaff_x29 + -0xc0);
        if (*(long *)(unaff_x29 + -0xc0) != 0) {
          func_0x00187bd4(*(undefined8 *)(unaff_x29 + -0xb8),*(long *)(unaff_x29 + -0xc0) * 0x28,8);
        }
        uStack0000000000000118._0_4_ =
             CONCAT31(uStack0000000000000118._1_3_,(char)in_stack_00000228);
        uStack0000000000000100._0_4_ = 0;
        uStack0000000000000100._4_4_ = 0;
        iStack0000000000000108 = 8;
        uStack000000000000010c = 0;
        uStack0000000000000110 = 0;
        uStack0000000000000114 = 0;
        func_0x00594a8c(*(long *)(in_stack_000000f8 + 0xd8) + 0x18,unaff_x26,uVar19,
                        &uStack0000000000000100);
        func_0x004d1c68(unaff_x29 + -0x80,uVar19);
        lVar24 = *(long *)(in_stack_000000f8 + 0xd8);
        uVar19 = uVar19 & 0xffffffff;
        goto code_r0x0053fd90;
      }
    }
  }
  in_stack_00000008 = &UNK_009ece88;
  goto LAB_00543000;
code_r0x0054023c:
  iStack0000000000000108 = (int)*(undefined8 *)(unaff_x29 + -0x78);
  uStack000000000000010c = (undefined4)((ulong)*(undefined8 *)(unaff_x29 + -0x78) >> 0x20);
  uStack0000000000000100._0_4_ = (uint)*(undefined8 *)(unaff_x29 + -0x80);
  uStack0000000000000100._4_4_ = (undefined4)((ulong)*(undefined8 *)(unaff_x29 + -0x80) >> 0x20);
  uStack0000000000000118._0_4_ = (undefined4)*(undefined8 *)(unaff_x29 + -0x68);
  uStack0000000000000118._4_4_ = (undefined4)((ulong)*(undefined8 *)(unaff_x29 + -0x68) >> 0x20);
  uStack0000000000000110 = (undefined4)*(undefined8 *)(unaff_x29 + -0x70);
  uStack0000000000000114 = (undefined4)((ulong)*(undefined8 *)(unaff_x29 + -0x70) >> 0x20);
  func_0x0056401c(auStack_7ffffffe + 0x8000026e,in_stack_000000f8 + 0x1c0,dVar4,
                  &uStack0000000000000100);
  if ((in_stack_00000270 != (dword *)0x0) && (in_stack_00000278 != (dword *)0x0)) {
    uVar38 = (long)in_stack_00000278 * 4 + 0xbU & 0xfffffffffffffff8;
    lVar45 = (long)in_stack_00000278 + uVar38 + 9;
    if (lVar45 != 0) {
      func_0x00187bd4((long)in_stack_00000270 - uVar38,lVar45,8);
    }
  }
  plVar59 = (long *)CONCAT44(uStack0000000000000100._4_4_,(uint)uStack0000000000000100);
  if (lVar24 == lVar48) goto code_r0x00540290;
  goto code_r0x00540178;
code_r0x00540290:
  uStack0000000000000100 = plVar59;
  if (*(int *)(*(long *)(in_stack_000000f8 + 0xd8) + 0x78) != 1) {
    func_0x007a23bc(&UNK_009ec758);
    goto code_r0x0054319c;
  }
  func_0x0058bce0(auStack_7ffffffe + 0x8000026e,in_stack_000000f8 + 0x48,
                  *(undefined4 *)(*(long *)(in_stack_000000f8 + 0xd8) + 0x7c));
  lVar45 = _UNK_007fc2d8;
  lVar48 = _UNK_007fc2d0;
  lVar24 = 0;
  in_stack_00000010 = 0x26;
  in_stack_00000018 = (dword *)&UNK_009ec770;
  puStack0000000000000000 = &UNK_008aae23;
  in_stack_00000008 = &UNK_009ec7b8;
code_r0x0054033c:
  auVar74 = func_0x0058be04(auStack_7ffffffe + 0x8000026e,*(long *)(in_stack_000000f8 + 0xd8) + 0x18
                           );
  uVar38 = auVar74._8_8_;
  if ((auVar74._0_8_ & 1) != 0) {
    lVar35 = *(long *)(in_stack_000000f8 + 0xd8);
    if ((*(uint *)(lVar35 + 0x78) & 1) == 0) {
code_r0x00542e54:
      func_0x007a23bc(in_stack_00000018);
      goto code_r0x0054319c;
    }
    iVar22 = auVar74._8_4_;
    if (iVar22 == *(int *)(lVar35 + 0x7c)) {
      if (lVar24 != 0) {
code_r0x00542f64:
        func_0x007a247c(puStack0000000000000000,in_stack_00000010,in_stack_00000008);
        goto code_r0x0054319c;
      }
      if (((uVar38 & 0xffffffff) < *(ulong *)(lVar35 + 0x28)) &&
         (plVar47 = (long *)(*(long *)(lVar35 + 0x20) + (uVar38 & 0xffffffff) * 0x20),
         *plVar47 != -0x8000000000000000)) {
        uVar19 = (ulong)*(uint *)((long)plVar47 + 0x1c) << 0x20 | 0xffffffff;
      }
      else {
        uVar19 = 0xffffffffffffffff;
      }
      lVar65 = *(long *)(lVar35 + 0x38);
      uVar40 = *(ulong *)(lVar35 + 0x40);
      while (uVar44 = uVar19 & 0xffffffff, uVar44 < uVar40) {
        uVar42 = uVar19 & 0xffffffff;
        uVar19 = uVar19 & 0xffffffff00000000 | (ulong)*(uint *)(lVar65 + uVar44 * 0x30 + 0x20);
        if (uVar40 <= uVar42) goto code_r0x00542e2c;
code_r0x0054042c:
        plVar47 = (long *)(lVar65 + uVar42 * 0x30);
        if (*plVar47 == -0x8000000000000000) goto code_r0x00542e2c;
        if ((*(int *)((long)plVar47 + 0x2c) == iVar22) && (plVar47[2] != 0)) {
          in_stack_00000010 = 0x5b;
          puStack0000000000000000 = &UNK_008aadc8;
          in_stack_00000008 = &UNK_009ec7a0;
          goto code_r0x00542f64;
        }
      }
      uVar19 = uVar19 >> 0x20;
      do {
        uVar42 = uVar19;
        if (uVar40 <= uVar42) {
          uVar40 = 0;
          plVar59 = *(long **)(in_stack_000000f8 + 0xe0);
          in_stack_00000178 = (long)plVar59 + *(long *)(in_stack_000000f8 + 0xe8) + 1;
          lVar65 = *plVar59;
          plVar47 = plVar59 + 1;
          uVar19 = CONCAT17(-(-1 < lVar65),
                            CONCAT16(-(-1 < (char)((ulong)lVar65 >> 0x30)),
                                     CONCAT15(-(-1 < (char)((ulong)lVar65 >> 0x28)),
                                              CONCAT14(-(-1 < (char)((ulong)lVar65 >> 0x20)),
                                                       CONCAT13(-(-1 < (char)((ulong)lVar65 >> 0x18)
                                                                 ),CONCAT12(-(-1 < (char)((ulong)
                                                  lVar65 >> 0x10)),
                                                  CONCAT11(-(-1 < (char)((ulong)lVar65 >> 8)),
                                                           -(-1 < (char)lVar65)))))))) &
                   0x8080808080808080;
          in_stack_000000d0 = *(long *)(in_stack_000000f8 + 0xf8);
          puVar58 = *(undefined8 **)(in_stack_000000f8 + 8);
          puVar41 = puVar58 + *(long *)(in_stack_000000f8 + 0x10) * 3;
          puVar39 = *(undefined8 **)(lVar35 + 8);
          puVar25 = puVar39 + *(long *)(lVar35 + 0x10);
          uStack0000000000000100._0_4_ = 0;
          uStack0000000000000100._4_4_ = 0;
          uStack0000000000000128 = (dword *)0x0;
          in_stack_00000198 = 0;
          in_stack_000000b0 = _uStack0000000000000110;
          in_stack_000000c0 = _iStack0000000000000108;
          lVar35 = 0;
          in_stack_00000150 = puVar58;
          in_stack_00000158 = puVar41;
          in_stack_00000160 = plVar59;
          in_stack_00000168 = uVar19;
          in_stack_00000170 = plVar47;
          in_stack_00000180 = in_stack_000000d0;
          in_stack_00000188 = puVar39;
          in_stack_00000190 = puVar25;
          do {
            in_stack_00000098 = (uint *)(uVar38 & 0xffffffff);
            if (uVar40 == 3) {
code_r0x005405d0:
              if (puVar39 == puVar25) {
                lVar35 = *(long *)(in_stack_000000f8 + 0xd8);
                uVar19 = *(ulong *)(lVar35 + 0x28);
                if (in_stack_00000098 < uVar19) goto code_r0x00540720;
                goto code_r0x00540738;
              }
              in_stack_00000188 = puVar39 + 1;
              uVar40 = 3;
              puVar32 = puVar39;
              puVar39 = in_stack_00000188;
            }
            else {
              if (plVar59 != (long *)0x0) {
                if (in_stack_000000d0 == 0) {
                  in_stack_00000160 = (long *)0x0;
                  goto code_r0x005405bc;
                }
                plVar18 = plVar47;
                if (uVar19 == 0) {
                  do {
                    plVar47 = plVar18 + 1;
                    lVar65 = *plVar18;
                    plVar59 = plVar59 + -8;
                    uVar19 = CONCAT17(-(-1 < lVar65),
                                      CONCAT16(-(-1 < (char)((ulong)lVar65 >> 0x30)),
                                               CONCAT15(-(-1 < (char)((ulong)lVar65 >> 0x28)),
                                                        CONCAT14(-(-1 < (char)((ulong)lVar65 >> 0x20
                                                                              )),
                                                                 CONCAT13(-(-1 < (char)((ulong)
                                                  lVar65 >> 0x18)),
                                                  CONCAT12(-(-1 < (char)((ulong)lVar65 >> 0x10)),
                                                           CONCAT11(-(-1 < (char)((ulong)lVar65 >> 8
                                                                                 )),
                                                                    -(-1 < (char)lVar65)))))))) &
                             0x8080808080808080;
                    plVar18 = plVar47;
                  } while (uVar19 == 0);
                  in_stack_00000160 = plVar59;
                  in_stack_00000170 = plVar47;
                }
                uVar44 = (uVar19 >> 7 & 0xff00ff00ff00ff00) >> 8 |
                         (uVar19 >> 7 & 0xff00ff00ff00ff) << 8;
                uVar44 = (uVar44 & 0xffff0000ffff0000) >> 0x10 | (uVar44 & 0xffff0000ffff) << 0x10;
                uVar19 = uVar19 - 1 & uVar19;
                in_stack_000000d0 = in_stack_000000d0 + -1;
                puVar32 = (undefined8 *)
                          ((long)plVar59 + (-8 - (LZCOUNT(uVar44 >> 0x20 | uVar44 << 0x20) & 0x78U))
                          );
                in_stack_00000168 = uVar19;
                in_stack_00000180 = in_stack_000000d0;
                goto code_r0x005405f0;
              }
code_r0x005405bc:
              if (uVar40 == 2) {
code_r0x005405c4:
                plVar59 = (long *)0x0;
                uStack0000000000000100._0_4_ = 3;
                uStack0000000000000100._4_4_ = 0;
                goto code_r0x005405d0;
              }
              if (((uVar40 & 1) == 0) || (in_stack_000000b0 == in_stack_000000c0)) {
                if (puVar58 == puVar41) goto code_r0x005405c4;
                plVar59 = (long *)0x0;
                in_stack_00000150 = puVar58 + 3;
                in_stack_00000120 = (dword *)(puVar58 + 1);
                _uStack0000000000000110 = (long *)((long)&MACH_HEADER.magic + 2);
                uStack0000000000000118._0_4_ = SUB84(puVar58,0);
                uStack0000000000000118._4_4_ = (undefined4)((ulong)puVar58 >> 0x20);
                _iStack0000000000000108 = (long *)((long)&MACH_HEADER.magic + 1);
                uStack0000000000000100._0_4_ = 1;
                uStack0000000000000100._4_4_ = 0;
                in_stack_000000c0 = (long *)((long)&MACH_HEADER.magic + 1);
                in_stack_000000b0 = (long *)((long)&MACH_HEADER.magic + 2);
                uVar40 = 1;
                puVar32 = puVar58;
                puVar58 = in_stack_00000150;
              }
              else {
                puVar32 = &uStack0000000000000118 + (long)in_stack_000000c0;
                in_stack_000000c0 = (long *)((long)in_stack_000000c0 + 1);
                _iStack0000000000000108 = in_stack_000000c0;
                if ((undefined8 *)*puVar32 == (undefined8 *)0x0) goto code_r0x005405c4;
                plVar59 = (long *)0x0;
                puVar32 = (undefined8 *)*puVar32;
              }
            }
code_r0x005405f0:
            lVar65 = lVar35 + 1;
            plVar18 = (long *)*puVar32;
            in_stack_00000198 = lVar65;
            if (*(long *)(in_stack_000000f8 + 0x198) == 0) {
code_r0x0054063c:
              lVar43 = *plVar18;
              *plVar18 = lVar43 + 1;
              if (lVar43 < 0) {
                func_0x007a05dc();
                goto code_r0x0054319c;
              }
              uVar64 = *puVar32;
              *(undefined8 *)(unaff_x29 + -0x80) = 0;
              *(int *)(unaff_x29 + -0x78) = iVar22;
              *(undefined8 *)(unaff_x29 + -0x70) = 0;
              *(long *)(unaff_x29 + -0x68) = lVar35;
              func_0x005627a8(auStack_7ffffffe + 0x8000024e,in_stack_000000f8 + 0x180,uVar64,
                              unaff_x29 + -0x80);
            }
            else {
              lVar43 = 0;
              uVar44 = (long)(plVar18 + 1) * 0x517cc1b727220a95;
              bVar37 = (byte)(uVar44 >> 0x39);
              while( true ) {
                uVar44 = uVar44 & *(ulong *)(in_stack_000000f8 + 0x188);
                uVar64 = *(undefined8 *)(*(long *)(in_stack_000000f8 + 0x180) + uVar44);
                bVar67 = (byte)((ulong)uVar64 >> 8);
                bVar68 = (byte)((ulong)uVar64 >> 0x10);
                bVar69 = (byte)((ulong)uVar64 >> 0x18);
                bVar70 = (byte)((ulong)uVar64 >> 0x20);
                bVar71 = (byte)((ulong)uVar64 >> 0x28);
                bVar72 = (byte)((ulong)uVar64 >> 0x30);
                bVar73 = (byte)((ulong)uVar64 >> 0x38);
                uVar42 = CONCAT17(-(bVar73 == bVar37),
                                  CONCAT16(-(bVar72 == bVar37),
                                           CONCAT15(-(bVar71 == bVar37),
                                                    CONCAT14(-(bVar70 == bVar37),
                                                             CONCAT13(-(bVar69 == bVar37),
                                                                      CONCAT12(-(bVar68 == bVar37),
                                                                               CONCAT11(-(bVar67 ==
                                                                                         bVar37),-((
                                                  byte)uVar64 == bVar37)))))))) & 0x8080808080808080
                ;
                if (uVar42 != 0) break;
code_r0x00540524:
                bVar67 = NEON_umaxv(CONCAT17(-(bVar73 == 0xff),
                                             CONCAT16(-(bVar72 == 0xff),
                                                      CONCAT15(-(bVar71 == 0xff),
                                                               CONCAT14(-(bVar70 == 0xff),
                                                                        CONCAT13(-(bVar69 == 0xff),
                                                                                 CONCAT12(-(bVar68 
                                                  == 0xff),CONCAT11(-(bVar67 == 0xff),
                                                                    -((byte)uVar64 == 0xff)))))))),1
                                   );
                if ((bVar67 & 1) != 0) goto code_r0x0054063c;
                lVar43 = lVar43 + 8;
                uVar44 = uVar44 + lVar43;
              }
              while (uVar46 = (uVar42 >> 7 & 0xff00ff00ff00ff00) >> 8 |
                              (uVar42 >> 7 & 0xff00ff00ff00ff) << 8,
                    uVar46 = (uVar46 & 0xffff0000ffff0000) >> 0x10 |
                             (uVar46 & 0xffff0000ffff) << 0x10,
                    plVar18 !=
                    *(long **)(*(long *)(in_stack_000000f8 + 0x180) + -0x28 +
                              (uVar44 + ((ulong)LZCOUNT(uVar46 >> 0x20 | uVar46 << 0x20) >> 3) &
                              *(ulong *)(in_stack_000000f8 + 0x188)) * -0x28)) {
                uVar42 = uVar42 - 1 & uVar42;
                if (uVar42 == 0) goto code_r0x00540524;
              }
            }
            lVar35 = lVar65;
          } while( true );
        }
        lVar43 = lVar65 + uVar42 * 0x30;
        uVar19 = (ulong)*(uint *)(lVar43 + 0x24);
      } while (*(int *)(lVar43 + 0x28) == -1);
      uVar19 = uVar44 | uVar19 << 0x20;
      if (uVar42 < uVar40) goto code_r0x0054042c;
code_r0x00542e2c:
      in_stack_00000018 = (dword *)&UNK_009ec488;
      goto code_r0x00542e54;
    }
    uVar19 = *(ulong *)(lVar35 + 0x28);
    if ((uVar38 & 0xffffffff) < uVar19) {
code_r0x00540720:
      plVar47 = (long *)(*(long *)(lVar35 + 0x20) + (uVar38 & 0xffffffff) * 0x20);
      if (*plVar47 == -0x8000000000000000) goto code_r0x00540738;
      uVar40 = (ulong)*(uint *)((long)plVar47 + 0x1c) << 0x20 | 0xffffffff;
      plVar47 = uStack0000000000000100;
    }
    else {
code_r0x00540738:
      uVar40 = 0xffffffffffffffff;
      plVar47 = uStack0000000000000100;
    }
    lVar65 = *(long *)(lVar35 + 0x38);
    uVar44 = *(ulong *)(lVar35 + 0x40);
    while( true ) {
      uVar42 = uVar40 & 0xffffffff;
      uStack0000000000000100._0_4_ = (uint)lVar24;
      uVar10 = (uint)uStack0000000000000100;
      uStack0000000000000100._4_4_ = (undefined4)((ulong)lVar24 >> 0x20);
      uVar12 = uStack0000000000000100._4_4_;
      uStack0000000000000100 = plVar47;
      if (uVar44 <= uVar42) break;
      uVar46 = uVar40 & 0xffffffff;
      uVar40 = uVar40 & 0xffffffff00000000 | (ulong)*(uint *)(lVar65 + uVar42 * 0x30 + 0x20);
      if (uVar44 <= uVar46) {
code_r0x00542dbc:
        func_0x007a23bc(&UNK_009f08a0);
        goto code_r0x0054319c;
      }
code_r0x005407b0:
      plVar59 = (long *)(lVar65 + uVar46 * 0x30);
      if (*plVar59 == -0x8000000000000000) goto code_r0x00542dbc;
      if (*(int *)((long)plVar59 + 0x2c) == iVar22) {
        uVar40 = plVar59[2];
        if (uVar40 == 0) goto code_r0x00540940;
        lVar35 = plVar59[1];
        lVar65 = uVar40 << 4;
        puVar25 = (undefined8 *)func_0x00187bd0(lVar65,8);
        if (puVar25 == (undefined8 *)0x0) {
          func_0x007a1f00(8,lVar65,&UNK_009ec388);
          goto code_r0x0054319c;
        }
        if (uVar40 < 8) {
          uVar19 = 0;
code_r0x005408b4:
          plVar47 = puVar25 + uVar19 * 2 + 1;
          lVar35 = lVar35 + uVar19 * 0x48;
          do {
            plVar47[-1] = uVar19;
            *plVar47 = lVar35;
            uVar19 = uVar19 + 1;
            plVar47 = plVar47 + 2;
            lVar35 = lVar35 + 0x48;
          } while (uVar40 != uVar19);
        }
        else {
          uVar19 = uVar40 & 0xfffffffffffffff8;
          uVar44 = uVar19;
          plVar47 = puVar25 + 8;
          lVar43 = lVar48;
          lVar51 = lVar45;
          do {
            lVar56 = lVar35 + lVar43 * 0x48;
            lVar61 = lVar35 + lVar51 * 0x48;
            plVar47[-8] = lVar43;
            plVar47[-7] = lVar56;
            plVar47[-6] = lVar51;
            plVar47[-5] = lVar61;
            plVar47[-4] = lVar43 + 2;
            plVar47[-3] = lVar56 + 0x90;
            plVar47[-2] = lVar51 + 2;
            plVar47[-1] = lVar61 + 0x90;
            *plVar47 = lVar43 + 4;
            plVar47[1] = lVar56 + 0x120;
            plVar47[2] = lVar51 + 4;
            plVar47[3] = lVar61 + 0x120;
            plVar47[4] = lVar43 + 6;
            plVar47[5] = lVar56 + 0x1b0;
            plVar47[6] = lVar51 + 6;
            plVar47[7] = lVar61 + 0x1b0;
            lVar43 = lVar43 + 8;
            lVar51 = lVar51 + 8;
            uVar44 = uVar44 - 8;
            plVar47 = plVar47 + 0x10;
          } while (uVar44 != 0);
          if (uVar40 != uVar19) goto code_r0x005408b4;
        }
        puVar58 = puVar25;
        plVar47 = _iStack0000000000000108;
        do {
          uStack000000000000010c = (undefined4)((ulong)plVar47 >> 0x20);
          uVar64 = *puVar58;
          puVar39 = (undefined8 *)puVar58[1];
          plVar59 = (long *)*puVar39;
          lVar35 = *plVar59;
          *plVar59 = lVar35 + 1;
          if (lVar35 < 0) {
            _iStack0000000000000108 = plVar47;
            func_0x007a05dc();
            goto code_r0x0054319c;
          }
          uStack0000000000000110 = 0;
          uStack0000000000000114 = 0;
          uStack0000000000000118._0_4_ = (undefined4)uVar64;
          uStack0000000000000118._4_4_ = (undefined4)((ulong)uVar64 >> 0x20);
          uStack0000000000000100._0_4_ = uVar10;
          uStack0000000000000100._4_4_ = uVar12;
          iStack0000000000000108 = iVar22;
          func_0x005627a8(unaff_x29 + -0x80,in_stack_000000f8 + 0x180,*puVar39,
                          &uStack0000000000000100);
          plVar47 = (long *)CONCAT44(uStack000000000000010c,iStack0000000000000108);
          puVar58 = puVar58 + 2;
        } while (puVar58 != puVar25 + uVar40 * 2);
        func_0x00187bd4(puVar25,lVar65,8);
        lVar35 = *(long *)(in_stack_000000f8 + 0xd8);
        uVar19 = *(ulong *)(lVar35 + 0x28);
        uStack0000000000000100 =
             (long *)CONCAT44(uStack0000000000000100._4_4_,(uint)uStack0000000000000100);
        goto code_r0x00540940;
      }
    }
    uVar40 = uVar40 >> 0x20;
    while (uVar46 = uVar40, uVar46 < uVar44) {
      lVar43 = lVar65 + uVar46 * 0x30;
      uVar40 = (ulong)*(uint *)(lVar43 + 0x24);
      if (*(int *)(lVar43 + 0x28) != -1) {
        uVar40 = uVar42 | uVar40 << 0x20;
        if (uVar46 < uVar44) goto code_r0x005407b0;
        goto code_r0x00542dbc;
      }
    }
code_r0x00540940:
    if ((uVar19 <= (uVar38 & 0xffffffff)) ||
       (plVar47 = (long *)(*(long *)(lVar35 + 0x20) + (uVar38 & 0xffffffff) * 0x20),
       *plVar47 == -0x8000000000000000)) {
      in_stack_00000018 = (dword *)&UNK_009ec788;
      goto code_r0x00542e54;
    }
    lVar35 = plVar47[2];
    if (lVar35 == 0) goto code_r0x00540334;
    lVar65 = 0;
    lVar51 = plVar47[1];
    lVar43 = lVar51;
code_r0x0054098c:
    uVar13 = uStack0000000000000118._4_4_;
    uVar11 = (undefined4)uStack0000000000000118;
    uVar19 = *(long *)(lVar43 + 0x18) - 0xc;
    if (0x14 < uVar19) {
      uVar19 = 9;
    }
    uStack0000000000000118._0_4_ = (undefined4)lVar65;
    uVar14 = (undefined4)uStack0000000000000118;
    uStack0000000000000118._4_4_ = (undefined4)((ulong)lVar65 >> 0x20);
    uVar15 = uStack0000000000000118._4_4_;
    uStack0000000000000118._0_4_ = uVar11;
    uStack0000000000000118._4_4_ = uVar13;
    if ((long)uVar19 < 0xb) {
      if ((long)uVar19 < 4) {
        if (2 < uVar19) {
          func_0x005d8b44(&uStack0000000000000100,lVar43 + 0x20);
          plVar47 = _iStack0000000000000108;
          plVar59 = uStack0000000000000100;
          goto code_r0x00540a60;
        }
      }
      else if (4 < uVar19 - 4) {
        if (uVar19 == 9) {
          func_0x005da864(&uStack0000000000000100,lVar43);
          plVar47 = _iStack0000000000000108;
          plVar59 = uStack0000000000000100;
        }
        else {
          func_0x005db050(&uStack0000000000000100,lVar43 + 0x20);
          plVar47 = _iStack0000000000000108;
          plVar59 = uStack0000000000000100;
        }
        goto code_r0x00540a60;
      }
    }
    else {
      if ((long)uVar19 < 0xe) {
        if (uVar19 == 0xb) {
          func_0x005db52c(&uStack0000000000000100,lVar43 + 0x20);
          plVar47 = _iStack0000000000000108;
          plVar59 = uStack0000000000000100;
        }
        else if (uVar19 == 0xc) {
          func_0x005dbd2c(&uStack0000000000000100,lVar43 + 0x20);
          plVar47 = _iStack0000000000000108;
          plVar59 = uStack0000000000000100;
        }
        else {
          func_0x005dc268(&uStack0000000000000100,lVar43 + 0x20);
          plVar47 = _iStack0000000000000108;
          plVar59 = uStack0000000000000100;
        }
      }
      else {
        if (uVar19 - 0xf < 6) goto code_r0x00540ac8;
        func_0x005dc564(&uStack0000000000000100,lVar43 + 0x20);
        plVar47 = _iStack0000000000000108;
        plVar59 = uStack0000000000000100;
      }
code_r0x00540a60:
      _iStack0000000000000108 = plVar47;
      uStack0000000000000100 = plVar59;
      if (_uStack0000000000000110 != (long *)0x0) {
        lVar56 = 0;
        lVar61 = (long)_uStack0000000000000110 * 8;
        plVar18 = plVar47;
        do {
          uStack000000000000010c = (undefined4)((ulong)plVar18 >> 0x20);
          puVar25 = *(undefined8 **)((long)plVar47 + lVar56);
          plVar33 = (long *)*puVar25;
          lVar17 = *plVar33;
          *plVar33 = lVar17 + 1;
          if (lVar17 < 0) {
            _iStack0000000000000108 = plVar18;
            func_0x007a05dc();
            goto code_r0x0054319c;
          }
          uStack0000000000000110 = 1;
          uStack0000000000000114 = 0;
          uStack0000000000000100._0_4_ = uVar10;
          uStack0000000000000100._4_4_ = uVar12;
          iStack0000000000000108 = iVar22;
          uStack0000000000000118._0_4_ = uVar14;
          uStack0000000000000118._4_4_ = uVar15;
          func_0x005627a8(unaff_x29 + -0x80,in_stack_000000f8 + 0x180,*puVar25,
                          &uStack0000000000000100);
          lVar56 = lVar56 + 8;
          plVar18 = _iStack0000000000000108;
        } while (lVar61 != lVar56);
      }
      if (plVar59 != (long *)0x0) {
        func_0x00187bd4(plVar47,(long)plVar59 << 3,8);
      }
    }
code_r0x00540ac8:
    lVar56 = lVar43 + 0x108;
    lVar65 = lVar65 + 1;
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
      plVar59 = uStack0000000000000100;
      break;
    case 0xe:
      func_0x005ceb14(&uStack0000000000000100,lVar43 + 0x20);
      plVar47 = _iStack0000000000000108;
      plVar59 = uStack0000000000000100;
      break;
    case 0xf:
      func_0x005d8a94(&uStack0000000000000100,lVar43 + 0x20);
      plVar47 = _iStack0000000000000108;
      plVar59 = uStack0000000000000100;
      break;
    case 0x10:
      func_0x005cf080(&uStack0000000000000100,lVar43 + 0x20);
      plVar47 = _iStack0000000000000108;
      plVar59 = uStack0000000000000100;
      break;
    case 0x13:
      func_0x005cf918(&uStack0000000000000100,lVar43 + 0x20);
      plVar47 = _iStack0000000000000108;
      plVar59 = uStack0000000000000100;
      break;
    case 0x14:
      func_0x005cf918(&uStack0000000000000100,lVar43 + 0x20);
      plVar47 = _iStack0000000000000108;
      plVar59 = uStack0000000000000100;
      break;
    default:
      func_0x005da664(&uStack0000000000000100,lVar43);
      plVar47 = _iStack0000000000000108;
      plVar59 = uStack0000000000000100;
      break;
    case 0x16:
      func_0x005dae50(&uStack0000000000000100,lVar43 + 0x20);
      plVar47 = _iStack0000000000000108;
      plVar59 = uStack0000000000000100;
      break;
    case 0x17:
      func_0x005db32c(&uStack0000000000000100,lVar43 + 0x20);
      plVar47 = _iStack0000000000000108;
      plVar59 = uStack0000000000000100;
      break;
    case 0x18:
      func_0x005dbc7c(&uStack0000000000000100,lVar43 + 0x20);
      plVar47 = _iStack0000000000000108;
      plVar59 = uStack0000000000000100;
      break;
    case 0x19:
      func_0x005dc110(&uStack0000000000000100,lVar43 + 0x20);
      plVar47 = _iStack0000000000000108;
      plVar59 = uStack0000000000000100;
      break;
    case 0x1a:
      func_0x005dc4ec(&uStack0000000000000100,lVar43 + 0x20);
      plVar47 = _iStack0000000000000108;
      plVar59 = uStack0000000000000100;
      break;
    case 0x1b:
      func_0x005d7560(&uStack0000000000000100,lVar43);
      plVar47 = _iStack0000000000000108;
      plVar59 = uStack0000000000000100;
      break;
    case 0x1f:
      func_0x005cf3e8(&uStack0000000000000100,lVar43 + 0x20);
      plVar47 = _iStack0000000000000108;
      plVar59 = uStack0000000000000100;
    }
    _iStack0000000000000108 = plVar47;
    uStack0000000000000100 = plVar59;
    if (_uStack0000000000000110 == (long *)0x0) goto code_r0x00540e94;
    plVar18 = plVar47 + (long)_uStack0000000000000110;
    plVar33 = plVar47;
code_r0x00540c64:
    plVar27 = plVar33 + 1;
    puVar25 = (undefined8 *)*plVar33;
    plVar33 = (long *)*puVar25;
    lVar43 = *plVar33;
    *plVar33 = lVar43 + 1;
    if (lVar43 < 0) {
      func_0x007a05dc();
      goto code_r0x0054319c;
    }
    lVar43 = 0;
    plVar63 = (long *)*puVar25;
    uStack0000000000000100._0_4_ = (uint)plVar63;
    uStack0000000000000100._4_4_ = (undefined4)((ulong)plVar63 >> 0x20);
    uVar42 = (long)(plVar63 + 1) * 0x517cc1b727220a95;
    plVar33 = *(long **)(in_stack_000000f8 + 0x1a0);
    uVar40 = *(ulong *)(in_stack_000000f8 + 0x1a8);
    bVar37 = (byte)(uVar42 >> 0x38);
    bVar67 = bVar37 >> 1;
    uVar44 = uVar42 & uVar40;
    uVar64 = *(undefined8 *)((long)plVar33 + uVar44);
    uVar19 = CONCAT17(-((byte)((ulong)uVar64 >> 0x38) == bVar67),
                      CONCAT16(-((byte)((ulong)uVar64 >> 0x30) == bVar67),
                               CONCAT15(-((byte)((ulong)uVar64 >> 0x28) == bVar67),
                                        CONCAT14(-((byte)((ulong)uVar64 >> 0x20) == bVar67),
                                                 CONCAT13(-((byte)((ulong)uVar64 >> 0x18) == bVar67)
                                                          ,CONCAT12(-((byte)((ulong)uVar64 >> 0x10)
                                                                     == bVar67),
                                                                    CONCAT11(-((byte)((ulong)uVar64
                                                                                     >> 8) == bVar67
                                                                              ),-((byte)uVar64 ==
                                                                                 bVar67)))))))) &
             0x8080808080808080;
    do {
      if (uVar19 == 0) {
code_r0x00540cf4:
        bVar68 = NEON_umaxv(CONCAT17(-((char)((ulong)uVar64 >> 0x38) == -1),
                                     CONCAT16(-((char)((ulong)uVar64 >> 0x30) == -1),
                                              CONCAT15(-((char)((ulong)uVar64 >> 0x28) == -1),
                                                       CONCAT14(-((char)((ulong)uVar64 >> 0x20) ==
                                                                 -1),CONCAT13(-((char)((ulong)uVar64
                                                                                      >> 0x18) == -1
                                                                               ),CONCAT12(-((char)((
                                                  ulong)uVar64 >> 0x10) == -1),
                                                  CONCAT11(-((char)((ulong)uVar64 >> 8) == -1),
                                                           -((char)uVar64 == -1)))))))),1);
        if ((bVar68 & 1) == 0) goto code_r0x00540d08;
        if (*(long *)(in_stack_000000f8 + 0x1b0) == 0) {
          func_0x007a89dc((long *)(in_stack_000000f8 + 0x1a0),1,in_stack_000000f8 + 0x1c0,1);
          plVar63 = (long *)CONCAT44(uStack0000000000000100._4_4_,(uint)uStack0000000000000100);
          plVar33 = (long *)(in_stack_000000f8 + 0x1a0);
          if (plVar63 == (long *)0x0) goto code_r0x00540de8;
          plVar33 = *(long **)(in_stack_000000f8 + 0x1a0);
          uVar40 = *(ulong *)(in_stack_000000f8 + 0x1a8);
          uVar42 = uVar40 & uVar42;
          lVar43 = *(long *)((long)plVar33 + uVar42);
          uVar19 = CONCAT17(-(lVar43 < 0),
                            CONCAT16(-((char)((ulong)lVar43 >> 0x30) < '\0'),
                                     CONCAT15(-((char)((ulong)lVar43 >> 0x28) < '\0'),
                                              CONCAT14(-((char)((ulong)lVar43 >> 0x20) < '\0'),
                                                       CONCAT13(-((char)((ulong)lVar43 >> 0x18) <
                                                                 '\0'),CONCAT12(-((char)((ulong)
                                                  lVar43 >> 0x10) < '\0'),
                                                  CONCAT11(-((char)((ulong)lVar43 >> 8) < '\0'),
                                                           -((char)lVar43 < '\0'))))))));
        }
        else {
          uVar42 = uVar40 & uVar42;
          lVar43 = *(long *)((long)plVar33 + uVar42);
          uVar19 = CONCAT17(-(lVar43 < 0),
                            CONCAT16(-((char)((ulong)lVar43 >> 0x30) < '\0'),
                                     CONCAT15(-((char)((ulong)lVar43 >> 0x28) < '\0'),
                                              CONCAT14(-((char)((ulong)lVar43 >> 0x20) < '\0'),
                                                       CONCAT13(-((char)((ulong)lVar43 >> 0x18) <
                                                                 '\0'),CONCAT12(-((char)((ulong)
                                                  lVar43 >> 0x10) < '\0'),
                                                  CONCAT11(-((char)((ulong)lVar43 >> 8) < '\0'),
                                                           -((char)lVar43 < '\0'))))))));
        }
        if (uVar19 == 0) {
          lVar43 = 8;
          do {
            uVar42 = uVar42 + lVar43 & uVar40;
            lVar61 = *(long *)((long)plVar33 + uVar42);
            uVar19 = CONCAT17(-(lVar61 < 0),
                              CONCAT16(-((char)((ulong)lVar61 >> 0x30) < '\0'),
                                       CONCAT15(-((char)((ulong)lVar61 >> 0x28) < '\0'),
                                                CONCAT14(-((char)((ulong)lVar61 >> 0x20) < '\0'),
                                                         CONCAT13(-((char)((ulong)lVar61 >> 0x18) <
                                                                   '\0'),CONCAT12(-((char)((ulong)
                                                  lVar61 >> 0x10) < '\0'),
                                                  CONCAT11(-((char)((ulong)lVar61 >> 8) < '\0'),
                                                           -((char)lVar61 < '\0'))))))));
            lVar43 = lVar43 + 8;
          } while (uVar19 == 0);
        }
        uVar19 = (uVar19 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar19 & 0x5555555555555555) << 1;
        uVar19 = (uVar19 & 0xcccccccccccccccc) >> 2 | (uVar19 & 0x3333333333333333) << 2;
        uVar19 = (uVar19 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar19 & 0xf0f0f0f0f0f0f0f) << 4;
        uVar19 = (uVar19 & 0xff00ff00ff00ff00) >> 8 | (uVar19 & 0xff00ff00ff00ff) << 8;
        uVar19 = (uVar19 & 0xffff0000ffff0000) >> 0x10 | (uVar19 & 0xffff0000ffff) << 0x10;
        uVar44 = uVar42 + ((ulong)LZCOUNT(uVar19 >> 0x20 | uVar19 << 0x20) >> 3) & uVar40;
        uVar19 = (ulong)*(char *)((long)plVar33 + uVar44);
        if (-1 < *(char *)((long)plVar33 + uVar44)) {
          lVar43 = *plVar33;
          uVar19 = CONCAT17(-(lVar43 < 0),
                            CONCAT16(-((char)((ulong)lVar43 >> 0x30) < '\0'),
                                     CONCAT15(-((char)((ulong)lVar43 >> 0x28) < '\0'),
                                              CONCAT14(-((char)((ulong)lVar43 >> 0x20) < '\0'),
                                                       CONCAT13(-((char)((ulong)lVar43 >> 0x18) <
                                                                 '\0'),CONCAT12(-((char)((ulong)
                                                  lVar43 >> 0x10) < '\0'),
                                                  CONCAT11(-((char)((ulong)lVar43 >> 8) < '\0'),
                                                           -((char)lVar43 < '\0'))))))));
          uVar19 = (uVar19 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar19 & 0x5555555555555555) << 1;
          uVar19 = (uVar19 & 0xcccccccccccccccc) >> 2 | (uVar19 & 0x3333333333333333) << 2;
          uVar19 = (uVar19 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar19 & 0xf0f0f0f0f0f0f0f) << 4;
          uVar19 = (uVar19 & 0xff00ff00ff00ff00) >> 8 | (uVar19 & 0xff00ff00ff00ff) << 8;
          uVar19 = (uVar19 & 0xffff0000ffff0000) >> 0x10 | (uVar19 & 0xffff0000ffff) << 0x10;
          uVar44 = (ulong)LZCOUNT(uVar19 >> 0x20 | uVar19 << 0x20) >> 3;
          uVar19 = (ulong)*(byte *)((long)plVar33 + uVar44);
        }
        *(byte *)((long)plVar33 + uVar44) = bVar37 >> 1;
        *(byte *)((long)plVar33 + (uVar44 - 8 & uVar40) + 8) = bVar37 >> 1;
        plVar33 = plVar33 + uVar44 * -5;
        *(ulong *)(in_stack_000000f8 + 0x1b0) = *(long *)(in_stack_000000f8 + 0x1b0) - (uVar19 & 1);
        plVar33[-5] = (long)plVar63;
        lVar43 = _UNK_009ec480;
        plVar53 = _UNK_009ec478;
        plVar63 = _UNK_009ec468;
        plVar33[-3] = (long)_UNK_009ec470;
        plVar33[-4] = (long)plVar63;
        plVar33[-1] = lVar43;
        plVar33[-2] = (long)plVar53;
        *(long *)(in_stack_000000f8 + 0x1b8) = *(long *)(in_stack_000000f8 + 0x1b8) + 1;
        goto code_r0x00540de8;
      }
code_r0x00540cc4:
      uVar46 = (uVar19 >> 7 & 0xff00ff00ff00ff00) >> 8 | (uVar19 >> 7 & 0xff00ff00ff00ff) << 8;
      uVar46 = (uVar46 & 0xffff0000ffff0000) >> 0x10 | (uVar46 & 0xffff0000ffff) << 0x10;
      uVar46 = uVar44 + ((ulong)LZCOUNT(uVar46 >> 0x20 | uVar46 << 0x20) >> 3) & uVar40;
      if ((long *)plVar33[uVar46 * -5 + -5] == plVar63) goto code_r0x00540d2c;
      uVar19 = uVar19 - 1 & uVar19;
    } while( true );
  }
  if (in_stack_00000270 != (dword *)0x0) {
    func_0x00187bd4(in_stack_00000278,(long)in_stack_00000270 << 2,4);
  }
  if (in_stack_00000290 != (dword *)0x0) {
    uVar38 = (long)in_stack_00000290 * 4 + 0xbU & 0xfffffffffffffff8;
    lVar24 = (long)in_stack_00000290 + uVar38 + 9;
    if (lVar24 != 0) {
      func_0x00187bd4((long)in_stack_00000288 - uVar38,lVar24,8);
    }
  }
  if ((in_stack_00000218 != (undefined8 *)0x0) &&
     (lVar24 = (long)in_stack_00000218 * 9 + 0x11, lVar24 != 0)) {
    func_0x00187bd4(in_stack_00000210 + (long)in_stack_00000218 * -2 + -2,lVar24,8);
  }
  if ((*(uint *)(*(long *)(in_stack_000000f8 + 0xd8) + 0x78) & 1) == 0) {
    puVar23 = &UNK_009ecd38;
    goto code_r0x00542d04;
  }
  func_0x0058bfd4(&uStack0000000000000100,in_stack_000000f8 + 0x48,
                  *(undefined4 *)(*(long *)(in_stack_000000f8 + 0xd8) + 0x7c));
  in_stack_000000b0 = (long *)&UNK_009ecd50;
  while( true ) {
    auVar74 = func_0x0058c4fc(&uStack0000000000000100,*(long *)(in_stack_000000f8 + 0xd8) + 0x18);
    if ((auVar74._0_8_ & 1) == 0) break;
    lVar24 = *(long *)(in_stack_000000f8 + 0xd8);
    uVar38 = auVar74._8_8_ & 0xffffffff;
    if (uVar38 < *(ulong *)(lVar24 + 0x28)) {
      plVar47 = (long *)(*(long *)(lVar24 + 0x20) + uVar38 * 0x20);
      if (*plVar47 == -0x8000000000000000) {
        uVar19 = 0xffffffffffffffff;
      }
      else {
        uVar19 = (ulong)*(uint *)((long)plVar47 + 0x1c) << 0x20 | 0xffffffff;
      }
    }
    else {
      uVar19 = 0xffffffffffffffff;
    }
    lVar48 = *(long *)(lVar24 + 0x38);
    uVar40 = *(ulong *)(lVar24 + 0x40);
    while (uVar44 = uVar19 & 0xffffffff, uVar44 < uVar40) {
      uVar42 = uVar19 & 0xffffffff;
      uVar19 = uVar19 & 0xffffffff00000000 | (ulong)*(uint *)(lVar48 + uVar44 * 0x30 + 0x20);
      if (uVar40 <= uVar42) goto code_r0x00542fb0;
code_r0x0054103c:
      plVar47 = (long *)(lVar48 + uVar42 * 0x30);
      if (*plVar47 == -0x8000000000000000) goto code_r0x00542fb0;
      if (*(int *)((long)plVar47 + 0x2c) == auVar74._8_4_) {
        func_0x0055ae6c(auStack_7ffffffe + 0x8000024e,plVar47[1],plVar47[1] + plVar47[2] * 0x48,
                        &UNK_009ec388);
        goto code_r0x005410a0;
      }
    }
    uVar19 = uVar19 >> 0x20;
    while (uVar42 = uVar19, uVar42 < uVar40) {
      lVar24 = lVar48 + uVar42 * 0x30;
      uVar19 = (ulong)*(uint *)(lVar24 + 0x24);
      if (*(int *)(lVar24 + 0x28) != -1) goto code_r0x00541030;
    }
    in_stack_00000250 = (dword *)0x0;
    in_stack_00000258 = &MACH_HEADER.cpusubtype;
    in_stack_00000260 = 0;
code_r0x005410a0:
    in_stack_00000278 = in_stack_00000258;
    for (lVar24 = in_stack_00000260 * 8; lVar24 != 0; lVar24 = lVar24 + -8) {
      func_0x00547df0(in_stack_000000f8,*(undefined8 *)in_stack_00000278);
      in_stack_00000278 = in_stack_00000278 + 2;
    }
    func_0x005928cc(auStack_7ffffffe + 0x8000026e);
    if ((*(ulong *)(*(long *)(in_stack_000000f8 + 0xd8) + 0x28) <= uVar38) ||
       (plVar47 = (long *)(*(long *)(*(long *)(in_stack_000000f8 + 0xd8) + 0x20) + uVar38 * 0x20),
       *plVar47 == -0x8000000000000000)) {
code_r0x00542f20:
      func_0x007a23bc(in_stack_000000b0);
      goto code_r0x0054319c;
    }
    uVar19 = plVar47[2];
    in_stack_00000270 = in_stack_00000258;
    in_stack_00000280 = in_stack_00000250;
    if (uVar19 != 0) {
      uVar40 = 0;
      uVar44 = 1;
      puVar25 = in_stack_00000218;
      while( true ) {
        if ((*(ulong *)(*(long *)(in_stack_000000f8 + 0xd8) + 0x28) <= uVar38) ||
           (plVar47 = (long *)(*(long *)(*(long *)(in_stack_000000f8 + 0xd8) + 0x20) + uVar38 * 0x20
                              ), *plVar47 == -0x8000000000000000)) {
          in_stack_000000b0 = (long *)&UNK_009ecd68;
          goto code_r0x00542f20;
        }
        if ((ulong)plVar47[2] <= uVar40) {
          func_0x007a2570(uVar40,plVar47[2],&UNK_009ecd80);
          goto code_r0x0054319c;
        }
        lVar24 = plVar47[1] + uVar40 * 0x108;
        in_stack_00000218 = puVar25;
        if (*(long *)(lVar24 + 0x18) == 0xf) {
          in_stack_00000270 = *(dword **)(lVar24 + 0x28);
          in_stack_00000278 = in_stack_00000270 + *(long *)(lVar24 + 0x30) * 6;
          in_stack_00000280 = (dword *)0x0;
          func_0x0055a048(auStack_7ffffffe + 0x8000020e,auStack_7ffffffe + 0x8000026e,&UNK_009ec388)
          ;
          *(undefined8 **)(unaff_x29 + -0x80) = puVar25;
          *(undefined8 **)(unaff_x29 + -0x78) = puVar25;
          *(dword **)(unaff_x29 + -0x70) = in_stack_00000210;
          *(undefined8 **)(unaff_x29 + -0x68) = puVar25 + (long)in_stack_00000220 * 2;
          if (in_stack_00000220 != (dword *)0x0) {
            do {
              *(undefined8 **)(unaff_x29 + -0x78) = puVar25 + 2;
              plVar47 = (long *)*puVar25;
              plVar59 = (long *)puVar25[1];
              if (plVar59 != (long *)0x0) {
                *(long **)(unaff_x29 + -0xf0) = plVar59;
                lVar24 = *plVar59;
                *plVar59 = lVar24 + 1;
                if (lVar24 < 0) {
                  func_0x007a05dc();
                  goto code_r0x0054319c;
                }
                plVar59 = (long *)func_0x00547df0(in_stack_000000f8,
                                                  *(undefined8 *)(unaff_x29 + -0xf0));
                uVar40 = *(ulong *)*plVar59;
                *(ulong *)*plVar59 = uVar40 + 1;
                if (0xfffffffffffffffe < uVar40) goto code_r0x0054319c;
                lVar24 = *plVar59;
                *(long *)(unaff_x29 + -0xd8) = lVar24;
                if (*(long *)(lVar24 + 0x10) != 0) {
                  func_0x007a2334(&UNK_009ecdc8);
                  goto code_r0x0054319c;
                }
                *(undefined8 *)(lVar24 + 0x10) = 0xffffffffffffffff;
                lVar48 = *plVar47;
                *plVar47 = lVar48 + 1;
                if (lVar48 < 0) {
                  func_0x007a05dc();
                  goto code_r0x0054319c;
                }
                func_0x00563744(lVar24 + 0x18,plVar47);
                *(long *)(lVar24 + 0x10) = *(long *)(lVar24 + 0x10) + 1;
                lVar24 = *plVar47;
                *plVar47 = lVar24 + 1;
                if (lVar24 < 0) {
                  func_0x007a05dc();
                  goto code_r0x0054319c;
                }
                uVar40 = **(ulong **)(unaff_x29 + -0xd8);
                **(ulong **)(unaff_x29 + -0xd8) = uVar40 + 1;
                if (0xfffffffffffffffe < uVar40) goto code_r0x0054319c;
                lVar24 = func_0x00563530(in_stack_000000f8 + 0x100,plVar47,
                                         *(undefined8 *)(unaff_x29 + -0xd8));
                if (lVar24 != 0) {
                  *(long *)(unaff_x29 + -0xc0) = lVar24;
                  uVar66 = _UNK_009ee250;
                  uVar55 = _UNK_009ee248;
                  uVar64 = _UNK_009ee238;
                  if (*(long *)(lVar24 + 0x10) != 0) {
                    func_0x007a2334(&UNK_009ecd98);
                    goto code_r0x0054319c;
                  }
                  in_stack_00000218 = *(undefined8 **)(lVar24 + 0x20);
                  in_stack_00000210 = *(dword **)(lVar24 + 0x18);
                  lVar48 = *(long *)(lVar24 + 0x30);
                  in_stack_00000220 = *(dword **)(lVar24 + 0x28);
                  *(undefined8 *)(lVar24 + 0x20) = _UNK_009ee240;
                  *(undefined8 *)(lVar24 + 0x18) = uVar64;
                  *(undefined8 *)(lVar24 + 0x30) = uVar66;
                  *(undefined8 *)(lVar24 + 0x28) = uVar55;
                  pdVar62 = in_stack_00000210 + 2;
                  if (lVar48 != 0) {
                    lVar24 = *(long *)in_stack_00000210;
                    uVar40 = CONCAT17(-(-1 < lVar24),
                                      CONCAT16(-(-1 < (char)((ulong)lVar24 >> 0x30)),
                                               CONCAT15(-(-1 < (char)((ulong)lVar24 >> 0x28)),
                                                        CONCAT14(-(-1 < (char)((ulong)lVar24 >> 0x20
                                                                              )),
                                                                 CONCAT13(-(-1 < (char)((ulong)
                                                  lVar24 >> 0x18)),
                                                  CONCAT12(-(-1 < (char)((ulong)lVar24 >> 0x10)),
                                                           CONCAT11(-(-1 < (char)((ulong)lVar24 >> 8
                                                                                 )),
                                                                    -(-1 < (char)lVar24)))))))) &
                             0x8080808080808080;
                    pdVar34 = in_stack_00000210;
                    do {
                      while (uVar40 == 0) {
                        lVar24 = *(long *)pdVar62;
                        pdVar34 = pdVar34 + -0x10;
                        pdVar62 = pdVar62 + 2;
                        uVar40 = CONCAT17(-(-1 < lVar24),
                                          CONCAT16(-(-1 < (char)((ulong)lVar24 >> 0x30)),
                                                   CONCAT15(-(-1 < (char)((ulong)lVar24 >> 0x28)),
                                                            CONCAT14(-(-1 < (char)((ulong)lVar24 >>
                                                                                  0x20)),
                                                                     CONCAT13(-(-1 < (char)((ulong)
                                                  lVar24 >> 0x18)),
                                                  CONCAT12(-(-1 < (char)((ulong)lVar24 >> 0x10)),
                                                           CONCAT11(-(-1 < (char)((ulong)lVar24 >> 8
                                                                                 )),
                                                                    -(-1 < (char)lVar24)))))))) &
                                 0x8080808080808080;
                      }
                      uVar42 = (uVar40 >> 7 & 0xff00ff00ff00ff00) >> 8 |
                               (uVar40 >> 7 & 0xff00ff00ff00ff) << 8;
                      uVar42 = (uVar42 & 0xffff0000ffff0000) >> 0x10 |
                               (uVar42 & 0xffff0000ffff) << 0x10;
                      uVar42 = LZCOUNT(uVar42 >> 0x20 | uVar42 << 0x20) & 0x78;
                      plVar59 = *(long **)((long)pdVar34 + (-8 - uVar42));
                      lVar24 = *plVar59;
                      *plVar59 = lVar24 + 1;
                      if (lVar24 < 0) {
                        func_0x007a05dc();
                        goto code_r0x0054319c;
                      }
                      uVar64 = *(undefined8 *)((long)pdVar34 + (-8 - uVar42));
                      uVar42 = **(ulong **)(unaff_x29 + -0xd8);
                      **(ulong **)(unaff_x29 + -0xd8) = uVar42 + 1;
                      if (0xfffffffffffffffe < uVar42) goto code_r0x0054319c;
                      plVar59 = (long *)func_0x00563530(in_stack_000000f8 + 0x100,uVar64,
                                                        *(undefined8 *)(unaff_x29 + -0xd8));
                      if ((plVar59 != (long *)0x0) &&
                         (lVar24 = *plVar59, *plVar59 = lVar24 + -1, lVar24 + -1 == 0)) {
                        func_0x0057e714(auStack_7ffffffe + 0x8000026e);
                      }
                      uVar40 = uVar40 - 1 & uVar40;
                      lVar48 = lVar48 + -1;
                    } while (lVar48 != 0);
                  }
                  lVar24 = *(long *)(unaff_x29 + -0xd8);
                  if (*(long *)(lVar24 + 0x10) != 0) {
                    func_0x007a2334(&UNK_009ecdb0);
                    goto code_r0x0054319c;
                  }
                  *(undefined8 *)(lVar24 + 0x10) = 0xffffffffffffffff;
                  in_stack_00000278 = (dword *)((long)in_stack_00000218 * 9 + 0x11);
                  in_stack_00000280 = in_stack_00000210 + (long)in_stack_00000218 * -2 + -2;
                  in_stack_00000270 =
                       (dword *)((ulong)(in_stack_00000218 != (undefined8 *)0x0) << 3);
                  func_0x00560524(lVar24 + 0x18,auStack_7ffffffe + 0x8000026e);
                  *(long *)(lVar24 + 0x10) = *(long *)(lVar24 + 0x10) + 1;
                  lVar24 = **(long **)(unaff_x29 + -0xc0) + -1;
                  **(long **)(unaff_x29 + -0xc0) = lVar24;
                  if (lVar24 == 0) {
                    func_0x0057e714(unaff_x29 + -0xc0);
                  }
                }
                lVar24 = **(long **)(unaff_x29 + -0xd8) + -1;
                **(long **)(unaff_x29 + -0xd8) = lVar24;
                if (lVar24 == 0) {
                  func_0x0057e714(unaff_x29 + -0xd8);
                }
                lVar24 = **(long **)(unaff_x29 + -0xf0);
                **(long **)(unaff_x29 + -0xf0) = lVar24 + -1;
                LORelease();
                if (lVar24 == 1) {
                  func_0x005d2ac4(unaff_x29 + -0xf0);
                }
              }
              lVar24 = *plVar47;
              *plVar47 = lVar24 + -1;
              LORelease();
              if (lVar24 == 1) {
                func_0x005d2ac4(auStack_7ffffffe + 0x800002b6);
              }
              puVar25 = *(undefined8 **)(unaff_x29 + -0x78);
            } while (puVar25 != *(undefined8 **)(unaff_x29 + -0x68));
          }
          func_0x00592d18(unaff_x29 + -0x80);
        }
        if (uVar19 <= uVar44) break;
        uVar40 = uVar44;
        uVar44 = uVar44 + 1;
        puVar25 = in_stack_00000218;
      }
    }
  }
  func_0x0053cd04(&uStack0000000000000100);
  func_0x00559ad0(&uStack0000000000000100,*(long *)(in_stack_000000f8 + 8),
                  *(long *)(in_stack_000000f8 + 8) + *(long *)(in_stack_000000f8 + 0x10) * 0x18,
                  &UNK_009ec388);
  uStack0000000000000118 = _iStack0000000000000108 + (long)_uStack0000000000000110 * 2;
  bVar2 = _uStack0000000000000110 != (long *)0x0;
  plVar47 = _iStack0000000000000108;
  _uStack0000000000000110 = uStack0000000000000100;
  if (bVar2) {
    while( true ) {
      plVar59 = (long *)_iStack0000000000000108[1];
      *(long *)(unaff_x29 + -0xc0) = *_iStack0000000000000108;
      lVar24 = *plVar59;
      *plVar59 = lVar24 + 1;
      uStack0000000000000100 = plVar47;
      if (lVar24 < 0) {
        _iStack0000000000000108 = _iStack0000000000000108 + 2;
        func_0x007a05dc();
        goto code_r0x0054319c;
      }
      _iStack0000000000000108 = _iStack0000000000000108 + 2;
      plVar47 = (long *)func_0x00544148(in_stack_000000f8,plVar59);
      uVar38 = *(ulong *)*plVar47;
      *(ulong *)*plVar47 = uVar38 + 1;
      if (0xfffffffffffffffe < uVar38) goto code_r0x0054319c;
      lVar24 = *plVar47;
      *(long *)(unaff_x29 + -0x80) = lVar24;
      if (*(long *)(in_stack_000000f8 + 0x198) == 0) break;
      lVar48 = 0;
      plVar47 = *(long **)(unaff_x29 + -0xc0);
      lVar45 = *(long *)(in_stack_000000f8 + 0x180);
      uVar19 = *(ulong *)(in_stack_000000f8 + 0x188);
      bVar37 = (byte)((ulong)((long)(plVar47 + 1) * 0x517cc1b727220a95) >> 0x39);
      uVar40 = (long)(plVar47 + 1) * 0x517cc1b727220a95 & uVar19;
      uVar64 = *(undefined8 *)(lVar45 + uVar40);
      uVar38 = CONCAT17(-((byte)((ulong)uVar64 >> 0x38) == bVar37),
                        CONCAT16(-((byte)((ulong)uVar64 >> 0x30) == bVar37),
                                 CONCAT15(-((byte)((ulong)uVar64 >> 0x28) == bVar37),
                                          CONCAT14(-((byte)((ulong)uVar64 >> 0x20) == bVar37),
                                                   CONCAT13(-((byte)((ulong)uVar64 >> 0x18) ==
                                                             bVar37),CONCAT12(-((byte)((ulong)uVar64
                                                                                      >> 0x10) ==
                                                                               bVar37),CONCAT11(-((
                                                  byte)((ulong)uVar64 >> 8) == bVar37),
                                                  -((byte)uVar64 == bVar37)))))))) &
               0x8080808080808080;
      while( true ) {
        while (uVar38 == 0) {
          bVar67 = NEON_umaxv(CONCAT17(-((char)((ulong)uVar64 >> 0x38) == -1),
                                       CONCAT16(-((char)((ulong)uVar64 >> 0x30) == -1),
                                                CONCAT15(-((char)((ulong)uVar64 >> 0x28) == -1),
                                                         CONCAT14(-((char)((ulong)uVar64 >> 0x20) ==
                                                                   -1),CONCAT13(-((char)((ulong)
                                                  uVar64 >> 0x18) == -1),
                                                  CONCAT12(-((char)((ulong)uVar64 >> 0x10) == -1),
                                                           CONCAT11(-((char)((ulong)uVar64 >> 8) ==
                                                                     -1),-((char)uVar64 == -1)))))))
                                      ),1);
          if ((bVar67 & 1) != 0) goto code_r0x005416f4;
          lVar48 = lVar48 + 8;
          uVar40 = uVar40 + lVar48 & uVar19;
          uVar64 = *(undefined8 *)(lVar45 + uVar40);
          uVar38 = CONCAT17(-((byte)((ulong)uVar64 >> 0x38) == bVar37),
                            CONCAT16(-((byte)((ulong)uVar64 >> 0x30) == bVar37),
                                     CONCAT15(-((byte)((ulong)uVar64 >> 0x28) == bVar37),
                                              CONCAT14(-((byte)((ulong)uVar64 >> 0x20) == bVar37),
                                                       CONCAT13(-((byte)((ulong)uVar64 >> 0x18) ==
                                                                 bVar37),CONCAT12(-((byte)((ulong)
                                                  uVar64 >> 0x10) == bVar37),
                                                  CONCAT11(-((byte)((ulong)uVar64 >> 8) == bVar37),
                                                           -((byte)uVar64 == bVar37)))))))) &
                   0x8080808080808080;
        }
        uVar44 = (uVar38 >> 7 & 0xff00ff00ff00ff00) >> 8 | (uVar38 >> 7 & 0xff00ff00ff00ff) << 8;
        uVar44 = (uVar44 & 0xffff0000ffff0000) >> 0x10 | (uVar44 & 0xffff0000ffff) << 0x10;
        uVar44 = uVar40 + ((ulong)LZCOUNT(uVar44 >> 0x20 | uVar44 << 0x20) >> 3) & uVar19;
        if (plVar47 == *(long **)(lVar45 + -0x28 + uVar44 * -0x28)) break;
        uVar38 = uVar38 - 1 & uVar38;
      }
      if (*(long *)(lVar24 + 0x10) != 0) {
        func_0x007a2334(&UNK_009ec4b8);
        goto code_r0x0054319c;
      }
      lVar45 = lVar45 + uVar44 * -0x28;
      in_stack_00000280 = *(dword **)(lVar45 + -8);
      in_stack_00000278 = *(dword **)(lVar45 + -0x10);
      *(undefined8 *)(lVar24 + 0x10) = 0xffffffffffffffff;
      lVar48 = *plVar47;
      *plVar47 = lVar48 + 1;
      if (lVar48 < 0) {
        func_0x007a05dc();
        goto code_r0x0054319c;
      }
      plVar47 = (long *)func_0x00582704(lVar24 + 0x18,auStack_7ffffffe + 0x8000026e,
                                        *(undefined8 *)(unaff_x29 + -0xc0));
      if (plVar47 != (long *)0x0) {
        lVar48 = *plVar47;
        *plVar47 = lVar48 + -1;
        LORelease();
        if (lVar48 == 1) {
          func_0x005d2ac4(auStack_7ffffffe + 0x8000020e);
        }
      }
      *(long *)(lVar24 + 0x10) = *(long *)(lVar24 + 0x10) + 1;
      lVar24 = **(long **)(unaff_x29 + -0xc0);
      **(long **)(unaff_x29 + -0xc0) = lVar24 + 1;
      if (lVar24 < 0) {
        func_0x007a05dc();
        goto code_r0x0054319c;
      }
      in_stack_00000270 =
           (dword *)func_0x00562594(in_stack_000000f8 + 0x120,*(undefined8 *)(unaff_x29 + -0xc0),
                                    *(undefined8 *)(unaff_x29 + -0x80));
      if ((in_stack_00000270 != (dword *)0x0) &&
         (lVar24 = *(long *)in_stack_00000270, *(long *)in_stack_00000270 = lVar24 + -1,
         lVar24 + -1 == 0)) {
        func_0x0057e6ac(auStack_7ffffffe + 0x8000026e);
      }
      lVar24 = *plVar59;
      *plVar59 = lVar24 + -1;
      LORelease();
      if (lVar24 == 1) {
        func_0x005d2ac4(auStack_7ffffffe + 0x8000024e);
      }
      lVar24 = **(long **)(unaff_x29 + -0xc0);
      **(long **)(unaff_x29 + -0xc0) = lVar24 + -1;
      LORelease();
      plVar47 = uStack0000000000000100;
      if (lVar24 == 1) {
        func_0x005d2ac4(unaff_x29 + -0xc0);
        plVar47 = uStack0000000000000100;
      }
      if (_iStack0000000000000108 == uStack0000000000000118) goto code_r0x00541728;
    }
code_r0x005416f4:
    func_0x007a23d8(&UNK_008aad91,0x16,&UNK_009ec4a0);
    goto code_r0x0054319c;
  }
code_r0x00541728:
  uStack0000000000000100 = plVar47;
  func_0x005927a0(&uStack0000000000000100);
  lVar24 = *(long *)(*(long *)(in_stack_000000f8 + 0xd8) + 0x20);
  _iStack0000000000000108 =
       (long *)(lVar24 + *(long *)(*(long *)(in_stack_000000f8 + 0xd8) + 0x28) * 0x20);
  uStack0000000000000100._0_4_ = (uint)lVar24;
  uStack0000000000000100._4_4_ = (undefined4)((ulong)lVar24 >> 0x20);
  uStack0000000000000110 = 0;
  uStack0000000000000114 = 0;
  func_0x00559d3c(auStack_7ffffffe + 0x8000026e,&uStack0000000000000100,&UNK_009ec388);
  pdVar34 = in_stack_00000270;
  pdVar62 = in_stack_00000278;
  if (in_stack_00000280 != (dword *)0x0) {
    pdVar21 = in_stack_00000278 + (long)in_stack_00000280;
    pdVar31 = in_stack_00000278;
    pdVar75 = in_stack_00000270;
    pdVar76 = in_stack_00000278;
    do {
      pdVar52 = pdVar31 + 1;
      uVar3 = *pdVar31;
      lVar24 = *(long *)(in_stack_000000f8 + 0xd8);
      if (((ulong)uVar3 < *(ulong *)(lVar24 + 0x28)) &&
         (plVar47 = (long *)(*(long *)(lVar24 + 0x20) + (ulong)uVar3 * 0x20),
         *plVar47 != -0x8000000000000000)) {
        lVar48 = plVar47[3];
      }
      else {
        lVar48 = -1;
      }
      uStack0000000000000100._0_4_ = 1;
      uStack0000000000000100._4_4_ = 0;
      iStack0000000000000108 = (int)*(undefined8 *)(lVar24 + 0x38);
      uStack000000000000010c = (undefined4)((ulong)*(undefined8 *)(lVar24 + 0x38) >> 0x20);
      uStack0000000000000110 = (undefined4)*(undefined8 *)(lVar24 + 0x40);
      uStack0000000000000114 = (undefined4)((ulong)*(undefined8 *)(lVar24 + 0x40) >> 0x20);
      uStack0000000000000118._0_4_ = (undefined4)lVar48;
      uStack0000000000000118._4_4_ = (undefined4)((ulong)lVar48 >> 0x20);
      in_stack_00000120 = (dword *)CONCAT44(in_stack_00000120._4_4_,uVar3);
      func_0x0055915c(auStack_7ffffffe + 0x8000026e,&uStack0000000000000100,&UNK_009ec388);
      pdVar34 = pdVar75;
      pdVar62 = pdVar76;
      if (in_stack_00000280 != (dword *)0x0) {
        pdVar31 = pdVar76 + (long)in_stack_00000280;
        pdVar26 = pdVar76;
        while( true ) {
          pdVar57 = pdVar26 + 1;
          if (*(ulong *)(*(long *)(in_stack_000000f8 + 0xd8) + 0x40) <= (ulong)*pdVar26) break;
          puVar25 = (undefined8 *)
                    (*(long *)(*(long *)(in_stack_000000f8 + 0xd8) + 0x38) + (ulong)*pdVar26 * 0x30)
          ;
          in_stack_00000280 = (dword *)*puVar25;
          if (in_stack_00000280 == (dword *)0x8000000000000000) break;
          pdVar34 = (dword *)puVar25[1];
          lVar24 = puVar25[2];
          *puVar25 = 0;
          puVar25[1] = 8;
          puVar25[2] = 0;
          pdVar26 = pdVar34;
          pdVar62 = pdVar34;
          if (lVar24 != 0) {
            while( true ) {
              pdVar62 = pdVar26 + 0x12;
              lVar48 = *(long *)(pdVar26 + 2);
              if (lVar48 == 0xc) break;
              plVar47 = *(long **)(pdVar26 + 4);
              *(undefined8 *)(unaff_x29 + -0xc0) = *(undefined8 *)pdVar26;
              if (lVar48 != 0) {
                uStack0000000000000128 = *(dword **)(pdVar26 + 0xc);
                in_stack_00000120 = *(dword **)(pdVar26 + 10);
                in_stack_00000138 = *(long **)(pdVar26 + 0x10);
                in_stack_00000130 = *(dword **)(pdVar26 + 0xe);
                uStack0000000000000118._0_4_ = (undefined4)*(undefined8 *)(pdVar26 + 8);
                uStack0000000000000118._4_4_ =
                     (undefined4)((ulong)*(undefined8 *)(pdVar26 + 8) >> 0x20);
                uStack0000000000000110 = (undefined4)*(undefined8 *)(pdVar26 + 6);
                uStack0000000000000114 = (undefined4)((ulong)*(undefined8 *)(pdVar26 + 6) >> 0x20);
                uStack0000000000000100._0_4_ = (uint)lVar48;
                uStack0000000000000100._4_4_ = (undefined4)((ulong)lVar48 >> 0x20);
                iStack0000000000000108 = (int)plVar47;
                uStack000000000000010c = (undefined4)((ulong)plVar47 >> 0x20);
                func_0x007a2810(&UNK_008aabcc,0x2b,&uStack0000000000000100,&UNK_009ec3a0,
                                &UNK_009ec818);
                goto code_r0x0054319c;
              }
              plVar59 = (long *)func_0x00544148(in_stack_000000f8);
              uVar38 = *(ulong *)*plVar59;
              *(ulong *)*plVar59 = uVar38 + 1;
              if (0xfffffffffffffffe < uVar38) goto code_r0x0054319c;
              lVar48 = *plVar59;
              *(long *)(unaff_x29 + -0x80) = lVar48;
              if (*(long *)(in_stack_000000f8 + 0x198) == 0) {
code_r0x00541b68:
                func_0x007a23d8(&UNK_008aad91,0x16,&UNK_009ec830);
                goto code_r0x0054319c;
              }
              lVar45 = 0;
              lVar35 = *(long *)(in_stack_000000f8 + 0x180);
              uVar19 = *(ulong *)(in_stack_000000f8 + 0x188);
              bVar37 = (byte)((ulong)((long)(plVar47 + 1) * 0x517cc1b727220a95) >> 0x39);
              uVar40 = (long)(plVar47 + 1) * 0x517cc1b727220a95 & uVar19;
              uVar64 = *(undefined8 *)(lVar35 + uVar40);
              uVar38 = CONCAT17(-((byte)((ulong)uVar64 >> 0x38) == bVar37),
                                CONCAT16(-((byte)((ulong)uVar64 >> 0x30) == bVar37),
                                         CONCAT15(-((byte)((ulong)uVar64 >> 0x28) == bVar37),
                                                  CONCAT14(-((byte)((ulong)uVar64 >> 0x20) == bVar37
                                                            ),CONCAT13(-((byte)((ulong)uVar64 >>
                                                                               0x18) == bVar37),
                                                                       CONCAT12(-((byte)((ulong)
                                                  uVar64 >> 0x10) == bVar37),
                                                  CONCAT11(-((byte)((ulong)uVar64 >> 8) == bVar37),
                                                           -((byte)uVar64 == bVar37)))))))) &
                       0x8080808080808080;
              while( true ) {
                while (uVar38 == 0) {
                  bVar67 = NEON_umaxv(CONCAT17(-((char)((ulong)uVar64 >> 0x38) == -1),
                                               CONCAT16(-((char)((ulong)uVar64 >> 0x30) == -1),
                                                        CONCAT15(-((char)((ulong)uVar64 >> 0x28) ==
                                                                  -1),CONCAT14(-((char)((ulong)
                                                  uVar64 >> 0x20) == -1),
                                                  CONCAT13(-((char)((ulong)uVar64 >> 0x18) == -1),
                                                           CONCAT12(-((char)((ulong)uVar64 >> 0x10)
                                                                     == -1),CONCAT11(-((char)((ulong
                                                  )uVar64 >> 8) == -1),-((char)uVar64 == -1)))))))),
                                      1);
                  if ((bVar67 & 1) != 0) goto code_r0x00541b68;
                  lVar45 = lVar45 + 8;
                  uVar40 = uVar40 + lVar45 & uVar19;
                  uVar64 = *(undefined8 *)(lVar35 + uVar40);
                  uVar38 = CONCAT17(-((byte)((ulong)uVar64 >> 0x38) == bVar37),
                                    CONCAT16(-((byte)((ulong)uVar64 >> 0x30) == bVar37),
                                             CONCAT15(-((byte)((ulong)uVar64 >> 0x28) == bVar37),
                                                      CONCAT14(-((byte)((ulong)uVar64 >> 0x20) ==
                                                                bVar37),CONCAT13(-((byte)((ulong)
                                                  uVar64 >> 0x18) == bVar37),
                                                  CONCAT12(-((byte)((ulong)uVar64 >> 0x10) == bVar37
                                                            ),CONCAT11(-((byte)((ulong)uVar64 >> 8)
                                                                        == bVar37),
                                                                       -((byte)uVar64 == bVar37)))))
                                                  ))) & 0x8080808080808080;
                }
                uVar44 = (uVar38 >> 7 & 0xff00ff00ff00ff00) >> 8 |
                         (uVar38 >> 7 & 0xff00ff00ff00ff) << 8;
                uVar44 = (uVar44 & 0xffff0000ffff0000) >> 0x10 | (uVar44 & 0xffff0000ffff) << 0x10;
                uVar44 = uVar40 + ((ulong)LZCOUNT(uVar44 >> 0x20 | uVar44 << 0x20) >> 3) & uVar19;
                if (plVar47 == *(long **)(lVar35 + -0x28 + uVar44 * -0x28)) break;
                uVar38 = uVar38 - 1 & uVar38;
              }
              if (*(long *)(lVar48 + 0x10) != 0) {
                func_0x007a2334(&UNK_009ec848);
                goto code_r0x0054319c;
              }
              lVar35 = lVar35 + uVar44 * -0x28;
              uVar64 = *(undefined8 *)(lVar35 + -0x20);
              uVar66 = *(undefined8 *)(lVar35 + -8);
              uVar55 = *(undefined8 *)(lVar35 + -0x10);
              *(undefined8 *)(lVar48 + 0x10) = 0xffffffffffffffff;
              uStack0000000000000100._0_4_ = (uint)uVar64;
              uStack0000000000000100._4_4_ = (undefined4)((ulong)uVar64 >> 0x20);
              uStack0000000000000110 = (undefined4)uVar66;
              uStack0000000000000114 = (undefined4)((ulong)uVar66 >> 0x20);
              iStack0000000000000108 = (int)uVar55;
              uStack000000000000010c = (undefined4)((ulong)uVar55 >> 0x20);
              lVar45 = *plVar47;
              *plVar47 = lVar45 + 1;
              if (lVar45 < 0) {
                func_0x007a05dc();
                goto code_r0x0054319c;
              }
              plVar59 = (long *)func_0x00582704(lVar48 + 0x18,&uStack0000000000000100,plVar47);
              if (plVar59 != (long *)0x0) {
                lVar45 = *plVar59;
                *plVar59 = lVar45 + -1;
                LORelease();
                if (lVar45 == 1) {
                  func_0x005d2ac4(auStack_7ffffffe + 0x8000020e);
                }
              }
              *(long *)(lVar48 + 0x10) = *(long *)(lVar48 + 0x10) + 1;
              plVar47 = (long *)func_0x00562594(in_stack_000000f8 + 0x120,plVar47,
                                                *(undefined8 *)(unaff_x29 + -0x80));
              uStack0000000000000100._0_4_ = (uint)plVar47;
              uStack0000000000000100._4_4_ = (undefined4)((ulong)plVar47 >> 0x20);
              if ((plVar47 != (long *)0x0) &&
                 (lVar48 = *plVar47, *plVar47 = lVar48 + -1, lVar48 + -1 == 0)) {
                func_0x0057e6ac(&uStack0000000000000100);
              }
              pdVar26 = pdVar62;
              if (pdVar62 == pdVar34 + lVar24 * 0x12) break;
            }
          }
          func_0x00592bf8(auStack_7ffffffe + 0x8000026e);
          pdVar26 = pdVar57;
          if (pdVar57 == pdVar31) goto code_r0x00541a34;
        }
        func_0x007a23bc(&UNK_009ec800);
        goto code_r0x0054319c;
      }
code_r0x00541a34:
      if (pdVar75 != (dword *)0x0) {
        func_0x00187bd4(pdVar76,(long)pdVar75 << 2,4);
      }
      pdVar31 = pdVar52;
      pdVar75 = pdVar34;
      pdVar76 = pdVar62;
    } while (pdVar52 != pdVar21);
  }
  if (in_stack_00000270 != (dword *)0x0) {
    func_0x00187bd4(in_stack_00000278,(long)in_stack_00000270 << 2,4);
  }
  if (*(int *)(*(long *)(in_stack_000000f8 + 0xd8) + 0x78) != 1) {
    puVar23 = &UNK_009ec9b0;
    goto code_r0x00542d04;
  }
  func_0x0058bce0(auStack_7ffffffe + 0x8000026e,in_stack_000000f8 + 0x48,
                  *(undefined4 *)(*(long *)(in_stack_000000f8 + 0xd8) + 0x7c));
code_r0x00541b04:
  auVar74 = func_0x0058be04(auStack_7ffffffe + 0x8000026e,*(long *)(in_stack_000000f8 + 0xd8) + 0x18
                           );
  if ((auVar74._0_8_ & 1) != 0) {
    if (*(long *)(in_stack_000000f8 + 0x218) != 0) {
      lVar24 = 0;
      uVar38 = (auVar74._8_8_ & 0xffffffff) * 0x517cc1b727220a95;
      bVar37 = (byte)(uVar38 >> 0x39);
      while( true ) {
        uVar38 = uVar38 & *(ulong *)(in_stack_000000f8 + 0x208);
        uVar64 = *(undefined8 *)(*(long *)(in_stack_000000f8 + 0x200) + uVar38);
        bVar67 = (byte)((ulong)uVar64 >> 8);
        bVar68 = (byte)((ulong)uVar64 >> 0x10);
        bVar69 = (byte)((ulong)uVar64 >> 0x18);
        bVar70 = (byte)((ulong)uVar64 >> 0x20);
        bVar71 = (byte)((ulong)uVar64 >> 0x28);
        bVar72 = (byte)((ulong)uVar64 >> 0x30);
        bVar73 = (byte)((ulong)uVar64 >> 0x38);
        for (uVar19 = CONCAT17(-(bVar73 == bVar37),
                               CONCAT16(-(bVar72 == bVar37),
                                        CONCAT15(-(bVar71 == bVar37),
                                                 CONCAT14(-(bVar70 == bVar37),
                                                          CONCAT13(-(bVar69 == bVar37),
                                                                   CONCAT12(-(bVar68 == bVar37),
                                                                            CONCAT11(-(bVar67 ==
                                                                                      bVar37),-((
                                                  byte)uVar64 == bVar37)))))))) & 0x8080808080808080
            ; uVar19 != 0; uVar19 = uVar19 - 1 & uVar19) {
          uVar40 = (uVar19 >> 7 & 0xff00ff00ff00ff00) >> 8 | (uVar19 >> 7 & 0xff00ff00ff00ff) << 8;
          uVar40 = (uVar40 & 0xffff0000ffff0000) >> 0x10 | (uVar40 & 0xffff0000ffff) << 0x10;
          if (auVar74._8_4_ ==
              *(int *)(*(long *)(in_stack_000000f8 + 0x200) + -4 +
                      (uVar38 + ((ulong)LZCOUNT(uVar40 >> 0x20 | uVar40 << 0x20) >> 3) &
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
                                                                         CONCAT12(-(bVar68 == 0xff),
                                                                                  CONCAT11(-(bVar67 
                                                  == 0xff),-((byte)uVar64 == 0xff)))))))),1);
        if ((bVar67 & 1) != 0) break;
        lVar24 = lVar24 + 8;
        uVar38 = uVar38 + lVar24;
      }
    }
    goto code_r0x00541b04;
  }
  if ((*(uint *)(*(long *)(in_stack_000000f8 + 0xd8) + 0x78) & 1) == 0) {
    func_0x007a23bc(&UNK_009ec9c8);
    goto code_r0x0054319c;
  }
  func_0x0058bce0(&uStack0000000000000100,in_stack_000000f8 + 0x48,
                  *(undefined4 *)(*(long *)(in_stack_000000f8 + 0xd8) + 0x7c));
  while( true ) {
    uVar38 = func_0x0058be04(&uStack0000000000000100,*(long *)(in_stack_000000f8 + 0xd8) + 0x18);
    if ((uVar38 & 1) == 0) break;
    func_0x005444ec(in_stack_000000f8);
  }
  if (CONCAT44(uStack0000000000000100._4_4_,(uint)uStack0000000000000100) != 0) {
    func_0x00187bd4(_iStack0000000000000108,
                    CONCAT44(uStack0000000000000100._4_4_,(uint)uStack0000000000000100) << 2,4);
  }
  func_0x004d0c00(&uStack0000000000000118);
  if (pdVar34 != (dword *)0x0) {
    func_0x00187bd4(pdVar62,(long)pdVar34 << 2,4);
  }
  func_0x004d0c00(auStack_7ffffffe + 0x80000286);
  lVar48 = _UNK_009ec480;
  plVar33 = _UNK_009ec478;
  puVar49 = _UNK_009ec470;
  plVar18 = _UNK_009ec468;
  uVar64 = *(undefined8 *)(in_stack_000000f8 + 0xd8);
  plVar59 = *(long **)(in_stack_000000f8 + 0x120);
  lVar24 = (long)plVar59 + *(long *)(in_stack_000000f8 + 0x128) + 1;
  lVar45 = *plVar59;
  plVar47 = plVar59 + 1;
  puVar36 = (uint *)(CONCAT17(-(-1 < lVar45),
                              CONCAT16(-(-1 < (char)((ulong)lVar45 >> 0x30)),
                                       CONCAT15(-(-1 < (char)((ulong)lVar45 >> 0x28)),
                                                CONCAT14(-(-1 < (char)((ulong)lVar45 >> 0x20)),
                                                         CONCAT13(-(-1 < (char)((ulong)lVar45 >>
                                                                               0x18)),
                                                                  CONCAT12(-(-1 < (char)((ulong)
                                                  lVar45 >> 0x10)),
                                                  CONCAT11(-(-1 < (char)((ulong)lVar45 >> 8)),
                                                           -(-1 < (char)lVar45)))))))) &
                    0x8080808080808080);
  pdVar62 = *(dword **)(in_stack_000000f8 + 0x138);
  while( true ) {
    auVar74 = func_0x0049dcc0(auStack_7ffffffe + 0x8000026e);
    puVar25 = auVar74._0_8_;
    if (puVar25 == (undefined8 *)0x0) break;
    lVar45 = *auVar74._8_8_;
    if (0x7ffffffffffffffe < *(ulong *)(lVar45 + 0x10)) {
      func_0x007a2378(&UNK_009ec710);
      goto code_r0x0054319c;
    }
    *(ulong *)(lVar45 + 0x10) = *(ulong *)(lVar45 + 0x10) + 1;
    pdVar34 = *(dword **)(lVar45 + 0x18);
    if (pdVar34 == (dword *)0x0) {
      in_stack_00000140 = (dword *)0x0;
    }
    else {
      in_stack_00000138 = *(long **)(lVar45 + 0x20);
      in_stack_00000140 = *(dword **)(lVar45 + 0x28);
      _iStack0000000000000108 = (long *)0x0;
      uStack0000000000000110 = SUB84(pdVar34,0);
      uStack0000000000000114 = (undefined4)((ulong)pdVar34 >> 0x20);
      uStack0000000000000128 = (dword *)0x0;
      in_stack_00000130 = pdVar34;
      uStack0000000000000118 = in_stack_00000138;
    }
    bVar2 = pdVar34 != (dword *)0x0;
    in_stack_00000120 = (dword *)(ulong)bVar2;
    uStack0000000000000100._0_4_ = (uint)bVar2;
    uStack0000000000000100._4_4_ = 0;
    auVar74 = func_0x0058027c(&uStack0000000000000100);
    puVar58 = auVar74._8_8_;
    if (auVar74._0_8_ == 0) {
      func_0x007a23bc(&UNK_009ec728);
      goto code_r0x0054319c;
    }
    plVar27 = (long *)*puVar25;
    if (plVar27 != (long *)*puVar58) {
      lVar35 = *plVar27;
      *plVar27 = lVar35 + 1;
      if (lVar35 < 0) {
        func_0x007a05dc();
        goto code_r0x0054319c;
      }
      uVar55 = *puVar25;
      uStack0000000000000100._0_4_ = (uint)uVar55;
      uStack0000000000000100._4_4_ = (undefined4)((ulong)uVar55 >> 0x20);
      lVar35 = *(long *)*puVar58;
      *(long *)*puVar58 = lVar35 + 1;
      if (lVar35 < 0) {
        func_0x007a05dc();
        goto code_r0x0054319c;
      }
      plVar27 = (long *)func_0x0056237c(auStack_7ffffffe + 0x8000020e,uVar55,*puVar58);
      *(long **)(unaff_x29 + -0x80) = plVar27;
      if (plVar27 != (long *)0x0) {
        lVar35 = *plVar27;
        *plVar27 = lVar35 + -1;
        LORelease();
        if (lVar35 == 1) {
          func_0x005d2ac4(unaff_x29 + -0x80);
        }
      }
    }
    *(long *)(lVar45 + 0x10) = *(long *)(lVar45 + 0x10) + -1;
  }
  iStack0000000000000108 = (int)puVar49;
  uStack000000000000010c = (undefined4)((ulong)puVar49 >> 0x20);
  uStack0000000000000100._0_4_ = (uint)plVar18;
  uStack0000000000000100._4_4_ = (undefined4)((ulong)plVar18 >> 0x20);
  uStack0000000000000118._0_4_ = (undefined4)lVar48;
  uStack0000000000000118._4_4_ = (undefined4)((ulong)lVar48 >> 0x20);
  uStack0000000000000110 = SUB84(plVar33,0);
  uStack0000000000000114 = (undefined4)((ulong)plVar33 >> 0x20);
  func_0x0054ade4(uVar64,&uStack0000000000000100);
  lVar35 = *(long *)(in_stack_000000f8 + 0xd8);
  lVar45 = *(long *)(lVar35 + 0x20);
  _iStack0000000000000108 = (long *)(lVar45 + *(long *)(lVar35 + 0x28) * 0x20);
  uStack0000000000000100._0_4_ = (uint)lVar45;
  uStack0000000000000100._4_4_ = (undefined4)((ulong)lVar45 >> 0x20);
  uStack0000000000000110 = 0;
  uStack0000000000000114 = 0;
  func_0x00559d3c(auStack_7ffffffe + 0x8000026e,&uStack0000000000000100,&UNK_009ec388);
  if (plVar47 == (long *)0x0) goto code_r0x00542c90;
  puVar1 = puVar36 + (long)plVar47;
  in_stack_00000050 = (dword *)&UNK_009ec4d0;
  in_stack_00000040 = &UNK_009ec680;
  puStack0000000000000060 = &UNK_009ec638;
  puVar28 = puVar36;
  plVar27 = plVar59;
  puVar77 = puVar36;
  do {
    puVar29 = puVar28 + 1;
    uVar19 = (ulong)*puVar28;
    pdVar34 = &MACH_HEADER.cpusubtype;
    lVar45 = 0;
    uVar38 = *(ulong *)(lVar35 + 0x28);
    if ((uVar38 <= uVar19) ||
       (plVar63 = (long *)(*(long *)(lVar35 + 0x20) + uVar19 * 0x20),
       *plVar63 == -0x8000000000000000)) {
code_r0x00543020:
      func_0x007a23bc(in_stack_00000050);
      goto code_r0x0054319c;
    }
    if (plVar63[2] != 0) {
      lVar43 = 0;
      lVar65 = plVar63[1];
      lVar51 = lVar65 + plVar63[2] * 0x108;
      do {
        uVar12 = uStack0000000000000100._4_4_;
        uVar10 = (uint)uStack0000000000000100;
        uStack0000000000000100._0_4_ = uVar10;
        uStack0000000000000100._4_4_ = uVar12;
        if (*(long *)(lVar65 + 0x18) == 0xf) {
          if ((*(byte *)(lVar65 + 0x51) & 1) != 0) {
            uVar38 = *(ulong *)(lVar65 + 0x30);
            uStack0000000000000100._0_4_ = (uint)lVar43;
            uVar11 = (uint)uStack0000000000000100;
            uStack0000000000000100._4_4_ = (undefined4)((ulong)lVar43 >> 0x20);
            uVar13 = uStack0000000000000100._4_4_;
            if (uVar38 != 1) {
              *(undefined8 *)(unaff_x29 + -0xf0) = 0;
              *(undefined8 *)(unaff_x29 + -0xe8) = 8;
              *(undefined8 *)(unaff_x29 + -0xe0) = 0;
              *(undefined8 *)(unaff_x29 + -0xd8) = 0;
              *(undefined8 *)(unaff_x29 + -0xd0) = 8;
              *(undefined8 *)(unaff_x29 + -200) = 0;
              *(undefined8 *)(unaff_x29 + -0xc0) = 0;
              *(undefined8 *)(unaff_x29 + -0xb8) = 8;
              *(undefined8 *)(unaff_x29 + -0xb0) = 0;
              uStack0000000000000100._0_4_ = uVar10;
              uStack0000000000000100._4_4_ = uVar12;
              if (uVar38 == 0) goto code_r0x005422e8;
              lVar56 = 0;
              lVar24 = 0;
              uVar40 = 0;
              do {
                uVar44 = *(ulong *)(lVar65 + 0x30);
                if (uVar44 <= uVar40) goto code_r0x00543108;
                plVar47 = (long *)(*(long *)(lVar65 + 0x28) + lVar56);
                if (*plVar47 != -0x8000000000000000) {
                  puStack0000000000000060 = &UNK_009ec698;
code_r0x00542e20:
                  func_0x007a23bc(puStack0000000000000060);
                  goto code_r0x0054319c;
                }
                uVar44 = *(ulong *)(lVar65 + 0x48);
                if (uVar44 <= uVar40) {
                  in_stack_00000040 = &UNK_009ec6b0;
                  goto code_r0x00543108;
                }
                plVar27 = (long *)(*(long *)(lVar65 + 0x40) + lVar24);
                if (*plVar27 == 0) {
                  lVar61 = *(long *)plVar27[1];
                  *(long *)plVar27[1] = lVar61 + 1;
                  if (-1 < lVar61) {
                    plVar63 = (long *)plVar27[1];
                    uStack0000000000000100._0_4_ = (uint)plVar63;
                    uStack0000000000000100._4_4_ = (undefined4)((ulong)plVar63 >> 0x20);
                    lVar61 = *plVar63;
                    *plVar63 = lVar61 + 1;
                    if (lVar61 < 0) {
                      func_0x007a05dc();
                      goto code_r0x0054319c;
                    }
                    plVar63 = (long *)func_0x0056237c(auStack_7ffffffe + 0x8000020e,plVar63,
                                                      plVar27[1]);
                    *(long **)(unaff_x29 + -0x80) = plVar63;
                    if (plVar63 != (long *)0x0) {
                      lVar61 = *plVar63;
                      *plVar63 = lVar61 + -1;
                      LORelease();
                      if (lVar61 == 1) {
                        func_0x005d2ac4(unaff_x29 + -0x80);
                      }
                    }
                    lVar61 = *(long *)plVar47[1];
                    *(long *)plVar47[1] = lVar61 + 1;
                    if (-1 < lVar61) {
                      lVar17 = plVar47[1];
                      uStack0000000000000100._0_4_ = (uint)lVar17;
                      uStack0000000000000100._4_4_ = (undefined4)((ulong)lVar17 >> 0x20);
                      lVar61 = *(long *)plVar27[1];
                      *(long *)plVar27[1] = lVar61 + 1;
                      if (lVar61 < 0) {
                        func_0x007a05dc();
                        goto code_r0x0054319c;
                      }
                      plVar27 = (long *)func_0x0056237c(auStack_7ffffffe + 0x8000026e,lVar17,
                                                        plVar27[1]);
                      *(long **)(unaff_x29 + -0x80) = plVar27;
                      if (plVar27 != (long *)0x0) {
                        lVar61 = *plVar27;
                        *plVar27 = lVar61 + -1;
                        LORelease();
                        if (lVar61 == 1) {
                          func_0x005d2ac4(unaff_x29 + -0x80);
                        }
                      }
                      lVar61 = *(long *)plVar47[1];
                      *(long *)plVar47[1] = lVar61 + 1;
                      if (-1 < lVar61) {
                        lVar61 = plVar47[1];
                        uStack0000000000000100._0_4_ = (uint)lVar61;
                        uStack0000000000000100._4_4_ = (undefined4)((ulong)lVar61 >> 0x20);
                        lVar17 = *(long *)(unaff_x29 + -200);
                        if (lVar17 == *(long *)(unaff_x29 + -0xd8)) {
                          func_0x0058321c(unaff_x29 + -0xd8,&UNK_009ec6c8);
                        }
                        *(long *)(*(long *)(unaff_x29 + -0xd0) + lVar17 * 8) = lVar61;
                        *(long *)(unaff_x29 + -200) = lVar17 + 1;
                        goto joined_r0x00541f88;
                      }
                    }
                  }
code_r0x00542dec:
                  func_0x007a05dc();
                  goto code_r0x0054319c;
                }
                puVar25 = (undefined8 *)func_0x00187bd0(0x18,8);
                if (puVar25 == (undefined8 *)0x0) {
                  func_0x007a1f18(8,0x18);
                  goto code_r0x0054319c;
                }
                lVar61 = *(long *)plVar47[1];
                *(long *)plVar47[1] = lVar61 + 1;
                if (lVar61 < 0) {
                  func_0x007a05dc();
                  goto code_r0x0054319c;
                }
                lVar61 = plVar47[1];
                *puVar25 = 0x8000000000000000;
                puVar25[1] = lVar61;
                *(undefined8 *)(unaff_x29 + -0x80) = 1;
                *(undefined8 **)(unaff_x29 + -0x78) = puVar25;
                *(undefined8 *)(unaff_x29 + -0x70) = 1;
                pdVar21 = (dword *)func_0x00187bd0(0x40,8);
                if (pdVar21 == (dword *)0x0) {
                  func_0x007a1f18(8,0x40);
                  goto code_r0x0054319c;
                }
                func_0x0053e7a8(&uStack0000000000000100,plVar27);
                *(long **)(pdVar21 + 2) = _iStack0000000000000108;
                *(ulong *)pdVar21 =
                     CONCAT44(uStack0000000000000100._4_4_,(uint)uStack0000000000000100);
                *(ulong *)(pdVar21 + 6) =
                     CONCAT44(uStack0000000000000118._4_4_,(undefined4)uStack0000000000000118);
                *(ulong *)(pdVar21 + 4) = CONCAT44(uStack0000000000000114,uStack0000000000000110);
                *(dword **)(pdVar21 + 10) = uStack0000000000000128;
                *(dword **)(pdVar21 + 8) = in_stack_00000120;
                *(long **)(pdVar21 + 0xe) = in_stack_00000138;
                *(dword **)(pdVar21 + 0xc) = in_stack_00000130;
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
                in_stack_00000130 = (dword *)((ulong)in_stack_00000130 & 0xffffffffffff0000);
                lVar61 = *(long *)(unaff_x29 + -0xb0);
                in_stack_00000120 = pdVar21;
                if (lVar61 == *(long *)(unaff_x29 + -0xc0)) {
                  func_0x00582d00(unaff_x29 + -0xc0,&UNK_009ec6e0);
                }
                puVar25 = (undefined8 *)(*(long *)(unaff_x29 + -0xb8) + lVar61 * 0x38);
                puVar25[1] = _iStack0000000000000108;
                *puVar25 = CONCAT44(uStack0000000000000100._4_4_,(uint)uStack0000000000000100);
                puVar25[3] = CONCAT44(uStack0000000000000118._4_4_,
                                      (undefined4)uStack0000000000000118);
                puVar25[2] = CONCAT44(uStack0000000000000114,uStack0000000000000110);
                puVar25[5] = uStack0000000000000128;
                puVar25[4] = in_stack_00000120;
                puVar25[6] = in_stack_00000130;
                *(long *)(unaff_x29 + -0xb0) = lVar61 + 1;
joined_r0x00541f88:
                lVar56 = lVar56 + 0x18;
                lVar24 = lVar24 + 0x40;
                uVar40 = uVar40 + 1;
              } while (uVar38 != uVar40);
              uVar38 = *(ulong *)(lVar65 + 0x30);
              if (uVar38 != 0) {
                uVar44 = 1;
                uVar40 = 0;
                while( true ) {
                  uVar42 = uVar44;
                  uVar44 = *(ulong *)(lVar65 + 0x30);
                  if (uVar44 <= uVar40) break;
                  plVar47 = (long *)(*(long *)(lVar65 + 0x28) + uVar40 * 0x18);
                  plVar27 = plVar47 + 1;
                  if (*plVar47 != -0x8000000000000000) goto code_r0x00542e20;
                  if (lVar48 != 0) {
                    lVar24 = 0;
                    uVar44 = (*plVar27 + 8) * 0x517cc1b727220a95;
                    bVar37 = (byte)(uVar44 >> 0x39);
                    while( true ) {
                      uVar44 = uVar44 & (ulong)puVar49;
                      uVar64 = *(undefined8 *)((long)plVar18 + uVar44);
                      bVar67 = (byte)((ulong)uVar64 >> 8);
                      bVar68 = (byte)((ulong)uVar64 >> 0x10);
                      bVar69 = (byte)((ulong)uVar64 >> 0x18);
                      bVar70 = (byte)((ulong)uVar64 >> 0x20);
                      bVar71 = (byte)((ulong)uVar64 >> 0x28);
                      bVar72 = (byte)((ulong)uVar64 >> 0x30);
                      bVar73 = (byte)((ulong)uVar64 >> 0x38);
                      uVar46 = CONCAT17(-(bVar73 == bVar37),
                                        CONCAT16(-(bVar72 == bVar37),
                                                 CONCAT15(-(bVar71 == bVar37),
                                                          CONCAT14(-(bVar70 == bVar37),
                                                                   CONCAT13(-(bVar69 == bVar37),
                                                                            CONCAT12(-(bVar68 ==
                                                                                      bVar37),
                                                  CONCAT11(-(bVar67 == bVar37),
                                                           -((byte)uVar64 == bVar37)))))))) &
                               0x8080808080808080;
                      if (uVar46 != 0) {
                        do {
                          uVar8 = (uVar46 >> 7 & 0xff00ff00ff00ff00) >> 8 |
                                  (uVar46 >> 7 & 0xff00ff00ff00ff) << 8;
                          uVar8 = (uVar8 & 0xffff0000ffff0000) >> 0x10 |
                                  (uVar8 & 0xffff0000ffff) << 0x10;
                          if (*plVar27 ==
                              plVar18[(uVar44 + ((ulong)LZCOUNT(uVar8 >> 0x20 | uVar8 << 0x20) >> 3)
                                      & (ulong)puVar49) * -2 + -2]) goto code_r0x005422dc;
                          uVar46 = uVar46 - 1 & uVar46;
                        } while (uVar46 != 0);
                      }
                      bVar67 = NEON_umaxv(CONCAT17(-(bVar73 == 0xff),
                                                   CONCAT16(-(bVar72 == 0xff),
                                                            CONCAT15(-(bVar71 == 0xff),
                                                                     CONCAT14(-(bVar70 == 0xff),
                                                                              CONCAT13(-(bVar69 ==
                                                                                        0xff),
                                                  CONCAT12(-(bVar68 == 0xff),
                                                           CONCAT11(-(bVar67 == 0xff),
                                                                    -((byte)uVar64 == 0xff)))))))),1
                                         );
                      if ((bVar67 & 1) != 0) break;
                      lVar24 = lVar24 + 8;
                      uVar44 = uVar44 + lVar24;
                    }
                  }
                  uVar44 = *(ulong *)(lVar65 + 0x48);
                  if (uVar44 <= uVar40) {
                    in_stack_00000040 = &UNK_009ec650;
                    goto code_r0x00543108;
                  }
                  if (*(long *)(*(long *)(lVar65 + 0x40) + uVar40 * 0x40) == 0) {
                    lVar24 = *(long *)*plVar27;
                    *(long *)*plVar27 = lVar24 + 1;
                    if (lVar24 < 0) goto code_r0x00542dec;
                    lVar56 = *plVar27;
                    uStack0000000000000100._0_4_ = (uint)lVar56;
                    uStack0000000000000100._4_4_ = (undefined4)((ulong)lVar56 >> 0x20);
                    lVar24 = *(long *)(unaff_x29 + -0xe0);
                    if (lVar24 == *(long *)(unaff_x29 + -0xf0)) {
                      func_0x0058321c(unaff_x29 + -0xf0,&UNK_009ec668);
                    }
                    *(long *)(*(long *)(unaff_x29 + -0xe8) + lVar24 * 8) = lVar56;
                    *(long *)(unaff_x29 + -0xe0) = lVar24 + 1;
                  }
code_r0x005422dc:
                  if (uVar38 <= uVar42) goto code_r0x005422e8;
                  uVar44 = uVar42 + 1;
                  uVar40 = uVar42;
                }
                in_stack_00000040 = &UNK_009ec620;
code_r0x00543108:
                func_0x007a2570(uVar40,uVar44,in_stack_00000040);
                goto code_r0x0054319c;
              }
code_r0x005422e8:
              *(undefined8 *)(unaff_x29 + -0xa8) = 0;
              lVar24 = 0;
              lVar56 = *(long *)(unaff_x29 + -200);
              do {
                if (lVar56 == 0) {
                  lVar56 = *(long *)(unaff_x29 + -0xb8);
                  uStack0000000000000118 = (long *)(lVar56 + *(long *)(unaff_x29 + -0xb0) * 0x38);
                  uStack0000000000000100._0_4_ = (uint)lVar56;
                  uStack0000000000000100._4_4_ = (undefined4)((ulong)lVar56 >> 0x20);
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
                  uStack0000000000000118._0_4_ = (undefined4)lVar24;
                  uStack0000000000000118._4_4_ = (undefined4)((ulong)lVar24 >> 0x20);
                  uStack0000000000000100._0_4_ = uVar11;
                  uStack0000000000000100._4_4_ = uVar13;
                  if (lVar45 == 0) {
                    func_0x00582c4c(auStack_7ffffffe + 0x800002b6,&UNK_009ec608);
                  }
                  lVar24 = lVar45 * 0x20;
                  *(ulong *)(lVar24 + 0x10) =
                       CONCAT44(uStack000000000000010c,iStack0000000000000108);
                  *(ulong *)(lVar24 + 8) =
                       CONCAT44(uStack0000000000000100._4_4_,(uint)uStack0000000000000100);
                  *(ulong *)(lVar24 + 0x20) =
                       CONCAT44(uStack0000000000000118._4_4_,(undefined4)uStack0000000000000118);
                  *(ulong *)(lVar24 + 0x18) =
                       CONCAT44(uStack0000000000000114,uStack0000000000000110);
                  lVar45 = lVar45 + 1;
                  plVar47 = *(long **)(unaff_x29 + -0xa8);
                  if (plVar47 != (long *)0x0) {
                    lVar24 = *plVar47;
                    *plVar47 = lVar24 + -1;
                    LORelease();
                    if (lVar24 == 1) {
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
                  plVar27 = plVar18;
                  puVar77 = puVar49;
                  plVar47 = plVar33;
                  lVar24 = lVar48;
                  if (*(long *)(unaff_x29 + -0xf0) != 0) {
                    func_0x00187bd4(*(undefined8 *)(unaff_x29 + -0xe8),
                                    *(long *)(unaff_x29 + -0xf0) << 3,8);
                  }
                  goto code_r0x00541e58;
                }
                *(long *)(unaff_x29 + -200) = lVar56 + -1;
                *(undefined8 *)(unaff_x29 + -0xa0) =
                     *(undefined8 *)(*(long *)(unaff_x29 + -0xd0) + (lVar56 + -1) * 8);
                while (*(long *)(unaff_x29 + -0xe0) != 0) {
                  lVar56 = *(long *)(unaff_x29 + -0xe0) + -1;
                  *(long *)(unaff_x29 + -0xe0) = lVar56;
                  lVar56 = *(long *)(*(long *)(unaff_x29 + -0xe8) + lVar56 * 8);
                  *(long *)(unaff_x29 + -0x98) = lVar56;
                  if (lVar48 == 0) {
code_r0x00542d3c:
                    func_0x007a23d8(&UNK_008aad91,0x16,&UNK_009ec530);
                    goto code_r0x0054319c;
                  }
                  lVar61 = 0;
                  uVar40 = (lVar56 + 8) * 0x517cc1b727220a95;
                  bVar37 = (byte)(uVar40 >> 0x39);
                  uVar40 = uVar40 & (ulong)puVar49;
                  uVar64 = *(undefined8 *)((long)plVar18 + uVar40);
                  uVar38 = CONCAT17(-((byte)((ulong)uVar64 >> 0x38) == bVar37),
                                    CONCAT16(-((byte)((ulong)uVar64 >> 0x30) == bVar37),
                                             CONCAT15(-((byte)((ulong)uVar64 >> 0x28) == bVar37),
                                                      CONCAT14(-((byte)((ulong)uVar64 >> 0x20) ==
                                                                bVar37),CONCAT13(-((byte)((ulong)
                                                  uVar64 >> 0x18) == bVar37),
                                                  CONCAT12(-((byte)((ulong)uVar64 >> 0x10) == bVar37
                                                            ),CONCAT11(-((byte)((ulong)uVar64 >> 8)
                                                                        == bVar37),
                                                                       -((byte)uVar64 == bVar37)))))
                                                  ))) & 0x8080808080808080;
                  while( true ) {
                    while (uVar38 == 0) {
                      bVar67 = NEON_umaxv(CONCAT17(-((char)((ulong)uVar64 >> 0x38) == -1),
                                                   CONCAT16(-((char)((ulong)uVar64 >> 0x30) == -1),
                                                            CONCAT15(-((char)((ulong)uVar64 >> 0x28)
                                                                      == -1),CONCAT14(-((char)((
                                                  ulong)uVar64 >> 0x20) == -1),
                                                  CONCAT13(-((char)((ulong)uVar64 >> 0x18) == -1),
                                                           CONCAT12(-((char)((ulong)uVar64 >> 0x10)
                                                                     == -1),CONCAT11(-((char)((ulong
                                                  )uVar64 >> 8) == -1),-((char)uVar64 == -1)))))))),
                                          1);
                      if ((bVar67 & 1) != 0) goto code_r0x00542d3c;
                      lVar61 = lVar61 + 8;
                      uVar40 = uVar40 + lVar61 & (ulong)puVar49;
                      uVar64 = *(undefined8 *)((long)plVar18 + uVar40);
                      uVar38 = CONCAT17(-((byte)((ulong)uVar64 >> 0x38) == bVar37),
                                        CONCAT16(-((byte)((ulong)uVar64 >> 0x30) == bVar37),
                                                 CONCAT15(-((byte)((ulong)uVar64 >> 0x28) == bVar37)
                                                          ,CONCAT14(-((byte)((ulong)uVar64 >> 0x20)
                                                                     == bVar37),
                                                                    CONCAT13(-((byte)((ulong)uVar64
                                                                                     >> 0x18) ==
                                                                              bVar37),CONCAT12(-((
                                                  byte)((ulong)uVar64 >> 0x10) == bVar37),
                                                  CONCAT11(-((byte)((ulong)uVar64 >> 8) == bVar37),
                                                           -((byte)uVar64 == bVar37)))))))) &
                               0x8080808080808080;
                    }
                    uVar44 = (uVar38 >> 7 & 0xff00ff00ff00ff00) >> 8 |
                             (uVar38 >> 7 & 0xff00ff00ff00ff) << 8;
                    uVar44 = (uVar44 & 0xffff0000ffff0000) >> 0x10 |
                             (uVar44 & 0xffff0000ffff) << 0x10;
                    uVar44 = uVar40 + ((ulong)LZCOUNT(uVar44 >> 0x20 | uVar44 << 0x20) >> 3) &
                             (ulong)puVar49;
                    if (lVar56 == plVar18[uVar44 * -2 + -2]) break;
                    uVar38 = uVar38 - 1 & uVar38;
                  }
                  lVar56 = *(long *)plVar18[uVar44 * -2 + -1];
                  *(long *)plVar18[uVar44 * -2 + -1] = lVar56 + 1;
                  if (lVar56 < 0) {
                    func_0x007a05dc();
                    goto code_r0x0054319c;
                  }
                  lVar56 = plVar18[uVar44 * -2 + -1];
                  *(long *)(unaff_x29 + -0x90) = lVar56;
                  if (lVar48 == 0) {
code_r0x00542d58:
                    func_0x007a23d8(&UNK_008aad91,0x16,&UNK_009ec548);
                    goto code_r0x0054319c;
                  }
                  lVar61 = 0;
                  uVar40 = (lVar56 + 8) * 0x517cc1b727220a95;
                  bVar37 = (byte)(uVar40 >> 0x39);
                  uVar40 = uVar40 & (ulong)puVar49;
                  uVar64 = *(undefined8 *)((long)plVar18 + uVar40);
                  uVar38 = CONCAT17(-((byte)((ulong)uVar64 >> 0x38) == bVar37),
                                    CONCAT16(-((byte)((ulong)uVar64 >> 0x30) == bVar37),
                                             CONCAT15(-((byte)((ulong)uVar64 >> 0x28) == bVar37),
                                                      CONCAT14(-((byte)((ulong)uVar64 >> 0x20) ==
                                                                bVar37),CONCAT13(-((byte)((ulong)
                                                  uVar64 >> 0x18) == bVar37),
                                                  CONCAT12(-((byte)((ulong)uVar64 >> 0x10) == bVar37
                                                            ),CONCAT11(-((byte)((ulong)uVar64 >> 8)
                                                                        == bVar37),
                                                                       -((byte)uVar64 == bVar37)))))
                                                  ))) & 0x8080808080808080;
                  while( true ) {
                    while (uVar38 == 0) {
                      bVar67 = NEON_umaxv(CONCAT17(-((char)((ulong)uVar64 >> 0x38) == -1),
                                                   CONCAT16(-((char)((ulong)uVar64 >> 0x30) == -1),
                                                            CONCAT15(-((char)((ulong)uVar64 >> 0x28)
                                                                      == -1),CONCAT14(-((char)((
                                                  ulong)uVar64 >> 0x20) == -1),
                                                  CONCAT13(-((char)((ulong)uVar64 >> 0x18) == -1),
                                                           CONCAT12(-((char)((ulong)uVar64 >> 0x10)
                                                                     == -1),CONCAT11(-((char)((ulong
                                                  )uVar64 >> 8) == -1),-((char)uVar64 == -1)))))))),
                                          1);
                      if ((bVar67 & 1) != 0) goto code_r0x00542d58;
                      lVar61 = lVar61 + 8;
                      uVar40 = uVar40 + lVar61 & (ulong)puVar49;
                      uVar64 = *(undefined8 *)((long)plVar18 + uVar40);
                      uVar38 = CONCAT17(-((byte)((ulong)uVar64 >> 0x38) == bVar37),
                                        CONCAT16(-((byte)((ulong)uVar64 >> 0x30) == bVar37),
                                                 CONCAT15(-((byte)((ulong)uVar64 >> 0x28) == bVar37)
                                                          ,CONCAT14(-((byte)((ulong)uVar64 >> 0x20)
                                                                     == bVar37),
                                                                    CONCAT13(-((byte)((ulong)uVar64
                                                                                     >> 0x18) ==
                                                                              bVar37),CONCAT12(-((
                                                  byte)((ulong)uVar64 >> 0x10) == bVar37),
                                                  CONCAT11(-((byte)((ulong)uVar64 >> 8) == bVar37),
                                                           -((byte)uVar64 == bVar37)))))))) &
                               0x8080808080808080;
                    }
                    uVar44 = (uVar38 >> 7 & 0xff00ff00ff00ff00) >> 8 |
                             (uVar38 >> 7 & 0xff00ff00ff00ff) << 8;
                    uVar44 = (uVar44 & 0xffff0000ffff0000) >> 0x10 |
                             (uVar44 & 0xffff0000ffff) << 0x10;
                    uVar44 = uVar40 + ((ulong)LZCOUNT(uVar44 >> 0x20 | uVar44 << 0x20) >> 3) &
                             (ulong)puVar49;
                    if (lVar56 == plVar18[uVar44 * -2 + -2]) break;
                    uVar38 = uVar38 - 1 & uVar38;
                  }
                  lVar56 = *(long *)plVar18[uVar44 * -2 + -1];
                  *(long *)plVar18[uVar44 * -2 + -1] = lVar56 + 1;
                  if (lVar56 < 0) {
                    func_0x007a05dc();
                    goto code_r0x0054319c;
                  }
                  *(long *)(unaff_x29 + -0x88) = plVar18[uVar44 * -2 + -1];
                  puVar25 = (undefined8 *)func_0x00187bd0(0x18,8);
                  if (puVar25 == (undefined8 *)0x0) {
                    func_0x007a1f18(8,0x18);
                    goto code_r0x0054319c;
                  }
                  lVar56 = **(long **)(unaff_x29 + -0x98);
                  **(long **)(unaff_x29 + -0x98) = lVar56 + 1;
                  if (lVar56 < 0) {
                    func_0x007a05dc();
                    goto code_r0x0054319c;
                  }
                  uVar64 = *(undefined8 *)(unaff_x29 + -0x98);
                  *puVar25 = 0x8000000000000000;
                  puVar25[1] = uVar64;
                  *(undefined8 *)(unaff_x29 + -0x80) = 1;
                  *(undefined8 **)(unaff_x29 + -0x78) = puVar25;
                  *(undefined8 *)(unaff_x29 + -0x70) = 1;
                  pdVar21 = (dword *)func_0x00187bd0(0x40,8);
                  if (pdVar21 == (dword *)0x0) {
                    func_0x007a1f18(8,0x40);
                    goto code_r0x0054319c;
                  }
                  lVar56 = **(long **)(unaff_x29 + -0x88);
                  **(long **)(unaff_x29 + -0x88) = lVar56 + 1;
                  if (lVar56 < 0) {
                    func_0x007a05dc();
                    goto code_r0x0054319c;
                  }
                  plVar47 = *(long **)(unaff_x29 + -0x88);
                  *(undefined8 *)pdVar21 = 0;
                  *(long **)(pdVar21 + 2) = plVar47;
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
                  in_stack_00000130 = (dword *)((ulong)in_stack_00000130 & 0xffffffffffff0000);
                  in_stack_00000120 = pdVar21;
                  if (lVar24 == 0) {
                    func_0x00582d00(auStack_7ffffffe + 0x8000024e,&UNK_009ec560);
                    plVar47 = *(long **)(unaff_x29 + -0x88);
                  }
                  lVar56 = lVar24 * 0x38;
                  *(ulong *)(lVar56 + 0x10) =
                       CONCAT44(uStack000000000000010c,iStack0000000000000108);
                  *(ulong *)(lVar56 + 8) =
                       CONCAT44(uStack0000000000000100._4_4_,(uint)uStack0000000000000100);
                  *(ulong *)(lVar56 + 0x20) =
                       CONCAT44(uStack0000000000000118._4_4_,(undefined4)uStack0000000000000118);
                  *(ulong *)(lVar56 + 0x18) =
                       CONCAT44(uStack0000000000000114,uStack0000000000000110);
                  *(dword **)(lVar56 + 0x30) = uStack0000000000000128;
                  *(dword **)(lVar56 + 0x28) = in_stack_00000120;
                  *(dword **)(lVar56 + 0x38) = in_stack_00000130;
                  lVar24 = lVar24 + 1;
                  plVar27 = *(long **)(unaff_x29 + -0x90);
                  if ((plVar27 == plVar47) && (lVar48 != 0)) {
                    lVar56 = 0;
                    bVar37 = (byte)((ulong)((long)(plVar27 + 1) * 0x517cc1b727220a95) >> 0x39);
                    uVar40 = (long)(plVar27 + 1) * 0x517cc1b727220a95 & (ulong)puVar49;
                    uVar64 = *(undefined8 *)((long)plVar18 + uVar40);
                    uVar38 = CONCAT17(-((byte)((ulong)uVar64 >> 0x38) == bVar37),
                                      CONCAT16(-((byte)((ulong)uVar64 >> 0x30) == bVar37),
                                               CONCAT15(-((byte)((ulong)uVar64 >> 0x28) == bVar37),
                                                        CONCAT14(-((byte)((ulong)uVar64 >> 0x20) ==
                                                                  bVar37),CONCAT13(-((byte)((ulong)
                                                  uVar64 >> 0x18) == bVar37),
                                                  CONCAT12(-((byte)((ulong)uVar64 >> 0x10) == bVar37
                                                            ),CONCAT11(-((byte)((ulong)uVar64 >> 8)
                                                                        == bVar37),
                                                                       -((byte)uVar64 == bVar37)))))
                                                  ))) & 0x8080808080808080;
                    while( true ) {
                      while (uVar38 == 0) {
                        bVar67 = NEON_umaxv(CONCAT17(-((char)((ulong)uVar64 >> 0x38) == -1),
                                                     CONCAT16(-((char)((ulong)uVar64 >> 0x30) == -1)
                                                              ,CONCAT15(-((char)((ulong)uVar64 >>
                                                                                0x28) == -1),
                                                                        CONCAT14(-((char)((ulong)
                                                  uVar64 >> 0x20) == -1),
                                                  CONCAT13(-((char)((ulong)uVar64 >> 0x18) == -1),
                                                           CONCAT12(-((char)((ulong)uVar64 >> 0x10)
                                                                     == -1),CONCAT11(-((char)((ulong
                                                  )uVar64 >> 8) == -1),-((char)uVar64 == -1)))))))),
                                            1);
                        if ((bVar67 & 1) != 0) goto code_r0x005426bc;
                        lVar56 = lVar56 + 8;
                        uVar40 = uVar40 + lVar56 & (ulong)puVar49;
                        uVar64 = *(undefined8 *)((long)plVar18 + uVar40);
                        uVar38 = CONCAT17(-((byte)((ulong)uVar64 >> 0x38) == bVar37),
                                          CONCAT16(-((byte)((ulong)uVar64 >> 0x30) == bVar37),
                                                   CONCAT15(-((byte)((ulong)uVar64 >> 0x28) ==
                                                             bVar37),CONCAT14(-((byte)((ulong)uVar64
                                                                                      >> 0x20) ==
                                                                               bVar37),CONCAT13(-((
                                                  byte)((ulong)uVar64 >> 0x18) == bVar37),
                                                  CONCAT12(-((byte)((ulong)uVar64 >> 0x10) == bVar37
                                                            ),CONCAT11(-((byte)((ulong)uVar64 >> 8)
                                                                        == bVar37),
                                                                       -((byte)uVar64 == bVar37)))))
                                                  ))) & 0x8080808080808080;
                      }
                      uVar44 = (uVar38 >> 7 & 0xff00ff00ff00ff00) >> 8 |
                               (uVar38 >> 7 & 0xff00ff00ff00ff) << 8;
                      uVar44 = (uVar44 & 0xffff0000ffff0000) >> 0x10 |
                               (uVar44 & 0xffff0000ffff) << 0x10;
                      if (plVar47 ==
                          (long *)plVar18[(uVar40 + ((ulong)LZCOUNT(uVar44 >> 0x20 | uVar44 << 0x20)
                                                    >> 3) & (ulong)puVar49) * -2 + -2]) break;
                      uVar38 = uVar38 - 1 & uVar38;
                    }
                    lVar56 = *plVar27;
                    *plVar27 = lVar56 + 1;
                    if (lVar56 < 0) {
                      func_0x007a05dc();
                      goto code_r0x0054319c;
                    }
                    uVar64 = *(undefined8 *)(unaff_x29 + -0x90);
                    uStack0000000000000100._0_4_ = (uint)uVar64;
                    uStack0000000000000100._4_4_ = (undefined4)((ulong)uVar64 >> 0x20);
                    lVar56 = *(long *)(unaff_x29 + -0xe0);
                    if (lVar56 == *(long *)(unaff_x29 + -0xf0)) {
                      func_0x0058321c(unaff_x29 + -0xf0,&UNK_009ec578);
                    }
                    *(undefined8 *)(*(long *)(unaff_x29 + -0xe8) + lVar56 * 8) = uVar64;
                    *(long *)(unaff_x29 + -0xe0) = lVar56 + 1;
                    plVar27 = *(long **)(unaff_x29 + -0x90);
                  }
code_r0x005426bc:
                  plVar47 = (long *)func_0x0056237c(auStack_7ffffffe + 0x8000020e,plVar27,
                                                    *(undefined8 *)(unaff_x29 + -0x98));
                  uStack0000000000000100._0_4_ = (uint)plVar47;
                  uStack0000000000000100._4_4_ = (undefined4)((ulong)plVar47 >> 0x20);
                  if (plVar47 != (long *)0x0) {
                    lVar56 = *plVar47;
                    *plVar47 = lVar56 + -1;
                    LORelease();
                    if (lVar56 == 1) {
                      func_0x005d2ac4(&uStack0000000000000100);
                    }
                  }
                  lVar56 = **(long **)(unaff_x29 + -0x88);
                  **(long **)(unaff_x29 + -0x88) = lVar56 + -1;
                  LORelease();
                  if (lVar56 == 1) {
                    func_0x005d2ac4(unaff_x29 + -0x88);
                  }
                }
                if (lVar48 == 0) {
code_r0x00542d88:
                  puVar23 = &UNK_009ec590;
code_r0x00542d9c:
                  func_0x007a23d8(&UNK_008aad91,0x16,puVar23);
                  goto code_r0x0054319c;
                }
                lVar56 = 0;
                plVar47 = *(long **)(unaff_x29 + -0xa0);
                bVar37 = (byte)((ulong)((long)(plVar47 + 1) * 0x517cc1b727220a95) >> 0x39);
                uVar40 = (long)(plVar47 + 1) * 0x517cc1b727220a95 & (ulong)puVar49;
                uVar64 = *(undefined8 *)((long)plVar18 + uVar40);
                uVar38 = CONCAT17(-((byte)((ulong)uVar64 >> 0x38) == bVar37),
                                  CONCAT16(-((byte)((ulong)uVar64 >> 0x30) == bVar37),
                                           CONCAT15(-((byte)((ulong)uVar64 >> 0x28) == bVar37),
                                                    CONCAT14(-((byte)((ulong)uVar64 >> 0x20) ==
                                                              bVar37),CONCAT13(-((byte)((ulong)
                                                  uVar64 >> 0x18) == bVar37),
                                                  CONCAT12(-((byte)((ulong)uVar64 >> 0x10) == bVar37
                                                            ),CONCAT11(-((byte)((ulong)uVar64 >> 8)
                                                                        == bVar37),
                                                                       -((byte)uVar64 == bVar37)))))
                                                  ))) & 0x8080808080808080;
                while( true ) {
                  while (uVar38 == 0) {
                    bVar67 = NEON_umaxv(CONCAT17(-((char)((ulong)uVar64 >> 0x38) == -1),
                                                 CONCAT16(-((char)((ulong)uVar64 >> 0x30) == -1),
                                                          CONCAT15(-((char)((ulong)uVar64 >> 0x28)
                                                                    == -1),CONCAT14(-((char)((ulong)
                                                  uVar64 >> 0x20) == -1),
                                                  CONCAT13(-((char)((ulong)uVar64 >> 0x18) == -1),
                                                           CONCAT12(-((char)((ulong)uVar64 >> 0x10)
                                                                     == -1),CONCAT11(-((char)((ulong
                                                  )uVar64 >> 8) == -1),-((char)uVar64 == -1)))))))),
                                        1);
                    if ((bVar67 & 1) != 0) goto code_r0x00542d88;
                    lVar56 = lVar56 + 8;
                    uVar40 = uVar40 + lVar56 & (ulong)puVar49;
                    uVar64 = *(undefined8 *)((long)plVar18 + uVar40);
                    uVar38 = CONCAT17(-((byte)((ulong)uVar64 >> 0x38) == bVar37),
                                      CONCAT16(-((byte)((ulong)uVar64 >> 0x30) == bVar37),
                                               CONCAT15(-((byte)((ulong)uVar64 >> 0x28) == bVar37),
                                                        CONCAT14(-((byte)((ulong)uVar64 >> 0x20) ==
                                                                  bVar37),CONCAT13(-((byte)((ulong)
                                                  uVar64 >> 0x18) == bVar37),
                                                  CONCAT12(-((byte)((ulong)uVar64 >> 0x10) == bVar37
                                                            ),CONCAT11(-((byte)((ulong)uVar64 >> 8)
                                                                        == bVar37),
                                                                       -((byte)uVar64 == bVar37)))))
                                                  ))) & 0x8080808080808080;
                  }
                  uVar44 = (uVar38 >> 7 & 0xff00ff00ff00ff00) >> 8 |
                           (uVar38 >> 7 & 0xff00ff00ff00ff) << 8;
                  uVar44 = (uVar44 & 0xffff0000ffff0000) >> 0x10 | (uVar44 & 0xffff0000ffff) << 0x10
                  ;
                  uVar44 = uVar40 + ((ulong)LZCOUNT(uVar44 >> 0x20 | uVar44 << 0x20) >> 3) &
                           (ulong)puVar49;
                  if (plVar47 == (long *)plVar18[uVar44 * -2 + -2]) break;
                  uVar38 = uVar38 - 1 & uVar38;
                }
                if (lVar48 == 0) {
code_r0x00542d94:
                  puVar23 = &UNK_009ec5a8;
                  goto code_r0x00542d9c;
                }
                lVar56 = 0;
                uVar40 = (plVar18[uVar44 * -2 + -1] + 8) * 0x517cc1b727220a95;
                bVar37 = (byte)(uVar40 >> 0x39);
                uVar40 = uVar40 & (ulong)puVar49;
                uVar64 = *(undefined8 *)((long)plVar18 + uVar40);
                uVar38 = CONCAT17(-((byte)((ulong)uVar64 >> 0x38) == bVar37),
                                  CONCAT16(-((byte)((ulong)uVar64 >> 0x30) == bVar37),
                                           CONCAT15(-((byte)((ulong)uVar64 >> 0x28) == bVar37),
                                                    CONCAT14(-((byte)((ulong)uVar64 >> 0x20) ==
                                                              bVar37),CONCAT13(-((byte)((ulong)
                                                  uVar64 >> 0x18) == bVar37),
                                                  CONCAT12(-((byte)((ulong)uVar64 >> 0x10) == bVar37
                                                            ),CONCAT11(-((byte)((ulong)uVar64 >> 8)
                                                                        == bVar37),
                                                                       -((byte)uVar64 == bVar37)))))
                                                  ))) & 0x8080808080808080;
                while( true ) {
                  while (uVar38 == 0) {
                    bVar67 = NEON_umaxv(CONCAT17(-((char)((ulong)uVar64 >> 0x38) == -1),
                                                 CONCAT16(-((char)((ulong)uVar64 >> 0x30) == -1),
                                                          CONCAT15(-((char)((ulong)uVar64 >> 0x28)
                                                                    == -1),CONCAT14(-((char)((ulong)
                                                  uVar64 >> 0x20) == -1),
                                                  CONCAT13(-((char)((ulong)uVar64 >> 0x18) == -1),
                                                           CONCAT12(-((char)((ulong)uVar64 >> 0x10)
                                                                     == -1),CONCAT11(-((char)((ulong
                                                  )uVar64 >> 8) == -1),-((char)uVar64 == -1)))))))),
                                        1);
                    if ((bVar67 & 1) != 0) goto code_r0x00542d94;
                    lVar56 = lVar56 + 8;
                    uVar40 = uVar40 + lVar56 & (ulong)puVar49;
                    uVar64 = *(undefined8 *)((long)plVar18 + uVar40);
                    uVar38 = CONCAT17(-((byte)((ulong)uVar64 >> 0x38) == bVar37),
                                      CONCAT16(-((byte)((ulong)uVar64 >> 0x30) == bVar37),
                                               CONCAT15(-((byte)((ulong)uVar64 >> 0x28) == bVar37),
                                                        CONCAT14(-((byte)((ulong)uVar64 >> 0x20) ==
                                                                  bVar37),CONCAT13(-((byte)((ulong)
                                                  uVar64 >> 0x18) == bVar37),
                                                  CONCAT12(-((byte)((ulong)uVar64 >> 0x10) == bVar37
                                                            ),CONCAT11(-((byte)((ulong)uVar64 >> 8)
                                                                        == bVar37),
                                                                       -((byte)uVar64 == bVar37)))))
                                                  ))) & 0x8080808080808080;
                  }
                  uVar42 = (uVar38 >> 7 & 0xff00ff00ff00ff00) >> 8 |
                           (uVar38 >> 7 & 0xff00ff00ff00ff) << 8;
                  uVar42 = (uVar42 & 0xffff0000ffff0000) >> 0x10 | (uVar42 & 0xffff0000ffff) << 0x10
                  ;
                  uVar42 = uVar40 + ((ulong)LZCOUNT(uVar42 >> 0x20 | uVar42 << 0x20) >> 3) &
                           (ulong)puVar49;
                  if (plVar18[uVar44 * -2 + -1] == plVar18[uVar42 * -2 + -2]) break;
                  uVar38 = uVar38 - 1 & uVar38;
                }
                if (plVar47 == (long *)plVar18[uVar42 * -2 + -1]) {
                  lVar56 = *plVar47;
                  *plVar47 = lVar56 + -1;
                  LORelease();
                  if (lVar56 == 1) {
                    func_0x005d2ac4(unaff_x29 + -0xa0);
                  }
                }
                else {
                  if (*(long *)(unaff_x29 + -0xa8) == 0) {
                    puVar25 = (undefined8 *)func_0x00187bd0(0x28,8);
                    if (puVar25 == (undefined8 *)0x0) {
                      func_0x007a1f18(8,0x28);
                      goto code_r0x0054319c;
                    }
                    *puVar25 = 1;
                    *(undefined1 *)(puVar25 + 1) = 0;
                    puVar25[2] = 0x8000000000000000;
                    *(undefined8 **)(unaff_x29 + -0xa8) = puVar25;
                  }
                  puVar25 = (undefined8 *)func_0x00187bd0(0x18,8);
                  if (puVar25 == (undefined8 *)0x0) {
                    func_0x007a1f18(8,0x18);
                    goto code_r0x0054319c;
                  }
                  lVar56 = **(long **)(unaff_x29 + -0xa8);
                  **(long **)(unaff_x29 + -0xa8) = lVar56 + 1;
                  if (lVar56 < 0) {
                    func_0x007a05dc();
                    goto code_r0x0054319c;
                  }
                  uVar64 = *(undefined8 *)(unaff_x29 + -0xa8);
                  *puVar25 = 0x8000000000000000;
                  puVar25[1] = uVar64;
                  *(undefined8 *)(unaff_x29 + -0x80) = 1;
                  *(undefined8 **)(unaff_x29 + -0x78) = puVar25;
                  *(undefined8 *)(unaff_x29 + -0x70) = 1;
                  pdVar21 = (dword *)func_0x00187bd0(0x40,8);
                  if (pdVar21 == (dword *)0x0) {
                    func_0x007a1f18(8,0x40);
                    goto code_r0x0054319c;
                  }
                  lVar56 = **(long **)(unaff_x29 + -0xa0);
                  **(long **)(unaff_x29 + -0xa0) = lVar56 + 1;
                  if (lVar56 < 0) {
                    func_0x007a05dc();
                    goto code_r0x0054319c;
                  }
                  plVar47 = *(long **)(unaff_x29 + -0xa0);
                  *(undefined8 *)pdVar21 = 0;
                  *(long **)(pdVar21 + 2) = plVar47;
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
                  in_stack_00000130 = (dword *)((ulong)in_stack_00000130 & 0xffffffffffff0000);
                  in_stack_00000120 = pdVar21;
                  if (lVar24 == 0) {
                    func_0x00582d00(auStack_7ffffffe + 0x8000024e,&UNK_009ec5c0);
                    plVar47 = *(long **)(unaff_x29 + -0xa0);
                  }
                  lVar56 = lVar24 * 0x38;
                  *(ulong *)(lVar56 + 0x10) =
                       CONCAT44(uStack000000000000010c,iStack0000000000000108);
                  *(ulong *)(lVar56 + 8) =
                       CONCAT44(uStack0000000000000100._4_4_,(uint)uStack0000000000000100);
                  *(ulong *)(lVar56 + 0x20) =
                       CONCAT44(uStack0000000000000118._4_4_,(undefined4)uStack0000000000000118);
                  *(ulong *)(lVar56 + 0x18) =
                       CONCAT44(uStack0000000000000114,uStack0000000000000110);
                  *(dword **)(lVar56 + 0x30) = uStack0000000000000128;
                  *(dword **)(lVar56 + 0x28) = in_stack_00000120;
                  *(dword **)(lVar56 + 0x38) = in_stack_00000130;
                  lVar24 = lVar24 + 1;
                  lVar56 = *plVar47;
                  *plVar47 = lVar56 + 1;
                  if (lVar56 < 0) {
                    func_0x007a05dc();
                    goto code_r0x0054319c;
                  }
                  uVar64 = *(undefined8 *)(unaff_x29 + -0xa0);
                  uStack0000000000000100._0_4_ = (uint)uVar64;
                  uStack0000000000000100._4_4_ = (undefined4)((ulong)uVar64 >> 0x20);
                  lVar56 = **(long **)(unaff_x29 + -0xa8);
                  **(long **)(unaff_x29 + -0xa8) = lVar56 + 1;
                  if (lVar56 < 0) {
                    func_0x007a05dc();
                    goto code_r0x0054319c;
                  }
                  plVar47 = (long *)func_0x0056237c(auStack_7ffffffe + 0x8000020e,uVar64,
                                                    *(undefined8 *)(unaff_x29 + -0xa8));
                  *(long **)(unaff_x29 + -0x80) = plVar47;
                  if (plVar47 != (long *)0x0) {
                    lVar56 = *plVar47;
                    *plVar47 = lVar56 + -1;
                    LORelease();
                    if (lVar56 == 1) {
                      func_0x005d2ac4(unaff_x29 + -0x80);
                    }
                  }
                  uVar64 = *(undefined8 *)(unaff_x29 + -0xa0);
                  uStack0000000000000100._0_4_ = (uint)uVar64;
                  uStack0000000000000100._4_4_ = (undefined4)((ulong)uVar64 >> 0x20);
                  lVar56 = *(long *)(unaff_x29 + -0xe0);
                  if (lVar56 == *(long *)(unaff_x29 + -0xf0)) {
                    func_0x0058321c(unaff_x29 + -0xf0,&UNK_009ec5d8);
                  }
                  *(undefined8 *)(*(long *)(unaff_x29 + -0xe8) + lVar56 * 8) = uVar64;
                  *(long *)(unaff_x29 + -0xe0) = lVar56 + 1;
                }
                lVar56 = *(long *)(unaff_x29 + -200);
              } while( true );
            }
            if (*(long *)(lVar65 + 0x48) == 0) {
              uStack0000000000000100._0_4_ = uVar10;
              uStack0000000000000100._4_4_ = uVar12;
              func_0x007a2570(0,0,&UNK_009ec500);
              goto code_r0x0054319c;
            }
            if (**(long **)(lVar65 + 0x40) == 0) {
              if (**(long **)(lVar65 + 0x28) != -0x8000000000000000) {
                in_stack_00000050 = (dword *)&UNK_009ec6f8;
                uStack0000000000000100._0_4_ = uVar10;
                uStack0000000000000100._4_4_ = uVar12;
                goto code_r0x00543020;
              }
              if ((*(long **)(lVar65 + 0x40))[1] == (*(long **)(lVar65 + 0x28))[1]) {
                iStack0000000000000108 = 0;
                uStack000000000000010c = 0;
                uStack0000000000000110 = 8;
                uStack0000000000000114 = 0;
                uStack0000000000000118._0_4_ = 0;
                uStack0000000000000118._4_4_ = 0;
                if (lVar45 == 0) {
                  func_0x00582c4c(auStack_7ffffffe + 0x800002b6,&UNK_009ec518);
                }
                lVar56 = lVar45 * 0x20;
                *(long **)(lVar56 + 0x10) = _iStack0000000000000108;
                *(ulong *)(lVar56 + 8) =
                     CONCAT44(uStack0000000000000100._4_4_,(uint)uStack0000000000000100);
                *(ulong *)(lVar56 + 0x20) =
                     CONCAT44(uStack0000000000000118._4_4_,(undefined4)uStack0000000000000118);
                *(ulong *)(lVar56 + 0x18) = CONCAT44(uStack0000000000000114,uStack0000000000000110);
                lVar45 = lVar45 + 1;
                goto code_r0x00541e58;
              }
            }
            *(undefined1 *)(lVar65 + 0x51) = 0;
            uStack0000000000000100._0_4_ = uVar10;
            uStack0000000000000100._4_4_ = uVar12;
          }
        }
code_r0x00541e58:
        lVar65 = lVar65 + 0x108;
        lVar43 = lVar43 + 1;
      } while (lVar65 != lVar51);
      uVar38 = *(ulong *)(lVar35 + 0x28);
    }
    if ((uVar38 <= uVar19) ||
       (plVar63 = (long *)(*(long *)(lVar35 + 0x20) + uVar19 * 0x20),
       *plVar63 == -0x8000000000000000)) {
      in_stack_00000050 = (dword *)&UNK_009ec4e8;
      goto code_r0x00543020;
    }
    *(undefined8 *)(unaff_x29 + -0x80) = 8;
    *(undefined8 *)(unaff_x29 + -0x78) = 8;
    *(undefined8 *)(unaff_x29 + -0x70) = 0;
    *(long *)(unaff_x29 + -0x68) = lVar45 * 0x20 + 8;
    if (lVar45 != 0) {
      plVar53 = (long *)(lVar45 << 5);
      do {
        plVar30 = (long *)plVar53[-2];
        if (plVar30 == (long *)0x8000000000000000) {
          pdVar34 = (dword *)(plVar53 + -3);
          break;
        }
        pdVar21 = (dword *)plVar53[-1];
        lVar45 = *plVar53;
        func_0x00556400(auStack_7ffffffe + 0x8000026e,plVar63,plVar53[-3],plVar53[-3] + 1);
        iStack0000000000000108 = (int)puVar77;
        uStack000000000000010c = (undefined4)((ulong)puVar77 >> 0x20);
        uStack0000000000000100._0_4_ = (uint)plVar27;
        uStack0000000000000100._4_4_ = (undefined4)((ulong)plVar27 >> 0x20);
        uStack0000000000000118._0_4_ = (undefined4)lVar24;
        uStack0000000000000118._4_4_ = (undefined4)((ulong)lVar24 >> 0x20);
        uStack0000000000000110 = SUB84(plVar47,0);
        uStack0000000000000114 = (undefined4)((ulong)plVar47 >> 0x20);
        in_stack_00000120 = pdVar62;
        uStack0000000000000128 = pdVar21;
        in_stack_00000130 = pdVar21;
        in_stack_00000138 = plVar30;
        in_stack_00000140 = pdVar21 + lVar45 * 0xe;
        func_0x005835b8(&uStack0000000000000100,&UNK_009ec370);
        func_0x0057eaa0(&uStack0000000000000100);
        func_0x005936cc(&uStack0000000000000128);
        plVar53 = plVar53 + -4;
      } while (plVar53 != (long *)0x0);
      *(dword **)(unaff_x29 + -0x68) = pdVar34;
    }
    func_0x00592f2c(unaff_x29 + -0x80);
    puVar28 = puVar29;
    if (puVar29 == puVar1) {
code_r0x00542c90:
      if (plVar59 != (long *)0x0) {
        func_0x00187bd4(puVar36,(long)plVar59 << 2,4);
      }
      func_0x0053defc(in_stack_000000f8);
      return;
    }
  } while( true );
code_r0x00540d08:
  lVar43 = lVar43 + 8;
  uVar44 = uVar44 + lVar43 & uVar40;
  uVar64 = *(undefined8 *)((long)plVar33 + uVar44);
  uVar19 = CONCAT17(-((byte)((ulong)uVar64 >> 0x38) == bVar67),
                    CONCAT16(-((byte)((ulong)uVar64 >> 0x30) == bVar67),
                             CONCAT15(-((byte)((ulong)uVar64 >> 0x28) == bVar67),
                                      CONCAT14(-((byte)((ulong)uVar64 >> 0x20) == bVar67),
                                               CONCAT13(-((byte)((ulong)uVar64 >> 0x18) == bVar67),
                                                        CONCAT12(-((byte)((ulong)uVar64 >> 0x10) ==
                                                                  bVar67),CONCAT11(-((byte)((ulong)
                                                  uVar64 >> 8) == bVar67),-((byte)uVar64 == bVar67))
                                                  )))))) & 0x8080808080808080;
  if (uVar19 != 0) goto code_r0x00540cc4;
  goto code_r0x00540cf4;
code_r0x00540d2c:
  lVar43 = *plVar63;
  *plVar63 = lVar43 + -1;
  LORelease();
  if (lVar43 == 1) {
    func_0x005d2ac4(&uStack0000000000000100);
  }
  plVar33 = plVar33 + uVar46 * -5;
code_r0x00540de8:
  iStack0000000000000108 = 1;
  uStack000000000000010c = 0;
  uStack0000000000000100._0_4_ = uVar10;
  uStack0000000000000100._4_4_ = uVar12;
  uStack0000000000000110 = uVar14;
  uStack0000000000000114 = uVar15;
  func_0x00562f08(unaff_x29 + -0x80,plVar33 + -4,uVar38,&uStack0000000000000100);
  plVar33 = plVar27;
  if (plVar27 == plVar18) goto code_r0x00540e94;
  goto code_r0x00540c64;
code_r0x00540e94:
  if (plVar59 != (long *)0x0) {
    func_0x00187bd4(plVar47,(long)plVar59 << 3,8);
  }
code_r0x00540980:
  lVar43 = lVar56;
  if (lVar56 == lVar51 + lVar35 * 0x108) goto code_r0x00540334;
  goto code_r0x0054098c;
code_r0x00540334:
  lVar24 = lVar24 + 1;
  goto code_r0x0054033c;
code_r0x00541030:
  uVar19 = uVar44 | uVar19 << 0x20;
  if (uVar42 < uVar40) goto code_r0x0054103c;
code_r0x00542fb0:
  func_0x007a23bc(&UNK_009f08a0);
  goto code_r0x0054319c;
}

