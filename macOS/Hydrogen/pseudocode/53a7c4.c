
/* WARNING: Possible PIC construction at 0x0053a85c: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x0053a860) */

void FUN_0053a7c4(ulong param_1)

{
  ulong uVar1;
  long lVar2;
  long *unaff_x19;
  long unaff_x20;
  long unaff_x21;
  long unaff_x22;
  long *unaff_x23;
  long lVar3;
  undefined8 unaff_x29;
  undefined8 uVar4;
  long lVar5;
  undefined8 in_stack_00000050;
  undefined8 in_stack_00000058;
  undefined1 uStack0000000000000060;
  
  param_1 = param_1 & 0x8080808080808080;
  while( true ) {
    while (param_1 == 0) {
      lVar5 = *unaff_x23;
      unaff_x22 = unaff_x22 + -0x140;
      unaff_x23 = unaff_x23 + 1;
      param_1 = CONCAT17(-(-1 < lVar5),
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
    uVar1 = (param_1 >> 7 & 0xff00ff00ff00ff00) >> 8 | (param_1 >> 7 & 0xff00ff00ff00ff) << 8;
    uVar1 = (uVar1 & 0xffff0000ffff0000) >> 0x10 | (uVar1 & 0xffff0000ffff) << 0x10;
    lVar3 = unaff_x22 + (long)-(int)((ulong)LZCOUNT(uVar1 >> 0x20 | uVar1 << 0x20) >> 3) * 0x28;
    lVar5 = **(long **)(lVar3 + -0x28);
    **(long **)(lVar3 + -0x28) = lVar5 + -1;
    LORelease();
    if (lVar5 == 1) {
      func_0x005d2ac4();
    }
    lVar2 = *(long *)(lVar3 + -0x18);
    lVar5 = lVar2 * 0x21 + 0x29;
    if (lVar2 != 0 && lVar5 != 0) break;
    param_1 = param_1 - 1 & param_1;
    unaff_x21 = unaff_x21 + -1;
    if (unaff_x21 == 0) {
      lVar5 = unaff_x20 * 0x29 + 0x31;
      if (lVar5 == 0) {
        return;
      }
      lVar3 = *unaff_x19 + unaff_x20 * -0x28 + -0x28;
      register0x00000008 = (BADSPACEBASE *)&uStack0000000000000060;
      unaff_x29 = in_stack_00000050;
      uVar4 = in_stack_00000058;
code_r0x00187bd4:
      *(undefined8 *)((long)register0x00000008 + -0x10) = unaff_x29;
      *(undefined8 *)((long)register0x00000008 + -8) = uVar4;
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (*(code *)PTR__free_00a24e58)(lVar3,lVar5,8);
      return;
    }
  }
  lVar3 = *(long *)(lVar3 + -0x20) + lVar2 * -0x20 + -0x20;
  uVar4 = 0x53a860;
  goto code_r0x00187bd4;
}

