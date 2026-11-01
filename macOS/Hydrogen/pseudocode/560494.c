
/* WARNING: Possible PIC construction at 0x00596bd0: Changing call to branch */
/* WARNING: Possible PIC construction at 0x00596cdc: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x00596ce0) */

void FUN_00560494(long param_1)

{
  undefined1 *puVar1;
  bool in_ZR;
  long lVar2;
  long in_x9;
  ulong in_x10;
  long *unaff_x19;
  long unaff_x20;
  long lVar3;
  long lVar4;
  long lVar5;
  long lVar6;
  long lVar7;
  long lVar8;
  undefined8 *puVar9;
  undefined *puVar10;
  undefined8 uStack0000000000000010;
  undefined *in_stack_00000018;
  undefined1 uStack0000000000000020;
  undefined1 auStack_60 [8];
  long lStack_58;
  long lStack_50;
  long lStack_48;
  
  if (!in_ZR) {
    in_x9 = param_1 + 1;
  }
  if (*(ulong *)(unaff_x20 + 0x10) < (in_x10 | in_x9 - 1U) - ((in_x10 ^ in_x9 - 1U) >> 1)) {
    func_0x007a7510();
  }
  puVar1 = auStack_60;
  puVar9 = &uStack0000000000000010;
  lVar3 = *unaff_x19;
  if (lVar3 != 0) {
    lVar2 = unaff_x19[2];
    lVar6 = unaff_x19[3];
    for (lVar4 = unaff_x19[1]; lVar4 != lVar6; lVar4 = lVar4 + 8) {
      func_0x00563b2c();
    }
    if (lVar2 != 0) {
      lVar2 = lVar2 << 3;
      puVar1 = auStack_60;
      puVar10 = &UNK_00596bd4;
      goto code_r0x00187bd4;
    }
  }
  lVar4 = unaff_x19[8];
  lVar6 = unaff_x19[9];
  if (lVar4 != 0 && lVar4 != lVar6) {
    lVar5 = 0;
    do {
      func_0x0056f330(&lStack_58,lVar4 + lVar5 * 0x48 + 8);
      lVar3 = lStack_50;
      lVar2 = lStack_58;
      lVar8 = lStack_48 * 8;
      for (lVar7 = 0; lVar8 != lVar7; lVar7 = lVar7 + 8) {
        func_0x00563b2c();
      }
      if (lVar2 != 0) {
        lVar2 = lVar2 << 3;
        puVar10 = &UNK_00596ce0;
        goto code_r0x00187bd4;
      }
      lVar5 = lVar5 + 1;
    } while (lVar5 != ((ulong)(lVar6 - lVar4) >> 3) * -0x71c71c71c71c71c7);
  }
  lVar3 = unaff_x19[4];
  if (lVar3 != 0) {
    lVar2 = unaff_x19[6];
    lVar6 = unaff_x19[7];
    for (lVar4 = unaff_x19[5]; lVar4 != lVar6; lVar4 = lVar4 + 8) {
      func_0x00563b2c();
    }
    if (lVar2 != 0) {
      lVar2 = lVar2 << 3;
      puVar1 = &uStack0000000000000020;
      puVar9 = uStack0000000000000010;
      puVar10 = in_stack_00000018;
code_r0x00187bd4:
      *(undefined8 **)(puVar1 + -0x10) = puVar9;
      *(undefined **)(puVar1 + -8) = puVar10;
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (*(code *)PTR__free_00a24e58)(lVar3,lVar2,8);
      return;
    }
  }
  return;
}

