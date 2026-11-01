
/* WARNING: Possible PIC construction at 0x001fa750: Changing call to branch */
/* WARNING: Possible PIC construction at 0x001fa734: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x001fa754) */
/* WARNING: Removing unreachable block (ram,0x001fa738) */
/* WARNING: Removing unreachable block (ram,0x001fa740) */
/* WARNING: Removing unreachable block (ram,0x001fa744) */

void FUN_001fa694(void)

{
  undefined1 *puVar1;
  long *plVar2;
  long lVar3;
  undefined8 uVar4;
  long lVar5;
  long lVar6;
  undefined1 *puVar7;
  undefined1 *unaff_x29;
  undefined1 auStack_c0 [128];
  undefined8 uStack_8;
  
  plVar2 = (long *)__Unwind_Resume();
  puVar1 = auStack_c0 + 0x80;
  uStack_8 = FUN_001fa694 + 4;
  puVar7 = auStack_c0 + 0xb0;
  lVar5 = *plVar2;
  lVar6 = *(long *)(lVar5 + 0x20);
  if (lVar6 != 0) {
    plVar2 = (long *)(*(long *)(lVar5 + 0x18) + 0x20);
    do {
      lVar3 = plVar2[-4];
      if (lVar3 == -0x8000000000000000 || lVar3 == 0) {
        lVar3 = plVar2[-1];
        if (lVar3 != -0x8000000000000000 && lVar3 != 0) {
LAB_001fa72c:
          lVar5 = *plVar2;
          uVar4 = 1;
          uStack_8 = (code *)&UNK_001fa738;
          goto code_r0x00187bd4;
        }
      }
      else {
        func_0x00187bd4(plVar2[-3],lVar3,1);
        lVar3 = plVar2[-1];
        if (lVar3 != -0x8000000000000000 && lVar3 != 0) goto LAB_001fa72c;
      }
      lVar3 = plVar2[2];
      if (-0x7fffffffffffffff < lVar3 && lVar3 != 0) {
        lVar5 = plVar2[3];
        uVar4 = 1;
        uStack_8 = (code *)&UNK_001fa754;
        puVar1 = auStack_c0 + 0x80;
        goto code_r0x00187bd4;
      }
      plVar2 = plVar2 + 9;
      lVar6 = lVar6 + -1;
    } while (lVar6 != 0);
  }
  if (*(long *)(lVar5 + 0x10) != 0) {
    func_0x00187bd4(*(undefined8 *)(lVar5 + 0x18),*(long *)(lVar5 + 0x10) * 0x48,8);
  }
  if (lVar5 != -1) {
    lVar6 = *(long *)(lVar5 + 8);
    *(long *)(lVar5 + 8) = lVar6 + -1;
    LORelease();
    if (lVar6 == 1) {
      DataMemoryBarrier(2,1);
      lVar3 = 0x28;
      uVar4 = 8;
      puVar1 = (undefined1 *)register0x00000008;
      puVar7 = unaff_x29;
code_r0x00187bd4:
      *(undefined1 **)(puVar1 + -0x10) = puVar7;
      *(code **)(puVar1 + -8) = uStack_8;
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (*(code *)PTR__free_00a24e58)(lVar5,lVar3,uVar4);
      return;
    }
  }
  return;
}

