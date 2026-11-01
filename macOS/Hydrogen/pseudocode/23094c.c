
/* WARNING: Possible PIC construction at 0x00230980: Changing call to branch */
/* WARNING: Possible PIC construction at 0x00230570: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x00230984) */

void FUN_0023094c(undefined8 param_1)

{
  undefined8 *puVar1;
  undefined1 *puVar2;
  ulong uVar3;
  long *plVar4;
  long lVar5;
  undefined8 uVar6;
  ulong *unaff_x19;
  undefined1 *unaff_x29;
  undefined1 auStack_b0 [128];
  undefined8 uStack_8;
  
  if (unaff_x19[4] == 0) {
    if ((*unaff_x19 | 0x8000000000000000) != 0x8000000000000000) {
      func_0x00187bd4(unaff_x19[1],*unaff_x19,1);
    }
    plVar4 = (long *)__Unwind_Resume(param_1);
    uStack_8 = (undefined *)0x2309b4;
    lVar5 = *(long *)plVar4[7];
    *(long *)plVar4[7] = lVar5 + -1;
    LORelease();
    if (lVar5 == 1) {
      DataMemoryBarrier(2,1);
      func_0x001fa1d4();
    }
    func_0x001cbba4(plVar4 + 8);
    puVar2 = auStack_b0;
    uVar3 = plVar4[5];
    puVar1 = (undefined8 *)plVar4[6];
    if ((code *)*puVar1 != (code *)0x0) {
      (*(code *)*puVar1)(uVar3);
    }
    lVar5 = puVar1[1];
    if (lVar5 == 0) {
      lVar5 = *plVar4;
      if (lVar5 == -0x8000000000000000 || lVar5 == 0) {
        return;
      }
      uVar3 = plVar4[1];
      uVar6 = 1;
    }
    else {
      uVar6 = puVar1[2];
      uStack_8 = &UNK_00230574;
      register0x00000008 = (BADSPACEBASE *)(auStack_b0 + 0x80);
      unaff_x29 = puVar2 + 0xa0;
    }
  }
  else {
    uVar3 = unaff_x19[5];
    lVar5 = unaff_x19[4] * 0x18;
    uVar6 = 8;
    uStack_8 = (undefined *)0x230984;
  }
  *(undefined1 **)((long)register0x00000008 + -0x10) = unaff_x29;
  *(undefined **)((long)register0x00000008 + -8) = uStack_8;
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(uVar3,lVar5,uVar6);
  return;
}

