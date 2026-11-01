
void FUN_0043adb0(undefined8 param_1,undefined8 param_2)

{
  undefined4 uVar1;
  ulong uVar2;
  int iVar3;
  undefined8 uVar4;
  ulong *puVar5;
  ulong uVar6;
  undefined8 *puVar7;
  char in_stack_000000b8;
  undefined4 uStack_cc;
  undefined2 uStack_c8;
  undefined4 uStack_c6;
  undefined2 uStack_c2;
  undefined8 uStack_c0;
  ulong uStack_b8;
  undefined8 uStack_b0;
  undefined8 uStack_a8;
  undefined8 uStack_a0;
  undefined8 uStack_98;
  undefined8 uStack_90;
  undefined8 uStack_88;
  undefined8 uStack_80;
  undefined8 uStack_78;
  undefined8 uStack_70;
  undefined8 uStack_68;
  ulong uStack_60;
  undefined8 uStack_58;
  undefined8 uStack_50;
  undefined8 uStack_48;
  undefined8 uStack_40;
  undefined8 uStack_38;
  
  uVar4 = func_0x007a2570(param_2,param_1);
  if (in_stack_000000b8 == '\x02') {
    func_0x003f6210();
  }
  puVar5 = (ulong *)__Unwind_Resume(uVar4);
  uStack_cc = 0;
  uStack_c8 = 0x1b6;
  uStack_c2 = 0;
  uStack_c6 = 1;
  func_0x00416de4(&uStack_c0,&uStack_cc);
  uVar1 = uStack_c0._4_4_;
  if ((uStack_c0 & 1) == 0) {
    uStack_48 = 0;
    uStack_50 = 0;
    uStack_38 = 0;
    uStack_40 = 0;
    uStack_68 = 0;
    uStack_70 = 0;
    uStack_58 = 0;
    uStack_60 = 0;
    uStack_88 = 0;
    uStack_90 = 0;
    uStack_78 = 0;
    uStack_80 = 0;
    uStack_a8 = 0;
    uStack_b0 = 0;
    uStack_98 = 0;
    uStack_a0 = 0;
    uStack_b8 = 0;
    uStack_c0 = 0;
    iVar3 = _fstat(uVar1,&uStack_c0);
    uVar2 = uStack_60;
    if (iVar3 == -1) {
      ___error();
      *puVar5 = 0;
    }
    else {
      uVar6 = _mmap(0,uStack_60,1,2,uVar1,0);
      if (uVar6 != 0xffffffffffffffff) {
        puVar5[1] = uVar6;
        puVar5[2] = uVar2;
      }
      *puVar5 = (ulong)(uVar6 != 0xffffffffffffffff);
    }
    _close(uVar1);
  }
  else if ((int)uStack_c0 == 0) {
    _close(uStack_c0._4_4_);
    *puVar5 = 0;
  }
  else {
    if ((uStack_b8 & 3) == 1) {
      uVar4 = *(undefined8 *)(uStack_b8 - 1);
      puVar7 = *(undefined8 **)(uStack_b8 + 7);
      if ((code *)*puVar7 != (code *)0x0) {
        (*(code *)*puVar7)(uVar4);
      }
      if (puVar7[1] != 0) {
        func_0x00187bd4(uVar4,puVar7[1],puVar7[2]);
      }
      func_0x00187bd4((undefined8 *)(uStack_b8 - 1),0x18,8);
    }
    *puVar5 = 0;
  }
  return;
}

