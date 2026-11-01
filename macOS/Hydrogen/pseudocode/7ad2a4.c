
undefined8 FUN_007ad2a4(ulong param_1,ulong param_2)

{
  char cVar1;
  byte bVar2;
  long lVar3;
  ulong uVar4;
  ulong uVar5;
  long *in_x9;
  ulong in_x10;
  long *unaff_x19;
  ulong unaff_x21;
  long *unaff_x22;
  ulong unaff_x23;
  long unaff_x24;
  undefined1 unaff_w25;
  ulong unaff_x26;
  long *unaff_x27;
  ulong uVar6;
  long lVar7;
  long lVar8;
  long lVar9;
  long lVar10;
  long lVar11;
  
  do {
    cVar1 = *(char *)((long)unaff_x22 + in_x10);
    bVar2 = (byte)(param_2 >> 0x38);
    *(byte *)((long)unaff_x22 + in_x10) = bVar2 >> 1;
    unaff_x22 = (long *)*unaff_x19;
    *(byte *)((long)unaff_x22 + (in_x10 - 8 & param_1) + 8) = bVar2 >> 1;
    if (cVar1 == -1) {
      uVar5 = unaff_x19[1];
      *(undefined1 *)((long)unaff_x22 + unaff_x26) = unaff_w25;
      *(undefined1 *)((long)unaff_x22 + (uVar5 & unaff_x26 - 8) + 8) = unaff_w25;
      lVar7 = unaff_x27[1];
      lVar3 = *unaff_x27;
      lVar9 = unaff_x27[3];
      lVar8 = unaff_x27[2];
      lVar11 = unaff_x27[5];
      lVar10 = unaff_x27[4];
      in_x9[6] = unaff_x27[6];
      in_x9[3] = lVar9;
      in_x9[2] = lVar8;
      in_x9[5] = lVar11;
      in_x9[4] = lVar10;
      in_x9[1] = lVar7;
      *in_x9 = lVar3;
      goto LAB_007ad3b8;
    }
    lVar3 = *unaff_x27;
    *unaff_x27 = *in_x9;
    *in_x9 = lVar3;
    lVar3 = unaff_x27[1];
    unaff_x27[1] = in_x9[1];
    in_x9[1] = lVar3;
    lVar3 = unaff_x27[2];
    unaff_x27[2] = in_x9[2];
    in_x9[2] = lVar3;
    lVar3 = unaff_x27[3];
    unaff_x27[3] = in_x9[3];
    in_x9[3] = lVar3;
    lVar3 = unaff_x27[4];
    unaff_x27[4] = in_x9[4];
    in_x9[4] = lVar3;
    lVar3 = unaff_x27[5];
    unaff_x27[5] = in_x9[5];
    in_x9[5] = lVar3;
    lVar3 = unaff_x27[6];
    unaff_x27[6] = in_x9[6];
    in_x9[6] = lVar3;
    unaff_x22 = (long *)*unaff_x19;
    while( true ) {
      param_2 = func_0x005763e4();
      param_1 = unaff_x19[1];
      uVar4 = param_1 & param_2;
      lVar3 = *(long *)((long)unaff_x22 + uVar4);
      uVar6 = CONCAT17(-(lVar3 < 0),
                       CONCAT16(-((char)((ulong)lVar3 >> 0x30) < '\0'),
                                CONCAT15(-((char)((ulong)lVar3 >> 0x28) < '\0'),
                                         CONCAT14(-((char)((ulong)lVar3 >> 0x20) < '\0'),
                                                  CONCAT13(-((char)((ulong)lVar3 >> 0x18) < '\0'),
                                                           CONCAT12(-((char)((ulong)lVar3 >> 0x10) <
                                                                     '\0'),CONCAT11(-((char)((ulong)
                                                  lVar3 >> 8) < '\0'),-((char)lVar3 < '\0'))))))));
      uVar5 = uVar4;
      if (uVar6 == 0) {
        lVar3 = 8;
        do {
          uVar5 = uVar5 + lVar3 & param_1;
          lVar7 = *(long *)((long)unaff_x22 + uVar5);
          uVar6 = CONCAT17(-(lVar7 < 0),
                           CONCAT16(-((char)((ulong)lVar7 >> 0x30) < '\0'),
                                    CONCAT15(-((char)((ulong)lVar7 >> 0x28) < '\0'),
                                             CONCAT14(-((char)((ulong)lVar7 >> 0x20) < '\0'),
                                                      CONCAT13(-((char)((ulong)lVar7 >> 0x18) < '\0'
                                                                ),CONCAT12(-((char)((ulong)lVar7 >>
                                                                                   0x10) < '\0'),
                                                                           CONCAT11(-((char)((ulong)
                                                  lVar7 >> 8) < '\0'),-((char)lVar7 < '\0'))))))));
          lVar3 = lVar3 + 8;
        } while (uVar6 == 0);
      }
      uVar6 = (uVar6 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar6 & 0x5555555555555555) << 1;
      uVar6 = (uVar6 & 0xcccccccccccccccc) >> 2 | (uVar6 & 0x3333333333333333) << 2;
      uVar6 = (uVar6 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar6 & 0xf0f0f0f0f0f0f0f) << 4;
      uVar6 = (uVar6 & 0xff00ff00ff00ff00) >> 8 | (uVar6 & 0xff00ff00ff00ff) << 8;
      uVar6 = (uVar6 & 0xffff0000ffff0000) >> 0x10 | (uVar6 & 0xffff0000ffff) << 0x10;
      in_x10 = uVar5 + ((ulong)LZCOUNT(uVar6 >> 0x20 | uVar6 << 0x20) >> 3) & param_1;
      if (*(char *)((long)unaff_x22 + in_x10) < '\0') {
        uVar5 = in_x10 - uVar4 ^ unaff_x26 - uVar4;
      }
      else {
        lVar3 = *unaff_x22;
        uVar5 = CONCAT17(-(lVar3 < 0),
                         CONCAT16(-((char)((ulong)lVar3 >> 0x30) < '\0'),
                                  CONCAT15(-((char)((ulong)lVar3 >> 0x28) < '\0'),
                                           CONCAT14(-((char)((ulong)lVar3 >> 0x20) < '\0'),
                                                    CONCAT13(-((char)((ulong)lVar3 >> 0x18) < '\0'),
                                                             CONCAT12(-((char)((ulong)lVar3 >> 0x10)
                                                                       < '\0'),CONCAT11(-((char)((
                                                  ulong)lVar3 >> 8) < '\0'),-((char)lVar3 < '\0'))))
                                                  ))));
        uVar5 = (uVar5 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar5 & 0x5555555555555555) << 1;
        uVar5 = (uVar5 & 0xcccccccccccccccc) >> 2 | (uVar5 & 0x3333333333333333) << 2;
        uVar5 = (uVar5 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar5 & 0xf0f0f0f0f0f0f0f) << 4;
        uVar5 = (uVar5 & 0xff00ff00ff00ff00) >> 8 | (uVar5 & 0xff00ff00ff00ff) << 8;
        uVar5 = (uVar5 & 0xffff0000ffff0000) >> 0x10 | (uVar5 & 0xffff0000ffff) << 0x10;
        in_x10 = (ulong)LZCOUNT(uVar5 >> 0x20 | uVar5 << 0x20) >> 3;
        uVar5 = in_x10 - uVar4 ^ unaff_x26 - uVar4;
      }
      if (7 < (uVar5 & param_1)) break;
      bVar2 = (byte)(param_2 >> 0x38);
      *(byte *)((long)unaff_x22 + unaff_x26) = bVar2 >> 1;
      unaff_x22 = (long *)*unaff_x19;
      *(byte *)((long)unaff_x22 + (param_1 & unaff_x26 - 8) + 8) = bVar2 >> 1;
LAB_007ad3b8:
      do {
        unaff_x26 = unaff_x23;
        if (unaff_x21 <= unaff_x26) {
          uVar5 = unaff_x19[1];
          if (7 < uVar5) {
            uVar5 = (uVar5 + 1 >> 3) * 7;
          }
          unaff_x19[2] = uVar5 - unaff_x19[3];
          return 0x8000000000000001;
        }
        unaff_x23 = unaff_x26 + 1;
      } while (*(char *)((long)unaff_x22 + unaff_x26) != -0x80);
      unaff_x27 = (long *)((long)unaff_x22 + ~unaff_x26 * unaff_x24);
    }
    in_x9 = (long *)((long)unaff_x22 + ~in_x10 * unaff_x24);
  } while( true );
}

