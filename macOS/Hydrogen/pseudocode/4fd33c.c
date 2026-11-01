
/* WARNING: Possible PIC construction at 0x004fd36c: Changing call to branch */
/* WARNING: Possible PIC construction at 0x004fd3a4: Changing call to branch */
/* WARNING: Possible PIC construction at 0x004fd3f4: Changing call to branch */

void FUN_004fd33c(void)

{
  undefined1 *puVar1;
  long *plVar2;
  long lVar3;
  long lVar4;
  undefined8 uVar5;
  long *plVar6;
  undefined8 *puVar7;
  undefined1 *unaff_x29;
  undefined1 auStack_c0 [128];
  undefined8 uStack_8;
  
  plVar2 = (long *)__Unwind_Resume();
  uStack_8 = (code *)0x4fd344;
  puVar1 = auStack_c0 + 0xb0;
  lVar4 = plVar2[4];
  if (lVar4 == 0) {
    lVar4 = plVar2[9] + 1;
    lVar3 = plVar2[8];
    while (lVar4 = lVar4 + -1, lVar4 != 0) {
      func_0x00489dec(lVar3);
      lVar3 = lVar3 + 0x20;
    }
    if (plVar2[7] == 0) {
      if ((*plVar2 != 2) && (plVar2[1] != 0)) {
        func_0x00187bd4(plVar2[2],plVar2[1],1);
      }
      plVar6 = (long *)plVar2[0xd];
      if (plVar6 != (long *)0x0) {
        puVar7 = (undefined8 *)plVar2[0xe];
        if ((code *)*puVar7 != (code *)0x0) {
          (*(code *)*puVar7)(plVar6);
        }
        lVar4 = puVar7[1];
        if (lVar4 != 0) {
          uVar5 = puVar7[2];
          uStack_8 = FUN_004fd3f4 + 4;
          register0x00000008 = (BADSPACEBASE *)(auStack_c0 + 0x80);
          plVar2 = plVar6;
          unaff_x29 = puVar1;
          goto code_r0x00187bd4;
        }
      }
      lVar4 = plVar2[10];
      if ((-0x7fffffffffffffff < lVar4) && (lVar4 != 0)) {
        func_0x00187bd4(plVar2[0xb],lVar4,1);
      }
      lVar4 = 0xe0;
      uVar5 = 8;
    }
    else {
      lVar4 = plVar2[7] << 5;
      uVar5 = 8;
      uStack_8 = (code *)&UNK_004fd3a8;
      register0x00000008 = (BADSPACEBASE *)(auStack_c0 + 0x80);
      plVar2 = (long *)plVar2[8];
      unaff_x29 = puVar1;
    }
  }
  else {
    uVar5 = 1;
    uStack_8 = (code *)&UNK_004fd370;
    register0x00000008 = (BADSPACEBASE *)(auStack_c0 + 0x80);
    plVar2 = (long *)plVar2[5];
    unaff_x29 = puVar1;
  }
code_r0x00187bd4:
  *(undefined1 **)((long)register0x00000008 + -0x10) = unaff_x29;
  *(code **)((long)register0x00000008 + -8) = uStack_8;
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(plVar2,lVar4,uVar5);
  return;
}

