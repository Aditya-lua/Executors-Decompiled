
/* WARNING: Removing unreachable block (ram,0x0067c61c) */

undefined8 FUN_0067c3f8(void)

{
  code *pcVar1;
  bool bVar2;
  int iVar3;
  undefined8 uVar4;
  undefined8 *puVar5;
  ulong unaff_x21;
  ulong unaff_x22;
  int unaff_w23;
  long unaff_x29;
  undefined8 uStack0000000000000000;
  undefined8 uStack0000000000000008;
  long in_stack_00000010;
  long in_stack_00000018;
  undefined8 uStack0000000000000028;
  undefined8 uStack0000000000000030;
  undefined8 uStack0000000000000050;
  long in_stack_00000058;
  undefined8 uStack0000000000000088;
  
  if (unaff_w23 != 0) {
    puVar5 = (undefined8 *)___cxa_allocate_exception(0x28);
    *(undefined4 *)(puVar5 + 1) = 1;
    puVar5[2] = 0x6f63656420524542;
    puVar5[3] = 0x726f727265206564;
    *(undefined1 *)(puVar5 + 4) = 0;
    *(undefined1 *)((long)puVar5 + 0x27) = 0x10;
    *puVar5 = &UNK_009f60b8;
    ___cxa_throw(puVar5,&UNK_009f6090,&DAT_0060f08c);
    goto code_r0x0067c734;
  }
  func_0x00612940(&uStack0000000000000088,unaff_x29 + -0x70,0x30);
  uStack0000000000000088 = unaff_x22;
  func_0x00614fa8(&uStack0000000000000088,(long)&uStack0000000000000028 + 4,2,0,0xffffffff);
  uStack0000000000000030 = unaff_x21;
  func_0x00613128(&uStack0000000000000030,&uStack0000000000000088);
  func_0x0067ce78(&uStack0000000000000050);
  func_0x00610060(&uStack0000000000000008,&uStack0000000000000050,2);
  uStack0000000000000050 = unaff_x21;
  if (in_stack_00000058 != 0) {
    __ZdlPv();
  }
  if (in_stack_00000018 == in_stack_00000010) {
    iVar3 = _memcmp(0,in_stack_00000010);
    bVar2 = iVar3 == 0;
  }
  else {
    bVar2 = false;
  }
  uStack0000000000000008 = unaff_x21;
  if (in_stack_00000010 != 0) {
    in_stack_00000018 = in_stack_00000010;
    __ZdlPv(in_stack_00000010);
  }
  if (bVar2) {
    func_0x00614fa8(&uStack0000000000000088,&uStack0000000000000050,2,0,0xffffffff);
    uVar4 = __Znwm(0xc0);
    func_0x0067a47c(uVar4,uStack0000000000000028._4_4_,uStack0000000000000050 & 0xffffffff,0);
LAB_0067c600:
    func_0x00612a40(&uStack0000000000000088);
    func_0x00612a40(unaff_x29 + -0x70);
    uStack0000000000000030 = unaff_x21;
    func_0x00613f64(&uStack0000000000000088);
    func_0x00613f64(unaff_x29 + -0x70);
    if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x38)) {
      return uVar4;
    }
    ___stack_chk_fail();
  }
  else {
    func_0x0067ce78(&uStack0000000000000050);
    func_0x00610060(&uStack0000000000000008,&uStack0000000000000050,3);
    uStack0000000000000050 = unaff_x21;
    if (in_stack_00000058 != 0) {
      __ZdlPv();
    }
    if (in_stack_00000018 == in_stack_00000010) {
      iVar3 = _memcmp(0,in_stack_00000010);
      bVar2 = iVar3 == 0;
    }
    else {
      bVar2 = false;
    }
    uStack0000000000000008 = unaff_x21;
    if (in_stack_00000010 != 0) {
      __ZdlPv(in_stack_00000010);
    }
    if (bVar2) {
      func_0x00612940(&uStack0000000000000050,&uStack0000000000000088,0x30);
      uStack0000000000000050 = unaff_x22;
      func_0x00614fa8(&uStack0000000000000050);
      func_0x00614fa8(&uStack0000000000000050,(long)&uStack0000000000000000 + 4,2,0,0xffffffff);
      func_0x00614fa8(&uStack0000000000000050,&uStack0000000000000008,2,0,0xffffffff);
      func_0x00612a40(&uStack0000000000000050);
      uVar4 = __Znwm(0xa0);
      func_0x006551a8(uVar4,uStack0000000000000028._4_4_,(undefined4)uStack0000000000000000,
                      uStack0000000000000000._4_4_,uStack0000000000000008 & 0xffffffff,0);
      func_0x00613f64(&uStack0000000000000050);
      goto LAB_0067c600;
    }
  }
  puVar5 = (undefined8 *)___cxa_allocate_exception(0x28);
  *(undefined4 *)(puVar5 + 1) = 1;
  puVar5[2] = 0x6f63656420524542;
  puVar5[3] = 0x726f727265206564;
  *(undefined1 *)(puVar5 + 4) = 0;
  *(undefined1 *)((long)puVar5 + 0x27) = 0x10;
  *puVar5 = &UNK_009f60b8;
  ___cxa_throw(puVar5,&UNK_009f6090,&DAT_0060f08c);
code_r0x0067c734:
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x67c738);
  (*pcVar1)();
}

