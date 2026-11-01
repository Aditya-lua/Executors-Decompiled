
/* WARNING: Removing unreachable block (ram,0x0005c680) */
/* WARNING: Removing unreachable block (ram,0x0005c684) */
/* WARNING: Type propagation algorithm not settling */
/* WARNING: Restarted to delay deadcode elimination for space: stack */

void FUN_0005c838(undefined1 *param_1)

{
  ulong uVar1;
  byte bVar2;
  long *plVar3;
  undefined8 uVar4;
  ulong uVar5;
  undefined1 in_w8;
  code *extraout_x8;
  long unaff_x19;
  long *unaff_x20;
  undefined8 *unaff_x21;
  code *pcVar6;
  long unaff_x29;
  undefined1 uStack0000000000000010;
  undefined8 uStack0000000000000018;
  undefined8 uStack0000000000000038;
  undefined8 in_stack_00000048;
  undefined8 uStack0000000000000050;
  undefined8 in_stack_00000060;
  undefined8 uStack0000000000000068;
  undefined8 in_stack_00000078;
  undefined8 uStack0000000000000080;
  undefined8 in_stack_00000090;
  undefined8 uStack0000000000000098;
  undefined8 in_stack_000000a8;
  undefined8 uStack00000000000000b0;
  undefined8 in_stack_000000c0;
  undefined8 uStack00000000000000c8;
  undefined8 in_stack_000000d8;
  undefined8 uStack00000000000000e0;
  undefined8 in_stack_000000f0;
  undefined8 uStack00000000000000f8;
  undefined8 in_stack_00000108;
  undefined8 uStack0000000000000110;
  undefined8 in_stack_00000120;
  
  do {
    *param_1 = in_w8;
    unaff_x20 = (long *)(*(code *)*unaff_x20)(unaff_x20);
    plVar3 = (long *)func_0x0005fed4();
    if (unaff_x20 + 1 == plVar3) {
code_r0x0005c5c8:
      uVar4 = 0;
      if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x38)) {
        return;
      }
    }
    else {
      bVar2 = *(byte *)(unaff_x19 + 0xdf);
      uVar1 = *(ulong *)(unaff_x19 + 0xd0);
      if (-1 < (char)bVar2) {
        uVar1 = (ulong)bVar2;
      }
      if (uVar1 != 8) goto code_r0x0005c5c8;
      plVar3 = *(long **)(unaff_x19 + 200);
      if (-1 < (char)bVar2) {
        plVar3 = (long *)(unaff_x19 + 200);
      }
      if ((*plVar3 != 0x312e312f50545448) && (*plVar3 != 0x302e312f50545448)) goto code_r0x0005c5c8;
      unaff_x20 = (long *)(unaff_x19 + 0xe0);
      bVar2 = *(byte *)(unaff_x19 + 0xf7);
      uVar1 = *(ulong *)(unaff_x19 + 0xe8);
      if (-1 < (char)bVar2) {
        uVar1 = (ulong)bVar2;
      }
      if (uVar1 != 0) {
        uVar5 = 0;
        plVar3 = (long *)*unaff_x20;
        if (-1 < (char)bVar2) {
          plVar3 = unaff_x20;
        }
        do {
          if (*(char *)((long)plVar3 + uVar5) == '#') {
            __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE5eraseEmm
                      (unaff_x20,uVar5,0xffffffffffffffff);
            break;
          }
          uVar5 = uVar5 + 1;
        } while (uVar1 != uVar5);
      }
      uStack0000000000000018 = &UNK_009b81b0;
      unaff_x21 = &uStack0000000000000018;
      func_0x0005f610(unaff_x20,0x3f,&uStack0000000000000018);
      (**(code **)(uStack0000000000000018 + 0x20))();
      uVar4 = 1;
      if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x38)) {
        return;
      }
    }
    ___stack_chk_fail(uVar4);
    func_0x0000a968(&uStack0000000000000038,"GET");
    func_0x0000a968(&uStack0000000000000050,"HEAD");
    func_0x0000a968(&uStack0000000000000068,"POST");
    func_0x0000a968(&uStack0000000000000080,"PUT");
    func_0x0000a968(&uStack0000000000000098,"DELETE");
    func_0x0000a968(&uStack00000000000000b0,"CONNECT");
    func_0x0000a968(&uStack00000000000000c8,"OPTIONS");
    func_0x0000a968(&uStack00000000000000e0,"TRACE");
    func_0x0000a968(&uStack00000000000000f8,"PATCH");
    func_0x0000a968(&uStack0000000000000110,"PRI");
    pcVar6 = (code *)*unaff_x20;
    uVar4 = (*pcVar6)(unaff_x20);
    func_0x0005f568(uVar4,&uStack0000000000000038,10,&uStack0000000000000010);
    if (in_stack_00000120._7_1_ < '\0') {
      __ZdlPv(uStack0000000000000110);
    }
    if (in_stack_00000108._7_1_ < '\0') {
      __ZdlPv(uStack00000000000000f8);
    }
    if (in_stack_000000f0._7_1_ < '\0') {
      __ZdlPv(uStack00000000000000e0);
    }
    if (in_stack_000000d8._7_1_ < '\0') {
      __ZdlPv(uStack00000000000000c8);
    }
    if (in_stack_000000c0._7_1_ < '\0') {
      __ZdlPv(uStack00000000000000b0);
    }
    if (in_stack_000000a8._7_1_ < '\0') {
      __ZdlPv(uStack0000000000000098);
    }
    if (in_stack_00000090._7_1_ < '\0') {
      __ZdlPv(uStack0000000000000080);
    }
    if (in_stack_00000078._7_1_ < '\0') {
      __ZdlPv(uStack0000000000000068);
    }
    if (in_stack_00000060._7_1_ < '\0') {
      __ZdlPv(uStack0000000000000050);
    }
    if (in_stack_00000048._7_1_ < '\0') {
      __ZdlPv(uStack0000000000000038);
    }
    uVar4 = (*pcVar6)(unaff_x20);
    __tlv_atexit(&DAT_0005f5e8,uVar4,0);
    param_1 = (undefined1 *)(*extraout_x8)(unaff_x21);
    in_w8 = 1;
  } while( true );
}

