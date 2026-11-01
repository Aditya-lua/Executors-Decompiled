
void FUN_004315d0(undefined8 *param_1)

{
  code *pcVar1;
  int iVar2;
  uint *puVar3;
  undefined8 uVar4;
  undefined8 uStack0000000000000008;
  undefined8 in_stack_00000010;
  undefined8 *in_stack_00000018;
  undefined8 in_stack_00000020;
  undefined8 in_stack_00000028;
  undefined8 uStack0000000000000038;
  undefined *in_stack_00000040;
  undefined8 uStack0000000000000048;
  
  uVar4 = *param_1;
  _dirfd(uVar4);
  iVar2 = _closedir(uVar4);
  if (iVar2 != 0) {
    puVar3 = (uint *)___error();
    uStack0000000000000008 = (undefined *)((ulong)*puVar3 << 0x20 | 2);
    if (*puVar3 != 4) {
      func_0x003f67e4(&uStack0000000000000008);
      uStack0000000000000048 = (ulong)*puVar3 << 0x20 | 2;
      uStack0000000000000038 = &uStack0000000000000048;
      in_stack_00000040 =
           &__ZN58__LT_std__io__error__Error_u20_as_u20_core__fmt__Debug_GT_3fmt17h358f373ac5c2feacE
      ;
      uStack0000000000000008 = &UNK_009dbb20;
      in_stack_00000010 = 1;
      in_stack_00000020 = 1;
      in_stack_00000028 = 0;
      in_stack_00000018 = &uStack0000000000000038;
      func_0x007a2420(&uStack0000000000000008,&UNK_009dbb30);
                    /* WARNING: Does not return */
      pcVar1 = (code *)SoftwareBreakpoint(1,0x431678);
      (*pcVar1)();
    }
  }
  return;
}

