
/* WARNING: Possible PIC construction at 0x0059e08c: Changing call to branch */
/* WARNING: Possible PIC construction at 0x0059e0cc: Changing call to branch */

void FUN_005a4758(long *param_1)

{
  undefined1 *puVar1;
  long lVar2;
  long lVar3;
  long unaff_x29;
  undefined *unaff_x30;
  undefined1 uStack0000000000000140;
  
  puVar1 = &uStack0000000000000140;
  if (*param_1 != 0) {
    lVar2 = param_1[1];
    if ((lVar2 != 0) && (param_1[3] != 0)) {
      lVar3 = param_1[3] << 3;
      unaff_x30 = &UNK_0059e090;
      puVar1 = (undefined1 *)((long)register0x00000008 + 0x120);
      unaff_x29 = (long)register0x00000008 + 0x130;
      goto code_r0x00187bd4;
    }
    if ((param_1[5] != 0) && (param_1[7] != 0)) {
      func_0x00187bd4(param_1[5],param_1[7] << 3,8);
    }
  }
  if (param_1[0xb] == 0) {
    return;
  }
  lVar2 = param_1[0xc];
  if ((lVar2 == 0) || (param_1[0xe] == 0)) {
    lVar2 = param_1[0x10];
    if (lVar2 == 0) {
      return;
    }
    if (param_1[0x12] == 0) {
      return;
    }
    lVar3 = param_1[0x12] << 3;
  }
  else {
    lVar3 = param_1[0xe] << 3;
    unaff_x30 = &UNK_0059e0d0;
    puVar1 = (undefined1 *)((long)register0x00000008 + 0x120);
    unaff_x29 = (long)register0x00000008 + 0x130;
  }
code_r0x00187bd4:
  *(long *)(puVar1 + -0x10) = unaff_x29;
  *(undefined **)(puVar1 + -8) = unaff_x30;
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(lVar2,lVar3,8);
  return;
}

