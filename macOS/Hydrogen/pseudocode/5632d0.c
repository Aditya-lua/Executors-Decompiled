
void FUN_005632d0(long param_1,long param_2)

{
  byte bVar1;
  long *in_x9;
  undefined1 in_w10;
  ulong in_x11;
  ulong uVar2;
  long *unaff_x19;
  undefined8 *unaff_x20;
  long lVar3;
  long lVar4;
  long lVar5;
  long lVar6;
  long lVar7;
  long lVar8;
  long lVar9;
  
  lVar3 = *in_x9;
  uVar2 = CONCAT17(-(lVar3 < 0),
                   CONCAT16(-((char)((ulong)lVar3 >> 0x30) < '\0'),
                            CONCAT15(-((char)((ulong)lVar3 >> 0x28) < '\0'),
                                     CONCAT14(-((char)((ulong)lVar3 >> 0x20) < '\0'),
                                              CONCAT13(-((char)((ulong)lVar3 >> 0x18) < '\0'),
                                                       CONCAT12(-((char)((ulong)lVar3 >> 0x10) <
                                                                 '\0'),CONCAT11(-((char)((ulong)
                                                  lVar3 >> 8) < '\0'),-((char)lVar3 < '\0'))))))));
  uVar2 = (uVar2 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar2 & 0x5555555555555555) << 1;
  uVar2 = (uVar2 & 0xcccccccccccccccc) >> 2 | (uVar2 & 0x3333333333333333) << 2;
  uVar2 = (uVar2 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar2 & 0xf0f0f0f0f0f0f0f) << 4;
  uVar2 = (uVar2 & 0xff00ff00ff00ff00) >> 8 | (uVar2 & 0xff00ff00ff00ff) << 8;
  uVar2 = (uVar2 & 0xffff0000ffff0000) >> 0x10 | (uVar2 & 0xffff0000ffff) << 0x10;
  uVar2 = (ulong)LZCOUNT(uVar2 >> 0x20 | uVar2 << 0x20) >> 3;
  bVar1 = *(byte *)((long)in_x9 + uVar2);
  lVar3 = *(long *)(param_2 + 0x10);
  lVar4 = *(long *)(param_2 + 0x18);
  *(undefined1 *)((long)in_x9 + uVar2) = in_w10;
  *(undefined1 *)((long)in_x9 + (uVar2 - 8 & in_x11) + 8) = in_w10;
  *(ulong *)(param_2 + 0x10) = lVar3 - ((ulong)bVar1 & 1);
  *(long *)(param_2 + 0x18) = lVar4 + 1;
  in_x9[uVar2 * -9 + -9] = param_1;
  lVar4 = unaff_x19[1];
  lVar3 = *unaff_x19;
  lVar6 = unaff_x19[3];
  lVar5 = unaff_x19[2];
  lVar7 = unaff_x19[4];
  lVar9 = unaff_x19[7];
  lVar8 = unaff_x19[6];
  in_x9[uVar2 * -9 + -3] = unaff_x19[5];
  in_x9[uVar2 * -9 + -4] = lVar7;
  in_x9[uVar2 * -9 + -1] = lVar9;
  in_x9[uVar2 * -9 + -2] = lVar8;
  in_x9[uVar2 * -9 + -7] = lVar4;
  in_x9[uVar2 * -9 + -8] = lVar3;
  in_x9[uVar2 * -9 + -5] = lVar6;
  in_x9[uVar2 * -9 + -6] = lVar5;
  *unaff_x20 = 0xc;
  return;
}

