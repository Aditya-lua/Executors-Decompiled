
undefined8 FUN_007a8f20(long *param_1)

{
  char cVar1;
  byte bVar2;
  ulong uVar3;
  ulong uVar4;
  ulong uVar5;
  long *plVar6;
  ulong uVar7;
  ulong uVar8;
  ulong uVar9;
  ulong uVar10;
  long *plVar11;
  ulong unaff_x19;
  long *unaff_x20;
  long unaff_x22;
  long lVar12;
  long lVar13;
  long lVar14;
  long lVar15;
  
  _memmove(unaff_x20 + 1);
  if (unaff_x19 != 0) {
    uVar4 = 0;
    uVar5 = 1;
    do {
      if (*(char *)((long)unaff_x20 + uVar4) == -0x80) {
        plVar6 = unaff_x20 + ~uVar4 * 5;
        while( true ) {
          uVar8 = (unaff_x20[uVar4 * -5 + -5] + 8) * 0x517cc1b727220a95;
          uVar7 = param_1[1];
          uVar9 = uVar8 & uVar7;
          lVar12 = *(long *)((long)unaff_x20 + uVar9);
          uVar10 = CONCAT17(-(lVar12 < 0),
                            CONCAT16(-((char)((ulong)lVar12 >> 0x30) < '\0'),
                                     CONCAT15(-((char)((ulong)lVar12 >> 0x28) < '\0'),
                                              CONCAT14(-((char)((ulong)lVar12 >> 0x20) < '\0'),
                                                       CONCAT13(-((char)((ulong)lVar12 >> 0x18) <
                                                                 '\0'),CONCAT12(-((char)((ulong)
                                                  lVar12 >> 0x10) < '\0'),
                                                  CONCAT11(-((char)((ulong)lVar12 >> 8) < '\0'),
                                                           -((char)lVar12 < '\0'))))))));
          uVar3 = uVar9;
          if (uVar10 == 0) {
            lVar12 = 8;
            do {
              uVar3 = uVar3 + lVar12 & uVar7;
              lVar13 = *(long *)((long)unaff_x20 + uVar3);
              uVar10 = CONCAT17(-(lVar13 < 0),
                                CONCAT16(-((char)((ulong)lVar13 >> 0x30) < '\0'),
                                         CONCAT15(-((char)((ulong)lVar13 >> 0x28) < '\0'),
                                                  CONCAT14(-((char)((ulong)lVar13 >> 0x20) < '\0'),
                                                           CONCAT13(-((char)((ulong)lVar13 >> 0x18)
                                                                     < '\0'),CONCAT12(-((char)((
                                                  ulong)lVar13 >> 0x10) < '\0'),
                                                  CONCAT11(-((char)((ulong)lVar13 >> 8) < '\0'),
                                                           -((char)lVar13 < '\0'))))))));
              lVar12 = lVar12 + 8;
            } while (uVar10 == 0);
          }
          uVar10 = (uVar10 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar10 & 0x5555555555555555) << 1;
          uVar10 = (uVar10 & 0xcccccccccccccccc) >> 2 | (uVar10 & 0x3333333333333333) << 2;
          uVar10 = (uVar10 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar10 & 0xf0f0f0f0f0f0f0f) << 4;
          uVar10 = (uVar10 & 0xff00ff00ff00ff00) >> 8 | (uVar10 & 0xff00ff00ff00ff) << 8;
          uVar10 = (uVar10 & 0xffff0000ffff0000) >> 0x10 | (uVar10 & 0xffff0000ffff) << 0x10;
          uVar3 = uVar3 + ((ulong)LZCOUNT(uVar10 >> 0x20 | uVar10 << 0x20) >> 3) & uVar7;
          bVar2 = (byte)(uVar8 >> 0x38);
          if (*(char *)((long)unaff_x20 + uVar3) < '\0') {
            uVar10 = uVar3 - uVar9 ^ uVar4 - uVar9;
          }
          else {
            lVar12 = *unaff_x20;
            uVar3 = CONCAT17(-(lVar12 < 0),
                             CONCAT16(-((char)((ulong)lVar12 >> 0x30) < '\0'),
                                      CONCAT15(-((char)((ulong)lVar12 >> 0x28) < '\0'),
                                               CONCAT14(-((char)((ulong)lVar12 >> 0x20) < '\0'),
                                                        CONCAT13(-((char)((ulong)lVar12 >> 0x18) <
                                                                  '\0'),CONCAT12(-((char)((ulong)
                                                  lVar12 >> 0x10) < '\0'),
                                                  CONCAT11(-((char)((ulong)lVar12 >> 8) < '\0'),
                                                           -((char)lVar12 < '\0'))))))));
            uVar3 = (uVar3 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar3 & 0x5555555555555555) << 1;
            uVar3 = (uVar3 & 0xcccccccccccccccc) >> 2 | (uVar3 & 0x3333333333333333) << 2;
            uVar3 = (uVar3 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar3 & 0xf0f0f0f0f0f0f0f) << 4;
            uVar3 = (uVar3 & 0xff00ff00ff00ff00) >> 8 | (uVar3 & 0xff00ff00ff00ff) << 8;
            uVar3 = (uVar3 & 0xffff0000ffff0000) >> 0x10 | (uVar3 & 0xffff0000ffff) << 0x10;
            uVar3 = (ulong)LZCOUNT(uVar3 >> 0x20 | uVar3 << 0x20) >> 3;
            uVar10 = uVar3 - uVar9 ^ uVar4 - uVar9;
          }
          if ((uVar10 & uVar7) < 8) {
            *(byte *)((long)unaff_x20 + uVar4) = bVar2 >> 1;
            unaff_x20 = (long *)*param_1;
            *(byte *)((long)unaff_x20 + (uVar7 & uVar4 - 8) + 8) = bVar2 >> 1;
            goto code_r0x007a8c0c;
          }
          plVar11 = unaff_x20 + ~uVar3 * 5;
          cVar1 = *(char *)((long)unaff_x20 + uVar3);
          *(byte *)((long)unaff_x20 + uVar3) = bVar2 >> 1;
          unaff_x20 = (long *)*param_1;
          *(byte *)((long)unaff_x20 + (uVar3 - 8 & uVar7) + 8) = bVar2 >> 1;
          if (cVar1 == -1) break;
          lVar12 = *plVar6;
          *plVar6 = *plVar11;
          *plVar11 = lVar12;
          lVar12 = plVar6[1];
          plVar6[1] = plVar11[1];
          plVar11[1] = lVar12;
          lVar12 = plVar6[2];
          plVar6[2] = plVar11[2];
          plVar11[2] = lVar12;
          lVar12 = plVar6[3];
          plVar6[3] = plVar11[3];
          plVar11[3] = lVar12;
          lVar12 = plVar6[4];
          plVar6[4] = plVar11[4];
          plVar11[4] = lVar12;
          unaff_x20 = (long *)*param_1;
        }
        uVar3 = param_1[1];
        *(undefined1 *)((long)unaff_x20 + uVar4) = 0xff;
        *(undefined1 *)((long)unaff_x20 + (uVar3 & uVar4 - 8) + 8) = 0xff;
        lVar13 = plVar6[1];
        lVar12 = *plVar6;
        lVar15 = plVar6[3];
        lVar14 = plVar6[2];
        plVar11[4] = plVar6[4];
        plVar11[1] = lVar13;
        *plVar11 = lVar12;
        plVar11[3] = lVar15;
        plVar11[2] = lVar14;
      }
code_r0x007a8c0c:
      if (unaff_x19 <= uVar5) goto code_r0x007a8c68;
      uVar4 = uVar5;
      uVar5 = uVar5 + 1;
    } while( true );
  }
  uVar4 = 0;
LAB_007a8c88:
  param_1[2] = uVar4 - unaff_x22;
  return 0x8000000000000001;
code_r0x007a8c68:
  uVar4 = param_1[1];
  if (7 < uVar4) {
    uVar4 = (uVar4 + 1 >> 3) * 7;
  }
  unaff_x22 = param_1[3];
  goto LAB_007a8c88;
}

