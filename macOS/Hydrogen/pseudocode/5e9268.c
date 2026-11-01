
void FUN_005e9268(void)

{
  undefined8 uVar1;
  long unaff_x19;
  long unaff_x29;
  undefined1 uStack0000000000000008;
  undefined1 uStack000000000000001c;
  undefined1 uStack0000000000000020;
  undefined *puStack0000000000000028;
  undefined1 *puStack0000000000000030;
  undefined *puStack0000000000000038;
  undefined8 uStack0000000000000048;
  undefined1 *puStack0000000000000050;
  undefined8 uStack0000000000000058;
  undefined8 uStack0000000000000060;
  
  _uStack0000000000000020 = unaff_x29 + -0x20;
  puStack0000000000000028 = &DAT_005eca44;
  puStack0000000000000030 = &uStack000000000000001c;
  puStack0000000000000038 =
       &
       __ZN4core3fmt3num3imp52__LT_impl_u20_core__fmt__Display_u20_for_u20_u32_GT_3fmt17hb3d30f6df66500a0E
  ;
  uStack0000000000000048 = 2;
  uStack0000000000000058 = 2;
  uStack0000000000000060 = 0;
  puStack0000000000000050 = &uStack0000000000000020;
  func_0x004653b0(&uStack0000000000000008,&UNK_008b9e10,8,(long)register0x00000008 + 0x40,
                  &UNK_009f3e28);
  *(long *)(unaff_x29 + -0x20) = unaff_x19 + 0x30;
  *(undefined **)(unaff_x29 + -0x18) =
       &
       __ZN68__LT_tracing_core__field__FieldSet_u20_as_u20_core__fmt__Display_GT_3fmt17hc1c02597c88d873dE
  ;
  uStack0000000000000048 = 1;
  uStack0000000000000058 = 1;
  uStack0000000000000060 = 0;
  puStack0000000000000050 = (undefined1 *)(unaff_x29 + -0x20);
  uVar1 = func_0x004653b0(&uStack0000000000000008,&UNK_008b9c47,6,(long)register0x00000008 + 0x40,
                          &UNK_009f3e28);
  puStack0000000000000028 = *(undefined **)(unaff_x19 + 0x48);
  _uStack0000000000000020 = *(undefined8 *)(unaff_x19 + 0x40);
  uVar1 = func_0x004653b0(uVar1,&UNK_008b9e18,8,&uStack0000000000000020,&UNK_009f3e68);
  func_0x004653b0(uVar1,&UNK_00888480,4,unaff_x19 + 0x70,&UNK_009f3e88);
  func_0x00465628();
  return;
}

