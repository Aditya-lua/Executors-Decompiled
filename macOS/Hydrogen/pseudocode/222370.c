
/* WARNING: Possible PIC construction at 0x002223a0: Changing call to branch */
/* WARNING: Possible PIC construction at 0x00221aa8: Changing call to branch */

void FUN_00222370(void)

{
  undefined8 *puVar1;
  undefined1 *puVar2;
  bool in_ZR;
  undefined8 uVar3;
  long lVar4;
  undefined8 uVar5;
  long unaff_x19;
  undefined8 *unaff_x29;
  undefined *puVar6;
  undefined8 in_stack_00000000;
  undefined8 in_stack_00000008;
  undefined8 uStack0000000000000010;
  undefined *in_stack_00000018;
  undefined1 uStack0000000000000020;
  undefined1 auStack_90 [128];
  
  if (!in_ZR) {
    func_0x00222b5c();
  }
  if (((*(byte *)(unaff_x19 + 200) & 1) == 0) &&
     (lVar4 = *(long *)(unaff_x19 + 0xd0), lVar4 != -0x8000000000000000 && lVar4 != 0)) {
    uVar3 = *(undefined8 *)(unaff_x19 + 0xd8);
    uVar5 = 1;
    puVar2 = (undefined1 *)register0x00000008;
    puVar6 = (undefined *)0x2223a4;
  }
  else {
    puVar2 = auStack_90 + 0x80;
    unaff_x29 = &uStack0000000000000010;
    uVar3 = *(undefined8 *)(unaff_x19 + 0xb8);
    puVar1 = *(undefined8 **)(unaff_x19 + 0xc0);
    if ((code *)*puVar1 != (code *)0x0) {
      (*(code *)*puVar1)(uVar3);
    }
    lVar4 = puVar1[1];
    if (lVar4 == 0) {
      lVar4 = *(long *)(unaff_x19 + 0x90);
      if (lVar4 == -0x8000000000000000 || lVar4 == 0) {
        return;
      }
      uVar3 = *(undefined8 *)(unaff_x19 + 0x98);
      uVar5 = 1;
      puVar2 = &uStack0000000000000020;
      unaff_x29 = uStack0000000000000010;
      puVar6 = in_stack_00000018;
    }
    else {
      uVar5 = puVar1[2];
      puVar6 = &UNK_00221aac;
    }
  }
  *(undefined8 **)(puVar2 + -0x10) = unaff_x29;
  *(undefined **)(puVar2 + -8) = puVar6;
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(uVar3,lVar4,uVar5);
  return;
}

