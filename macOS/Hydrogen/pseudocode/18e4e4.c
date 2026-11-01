
/* WARNING: Possible PIC construction at 0x0018e4f4: Changing call to branch */

long * FUN_0018e4e4(void)

{
  undefined8 *puVar1;
  undefined1 *puVar2;
  undefined8 uVar3;
  long *plVar4;
  long lVar5;
  long unaff_x19;
  undefined8 *puVar6;
  undefined1 **unaff_x29;
  undefined *puVar7;
  undefined1 auVar8 [16];
  undefined1 auStack_c0 [128];
  undefined1 *puStack_20;
  undefined8 uStack_18;
  
  if (unaff_x19 == 0) {
    uVar3 = __Unwind_Resume();
    plVar4 = (long *)_CFDictionaryCreateMutable
                               (*(undefined8 *)PTR__kCFAllocatorDefault_009b0238,uVar3,
                                PTR__kCFTypeDictionaryKeyCallBacks_009b0260,
                                PTR__kCFTypeDictionaryValueCallBacks_009b0268);
    if (plVar4 != (long *)0x0) {
      return plVar4;
    }
    auVar8 = func_0x007a11c0(&UNK_0081a021,0x22,&UNK_009c07c0);
    lVar5 = auVar8._8_8_;
    puVar2 = auStack_c0 + 0x80;
    uStack_18 = 0x18e550;
    unaff_x29 = &puStack_20;
    puStack_20 = auStack_c0 + 0xb0;
    plVar4 = (long *)_CFDictionaryCreateMutable
                               (*(undefined8 *)PTR__kCFAllocatorDefault_009b0238,lVar5,
                                PTR__kCFTypeDictionaryKeyCallBacks_009b0260,
                                PTR__kCFTypeDictionaryValueCallBacks_009b0268);
    if (plVar4 != (long *)0x0) {
      if (lVar5 != 0) {
        puVar6 = auVar8._0_8_;
        do {
          puVar1 = puVar6 + 2;
          _CFDictionaryAddValue(plVar4,*puVar6,puVar6[1]);
          puVar6 = puVar1;
        } while (puVar1 != auVar8._0_8_ + lVar5 * 2);
      }
      return plVar4;
    }
    puVar7 = &DAT_0018e5e0;
    plVar4 = (long *)func_0x007a11c0(&UNK_0081a021,0x22,&UNK_009c07c0);
    if (*plVar4 == 0) {
      return plVar4;
    }
  }
  else {
    puVar7 = (undefined *)0x18e4f8;
    puVar2 = (undefined1 *)register0x00000008;
  }
  *(undefined1 ***)(puVar2 + -0x10) = unaff_x29;
  *(undefined **)(puVar2 + -8) = puVar7;
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  plVar4 = (long *)(*(code *)PTR__free_00a24e58)();
  return plVar4;
}

