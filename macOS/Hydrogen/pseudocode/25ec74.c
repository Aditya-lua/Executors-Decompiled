
void FUN_0025ec74(long param_1)

{
  bool in_ZR;
  ulong uVar1;
  long lVar2;
  ulong uVar3;
  ulong in_x9;
  ulong in_x10;
  long in_x11;
  long in_x12;
  long *unaff_x19;
  long *unaff_x20;
  long lVar4;
  long unaff_x21;
  undefined8 *puVar5;
  long *unaff_x22;
  long unaff_x23;
  long unaff_x24;
  long unaff_x25;
  long unaff_x29;
  long lVar6;
  long lVar7;
  undefined1 uStack0000000000000008;
  ulong in_stack_00000010;
  ulong in_stack_00000018;
  long in_stack_00000020;
  undefined8 in_stack_00000028;
  undefined8 in_stack_00000030;
  long in_stack_00000038;
  long in_stack_00000040;
  long in_stack_00000050;
  ulong in_stack_00000058;
  undefined8 in_stack_00000060;
  long in_stack_00000068;
  long in_stack_00000070;
  undefined8 uStack0000000000000080;
  long in_stack_00000088;
  ulong in_stack_00000090;
  long in_stack_00000098;
  long in_stack_000000d8;
  
  if (in_ZR) {
    uVar1 = 0;
    uVar3 = 0;
  }
  else {
    uVar1 = in_x12 + 6;
    if ((CARRY8(uVar1,in_x9)) || (in_x10 < in_x9 + uVar1)) {
      uVar3 = 0;
      uVar1 = 0;
      unaff_x25 = -0x8000000000000000;
    }
    else {
      lVar4 = in_x11 + uVar1;
      in_stack_00000088 = unaff_x22[1];
      uStack0000000000000080 = *unaff_x22;
      lVar7 = unaff_x22[2];
      lVar6 = unaff_x22[5];
      lVar2 = unaff_x22[4];
      *(long *)(unaff_x23 + 0x18) = unaff_x22[3];
      *(long *)(unaff_x23 + 0x10) = lVar7;
      *(long *)(unaff_x23 + 0x28) = lVar6;
      *(long *)(unaff_x23 + 0x20) = lVar2;
      *(long *)(unaff_x29 + -0xa8) = unaff_x24 + -0x1a;
      in_stack_00000018 = in_x9 + uVar1;
      func_0x00262a20(unaff_x29 + -0xe0,&uStack0000000000000008,0xa0,unaff_x29 + -0xa8,
                      &uStack0000000000000080,0xffff);
      unaff_x25 = *(long *)(unaff_x29 + -0xe0);
      if (unaff_x25 == unaff_x24) {
        *(undefined8 *)(unaff_x23 + 0xe8) = *(undefined8 *)(unaff_x23 + 0x28);
        *(undefined8 *)(unaff_x23 + 0xe0) = *(undefined8 *)(unaff_x23 + 0x20);
        *(undefined8 *)(unaff_x23 + 0xf8) = *(undefined8 *)(unaff_x23 + 0x38);
        *(undefined8 *)(unaff_x23 + 0xf0) = *(undefined8 *)(unaff_x23 + 0x30);
        in_stack_00000068 = in_stack_000000d8;
        in_stack_00000060 = 0;
        in_stack_00000050 = lVar4;
        in_stack_00000070 = param_1;
        if (uStack0000000000000080 != 0) {
          in_stack_00000038 = in_stack_000000d8;
          in_stack_00000030 = 0;
          if (in_stack_00000018 == in_stack_00000010) {
            lVar2 = *(long *)(unaff_x23 + 0xe0);
            lVar7 = *(long *)(unaff_x23 + 0xf8);
            lVar6 = *(long *)(unaff_x23 + 0xf0);
            unaff_x20[5] = *(long *)(unaff_x23 + 0xe8);
            unaff_x20[4] = lVar2;
            unaff_x20[7] = lVar7;
            unaff_x20[6] = lVar6;
            unaff_x20[9] = in_x9;
            unaff_x20[8] = lVar4;
            unaff_x20[0xb] = in_stack_000000d8;
            unaff_x20[10] = 0;
            unaff_x20[0xc] = param_1;
            *unaff_x20 = uStack0000000000000080;
            unaff_x20[1] = in_stack_00000088;
            unaff_x20[2] = in_stack_00000090;
            unaff_x20[3] = in_stack_00000098;
            in_stack_00000020 = lVar4;
            in_stack_00000040 = param_1;
            func_0x002219a8();
            return;
          }
          lVar4 = *unaff_x19;
          lVar6 = unaff_x19[3];
          lVar2 = unaff_x19[2];
          unaff_x20[2] = unaff_x19[1];
          unaff_x20[1] = lVar4;
          unaff_x20[4] = lVar6;
          unaff_x20[3] = lVar2;
          lVar4 = unaff_x19[4];
          unaff_x20[6] = unaff_x19[5];
          unaff_x20[5] = lVar4;
          unaff_x20[7] = unaff_x19[6];
          *unaff_x20 = 0;
          return;
        }
        uVar3 = in_stack_00000090 & 0xffffffffffffff00;
        uVar1 = in_stack_00000090;
        unaff_x21 = in_stack_00000098;
        unaff_x25 = in_stack_00000088;
        in_stack_00000058 = in_x9;
      }
      else {
        uVar1 = *(ulong *)(unaff_x29 + -0xd8);
        unaff_x21 = *(long *)(unaff_x29 + -0xd0);
        uVar3 = uVar1 & 0xffffffffffffff00;
        *(undefined8 *)(unaff_x23 + 0xe8) = *(undefined8 *)(unaff_x23 + 0x90);
        *(undefined8 *)(unaff_x23 + 0xe0) = *(undefined8 *)(unaff_x23 + 0x88);
        *(undefined8 *)(unaff_x23 + 0xf8) = *(undefined8 *)(unaff_x23 + 0xa0);
        *(undefined8 *)(unaff_x23 + 0xf0) = *(undefined8 *)(unaff_x23 + 0x98);
      }
    }
  }
  lVar4 = *(long *)(unaff_x23 + 0xe0);
  lVar6 = *(long *)(unaff_x23 + 0xf8);
  lVar2 = *(long *)(unaff_x23 + 0xf0);
  unaff_x20[5] = *(long *)(unaff_x23 + 0xe8);
  unaff_x20[4] = lVar4;
  unaff_x20[7] = lVar6;
  unaff_x20[6] = lVar2;
  unaff_x20[2] = uVar3 | uVar1 & 0xff;
  unaff_x20[3] = unaff_x21;
  *unaff_x20 = 0;
  unaff_x20[1] = unaff_x25;
  lVar4 = *unaff_x19;
  if (unaff_x24 + -1 < lVar4) {
    if ((((*(byte *)(unaff_x19 + 3) & 1) == 0) &&
        (lVar2 = unaff_x19[4], lVar2 != -0x8000000000000000)) && (lVar2 != 0)) {
      func_0x00187bd4(unaff_x19[5],lVar2,1);
    }
    lVar2 = unaff_x19[1];
    lVar6 = unaff_x19[2];
    if (lVar6 != 0) {
      puVar5 = (undefined8 *)(lVar2 + 8);
      do {
        if (puVar5[-1] != 0) {
          func_0x00187bd4(*puVar5,puVar5[-1],1);
        }
        puVar5 = puVar5 + 3;
        lVar6 = lVar6 + -1;
      } while (lVar6 != 0);
    }
    if (lVar4 != 0) {
      func_0x00187bd4(lVar2,lVar4 * 0x18,8);
    }
  }
  return;
}

