
void FUN_00427724(void)

{
  uint in_w8;
  undefined1 auVar1 [16];
  undefined *puStack_78;
  undefined8 uStack_70;
  undefined4 **ppuStack_68;
  undefined8 uStack_60;
  undefined8 uStack_58;
  undefined4 *puStack_48;
  undefined *puStack_40;
  undefined4 uStack_34;
  long lStack_30;
  undefined8 uStack_28;
  undefined1 uStack_11;
  
  if ((in_w8 >> 8 & 0xff) == 0) {
    auVar1 = func_0x007a2810(&UNK_008851be,0x2b,&uStack_11,&UNK_009d9398,&UNK_009dc200);
    uStack_28 = 0x427760;
    uStack_34 = *auVar1._0_8_;
    puStack_48 = &uStack_34;
    puStack_40 = &
                 __ZN63__LT_std__process__ExitStatus_u20_as_u20_core__fmt__Display_GT_3fmt17habd5958632e7202cE
    ;
    puStack_78 = &UNK_009dabe0;
    uStack_70 = 1;
    uStack_60 = 1;
    uStack_58 = 0;
    ppuStack_68 = &puStack_48;
    lStack_30 = (long)register0x00000008 + -0x10;
    func_0x0046849c(*auVar1._8_8_,auVar1._8_8_[1],&puStack_78);
    return;
  }
  return;
}

