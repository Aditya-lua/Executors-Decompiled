
void FUN_0020582c(uint param_1)

{
  byte *pbVar1;
  byte bVar2;
  ulong uVar3;
  ulong uVar4;
  ulong uVar5;
  long lVar6;
  byte bVar7;
  long lVar8;
  long lVar9;
  ulong uVar10;
  undefined8 *unaff_x19;
  byte *unaff_x21;
  ulong *unaff_x25;
  ulong uVar11;
  byte bVar12;
  byte bVar13;
  undefined8 uVar14;
  undefined1 uStack0000000000000010;
  
  _uStack0000000000000010 = (ulong)(*(char *)(unaff_x19 + 1) != '\0');
  if (*(char *)(unaff_x19 + 1) == '\0') {
    if (unaff_x19[9] == 0) {
code_r0x00205758:
      _uStack0000000000000010 = 0x8000000000000000;
    }
    else {
      uVar3 = func_0x0023deb8(unaff_x19 + 10);
      lVar8 = unaff_x19[6];
      uVar5 = unaff_x19[7];
      bVar7 = (byte)(uVar3 >> 0x39);
      lVar6 = lVar8 + -0xd8;
      bVar2 = *unaff_x21;
      if ((bVar2 & 1) == 0) {
        lVar9 = 0;
        uVar3 = uVar3 & uVar5;
        uVar14 = *(undefined8 *)(lVar8 + uVar3);
        uVar11 = CONCAT17(-((byte)((ulong)uVar14 >> 0x38) == bVar7),
                          CONCAT16(-((byte)((ulong)uVar14 >> 0x30) == bVar7),
                                   CONCAT15(-((byte)((ulong)uVar14 >> 0x28) == bVar7),
                                            CONCAT14(-((byte)((ulong)uVar14 >> 0x20) == bVar7),
                                                     CONCAT13(-((byte)((ulong)uVar14 >> 0x18) ==
                                                               bVar7),CONCAT12(-((byte)((ulong)
                                                  uVar14 >> 0x10) == bVar7),
                                                  CONCAT11(-((byte)((ulong)uVar14 >> 8) == bVar7),
                                                           -((byte)uVar14 == bVar7))))))));
        while( true ) {
          uVar11 = uVar11 & 0x8080808080808080;
          if (uVar11 != 0) {
            do {
              uVar10 = (uVar11 >> 7 & 0xff00ff00ff00ff00) >> 8 |
                       (uVar11 >> 7 & 0xff00ff00ff00ff) << 8;
              uVar10 = (uVar10 & 0xffff0000ffff0000) >> 0x10 | (uVar10 & 0xffff0000ffff) << 0x10;
              uVar10 = uVar3 + ((ulong)LZCOUNT(uVar10 >> 0x20 | uVar10 << 0x20) >> 3) & uVar5;
              pbVar1 = (byte *)(lVar6 + uVar10 * -0xd8);
              if ((*pbVar1 == bVar2) &&
                 (uVar4 = func_0x003f0e88(unaff_x21 + 8,pbVar1 + 8), (uVar4 & 1) != 0)) {
                lVar6 = -uVar10;
                goto code_r0x00205770;
              }
              uVar11 = uVar11 - 1 & uVar11;
            } while (uVar11 != 0);
          }
          bVar12 = NEON_umaxv(CONCAT17(-((char)((ulong)uVar14 >> 0x38) == -1),
                                       CONCAT16(-((char)((ulong)uVar14 >> 0x30) == -1),
                                                CONCAT15(-((char)((ulong)uVar14 >> 0x28) == -1),
                                                         CONCAT14(-((char)((ulong)uVar14 >> 0x20) ==
                                                                   -1),CONCAT13(-((char)((ulong)
                                                  uVar14 >> 0x18) == -1),
                                                  CONCAT12(-((char)((ulong)uVar14 >> 0x10) == -1),
                                                           CONCAT11(-((char)((ulong)uVar14 >> 8) ==
                                                                     -1),-((char)uVar14 == -1)))))))
                                      ),1);
          if ((bVar12 & 1) != 0) break;
          lVar9 = lVar9 + 8;
          uVar3 = uVar3 + lVar9 & uVar5;
          uVar14 = *(undefined8 *)(lVar8 + uVar3);
          uVar11 = CONCAT17(-((byte)((ulong)uVar14 >> 0x38) == bVar7),
                            CONCAT16(-((byte)((ulong)uVar14 >> 0x30) == bVar7),
                                     CONCAT15(-((byte)((ulong)uVar14 >> 0x28) == bVar7),
                                              CONCAT14(-((byte)((ulong)uVar14 >> 0x20) == bVar7),
                                                       CONCAT13(-((byte)((ulong)uVar14 >> 0x18) ==
                                                                 bVar7),CONCAT12(-((byte)((ulong)
                                                  uVar14 >> 0x10) == bVar7),
                                                  CONCAT11(-((byte)((ulong)uVar14 >> 8) == bVar7),
                                                           -((byte)uVar14 == bVar7))))))));
        }
        goto code_r0x00205758;
      }
      bVar12 = unaff_x21[1];
      if ((bVar12 & 1) == 0) {
        lVar9 = 0;
        uVar3 = uVar3 & uVar5;
        uVar14 = *(undefined8 *)(lVar8 + uVar3);
        uVar11 = CONCAT17(-((byte)((ulong)uVar14 >> 0x38) == bVar7),
                          CONCAT16(-((byte)((ulong)uVar14 >> 0x30) == bVar7),
                                   CONCAT15(-((byte)((ulong)uVar14 >> 0x28) == bVar7),
                                            CONCAT14(-((byte)((ulong)uVar14 >> 0x20) == bVar7),
                                                     CONCAT13(-((byte)((ulong)uVar14 >> 0x18) ==
                                                               bVar7),CONCAT12(-((byte)((ulong)
                                                  uVar14 >> 0x10) == bVar7),
                                                  CONCAT11(-((byte)((ulong)uVar14 >> 8) == bVar7),
                                                           -((byte)uVar14 == bVar7)))))))) &
                 0x8080808080808080;
        while( true ) {
          while (uVar11 == 0) {
            bVar13 = NEON_umaxv(CONCAT17(-((char)((ulong)uVar14 >> 0x38) == -1),
                                         CONCAT16(-((char)((ulong)uVar14 >> 0x30) == -1),
                                                  CONCAT15(-((char)((ulong)uVar14 >> 0x28) == -1),
                                                           CONCAT14(-((char)((ulong)uVar14 >> 0x20)
                                                                     == -1),CONCAT13(-((char)((ulong
                                                  )uVar14 >> 0x18) == -1),
                                                  CONCAT12(-((char)((ulong)uVar14 >> 0x10) == -1),
                                                           CONCAT11(-((char)((ulong)uVar14 >> 8) ==
                                                                     -1),-((char)uVar14 == -1)))))))
                                        ),1);
            if ((bVar13 & 1) != 0) goto code_r0x00205758;
            lVar9 = lVar9 + 8;
            uVar3 = uVar3 + lVar9 & uVar5;
            uVar14 = *(undefined8 *)(lVar8 + uVar3);
            uVar11 = CONCAT17(-((byte)((ulong)uVar14 >> 0x38) == bVar7),
                              CONCAT16(-((byte)((ulong)uVar14 >> 0x30) == bVar7),
                                       CONCAT15(-((byte)((ulong)uVar14 >> 0x28) == bVar7),
                                                CONCAT14(-((byte)((ulong)uVar14 >> 0x20) == bVar7),
                                                         CONCAT13(-((byte)((ulong)uVar14 >> 0x18) ==
                                                                   bVar7),CONCAT12(-((byte)((ulong)
                                                  uVar14 >> 0x10) == bVar7),
                                                  CONCAT11(-((byte)((ulong)uVar14 >> 8) == bVar7),
                                                           -((byte)uVar14 == bVar7)))))))) &
                     0x8080808080808080;
          }
          uVar10 = (uVar11 >> 7 & 0xff00ff00ff00ff00) >> 8 | (uVar11 >> 7 & 0xff00ff00ff00ff) << 8;
          uVar10 = (uVar10 & 0xffff0000ffff0000) >> 0x10 | (uVar10 & 0xffff0000ffff) << 0x10;
          uVar10 = uVar3 + ((ulong)LZCOUNT(uVar10 >> 0x20 | uVar10 << 0x20) >> 3) & uVar5;
          pbVar1 = (byte *)(lVar6 + uVar10 * -0xd8);
          if (((*pbVar1 == bVar2) && (pbVar1[1] == bVar12)) &&
             (*(int *)(unaff_x21 + 2) == *(int *)(pbVar1 + 2))) break;
          uVar11 = uVar11 - 1 & uVar11;
        }
        lVar6 = -uVar10;
      }
      else {
        lVar9 = 0;
        uVar3 = uVar3 & uVar5;
        uVar14 = *(undefined8 *)(lVar8 + uVar3);
        uVar11 = CONCAT17(-((byte)((ulong)uVar14 >> 0x38) == bVar7),
                          CONCAT16(-((byte)((ulong)uVar14 >> 0x30) == bVar7),
                                   CONCAT15(-((byte)((ulong)uVar14 >> 0x28) == bVar7),
                                            CONCAT14(-((byte)((ulong)uVar14 >> 0x20) == bVar7),
                                                     CONCAT13(-((byte)((ulong)uVar14 >> 0x18) ==
                                                               bVar7),CONCAT12(-((byte)((ulong)
                                                  uVar14 >> 0x10) == bVar7),
                                                  CONCAT11(-((byte)((ulong)uVar14 >> 8) == bVar7),
                                                           -((byte)uVar14 == bVar7)))))))) &
                 0x8080808080808080;
        while( true ) {
          while (uVar11 == 0) {
            bVar13 = NEON_umaxv(CONCAT17(-((char)((ulong)uVar14 >> 0x38) == -1),
                                         CONCAT16(-((char)((ulong)uVar14 >> 0x30) == -1),
                                                  CONCAT15(-((char)((ulong)uVar14 >> 0x28) == -1),
                                                           CONCAT14(-((char)((ulong)uVar14 >> 0x20)
                                                                     == -1),CONCAT13(-((char)((ulong
                                                  )uVar14 >> 0x18) == -1),
                                                  CONCAT12(-((char)((ulong)uVar14 >> 0x10) == -1),
                                                           CONCAT11(-((char)((ulong)uVar14 >> 8) ==
                                                                     -1),-((char)uVar14 == -1)))))))
                                        ),1);
            if ((bVar13 & 1) != 0) goto code_r0x00205758;
            lVar9 = lVar9 + 8;
            uVar3 = uVar3 + lVar9 & uVar5;
            uVar14 = *(undefined8 *)(lVar8 + uVar3);
            uVar11 = CONCAT17(-((byte)((ulong)uVar14 >> 0x38) == bVar7),
                              CONCAT16(-((byte)((ulong)uVar14 >> 0x30) == bVar7),
                                       CONCAT15(-((byte)((ulong)uVar14 >> 0x28) == bVar7),
                                                CONCAT14(-((byte)((ulong)uVar14 >> 0x20) == bVar7),
                                                         CONCAT13(-((byte)((ulong)uVar14 >> 0x18) ==
                                                                   bVar7),CONCAT12(-((byte)((ulong)
                                                  uVar14 >> 0x10) == bVar7),
                                                  CONCAT11(-((byte)((ulong)uVar14 >> 8) == bVar7),
                                                           -((byte)uVar14 == bVar7)))))))) &
                     0x8080808080808080;
          }
          uVar10 = (uVar11 >> 7 & 0xff00ff00ff00ff00) >> 8 | (uVar11 >> 7 & 0xff00ff00ff00ff) << 8;
          uVar10 = (uVar10 & 0xffff0000ffff0000) >> 0x10 | (uVar10 & 0xffff0000ffff) << 0x10;
          uVar10 = uVar3 + ((ulong)LZCOUNT(uVar10 >> 0x20 | uVar10 << 0x20) >> 3) & uVar5;
          pbVar1 = (byte *)(lVar6 + uVar10 * -0xd8);
          if (((*pbVar1 == bVar2) && (pbVar1[1] == bVar12)) &&
             (*(long *)(unaff_x21 + 10) == *(long *)(pbVar1 + 10) &&
              *(long *)(unaff_x21 + 2) == *(long *)(pbVar1 + 2))) break;
          uVar11 = uVar11 - 1 & uVar11;
        }
        lVar6 = -uVar10;
      }
code_r0x00205770:
      lVar8 = lVar8 + lVar6 * 0xd8;
      _uStack0000000000000010 = *(ulong *)(lVar8 + -0x98);
      *(undefined8 *)(lVar8 + -0x98) = 0x8000000000000000;
      if (_uStack0000000000000010 != 0x8000000000000000) {
        func_0x00202858(&uStack0000000000000010);
      }
    }
    if ((((param_1 ^ 1) & 1) != 0) || ((*unaff_x25 & 0x7fffffffffffffff) == 0)) goto LAB_002057dc;
  }
  else {
    func_0x00202648(&uStack0000000000000010);
    func_0x007a23bc(&UNK_009c62c0);
  }
  uVar5 = func_0x007a1140();
  if ((uVar5 & 1) == 0) {
    *(undefined1 *)(unaff_x19 + 1) = 1;
  }
LAB_002057dc:
  func_0x00430048(*unaff_x19);
  return;
}

