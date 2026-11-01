
void FUN_00528660(void)

{
  long lVar1;
  ulong uVar2;
  long *unaff_x19;
  long *unaff_x20;
  undefined8 *puVar3;
  long lVar4;
  long lVar5;
  long unaff_x25;
  long unaff_x26;
  long unaff_x29;
  long in_stack_00000030;
  ulong in_stack_00000048;
  long *in_stack_00000060;
  long in_stack_000000d0;
  long in_stack_000000d8;
  long in_stack_000000e0;
  long in_stack_000000e8;
  undefined8 in_stack_000000f0;
  long in_stack_00000100;
  undefined8 in_stack_00000108;
  long in_stack_00000118;
  long in_stack_00000120;
  long in_stack_00000128;
  
  lVar4 = unaff_x19[-3];
  while( true ) {
    if (lVar4 != -0x8000000000000000) {
      if (lVar4 == unaff_x25) goto LAB_00528764;
      lVar1 = unaff_x19[-2];
      uVar2 = unaff_x19[-1];
      lVar5 = in_stack_00000060[2];
      if ((ulong)(*in_stack_00000060 - lVar5) < uVar2) {
        func_0x007a5594(in_stack_00000060,lVar5,uVar2,1,1);
        lVar5 = in_stack_00000060[2];
      }
      _memcpy(in_stack_00000060[1] + lVar5,lVar1,uVar2);
      lVar5 = lVar5 + uVar2;
      in_stack_00000060[2] = lVar5;
      if (*in_stack_00000060 == lVar5) {
        func_0x007a5594(in_stack_00000060,lVar5,1,1,1);
        lVar5 = in_stack_00000060[2];
        *(undefined1 *)(in_stack_00000060[1] + lVar5) = 0x20;
        in_stack_00000060[2] = lVar5 + 1;
      }
      else {
        *(undefined1 *)(in_stack_00000060[1] + lVar5) = 0x20;
        in_stack_00000060[2] = lVar5 + 1;
      }
      if (lVar4 != 0) {
        func_0x00187bd4(lVar1,lVar4,1);
      }
    }
    if (unaff_x26 == 0) break;
    unaff_x26 = unaff_x26 + -0x18;
    lVar4 = *unaff_x19;
    unaff_x19 = unaff_x19 + 3;
  }
  unaff_x19 = unaff_x20;
LAB_00528764:
  *(long **)(unaff_x29 + -0x78) = unaff_x19;
  func_0x00524a34(unaff_x29 + -0xb0);
  if ((in_stack_00000048 & 0x100000000) == 0) {
    lVar4 = *(long *)(unaff_x29 + -0xe0);
    if (lVar4 != 0) {
      puVar3 = (undefined8 *)(*(long *)(unaff_x29 + -0xe8) + 8);
      do {
        if (puVar3[-1] != 0) {
          func_0x00187bd4(*puVar3,puVar3[-1],1);
        }
        puVar3 = puVar3 + 3;
        lVar4 = lVar4 + -1;
      } while (lVar4 != 0);
    }
    if (*(long *)(unaff_x29 + -0xf0) != 0) {
      func_0x00187bd4(*(undefined8 *)(unaff_x29 + -0xe8),*(long *)(unaff_x29 + -0xf0) * 0x18,8);
    }
    if (in_stack_00000128 != 0) {
      puVar3 = (undefined8 *)(in_stack_00000120 + 8);
      do {
        if (puVar3[-1] != 0) {
          func_0x00187bd4(*puVar3,puVar3[-1],1);
        }
        puVar3 = puVar3 + 3;
        in_stack_00000128 = in_stack_00000128 + -1;
      } while (in_stack_00000128 != 0);
    }
    if (in_stack_00000118 != 0) {
      func_0x00187bd4(in_stack_00000120,in_stack_00000118 * 0x18,8);
    }
  }
  if (in_stack_00000100 != 0) {
    func_0x00187bd4(in_stack_00000108,in_stack_00000100 << 4,8);
  }
  if (in_stack_000000e8 != 0) {
    func_0x00187bd4(in_stack_000000f0,in_stack_000000e8 << 4,8);
  }
  if (in_stack_00000030 == 0) {
    if (in_stack_000000e0 != 0) {
      puVar3 = (undefined8 *)(in_stack_000000d8 + 8);
      do {
        if (puVar3[-1] != 0) {
          func_0x00187bd4(*puVar3,puVar3[-1] << 3,8);
        }
        puVar3 = puVar3 + 5;
        in_stack_000000e0 = in_stack_000000e0 + -1;
      } while (in_stack_000000e0 != 0);
    }
    if (in_stack_000000d0 != 0) {
      func_0x00187bd4(in_stack_000000d8,in_stack_000000d0 * 0x28,8);
    }
  }
  return;
}

