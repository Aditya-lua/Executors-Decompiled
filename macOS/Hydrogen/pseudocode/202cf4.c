
void FUN_00202cf4(void)

{
  ulong uVar1;
  long *unaff_x19;
  long unaff_x20;
  long unaff_x21;
  long unaff_x22;
  long *unaff_x23;
  long *plVar2;
  int unaff_w24;
  ulong uVar3;
  long lVar4;
  
  do {
    do {
      plVar2 = unaff_x23 + 1;
      lVar4 = *unaff_x23;
      unaff_x22 = unaff_x22 + -0x6c0;
      uVar3 = CONCAT17(-(-1 < lVar4),
                       CONCAT16(-(-1 < (char)((ulong)lVar4 >> 0x30)),
                                CONCAT15(-(-1 < (char)((ulong)lVar4 >> 0x28)),
                                         CONCAT14(-(-1 < (char)((ulong)lVar4 >> 0x20)),
                                                  CONCAT13(-(-1 < (char)((ulong)lVar4 >> 0x18)),
                                                           CONCAT12(-(-1 < (char)((ulong)lVar4 >>
                                                                                 0x10)),
                                                                    CONCAT11(-(-1 < (char)((ulong)
                                                  lVar4 >> 8)),-(-1 < (char)lVar4)))))))) &
              0x8080808080808080;
      unaff_x23 = plVar2;
    } while (uVar3 == 0);
    do {
      uVar1 = (uVar3 >> 7 & 0xff00ff00ff00ff00) >> 8 | (uVar3 >> 7 & 0xff00ff00ff00ff) << 8;
      uVar1 = (uVar1 & 0xffff0000ffff0000) >> 0x10 | (uVar1 & 0xffff0000ffff) << 0x10;
      uVar3 = uVar3 - 1 & uVar3;
      unaff_x21 = unaff_x21 + -1;
      func_0x00202260(unaff_x22 +
                      (long)-(int)((ulong)LZCOUNT(uVar1 >> 0x20 | uVar1 << 0x20) >> 3) *
                      (long)unaff_w24 + -0xd8);
      if (unaff_x21 == 0) {
        lVar4 = unaff_x20 * 0xd9 + 0xe1;
        if (lVar4 == 0) {
          return;
        }
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
        (*(code *)PTR__free_00a24e58)(*unaff_x19 + unaff_x20 * -0xd8 + -0xd8,lVar4,8);
        return;
      }
    } while (uVar3 != 0);
  } while( true );
}

