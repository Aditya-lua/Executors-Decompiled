
void FUN_001ad688(void)

{
  undefined8 uVar1;
  undefined8 uVar2;
  int iVar3;
  long lVar4;
  long lVar5;
  undefined1 auVar6 [16];
  long lStack_a8;
  undefined *puStack_a0;
  undefined8 uStack_98;
  long **pplStack_90;
  undefined8 uStack_88;
  undefined *puStack_80;
  undefined8 uStack_78;
  long *plStack_70;
  undefined *puStack_68;
  
  auVar6 = __Unwind_Resume();
  lVar4 = auVar6._0_8_;
  lVar5 = 0x20;
  uVar1 = *auVar6._8_8_;
  uVar2 = auVar6._8_8_[1];
  do {
    puStack_a0 = &UNK_008284b0;
    puStack_68 = &DAT_0024156c;
    uStack_98 = 1;
    puStack_80 = &UNK_008284c0;
    uStack_78 = 1;
    uStack_88 = 1;
    lStack_a8 = lVar4;
    pplStack_90 = &plStack_70;
    plStack_70 = &lStack_a8;
    iVar3 = func_0x0046849c(uVar1,uVar2,&puStack_a0);
    if (iVar3 != 0) {
      return;
    }
    lVar4 = lVar4 + 1;
    lVar5 = lVar5 + -1;
  } while (lVar5 != 0);
  return;
}

