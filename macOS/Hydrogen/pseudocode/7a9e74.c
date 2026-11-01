
undefined8 FUN_007a9e74(ulong param_1,ulong param_2,ulong param_3,ulong param_4,ulong param_5)

{
  long *plVar1;
  long *plVar2;
  byte bVar3;
  ulong uVar4;
  ulong uVar5;
  long lVar6;
  long in_x9;
  long in_x10;
  long *in_x11;
  long in_x12;
  long in_x13;
  long in_x14;
  long in_x15;
  long *in_x16;
  long in_x17;
  long *unaff_x19;
  long unaff_x22;
  long unaff_x23;
  long lVar7;
  long lVar8;
  
  do {
    uVar4 = (param_2 & 0xaaaaaaaaaaaaaaaa) >> 1 | (param_2 & 0x5555555555555555) << 1;
    uVar4 = (uVar4 & 0xcccccccccccccccc) >> 2 | (uVar4 & 0x3333333333333333) << 2;
    uVar4 = (uVar4 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar4 & 0xf0f0f0f0f0f0f0f) << 4;
    uVar4 = (uVar4 & 0xff00ff00ff00ff00) >> 8 | (uVar4 & 0xff00ff00ff00ff) << 8;
    uVar4 = (uVar4 & 0xffff0000ffff0000) >> 0x10 | (uVar4 & 0xffff0000ffff) << 0x10;
    uVar4 = (ulong)LZCOUNT(uVar4 >> 0x20 | uVar4 << 0x20) >> 3;
    do {
      param_3 = param_3 - 1 & param_3;
      bVar3 = (byte)(param_5 >> 0x38);
      *(byte *)((long)unaff_x19 + uVar4) = bVar3 >> 1;
      *(byte *)(in_x15 + (uVar4 - 8 & param_1)) = bVar3 >> 1;
      plVar1 = (long *)(in_x9 + ~param_4 * 0x20);
      lVar7 = *plVar1;
      lVar8 = plVar1[3];
      lVar6 = plVar1[2];
      plVar2 = unaff_x19 + ~uVar4 * 4;
      plVar2[1] = plVar1[1];
      *plVar2 = lVar7;
      plVar2[3] = lVar8;
      plVar2[2] = lVar6;
      in_x17 = in_x17 + -1;
      if (in_x17 == 0) {
        *in_x11 = (long)unaff_x19;
        in_x11[1] = param_1;
        in_x11[2] = in_x10 - unaff_x22;
        if (unaff_x23 != 0) {
          lVar6 = unaff_x23 * 0x20 + 0x20;
          lVar7 = unaff_x23 + lVar6 + 9;
          if (lVar7 != 0) {
            func_0x00187bd4(in_x9 - lVar6,lVar7,8);
          }
        }
        return 0x8000000000000001;
      }
      while (param_3 == 0) {
        in_x16 = in_x16 + 1;
        lVar7 = *in_x16;
        in_x12 = in_x12 + 8;
        param_3 = CONCAT17(-(-1 < lVar7),
                           CONCAT16(-(-1 < (char)((ulong)lVar7 >> 0x30)),
                                    CONCAT15(-(-1 < (char)((ulong)lVar7 >> 0x28)),
                                             CONCAT14(-(-1 < (char)((ulong)lVar7 >> 0x20)),
                                                      CONCAT13(-(-1 < (char)((ulong)lVar7 >> 0x18)),
                                                               CONCAT12(-(-1 < (char)((ulong)lVar7
                                                                                     >> 0x10)),
                                                                        CONCAT11(-(-1 < (char)((
                                                  ulong)lVar7 >> 8)),-(-1 < (char)lVar7)))))))) &
                  0x8080808080808080;
      }
      uVar4 = (param_3 & 0xaaaaaaaaaaaaaaaa) >> 1 | (param_3 & 0x5555555555555555) << 1;
      uVar4 = (uVar4 & 0xcccccccccccccccc) >> 2 | (uVar4 & 0x3333333333333333) << 2;
      uVar4 = (uVar4 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar4 & 0xf0f0f0f0f0f0f0f) << 4;
      uVar4 = (uVar4 & 0xff00ff00ff00ff00) >> 8 | (uVar4 & 0xff00ff00ff00ff) << 8;
      uVar4 = (uVar4 & 0xffff0000ffff0000) >> 0x10 | (uVar4 & 0xffff0000ffff) << 0x10;
      param_4 = in_x12 + ((ulong)LZCOUNT(uVar4 >> 0x20 | uVar4 << 0x20) >> 3);
      param_5 = (ulong)*(uint *)(in_x14 + param_4 * -0x20) * in_x13;
      uVar4 = param_5 & param_1;
      lVar7 = *(long *)((long)unaff_x19 + uVar4);
      uVar5 = CONCAT17(-(lVar7 < 0),
                       CONCAT16(-((char)((ulong)lVar7 >> 0x30) < '\0'),
                                CONCAT15(-((char)((ulong)lVar7 >> 0x28) < '\0'),
                                         CONCAT14(-((char)((ulong)lVar7 >> 0x20) < '\0'),
                                                  CONCAT13(-((char)((ulong)lVar7 >> 0x18) < '\0'),
                                                           CONCAT12(-((char)((ulong)lVar7 >> 0x10) <
                                                                     '\0'),CONCAT11(-((char)((ulong)
                                                  lVar7 >> 8) < '\0'),-((char)lVar7 < '\0'))))))));
      if (uVar5 == 0) {
        lVar7 = 8;
        do {
          uVar4 = uVar4 + lVar7 & param_1;
          lVar6 = *(long *)((long)unaff_x19 + uVar4);
          uVar5 = CONCAT17(-(lVar6 < 0),
                           CONCAT16(-((char)((ulong)lVar6 >> 0x30) < '\0'),
                                    CONCAT15(-((char)((ulong)lVar6 >> 0x28) < '\0'),
                                             CONCAT14(-((char)((ulong)lVar6 >> 0x20) < '\0'),
                                                      CONCAT13(-((char)((ulong)lVar6 >> 0x18) < '\0'
                                                                ),CONCAT12(-((char)((ulong)lVar6 >>
                                                                                   0x10) < '\0'),
                                                                           CONCAT11(-((char)((ulong)
                                                  lVar6 >> 8) < '\0'),-((char)lVar6 < '\0'))))))));
          lVar7 = lVar7 + 8;
        } while (uVar5 == 0);
      }
      uVar5 = (uVar5 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar5 & 0x5555555555555555) << 1;
      uVar5 = (uVar5 & 0xcccccccccccccccc) >> 2 | (uVar5 & 0x3333333333333333) << 2;
      uVar5 = (uVar5 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar5 & 0xf0f0f0f0f0f0f0f) << 4;
      uVar5 = (uVar5 & 0xff00ff00ff00ff00) >> 8 | (uVar5 & 0xff00ff00ff00ff) << 8;
      uVar5 = (uVar5 & 0xffff0000ffff0000) >> 0x10 | (uVar5 & 0xffff0000ffff) << 0x10;
      uVar4 = uVar4 + ((ulong)LZCOUNT(uVar5 >> 0x20 | uVar5 << 0x20) >> 3) & param_1;
    } while (*(char *)((long)unaff_x19 + uVar4) < '\0');
    lVar7 = *unaff_x19;
    param_2 = CONCAT17(-(lVar7 < 0),
                       CONCAT16(-((char)((ulong)lVar7 >> 0x30) < '\0'),
                                CONCAT15(-((char)((ulong)lVar7 >> 0x28) < '\0'),
                                         CONCAT14(-((char)((ulong)lVar7 >> 0x20) < '\0'),
                                                  CONCAT13(-((char)((ulong)lVar7 >> 0x18) < '\0'),
                                                           CONCAT12(-((char)((ulong)lVar7 >> 0x10) <
                                                                     '\0'),CONCAT11(-((char)((ulong)
                                                  lVar7 >> 8) < '\0'),-((char)lVar7 < '\0'))))))));
  } while( true );
}

