
undefined1  [16] FUN_004d1814(ulong param_1,undefined1 param_2 [16],undefined8 param_3,long param_4)

{
  uint uVar1;
  bool bVar2;
  int iVar3;
  ulong uVar4;
  ulong uVar5;
  ulong in_x9;
  long in_x10;
  ulong in_x12;
  ulong in_x13;
  ulong unaff_x20;
  undefined4 unaff_w21;
  long unaff_x22;
  undefined8 uVar6;
  long *unaff_x23;
  undefined1 unaff_w24;
  ulong unaff_x25;
  long *unaff_x26;
  byte bVar7;
  long lVar8;
  undefined8 unaff_d8;
  char cVar9;
  char cVar10;
  char cVar11;
  char cVar12;
  char cVar13;
  char cVar14;
  long unaff_d9;
  undefined1 auVar15 [16];
  ulong in_stack_00000000;
  ulong uStack0000000000000008;
  long lStack0000000000000010;
  long lStack0000000000000018;
  
  lStack0000000000000018 = param_4;
  lStack0000000000000010 = in_x10;
  uStack0000000000000008 = in_x12;
  while( true ) {
    bVar2 = uStack0000000000000008 != 1;
    uStack0000000000000008 = in_x13;
    if (bVar2) {
      uStack0000000000000008 = in_x9;
      in_stack_00000000 = param_1;
    }
    bVar7 = NEON_umaxv(CONCAT17(-((char)((ulong)unaff_d9 >> 0x38) == (char)((ulong)param_3 >> 0x38))
                                ,CONCAT16(-((char)((ulong)unaff_d9 >> 0x30) ==
                                           (char)((ulong)param_3 >> 0x30)),
                                          CONCAT15(-((char)((ulong)unaff_d9 >> 0x28) ==
                                                    (char)((ulong)param_3 >> 0x28)),
                                                   CONCAT14(-((char)((ulong)unaff_d9 >> 0x20) ==
                                                             (char)((ulong)param_3 >> 0x20)),
                                                            CONCAT13(-((char)((ulong)unaff_d9 >>
                                                                             0x18) ==
                                                                      (char)((ulong)param_3 >> 0x18)
                                                                      ),CONCAT12(-((char)((ulong)
                                                  unaff_d9 >> 0x10) ==
                                                  (char)((ulong)param_3 >> 0x10)),
                                                  CONCAT11(-((char)((ulong)unaff_d9 >> 8) ==
                                                            (char)((ulong)param_3 >> 8)),
                                                           -((char)unaff_d9 == (char)param_3))))))))
                       ,1);
    if ((bVar7 & 1) != 0) break;
    lStack0000000000000010 = lStack0000000000000010 + 8;
    unaff_x20 = unaff_x20 + lStack0000000000000010 & unaff_x25;
    unaff_d9 = *(long *)((long)unaff_x23 + unaff_x20);
    cVar9 = (char)((ulong)unaff_d9 >> 8);
    cVar10 = (char)((ulong)unaff_d9 >> 0x10);
    cVar11 = (char)((ulong)unaff_d9 >> 0x18);
    cVar12 = (char)((ulong)unaff_d9 >> 0x20);
    cVar13 = (char)((ulong)unaff_d9 >> 0x28);
    cVar14 = (char)((ulong)unaff_d9 >> 0x30);
    uVar5 = CONCAT17(-((char)((ulong)unaff_d9 >> 0x38) == (char)((ulong)unaff_d8 >> 0x38)),
                     CONCAT16(-(cVar14 == (char)((ulong)unaff_d8 >> 0x30)),
                              CONCAT15(-(cVar13 == (char)((ulong)unaff_d8 >> 0x28)),
                                       CONCAT14(-(cVar12 == (char)((ulong)unaff_d8 >> 0x20)),
                                                CONCAT13(-(cVar11 == (char)((ulong)unaff_d8 >> 0x18)
                                                          ),CONCAT12(-(cVar10 ==
                                                                      (char)((ulong)unaff_d8 >> 0x10
                                                                            )),
                                                                     CONCAT11(-(cVar9 == (char)((
                                                  ulong)unaff_d8 >> 8)),
                                                  -((char)unaff_d9 == (char)unaff_d8)))))))) &
            0x8080808080808080;
    if (uVar5 != 0) {
      do {
        uVar4 = (uVar5 >> 7 & 0xff00ff00ff00ff00) >> 8 | (uVar5 >> 7 & 0xff00ff00ff00ff) << 8;
        uVar4 = (uVar4 & 0xffff0000ffff0000) >> 0x10 | (uVar4 & 0xffff0000ffff) << 0x10;
        uVar4 = unaff_x20 + ((ulong)LZCOUNT(uVar4 >> 0x20 | uVar4 << 0x20) >> 3) & unaff_x25;
        if ((unaff_x22 == unaff_x23[uVar4 * -4 + -2]) && (iVar3 = _memcmp(), iVar3 == 0)) {
          uVar1 = *(uint *)(unaff_x23 + uVar4 * -4 + -1);
          *(undefined4 *)(unaff_x23 + uVar4 * -4 + -1) = unaff_w21;
          unaff_x23 = (long *)(ulong)uVar1;
          if (*unaff_x26 == 0) {
            uVar6 = 1;
          }
          else {
            uVar6 = 1;
            func_0x00187bd4();
          }
          goto LAB_004d1918;
        }
        uVar5 = uVar5 - 1 & uVar5;
        in_x13 = 1;
        param_3 = 0xffffffffffffffff;
      } while (uVar5 != 0);
    }
    uVar5 = CONCAT17(-(unaff_d9 < 0),
                     CONCAT16(-(cVar14 < '\0'),
                              CONCAT15(-(cVar13 < '\0'),
                                       CONCAT14(-(cVar12 < '\0'),
                                                CONCAT13(-(cVar11 < '\0'),
                                                         CONCAT12(-(cVar10 < '\0'),
                                                                  CONCAT11(-(cVar9 < '\0'),
                                                                           -((char)unaff_d9 < '\0'))
                                                                 ))))));
    in_x9 = (ulong)(uVar5 != 0);
    uVar5 = (uVar5 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar5 & 0x5555555555555555) << 1;
    uVar5 = (uVar5 & 0xcccccccccccccccc) >> 2 | (uVar5 & 0x3333333333333333) << 2;
    uVar5 = (uVar5 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar5 & 0xf0f0f0f0f0f0f0f) << 4;
    uVar5 = (uVar5 & 0xff00ff00ff00ff00) >> 8 | (uVar5 & 0xff00ff00ff00ff) << 8;
    uVar5 = (uVar5 & 0xffff0000ffff0000) >> 0x10 | (uVar5 & 0xffff0000ffff) << 0x10;
    param_1 = unaff_x20 + ((ulong)LZCOUNT(uVar5 >> 0x20 | uVar5 << 0x20) >> 3) & unaff_x25;
  }
  uVar5 = (ulong)*(char *)((long)unaff_x23 + in_stack_00000000);
  if (-1 < *(char *)((long)unaff_x23 + in_stack_00000000)) {
    lVar8 = *unaff_x23;
    uVar5 = CONCAT17(-(lVar8 < 0),
                     CONCAT16(-((char)((ulong)lVar8 >> 0x30) < '\0'),
                              CONCAT15(-((char)((ulong)lVar8 >> 0x28) < '\0'),
                                       CONCAT14(-((char)((ulong)lVar8 >> 0x20) < '\0'),
                                                CONCAT13(-((char)((ulong)lVar8 >> 0x18) < '\0'),
                                                         CONCAT12(-((char)((ulong)lVar8 >> 0x10) <
                                                                   '\0'),CONCAT11(-((char)((ulong)
                                                  lVar8 >> 8) < '\0'),-((char)lVar8 < '\0'))))))));
    uVar5 = (uVar5 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar5 & 0x5555555555555555) << 1;
    uVar5 = (uVar5 & 0xcccccccccccccccc) >> 2 | (uVar5 & 0x3333333333333333) << 2;
    uVar5 = (uVar5 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar5 & 0xf0f0f0f0f0f0f0f) << 4;
    uVar5 = (uVar5 & 0xff00ff00ff00ff00) >> 8 | (uVar5 & 0xff00ff00ff00ff) << 8;
    uVar5 = (uVar5 & 0xffff0000ffff0000) >> 0x10 | (uVar5 & 0xffff0000ffff) << 0x10;
    in_stack_00000000 = (ulong)LZCOUNT(uVar5 >> 0x20 | uVar5 << 0x20) >> 3;
    uVar5 = (ulong)*(byte *)((long)unaff_x23 + in_stack_00000000);
  }
  uVar6 = 0;
  *(undefined1 *)((long)unaff_x23 + in_stack_00000000) = unaff_w24;
  *(undefined1 *)((long)unaff_x23 + (in_stack_00000000 - 8 & unaff_x25) + 8) = unaff_w24;
  *(ulong *)(lStack0000000000000018 + 0x10) = *(long *)(lStack0000000000000018 + 0x10) - (uVar5 & 1)
  ;
  *(long *)(lStack0000000000000018 + 0x18) = *(long *)(lStack0000000000000018 + 0x18) + 1;
  unaff_x23[in_stack_00000000 * -4 + -2] = unaff_x26[2];
  lVar8 = *unaff_x26;
  unaff_x23[in_stack_00000000 * -4 + -3] = unaff_x26[1];
  unaff_x23[in_stack_00000000 * -4 + -4] = lVar8;
  *(undefined4 *)(unaff_x23 + in_stack_00000000 * -4 + -1) = unaff_w21;
LAB_004d1918:
  auVar15._8_8_ = unaff_x23;
  auVar15._0_8_ = uVar6;
  return auVar15;
}

