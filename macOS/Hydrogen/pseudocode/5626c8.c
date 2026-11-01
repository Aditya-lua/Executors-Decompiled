
undefined8 FUN_005626c8(long param_1,long param_2)

{
  long *in_x9;
  undefined1 in_w10;
  ulong in_x11;
  ulong in_x12;
  ulong uVar1;
  long unaff_x19;
  long lVar2;
  
  uVar1 = (ulong)*(char *)((long)in_x9 + in_x12);
  if (-1 < *(char *)((long)in_x9 + in_x12)) {
    lVar2 = *in_x9;
    uVar1 = CONCAT17(-(lVar2 < 0),
                     CONCAT16(-((char)((ulong)lVar2 >> 0x30) < '\0'),
                              CONCAT15(-((char)((ulong)lVar2 >> 0x28) < '\0'),
                                       CONCAT14(-((char)((ulong)lVar2 >> 0x20) < '\0'),
                                                CONCAT13(-((char)((ulong)lVar2 >> 0x18) < '\0'),
                                                         CONCAT12(-((char)((ulong)lVar2 >> 0x10) <
                                                                   '\0'),CONCAT11(-((char)((ulong)
                                                  lVar2 >> 8) < '\0'),-((char)lVar2 < '\0'))))))));
    uVar1 = (uVar1 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar1 & 0x5555555555555555) << 1;
    uVar1 = (uVar1 & 0xcccccccccccccccc) >> 2 | (uVar1 & 0x3333333333333333) << 2;
    uVar1 = (uVar1 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar1 & 0xf0f0f0f0f0f0f0f) << 4;
    uVar1 = (uVar1 & 0xff00ff00ff00ff00) >> 8 | (uVar1 & 0xff00ff00ff00ff) << 8;
    uVar1 = (uVar1 & 0xffff0000ffff0000) >> 0x10 | (uVar1 & 0xffff0000ffff) << 0x10;
    in_x12 = (ulong)LZCOUNT(uVar1 >> 0x20 | uVar1 << 0x20) >> 3;
    uVar1 = (ulong)*(byte *)((long)in_x9 + in_x12);
  }
  *(undefined1 *)((long)in_x9 + in_x12) = in_w10;
  *(undefined1 *)((long)in_x9 + (in_x12 - 8 & in_x11) + 8) = in_w10;
  *(ulong *)(param_2 + 0x10) = *(long *)(param_2 + 0x10) - (uVar1 & 1);
  *(long *)(param_2 + 0x18) = *(long *)(param_2 + 0x18) + 1;
  in_x9[in_x12 * -2 + -2] = param_1;
  in_x9[in_x12 * -2 + -1] = unaff_x19;
  return 0;
}

