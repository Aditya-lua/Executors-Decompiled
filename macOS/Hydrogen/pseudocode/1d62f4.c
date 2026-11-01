
/* WARNING: Possible PIC construction at 0x001d6300: Changing call to branch */
/* WARNING: Possible PIC construction at 0x001d563c: Changing call to branch */
/* WARNING: Possible PIC construction at 0x001d56ac: Changing call to branch */

void FUN_001d62f4(undefined8 param_1,long param_2)

{
  long *plVar1;
  undefined1 *puVar2;
  ulong uVar3;
  undefined1 *puVar4;
  long lVar5;
  long *plVar6;
  undefined1 *puVar7;
  undefined1 *unaff_x29;
  undefined1 auStack_a0 [128];
  undefined8 uStack_8;
  
  if (param_2 == 0) {
    plVar6 = (long *)__Unwind_Resume();
    uStack_8 = (undefined *)0x1d630c;
    if (*plVar6 == -0x8000000000000000) {
      func_0x001d55d0(plVar6 + 1);
      if (plVar6[0xc] == 0) {
        return;
      }
    }
    else {
      if (*plVar6 == -0x7fffffffffffffff) {
        return;
      }
      uStack_8 = (undefined *)0x1d630c;
      puVar4 = auStack_a0;
      lVar5 = *(long *)plVar6[3];
      *(long *)plVar6[3] = lVar5 + -1;
      LORelease();
      if (lVar5 == 1) {
        DataMemoryBarrier(2,1);
        func_0x001fa0f4();
      }
      puVar2 = (undefined1 *)plVar6[1];
      lVar5 = plVar6[2];
      if (lVar5 != 0) {
        puVar7 = puVar2;
        do {
          *puVar7 = 0;
          lVar5 = lVar5 + -1;
          puVar7 = puVar7 + 1;
        } while (lVar5 != 0);
      }
      plVar6[2] = 0;
      for (lVar5 = *plVar6; lVar5 != 0; lVar5 = lVar5 + -1) {
        *puVar2 = 0;
        puVar2 = puVar2 + 1;
      }
      if (*plVar6 == 0) {
        lVar5 = *(long *)plVar6[4];
        *(long *)plVar6[4] = lVar5 + -1;
        LORelease();
        if (lVar5 == 1) {
          DataMemoryBarrier(2,1);
          func_0x001fa510();
        }
        if (plVar6[5] != -1) {
          plVar1 = (long *)(plVar6[5] + 8);
          lVar5 = *plVar1;
          *plVar1 = lVar5 + -1;
          LORelease();
          if (lVar5 == 1) {
            DataMemoryBarrier(2,1);
            uVar3 = *(ulong *)(plVar6[6] + 0x10);
            if (uVar3 < 9) {
              uVar3 = 8;
            }
            if ((*(long *)(plVar6[6] + 8) + uVar3 + 0xf & -uVar3) != 0) {
              uStack_8 = &UNK_001d56b0;
              register0x00000008 = (BADSPACEBASE *)(auStack_a0 + 0x80);
              unaff_x29 = puVar4 + 0x90;
              goto code_r0x00187bd4;
            }
          }
        }
        if (plVar6[7] != -1) {
          plVar1 = (long *)(plVar6[7] + 8);
          lVar5 = *plVar1;
          *plVar1 = lVar5 + -1;
          LORelease();
          if (lVar5 == 1) {
            DataMemoryBarrier(2,1);
            uVar3 = *(ulong *)(plVar6[8] + 0x10);
            if (uVar3 < 9) {
              uVar3 = 8;
            }
            if ((*(long *)(plVar6[8] + 8) + uVar3 + 0xf & -uVar3) != 0) goto code_r0x00187bd4;
          }
        }
        return;
      }
      uStack_8 = &UNK_001d5640;
      register0x00000008 = (BADSPACEBASE *)(auStack_a0 + 0x80);
      unaff_x29 = puVar4 + 0x90;
    }
  }
  else {
    uStack_8 = (undefined *)0x1d6304;
  }
code_r0x00187bd4:
  *(undefined1 **)((long)register0x00000008 + -0x10) = unaff_x29;
  *(undefined **)((long)register0x00000008 + -8) = uStack_8;
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)();
  return;
}

