
/* WARNING: Removing unreachable block (ram,0x004c4fa8) */
/* WARNING: Removing unreachable block (ram,0x004c4fb0) */
/* WARNING: Removing unreachable block (ram,0x004c48f8) */
/* WARNING: Removing unreachable block (ram,0x004c4904) */
/* WARNING: Type propagation algorithm not settling */
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

uint FUN_004c25e0(long param_1)

{
  char cVar1;
  uint uVar2;
  dword *pdVar3;
  code *pcVar4;
  bool bVar5;
  undefined8 uVar6;
  long *plVar7;
  ulong uVar8;
  dword *pdVar9;
  undefined8 *puVar10;
  uint *puVar11;
  undefined *puVar12;
  undefined8 extraout_x1;
  undefined8 extraout_x1_00;
  undefined8 extraout_x1_01;
  undefined8 extraout_x1_02;
  undefined8 extraout_x1_03;
  undefined8 extraout_x1_04;
  undefined8 extraout_x1_05;
  undefined8 extraout_x1_06;
  undefined8 extraout_x1_07;
  undefined8 extraout_x1_08;
  undefined8 extraout_x1_09;
  undefined8 extraout_x1_10;
  undefined8 extraout_x1_11;
  undefined8 extraout_x1_12;
  undefined8 extraout_x1_13;
  byte bVar13;
  long lVar14;
  long lVar15;
  long lVar16;
  ulong uVar17;
  long lVar18;
  long in_x9;
  ulong uVar19;
  ulong uVar20;
  long lVar21;
  ulong uVar22;
  ulong uVar23;
  int iVar24;
  ulong uVar25;
  ulong uVar26;
  ulong uVar27;
  long lVar28;
  ulong uVar29;
  long *plVar30;
  ulong uVar31;
  ulong uVar32;
  long *plVar33;
  uint uVar34;
  uint uVar35;
  bool bVar36;
  ulong uVar37;
  bool bVar38;
  undefined4 uVar39;
  ulong uVar40;
  uint uVar41;
  uint uVar42;
  dword *unaff_x22;
  uint uVar43;
  undefined8 unaff_x23;
  ulong uVar44;
  uint uVar45;
  char *pcVar46;
  long *unaff_x27;
  long unaff_x29;
  undefined8 in_xzr;
  byte bVar47;
  byte bVar49;
  byte bVar50;
  byte bVar51;
  byte bVar52;
  byte bVar53;
  long lVar48;
  long lVar54;
  long *plVar55;
  long *plVar56;
  byte bVar57;
  byte bVar58;
  undefined1 auVar59 [16];
  undefined1 auVar60 [16];
  undefined1 auVar61 [12];
  undefined *puStack0000000000000000;
  undefined *puStack0000000000000008;
  long in_stack_00000010;
  undefined8 uStack0000000000000018;
  long in_stack_00000020;
  undefined8 in_stack_00000028;
  dword *in_stack_00000080;
  long in_stack_00000088;
  long lStack0000000000000090;
  uint uStack000000000000009c;
  undefined8 in_stack_000000f8;
  undefined8 uStack0000000000000118;
  long in_stack_00000120;
  undefined8 in_stack_00000128;
  undefined8 uStack0000000000000138;
  long in_stack_00000180;
  long in_stack_00000188;
  long in_stack_00000190;
  undefined8 in_stack_000001a0;
  undefined8 in_stack_000001a8;
  undefined1 uStack00000000000001b8;
  undefined8 uStack00000000000001d0;
  long in_stack_000001d8;
  long in_stack_000001e0;
  undefined8 uStack00000000000001f0;
  dword *in_stack_000001f8;
  long in_stack_00000200;
  long in_stack_00000410;
  dword *in_stack_00000418;
  long in_stack_00000420;
  long in_stack_00000530;
  long in_stack_00000538;
  uint uVar62;
  long in_stack_00000540;
  long in_stack_00000548;
  undefined8 in_stack_00000550;
  uint uVar63;
  long in_stack_00000670;
  dword *in_stack_00000678;
  ulong in_stack_00000680;
  int iVar64;
  uint uVar65;
  ulong in_stack_00000688;
  long in_stack_00000690;
  dword dVar66;
  long in_stack_00000698;
  long in_stack_000006a0;
  long in_stack_000006a8;
  long in_stack_000007a0;
  long in_stack_000007a8;
  long in_stack_000007b0;
  undefined1 auStack_7ffffffe [6];
  long alStack_7ffffff8 [268435455];
  
  *unaff_x27 = in_x9;
  unaff_x27[1] = param_1;
  unaff_x27[2] = (long)in_stack_00000080;
  uStack000000000000009c = func_0x004d20d8(&uStack00000000000001f0,auStack_7ffffffe + 0x8000066e);
  uStack000000000000009c = uStack000000000000009c & (int)extraout_x1 != (int)unaff_x23;
  if (uStack000000000000009c != 1) {
LAB_004c286c:
    if (in_stack_00000200 != 0) {
      func_0x00187bd4(uStack00000000000001f0,in_stack_00000200 << 2,4);
    }
    func_0x0058485c(auStack_7ffffffe + 0x8000052e,in_stack_000000f8,unaff_x23);
    unaff_x27[1] = in_stack_00000538;
    *unaff_x27 = in_stack_00000530;
    unaff_x27[3] = in_stack_00000548;
    unaff_x27[2] = in_stack_00000540;
    unaff_x27[4] = (long)&uStack0000000000000118 + 4;
    unaff_x27[5] = (long)unaff_x22;
    unaff_x27[6] = (long)&uStack0000000000000138 + 4;
    func_0x004d0004(&uStack00000000000001d0,auStack_7ffffffe + 0x8000066e,&UNK_009e5910);
    uVar43 = (uint)unaff_x23;
    func_0x0058485c(auStack_7ffffffe + 0x8000066e,in_stack_000000f8,uStack0000000000000118._4_4_);
    lVar14 = *unaff_x27;
    uVar8 = unaff_x27[1];
    uVar44 = in_stack_00000680 & 0xffffffff;
    uVar23 = in_stack_00000680 >> 0x20;
    lVar28 = *(long *)unaff_x22;
    uVar29 = *(ulong *)(unaff_x22 + 2);
    lVar15 = lVar28 + -8;
    lVar54 = *(long *)(unaff_x22 + 6);
    uVar19 = *(ulong *)(unaff_x22 + 10);
    uVar25 = uVar19 ^ 0x646f72616e646f6d;
    uVar31 = *(ulong *)(unaff_x22 + 8) ^ 0x6c7967656e657261;
    uVar17 = uVar25 + (*(ulong *)(unaff_x22 + 8) ^ 0x736f6d6570736575);
    uVar25 = uVar17 ^ (uVar25 >> 0x33 | uVar25 << 0xd);
code_r0x004c2980:
    do {
      do {
        iVar64 = (int)in_stack_00000688;
        if (uVar44 < uVar8) {
          lVar16 = lVar14 + uVar44 * 0x30;
          uVar44 = (ulong)*(uint *)(lVar16 + 0x20);
          uVar40 = (ulong)*(uint *)(lVar16 + 0x2c);
        }
        else {
          do {
            if (uVar8 <= uVar23) goto code_r0x004c2f68;
            lVar16 = lVar14 + uVar23 * 0x30;
            uVar23 = (ulong)*(uint *)(lVar16 + 0x24);
            uVar40 = (ulong)*(uint *)(lVar16 + 0x28);
          } while (uVar40 == (in_stack_00000688 & 0xffffffff));
        }
      } while (uVar40 == uStack0000000000000118._4_4_ || lVar54 == 0);
      lVar16 = 0;
      uVar22 = (uVar40 | 0x400000000000000) ^ uVar19 ^ 0x7465646279746573;
      uVar26 = uVar22 + uVar31 ^ (uVar22 >> 0x30 | uVar22 << 0x10);
      uVar22 = uVar22 + uVar31 + uVar25;
      uVar32 = uVar22 ^ (uVar25 >> 0x2f | uVar25 << 0x11);
      uVar20 = uVar26 + (uVar17 >> 0x20 | uVar17 << 0x20);
      uVar27 = uVar20 ^ (uVar26 >> 0x2b | uVar26 << 0x15);
      uVar20 = (uVar20 ^ (uVar40 | 0x400000000000000)) + uVar32;
      uVar32 = uVar20 ^ (uVar32 >> 0x33 | uVar32 << 0xd);
      uVar22 = ((uVar22 >> 0x20 | uVar22 << 0x20) ^ 0xff) + uVar27;
      uVar26 = uVar32 + uVar22;
      uVar22 = uVar22 ^ (uVar27 >> 0x30 | uVar27 << 0x10);
      uVar32 = uVar26 ^ (uVar32 >> 0x2f | uVar32 << 0x11);
      uVar20 = uVar22 + (uVar20 >> 0x20 | uVar20 << 0x20);
      uVar27 = uVar32 + uVar20;
      uVar20 = uVar20 ^ (uVar22 >> 0x2b | uVar22 << 0x15);
      uVar32 = uVar27 ^ (uVar32 >> 0x33 | uVar32 << 0xd);
      uVar22 = uVar20 + (uVar26 >> 0x20 | uVar26 << 0x20);
      uVar26 = uVar32 + uVar22;
      uVar22 = uVar22 ^ (uVar20 >> 0x30 | uVar20 << 0x10);
      uVar32 = uVar26 ^ (uVar32 >> 0x2f | uVar32 << 0x11);
      uVar20 = uVar22 + (uVar27 >> 0x20 | uVar27 << 0x20);
      uVar27 = uVar20 ^ (uVar22 >> 0x2b | uVar22 << 0x15);
      uVar32 = uVar32 + uVar20 ^ (uVar32 >> 0x33 | uVar32 << 0xd);
      uVar22 = uVar27 + (uVar26 >> 0x20 | uVar26 << 0x20);
      uVar20 = uVar32 + uVar22;
      uVar22 = uVar22 ^ (uVar27 >> 0x30 | uVar27 << 0x10);
      uVar20 = (uVar32 >> 0x2f | uVar32 << 0x11) ^ (uVar22 >> 0x2b | uVar22 << 0x15) ^
               (uVar20 >> 0x20 | uVar20 << 0x20) ^ uVar20;
      bVar13 = (byte)(uVar20 >> 0x39);
      uVar22 = uVar20;
      while( true ) {
        uVar22 = uVar22 & uVar29;
        uVar6 = *(undefined8 *)(lVar28 + uVar22);
        bVar47 = (byte)((ulong)uVar6 >> 8);
        bVar57 = (byte)((ulong)uVar6 >> 0x10);
        bVar49 = (byte)((ulong)uVar6 >> 0x18);
        bVar50 = (byte)((ulong)uVar6 >> 0x20);
        bVar51 = (byte)((ulong)uVar6 >> 0x28);
        bVar52 = (byte)((ulong)uVar6 >> 0x30);
        bVar53 = (byte)((ulong)uVar6 >> 0x38);
        uVar39 = (undefined4)uVar40;
        for (uVar26 = CONCAT17(-(bVar53 == bVar13),
                               CONCAT16(-(bVar52 == bVar13),
                                        CONCAT15(-(bVar51 == bVar13),
                                                 CONCAT14(-(bVar50 == bVar13),
                                                          CONCAT13(-(bVar49 == bVar13),
                                                                   CONCAT12(-(bVar57 == bVar13),
                                                                            CONCAT11(-(bVar47 ==
                                                                                      bVar13),-((
                                                  byte)uVar6 == bVar13)))))))) & 0x8080808080808080;
            uVar26 != 0; uVar26 = uVar26 - 1 & uVar26) {
          uVar27 = (uVar26 >> 7 & 0xff00ff00ff00ff00) >> 8 | (uVar26 >> 7 & 0xff00ff00ff00ff) << 8;
          uVar27 = (uVar27 & 0xffff0000ffff0000) >> 0x10 | (uVar27 & 0xffff0000ffff) << 0x10;
          if (uVar40 == *(uint *)(lVar15 + (uVar22 + ((ulong)LZCOUNT(uVar27 >> 0x20 | uVar27 << 0x20
                                                                    ) >> 3) & uVar29) * -8)) {
            in_stack_00000670 = CONCAT44(uVar39,1);
            goto code_r0x004c2b00;
          }
        }
        bVar47 = NEON_umaxv(CONCAT17(-(bVar53 == 0xff),
                                     CONCAT16(-(bVar52 == 0xff),
                                              CONCAT15(-(bVar51 == 0xff),
                                                       CONCAT14(-(bVar50 == 0xff),
                                                                CONCAT13(-(bVar49 == 0xff),
                                                                         CONCAT12(-(bVar57 == 0xff),
                                                                                  CONCAT11(-(bVar47 
                                                  == 0xff),-((byte)uVar6 == 0xff)))))))),1);
        if ((bVar47 & 1) != 0) break;
        lVar16 = lVar16 + 8;
        uVar22 = uVar22 + lVar16;
      }
code_r0x004c2b20:
      lVar16 = 0;
      uVar22 = uVar20;
      while( true ) {
        uVar22 = uVar22 & uVar29;
        uVar6 = *(undefined8 *)(lVar28 + uVar22);
        bVar47 = (byte)((ulong)uVar6 >> 8);
        bVar57 = (byte)((ulong)uVar6 >> 0x10);
        bVar49 = (byte)((ulong)uVar6 >> 0x18);
        bVar50 = (byte)((ulong)uVar6 >> 0x20);
        bVar51 = (byte)((ulong)uVar6 >> 0x28);
        bVar52 = (byte)((ulong)uVar6 >> 0x30);
        bVar53 = (byte)((ulong)uVar6 >> 0x38);
        for (uVar26 = CONCAT17(-(bVar53 == bVar13),
                               CONCAT16(-(bVar52 == bVar13),
                                        CONCAT15(-(bVar51 == bVar13),
                                                 CONCAT14(-(bVar50 == bVar13),
                                                          CONCAT13(-(bVar49 == bVar13),
                                                                   CONCAT12(-(bVar57 == bVar13),
                                                                            CONCAT11(-(bVar47 ==
                                                                                      bVar13),-((
                                                  byte)uVar6 == bVar13)))))))) & 0x8080808080808080;
            uVar26 != 0; uVar26 = uVar26 - 1 & uVar26) {
          uVar27 = (uVar26 >> 7 & 0xff00ff00ff00ff00) >> 8 | (uVar26 >> 7 & 0xff00ff00ff00ff) << 8;
          uVar27 = (uVar27 & 0xffff0000ffff0000) >> 0x10 | (uVar27 & 0xffff0000ffff) << 0x10;
          if (uVar40 == *(uint *)(lVar15 + (uVar22 + ((ulong)LZCOUNT(uVar27 >> 0x20 | uVar27 << 0x20
                                                                    ) >> 3) & uVar29) * -8)) {
            in_stack_00000670 = CONCAT44(uVar39,1);
            goto code_r0x004c2ba8;
          }
        }
        bVar47 = NEON_umaxv(CONCAT17(-(bVar53 == 0xff),
                                     CONCAT16(-(bVar52 == 0xff),
                                              CONCAT15(-(bVar51 == 0xff),
                                                       CONCAT14(-(bVar50 == 0xff),
                                                                CONCAT13(-(bVar49 == 0xff),
                                                                         CONCAT12(-(bVar57 == 0xff),
                                                                                  CONCAT11(-(bVar47 
                                                  == 0xff),-((byte)uVar6 == 0xff)))))))),1);
        if ((bVar47 & 1) != 0) break;
        lVar16 = lVar16 + 8;
        uVar22 = uVar22 + lVar16;
      }
      unaff_x27 = (long *)(auStack_7ffffffe + 0x8000066e);
    } while( true );
  }
  uVar6 = func_0x00584f94(in_stack_000000f8);
  uStack0000000000000138._4_4_ = (dword)uVar6;
  unaff_x27[0x26] = 0;
  unaff_x27[0x27] = 8;
  unaff_x27[0x28] = 0;
  lVar14 = _UNK_0089eb10;
  unaff_x27[1] = _UNK_0089eb18;
  *unaff_x27 = lVar14;
  in_stack_00000410 = 0;
  in_stack_00000418 = &MACH_HEADER.cpusubtype;
  in_stack_00000420 = 0;
  func_0x005cee30(auStack_7ffffffe + 0x8000052e,auStack_7ffffffe + 0x8000066e,
                  auStack_7ffffffe + 0x8000033e,auStack_7ffffffe + 0x8000040e);
  in_stack_00000688 = 0x10;
  if (in_stack_000007b0 == in_stack_000007a0) {
    func_0x005bd0a4(unaff_x29 + -0xd0,&UNK_009e62e8);
  }
  _memcpy(in_stack_000007a8 + in_stack_000007b0 * 0x108,auStack_7ffffffe + 0x8000066e,0x108);
  plVar7 = (long *)func_0x005847cc(in_stack_000000f8,uStack0000000000000118._4_4_);
  if (plVar7 == (long *)0x0) {
    func_0x007a23bc(&UNK_009e6300);
  }
  else {
    lVar54 = plVar7[1];
    lVar28 = *plVar7;
    lVar14 = plVar7[2];
    plVar7[1] = in_stack_000007a8;
    *plVar7 = in_stack_000007a0;
    plVar7[2] = in_stack_000007b0 + 1;
    plVar7 = (long *)func_0x005847cc(in_stack_000000f8,uVar6);
    if (plVar7 == (long *)0x0) {
      func_0x007a23bc(&UNK_009e6318);
    }
    else {
      lVar15 = plVar7[2] + 1;
      lVar16 = plVar7[1];
      while (lVar15 = lVar15 + -1, lVar15 != 0) {
        func_0x004caae8(lVar16);
        lVar16 = lVar16 + 0x108;
      }
      if (*plVar7 != 0) {
        func_0x00187bd4(plVar7[1],*plVar7 * 0x108,8);
      }
      plVar7[1] = lVar54;
      *plVar7 = lVar28;
      plVar7[2] = lVar14;
      func_0x0058497c(&uStack00000000000001b8,in_stack_000000f8,uStack0000000000000118._4_4_);
      func_0x00584c34(auStack_7ffffffe + 0x8000066e,in_stack_000000f8,uVar6,&uStack00000000000001b8)
      ;
      func_0x004ce364(auStack_7ffffffe + 0x8000066e);
      if (lVar28 != 0) {
        func_0x00187bd4(lVar54,lVar28 * 0x28,8);
      }
      in_stack_00000678 = (dword *)func_0x00187bd0(0x50,8);
      if (in_stack_00000678 != (dword *)0x0) {
        *in_stack_00000678 = uStack0000000000000138._4_4_;
        *(long *)(in_stack_00000678 + 2) = 0;
        *(long *)(in_stack_00000678 + 4) = 8;
        *(long *)(in_stack_00000678 + 6) = 0;
        *(undefined1 *)(in_stack_00000678 + 8) = 1;
        in_stack_00000678[10] = (int)extraout_x1;
        *(long *)(in_stack_00000678 + 0xc) = 0;
        *(long *)(in_stack_00000678 + 0xe) = 8;
        *(long *)(in_stack_00000678 + 0x10) = 0;
        *(undefined1 *)(in_stack_00000678 + 0x12) = 2;
        in_stack_00000670 = 2;
        in_stack_00000680 = 2;
        func_0x00584c34(auStack_7ffffffe + 0x8000052e,in_stack_000000f8,uStack0000000000000118._4_4_
                        ,auStack_7ffffffe + 0x8000066e);
        func_0x004ce364(auStack_7ffffffe + 0x8000052e);
        unaff_x27 = (long *)(auStack_7ffffffe + 0x8000066e);
        unaff_x23 = extraout_x1;
        in_stack_00000690 = in_stack_00000530;
        in_stack_00000698 = in_stack_00000538;
        in_stack_000006a0 = in_stack_00000540;
        in_stack_000006a8 = in_stack_00000548;
        if (in_stack_00000530 != 0) {
          func_0x00187bd4(in_stack_00000538,in_stack_00000530 * 0x28,8);
        }
        goto LAB_004c286c;
      }
      func_0x007a1f18(8,0x50);
    }
  }
  goto LAB_004c5940;
  while (auVar61._8_4_ != uStack0000000000000138._4_4_) {
code_r0x004c2b00:
    auVar61 = func_0x004d3904(auStack_7ffffffe + 0x8000066e);
    in_stack_00000678 = unaff_x22;
    if ((auVar61._0_8_ & 1) == 0) goto code_r0x004c2b20;
  }
  unaff_x27 = (long *)(auStack_7ffffffe + 0x8000066e);
  goto code_r0x004c2980;
  while (auVar61._8_4_ != uStack0000000000000118._4_4_) {
code_r0x004c2ba8:
    auVar61 = func_0x004d3904(auStack_7ffffffe + 0x8000066e);
    if ((auVar61._0_8_ & 1) == 0) {
      unaff_x27 = (long *)(auStack_7ffffffe + 0x8000066e);
      in_stack_00000678 = unaff_x22;
      goto code_r0x004c2980;
    }
  }
  lVar16 = 0;
  while( true ) {
    uVar20 = uVar20 & uVar29;
    uVar6 = *(undefined8 *)(lVar28 + uVar20);
    bVar47 = (byte)((ulong)uVar6 >> 8);
    bVar57 = (byte)((ulong)uVar6 >> 0x10);
    bVar49 = (byte)((ulong)uVar6 >> 0x18);
    bVar50 = (byte)((ulong)uVar6 >> 0x20);
    bVar51 = (byte)((ulong)uVar6 >> 0x28);
    bVar52 = (byte)((ulong)uVar6 >> 0x30);
    bVar53 = (byte)((ulong)uVar6 >> 0x38);
    for (uVar22 = CONCAT17(-(bVar53 == bVar13),
                           CONCAT16(-(bVar52 == bVar13),
                                    CONCAT15(-(bVar51 == bVar13),
                                             CONCAT14(-(bVar50 == bVar13),
                                                      CONCAT13(-(bVar49 == bVar13),
                                                               CONCAT12(-(bVar57 == bVar13),
                                                                        CONCAT11(-(bVar47 == bVar13)
                                                                                 ,-((byte)uVar6 ==
                                                                                   bVar13)))))))) &
                  0x8080808080808080; uVar22 != 0; uVar22 = uVar22 - 1 & uVar22) {
      uVar26 = (uVar22 >> 7 & 0xff00ff00ff00ff00) >> 8 | (uVar22 >> 7 & 0xff00ff00ff00ff) << 8;
      uVar26 = (uVar26 & 0xffff0000ffff0000) >> 0x10 | (uVar26 & 0xffff0000ffff) << 0x10;
      unaff_x27 = (long *)(auStack_7ffffffe + 0x8000066e);
      if (uVar40 == *(uint *)(lVar15 + (uVar20 + ((ulong)LZCOUNT(uVar26 >> 0x20 | uVar26 << 0x20) >>
                                                 3) & uVar29) * -8)) {
        in_stack_00000670 = CONCAT44(uVar39,1);
        goto code_r0x004c2c58;
      }
    }
    bVar47 = NEON_umaxv(CONCAT17(-(bVar53 == 0xff),
                                 CONCAT16(-(bVar52 == 0xff),
                                          CONCAT15(-(bVar51 == 0xff),
                                                   CONCAT14(-(bVar50 == 0xff),
                                                            CONCAT13(-(bVar49 == 0xff),
                                                                     CONCAT12(-(bVar57 == 0xff),
                                                                              CONCAT11(-(bVar47 ==
                                                                                        0xff),-((
                                                  byte)uVar6 == 0xff)))))))),1);
    unaff_x27 = (long *)(auStack_7ffffffe + 0x8000066e);
    in_stack_00000678 = unaff_x22;
    if ((bVar47 & 1) != 0) break;
    lVar16 = lVar16 + 8;
    uVar20 = uVar20 + lVar16;
  }
  goto code_r0x004c2980;
code_r0x004c2c58:
  auVar61 = func_0x004d3904(auStack_7ffffffe + 0x8000066e);
  in_stack_00000678 = unaff_x22;
  if ((auVar61._0_8_ & 1) == 0) goto code_r0x004c2980;
  if (auVar61._8_4_ == uVar43) {
    func_0x00584800(auStack_7ffffffe + 0x8000066e,in_stack_000000f8,uStack0000000000000138._4_4_);
    plVar7 = (long *)(in_stack_00000680 & 0xffffffff);
    if (unaff_x22 <= plVar7) {
      plVar55 = (long *)(in_stack_00000680 >> 0x20);
      goto joined_r0x004c2ef8;
    }
    lVar14 = in_stack_00000670 + (long)plVar7 * 0x30;
    plVar7 = (long *)(ulong)*(uint *)(lVar14 + 0x20);
    iVar24 = *(int *)(lVar14 + 0x2c);
    goto code_r0x004c2f24;
  }
  goto code_r0x004c2c58;
LAB_004c3920:
  bVar5 = true;
LAB_004c3924:
  func_0x0058485c(auStack_7ffffffe + 0x8000066e,in_stack_000000f8,uVar45);
  plVar33 = (long *)(in_stack_00000680 & 0xffffffff);
  plVar30 = (long *)(ulong)uVar42;
  if (in_stack_00000088 == 0) {
    do {
      for (; plVar33 < in_stack_00000678;
          plVar33 = (long *)(ulong)*(uint *)(in_stack_00000670 + (long)plVar33 * 0x30 + 0x20)) {
      }
      do {
        if (in_stack_00000678 <= plVar30) goto LAB_004c3d4c;
        lVar48 = in_stack_00000670 + (long)plVar30 * 0x30;
        plVar30 = (long *)(ulong)*(uint *)(lVar48 + 0x24);
      } while (*(uint *)(lVar48 + 0x28) == uVar65);
    } while( true );
  }
  uVar22 = (ulong)uVar63 | 0x400000000000000;
  uVar40 = uVar22 ^ uVar25;
  uVar20 = uVar40 + uVar19 ^ (uVar40 >> 0x30 | uVar40 << 0x10);
  uVar40 = uVar40 + lVar15;
  uVar27 = uVar40 ^ uVar17;
  uVar26 = uVar20 + uVar31 ^ (uVar20 >> 0x2b | uVar20 << 0x15);
  uVar22 = (uVar20 + uVar31 ^ uVar22) + uVar27;
  uVar27 = uVar22 ^ (uVar27 >> 0x33 | uVar27 << 0xd);
  uVar40 = ((uVar40 >> 0x20 | uVar40 << 0x20) ^ 0xff) + uVar26;
  uVar20 = uVar27 + uVar40;
  uVar40 = uVar40 ^ (uVar26 >> 0x30 | uVar26 << 0x10);
  uVar27 = uVar20 ^ (uVar27 >> 0x2f | uVar27 << 0x11);
  uVar22 = uVar40 + (uVar22 >> 0x20 | uVar22 << 0x20);
  uVar26 = uVar27 + uVar22;
  uVar22 = uVar22 ^ (uVar40 >> 0x2b | uVar40 << 0x15);
  uVar27 = uVar26 ^ (uVar27 >> 0x33 | uVar27 << 0xd);
  uVar40 = uVar22 + (uVar20 >> 0x20 | uVar20 << 0x20);
  uVar20 = uVar27 + uVar40;
  uVar40 = uVar40 ^ (uVar22 >> 0x30 | uVar22 << 0x10);
  uVar27 = uVar20 ^ (uVar27 >> 0x2f | uVar27 << 0x11);
  uVar22 = uVar40 + (uVar26 >> 0x20 | uVar26 << 0x20);
  uVar26 = uVar22 ^ (uVar40 >> 0x2b | uVar40 << 0x15);
  uVar27 = uVar27 + uVar22 ^ (uVar27 >> 0x33 | uVar27 << 0xd);
  uVar40 = uVar26 + (uVar20 >> 0x20 | uVar20 << 0x20);
  uVar22 = uVar27 + uVar40;
  uVar40 = uVar40 ^ (uVar26 >> 0x30 | uVar26 << 0x10);
  uVar22 = (uVar27 >> 0x2f | uVar27 << 0x11) ^ (uVar40 >> 0x2b | uVar40 << 0x15) ^
           (uVar22 >> 0x20 | uVar22 << 0x20) ^ uVar22;
  bVar13 = (byte)(uVar22 >> 0x39);
LAB_004c3a0c:
  do {
    if (plVar33 < in_stack_00000678) {
      lVar48 = in_stack_00000670 + (long)plVar33 * 0x30;
      plVar33 = (long *)(ulong)*(uint *)(lVar48 + 0x20);
      uVar42 = *(uint *)(lVar48 + 0x2c);
    }
    else {
      do {
        if (in_stack_00000678 <= plVar30) goto LAB_004c3d4c;
        lVar48 = in_stack_00000670 + (long)plVar30 * 0x30;
        plVar30 = (long *)(ulong)*(uint *)(lVar48 + 0x24);
        uVar42 = *(uint *)(lVar48 + 0x28);
      } while (uVar42 == uVar65);
    }
    if (uVar42 != uVar2) {
      lVar48 = 0;
      uVar40 = uVar22;
      while( true ) {
        uVar40 = uVar40 & uVar23;
        uVar6 = *(undefined8 *)(lVar16 + uVar40);
        bVar47 = (byte)((ulong)uVar6 >> 8);
        bVar57 = (byte)((ulong)uVar6 >> 0x10);
        bVar49 = (byte)((ulong)uVar6 >> 0x18);
        bVar50 = (byte)((ulong)uVar6 >> 0x20);
        bVar51 = (byte)((ulong)uVar6 >> 0x28);
        bVar52 = (byte)((ulong)uVar6 >> 0x30);
        bVar53 = (byte)((ulong)uVar6 >> 0x38);
        for (uVar20 = CONCAT17(-(bVar53 == bVar13),
                               CONCAT16(-(bVar52 == bVar13),
                                        CONCAT15(-(bVar51 == bVar13),
                                                 CONCAT14(-(bVar50 == bVar13),
                                                          CONCAT13(-(bVar49 == bVar13),
                                                                   CONCAT12(-(bVar57 == bVar13),
                                                                            CONCAT11(-(bVar47 ==
                                                                                      bVar13),-((
                                                  byte)uVar6 == bVar13)))))))) & 0x8080808080808080;
            uVar20 != 0; uVar20 = uVar20 - 1 & uVar20) {
          uVar26 = (uVar20 >> 7 & 0xff00ff00ff00ff00) >> 8 | (uVar20 >> 7 & 0xff00ff00ff00ff) << 8;
          uVar26 = (uVar26 & 0xffff0000ffff0000) >> 0x10 | (uVar26 & 0xffff0000ffff) << 0x10;
          if (uVar63 == *(uint *)(lVar18 + (uVar40 + ((ulong)LZCOUNT(uVar26 >> 0x20 | uVar26 << 0x20
                                                                    ) >> 3) & uVar23) * -8)) {
            uVar40 = (ulong)uVar63;
            goto LAB_004c3b60;
          }
        }
        bVar47 = NEON_umaxv(CONCAT17(-(bVar53 == 0xff),
                                     CONCAT16(-(bVar52 == 0xff),
                                              CONCAT15(-(bVar51 == 0xff),
                                                       CONCAT14(-(bVar50 == 0xff),
                                                                CONCAT13(-(bVar49 == 0xff),
                                                                         CONCAT12(-(bVar57 == 0xff),
                                                                                  CONCAT11(-(bVar47 
                                                  == 0xff),-((byte)uVar6 == 0xff)))))))),1);
        if ((bVar47 & 1) != 0) break;
        lVar48 = lVar48 + 8;
        uVar40 = uVar40 + lVar48;
      }
    }
  } while( true );
LAB_004c3568:
  do {
    uVar34 = (uint)uVar40;
    if (uVar34 == uVar41) {
      if (uVar41 == uVar35) {
LAB_004c3650:
        bVar5 = false;
        goto LAB_004c3924;
      }
      break;
    }
    lVar48 = 0;
    uVar20 = uVar40 & 0xffffffff ^ uVar8;
    uVar26 = uVar20 + uVar19 ^ (uVar8 >> 0x30 | uVar20 << 0x10);
    uVar20 = uVar20 + lVar15;
    uVar32 = uVar20 ^ uVar17;
    uVar27 = uVar26 + uVar31 ^ (uVar26 >> 0x2b | uVar26 << 0x15);
    uVar40 = (uVar26 + uVar31 ^ (uVar40 & 0xffffffff | 0x400000000000000)) + uVar32;
    uVar32 = uVar40 ^ (uVar32 >> 0x33 | uVar32 << 0xd);
    uVar20 = ((uVar20 >> 0x20 | uVar20 << 0x20) ^ 0xff) + uVar27;
    uVar26 = uVar32 + uVar20;
    uVar20 = uVar20 ^ (uVar27 >> 0x30 | uVar27 << 0x10);
    uVar32 = uVar26 ^ (uVar32 >> 0x2f | uVar32 << 0x11);
    uVar40 = uVar20 + (uVar40 >> 0x20 | uVar40 << 0x20);
    uVar27 = uVar32 + uVar40;
    uVar40 = uVar40 ^ (uVar20 >> 0x2b | uVar20 << 0x15);
    uVar32 = uVar27 ^ (uVar32 >> 0x33 | uVar32 << 0xd);
    uVar20 = uVar40 + (uVar26 >> 0x20 | uVar26 << 0x20);
    uVar26 = uVar32 + uVar20;
    uVar20 = uVar20 ^ (uVar40 >> 0x30 | uVar40 << 0x10);
    uVar32 = uVar26 ^ (uVar32 >> 0x2f | uVar32 << 0x11);
    uVar40 = uVar20 + (uVar27 >> 0x20 | uVar27 << 0x20);
    uVar37 = uVar40 ^ (uVar20 >> 0x2b | uVar20 << 0x15);
    uVar27 = uVar32 + uVar40 ^ (uVar32 >> 0x33 | uVar32 << 0xd);
    uVar20 = uVar37 + (uVar26 >> 0x20 | uVar26 << 0x20);
    uVar40 = uVar27 + uVar20;
    uVar20 = uVar20 ^ (uVar37 >> 0x30 | uVar37 << 0x10);
    uVar40 = (uVar27 >> 0x2f | uVar27 << 0x11) ^ (uVar20 >> 0x2b | uVar20 << 0x15) ^
             (uVar40 >> 0x20 | uVar40 << 0x20) ^ uVar40;
    bVar47 = (byte)(uVar40 >> 0x39);
    while( true ) {
      uVar40 = uVar40 & uVar23;
      uVar6 = *(undefined8 *)(lVar16 + uVar40);
      bVar57 = (byte)((ulong)uVar6 >> 8);
      bVar49 = (byte)((ulong)uVar6 >> 0x10);
      bVar50 = (byte)((ulong)uVar6 >> 0x18);
      bVar51 = (byte)((ulong)uVar6 >> 0x20);
      bVar52 = (byte)((ulong)uVar6 >> 0x28);
      bVar53 = (byte)((ulong)uVar6 >> 0x30);
      bVar58 = (byte)((ulong)uVar6 >> 0x38);
      for (uVar20 = CONCAT17(-(bVar58 == bVar47),
                             CONCAT16(-(bVar53 == bVar47),
                                      CONCAT15(-(bVar52 == bVar47),
                                               CONCAT14(-(bVar51 == bVar47),
                                                        CONCAT13(-(bVar50 == bVar47),
                                                                 CONCAT12(-(bVar49 == bVar47),
                                                                          CONCAT11(-(bVar57 ==
                                                                                    bVar47),-((byte)
                                                  uVar6 == bVar47)))))))) & 0x8080808080808080;
          uVar20 != 0; uVar20 = uVar20 - 1 & uVar20) {
        uVar26 = (uVar20 >> 7 & 0xff00ff00ff00ff00) >> 8 | (uVar20 >> 7 & 0xff00ff00ff00ff) << 8;
        uVar26 = (uVar26 & 0xffff0000ffff0000) >> 0x10 | (uVar26 & 0xffff0000ffff) << 0x10;
        uVar26 = uVar40 + ((ulong)LZCOUNT(uVar26 >> 0x20 | uVar26 << 0x20) >> 3) & uVar23;
        if (uVar34 == *(uint *)(lVar18 + uVar26 * -8)) {
          uVar40 = (ulong)*(uint *)(lVar16 + -4 + uVar26 * -8);
          bVar5 = true;
          goto joined_r0x004c355c;
        }
      }
      bVar57 = NEON_umaxv(CONCAT17(-(bVar58 == 0xff),
                                   CONCAT16(-(bVar53 == 0xff),
                                            CONCAT15(-(bVar52 == 0xff),
                                                     CONCAT14(-(bVar51 == 0xff),
                                                              CONCAT13(-(bVar50 == 0xff),
                                                                       CONCAT12(-(bVar49 == 0xff),
                                                                                CONCAT11(-(bVar57 ==
                                                                                          0xff),-((
                                                  byte)uVar6 == 0xff)))))))),1);
      if ((bVar57 & 1) != 0) break;
      lVar48 = lVar48 + 8;
      uVar40 = uVar40 + lVar48;
    }
    bVar5 = false;
joined_r0x004c355c:
    if (uVar34 == uVar35) goto LAB_004c3650;
  } while (bVar5);
  goto LAB_004c3408;
LAB_004c3d4c:
  bVar36 = true;
LAB_004c3d50:
  func_0x00584800(auStack_7ffffffe + 0x8000066e,in_stack_000000f8,uVar45);
  func_0x004d0228(auStack_7ffffffe + 0x8000040e,auStack_7ffffffe + 0x8000066e,&UNK_009e5910);
  auVar60 = func_0x005847cc(in_stack_000000f8,uVar44);
  uVar6 = auVar60._8_8_;
  lVar48 = auVar60._0_8_;
  if (lVar48 == 0) {
LAB_004c54fc:
    func_0x007a23bc(puStack0000000000000008);
    goto LAB_004c5940;
  }
  if ((*(long *)(lVar48 + 0x10) == 0) ||
     (lVar48 = *(long *)(lVar48 + 8) + *(long *)(lVar48 + 0x10) * 0x108, lVar48 == 0x108)) {
    puStack0000000000000008 = &UNK_009e5f10;
    goto LAB_004c54fc;
  }
  plVar30 = (long *)(lVar48 + -0xe8);
  if (plVar30 == (long *)0x0 || *(long *)(lVar48 + -0xf0) != 0x10) {
    uVar42 = 0;
  }
  else {
    if (uVar62 == uVar45) {
      lVar21 = in_stack_00000420 << 2;
      pdVar9 = in_stack_00000418;
      do {
        if (lVar21 == 0) {
          if (!bVar5) {
            in_stack_00000688 = func_0x00187bd0(0x108,8);
            uVar6 = 0x108;
            if (in_stack_00000688 == 0) goto LAB_004c4fe0;
            *(undefined8 *)(in_stack_00000688 + 0x18) = 0x1c;
            auVar60 = func_0x00187bd0(0x28,8);
            plVar33 = auVar60._0_8_;
            if (plVar33 != (long *)0x0) {
              plVar33[1] = (long)pdVar3;
              *plVar33 = lVar14;
              plVar33[3] = in_stack_00000688;
              plVar33[2] = 1;
              plVar33[4] = 1;
              puVar10 = (undefined8 *)(lVar48 + -0xa8);
              lVar21 = *(long *)*puVar10;
              *(long *)*puVar10 = lVar21 + -1;
              LORelease();
              if (lVar21 == 1) {
                in_xzr = *(undefined8 *)*puVar10;
                func_0x005d2c74(puVar10);
                auVar60._8_8_ = extraout_x1_01;
                auVar60._0_8_ = plVar33;
              }
              goto LAB_004c3f5c;
            }
            func_0x007a1f18(8,0x28);
            goto LAB_004c5940;
          }
          break;
        }
        uVar42 = *pdVar9;
        lVar21 = lVar21 + -4;
        pdVar9 = pdVar9 + 1;
      } while (uVar42 != uVar2);
    }
    bVar5 = false;
    if (uVar62 == uVar43) {
      bVar5 = bVar38;
    }
    if (bVar5) {
      in_stack_00000688 = func_0x00187bd0(0x108,8);
      uVar6 = 0x108;
      if (in_stack_00000688 == 0) goto LAB_004c4fe0;
      *(undefined8 *)(in_stack_00000688 + 0x18) = 0x1d;
      auVar60 = func_0x00187bd0(0x28,8);
      plVar33 = auVar60._0_8_;
      if (plVar33 == (long *)0x0) {
        func_0x007a1f18(8,0x28);
        goto LAB_004c5940;
      }
      plVar33[1] = (long)pdVar3;
      *plVar33 = lVar14;
      plVar33[3] = in_stack_00000688;
      plVar33[2] = 1;
      plVar33[4] = 1;
      puVar10 = (undefined8 *)(lVar48 + -0xa8);
      lVar21 = *(long *)*puVar10;
      *(long *)*puVar10 = lVar21 + -1;
      LORelease();
      if (lVar21 == 1) {
        in_xzr = *(undefined8 *)*puVar10;
        func_0x005d2c74(puVar10);
        auVar60._8_8_ = extraout_x1_00;
        auVar60._0_8_ = plVar33;
      }
LAB_004c3f5c:
      uVar6 = auVar60._8_8_;
      in_stack_00000690 = 1;
      in_stack_00000680 = 1;
      *(long *)(lVar48 + -0xa8) = auVar60._0_8_;
      uVar42 = 1;
      in_stack_00000678 = pdVar3;
      in_stack_00000670 = lVar14;
    }
    else {
      uVar42 = 0;
    }
    if (uVar63 == uVar45) {
      lVar21 = in_stack_00000420 << 2;
      pdVar9 = in_stack_00000418;
      do {
        if (lVar21 == 0) {
          if (!bVar36) {
            in_stack_00000688 = func_0x00187bd0(0x108,8);
            uVar6 = 0x108;
            if (in_stack_00000688 == 0) goto LAB_004c4fe0;
            *(undefined8 *)(in_stack_00000688 + 0x18) = 0x1c;
            auVar59 = func_0x00187bd0(0x28,8);
            plVar33 = auVar59._0_8_;
            if (plVar33 != (long *)0x0) {
              plVar33[1] = (long)pdVar3;
              *plVar33 = lVar14;
              plVar33[3] = in_stack_00000688;
              plVar33[2] = 1;
              plVar33[4] = 1;
              puVar10 = (undefined8 *)(lVar48 + -0xa0);
              lVar21 = *(long *)*puVar10;
              *(long *)*puVar10 = lVar21 + -1;
              LORelease();
              if (lVar21 == 1) {
                in_xzr = *(undefined8 *)*puVar10;
                func_0x005d2c74(puVar10);
                auVar59._8_8_ = extraout_x1_03;
                auVar59._0_8_ = plVar33;
              }
              goto code_r0x004c40dc;
            }
            func_0x007a1f18(8,0x28);
            goto LAB_004c5940;
          }
          break;
        }
        uVar45 = *pdVar9;
        lVar21 = lVar21 + -4;
        pdVar9 = pdVar9 + 1;
      } while (uVar45 != uVar2);
    }
    bVar5 = false;
    if (uVar63 == uVar43) {
      bVar5 = bVar38;
    }
    if (bVar5) {
      in_stack_00000688 = func_0x00187bd0(0x108,8);
      uVar6 = 0x108;
      if (in_stack_00000688 == 0) goto LAB_004c4fe0;
      *(undefined8 *)(in_stack_00000688 + 0x18) = 0x1d;
      auVar59 = func_0x00187bd0(0x28,8);
      plVar33 = auVar59._0_8_;
      if (plVar33 == (long *)0x0) {
        func_0x007a1f18(8,0x28);
        goto LAB_004c5940;
      }
      plVar33[1] = (long)pdVar3;
      *plVar33 = lVar14;
      plVar33[3] = in_stack_00000688;
      plVar33[2] = 1;
      plVar33[4] = 1;
      puVar10 = (undefined8 *)(lVar48 + -0xa0);
      lVar21 = *(long *)*puVar10;
      *(long *)*puVar10 = lVar21 + -1;
      LORelease();
      if (lVar21 == 1) {
        in_xzr = *(undefined8 *)*puVar10;
        func_0x005d2c74(puVar10);
        auVar59._8_8_ = extraout_x1_02;
        auVar59._0_8_ = plVar33;
      }
code_r0x004c40dc:
      uVar6 = auVar59._8_8_;
      in_stack_00000690 = 1;
      in_stack_00000680 = 1;
      *(long *)(lVar48 + -0xa0) = auVar59._0_8_;
      uVar42 = 1;
      in_stack_00000670 = lVar14;
      in_stack_00000678 = pdVar3;
    }
    lVar21 = *(long *)(lVar48 + -0xa8);
    pcVar46 = (char *)(lVar21 + 8);
    if (*pcVar46 == '\0') {
      *pcVar46 = '\x01';
    }
    else {
      func_0x007aff64(pcVar46,uVar6,1000000000);
      uVar6 = extraout_x1_04;
    }
    cVar1 = *pcVar46;
    if (cVar1 == '\x01') {
      *pcVar46 = (char)in_xzr;
    }
    bVar5 = cVar1 == '\x01';
    if (*(long *)(lVar21 + 0x20) == 0) {
code_r0x004c4154:
      if (!bVar5) {
        func_0x007b05dc(pcVar46,0);
        uVar6 = extraout_x1_05;
      }
      lVar21 = *(long *)(lVar48 + -0xa8);
      pcVar46 = (char *)(lVar21 + 8);
      if (*pcVar46 == '\0') {
        *pcVar46 = '\x01';
      }
      else {
        func_0x007aff64(pcVar46,uVar6,1000000000);
        uVar6 = extraout_x1_06;
      }
      cVar1 = *pcVar46;
      if (cVar1 == '\x01') {
        *pcVar46 = (char)in_xzr;
      }
      bVar5 = cVar1 == '\x01';
      if (*(long *)(lVar21 + 0x20) == 0) {
        if (!bVar5) {
          func_0x007b05dc(pcVar46,0);
          uVar6 = extraout_x1_12;
        }
        lVar21 = *(long *)(lVar48 + -0xa0);
        pcVar46 = (char *)(lVar21 + 8);
        if (*pcVar46 == '\0') {
          *pcVar46 = '\x01';
        }
        else {
          func_0x007aff64(pcVar46,uVar6,1000000000);
          uVar6 = extraout_x1_13;
        }
        cVar1 = *pcVar46;
        if (cVar1 == '\x01') {
          *pcVar46 = (char)in_xzr;
        }
        bVar5 = cVar1 == '\x01';
        if (*(long *)(lVar21 + 0x20) != 0) {
          if (!bVar5) {
            func_0x007b05dc(pcVar46,0);
          }
          func_0x004bd098(auStack_7ffffffe + 0x8000066e,plVar30);
          func_0x005cb804(auStack_7ffffffe + 0x8000066e,0);
          func_0x005cb1c8(auStack_7ffffffe + 0x8000066e);
          func_0x004bb4f4(plVar30);
          *(dword **)(lVar48 + -0xe0) = in_stack_00000678;
          *plVar30 = in_stack_00000670;
          *(ulong *)(lVar48 + -0xd0) = in_stack_00000688;
          *(ulong *)(lVar48 + -0xd8) = in_stack_00000680;
          *(long *)(lVar48 + -0xc0) = in_stack_00000698;
          *(long *)(lVar48 + -200) = in_stack_00000690;
          *(long *)(lVar48 + -0xb0) = in_stack_000006a8;
          *(long *)(lVar48 + -0xb8) = in_stack_000006a0;
          uVar6 = *(undefined8 *)(lVar48 + -0xa8);
          *(undefined8 *)(lVar48 + -0xa8) = *(undefined8 *)(lVar48 + -0xa0);
          *(undefined8 *)(lVar48 + -0xa0) = uVar6;
          in_stack_00000678 = (dword *)func_0x00187bd0(0x28,8);
          uVar6 = 0x28;
          if (in_stack_00000678 == (dword *)0x0) {
LAB_004c4fe0:
            func_0x007a1f18(8,uVar6);
            goto LAB_004c5940;
          }
          *in_stack_00000678 = uVar62;
          *(long *)(in_stack_00000678 + 2) = 0;
          *(long *)(in_stack_00000678 + 4) = 8;
          *(long *)(in_stack_00000678 + 6) = 0;
          *(undefined1 *)(in_stack_00000678 + 8) = 0;
          func_0x00584c34(&uStack00000000000001f0,in_stack_000000f8,uVar44,
                          auStack_7ffffffe + 0x8000066e);
          func_0x004ce364(&uStack00000000000001f0);
          goto code_r0x004c43a4;
        }
      }
      if (!bVar5) {
        func_0x007b05dc(pcVar46,0);
        uVar6 = extraout_x1_09;
      }
      lVar21 = *(long *)(lVar48 + -0xa8);
      pcVar46 = (char *)(lVar21 + 8);
      if (*pcVar46 == '\0') {
        *pcVar46 = '\x01';
      }
      else {
        func_0x007aff64(pcVar46,uVar6,1000000000);
        uVar6 = extraout_x1_10;
      }
      cVar1 = *pcVar46;
      if (cVar1 == '\x01') {
        *pcVar46 = (char)in_xzr;
      }
      bVar5 = cVar1 == '\x01';
      if (*(long *)(lVar21 + 0x20) != 0) {
        if (!bVar5) {
          func_0x007b05dc(pcVar46,0);
          uVar6 = extraout_x1_11;
        }
        lVar48 = *(long *)(lVar48 + -0xa0);
        pcVar46 = (char *)(lVar48 + 8);
        if (*pcVar46 == '\0') {
          *pcVar46 = '\x01';
        }
        else {
          func_0x007aff64(pcVar46,uVar6,1000000000);
        }
        cVar1 = *pcVar46;
        if (cVar1 == '\x01') {
          *pcVar46 = (char)in_xzr;
        }
        bVar5 = cVar1 == '\x01';
        if (*(long *)(lVar48 + 0x20) != 0) {
          if (!bVar5) {
            func_0x007b05dc(pcVar46,0);
          }
          func_0x0058497c(auStack_7ffffffe + 0x8000066e,in_stack_000000f8,uVar44);
          func_0x004ce364(auStack_7ffffffe + 0x8000066e);
          if (in_stack_00000670 != 0) {
            pdVar9 = in_stack_00000678;
            lVar48 = in_stack_00000670;
            goto code_r0x004c43b4;
          }
          goto code_r0x004c43c4;
        }
      }
      if (!bVar5) {
        func_0x007b05dc(pcVar46,0);
      }
    }
    else {
      if (!bVar5) {
        func_0x007b05dc(pcVar46,0);
        uVar6 = extraout_x1_07;
      }
      lVar21 = *(long *)(lVar48 + -0xa0);
      pcVar46 = (char *)(lVar21 + 8);
      if (*pcVar46 == '\0') {
        *pcVar46 = '\x01';
      }
      else {
        func_0x007aff64(pcVar46,uVar6,1000000000);
        uVar6 = extraout_x1_08;
      }
      cVar1 = *pcVar46;
      if (cVar1 == '\x01') {
        *pcVar46 = (char)in_xzr;
      }
      bVar5 = cVar1 == '\x01';
      if (*(long *)(lVar21 + 0x20) != 0) goto code_r0x004c4154;
      if (!bVar5) {
        func_0x007b05dc(pcVar46,0);
      }
      in_stack_00000678 = (dword *)func_0x00187bd0(0x28,8);
      uVar6 = 0x28;
      if (in_stack_00000678 == (dword *)0x0) goto LAB_004c4fe0;
      *in_stack_00000678 = uVar63;
      *(long *)(in_stack_00000678 + 2) = 0;
      *(long *)(in_stack_00000678 + 4) = 8;
      *(long *)(in_stack_00000678 + 6) = 0;
      *(undefined1 *)(in_stack_00000678 + 8) = 0;
      func_0x00584c34(&uStack00000000000001f0,in_stack_000000f8,uVar44,auStack_7ffffffe + 0x8000066e
                     );
      func_0x004ce364(&uStack00000000000001f0);
code_r0x004c43a4:
      in_stack_00000680 = 1;
      in_stack_00000670 = 1;
      if (uStack00000000000001f0 != 0) {
        pdVar9 = in_stack_000001f8;
        lVar48 = uStack00000000000001f0;
code_r0x004c43b4:
        func_0x00187bd4(pdVar9,lVar48 * 0x28,8);
      }
code_r0x004c43c4:
      uVar42 = 1;
    }
  }
  if (in_stack_00000410 != 0) {
    func_0x00187bd4(in_stack_00000418,in_stack_00000410 << 2,4);
  }
  goto code_r0x004c3298;
LAB_004c3b60:
  do {
    uVar35 = (uint)uVar40;
    if (uVar35 == uVar41) {
      if (uVar41 == uVar42) {
code_r0x004c3c48:
        bVar36 = false;
        goto LAB_004c3d50;
      }
      break;
    }
    lVar48 = 0;
    uVar20 = uVar40 & 0xffffffff ^ uVar8;
    uVar26 = uVar20 + uVar19 ^ (uVar8 >> 0x30 | uVar20 << 0x10);
    uVar20 = uVar20 + lVar15;
    uVar32 = uVar20 ^ uVar17;
    uVar27 = uVar26 + uVar31 ^ (uVar26 >> 0x2b | uVar26 << 0x15);
    uVar40 = (uVar26 + uVar31 ^ (uVar40 & 0xffffffff | 0x400000000000000)) + uVar32;
    uVar32 = uVar40 ^ (uVar32 >> 0x33 | uVar32 << 0xd);
    uVar20 = ((uVar20 >> 0x20 | uVar20 << 0x20) ^ 0xff) + uVar27;
    uVar26 = uVar32 + uVar20;
    uVar20 = uVar20 ^ (uVar27 >> 0x30 | uVar27 << 0x10);
    uVar32 = uVar26 ^ (uVar32 >> 0x2f | uVar32 << 0x11);
    uVar40 = uVar20 + (uVar40 >> 0x20 | uVar40 << 0x20);
    uVar27 = uVar32 + uVar40;
    uVar40 = uVar40 ^ (uVar20 >> 0x2b | uVar20 << 0x15);
    uVar32 = uVar27 ^ (uVar32 >> 0x33 | uVar32 << 0xd);
    uVar20 = uVar40 + (uVar26 >> 0x20 | uVar26 << 0x20);
    uVar26 = uVar32 + uVar20;
    uVar20 = uVar20 ^ (uVar40 >> 0x30 | uVar40 << 0x10);
    uVar32 = uVar26 ^ (uVar32 >> 0x2f | uVar32 << 0x11);
    uVar40 = uVar20 + (uVar27 >> 0x20 | uVar27 << 0x20);
    uVar37 = uVar40 ^ (uVar20 >> 0x2b | uVar20 << 0x15);
    uVar27 = uVar32 + uVar40 ^ (uVar32 >> 0x33 | uVar32 << 0xd);
    uVar20 = uVar37 + (uVar26 >> 0x20 | uVar26 << 0x20);
    uVar40 = uVar27 + uVar20;
    uVar20 = uVar20 ^ (uVar37 >> 0x30 | uVar37 << 0x10);
    uVar40 = (uVar27 >> 0x2f | uVar27 << 0x11) ^ (uVar20 >> 0x2b | uVar20 << 0x15) ^
             (uVar40 >> 0x20 | uVar40 << 0x20) ^ uVar40;
    bVar47 = (byte)(uVar40 >> 0x39);
    while( true ) {
      uVar40 = uVar40 & uVar23;
      uVar6 = *(undefined8 *)(lVar16 + uVar40);
      bVar57 = (byte)((ulong)uVar6 >> 8);
      bVar49 = (byte)((ulong)uVar6 >> 0x10);
      bVar50 = (byte)((ulong)uVar6 >> 0x18);
      bVar51 = (byte)((ulong)uVar6 >> 0x20);
      bVar52 = (byte)((ulong)uVar6 >> 0x28);
      bVar53 = (byte)((ulong)uVar6 >> 0x30);
      bVar58 = (byte)((ulong)uVar6 >> 0x38);
      for (uVar20 = CONCAT17(-(bVar58 == bVar47),
                             CONCAT16(-(bVar53 == bVar47),
                                      CONCAT15(-(bVar52 == bVar47),
                                               CONCAT14(-(bVar51 == bVar47),
                                                        CONCAT13(-(bVar50 == bVar47),
                                                                 CONCAT12(-(bVar49 == bVar47),
                                                                          CONCAT11(-(bVar57 ==
                                                                                    bVar47),-((byte)
                                                  uVar6 == bVar47)))))))) & 0x8080808080808080;
          uVar20 != 0; uVar20 = uVar20 - 1 & uVar20) {
        uVar26 = (uVar20 >> 7 & 0xff00ff00ff00ff00) >> 8 | (uVar20 >> 7 & 0xff00ff00ff00ff) << 8;
        uVar26 = (uVar26 & 0xffff0000ffff0000) >> 0x10 | (uVar26 & 0xffff0000ffff) << 0x10;
        uVar26 = uVar40 + ((ulong)LZCOUNT(uVar26 >> 0x20 | uVar26 << 0x20) >> 3) & uVar23;
        if (uVar35 == *(uint *)(lVar18 + uVar26 * -8)) {
          uVar40 = (ulong)*(uint *)(lVar16 + -4 + uVar26 * -8);
          bVar36 = true;
          goto joined_r0x004c3b54;
        }
      }
      bVar57 = NEON_umaxv(CONCAT17(-(bVar58 == 0xff),
                                   CONCAT16(-(bVar53 == 0xff),
                                            CONCAT15(-(bVar52 == 0xff),
                                                     CONCAT14(-(bVar51 == 0xff),
                                                              CONCAT13(-(bVar50 == 0xff),
                                                                       CONCAT12(-(bVar49 == 0xff),
                                                                                CONCAT11(-(bVar57 ==
                                                                                          0xff),-((
                                                  byte)uVar6 == 0xff)))))))),1);
      if ((bVar57 & 1) != 0) break;
      lVar48 = lVar48 + 8;
      uVar40 = uVar40 + lVar48;
    }
    bVar36 = false;
joined_r0x004c3b54:
    if (uVar35 == uVar42) goto code_r0x004c3c48;
  } while (bVar36);
  goto LAB_004c3a0c;
code_r0x004c3294:
  uVar42 = 0;
  goto code_r0x004c3298;
  while (auVar61._8_4_ != uVar45) {
code_r0x004c383c:
    auVar61 = func_0x004d3904(&uStack00000000000001f0);
    if ((auVar61._0_8_ & 1) == 0) break;
  }
  in_stack_000001f8 = in_stack_00000080;
  if ((auVar61._0_8_ & 1) != 0) goto code_r0x004c3854;
  goto code_r0x004c376c;
code_r0x004c3854:
  plVar30 = (long *)func_0x005847cc(in_stack_000000f8,uVar44);
  if (plVar30 == (long *)0x0) {
    puStack0000000000000000 = &UNK_009e5ec8;
code_r0x004c53fc:
    func_0x007a23bc(puStack0000000000000000);
    goto LAB_004c5940;
  }
  in_stack_00000688 = 0x1c;
  lVar48 = plVar30[2];
  if (lVar48 == *plVar30) {
    func_0x005bd0a4(plVar30,&UNK_009e5ee0);
  }
  _memcpy(plVar30[1] + lVar48 * 0x108,auStack_7ffffffe + 0x8000066e,0x108);
  plVar30[2] = lVar48 + 1;
code_r0x004c3ccc:
  in_stack_00000670 = 0;
  in_stack_00000678 = &MACH_HEADER.cpusubtype;
  in_stack_00000680 = 0;
  func_0x00584c34(&uStack00000000000001f0,in_stack_000000f8,uVar44,auStack_7ffffffe + 0x8000066e);
  func_0x004ce364(&uStack00000000000001f0);
  if (uStack00000000000001f0 != 0) {
    func_0x00187bd4(in_stack_000001f8,uStack00000000000001f0 * 0x28,8);
  }
  uVar42 = 1;
code_r0x004c3298:
  uVar29 = uVar29 - 1 & uVar29;
  uStack000000000000009c = uStack000000000000009c | uVar42;
  lStack0000000000000090 = lStack0000000000000090 + -1;
  if (lStack0000000000000090 == 0) goto code_r0x004c44e0;
  goto joined_r0x004c32bc;
  while( true ) {
    lVar14 = in_stack_00000670 + (long)plVar55 * 0x30;
    uVar41 = *(uint *)(lVar14 + 0x24);
    plVar55 = (long *)(ulong)uVar41;
    iVar24 = *(int *)(lVar14 + 0x28);
    if (iVar24 != iVar64) break;
joined_r0x004c2ef8:
    if (unaff_x22 <= plVar55) goto code_r0x004c491c;
  }
  in_stack_00000680 = CONCAT44(uVar41,(int)in_stack_00000680);
code_r0x004c2f24:
  if (plVar7 < unaff_x22) {
code_r0x004c491c:
    if (uStack00000000000001d0 != 0) {
      func_0x00187bd4(in_stack_000001d8,uStack00000000000001d0 << 2,4);
    }
    bVar38 = true;
    uVar41 = uStack000000000000009c;
  }
  else {
    plVar7 = (long *)(in_stack_00000680 >> 0x20);
    while (plVar7 < unaff_x22) {
      lVar14 = in_stack_00000670 + (long)plVar7 * 0x30;
      if (*(int *)(lVar14 + 0x28) != iVar64) goto code_r0x004c491c;
      plVar7 = (long *)(ulong)*(uint *)(lVar14 + 0x24);
    }
    if (iVar24 != in_stack_00000028._4_4_) goto code_r0x004c491c;
code_r0x004c2f68:
    func_0x00584800(auStack_7ffffffe + 0x8000066e,in_stack_000000f8,uStack0000000000000138._4_4_);
    uVar41 = uStack0000000000000118._4_4_;
    lVar14 = *unaff_x27;
    uVar17 = unaff_x27[1];
    uVar23 = in_stack_00000680 & 0xffffffff;
    if (uVar23 < uVar17) {
      lVar28 = lVar14 + uVar23 * 0x30;
      uVar23 = (ulong)*(uint *)(lVar28 + 0x20);
      iVar24 = *(int *)(lVar28 + 0x2c);
    }
    else {
      uVar8 = in_stack_00000680 >> 0x20;
      do {
        if (uVar17 <= uVar8) goto code_r0x004c3020;
        lVar28 = lVar14 + uVar8 * 0x30;
        uVar2 = *(uint *)(lVar28 + 0x24);
        uVar8 = (ulong)uVar2;
        iVar24 = *(int *)(lVar28 + 0x28);
      } while (iVar24 == iVar64);
      in_stack_00000680 = CONCAT44(uVar2,(int)in_stack_00000680);
    }
    if (uVar23 < uVar17) {
code_r0x004c3020:
      in_stack_00000670 =
           CONCAT44((int)((ulong)in_stack_00000670 >> 0x20),uStack0000000000000118._4_4_);
      if (in_stack_00000088 != 0) {
        uVar8 = func_0x004aad28(in_stack_00000080 + 8,auStack_7ffffffe + 0x8000066e);
        lVar14 = 0;
        lVar28 = *(long *)in_stack_00000080;
        uVar23 = *(ulong *)(in_stack_00000080 + 2);
        bVar13 = (byte)(uVar8 >> 0x39);
        uVar8 = uVar8 & uVar23;
        uVar6 = *(undefined8 *)(lVar28 + uVar8);
        uVar17 = CONCAT17(-((byte)((ulong)uVar6 >> 0x38) == bVar13),
                          CONCAT16(-((byte)((ulong)uVar6 >> 0x30) == bVar13),
                                   CONCAT15(-((byte)((ulong)uVar6 >> 0x28) == bVar13),
                                            CONCAT14(-((byte)((ulong)uVar6 >> 0x20) == bVar13),
                                                     CONCAT13(-((byte)((ulong)uVar6 >> 0x18) ==
                                                               bVar13),CONCAT12(-((byte)((ulong)
                                                  uVar6 >> 0x10) == bVar13),
                                                  CONCAT11(-((byte)((ulong)uVar6 >> 8) == bVar13),
                                                           -((byte)uVar6 == bVar13)))))))) &
                 0x8080808080808080;
        while( true ) {
          while (uVar17 == 0) {
            bVar47 = NEON_umaxv(CONCAT17(-((char)((ulong)uVar6 >> 0x38) == -1),
                                         CONCAT16(-((char)((ulong)uVar6 >> 0x30) == -1),
                                                  CONCAT15(-((char)((ulong)uVar6 >> 0x28) == -1),
                                                           CONCAT14(-((char)((ulong)uVar6 >> 0x20)
                                                                     == -1),CONCAT13(-((char)((ulong
                                                  )uVar6 >> 0x18) == -1),
                                                  CONCAT12(-((char)((ulong)uVar6 >> 0x10) == -1),
                                                           CONCAT11(-((char)((ulong)uVar6 >> 8) ==
                                                                     -1),-((char)uVar6 == -1))))))))
                                ,1);
            if ((bVar47 & 1) != 0) goto code_r0x004c3104;
            lVar14 = lVar14 + 8;
            uVar8 = uVar8 + lVar14 & uVar23;
            uVar6 = *(undefined8 *)(lVar28 + uVar8);
            uVar17 = CONCAT17(-((byte)((ulong)uVar6 >> 0x38) == bVar13),
                              CONCAT16(-((byte)((ulong)uVar6 >> 0x30) == bVar13),
                                       CONCAT15(-((byte)((ulong)uVar6 >> 0x28) == bVar13),
                                                CONCAT14(-((byte)((ulong)uVar6 >> 0x20) == bVar13),
                                                         CONCAT13(-((byte)((ulong)uVar6 >> 0x18) ==
                                                                   bVar13),CONCAT12(-((byte)((ulong)
                                                  uVar6 >> 0x10) == bVar13),
                                                  CONCAT11(-((byte)((ulong)uVar6 >> 8) == bVar13),
                                                           -((byte)uVar6 == bVar13)))))))) &
                     0x8080808080808080;
          }
          uVar29 = (uVar17 >> 7 & 0xff00ff00ff00ff00) >> 8 | (uVar17 >> 7 & 0xff00ff00ff00ff) << 8;
          uVar29 = (uVar29 & 0xffff0000ffff0000) >> 0x10 | (uVar29 & 0xffff0000ffff) << 0x10;
          if (uVar41 == *(uint *)(lVar28 + -8 +
                                 (uVar8 + ((ulong)LZCOUNT(uVar29 >> 0x20 | uVar29 << 0x20) >> 3) &
                                 uVar23) * -8)) break;
          uVar17 = uVar17 - 1 & uVar17;
        }
        in_stack_00000670 = CONCAT44(uVar41,1);
        unaff_x27[1] = (long)in_stack_00000080;
        do {
          auVar61 = func_0x004d3904(auStack_7ffffffe + 0x8000066e);
          if ((auVar61._0_8_ & 1) == 0) goto code_r0x004c3104;
        } while (auVar61._8_4_ != uVar43);
        goto code_r0x004c30f8;
      }
code_r0x004c3104:
      bVar38 = false;
    }
    else {
      uVar23 = in_stack_00000680 >> 0x20;
      while (uVar23 < uVar17) {
        lVar28 = lVar14 + uVar23 * 0x30;
        if (*(int *)(lVar28 + 0x28) != iVar64) goto code_r0x004c3020;
        uVar23 = (ulong)*(uint *)(lVar28 + 0x24);
      }
      if (iVar24 != in_stack_00000028._4_4_) goto code_r0x004c3020;
code_r0x004c30f8:
      bVar38 = true;
    }
    lVar54 = _UNK_009e58a8;
    lVar28 = _UNK_009e5898;
    plVar7 = _UNK_009e5890;
    *unaff_x27 = in_stack_000001d8;
    unaff_x27[1] = in_stack_000001d8;
    unaff_x27[2] = uStack00000000000001d0;
    unaff_x27[3] = in_stack_000001d8 + in_stack_000001e0 * 4;
    unaff_x27[4] = in_stack_00000188;
    unaff_x27[5] = in_stack_00000188;
    unaff_x27[6] = in_stack_00000180;
    unaff_x27[7] = in_stack_00000188 + in_stack_00000190 * 4;
    func_0x004d1268(auStack_7ffffffe + 0x8000052e,auStack_7ffffffe + 0x8000066e);
    pdVar3 = _UNK_007fc128;
    lVar14 = _UNK_007fc120;
    if (lVar28 == 0) {
      uStack0000000000000018 = 0;
    }
    else {
      uVar17 = lVar28 * 4 + 0xbU & 0xfffffffffffffff8;
      in_stack_00000020 = lVar28 + uVar17 + 9;
      in_stack_00000010 = (long)plVar7 - uVar17;
      uStack0000000000000018 = 8;
    }
    if (lVar54 != 0) {
      lStack0000000000000090 = lVar54;
      lVar16 = *(long *)in_stack_00000080;
      uVar23 = *(ulong *)(in_stack_00000080 + 2);
      lVar18 = lVar16 + -8;
      plVar55 = plVar7 + 1;
      uVar8 = *(ulong *)(in_stack_00000080 + 10);
      uVar29 = uVar8 ^ 0x646f72616e646f6d;
      uVar17 = uVar29 + (*(ulong *)(in_stack_00000080 + 8) ^ 0x736f6d6570736575);
      uVar25 = uVar17 ^ (uVar29 >> 0x33 | uVar29 << 0xd);
      lVar15 = *plVar7;
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
      uVar19 = *(ulong *)(in_stack_00000080 + 8) ^ 0x6c7967656e657261;
      uVar31 = uVar17 >> 0x20 | uVar17 << 0x20;
      lVar15 = uVar19 + uVar25;
      uVar17 = uVar25 >> 0x2f | uVar25 << 0x11;
      uVar41 = in_stack_00000080[0xc];
      uVar25 = uVar8 ^ 0x7465646279746573;
      uVar8 = uVar8 ^ 0x7065646279746573;
      puStack0000000000000000 = &UNK_009e5e98;
      puStack0000000000000008 = &UNK_009e5ef8;
      plVar56 = plVar7;
      uStack00000000000001f0 = uStack00000000000001f0;
joined_r0x004c32bc:
      while (uVar29 == 0) {
        lVar48 = *plVar55;
        plVar56 = plVar56 + -4;
        plVar55 = plVar55 + 1;
        uVar29 = CONCAT17(-(-1 < lVar48),
                          CONCAT16(-(-1 < (char)((ulong)lVar48 >> 0x30)),
                                   CONCAT15(-(-1 < (char)((ulong)lVar48 >> 0x28)),
                                            CONCAT14(-(-1 < (char)((ulong)lVar48 >> 0x20)),
                                                     CONCAT13(-(-1 < (char)((ulong)lVar48 >> 0x18)),
                                                              CONCAT12(-(-1 < (char)((ulong)lVar48
                                                                                    >> 0x10)),
                                                                       CONCAT11(-(-1 < (char)((ulong
                                                  )lVar48 >> 8)),-(-1 < (char)lVar48)))))))) &
                 0x8080808080808080;
      }
      uVar44 = (uVar29 >> 7 & 0xff00ff00ff00ff00) >> 8 | (uVar29 >> 7 & 0xff00ff00ff00ff) << 8;
      uVar44 = (uVar44 & 0xffff0000ffff0000) >> 0x10 | (uVar44 & 0xffff0000ffff) << 0x10;
      uVar2 = *(uint *)((long)plVar56 +
                       (-4 - ((ulong)LZCOUNT(uVar44 >> 0x20 | uVar44 << 0x20) >> 1 & 0x3c)));
      uVar44 = (ulong)uVar2;
      func_0x00584d50(auStack_7ffffffe + 0x8000052e,in_stack_000000f8);
      uVar45 = uStack0000000000000118._4_4_;
      uVar65 = (uint)in_stack_00000688;
      uVar42 = (uint)(in_stack_00000680 >> 0x20);
      if (plVar7 != (long *)0x0) {
        uVar62 = (uint)((ulong)lVar28 >> 0x20);
        uVar63 = (uint)((ulong)in_stack_00000550 >> 0x20);
        func_0x0058485c(auStack_7ffffffe + 0x8000066e,in_stack_000000f8,uStack0000000000000118._4_4_
                       );
        plVar30 = (long *)(in_stack_00000680 & 0xffffffff);
        if (in_stack_00000088 == 0) {
          plVar33 = (long *)(ulong)uVar42;
          do {
            for (; plVar30 < in_stack_00000678;
                plVar30 = (long *)(ulong)*(uint *)(in_stack_00000670 + (long)plVar30 * 0x30 + 0x20))
            {
            }
            do {
              if (in_stack_00000678 <= plVar33) goto LAB_004c3920;
              lVar48 = in_stack_00000670 + (long)plVar33 * 0x30;
              plVar33 = (long *)(ulong)*(uint *)(lVar48 + 0x24);
            } while (*(uint *)(lVar48 + 0x28) == uVar65);
          } while( true );
        }
        uVar22 = (ulong)uVar62 | 0x400000000000000;
        uVar40 = uVar22 ^ uVar25;
        uVar20 = uVar40 + uVar19 ^ (uVar40 >> 0x30 | uVar40 << 0x10);
        uVar40 = uVar40 + lVar15;
        uVar27 = uVar40 ^ uVar17;
        uVar26 = uVar20 + uVar31 ^ (uVar20 >> 0x2b | uVar20 << 0x15);
        uVar22 = (uVar20 + uVar31 ^ uVar22) + uVar27;
        uVar27 = uVar22 ^ (uVar27 >> 0x33 | uVar27 << 0xd);
        uVar40 = ((uVar40 >> 0x20 | uVar40 << 0x20) ^ 0xff) + uVar26;
        uVar20 = uVar27 + uVar40;
        uVar40 = uVar40 ^ (uVar26 >> 0x30 | uVar26 << 0x10);
        uVar27 = uVar20 ^ (uVar27 >> 0x2f | uVar27 << 0x11);
        uVar22 = uVar40 + (uVar22 >> 0x20 | uVar22 << 0x20);
        uVar26 = uVar27 + uVar22;
        uVar22 = uVar22 ^ (uVar40 >> 0x2b | uVar40 << 0x15);
        uVar27 = uVar26 ^ (uVar27 >> 0x33 | uVar27 << 0xd);
        uVar40 = uVar22 + (uVar20 >> 0x20 | uVar20 << 0x20);
        uVar20 = uVar27 + uVar40;
        uVar40 = uVar40 ^ (uVar22 >> 0x30 | uVar22 << 0x10);
        uVar27 = uVar20 ^ (uVar27 >> 0x2f | uVar27 << 0x11);
        uVar22 = uVar40 + (uVar26 >> 0x20 | uVar26 << 0x20);
        uVar26 = uVar22 ^ (uVar40 >> 0x2b | uVar40 << 0x15);
        uVar27 = uVar27 + uVar22 ^ (uVar27 >> 0x33 | uVar27 << 0xd);
        uVar40 = uVar26 + (uVar20 >> 0x20 | uVar20 << 0x20);
        uVar22 = uVar27 + uVar40;
        uVar40 = uVar40 ^ (uVar26 >> 0x30 | uVar26 << 0x10);
        uVar22 = (uVar27 >> 0x2f | uVar27 << 0x11) ^ (uVar40 >> 0x2b | uVar40 << 0x15) ^
                 (uVar22 >> 0x20 | uVar22 << 0x20) ^ uVar22;
        bVar13 = (byte)(uVar22 >> 0x39);
        plVar33 = (long *)(ulong)uVar42;
LAB_004c3408:
        do {
          if (plVar30 < in_stack_00000678) {
            lVar48 = in_stack_00000670 + (long)plVar30 * 0x30;
            plVar30 = (long *)(ulong)*(uint *)(lVar48 + 0x20);
            uVar35 = *(uint *)(lVar48 + 0x2c);
          }
          else {
            do {
              if (in_stack_00000678 <= plVar33) goto LAB_004c3920;
              lVar48 = in_stack_00000670 + (long)plVar33 * 0x30;
              plVar33 = (long *)(ulong)*(uint *)(lVar48 + 0x24);
              uVar35 = *(uint *)(lVar48 + 0x28);
            } while (uVar35 == uVar65);
          }
          if (uVar35 != uVar2) {
            lVar48 = 0;
            uVar40 = uVar22;
            while( true ) {
              uVar40 = uVar40 & uVar23;
              uVar6 = *(undefined8 *)(lVar16 + uVar40);
              bVar47 = (byte)((ulong)uVar6 >> 8);
              bVar57 = (byte)((ulong)uVar6 >> 0x10);
              bVar49 = (byte)((ulong)uVar6 >> 0x18);
              bVar50 = (byte)((ulong)uVar6 >> 0x20);
              bVar51 = (byte)((ulong)uVar6 >> 0x28);
              bVar52 = (byte)((ulong)uVar6 >> 0x30);
              bVar53 = (byte)((ulong)uVar6 >> 0x38);
              for (uVar20 = CONCAT17(-(bVar53 == bVar13),
                                     CONCAT16(-(bVar52 == bVar13),
                                              CONCAT15(-(bVar51 == bVar13),
                                                       CONCAT14(-(bVar50 == bVar13),
                                                                CONCAT13(-(bVar49 == bVar13),
                                                                         CONCAT12(-(bVar57 == bVar13
                                                                                   ),CONCAT11(-(
                                                  bVar47 == bVar13),-((byte)uVar6 == bVar13))))))))
                            & 0x8080808080808080; uVar20 != 0; uVar20 = uVar20 - 1 & uVar20) {
                uVar26 = (uVar20 >> 7 & 0xff00ff00ff00ff00) >> 8 |
                         (uVar20 >> 7 & 0xff00ff00ff00ff) << 8;
                uVar26 = (uVar26 & 0xffff0000ffff0000) >> 0x10 | (uVar26 & 0xffff0000ffff) << 0x10;
                if (uVar62 == *(uint *)(lVar18 + (uVar40 + ((ulong)LZCOUNT(uVar26 >> 0x20 |
                                                                           uVar26 << 0x20) >> 3) &
                                                 uVar23) * -8)) {
                  uVar40 = (ulong)uVar62;
                  goto LAB_004c3568;
                }
              }
              bVar47 = NEON_umaxv(CONCAT17(-(bVar53 == 0xff),
                                           CONCAT16(-(bVar52 == 0xff),
                                                    CONCAT15(-(bVar51 == 0xff),
                                                             CONCAT14(-(bVar50 == 0xff),
                                                                      CONCAT13(-(bVar49 == 0xff),
                                                                               CONCAT12(-(bVar57 ==
                                                                                         0xff),
                                                  CONCAT11(-(bVar47 == 0xff),-((byte)uVar6 == 0xff))
                                                  )))))),1);
              if ((bVar47 & 1) != 0) break;
              lVar48 = lVar48 + 8;
              uVar40 = uVar40 + lVar48;
            }
          }
        } while( true );
      }
      func_0x00584ec0(auStack_7ffffffe + 0x8000040e,in_stack_000000f8,uVar44);
      if (in_stack_00000410 != 0) {
        uVar45 = (uint)((ulong)in_stack_00000418 >> 0x20);
        if (uVar45 == uStack0000000000000118._4_4_) {
          func_0x0058485c(auStack_7ffffffe + 0x8000066e,in_stack_000000f8);
          plVar33 = (long *)(in_stack_00000680 & 0xffffffff);
          plVar30 = (long *)(ulong)uVar42;
          if (in_stack_00000088 == 0) {
            do {
              for (; plVar33 < in_stack_00000678;
                  plVar33 = (long *)(ulong)*(uint *)(in_stack_00000670 + (long)plVar33 * 0x30 + 0x20
                                                    )) {
              }
              do {
                if (in_stack_00000678 <= plVar30) goto code_r0x004c3294;
                lVar48 = in_stack_00000670 + (long)plVar30 * 0x30;
                plVar30 = (long *)(ulong)*(uint *)(lVar48 + 0x24);
              } while (*(uint *)(lVar48 + 0x28) == uVar65);
            } while( true );
          }
          uVar40 = (uVar44 | 0x400000000000000) ^ uVar25;
          uVar22 = uVar40 + uVar19 ^ (uVar40 >> 0x30 | uVar40 << 0x10);
          uVar40 = uVar40 + lVar15;
          uVar20 = uVar40 ^ uVar17;
          uVar26 = uVar22 + uVar31 ^ (uVar22 >> 0x2b | uVar22 << 0x15);
          uVar22 = (uVar22 + uVar31 ^ (uVar44 | 0x400000000000000)) + uVar20;
          uVar27 = uVar22 ^ (uVar20 >> 0x33 | uVar20 << 0xd);
          uVar40 = ((uVar40 >> 0x20 | uVar40 << 0x20) ^ 0xff) + uVar26;
          uVar20 = uVar27 + uVar40;
          uVar40 = uVar40 ^ (uVar26 >> 0x30 | uVar26 << 0x10);
          uVar27 = uVar20 ^ (uVar27 >> 0x2f | uVar27 << 0x11);
          uVar22 = uVar40 + (uVar22 >> 0x20 | uVar22 << 0x20);
          uVar26 = uVar27 + uVar22;
          uVar22 = uVar22 ^ (uVar40 >> 0x2b | uVar40 << 0x15);
          uVar27 = uVar26 ^ (uVar27 >> 0x33 | uVar27 << 0xd);
          uVar40 = uVar22 + (uVar20 >> 0x20 | uVar20 << 0x20);
          uVar20 = uVar27 + uVar40;
          uVar40 = uVar40 ^ (uVar22 >> 0x30 | uVar22 << 0x10);
          uVar27 = uVar20 ^ (uVar27 >> 0x2f | uVar27 << 0x11);
          uVar22 = uVar40 + (uVar26 >> 0x20 | uVar26 << 0x20);
          uVar26 = uVar22 ^ (uVar40 >> 0x2b | uVar40 << 0x15);
          uVar27 = uVar27 + uVar22 ^ (uVar27 >> 0x33 | uVar27 << 0xd);
          uVar40 = uVar26 + (uVar20 >> 0x20 | uVar20 << 0x20);
          uVar22 = uVar27 + uVar40;
          uVar40 = uVar40 ^ (uVar26 >> 0x30 | uVar26 << 0x10);
          uVar22 = (uVar27 >> 0x2f | uVar27 << 0x11) ^ (uVar40 >> 0x2b | uVar40 << 0x15) ^
                   (uVar22 >> 0x20 | uVar22 << 0x20) ^ uVar22;
          bVar13 = (byte)(uVar22 >> 0x39);
code_r0x004c376c:
          do {
            if (plVar33 < in_stack_00000678) {
              lVar48 = in_stack_00000670 + (long)plVar33 * 0x30;
              plVar33 = (long *)(ulong)*(uint *)(lVar48 + 0x20);
              uVar45 = *(uint *)(lVar48 + 0x2c);
            }
            else {
              do {
                if (in_stack_00000678 <= plVar30) goto code_r0x004c3294;
                lVar48 = in_stack_00000670 + (long)plVar30 * 0x30;
                plVar30 = (long *)(ulong)*(uint *)(lVar48 + 0x24);
                uVar45 = *(uint *)(lVar48 + 0x28);
              } while (uVar45 == uVar65);
            }
            if (uVar45 != uVar2) {
              lVar48 = 0;
              uVar40 = uVar22;
              while( true ) {
                uVar40 = uVar40 & uVar23;
                uVar6 = *(undefined8 *)(lVar16 + uVar40);
                bVar47 = (byte)((ulong)uVar6 >> 8);
                bVar57 = (byte)((ulong)uVar6 >> 0x10);
                bVar49 = (byte)((ulong)uVar6 >> 0x18);
                bVar50 = (byte)((ulong)uVar6 >> 0x20);
                bVar51 = (byte)((ulong)uVar6 >> 0x28);
                bVar52 = (byte)((ulong)uVar6 >> 0x30);
                bVar53 = (byte)((ulong)uVar6 >> 0x38);
                for (uVar20 = CONCAT17(-(bVar53 == bVar13),
                                       CONCAT16(-(bVar52 == bVar13),
                                                CONCAT15(-(bVar51 == bVar13),
                                                         CONCAT14(-(bVar50 == bVar13),
                                                                  CONCAT13(-(bVar49 == bVar13),
                                                                           CONCAT12(-(bVar57 ==
                                                                                     bVar13),
                                                  CONCAT11(-(bVar47 == bVar13),
                                                           -((byte)uVar6 == bVar13)))))))) &
                              0x8080808080808080; uVar20 != 0; uVar20 = uVar20 - 1 & uVar20) {
                  uVar26 = (uVar20 >> 7 & 0xff00ff00ff00ff00) >> 8 |
                           (uVar20 >> 7 & 0xff00ff00ff00ff) << 8;
                  uVar26 = (uVar26 & 0xffff0000ffff0000) >> 0x10 | (uVar26 & 0xffff0000ffff) << 0x10
                  ;
                  if (uVar2 == *(uint *)(lVar18 + (uVar40 + ((ulong)LZCOUNT(uVar26 >> 0x20 |
                                                                            uVar26 << 0x20) >> 3) &
                                                  uVar23) * -8)) {
                    uStack00000000000001f0 = CONCAT44(uVar2,1);
                    goto code_r0x004c383c;
                  }
                }
                bVar47 = NEON_umaxv(CONCAT17(-(bVar53 == 0xff),
                                             CONCAT16(-(bVar52 == 0xff),
                                                      CONCAT15(-(bVar51 == 0xff),
                                                               CONCAT14(-(bVar50 == 0xff),
                                                                        CONCAT13(-(bVar49 == 0xff),
                                                                                 CONCAT12(-(bVar57 
                                                  == 0xff),CONCAT11(-(bVar47 == 0xff),
                                                                    -((byte)uVar6 == 0xff)))))))),1)
                ;
                if ((bVar47 & 1) != 0) break;
                lVar48 = lVar48 + 8;
                uVar40 = uVar40 + lVar48;
              }
            }
          } while( true );
        }
        bVar5 = false;
        if (uVar45 == uVar43) {
          bVar5 = bVar38;
        }
        if (bVar5) {
          plVar30 = (long *)func_0x005847cc(in_stack_000000f8,uVar44);
          if (plVar30 != (long *)0x0) {
            in_stack_00000688 = 0x1d;
            lVar48 = plVar30[2];
            if (lVar48 == *plVar30) {
              func_0x005bd0a4(plVar30,&UNK_009e5eb0);
            }
            _memcpy(plVar30[1] + lVar48 * 0x108,auStack_7ffffffe + 0x8000066e,0x108);
            plVar30[2] = lVar48 + 1;
            goto code_r0x004c3ccc;
          }
          goto code_r0x004c53fc;
        }
        goto code_r0x004c3ccc;
      }
      func_0x007a247c(&UNK_008a2482,0x28,&UNK_009e6540);
      goto LAB_004c5940;
    }
code_r0x004c44e0:
    if ((lVar28 != 0) && (in_stack_00000020 != 0)) {
      func_0x00187bd4(in_stack_00000010,in_stack_00000020,uStack0000000000000018);
    }
    func_0x00584800(auStack_7ffffffe + 0x8000066e,in_stack_000000f8,uStack0000000000000138._4_4_);
    plVar7 = (long *)(in_stack_00000680 & 0xffffffff);
    uVar41 = uStack000000000000009c;
    if (plVar7 < in_stack_00000678) {
      lVar14 = in_stack_00000670 + (long)plVar7 * 0x30;
      plVar7 = (long *)(ulong)*(uint *)(lVar14 + 0x20);
      iVar64 = *(int *)(lVar14 + 0x2c);
    }
    else {
      plVar55 = (long *)(in_stack_00000680 >> 0x20);
      do {
        if (in_stack_00000678 <= plVar55) goto code_r0x004c2eb0;
        lVar14 = in_stack_00000670 + (long)plVar55 * 0x30;
        uVar2 = *(uint *)(lVar14 + 0x24);
        plVar55 = (long *)(ulong)uVar2;
        iVar64 = *(int *)(lVar14 + 0x28);
      } while (iVar64 == (int)in_stack_00000688);
      in_stack_00000680 = (ulong)uVar2 << 0x20;
    }
    if (plVar7 < in_stack_00000678) goto code_r0x004c2eb0;
    plVar7 = (long *)(in_stack_00000680 >> 0x20);
    while (plVar7 < in_stack_00000678) {
      lVar14 = in_stack_00000670 + (long)plVar7 * 0x30;
      if (*(int *)(lVar14 + 0x28) != (int)in_stack_00000688) goto code_r0x004c2eb0;
      plVar7 = (long *)(ulong)*(uint *)(lVar14 + 0x24);
    }
    bVar5 = false;
    if (iVar64 == in_stack_00000028._4_4_) {
      bVar5 = bVar38;
    }
    if (!bVar5) goto code_r0x004c2eb0;
    lVar14 = func_0x005847cc(in_stack_000000f8,uStack0000000000000118._4_4_);
    if (lVar14 == 0) {
      puVar12 = &UNK_009e6330;
code_r0x004c53e8:
      func_0x007a23bc(puVar12);
LAB_004c5940:
                    /* WARNING: Does not return */
      pcVar4 = (code *)SoftwareBreakpoint(1,0x4c5944);
      (*pcVar4)();
    }
    if (*(long *)(lVar14 + 0x10) == 0) {
code_r0x004c5844:
      puVar12 = &UNK_009e6348;
      goto code_r0x004c53e8;
    }
    lVar28 = *(long *)(lVar14 + 0x10) + -1;
    *(long *)(lVar14 + 0x10) = lVar28;
    lVar14 = *(long *)(lVar14 + 8) + lVar28 * 0x108;
    uVar17 = *(ulong *)(lVar14 + 0x18);
    plVar55 = *(long **)(lVar14 + 0xa8);
    lVar28 = *(long *)(lVar14 + 0xa0);
    lVar15 = *(long *)(lVar14 + 0xb0);
    plVar56 = *(long **)(lVar14 + 0x68);
    plVar7 = *(long **)(lVar14 + 0x60);
    lVar16 = *(long *)(lVar14 + 0x20);
    uVar6 = *(undefined8 *)(lVar14 + 0x40);
    if (uVar17 == 0x21) goto code_r0x004c5844;
    if (uVar17 == 0x10) {
      func_0x00584d50(auStack_7ffffffe + 0x8000066e,in_stack_000000f8,uStack0000000000000118._4_4_);
      if (lVar16 == 0) {
        puVar12 = &UNK_009e6360;
      }
      else {
        dVar66 = (dword)((ulong)uVar6 >> 0x20);
        func_0x00584fc4(auStack_7ffffffe + 0x8000066e,in_stack_000000f8,uStack0000000000000138._4_4_
                       );
        if (lVar16 != -0x8000000000000000) {
          lVar14 = func_0x005847cc(in_stack_000000f8,uStack0000000000000118._4_4_);
          if (lVar14 == 0) {
            puVar12 = &UNK_009e6390;
code_r0x004c5498:
            func_0x007a23bc(puVar12);
            goto LAB_004c5940;
          }
          if (*(long *)(lVar14 + 0x10) == 0) {
            if (dVar66 == uStack0000000000000138._4_4_) {
              func_0x005cb804(auStack_7ffffffe + 0x8000066e,0);
              func_0x005cb1c8(auStack_7ffffffe + 0x8000066e);
            }
            func_0x005cf78c(auStack_7ffffffe + 0x8000052e,auStack_7ffffffe + 0x8000033e,
                            unaff_x29 + -0xf0);
          }
          else {
            puVar10 = (undefined8 *)func_0x005847cc(in_stack_000000f8,uStack0000000000000118._4_4_);
            if (puVar10 == (undefined8 *)0x0) {
              puVar12 = &UNK_009e63a8;
              goto code_r0x004c5498;
            }
            puVar10[2] = 0;
            puVar10[1] = 8;
            *puVar10 = 0;
            if (dVar66 != uStack0000000000000138._4_4_) {
              func_0x005cb804(auStack_7ffffffe + 0x8000066e,0);
              func_0x005cb1c8(auStack_7ffffffe + 0x8000066e);
            }
            lVar14 = func_0x00187bd0(0x108,8);
            if (lVar14 == 0) {
              func_0x007a1f18(8,0x108);
              goto LAB_004c5940;
            }
            *(undefined8 *)(lVar14 + 0x18) = 0x1d;
            func_0x005cee30(auStack_7ffffffe + 0x8000052e,auStack_7ffffffe + 0x8000033e,
                            unaff_x29 + -0xd0,auStack_7ffffffe + 0x80000656);
            func_0x004bdba4(auStack_7ffffffe + 0x800004ee,auStack_7ffffffe + 0x8000066e,
                            &UNK_009e63c0);
            func_0x004ca0e0(auStack_7ffffffe + 0x800004ee,auStack_7ffffffe + 0x8000066e,
                            &UNK_009e63d8);
            func_0x005cf78c(auStack_7ffffffe + 0x8000052e,auStack_7ffffffe + 0x8000066e,
                            unaff_x29 + -0xd0);
          }
          lVar14 = func_0x005847cc(in_stack_000000f8,uStack0000000000000118._4_4_);
          if (lVar14 == 0) {
            func_0x007a23bc(&UNK_009e63f0);
            goto LAB_004c5940;
          }
          func_0x004bdba4(lVar14,auStack_7ffffffe + 0x8000066e,&UNK_009e6408);
          puVar11 = (uint *)func_0x00187bd0(0x28,8);
          if (puVar11 == (uint *)0x0) {
            func_0x007a1f18(8,0x28);
            goto LAB_004c5940;
          }
          *puVar11 = uVar43;
          puVar11[2] = 0;
          puVar11[3] = 0;
          puVar11[4] = 8;
          puVar11[5] = 0;
          puVar11[6] = 0;
          puVar11[7] = 0;
          *(undefined1 *)(puVar11 + 8) = 0;
          func_0x00584c34(unaff_x29 + -0xd0,in_stack_000000f8,uStack0000000000000118._4_4_,
                          auStack_7ffffffe + 0x8000066e);
          func_0x004bb068(unaff_x29 + -0xd0);
          func_0x004bea24(in_stack_000000f8,uStack0000000000000118._4_4_,1,uVar43);
          lVar14 = *plVar7;
          *plVar7 = lVar14 + -1;
          LORelease();
          if (lVar14 == 1) {
            func_0x005d2c74(auStack_7ffffffe + 0x8000044e);
          }
          lVar14 = *plVar56;
          *plVar56 = lVar14 + -1;
          LORelease();
          if (lVar14 == 1) {
            func_0x005d2c74(auStack_7ffffffe + 0x80000456);
          }
          goto code_r0x004c4f70;
        }
        puVar12 = &UNK_009e6378;
      }
      func_0x007a23bc(puVar12);
      goto LAB_004c5940;
    }
    puVar10 = (undefined8 *)func_0x005847cc(in_stack_000000f8,uStack0000000000000118._4_4_);
    if (puVar10 == (undefined8 *)0x0) {
      func_0x007a23bc(&UNK_009e6420);
      goto LAB_004c5940;
    }
    lVar18 = puVar10[1];
    lVar14 = puVar10[2];
    *puVar10 = 0;
    puVar10[1] = 8;
    puVar10[2] = 0;
    auVar60 = func_0x004bf9d8(in_stack_000000f8,uStack0000000000000118._4_4_);
    uVar6 = auVar60._0_8_;
    func_0x00584fc4(auStack_7ffffffe + 0x8000066e,in_stack_000000f8,uStack0000000000000138._4_4_);
    if (lVar16 == -0x8000000000000000) {
      func_0x007a23bc(&UNK_009e6438);
      goto LAB_004c5940;
    }
    lVar16 = lVar18 + lVar14 * 0x108;
    func_0x004cc814(auStack_7ffffffe + 0x8000031e,lVar18,lVar16,&UNK_009e6450);
    lVar14 = func_0x005847cc(in_stack_000000f8,uVar6);
    if (lVar14 == 0) {
      func_0x007a23bc(&UNK_009e6468);
      goto LAB_004c5940;
    }
    func_0x004ca0e0(lVar14,auStack_7ffffffe + 0x8000066e,&UNK_009e6480);
    if (uVar17 == 0x16) {
      func_0x004cc974(auStack_7ffffffe + 0x8000066e,lVar14,auVar60._8_8_,&UNK_009e6498);
      _memcpy(auStack_7ffffffe + 0x8000052e,auStack_7ffffffe + 0x8000066e,0x108);
      if (lVar16 - 0xcU < 0x15) {
        _memcpy(auStack_7ffffffe + 0x8000066e,auStack_7ffffffe + 0x8000052e,0x108);
        func_0x007a2810(&UNK_008a2019,0x2b,auStack_7ffffffe + 0x8000066e,&UNK_009e5948,&UNK_009e64b0
                       );
        goto LAB_004c5940;
      }
      _memcpy(auStack_7ffffffe + 0x8000066e,auStack_7ffffffe + 0x8000052e,0x108);
      if (lVar28 != -0x8000000000000000) {
        func_0x007a23bc(&UNK_009e64c8);
        goto LAB_004c5940;
      }
      lVar28 = *plVar55;
      *plVar55 = lVar28 + 1;
      if (lVar28 < 0) {
        func_0x007a05dc();
        goto LAB_004c5940;
      }
      func_0x005db1b4(auStack_7ffffffe + 0x8000052e,auStack_7ffffffe + 0x800004ee,unaff_x29 + -0xd0,
                      auStack_7ffffffe + 0x8000033e,plVar55,unaff_x29 + -0xf0);
      func_0x004bb3f8(auStack_7ffffffe + 0x8000066e);
      func_0x004bb3f8(auStack_7ffffffe + 0x800006c6);
      func_0x004bb3f8(auStack_7ffffffe + 0x8000071e);
      func_0x004bc41c(auStack_7ffffffe + 0x8000040e);
    }
    else {
      if (uVar17 != 0x19) {
        func_0x007a247c(&UNK_008a2482,0x28,&UNK_009e6528);
        goto LAB_004c5940;
      }
      func_0x004cc974(auStack_7ffffffe + 0x8000052e,lVar14,auVar60._8_8_,&UNK_009e64e0);
      if (lVar54 != 0x18) {
        func_0x007a2810(&UNK_008a2019,0x2b,auStack_7ffffffe + 0x8000066e,&UNK_009e5948,&UNK_009e64f8
                       );
        goto LAB_004c5940;
      }
      func_0x004cea94(unaff_x29 + -0xd0,plVar55,plVar55 + lVar15 * 3,&UNK_009e5910);
      func_0x005dc404(auStack_7ffffffe + 0x8000066e,unaff_x29 + -0xd0,auStack_7ffffffe + 0x80000546,
                      auStack_7ffffffe + 0x8000033e);
      func_0x004bc9dc(auStack_7ffffffe + 0x8000052e);
      func_0x004bc780(auStack_7ffffffe + 0x8000040e);
    }
    func_0x004bdba4(lVar14,auStack_7ffffffe + 0x8000066e,&UNK_009e6510);
    func_0x00584fc4(auStack_7ffffffe + 0x8000066e,in_stack_000000f8,uStack0000000000000118._4_4_);
    func_0x004bcba8(auStack_7ffffffe + 0x8000066e);
    puVar11 = (uint *)func_0x00187bd0(0x28,8);
    if (puVar11 == (uint *)0x0) {
      func_0x007a1f18(8,0x28);
      goto LAB_004c5940;
    }
    *puVar11 = uVar43;
    puVar11[2] = 0;
    puVar11[3] = 0;
    puVar11[4] = 8;
    puVar11[5] = 0;
    puVar11[6] = 0;
    puVar11[7] = 0;
    *(undefined1 *)(puVar11 + 8) = 0;
    func_0x00584c34(auStack_7ffffffe + 0x8000052e,in_stack_000000f8,uVar6,
                    auStack_7ffffffe + 0x8000066e);
    func_0x004bb068(auStack_7ffffffe + 0x8000052e);
    func_0x004bea24(in_stack_000000f8,uVar6,1,uVar43);
code_r0x004c4f70:
    if ((0x19 < uVar17) || ((1L << (uVar17 & 0x3f) & 0x2410000U) == 0)) {
      func_0x004bba74(&uStack00000000000001f0);
    }
    bVar38 = false;
    uVar41 = 1;
  }
  if ((bVar38) && (in_stack_00000180 != 0)) {
    func_0x00187bd4(in_stack_00000188,in_stack_00000180 << 2,4);
  }
code_r0x004c2eb0:
  if (in_stack_00000120 != 0) {
    func_0x00187bd4(in_stack_00000128,in_stack_00000120 << 2,4);
  }
  return uVar41 & 1;
}

