
/* WARNING: Possible PIC construction at 0x00175458: Changing call to branch */
/* WARNING: Possible PIC construction at 0x001f9f44: Changing call to branch */

void thunk_FUN_001753fc(void)

{
  long *plVar1;
  long lVar2;
  long lVar3;
  long *plVar4;
  long *unaff_x29;
  long alStack_50 [2];
  undefined *puStack_8;
  
  __Unwind_Resume();
  plVar1 = (long *)func_0x007a2668();
  puStack_8 = (undefined *)0x175408;
  plVar4 = alStack_50;
  lVar2 = plVar1[2] + 1;
  lVar3 = plVar1[1];
  while (lVar2 = lVar2 + -1, lVar2 != 0) {
    func_0x00194828(lVar3);
    lVar3 = lVar3 + 8;
  }
  if (*plVar1 != 0) {
    lVar2 = plVar1[1];
    lVar3 = *plVar1 << 3;
    puStack_8 = (undefined *)0x17545c;
    register0x00000008 = (BADSPACEBASE *)(alStack_50 + 2);
    unaff_x29 = plVar4 + 8;
    goto code_r0x00187bd4;
  }
  plVar4 = (long *)plVar1[4];
  if (plVar4 != (long *)0x0) {
    lVar2 = *plVar4;
    *plVar4 = lVar2 + -1;
    LORelease();
    if (lVar2 == 1) {
      DataMemoryBarrier(2,1);
      plVar4 = alStack_50;
      lVar2 = plVar1[4];
      if (*(long *)(lVar2 + 0x10) != 0) {
        func_0x00187bd4(*(undefined8 *)(lVar2 + 0x18),*(long *)(lVar2 + 0x10) << 4,8);
      }
      plVar1 = (long *)(lVar2 + 0x28);
      if (*plVar1 != 0) {
        lVar2 = *(long *)(lVar2 + 0x30);
        lVar3 = *plVar1 << 4;
        puStack_8 = &UNK_001f9f48;
        register0x00000008 = (BADSPACEBASE *)(alStack_50 + 6);
        unaff_x29 = plVar4 + 8;
code_r0x00187bd4:
        *(long **)((long)register0x00000008 + -0x10) = unaff_x29;
        *(undefined **)((long)register0x00000008 + -8) = puStack_8;
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
        (*(code *)PTR__free_00a24e58)(lVar2,lVar3,8);
        return;
      }
      if (lVar2 != -1) {
        lVar3 = *(long *)(lVar2 + 8);
        *(long *)(lVar2 + 8) = lVar3 + -1;
        LORelease();
        if (lVar3 == 1) {
          DataMemoryBarrier(2,1);
          lVar3 = 0x80;
          goto code_r0x00187bd4;
        }
      }
      return;
    }
  }
  return;
}

