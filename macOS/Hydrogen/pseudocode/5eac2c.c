
/* WARNING: Removing unreachable block (ram,0x005ead44) */
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_005eac2c(long param_1)

{
  undefined8 *puVar1;
  bool bVar2;
  long lVar3;
  code *pcVar4;
  uint uVar5;
  ulong uVar6;
  ulong uVar7;
  undefined8 unaff_x19;
  long unaff_x20;
  long in_xzr;
  undefined8 uStack0000000000000008;
  long *in_stack_00000010;
  ulong *in_stack_00000018;
  undefined8 uStack0000000000000038;
  
  if (param_1 == 0) {
    func_0x007b1168(0xa2aa38);
    func_0x00430010();
  }
  else {
    func_0x00430010();
  }
  if ((___ZN3std9panicking11panic_count18GLOBAL_PANIC_COUNT17h44f8b48277a7bf95E & 0x7fffffffffffffff
      ) == 0) {
    uVar5 = 0;
    lVar3 = lRam0000000000a2aa58;
  }
  else {
    uVar5 = func_0x007a1140();
    uVar5 = uVar5 ^ 1;
    lVar3 = lRam0000000000a2aa58;
  }
  lRam0000000000a2aa58 = lVar3;
  if (cRam0000000000a2aa40 != '\0') {
    func_0x007a2810(&UNK_008b9f58,0x2b,&uStack0000000000000008,&UNK_009f3f98,&UNK_009f3ff8);
                    /* WARNING: Does not return */
    pcVar4 = (code *)SoftwareBreakpoint(1,0x5eaec4);
    (*pcVar4)();
  }
  uRam0000000000a3c0e0 = 1;
  if (lVar3 == lRam0000000000a2aa48) {
    func_0x005ea0dc(0xa2aa48,&UNK_009f4010);
  }
  puVar1 = (undefined8 *)(lRam0000000000a2aa50 + lVar3 * 0x10);
  *puVar1 = unaff_x19;
  puVar1[1] = unaff_x20;
  lRam0000000000a2aa58 = lVar3 + 1;
  if ((((uVar5 & 1) == 0) &&
      ((___ZN3std9panicking11panic_count18GLOBAL_PANIC_COUNT17h44f8b48277a7bf95E &
       0x7fffffffffffffff) != 0)) && (uVar6 = func_0x007a1140(), (uVar6 & 1) == 0)) {
    cRam0000000000a2aa40 = '\x01';
  }
  func_0x00430048(uRam0000000000a2aa38);
  func_0x005e8a7c(&uStack0000000000000008,0xa2aa28);
  pcVar4 = *(code **)(unaff_x20 + 0x18);
  uStack0000000000000038 = (**(code **)(unaff_x20 + 0x20))();
  func_0x005e8df4(&uStack0000000000000008,&uStack0000000000000038);
  (*pcVar4)();
  if (uStack0000000000000008 != 0) {
    if (uStack0000000000000008 == 1) {
      uVar6 = *in_stack_00000018;
      do {
        while (((uint)uVar6 >> 1 & 1) != 0) {
          if (((uint)uVar6 >> 3 & 1) == 0) {
            func_0x007a1a98();
            return;
          }
          uVar7 = uVar6 & 0xfffffffffffffff6;
          bVar2 = *in_stack_00000018 == uVar6;
          uVar6 = *in_stack_00000018;
          if (bVar2) {
            *in_stack_00000018 = uVar7;
            return;
          }
        }
        uVar7 = 0;
        if (uVar6 - 0x11 != 0) {
          uVar7 = uVar6 - 0x11 | 1;
        }
        bVar2 = *in_stack_00000018 != uVar6;
        uVar6 = *in_stack_00000018;
      } while (bVar2);
      *in_stack_00000018 = uVar7;
    }
    else {
      if (((((ulong)in_stack_00000018 & 1) == 0) &&
          ((___ZN3std9panicking11panic_count18GLOBAL_PANIC_COUNT17h44f8b48277a7bf95E &
           0x7fffffffffffffff) != 0)) && (uVar6 = func_0x007a1140(), (uVar6 & 1) == 0)) {
        *(undefined1 *)(in_stack_00000010 + 1) = 1;
      }
      if (*in_stack_00000010 == 1) {
        *in_stack_00000010 = in_xzr;
      }
      else {
        func_0x007a1ae8(in_stack_00000010);
      }
    }
  }
  return;
}

