
void FUN_007a1f24(undefined8 param_1,undefined8 param_2,undefined8 param_3)

{
  code *pcVar1;
  undefined8 uStack_98;
  undefined *puStack_90;
  undefined8 uStack_88;
  undefined8 **ppuStack_80;
  undefined8 uStack_78;
  undefined8 uStack_70;
  undefined8 *puStack_60;
  undefined *puStack_58;
  undefined1 *puStack_50;
  undefined8 uStack_48;
  undefined *puStack_40;
  undefined8 uStack_38;
  undefined8 uStack_30;
  undefined8 uStack_28;
  undefined8 uStack_20;
  undefined1 auStack_18 [8];
  
  func_0x00187be0(param_3,param_1);
  puStack_40 = &UNK_009df690;
  uStack_38 = 1;
  uStack_28 = 0;
  uStack_20 = 0;
  uStack_30 = 8;
  uStack_98 = FUN_007a241c(&puStack_40,&UNK_009df6a0);
  uStack_48 = 0x7a1f68;
  puStack_50 = auStack_18 + 8;
  if (__RNvCsiwKNHetQL49_7___rustc39___rust_alloc_error_handler_should_panic == '\0') {
    puStack_60 = &uStack_98;
    puStack_58 = &
                 __ZN4core3fmt3num3imp54__LT_impl_u20_core__fmt__Display_u20_for_u20_usize_GT_3fmt17ha107b9c25e7f708eE
    ;
    puStack_90 = &UNK_009df6b8;
    uStack_88 = 2;
    ppuStack_80 = &puStack_60;
    uStack_78 = 1;
    uStack_70 = 0;
    func_0x007a2440(&puStack_90,0,&UNK_009df6d8);
  }
  puStack_60 = &uStack_98;
  puStack_58 = &
               __ZN4core3fmt3num3imp54__LT_impl_u20_core__fmt__Display_u20_for_u20_usize_GT_3fmt17ha107b9c25e7f708eE
  ;
  puStack_90 = &UNK_009df6b8;
  uStack_88 = 2;
  ppuStack_80 = &puStack_60;
  uStack_78 = 1;
  uStack_70 = 0;
  func_0x007a2420(&puStack_90,&UNK_009df6f0);
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x7a2018);
  (*pcVar1)();
}

