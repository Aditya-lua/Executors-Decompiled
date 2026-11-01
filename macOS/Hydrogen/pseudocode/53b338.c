
void FUN_0053b338(long *param_1)

{
  ulong uVar1;
  long lVar2;
  long *plVar3;
  long lVar4;
  ulong uVar5;
  long *plVar6;
  long lVar7;
  
  lVar2 = param_1[7];
  while (lVar2 != 0) {
    lVar4 = param_1[3];
    uVar5 = param_1[4];
    if (uVar5 == 0) {
      plVar3 = (long *)param_1[5];
      do {
        plVar6 = plVar3 + 1;
        lVar7 = *plVar3;
        lVar4 = lVar4 + -0x140;
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
        plVar3 = plVar6;
      } while (uVar5 == 0);
      param_1[5] = (long)plVar6;
      param_1[3] = lVar4;
    }
    uVar1 = (uVar5 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar5 & 0x5555555555555555) << 1;
    uVar1 = (uVar1 & 0xcccccccccccccccc) >> 2 | (uVar1 & 0x3333333333333333) << 2;
    uVar1 = (uVar1 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar1 & 0xf0f0f0f0f0f0f0f) << 4;
    uVar1 = (uVar1 & 0xff00ff00ff00ff00) >> 8 | (uVar1 & 0xff00ff00ff00ff) << 8;
    uVar1 = (uVar1 & 0xffff0000ffff0000) >> 0x10 | (uVar1 & 0xffff0000ffff) << 0x10;
    param_1[4] = uVar5 - 1 & uVar5;
    lVar4 = lVar4 + (long)-(int)((ulong)LZCOUNT(uVar1 >> 0x20 | uVar1 << 0x20) >> 3) * 0x28;
    param_1[7] = lVar2 + -1;
    plVar3 = *(long **)(lVar4 + -0x28);
    lVar2 = *plVar3;
    *plVar3 = lVar2 + -1;
    LORelease();
    if (lVar2 == 1) {
      func_0x005d2ac4();
    }
    func_0x00539318(lVar4 + -0x20);
    lVar2 = param_1[7];
  }
  if ((*param_1 == 0) || (param_1[1] == 0)) {
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(param_1[2]);
  return;
}

