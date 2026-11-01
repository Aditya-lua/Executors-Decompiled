
/* WARNING: Possible PIC construction at 0x00515a98: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x00515a9c) */

void FUN_00515a4c(void)

{
  undefined1 *puVar1;
  long *plVar2;
  long lVar3;
  undefined8 uVar4;
  long lVar5;
  long lVar6;
  long *plVar7;
  undefined1 *unaff_x29;
  undefined8 uVar8;
  undefined1 auStack_b0 [128];
  undefined1 auStack_6 [6];
  
  __Unwind_Resume();
  plVar2 = (long *)func_0x007a2668();
  puVar1 = auStack_6;
  lVar6 = plVar2[1];
  lVar5 = *plVar2;
  if (lVar6 != 0) {
    plVar7 = (long *)(lVar5 + 8);
    do {
      lVar3 = plVar7[-1];
      if (lVar3 != 0) {
        lVar5 = *plVar7;
        uVar4 = 1;
        uVar8 = 0x515a9c;
        register0x00000008 = (BADSPACEBASE *)(auStack_b0 + 0x80);
        unaff_x29 = puVar1 + -10;
        goto code_r0x00187bd4;
      }
      plVar7 = plVar7 + 3;
      lVar6 = lVar6 + -1;
    } while (lVar6 != 0);
  }
  if (plVar2[2] == 0) {
    return;
  }
  lVar3 = plVar2[2] << 5;
  uVar4 = 8;
  uVar8 = 0x515a58;
code_r0x00187bd4:
  *(undefined1 **)((long)register0x00000008 + -0x10) = unaff_x29;
  *(undefined8 *)((long)register0x00000008 + -8) = uVar8;
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(lVar5,lVar3,uVar4);
  return;
}

