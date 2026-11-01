
void FUN_002d5a20(undefined8 param_1,undefined8 param_2,undefined8 *param_3)

{
  int iVar1;
  undefined8 *puVar2;
  bool bVar3;
  undefined8 *unaff_x19;
  undefined8 *puVar4;
  int iVar5;
  ulong uVar6;
  long unaff_x29;
  undefined8 uVar7;
  undefined8 uVar8;
  undefined8 uVar9;
  undefined8 uVar10;
  undefined8 uVar11;
  undefined8 uVar12;
  undefined1 auVar13 [16];
  undefined1 *puStack0000000000000000;
  long in_stack_00000028;
  undefined8 in_stack_00000030;
  undefined8 in_stack_00000038;
  undefined8 in_stack_00000040;
  undefined8 in_stack_00000048;
  undefined8 in_stack_00000050;
  undefined8 in_stack_00000058;
  undefined8 in_stack_00000060;
  undefined8 in_stack_00000068;
  undefined8 in_stack_00000070;
  undefined8 in_stack_00000078;
  undefined8 in_stack_00000080;
  undefined8 in_stack_00000088;
  undefined8 in_stack_00000090;
  undefined8 in_stack_00000098;
  undefined8 in_stack_000000a0;
  undefined8 in_stack_000000a8;
  undefined8 in_stack_000000b0;
  undefined8 in_stack_000000b8;
  undefined8 in_stack_000000c0;
  undefined8 in_stack_000000c8;
  undefined8 in_stack_000000d0;
  undefined8 in_stack_000000d8;
  undefined8 in_stack_000000e0;
  undefined8 in_stack_000000e8;
  undefined8 in_stack_000000f0;
  undefined8 in_stack_000000f8;
  undefined8 in_stack_00000100;
  undefined1 auStack_7ffffffe [2147483582];
  
  puStack0000000000000000 = auStack_7ffffffe + 0x80001db6;
  bVar3 = true;
  uVar6 = 0;
  do {
    iVar5 = (int)uVar6;
    iVar1 = (int)(uVar6 / 5) * 5;
    if (bVar3) {
      if (iVar1 == iVar5) {
        func_0x002d5da8();
        unaff_x19[5] = in_stack_00000058;
        unaff_x19[4] = in_stack_00000050;
        unaff_x19[7] = in_stack_00000068;
        unaff_x19[6] = in_stack_00000060;
        unaff_x19[8] = in_stack_00000070;
        unaff_x19[1] = in_stack_00000038;
        *unaff_x19 = in_stack_00000030;
        unaff_x19[3] = in_stack_00000048;
        unaff_x19[2] = in_stack_00000040;
        unaff_x19[0xe] = in_stack_000000a0;
        unaff_x19[0xd] = in_stack_00000098;
        unaff_x19[0x10] = in_stack_000000b0;
        unaff_x19[0xf] = in_stack_000000a8;
        unaff_x19[0x11] = in_stack_000000b8;
        unaff_x19[10] = in_stack_00000080;
        unaff_x19[9] = in_stack_00000078;
        unaff_x19[0xc] = in_stack_00000090;
        unaff_x19[0xb] = in_stack_00000088;
        unaff_x19[0x1a] = in_stack_00000100;
        unaff_x19[0x17] = in_stack_000000e8;
        unaff_x19[0x16] = in_stack_000000e0;
        unaff_x19[0x19] = in_stack_000000f8;
        unaff_x19[0x18] = in_stack_000000f0;
        unaff_x19[0x13] = in_stack_000000c8;
        unaff_x19[0x12] = in_stack_000000c0;
        unaff_x19[0x15] = in_stack_000000d8;
        unaff_x19[0x14] = in_stack_000000d0;
LAB_002d5bb4:
        func_0x002d5da8();
        param_3 = unaff_x19;
        func_0x002cc480();
        if (in_stack_00000028 != 0) {
          func_0x002d5da8();
          param_3 = unaff_x19;
          func_0x002cc480();
        }
        goto LAB_002d5ae4;
      }
    }
    else {
      param_3 = unaff_x19;
      func_0x002cdb0c();
      if (iVar1 == iVar5) {
        func_0x002d5da8();
        func_0x002cc480();
        goto LAB_002d5bb4;
      }
LAB_002d5ae4:
      bVar3 = false;
    }
    uVar6 = (ulong)(iVar5 - 1U);
    if (iVar5 - 1U != 0) {
      if (bVar3) {
        unaff_x19[8] = 0;
        unaff_x19[5] = 0;
        unaff_x19[4] = 0;
        unaff_x19[7] = 0;
        unaff_x19[6] = 0;
        unaff_x19[1] = 0;
        *unaff_x19 = 0;
        unaff_x19[3] = 0;
        unaff_x19[2] = 0;
        unaff_x19[10] = 0;
        unaff_x19[9] = 0;
        unaff_x19[0xc] = 0;
        unaff_x19[0xb] = 0;
        unaff_x19[0xe] = 0;
        unaff_x19[0xd] = 0;
        unaff_x19[0x10] = 0;
        unaff_x19[0xf] = 0;
        unaff_x19[0x11] = 0;
        unaff_x19[0x13] = 0;
        unaff_x19[0x12] = 0;
        unaff_x19[0x15] = 0;
        unaff_x19[0x14] = 0;
        unaff_x19[0x17] = 0;
        unaff_x19[0x16] = 0;
        unaff_x19[0x19] = 0;
        unaff_x19[0x18] = 0;
        unaff_x19[0x1a] = 0;
      }
      if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x60)) {
        return;
      }
      auVar13 = ___stack_chk_fail();
      puVar2 = auVar13._8_8_;
      puVar2[8] = 0;
      puVar2[5] = 0;
      puVar2[4] = 0;
      puVar2[7] = 0;
      puVar2[6] = 0;
      puVar2[1] = 0;
      *puVar2 = 0;
      puVar2[3] = 0;
      puVar2[2] = 0;
      puVar2[10] = 0;
      puVar2[9] = 0;
      puVar2[0xc] = 0;
      puVar2[0xb] = 0;
      puVar2[0xe] = 0;
      puVar2[0xd] = 0;
      puVar2[0x10] = 0;
      puVar2[0xf] = 0;
      puVar2[0x11] = 0;
      puVar2[0x13] = 0;
      puVar2[0x12] = 0;
      puVar2[0x15] = 0;
      puVar2[0x14] = 0;
      puVar2[0x17] = 0;
      puVar2[0x16] = 0;
      puVar2[0x19] = 0;
      puVar2[0x18] = 0;
      puVar2[0x1a] = 0;
      uVar7 = *param_3;
      puVar2[0x1c] = param_3[1];
      puVar2[0x1b] = uVar7;
      uVar8 = param_3[3];
      uVar7 = param_3[2];
      uVar10 = param_3[5];
      uVar9 = param_3[4];
      uVar12 = param_3[7];
      uVar11 = param_3[6];
      puVar2[0x23] = param_3[8];
      puVar2[0x22] = uVar12;
      puVar2[0x21] = uVar11;
      puVar2[0x20] = uVar10;
      puVar2[0x1f] = uVar9;
      puVar2[0x1e] = uVar8;
      puVar2[0x1d] = uVar7;
      uVar8 = param_3[0xe];
      uVar7 = param_3[0xd];
      uVar10 = param_3[0x10];
      uVar9 = param_3[0xf];
      uVar12 = param_3[0xc];
      uVar11 = param_3[0xb];
      puVar2[0x2c] = param_3[0x11];
      puVar2[0x29] = uVar8;
      puVar2[0x28] = uVar7;
      puVar2[0x2b] = uVar10;
      puVar2[0x2a] = uVar9;
      puVar2[0x27] = uVar12;
      puVar2[0x26] = uVar11;
      uVar7 = param_3[9];
      puVar2[0x25] = param_3[10];
      puVar2[0x24] = uVar7;
      uVar10 = param_3[0x17];
      uVar9 = param_3[0x16];
      uVar8 = param_3[0x19];
      uVar7 = param_3[0x18];
      uVar12 = param_3[0x15];
      uVar11 = param_3[0x14];
      puVar2[0x35] = param_3[0x1a];
      puVar2[0x32] = uVar10;
      puVar2[0x31] = uVar9;
      puVar2[0x34] = uVar8;
      puVar2[0x33] = uVar7;
      puVar2[0x30] = uVar12;
      puVar2[0x2f] = uVar11;
      uVar7 = param_3[0x12];
      puVar2[0x2e] = param_3[0x13];
      puVar2[0x2d] = uVar7;
      puVar4 = puVar2 + 0x36;
      uVar6 = 2;
      do {
        while ((uVar6 & 1) != 0) {
          func_0x002cc480(auVar13._0_8_,puVar4,puVar2 + 0x1b,puVar4 + -0x1b);
          uVar6 = uVar6 + 1;
          puVar4 = puVar4 + 0x1b;
          if (uVar6 == 0x11) {
            return;
          }
        }
        func_0x002cdb0c(auVar13._0_8_,puVar4,puVar2 + (uVar6 >> 1) * 0x1b);
        uVar6 = uVar6 + 1;
        puVar4 = puVar4 + 0x1b;
      } while (uVar6 != 0x11);
      return;
    }
  } while( true );
}

