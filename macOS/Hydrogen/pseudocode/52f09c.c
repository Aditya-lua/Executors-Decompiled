
/* WARNING: Possible PIC construction at 0x0052f0e8: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x0052f0ec) */

void FUN_0052f09c(undefined8 *param_1)

{
  undefined1 *puVar1;
  undefined8 uVar2;
  long lVar3;
  undefined8 uVar4;
  ulong uVar5;
  undefined8 *puVar6;
  undefined1 *unaff_x29;
  undefined8 unaff_x30;
  undefined1 auStack_b0 [128];
  
  puVar1 = auStack_b0;
  uVar5 = param_1[3] - param_1[1];
  if (uVar5 != 0) {
    uVar5 = uVar5 >> 5;
    puVar6 = (undefined8 *)(param_1[1] + 0x10);
    do {
      lVar3 = puVar6[-1];
      if (lVar3 != 0) {
        uVar2 = *puVar6;
        uVar4 = 1;
        unaff_x30 = 0x52f0ec;
        register0x00000008 = (BADSPACEBASE *)(auStack_b0 + 0x80);
        unaff_x29 = puVar1 + 0xa0;
        goto code_r0x00187bd4;
      }
      puVar6 = puVar6 + 4;
      uVar5 = uVar5 - 1;
    } while (uVar5 != 0);
  }
  if (param_1[2] == 0) {
    return;
  }
  uVar2 = *param_1;
  lVar3 = param_1[2] << 5;
  uVar4 = 8;
code_r0x00187bd4:
  *(undefined1 **)((long)register0x00000008 + -0x10) = unaff_x29;
  *(undefined8 *)((long)register0x00000008 + -8) = unaff_x30;
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(uVar2,lVar3,uVar4);
  return;
}

