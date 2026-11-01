
void FUN_004b5b38(void)

{
  ulong uVar1;
  long *unaff_x19;
  long unaff_x21;
  long *plVar2;
  long *plVar3;
  ulong uVar4;
  long lVar5;
  long lStack0000000000000010;
  long lStack0000000000000018;
  
  plVar2 = (long *)*unaff_x19;
  plVar3 = plVar2 + 1;
  lVar5 = *plVar2;
  uVar4 = CONCAT17(-(-1 < lVar5),
                   CONCAT16(-(-1 < (char)((ulong)lVar5 >> 0x30)),
                            CONCAT15(-(-1 < (char)((ulong)lVar5 >> 0x28)),
                                     CONCAT14(-(-1 < (char)((ulong)lVar5 >> 0x20)),
                                              CONCAT13(-(-1 < (char)((ulong)lVar5 >> 0x18)),
                                                       CONCAT12(-(-1 < (char)((ulong)lVar5 >> 0x10))
                                                                ,CONCAT11(-(-1 < (char)((ulong)lVar5
                                                                                       >> 8)),
                                                                          -(-1 < (char)lVar5))))))))
          & 0x8080808080808080;
  do {
    while (uVar4 == 0) {
      lVar5 = *plVar3;
      plVar2 = plVar2 + -0x20;
      plVar3 = plVar3 + 1;
      uVar4 = CONCAT17(-(-1 < lVar5),
                       CONCAT16(-(-1 < (char)((ulong)lVar5 >> 0x30)),
                                CONCAT15(-(-1 < (char)((ulong)lVar5 >> 0x28)),
                                         CONCAT14(-(-1 < (char)((ulong)lVar5 >> 0x20)),
                                                  CONCAT13(-(-1 < (char)((ulong)lVar5 >> 0x18)),
                                                           CONCAT12(-(-1 < (char)((ulong)lVar5 >>
                                                                                 0x10)),
                                                                    CONCAT11(-(-1 < (char)((ulong)
                                                  lVar5 >> 8)),-(-1 < (char)lVar5)))))))) &
              0x8080808080808080;
    }
    uVar1 = (uVar4 >> 7 & 0xff00ff00ff00ff00) >> 8 | (uVar4 >> 7 & 0xff00ff00ff00ff) << 8;
    uVar1 = (uVar1 & 0xffff0000ffff0000) >> 0x10 | (uVar1 & 0xffff0000ffff) << 0x10;
    uVar4 = uVar4 - 1 & uVar4;
    uVar1 = LZCOUNT(uVar1 >> 0x20 | uVar1 << 0x20) & 0x78;
    unaff_x21 = unaff_x21 + -1;
    lStack0000000000000010 = (long)plVar2 + uVar1 * -4 + -0x20;
    lStack0000000000000018 = (long)plVar2 + uVar1 * -4 + -0x18;
    func_0x00465ccc();
  } while (unaff_x21 != 0);
  func_0x004661a4();
  return;
}

