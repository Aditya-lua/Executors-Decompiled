
void FUN_0049c250(undefined1 *param_1)

{
  undefined8 *puVar1;
  undefined1 *puVar2;
  undefined8 *unaff_x19;
  undefined8 *puVar3;
  undefined1 auVar4 [16];
  
  if (param_1 != (undefined1 *)0x0) {
    *param_1 = 0x31;
    *unaff_x19 = 3;
    unaff_x19[1] = param_1;
    unaff_x19[2] = 1;
    return;
  }
  puVar1 = (undefined8 *)func_0x007a1f00(1,3,&UNK_009e2b40);
  puVar3 = *(undefined8 **)*puVar1;
  *(undefined8 *)*puVar1 = 0;
  if (puVar3 == (undefined8 *)0x0) {
    func_0x007a23bc(&UNK_009e2aa8);
  }
  else {
    puVar2 = (undefined1 *)func_0x00187bd0(3,1);
    if (puVar2 != (undefined1 *)0x0) {
      *puVar2 = 0x31;
      *puVar3 = 3;
      puVar3[1] = puVar2;
      puVar3[2] = 1;
      return;
    }
  }
  auVar4 = func_0x007a1f00(1,3,&UNK_009e2b40);
  puVar1 = auVar4._8_8_;
  if ((code *)*puVar1 != (code *)0x0) {
    (*(code *)*puVar1)(auVar4._0_8_);
  }
  if (puVar1[1] == 0) {
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(auVar4._0_8_,puVar1[1],puVar1[2]);
  return;
}

