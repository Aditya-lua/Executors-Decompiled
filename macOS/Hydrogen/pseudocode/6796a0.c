
bool FUN_006796a0(void)

{
  uint uVar1;
  uint uVar2;
  bool bVar3;
  bool bVar4;
  undefined8 *puVar5;
  undefined8 *puVar6;
  ulong uVar7;
  ulong uVar8;
  uint unaff_w23;
  uint uVar9;
  long unaff_x29;
  ulong in_stack_00000000;
  ulong in_stack_00000008;
  undefined1 uStack0000000000000010;
  ulong in_stack_00000018;
  ulong in_stack_00000020;
  long in_stack_00000028;
  undefined1 uStack0000000000000030;
  ulong in_stack_00000038;
  ulong in_stack_00000040;
  long in_stack_00000048;
  undefined1 uStack0000000000000050;
  ulong in_stack_00000058;
  ulong in_stack_00000060;
  undefined8 *in_stack_00000068;
  
  puVar5 = (undefined8 *)func_0x006115d0(8);
  *(undefined8 **)(unaff_x29 + -0x48) = puVar5;
  *puVar5 = 2;
  in_stack_00000060 = in_stack_00000008;
  in_stack_00000058 = in_stack_00000000;
  func_0x006108a0(1);
  puVar6 = (undefined8 *)func_0x006115d0(8);
  in_stack_00000068 = puVar6;
  if (puVar6 != puVar5) {
    _memcpy(puVar6,puVar5,in_stack_00000060 << 3);
  }
  if (unaff_w23 < 2) {
    bVar3 = true;
    uVar8 = in_stack_00000058;
    if (in_stack_00000060 <= in_stack_00000058) {
      uVar8 = in_stack_00000060;
    }
  }
  else {
    bVar3 = false;
    uVar2 = unaff_w23 >> 1;
    uVar1 = uVar2;
    if (uVar2 < 2) {
      uVar1 = 1;
    }
    uVar9 = 1;
    do {
      func_0x00677f58(&uStack0000000000000010,&uStack0000000000000050);
      func_0x0067997c(&uStack0000000000000030,&uStack0000000000000010);
      func_0x006771a4(&uStack0000000000000050,&uStack0000000000000030);
      uVar8 = in_stack_00000038;
      if (in_stack_00000040 <= in_stack_00000038) {
        uVar8 = in_stack_00000040;
      }
      if (in_stack_00000048 != 0) {
        if (uVar8 != 0) {
          do {
            *(undefined8 *)(in_stack_00000048 + -8 + uVar8 * 8) = 0;
            uVar8 = uVar8 - 1;
          } while (uVar8 != 0);
        }
        func_0x00611644();
      }
      uVar8 = in_stack_00000018;
      if (in_stack_00000020 <= in_stack_00000018) {
        uVar8 = in_stack_00000020;
      }
      if (in_stack_00000028 != 0) {
        if (uVar8 != 0) {
          do {
            *(undefined8 *)(in_stack_00000028 + -8 + uVar8 * 8) = 0;
            uVar8 = uVar8 - 1;
          } while (uVar8 != 0);
        }
        func_0x00611644();
      }
      func_0x00677494(&uStack0000000000000010,&uStack0000000000000050,unaff_x29 + -0x60);
      func_0x00679308(&uStack0000000000000030,&uStack0000000000000010);
      uVar7 = func_0x00679a64(&uStack0000000000000030);
      uVar8 = in_stack_00000038;
      if (in_stack_00000040 <= in_stack_00000038) {
        uVar8 = in_stack_00000040;
      }
      if (in_stack_00000048 != 0) {
        if (uVar8 != 0) {
          do {
            *(undefined8 *)(in_stack_00000048 + -8 + uVar8 * 8) = 0;
            uVar8 = uVar8 - 1;
          } while (uVar8 != 0);
        }
        func_0x00611644();
      }
      uVar8 = in_stack_00000018;
      if (in_stack_00000020 <= in_stack_00000018) {
        uVar8 = in_stack_00000020;
      }
      if (in_stack_00000028 != 0) {
        if (uVar8 != 0) {
          do {
            *(undefined8 *)(in_stack_00000028 + -8 + uVar8 * 8) = 0;
            uVar8 = uVar8 - 1;
          } while (uVar8 != 0);
        }
        func_0x00611644();
      }
      if ((uVar7 & 1) == 0) break;
      bVar3 = uVar2 <= uVar9;
      bVar4 = uVar9 != uVar1;
      uVar9 = uVar9 + 1;
    } while (bVar4);
    uVar8 = in_stack_00000058;
    puVar6 = in_stack_00000068;
    if (in_stack_00000060 <= in_stack_00000058) {
      uVar8 = in_stack_00000060;
    }
  }
  if (puVar6 == (undefined8 *)0x0) {
    uVar8 = 1;
  }
  else {
    for (; uVar8 != 0; uVar8 = uVar8 - 1) {
      puVar6[uVar8 - 1] = 0;
    }
    func_0x00611644(puVar6);
    puVar5 = *(undefined8 **)(unaff_x29 + -0x48);
    uVar8 = *(ulong *)(unaff_x29 + -0x58);
    if (*(ulong *)(unaff_x29 + -0x50) <= *(ulong *)(unaff_x29 + -0x58)) {
      uVar8 = *(ulong *)(unaff_x29 + -0x50);
    }
  }
  if (puVar5 != (undefined8 *)0x0) {
    for (; uVar8 != 0; uVar8 = uVar8 - 1) {
      puVar5[uVar8 - 1] = 0;
    }
    func_0x00611644(puVar5);
  }
  return bVar3;
}

