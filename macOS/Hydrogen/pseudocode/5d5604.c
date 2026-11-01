
void FUN_005d5604(long param_1,undefined1 *param_2,undefined8 param_3)

{
  ulong uVar1;
  ulong uVar2;
  undefined8 uVar3;
  code *pcVar4;
  long lVar5;
  ulong uVar6;
  ulong uVar7;
  undefined8 uVar8;
  undefined8 extraout_x1;
  undefined8 extraout_x1_00;
  undefined8 extraout_x1_01;
  long *plVar9;
  long lVar10;
  long *plVar11;
  long lVar12;
  long lVar13;
  ulong uVar14;
  long lVar15;
  ulong uVar16;
  ulong uVar17;
  long unaff_x19;
  long unaff_x20;
  long *unaff_x21;
  long unaff_x22;
  long lVar18;
  undefined8 *puVar19;
  ulong unaff_x24;
  ulong uVar20;
  undefined8 unaff_x26;
  long unaff_x27;
  long lVar21;
  long *unaff_x28;
  long *plVar22;
  long in_xzr;
  long in_stack_00000048;
  long *in_stack_00000050;
  long *in_stack_00000058;
  long in_stack_00000060;
  long in_stack_00000068;
  undefined1 uStack00000000000000b0;
  long in_stack_000000c8;
  ulong in_stack_000000d0;
  long *in_stack_000000d8;
  long in_stack_000000e8;
  long in_stack_000000f0;
  undefined8 in_stack_000000f8;
  undefined8 in_stack_00000100;
  undefined8 uStack0000000000000108;
  long in_stack_00000110;
  undefined8 in_stack_00000118;
  undefined8 in_stack_00000120;
  undefined8 uStack0000000000000130;
  undefined8 in_stack_00000138;
  long in_stack_00000140;
  undefined8 in_stack_00000148;
  ulong in_stack_00000150;
  undefined8 in_stack_00000158;
  long in_stack_00000160;
  undefined8 in_stack_00000168;
  undefined8 in_stack_00000170;
  undefined8 uStack0000000000000180;
  long in_stack_00000188;
  undefined8 *in_stack_00000190;
  ulong in_stack_00000198;
  long in_stack_000001a0;
  ulong in_stack_000001a8;
  undefined8 in_stack_000001b0;
  long in_stack_000001b8;
  undefined8 in_stack_000001c0;
  undefined8 in_stack_000001c8;
  undefined8 uStack00000000000001d0;
  undefined8 *in_stack_000001d8;
  ulong in_stack_000001e0;
  long in_stack_000001e8;
  undefined1 auStack_7ffffffe [2147483646];
  
code_r0x005d5604:
  _memcpy(param_1,param_2,param_3);
  unaff_x28[4] = unaff_x24 + 1;
LAB_005d5610:
  while( true ) {
    func_0x005c5b7c(&uStack0000000000000180,&uStack0000000000000130);
    uVar3 = in_stack_000001c8;
    uVar8 = in_stack_000001c0;
    lVar5 = in_stack_000001b8;
    uVar2 = in_stack_000001a8;
    lVar15 = in_stack_000001a0;
    uVar1 = in_stack_00000198;
    puVar19 = in_stack_00000190;
    uVar20 = uStack0000000000000180;
    if (in_stack_00000188 != -0x8000000000000000) break;
    func_0x005c7d60(&uStack0000000000000130);
    if ((char)*unaff_x21 == '\x01') {
      *(char *)unaff_x21 = (char)in_xzr;
      uVar8 = extraout_x1;
    }
    else {
      func_0x007b05dc(unaff_x21,0);
      uVar8 = extraout_x1_01;
    }
    lVar15 = *uStack0000000000000108;
    *uStack0000000000000108 = lVar15 + unaff_x22;
    LORelease();
    if (lVar15 == 1) {
      in_xzr = *uStack0000000000000108;
      func_0x005d2c74(&uStack0000000000000108);
      uVar8 = extraout_x1_00;
    }
    if (in_stack_000000e8 == 0) {
code_r0x005d59b0:
      func_0x005ad898(&uStack00000000000000b0);
      if ((in_stack_00000068 != 0) && (lVar15 = in_stack_00000068 * 9 + 0x11, lVar15 != 0)) {
        func_0x00187bd4(in_stack_00000060 + in_stack_00000068 * -8 + -8,lVar15,8);
      }
      lVar15 = *(long *)(unaff_x27 + 0x80);
      if (lVar15 != 0) {
        lVar5 = *(long *)(unaff_x27 + 0x90);
        if (lVar5 != 0) {
          plVar9 = *(long **)(unaff_x27 + 0x78);
          plVar22 = plVar9 + 1;
          lVar18 = *plVar9;
          uVar20 = CONCAT17(-(-1 < lVar18),
                            CONCAT16(-(-1 < (char)((ulong)lVar18 >> 0x30)),
                                     CONCAT15(-(-1 < (char)((ulong)lVar18 >> 0x28)),
                                              CONCAT14(-(-1 < (char)((ulong)lVar18 >> 0x20)),
                                                       CONCAT13(-(-1 < (char)((ulong)lVar18 >> 0x18)
                                                                 ),CONCAT12(-(-1 < (char)((ulong)
                                                  lVar18 >> 0x10)),
                                                  CONCAT11(-(-1 < (char)((ulong)lVar18 >> 8)),
                                                           -(-1 < (char)lVar18)))))))) &
                   0x8080808080808080;
          do {
            while (uVar20 == 0) {
              lVar18 = *plVar22;
              plVar9 = plVar9 + -0x10;
              plVar22 = plVar22 + 1;
              uVar20 = CONCAT17(-(-1 < lVar18),
                                CONCAT16(-(-1 < (char)((ulong)lVar18 >> 0x30)),
                                         CONCAT15(-(-1 < (char)((ulong)lVar18 >> 0x28)),
                                                  CONCAT14(-(-1 < (char)((ulong)lVar18 >> 0x20)),
                                                           CONCAT13(-(-1 < (char)((ulong)lVar18 >>
                                                                                 0x18)),
                                                                    CONCAT12(-(-1 < (char)((ulong)
                                                  lVar18 >> 0x10)),
                                                  CONCAT11(-(-1 < (char)((ulong)lVar18 >> 8)),
                                                           -(-1 < (char)lVar18)))))))) &
                       0x8080808080808080;
            }
            uVar1 = (uVar20 >> 7 & 0xff00ff00ff00ff00) >> 8 | (uVar20 >> 7 & 0xff00ff00ff00ff) << 8;
            uVar1 = (uVar1 & 0xffff0000ffff0000) >> 0x10 | (uVar1 & 0xffff0000ffff) << 0x10;
            plVar11 = *(long **)((long)plVar9 +
                                (LZCOUNT(uVar1 >> 0x20 | uVar1 << 0x20) & 0x78U) * -2 + -0x10);
            lVar18 = *plVar11;
            *plVar11 = lVar18 + -1;
            LORelease();
            if (lVar18 == 1) {
              func_0x005d2c74();
            }
            uVar20 = uVar20 - 1 & uVar20;
            lVar5 = lVar5 + -1;
          } while (lVar5 != 0);
        }
        lVar5 = lVar15 * 0x11 + 0x19;
        if (lVar5 != 0) {
          func_0x00187bd4(*(long *)(unaff_x27 + 0x78) + lVar15 * -0x10 + -0x10,lVar5,8);
        }
      }
      func_0x005d3ef4(unaff_x27);
      return;
    }
    if (in_stack_000000d0 == 0) {
      plVar9 = in_stack_000000d8;
      do {
        in_stack_000000d8 = plVar9 + 1;
        lVar15 = *plVar9;
        in_stack_000000c8 = in_stack_000000c8 + -0x100;
        in_stack_000000d0 =
             CONCAT17(-(-1 < lVar15),
                      CONCAT16(-(-1 < (char)((ulong)lVar15 >> 0x30)),
                               CONCAT15(-(-1 < (char)((ulong)lVar15 >> 0x28)),
                                        CONCAT14(-(-1 < (char)((ulong)lVar15 >> 0x20)),
                                                 CONCAT13(-(-1 < (char)((ulong)lVar15 >> 0x18)),
                                                          CONCAT12(-(-1 < (char)((ulong)lVar15 >>
                                                                                0x10)),
                                                                   CONCAT11(-(-1 < (char)((ulong)
                                                  lVar15 >> 8)),-(-1 < (char)lVar15)))))))) &
             0x8080808080808080;
        plVar9 = in_stack_000000d8;
      } while (in_stack_000000d0 == 0);
    }
    uVar20 = (in_stack_000000d0 & 0xaaaaaaaaaaaaaaaa) >> 1 |
             (in_stack_000000d0 & 0x5555555555555555) << 1;
    uVar20 = (uVar20 & 0xcccccccccccccccc) >> 2 | (uVar20 & 0x3333333333333333) << 2;
    uVar20 = (uVar20 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar20 & 0xf0f0f0f0f0f0f0f) << 4;
    uVar20 = (uVar20 & 0xff00ff00ff00ff00) >> 8 | (uVar20 & 0xff00ff00ff00ff) << 8;
    uVar20 = (uVar20 & 0xffff0000ffff0000) >> 0x10 | (uVar20 & 0xffff0000ffff) << 0x10;
    in_stack_000000d0 = in_stack_000000d0 - 1 & in_stack_000000d0;
    lVar15 = in_stack_000000c8 + (LZCOUNT(uVar20 >> 0x20 | uVar20 << 0x20) & 0x78U) * -4;
    in_stack_000000e8 = in_stack_000000e8 + -1;
    unaff_x28 = *(long **)(lVar15 + -0x20);
    in_stack_00000100 = *(undefined8 *)(lVar15 + -8);
    in_stack_000000f8 = *(undefined8 *)(lVar15 + -0x10);
    in_stack_000000f0 = *(long *)(lVar15 + -0x18);
    if (unaff_x28 == (long *)0x0) goto code_r0x005d59b0;
    unaff_x21 = unaff_x28 + 1;
    uStack0000000000000108 = unaff_x28;
    in_stack_00000110 = in_stack_000000f0;
    in_stack_00000118 = in_stack_000000f8;
    in_stack_00000120 = in_stack_00000100;
    if ((char)*unaff_x21 == '\0') {
      *(char *)unaff_x21 = '\x01';
    }
    else {
      func_0x007aff64(unaff_x21,uVar8,1000000000);
    }
    if (in_stack_00000110 == 0) {
      in_stack_00000170 = 0;
    }
    else {
      in_stack_00000170 = in_stack_00000120;
      unaff_x19 = in_stack_00000110;
      unaff_x20 = in_stack_00000110;
      unaff_x26 = in_stack_00000118;
    }
    uStack0000000000000130 = (ulong)(in_stack_00000110 != 0);
    in_stack_00000138 = 0;
    in_stack_00000158 = 0;
    in_stack_00000050 = unaff_x21;
    in_stack_00000058 = unaff_x28;
    in_stack_00000140 = unaff_x19;
    in_stack_00000148 = unaff_x26;
    in_stack_00000150 = uStack0000000000000130;
    in_stack_00000160 = unaff_x20;
    in_stack_00000168 = unaff_x26;
  }
  in_stack_000001d8 = in_stack_00000190;
  uStack00000000000001d0 = in_stack_00000188;
  in_stack_000001e8 = in_stack_000001a0;
  in_stack_000001e0 = in_stack_00000198;
  if ((ulong)unaff_x28[4] <= uStack0000000000000180) {
    func_0x007a2570(uStack0000000000000180,unaff_x28[4],&UNK_009f2ef0);
    goto code_r0x005d5bf4;
  }
  lVar18 = unaff_x28[3] + uStack0000000000000180 * 0x108;
  unaff_x21 = in_stack_00000050;
  unaff_x27 = in_stack_00000048;
  unaff_x28 = in_stack_00000058;
  if (*(long *)(lVar18 + 0x18) == 0xf) {
    lVar12 = *(long *)(lVar18 + 0x30);
    if (lVar12 == 0) {
LAB_005d578c:
      func_0x005bf7bc(&uStack00000000000001d0,lVar18 + 0x20);
      *(undefined1 *)(lVar18 + 0x50) = 1;
      goto LAB_005d57b4;
    }
    plVar9 = *(long **)(lVar18 + 0x28);
    if (in_stack_000001b8 != 0) {
      lVar13 = in_stack_000001a0 + -8;
      plVar22 = plVar9;
LAB_005d5754:
      plVar11 = plVar22 + 3;
      if (*plVar22 == -0x8000000000000000) {
        lVar21 = plVar22[1];
        uVar7 = func_0x005787f4(uVar8,uVar3,lVar21);
        lVar10 = 0;
        uVar14 = uVar7 >> 0x39;
        while( true ) {
          uVar7 = uVar7 & uVar2;
          uVar16 = *(ulong *)(lVar15 + uVar7);
          uVar17 = uVar16 ^ uVar14 * 0x101010101010101;
          for (uVar17 = uVar17 + 0xfefefefefefefeff & (uVar17 ^ 0xffffffffffffffff) &
                        0x8080808080808080; uVar17 != 0; uVar17 = uVar17 - 1 & uVar17) {
            uVar6 = (uVar17 >> 7 & 0xff00ff00ff00ff00) >> 8 | (uVar17 >> 7 & 0xff00ff00ff00ff) << 8;
            uVar6 = (uVar6 & 0xffff0000ffff0000) >> 0x10 | (uVar6 & 0xffff0000ffff) << 0x10;
            uVar6 = *(ulong *)(lVar13 + (uVar7 + ((ulong)LZCOUNT(uVar6 >> 0x20 | uVar6 << 0x20) >> 3
                                                 ) & uVar2) * -8);
            if (uVar1 <= uVar6) {
              func_0x007a2570(uVar6,uVar1,&UNK_009f2240);
              goto code_r0x005d5bf4;
            }
            if (lVar21 == puVar19[uVar6 * 2]) {
              plVar22 = plVar11;
              if (plVar11 != plVar9 + lVar12 * 3) goto LAB_005d5754;
              goto LAB_005d578c;
            }
          }
          if ((uVar16 & uVar16 << 1 & 0x8080808080808080) != 0) break;
          lVar10 = lVar10 + 8;
          uVar7 = lVar10 + uVar7;
        }
      }
      goto LAB_005d57b4;
    }
    if (*plVar9 != -0x8000000000000000) goto LAB_005d57b4;
  }
  else {
LAB_005d57b4:
    if (lVar5 != 0) goto code_r0x005d57c0;
  }
  if (uVar2 != 0) {
    lVar15 = uVar2 * 8 + 8;
    func_0x00187bd4(in_stack_000001e8 - lVar15,uVar2 + lVar15 + 9,8);
  }
  unaff_x22 = -1;
  if (in_stack_000001e0 != 0) {
    lVar15 = 1 - in_stack_000001e0;
    puVar19 = in_stack_000001d8;
    do {
      lVar5 = *(long *)*puVar19;
      *(long *)*puVar19 = lVar5 + -1;
      LORelease();
      if (lVar5 == 1) {
        in_xzr = *(long *)*puVar19;
        func_0x005d2ac4(puVar19);
      }
      puVar19 = puVar19 + 2;
      lVar15 = lVar15 + 1;
    } while (lVar15 != 1);
  }
  if (uStack00000000000001d0 != 0) {
    func_0x00187bd4(in_stack_000001d8,uStack00000000000001d0 << 4,8);
  }
  goto LAB_005d5610;
code_r0x005d57c0:
  if (uVar2 != 0) {
    lVar15 = uVar2 * 8 + 8;
    func_0x00187bd4(in_stack_000001e8 - lVar15,uVar2 + lVar15 + 9,8);
  }
  func_0x005a30cc(auStack_7ffffffe + 0x8000021e,auStack_7ffffffe + 0x80000236,&UNK_009f2e80);
  unaff_x24 = in_stack_00000058[4];
  if (unaff_x24 < uVar20) {
    func_0x007a204c(uVar20,unaff_x24,&UNK_009f2f08);
code_r0x005d5bf4:
                    /* WARNING: Does not return */
    pcVar4 = (code *)SoftwareBreakpoint(1,0x5d5bf8);
    (*pcVar4)();
  }
  if (unaff_x24 == in_stack_00000058[2]) {
    func_0x005bd0a4(in_stack_00000058 + 2,&UNK_009f2f08);
  }
  param_1 = in_stack_00000058[3] + uVar20 * 0x108;
  unaff_x22 = -1;
  if (uVar20 <= unaff_x24 && unaff_x24 - uVar20 != 0) {
    _memmove(param_1 + 0x108,param_1,(unaff_x24 - uVar20) * 0x108);
  }
  param_2 = auStack_7ffffffe + 0x80000236;
  param_3 = 0x108;
  goto code_r0x005d5604;
}

