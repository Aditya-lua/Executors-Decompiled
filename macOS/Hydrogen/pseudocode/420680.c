
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

void FUN_00420680(undefined8 param_1,undefined8 param_2)

{
  undefined4 uVar1;
  undefined4 uVar2;
  ushort uVar3;
  undefined1 *puVar4;
  int iVar5;
  undefined8 *puVar6;
  uint *puVar7;
  undefined2 *puVar8;
  ulong uVar9;
  undefined2 *extraout_x8;
  ulong unaff_x19;
  undefined8 *puVar10;
  undefined8 unaff_x21;
  undefined8 *unaff_x22;
  int unaff_w24;
  undefined1 *unaff_x29;
  undefined8 uVar11;
  undefined1 auVar12 [16];
  undefined1 uStack0000000000000040;
  
  func_0x00187bd4(param_1,param_2,8);
  _close();
  puVar6 = (undefined8 *)__Unwind_Resume();
  if (unaff_w24 == -1) {
    func_0x003f67e4(&uStack0000000000000040);
  }
  _close();
  __Unwind_Resume(puVar6);
  puVar7 = (uint *)func_0x007a2668();
  uVar9 = (ulong)*puVar7;
  uVar11 = 0x4206c8;
  puVar4 = (undefined1 *)register0x00000008;
  puVar8 = extraout_x8;
  do {
    *(undefined8 **)(puVar4 + -0x20) = puVar6;
    *(ulong *)(puVar4 + -0x18) = unaff_x19;
    *(undefined1 **)(puVar4 + -0x10) = unaff_x29;
    *(undefined8 *)(puVar4 + -8) = uVar11;
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
    iVar5 = _getpeername(uVar9,puVar4 + -0xc0,puVar4 + -0x38);
    if (iVar5 == -1) {
      puVar7 = (uint *)___error();
      *(ulong *)(puVar8 + 4) = (ulong)*puVar7 << 0x20 | 2;
      *puVar8 = 2;
      return;
    }
    if (puVar4[-0xbf] == '\x1e') {
      if (0x1b < *(uint *)(puVar4 + -0x38)) {
        uVar3 = *(ushort *)(puVar4 + -0xbe);
        uVar1 = *(undefined4 *)(puVar4 + -0xbc);
        uVar2 = *(undefined4 *)(puVar4 + -0xa8);
        *(undefined8 *)(puVar4 + -0x28) = *(undefined8 *)(puVar4 + -0xb0);
        *(undefined8 *)(puVar4 + -0x30) = *(undefined8 *)(puVar4 + -0xb8);
        *puVar8 = 1;
        uVar11 = *(undefined8 *)(puVar4 + -0x32);
        *(undefined8 *)(puVar8 + 5) = *(undefined8 *)(puVar4 + -0x2a);
        *(undefined8 *)(puVar8 + 1) = uVar11;
        puVar8[9] = *(undefined2 *)(puVar4 + -0x22);
        *(undefined4 *)(puVar8 + 10) = uVar1;
        *(undefined4 *)(puVar8 + 0xc) = uVar2;
        puVar8[0xe] = uVar3 >> 8 | uVar3 << 8;
        return;
      }
    }
    else {
      if (puVar4[-0xbf] != '\x02') {
        *(undefined **)(puVar8 + 4) = &UNK_009dbc18;
        *puVar8 = 2;
        return;
      }
      if (0xf < *(uint *)(puVar4 + -0x38)) {
        uVar3 = *(ushort *)(puVar4 + -0xbe);
        uVar1 = *(undefined4 *)(puVar4 + -0xbc);
        *puVar8 = 0;
        *(undefined4 *)(puVar8 + 1) = uVar1;
        puVar8[3] = uVar3 >> 8 | uVar3 << 8;
        return;
      }
      func_0x007a247c(&UNK_008874bb,0x34,&UNK_009dbbe8);
    }
    auVar12 = func_0x007a247c(&UNK_0088751b,0x35,&UNK_009dbc00);
    *(undefined8 **)(puVar4 + -0xf0) = unaff_x22;
    *(undefined8 *)(puVar4 + -0xe8) = unaff_x21;
    *(undefined8 **)(puVar4 + -0xe0) = puVar6;
    *(undefined2 **)(puVar4 + -0xd8) = puVar8;
    *(undefined1 **)(puVar4 + -0xd0) = puVar4 + -0x10;
    *(undefined **)(puVar4 + -200) =
         &
         __ZN81__LT_std__sys__net__connection__socket__TcpStream_u20_as_u20_core__fmt__Debug_GT_3fmt17h68f61e46eeb38c1dE
    ;
    unaff_x29 = puVar4 + -0xd0;
    func_0x00469240(puVar4 + -0x140,auVar12._8_8_,&UNK_00887578,9);
    uVar9 = (ulong)*auVar12._0_8_;
    func_0x004338c0(puVar4 + -0x130,uVar9);
    unaff_x19 = uVar9;
    if (*(short *)(puVar4 + -0x130) == 2) {
      puVar10 = *(undefined8 **)(puVar4 + -0x128);
      puVar6 = puVar10;
      if (((ulong)puVar10 & 3) == 1) {
        puVar6 = (undefined8 *)((long)puVar10 - 1);
        unaff_x21 = *puVar6;
        unaff_x22 = *(undefined8 **)((long)puVar10 + 7);
        if ((code *)*unaff_x22 != (code *)0x0) {
          (*(code *)*unaff_x22)(unaff_x21);
        }
        if (unaff_x22[1] != 0) {
          func_0x00187bd4(unaff_x21,unaff_x22[1],unaff_x22[2]);
        }
        func_0x00187bd4(puVar6,0x18,8);
      }
      puVar8 = (undefined2 *)(puVar4 + -0x130);
      uVar11 = 0x433630;
      puVar4 = puVar4 + -0x140;
    }
    else {
      *(undefined8 *)(puVar4 + -0x108) = *(undefined8 *)(puVar4 + -0x128);
      *(undefined8 *)(puVar4 + -0x110) = *(undefined8 *)(puVar4 + -0x130);
      *(undefined8 *)(puVar4 + -0xf8) = *(undefined8 *)(puVar4 + -0x118);
      *(undefined8 *)(puVar4 + -0x100) = *(undefined8 *)(puVar4 + -0x120);
      func_0x004653b0(puVar4 + -0x140,&UNK_00888470,4,puVar4 + -0x110,&UNK_009dbc60);
      puVar8 = (undefined2 *)(puVar4 + -0x130);
      uVar11 = 0x4336c0;
      puVar4 = puVar4 + -0x140;
    }
  } while( true );
}

