
void FUN_001a2590(void)

{
  ulong *puVar1;
  long lVar2;
  undefined1 uVar3;
  undefined2 uVar4;
  undefined2 uVar5;
  code *pcVar6;
  ulong unaff_x20;
  long unaff_x21;
  ulong unaff_x22;
  ulong uVar7;
  long unaff_x23;
  long unaff_x24;
  ulong uVar8;
  long unaff_x25;
  ulong unaff_x26;
  undefined8 uVar9;
  ulong unaff_x27;
  ulong uVar10;
  ulong unaff_x28;
  long unaff_x29;
  undefined8 in_stack_00000000;
  undefined8 *in_stack_00000008;
  ulong in_stack_00000010;
  long in_stack_00000018;
  long in_stack_00000020;
  ulong in_stack_00000028;
  long in_stack_00000030;
  ulong in_stack_00000038;
  ulong in_stack_00000040;
  undefined8 in_stack_00000048;
  ulong in_stack_00000050;
  ulong in_stack_00000058;
  long in_stack_00000060;
  undefined8 in_stack_00000068;
  undefined8 in_stack_00000070;
  undefined8 in_stack_00000080;
  undefined8 in_stack_00000088;
  undefined8 in_stack_00000090;
  undefined4 uStack0000000000000098;
  undefined4 uStack000000000000009c;
  undefined4 uStack00000000000000a0;
  ulong uStack00000000000000a4;
  undefined4 uStack00000000000000c8;
  undefined4 uStack00000000000000cc;
  undefined4 uStack00000000000000d0;
  
  do {
    uVar7 = unaff_x22;
    while( true ) {
      puVar1 = (ulong *)(in_stack_00000030 + unaff_x21);
      *(undefined8 *)((long)puVar1 + 0x2c) = in_stack_00000088;
      *(undefined8 *)((long)puVar1 + 0x24) = in_stack_00000080;
      unaff_x23 = unaff_x23 + 1;
      *puVar1 = unaff_x26;
      puVar1[1] = unaff_x22;
      puVar1[2] = unaff_x20;
      puVar1[3] = uVar7;
      *(short *)(puVar1 + 4) = (short)unaff_x27;
      *(short *)((long)puVar1 + 0x22) = (short)unaff_x28;
      *(ulong *)((long)puVar1 + 0x3c) = CONCAT44(uStack000000000000009c,uStack0000000000000098);
      *(undefined8 *)((long)puVar1 + 0x34) = in_stack_00000090;
      puVar1[9] = uStack00000000000000a4;
      puVar1[8] = CONCAT44(uStack00000000000000a0,uStack000000000000009c);
      puVar1[10] = in_stack_00000050;
      puVar1[0xb] = in_stack_00000040;
      puVar1[0xc] = in_stack_00000038;
      unaff_x21 = unaff_x21 + 0x70;
      *(undefined1 *)(puVar1 + 0xd) = in_stack_00000048._4_1_;
      if ((unaff_x25 == unaff_x23) || (unaff_x24 == unaff_x21)) {
        in_stack_00000008[1] = in_stack_00000070;
        *in_stack_00000008 = in_stack_00000068;
        in_stack_00000008[2] = unaff_x25;
        return;
      }
      if (*(long *)(in_stack_00000060 + unaff_x21) == -0x8000000000000000) break;
      lVar2 = in_stack_00000060 + unaff_x21;
      unaff_x20 = *(ulong *)(lVar2 + 0x10);
      if ((long)unaff_x20 < 0) {
        in_stack_00000000 = 0;
        in_stack_00000010 = in_stack_00000058;
        goto LAB_001a2854;
      }
      uVar3 = *(undefined1 *)(lVar2 + 0x34);
      uVar4 = *(undefined2 *)(lVar2 + 0x30);
      uVar5 = *(undefined2 *)(lVar2 + 0x32);
      uVar9 = *(undefined8 *)(lVar2 + 8);
      if (unaff_x20 == 0) {
        unaff_x22 = 1;
      }
      else {
        unaff_x22 = func_0x00187bd0(unaff_x20,1);
        if (unaff_x22 == 0) {
          in_stack_00000010 = unaff_x20;
          goto LAB_001a2854;
        }
      }
      _memcpy(unaff_x22,uVar9,unaff_x20);
      uVar9 = 0;
      uVar8 = *(ulong *)(in_stack_00000060 + unaff_x21 + 0x28);
      if (uVar8 >> 0x3d != 0) {
LAB_001a283c:
        func_0x007a1f00(uVar9,in_stack_00000028,&UNK_009c24c0);
        goto code_r0x001a2868;
      }
      uVar10 = uVar8 * 8;
      if (0x7ffffffffffffffe < uVar10) goto LAB_001a283c;
      uVar9 = *(undefined8 *)(in_stack_00000060 + unaff_x21 + 0x20);
      if (uVar10 == 0) {
        uVar7 = 0;
        unaff_x27 = 2;
      }
      else {
        unaff_x27 = func_0x00187bd0(uVar10,2);
        if (unaff_x27 == 0) {
          uVar9 = 2;
          in_stack_00000028 = uVar10;
          goto LAB_001a283c;
        }
        uVar7 = uVar8;
      }
      _memcpy(unaff_x27,uVar9,uVar10);
      *(undefined1 *)(unaff_x29 + -0x74) = uVar3;
      *(undefined2 *)(unaff_x29 + -0x78) = uVar4;
      *(undefined2 *)(unaff_x29 + -0x76) = uVar5;
      *(ulong *)(unaff_x29 + -0xa8) = unaff_x20;
      *(ulong *)(unaff_x29 + -0xa0) = unaff_x22;
      *(ulong *)(unaff_x29 + -0x98) = unaff_x20;
      *(ulong *)(unaff_x29 + -0x90) = uVar7;
      *(ulong *)(unaff_x29 + -0x88) = unaff_x27;
      *(ulong *)(unaff_x29 + -0x80) = uVar8;
      lVar2 = in_stack_00000060 + unaff_x21;
      in_stack_00000048._4_1_ = *(undefined1 *)(lVar2 + 0x68);
      if (*(long *)(lVar2 + 0x50) == -0x8000000000000000) {
        in_stack_00000040 = *(ulong *)(lVar2 + 0x58);
        in_stack_00000038 = *(ulong *)(lVar2 + 0x60);
        in_stack_00000050 = 0x8000000000000000;
      }
      else {
        func_0x0045cd08(unaff_x29 + -0x70);
        in_stack_00000050 = *(ulong *)(unaff_x29 + -0x70);
        in_stack_00000040 = *(ulong *)(unaff_x29 + -0x68);
        in_stack_00000038 = *(ulong *)(unaff_x29 + -0x60);
      }
      func_0x001a310c(unaff_x29 + -0x70,in_stack_00000060 + unaff_x21 + 0x38);
      unaff_x28 = unaff_x27 >> 0x10;
      in_stack_00000088 = *(undefined8 *)(unaff_x29 + -0x7c);
      in_stack_00000080 = *(undefined8 *)(unaff_x29 + -0x84);
      in_stack_00000090 = *(undefined8 *)(unaff_x29 + -0x74);
      uStack00000000000000cc = (undefined4)*(undefined8 *)(unaff_x29 + -0x68);
      uStack00000000000000d0 = (undefined4)((ulong)*(undefined8 *)(unaff_x29 + -0x68) >> 0x20);
      uStack00000000000000c8 = (undefined4)((ulong)*(undefined8 *)(unaff_x29 + -0x70) >> 0x20);
      uStack00000000000000a4 = *(ulong *)(unaff_x29 + -0x60);
      uStack0000000000000098 = uStack00000000000000c8;
      uStack000000000000009c = uStack00000000000000cc;
      unaff_x24 = in_stack_00000020;
      unaff_x25 = in_stack_00000018;
      unaff_x26 = unaff_x20;
      in_stack_00000028 = unaff_x27;
      in_stack_00000058 = unaff_x22;
      uStack00000000000000a0 = uStack00000000000000d0;
    }
    lVar2 = in_stack_00000060 + unaff_x21;
    unaff_x22 = *(ulong *)(lVar2 + 0x18);
    if ((long)unaff_x22 < 0) {
      in_stack_00000000 = 0;
      goto LAB_001a2854;
    }
    unaff_x27 = (ulong)*(ushort *)(lVar2 + 0x20);
    unaff_x28 = (ulong)*(ushort *)(lVar2 + 0x22);
    uVar9 = *(undefined8 *)(lVar2 + 0x10);
    if (unaff_x22 == 0) {
      unaff_x20 = 1;
    }
    else {
      unaff_x20 = func_0x00187bd0(unaff_x22,1);
      if (unaff_x20 == 0) {
        in_stack_00000010 = unaff_x22;
LAB_001a2854:
        func_0x007a1f00(in_stack_00000000,in_stack_00000010,&UNK_009c24c0);
code_r0x001a2868:
                    /* WARNING: Does not return */
        pcVar6 = (code *)SoftwareBreakpoint(1,0x1a286c);
        (*pcVar6)();
      }
    }
    _memcpy(unaff_x20,uVar9,unaff_x22);
    unaff_x26 = 0x8000000000000000;
    in_stack_00000010 = unaff_x20;
  } while( true );
}

