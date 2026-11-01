
void FUN_0053b1bc(long param_1)

{
  ulong uVar1;
  long *unaff_x19;
  long unaff_x20;
  long unaff_x21;
  long unaff_x22;
  long *unaff_x23;
  int unaff_w24;
  long unaff_x25;
  ulong unaff_x26;
  long unaff_x27;
  long lVar2;
  
  while( true ) {
    if (param_1 == 1) {
      func_0x005d2ac4();
    }
    unaff_x26 = unaff_x26 - 1 & unaff_x26;
    unaff_x21 = unaff_x21 + -1;
    func_0x00539318(unaff_x27 + -0x20);
    if (unaff_x21 == 0) break;
    while (unaff_x26 == 0) {
      lVar2 = *unaff_x23;
      unaff_x22 = unaff_x22 + -0x140;
      unaff_x23 = unaff_x23 + 1;
      unaff_x26 = CONCAT17(-(-1 < lVar2),
                           CONCAT16(-(-1 < (char)((ulong)lVar2 >> 0x30)),
                                    CONCAT15(-(-1 < (char)((ulong)lVar2 >> 0x28)),
                                             CONCAT14(-(-1 < (char)((ulong)lVar2 >> 0x20)),
                                                      CONCAT13(-(-1 < (char)((ulong)lVar2 >> 0x18)),
                                                               CONCAT12(-(-1 < (char)((ulong)lVar2
                                                                                     >> 0x10)),
                                                                        CONCAT11(-(-1 < (char)((
                                                  ulong)lVar2 >> 8)),-(-1 < (char)lVar2)))))))) &
                  0x8080808080808080;
    }
    uVar1 = (unaff_x26 & 0xaaaaaaaaaaaaaaaa) >> 1 | (unaff_x26 & 0x5555555555555555) << 1;
    uVar1 = (uVar1 & 0xcccccccccccccccc) >> 2 | (uVar1 & 0x3333333333333333) << 2;
    uVar1 = (uVar1 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar1 & 0xf0f0f0f0f0f0f0f) << 4;
    uVar1 = (uVar1 & 0xff00ff00ff00ff00) >> 8 | (uVar1 & 0xff00ff00ff00ff) << 8;
    uVar1 = (uVar1 & 0xffff0000ffff0000) >> 0x10 | (uVar1 & 0xffff0000ffff) << 0x10;
    unaff_x27 = unaff_x22 +
                (long)-(int)((ulong)LZCOUNT(uVar1 >> 0x20 | uVar1 << 0x20) >> 3) * (long)unaff_w24;
    param_1 = **(long **)(unaff_x27 + -0x28);
    **(long **)(unaff_x27 + -0x28) = param_1 + unaff_x25;
    LORelease();
  }
  lVar2 = unaff_x20 * 0x29 + 0x31;
  if (lVar2 == 0) {
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(*unaff_x19 + unaff_x20 * -0x28 + -0x28,lVar2,8);
  return;
}

