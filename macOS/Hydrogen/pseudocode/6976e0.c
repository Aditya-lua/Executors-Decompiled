
void FUN_006976e0(long *param_1,undefined8 param_2,undefined8 param_3,ulong param_4,
                 undefined8 param_5,undefined8 param_6)

{
  int iVar1;
  code *pcVar2;
  int iVar3;
  ulong uVar4;
  long lVar5;
  long lVar6;
  long *plVar7;
  long *plVar8;
  undefined8 uVar9;
  undefined8 *puVar10;
  undefined8 uVar11;
  long *plVar12;
  undefined8 uStack0000000000000010;
  undefined8 in_stack_00000018;
  ulong in_stack_00000020;
  ulong in_stack_00000028;
  long in_stack_00000030;
  undefined1 uStack0000000000000040;
  undefined8 in_stack_00000048;
  long in_stack_00000050;
  long in_stack_00000058;
  undefined8 uStack0000000000000060;
  ulong in_stack_00000068;
  undefined8 in_stack_00000070;
  undefined8 uStack0000000000000078;
  ulong in_stack_00000080;
  undefined8 in_stack_00000088;
  undefined1 uStack0000000000000090;
  undefined1 uStack00000000000000a8;
  undefined8 uStack00000000000000c0;
  undefined8 in_stack_000000c8;
  undefined8 in_stack_000000d0;
  undefined8 uStack00000000000000d8;
  ulong in_stack_000000e8;
  ulong in_stack_000000f0;
  long in_stack_000000f8;
  
  uVar4 = (**(code **)(*param_1 + 0x30))();
  if (uVar4 < param_4) {
    lVar5 = (**(code **)(*param_1 + 0x30))(param_1);
    uVar9 = ___cxa_allocate_exception(0x28);
    if (lVar5 == 0) {
      (**(code **)(param_1[1] + 0x18))(&uStack0000000000000010,param_1 + 1);
      func_0x0003a638(&uStack00000000000000d8,&uStack0000000000000010,
                      ": this key is too short to encrypt any messages");
      func_0x0002703c(uVar9,&uStack00000000000000d8);
      ___cxa_throw(uVar9,&DAT_009b2ee0,&DAT_000270bc);
    }
    else {
      (**(code **)(param_1[1] + 0x18))(&uStack0000000000000090);
      func_0x0003a638(&uStack00000000000000a8,&uStack0000000000000090,": message length of ");
      func_0x0060de44(&uStack0000000000000078,param_4,10);
      uVar4 = in_stack_00000080;
      puVar10 = uStack0000000000000078;
      if (-1 < (char)in_stack_00000088._7_1_) {
        uVar4 = (ulong)in_stack_00000088._7_1_;
        puVar10 = &uStack0000000000000078;
      }
      puVar10 = (undefined8 *)
                __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm
                          (&uStack00000000000000a8,puVar10,uVar4);
      in_stack_000000c8 = puVar10[1];
      uStack00000000000000c0 = *puVar10;
      in_stack_000000d0 = puVar10[2];
      puVar10[1] = 0;
      puVar10[2] = 0;
      *puVar10 = 0;
      func_0x0003a638(&uStack0000000000000040,&uStack00000000000000c0," exceeds the maximum of ");
      uVar11 = (**(code **)(*param_1 + 0x30))(param_1);
      func_0x0060de44(&uStack0000000000000060,uVar11,10);
      uVar4 = in_stack_00000068;
      puVar10 = uStack0000000000000060;
      if (-1 < (char)in_stack_00000070._7_1_) {
        uVar4 = (ulong)in_stack_00000070._7_1_;
        puVar10 = &uStack0000000000000060;
      }
      puVar10 = (undefined8 *)
                __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm
                          (&uStack0000000000000040,puVar10,uVar4);
      in_stack_00000018 = puVar10[1];
      uStack0000000000000010 = (undefined *)*puVar10;
      in_stack_00000020 = puVar10[2];
      puVar10[1] = 0;
      puVar10[2] = 0;
      *puVar10 = 0;
      func_0x0003a638(&uStack00000000000000d8,&uStack0000000000000010," for this public key");
      func_0x0002703c(uVar9,&uStack00000000000000d8);
      ___cxa_throw(uVar9,&DAT_009b2ee0,&DAT_000270bc);
    }
                    /* WARNING: Does not return */
    pcVar2 = (code *)SoftwareBreakpoint(1,0x697aa8);
    (*pcVar2)();
  }
  lVar5 = func_0x00697cdc(param_1);
  in_stack_00000048 = 0xffffffffffffffff;
  in_stack_00000050 = lVar5;
  if (lVar5 == 0) {
    lVar6 = 0;
  }
  else {
    lVar6 = func_0x006115d0(lVar5);
  }
  plVar12 = param_1 + 2;
  in_stack_00000058 = lVar6;
  plVar7 = (long *)(**(code **)(*plVar12 + 0x20))(plVar12);
  plVar8 = (long *)(**(code **)(*plVar12 + 0x10))(plVar12);
  (**(code **)(*plVar8 + 0x10))(&uStack00000000000000d8);
  iVar3 = func_0x00602288(&uStack00000000000000d8);
  uStack00000000000000d8 = &UNK_009f5d60;
  uVar4 = in_stack_000000e8;
  if (in_stack_000000f0 <= in_stack_000000e8) {
    uVar4 = in_stack_000000f0;
  }
  if (in_stack_000000f8 != 0) {
    if (uVar4 != 0) {
      do {
        *(undefined8 *)(in_stack_000000f8 + -8 + uVar4 * 8) = 0;
        uVar4 = uVar4 - 1;
      } while (uVar4 != 0);
    }
    func_0x00611644();
  }
  iVar1 = 0;
  if (iVar3 != 0) {
    iVar1 = iVar3 + -1;
  }
  (**(code **)(*plVar7 + 0x20))(plVar7,param_2,param_3,param_4,lVar6,iVar1,param_6);
  plVar7 = (long *)(**(code **)(*plVar12 + 0x18))(plVar12);
  func_0x005fef78(&uStack0000000000000010,lVar6,lVar5,0,1);
  (**(code **)(*plVar7 + 0x30))(&uStack00000000000000d8,plVar7,param_2,&uStack0000000000000010);
  uVar9 = (**(code **)(*param_1 + 0x28))(param_1);
  func_0x00602560(&uStack00000000000000d8,param_5,uVar9,0);
  uStack00000000000000d8 = &UNK_009f5d60;
  uVar4 = in_stack_000000e8;
  if (in_stack_000000f0 <= in_stack_000000e8) {
    uVar4 = in_stack_000000f0;
  }
  if (in_stack_000000f8 != 0) {
    if (uVar4 != 0) {
      do {
        *(undefined8 *)(in_stack_000000f8 + -8 + uVar4 * 8) = 0;
        uVar4 = uVar4 - 1;
      } while (uVar4 != 0);
    }
    func_0x00611644();
  }
  uStack0000000000000010 = &UNK_009f5d60;
  uVar4 = in_stack_00000020;
  if (in_stack_00000028 <= in_stack_00000020) {
    uVar4 = in_stack_00000028;
  }
  if (in_stack_00000030 != 0) {
    if (uVar4 != 0) {
      do {
        *(undefined8 *)(in_stack_00000030 + -8 + uVar4 * 8) = 0;
        uVar4 = uVar4 - 1;
      } while (uVar4 != 0);
    }
    func_0x00611644();
  }
  if (lVar6 != 0) {
    if (lVar5 != 0) {
      do {
        *(undefined1 *)(lVar6 + -1 + lVar5) = 0;
        lVar5 = lVar5 + -1;
      } while (lVar5 != 0);
    }
    func_0x00611644(lVar6);
  }
  return;
}

