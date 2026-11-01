
/* WARNING: Possible PIC construction at 0x001f8f0c: Changing call to branch */
/* WARNING: Possible PIC construction at 0x001f8468: Changing call to branch */

void FUN_001f8e80(void)

{
  undefined8 *puVar1;
  undefined1 *puVar2;
  long lVar3;
  long *plVar4;
  long lVar5;
  long lVar6;
  undefined8 uVar7;
  long unaff_x19;
  undefined1 *unaff_x29;
  undefined1 auStack_c0 [128];
  undefined8 uStack_8;
  
  func_0x00223630(unaff_x19 + 8);
  func_0x001f7dc8(unaff_x19 + 0x18);
  __Unwind_Resume();
  plVar4 = (long *)func_0x007a2668();
  uStack_8 = (undefined *)0x1f8e9c;
  puVar2 = auStack_c0;
  lVar3 = *(long *)plVar4[10];
  *(long *)plVar4[10] = lVar3 + -1;
  LORelease();
  if (lVar3 == 1) {
    DataMemoryBarrier(2,1);
    func_0x001fa1d4();
  }
  lVar6 = plVar4[1];
  lVar3 = plVar4[2] + 1;
  lVar5 = lVar6;
  while (lVar3 = lVar3 + -1, lVar3 != 0) {
    func_0x0016abd8(lVar5);
    lVar5 = lVar5 + 0x28;
  }
  if (*plVar4 == 0) {
    if (plVar4[3] == -0x7fffffffffffffff) {
      lVar3 = plVar4[4];
      if (lVar3 == 0) {
        return;
      }
      lVar6 = plVar4[5];
      uVar7 = 1;
    }
    else {
      puVar2 = auStack_c0;
      lVar6 = plVar4[8];
      puVar1 = (undefined8 *)plVar4[9];
      if ((code *)*puVar1 != (code *)0x0) {
        (*(code *)*puVar1)(lVar6);
      }
      lVar3 = puVar1[1];
      if (lVar3 == 0) {
        lVar3 = plVar4[3];
        if (lVar3 == -0x8000000000000000 || lVar3 == 0) {
          return;
        }
        lVar6 = plVar4[4];
        uVar7 = 1;
      }
      else {
        uVar7 = puVar1[2];
        uStack_8 = &UNK_001f846c;
        register0x00000008 = (BADSPACEBASE *)(auStack_c0 + 0x90);
        unaff_x29 = puVar2 + 0xb0;
      }
    }
  }
  else {
    lVar3 = *plVar4 * 0x28;
    uVar7 = 8;
    uStack_8 = (undefined *)0x1f8f10;
    register0x00000008 = (BADSPACEBASE *)(auStack_c0 + 0x80);
    unaff_x29 = puVar2 + 0xb0;
  }
  *(undefined1 **)((long)register0x00000008 + -0x10) = unaff_x29;
  *(undefined **)((long)register0x00000008 + -8) = uStack_8;
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(lVar6,lVar3,uVar7);
  return;
}

