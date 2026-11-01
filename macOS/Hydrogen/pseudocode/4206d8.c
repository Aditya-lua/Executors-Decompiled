
/* WARNING: Possible PIC construction at 0x0043362c: Changing call to branch */
/* WARNING: Possible PIC construction at 0x004336bc: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x00433630) */
/* WARNING: Removing unreachable block (ram,0x004336c0) */
/* WARNING: Removing unreachable block (ram,0x0043363c) */
/* WARNING: Removing unreachable block (ram,0x0043364c) */
/* WARNING: Removing unreachable block (ram,0x0043365c) */
/* WARNING: Removing unreachable block (ram,0x00433664) */
/* WARNING: Removing unreachable block (ram,0x0043366c) */
/* WARNING: Removing unreachable block (ram,0x00433678) */
/* WARNING: Removing unreachable block (ram,0x004336cc) */
/* WARNING: Removing unreachable block (ram,0x004336f4) */

void FUN_004206d8(undefined2 *param_1,ulong param_2)

{
  undefined4 uVar1;
  undefined4 uVar2;
  ushort uVar3;
  undefined1 *puVar4;
  int iVar5;
  uint *puVar6;
  ulong unaff_x19;
  undefined8 *unaff_x20;
  undefined8 *puVar7;
  undefined8 unaff_x21;
  undefined8 *unaff_x22;
  undefined8 uVar8;
  undefined1 auVar9 [16];
  undefined1 *in_stack_00000000;
  undefined *in_stack_00000008;
  undefined1 uStack0000000000000010;
  
  puVar4 = &uStack0000000000000010;
  do {
    *(undefined8 **)(puVar4 + -0x20) = unaff_x20;
    *(ulong *)(puVar4 + -0x18) = unaff_x19;
    *(undefined1 **)(puVar4 + -0x10) = in_stack_00000000;
    *(undefined **)(puVar4 + -8) = in_stack_00000008;
    *(undefined8 *)(puVar4 + -0x58) = 0;
    *(undefined8 *)(puVar4 + -0x60) = 0;
    *(undefined8 *)(puVar4 + -0x48) = 0;
    *(undefined8 *)(puVar4 + -0x50) = 0;
    *(undefined8 *)(puVar4 + -0x78) = 0;
    *(undefined8 *)(puVar4 + -0x80) = 0;
    *(undefined8 *)(puVar4 + -0x68) = 0;
    *(undefined8 *)(puVar4 + -0x70) = 0;
    *(undefined8 *)(puVar4 + -0x98) = 0;
    *(undefined8 *)(puVar4 + -0xa0) = 0;
    *(undefined8 *)(puVar4 + -0x88) = 0;
    *(undefined8 *)(puVar4 + -0x90) = 0;
    *(undefined8 *)(puVar4 + -0xb8) = 0;
    *(undefined8 *)(puVar4 + -0xc0) = 0;
    *(undefined8 *)(puVar4 + -0xa8) = 0;
    *(undefined8 *)(puVar4 + -0xb0) = 0;
    *(undefined4 *)(puVar4 + -0x38) = 0x80;
    iVar5 = _getpeername(param_2,puVar4 + -0xc0,puVar4 + -0x38);
    if (iVar5 == -1) {
      puVar6 = (uint *)___error();
      *(ulong *)(param_1 + 4) = (ulong)*puVar6 << 0x20 | 2;
      *param_1 = 2;
      return;
    }
    if (puVar4[-0xbf] == '\x1e') {
      if (0x1b < *(uint *)(puVar4 + -0x38)) {
        uVar3 = *(ushort *)(puVar4 + -0xbe);
        uVar1 = *(undefined4 *)(puVar4 + -0xbc);
        uVar2 = *(undefined4 *)(puVar4 + -0xa8);
        *(undefined8 *)(puVar4 + -0x28) = *(undefined8 *)(puVar4 + -0xb0);
        *(undefined8 *)(puVar4 + -0x30) = *(undefined8 *)(puVar4 + -0xb8);
        *param_1 = 1;
        uVar8 = *(undefined8 *)(puVar4 + -0x32);
        *(undefined8 *)(param_1 + 5) = *(undefined8 *)(puVar4 + -0x2a);
        *(undefined8 *)(param_1 + 1) = uVar8;
        param_1[9] = *(undefined2 *)(puVar4 + -0x22);
        *(undefined4 *)(param_1 + 10) = uVar1;
        *(undefined4 *)(param_1 + 0xc) = uVar2;
        param_1[0xe] = uVar3 >> 8 | uVar3 << 8;
        return;
      }
    }
    else {
      if (puVar4[-0xbf] != '\x02') {
        *(undefined **)(param_1 + 4) = &UNK_009dbc18;
        *param_1 = 2;
        return;
      }
      if (0xf < *(uint *)(puVar4 + -0x38)) {
        uVar3 = *(ushort *)(puVar4 + -0xbe);
        uVar1 = *(undefined4 *)(puVar4 + -0xbc);
        *param_1 = 0;
        *(undefined4 *)(param_1 + 1) = uVar1;
        param_1[3] = uVar3 >> 8 | uVar3 << 8;
        return;
      }
      func_0x007a247c(&UNK_008874bb,0x34,&UNK_009dbbe8);
    }
    auVar9 = func_0x007a247c(&UNK_0088751b,0x35,&UNK_009dbc00);
    *(undefined8 **)(puVar4 + -0xf0) = unaff_x22;
    *(undefined8 *)(puVar4 + -0xe8) = unaff_x21;
    *(undefined8 **)(puVar4 + -0xe0) = unaff_x20;
    *(undefined2 **)(puVar4 + -0xd8) = param_1;
    *(undefined1 **)(puVar4 + -0xd0) = puVar4 + -0x10;
    *(undefined **)(puVar4 + -200) =
         &
         __ZN81__LT_std__sys__net__connection__socket__TcpStream_u20_as_u20_core__fmt__Debug_GT_3fmt17h68f61e46eeb38c1dE
    ;
    in_stack_00000000 = puVar4 + -0xd0;
    func_0x00469240(puVar4 + -0x140,auVar9._8_8_,&UNK_00887578,9);
    param_2 = (ulong)*auVar9._0_8_;
    func_0x004338c0(puVar4 + -0x130,param_2);
    unaff_x19 = param_2;
    if (*(short *)(puVar4 + -0x130) == 2) {
      puVar7 = *(undefined8 **)(puVar4 + -0x128);
      unaff_x20 = puVar7;
      if (((ulong)puVar7 & 3) == 1) {
        unaff_x20 = (undefined8 *)((long)puVar7 - 1);
        unaff_x21 = *unaff_x20;
        unaff_x22 = *(undefined8 **)((long)puVar7 + 7);
        if ((code *)*unaff_x22 != (code *)0x0) {
          (*(code *)*unaff_x22)(unaff_x21);
        }
        if (unaff_x22[1] != 0) {
          func_0x00187bd4(unaff_x21,unaff_x22[1],unaff_x22[2]);
        }
        func_0x00187bd4(unaff_x20,0x18,8);
      }
      param_1 = (undefined2 *)(puVar4 + -0x130);
      in_stack_00000008 = &UNK_00433630;
      puVar4 = puVar4 + -0x140;
    }
    else {
      *(undefined8 *)(puVar4 + -0x108) = *(undefined8 *)(puVar4 + -0x128);
      *(undefined8 *)(puVar4 + -0x110) = *(undefined8 *)(puVar4 + -0x130);
      *(undefined8 *)(puVar4 + -0xf8) = *(undefined8 *)(puVar4 + -0x118);
      *(undefined8 *)(puVar4 + -0x100) = *(undefined8 *)(puVar4 + -0x120);
      func_0x004653b0(puVar4 + -0x140,&UNK_00888470,4,puVar4 + -0x110,&UNK_009dbc60);
      param_1 = (undefined2 *)(puVar4 + -0x130);
      in_stack_00000008 = &UNK_004336c0;
      puVar4 = puVar4 + -0x140;
    }
  } while( true );
}

