
/* WARNING: Possible PIC construction at 0x00222efc: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x00222f00) */

void FUN_00222e50(long param_1)

{
  undefined1 *puVar1;
  long lVar2;
  long *plVar3;
  long lVar4;
  undefined8 uVar5;
  long unaff_x19;
  long *plVar6;
  undefined1 *unaff_x29;
  undefined1 auStack_c0 [128];
  undefined8 uStack_8;
  
  if (*(long *)(param_1 + 0x68) != -0x8000000000000000) {
    func_0x00222b5c();
  }
  func_0x00209524(unaff_x19 + 0x130);
  func_0x00221a70(unaff_x19 + 0xf8);
  func_0x00208f48();
  func_0x0018d654(unaff_x19 + 0x30);
  plVar3 = (long *)__Unwind_Resume();
  uStack_8 = 0x222e98;
  puVar1 = auStack_c0;
  lVar2 = *(long *)plVar3[6];
  *(long *)plVar3[6] = lVar2 + -1;
  LORelease();
  if (lVar2 == 1) {
    DataMemoryBarrier(2,1);
    func_0x001fa698();
  }
  lVar2 = plVar3[2];
  if (lVar2 != 0) {
    plVar6 = (long *)(plVar3[1] + 8);
    do {
      lVar4 = plVar6[-1];
      if (lVar4 != 0) {
        lVar2 = *plVar6;
        uVar5 = 1;
        uStack_8 = 0x222f00;
        register0x00000008 = (BADSPACEBASE *)(auStack_c0 + 0x80);
        unaff_x29 = puVar1 + 0xb0;
        goto code_r0x00187bd4;
      }
      plVar6 = plVar6 + 3;
      lVar2 = lVar2 + -1;
    } while (lVar2 != 0);
  }
  if (*plVar3 != 0) {
    func_0x00187bd4(plVar3[1],*plVar3 * 0x18,8);
  }
  lVar2 = plVar3[5] + 1;
  lVar4 = plVar3[4];
  while (lVar2 = lVar2 + -1, lVar2 != 0) {
    func_0x001a08c4(lVar4);
    lVar4 = lVar4 + 0x98;
  }
  if (plVar3[3] == 0) {
    return;
  }
  lVar2 = plVar3[4];
  lVar4 = plVar3[3] * 0x98;
  uVar5 = 8;
code_r0x00187bd4:
  *(undefined1 **)((long)register0x00000008 + -0x10) = unaff_x29;
  *(undefined8 *)((long)register0x00000008 + -8) = uStack_8;
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(lVar2,lVar4,uVar5);
  return;
}

