
undefined8 FUN_007ad7d0(undefined8 *param_1)

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
  ulong uVar11;
  ulong unaff_x19;
  long *unaff_x20;
  long lVar12;
  long lVar13;
  long lVar14;
  
  *(long *)((long)unaff_x20 + unaff_x19) = *unaff_x20;
  uVar5 = 0;
  uVar6 = 1;
  do {
    if (*(char *)((long)unaff_x20 + uVar5) == -0x80) {
      plVar2 = unaff_x20 + ~uVar5 * 4;
      while( true ) {
        uVar8 = (unaff_x20[uVar5 * -4 + -4] + 8) * 0x517cc1b727220a95;
        uVar7 = param_1[1];
        uVar9 = uVar8 & uVar7;
        lVar12 = *(long *)((long)unaff_x20 + uVar9);
        uVar10 = CONCAT17(-(lVar12 < 0),
                          CONCAT16(-((char)((ulong)lVar12 >> 0x30) < '\0'),
                                   CONCAT15(-((char)((ulong)lVar12 >> 0x28) < '\0'),
                                            CONCAT14(-((char)((ulong)lVar12 >> 0x20) < '\0'),
                                                     CONCAT13(-((char)((ulong)lVar12 >> 0x18) < '\0'
                                                               ),CONCAT12(-((char)((ulong)lVar12 >>
                                                                                  0x10) < '\0'),
                                                                          CONCAT11(-((char)((ulong)
                                                  lVar12 >> 8) < '\0'),-((char)lVar12 < '\0'))))))))
        ;
        uVar11 = uVar9;
        if (uVar10 == 0) {
          lVar12 = 8;
          do {
            uVar11 = uVar11 + lVar12 & uVar7;
            lVar13 = *(long *)((long)unaff_x20 + uVar11);
            uVar10 = CONCAT17(-(lVar13 < 0),
                              CONCAT16(-((char)((ulong)lVar13 >> 0x30) < '\0'),
                                       CONCAT15(-((char)((ulong)lVar13 >> 0x28) < '\0'),
                                                CONCAT14(-((char)((ulong)lVar13 >> 0x20) < '\0'),
                                                         CONCAT13(-((char)((ulong)lVar13 >> 0x18) <
                                                                   '\0'),CONCAT12(-((char)((ulong)
                                                  lVar13 >> 0x10) < '\0'),
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
        uVar11 = uVar11 + ((ulong)LZCOUNT(uVar10 >> 0x20 | uVar10 << 0x20) >> 3) & uVar7;
        bVar4 = (byte)(uVar8 >> 0x38);
        if (*(char *)((long)unaff_x20 + uVar11) < '\0') {
          uVar10 = uVar11 - uVar9 ^ uVar5 - uVar9;
        }
        else {
          lVar12 = *unaff_x20;
          uVar11 = CONCAT17(-(lVar12 < 0),
                            CONCAT16(-((char)((ulong)lVar12 >> 0x30) < '\0'),
                                     CONCAT15(-((char)((ulong)lVar12 >> 0x28) < '\0'),
                                              CONCAT14(-((char)((ulong)lVar12 >> 0x20) < '\0'),
                                                       CONCAT13(-((char)((ulong)lVar12 >> 0x18) <
                                                                 '\0'),CONCAT12(-((char)((ulong)
                                                  lVar12 >> 0x10) < '\0'),
                                                  CONCAT11(-((char)((ulong)lVar12 >> 8) < '\0'),
                                                           -((char)lVar12 < '\0'))))))));
          uVar11 = (uVar11 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar11 & 0x5555555555555555) << 1;
          uVar11 = (uVar11 & 0xcccccccccccccccc) >> 2 | (uVar11 & 0x3333333333333333) << 2;
          uVar11 = (uVar11 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar11 & 0xf0f0f0f0f0f0f0f) << 4;
          uVar11 = (uVar11 & 0xff00ff00ff00ff00) >> 8 | (uVar11 & 0xff00ff00ff00ff) << 8;
          uVar11 = (uVar11 & 0xffff0000ffff0000) >> 0x10 | (uVar11 & 0xffff0000ffff) << 0x10;
          uVar11 = (ulong)LZCOUNT(uVar11 >> 0x20 | uVar11 << 0x20) >> 3;
          uVar10 = uVar11 - uVar9 ^ uVar5 - uVar9;
        }
        if ((uVar10 & uVar7) < 8) {
          *(byte *)((long)unaff_x20 + uVar5) = bVar4 >> 1;
          unaff_x20 = (long *)*param_1;
          *(byte *)((long)unaff_x20 + (uVar7 & uVar5 - 8) + 8) = bVar4 >> 1;
          goto LAB_007ad940;
        }
        plVar1 = unaff_x20 + ~uVar11 * 4;
        cVar3 = *(char *)((long)unaff_x20 + uVar11);
        *(byte *)((long)unaff_x20 + uVar11) = bVar4 >> 1;
        unaff_x20 = (long *)*param_1;
        *(byte *)((long)unaff_x20 + (uVar11 - 8 & uVar7) + 8) = bVar4 >> 1;
        if (cVar3 == -1) break;
        lVar12 = *plVar2;
        *plVar2 = *plVar1;
        *plVar1 = lVar12;
        lVar12 = plVar2[1];
        plVar2[1] = plVar1[1];
        plVar1[1] = lVar12;
        lVar12 = plVar2[2];
        plVar2[2] = plVar1[2];
        plVar1[2] = lVar12;
        lVar12 = plVar2[3];
        plVar2[3] = plVar1[3];
        plVar1[3] = lVar12;
        unaff_x20 = (long *)*param_1;
      }
      uVar11 = param_1[1];
      *(undefined1 *)((long)unaff_x20 + uVar5) = 0xff;
      *(undefined1 *)((long)unaff_x20 + (uVar11 & uVar5 - 8) + 8) = 0xff;
      lVar12 = *plVar2;
      lVar14 = plVar2[3];
      lVar13 = plVar2[2];
      plVar1[1] = plVar2[1];
      *plVar1 = lVar12;
      plVar1[3] = lVar14;
      plVar1[2] = lVar13;
    }
LAB_007ad940:
    if (unaff_x19 <= uVar6) {
      uVar5 = param_1[1];
      if (7 < uVar5) {
        uVar5 = (uVar5 + 1 >> 3) * 7;
      }
      param_1[2] = uVar5 - param_1[3];
      return 0x8000000000000001;
    }
    uVar5 = uVar6;
    uVar6 = uVar6 + 1;
  } while( true );
}

