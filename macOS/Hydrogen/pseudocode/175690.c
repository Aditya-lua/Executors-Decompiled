
/* WARNING: Possible PIC construction at 0x001756a0: Changing call to branch */
/* WARNING: Possible PIC construction at 0x00175744: Changing call to branch */
/* WARNING: Possible PIC construction at 0x001757a4: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x00175748) */
/* WARNING: Removing unreachable block (ram,0x001757a8) */

void FUN_00175690(long param_1)

{
  undefined1 *puVar1;
  long lVar2;
  long *plVar3;
  long *plVar4;
  long lVar5;
  undefined1 *unaff_x29;
  undefined1 auStack_b0 [128];
  undefined8 uStack_8;
  
  if (param_1 != 0) {
    uStack_8 = 0x1756a4;
code_r0x00187bd4:
    *(undefined1 **)((long)register0x00000008 + -0x10) = unaff_x29;
    *(undefined8 *)((long)register0x00000008 + -8) = uStack_8;
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)PTR__free_00a24e58)();
    return;
  }
  __Unwind_Resume();
  plVar3 = (long *)func_0x007a2668();
  uStack_8 = 0x1756b0;
  puVar1 = auStack_b0;
  if (*plVar3 != -0x8000000000000000) {
    plVar4 = (long *)plVar3[7];
    if (plVar4 != (long *)0x0) {
      lVar2 = *plVar4;
      *plVar4 = lVar2 + -1;
      LORelease();
      if (lVar2 == 1) {
        DataMemoryBarrier(2,1);
        func_0x001f9f08();
      }
    }
    lVar2 = *(long *)plVar3[6];
    *(long *)plVar3[6] = lVar2 + -1;
    LORelease();
    if (lVar2 == 1) {
      DataMemoryBarrier(2,1);
      func_0x001fa698();
    }
    lVar2 = plVar3[2];
    if (lVar2 != 0) {
      lVar5 = plVar3[1] + 8;
      do {
        if (*(long *)(lVar5 + -8) != 0) {
          uStack_8 = 0x175748;
          register0x00000008 = (BADSPACEBASE *)(auStack_b0 + 0x80);
          unaff_x29 = puVar1 + 0xa0;
          goto code_r0x00187bd4;
        }
        lVar5 = lVar5 + 0x18;
        lVar2 = lVar2 + -1;
      } while (lVar2 != 0);
    }
    if (*plVar3 != 0) {
      func_0x00187bd4(plVar3[1],*plVar3 * 0x18,8);
    }
    lVar2 = plVar3[5];
    if (lVar2 != 0) {
      lVar5 = plVar3[4] + 8;
      do {
        if (*(long *)(lVar5 + -8) != -0x8000000000000000 && *(long *)(lVar5 + -8) != 0) {
          uStack_8 = 0x1757a8;
          register0x00000008 = (BADSPACEBASE *)(auStack_b0 + 0x80);
          unaff_x29 = puVar1 + 0xa0;
          goto code_r0x00187bd4;
        }
        lVar5 = lVar5 + 0x18;
        lVar2 = lVar2 + -1;
      } while (lVar2 != 0);
    }
    if (plVar3[3] != 0) goto code_r0x00187bd4;
  }
  return;
}

