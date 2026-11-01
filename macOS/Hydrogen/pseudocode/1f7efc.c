
/* WARNING: Possible PIC construction at 0x001f7f88: Changing call to branch */

void FUN_001f7efc(void)

{
  ulong uVar1;
  long *unaff_x19;
  long unaff_x20;
  long lVar2;
  long *plVar3;
  long *plVar4;
  ulong uVar5;
  undefined8 unaff_x29;
  undefined8 uVar6;
  long lVar7;
  undefined8 in_stack_00000040;
  undefined8 in_stack_00000048;
  undefined1 uStack0000000000000050;
  
  lVar2 = unaff_x19[7];
  if (lVar2 != 0) {
    plVar3 = (long *)unaff_x19[4];
    plVar4 = plVar3 + 1;
    lVar7 = *plVar3;
    uVar5 = CONCAT17(-(-1 < lVar7),
                     CONCAT16(-(-1 < (char)((ulong)lVar7 >> 0x30)),
                              CONCAT15(-(-1 < (char)((ulong)lVar7 >> 0x28)),
                                       CONCAT14(-(-1 < (char)((ulong)lVar7 >> 0x20)),
                                                CONCAT13(-(-1 < (char)((ulong)lVar7 >> 0x18)),
                                                         CONCAT12(-(-1 < (char)((ulong)lVar7 >> 0x10
                                                                               )),
                                                                  CONCAT11(-(-1 < (char)((ulong)
                                                  lVar7 >> 8)),-(-1 < (char)lVar7)))))))) &
            0x8080808080808080;
    do {
      while (uVar5 == 0) {
        lVar7 = *plVar4;
        plVar3 = plVar3 + -0xd8;
        plVar4 = plVar4 + 1;
        uVar5 = CONCAT17(-(-1 < lVar7),
                         CONCAT16(-(-1 < (char)((ulong)lVar7 >> 0x30)),
                                  CONCAT15(-(-1 < (char)((ulong)lVar7 >> 0x28)),
                                           CONCAT14(-(-1 < (char)((ulong)lVar7 >> 0x20)),
                                                    CONCAT13(-(-1 < (char)((ulong)lVar7 >> 0x18)),
                                                             CONCAT12(-(-1 < (char)((ulong)lVar7 >>
                                                                                   0x10)),
                                                                      CONCAT11(-(-1 < (char)((ulong)
                                                  lVar7 >> 8)),-(-1 < (char)lVar7)))))))) &
                0x8080808080808080;
      }
      uVar1 = (uVar5 >> 7 & 0xff00ff00ff00ff00) >> 8 | (uVar5 >> 7 & 0xff00ff00ff00ff) << 8;
      uVar1 = (uVar1 & 0xffff0000ffff0000) >> 0x10 | (uVar1 & 0xffff0000ffff) << 0x10;
      func_0x00202260(plVar3 + (long)-(int)((ulong)LZCOUNT(uVar1 >> 0x20 | uVar1 << 0x20) >> 3) *
                               0x1b + -0x1b);
      uVar5 = uVar5 - 1 & uVar5;
      lVar2 = lVar2 + -1;
    } while (lVar2 != 0);
  }
  lVar2 = unaff_x20 * 0xd9 + 0xe1;
  if (lVar2 == 0) {
    func_0x00243d10();
    if (*unaff_x19 == 0) {
      return;
    }
    lVar7 = unaff_x19[1];
    lVar2 = *unaff_x19 << 5;
    register0x00000008 = (BADSPACEBASE *)&uStack0000000000000050;
    unaff_x29 = in_stack_00000040;
    uVar6 = in_stack_00000048;
  }
  else {
    lVar7 = unaff_x19[4] + unaff_x20 * -0xd8 + -0xd8;
    uVar6 = 0x1f7f8c;
  }
  *(undefined8 *)((long)register0x00000008 + -0x10) = unaff_x29;
  *(undefined8 *)((long)register0x00000008 + -8) = uVar6;
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(lVar7,lVar2,8);
  return;
}

