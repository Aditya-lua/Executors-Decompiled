
long FUN_006a4014(undefined8 param_1,undefined8 param_2,undefined8 param_3,long param_4)

{
  uint uVar1;
  undefined8 *puVar2;
  undefined8 uVar3;
  long lVar4;
  long *plVar5;
  undefined4 uVar6;
  undefined8 unaff_x20;
  ulong unaff_x21;
  undefined1 auVar7 [16];
  undefined8 in_stack_00000000;
  undefined8 uStack_80;
  undefined *puStack_78;
  undefined *puStack_70;
  undefined8 uStack_60;
  ulong uStack_58;
  undefined8 uStack_50;
  long lStack_48;
  
  __ZdlPv(in_stack_00000000);
  if ((unaff_x21 & 1) == 0) {
    unaff_x20 = __Unwind_Resume();
  }
  ___cxa_free_exception();
  auVar7 = __Unwind_Resume(unaff_x20);
  plVar5 = auVar7._8_8_;
  lVar4 = auVar7._0_8_;
  lStack_48 = *(long *)PTR____stack_chk_guard_009b01e8;
  puVar2 = (undefined8 *)func_0x005edf2c(lVar4,1);
  *puVar2 = &UNK_00a15b10;
  puVar2[1] = plVar5;
  uVar1 = (**(code **)(*plVar5 + 0x30))(plVar5);
  *(uint *)(lVar4 + 0x10) = uVar1;
  *(undefined8 *)(lVar4 + 0x20) = 0xffffffffffffffff;
  *(ulong *)(lVar4 + 0x28) = (ulong)uVar1;
  if (uVar1 == 0) {
    uVar6 = 0;
    uVar3 = 0;
  }
  else {
    uVar3 = func_0x006115d0((ulong)uVar1);
    uVar6 = *(undefined4 *)(lVar4 + 0x10);
  }
  *(undefined8 *)(lVar4 + 0x30) = uVar3;
  func_0x00694b20(lVar4 + 0x38,param_3,uVar6);
  *(undefined8 *)(lVar4 + 0x60) = 0xffffffffffffffff;
  *(ulong *)(lVar4 + 0x68) = (ulong)*(uint *)(lVar4 + 0x10);
  if (*(uint *)(lVar4 + 0x10) == 0) {
    *(undefined8 *)(lVar4 + 0x70) = 0;
  }
  else {
    uVar3 = func_0x006115d0();
    *(undefined8 *)(lVar4 + 0x70) = uVar3;
  }
  if (param_4 == 0) {
    uVar6 = 0;
  }
  else {
    uVar6 = *(undefined4 *)(lVar4 + 0x10);
  }
  func_0x00694b20(lVar4 + 0x78,param_4,uVar6);
  if (8 < *(uint *)(lVar4 + 0x10)) {
    _bzero(*(undefined8 *)(lVar4 + 0x30));
    _bzero(*(undefined8 *)(lVar4 + 0x70),*(undefined4 *)(lVar4 + 0x10));
  }
  if (param_4 == 0) {
    puStack_78 = (undefined *)_time(0);
    uVar1 = *(uint *)(lVar4 + 0x10);
    if (7 < uVar1) {
      uVar1 = 8;
    }
    func_0x006853f4(*(undefined8 *)(lVar4 + 0x30),&puStack_78,uVar1);
    (**(code **)(**(long **)(lVar4 + 8) + 0x28))
              (*(long **)(lVar4 + 8),*(undefined8 *)(lVar4 + 0x30),0,*(undefined8 *)(lVar4 + 0x30));
    uStack_80 = _clock();
    uVar1 = *(uint *)(lVar4 + 0x10);
    if (7 < uVar1) {
      uVar1 = 8;
    }
    func_0x006853f4(*(undefined8 *)(lVar4 + 0x30),&uStack_80,uVar1);
    (**(code **)(**(long **)(lVar4 + 8) + 0x28))
              (*(long **)(lVar4 + 8),*(undefined8 *)(lVar4 + 0x30),0,*(undefined8 *)(lVar4 + 0x30));
  }
  uVar3 = *(undefined8 *)(lVar4 + 0x70);
  uVar1 = *(uint *)(lVar4 + 0x10);
  func_0x005edf2c(&puStack_78,0);
  puStack_78 = &UNK_00a0e1c8;
  puStack_70 = &UNK_00a0e358;
  uStack_50 = 0;
  uStack_60 = uVar3;
  uStack_58 = (ulong)uVar1;
  func_0x006a3df8(lVar4,&puStack_78,&UNK_008ba5c8,*(undefined4 *)(lVar4 + 0x10));
  if (*(long *)PTR____stack_chk_guard_009b01e8 == lStack_48) {
    return lVar4;
  }
  uVar3 = ___stack_chk_fail();
  func_0x0003e9ec(lVar4 + 0x78);
  do {
    func_0x0003e9ec(lVar4 + 0x58);
    func_0x0003e9ec(lVar4 + 0x38);
    func_0x0003e9ec(lVar4 + 0x18);
    if (*(long **)(lVar4 + 8) != (long *)0x0) {
      (**(code **)(**(long **)(lVar4 + 8) + 8))();
    }
    uVar3 = __Unwind_Resume(uVar3);
  } while( true );
}

