
void FUN_0070fc80(undefined8 param_1,int param_2,undefined8 param_3,undefined8 param_4,
                 undefined2 *param_5)

{
  undefined8 uVar1;
  undefined8 uVar2;
  undefined8 *puVar3;
  long lVar4;
  undefined8 *extraout_x8;
  undefined8 *unaff_x19;
  uint uVar5;
  undefined1 auVar6 [16];
  long in_stack_00000008;
  long in_stack_00000030;
  char in_stack_00000050;
  undefined1 uStack0000000000000080;
  long in_stack_00000228;
  long in_stack_00000230;
  undefined8 in_stack_00000498;
  undefined8 in_stack_000004a0;
  undefined8 in_stack_000004a8;
  undefined8 in_stack_000004b0;
  undefined1 auStack_7ffffffe [2147482350];
  undefined2 auStack_510 [4];
  ulong uStack_508;
  undefined8 uStack_500;
  undefined8 uStack_4f8;
  undefined8 uStack_4f0;
  long lStack_4e0;
  long lStack_4d8;
  undefined8 uStack_4d0;
  undefined8 uStack_4c8;
  char cStack_4c0;
  undefined2 uStack_4b8;
  undefined8 uStack_4b0;
  undefined8 uStack_4a8;
  undefined8 uStack_4a0;
  undefined8 uStack_498;
  undefined1 auStack_490 [96];
  undefined1 auStack_430 [32];
  int iStack_410;
  undefined8 uStack_40c;
  int iStack_404;
  undefined4 uStack_400;
  undefined8 uStack_3b0;
  undefined8 uStack_3a8;
  undefined8 uStack_3a0;
  undefined8 uStack_398;
  undefined8 uStack_390;
  undefined8 uStack_388;
  undefined8 uStack_2e8;
  undefined8 *puStack_2e0;
  undefined8 *puStack_2d8;
  undefined8 uStack_78;
  undefined8 uStack_70;
  undefined8 uStack_68;
  undefined8 uStack_60;
  
  if (param_2 == 1) {
    uVar2 = ___cxa_begin_catch(param_1);
    func_0x0070f998(auStack_7ffffffe + 0x80000226,uVar2);
    unaff_x19[5] = 0;
    unaff_x19[4] = 0;
    unaff_x19[7] = 0;
    unaff_x19[6] = 0;
    unaff_x19[1] = 0;
    *unaff_x19 = 0;
    unaff_x19[3] = 0;
    unaff_x19[2] = 0;
    func_0x006d073c(unaff_x19 + 5,in_stack_00000228,in_stack_00000230,
                    (in_stack_00000230 - in_stack_00000228 >> 4) * -0x5555555555555555);
    unaff_x19[8] = 0;
    unaff_x19[9] = 0;
    unaff_x19[10] = 0;
    unaff_x19[0xb] = in_stack_00000498;
    unaff_x19[0xd] = in_stack_000004a8;
    unaff_x19[0xc] = in_stack_000004a0;
    unaff_x19[0xe] = in_stack_000004b0;
    ___cxa_end_catch();
    func_0x007253a4(&uStack0000000000000080);
    if (in_stack_00000050 != '\0') {
      if (in_stack_00000030 != 0) {
        __ZdlPv();
      }
      if (in_stack_00000008 != 0) {
        __ZdlPv();
      }
    }
    return;
  }
  func_0x007253a4(&uStack0000000000000080);
  func_0x00057f4c();
  __Unwind_Resume(param_1);
  uVar2 = func_0x0001753c();
  func_0x00057f4c();
  auVar6 = __Unwind_Resume(uVar2);
  lVar4 = auVar6._8_8_;
  auStack_510[0] = *param_5;
  uStack_508 = uStack_508 & 0xffffffffffffff00;
  cStack_4c0 = *(char *)(param_5 + 0x28) != '\0';
  if ((bool)cStack_4c0) {
    uStack_508 = *(ulong *)(param_5 + 4);
    uStack_4f8 = *(undefined8 *)(param_5 + 0xc);
    uStack_500 = *(undefined8 *)(param_5 + 8);
    uStack_4f0 = *(undefined8 *)(param_5 + 0x10);
    *(undefined8 *)(param_5 + 8) = 0;
    *(undefined8 *)(param_5 + 0xc) = 0;
    *(undefined8 *)(param_5 + 4) = 0;
    lStack_4d8 = *(long *)(param_5 + 0x1c);
    lStack_4e0 = *(long *)(param_5 + 0x18);
    *(undefined8 *)(param_5 + 0x18) = 0;
    *(undefined8 *)(param_5 + 0x1c) = 0;
    uStack_4d0 = *(undefined8 *)(param_5 + 0x20);
    uStack_4c8 = *(undefined8 *)(param_5 + 0x24);
    *(undefined8 *)(param_5 + 0x20) = 0;
  }
  uStack_4b8 = param_5[0x2c];
  func_0x007100b8(auStack_490,auVar6._0_8_,lVar4,param_3,param_4,auStack_510);
  uVar2 = 0;
  uStack_4a8 = CONCAT44(uStack_400,iStack_404);
  uStack_4b0 = uStack_40c;
  if ((iStack_410 != 0x26) && (iStack_410 != 0x7c)) {
    uVar2 = func_0x0071f5c8(auStack_490,0,0);
  }
  uVar2 = func_0x0071cf0c(auStack_490,uVar2,&uStack_4b0);
  uVar5 = 0;
  if (lVar4 != 0) {
    uVar5 = (uint)(*(char *)(lVar4 + auVar6._0_8_ + -1) != '\n');
  }
  if (cRam0000000000a33708 != '\0') {
    puVar3 = (undefined8 *)func_0x0070ba44(auStack_430);
    uStack_4a8 = puVar3[1];
    uStack_4b0 = *puVar3;
    uStack_498 = puVar3[3];
    uStack_4a0 = puVar3[2];
    if ((int)uStack_4b0 != 0) {
      puVar3 = (undefined8 *)((ulong)&uStack_4b0 | 4);
      if (puStack_2e0 < puStack_2d8) {
        *puStack_2e0 = &UNK_00a1df28;
        uVar2 = *puVar3;
        puStack_2e0[2] = puVar3[1];
        puStack_2e0[1] = uVar2;
        *(undefined4 *)(puStack_2e0 + 5) = 0x656c6966;
        uVar2 = s_Expected_end_of_file_008ed510._0_8_;
        puStack_2e0[4] = s_Expected_end_of_file_008ed510._8_8_;
        puStack_2e0[3] = uVar2;
        *(undefined1 *)((long)puStack_2e0 + 0x2c) = 0;
        *(undefined1 *)((long)puStack_2e0 + 0x2f) = 0x14;
        puStack_2e0 = puStack_2e0 + 6;
      }
      else {
        puStack_2e0 = (undefined8 *)func_0x00725d54(&uStack_2e8,puVar3,"Expected end of file");
      }
      uVar2 = 0;
    }
  }
  uVar1 = uStack_3a0;
  *extraout_x8 = uVar2;
  extraout_x8[1] = (ulong)(uVar5 + iStack_404);
  extraout_x8[3] = uStack_390;
  extraout_x8[2] = uStack_398;
  extraout_x8[4] = uStack_388;
  uStack_390 = 0;
  uStack_388 = 0;
  extraout_x8[6] = puStack_2e0;
  extraout_x8[5] = uStack_2e8;
  extraout_x8[7] = puStack_2d8;
  uStack_2e8 = 0;
  puStack_2e0 = (undefined8 *)0x0;
  extraout_x8[9] = uStack_3a8;
  extraout_x8[8] = uStack_3b0;
  uStack_3b0 = 0;
  uStack_3a8 = 0;
  uStack_3a0 = 0;
  uStack_398 = 0;
  extraout_x8[10] = uVar1;
  extraout_x8[0xb] = uStack_78;
  extraout_x8[0xd] = uStack_68;
  extraout_x8[0xc] = uStack_70;
  extraout_x8[0xe] = uStack_60;
  puStack_2d8 = (undefined8 *)0x0;
  uStack_78 = 0;
  uStack_68 = 0;
  uStack_70 = 0;
  func_0x007253a4(auStack_490);
  if (cStack_4c0 != '\0') {
    if (lStack_4e0 != 0) {
      lStack_4d8 = lStack_4e0;
      __ZdlPv();
    }
    if (uStack_508 != 0) {
      __ZdlPv();
    }
  }
  return;
}

