
long FUN_0049e328(long param_1,undefined8 param_2,undefined1 param_3 [16],long param_4,long param_5,
                 long *param_6)

{
  ulong uVar1;
  undefined1 in_ZR;
  bool bVar2;
  long *in_x9;
  undefined1 in_w10;
  ulong in_x11;
  ulong in_x12;
  long in_x13;
  ulong uVar3;
  ulong in_x14;
  ulong in_x15;
  ulong in_x16;
  ulong in_x17;
  long unaff_x19;
  long lVar4;
  long lVar5;
  byte bVar6;
  char cVar7;
  char cVar8;
  char cVar9;
  char cVar10;
  char cVar11;
  char cVar12;
  long *in_stack_00000000;
  
  do {
    if ((bool)in_ZR) {
      lVar4 = param_6[-1];
      param_6[-1] = unaff_x19;
      lVar5 = *in_stack_00000000;
      *in_stack_00000000 = lVar5 + -1;
      LORelease();
      if (lVar5 == 1) {
        func_0x005d2ac4();
      }
      return lVar4;
    }
    in_x17 = in_x17 - 1 & in_x17;
    while (in_x17 == 0) {
      cVar7 = (char)((ulong)param_4 >> 8);
      cVar8 = (char)((ulong)param_4 >> 0x10);
      cVar9 = (char)((ulong)param_4 >> 0x18);
      cVar10 = (char)((ulong)param_4 >> 0x20);
      cVar11 = (char)((ulong)param_4 >> 0x28);
      cVar12 = (char)((ulong)param_4 >> 0x30);
      uVar1 = CONCAT17(-(param_4 < 0),
                       CONCAT16(-(cVar12 < '\0'),
                                CONCAT15(-(cVar11 < '\0'),
                                         CONCAT14(-(cVar10 < '\0'),
                                                  CONCAT13(-(cVar9 < '\0'),
                                                           CONCAT12(-(cVar8 < '\0'),
                                                                    CONCAT11(-(cVar7 < '\0'),
                                                                             -((char)param_4 < '\0')
                                                                            )))))));
      uVar3 = (uVar1 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar1 & 0x5555555555555555) << 1;
      uVar3 = (uVar3 & 0xcccccccccccccccc) >> 2 | (uVar3 & 0x3333333333333333) << 2;
      uVar3 = (uVar3 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar3 & 0xf0f0f0f0f0f0f0f) << 4;
      uVar3 = (uVar3 & 0xff00ff00ff00ff00) >> 8 | (uVar3 & 0xff00ff00ff00ff) << 8;
      uVar3 = (uVar3 & 0xffff0000ffff0000) >> 0x10 | (uVar3 & 0xffff0000ffff) << 0x10;
      bVar2 = in_x14 != 1;
      in_x14 = in_x15;
      if (bVar2) {
        in_x14 = (ulong)(uVar1 != 0);
        in_x12 = in_x16 + ((ulong)LZCOUNT(uVar3 >> 0x20 | uVar3 << 0x20) >> 3) & in_x11;
      }
      bVar6 = NEON_umaxv(CONCAT17(-((char)((ulong)param_4 >> 0x38) == param_3[7]),
                                  CONCAT16(-(cVar12 == param_3[6]),
                                           CONCAT15(-(cVar11 == param_3[5]),
                                                    CONCAT14(-(cVar10 == param_3[4]),
                                                             CONCAT13(-(cVar9 == param_3[3]),
                                                                      CONCAT12(-(cVar8 == param_3[2]
                                                                                ),CONCAT11(-(cVar7 
                                                  == param_3[1]),-((char)param_4 == param_3[0]))))))
                                          )),1);
      if ((bVar6 & 1) != 0) {
        uVar3 = (ulong)*(char *)((long)in_x9 + in_x12);
        if (-1 < *(char *)((long)in_x9 + in_x12)) {
          lVar5 = *in_x9;
          uVar3 = CONCAT17(-(lVar5 < 0),
                           CONCAT16(-((char)((ulong)lVar5 >> 0x30) < '\0'),
                                    CONCAT15(-((char)((ulong)lVar5 >> 0x28) < '\0'),
                                             CONCAT14(-((char)((ulong)lVar5 >> 0x20) < '\0'),
                                                      CONCAT13(-((char)((ulong)lVar5 >> 0x18) < '\0'
                                                                ),CONCAT12(-((char)((ulong)lVar5 >>
                                                                                   0x10) < '\0'),
                                                                           CONCAT11(-((char)((ulong)
                                                  lVar5 >> 8) < '\0'),-((char)lVar5 < '\0'))))))));
          uVar3 = (uVar3 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar3 & 0x5555555555555555) << 1;
          uVar3 = (uVar3 & 0xcccccccccccccccc) >> 2 | (uVar3 & 0x3333333333333333) << 2;
          uVar3 = (uVar3 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar3 & 0xf0f0f0f0f0f0f0f) << 4;
          uVar3 = (uVar3 & 0xff00ff00ff00ff00) >> 8 | (uVar3 & 0xff00ff00ff00ff) << 8;
          uVar3 = (uVar3 & 0xffff0000ffff0000) >> 0x10 | (uVar3 & 0xffff0000ffff) << 0x10;
          in_x12 = (ulong)LZCOUNT(uVar3 >> 0x20 | uVar3 << 0x20) >> 3;
          uVar3 = (ulong)*(byte *)((long)in_x9 + in_x12);
        }
        *(undefined1 *)((long)in_x9 + in_x12) = in_w10;
        *(undefined1 *)((long)in_x9 + (in_x12 - 8 & in_x11) + 8) = in_w10;
        *(ulong *)(param_5 + 0x10) = *(long *)(param_5 + 0x10) - (uVar3 & 1);
        *(long *)(param_5 + 0x18) = *(long *)(param_5 + 0x18) + 1;
        in_x9[in_x12 * -2 + -2] = param_1;
        in_x9[in_x12 * -2 + -1] = unaff_x19;
        return 0;
      }
      in_x13 = in_x13 + 8;
      in_x16 = in_x16 + in_x13 & in_x11;
      param_4 = *(long *)((long)in_x9 + in_x16);
      in_x17 = CONCAT17(-((char)((ulong)param_4 >> 0x38) == (char)((ulong)param_2 >> 0x38)),
                        CONCAT16(-((char)((ulong)param_4 >> 0x30) == (char)((ulong)param_2 >> 0x30))
                                 ,CONCAT15(-((char)((ulong)param_4 >> 0x28) ==
                                            (char)((ulong)param_2 >> 0x28)),
                                           CONCAT14(-((char)((ulong)param_4 >> 0x20) ==
                                                     (char)((ulong)param_2 >> 0x20)),
                                                    CONCAT13(-((char)((ulong)param_4 >> 0x18) ==
                                                              (char)((ulong)param_2 >> 0x18)),
                                                             CONCAT12(-((char)((ulong)param_4 >>
                                                                              0x10) ==
                                                                       (char)((ulong)param_2 >> 0x10
                                                                             )),
                                                                      CONCAT11(-((char)((ulong)
                                                  param_4 >> 8) == (char)((ulong)param_2 >> 8)),
                                                  -((char)param_4 == (char)param_2)))))))) &
               0x8080808080808080;
    }
    uVar3 = (in_x17 & 0xaaaaaaaaaaaaaaaa) >> 1 | (in_x17 & 0x5555555555555555) << 1;
    uVar3 = (uVar3 & 0xcccccccccccccccc) >> 2 | (uVar3 & 0x3333333333333333) << 2;
    uVar3 = (uVar3 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar3 & 0xf0f0f0f0f0f0f0f) << 4;
    uVar3 = (uVar3 & 0xff00ff00ff00ff00) >> 8 | (uVar3 & 0xff00ff00ff00ff) << 8;
    uVar3 = (uVar3 & 0xffff0000ffff0000) >> 0x10 | (uVar3 & 0xffff0000ffff) << 0x10;
    param_6 = in_x9 + (in_x16 + ((ulong)LZCOUNT(uVar3 >> 0x20 | uVar3 << 0x20) >> 3) & in_x11) * -2;
    in_ZR = param_1 == param_6[-2];
  } while( true );
}

