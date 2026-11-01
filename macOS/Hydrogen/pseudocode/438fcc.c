
void FUN_00438fcc(undefined8 param_1,undefined8 param_2)

{
  bool in_ZR;
  long lVar1;
  undefined8 uVar2;
  long unaff_x21;
  long unaff_x23;
  undefined8 unaff_x24;
  undefined8 *unaff_x27;
  long *unaff_x28;
  long unaff_x29;
  undefined8 uVar3;
  undefined8 uVar4;
  undefined8 uVar5;
  undefined8 uVar6;
  undefined8 uVar7;
  undefined8 uVar8;
  undefined8 uVar9;
  undefined8 uVar10;
  undefined8 uVar11;
  undefined8 uVar12;
  undefined8 uVar13;
  undefined8 uVar14;
  undefined8 uVar15;
  undefined8 uVar16;
  undefined8 uVar17;
  undefined8 uVar18;
  undefined8 uVar19;
  undefined8 uVar20;
  undefined8 uVar21;
  undefined8 uVar22;
  undefined8 uVar23;
  undefined8 uVar24;
  undefined8 uVar25;
  undefined1 auVar26 [16];
  undefined1 auVar27 [16];
  undefined1 auVar28 [16];
  undefined1 auVar29 [16];
  undefined1 auVar30 [16];
  undefined1 auVar31 [16];
  undefined1 auVar32 [16];
  undefined1 auVar33 [16];
  undefined8 *in_stack_000000a8;
  undefined8 *in_stack_000000b0;
  undefined8 uStack00000000000000c8;
  undefined8 uStack00000000000000d0;
  long in_stack_00000138;
  undefined8 in_stack_00000140;
  long *in_stack_00000148;
  undefined8 in_stack_00000270;
  undefined8 in_stack_00000278;
  char in_stack_00000410;
  undefined8 in_stack_00000420;
  undefined1 auStack_7ffffffe [2147483646];
  
  uStack00000000000000d0 = 0;
  if (in_ZR) {
    param_1 = 1;
  }
  else {
    uStack00000000000000d0 = param_2;
  }
  uStack00000000000000c8 = param_1;
  auVar26 = func_0x0043e3ac();
  if (auVar26._0_8_ == 0) {
    auVar26 = ZEXT816(1);
  }
  auVar27 = func_0x0043e3ac();
  if (auVar27._0_8_ == 0) {
    auVar27 = ZEXT816(1);
  }
  auVar28 = func_0x0043e3ac();
  if (auVar28._0_8_ == 0) {
    auVar28 = ZEXT816(1);
  }
  auVar29 = func_0x0043e3ac();
  if (auVar29._0_8_ == 0) {
    auVar29 = ZEXT816(1);
  }
  auVar30 = func_0x0043e3ac();
  if (auVar30._0_8_ == 0) {
    auVar30 = ZEXT816(1);
  }
  auVar31 = func_0x0043e3ac();
  if (auVar31._0_8_ == 0) {
    auVar31 = ZEXT816(1);
  }
  auVar32 = func_0x0043e3ac();
  if (auVar32._0_8_ == 0) {
    auVar32 = ZEXT816(1);
  }
  auVar33 = func_0x0043e3ac();
  if (auVar33._0_8_ == 0) {
    auVar33 = ZEXT816(1);
  }
  func_0x004098a0(auStack_7ffffffe + 0x8000040e);
  if (in_stack_00000410 == '\n') {
    uVar8 = *(undefined8 *)(unaff_x21 + 0xb0);
    uVar2 = *(undefined8 *)(unaff_x21 + 0xa8);
    *(undefined8 *)((long)unaff_x27 + 0xe7) = uVar8;
    *(undefined8 *)((long)unaff_x27 + 0xdf) = uVar2;
  }
  else {
    uVar9 = *(undefined8 *)(unaff_x21 + 0xa9);
    uVar8 = *(undefined8 *)(unaff_x21 + 0xa1);
    uVar2 = 0;
    if (unaff_x23 == 0) {
      unaff_x23 = 1;
    }
    else {
      uVar2 = unaff_x24;
    }
    *(undefined8 *)((long)unaff_x27 + 0xe7) = in_stack_00000420;
    uVar3 = *(undefined8 *)(unaff_x21 + 0xb8);
    uVar5 = *(undefined8 *)(unaff_x21 + 0xd0);
    uVar4 = *(undefined8 *)(unaff_x21 + 200);
    *(undefined8 *)(unaff_x29 + -0x98) = *(undefined8 *)(unaff_x21 + 0xc0);
    *(undefined8 *)(unaff_x29 + -0xa0) = uVar3;
    *(undefined8 *)(unaff_x29 + -0x88) = uVar5;
    *(undefined8 *)(unaff_x29 + -0x90) = uVar4;
    uVar3 = *(undefined8 *)(unaff_x21 + 0xd8);
    uVar5 = *(undefined8 *)(unaff_x21 + 0xf0);
    uVar4 = *(undefined8 *)(unaff_x21 + 0xe8);
    *(undefined8 *)(unaff_x29 + -0x78) = *(undefined8 *)(unaff_x21 + 0xe0);
    *(undefined8 *)(unaff_x29 + -0x80) = uVar3;
    *(undefined8 *)(unaff_x29 + -0x68) = uVar5;
    *(undefined8 *)(unaff_x29 + -0x70) = uVar4;
    func_0x004098a0(auStack_7ffffffe + 0x8000040e,unaff_x23,uVar2);
    if (in_stack_00000410 != '\n') {
      *(undefined8 *)(unaff_x21 + 0x7f) = in_stack_00000420;
      uVar10 = *(undefined8 *)(unaff_x21 + 0xa9);
      uVar4 = *(undefined8 *)(unaff_x21 + 0xa1);
      uVar11 = *(undefined8 *)(unaff_x21 + 0xc0);
      uVar5 = *(undefined8 *)(unaff_x21 + 0xb8);
      uVar19 = *(undefined8 *)(unaff_x21 + 0xd0);
      uVar15 = *(undefined8 *)(unaff_x21 + 200);
      uVar12 = *(undefined8 *)(unaff_x21 + 0xe0);
      uVar6 = *(undefined8 *)(unaff_x21 + 0xd8);
      uVar20 = *(undefined8 *)(unaff_x21 + 0xf0);
      uVar16 = *(undefined8 *)(unaff_x21 + 0xe8);
      *(undefined8 *)(unaff_x21 + 0xf) = *(undefined8 *)(unaff_x21 + 0x7f);
      *(undefined8 *)(unaff_x21 + 0x4f) = *(undefined8 *)((long)unaff_x27 + 0xe7);
      uVar13 = *(undefined8 *)(unaff_x29 + -0x98);
      uVar7 = *(undefined8 *)(unaff_x29 + -0xa0);
      uVar21 = *(undefined8 *)(unaff_x29 + -0x88);
      uVar17 = *(undefined8 *)(unaff_x29 + -0x90);
      uVar23 = *(undefined8 *)(unaff_x29 + -0x78);
      uVar22 = *(undefined8 *)(unaff_x29 + -0x80);
      uVar25 = *(undefined8 *)(unaff_x29 + -0x68);
      uVar24 = *(undefined8 *)(unaff_x29 + -0x70);
      *(undefined8 *)(unaff_x21 + 0x2f) = *(undefined8 *)(unaff_x21 + 0x4f);
      uVar2 = *(undefined8 *)(unaff_x21 + 0x2f);
      *(undefined8 *)((long)unaff_x27 + 199) = uVar25;
      func_0x003f73ec(in_stack_00000140);
      uVar3 = *unaff_x27;
      uVar18 = unaff_x27[3];
      uVar14 = unaff_x27[2];
      in_stack_000000a8[0x3b] = unaff_x27[1];
      in_stack_000000a8[0x3a] = uVar3;
      in_stack_000000a8[0x3d] = uVar18;
      in_stack_000000a8[0x3c] = uVar14;
      uVar3 = unaff_x27[4];
      in_stack_000000a8[0x3f] = unaff_x27[5];
      in_stack_000000a8[0x3e] = uVar3;
      in_stack_000000a8[0x40] = in_stack_00000278;
      *(ulong *)((long)in_stack_000000a8 + 0xa9) = CONCAT17((char)uVar21,(int7)((ulong)uVar17 >> 8))
      ;
      *(ulong *)((long)in_stack_000000a8 + 0xa1) = CONCAT17((char)uVar17,(int7)((ulong)uVar13 >> 8))
      ;
      *(ulong *)((long)in_stack_000000a8 + 0xb9) = CONCAT17((char)uVar23,(int7)((ulong)uVar22 >> 8))
      ;
      *(ulong *)((long)in_stack_000000a8 + 0xb1) = CONCAT17((char)uVar22,(int7)((ulong)uVar21 >> 8))
      ;
      *(ulong *)((long)in_stack_000000a8 + 0xc9) = CONCAT17((char)uVar25,(int7)((ulong)uVar24 >> 8))
      ;
      *(ulong *)((long)in_stack_000000a8 + 0xc1) = CONCAT17((char)uVar24,(int7)((ulong)uVar23 >> 8))
      ;
      in_stack_000000a8[0x1a] = *(undefined8 *)((long)unaff_x27 + 199);
      *(undefined8 *)((long)in_stack_000000a8 + 0x89) = uVar9;
      *(undefined8 *)((long)in_stack_000000a8 + 0x81) = uVar8;
      *(ulong *)((long)in_stack_000000a8 + 0x99) = CONCAT17((char)uVar13,(int7)((ulong)uVar7 >> 8));
      *(ulong *)((long)in_stack_000000a8 + 0x91) = CONCAT17((char)uVar7,(int7)((ulong)uVar2 >> 8));
      in_stack_000000a8[0x1d] = *(undefined8 *)(unaff_x21 + 0xf);
      *(undefined8 *)((long)in_stack_000000a8 + 0xe1) = uVar10;
      *(undefined8 *)((long)in_stack_000000a8 + 0xd9) = uVar4;
      in_stack_000000a8[0x23] = uVar12;
      in_stack_000000a8[0x22] = uVar6;
      in_stack_000000a8[0x25] = uVar20;
      in_stack_000000a8[0x24] = uVar16;
      in_stack_000000a8[0x1f] = uVar11;
      in_stack_000000a8[0x1e] = uVar5;
      in_stack_000000a8[0x21] = uVar19;
      in_stack_000000a8[0x20] = uVar15;
      uVar8 = in_stack_000000b0[1];
      uVar2 = *in_stack_000000b0;
      uVar3 = in_stack_000000b0[3];
      uVar9 = in_stack_000000b0[2];
      uVar4 = in_stack_000000b0[4];
      uVar6 = in_stack_000000b0[7];
      uVar5 = in_stack_000000b0[6];
      in_stack_000000a8[5] = in_stack_000000b0[5];
      in_stack_000000a8[4] = uVar4;
      in_stack_000000a8[7] = uVar6;
      in_stack_000000a8[6] = uVar5;
      in_stack_000000a8[1] = uVar8;
      *in_stack_000000a8 = uVar2;
      in_stack_000000a8[3] = uVar3;
      in_stack_000000a8[2] = uVar9;
      uVar8 = in_stack_000000b0[9];
      uVar2 = in_stack_000000b0[8];
      uVar3 = in_stack_000000b0[0xb];
      uVar9 = in_stack_000000b0[10];
      uVar4 = in_stack_000000b0[0xc];
      uVar6 = in_stack_000000b0[0xf];
      uVar5 = in_stack_000000b0[0xe];
      in_stack_000000a8[0xd] = in_stack_000000b0[0xd];
      in_stack_000000a8[0xc] = uVar4;
      in_stack_000000a8[0xf] = uVar6;
      in_stack_000000a8[0xe] = uVar5;
      in_stack_000000a8[9] = uVar8;
      in_stack_000000a8[8] = uVar2;
      in_stack_000000a8[0xb] = uVar3;
      in_stack_000000a8[10] = uVar9;
      *(char *)(in_stack_000000a8 + 0x10) = in_stack_00000410;
      *(char *)(in_stack_000000a8 + 0x1b) = in_stack_00000410;
      in_stack_000000a8[0x26] = uStack00000000000000c8;
      in_stack_000000a8[0x27] = uStack00000000000000d0;
      *(undefined1 (*) [16])(in_stack_000000a8 + 0x28) = auVar26;
      *(undefined1 (*) [16])(in_stack_000000a8 + 0x2a) = auVar27;
      *(undefined1 (*) [16])(in_stack_000000a8 + 0x2c) = auVar28;
      *(undefined1 (*) [16])(in_stack_000000a8 + 0x2e) = auVar29;
      *(undefined1 (*) [16])(in_stack_000000a8 + 0x30) = auVar30;
      *(undefined1 (*) [16])(in_stack_000000a8 + 0x32) = auVar31;
      *(undefined1 (*) [16])(in_stack_000000a8 + 0x34) = auVar32;
      *(undefined1 (*) [16])(in_stack_000000a8 + 0x36) = auVar33;
      in_stack_000000a8[0x38] = 1;
      in_stack_000000a8[0x39] = 0;
      return;
    }
    uVar8 = *(undefined8 *)(unaff_x21 + 0xb0);
    uVar2 = *(undefined8 *)(unaff_x21 + 0xa8);
  }
  *(undefined8 *)(unaff_x21 + 0x4f) = uVar8;
  *(undefined8 *)(unaff_x21 + 0x47) = uVar2;
  *in_stack_000000a8 = 0x8000000000000000;
  func_0x003f73ec(in_stack_00000140);
  lVar1 = *unaff_x28;
  *unaff_x28 = lVar1 + -1;
  LORelease();
  if (lVar1 == 1) {
    DataMemoryBarrier(2,1);
    func_0x00403ad4(auStack_7ffffffe + 0x80000246);
  }
  func_0x003f55f4(auStack_7ffffffe + 0x8000024e);
  func_0x003f56c4(in_stack_00000270,in_stack_00000278);
  if ((in_stack_00000138 == -0x8000000000000000) && (*in_stack_00000148 != -0x8000000000000000)) {
    func_0x003f73ec(in_stack_00000148);
  }
  func_0x003f73ec(in_stack_000000b0);
  return;
}

