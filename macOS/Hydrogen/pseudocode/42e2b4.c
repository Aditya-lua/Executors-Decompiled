
undefined8 FUN_0042e2b4(code *param_1,undefined8 param_2,undefined8 param_3)

{
  int iVar1;
  ulong uVar2;
  undefined8 uVar3;
  undefined8 *unaff_x19;
  ulong unaff_x21;
  undefined8 *unaff_x22;
  undefined1 uStack0000000000000004;
  undefined8 uStack0000000000000008;
  undefined *in_stack_00000010;
  undefined1 uStack000000000000002c;
  undefined8 uStack0000000000000030;
  undefined8 uStack0000000000000038;
  undefined8 *in_stack_00000040;
  undefined8 in_stack_00000048;
  undefined8 in_stack_00000050;
  
  iVar1 = (*param_1)(param_2,param_3,0x10);
  if (iVar1 == 0) {
    uStack0000000000000030 = (undefined *)*unaff_x19;
    in_stack_00000040 = (undefined8 *)unaff_x22[1];
    uStack0000000000000038 = *unaff_x22;
    in_stack_00000048 = unaff_x22[2];
    uVar2 = (**(code **)(unaff_x19[2] + 0x20))
                      (unaff_x19[1],uStack0000000000000030,&uStack0000000000000038);
    if ((uVar2 & 1) == 0) {
      uStack0000000000000008 = &uStack0000000000000004;
      in_stack_00000010 =
           &
           __ZN4core3fmt3num3imp52__LT_impl_u20_core__fmt__Display_u20_for_u20_u32_GT_3fmt17hb3d30f6df66500a0E
      ;
      uStack0000000000000030 = &UNK_009db518;
      uStack0000000000000038 = 1;
      in_stack_00000048 = 1;
      in_stack_00000050 = 0;
      in_stack_00000040 = &uStack0000000000000008;
      uVar2 = func_0x0046849c(*(undefined8 *)*unaff_x19,((undefined8 *)*unaff_x19)[1],
                              &uStack0000000000000030);
      if ((uVar2 & 1) != 0) {
        return 1;
      }
      if ((unaff_x21 & 1) != 0) {
        uStack0000000000000008 = &uStack000000000000002c;
        in_stack_00000010 =
             &
             __ZN4core3fmt3num3imp52__LT_impl_u20_core__fmt__Display_u20_for_u20_u32_GT_3fmt17hb3d30f6df66500a0E
        ;
        uStack0000000000000030 = &UNK_009db518;
        uStack0000000000000038 = 1;
        in_stack_00000048 = 1;
        in_stack_00000050 = 0;
        in_stack_00000040 = &uStack0000000000000008;
        uVar2 = func_0x0046849c(*(undefined8 *)*unaff_x19,((undefined8 *)*unaff_x19)[1],
                                &uStack0000000000000030);
        if ((uVar2 & 1) != 0) {
          return 1;
        }
      }
      uVar3 = (**(code **)(((undefined8 *)*unaff_x19)[1] + 0x18))
                        (*(undefined8 *)*unaff_x19,&UNK_00886c1e,1);
      return uVar3;
    }
  }
  return 1;
}

