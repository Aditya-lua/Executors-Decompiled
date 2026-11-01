
void FUN_0019165c(undefined4 *param_1,undefined8 *param_2,undefined8 param_3)

{
  int iVar1;
  undefined8 *puVar2;
  undefined4 uVar3;
  undefined1 auVar4 [16];
  undefined8 uStack0000000000000008;
  
  iVar1 = _SecCodeCopyPath(*param_2,param_3,&uStack0000000000000008);
  if (iVar1 == 0) {
    if (uStack0000000000000008 == 0) {
      puVar2 = (undefined8 *)&UNK_009c1170;
      auVar4 = func_0x007a11c0(&UNK_0081a9b0,0x22);
                    /* WARNING: Could not recover jumptable at 0x007b283c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (*(code *)PTR__SecStaticCodeCheckValidity_00a24638)(*auVar4._0_8_,auVar4._8_8_,*puVar2);
      return;
    }
    uVar3 = 0;
    *(long *)(param_1 + 2) = uStack0000000000000008;
  }
  else {
    param_1[1] = iVar1;
    uVar3 = 1;
  }
  *param_1 = uVar3;
  return;
}

