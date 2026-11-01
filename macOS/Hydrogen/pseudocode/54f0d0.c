
/* WARNING: Removing unreachable block (ram,0x00550c60) */
/* WARNING: Removing unreachable block (ram,0x00550c74) */
/* WARNING: Removing unreachable block (ram,0x00550f44) */
/* WARNING: Removing unreachable block (ram,0x00550f54) */
/* WARNING: Removing unreachable block (ram,0x00550f5c) */
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_0054f0d0(void)

{
  long lVar1;
  code *pcVar2;
  bool bVar3;
  long lVar4;
  char cVar5;
  int iVar6;
  ulong *puVar7;
  long *plVar8;
  dword *pdVar9;
  dword *pdVar10;
  long *plVar11;
  ulong uVar12;
  long *extraout_x1;
  long *extraout_x1_00;
  undefined *puVar13;
  long lVar14;
  long *plVar15;
  long lVar16;
  ulong uVar17;
  dword *pdVar18;
  long *plVar19;
  ulong uVar20;
  ulong uVar21;
  ulong uVar22;
  ulong uVar23;
  long *unaff_x19;
  ulong unaff_x21;
  dword *pdVar24;
  undefined8 *unaff_x22;
  dword *pdVar25;
  long unaff_x23;
  dword *pdVar26;
  dword *pdVar27;
  long unaff_x24;
  long unaff_x25;
  long *plVar28;
  long *plVar29;
  ulong unaff_x26;
  dword *unaff_x27;
  byte bVar30;
  long lVar31;
  long lVar32;
  byte bVar33;
  byte bVar35;
  byte bVar36;
  byte bVar37;
  byte bVar38;
  byte bVar39;
  undefined8 uVar34;
  byte bVar40;
  char cVar41;
  char cVar42;
  char cVar43;
  char cVar44;
  char cVar45;
  undefined8 unaff_d8;
  char cVar46;
  undefined1 auVar47 [16];
  undefined *puStack0000000000000020;
  undefined8 *in_stack_00000028;
  undefined *in_stack_00000030;
  ulong in_stack_00000038;
  undefined *in_stack_00000040;
  undefined8 *in_stack_00000048;
  undefined8 in_stack_00000050;
  undefined8 in_stack_00000058;
  dword *in_stack_00000060;
  undefined8 in_stack_00000068;
  ulong in_stack_00000070;
  ulong in_stack_00000078;
  ulong in_stack_00000080;
  ulong in_stack_00000088;
  ulong in_stack_00000090;
  undefined8 uStack00000000000000a0;
  undefined1 uStack00000000000000b8;
  long in_stack_000000d0;
  undefined8 in_stack_000000d8;
  undefined8 uStack00000000000000f0;
  dword *in_stack_000000f8;
  dword *in_stack_00000100;
  dword *in_stack_00000108;
  undefined8 uStack0000000000000110;
  dword *in_stack_00000118;
  undefined *in_stack_00000120;
  ulong in_stack_00000128;
  undefined8 in_stack_00000130;
  undefined8 uStack0000000000000138;
  long lStack0000000000000140;
  dword *in_stack_00000148;
  dword *in_stack_00000150;
  dword *in_stack_00000158;
  ulong in_stack_00000160;
  dword *in_stack_00000168;
  undefined *in_stack_00000170;
  long in_stack_00000178;
  undefined8 uStack0000000000000180;
  undefined8 uStack0000000000000188;
  undefined8 uStack0000000000000190;
  long *in_stack_00000198;
  undefined8 *in_stack_000001a0;
  undefined8 uStack00000000000001a8;
  undefined8 uStack00000000000001c0;
  undefined8 uStack00000000000001e0;
  undefined8 *in_stack_000001e8;
  dword *in_stack_00000210;
  dword *in_stack_00000218;
  dword *in_stack_00000258;
  ulong in_stack_00000260;
  dword *in_stack_00000268;
  ulong in_stack_00000278;
  undefined1 auStack_7ffffffe [6];
  long alStack_7ffffff8 [268435455];
  
code_r0x0054f0d0:
  func_0x00558b8c(&lStack0000000000000140,auStack_7ffffffe + 0x800001fe,&UNK_009f09e0);
  pdVar24 = in_stack_00000210;
LAB_0054f474:
  uVar17 = unaff_x26;
  in_stack_00000210 = in_stack_00000148;
  if (in_stack_00000150 == (dword *)0x0) {
    uStack00000000000001c0 = in_stack_00000148;
    pdVar18 = in_stack_00000148;
  }
  else {
    pdVar18 = in_stack_00000150;
    pdVar25 = in_stack_00000148;
    do {
      pdVar10 = pdVar25 + 2;
      plVar19 = (long *)**(undefined8 **)pdVar25;
      lVar4 = *plVar19;
      *plVar19 = (long)(lVar4 + (long)unaff_x27);
      if (lVar4 < 0) {
        func_0x007a05dc();
        goto LAB_00551610;
      }
      *(long **)pdVar25 = plVar19;
      pdVar18 = (dword *)((long)pdVar18 + -1);
      pdVar25 = pdVar10;
    } while (pdVar18 != (dword *)0x0);
    pdVar25 = in_stack_00000148 + (long)in_stack_00000150 * 2;
    uStack00000000000001c0 = in_stack_00000148;
    pdVar9 = in_stack_00000148;
    do {
      pdVar26 = pdVar9 + 2;
      uStack00000000000001e0 = *(long **)pdVar9;
      if (unaff_x19[0x2a] == 0) {
LAB_0054fa40:
        func_0x007a23d8(&UNK_008ab0c0,0x16,&UNK_009ed2b8);
        goto LAB_00551610;
      }
      lVar4 = 0;
      lVar14 = unaff_x19[0x27];
      uVar21 = unaff_x19[0x28];
      bVar30 = (byte)((ulong)((long)(uStack00000000000001e0 + 1) * 0x517cc1b727220a95) >> 0x39);
      uVar20 = (long)(uStack00000000000001e0 + 1) * 0x517cc1b727220a95 & uVar21;
      uVar34 = *(undefined8 *)(lVar14 + uVar20);
      uVar12 = CONCAT17(-((byte)((ulong)uVar34 >> 0x38) == bVar30),
                        CONCAT16(-((byte)((ulong)uVar34 >> 0x30) == bVar30),
                                 CONCAT15(-((byte)((ulong)uVar34 >> 0x28) == bVar30),
                                          CONCAT14(-((byte)((ulong)uVar34 >> 0x20) == bVar30),
                                                   CONCAT13(-((byte)((ulong)uVar34 >> 0x18) ==
                                                             bVar30),CONCAT12(-((byte)((ulong)uVar34
                                                                                      >> 0x10) ==
                                                                               bVar30),CONCAT11(-((
                                                  byte)((ulong)uVar34 >> 8) == bVar30),
                                                  -((byte)uVar34 == bVar30)))))))) &
               0x8080808080808080;
      while( true ) {
        while (uVar12 == 0) {
          bVar33 = NEON_umaxv(CONCAT17(-((char)((ulong)uVar34 >> 0x38) == -1),
                                       CONCAT16(-((char)((ulong)uVar34 >> 0x30) == -1),
                                                CONCAT15(-((char)((ulong)uVar34 >> 0x28) == -1),
                                                         CONCAT14(-((char)((ulong)uVar34 >> 0x20) ==
                                                                   -1),CONCAT13(-((char)((ulong)
                                                  uVar34 >> 0x18) == -1),
                                                  CONCAT12(-((char)((ulong)uVar34 >> 0x10) == -1),
                                                           CONCAT11(-((char)((ulong)uVar34 >> 8) ==
                                                                     -1),-((char)uVar34 == -1)))))))
                                      ),1);
          if ((bVar33 & 1) != 0) goto LAB_0054fa40;
          lVar4 = lVar4 + 8;
          uVar20 = uVar20 + lVar4 & uVar21;
          uVar34 = *(undefined8 *)(lVar14 + uVar20);
          uVar12 = CONCAT17(-((byte)((ulong)uVar34 >> 0x38) == bVar30),
                            CONCAT16(-((byte)((ulong)uVar34 >> 0x30) == bVar30),
                                     CONCAT15(-((byte)((ulong)uVar34 >> 0x28) == bVar30),
                                              CONCAT14(-((byte)((ulong)uVar34 >> 0x20) == bVar30),
                                                       CONCAT13(-((byte)((ulong)uVar34 >> 0x18) ==
                                                                 bVar30),CONCAT12(-((byte)((ulong)
                                                  uVar34 >> 0x10) == bVar30),
                                                  CONCAT11(-((byte)((ulong)uVar34 >> 8) == bVar30),
                                                           -((byte)uVar34 == bVar30)))))))) &
                   0x8080808080808080;
        }
        uVar22 = (uVar12 >> 7 & 0xff00ff00ff00ff00) >> 8 | (uVar12 >> 7 & 0xff00ff00ff00ff) << 8;
        uVar22 = (uVar22 & 0xffff0000ffff0000) >> 0x10 | (uVar22 & 0xffff0000ffff) << 0x10;
        uVar22 = uVar20 + ((ulong)LZCOUNT(uVar22 >> 0x20 | uVar22 << 0x20) >> 3) & uVar21;
        if (uStack00000000000001e0 == *(long **)(lVar14 + -0x10 + uVar22 * -0x10)) break;
        uVar12 = uVar12 - 1 & uVar12;
      }
      pdVar18 = pdVar10;
      if (in_stack_00000108 != (dword *)0x0) {
        lVar4 = 0;
        plVar19 = (long *)(lVar14 + uVar22 * -0x10 + -8);
        uVar21 = in_stack_00000078 & (ulong)in_stack_000000f8;
        uVar34 = *(undefined8 *)((long)uStack00000000000000f0 + uVar21);
        cVar5 = (char)((ulong)unaff_d8 >> 8);
        cVar41 = (char)((ulong)unaff_d8 >> 0x10);
        cVar42 = (char)((ulong)unaff_d8 >> 0x18);
        cVar43 = (char)((ulong)unaff_d8 >> 0x20);
        cVar44 = (char)((ulong)unaff_d8 >> 0x28);
        cVar45 = (char)((ulong)unaff_d8 >> 0x30);
        cVar46 = (char)((ulong)unaff_d8 >> 0x38);
        uVar12 = CONCAT17(-((char)((ulong)uVar34 >> 0x38) == cVar46),
                          CONCAT16(-((char)((ulong)uVar34 >> 0x30) == cVar45),
                                   CONCAT15(-((char)((ulong)uVar34 >> 0x28) == cVar44),
                                            CONCAT14(-((char)((ulong)uVar34 >> 0x20) == cVar43),
                                                     CONCAT13(-((char)((ulong)uVar34 >> 0x18) ==
                                                               cVar42),CONCAT12(-((char)((ulong)
                                                  uVar34 >> 0x10) == cVar41),
                                                  CONCAT11(-((char)((ulong)uVar34 >> 8) == cVar5),
                                                           -((char)uVar34 == (char)unaff_d8))))))))
                 & 0x8080808080808080;
        while( true ) {
          while (uVar12 == 0) {
            bVar30 = NEON_umaxv(CONCAT17(-((char)((ulong)uVar34 >> 0x38) == -1),
                                         CONCAT16(-((char)((ulong)uVar34 >> 0x30) == -1),
                                                  CONCAT15(-((char)((ulong)uVar34 >> 0x28) == -1),
                                                           CONCAT14(-((char)((ulong)uVar34 >> 0x20)
                                                                     == -1),CONCAT13(-((char)((ulong
                                                  )uVar34 >> 0x18) == -1),
                                                  CONCAT12(-((char)((ulong)uVar34 >> 0x10) == -1),
                                                           CONCAT11(-((char)((ulong)uVar34 >> 8) ==
                                                                     -1),-((char)uVar34 == -1)))))))
                                        ),1);
            if ((bVar30 & 1) != 0) goto LAB_0054f87c;
            lVar4 = lVar4 + 8;
            uVar21 = uVar21 + lVar4 & (ulong)in_stack_000000f8;
            uVar34 = *(undefined8 *)((long)uStack00000000000000f0 + uVar21);
            uVar12 = CONCAT17(-((char)((ulong)uVar34 >> 0x38) == cVar46),
                              CONCAT16(-((char)((ulong)uVar34 >> 0x30) == cVar45),
                                       CONCAT15(-((char)((ulong)uVar34 >> 0x28) == cVar44),
                                                CONCAT14(-((char)((ulong)uVar34 >> 0x20) == cVar43),
                                                         CONCAT13(-((char)((ulong)uVar34 >> 0x18) ==
                                                                   cVar42),CONCAT12(-((char)((ulong)
                                                  uVar34 >> 0x10) == cVar41),
                                                  CONCAT11(-((char)((ulong)uVar34 >> 8) == cVar5),
                                                           -((char)uVar34 == (char)unaff_d8))))))))
                     & 0x8080808080808080;
          }
          uVar20 = (uVar12 >> 7 & 0xff00ff00ff00ff00) >> 8 | (uVar12 >> 7 & 0xff00ff00ff00ff) << 8;
          uVar20 = (uVar20 & 0xffff0000ffff0000) >> 0x10 | (uVar20 & 0xffff0000ffff) << 0x10;
          uVar20 = uVar21 + ((ulong)LZCOUNT(uVar20 >> 0x20 | uVar20 << 0x20) >> 3) &
                   (ulong)in_stack_000000f8;
          if ((int)unaff_x21 == (int)uStack00000000000000f0[uVar20 * -5 + -5]) break;
          uVar12 = uVar12 - 1 & uVar12;
        }
        if (uStack00000000000000f0[uVar20 * -5 + -1] != 0) {
          lVar4 = 0;
          uVar22 = (*plVar19 + 8) * 0x517cc1b727220a95;
          lVar14 = uStack00000000000000f0[uVar20 * -5 + -4];
          uVar21 = uStack00000000000000f0[uVar20 * -5 + -3];
          bVar30 = (byte)(uVar22 >> 0x39);
          uVar22 = uVar22 & uVar21;
          uVar34 = *(undefined8 *)(lVar14 + uVar22);
          uVar12 = CONCAT17(-((byte)((ulong)uVar34 >> 0x38) == bVar30),
                            CONCAT16(-((byte)((ulong)uVar34 >> 0x30) == bVar30),
                                     CONCAT15(-((byte)((ulong)uVar34 >> 0x28) == bVar30),
                                              CONCAT14(-((byte)((ulong)uVar34 >> 0x20) == bVar30),
                                                       CONCAT13(-((byte)((ulong)uVar34 >> 0x18) ==
                                                                 bVar30),CONCAT12(-((byte)((ulong)
                                                  uVar34 >> 0x10) == bVar30),
                                                  CONCAT11(-((byte)((ulong)uVar34 >> 8) == bVar30),
                                                           -((byte)uVar34 == bVar30)))))))) &
                   0x8080808080808080;
          goto joined_r0x0054f6c0;
        }
      }
LAB_0054f87c:
      lVar4 = *uStack00000000000001e0;
      *uStack00000000000001e0 = lVar4 + -1;
      LORelease();
      if (lVar4 == 1) {
        func_0x005d2ac4(&uStack00000000000001e0);
      }
LAB_0054f4fc:
      pdVar9 = pdVar26;
      pdVar10 = pdVar18;
    } while (pdVar26 != pdVar25);
  }
  func_0x005928cc(&uStack00000000000001c0);
  if (uVar17 < in_stack_00000090) {
    unaff_x26 = uVar17 + 1;
    goto LAB_0054ec9c;
  }
LAB_0054f930:
  if ((___ZN12tracing_core8metadata9MAX_LEVEL17h4f715bd39d097130E < 3) &&
     ((bRam0000000000a2a858 - 1 < 2 ||
      ((bRam0000000000a2a858 != 0 && (cVar5 = func_0x007b1274(0xa2a848), cVar5 != '\0')))))) {
    iVar6 = func_0x005e7964(lRam0000000000a2a848);
    if (iVar6 != 0) {
      if ((*(long *)(lRam0000000000a2a848 + 0x38) == 0) ||
         (*(dword **)(lRam0000000000a2a848 + 0x30) == (dword *)0x0)) {
        func_0x007a23d8(&UNK_008ab0d6,0x22,in_stack_00000030);
        goto LAB_00551610;
      }
      in_stack_00000150 = *(dword **)(lRam0000000000a2a848 + 0x40);
      in_stack_00000148 = *(dword **)(lRam0000000000a2a848 + 0x38);
      uStack00000000000001e0 = &lStack0000000000000140;
      in_stack_00000158 = *(dword **)(lRam0000000000a2a848 + 0x48);
      in_stack_00000160 = 0;
      in_stack_00000210 = (dword *)&UNK_009ed260;
      pdVar24 = &MACH_HEADER.cpusubtype;
      uStack00000000000001c0 = (dword *)&uStack00000000000001e0;
      lStack0000000000000140 = (long)*(dword **)(lRam0000000000a2a848 + 0x30);
      in_stack_000001e8 = unaff_x22;
      func_0x005eb358(lRam0000000000a2a848,&uStack00000000000001c0);
      pdVar18 = unaff_x27;
    }
  }
  if ((*(ulong *)(unaff_x19[0x12] + 0x28) <= unaff_x21) ||
     (*(long *)(*(long *)(unaff_x19[0x12] + 0x20) + unaff_x21 * 0x20) == unaff_x25)) {
    in_stack_00000040 = &UNK_009ed270;
    goto code_r0x00551454;
  }
  unaff_x24 = unaff_x24 + (in_stack_00000088 & 0xffffffff) * 0x10;
  func_0x00556658();
  pdVar25 = in_stack_000000f8;
  if (unaff_x24 != unaff_x23) {
    in_stack_00000088 = 1;
    unaff_x21 = (ulong)*(uint *)(unaff_x24 + 8);
    if ((unaff_x21 < *(ulong *)(unaff_x19[0x12] + 0x28)) &&
       (plVar19 = (long *)(*(long *)(unaff_x19[0x12] + 0x20) + unaff_x21 * 0x20),
       *plVar19 != unaff_x25)) goto code_r0x0054ec68;
    goto code_r0x00551454;
  }
  if (in_stack_000000f8 != (dword *)0x0) {
    if (in_stack_00000108 != (dword *)0x0) {
      plVar8 = uStack00000000000000f0 + 1;
      lVar4 = *uStack00000000000000f0;
      uVar17 = CONCAT17(-(-1 < lVar4),
                        CONCAT16(-(-1 < (char)((ulong)lVar4 >> 0x30)),
                                 CONCAT15(-(-1 < (char)((ulong)lVar4 >> 0x28)),
                                          CONCAT14(-(-1 < (char)((ulong)lVar4 >> 0x20)),
                                                   CONCAT13(-(-1 < (char)((ulong)lVar4 >> 0x18)),
                                                            CONCAT12(-(-1 < (char)((ulong)lVar4 >>
                                                                                  0x10)),
                                                                     CONCAT11(-(-1 < (char)((ulong)
                                                  lVar4 >> 8)),-(-1 < (char)lVar4)))))))) &
               0x8080808080808080;
      plVar19 = uStack00000000000000f0;
      pdVar24 = in_stack_00000108;
      do {
        while (uVar17 == 0) {
          lVar4 = *plVar8;
          plVar19 = plVar19 + -0x28;
          plVar8 = plVar8 + 1;
          uVar17 = CONCAT17(-(-1 < lVar4),
                            CONCAT16(-(-1 < (char)((ulong)lVar4 >> 0x30)),
                                     CONCAT15(-(-1 < (char)((ulong)lVar4 >> 0x28)),
                                              CONCAT14(-(-1 < (char)((ulong)lVar4 >> 0x20)),
                                                       CONCAT13(-(-1 < (char)((ulong)lVar4 >> 0x18))
                                                                ,CONCAT12(-(-1 < (char)((ulong)lVar4
                                                                                       >> 0x10)),
                                                                          CONCAT11(-(-1 < (char)((
                                                  ulong)lVar4 >> 8)),-(-1 < (char)lVar4)))))))) &
                   0x8080808080808080;
        }
        uVar12 = (uVar17 >> 7 & 0xff00ff00ff00ff00) >> 8 | (uVar17 >> 7 & 0xff00ff00ff00ff) << 8;
        uVar12 = (uVar12 & 0xffff0000ffff0000) >> 0x10 | (uVar12 & 0xffff0000ffff) << 0x10;
        func_0x005394b4(plVar19 + (long)-(int)((ulong)LZCOUNT(uVar12 >> 0x20 | uVar12 << 0x20) >> 3)
                                  * 5 + -5);
        uVar17 = uVar17 - 1 & uVar17;
        pdVar24 = (dword *)((long)pdVar24 + -1);
      } while (pdVar24 != (dword *)0x0);
    }
    lVar4 = (long)pdVar25 * 0x29 + 0x31;
    if (lVar4 != 0) {
      func_0x00187bd4(uStack00000000000000f0 + (long)pdVar25 * -5 + -5,lVar4,8);
    }
  }
  func_0x0053a3f4(&uStack0000000000000110);
  if (in_stack_00000070 < 3) {
    if (uStack0000000000000190 != (dword *)((long)&MACH_HEADER.magic + 2)) {
      func_0x005ec378(&uStack0000000000000190,&uStack00000000000001a8);
    }
    func_0x005492bc(&uStack0000000000000190);
  }
  if ((___ZN12tracing_core8metadata9MAX_LEVEL17h4f715bd39d097130E < 3) &&
     (((bRam0000000000a2a8e8 - 1 < 2 ||
       ((bRam0000000000a2a8e8 != 0 && (cVar5 = func_0x007b1274(0xa2a8d8), cVar5 != '\0')))) &&
      (uVar17 = func_0x005e7964(lRam0000000000a2a8d8), (uVar17 & 1) != 0)))) {
    if (*(long *)(lRam0000000000a2a8d8 + 0x38) != 0) {
      plVar19 = *(long **)(lRam0000000000a2a8d8 + 0x30);
      if (plVar19 != (long *)0x0) {
        in_stack_00000100 = *(dword **)(lRam0000000000a2a8d8 + 0x40);
        in_stack_000000f8 = *(dword **)(lRam0000000000a2a8d8 + 0x38);
        in_stack_00000108 = *(dword **)(lRam0000000000a2a8d8 + 0x48);
        uStack0000000000000110 = 0;
        uStack0000000000000190 = (dword *)&uStack00000000000000f0;
        in_stack_00000198 = (long *)(auStack_7ffffffe + 0x800001fe);
        in_stack_000001a0 = (undefined8 *)&UNK_009ed1e8;
        lStack0000000000000140 = (long)&uStack0000000000000190;
        in_stack_00000148 = (dword *)((long)&MACH_HEADER.magic + 1);
        uStack00000000000000f0 = plVar19;
        in_stack_00000150 = (dword *)(lRam0000000000a2a8d8 + 0x30);
        func_0x005eb358(lRam0000000000a2a8d8,&lStack0000000000000140);
        goto code_r0x0054fb40;
      }
    }
    puVar13 = &UNK_009ed5c8;
    goto code_r0x005514d0;
  }
code_r0x0054fb40:
  func_0x00559d3c(&uStack00000000000000f0,auStack_7ffffffe + 0x800001fe,&UNK_009ecf38);
  pdVar18 = in_stack_000000f8;
  plVar19 = uStack00000000000000f0;
  pdVar24 = in_stack_000000f8 + (long)in_stack_00000100;
  puStack0000000000000020 = &UNK_009ed058;
  in_stack_00000030 = &UNK_009ed0a0;
  pdVar25 = in_stack_000000f8;
code_r0x0054fb98:
  if (pdVar25 != pdVar24) {
    uVar17 = (ulong)*pdVar25;
    if ((*(ulong *)(unaff_x19[0x12] + 0x28) <= uVar17) ||
       (*(long *)(*(long *)(unaff_x19[0x12] + 0x20) + uVar17 * 0x20) == -0x8000000000000000))
    goto code_r0x005514a4;
    func_0x0055ad20(&uStack00000000000000f0,auStack_7ffffffe + 0x800001fe,&UNK_009ecf38);
    pdVar10 = in_stack_000000f8;
    plVar8 = uStack00000000000000f0;
    if (in_stack_00000100 == (dword *)0x0) goto code_r0x00550130;
    pdVar9 = in_stack_000000f8 + (long)in_stack_00000100 * 2;
    pdVar26 = in_stack_000000f8;
code_r0x0054fc84:
    if ((*(ulong *)(unaff_x19[0x12] + 0x28) <= uVar17) ||
       (plVar11 = (long *)(*(long *)(unaff_x19[0x12] + 0x20) + uVar17 * 0x20),
       *plVar11 == -0x8000000000000000)) {
      puVar13 = &UNK_009ed088;
code_r0x005506a0:
      func_0x007a23bc(puVar13);
      goto LAB_00551610;
    }
    pdVar27 = pdVar26 + 2;
    uVar21 = *(ulong *)pdVar26;
    uVar12 = plVar11[2];
    if (uVar12 <= uVar21) goto code_r0x0055154c;
    lVar4 = plVar11[1] + uVar21 * 0x108;
    if (*(long *)(lVar4 + 0x18) != 0xf) {
      puVar13 = &UNK_009ed0b8;
      goto code_r0x005506a0;
    }
    if (((*(long *)(lVar4 + 0x30) != 1) || (*(long *)(lVar4 + 0x48) != 1)) ||
       (plVar15 = *(long **)(lVar4 + 0x28) + 1, **(long **)(lVar4 + 0x28) != -0x8000000000000000))
    goto code_r0x0054fe40;
    if (unaff_x19[0x2a] != 0) {
      lVar14 = 0;
      uVar22 = (*plVar15 + 8) * 0x517cc1b727220a95;
      lVar16 = unaff_x19[0x27];
      uVar20 = unaff_x19[0x28];
      bVar30 = (byte)(uVar22 >> 0x39);
      uVar22 = uVar22 & uVar20;
      uVar34 = *(undefined8 *)(lVar16 + uVar22);
      uVar12 = CONCAT17(-((byte)((ulong)uVar34 >> 0x38) == bVar30),
                        CONCAT16(-((byte)((ulong)uVar34 >> 0x30) == bVar30),
                                 CONCAT15(-((byte)((ulong)uVar34 >> 0x28) == bVar30),
                                          CONCAT14(-((byte)((ulong)uVar34 >> 0x20) == bVar30),
                                                   CONCAT13(-((byte)((ulong)uVar34 >> 0x18) ==
                                                             bVar30),CONCAT12(-((byte)((ulong)uVar34
                                                                                      >> 0x10) ==
                                                                               bVar30),CONCAT11(-((
                                                  byte)((ulong)uVar34 >> 8) == bVar30),
                                                  -((byte)uVar34 == bVar30))))))));
      while( true ) {
        uVar12 = uVar12 & 0x8080808080808080;
        if (uVar12 != 0) {
          do {
            uVar23 = (uVar12 >> 7 & 0xff00ff00ff00ff00) >> 8 | (uVar12 >> 7 & 0xff00ff00ff00ff) << 8
            ;
            uVar23 = (uVar23 & 0xffff0000ffff0000) >> 0x10 | (uVar23 & 0xffff0000ffff) << 0x10;
            uVar23 = uVar22 + ((ulong)LZCOUNT(uVar23 >> 0x20 | uVar23 << 0x20) >> 3) & uVar20;
            if (*plVar15 == *(long *)(lVar16 + -0x10 + uVar23 * -0x10)) {
              plVar28 = (long *)(lVar16 + uVar23 * -0x10 + -8);
              lVar14 = func_0x00578428(unaff_x19 + 9,plVar28);
              if (lVar14 == 1) goto code_r0x0054fe40;
              if (unaff_x19[0x32] == 0) goto code_r0x0054fe2c;
              lVar14 = 0;
              lVar16 = *plVar28;
              uVar12 = (lVar16 + 8) * 0x517cc1b727220a95;
              bVar30 = (byte)(uVar12 >> 0x39);
              goto code_r0x0054fc1c;
            }
            uVar12 = uVar12 - 1 & uVar12;
          } while (uVar12 != 0);
        }
        bVar33 = NEON_umaxv(CONCAT17(-((char)((ulong)uVar34 >> 0x38) == -1),
                                     CONCAT16(-((char)((ulong)uVar34 >> 0x30) == -1),
                                              CONCAT15(-((char)((ulong)uVar34 >> 0x28) == -1),
                                                       CONCAT14(-((char)((ulong)uVar34 >> 0x20) ==
                                                                 -1),CONCAT13(-((char)((ulong)uVar34
                                                                                      >> 0x18) == -1
                                                                               ),CONCAT12(-((char)((
                                                  ulong)uVar34 >> 0x10) == -1),
                                                  CONCAT11(-((char)((ulong)uVar34 >> 8) == -1),
                                                           -((char)uVar34 == -1)))))))),1);
        if ((bVar33 & 1) != 0) break;
        lVar14 = lVar14 + 8;
        uVar22 = uVar22 + lVar14 & uVar20;
        uVar34 = *(undefined8 *)(lVar16 + uVar22);
        uVar12 = CONCAT17(-((byte)((ulong)uVar34 >> 0x38) == bVar30),
                          CONCAT16(-((byte)((ulong)uVar34 >> 0x30) == bVar30),
                                   CONCAT15(-((byte)((ulong)uVar34 >> 0x28) == bVar30),
                                            CONCAT14(-((byte)((ulong)uVar34 >> 0x20) == bVar30),
                                                     CONCAT13(-((byte)((ulong)uVar34 >> 0x18) ==
                                                               bVar30),CONCAT12(-((byte)((ulong)
                                                  uVar34 >> 0x10) == bVar30),
                                                  CONCAT11(-((byte)((ulong)uVar34 >> 8) == bVar30),
                                                           -((byte)uVar34 == bVar30))))))));
      }
    }
    puVar13 = &UNK_009ed0d0;
    goto code_r0x00550188;
  }
  if (plVar19 != (long *)0x0) {
    func_0x00187bd4(pdVar18,(long)plVar19 << 2,4);
  }
  if (((___ZN12tracing_core8metadata9MAX_LEVEL17h4f715bd39d097130E < 3) &&
      ((bRam0000000000a2a900 - 1 < 2 ||
       ((bRam0000000000a2a900 != 0 && (cVar5 = func_0x007b1274(0xa2a8f0), cVar5 != '\0')))))) &&
     (uVar17 = func_0x005e7964(lRam0000000000a2a8f0), (uVar17 & 1) != 0)) {
    if (*(long *)(lRam0000000000a2a8f0 + 0x38) != 0) {
      plVar19 = *(long **)(lRam0000000000a2a8f0 + 0x30);
      if (plVar19 != (long *)0x0) {
        in_stack_00000100 = *(dword **)(lRam0000000000a2a8f0 + 0x40);
        in_stack_000000f8 = *(dword **)(lRam0000000000a2a8f0 + 0x38);
        in_stack_00000108 = *(dword **)(lRam0000000000a2a8f0 + 0x48);
        uStack0000000000000110 = 0;
        uStack0000000000000190 = (dword *)&uStack00000000000000f0;
        in_stack_00000198 = (long *)(auStack_7ffffffe + 0x800001fe);
        in_stack_000001a0 = (undefined8 *)&UNK_009ed1e8;
        lStack0000000000000140 = (long)&uStack0000000000000190;
        in_stack_00000148 = (dword *)((long)&MACH_HEADER.magic + 1);
        uStack00000000000000f0 = plVar19;
        in_stack_00000150 = (dword *)(lRam0000000000a2a8f0 + 0x30);
        func_0x005eb358(lRam0000000000a2a8f0,&lStack0000000000000140);
        goto code_r0x005502c0;
      }
    }
    puVar13 = &UNK_009ed5f0;
    goto code_r0x005514d0;
  }
code_r0x005502c0:
  lVar4 = unaff_x19[0x12];
  in_stack_00000048[1] = in_stack_00000068;
  *in_stack_00000048 = in_stack_00000060;
  in_stack_00000048[3] = in_stack_00000058;
  in_stack_00000048[2] = in_stack_00000050;
  func_0x0054ade4(lVar4,auStack_7ffffffe + 0x800001fe);
  if (((___ZN12tracing_core8metadata9MAX_LEVEL17h4f715bd39d097130E < 3) &&
      ((bRam0000000000a2a918 - 1 < 2 ||
       ((bRam0000000000a2a918 != 0 && (cVar5 = func_0x007b1274(0xa2a908), cVar5 != '\0')))))) &&
     (uVar17 = func_0x005e7964(lRam0000000000a2a908), (uVar17 & 1) != 0)) {
    if (*(long *)(lRam0000000000a2a908 + 0x38) != 0) {
      plVar19 = *(long **)(lRam0000000000a2a908 + 0x30);
      if (plVar19 != (long *)0x0) {
        in_stack_00000100 = *(dword **)(lRam0000000000a2a908 + 0x40);
        in_stack_000000f8 = *(dword **)(lRam0000000000a2a908 + 0x38);
        in_stack_00000108 = *(dword **)(lRam0000000000a2a908 + 0x48);
        uStack0000000000000110 = 0;
        uStack0000000000000190 = (dword *)&uStack00000000000000f0;
        in_stack_00000198 = (long *)(auStack_7ffffffe + 0x800001fe);
        in_stack_000001a0 = (undefined8 *)&UNK_009ed1e8;
        lStack0000000000000140 = (long)&uStack0000000000000190;
        in_stack_00000148 = (dword *)((long)&MACH_HEADER.magic + 1);
        uStack00000000000000f0 = plVar19;
        in_stack_00000150 = (dword *)(lRam0000000000a2a908 + 0x30);
        func_0x005eb358(lRam0000000000a2a908,&lStack0000000000000140);
        goto code_r0x005502f0;
      }
    }
    puVar13 = &UNK_009ed618;
code_r0x005514d0:
    func_0x007a23d8(&UNK_008ab0d6,0x22,puVar13);
    goto LAB_00551610;
  }
code_r0x005502f0:
  func_0x00549c2c(unaff_x19[0x12],in_stack_00000048);
  if ((___ZN12tracing_core8metadata9MAX_LEVEL17h4f715bd39d097130E < 3) &&
     (((bRam0000000000a2a930 - 1 < 2 ||
       ((bRam0000000000a2a930 != 0 && (cVar5 = func_0x007b1274(0xa2a920), cVar5 != '\0')))) &&
      (uVar17 = func_0x005e7964(lRam0000000000a2a920), (uVar17 & 1) != 0)))) {
    if (*(long *)(lRam0000000000a2a920 + 0x38) != 0) {
      plVar19 = *(long **)(lRam0000000000a2a920 + 0x30);
      if (plVar19 != (long *)0x0) {
        in_stack_00000100 = *(dword **)(lRam0000000000a2a920 + 0x40);
        in_stack_000000f8 = *(dword **)(lRam0000000000a2a920 + 0x38);
        in_stack_00000108 = *(dword **)(lRam0000000000a2a920 + 0x48);
        uStack0000000000000110 = 0;
        uStack0000000000000190 = (dword *)&uStack00000000000000f0;
        in_stack_00000198 = (long *)(auStack_7ffffffe + 0x800001fe);
        in_stack_000001a0 = (undefined8 *)&UNK_009ed1e8;
        lStack0000000000000140 = (long)&uStack0000000000000190;
        in_stack_00000148 = (dword *)((long)&MACH_HEADER.magic + 1);
        uStack00000000000000f0 = plVar19;
        in_stack_00000150 = (dword *)(lRam0000000000a2a920 + 0x30);
        func_0x005eb358(lRam0000000000a2a920,&lStack0000000000000140);
        goto code_r0x0055030c;
      }
    }
    puVar13 = &UNK_009ed640;
    goto code_r0x005514d0;
  }
code_r0x0055030c:
  lVar4 = unaff_x19[0x12];
  in_stack_00000048[1] = in_stack_00000068;
  *in_stack_00000048 = in_stack_00000060;
  in_stack_00000048[3] = in_stack_00000058;
  in_stack_00000048[2] = in_stack_00000050;
  func_0x0054ade4(lVar4,auStack_7ffffffe + 0x800001fe);
  if ((((___ZN12tracing_core8metadata9MAX_LEVEL17h4f715bd39d097130E != 5) &&
       (___ZN12tracing_core8metadata9MAX_LEVEL17h4f715bd39d097130E < 3)) &&
      ((bRam0000000000a2a948 - 1 < 2 ||
       ((bRam0000000000a2a948 != 0 && (cVar5 = func_0x007b1274(0xa2a938), cVar5 != '\0')))))) &&
     (iVar6 = func_0x005e7964(lRam0000000000a2a938), iVar6 != 0)) {
    if (*(long *)(lRam0000000000a2a938 + 0x38) != 0) {
      plVar19 = *(long **)(lRam0000000000a2a938 + 0x30);
      if (plVar19 != (long *)0x0) {
        in_stack_00000100 = *(dword **)(lRam0000000000a2a938 + 0x40);
        in_stack_000000f8 = *(dword **)(lRam0000000000a2a938 + 0x38);
        in_stack_00000108 = *(dword **)(lRam0000000000a2a938 + 0x48);
        uStack0000000000000110 = 0;
        uStack0000000000000190 = (dword *)&uStack00000000000000f0;
        in_stack_00000198 = (long *)(auStack_7ffffffe + 0x800001fe);
        in_stack_000001a0 = (undefined8 *)&UNK_009ed1e8;
        lStack0000000000000140 = (long)&uStack0000000000000190;
        in_stack_00000148 = (dword *)((long)&MACH_HEADER.magic + 1);
        uStack00000000000000f0 = plVar19;
        in_stack_00000150 = (dword *)(lRam0000000000a2a938 + 0x30);
        func_0x005eb358(lRam0000000000a2a938,&lStack0000000000000140);
        goto code_r0x00550704;
      }
    }
    puVar13 = &UNK_009ed668;
    goto code_r0x005514d0;
  }
code_r0x00550704:
  plVar8 = (long *)unaff_x19[0x23];
  lVar4 = unaff_x19[0x26];
  lVar14 = *plVar8;
  plVar19 = plVar8 + 1;
  uVar17 = CONCAT17(-(-1 < lVar14),
                    CONCAT16(-(-1 < (char)((ulong)lVar14 >> 0x30)),
                             CONCAT15(-(-1 < (char)((ulong)lVar14 >> 0x28)),
                                      CONCAT14(-(-1 < (char)((ulong)lVar14 >> 0x20)),
                                               CONCAT13(-(-1 < (char)((ulong)lVar14 >> 0x18)),
                                                        CONCAT12(-(-1 < (char)((ulong)lVar14 >> 0x10
                                                                              )),
                                                                 CONCAT11(-(-1 < (char)((ulong)
                                                  lVar14 >> 8)),-(-1 < (char)lVar14)))))))) &
           0x8080808080808080;
  uStack00000000000001c0 = in_stack_00000060;
  lVar14 = 0;
  plVar11 = uStack00000000000000f0;
  while (lVar4 != 0) {
    if (uVar17 == 0) {
      plVar15 = plVar19;
      do {
        plVar19 = plVar15 + 1;
        lVar16 = *plVar15;
        plVar8 = plVar8 + -0x28;
        uVar17 = CONCAT17(-(-1 < lVar16),
                          CONCAT16(-(-1 < (char)((ulong)lVar16 >> 0x30)),
                                   CONCAT15(-(-1 < (char)((ulong)lVar16 >> 0x28)),
                                            CONCAT14(-(-1 < (char)((ulong)lVar16 >> 0x20)),
                                                     CONCAT13(-(-1 < (char)((ulong)lVar16 >> 0x18)),
                                                              CONCAT12(-(-1 < (char)((ulong)lVar16
                                                                                    >> 0x10)),
                                                                       CONCAT11(-(-1 < (char)((ulong
                                                  )lVar16 >> 8)),-(-1 < (char)lVar16)))))))) &
                 0x8080808080808080;
        plVar15 = plVar19;
      } while (uVar17 == 0);
    }
    uVar12 = (uVar17 >> 7 & 0xff00ff00ff00ff00) >> 8 | (uVar17 >> 7 & 0xff00ff00ff00ff) << 8;
    uVar12 = (uVar12 & 0xffff0000ffff0000) >> 0x10 | (uVar12 & 0xffff0000ffff) << 0x10;
    uVar17 = uVar17 - 1 & uVar17;
    iVar6 = (int)((ulong)LZCOUNT(uVar12 >> 0x20 | uVar12 << 0x20) >> 3);
    lVar4 = lVar4 + -1;
    uStack00000000000000f0 = (long *)plVar8[(long)-iVar6 * 5 + -5];
    if (uStack00000000000000f0 == (long *)0x0) break;
    pdVar24 = (dword *)plVar8[(long)-iVar6 * 5 + -4];
    pdVar18 = (dword *)plVar8[(long)-iVar6 * 5 + -3];
    in_stack_00000108 = (dword *)plVar8[(long)-iVar6 * 5 + -2];
    uVar12 = plVar8[(long)-iVar6 * 5 + -1];
    lVar16 = *uStack00000000000000f0;
    *uStack00000000000000f0 = lVar16 + -1;
    LORelease();
    in_stack_000000f8 = pdVar24;
    in_stack_00000100 = pdVar18;
    uStack0000000000000110 = uVar12;
    if (lVar16 == 1) {
      func_0x005d2ac4(&uStack00000000000000f0);
    }
    plVar11 = uStack00000000000000f0;
    if (pdVar24 == (dword *)0x0) break;
    lVar16 = lVar14 + 1;
    in_stack_00000120 = (undefined *)((long)pdVar24 + (long)pdVar18) + 1;
    lVar31 = *(long *)pdVar24;
    pdVar25 = (dword *)((long)pdVar18 * 9 + 0x11);
    uStack00000000000000f0 = (long *)((ulong)(pdVar18 != (dword *)0x0) << 3);
    pdVar9 = pdVar24 + (-1 - (long)pdVar18) * 2;
    pdVar10 = pdVar24 + 2;
    uVar21 = CONCAT17(-(-1 < lVar31),
                      CONCAT16(-(-1 < (char)((ulong)lVar31 >> 0x30)),
                               CONCAT15(-(-1 < (char)((ulong)lVar31 >> 0x28)),
                                        CONCAT14(-(-1 < (char)((ulong)lVar31 >> 0x20)),
                                                 CONCAT13(-(-1 < (char)((ulong)lVar31 >> 0x18)),
                                                          CONCAT12(-(-1 < (char)((ulong)lVar31 >>
                                                                                0x10)),
                                                                   CONCAT11(-(-1 < (char)((ulong)
                                                  lVar31 >> 8)),-(-1 < (char)lVar31)))))))) &
             0x8080808080808080;
    in_stack_00000108 = pdVar24;
    in_stack_00000128 = uVar12;
    in_stack_000000f8 = pdVar25;
    in_stack_00000100 = pdVar9;
    in_stack_00000118 = pdVar10;
    uStack0000000000000110 = uVar21;
    for (; uVar12 != 0; uVar12 = uVar12 - 1) {
      while (uVar21 == 0) {
        lVar31 = *(long *)pdVar10;
        pdVar24 = pdVar24 + -0x10;
        pdVar10 = pdVar10 + 2;
        uVar21 = CONCAT17(-(-1 < lVar31),
                          CONCAT16(-(-1 < (char)((ulong)lVar31 >> 0x30)),
                                   CONCAT15(-(-1 < (char)((ulong)lVar31 >> 0x28)),
                                            CONCAT14(-(-1 < (char)((ulong)lVar31 >> 0x20)),
                                                     CONCAT13(-(-1 < (char)((ulong)lVar31 >> 0x18)),
                                                              CONCAT12(-(-1 < (char)((ulong)lVar31
                                                                                    >> 0x10)),
                                                                       CONCAT11(-(-1 < (char)((ulong
                                                  )lVar31 >> 8)),-(-1 < (char)lVar31)))))))) &
                 0x8080808080808080;
      }
      uVar20 = (uVar21 >> 7 & 0xff00ff00ff00ff00) >> 8 | (uVar21 >> 7 & 0xff00ff00ff00ff) << 8;
      uVar20 = (uVar20 & 0xffff0000ffff0000) >> 0x10 | (uVar20 & 0xffff0000ffff) << 0x10;
      uVar21 = uVar21 - 1 & uVar21;
      func_0x0056392c(&uStack00000000000001c0,
                      *(undefined8 *)
                       ((long)pdVar24 + (-8 - (LZCOUNT(uVar20 >> 0x20 | uVar20 << 0x20) & 0x78U))),
                      lVar14);
    }
    lVar14 = lVar16;
    plVar11 = uStack00000000000000f0;
    if ((pdVar18 != (dword *)0x0) && (pdVar25 != (dword *)0x0)) {
      func_0x00187bd4(pdVar9,pdVar25,8);
      plVar11 = uStack00000000000000f0;
    }
  }
  uStack00000000000000f0 = plVar11;
  func_0x0053b79c(auStack_7ffffffe + 0x800001fe);
  if (((___ZN12tracing_core8metadata9MAX_LEVEL17h4f715bd39d097130E < 3) &&
      ((bRam0000000000a2a960 - 1 < 2 ||
       ((bRam0000000000a2a960 != 0 && (cVar5 = func_0x007b1274(0xa2a950), cVar5 != '\0')))))) &&
     (uVar17 = func_0x005e7964(lRam0000000000a2a950), (uVar17 & 1) != 0)) {
    if (*(long *)(lRam0000000000a2a950 + 0x38) != 0) {
      plVar19 = *(long **)(lRam0000000000a2a950 + 0x30);
      if (plVar19 != (long *)0x0) {
        in_stack_00000100 = *(dword **)(lRam0000000000a2a950 + 0x40);
        in_stack_000000f8 = *(dword **)(lRam0000000000a2a950 + 0x38);
        in_stack_00000108 = *(dword **)(lRam0000000000a2a950 + 0x48);
        uStack0000000000000110 = 0;
        uStack0000000000000190 = (dword *)&uStack00000000000000f0;
        in_stack_00000198 = (long *)(auStack_7ffffffe + 0x800001fe);
        in_stack_000001a0 = (undefined8 *)&UNK_009ed1e8;
        lStack0000000000000140 = (long)&uStack0000000000000190;
        in_stack_00000148 = (dword *)((long)&MACH_HEADER.magic + 1);
        uStack00000000000000f0 = plVar19;
        in_stack_00000150 = (dword *)(lRam0000000000a2a950 + 0x30);
        func_0x005eb358(lRam0000000000a2a950,&lStack0000000000000140);
        goto LAB_00550910;
      }
    }
    func_0x007a23d8(&UNK_008ab0d6,0x22,&UNK_009ed690);
    goto LAB_00551610;
  }
LAB_00550910:
  _in_stack_00000128 = func_0x00596f50(&UNK_009ed6b8);
  uStack00000000000000f0 = (long *)0x0;
  in_stack_000000f8 = &MACH_HEADER.cpusubtype;
  in_stack_00000100 = (dword *)0x0;
  in_stack_00000108 = (dword *)&UNK_0089eb70;
  uStack0000000000000110 = 0;
  in_stack_00000118 = (dword *)0x0;
  in_stack_00000120 = (undefined *)0x0;
  pdVar24 = (dword *)unaff_x19[9];
  pdVar18 = (dword *)unaff_x19[10];
  lVar4 = unaff_x19[0xb];
  func_0x004b92d8(auStack_7ffffffe + 0x80000216);
  in_stack_00000158 = pdVar18 + lVar4 * 0xc;
  lStack0000000000000140 = (long)pdVar18;
  in_stack_00000148 = pdVar18;
  in_stack_00000150 = pdVar24;
  if (lVar4 != 0) {
    do {
      in_stack_00000148 = pdVar18 + 0xc;
      if (*(long **)pdVar18 == (long *)0x0) break;
      plVar8 = *(long **)(pdVar18 + 2);
      lVar4 = *(long *)(pdVar18 + 8);
      lVar14 = *plVar8;
      plVar19 = plVar8 + 1;
      uVar17 = CONCAT17(-(-1 < lVar14),
                        CONCAT16(-(-1 < (char)((ulong)lVar14 >> 0x30)),
                                 CONCAT15(-(-1 < (char)((ulong)lVar14 >> 0x28)),
                                          CONCAT14(-(-1 < (char)((ulong)lVar14 >> 0x20)),
                                                   CONCAT13(-(-1 < (char)((ulong)lVar14 >> 0x18)),
                                                            CONCAT12(-(-1 < (char)((ulong)lVar14 >>
                                                                                  0x10)),
                                                                     CONCAT11(-(-1 < (char)((ulong)
                                                  lVar14 >> 8)),-(-1 < (char)lVar14)))))))) &
               0x8080808080808080;
      plVar11 = *(long **)pdVar18;
      while( true ) {
        uStack0000000000000188 = plVar11;
        if (lVar4 == 0) break;
        if (uVar17 == 0) {
          plVar15 = plVar19;
          do {
            plVar19 = plVar15 + 1;
            lVar14 = *plVar15;
            plVar8 = plVar8 + -8;
            uVar17 = CONCAT17(-(-1 < lVar14),
                              CONCAT16(-(-1 < (char)((ulong)lVar14 >> 0x30)),
                                       CONCAT15(-(-1 < (char)((ulong)lVar14 >> 0x28)),
                                                CONCAT14(-(-1 < (char)((ulong)lVar14 >> 0x20)),
                                                         CONCAT13(-(-1 < (char)((ulong)lVar14 >>
                                                                               0x18)),
                                                                  CONCAT12(-(-1 < (char)((ulong)
                                                  lVar14 >> 0x10)),
                                                  CONCAT11(-(-1 < (char)((ulong)lVar14 >> 8)),
                                                           -(-1 < (char)lVar14)))))))) &
                     0x8080808080808080;
            plVar15 = plVar19;
          } while (uVar17 == 0);
        }
        uVar12 = (uVar17 >> 7 & 0xff00ff00ff00ff00) >> 8 | (uVar17 >> 7 & 0xff00ff00ff00ff) << 8;
        uVar12 = (uVar12 & 0xffff0000ffff0000) >> 0x10 | (uVar12 & 0xffff0000ffff) << 0x10;
        uVar17 = uVar17 - 1 & uVar17;
        lVar4 = lVar4 + -1;
        pdVar24 = *(dword **)
                   ((long)plVar8 + (-8 - (LZCOUNT(uVar12 >> 0x20 | uVar12 << 0x20) & 0x78U)));
        lVar14 = *plVar11;
        *plVar11 = lVar14 + 1;
        uStack0000000000000190 = pdVar24;
        if (lVar14 < 0) {
          func_0x007a05dc();
          goto LAB_00551610;
        }
        uVar34 = func_0x005787f4(in_stack_00000128,in_stack_00000128._8_8_,pdVar24);
        func_0x00589494(&uStack00000000000000f0,uVar34,pdVar24,plVar11);
        plVar11 = uStack0000000000000188;
        uStack00000000000001e0 = extraout_x1;
        if (extraout_x1 != (long *)0x0) {
          lVar14 = *extraout_x1;
          *extraout_x1 = lVar14 + -1;
          LORelease();
          if (lVar14 == 1) {
            func_0x005d2ac4(&uStack00000000000001e0);
            plVar11 = uStack0000000000000188;
          }
        }
      }
      func_0x0053b6d8(auStack_7ffffffe + 0x800001fe);
      lVar4 = *uStack0000000000000188;
      *uStack0000000000000188 = lVar4 + -1;
      LORelease();
      if (lVar4 == 1) {
        func_0x005d2ac4(&uStack0000000000000188);
      }
      pdVar18 = in_stack_00000148;
    } while (in_stack_00000148 != in_stack_00000158);
  }
  func_0x005929e8(&lStack0000000000000140);
  if (___ZN12tracing_core8metadata9MAX_LEVEL17h4f715bd39d097130E < 3) {
    if (bRam0000000000a2a978 - 1 < 2) {
code_r0x00551130:
      iVar6 = func_0x005e7964(lRam0000000000a2a968);
      if (iVar6 != 0) {
        if (*(long *)(lRam0000000000a2a968 + 0x38) != 0) {
          pdVar24 = *(dword **)(lRam0000000000a2a968 + 0x30);
          if (pdVar24 != (dword *)0x0) {
            in_stack_00000150 = *(dword **)(lRam0000000000a2a968 + 0x40);
            in_stack_00000148 = *(dword **)(lRam0000000000a2a968 + 0x38);
            in_stack_00000158 = *(dword **)(lRam0000000000a2a968 + 0x48);
            in_stack_00000160 = 0;
            uStack00000000000001e0 = &lStack0000000000000140;
            in_stack_000001e8 = (undefined8 *)(auStack_7ffffffe + 0x800001fe);
            uStack0000000000000190 = (dword *)&uStack00000000000001e0;
            in_stack_00000198 = (long *)((long)&MACH_HEADER.magic + 1);
            lStack0000000000000140 = (long)pdVar24;
            in_stack_000001a0 = (undefined8 *)(lRam0000000000a2a968 + 0x30);
            func_0x005eb358(lRam0000000000a2a968,&uStack0000000000000190);
            goto code_r0x00550b20;
          }
        }
        func_0x007a23d8(&UNK_008ab0d6,0x22,&UNK_009ed6c0);
        goto LAB_00551610;
      }
    }
    else if (bRam0000000000a2a978 != 0) {
      cVar5 = func_0x007b1274(0xa2a968);
      if (cVar5 != '\0') goto code_r0x00551130;
    }
  }
code_r0x00550b20:
  lVar1 = _UNK_007fc128;
  lVar31 = _UNK_007fc120;
  plVar8 = (long *)unaff_x19[0x2f];
  lVar4 = unaff_x19[0x30];
  lVar14 = unaff_x19[0x32];
  lVar16 = *plVar8;
  plVar19 = plVar8 + 1;
  uVar17 = CONCAT17(-(-1 < lVar16),
                    CONCAT16(-(-1 < (char)((ulong)lVar16 >> 0x30)),
                             CONCAT15(-(-1 < (char)((ulong)lVar16 >> 0x28)),
                                      CONCAT14(-(-1 < (char)((ulong)lVar16 >> 0x20)),
                                               CONCAT13(-(-1 < (char)((ulong)lVar16 >> 0x18)),
                                                        CONCAT12(-(-1 < (char)((ulong)lVar16 >> 0x10
                                                                              )),
                                                                 CONCAT11(-(-1 < (char)((ulong)
                                                  lVar16 >> 8)),-(-1 < (char)lVar16)))))))) &
           0x8080808080808080;
  lVar16 = -0x7fffffffffffffff;
code_r0x00550bb8:
  if (lVar16 == -0x7fffffffffffffff) goto code_r0x00550c48;
joined_r0x00550bc4:
  if (in_stack_00000278 != 0) {
    if (in_stack_00000260 == 0) {
      pdVar24 = in_stack_00000268;
      do {
        in_stack_00000268 = pdVar24 + 2;
        lVar32 = *(long *)pdVar24;
        in_stack_00000258 = in_stack_00000258 + -0x60;
        in_stack_00000260 =
             CONCAT17(-(-1 < lVar32),
                      CONCAT16(-(-1 < (char)((ulong)lVar32 >> 0x30)),
                               CONCAT15(-(-1 < (char)((ulong)lVar32 >> 0x28)),
                                        CONCAT14(-(-1 < (char)((ulong)lVar32 >> 0x20)),
                                                 CONCAT13(-(-1 < (char)((ulong)lVar32 >> 0x18)),
                                                          CONCAT12(-(-1 < (char)((ulong)lVar32 >>
                                                                                0x10)),
                                                                   CONCAT11(-(-1 < (char)((ulong)
                                                  lVar32 >> 8)),-(-1 < (char)lVar32)))))))) &
             0x8080808080808080;
        pdVar24 = in_stack_00000268;
      } while (in_stack_00000260 == 0);
    }
    uVar12 = (in_stack_00000260 & 0xaaaaaaaaaaaaaaaa) >> 1 |
             (in_stack_00000260 & 0x5555555555555555) << 1;
    uVar12 = (uVar12 & 0xcccccccccccccccc) >> 2 | (uVar12 & 0x3333333333333333) << 2;
    uVar12 = (uVar12 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar12 & 0xf0f0f0f0f0f0f0f) << 4;
    uVar12 = (uVar12 & 0xff00ff00ff00ff00) >> 8 | (uVar12 & 0xff00ff00ff00ff) << 8;
    uVar12 = (uVar12 & 0xffff0000ffff0000) >> 0x10 | (uVar12 & 0xffff0000ffff) << 0x10;
    in_stack_00000260 = in_stack_00000260 - 1 & in_stack_00000260;
    iVar6 = (int)((ulong)LZCOUNT(uVar12 >> 0x20 | uVar12 << 0x20) >> 3);
    in_stack_00000278 = in_stack_00000278 - 1;
    pdVar24 = *(dword **)(in_stack_00000258 + ((long)-iVar6 * 6 + -4) * 2);
    if (pdVar24 != (dword *)0x0) goto code_r0x00550c08;
  }
  func_0x0053b428(auStack_7ffffffe + 0x8000023e);
  lVar16 = -0x7fffffffffffffff;
code_r0x00550c48:
  if (((ulong)(lVar4 != 0) << 3 == -0x7fffffffffffffff) || (lVar14 == 0)) {
code_r0x00550c54:
    func_0x005497d8(auStack_7ffffffe + 0x800001fe);
    if (2 < ___ZN12tracing_core8metadata9MAX_LEVEL17h4f715bd39d097130E) goto code_r0x00550f84;
    if (1 < bRam0000000000a2a990 - 1) {
      if (bRam0000000000a2a990 == 0) goto code_r0x00550f84;
      cVar5 = func_0x007b1274(0xa2a980);
      if (cVar5 == '\0') goto code_r0x00550f84;
    }
    uVar17 = func_0x005e7964(lRam0000000000a2a980);
    if ((uVar17 & 1) == 0) {
code_r0x00550f84:
      in_stack_00000028[1] = in_stack_00000068;
      *in_stack_00000028 = uStack00000000000001c0;
      in_stack_00000028[3] = in_stack_00000058;
      in_stack_00000028[2] = in_stack_00000050;
      in_stack_00000028[8] = in_stack_00000108;
      in_stack_00000028[7] = in_stack_00000100;
      in_stack_00000028[10] = in_stack_00000118;
      in_stack_00000028[9] = uStack0000000000000110;
      in_stack_00000028[0xc] = in_stack_00000128;
      in_stack_00000028[0xb] = in_stack_00000120;
      lVar4 = unaff_x19[0x33];
      in_stack_00000028[0xd] = in_stack_00000130;
      in_stack_00000028[6] = in_stack_000000f8;
      in_stack_00000028[5] = uStack00000000000000f0;
      in_stack_00000028[4] = lVar4;
      if (in_stack_000000d0 != 0) {
        func_0x00187bd4(in_stack_000000d8,in_stack_000000d0 << 2,4);
      }
      if (in_stack_00000038 < 3) {
        if (uStack00000000000000a0 != 2) {
          func_0x005ec378(&uStack00000000000000a0,&uStack00000000000000b8);
        }
        func_0x005492bc(&uStack00000000000000a0);
      }
      func_0x004b92d8(unaff_x19 + 3);
      if (*unaff_x19 != 0) {
        func_0x00187bd4(unaff_x19[1],*unaff_x19 << 4,8);
      }
      func_0x0053abe0(unaff_x19 + 0x13);
      func_0x004d0c00(unaff_x19 + 0x17);
      func_0x004d0c00(unaff_x19 + 0x1b);
      func_0x0053aa10(unaff_x19 + 0x1f);
      func_0x0053a3f4(unaff_x19 + 0x27);
      func_0x0053a3f4(in_stack_00000048);
      return;
    }
    if (*(long *)(lRam0000000000a2a980 + 0x38) != 0) {
      pdVar24 = *(dword **)(lRam0000000000a2a980 + 0x30);
      if (pdVar24 != (dword *)0x0) {
        in_stack_00000150 = *(dword **)(lRam0000000000a2a980 + 0x40);
        in_stack_00000148 = *(dword **)(lRam0000000000a2a980 + 0x38);
        in_stack_00000158 = *(dword **)(lRam0000000000a2a980 + 0x48);
        in_stack_00000160 = 0;
        uStack00000000000001e0 = &lStack0000000000000140;
        in_stack_000001e8 = (undefined8 *)(auStack_7ffffffe + 0x800001fe);
        uStack0000000000000190 = (dword *)&uStack00000000000001e0;
        in_stack_00000198 = (long *)((long)&MACH_HEADER.magic + 1);
        lStack0000000000000140 = (long)pdVar24;
        in_stack_000001a0 = (undefined8 *)(lRam0000000000a2a980 + 0x30);
        func_0x005eb358(lRam0000000000a2a980,&uStack0000000000000190);
        goto code_r0x00550f84;
      }
    }
    func_0x007a23d8(&UNK_008ab0d6,0x22,&UNK_009ed6e8);
    goto LAB_00551610;
  }
  if (uVar17 == 0) {
    plVar11 = plVar19;
    do {
      plVar19 = plVar11 + 1;
      lVar32 = *plVar11;
      plVar8 = plVar8 + -0x28;
      uVar17 = CONCAT17(-(-1 < lVar32),
                        CONCAT16(-(-1 < (char)((ulong)lVar32 >> 0x30)),
                                 CONCAT15(-(-1 < (char)((ulong)lVar32 >> 0x28)),
                                          CONCAT14(-(-1 < (char)((ulong)lVar32 >> 0x20)),
                                                   CONCAT13(-(-1 < (char)((ulong)lVar32 >> 0x18)),
                                                            CONCAT12(-(-1 < (char)((ulong)lVar32 >>
                                                                                  0x10)),
                                                                     CONCAT11(-(-1 < (char)((ulong)
                                                  lVar32 >> 8)),-(-1 < (char)lVar32)))))))) &
               0x8080808080808080;
      plVar11 = plVar19;
    } while (uVar17 == 0);
  }
  uVar12 = (uVar17 >> 7 & 0xff00ff00ff00ff00) >> 8 | (uVar17 >> 7 & 0xff00ff00ff00ff) << 8;
  uVar12 = (uVar12 & 0xffff0000ffff0000) >> 0x10 | (uVar12 & 0xffff0000ffff) << 0x10;
  uVar17 = uVar17 - 1 & uVar17;
  iVar6 = (int)((ulong)LZCOUNT(uVar12 >> 0x20 | uVar12 << 0x20) >> 3);
  lVar14 = lVar14 + -1;
  pdVar24 = (dword *)plVar8[(long)-iVar6 * 5 + -5];
  if (pdVar24 == (dword *)0x0) goto code_r0x00550c54;
  in_stack_00000258 = (dword *)plVar8[(long)-iVar6 * 5 + -4];
  pdVar18 = (dword *)plVar8[(long)-iVar6 * 5 + -3];
  in_stack_00000158 = (dword *)plVar8[(long)-iVar6 * 5 + -2];
  in_stack_00000278 = plVar8[(long)-iVar6 * 5 + -1];
  lVar32 = *(long *)pdVar24;
  *(long *)pdVar24 = lVar32 + -1;
  LORelease();
  lStack0000000000000140 = (long)pdVar24;
  in_stack_00000148 = in_stack_00000258;
  in_stack_00000150 = pdVar18;
  in_stack_00000160 = in_stack_00000278;
  if (lVar32 == 1) {
    func_0x005d2ac4(&lStack0000000000000140);
  }
  if (in_stack_00000258 == (dword *)0x0) goto code_r0x00550c54;
  in_stack_00000268 = in_stack_00000258 + 2;
  lVar32 = *(long *)in_stack_00000258;
  in_stack_00000260 =
       CONCAT17(-(-1 < lVar32),
                CONCAT16(-(-1 < (char)((ulong)lVar32 >> 0x30)),
                         CONCAT15(-(-1 < (char)((ulong)lVar32 >> 0x28)),
                                  CONCAT14(-(-1 < (char)((ulong)lVar32 >> 0x20)),
                                           CONCAT13(-(-1 < (char)((ulong)lVar32 >> 0x18)),
                                                    CONCAT12(-(-1 < (char)((ulong)lVar32 >> 0x10)),
                                                             CONCAT11(-(-1 < (char)((ulong)lVar32 >>
                                                                                   8)),
                                                                      -(-1 < (char)lVar32)))))))) &
       0x8080808080808080;
  lVar32 = (ulong)(pdVar18 != (dword *)0x0) << 3;
  bVar3 = lVar16 != -0x7fffffffffffffff;
  lVar16 = lVar32;
  if (bVar3) {
    func_0x0053b428(auStack_7ffffffe + 0x8000023e);
  }
  goto joined_r0x00550bc4;
joined_r0x0054f6c0:
  if (uVar12 != 0) {
    uVar20 = (uVar12 >> 7 & 0xff00ff00ff00ff00) >> 8 | (uVar12 >> 7 & 0xff00ff00ff00ff) << 8;
    uVar20 = (uVar20 & 0xffff0000ffff0000) >> 0x10 | (uVar20 & 0xffff0000ffff) << 0x10;
    uVar20 = uVar22 + ((ulong)LZCOUNT(uVar20 >> 0x20 | uVar20 << 0x20) >> 3) & uVar21;
    if (*plVar19 != *(long *)(lVar14 + -0x20 + uVar20 * -0x20)) {
      uVar12 = uVar12 - 1 & uVar12;
      goto joined_r0x0054f6c0;
    }
    lVar14 = lVar14 + uVar20 * -0x20;
    lVar4 = *(long *)(lVar14 + -0x18);
    if (lVar4 == 0) {
      lStack0000000000000140 = 0;
      in_stack_00000158 = (dword *)0x0;
    }
    else {
      in_stack_00000210 = (dword *)((long)&MACH_HEADER.magic + 2);
      func_0x0055f72c(&lStack0000000000000140,lVar4,*(undefined8 *)(lVar14 + -0x10),
                      auStack_7ffffffe + 0x800001fe);
    }
    auVar47 = func_0x00592630(&lStack0000000000000140);
    puVar7 = auVar47._0_8_;
    if ((puVar7 == (ulong *)0x0) || (in_stack_00000080 < *puVar7)) goto LAB_0054f87c;
    if ((char)puVar7[2] == '\0') {
      if (puVar7[1] < in_stack_00000080) goto LAB_0054f87c;
    }
    else if (puVar7[1] <= in_stack_00000080) goto LAB_0054f87c;
    plVar8 = (long *)func_0x00578b20(unaff_x19 + 9,plVar19);
    if (plVar8 != (long *)0x0) {
      if (plVar8[3] == 0) goto LAB_00550250;
      lVar4 = 0;
      lVar14 = *plVar8;
      uVar21 = plVar8[1];
      bVar30 = (byte)((ulong)((long)(uStack00000000000001e0 + 1) * 0x517cc1b727220a95) >> 0x39);
      uVar20 = (long)(uStack00000000000001e0 + 1) * 0x517cc1b727220a95 & uVar21;
      uVar34 = *(undefined8 *)(lVar14 + uVar20);
      uVar12 = CONCAT17(-((byte)((ulong)uVar34 >> 0x38) == bVar30),
                        CONCAT16(-((byte)((ulong)uVar34 >> 0x30) == bVar30),
                                 CONCAT15(-((byte)((ulong)uVar34 >> 0x28) == bVar30),
                                          CONCAT14(-((byte)((ulong)uVar34 >> 0x20) == bVar30),
                                                   CONCAT13(-((byte)((ulong)uVar34 >> 0x18) ==
                                                             bVar30),CONCAT12(-((byte)((ulong)uVar34
                                                                                      >> 0x10) ==
                                                                               bVar30),CONCAT11(-((
                                                  byte)((ulong)uVar34 >> 8) == bVar30),
                                                  -((byte)uVar34 == bVar30)))))))) &
               0x8080808080808080;
      goto joined_r0x0054f804;
    }
    lVar4 = *(long *)*plVar19;
    *(long *)*plVar19 = (long)(lVar4 + (long)unaff_x27);
    if (lVar4 < 0) {
      func_0x007a05dc();
      goto LAB_00551610;
    }
    func_0x00562038(auStack_7ffffffe + 0x800001fe,unaff_x19 + 0x2f,*plVar19);
    pdVar9 = pdVar10;
    if (in_stack_00000210 != (dword *)0x0) {
      unaff_x22[2] = in_stack_00000068;
      unaff_x22[1] = in_stack_00000060;
      unaff_x22[4] = in_stack_00000058;
      unaff_x22[3] = in_stack_00000050;
      pdVar9 = (dword *)func_0x0053c020(pdVar10,pdVar24,auStack_7ffffffe + 0x800001fe);
    }
    func_0x00561d98(auStack_7ffffffe + 0x800001fe,pdVar9 + -8,*auVar47._8_8_,
                    *(undefined8 *)(auVar47._8_8_ + 2));
    if (in_stack_00000210 != (dword *)0x0) {
      unaff_x22[3] = _UNK_009ee240;
      unaff_x22[2] = _UNK_009ee238;
      unaff_x22[5] = _UNK_009ee250;
      unaff_x22[4] = _UNK_009ee248;
      pdVar10 = (dword *)func_0x00203e2c(in_stack_00000210,pdVar10,auStack_7ffffffe + 0x800001fe);
      in_stack_00000210 = (dword *)CONCAT44((int)((ulong)in_stack_00000210 >> 0x20),(int)pdVar24);
      pdVar18 = in_stack_00000218;
    }
    func_0x00563744(pdVar10 + -8,uStack00000000000001e0);
    goto LAB_0054f4fc;
  }
  bVar33 = NEON_umaxv(CONCAT17(-((char)((ulong)uVar34 >> 0x38) == -1),
                               CONCAT16(-((char)((ulong)uVar34 >> 0x30) == -1),
                                        CONCAT15(-((char)((ulong)uVar34 >> 0x28) == -1),
                                                 CONCAT14(-((char)((ulong)uVar34 >> 0x20) == -1),
                                                          CONCAT13(-((char)((ulong)uVar34 >> 0x18)
                                                                    == -1),CONCAT12(-((char)((ulong)
                                                  uVar34 >> 0x10) == -1),
                                                  CONCAT11(-((char)((ulong)uVar34 >> 8) == -1),
                                                           -((char)uVar34 == -1)))))))),1);
  if ((bVar33 & 1) != 0) goto LAB_0054f87c;
  lVar4 = lVar4 + 8;
  uVar22 = uVar22 + lVar4 & uVar21;
  uVar34 = *(undefined8 *)(lVar14 + uVar22);
  uVar12 = CONCAT17(-((byte)((ulong)uVar34 >> 0x38) == bVar30),
                    CONCAT16(-((byte)((ulong)uVar34 >> 0x30) == bVar30),
                             CONCAT15(-((byte)((ulong)uVar34 >> 0x28) == bVar30),
                                      CONCAT14(-((byte)((ulong)uVar34 >> 0x20) == bVar30),
                                               CONCAT13(-((byte)((ulong)uVar34 >> 0x18) == bVar30),
                                                        CONCAT12(-((byte)((ulong)uVar34 >> 0x10) ==
                                                                  bVar30),CONCAT11(-((byte)((ulong)
                                                  uVar34 >> 8) == bVar30),-((byte)uVar34 == bVar30))
                                                  )))))) & 0x8080808080808080;
  goto joined_r0x0054f6c0;
joined_r0x0054f804:
  if (uVar12 != 0) {
    uVar22 = (uVar12 >> 7 & 0xff00ff00ff00ff00) >> 8 | (uVar12 >> 7 & 0xff00ff00ff00ff) << 8;
    uVar22 = (uVar22 & 0xffff0000ffff0000) >> 0x10 | (uVar22 & 0xffff0000ffff) << 0x10;
    if (uStack00000000000001e0 !=
        *(long **)(lVar14 + -8 +
                  (uVar20 + ((ulong)LZCOUNT(uVar22 >> 0x20 | uVar22 << 0x20) >> 3) & uVar21) * -8))
    {
      uVar12 = uVar12 - 1 & uVar12;
      goto joined_r0x0054f804;
    }
    goto LAB_0054f87c;
  }
  bVar33 = NEON_umaxv(CONCAT17(-((char)((ulong)uVar34 >> 0x38) == -1),
                               CONCAT16(-((char)((ulong)uVar34 >> 0x30) == -1),
                                        CONCAT15(-((char)((ulong)uVar34 >> 0x28) == -1),
                                                 CONCAT14(-((char)((ulong)uVar34 >> 0x20) == -1),
                                                          CONCAT13(-((char)((ulong)uVar34 >> 0x18)
                                                                    == -1),CONCAT12(-((char)((ulong)
                                                  uVar34 >> 0x10) == -1),
                                                  CONCAT11(-((char)((ulong)uVar34 >> 8) == -1),
                                                           -((char)uVar34 == -1)))))))),1);
  if ((bVar33 & 1) != 0) goto LAB_00550250;
  lVar4 = lVar4 + 8;
  uVar20 = uVar20 + lVar4 & uVar21;
  uVar34 = *(undefined8 *)(lVar14 + uVar20);
  uVar12 = CONCAT17(-((byte)((ulong)uVar34 >> 0x38) == bVar30),
                    CONCAT16(-((byte)((ulong)uVar34 >> 0x30) == bVar30),
                             CONCAT15(-((byte)((ulong)uVar34 >> 0x28) == bVar30),
                                      CONCAT14(-((byte)((ulong)uVar34 >> 0x20) == bVar30),
                                               CONCAT13(-((byte)((ulong)uVar34 >> 0x18) == bVar30),
                                                        CONCAT12(-((byte)((ulong)uVar34 >> 0x10) ==
                                                                  bVar30),CONCAT11(-((byte)((ulong)
                                                  uVar34 >> 8) == bVar30),-((byte)uVar34 == bVar30))
                                                  )))))) & 0x8080808080808080;
  goto joined_r0x0054f804;
LAB_00550250:
  func_0x007a247c(&UNK_008ab120,0x32,&UNK_009ed2d0);
  goto LAB_00551610;
code_r0x0054ec68:
  in_stack_00000090 = plVar19[2];
  if (in_stack_00000090 != 0) goto code_r0x0054ec74;
  goto LAB_0054f930;
code_r0x0054ec74:
  uVar17 = 0;
  in_stack_00000078 = unaff_x21 * 0x517cc1b727220a95;
  bVar30 = (byte)(in_stack_00000078 >> 0x39);
  unaff_d8 = CONCAT17(bVar30,CONCAT16(bVar30,CONCAT15(bVar30,CONCAT14(bVar30,CONCAT13(bVar30,
                                                  CONCAT12(bVar30,CONCAT11(bVar30,bVar30)))))));
  unaff_x26 = 1;
LAB_0054ec9c:
  if ((unaff_x21 < *(ulong *)(unaff_x19[0x12] + 0x28)) &&
     (plVar19 = (long *)(*(long *)(unaff_x19[0x12] + 0x20) + unaff_x21 * 0x20),
     *plVar19 != unaff_x25)) {
    if (uVar17 < (ulong)plVar19[2]) {
      lVar4 = plVar19[1] + uVar17 * 0x108;
      in_stack_00000080 = uVar17;
      switch(*(undefined8 *)(lVar4 + 0x18)) {
      case 0xc:
        pdVar24 = (dword *)0x0;
        in_stack_00000218 = &MACH_HEADER.cpusubtype;
        func_0x00558b8c(&lStack0000000000000140,auStack_7ffffffe + 0x800001fe,&UNK_009efca0);
        break;
      case 0xd:
        func_0x005ce8b4(auStack_7ffffffe + 0x800001fe,lVar4 + 0x20);
        in_stack_00000218 = pdVar18 + (long)pdVar24 * 2;
        func_0x00558b8c(&lStack0000000000000140,auStack_7ffffffe + 0x800001fe,&UNK_009f09e0);
        pdVar24 = in_stack_00000210;
        break;
      case 0xe:
        func_0x005ceb14(auStack_7ffffffe + 0x800001fe,lVar4 + 0x20);
        in_stack_00000218 = pdVar18 + (long)pdVar24 * 2;
        func_0x00558b8c(&lStack0000000000000140,auStack_7ffffffe + 0x800001fe,&UNK_009f09e0);
        pdVar24 = in_stack_00000210;
        break;
      case 0xf:
        func_0x005d8a94(auStack_7ffffffe + 0x800001fe,lVar4 + 0x20);
        func_0x005d8b44(&lStack0000000000000140,lVar4 + 0x20);
        in_stack_00000218 = pdVar18 + (long)pdVar24 * 2;
        func_0x00558b8c(&lStack0000000000000140,auStack_7ffffffe + 0x800001fe,&UNK_009f02e0);
        unaff_x22 = (undefined8 *)(auStack_7ffffffe + 0x800001fe);
        unaff_x25 = -0x8000000000000000;
        pdVar24 = in_stack_00000210;
        break;
      case 0x10:
        func_0x005cf080(auStack_7ffffffe + 0x800001fe,lVar4 + 0x20);
        in_stack_00000218 = pdVar18 + (long)pdVar24 * 2;
        func_0x00558b8c(&lStack0000000000000140,auStack_7ffffffe + 0x800001fe,&UNK_009f02e0);
        pdVar24 = in_stack_00000210;
        break;
      case 0x11:
        in_stack_00000218 = &MACH_HEADER.cpusubtype;
        func_0x00558b8c(&lStack0000000000000140,auStack_7ffffffe + 0x800001fe,&UNK_009efca0);
        pdVar24 = (dword *)0x0;
        break;
      case 0x12:
        in_stack_00000218 = &MACH_HEADER.cpusubtype;
        func_0x00558b8c(&lStack0000000000000140,auStack_7ffffffe + 0x800001fe,&UNK_009efca0);
        pdVar24 = (dword *)0x0;
        break;
      case 0x13:
        func_0x005cf918(auStack_7ffffffe + 0x800001fe,lVar4 + 0x20);
        in_stack_00000218 = pdVar18 + (long)pdVar24 * 2;
        func_0x00558b8c(&lStack0000000000000140,auStack_7ffffffe + 0x800001fe,&UNK_009f02e0);
        pdVar24 = in_stack_00000210;
        break;
      case 0x14:
        func_0x005cf918(auStack_7ffffffe + 0x800001fe,lVar4 + 0x20);
        in_stack_00000218 = pdVar18 + (long)pdVar24 * 2;
        func_0x00558b8c(&lStack0000000000000140,auStack_7ffffffe + 0x800001fe,&UNK_009f02e0);
        pdVar24 = in_stack_00000210;
        break;
      default:
        func_0x005da664(auStack_7ffffffe + 0x800001fe,lVar4);
        func_0x005da864(&lStack0000000000000140,lVar4);
        in_stack_00000218 = pdVar18 + (long)pdVar24 * 2;
        func_0x00558b8c(&lStack0000000000000140,auStack_7ffffffe + 0x800001fe,&UNK_009f02e0);
        unaff_x22 = (undefined8 *)(auStack_7ffffffe + 0x800001fe);
        unaff_x25 = -0x8000000000000000;
        pdVar24 = in_stack_00000210;
        break;
      case 0x16:
        func_0x005dae50(auStack_7ffffffe + 0x800001fe,lVar4 + 0x20);
        func_0x005db050(&lStack0000000000000140,lVar4 + 0x20);
        in_stack_00000218 = pdVar18 + (long)pdVar24 * 2;
        func_0x00558b8c(&lStack0000000000000140,auStack_7ffffffe + 0x800001fe,&UNK_009f02e0);
        unaff_x22 = (undefined8 *)(auStack_7ffffffe + 0x800001fe);
        unaff_x25 = -0x8000000000000000;
        pdVar24 = in_stack_00000210;
        break;
      case 0x17:
        func_0x005db32c(auStack_7ffffffe + 0x800001fe,lVar4 + 0x20);
        func_0x005db52c(&lStack0000000000000140,lVar4 + 0x20);
        in_stack_00000218 = pdVar18 + (long)pdVar24 * 2;
        func_0x00558b8c(&lStack0000000000000140,auStack_7ffffffe + 0x800001fe,&UNK_009f02e0);
        unaff_x22 = (undefined8 *)(auStack_7ffffffe + 0x800001fe);
        unaff_x25 = -0x8000000000000000;
        pdVar24 = in_stack_00000210;
        break;
      case 0x18:
        func_0x005dbc7c(auStack_7ffffffe + 0x800001fe,lVar4 + 0x20);
        func_0x005dbd2c(&lStack0000000000000140,lVar4 + 0x20);
        in_stack_00000218 = pdVar18 + (long)pdVar24 * 2;
        func_0x00558b8c(&lStack0000000000000140,auStack_7ffffffe + 0x800001fe,&UNK_009f02e0);
        unaff_x22 = (undefined8 *)(auStack_7ffffffe + 0x800001fe);
        unaff_x25 = -0x8000000000000000;
        pdVar24 = in_stack_00000210;
        break;
      case 0x19:
        func_0x005dc110(auStack_7ffffffe + 0x800001fe,lVar4 + 0x20);
        func_0x005dc268(&lStack0000000000000140,lVar4 + 0x20);
        in_stack_00000218 = pdVar18 + (long)pdVar24 * 2;
        func_0x00558b8c(&lStack0000000000000140,auStack_7ffffffe + 0x800001fe,&UNK_009f02e0);
        unaff_x22 = (undefined8 *)(auStack_7ffffffe + 0x800001fe);
        unaff_x25 = -0x8000000000000000;
        pdVar24 = in_stack_00000210;
        break;
      case 0x1a:
        func_0x005dc4ec(auStack_7ffffffe + 0x800001fe,lVar4 + 0x20);
        func_0x005dc564(&lStack0000000000000140,lVar4 + 0x20);
        in_stack_00000218 = pdVar18 + (long)pdVar24 * 2;
        func_0x00558b8c(&lStack0000000000000140,auStack_7ffffffe + 0x800001fe,&UNK_009f02e0);
        unaff_x22 = (undefined8 *)(auStack_7ffffffe + 0x800001fe);
        unaff_x25 = -0x8000000000000000;
        pdVar24 = in_stack_00000210;
        break;
      case 0x1b:
        goto code_r0x0054f09c;
      case 0x1c:
        in_stack_00000218 = &MACH_HEADER.cpusubtype;
        func_0x00558b8c(&lStack0000000000000140,auStack_7ffffffe + 0x800001fe,&UNK_009efca0);
        pdVar24 = (dword *)0x0;
        break;
      case 0x1d:
        in_stack_00000218 = &MACH_HEADER.cpusubtype;
        func_0x00558b8c(&lStack0000000000000140,auStack_7ffffffe + 0x800001fe,&UNK_009f02e0);
        pdVar24 = (dword *)0x0;
        break;
      case 0x1e:
        in_stack_00000218 = &MACH_HEADER.cpusubtype;
        func_0x00558b8c(&lStack0000000000000140,auStack_7ffffffe + 0x800001fe,&UNK_009efca0);
        pdVar24 = (dword *)0x0;
        break;
      case 0x1f:
        func_0x005cf3e8(auStack_7ffffffe + 0x800001fe,lVar4 + 0x20);
        in_stack_00000218 = pdVar18 + (long)pdVar24 * 2;
        func_0x00558b8c(&lStack0000000000000140,auStack_7ffffffe + 0x800001fe,&UNK_009f02e0);
        pdVar24 = in_stack_00000210;
        break;
      case 0x20:
        in_stack_00000218 = &MACH_HEADER.cpusubtype;
        func_0x00558b8c(&lStack0000000000000140,auStack_7ffffffe + 0x800001fe,&UNK_009efca0);
        pdVar24 = (dword *)0x0;
      }
      goto LAB_0054f474;
    }
    in_stack_00000040 = &UNK_009ed2a0;
  }
  else {
    in_stack_00000040 = &UNK_009ed288;
  }
code_r0x00551454:
  func_0x007a23bc(in_stack_00000040);
  goto LAB_00551610;
code_r0x0054f09c:
  func_0x005d7560(auStack_7ffffffe + 0x800001fe,lVar4);
  in_stack_00000218 = pdVar18 + (long)pdVar24 * 2;
  goto code_r0x0054f0d0;
code_r0x0054fc1c:
  uVar12 = uVar12 & unaff_x19[0x30];
  uVar34 = *(undefined8 *)(unaff_x19[0x2f] + uVar12);
  bVar33 = (byte)((ulong)uVar34 >> 8);
  bVar35 = (byte)((ulong)uVar34 >> 0x10);
  bVar36 = (byte)((ulong)uVar34 >> 0x18);
  bVar37 = (byte)((ulong)uVar34 >> 0x20);
  bVar38 = (byte)((ulong)uVar34 >> 0x28);
  bVar39 = (byte)((ulong)uVar34 >> 0x30);
  bVar40 = (byte)((ulong)uVar34 >> 0x38);
  for (uVar20 = CONCAT17(-(bVar40 == bVar30),
                         CONCAT16(-(bVar39 == bVar30),
                                  CONCAT15(-(bVar38 == bVar30),
                                           CONCAT14(-(bVar37 == bVar30),
                                                    CONCAT13(-(bVar36 == bVar30),
                                                             CONCAT12(-(bVar35 == bVar30),
                                                                      CONCAT11(-(bVar33 == bVar30),
                                                                               -((byte)uVar34 ==
                                                                                bVar30)))))))) &
                0x8080808080808080; uVar20 != 0; uVar20 = uVar20 - 1 & uVar20) {
    uVar22 = (uVar20 >> 7 & 0xff00ff00ff00ff00) >> 8 | (uVar20 >> 7 & 0xff00ff00ff00ff) << 8;
    uVar22 = (uVar22 & 0xffff0000ffff0000) >> 0x10 | (uVar22 & 0xffff0000ffff) << 0x10;
    if (lVar16 == *(long *)(unaff_x19[0x2f] + -0x28 +
                           (uVar12 + ((ulong)LZCOUNT(uVar22 >> 0x20 | uVar22 << 0x20) >> 3) &
                           unaff_x19[0x30]) * -0x28)) goto code_r0x0054fe40;
  }
  bVar33 = NEON_umaxv(CONCAT17(-(bVar40 == 0xff),
                               CONCAT16(-(bVar39 == 0xff),
                                        CONCAT15(-(bVar38 == 0xff),
                                                 CONCAT14(-(bVar37 == 0xff),
                                                          CONCAT13(-(bVar36 == 0xff),
                                                                   CONCAT12(-(bVar35 == 0xff),
                                                                            CONCAT11(-(bVar33 ==
                                                                                      0xff),-((byte)
                                                  uVar34 == 0xff)))))))),1);
  if ((bVar33 & 1) != 0) goto code_r0x0054fe2c;
  lVar14 = lVar14 + 8;
  uVar12 = uVar12 + lVar14;
  goto code_r0x0054fc1c;
code_r0x0054fe2c:
  if (*(long *)(lVar4 + 0x48) == 0) {
    uVar21 = 0;
    uVar12 = 0;
    in_stack_00000030 = &UNK_009ed0e8;
code_r0x0055154c:
    func_0x007a2570(uVar21,uVar12,in_stack_00000030);
    goto LAB_00551610;
  }
  if (**(long **)(lVar4 + 0x40) == 0) {
    plVar28 = *(long **)(lVar4 + 0x40) + 1;
    if (unaff_x19[0x2e] != 0) {
      lVar4 = unaff_x19[0x2b];
code_r0x0054fed4:
      lVar14 = 0;
      uVar12 = (*plVar28 + 8) * 0x517cc1b727220a95;
      bVar30 = (byte)(uVar12 >> 0x39);
      while( true ) {
        uVar12 = uVar12 & unaff_x19[0x2c];
        uVar34 = *(undefined8 *)(lVar4 + uVar12);
        bVar33 = (byte)((ulong)uVar34 >> 8);
        bVar35 = (byte)((ulong)uVar34 >> 0x10);
        bVar36 = (byte)((ulong)uVar34 >> 0x18);
        bVar37 = (byte)((ulong)uVar34 >> 0x20);
        bVar38 = (byte)((ulong)uVar34 >> 0x28);
        bVar39 = (byte)((ulong)uVar34 >> 0x30);
        bVar40 = (byte)((ulong)uVar34 >> 0x38);
        for (uVar20 = CONCAT17(-(bVar40 == bVar30),
                               CONCAT16(-(bVar39 == bVar30),
                                        CONCAT15(-(bVar38 == bVar30),
                                                 CONCAT14(-(bVar37 == bVar30),
                                                          CONCAT13(-(bVar36 == bVar30),
                                                                   CONCAT12(-(bVar35 == bVar30),
                                                                            CONCAT11(-(bVar33 ==
                                                                                      bVar30),-((
                                                  byte)uVar34 == bVar30)))))))) & 0x8080808080808080
            ; uVar20 != 0; uVar20 = uVar20 - 1 & uVar20) {
          uVar22 = (uVar20 >> 7 & 0xff00ff00ff00ff00) >> 8 | (uVar20 >> 7 & 0xff00ff00ff00ff) << 8;
          uVar22 = (uVar22 & 0xffff0000ffff0000) >> 0x10 | (uVar22 & 0xffff0000ffff) << 0x10;
          uVar22 = uVar12 + ((ulong)LZCOUNT(uVar22 >> 0x20 | uVar22 << 0x20) >> 3) & unaff_x19[0x2c]
          ;
          if (*plVar28 == *(long *)(lVar4 + -0x10 + uVar22 * -0x10)) {
            plVar28 = (long *)(lVar4 + -8 + uVar22 * -0x10);
            goto code_r0x0054fed4;
          }
        }
        bVar33 = NEON_umaxv(CONCAT17(-(bVar40 == 0xff),
                                     CONCAT16(-(bVar39 == 0xff),
                                              CONCAT15(-(bVar38 == 0xff),
                                                       CONCAT14(-(bVar37 == 0xff),
                                                                CONCAT13(-(bVar36 == 0xff),
                                                                         CONCAT12(-(bVar35 == 0xff),
                                                                                  CONCAT11(-(bVar33 
                                                  == 0xff),-((byte)uVar34 == 0xff)))))))),1);
        if ((bVar33 & 1) != 0) break;
        lVar14 = lVar14 + 8;
        uVar12 = uVar12 + lVar14;
      }
    }
    if (unaff_x19[0x2a] == 0) {
code_r0x005503e8:
      puVar13 = &UNK_009ed100;
code_r0x00550188:
      func_0x007a23d8(&UNK_008ab0c0,0x16,puVar13);
      goto LAB_00551610;
    }
    lVar4 = 0;
    uVar22 = (*plVar28 + 8) * 0x517cc1b727220a95;
    lVar14 = unaff_x19[0x27];
    uVar20 = unaff_x19[0x28];
    bVar30 = (byte)(uVar22 >> 0x39);
    uVar22 = uVar22 & uVar20;
    uVar34 = *(undefined8 *)(lVar14 + uVar22);
    uVar12 = CONCAT17(-((byte)((ulong)uVar34 >> 0x38) == bVar30),
                      CONCAT16(-((byte)((ulong)uVar34 >> 0x30) == bVar30),
                               CONCAT15(-((byte)((ulong)uVar34 >> 0x28) == bVar30),
                                        CONCAT14(-((byte)((ulong)uVar34 >> 0x20) == bVar30),
                                                 CONCAT13(-((byte)((ulong)uVar34 >> 0x18) == bVar30)
                                                          ,CONCAT12(-((byte)((ulong)uVar34 >> 0x10)
                                                                     == bVar30),
                                                                    CONCAT11(-((byte)((ulong)uVar34
                                                                                     >> 8) == bVar30
                                                                              ),-((byte)uVar34 ==
                                                                                 bVar30)))))))) &
             0x8080808080808080;
    while( true ) {
      while (uVar12 == 0) {
        bVar33 = NEON_umaxv(CONCAT17(-((char)((ulong)uVar34 >> 0x38) == -1),
                                     CONCAT16(-((char)((ulong)uVar34 >> 0x30) == -1),
                                              CONCAT15(-((char)((ulong)uVar34 >> 0x28) == -1),
                                                       CONCAT14(-((char)((ulong)uVar34 >> 0x20) ==
                                                                 -1),CONCAT13(-((char)((ulong)uVar34
                                                                                      >> 0x18) == -1
                                                                               ),CONCAT12(-((char)((
                                                  ulong)uVar34 >> 0x10) == -1),
                                                  CONCAT11(-((char)((ulong)uVar34 >> 8) == -1),
                                                           -((char)uVar34 == -1)))))))),1);
        if ((bVar33 & 1) != 0) goto code_r0x005503e8;
        lVar4 = lVar4 + 8;
        uVar22 = uVar22 + lVar4 & uVar20;
        uVar34 = *(undefined8 *)(lVar14 + uVar22);
        uVar12 = CONCAT17(-((byte)((ulong)uVar34 >> 0x38) == bVar30),
                          CONCAT16(-((byte)((ulong)uVar34 >> 0x30) == bVar30),
                                   CONCAT15(-((byte)((ulong)uVar34 >> 0x28) == bVar30),
                                            CONCAT14(-((byte)((ulong)uVar34 >> 0x20) == bVar30),
                                                     CONCAT13(-((byte)((ulong)uVar34 >> 0x18) ==
                                                               bVar30),CONCAT12(-((byte)((ulong)
                                                  uVar34 >> 0x10) == bVar30),
                                                  CONCAT11(-((byte)((ulong)uVar34 >> 8) == bVar30),
                                                           -((byte)uVar34 == bVar30)))))))) &
                 0x8080808080808080;
      }
      uVar23 = (uVar12 >> 7 & 0xff00ff00ff00ff00) >> 8 | (uVar12 >> 7 & 0xff00ff00ff00ff) << 8;
      uVar23 = (uVar23 & 0xffff0000ffff0000) >> 0x10 | (uVar23 & 0xffff0000ffff) << 0x10;
      uVar23 = uVar22 + ((ulong)LZCOUNT(uVar23 >> 0x20 | uVar23 << 0x20) >> 3) & uVar20;
      if (*plVar28 == *(long *)(lVar14 + -0x10 + uVar23 * -0x10)) break;
      uVar12 = uVar12 - 1 & uVar12;
    }
    plVar29 = (long *)(lVar14 + uVar23 * -0x10 + -8);
    lVar4 = func_0x00578428(unaff_x19 + 9,plVar29);
    if (lVar4 != 1) {
      if (unaff_x19[0x32] != 0) {
        lVar4 = 0;
        lVar16 = *plVar29;
        uVar22 = (lVar16 + 8) * 0x517cc1b727220a95;
        lVar14 = unaff_x19[0x2f];
        uVar20 = unaff_x19[0x30];
        bVar30 = (byte)(uVar22 >> 0x39);
        uVar22 = uVar22 & uVar20;
        uVar34 = *(undefined8 *)(lVar14 + uVar22);
        uVar12 = CONCAT17(-((byte)((ulong)uVar34 >> 0x38) == bVar30),
                          CONCAT16(-((byte)((ulong)uVar34 >> 0x30) == bVar30),
                                   CONCAT15(-((byte)((ulong)uVar34 >> 0x28) == bVar30),
                                            CONCAT14(-((byte)((ulong)uVar34 >> 0x20) == bVar30),
                                                     CONCAT13(-((byte)((ulong)uVar34 >> 0x18) ==
                                                               bVar30),CONCAT12(-((byte)((ulong)
                                                  uVar34 >> 0x10) == bVar30),
                                                  CONCAT11(-((byte)((ulong)uVar34 >> 8) == bVar30),
                                                           -((byte)uVar34 == bVar30)))))))) &
                 0x8080808080808080;
        while( true ) {
          for (; uVar12 != 0; uVar12 = uVar12 - 1 & uVar12) {
            uVar23 = (uVar12 >> 7 & 0xff00ff00ff00ff00) >> 8 | (uVar12 >> 7 & 0xff00ff00ff00ff) << 8
            ;
            uVar23 = (uVar23 & 0xffff0000ffff0000) >> 0x10 | (uVar23 & 0xffff0000ffff) << 0x10;
            if (lVar16 == *(long *)(lVar14 + -0x28 +
                                   (uVar22 + ((ulong)LZCOUNT(uVar23 >> 0x20 | uVar23 << 0x20) >> 3)
                                   & uVar20) * -0x28)) goto code_r0x0054fe40;
          }
          bVar33 = NEON_umaxv(CONCAT17(-((char)((ulong)uVar34 >> 0x38) == -1),
                                       CONCAT16(-((char)((ulong)uVar34 >> 0x30) == -1),
                                                CONCAT15(-((char)((ulong)uVar34 >> 0x28) == -1),
                                                         CONCAT14(-((char)((ulong)uVar34 >> 0x20) ==
                                                                   -1),CONCAT13(-((char)((ulong)
                                                  uVar34 >> 0x18) == -1),
                                                  CONCAT12(-((char)((ulong)uVar34 >> 0x10) == -1),
                                                           CONCAT11(-((char)((ulong)uVar34 >> 8) ==
                                                                     -1),-((char)uVar34 == -1)))))))
                                      ),1);
          if ((bVar33 & 1) != 0) break;
          lVar4 = lVar4 + 8;
          uVar22 = uVar22 + lVar4 & uVar20;
          uVar34 = *(undefined8 *)(lVar14 + uVar22);
          uVar12 = CONCAT17(-((byte)((ulong)uVar34 >> 0x38) == bVar30),
                            CONCAT16(-((byte)((ulong)uVar34 >> 0x30) == bVar30),
                                     CONCAT15(-((byte)((ulong)uVar34 >> 0x28) == bVar30),
                                              CONCAT14(-((byte)((ulong)uVar34 >> 0x20) == bVar30),
                                                       CONCAT13(-((byte)((ulong)uVar34 >> 0x18) ==
                                                                 bVar30),CONCAT12(-((byte)((ulong)
                                                  uVar34 >> 0x10) == bVar30),
                                                  CONCAT11(-((byte)((ulong)uVar34 >> 8) == bVar30),
                                                           -((byte)uVar34 == bVar30)))))))) &
                   0x8080808080808080;
        }
      }
      lVar4 = *(long *)*plVar15;
      *(long *)*plVar15 = lVar4 + 1;
      if (lVar4 < 0) {
        func_0x007a05dc();
        goto LAB_00551610;
      }
      lVar14 = *plVar15;
      lVar4 = *(long *)*plVar28;
      *(long *)*plVar28 = lVar4 + 1;
      if (lVar4 < 0) {
        func_0x007a05dc();
        goto LAB_00551610;
      }
      uStack00000000000000f0 = (long *)func_0x0056237c(in_stack_00000048,lVar14,*plVar28);
      if (uStack00000000000000f0 != (long *)0x0) {
        lVar4 = *uStack00000000000000f0;
        *uStack00000000000000f0 = lVar4 + -1;
        LORelease();
        if (lVar4 == 1) {
          func_0x005d2ac4(&uStack00000000000000f0);
        }
      }
      if ((ulong)plVar11[2] <= uVar21) {
        func_0x007a2570(uVar21,plVar11[2],&UNK_009ed118);
        goto LAB_00551610;
      }
      lVar4 = plVar11[1] + uVar21 * 0x108;
      func_0x005488a8(lVar4);
      _memcpy(lVar4,auStack_7ffffffe + 0x800001fe,0x108);
    }
  }
code_r0x0054fe40:
  pdVar26 = pdVar27;
  if (pdVar27 == pdVar9) goto code_r0x00550130;
  goto code_r0x0054fc84;
code_r0x00550130:
  if (plVar8 != (long *)0x0) {
    func_0x00187bd4(pdVar10,(long)plVar8 << 3,8);
  }
  if ((*(ulong *)(unaff_x19[0x12] + 0x28) <= uVar17) ||
     (*(long *)(*(long *)(unaff_x19[0x12] + 0x20) + uVar17 * 0x20) == -0x8000000000000000)) {
    puStack0000000000000020 = &UNK_009ed070;
code_r0x005514a4:
    func_0x007a23bc(puStack0000000000000020);
LAB_00551610:
                    /* WARNING: Does not return */
    pcVar2 = (code *)SoftwareBreakpoint(1,0x551614);
    (*pcVar2)();
  }
  func_0x00556794();
  pdVar25 = pdVar25 + 1;
  goto code_r0x0054fb98;
code_r0x00550c08:
  in_stack_000001a0 = *(undefined8 **)(in_stack_00000258 + ((long)-iVar6 * 6 + -2) * 2);
  in_stack_00000198 = *(long **)(in_stack_00000258 + ((long)-iVar6 * 6 + -3) * 2);
  uStack00000000000001a8 = *(long *)(in_stack_00000258 + ((long)-iVar6 * 6 + -1) * 2);
  uStack0000000000000190 = pdVar24;
  uStack00000000000001e0 = in_stack_00000198;
  in_stack_000001e8 = in_stack_000001a0;
  plVar11 = (long *)func_0x00187bd0(0x28,8);
  if (plVar11 == (long *)0x0) {
    func_0x007a1f18(8,0x28);
    goto LAB_00551610;
  }
  plVar11[1] = lVar1;
  *plVar11 = lVar31;
  plVar11[2] = -0x8000000000000000;
  in_stack_00000170 = (undefined *)((long)pdVar24 + (long)in_stack_00000198) + 1;
  lVar32 = *(long *)pdVar24;
  in_stack_00000168 = pdVar24 + 2;
  in_stack_00000160 =
       CONCAT17(-(-1 < lVar32),
                CONCAT16(-(-1 < (char)((ulong)lVar32 >> 0x30)),
                         CONCAT15(-(-1 < (char)((ulong)lVar32 >> 0x28)),
                                  CONCAT14(-(-1 < (char)((ulong)lVar32 >> 0x20)),
                                           CONCAT13(-(-1 < (char)((ulong)lVar32 >> 0x18)),
                                                    CONCAT12(-(-1 < (char)((ulong)lVar32 >> 0x10)),
                                                             CONCAT11(-(-1 < (char)((ulong)lVar32 >>
                                                                                   8)),
                                                                      -(-1 < (char)lVar32)))))))) &
       0x8080808080808080;
  in_stack_00000148 = (dword *)((long)in_stack_00000198 * 9 + 0x11);
  in_stack_00000150 = pdVar24 + (-1 - (long)in_stack_00000198) * 2;
  lStack0000000000000140 = (ulong)(in_stack_00000198 != (long *)0x0) << 3;
  in_stack_00000158 = pdVar24;
  in_stack_00000178 = uStack00000000000001a8;
  while( true ) {
    uStack0000000000000138 = plVar11;
    if (in_stack_00000178 == 0) break;
    if (in_stack_00000160 == 0) {
      pdVar24 = in_stack_00000168;
      do {
        in_stack_00000168 = pdVar24 + 2;
        lVar32 = *(long *)pdVar24;
        in_stack_00000158 = in_stack_00000158 + -0x10;
        in_stack_00000160 =
             CONCAT17(-(-1 < lVar32),
                      CONCAT16(-(-1 < (char)((ulong)lVar32 >> 0x30)),
                               CONCAT15(-(-1 < (char)((ulong)lVar32 >> 0x28)),
                                        CONCAT14(-(-1 < (char)((ulong)lVar32 >> 0x20)),
                                                 CONCAT13(-(-1 < (char)((ulong)lVar32 >> 0x18)),
                                                          CONCAT12(-(-1 < (char)((ulong)lVar32 >>
                                                                                0x10)),
                                                                   CONCAT11(-(-1 < (char)((ulong)
                                                  lVar32 >> 8)),-(-1 < (char)lVar32)))))))) &
             0x8080808080808080;
        pdVar24 = in_stack_00000168;
      } while (in_stack_00000160 == 0);
    }
    uVar12 = (in_stack_00000160 & 0xaaaaaaaaaaaaaaaa) >> 1 |
             (in_stack_00000160 & 0x5555555555555555) << 1;
    uVar12 = (uVar12 & 0xcccccccccccccccc) >> 2 | (uVar12 & 0x3333333333333333) << 2;
    uVar12 = (uVar12 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar12 & 0xf0f0f0f0f0f0f0f) << 4;
    uVar12 = (uVar12 & 0xff00ff00ff00ff00) >> 8 | (uVar12 & 0xff00ff00ff00ff) << 8;
    uVar12 = (uVar12 & 0xffff0000ffff0000) >> 0x10 | (uVar12 & 0xffff0000ffff) << 0x10;
    in_stack_00000160 = in_stack_00000160 - 1 & in_stack_00000160;
    in_stack_00000178 = in_stack_00000178 + -1;
    plVar15 = *(long **)((long)in_stack_00000158 +
                        (-8 - (LZCOUNT(uVar12 >> 0x20 | uVar12 << 0x20) & 0x78U)));
    lVar32 = *plVar11;
    *plVar11 = lVar32 + 1;
    uStack0000000000000188 = plVar15;
    if (lVar32 < 0) {
      func_0x007a05dc();
      goto LAB_00551610;
    }
    uVar34 = func_0x005787f4(in_stack_00000128,in_stack_00000128._8_8_,plVar15);
    func_0x00589494(&uStack00000000000000f0,uVar34,plVar15,plVar11);
    plVar11 = uStack0000000000000138;
    uStack0000000000000180 = extraout_x1_00;
    if (extraout_x1_00 != (long *)0x0) {
      lVar32 = *extraout_x1_00;
      *extraout_x1_00 = lVar32 + -1;
      LORelease();
      if (lVar32 == 1) {
        func_0x005d2ac4(&uStack0000000000000180);
        plVar11 = uStack0000000000000138;
      }
    }
  }
  func_0x0053b6d8(&lStack0000000000000140);
  lVar32 = *uStack0000000000000138;
  *uStack0000000000000138 = lVar32 + -1;
  LORelease();
  if (lVar32 == 1) {
    func_0x005d2ac4(&uStack0000000000000138);
  }
  goto code_r0x00550bb8;
}

