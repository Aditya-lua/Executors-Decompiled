
undefined8 FUN_0079c9d4(long *param_1)

{
  long *plVar1;
  long *plVar2;
  ulong uVar3;
  byte bVar4;
  ulong uVar5;
  ulong uVar6;
  long lVar7;
  ulong uVar8;
  long lVar9;
  long *unaff_x19;
  long *unaff_x21;
  ulong unaff_x22;
  long unaff_x24;
  long unaff_x25;
  long unaff_x26;
  ulong unaff_x28;
  long lVar10;
  long lVar11;
  long in_stack_00000000;
  
  do {
    while (unaff_x28 == 0) {
      param_1 = param_1 + 1;
      lVar10 = *param_1;
      unaff_x25 = unaff_x25 + 8;
      unaff_x28 = CONCAT17(-(-1 < lVar10),
                           CONCAT16(-(-1 < (char)((ulong)lVar10 >> 0x30)),
                                    CONCAT15(-(-1 < (char)((ulong)lVar10 >> 0x28)),
                                             CONCAT14(-(-1 < (char)((ulong)lVar10 >> 0x20)),
                                                      CONCAT13(-(-1 < (char)((ulong)lVar10 >> 0x18))
                                                               ,CONCAT12(-(-1 < (char)((ulong)lVar10
                                                                                      >> 0x10)),
                                                                         CONCAT11(-(-1 < (char)((
                                                  ulong)lVar10 >> 8)),-(-1 < (char)lVar10)))))))) &
                  0x8080808080808080;
    }
    uVar3 = (unaff_x28 & 0xaaaaaaaaaaaaaaaa) >> 1 | (unaff_x28 & 0x5555555555555555) << 1;
    uVar3 = (uVar3 & 0xcccccccccccccccc) >> 2 | (uVar3 & 0x3333333333333333) << 2;
    uVar3 = (uVar3 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar3 & 0xf0f0f0f0f0f0f0f) << 4;
    uVar3 = (uVar3 & 0xff00ff00ff00ff00) >> 8 | (uVar3 & 0xff00ff00ff00ff) << 8;
    uVar3 = (uVar3 & 0xffff0000ffff0000) >> 0x10 | (uVar3 & 0xffff0000ffff) << 0x10;
    uVar5 = func_0x00192570();
    uVar6 = uVar5 & unaff_x22;
    lVar10 = *(long *)((long)unaff_x21 + uVar6);
    uVar8 = CONCAT17(-(lVar10 < 0),
                     CONCAT16(-((char)((ulong)lVar10 >> 0x30) < '\0'),
                              CONCAT15(-((char)((ulong)lVar10 >> 0x28) < '\0'),
                                       CONCAT14(-((char)((ulong)lVar10 >> 0x20) < '\0'),
                                                CONCAT13(-((char)((ulong)lVar10 >> 0x18) < '\0'),
                                                         CONCAT12(-((char)((ulong)lVar10 >> 0x10) <
                                                                   '\0'),CONCAT11(-((char)((ulong)
                                                  lVar10 >> 8) < '\0'),-((char)lVar10 < '\0'))))))))
    ;
    if (uVar8 == 0) {
      lVar10 = 8;
      do {
        uVar6 = uVar6 + lVar10 & unaff_x22;
        lVar9 = *(long *)((long)unaff_x21 + uVar6);
        uVar8 = CONCAT17(-(lVar9 < 0),
                         CONCAT16(-((char)((ulong)lVar9 >> 0x30) < '\0'),
                                  CONCAT15(-((char)((ulong)lVar9 >> 0x28) < '\0'),
                                           CONCAT14(-((char)((ulong)lVar9 >> 0x20) < '\0'),
                                                    CONCAT13(-((char)((ulong)lVar9 >> 0x18) < '\0'),
                                                             CONCAT12(-((char)((ulong)lVar9 >> 0x10)
                                                                       < '\0'),CONCAT11(-((char)((
                                                  ulong)lVar9 >> 8) < '\0'),-((char)lVar9 < '\0'))))
                                                  ))));
        lVar10 = lVar10 + 8;
      } while (uVar8 == 0);
    }
    uVar8 = (uVar8 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar8 & 0x5555555555555555) << 1;
    uVar8 = (uVar8 & 0xcccccccccccccccc) >> 2 | (uVar8 & 0x3333333333333333) << 2;
    uVar8 = (uVar8 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar8 & 0xf0f0f0f0f0f0f0f) << 4;
    uVar8 = (uVar8 & 0xff00ff00ff00ff00) >> 8 | (uVar8 & 0xff00ff00ff00ff) << 8;
    uVar8 = (uVar8 & 0xffff0000ffff0000) >> 0x10 | (uVar8 & 0xffff0000ffff) << 0x10;
    uVar6 = uVar6 + ((ulong)LZCOUNT(uVar8 >> 0x20 | uVar8 << 0x20) >> 3) & unaff_x22;
    if (-1 < *(char *)((long)unaff_x21 + uVar6)) {
      lVar10 = *unaff_x21;
      uVar6 = CONCAT17(-(lVar10 < 0),
                       CONCAT16(-((char)((ulong)lVar10 >> 0x30) < '\0'),
                                CONCAT15(-((char)((ulong)lVar10 >> 0x28) < '\0'),
                                         CONCAT14(-((char)((ulong)lVar10 >> 0x20) < '\0'),
                                                  CONCAT13(-((char)((ulong)lVar10 >> 0x18) < '\0'),
                                                           CONCAT12(-((char)((ulong)lVar10 >> 0x10)
                                                                     < '\0'),CONCAT11(-((char)((
                                                  ulong)lVar10 >> 8) < '\0'),-((char)lVar10 < '\0'))
                                                  ))))));
      uVar6 = (uVar6 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar6 & 0x5555555555555555) << 1;
      uVar6 = (uVar6 & 0xcccccccccccccccc) >> 2 | (uVar6 & 0x3333333333333333) << 2;
      uVar6 = (uVar6 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar6 & 0xf0f0f0f0f0f0f0f) << 4;
      uVar6 = (uVar6 & 0xff00ff00ff00ff00) >> 8 | (uVar6 & 0xff00ff00ff00ff) << 8;
      uVar6 = (uVar6 & 0xffff0000ffff0000) >> 0x10 | (uVar6 & 0xffff0000ffff) << 0x10;
      uVar6 = (ulong)LZCOUNT(uVar6 >> 0x20 | uVar6 << 0x20) >> 3;
    }
    unaff_x28 = unaff_x28 - 1 & unaff_x28;
    bVar4 = (byte)(uVar5 >> 0x38);
    *(byte *)((long)unaff_x21 + uVar6) = bVar4 >> 1;
    *(byte *)(unaff_x26 + (uVar6 - 8 & unaff_x22)) = bVar4 >> 1;
    lVar10 = *unaff_x19;
    plVar1 = (long *)(lVar10 + ~(unaff_x25 + ((ulong)LZCOUNT(uVar3 >> 0x20 | uVar3 << 0x20) >> 3)) *
                               0x20);
    lVar11 = *plVar1;
    lVar7 = plVar1[3];
    lVar9 = plVar1[2];
    plVar2 = unaff_x21 + ~uVar6 * 4;
    plVar2[1] = plVar1[1];
    *plVar2 = lVar11;
    plVar2[3] = lVar7;
    plVar2[2] = lVar9;
    unaff_x24 = unaff_x24 + -1;
  } while (unaff_x24 != 0);
  lVar9 = unaff_x19[1];
  *unaff_x19 = (long)unaff_x21;
  unaff_x19[1] = unaff_x22;
  unaff_x19[2] = in_stack_00000000 - unaff_x19[3];
  unaff_x19[3] = unaff_x19[3];
  if (lVar9 != 0) {
    lVar7 = lVar9 * 0x20 + 0x20;
    lVar9 = lVar9 + lVar7 + 9;
    if (lVar9 != 0) {
      func_0x00187bd4(lVar10 - lVar7,lVar9,8);
    }
  }
  return 0x8000000000000001;
}

