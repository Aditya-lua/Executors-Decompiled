
undefined8 FUN_007a4194(ulong param_1,long *param_2)

{
  long *plVar1;
  char cVar2;
  byte bVar3;
  ulong uVar4;
  long in_x9;
  undefined1 in_w10;
  ulong in_x11;
  long *in_x12;
  long in_x13;
  ulong in_x14;
  ulong in_x15;
  ulong in_x16;
  ulong in_x17;
  ulong uVar5;
  ulong unaff_x19;
  long *unaff_x20;
  long lVar6;
  long lVar7;
  
code_r0x007a4194:
  uVar5 = in_x17 >> 3;
  if (7 < ((uVar5 - in_x16 ^ in_x11 - in_x16) & in_x14)) goto LAB_007a4100;
code_r0x007a41b0:
  bVar3 = (byte)(in_x15 >> 0x38);
  *(byte *)((long)unaff_x20 + in_x11) = bVar3 >> 1;
  unaff_x20 = (long *)*param_2;
  *(byte *)((long)unaff_x20 + (in_x14 & in_x11 - 8) + 8) = bVar3 >> 1;
  do {
    do {
      in_x11 = param_1;
      if (unaff_x19 <= in_x11) {
        uVar5 = param_2[1];
        if (7 < uVar5) {
          uVar5 = (uVar5 + 1 >> 3) * 7;
        }
        param_2[2] = uVar5 - param_2[3];
        return 0x8000000000000001;
      }
      param_1 = in_x11 + 1;
    } while (*(char *)((long)unaff_x20 + in_x11) != -0x80);
    in_x12 = unaff_x20 + ~in_x11 * 2;
    in_x13 = -in_x11;
    while( true ) {
      in_x15 = unaff_x20[in_x13 * 2 + -2] * in_x9;
      in_x14 = param_2[1];
      in_x16 = in_x14 & in_x15;
      lVar6 = *(long *)((long)unaff_x20 + in_x16);
      uVar4 = CONCAT17(-(lVar6 < 0),
                       CONCAT16(-((char)((ulong)lVar6 >> 0x30) < '\0'),
                                CONCAT15(-((char)((ulong)lVar6 >> 0x28) < '\0'),
                                         CONCAT14(-((char)((ulong)lVar6 >> 0x20) < '\0'),
                                                  CONCAT13(-((char)((ulong)lVar6 >> 0x18) < '\0'),
                                                           CONCAT12(-((char)((ulong)lVar6 >> 0x10) <
                                                                     '\0'),CONCAT11(-((char)((ulong)
                                                  lVar6 >> 8) < '\0'),-((char)lVar6 < '\0'))))))));
      uVar5 = in_x16;
      if (uVar4 == 0) {
        lVar6 = 8;
        do {
          uVar5 = uVar5 + lVar6 & in_x14;
          lVar7 = *(long *)((long)unaff_x20 + uVar5);
          uVar4 = CONCAT17(-(lVar7 < 0),
                           CONCAT16(-((char)((ulong)lVar7 >> 0x30) < '\0'),
                                    CONCAT15(-((char)((ulong)lVar7 >> 0x28) < '\0'),
                                             CONCAT14(-((char)((ulong)lVar7 >> 0x20) < '\0'),
                                                      CONCAT13(-((char)((ulong)lVar7 >> 0x18) < '\0'
                                                                ),CONCAT12(-((char)((ulong)lVar7 >>
                                                                                   0x10) < '\0'),
                                                                           CONCAT11(-((char)((ulong)
                                                  lVar7 >> 8) < '\0'),-((char)lVar7 < '\0'))))))));
          lVar6 = lVar6 + 8;
        } while (uVar4 == 0);
      }
      uVar4 = (uVar4 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar4 & 0x5555555555555555) << 1;
      uVar4 = (uVar4 & 0xcccccccccccccccc) >> 2 | (uVar4 & 0x3333333333333333) << 2;
      uVar4 = (uVar4 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar4 & 0xf0f0f0f0f0f0f0f) << 4;
      uVar4 = (uVar4 & 0xff00ff00ff00ff00) >> 8 | (uVar4 & 0xff00ff00ff00ff) << 8;
      uVar4 = (uVar4 & 0xffff0000ffff0000) >> 0x10 | (uVar4 & 0xffff0000ffff) << 0x10;
      uVar5 = uVar5 + ((ulong)LZCOUNT(uVar4 >> 0x20 | uVar4 << 0x20) >> 3) & in_x14;
      if (-1 < *(char *)((long)unaff_x20 + uVar5)) {
        lVar6 = *unaff_x20;
        uVar5 = CONCAT17(-(lVar6 < 0),
                         CONCAT16(-((char)((ulong)lVar6 >> 0x30) < '\0'),
                                  CONCAT15(-((char)((ulong)lVar6 >> 0x28) < '\0'),
                                           CONCAT14(-((char)((ulong)lVar6 >> 0x20) < '\0'),
                                                    CONCAT13(-((char)((ulong)lVar6 >> 0x18) < '\0'),
                                                             CONCAT12(-((char)((ulong)lVar6 >> 0x10)
                                                                       < '\0'),CONCAT11(-((char)((
                                                  ulong)lVar6 >> 8) < '\0'),-((char)lVar6 < '\0'))))
                                                  ))));
        uVar5 = (uVar5 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar5 & 0x5555555555555555) << 1;
        uVar5 = (uVar5 & 0xcccccccccccccccc) >> 2 | (uVar5 & 0x3333333333333333) << 2;
        uVar5 = (uVar5 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar5 & 0xf0f0f0f0f0f0f0f) << 4;
        uVar5 = (uVar5 & 0xff00ff00ff00ff00) >> 8 | (uVar5 & 0xff00ff00ff00ff) << 8;
        uVar5 = (uVar5 & 0xffff0000ffff0000) >> 0x10 | (uVar5 & 0xffff0000ffff) << 0x10;
        in_x17 = LZCOUNT(uVar5 >> 0x20 | uVar5 << 0x20);
        goto code_r0x007a4194;
      }
      if (((uVar5 - in_x16 ^ in_x11 - in_x16) & in_x14) < 8) goto code_r0x007a41b0;
LAB_007a4100:
      plVar1 = unaff_x20 + ~uVar5 * 2;
      cVar2 = *(char *)((long)unaff_x20 + uVar5);
      bVar3 = (byte)(in_x15 >> 0x38);
      *(byte *)((long)unaff_x20 + uVar5) = bVar3 >> 1;
      unaff_x20 = (long *)*param_2;
      *(byte *)((long)unaff_x20 + (uVar5 - 8 & in_x14) + 8) = bVar3 >> 1;
      if (cVar2 == -1) break;
      lVar6 = *in_x12;
      *in_x12 = *plVar1;
      *plVar1 = lVar6;
      lVar6 = in_x12[1];
      in_x12[1] = plVar1[1];
      plVar1[1] = lVar6;
      unaff_x20 = (long *)*param_2;
    }
    uVar5 = param_2[1];
    *(undefined1 *)((long)unaff_x20 + in_x11) = in_w10;
    *(undefined1 *)((long)unaff_x20 + (uVar5 & in_x11 - 8) + 8) = in_w10;
    lVar6 = *in_x12;
    plVar1[1] = in_x12[1];
    *plVar1 = lVar6;
  } while( true );
}

