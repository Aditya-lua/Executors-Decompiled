
/* WARNING: Removing unreachable block (ram,0x002145c0) */
/* WARNING: Removing unreachable block (ram,0x00214610) */
/* WARNING: Removing unreachable block (ram,0x00214618) */
/* WARNING: Removing unreachable block (ram,0x00214620) */
/* WARNING: Removing unreachable block (ram,0x0021462c) */
/* WARNING: Removing unreachable block (ram,0x00214640) */
/* WARNING: Removing unreachable block (ram,0x00214650) */
/* WARNING: Removing unreachable block (ram,0x00214ef0) */
/* WARNING: Removing unreachable block (ram,0x00214778) */
/* WARNING: Removing unreachable block (ram,0x002147a0) */
/* WARNING: Removing unreachable block (ram,0x0021477c) */
/* WARNING: Removing unreachable block (ram,0x00214fc4) */
/* WARNING: Removing unreachable block (ram,0x00214798) */
/* WARNING: Removing unreachable block (ram,0x002147a4) */
/* WARNING: Removing unreachable block (ram,0x0021499c) */
/* WARNING: Removing unreachable block (ram,0x00214860) */
/* WARNING: Removing unreachable block (ram,0x00214908) */
/* WARNING: Removing unreachable block (ram,0x002149f0) */
/* WARNING: Removing unreachable block (ram,0x002149fc) */
/* WARNING: Removing unreachable block (ram,0x00214a04) */
/* WARNING: Removing unreachable block (ram,0x00214ae0) */
/* WARNING: Removing unreachable block (ram,0x00214af0) */
/* WARNING: Removing unreachable block (ram,0x00214b04) */
/* WARNING: Removing unreachable block (ram,0x00214c2c) */
/* WARNING: Removing unreachable block (ram,0x00214f88) */
/* WARNING: Removing unreachable block (ram,0x00214d00) */
/* WARNING: Removing unreachable block (ram,0x00214b3c) */
/* WARNING: Removing unreachable block (ram,0x00214f78) */
/* WARNING: Removing unreachable block (ram,0x00214c10) */
/* WARNING: Removing unreachable block (ram,0x00214d18) */
/* WARNING: Removing unreachable block (ram,0x00214d58) */
/* WARNING: Removing unreachable block (ram,0x00214d68) */
/* WARNING: Removing unreachable block (ram,0x00214d80) */
/* WARNING: Removing unreachable block (ram,0x00214d8c) */
/* WARNING: Removing unreachable block (ram,0x00214d98) */
/* WARNING: Removing unreachable block (ram,0x00214da8) */
/* WARNING: Removing unreachable block (ram,0x00214db0) */
/* WARNING: Removing unreachable block (ram,0x00214db8) */

void FUN_00214444(undefined8 param_1,undefined8 param_2)

