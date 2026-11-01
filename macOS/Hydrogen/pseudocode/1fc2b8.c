
/* WARNING: Possible PIC construction at 0x0016d9b4: Changing call to branch */
/* WARNING: Possible PIC construction at 0x0016d9ec: Changing call to branch */

void FUN_001fc2b8(undefined8 *param_1)

{
  code *pcVar1;
  undefined1 *puVar2;
  long lVar3;
  long lVar4;
  undefined8 uVar5;
  long lVar6;
  long *unaff_x19;
  undefined8 *unaff_x20;
  undefined8 *puVar7;
  undefined *puVar8;
  long lVar9;
  undefined8 uStack0000000000000010;
  undefined *in_stack_00000018;
  undefined1 uStack0000000000000020;
  undefined1 auStack_a0 [128];
  
  if (param_1 == (undefined8 *)0x0) {
    func_0x007a1f18(8,0x10);
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x1fc324);
    (*pcVar1)();
  }
  param_1[1] = 1;
  *param_1 = 1;
  lVar6 = unaff_x19[0x14];
  *unaff_x20 = param_1;
  unaff_x20[1] = &UNK_009c5bf0;
  lVar3 = unaff_x19[0x10];
  lVar9 = unaff_x19[0x13];
  lVar4 = unaff_x19[0x12];
  unaff_x20[3] = unaff_x19[0x11];
  unaff_x20[2] = lVar3;
  unaff_x20[5] = lVar9;
  unaff_x20[4] = lVar4;
  unaff_x20[6] = lVar6;
  if (*unaff_x19 == -0x7ffffffffffffffe) {
    return;
  }
  puVar2 = auStack_a0 + 0x80;
  puVar7 = &uStack0000000000000010;
  lVar6 = *unaff_x19;
  if ((lVar6 == -0x8000000000000000) || (lVar6 == -0x7fffffffffffffff)) {
    lVar6 = unaff_x19[1];
    if (lVar6 == 0) {
      return;
    }
    lVar3 = unaff_x19[2];
    uVar5 = 1;
  }
  else {
    if (lVar6 != 0) {
      lVar3 = unaff_x19[1];
      uVar5 = 1;
      puVar8 = &UNK_0016d9b8;
      puVar2 = auStack_a0 + 0x80;
      goto code_r0x00187bd4;
    }
    if (unaff_x19[3] != 0) {
      func_0x00187bd4(unaff_x19[4],unaff_x19[3] << 3,2);
    }
    lVar6 = unaff_x19[10];
    if ((lVar6 != -0x8000000000000000) && (lVar6 != 0)) {
      lVar3 = unaff_x19[0xb];
      uVar5 = 1;
      puVar8 = &UNK_0016d9f0;
      goto code_r0x00187bd4;
    }
    lVar3 = unaff_x19[8];
    lVar6 = unaff_x19[9];
    if (lVar6 != 0) {
      puVar7 = (undefined8 *)(lVar3 + 8);
      do {
        lVar4 = puVar7[-1];
        if (lVar4 != -0x8000000000000000 && lVar4 != 0) {
          func_0x00187bd4(*puVar7,lVar4,1);
        }
        puVar7 = puVar7 + 4;
        lVar6 = lVar6 + -1;
      } while (lVar6 != 0);
    }
    if (unaff_x19[7] == 0) {
      return;
    }
    lVar6 = unaff_x19[7] << 5;
    uVar5 = 8;
  }
  puVar2 = &uStack0000000000000020;
  puVar7 = uStack0000000000000010;
  puVar8 = in_stack_00000018;
code_r0x00187bd4:
  *(undefined8 **)(puVar2 + -0x10) = puVar7;
  *(undefined **)(puVar2 + -8) = puVar8;
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(lVar3,lVar6,uVar5);
  return;
}

