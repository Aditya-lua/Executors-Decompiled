
undefined8 FUN_007abaec(void)

{
  long *plVar1;
  long *plVar2;
  char cVar3;
  byte bVar4;
  ulong uVar5;
  ulong uVar6;
  ulong uVar7;
  ulong uVar8;
  ulong uVar9;
  ulong uVar10;
  ulong unaff_x19;
  long *unaff_x20;
  long *unaff_x21;
  long unaff_x22;
  long lVar11;
  long lVar12;
  
  _memmove();
  if (unaff_x19 != 0) {
    uVar5 = 0;
    uVar6 = 1;
    do {
      if (*(char *)((long)unaff_x20 + uVar5) == -0x80) {
        plVar2 = unaff_x20 + ~uVar5 * 2;
        while( true ) {
          uVar7 = unaff_x21[1];
          uVar8 = (ulong)*(uint *)(unaff_x20 + uVar5 * -2 + -2) * 0x517cc1b727220a95 & uVar7;
          lVar11 = *(long *)((long)unaff_x20 + uVar8);
          uVar9 = CONCAT17(-(lVar11 < 0),
                           CONCAT16(-((char)((ulong)lVar11 >> 0x30) < '\0'),
                                    CONCAT15(-((char)((ulong)lVar11 >> 0x28) < '\0'),
                                             CONCAT14(-((char)((ulong)lVar11 >> 0x20) < '\0'),
                                                      CONCAT13(-((char)((ulong)lVar11 >> 0x18) <
                                                                '\0'),CONCAT12(-((char)((ulong)
                                                  lVar11 >> 0x10) < '\0'),
                                                  CONCAT11(-((char)((ulong)lVar11 >> 8) < '\0'),
                                                           -((char)lVar11 < '\0'))))))));
          uVar10 = uVar8;
          if (uVar9 == 0) {
            lVar11 = 8;
            do {
              uVar10 = uVar10 + lVar11 & uVar7;
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
          uVar10 = uVar10 + ((ulong)LZCOUNT(uVar9 >> 0x20 | uVar9 << 0x20) >> 3) & uVar7;
          bVar4 = (byte)((ulong)*(uint *)(unaff_x20 + uVar5 * -2 + -2) * 0x517cc1b727220a95 >> 0x38)
          ;
          if (*(char *)((long)unaff_x20 + uVar10) < '\0') {
            uVar9 = uVar10 - uVar8 ^ uVar5 - uVar8;
          }
          else {
            lVar11 = *unaff_x20;
            uVar10 = CONCAT17(-(lVar11 < 0),
                              CONCAT16(-((char)((ulong)lVar11 >> 0x30) < '\0'),
                                       CONCAT15(-((char)((ulong)lVar11 >> 0x28) < '\0'),
                                                CONCAT14(-((char)((ulong)lVar11 >> 0x20) < '\0'),
                                                         CONCAT13(-((char)((ulong)lVar11 >> 0x18) <
                                                                   '\0'),CONCAT12(-((char)((ulong)
                                                  lVar11 >> 0x10) < '\0'),
                                                  CONCAT11(-((char)((ulong)lVar11 >> 8) < '\0'),
                                                           -((char)lVar11 < '\0'))))))));
            uVar10 = (uVar10 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar10 & 0x5555555555555555) << 1;
            uVar10 = (uVar10 & 0xcccccccccccccccc) >> 2 | (uVar10 & 0x3333333333333333) << 2;
            uVar10 = (uVar10 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar10 & 0xf0f0f0f0f0f0f0f) << 4;
            uVar10 = (uVar10 & 0xff00ff00ff00ff00) >> 8 | (uVar10 & 0xff00ff00ff00ff) << 8;
            uVar10 = (uVar10 & 0xffff0000ffff0000) >> 0x10 | (uVar10 & 0xffff0000ffff) << 0x10;
            uVar10 = (ulong)LZCOUNT(uVar10 >> 0x20 | uVar10 << 0x20) >> 3;
            uVar9 = uVar10 - uVar8 ^ uVar5 - uVar8;
          }
          if ((uVar9 & uVar7) < 8) {
            *(byte *)((long)unaff_x20 + uVar5) = bVar4 >> 1;
            unaff_x20 = (long *)*unaff_x21;
            *(byte *)((long)unaff_x20 + (uVar7 & uVar5 - 8) + 8) = bVar4 >> 1;
            goto code_r0x007ab7f8;
          }
          plVar1 = unaff_x20 + ~uVar10 * 2;
          cVar3 = *(char *)((long)unaff_x20 + uVar10);
          *(byte *)((long)unaff_x20 + uVar10) = bVar4 >> 1;
          unaff_x20 = (long *)*unaff_x21;
          *(byte *)((long)unaff_x20 + (uVar10 - 8 & uVar7) + 8) = bVar4 >> 1;
          if (cVar3 == -1) break;
          lVar11 = *plVar2;
          *plVar2 = *plVar1;
          *plVar1 = lVar11;
          lVar11 = plVar2[1];
          plVar2[1] = plVar1[1];
          plVar1[1] = lVar11;
          unaff_x20 = (long *)*unaff_x21;
        }
        uVar10 = unaff_x21[1];
        *(undefined1 *)((long)unaff_x20 + uVar5) = 0xff;
        *(undefined1 *)((long)unaff_x20 + (uVar10 & uVar5 - 8) + 8) = 0xff;
        lVar11 = *plVar2;
        plVar1[1] = plVar2[1];
        *plVar1 = lVar11;
      }
code_r0x007ab7f8:
      if (unaff_x19 <= uVar6) goto code_r0x007ab84c;
      uVar5 = uVar6;
      uVar6 = uVar6 + 1;
    } while( true );
  }
  uVar5 = 0;
LAB_007ab86c:
  unaff_x21[2] = uVar5 - unaff_x22;
  return 0x8000000000000001;
code_r0x007ab84c:
  uVar5 = unaff_x21[1];
  if (7 < uVar5) {
    uVar5 = (uVar5 + 1 >> 3) * 7;
  }
  unaff_x22 = unaff_x21[3];
  goto LAB_007ab86c;
}

