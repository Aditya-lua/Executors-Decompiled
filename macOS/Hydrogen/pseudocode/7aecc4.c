
undefined8 FUN_007aecc4(ulong param_1,long *param_2,uint param_3)

{
  byte bVar1;
  ulong uVar2;
  long in_x9;
  undefined1 in_w10;
  ulong in_x11;
  long *in_x12;
  long in_x13;
  ulong uVar3;
  ulong in_x14;
  long lVar4;
  ulong uVar5;
  ulong in_x15;
  ulong uVar6;
  ulong uVar7;
  long *in_x16;
  ulong in_x17;
  ulong unaff_x19;
  long *unaff_x20;
  long lVar8;
  
  do {
    *(char *)((long)unaff_x20 + in_x17) = (char)in_x15;
    unaff_x20 = (long *)*param_2;
    *(char *)((long)unaff_x20 + in_x14 + 8) = (char)in_x15;
    if (param_3 == 0xff) {
      uVar7 = param_2[1];
      *(undefined1 *)((long)unaff_x20 + in_x11) = in_w10;
      *(undefined1 *)((long)unaff_x20 + (uVar7 & in_x11 - 8) + 8) = in_w10;
      lVar4 = *in_x12;
      in_x16[1] = in_x12[1];
      *in_x16 = lVar4;
      goto LAB_007aed78;
    }
    lVar4 = *in_x12;
    *in_x12 = *in_x16;
    *in_x16 = lVar4;
    lVar4 = in_x12[1];
    in_x12[1] = in_x16[1];
    in_x16[1] = lVar4;
    unaff_x20 = (long *)*param_2;
    while( true ) {
      uVar5 = (unaff_x20[in_x13 * 2 + -2] + 8) * in_x9;
      uVar3 = param_2[1];
      uVar6 = uVar5 & uVar3;
      lVar4 = *(long *)((long)unaff_x20 + uVar6);
      uVar2 = CONCAT17(-(lVar4 < 0),
                       CONCAT16(-((char)((ulong)lVar4 >> 0x30) < '\0'),
                                CONCAT15(-((char)((ulong)lVar4 >> 0x28) < '\0'),
                                         CONCAT14(-((char)((ulong)lVar4 >> 0x20) < '\0'),
                                                  CONCAT13(-((char)((ulong)lVar4 >> 0x18) < '\0'),
                                                           CONCAT12(-((char)((ulong)lVar4 >> 0x10) <
                                                                     '\0'),CONCAT11(-((char)((ulong)
                                                  lVar4 >> 8) < '\0'),-((char)lVar4 < '\0'))))))));
      uVar7 = uVar6;
      if (uVar2 == 0) {
        lVar4 = 8;
        do {
          uVar7 = uVar7 + lVar4 & uVar3;
          lVar8 = *(long *)((long)unaff_x20 + uVar7);
          uVar2 = CONCAT17(-(lVar8 < 0),
                           CONCAT16(-((char)((ulong)lVar8 >> 0x30) < '\0'),
                                    CONCAT15(-((char)((ulong)lVar8 >> 0x28) < '\0'),
                                             CONCAT14(-((char)((ulong)lVar8 >> 0x20) < '\0'),
                                                      CONCAT13(-((char)((ulong)lVar8 >> 0x18) < '\0'
                                                                ),CONCAT12(-((char)((ulong)lVar8 >>
                                                                                   0x10) < '\0'),
                                                                           CONCAT11(-((char)((ulong)
                                                  lVar8 >> 8) < '\0'),-((char)lVar8 < '\0'))))))));
          lVar4 = lVar4 + 8;
        } while (uVar2 == 0);
      }
      uVar2 = (uVar2 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar2 & 0x5555555555555555) << 1;
      uVar2 = (uVar2 & 0xcccccccccccccccc) >> 2 | (uVar2 & 0x3333333333333333) << 2;
      uVar2 = (uVar2 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar2 & 0xf0f0f0f0f0f0f0f) << 4;
      uVar2 = (uVar2 & 0xff00ff00ff00ff00) >> 8 | (uVar2 & 0xff00ff00ff00ff) << 8;
      uVar2 = (uVar2 & 0xffff0000ffff0000) >> 0x10 | (uVar2 & 0xffff0000ffff) << 0x10;
      in_x17 = uVar7 + ((ulong)LZCOUNT(uVar2 >> 0x20 | uVar2 << 0x20) >> 3) & uVar3;
      if (*(char *)((long)unaff_x20 + in_x17) < '\0') {
        uVar7 = in_x17 - uVar6 ^ in_x11 - uVar6;
      }
      else {
        lVar4 = *unaff_x20;
        uVar7 = CONCAT17(-(lVar4 < 0),
                         CONCAT16(-((char)((ulong)lVar4 >> 0x30) < '\0'),
                                  CONCAT15(-((char)((ulong)lVar4 >> 0x28) < '\0'),
                                           CONCAT14(-((char)((ulong)lVar4 >> 0x20) < '\0'),
                                                    CONCAT13(-((char)((ulong)lVar4 >> 0x18) < '\0'),
                                                             CONCAT12(-((char)((ulong)lVar4 >> 0x10)
                                                                       < '\0'),CONCAT11(-((char)((
                                                  ulong)lVar4 >> 8) < '\0'),-((char)lVar4 < '\0'))))
                                                  ))));
        uVar7 = (uVar7 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar7 & 0x5555555555555555) << 1;
        uVar7 = (uVar7 & 0xcccccccccccccccc) >> 2 | (uVar7 & 0x3333333333333333) << 2;
        uVar7 = (uVar7 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar7 & 0xf0f0f0f0f0f0f0f) << 4;
        uVar7 = (uVar7 & 0xff00ff00ff00ff00) >> 8 | (uVar7 & 0xff00ff00ff00ff) << 8;
        uVar7 = (uVar7 & 0xffff0000ffff0000) >> 0x10 | (uVar7 & 0xffff0000ffff) << 0x10;
        in_x17 = (ulong)LZCOUNT(uVar7 >> 0x20 | uVar7 << 0x20) >> 3;
        uVar7 = in_x17 - uVar6 ^ in_x11 - uVar6;
      }
      if (7 < (uVar7 & uVar3)) break;
      bVar1 = (byte)(uVar5 >> 0x38);
      *(byte *)((long)unaff_x20 + in_x11) = bVar1 >> 1;
      unaff_x20 = (long *)*param_2;
      *(byte *)((long)unaff_x20 + (uVar3 & in_x11 - 8) + 8) = bVar1 >> 1;
LAB_007aed78:
      do {
        in_x11 = param_1;
        if (unaff_x19 <= in_x11) {
          uVar7 = param_2[1];
          if (7 < uVar7) {
            uVar7 = (uVar7 + 1 >> 3) * 7;
          }
          param_2[2] = uVar7 - param_2[3];
          return 0x8000000000000001;
        }
        param_1 = in_x11 + 1;
      } while (*(char *)((long)unaff_x20 + in_x11) != -0x80);
      in_x12 = unaff_x20 + ~in_x11 * 2;
      in_x13 = -in_x11;
    }
    in_x16 = unaff_x20 + ~in_x17 * 2;
    param_3 = (uint)*(byte *)((long)unaff_x20 + in_x17);
    in_x15 = uVar5 >> 0x39;
    in_x14 = in_x17 - 8 & uVar3;
  } while( true );
}

