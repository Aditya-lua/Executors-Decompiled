
/* WARNING: Possible PIC construction at 0x004bc934: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x004bc938) */

void FUN_004bc840(void)

{
  ulong uVar1;
  undefined1 *puVar2;
  long lVar3;
  undefined8 uVar4;
  ulong uVar5;
  long lVar6;
  long unaff_x19;
  long lVar7;
  long *plVar8;
  long *plVar9;
  undefined1 *unaff_x29;
  long lVar10;
  undefined1 auStack_c0 [128];
  undefined8 uStack_8;
  
  func_0x004bb4f4();
  func_0x004bb4f4(unaff_x19 + 0x40);
  __Unwind_Resume();
  func_0x007a2668();
  lVar3 = func_0x007a2668();
  uStack_8 = (undefined *)0x4bc85c;
  puVar2 = auStack_c0;
  func_0x004bc638();
  lVar6 = *(long *)(lVar3 + 0x98);
  uVar5 = lVar6 * 4 + 0xbU & 0xfffffffffffffff8;
  lVar7 = lVar6 + uVar5 + 9;
  if (lVar6 == 0 || lVar7 == 0) {
    lVar7 = *(long *)(lVar3 + 0xb8);
  }
  else {
    func_0x00187bd4(*(long *)(lVar3 + 0x90) - uVar5,lVar7,8);
    lVar7 = *(long *)(lVar3 + 0xb8);
  }
  if (lVar7 != 0) {
    lVar6 = *(long *)(lVar3 + 200);
    if (lVar6 != 0) {
      plVar8 = *(long **)(lVar3 + 0xb0);
      plVar9 = plVar8 + 1;
      lVar10 = *plVar8;
      uVar5 = CONCAT17(-(-1 < lVar10),
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
        while (uVar5 == 0) {
          lVar10 = *plVar9;
          plVar8 = plVar8 + -0x20;
          plVar9 = plVar9 + 1;
          uVar5 = CONCAT17(-(-1 < lVar10),
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
        uVar1 = (uVar5 >> 7 & 0xff00ff00ff00ff00) >> 8 | (uVar5 >> 7 & 0xff00ff00ff00ff) << 8;
        uVar1 = (uVar1 & 0xffff0000ffff0000) >> 0x10 | (uVar1 & 0xffff0000ffff) << 0x10;
        uVar1 = LZCOUNT(uVar1 >> 0x20 | uVar1 << 0x20) & 0x78;
        lVar10 = *(long *)((long)plVar8 + uVar1 * -4 + -0x20);
        if (lVar10 != 0) {
          lVar7 = *(long *)((long)plVar8 + uVar1 * -4 + -0x18);
          uVar4 = 1;
          uStack_8 = &UNK_004bc938;
          register0x00000008 = (BADSPACEBASE *)(auStack_c0 + 0x80);
          unaff_x29 = puVar2 + 0xb0;
          goto code_r0x00187bd4;
        }
        uVar5 = uVar5 - 1 & uVar5;
        lVar6 = lVar6 + -1;
      } while (lVar6 != 0);
    }
    lVar10 = lVar7 * 0x21 + 0x29;
    if (lVar10 != 0) {
      lVar7 = *(long *)(lVar3 + 0xb0) + lVar7 * -0x20 + -0x20;
      uVar4 = 8;
code_r0x00187bd4:
      *(undefined1 **)((long)register0x00000008 + -0x10) = unaff_x29;
      *(undefined **)((long)register0x00000008 + -8) = uStack_8;
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (*(code *)PTR__free_00a24e58)(lVar7,lVar10,uVar4);
      return;
    }
  }
  return;
}