{
  code *pcVar1;
  code *pcVar2;
  long lVar3;
  long lVar4;
  undefined8 uVar5;
  undefined *puVar6;
  undefined8 *unaff_x21;
  undefined8 *in_stack_00000020;
  undefined8 in_stack_00000030;
  undefined8 in_stack_00000040;
  undefined8 in_stack_00000048;
  undefined8 uStack0000000000000050;
  undefined8 in_stack_00000058;
  undefined8 in_stack_00000060;
  undefined8 in_stack_00000068;
  undefined8 in_stack_00000070;
  undefined8 in_stack_00000078;
  undefined8 in_stack_00000080;
  long in_stack_00000088;
  long in_stack_00000090;
  long in_stack_00000098;
  undefined8 uStack00000000000000a0;
  byte in_stack_000000e0;
  long in_stack_000000e8;
  undefined8 in_stack_000000f0;
  undefined8 in_stack_000000f8;
  undefined8 uStack0000000000000100;
  undefined8 in_stack_00000108;
  undefined1 uStack0000000000000110;
  long in_stack_000002d0;
  undefined8 in_stack_000002d8;
  long in_stack_000002e8;
  long *in_stack_00000338;
  ulong in_stack_00000600;
  undefined1 auStack_7ffffffe [2147483646];
  
  func_0x00213ad8(param_1,param_2,auStack_7ffffffe + 0x8000033e);
  func_0x00209cc4(auStack_7ffffffe + 0x800004ce);
  pcVar2 = (code *)in_stack_00000020[4];
  pcVar1 = (code *)in_stack_00000020[5];
  (**(code **)(*(long *)(in_stack_000002e8 + 0x30) + 0x18))
            (auStack_7ffffffe + 0x800005be,*(undefined8 *)(in_stack_000002e8 + 0x28));
  if (in_stack_00000600 < 0x41) {
    in_stack_00000600 = in_stack_00000600 + 0x62;
    _memcpy(auStack_7ffffffe + 0x8000047e,auStack_7ffffffe + 0x800005be);
    (*pcVar1)(in_stack_00000030);
    if (in_stack_00000600 < 0xa3) {
      (*pcVar2)(auStack_7ffffffe + 0x800004ce,in_stack_00000030,auStack_7ffffffe + 0x80000626);
      unaff_x21[2] = 0x2020202020202020;
      unaff_x21[1] = 0x2020202020202020;
      unaff_x21[4] = 0x2020202020202020;
      unaff_x21[3] = 0x2020202020202020;
      unaff_x21[6] = 0x2020202020202020;
      unaff_x21[5] = 0x2020202020202020;
      *unaff_x21 = 0x2020202020202020;
      if ((code *)*in_stack_00000020 != (code *)0x0) {
        (*(code *)*in_stack_00000020)(in_stack_00000030);
      }
      if (in_stack_00000020[1] != 0) {
        func_0x00187bd4(in_stack_00000030,in_stack_00000020[1],in_stack_00000020[2]);
      }
      lVar3 = *in_stack_00000338;
      *in_stack_00000338 = lVar3 + -1;
      LORelease();
      if (lVar3 == 1) {
        DataMemoryBarrier(2,1);
        func_0x001f9f8c(auStack_7ffffffe + 0x80000336);
      }
      if (in_stack_000002d0 != 0) {
        func_0x00187bd4(in_stack_000002d8,in_stack_000002d0,1);
      }
      func_0x00240a1c(auStack_7ffffffe + 0x8000023e);
      in_stack_00000040._4_4_ = in_stack_00000040._4_4_ ^ 1;
      lVar3 = *uStack0000000000000100;
      *uStack0000000000000100 = lVar3 + -1;
      LORelease();
      if (lVar3 == 1) {
        DataMemoryBarrier(2,1);
        func_0x001f9b44(&uStack0000000000000100);
      }
      if ((((in_stack_000000e0 & 1) == 0) && (in_stack_000000e8 != -0x8000000000000000)) &&
         (in_stack_000000e8 != 0)) {
        func_0x00187bd4(in_stack_000000f0,in_stack_000000e8,1);
      }
      func_0x0020848c(&uStack0000000000000050);
      func_0x00209ea8(&uStack0000000000000110);
      if (uStack00000000000000a0 == -0x7ffffffffffffffe) {
        in_stack_00000040._4_4_ = 1;
      }
      if ((in_stack_00000040._4_4_ & 1) == 0) {
        func_0x00208e34(&uStack00000000000000a0);
      }
      if (in_stack_00000088 != -0x8000000000000000) {
        lVar3 = in_stack_00000098 + 1;
        lVar4 = in_stack_00000090;
        while (lVar3 = lVar3 + -1, lVar3 != 0) {
          func_0x0016af10(lVar4);
          lVar4 = lVar4 + 0x70;
        }
        if (in_stack_00000088 != 0) {
          func_0x00187bd4(in_stack_00000090,in_stack_00000088 * 0x70,8);
        }
      }
      func_0x002087e4();
      func_0x00187bd4(in_stack_00000048,0x1a8,8);
      return;
    }
    puVar6 = &UNK_009ca658;
    uVar5 = 0xa2;
  }
  else {
    puVar6 = &UNK_009c9ca0;
    uVar5 = 0x40;
  }
  func_0x007a28b0(in_stack_00000600,uVar5,puVar6);
                    /* WARNING: Does not return */
  pcVar2 = (code *)SoftwareBreakpoint(1,0x214fe8);
  (*pcVar2)();
}

