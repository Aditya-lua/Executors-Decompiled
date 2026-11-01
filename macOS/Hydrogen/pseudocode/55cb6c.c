
undefined1  [16] FUN_0055cb6c(void)

{
  long *plVar1;
  long lVar2;
  long lVar3;
  undefined1 auVar4 [16];
  undefined1 auVar5 [16];
  
  auVar5._0_8_ = func_0x00187bd0(0x1c8,8);
  if (auVar5._0_8_ != 0) {
    *(undefined8 *)(auVar5._0_8_ + 0xb0) = 0;
    *(undefined2 *)(auVar5._0_8_ + 0x1c2) = 0;
    auVar5._8_8_ = 0;
    return auVar5;
  }
  plVar1 = (long *)func_0x007a1f18(8,0x1c8);
  if (plVar1[1] == 0) {
    auVar5 = func_0x007a247c(&UNK_008ab901,0x21,&UNK_009ee0a8);
    auVar4._8_8_ = auVar5._8_8_;
    auVar4._0_8_ = *auVar5._0_8_ + auVar5._0_8_[2] * 0x10;
    return auVar4;
  }
  lVar2 = *plVar1;
  lVar3 = *(long *)(lVar2 + 0x1c8);
  *plVar1 = lVar3;
  plVar1[1] = plVar1[1] + -1;
  *(undefined8 *)(lVar3 + 0xb0) = 0;
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  auVar5 = (*(code *)PTR__free_00a24e58)(lVar2,0x228,8);
  return auVar5;
}

