
void FUN_0053b6a4(undefined8 param_1)

{
  ulong uVar1;
  long lVar2;
  long *plVar3;
  long *plVar4;
  long lVar5;
  ulong uVar6;
  long *plVar7;
  long unaff_x20;
  long lVar8;
  
  plVar3 = *(long **)(unaff_x20 + -8);
  lVar2 = *plVar3;
  *plVar3 = lVar2 + -1;
  LORelease();
  if (lVar2 == 1) {
    func_0x005d2ac4((undefined8 *)(unaff_x20 + -8));
  }
  __Unwind_Resume(param_1);
  plVar3 = (long *)func_0x007a2668();
  lVar2 = plVar3[7];
  while (lVar2 != 0) {
    lVar5 = plVar3[3];
    uVar6 = plVar3[4];
    if (uVar6 == 0) {
      plVar4 = (long *)plVar3[5];
      do {
        plVar7 = plVar4 + 1;
        lVar8 = *plVar4;
        lVar5 = lVar5 + -0x40;
        uVar6 = CONCAT17(-(-1 < lVar8),
                         CONCAT16(-(-1 < (char)((ulong)lVar8 >> 0x30)),
                                  CONCAT15(-(-1 < (char)((ulong)lVar8 >> 0x28)),
                                           CONCAT14(-(-1 < (char)((ulong)lVar8 >> 0x20)),
                                                    CONCAT13(-(-1 < (char)((ulong)lVar8 >> 0x18)),
                                                             CONCAT12(-(-1 < (char)((ulong)lVar8 >>
                                                                                   0x10)),
                                                                      CONCAT11(-(-1 < (char)((ulong)
                                                  lVar8 >> 8)),-(-1 < (char)lVar8)))))))) &
                0x8080808080808080;
        plVar4 = plVar7;
      } while (uVar6 == 0);
      plVar3[5] = (long)plVar7;
      plVar3[3] = lVar5;
    }
    uVar1 = (uVar6 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar6 & 0x5555555555555555) << 1;
    uVar1 = (uVar1 & 0xcccccccccccccccc) >> 2 | (uVar1 & 0x3333333333333333) << 2;
    uVar1 = (uVar1 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar1 & 0xf0f0f0f0f0f0f0f) << 4;
    uVar1 = (uVar1 & 0xff00ff00ff00ff00) >> 8 | (uVar1 & 0xff00ff00ff00ff) << 8;
    uVar1 = (uVar1 & 0xffff0000ffff0000) >> 0x10 | (uVar1 & 0xffff0000ffff) << 0x10;
    plVar3[4] = uVar6 - 1 & uVar6;
    plVar3[7] = lVar2 + -1;
    plVar4 = *(long **)((lVar5 - (LZCOUNT(uVar1 >> 0x20 | uVar1 << 0x20) & 0x78U)) + -8);
    lVar2 = *plVar4;
    *plVar4 = lVar2 + -1;
    LORelease();
    if (lVar2 == 1) {
      func_0x005d2ac4();
    }
    lVar2 = plVar3[7];
  }
  if ((*plVar3 == 0) || (plVar3[1] == 0)) {
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(plVar3[2]);
  return;
}

