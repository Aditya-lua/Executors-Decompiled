
/* WARNING: Possible PIC construction at 0x0057e7d8: Changing call to branch */

void FUN_0057e70c(void)

{
  ulong uVar1;
  undefined1 *puVar2;
  long *plVar3;
  long *plVar4;
  long lVar5;
  long lVar6;
  long lVar7;
  long *plVar8;
  ulong uVar9;
  undefined1 *unaff_x29;
  long lVar10;
  undefined1 auStack_d0 [128];
  undefined8 uStack_8;
  
  plVar3 = (long *)__Unwind_Resume();
  uStack_8 = 0x57e714;
  puVar2 = auStack_d0;
  lVar5 = *plVar3;
  lVar6 = *(long *)(lVar5 + 0x20);
  if (lVar6 != 0) {
    lVar7 = *(long *)(lVar5 + 0x30);
    if (lVar7 != 0) {
      plVar3 = *(long **)(lVar5 + 0x18);
      plVar8 = plVar3 + 1;
      lVar10 = *plVar3;
      uVar9 = CONCAT17(-(-1 < lVar10),
                       CONCAT16(-(-1 < (char)((ulong)lVar10 >> 0x30)),
                                CONCAT15(-(-1 < (char)((ulong)lVar10 >> 0x28)),
                                         CONCAT14(-(-1 < (char)((ulong)lVar10 >> 0x20)),
                                                  CONCAT13(-(-1 < (char)((ulong)lVar10 >> 0x18)),
                                                           CONCAT12(-(-1 < (char)((ulong)lVar10 >>
                                                                                 0x10)),
                                                                    CONCAT11(-(-1 < (char)((ulong)
                                                  lVar10 >> 8)),-(-1 < (char)lVar10)))))))) &
              0x8080808080808080;
      do {
        while (uVar9 == 0) {
          lVar10 = *plVar8;
          plVar3 = plVar3 + -8;
          plVar8 = plVar8 + 1;
          uVar9 = CONCAT17(-(-1 < lVar10),
                           CONCAT16(-(-1 < (char)((ulong)lVar10 >> 0x30)),
                                    CONCAT15(-(-1 < (char)((ulong)lVar10 >> 0x28)),
                                             CONCAT14(-(-1 < (char)((ulong)lVar10 >> 0x20)),
                                                      CONCAT13(-(-1 < (char)((ulong)lVar10 >> 0x18))
                                                               ,CONCAT12(-(-1 < (char)((ulong)lVar10
                                                                                      >> 0x10)),
                                                                         CONCAT11(-(-1 < (char)((
                                                  ulong)lVar10 >> 8)),-(-1 < (char)lVar10)))))))) &
                  0x8080808080808080;
        }
        uVar1 = (uVar9 >> 7 & 0xff00ff00ff00ff00) >> 8 | (uVar9 >> 7 & 0xff00ff00ff00ff) << 8;
        uVar1 = (uVar1 & 0xffff0000ffff0000) >> 0x10 | (uVar1 & 0xffff0000ffff) << 0x10;
        plVar4 = *(long **)((long)plVar3 + (-8 - (LZCOUNT(uVar1 >> 0x20 | uVar1 << 0x20) & 0x78U)));
        lVar10 = *plVar4;
        *plVar4 = lVar10 + -1;
        LORelease();
        if (lVar10 == 1) {
          func_0x005d2ac4();
        }
        uVar9 = uVar9 - 1 & uVar9;
        lVar7 = lVar7 + -1;
      } while (lVar7 != 0);
    }
    lVar7 = lVar6 * 9 + 0x11;
    if (lVar7 != 0) {
      lVar5 = *(long *)(lVar5 + 0x18) + lVar6 * -8 + -8;
      uStack_8 = 0x57e7dc;
      register0x00000008 = (BADSPACEBASE *)(auStack_d0 + 0x80);
      unaff_x29 = puVar2 + 0xc0;
      goto code_r0x00187bd4;
    }
  }
  if ((lVar5 == -1) || (lVar6 = *(long *)(lVar5 + 8) + -1, *(long *)(lVar5 + 8) = lVar6, lVar6 != 0)
     ) {
    return;
  }
  lVar7 = 0x38;
code_r0x00187bd4:
  *(undefined1 **)((long)register0x00000008 + -0x10) = unaff_x29;
  *(undefined8 *)((long)register0x00000008 + -8) = uStack_8;
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(lVar5,lVar7,8);
  return;
}

