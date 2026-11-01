
undefined8 FUN_007acd70(ulong param_1,ulong param_2)

{
  long *plVar1;
  char cVar2;
  byte bVar3;
  long lVar4;
  ulong uVar5;
  ulong uVar6;
  ulong in_x10;
  long *unaff_x19;
  ulong unaff_x21;
  long *unaff_x22;
  ulong unaff_x23;
  undefined1 unaff_w24;
  ulong unaff_x25;
  long *unaff_x26;
  ulong uVar7;
  long lVar8;
  
  do {
    plVar1 = unaff_x22 + ~in_x10 * 2;
    cVar2 = *(char *)((long)unaff_x22 + in_x10);
    bVar3 = (byte)(param_2 >> 0x38);
    *(byte *)((long)unaff_x22 + in_x10) = bVar3 >> 1;
    unaff_x22 = (long *)*unaff_x19;
    *(byte *)((long)unaff_x22 + (in_x10 - 8 & param_1) + 8) = bVar3 >> 1;
    if (cVar2 == -1) {
      uVar6 = unaff_x19[1];
      *(undefined1 *)((long)unaff_x22 + unaff_x25) = unaff_w24;
      *(undefined1 *)((long)unaff_x22 + (uVar6 & unaff_x25 - 8) + 8) = unaff_w24;
      lVar4 = *unaff_x26;
      plVar1[1] = unaff_x26[1];
      *plVar1 = lVar4;
      goto LAB_007ace3c;
    }
    lVar4 = *unaff_x26;
    *unaff_x26 = *plVar1;
    *plVar1 = lVar4;
    lVar4 = unaff_x26[1];
    unaff_x26[1] = plVar1[1];
    plVar1[1] = lVar4;
    unaff_x22 = (long *)*unaff_x19;
    while( true ) {
      param_2 = func_0x005763e4();
      param_1 = unaff_x19[1];
      uVar5 = param_1 & param_2;
      lVar4 = *(long *)((long)unaff_x22 + uVar5);
      uVar7 = CONCAT17(-(lVar4 < 0),
                       CONCAT16(-((char)((ulong)lVar4 >> 0x30) < '\0'),
                                CONCAT15(-((char)((ulong)lVar4 >> 0x28) < '\0'),
                                         CONCAT14(-((char)((ulong)lVar4 >> 0x20) < '\0'),
                                                  CONCAT13(-((char)((ulong)lVar4 >> 0x18) < '\0'),
                                                           CONCAT12(-((char)((ulong)lVar4 >> 0x10) <
                                                                     '\0'),CONCAT11(-((char)((ulong)
                                                  lVar4 >> 8) < '\0'),-((char)lVar4 < '\0'))))))));
      uVar6 = uVar5;
      if (uVar7 == 0) {
        lVar4 = 8;
        do {
          uVar6 = uVar6 + lVar4 & param_1;
          lVar8 = *(long *)((long)unaff_x22 + uVar6);
          uVar7 = CONCAT17(-(lVar8 < 0),
                           CONCAT16(-((char)((ulong)lVar8 >> 0x30) < '\0'),
                                    CONCAT15(-((char)((ulong)lVar8 >> 0x28) < '\0'),
                                             CONCAT14(-((char)((ulong)lVar8 >> 0x20) < '\0'),
                                                      CONCAT13(-((char)((ulong)lVar8 >> 0x18) < '\0'
                                                                ),CONCAT12(-((char)((ulong)lVar8 >>
                                                                                   0x10) < '\0'),
                                                                           CONCAT11(-((char)((ulong)
                                                  lVar8 >> 8) < '\0'),-((char)lVar8 < '\0'))))))));
          lVar4 = lVar4 + 8;
        } while (uVar7 == 0);
      }
      uVar7 = (uVar7 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar7 & 0x5555555555555555) << 1;
      uVar7 = (uVar7 & 0xcccccccccccccccc) >> 2 | (uVar7 & 0x3333333333333333) << 2;
      uVar7 = (uVar7 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar7 & 0xf0f0f0f0f0f0f0f) << 4;
      uVar7 = (uVar7 & 0xff00ff00ff00ff00) >> 8 | (uVar7 & 0xff00ff00ff00ff) << 8;
      uVar7 = (uVar7 & 0xffff0000ffff0000) >> 0x10 | (uVar7 & 0xffff0000ffff) << 0x10;
      in_x10 = uVar6 + ((ulong)LZCOUNT(uVar7 >> 0x20 | uVar7 << 0x20) >> 3) & param_1;
      if (*(char *)((long)unaff_x22 + in_x10) < '\0') {
        uVar6 = in_x10 - uVar5 ^ unaff_x25 - uVar5;
      }
      else {
        lVar4 = *unaff_x22;
        uVar6 = CONCAT17(-(lVar4 < 0),
                         CONCAT16(-((char)((ulong)lVar4 >> 0x30) < '\0'),
                                  CONCAT15(-((char)((ulong)lVar4 >> 0x28) < '\0'),
                                           CONCAT14(-((char)((ulong)lVar4 >> 0x20) < '\0'),
                                                    CONCAT13(-((char)((ulong)lVar4 >> 0x18) < '\0'),
                                                             CONCAT12(-((char)((ulong)lVar4 >> 0x10)
                                                                       < '\0'),CONCAT11(-((char)((
                                                  ulong)lVar4 >> 8) < '\0'),-((char)lVar4 < '\0'))))
                                                  ))));
        uVar6 = (uVar6 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar6 & 0x5555555555555555) << 1;
        uVar6 = (uVar6 & 0xcccccccccccccccc) >> 2 | (uVar6 & 0x3333333333333333) << 2;
        uVar6 = (uVar6 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar6 & 0xf0f0f0f0f0f0f0f) << 4;
        uVar6 = (uVar6 & 0xff00ff00ff00ff00) >> 8 | (uVar6 & 0xff00ff00ff00ff) << 8;
        uVar6 = (uVar6 & 0xffff0000ffff0000) >> 0x10 | (uVar6 & 0xffff0000ffff) << 0x10;
        in_x10 = (ulong)LZCOUNT(uVar6 >> 0x20 | uVar6 << 0x20) >> 3;
        uVar6 = in_x10 - uVar5 ^ unaff_x25 - uVar5;
      }
      if (7 < (uVar6 & param_1)) break;
      bVar3 = (byte)(param_2 >> 0x38);
      *(byte *)((long)unaff_x22 + unaff_x25) = bVar3 >> 1;
      unaff_x22 = (long *)*unaff_x19;
      *(byte *)((long)unaff_x22 + (param_1 & unaff_x25 - 8) + 8) = bVar3 >> 1;
LAB_007ace3c:
      do {
        unaff_x25 = unaff_x23;
        if (unaff_x21 <= unaff_x25) {
          uVar6 = unaff_x19[1];
          if (7 < uVar6) {
            uVar6 = (uVar6 + 1 >> 3) * 7;
          }
          unaff_x19[2] = uVar6 - unaff_x19[3];
          return 0x8000000000000001;
        }
        unaff_x23 = unaff_x25 + 1;
      } while (*(char *)((long)unaff_x22 + unaff_x25) != -0x80);
      unaff_x26 = unaff_x22 + ~unaff_x25 * 2;
    }
  } while( true );
}

