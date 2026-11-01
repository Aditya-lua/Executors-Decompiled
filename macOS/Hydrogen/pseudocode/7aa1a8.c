
undefined8 FUN_007aa1a8(ulong param_1,long *param_2)

{
  char cVar1;
  byte bVar2;
  ulong uVar3;
  ulong uVar4;
  long in_x9;
  long in_x10;
  undefined1 in_w11;
  long *in_x13;
  ulong uVar5;
  ulong uVar6;
  ulong uVar7;
  ulong uVar8;
  long *in_x17;
  ulong unaff_x19;
  long *unaff_x20;
  long lVar9;
  long lVar10;
  long lVar11;
  long lVar12;
  
code_r0x007aa1a8:
  lVar10 = in_x13[1];
  lVar9 = *in_x13;
  lVar12 = in_x13[3];
  lVar11 = in_x13[2];
  in_x17[4] = in_x13[4];
  in_x17[1] = lVar10;
  *in_x17 = lVar9;
  in_x17[3] = lVar12;
  in_x17[2] = lVar11;
  do {
    do {
      uVar4 = param_1;
      if (unaff_x19 <= uVar4) {
        uVar4 = param_2[1];
        if (7 < uVar4) {
          uVar4 = (uVar4 + 1 >> 3) * 7;
        }
        param_2[2] = uVar4 - param_2[3];
        return 0x8000000000000001;
      }
      param_1 = uVar4 + 1;
    } while (*(char *)((long)unaff_x20 + uVar4) != -0x80);
    in_x13 = (long *)((long)unaff_x20 + ~uVar4 * in_x10);
    while( true ) {
      uVar6 = (*(long *)((long)unaff_x20 + -uVar4 * in_x10 + -0x28) + 8) * in_x9;
      uVar5 = param_2[1];
      uVar7 = uVar6 & uVar5;
      lVar9 = *(long *)((long)unaff_x20 + uVar7);
      uVar8 = CONCAT17(-(lVar9 < 0),
                       CONCAT16(-((char)((ulong)lVar9 >> 0x30) < '\0'),
                                CONCAT15(-((char)((ulong)lVar9 >> 0x28) < '\0'),
                                         CONCAT14(-((char)((ulong)lVar9 >> 0x20) < '\0'),
                                                  CONCAT13(-((char)((ulong)lVar9 >> 0x18) < '\0'),
                                                           CONCAT12(-((char)((ulong)lVar9 >> 0x10) <
                                                                     '\0'),CONCAT11(-((char)((ulong)
                                                  lVar9 >> 8) < '\0'),-((char)lVar9 < '\0'))))))));
      uVar3 = uVar7;
      if (uVar8 == 0) {
        lVar9 = 8;
        do {
          uVar3 = uVar3 + lVar9 & uVar5;
          lVar10 = *(long *)((long)unaff_x20 + uVar3);
          uVar8 = CONCAT17(-(lVar10 < 0),
                           CONCAT16(-((char)((ulong)lVar10 >> 0x30) < '\0'),
                                    CONCAT15(-((char)((ulong)lVar10 >> 0x28) < '\0'),
                                             CONCAT14(-((char)((ulong)lVar10 >> 0x20) < '\0'),
                                                      CONCAT13(-((char)((ulong)lVar10 >> 0x18) <
                                                                '\0'),CONCAT12(-((char)((ulong)
                                                  lVar10 >> 0x10) < '\0'),
                                                  CONCAT11(-((char)((ulong)lVar10 >> 8) < '\0'),
                                                           -((char)lVar10 < '\0'))))))));
          lVar9 = lVar9 + 8;
        } while (uVar8 == 0);
      }
      uVar8 = (uVar8 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar8 & 0x5555555555555555) << 1;
      uVar8 = (uVar8 & 0xcccccccccccccccc) >> 2 | (uVar8 & 0x3333333333333333) << 2;
      uVar8 = (uVar8 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar8 & 0xf0f0f0f0f0f0f0f) << 4;
      uVar8 = (uVar8 & 0xff00ff00ff00ff00) >> 8 | (uVar8 & 0xff00ff00ff00ff) << 8;
      uVar8 = (uVar8 & 0xffff0000ffff0000) >> 0x10 | (uVar8 & 0xffff0000ffff) << 0x10;
      uVar3 = uVar3 + ((ulong)LZCOUNT(uVar8 >> 0x20 | uVar8 << 0x20) >> 3) & uVar5;
      bVar2 = (byte)(uVar6 >> 0x38);
      if (*(char *)((long)unaff_x20 + uVar3) < '\0') {
        uVar8 = uVar3 - uVar7 ^ uVar4 - uVar7;
      }
      else {
        lVar9 = *unaff_x20;
        uVar3 = CONCAT17(-(lVar9 < 0),
                         CONCAT16(-((char)((ulong)lVar9 >> 0x30) < '\0'),
                                  CONCAT15(-((char)((ulong)lVar9 >> 0x28) < '\0'),
                                           CONCAT14(-((char)((ulong)lVar9 >> 0x20) < '\0'),
                                                    CONCAT13(-((char)((ulong)lVar9 >> 0x18) < '\0'),
                                                             CONCAT12(-((char)((ulong)lVar9 >> 0x10)
                                                                       < '\0'),CONCAT11(-((char)((
                                                  ulong)lVar9 >> 8) < '\0'),-((char)lVar9 < '\0'))))
                                                  ))));
        uVar3 = (uVar3 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar3 & 0x5555555555555555) << 1;
        uVar3 = (uVar3 & 0xcccccccccccccccc) >> 2 | (uVar3 & 0x3333333333333333) << 2;
        uVar3 = (uVar3 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar3 & 0xf0f0f0f0f0f0f0f) << 4;
        uVar3 = (uVar3 & 0xff00ff00ff00ff00) >> 8 | (uVar3 & 0xff00ff00ff00ff) << 8;
        uVar3 = (uVar3 & 0xffff0000ffff0000) >> 0x10 | (uVar3 & 0xffff0000ffff) << 0x10;
        uVar3 = (ulong)LZCOUNT(uVar3 >> 0x20 | uVar3 << 0x20) >> 3;
        uVar8 = uVar3 - uVar7 ^ uVar4 - uVar7;
      }
      if ((uVar8 & uVar5) < 8) break;
      in_x17 = (long *)((long)unaff_x20 + ~uVar3 * in_x10);
      cVar1 = *(char *)((long)unaff_x20 + uVar3);
      *(byte *)((long)unaff_x20 + uVar3) = bVar2 >> 1;
      unaff_x20 = (long *)*param_2;
      *(byte *)((long)unaff_x20 + (uVar3 - 8 & uVar5) + 8) = bVar2 >> 1;
      if (cVar1 == -1) {
        uVar3 = param_2[1];
        *(undefined1 *)((long)unaff_x20 + uVar4) = in_w11;
        *(undefined1 *)((long)unaff_x20 + (uVar3 & uVar4 - 8) + 8) = in_w11;
        goto code_r0x007aa1a8;
      }
      lVar9 = *in_x13;
      *in_x13 = *in_x17;
      *in_x17 = lVar9;
      lVar9 = in_x13[1];
      in_x13[1] = in_x17[1];
      in_x17[1] = lVar9;
      lVar9 = in_x13[2];
      in_x13[2] = in_x17[2];
      in_x17[2] = lVar9;
      lVar9 = in_x13[3];
      in_x13[3] = in_x17[3];
      in_x17[3] = lVar9;
      lVar9 = in_x13[4];
      in_x13[4] = in_x17[4];
      in_x17[4] = lVar9;
      unaff_x20 = (long *)*param_2;
    }
    *(byte *)((long)unaff_x20 + uVar4) = bVar2 >> 1;
    unaff_x20 = (long *)*param_2;
    *(byte *)((long)unaff_x20 + (uVar5 & uVar4 - 8) + 8) = bVar2 >> 1;
  } while( true );
}

