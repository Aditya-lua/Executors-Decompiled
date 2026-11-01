
void FUN_0053a5b0(long param_1)

{
  ulong uVar1;
  long *unaff_x19;
  long unaff_x20;
  long unaff_x21;
  long unaff_x22;
  long *unaff_x23;
  int unaff_w24;
  ulong unaff_x25;
  long lVar2;
  
  for (; func_0x00538fa0(param_1), unaff_x21 != 0; unaff_x21 = unaff_x21 + -1) {
    while (unaff_x25 == 0) {
      lVar2 = *unaff_x23;
      unaff_x22 = unaff_x22 + -0x640;
      unaff_x23 = unaff_x23 + 1;
      unaff_x25 = CONCAT17(-(-1 < lVar2),
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
    uVar1 = (unaff_x25 & 0xaaaaaaaaaaaaaaaa) >> 1 | (unaff_x25 & 0x5555555555555555) << 1;
    uVar1 = (uVar1 & 0xcccccccccccccccc) >> 2 | (uVar1 & 0x3333333333333333) << 2;
    uVar1 = (uVar1 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar1 & 0xf0f0f0f0f0f0f0f) << 4;
    uVar1 = (uVar1 & 0xff00ff00ff00ff00) >> 8 | (uVar1 & 0xff00ff00ff00ff) << 8;
    uVar1 = (uVar1 & 0xffff0000ffff0000) >> 0x10 | (uVar1 & 0xffff0000ffff) << 0x10;
    unaff_x25 = unaff_x25 - 1 & unaff_x25;
    param_1 = unaff_x22 +
              (long)-(int)((ulong)LZCOUNT(uVar1 >> 0x20 | uVar1 << 0x20) >> 3) * (long)unaff_w24 +
              -200;
  }
  lVar2 = unaff_x20 * 0xc9 + 0xd1;
  if (lVar2 == 0) {
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(*unaff_x19 + unaff_x20 * -200 + -200,lVar2,8);
  return;
}

