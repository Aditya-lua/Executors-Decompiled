
/* WARNING: Removing unreachable block (ram,0x00550c60) */
/* WARNING: Removing unreachable block (ram,0x00550c74) */
/* WARNING: Removing unreachable block (ram,0x00550f44) */
/* WARNING: Removing unreachable block (ram,0x00550f54) */
/* WARNING: Removing unreachable block (ram,0x00550f5c) */
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_005510b0(undefined8 param_1,undefined8 param_2)

{
  ulong uVar1;
  long lVar2;
  long lVar3;
  code *pcVar4;
  bool bVar5;
  char cVar6;
  int iVar7;
  long *plVar8;
  undefined8 uVar9;
  long *extraout_x1;
  long *extraout_x1_00;
  long *plVar10;
  undefined8 *in_x9;
  long in_x10;
  long *plVar11;
  ulong uVar12;
  long *unaff_x19;
  long *plVar13;
  long lVar14;
  ulong *unaff_x24;
  long lVar15;
  long lVar16;
  long lVar17;
  undefined8 *in_stack_00000028;
  ulong in_stack_00000038;
  undefined8 in_stack_00000048;
  undefined8 uStack00000000000000a0;
  undefined1 uStack00000000000000b8;
  long in_stack_000000d0;
  undefined8 in_stack_000000d8;
  long lStack00000000000000f0;
  undefined8 in_stack_000000f8;
  undefined8 in_stack_00000100;
  undefined *in_stack_00000108;
  undefined8 in_stack_00000110;
  undefined8 in_stack_00000118;
  undefined8 in_stack_00000120;
  undefined8 in_stack_00000128;
  undefined8 in_stack_00000130;
  undefined8 uStack0000000000000138;
  long lStack0000000000000140;
  long *in_stack_00000148;
  long *in_stack_00000150;
  long *in_stack_00000158;
  ulong in_stack_00000160;
  long *in_stack_00000168;
  undefined1 *in_stack_00000170;
  long in_stack_00000178;
  undefined8 uStack0000000000000180;
  undefined8 uStack0000000000000188;
  undefined8 uStack0000000000000190;
  long *in_stack_00000198;
  undefined8 *in_stack_000001a0;
  long in_stack_000001a8;
  undefined8 in_stack_000001c0;
  undefined8 in_stack_000001c8;
  undefined8 in_stack_000001d0;
  undefined8 in_stack_000001d8;
  long lStack00000000000001e0;
  undefined8 *in_stack_000001e8;
  long *in_stack_00000258;
  ulong in_stack_00000260;
  long *in_stack_00000268;
  ulong in_stack_00000278;
  undefined1 auStack_7ffffffe [6];
  long alStack_7ffffff8 [268435455];
  
  if (in_x10 == 0) {
    func_0x007a23d8(&UNK_008ab0d6,0x22,&UNK_009ed690);
    goto LAB_00551610;
  }
  in_stack_00000100 = in_x9[1];
  in_stack_000000f8 = *in_x9;
  in_stack_00000108 = (undefined *)in_x9[2];
  in_stack_00000110 = 0;
  uStack0000000000000190 = &lStack00000000000000f0;
  in_stack_00000198 = (long *)(auStack_7ffffffe + 0x800001fe);
  in_stack_000001a0 = (undefined8 *)&UNK_009ed1e8;
  lStack0000000000000140 = (long)&uStack0000000000000190;
  in_stack_00000148 = (long *)0x1;
  in_stack_00000150 = (long *)param_1;
  func_0x005eb358(param_2,&lStack0000000000000140);
  _in_stack_00000128 = func_0x00596f50(&UNK_009ed6b8);
  lStack00000000000000f0 = 0;
  in_stack_000000f8 = 8;
  in_stack_00000100 = 0;
  in_stack_00000108 = &UNK_0089eb70;
  in_stack_00000110 = 0;
  in_stack_00000118 = 0;
  in_stack_00000120 = 0;
  plVar11 = (long *)unaff_x19[9];
  plVar10 = (long *)unaff_x19[10];
  lVar14 = unaff_x19[0xb];
  func_0x004b92d8(auStack_7ffffffe + 0x80000216);
  in_stack_00000158 = plVar10 + lVar14 * 6;
  lStack0000000000000140 = (long)plVar10;
  in_stack_00000148 = plVar10;
  in_stack_00000150 = plVar11;
  if (lVar14 != 0) {
    do {
      in_stack_00000148 = plVar10 + 6;
      if ((long *)*plVar10 == (long *)0x0) break;
      plVar13 = (long *)plVar10[1];
      lVar14 = plVar10[4];
      lVar15 = *plVar13;
      plVar11 = plVar13 + 1;
      uVar12 = CONCAT17(-(-1 < lVar15),
                        CONCAT16(-(-1 < (char)((ulong)lVar15 >> 0x30)),
                                 CONCAT15(-(-1 < (char)((ulong)lVar15 >> 0x28)),
                                          CONCAT14(-(-1 < (char)((ulong)lVar15 >> 0x20)),
                                                   CONCAT13(-(-1 < (char)((ulong)lVar15 >> 0x18)),
                                                            CONCAT12(-(-1 < (char)((ulong)lVar15 >>
                                                                                  0x10)),
                                                                     CONCAT11(-(-1 < (char)((ulong)
                                                  lVar15 >> 8)),-(-1 < (char)lVar15)))))))) &
               0x8080808080808080;
      plVar10 = (long *)*plVar10;
      while( true ) {
        uStack0000000000000188 = plVar10;
        if (lVar14 == 0) break;
        if (uVar12 == 0) {
          plVar8 = plVar11;
          do {
            plVar11 = plVar8 + 1;
            lVar15 = *plVar8;
            plVar13 = plVar13 + -8;
            uVar12 = CONCAT17(-(-1 < lVar15),
                              CONCAT16(-(-1 < (char)((ulong)lVar15 >> 0x30)),
                                       CONCAT15(-(-1 < (char)((ulong)lVar15 >> 0x28)),
                                                CONCAT14(-(-1 < (char)((ulong)lVar15 >> 0x20)),
                                                         CONCAT13(-(-1 < (char)((ulong)lVar15 >>
                                                                               0x18)),
                                                                  CONCAT12(-(-1 < (char)((ulong)
                                                  lVar15 >> 0x10)),
                                                  CONCAT11(-(-1 < (char)((ulong)lVar15 >> 8)),
                                                           -(-1 < (char)lVar15)))))))) &
                     0x8080808080808080;
            plVar8 = plVar11;
          } while (uVar12 == 0);
        }
        uVar1 = (uVar12 >> 7 & 0xff00ff00ff00ff00) >> 8 | (uVar12 >> 7 & 0xff00ff00ff00ff) << 8;
        uVar1 = (uVar1 & 0xffff0000ffff0000) >> 0x10 | (uVar1 & 0xffff0000ffff) << 0x10;
        uVar12 = uVar12 - 1 & uVar12;
        lVar14 = lVar14 + -1;
        plVar8 = *(long **)((long)plVar13 + (-8 - (LZCOUNT(uVar1 >> 0x20 | uVar1 << 0x20) & 0x78U)))
        ;
        lVar15 = *plVar10;
        *plVar10 = lVar15 + 1;
        uStack0000000000000190 = plVar8;
        if (lVar15 < 0) {
          func_0x007a05dc();
          goto LAB_00551610;
        }
        uVar9 = func_0x005787f4(in_stack_00000128,in_stack_00000128._8_8_,plVar8);
        func_0x00589494(&lStack00000000000000f0,uVar9,plVar8,plVar10);
        plVar10 = uStack0000000000000188;
        lStack00000000000001e0 = (long)extraout_x1;
        if (extraout_x1 != (long *)0x0) {
          lVar15 = *extraout_x1;
          *extraout_x1 = lVar15 + -1;
          LORelease();
          if (lVar15 == 1) {
            func_0x005d2ac4(&lStack00000000000001e0);
            plVar10 = uStack0000000000000188;
          }
        }
      }
      func_0x0053b6d8(auStack_7ffffffe + 0x800001fe);
      lVar14 = *uStack0000000000000188;
      *uStack0000000000000188 = lVar14 + -1;
      LORelease();
      if (lVar14 == 1) {
        func_0x005d2ac4(&uStack0000000000000188);
      }
      plVar10 = in_stack_00000148;
    } while (in_stack_00000148 != in_stack_00000158);
  }
  func_0x005929e8(&lStack0000000000000140);
  if (2 < *unaff_x24) goto code_r0x00550b20;
  if (1 < bRam0000000000a2a978 - 1) {
    if (bRam0000000000a2a978 == 0) goto code_r0x00550b20;
    cVar6 = func_0x007b1274(0xa2a968);
    if (cVar6 == '\0') goto code_r0x00550b20;
  }
  iVar7 = func_0x005e7964(lRam0000000000a2a968);
  if (iVar7 == 0) {
code_r0x00550b20:
    lVar3 = _UNK_007fc128;
    lVar2 = _UNK_007fc120;
    plVar10 = (long *)unaff_x19[0x2f];
    lVar14 = unaff_x19[0x30];
    lVar15 = unaff_x19[0x32];
    lVar16 = *plVar10;
    plVar11 = plVar10 + 1;
    uVar12 = CONCAT17(-(-1 < lVar16),
                      CONCAT16(-(-1 < (char)((ulong)lVar16 >> 0x30)),
                               CONCAT15(-(-1 < (char)((ulong)lVar16 >> 0x28)),
                                        CONCAT14(-(-1 < (char)((ulong)lVar16 >> 0x20)),
                                                 CONCAT13(-(-1 < (char)((ulong)lVar16 >> 0x18)),
                                                          CONCAT12(-(-1 < (char)((ulong)lVar16 >>
                                                                                0x10)),
                                                                   CONCAT11(-(-1 < (char)((ulong)
                                                  lVar16 >> 8)),-(-1 < (char)lVar16)))))))) &
             0x8080808080808080;
    lVar16 = -0x7fffffffffffffff;
code_r0x00550bb8:
    if (lVar16 == -0x7fffffffffffffff) goto code_r0x00550c48;
joined_r0x00550bc4:
    if (in_stack_00000278 != 0) {
      if (in_stack_00000260 == 0) {
        plVar13 = in_stack_00000268;
        do {
          in_stack_00000268 = plVar13 + 1;
          lVar17 = *plVar13;
          in_stack_00000258 = in_stack_00000258 + -0x30;
          in_stack_00000260 =
               CONCAT17(-(-1 < lVar17),
                        CONCAT16(-(-1 < (char)((ulong)lVar17 >> 0x30)),
                                 CONCAT15(-(-1 < (char)((ulong)lVar17 >> 0x28)),
                                          CONCAT14(-(-1 < (char)((ulong)lVar17 >> 0x20)),
                                                   CONCAT13(-(-1 < (char)((ulong)lVar17 >> 0x18)),
                                                            CONCAT12(-(-1 < (char)((ulong)lVar17 >>
                                                                                  0x10)),
                                                                     CONCAT11(-(-1 < (char)((ulong)
                                                  lVar17 >> 8)),-(-1 < (char)lVar17)))))))) &
               0x8080808080808080;
          plVar13 = in_stack_00000268;
        } while (in_stack_00000260 == 0);
      }
      uVar1 = (in_stack_00000260 & 0xaaaaaaaaaaaaaaaa) >> 1 |
              (in_stack_00000260 & 0x5555555555555555) << 1;
      uVar1 = (uVar1 & 0xcccccccccccccccc) >> 2 | (uVar1 & 0x3333333333333333) << 2;
      uVar1 = (uVar1 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar1 & 0xf0f0f0f0f0f0f0f) << 4;
      uVar1 = (uVar1 & 0xff00ff00ff00ff00) >> 8 | (uVar1 & 0xff00ff00ff00ff) << 8;
      uVar1 = (uVar1 & 0xffff0000ffff0000) >> 0x10 | (uVar1 & 0xffff0000ffff) << 0x10;
      in_stack_00000260 = in_stack_00000260 - 1 & in_stack_00000260;
      iVar7 = (int)((ulong)LZCOUNT(uVar1 >> 0x20 | uVar1 << 0x20) >> 3);
      in_stack_00000278 = in_stack_00000278 - 1;
      plVar13 = (long *)in_stack_00000258[(long)-iVar7 * 6 + -4];
      if (plVar13 != (long *)0x0) goto code_r0x00550c08;
    }
    func_0x0053b428(auStack_7ffffffe + 0x8000023e);
    lVar16 = -0x7fffffffffffffff;
code_r0x00550c48:
    if (((ulong)(lVar14 != 0) << 3 == -0x7fffffffffffffff) || (lVar15 == 0)) {
code_r0x00550c54:
      func_0x005497d8(auStack_7ffffffe + 0x800001fe);
      if (2 < ___ZN12tracing_core8metadata9MAX_LEVEL17h4f715bd39d097130E) goto code_r0x00550f84;
      if (1 < bRam0000000000a2a990 - 1) {
        if (bRam0000000000a2a990 == 0) goto code_r0x00550f84;
        cVar6 = func_0x007b1274(0xa2a980);
        if (cVar6 == '\0') goto code_r0x00550f84;
      }
      uVar12 = func_0x005e7964(lRam0000000000a2a980);
      if ((uVar12 & 1) == 0) {
code_r0x00550f84:
        in_stack_00000028[1] = in_stack_000001c8;
        *in_stack_00000028 = in_stack_000001c0;
        in_stack_00000028[3] = in_stack_000001d8;
        in_stack_00000028[2] = in_stack_000001d0;
        in_stack_00000028[8] = in_stack_00000108;
        in_stack_00000028[7] = in_stack_00000100;
        in_stack_00000028[10] = in_stack_00000118;
        in_stack_00000028[9] = in_stack_00000110;
        in_stack_00000028[0xc] = in_stack_00000128;
        in_stack_00000028[0xb] = in_stack_00000120;
        lVar14 = unaff_x19[0x33];
        in_stack_00000028[0xd] = in_stack_00000130;
        in_stack_00000028[6] = in_stack_000000f8;
        in_stack_00000028[5] = lStack00000000000000f0;
        in_stack_00000028[4] = lVar14;
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
        plVar11 = *(long **)(lRam0000000000a2a980 + 0x30);
        if (plVar11 != (long *)0x0) {
          in_stack_00000150 = *(long **)(lRam0000000000a2a980 + 0x40);
          in_stack_00000148 = *(long **)(lRam0000000000a2a980 + 0x38);
          in_stack_00000158 = *(long **)(lRam0000000000a2a980 + 0x48);
          in_stack_00000160 = 0;
          lStack00000000000001e0 = (long)&lStack0000000000000140;
          in_stack_000001e8 = (undefined8 *)(auStack_7ffffffe + 0x800001fe);
          uStack0000000000000190 = &lStack00000000000001e0;
          in_stack_00000198 = (long *)((long)&MACH_HEADER.magic + 1);
          lStack0000000000000140 = (long)plVar11;
          in_stack_000001a0 = (undefined8 *)(lRam0000000000a2a980 + 0x30);
          func_0x005eb358(lRam0000000000a2a980,&uStack0000000000000190);
          goto code_r0x00550f84;
        }
      }
      func_0x007a23d8(&UNK_008ab0d6,0x22,&UNK_009ed6e8);
      goto LAB_00551610;
    }
    if (uVar12 == 0) {
      plVar13 = plVar11;
      do {
        plVar11 = plVar13 + 1;
        lVar17 = *plVar13;
        plVar10 = plVar10 + -0x28;
        uVar12 = CONCAT17(-(-1 < lVar17),
                          CONCAT16(-(-1 < (char)((ulong)lVar17 >> 0x30)),
                                   CONCAT15(-(-1 < (char)((ulong)lVar17 >> 0x28)),
                                            CONCAT14(-(-1 < (char)((ulong)lVar17 >> 0x20)),
                                                     CONCAT13(-(-1 < (char)((ulong)lVar17 >> 0x18)),
                                                              CONCAT12(-(-1 < (char)((ulong)lVar17
                                                                                    >> 0x10)),
                                                                       CONCAT11(-(-1 < (char)((ulong
                                                  )lVar17 >> 8)),-(-1 < (char)lVar17)))))))) &
                 0x8080808080808080;
        plVar13 = plVar11;
      } while (uVar12 == 0);
    }
    uVar1 = (uVar12 >> 7 & 0xff00ff00ff00ff00) >> 8 | (uVar12 >> 7 & 0xff00ff00ff00ff) << 8;
    uVar1 = (uVar1 & 0xffff0000ffff0000) >> 0x10 | (uVar1 & 0xffff0000ffff) << 0x10;
    uVar12 = uVar12 - 1 & uVar12;
    iVar7 = (int)((ulong)LZCOUNT(uVar1 >> 0x20 | uVar1 << 0x20) >> 3);
    lVar15 = lVar15 + -1;
    plVar13 = (long *)plVar10[(long)-iVar7 * 5 + -5];
    if (plVar13 == (long *)0x0) goto code_r0x00550c54;
    in_stack_00000258 = (long *)plVar10[(long)-iVar7 * 5 + -4];
    plVar8 = (long *)plVar10[(long)-iVar7 * 5 + -3];
    in_stack_00000158 = (long *)plVar10[(long)-iVar7 * 5 + -2];
    in_stack_00000278 = plVar10[(long)-iVar7 * 5 + -1];
    lVar17 = *plVar13;
    *plVar13 = lVar17 + -1;
    LORelease();
    lStack0000000000000140 = (long)plVar13;
    in_stack_00000148 = in_stack_00000258;
    in_stack_00000150 = plVar8;
    in_stack_00000160 = in_stack_00000278;
    if (lVar17 == 1) {
      func_0x005d2ac4(&lStack0000000000000140);
    }
    if (in_stack_00000258 == (long *)0x0) goto code_r0x00550c54;
    in_stack_00000268 = in_stack_00000258 + 1;
    lVar17 = *in_stack_00000258;
    in_stack_00000260 =
         CONCAT17(-(-1 < lVar17),
                  CONCAT16(-(-1 < (char)((ulong)lVar17 >> 0x30)),
                           CONCAT15(-(-1 < (char)((ulong)lVar17 >> 0x28)),
                                    CONCAT14(-(-1 < (char)((ulong)lVar17 >> 0x20)),
                                             CONCAT13(-(-1 < (char)((ulong)lVar17 >> 0x18)),
                                                      CONCAT12(-(-1 < (char)((ulong)lVar17 >> 0x10))
                                                               ,CONCAT11(-(-1 < (char)((ulong)lVar17
                                                                                      >> 8)),
                                                                         -(-1 < (char)lVar17))))))))
         & 0x8080808080808080;
    lVar17 = (ulong)(plVar8 != (long *)0x0) << 3;
    bVar5 = lVar16 != -0x7fffffffffffffff;
    lVar16 = lVar17;
    if (bVar5) {
      func_0x0053b428(auStack_7ffffffe + 0x8000023e);
    }
    goto joined_r0x00550bc4;
  }
  if (*(long *)(lRam0000000000a2a968 + 0x38) != 0) {
    plVar11 = *(long **)(lRam0000000000a2a968 + 0x30);
    if (plVar11 != (long *)0x0) {
      in_stack_00000150 = *(long **)(lRam0000000000a2a968 + 0x40);
      in_stack_00000148 = *(long **)(lRam0000000000a2a968 + 0x38);
      in_stack_00000158 = *(long **)(lRam0000000000a2a968 + 0x48);
      in_stack_00000160 = 0;
      lStack00000000000001e0 = (long)&lStack0000000000000140;
      in_stack_000001e8 = (undefined8 *)(auStack_7ffffffe + 0x800001fe);
      uStack0000000000000190 = &lStack00000000000001e0;
      in_stack_00000198 = (long *)((long)&MACH_HEADER.magic + 1);
      lStack0000000000000140 = (long)plVar11;
      in_stack_000001a0 = (undefined8 *)(lRam0000000000a2a968 + 0x30);
      func_0x005eb358(lRam0000000000a2a968,&uStack0000000000000190);
      goto code_r0x00550b20;
    }
  }
  func_0x007a23d8(&UNK_008ab0d6,0x22,&UNK_009ed6c0);
  goto LAB_00551610;
code_r0x00550c08:
  in_stack_000001a0 = (undefined8 *)in_stack_00000258[(long)-iVar7 * 6 + -2];
  in_stack_00000198 = (long *)in_stack_00000258[(long)-iVar7 * 6 + -3];
  in_stack_000001a8 = in_stack_00000258[(long)-iVar7 * 6 + -1];
  uStack0000000000000190 = plVar13;
  lStack00000000000001e0 = (long)in_stack_00000198;
  in_stack_000001e8 = in_stack_000001a0;
  plVar8 = (long *)func_0x00187bd0(0x28,8);
  if (plVar8 != (long *)0x0) {
    plVar8[1] = lVar3;
    *plVar8 = lVar2;
    plVar8[2] = -0x8000000000000000;
    in_stack_00000170 = (undefined1 *)((long)plVar13 + (long)in_stack_00000198) + 1;
    lVar17 = *plVar13;
    in_stack_00000168 = plVar13 + 1;
    in_stack_00000160 =
         CONCAT17(-(-1 < lVar17),
                  CONCAT16(-(-1 < (char)((ulong)lVar17 >> 0x30)),
                           CONCAT15(-(-1 < (char)((ulong)lVar17 >> 0x28)),
                                    CONCAT14(-(-1 < (char)((ulong)lVar17 >> 0x20)),
                                             CONCAT13(-(-1 < (char)((ulong)lVar17 >> 0x18)),
                                                      CONCAT12(-(-1 < (char)((ulong)lVar17 >> 0x10))
                                                               ,CONCAT11(-(-1 < (char)((ulong)lVar17
                                                                                      >> 8)),
                                                                         -(-1 < (char)lVar17))))))))
         & 0x8080808080808080;
    in_stack_00000148 = (long *)((long)in_stack_00000198 * 9 + 0x11);
    in_stack_00000150 = plVar13 + (-1 - (long)in_stack_00000198);
    lStack0000000000000140 = (ulong)(in_stack_00000198 != (long *)0x0) << 3;
    in_stack_00000158 = plVar13;
    in_stack_00000178 = in_stack_000001a8;
    while( true ) {
      uStack0000000000000138 = plVar8;
      if (in_stack_00000178 == 0) break;
      if (in_stack_00000160 == 0) {
        plVar13 = in_stack_00000168;
        do {
          in_stack_00000168 = plVar13 + 1;
          lVar17 = *plVar13;
          in_stack_00000158 = in_stack_00000158 + -8;
          in_stack_00000160 =
               CONCAT17(-(-1 < lVar17),
                        CONCAT16(-(-1 < (char)((ulong)lVar17 >> 0x30)),
                                 CONCAT15(-(-1 < (char)((ulong)lVar17 >> 0x28)),
                                          CONCAT14(-(-1 < (char)((ulong)lVar17 >> 0x20)),
                                                   CONCAT13(-(-1 < (char)((ulong)lVar17 >> 0x18)),
                                                            CONCAT12(-(-1 < (char)((ulong)lVar17 >>
                                                                                  0x10)),
                                                                     CONCAT11(-(-1 < (char)((ulong)
                                                  lVar17 >> 8)),-(-1 < (char)lVar17)))))))) &
               0x8080808080808080;
          plVar13 = in_stack_00000168;
        } while (in_stack_00000160 == 0);
      }
      uVar1 = (in_stack_00000160 & 0xaaaaaaaaaaaaaaaa) >> 1 |
              (in_stack_00000160 & 0x5555555555555555) << 1;
      uVar1 = (uVar1 & 0xcccccccccccccccc) >> 2 | (uVar1 & 0x3333333333333333) << 2;
      uVar1 = (uVar1 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar1 & 0xf0f0f0f0f0f0f0f) << 4;
      uVar1 = (uVar1 & 0xff00ff00ff00ff00) >> 8 | (uVar1 & 0xff00ff00ff00ff) << 8;
      uVar1 = (uVar1 & 0xffff0000ffff0000) >> 0x10 | (uVar1 & 0xffff0000ffff) << 0x10;
      in_stack_00000160 = in_stack_00000160 - 1 & in_stack_00000160;
      in_stack_00000178 = in_stack_00000178 + -1;
      plVar13 = *(long **)((long)in_stack_00000158 +
                          (-8 - (LZCOUNT(uVar1 >> 0x20 | uVar1 << 0x20) & 0x78U)));
      lVar17 = *plVar8;
      *plVar8 = lVar17 + 1;
      uStack0000000000000188 = plVar13;
      if (lVar17 < 0) {
        func_0x007a05dc();
        goto LAB_00551610;
      }
      uVar9 = func_0x005787f4(in_stack_00000128,in_stack_00000128._8_8_,plVar13);
      func_0x00589494(&lStack00000000000000f0,uVar9,plVar13,plVar8);
      plVar8 = uStack0000000000000138;
      uStack0000000000000180 = extraout_x1_00;
      if (extraout_x1_00 != (long *)0x0) {
        lVar17 = *extraout_x1_00;
        *extraout_x1_00 = lVar17 + -1;
        LORelease();
        if (lVar17 == 1) {
          func_0x005d2ac4(&uStack0000000000000180);
          plVar8 = uStack0000000000000138;
        }
      }
    }
    func_0x0053b6d8(&lStack0000000000000140);
    lVar17 = *uStack0000000000000138;
    *uStack0000000000000138 = lVar17 + -1;
    LORelease();
    if (lVar17 == 1) {
      func_0x005d2ac4(&uStack0000000000000138);
    }
    goto code_r0x00550bb8;
  }
  func_0x007a1f18(8,0x28);
LAB_00551610:
                    /* WARNING: Does not return */
  pcVar4 = (code *)SoftwareBreakpoint(1,0x551614);
  (*pcVar4)();
}

