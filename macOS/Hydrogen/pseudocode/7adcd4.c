
undefined8 FUN_007adcd4(undefined8 *param_1)

{
  ulong *puVar1;
  char cVar2;
  byte bVar3;
  bool in_ZR;
  long in_x9;
  ulong *puVar4;
  ulong uVar5;
  ulong uVar6;
  ulong uVar7;
  ulong uVar8;
  ulong uVar9;
  ulong uVar10;
  ulong unaff_x19;
  ulong *unaff_x20;
  long unaff_x22;
  long lVar11;
  long lVar12;
  ulong uVar13;
  
  if (!in_ZR) {
    in_x9 = in_x9 + 1;
  }
  if (in_x9 != 0) {
    puVar4 = unaff_x20;
    do {
      uVar13 = *puVar4;
      *puVar4 = CONCAT17(-((long)uVar13 < 0),
                         CONCAT16(-((char)(uVar13 >> 0x30) < '\0'),
                                  CONCAT15(-((char)(uVar13 >> 0x28) < '\0'),
                                           CONCAT14(-((char)(uVar13 >> 0x20) < '\0'),
                                                    CONCAT13(-((char)(uVar13 >> 0x18) < '\0'),
                                                             CONCAT12(-((char)(uVar13 >> 0x10) <
                                                                       '\0'),CONCAT11(-((char)(
                                                  uVar13 >> 8) < '\0'),-((char)uVar13 < '\0'))))))))
                | 0x8080808080808080;
      in_x9 = in_x9 + -1;
      puVar4 = puVar4 + 1;
    } while (in_x9 != 0);
  }
  if (unaff_x19 < 8) {
    _memmove(unaff_x20 + 1);
    if (unaff_x19 == 0) {
      uVar13 = 0;
      goto LAB_007adec4;
    }
  }
  else {
    *(ulong *)((long)unaff_x20 + unaff_x19) = *unaff_x20;
  }
  uVar13 = 0;
  uVar5 = 1;
  do {
    if (*(char *)((long)unaff_x20 + uVar13) == -0x80) {
      puVar4 = unaff_x20 + ~uVar13 * 2;
      while( true ) {
        uVar7 = (ulong)(uint)unaff_x20[uVar13 * -2 + -2] * 0x517cc1b727220a95;
        uVar6 = param_1[1];
        uVar8 = uVar7 & uVar6;
        lVar11 = *(long *)((long)unaff_x20 + uVar8);
        uVar9 = CONCAT17(-(lVar11 < 0),
                         CONCAT16(-((char)((ulong)lVar11 >> 0x30) < '\0'),
                                  CONCAT15(-((char)((ulong)lVar11 >> 0x28) < '\0'),
                                           CONCAT14(-((char)((ulong)lVar11 >> 0x20) < '\0'),
                                                    CONCAT13(-((char)((ulong)lVar11 >> 0x18) < '\0')
                                                             ,CONCAT12(-((char)((ulong)lVar11 >>
                                                                               0x10) < '\0'),
                                                                       CONCAT11(-((char)((ulong)
                                                  lVar11 >> 8) < '\0'),-((char)lVar11 < '\0'))))))))
        ;
        uVar10 = uVar8;
        if (uVar9 == 0) {
          lVar11 = 8;
          do {
            uVar10 = uVar10 + lVar11 & uVar6;
            lVar12 = *(long *)((long)unaff_x20 + uVar10);
            uVar9 = CONCAT17(-(lVar12 < 0),
                             CONCAT16(-((char)((ulong)lVar12 >> 0x30) < '\0'),
                                      CONCAT15(-((char)((ulong)lVar12 >> 0x28) < '\0'),
                                               CONCAT14(-((char)((ulong)lVar12 >> 0x20) < '\0'),
                                                        CONCAT13(-((char)((ulong)lVar12 >> 0x18) <
                                                                  '\0'),CONCAT12(-((char)((ulong)
                                                  lVar12 >> 0x10) < '\0'),
                                                  CONCAT11(-((char)((ulong)lVar12 >> 8) < '\0'),
                                                           -((char)lVar12 < '\0'))))))));
            lVar11 = lVar11 + 8;
          } while (uVar9 == 0);
        }
        uVar9 = (uVar9 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar9 & 0x5555555555555555) << 1;
        uVar9 = (uVar9 & 0xcccccccccccccccc) >> 2 | (uVar9 & 0x3333333333333333) << 2;
        uVar9 = (uVar9 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar9 & 0xf0f0f0f0f0f0f0f) << 4;
        uVar9 = (uVar9 & 0xff00ff00ff00ff00) >> 8 | (uVar9 & 0xff00ff00ff00ff) << 8;
        uVar9 = (uVar9 & 0xffff0000ffff0000) >> 0x10 | (uVar9 & 0xffff0000ffff) << 0x10;
        uVar10 = uVar10 + ((ulong)LZCOUNT(uVar9 >> 0x20 | uVar9 << 0x20) >> 3) & uVar6;
        bVar3 = (byte)(uVar7 >> 0x38);
        if (*(char *)((long)unaff_x20 + uVar10) < '\0') {
          uVar9 = uVar10 - uVar8 ^ uVar13 - uVar8;
        }
        else {
          uVar10 = *unaff_x20;
          uVar10 = CONCAT17(-((long)uVar10 < 0),
                            CONCAT16(-((char)(uVar10 >> 0x30) < '\0'),
                                     CONCAT15(-((char)(uVar10 >> 0x28) < '\0'),
                                              CONCAT14(-((char)(uVar10 >> 0x20) < '\0'),
                                                       CONCAT13(-((char)(uVar10 >> 0x18) < '\0'),
                                                                CONCAT12(-((char)(uVar10 >> 0x10) <
                                                                          '\0'),CONCAT11(-((char)(
                                                  uVar10 >> 8) < '\0'),-((char)uVar10 < '\0'))))))))
          ;
          uVar10 = (uVar10 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar10 & 0x5555555555555555) << 1;
          uVar10 = (uVar10 & 0xcccccccccccccccc) >> 2 | (uVar10 & 0x3333333333333333) << 2;
          uVar10 = (uVar10 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar10 & 0xf0f0f0f0f0f0f0f) << 4;
          uVar10 = (uVar10 & 0xff00ff00ff00ff00) >> 8 | (uVar10 & 0xff00ff00ff00ff) << 8;
          uVar10 = (uVar10 & 0xffff0000ffff0000) >> 0x10 | (uVar10 & 0xffff0000ffff) << 0x10;
          uVar10 = (ulong)LZCOUNT(uVar10 >> 0x20 | uVar10 << 0x20) >> 3;
          uVar9 = uVar10 - uVar8 ^ uVar13 - uVar8;
        }
        if ((uVar9 & uVar6) < 8) {
          *(byte *)((long)unaff_x20 + uVar13) = bVar3 >> 1;
          unaff_x20 = (ulong *)*param_1;
          *(byte *)((long)unaff_x20 + (uVar6 & uVar13 - 8) + 8) = bVar3 >> 1;
          goto LAB_007ade50;
        }
        puVar1 = unaff_x20 + ~uVar10 * 2;
        cVar2 = *(char *)((long)unaff_x20 + uVar10);
        *(byte *)((long)unaff_x20 + uVar10) = bVar3 >> 1;
        unaff_x20 = (ulong *)*param_1;
        *(byte *)((long)unaff_x20 + (uVar10 - 8 & uVar6) + 8) = bVar3 >> 1;
        if (cVar2 == -1) break;
        uVar10 = *puVar4;
        *puVar4 = *puVar1;
        *puVar1 = uVar10;
        uVar10 = puVar4[1];
        puVar4[1] = puVar1[1];
        puVar1[1] = uVar10;
        unaff_x20 = (ulong *)*param_1;
      }
      uVar10 = param_1[1];
      *(undefined1 *)((long)unaff_x20 + uVar13) = 0xff;
      *(undefined1 *)((long)unaff_x20 + (uVar10 & uVar13 - 8) + 8) = 0xff;
      uVar13 = *puVar4;
      puVar1[1] = puVar4[1];
      *puVar1 = uVar13;
    }
LAB_007ade50:
    if (unaff_x19 <= uVar5) break;
    uVar13 = uVar5;
    uVar5 = uVar5 + 1;
  } while( true );
  uVar13 = param_1[1];
  if (7 < uVar13) {
    uVar13 = (uVar13 + 1 >> 3) * 7;
  }
  unaff_x22 = param_1[3];
LAB_007adec4:
  param_1[2] = uVar13 - unaff_x22;
  return 0x8000000000000001;
}

