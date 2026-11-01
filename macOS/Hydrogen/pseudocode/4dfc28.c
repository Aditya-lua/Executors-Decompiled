
/* WARNING: Possible PIC construction at 0x004dfc6c: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x004dfc70) */

void FUN_004dfc28(long *param_1,long param_2)

{
  undefined1 *puVar1;
  long lVar2;
  undefined8 uVar3;
  undefined1 *unaff_x29;
  undefined8 unaff_x30;
  undefined1 auStack_a0 [128];
  
  if (param_2 == -0x8000000000000000 || param_2 == 0) {
    if (*param_1 == 0) {
      return;
    }
    lVar2 = param_1[1];
    param_2 = *param_1 << 4;
    uVar3 = 8;
    puVar1 = (undefined1 *)register0x00000008;
  }
  else {
    puVar1 = auStack_a0 + 0x80;
    unaff_x29 = auStack_a0 + 0x90;
    lVar2 = param_1[4];
    uVar3 = 1;
    unaff_x30 = 0x4dfc70;
  }
  *(undefined1 **)(puVar1 + -0x10) = unaff_x29;
  *(undefined8 *)(puVar1 + -8) = unaff_x30;
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(lVar2,param_2,uVar3);
  return;
}

