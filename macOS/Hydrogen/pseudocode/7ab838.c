
undefined8 FUN_007ab838(ulong param_1,long *param_2)

{
  char cVar1;
  byte bVar2;
  ulong uVar3;
  long in_x9;
  undefined1 in_w10;
  long *in_x12;
  ulong in_x13;
  ulong uVar4;
  ulong uVar5;
  ulong uVar6;
  long *in_x16;
  ulong uVar7;
  ulong unaff_x19;
  long *unaff_x20;
  long lVar8;
  long lVar9;
  
code_r0x007ab838:
  *(undefined1 *)((long)unaff_x20 + in_x13 + 8) = in_w10;
  lVar8 = *in_x12;
  in_x16[1] = in_x12[1];
  *in_x16 = lVar8;
  do {
    do {
      uVar3 = param_1;
      if (unaff_x19 <= uVar3) {
        uVar3 = param_2[1];
        if (7 < uVar3) {
          uVar3 = (uVar3 + 1 >> 3) * 7;
        }
        param_2[2] = uVar3 - param_2[3];
        return 0x8000000000000001;
      }
      param_1 = uVar3 + 1;
    } while (*(char *)((long)unaff_x20 + uVar3) != -0x80);
    in_x12 = unaff_x20 + ~uVar3 * 2;
    while( true ) {
      uVar4 = param_2[1];
      uVar5 = (ulong)*(uint *)(unaff_x20 + uVar3 * -2 + -2) * in_x9 & uVar4;
      lVar8 = *(long *)((long)unaff_x20 + uVar5);
      uVar6 = CONCAT17(-(lVar8 < 0),
                       CONCAT16(-((char)((ulong)lVar8 >> 0x30) < '\0'),
                                CONCAT15(-((char)((ulong)lVar8 >> 0x28) < '\0'),
                                         CONCAT14(-((char)((ulong)lVar8 >> 0x20) < '\0'),
                                                  CONCAT13(-((char)((ulong)lVar8 >> 0x18) < '\0'),
                                                           CONCAT12(-((char)((ulong)lVar8 >> 0x10) <
                                                                     '\0'),CONCAT11(-((char)((ulong)
                                                  lVar8 >> 8) < '\0'),-((char)lVar8 < '\0'))))))));
      uVar7 = uVar5;
      if (uVar6 == 0) {
        lVar8 = 8;
        do {
          uVar7 = uVar7 + lVar8 & uVar4;
          lVar9 = *(long *)((long)unaff_x20 + uVar7);
          uVar6 = CONCAT17(-(lVar9 < 0),
                           CONCAT16(-((char)((ulong)lVar9 >> 0x30) < '\0'),
                                    CONCAT15(-((char)((ulong)lVar9 >> 0x28) < '\0'),
                                             CONCAT14(-((char)((ulong)lVar9 >> 0x20) < '\0'),
                                                      CONCAT13(-((char)((ulong)lVar9 >> 0x18) < '\0'
                                                                ),CONCAT12(-((char)((ulong)lVar9 >>
                                                                                   0x10) < '\0'),
                                                                           CONCAT11(-((char)((ulong)
                                                  lVar9 >> 8) < '\0'),-((char)lVar9 < '\0'))))))));
          lVar8 = lVar8 + 8;
        } while (uVar6 == 0);
      }
      uVar6 = (uVar6 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar6 & 0x5555555555555555) << 1;
      uVar6 = (uVar6 & 0xcccccccccccccccc) >> 2 | (uVar6 & 0x3333333333333333) << 2;
      uVar6 = (uVar6 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar6 & 0xf0f0f0f0f0f0f0f) << 4;
      uVar6 = (uVar6 & 0xff00ff00ff00ff00) >> 8 | (uVar6 & 0xff00ff00ff00ff) << 8;
      uVar6 = (uVar6 & 0xffff0000ffff0000) >> 0x10 | (uVar6 & 0xffff0000ffff) << 0x10;
      uVar7 = uVar7 + ((ulong)LZCOUNT(uVar6 >> 0x20 | uVar6 << 0x20) >> 3) & uVar4;
      bVar2 = (byte)((ulong)*(uint *)(unaff_x20 + uVar3 * -2 + -2) * in_x9 >> 0x38);
      if (*(char *)((long)unaff_x20 + uVar7) < '\0') {
        uVar6 = uVar7 - uVar5 ^ uVar3 - uVar5;
      }
      else {
        lVar8 = *unaff_x20;
        uVar7 = CONCAT17(-(lVar8 < 0),
                         CONCAT16(-((char)((ulong)lVar8 >> 0x30) < '\0'),
                                  CONCAT15(-((char)((ulong)lVar8 >> 0x28) < '\0'),
                                           CONCAT14(-((char)((ulong)lVar8 >> 0x20) < '\0'),
                                                    CONCAT13(-((char)((ulong)lVar8 >> 0x18) < '\0'),
                                                             CONCAT12(-((char)((ulong)lVar8 >> 0x10)
                                                                       < '\0'),CONCAT11(-((char)((
                                                  ulong)lVar8 >> 8) < '\0'),-((char)lVar8 < '\0'))))
                                                  ))));
        uVar7 = (uVar7 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar7 & 0x5555555555555555) << 1;
        uVar7 = (uVar7 & 0xcccccccccccccccc) >> 2 | (uVar7 & 0x3333333333333333) << 2;
        uVar7 = (uVar7 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar7 & 0xf0f0f0f0f0f0f0f) << 4;
        uVar7 = (uVar7 & 0xff00ff00ff00ff00) >> 8 | (uVar7 & 0xff00ff00ff00ff) << 8;
        uVar7 = (uVar7 & 0xffff0000ffff0000) >> 0x10 | (uVar7 & 0xffff0000ffff) << 0x10;
        uVar7 = (ulong)LZCOUNT(uVar7 >> 0x20 | uVar7 << 0x20) >> 3;
        uVar6 = uVar7 - uVar5 ^ uVar3 - uVar5;
      }
      if ((uVar6 & uVar4) < 8) break;
      in_x16 = unaff_x20 + ~uVar7 * 2;
      cVar1 = *(char *)((long)unaff_x20 + uVar7);
      *(byte *)((long)unaff_x20 + uVar7) = bVar2 >> 1;
      unaff_x20 = (long *)*param_2;
      *(byte *)((long)unaff_x20 + (uVar7 - 8 & uVar4) + 8) = bVar2 >> 1;
      if (cVar1 == -1) {
        in_x13 = param_2[1] & uVar3 - 8;
        *(undefined1 *)((long)unaff_x20 + uVar3) = in_w10;
        goto code_r0x007ab838;
      }
      lVar8 = *in_x12;
      *in_x12 = *in_x16;
      *in_x16 = lVar8;
      lVar8 = in_x12[1];
      in_x12[1] = in_x16[1];
      in_x16[1] = lVar8;
      unaff_x20 = (long *)*param_2;
    }
    *(byte *)((long)unaff_x20 + uVar3) = bVar2 >> 1;
    unaff_x20 = (long *)*param_2;
    *(byte *)((long)unaff_x20 + (uVar4 & uVar3 - 8) + 8) = bVar2 >> 1;
  } while( true );
}

