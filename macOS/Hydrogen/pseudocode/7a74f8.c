
undefined8 FUN_007a74f8(void)

{
  char cVar1;
  byte bVar2;
  ulong uVar3;
  ulong uVar4;
  long *plVar5;
  ulong uVar6;
  ulong uVar7;
  ulong uVar8;
  long *plVar9;
  ulong uVar10;
  ulong uVar11;
  ulong unaff_x19;
  long *unaff_x20;
  long *unaff_x21;
  long unaff_x22;
  long lVar12;
  long lVar13;
  
  _memmove();
  if (unaff_x19 != 0) {
    uVar4 = 0;
    uVar6 = 1;
    do {
      plVar9 = unaff_x20;
      if (*(char *)((long)unaff_x20 + uVar4) == -0x80) {
        uVar7 = ~uVar4;
        plVar5 = unaff_x20;
        while( true ) {
          uVar8 = unaff_x21[1];
          uVar10 = uVar8 & plVar5[-1 - uVar4] * 0x517cc1b727220a95;
          lVar12 = *(long *)((long)plVar5 + uVar10);
          uVar11 = CONCAT17(-(lVar12 < 0),
                            CONCAT16(-((char)((ulong)lVar12 >> 0x30) < '\0'),
                                     CONCAT15(-((char)((ulong)lVar12 >> 0x28) < '\0'),
                                              CONCAT14(-((char)((ulong)lVar12 >> 0x20) < '\0'),
                                                       CONCAT13(-((char)((ulong)lVar12 >> 0x18) <
                                                                 '\0'),CONCAT12(-((char)((ulong)
                                                  lVar12 >> 0x10) < '\0'),
                                                  CONCAT11(-((char)((ulong)lVar12 >> 8) < '\0'),
                                                           -((char)lVar12 < '\0'))))))));
          uVar3 = uVar10;
          if (uVar11 == 0) {
            lVar12 = 8;
            do {
              uVar3 = uVar3 + lVar12 & uVar8;
              lVar13 = *(long *)((long)plVar5 + uVar3);
              uVar11 = CONCAT17(-(lVar13 < 0),
                                CONCAT16(-((char)((ulong)lVar13 >> 0x30) < '\0'),
                                         CONCAT15(-((char)((ulong)lVar13 >> 0x28) < '\0'),
                                                  CONCAT14(-((char)((ulong)lVar13 >> 0x20) < '\0'),
                                                           CONCAT13(-((char)((ulong)lVar13 >> 0x18)
                                                                     < '\0'),CONCAT12(-((char)((
                                                  ulong)lVar13 >> 0x10) < '\0'),
                                                  CONCAT11(-((char)((ulong)lVar13 >> 8) < '\0'),
                                                           -((char)lVar13 < '\0'))))))));
              lVar12 = lVar12 + 8;
            } while (uVar11 == 0);
          }
          uVar11 = (uVar11 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar11 & 0x5555555555555555) << 1;
          uVar11 = (uVar11 & 0xcccccccccccccccc) >> 2 | (uVar11 & 0x3333333333333333) << 2;
          uVar11 = (uVar11 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar11 & 0xf0f0f0f0f0f0f0f) << 4;
          uVar11 = (uVar11 & 0xff00ff00ff00ff00) >> 8 | (uVar11 & 0xff00ff00ff00ff) << 8;
          uVar11 = (uVar11 & 0xffff0000ffff0000) >> 0x10 | (uVar11 & 0xffff0000ffff) << 0x10;
          uVar3 = uVar3 + ((ulong)LZCOUNT(uVar11 >> 0x20 | uVar11 << 0x20) >> 3) & uVar8;
          bVar2 = (byte)((ulong)(plVar5[-1 - uVar4] * 0x517cc1b727220a95) >> 0x38);
          if (*(char *)((long)plVar5 + uVar3) < '\0') {
            uVar11 = uVar3 - uVar10 ^ uVar4 - uVar10;
          }
          else {
            lVar12 = *plVar5;
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
            uVar11 = uVar3 - uVar10 ^ uVar4 - uVar10;
          }
          if ((uVar11 & uVar8) < 8) {
            *(byte *)((long)plVar5 + uVar4) = bVar2 >> 1;
            plVar9 = (long *)*unaff_x21;
            *(byte *)((long)plVar9 + (uVar8 & uVar4 - 8) + 8) = bVar2 >> 1;
            goto code_r0x007a7200;
          }
          uVar11 = ~uVar3;
          cVar1 = *(char *)((long)plVar5 + uVar3);
          *(byte *)((long)plVar5 + uVar3) = bVar2 >> 1;
          plVar9 = (long *)*unaff_x21;
          *(byte *)((long)plVar9 + (uVar3 - 8 & uVar8) + 8) = bVar2 >> 1;
          if (cVar1 == -1) break;
          lVar12 = unaff_x20[uVar7];
          unaff_x20[uVar7] = plVar5[uVar11];
          plVar5[uVar11] = lVar12;
          plVar5 = (long *)*unaff_x21;
        }
        uVar3 = unaff_x21[1];
        *(undefined1 *)((long)plVar9 + uVar4) = 0xff;
        *(undefined1 *)((long)plVar9 + (uVar3 & uVar4 - 8) + 8) = 0xff;
        plVar5[uVar11] = unaff_x20[uVar7];
      }
code_r0x007a7200:
      if (unaff_x19 <= uVar6) goto code_r0x007a7258;
      uVar4 = uVar6;
      uVar6 = uVar6 + 1;
      unaff_x20 = plVar9;
    } while( true );
  }
  uVar4 = 0;
LAB_007a7278:
  unaff_x21[2] = uVar4 - unaff_x22;
  return 0x8000000000000001;
code_r0x007a7258:
  uVar4 = unaff_x21[1];
  if (7 < uVar4) {
    uVar4 = (uVar4 + 1 >> 3) * 7;
  }
  unaff_x22 = unaff_x21[3];
  goto LAB_007a7278;
}

