
undefined8 FUN_007a9428(void)

{
  undefined4 uVar1;
  char cVar2;
  byte bVar3;
  ulong uVar4;
  ulong uVar5;
  long *plVar6;
  ulong uVar7;
  ulong uVar8;
  ulong uVar9;
  long *plVar10;
  ulong uVar11;
  ulong uVar12;
  ulong uVar13;
  ulong unaff_x19;
  long *unaff_x20;
  long *unaff_x21;
  long unaff_x22;
  long lVar14;
  long lVar15;
  
  _memmove();
  if (unaff_x19 != 0) {
    uVar5 = 0;
    uVar7 = 1;
    do {
      plVar10 = unaff_x20;
      if (*(char *)((long)unaff_x20 + uVar5) == -0x80) {
        uVar8 = ~uVar5;
        plVar6 = unaff_x20;
        while( true ) {
          uVar11 = (ulong)*(uint *)((long)plVar6 + uVar5 * -4 + -4) * 0x517cc1b727220a95;
          uVar9 = unaff_x21[1];
          uVar12 = uVar11 & uVar9;
          lVar14 = *(long *)((long)plVar6 + uVar12);
          uVar13 = CONCAT17(-(lVar14 < 0),
                            CONCAT16(-((char)((ulong)lVar14 >> 0x30) < '\0'),
                                     CONCAT15(-((char)((ulong)lVar14 >> 0x28) < '\0'),
                                              CONCAT14(-((char)((ulong)lVar14 >> 0x20) < '\0'),
                                                       CONCAT13(-((char)((ulong)lVar14 >> 0x18) <
                                                                 '\0'),CONCAT12(-((char)((ulong)
                                                  lVar14 >> 0x10) < '\0'),
                                                  CONCAT11(-((char)((ulong)lVar14 >> 8) < '\0'),
                                                           -((char)lVar14 < '\0'))))))));
          uVar4 = uVar12;
          if (uVar13 == 0) {
            lVar14 = 8;
            do {
              uVar4 = uVar4 + lVar14 & uVar9;
              lVar15 = *(long *)((long)plVar6 + uVar4);
              uVar13 = CONCAT17(-(lVar15 < 0),
                                CONCAT16(-((char)((ulong)lVar15 >> 0x30) < '\0'),
                                         CONCAT15(-((char)((ulong)lVar15 >> 0x28) < '\0'),
                                                  CONCAT14(-((char)((ulong)lVar15 >> 0x20) < '\0'),
                                                           CONCAT13(-((char)((ulong)lVar15 >> 0x18)
                                                                     < '\0'),CONCAT12(-((char)((
                                                  ulong)lVar15 >> 0x10) < '\0'),
                                                  CONCAT11(-((char)((ulong)lVar15 >> 8) < '\0'),
                                                           -((char)lVar15 < '\0'))))))));
              lVar14 = lVar14 + 8;
            } while (uVar13 == 0);
          }
          uVar13 = (uVar13 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar13 & 0x5555555555555555) << 1;
          uVar13 = (uVar13 & 0xcccccccccccccccc) >> 2 | (uVar13 & 0x3333333333333333) << 2;
          uVar13 = (uVar13 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar13 & 0xf0f0f0f0f0f0f0f) << 4;
          uVar13 = (uVar13 & 0xff00ff00ff00ff00) >> 8 | (uVar13 & 0xff00ff00ff00ff) << 8;
          uVar13 = (uVar13 & 0xffff0000ffff0000) >> 0x10 | (uVar13 & 0xffff0000ffff) << 0x10;
          uVar4 = uVar4 + ((ulong)LZCOUNT(uVar13 >> 0x20 | uVar13 << 0x20) >> 3) & uVar9;
          bVar3 = (byte)(uVar11 >> 0x38);
          if (*(char *)((long)plVar6 + uVar4) < '\0') {
            uVar13 = uVar4 - uVar12 ^ uVar5 - uVar12;
          }
          else {
            lVar14 = *plVar6;
            uVar4 = CONCAT17(-(lVar14 < 0),
                             CONCAT16(-((char)((ulong)lVar14 >> 0x30) < '\0'),
                                      CONCAT15(-((char)((ulong)lVar14 >> 0x28) < '\0'),
                                               CONCAT14(-((char)((ulong)lVar14 >> 0x20) < '\0'),
                                                        CONCAT13(-((char)((ulong)lVar14 >> 0x18) <
                                                                  '\0'),CONCAT12(-((char)((ulong)
                                                  lVar14 >> 0x10) < '\0'),
                                                  CONCAT11(-((char)((ulong)lVar14 >> 8) < '\0'),
                                                           -((char)lVar14 < '\0'))))))));
            uVar4 = (uVar4 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar4 & 0x5555555555555555) << 1;
            uVar4 = (uVar4 & 0xcccccccccccccccc) >> 2 | (uVar4 & 0x3333333333333333) << 2;
            uVar4 = (uVar4 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar4 & 0xf0f0f0f0f0f0f0f) << 4;
            uVar4 = (uVar4 & 0xff00ff00ff00ff00) >> 8 | (uVar4 & 0xff00ff00ff00ff) << 8;
            uVar4 = (uVar4 & 0xffff0000ffff0000) >> 0x10 | (uVar4 & 0xffff0000ffff) << 0x10;
            uVar4 = (ulong)LZCOUNT(uVar4 >> 0x20 | uVar4 << 0x20) >> 3;
            uVar13 = uVar4 - uVar12 ^ uVar5 - uVar12;
          }
          if ((uVar13 & uVar9) < 8) {
            *(byte *)((long)plVar6 + uVar5) = bVar3 >> 1;
            plVar10 = (long *)*unaff_x21;
            *(byte *)((long)plVar10 + (uVar9 & uVar5 - 8) + 8) = bVar3 >> 1;
            goto code_r0x007a9128;
          }
          uVar13 = ~uVar4;
          cVar2 = *(char *)((long)plVar6 + uVar4);
          *(byte *)((long)plVar6 + uVar4) = bVar3 >> 1;
          plVar10 = (long *)*unaff_x21;
          *(byte *)((long)plVar10 + (uVar4 - 8 & uVar9) + 8) = bVar3 >> 1;
          if (cVar2 == -1) break;
          uVar1 = *(undefined4 *)((long)unaff_x20 + uVar8 * 4);
          *(undefined4 *)((long)unaff_x20 + uVar8 * 4) = *(undefined4 *)((long)plVar6 + uVar13 * 4);
          *(undefined4 *)((long)plVar6 + uVar13 * 4) = uVar1;
          plVar6 = (long *)*unaff_x21;
        }
        uVar4 = unaff_x21[1];
        *(undefined1 *)((long)plVar10 + uVar5) = 0xff;
        *(undefined1 *)((long)plVar10 + (uVar4 & uVar5 - 8) + 8) = 0xff;
        *(undefined4 *)((long)plVar6 + uVar13 * 4) = *(undefined4 *)((long)unaff_x20 + uVar8 * 4);
      }
code_r0x007a9128:
      if (unaff_x19 <= uVar7) goto code_r0x007a9180;
      uVar5 = uVar7;
      uVar7 = uVar7 + 1;
      unaff_x20 = plVar10;
    } while( true );
  }
  uVar5 = 0;
LAB_007a91a0:
  unaff_x21[2] = uVar5 - unaff_x22;
  return 0x8000000000000001;
code_r0x007a9180:
  uVar5 = unaff_x21[1];
  if (7 < uVar5) {
    uVar5 = (uVar5 + 1 >> 3) * 7;
  }
  unaff_x22 = unaff_x21[3];
  goto LAB_007a91a0;
}

