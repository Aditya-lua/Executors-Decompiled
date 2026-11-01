
void FUN_0053af5c(long param_1)

{
  ulong uVar1;
  long *plVar2;
  long *unaff_x19;
  long unaff_x20;
  long unaff_x21;
  long unaff_x22;
  long unaff_x23;
  long *unaff_x24;
  long unaff_x25;
  ulong unaff_x26;
  long lVar3;
  
  while( true ) {
    if (param_1 == 1) {
      func_0x005d2ac4();
    }
    plVar2 = *(long **)(unaff_x20 + -8);
    lVar3 = *plVar2 + -1;
    *plVar2 = lVar3;
    if (lVar3 == 0) {
      func_0x0057e714((undefined8 *)(unaff_x20 + -8));
    }
    if (unaff_x22 == 1) break;
    unaff_x22 = unaff_x22 + -1;
    unaff_x26 = unaff_x26 - 1 & unaff_x26;
    while (unaff_x26 == 0) {
      lVar3 = *unaff_x24;
      unaff_x23 = unaff_x23 + -0x80;
      unaff_x24 = unaff_x24 + 1;
      unaff_x26 = CONCAT17(-(-1 < lVar3),
                           CONCAT16(-(-1 < (char)((ulong)lVar3 >> 0x30)),
                                    CONCAT15(-(-1 < (char)((ulong)lVar3 >> 0x28)),
                                             CONCAT14(-(-1 < (char)((ulong)lVar3 >> 0x20)),
                                                      CONCAT13(-(-1 < (char)((ulong)lVar3 >> 0x18)),
                                                               CONCAT12(-(-1 < (char)((ulong)lVar3
                                                                                     >> 0x10)),
                                                                        CONCAT11(-(-1 < (char)((
                                                  ulong)lVar3 >> 8)),-(-1 < (char)lVar3)))))))) &
                  0x8080808080808080;
    }
    uVar1 = (unaff_x26 & 0xaaaaaaaaaaaaaaaa) >> 1 | (unaff_x26 & 0x5555555555555555) << 1;
    uVar1 = (uVar1 & 0xcccccccccccccccc) >> 2 | (uVar1 & 0x3333333333333333) << 2;
    uVar1 = (uVar1 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar1 & 0xf0f0f0f0f0f0f0f) << 4;
    uVar1 = (uVar1 & 0xff00ff00ff00ff00) >> 8 | (uVar1 & 0xff00ff00ff00ff) << 8;
    uVar1 = (uVar1 & 0xffff0000ffff0000) >> 0x10 | (uVar1 & 0xffff0000ffff) << 0x10;
    unaff_x20 = unaff_x23 + (LZCOUNT(uVar1 >> 0x20 | uVar1 << 0x20) & 0x78U) * -2;
    param_1 = **(long **)(unaff_x20 + -0x10);
    **(long **)(unaff_x20 + -0x10) = param_1 + unaff_x25;
    LORelease();
  }
  lVar3 = unaff_x21 * 0x11 + 0x19;
  if (lVar3 == 0) {
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(*unaff_x19 + unaff_x21 * -0x10 + -0x10,lVar3,8);
  return;
}

