
/* WARNING: Possible PIC construction at 0x001fa498: Changing call to branch */
/* WARNING: Possible PIC construction at 0x001fa4d0: Changing call to branch */
/* WARNING: Possible PIC construction at 0x001fa560: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x001fa564) */

void FUN_001fa458(void)

{
  undefined1 *puVar1;
  bool in_ZR;
  long lVar2;
  long lVar3;
  long *plVar4;
  long lVar5;
  undefined8 uVar6;
  long unaff_x19;
  undefined1 *unaff_x29;
  undefined1 auStack_b0 [128];
  undefined8 uStack_8;
  
  if (in_ZR) {
    DataMemoryBarrier(2,1);
    func_0x001f9964();
  }
  lVar2 = **(long **)(unaff_x19 + 0xc0);
  **(long **)(unaff_x19 + 0xc0) = lVar2 + -1;
  LORelease();
  if (lVar2 == 1) {
    DataMemoryBarrier(2,1);
    func_0x001f9964();
  }
  if (*(long *)(unaff_x19 + 0x38) == 0) {
    lVar2 = **(long **)(unaff_x19 + 0xd0);
    **(long **)(unaff_x19 + 0xd0) = lVar2 + -1;
    LORelease();
    if (lVar2 == 1) {
      DataMemoryBarrier(2,1);
      func_0x001f9aac();
    }
    if (*(long *)(unaff_x19 + 0x50) == 0) {
      if (unaff_x19 != -1) {
        lVar2 = *(long *)(unaff_x19 + 8);
        *(long *)(unaff_x19 + 8) = lVar2 + -1;
        LORelease();
        if (lVar2 == 1) {
          DataMemoryBarrier(2,1);
          func_0x00187bd4();
        }
      }
      __Unwind_Resume();
      plVar4 = (long *)func_0x007a2668();
      uStack_8 = 0x1fa510;
      puVar1 = auStack_b0;
      lVar3 = *plVar4;
      lVar2 = *(long *)(lVar3 + 0x20);
      if (lVar2 != 0) {
        plVar4 = (long *)(*(long *)(lVar3 + 0x18) + 8);
        do {
          lVar5 = plVar4[-1];
          if (lVar5 != -0x8000000000000000 && lVar5 != 0) {
            lVar3 = *plVar4;
            uVar6 = 1;
            uStack_8 = 0x1fa564;
            register0x00000008 = (BADSPACEBASE *)(auStack_b0 + 0x80);
            unaff_x29 = puVar1 + 0xa0;
            goto code_r0x00187bd4;
          }
          plVar4 = plVar4 + 3;
          lVar2 = lVar2 + -1;
        } while (lVar2 != 0);
      }
      if (*(long *)(lVar3 + 0x10) != 0) {
        func_0x00187bd4(*(undefined8 *)(lVar3 + 0x18),*(long *)(lVar3 + 0x10) * 0x18,8);
      }
      if (lVar3 != -1) {
        lVar2 = *(long *)(lVar3 + 8);
        *(long *)(lVar3 + 8) = lVar2 + -1;
        LORelease();
        if (lVar2 == 1) {
          DataMemoryBarrier(2,1);
          lVar5 = 0x28;
          uVar6 = 8;
          goto code_r0x00187bd4;
        }
      }
      return;
    }
    lVar3 = *(long *)(unaff_x19 + 0x58);
    lVar5 = *(long *)(unaff_x19 + 0x50) << 4;
    uVar6 = 8;
    uStack_8 = 0x1fa4d4;
  }
  else {
    lVar3 = *(long *)(unaff_x19 + 0x40);
    lVar5 = *(long *)(unaff_x19 + 0x38) << 4;
    uVar6 = 8;
    uStack_8 = 0x1fa49c;
  }
code_r0x00187bd4:
  *(undefined1 **)((long)register0x00000008 + -0x10) = unaff_x29;
  *(undefined8 *)((long)register0x00000008 + -8) = uStack_8;
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(lVar3,lVar5,uVar6);
  return;
}

