
undefined8 FUN_002619a0(long *param_1)

{
  short sVar1;
  bool bVar2;
  int iVar3;
  ulong uVar4;
  undefined8 uVar5;
  undefined8 uVar6;
  undefined8 *unaff_x19;
  short *psVar7;
  short *psVar8;
  long lVar9;
  undefined8 uStack0000000000000008;
  undefined8 uStack0000000000000010;
  undefined8 in_stack_00000018;
  undefined8 *in_stack_00000020;
  undefined8 in_stack_00000028;
  undefined *in_stack_00000030;
  undefined8 in_stack_00000038;
  undefined8 uStack0000000000000040;
  undefined *in_stack_00000048;
  
  psVar8 = (short *)*param_1;
  lVar9 = param_1[1];
  if (lVar9 == 4) {
    uStack0000000000000040 = (short *)&uStack0000000000000008;
    in_stack_00000048 = &DAT_002683e0;
    uStack0000000000000010 = &UNK_007fc120;
    in_stack_00000028 = 1;
    in_stack_00000030 = (undefined *)0x0;
    in_stack_00000020 = &uStack0000000000000040;
    in_stack_00000018 = 1;
    uStack0000000000000008 = psVar8;
    uVar4 = func_0x0046849c(*unaff_x19,unaff_x19[1],&uStack0000000000000010);
    if ((uVar4 & 1) != 0) {
      return 1;
    }
    uStack0000000000000008 = (short *)((long)psVar8 + 1);
    uVar4 = func_0x0046920c();
    if ((uVar4 & 1) != 0) {
      return 1;
    }
    uStack0000000000000040 = (short *)&uStack0000000000000008;
    in_stack_00000048 = &DAT_002683e0;
    uStack0000000000000010 = &UNK_007fc120;
    in_stack_00000018 = 1;
    in_stack_00000028 = 1;
    in_stack_00000030 = (undefined *)0x0;
    in_stack_00000020 = &uStack0000000000000040;
    uVar4 = func_0x0046849c(*unaff_x19,unaff_x19[1],&uStack0000000000000010);
    if ((uVar4 & 1) != 0) {
      return 1;
    }
    uStack0000000000000008 = psVar8 + 1;
    uVar4 = func_0x0046920c();
    if ((uVar4 & 1) != 0) {
      return 1;
    }
    uStack0000000000000040 = (short *)&uStack0000000000000008;
    in_stack_00000048 = &DAT_002683e0;
    uStack0000000000000010 = &UNK_007fc120;
    in_stack_00000018 = 1;
    in_stack_00000028 = 1;
    in_stack_00000030 = (undefined *)0x0;
    in_stack_00000020 = &uStack0000000000000040;
    uVar4 = func_0x0046849c(*unaff_x19,unaff_x19[1],&uStack0000000000000010);
    if ((uVar4 & 1) != 0) {
      return 1;
    }
    uStack0000000000000008 = (short *)((long)psVar8 + 3);
    uVar4 = func_0x0046920c();
    if ((uVar4 & 1) != 0) {
      return 1;
    }
    uStack0000000000000040 = (short *)&uStack0000000000000008;
    in_stack_00000048 = &DAT_002683e0;
    uStack0000000000000010 = &UNK_007fc120;
    in_stack_00000018 = 1;
    in_stack_00000028 = 1;
    in_stack_00000030 = (undefined *)0x0;
    in_stack_00000020 = &uStack0000000000000040;
    uVar4 = func_0x0046849c(*unaff_x19,unaff_x19[1],&uStack0000000000000010);
    if ((uVar4 & 1) == 0) {
      return 0;
    }
    return 1;
  }
  if (lVar9 != 0x10) {
    iVar3 = func_0x0046920c();
    if (iVar3 != 0) {
      return 1;
    }
    if (lVar9 != 0) {
      uStack0000000000000040 = (short *)&uStack0000000000000008;
      in_stack_00000048 = &DAT_002683e8;
      uStack0000000000000010 = &UNK_007fc120;
      in_stack_00000030 = &UNK_0082b1d0;
      in_stack_00000038 = 1;
      in_stack_00000020 = &uStack0000000000000040;
      in_stack_00000018 = 1;
      in_stack_00000028 = 1;
      uStack0000000000000008 = psVar8;
      uVar4 = func_0x0046849c(*unaff_x19,unaff_x19[1],&uStack0000000000000010);
      if ((uVar4 & 1) != 0) {
        return 1;
      }
      lVar9 = lVar9 + -1;
      if (lVar9 != 0) {
        do {
          psVar8 = (short *)((long)psVar8 + 1);
          uStack0000000000000008 = psVar8;
          uVar4 = func_0x0046920c();
          if ((uVar4 & 1) != 0) {
            return 1;
          }
          in_stack_00000048 = &DAT_002683e8;
          uStack0000000000000010 = &UNK_007fc120;
          in_stack_00000018 = 1;
          in_stack_00000030 = &UNK_0082b1d0;
          in_stack_00000038 = 1;
          in_stack_00000028 = 1;
          in_stack_00000020 = &uStack0000000000000040;
          uStack0000000000000040 = (short *)&uStack0000000000000008;
          uVar4 = func_0x0046849c(*unaff_x19,unaff_x19[1],&uStack0000000000000010);
          if ((uVar4 & 1) != 0) {
            return 1;
          }
          lVar9 = lVar9 + -1;
        } while (lVar9 != 0);
      }
    }
    uVar5 = func_0x0046920c();
    return uVar5;
  }
  uVar5 = *unaff_x19;
  uVar6 = unaff_x19[1];
  if ((char)*psVar8 != '\0') {
    in_stack_00000048 =
         &
         __ZN4core3fmt3num52__LT_impl_u20_core__fmt__LowerHex_u20_for_u20_i8_GT_3fmt17h13e71b7478e802c7E
    ;
    uStack0000000000000010 = &UNK_007fc120;
    in_stack_00000018 = 1;
    in_stack_00000028 = 1;
    in_stack_00000030 = (undefined *)0x0;
    in_stack_00000020 = &uStack0000000000000040;
    uStack0000000000000040 = psVar8;
    uVar4 = func_0x0046849c(uVar5,uVar6,&uStack0000000000000010);
    if ((uVar4 & 1) != 0) {
      return 1;
    }
    uVar5 = *unaff_x19;
    uVar6 = unaff_x19[1];
    if ((char)*psVar8 != '\0') {
      uStack0000000000000040 = (short *)((long)psVar8 + 1);
      in_stack_00000048 =
           &
           __ZN4core3fmt3num52__LT_impl_u20_core__fmt__LowerHex_u20_for_u20_i8_GT_3fmt17h13e71b7478e802c7E
      ;
      uStack0000000000000010 = &UNK_007fc120;
      in_stack_00000018 = 1;
      in_stack_00000030 = &UNK_0082b1d0;
      in_stack_00000038 = 1;
      in_stack_00000020 = &uStack0000000000000040;
      in_stack_00000028 = 1;
      uVar4 = func_0x0046849c(uVar5,uVar6,&uStack0000000000000010);
      goto joined_r0x00261c6c;
    }
  }
  uStack0000000000000040 = (short *)((long)psVar8 + 1);
  in_stack_00000048 =
       &
       __ZN4core3fmt3num52__LT_impl_u20_core__fmt__LowerHex_u20_for_u20_i8_GT_3fmt17h13e71b7478e802c7E
  ;
  uStack0000000000000010 = &UNK_007fc120;
  in_stack_00000018 = 1;
  in_stack_00000028 = 1;
  in_stack_00000030 = (undefined *)0x0;
  in_stack_00000020 = &uStack0000000000000040;
  uVar4 = func_0x0046849c(uVar5,uVar6,&uStack0000000000000010);
joined_r0x00261c6c:
  if ((uVar4 & 1) != 0) {
    return 1;
  }
  lVar9 = 0xe;
  bVar2 = false;
  do {
    psVar7 = psVar8 + 1;
    sVar1 = *psVar7;
    if (sVar1 != 0) {
      if (bVar2) {
        uVar4 = func_0x0046920c();
        if ((uVar4 & 1) != 0) {
          return 1;
        }
      }
      else {
        uVar4 = func_0x0046920c();
        if ((uVar4 & 1) != 0) {
          return 1;
        }
      }
      if ((char)*psVar7 != '\0') {
        in_stack_00000048 =
             &
             __ZN4core3fmt3num52__LT_impl_u20_core__fmt__LowerHex_u20_for_u20_i8_GT_3fmt17h13e71b7478e802c7E
        ;
        uStack0000000000000010 = &UNK_007fc120;
        in_stack_00000018 = 1;
        in_stack_00000028 = 1;
        in_stack_00000030 = (undefined *)0x0;
        in_stack_00000020 = &uStack0000000000000040;
        uStack0000000000000040 = psVar7;
        iVar3 = func_0x0046849c(*unaff_x19,unaff_x19[1],&uStack0000000000000010);
        if (iVar3 != 0) {
          return 1;
        }
        if ((char)*psVar7 != '\0') {
          uStack0000000000000040 = (short *)((long)psVar8 + 3);
          in_stack_00000048 =
               &
               __ZN4core3fmt3num52__LT_impl_u20_core__fmt__LowerHex_u20_for_u20_i8_GT_3fmt17h13e71b7478e802c7E
          ;
          uStack0000000000000010 = &UNK_007fc120;
          in_stack_00000018 = 1;
          in_stack_00000030 = &UNK_0082b1d0;
          in_stack_00000038 = 1;
          in_stack_00000028 = 1;
          in_stack_00000020 = &uStack0000000000000040;
          iVar3 = func_0x0046849c(*unaff_x19,unaff_x19[1],&uStack0000000000000010);
          if (iVar3 != 0) {
            return 1;
          }
          goto code_r0x00261ce4;
        }
      }
      uStack0000000000000040 = (short *)((long)psVar8 + 3);
      in_stack_00000048 =
           &
           __ZN4core3fmt3num52__LT_impl_u20_core__fmt__LowerHex_u20_for_u20_i8_GT_3fmt17h13e71b7478e802c7E
      ;
      uStack0000000000000010 = &UNK_007fc120;
      in_stack_00000018 = 1;
      in_stack_00000030 = (undefined *)0x0;
      in_stack_00000028 = 1;
      in_stack_00000020 = &uStack0000000000000040;
      iVar3 = func_0x0046849c(*unaff_x19,unaff_x19[1],&uStack0000000000000010);
      if (iVar3 != 0) {
        return 1;
      }
    }
code_r0x00261ce4:
    lVar9 = lVar9 + -2;
    psVar8 = psVar7;
    bVar2 = sVar1 == 0;
    if (lVar9 == 0) {
      return 0;
    }
  } while( true );
}

