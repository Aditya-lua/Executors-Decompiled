
void FUN_00203600(void)

{
  undefined8 *puVar1;
  undefined1 in_ZR;
  int iVar2;
  long lVar3;
  long lVar4;
  undefined1 uVar5;
  undefined8 *unaff_x19;
  long unaff_x20;
  long unaff_x21;
  long unaff_x23;
  ulong unaff_x24;
  ulong unaff_x25;
  long unaff_x26;
  ulong unaff_x27;
  ulong unaff_x28;
  byte bVar6;
  undefined8 uVar7;
  undefined8 uVar8;
  ulong uVar9;
  undefined8 unaff_d8;
  undefined8 unaff_d9;
  long in_stack_00000008;
  
  while ((!(bool)in_ZR || (iVar2 = _memcmp(), iVar2 != 0))) {
    unaff_x27 = unaff_x27 - 1 & unaff_x27;
    if (unaff_x27 == 0) {
      do {
        bVar6 = NEON_umaxv(CONCAT17(-((char)((ulong)unaff_d9 >> 0x38) == -1),
                                    CONCAT16(-((char)((ulong)unaff_d9 >> 0x30) == -1),
                                             CONCAT15(-((char)((ulong)unaff_d9 >> 0x28) == -1),
                                                      CONCAT14(-((char)((ulong)unaff_d9 >> 0x20) ==
                                                                -1),CONCAT13(-((char)((ulong)
                                                  unaff_d9 >> 0x18) == -1),
                                                  CONCAT12(-((char)((ulong)unaff_d9 >> 0x10) == -1),
                                                           CONCAT11(-((char)((ulong)unaff_d9 >> 8)
                                                                     == -1),-((char)unaff_d9 == -1))
                                                          )))))),1);
        if ((bVar6 & 1) != 0) goto LAB_00203704;
        in_stack_00000008 = in_stack_00000008 + 8;
        unaff_x28 = unaff_x28 + in_stack_00000008 & unaff_x24;
        unaff_d9 = *(undefined8 *)(unaff_x23 + unaff_x28);
        unaff_x27 = CONCAT17(-((char)((ulong)unaff_d9 >> 0x38) == (char)((ulong)unaff_d8 >> 0x38)),
                             CONCAT16(-((char)((ulong)unaff_d9 >> 0x30) ==
                                       (char)((ulong)unaff_d8 >> 0x30)),
                                      CONCAT15(-((char)((ulong)unaff_d9 >> 0x28) ==
                                                (char)((ulong)unaff_d8 >> 0x28)),
                                               CONCAT14(-((char)((ulong)unaff_d9 >> 0x20) ==
                                                         (char)((ulong)unaff_d8 >> 0x20)),
                                                        CONCAT13(-((char)((ulong)unaff_d9 >> 0x18)
                                                                  == (char)((ulong)unaff_d8 >> 0x18)
                                                                  ),CONCAT12(-((char)((ulong)
                                                  unaff_d9 >> 0x10) ==
                                                  (char)((ulong)unaff_d8 >> 0x10)),
                                                  CONCAT11(-((char)((ulong)unaff_d9 >> 8) ==
                                                            (char)((ulong)unaff_d8 >> 8)),
                                                           -((char)unaff_d9 == (char)unaff_d8)))))))
                            ) & 0x8080808080808080;
      } while (unaff_x27 == 0);
    }
    uVar9 = (unaff_x27 & 0xaaaaaaaaaaaaaaaa) >> 1 | (unaff_x27 & 0x5555555555555555) << 1;
    uVar9 = (uVar9 & 0xcccccccccccccccc) >> 2 | (uVar9 & 0x3333333333333333) << 2;
    uVar9 = (uVar9 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar9 & 0xf0f0f0f0f0f0f0f) << 4;
    uVar9 = (uVar9 & 0xff00ff00ff00ff00) >> 8 | (uVar9 & 0xff00ff00ff00ff) << 8;
    uVar9 = (uVar9 & 0xffff0000ffff0000) >> 0x10 | (uVar9 & 0xffff0000ffff) << 0x10;
    unaff_x25 = unaff_x28 + ((ulong)LZCOUNT(uVar9 >> 0x20 | uVar9 << 0x20) >> 3) & unaff_x24;
    in_ZR = unaff_x21 == *(long *)(unaff_x26 + unaff_x25 * -0x30 + 0x10);
  }
  lVar3 = unaff_x23 + unaff_x25 * -0x30;
  lVar4 = ((long)(unaff_x25 * 0x30) >> 4) * -0x5555555555555555;
  puVar1 = (undefined8 *)(unaff_x23 + (lVar4 - 8U & unaff_x24));
  uVar7 = *puVar1;
  uVar8 = *(undefined8 *)(unaff_x23 + lVar4);
  uVar9 = CONCAT17(-((char)((ulong)uVar8 >> 0x38) == -1),
                   CONCAT16(-((char)((ulong)uVar8 >> 0x30) == -1),
                            CONCAT15(-((char)((ulong)uVar8 >> 0x28) == -1),
                                     CONCAT14(-((char)((ulong)uVar8 >> 0x20) == -1),
                                              CONCAT13(-((char)((ulong)uVar8 >> 0x18) == -1),
                                                       CONCAT12(-((char)((ulong)uVar8 >> 0x10) == -1
                                                                 ),CONCAT11(-((char)((ulong)uVar8 >>
                                                                                    8) == -1),
                                                                            -((char)uVar8 == -1)))))
                                    )));
  uVar9 = (uVar9 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar9 & 0x5555555555555555) << 1;
  uVar9 = (uVar9 & 0xcccccccccccccccc) >> 2 | (uVar9 & 0x3333333333333333) << 2;
  uVar9 = (uVar9 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar9 & 0xf0f0f0f0f0f0f0f) << 4;
  uVar9 = (uVar9 & 0xff00ff00ff00ff00) >> 8 | (uVar9 & 0xff00ff00ff00ff) << 8;
  uVar9 = (uVar9 & 0xffff0000ffff0000) >> 0x10 | (uVar9 & 0xffff0000ffff) << 0x10;
  if (((ulong)LZCOUNT(uVar9 >> 0x20 | uVar9 << 0x20) >> 3) +
      ((ulong)LZCOUNT(CONCAT17(-((char)((ulong)uVar7 >> 0x38) == -1),
                               CONCAT16(-((char)((ulong)uVar7 >> 0x30) == -1),
                                        CONCAT15(-((char)((ulong)uVar7 >> 0x28) == -1),
                                                 CONCAT14(-((char)((ulong)uVar7 >> 0x20) == -1),
                                                          CONCAT13(-((char)((ulong)uVar7 >> 0x18) ==
                                                                    -1),CONCAT12(-((char)((ulong)
                                                  uVar7 >> 0x10) == -1),
                                                  CONCAT11(-((char)((ulong)uVar7 >> 8) == -1),
                                                           -((char)uVar7 == -1))))))))) >> 3) < 8) {
    *(long *)(unaff_x20 + 0x10) = *(long *)(unaff_x20 + 0x10) + 1;
    uVar5 = 0xff;
  }
  else {
    uVar5 = 0x80;
  }
  *(undefined1 *)(unaff_x23 + lVar4) = uVar5;
  *(undefined1 *)(puVar1 + 1) = uVar5;
  *(long *)(unaff_x20 + 0x18) = *(long *)(unaff_x20 + 0x18) + -1;
  lVar4 = *(long *)(lVar3 + -0x30);
  if (lVar4 == -0x8000000000000000) {
LAB_00203704:
    *unaff_x19 = 0x8000000000000000;
  }
  else {
    uVar7 = *(undefined8 *)(lVar3 + -0x28);
    uVar8 = *(undefined8 *)(lVar3 + -0x18);
    unaff_x19[1] = *(undefined8 *)(lVar3 + -0x10);
    *unaff_x19 = uVar8;
    unaff_x19[2] = *(undefined8 *)(lVar3 + -8);
    if (lVar4 != 0) {
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (*(code *)PTR__free_00a24e58)(uVar7,lVar4,1);
      return;
    }
  }
  return;
}

