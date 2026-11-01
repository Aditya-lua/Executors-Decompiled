
void FUN_002037ac(ulong param_1)

{
  undefined8 *puVar1;
  ulong uVar2;
  int iVar3;
  long lVar4;
  byte bVar5;
  long lVar6;
  long in_x9;
  long lVar7;
  undefined1 uVar8;
  undefined8 *unaff_x19;
  long *unaff_x20;
  long unaff_x22;
  ulong uVar9;
  ulong uVar10;
  byte bVar11;
  undefined8 uVar12;
  undefined8 uVar13;
  long lStack0000000000000008;
  
  bVar5 = (byte)(param_1 >> 0x39);
  lVar4 = *unaff_x20;
  uVar2 = unaff_x20[1];
  uVar12 = *(undefined8 *)(unaff_x22 + 8);
  lVar6 = *(long *)(unaff_x22 + 0x10);
  param_1 = param_1 & uVar2;
  uVar13 = *(undefined8 *)(lVar4 + param_1);
  uVar10 = CONCAT17(-((byte)((ulong)uVar13 >> 0x38) == bVar5),
                    CONCAT16(-((byte)((ulong)uVar13 >> 0x30) == bVar5),
                             CONCAT15(-((byte)((ulong)uVar13 >> 0x28) == bVar5),
                                      CONCAT14(-((byte)((ulong)uVar13 >> 0x20) == bVar5),
                                               CONCAT13(-((byte)((ulong)uVar13 >> 0x18) == bVar5),
                                                        CONCAT12(-((byte)((ulong)uVar13 >> 0x10) ==
                                                                  bVar5),CONCAT11(-((byte)((ulong)
                                                  uVar13 >> 8) == bVar5),-((byte)uVar13 == bVar5))))
                                              ))));
  lStack0000000000000008 = in_x9;
  do {
    uVar10 = uVar10 & 0x8080808080808080;
    if (uVar10 != 0) {
      do {
        uVar9 = (uVar10 >> 7 & 0xff00ff00ff00ff00) >> 8 | (uVar10 >> 7 & 0xff00ff00ff00ff) << 8;
        uVar9 = (uVar9 & 0xffff0000ffff0000) >> 0x10 | (uVar9 & 0xffff0000ffff) << 0x10;
        uVar9 = param_1 + ((ulong)LZCOUNT(uVar9 >> 0x20 | uVar9 << 0x20) >> 3) & uVar2;
        lVar7 = lVar4 + -0x30 + uVar9 * -0x30;
        if ((lVar6 == *(long *)(lVar7 + 0x10)) &&
           (iVar3 = _memcmp(uVar12,*(undefined8 *)(lVar7 + 8),lVar6), iVar3 == 0)) {
          lVar6 = lVar4 + uVar9 * -0x30;
          lVar7 = ((long)(uVar9 * 0x30) >> 4) * -0x5555555555555555;
          puVar1 = (undefined8 *)(lVar4 + (lVar7 - 8U & uVar2));
          uVar12 = *puVar1;
          uVar13 = *(undefined8 *)(lVar4 + lVar7);
          uVar10 = CONCAT17(-((char)((ulong)uVar13 >> 0x38) == -1),
                            CONCAT16(-((char)((ulong)uVar13 >> 0x30) == -1),
                                     CONCAT15(-((char)((ulong)uVar13 >> 0x28) == -1),
                                              CONCAT14(-((char)((ulong)uVar13 >> 0x20) == -1),
                                                       CONCAT13(-((char)((ulong)uVar13 >> 0x18) ==
                                                                 -1),CONCAT12(-((char)((ulong)uVar13
                                                                                      >> 0x10) == -1
                                                                               ),CONCAT11(-((char)((
                                                  ulong)uVar13 >> 8) == -1),-((char)uVar13 == -1))))
                                                  ))));
          uVar10 = (uVar10 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar10 & 0x5555555555555555) << 1;
          uVar10 = (uVar10 & 0xcccccccccccccccc) >> 2 | (uVar10 & 0x3333333333333333) << 2;
          uVar10 = (uVar10 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar10 & 0xf0f0f0f0f0f0f0f) << 4;
          uVar10 = (uVar10 & 0xff00ff00ff00ff00) >> 8 | (uVar10 & 0xff00ff00ff00ff) << 8;
          uVar10 = (uVar10 & 0xffff0000ffff0000) >> 0x10 | (uVar10 & 0xffff0000ffff) << 0x10;
          if (((ulong)LZCOUNT(uVar10 >> 0x20 | uVar10 << 0x20) >> 3) +
              ((ulong)LZCOUNT(CONCAT17(-((char)((ulong)uVar12 >> 0x38) == -1),
                                       CONCAT16(-((char)((ulong)uVar12 >> 0x30) == -1),
                                                CONCAT15(-((char)((ulong)uVar12 >> 0x28) == -1),
                                                         CONCAT14(-((char)((ulong)uVar12 >> 0x20) ==
                                                                   -1),CONCAT13(-((char)((ulong)
                                                  uVar12 >> 0x18) == -1),
                                                  CONCAT12(-((char)((ulong)uVar12 >> 0x10) == -1),
                                                           CONCAT11(-((char)((ulong)uVar12 >> 8) ==
                                                                     -1),-((char)uVar12 == -1)))))))
                                      )) >> 3) < 8) {
            unaff_x20[2] = unaff_x20[2] + 1;
            uVar8 = 0xff;
          }
          else {
            uVar8 = 0x80;
          }
          *(undefined1 *)(lVar4 + lVar7) = uVar8;
          *(undefined1 *)(puVar1 + 1) = uVar8;
          unaff_x20[3] = unaff_x20[3] + -1;
          lVar4 = *(long *)(lVar6 + -0x30);
          if (lVar4 != -0x8000000000000000) {
            uVar12 = *(undefined8 *)(lVar6 + -0x28);
            uVar13 = *(undefined8 *)(lVar6 + -0x18);
            unaff_x19[1] = *(undefined8 *)(lVar6 + -0x10);
            *unaff_x19 = uVar13;
            unaff_x19[2] = *(undefined8 *)(lVar6 + -8);
            if (lVar4 == 0) {
              return;
            }
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
            (*(code *)PTR__free_00a24e58)(uVar12,lVar4,1);
            return;
          }
          goto LAB_00203908;
        }
        uVar10 = uVar10 - 1 & uVar10;
      } while (uVar10 != 0);
    }
    bVar11 = NEON_umaxv(CONCAT17(-((char)((ulong)uVar13 >> 0x38) == -1),
                                 CONCAT16(-((char)((ulong)uVar13 >> 0x30) == -1),
                                          CONCAT15(-((char)((ulong)uVar13 >> 0x28) == -1),
                                                   CONCAT14(-((char)((ulong)uVar13 >> 0x20) == -1),
                                                            CONCAT13(-((char)((ulong)uVar13 >> 0x18)
                                                                      == -1),CONCAT12(-((char)((
                                                  ulong)uVar13 >> 0x10) == -1),
                                                  CONCAT11(-((char)((ulong)uVar13 >> 8) == -1),
                                                           -((char)uVar13 == -1)))))))),1);
    if ((bVar11 & 1) != 0) {
LAB_00203908:
      *unaff_x19 = 0x8000000000000000;
      return;
    }
    lStack0000000000000008 = lStack0000000000000008 + 8;
    param_1 = param_1 + lStack0000000000000008 & uVar2;
    uVar13 = *(undefined8 *)(lVar4 + param_1);
    uVar10 = CONCAT17(-((byte)((ulong)uVar13 >> 0x38) == bVar5),
                      CONCAT16(-((byte)((ulong)uVar13 >> 0x30) == bVar5),
                               CONCAT15(-((byte)((ulong)uVar13 >> 0x28) == bVar5),
                                        CONCAT14(-((byte)((ulong)uVar13 >> 0x20) == bVar5),
                                                 CONCAT13(-((byte)((ulong)uVar13 >> 0x18) == bVar5),
                                                          CONCAT12(-((byte)((ulong)uVar13 >> 0x10)
                                                                    == bVar5),
                                                                   CONCAT11(-((byte)((ulong)uVar13
                                                                                    >> 8) == bVar5),
                                                                            -((byte)uVar13 == bVar5)
                                                                           )))))));
  } while( true );
}

