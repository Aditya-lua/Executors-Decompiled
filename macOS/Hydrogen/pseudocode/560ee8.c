
void FUN_00560ee8(void)

{
  ulong uVar1;
  long *plVar2;
  long unaff_x19;
  long unaff_x20;
  long unaff_x21;
  long unaff_x22;
  long *unaff_x23;
  long unaff_x24;
  ulong unaff_x25;
  long lVar3;
  
  do {
    func_0x005d2ac4();
    do {
      unaff_x25 = unaff_x25 - 1 & unaff_x25;
      unaff_x21 = unaff_x21 + -1;
      if (unaff_x21 == 0) {
        lVar3 = unaff_x20 * 9 + 0x11;
        if (lVar3 == 0) {
          return;
        }
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
        (*(code *)PTR__free_00a24e58)(*(long *)(unaff_x19 + 0x20) + unaff_x20 * -8 + -8,lVar3,8);
        return;
      }
      while (unaff_x25 == 0) {
        lVar3 = *unaff_x23;
        unaff_x22 = unaff_x22 + -0x40;
        unaff_x23 = unaff_x23 + 1;
        unaff_x25 = CONCAT17(-(-1 < lVar3),
                             CONCAT16(-(-1 < (char)((ulong)lVar3 >> 0x30)),
                                      CONCAT15(-(-1 < (char)((ulong)lVar3 >> 0x28)),
                                               CONCAT14(-(-1 < (char)((ulong)lVar3 >> 0x20)),
                                                        CONCAT13(-(-1 < (char)((ulong)lVar3 >> 0x18)
                                                                  ),CONCAT12(-(-1 < (char)((ulong)
                                                  lVar3 >> 0x10)),
                                                  CONCAT11(-(-1 < (char)((ulong)lVar3 >> 8)),
                                                           -(-1 < (char)lVar3)))))))) &
                    0x8080808080808080;
      }
      uVar1 = (unaff_x25 & 0xaaaaaaaaaaaaaaaa) >> 1 | (unaff_x25 & 0x5555555555555555) << 1;
      uVar1 = (uVar1 & 0xcccccccccccccccc) >> 2 | (uVar1 & 0x3333333333333333) << 2;
      uVar1 = (uVar1 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar1 & 0xf0f0f0f0f0f0f0f) << 4;
      uVar1 = (uVar1 & 0xff00ff00ff00ff00) >> 8 | (uVar1 & 0xff00ff00ff00ff) << 8;
      uVar1 = (uVar1 & 0xffff0000ffff0000) >> 0x10 | (uVar1 & 0xffff0000ffff) << 0x10;
      plVar2 = *(long **)((unaff_x22 - (LZCOUNT(uVar1 >> 0x20 | uVar1 << 0x20) & 0x78U)) + -8);
      lVar3 = *plVar2;
      *plVar2 = lVar3 + unaff_x24;
      LORelease();
    } while (lVar3 != 1);
  } while( true );
}

