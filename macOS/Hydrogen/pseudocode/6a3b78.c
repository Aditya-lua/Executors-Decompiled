
long FUN_006a3b78(long param_1,long *param_2,undefined8 param_3)

{
  uint uVar1;
  undefined8 *puVar2;
  undefined8 uVar3;
  undefined4 uVar4;
  long unaff_x22;
  undefined8 uStack0000000000000008;
  undefined *in_stack_00000010;
  undefined8 in_stack_00000020;
  ulong in_stack_00000028;
  undefined8 in_stack_00000030;
  long lStack0000000000000038;
  
  lStack0000000000000038 = *(long *)PTR____stack_chk_guard_009b01e8;
  puVar2 = (undefined8 *)func_0x005edf2c(param_1,1);
  *puVar2 = &UNK_00a15b10;
  puVar2[1] = param_2;
  uVar1 = (**(code **)(*param_2 + 0x30))(param_2);
  *(uint *)(param_1 + 0x10) = uVar1;
  *(undefined8 *)(param_1 + 0x20) = 0xffffffffffffffff;
  *(ulong *)(param_1 + 0x28) = (ulong)uVar1;
  if (uVar1 == 0) {
    uVar4 = 0;
    uVar3 = 0;
  }
  else {
    uVar3 = func_0x006115d0((ulong)uVar1);
    uVar4 = *(undefined4 *)(param_1 + 0x10);
  }
  *(undefined8 *)(param_1 + 0x30) = uVar3;
  func_0x00694b20(param_1 + 0x38,param_3,uVar4);
  *(undefined8 *)(param_1 + 0x60) = 0xffffffffffffffff;
  *(ulong *)(param_1 + 0x68) = (ulong)*(uint *)(param_1 + 0x10);
  if (*(uint *)(param_1 + 0x10) == 0) {
    *(undefined8 *)(param_1 + 0x70) = 0;
  }
  else {
    uVar3 = func_0x006115d0();
    *(undefined8 *)(param_1 + 0x70) = uVar3;
  }
  func_0x00694b20(param_1 + 0x78);
  if (8 < *(uint *)(param_1 + 0x10)) {
    _bzero(*(undefined8 *)(param_1 + 0x30));
    _bzero(*(undefined8 *)(param_1 + 0x70),*(undefined4 *)(param_1 + 0x10));
  }
  if (unaff_x22 == 0) {
    uStack0000000000000008 = (undefined *)_time(0);
    uVar1 = *(uint *)(param_1 + 0x10);
    if (7 < uVar1) {
      uVar1 = 8;
    }
    func_0x006853f4(*(undefined8 *)(param_1 + 0x30),&uStack0000000000000008,uVar1);
    (**(code **)(**(long **)(param_1 + 8) + 0x28))
              (*(long **)(param_1 + 8),*(undefined8 *)(param_1 + 0x30),0,
               *(undefined8 *)(param_1 + 0x30));
    _clock();
    func_0x006853f4(*(undefined8 *)(param_1 + 0x30));
    (**(code **)(**(long **)(param_1 + 8) + 0x28))
              (*(long **)(param_1 + 8),*(undefined8 *)(param_1 + 0x30),0,
               *(undefined8 *)(param_1 + 0x30));
  }
  uVar3 = *(undefined8 *)(param_1 + 0x70);
  uVar1 = *(uint *)(param_1 + 0x10);
  func_0x005edf2c(&uStack0000000000000008,0);
  uStack0000000000000008 = &UNK_00a0e1c8;
  in_stack_00000010 = &UNK_00a0e358;
  in_stack_00000030 = 0;
  in_stack_00000020 = uVar3;
  in_stack_00000028 = (ulong)uVar1;
  func_0x006a3df8(param_1,&uStack0000000000000008,&UNK_008ba5c8,*(undefined4 *)(param_1 + 0x10));
  if (*(long *)PTR____stack_chk_guard_009b01e8 == lStack0000000000000038) {
    return param_1;
  }
  uVar3 = ___stack_chk_fail();
  func_0x0003e9ec(param_1 + 0x78);
  do {
    func_0x0003e9ec(param_1 + 0x58);
    func_0x0003e9ec(param_1 + 0x38);
    func_0x0003e9ec(param_1 + 0x18);
    if (*(long **)(param_1 + 8) != (long *)0x0) {
      (**(code **)(**(long **)(param_1 + 8) + 8))();
    }
    uVar3 = __Unwind_Resume(uVar3);
  } while( true );
}

