
void FUN_0025cf64(undefined1 param_1 [16],undefined1 param_2 [16],undefined8 param_3,ulong param_4)

{
  ulong uVar1;
  undefined8 uVar2;
  ulong *unaff_x19;
  ulong *unaff_x20;
  ulong uVar3;
  ulong unaff_x22;
  undefined8 *puVar4;
  long unaff_x25;
  ulong uVar5;
  ulong uStack0000000000000000;
  ulong uStack0000000000000008;
  ulong uStack0000000000000010;
  ulong uStack0000000000000018;
  long in_stack_00000028;
  long in_stack_00000030;
  ulong in_stack_00000058;
  ulong in_stack_00000060;
  ulong in_stack_00000068;
  ulong in_stack_00000070;
  ulong in_stack_00000078;
  
  uStack0000000000000008 = param_2._8_8_;
  uStack0000000000000000 = param_2._0_8_;
  uStack0000000000000018 = in_stack_00000068;
  uStack0000000000000010 = in_stack_00000060;
  if (param_4 == 0x8000000000000001) {
    unaff_x20[3] = uStack0000000000000008;
    unaff_x20[2] = uStack0000000000000000;
    unaff_x20[4] = in_stack_00000058;
    unaff_x20[6] = in_stack_00000068;
    unaff_x20[5] = in_stack_00000060;
    unaff_x20[7] = in_stack_00000070;
    *unaff_x20 = 0x8000000000000001;
    unaff_x20[1] = unaff_x22;
    uVar3 = *unaff_x19;
    if ((long)uVar3 <= unaff_x25 + 0x27) {
      return;
    }
    if ((((unaff_x19[3] & 1) == 0) && (uVar1 = unaff_x19[4], uVar1 != 0x8000000000000000)) &&
       (uVar1 != 0)) {
      in_stack_00000060 = func_0x00187bd4(unaff_x19[5],uVar1,1);
    }
    in_stack_00000070 = unaff_x19[1];
    uVar1 = unaff_x19[2];
    if (uVar1 != 0) {
      puVar4 = (undefined8 *)(in_stack_00000070 + 8);
      do {
        if (puVar4[-1] != 0) {
          in_stack_00000060 = func_0x00187bd4(*puVar4,puVar4[-1],1);
        }
        puVar4 = puVar4 + 3;
        uVar1 = uVar1 - 1;
      } while (uVar1 != 0);
    }
  }
  else {
    if (in_stack_00000030 != in_stack_00000028) {
      uVar3 = *unaff_x19;
      uVar5 = unaff_x19[3];
      uVar1 = unaff_x19[2];
      unaff_x20[2] = unaff_x19[1];
      unaff_x20[1] = uVar3;
      unaff_x20[4] = uVar5;
      unaff_x20[3] = uVar1;
      uVar3 = unaff_x19[4];
      unaff_x20[6] = unaff_x19[5];
      unaff_x20[5] = uVar3;
      unaff_x20[7] = unaff_x19[6];
      *unaff_x20 = 0x8000000000000001;
      if ((param_4 | 0x8000000000000000) != 0x8000000000000000) {
        func_0x00187bd4();
      }
      in_stack_00000060 = uStack0000000000000010;
      uVar3 = uStack0000000000000018;
      if ((uStack0000000000000008 | 0x8000000000000000) != 0x8000000000000000) {
        func_0x00187bd4(uStack0000000000000000,in_stack_00000058,uStack0000000000000008,1);
        in_stack_00000060 = uStack0000000000000010;
        uVar3 = uStack0000000000000018;
      }
      if ((long)uVar3 < -0x7ffffffffffffffe) {
        return;
      }
      if (uVar3 == 0) {
        return;
      }
      uVar2 = 1;
      uStack0000000000000010 = in_stack_00000060;
      uStack0000000000000018 = uVar3;
      goto LAB_0025d1b0;
    }
    *unaff_x20 = param_4;
    unaff_x20[1] = unaff_x22;
    unaff_x20[3] = uStack0000000000000008;
    unaff_x20[2] = uStack0000000000000000;
    unaff_x20[4] = in_stack_00000058;
    unaff_x20[6] = in_stack_00000068;
    unaff_x20[5] = in_stack_00000060;
    unaff_x20[7] = in_stack_00000070;
    unaff_x20[8] = in_stack_00000078;
    uVar3 = *unaff_x19;
    if ((long)uVar3 <= unaff_x25 + 0x27) {
      return;
    }
    if ((((unaff_x19[3] & 1) == 0) && (uVar1 = unaff_x19[4], uVar1 != 0x8000000000000000)) &&
       (uVar1 != 0)) {
      in_stack_00000060 = func_0x00187bd4(unaff_x19[5],uVar1,1);
    }
    in_stack_00000070 = unaff_x19[1];
    uVar1 = unaff_x19[2];
    if (uVar1 != 0) {
      puVar4 = (undefined8 *)(in_stack_00000070 + 8);
      do {
        if (puVar4[-1] != 0) {
          in_stack_00000060 = func_0x00187bd4(*puVar4,puVar4[-1],1);
        }
        puVar4 = puVar4 + 3;
        uVar1 = uVar1 - 1;
      } while (uVar1 != 0);
    }
  }
  if (uVar3 == 0) {
    return;
  }
  uVar3 = uVar3 * 0x18;
  uVar2 = 8;
LAB_0025d1b0:
  func_0x00187bd4(in_stack_00000060,in_stack_00000070,uVar3,uVar2);
  return;
}

