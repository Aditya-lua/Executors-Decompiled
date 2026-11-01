
ulong FUN_004363d4(undefined8 param_1,undefined8 param_2,undefined8 *param_3)

{
  bool bVar1;
  int iVar2;
  undefined8 uVar3;
  ulong *puVar4;
  ulong uVar5;
  long unaff_x19;
  undefined8 *unaff_x20;
  undefined8 uVar6;
  ulong unaff_x21;
  undefined8 unaff_x22;
  long lVar7;
  undefined8 unaff_x23;
  undefined8 *puVar8;
  undefined8 unaff_x24;
  undefined8 unaff_x25;
  undefined8 unaff_x26;
  undefined8 unaff_x27;
  undefined8 unaff_x28;
  long unaff_x29;
  undefined1 auVar9 [16];
  undefined8 uStack0000000000000018;
  undefined8 in_stack_00000020;
  undefined8 *in_stack_00000028;
  undefined8 in_stack_00000030;
  undefined8 in_stack_00000038;
  ulong in_stack_00000060;
  ulong in_stack_00000068;
  undefined8 uStack0000000000000070;
  undefined *in_stack_00000078;
  undefined8 in_stack_00000080;
  undefined8 in_stack_00000088;
  undefined1 auStack_38 [24];
  
  do {
    iVar2 = func_0x0046849c(param_1,param_2,param_3);
    uVar5 = *(ulong *)(unaff_x29 + -0x70);
    if (iVar2 != 0) {
      if ((uVar5 | 0x8000000000000000) != 0x8000000000000000) {
        func_0x00187bd4(*(undefined8 *)(unaff_x29 + -0x68),uVar5,1);
      }
      return 1;
    }
    if ((uVar5 | 0x8000000000000000) != unaff_x21) {
      func_0x00187bd4(*(undefined8 *)(unaff_x29 + -0x68),uVar5,1);
    }
    do {
      auVar9 = func_0x003f3480(&uStack0000000000000018);
      puVar4 = auVar9._8_8_;
      lVar7 = auVar9._0_8_;
      if (lVar7 == 0) {
        lVar7 = *(long *)(unaff_x19 + 0x10);
        if (lVar7 == 0) {
          uVar3 = func_0x007a2570(0,0,&UNK_009dbe58);
          if ((*(ulong *)(unaff_x29 + -0x90) | 0x8000000000000000) != 0x8000000000000000) {
            func_0x00187bd4(*(undefined8 *)(unaff_x29 + -0x88),*(ulong *)(unaff_x29 + -0x90),1);
          }
          auVar9 = __Unwind_Resume(uVar3);
          func_0x00469960(auStack_38,auVar9._8_8_,&UNK_008849b0,0x10);
          func_0x004656a8(auStack_38,auVar9._0_8_,&UNK_009dbfd0);
          uVar5 = func_0x004658b0();
          return uVar5;
        }
        puVar8 = *(undefined8 **)(unaff_x19 + 8);
        if (*(long *)(unaff_x19 + 0xa0) == puVar8[1]) {
          iVar2 = _memcmp(*(undefined8 *)(unaff_x19 + 0x98),*puVar8);
          uVar3 = *unaff_x20;
          uVar6 = unaff_x20[1];
          if (iVar2 == 0) goto code_r0x00436478;
        }
        else {
          uVar3 = *unaff_x20;
          uVar6 = unaff_x20[1];
        }
        in_stack_00000078 =
             &
             __ZN63__LT_alloc__ffi__c_str__CString_u20_as_u20_core__fmt__Debug_GT_3fmt17h929e693e91dc938dE
        ;
        uStack0000000000000018 = &UNK_009dbe70;
        in_stack_00000020 = 2;
        in_stack_00000028 = &uStack0000000000000070;
        in_stack_00000030 = 1;
        in_stack_00000038 = 0;
        uStack0000000000000070 = (undefined8 *)(unaff_x19 + 0x98);
        uVar5 = func_0x0046849c(uVar3,uVar6,&uStack0000000000000018);
        if ((uVar5 & 1) != 0) {
          return 1;
        }
code_r0x00436478:
        in_stack_00000078 =
             &
             __ZN63__LT_alloc__ffi__c_str__CString_u20_as_u20_core__fmt__Debug_GT_3fmt17h929e693e91dc938dE
        ;
        uStack0000000000000018 = &UNK_007fc120;
        in_stack_00000020 = 1;
        in_stack_00000030 = 1;
        in_stack_00000038 = 0;
        in_stack_00000028 = &uStack0000000000000070;
        uStack0000000000000070 = puVar8;
        uVar5 = func_0x0046849c(uVar3,uVar6,&uStack0000000000000018);
        if ((uVar5 & 1) != 0) {
          return 1;
        }
        lVar7 = lVar7 * 0x10;
        if (lVar7 == 0x10) {
          return 0;
        }
        lVar7 = lVar7 + -0x20;
        do {
          puVar8 = puVar8 + 2;
          *(undefined8 **)(unaff_x29 + -0x90) = puVar8;
          in_stack_00000078 = &DAT_003f3f90;
          uStack0000000000000018 = &UNK_009dbe90;
          in_stack_00000020 = 1;
          in_stack_00000030 = 1;
          in_stack_00000038 = 0;
          in_stack_00000028 = &uStack0000000000000070;
          uStack0000000000000070 = (undefined8 *)(unaff_x29 + -0x90);
          uVar5 = func_0x0046849c(uVar3,uVar6,&uStack0000000000000018);
          if ((uVar5 & 1) != 0) {
            return uVar5;
          }
          bVar1 = lVar7 != 0;
          lVar7 = lVar7 + -0x10;
        } while (bVar1);
        return uVar5;
      }
    } while (*puVar4 == unaff_x21);
    in_stack_00000060 = puVar4[1];
    in_stack_00000068 = puVar4[2];
    func_0x0045b558(unaff_x29 + -0x70,*(undefined8 *)(lVar7 + 8),*(undefined8 *)(lVar7 + 0x10));
    *(long *)(unaff_x29 + -0x90) = unaff_x29 + -0x70;
    *(undefined8 *)(unaff_x29 + -0x88) = unaff_x23;
    *(undefined8 *)(unaff_x29 + -0x80) = unaff_x25;
    *(undefined8 *)(unaff_x29 + -0x78) = unaff_x24;
    param_1 = *unaff_x20;
    param_2 = unaff_x20[1];
    param_3 = &uStack0000000000000070;
    uStack0000000000000070 = (undefined8 *)unaff_x22;
    in_stack_00000078 = (undefined *)unaff_x26;
    in_stack_00000080 = unaff_x27;
    in_stack_00000088 = unaff_x28;
  } while( true );
}

