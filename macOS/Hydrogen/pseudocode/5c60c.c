
/* WARNING: Removing unreachable block (ram,0x0005c680) */
/* WARNING: Removing unreachable block (ram,0x0005c684) */
/* WARNING: Type propagation algorithm not settling */
/* WARNING: Restarted to delay deadcode elimination for space: stack */

void FUN_0005c60c(ulong param_1)

{
  byte bVar1;
  long *plVar2;
  undefined8 uVar3;
  undefined1 *puVar4;
  ulong uVar5;
  code *extraout_x8;
  int in_w9;
  ulong in_x10;
  long unaff_x19;
  long *unaff_x20;
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
  
code_r0x0005c60c:
  if (-1 < in_w9) {
    in_x10 = param_1;
  }
  if (in_x10 != 0) {
    uVar5 = 0;
    plVar2 = (long *)*unaff_x20;
    if (-1 < in_w9) {
      plVar2 = unaff_x20;
    }
    do {
      if (*(char *)((long)plVar2 + uVar5) == '#') {
        __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE5eraseEmm
                  (unaff_x20,uVar5,0xffffffffffffffff);
        break;
      }
      uVar5 = uVar5 + 1;
    } while (in_x10 != uVar5);
  }
  uStack0000000000000018 = &UNK_009b81b0;
  func_0x0005f610(unaff_x20,0x3f,&uStack0000000000000018);
  (**(code **)(uStack0000000000000018 + 0x20))();
  uVar3 = 1;
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x38)) {
    return;
  }
  do {
    ___stack_chk_fail(uVar3);
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
    uVar3 = (*pcVar6)(unaff_x20);
    func_0x0005f568(uVar3,&uStack0000000000000038,10,&uStack0000000000000010);
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
    uVar3 = (*pcVar6)(unaff_x20);
    __tlv_atexit(&DAT_0005f5e8,uVar3,0);
    puVar4 = (undefined1 *)(*extraout_x8)(&uStack0000000000000018);
    *puVar4 = 1;
    unaff_x20 = (long *)(*(code *)*unaff_x20)(unaff_x20);
    plVar2 = (long *)func_0x0005fed4();
    if (unaff_x20 + 1 != plVar2) {
      bVar1 = *(byte *)(unaff_x19 + 0xdf);
      uVar5 = *(ulong *)(unaff_x19 + 0xd0);
      if (-1 < (char)bVar1) {
        uVar5 = (ulong)bVar1;
      }
      if (uVar5 == 8) {
        plVar2 = *(long **)(unaff_x19 + 200);
        if (-1 < (char)bVar1) {
          plVar2 = (long *)(unaff_x19 + 200);
        }
        if ((*plVar2 == 0x312e312f50545448) || (*plVar2 == 0x302e312f50545448)) break;
      }
    }
    uVar3 = 0;
    if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x38)) {
      return;
    }
  } while( true );
  unaff_x20 = (long *)(unaff_x19 + 0xe0);
  param_1 = (ulong)*(byte *)(unaff_x19 + 0xf7);
  in_w9 = (int)(char)*(byte *)(unaff_x19 + 0xf7);
  in_x10 = *(ulong *)(unaff_x19 + 0xe8);
  goto code_r0x0005c60c;
}

