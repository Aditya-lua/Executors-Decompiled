
/* WARNING: Removing unreachable block (ram,0x00422898) */
/* WARNING: Removing unreachable block (ram,0x004228b8) */
/* WARNING: Removing unreachable block (ram,0x004228c8) */
/* WARNING: Removing unreachable block (ram,0x004228d0) */
/* WARNING: Removing unreachable block (ram,0x004228d8) */
/* WARNING: Removing unreachable block (ram,0x004228e4) */
/* WARNING: Removing unreachable block (ram,0x004229f4) */
/* WARNING: Removing unreachable block (ram,0x00422a14) */
/* WARNING: Removing unreachable block (ram,0x00422a24) */
/* WARNING: Removing unreachable block (ram,0x00422a2c) */
/* WARNING: Removing unreachable block (ram,0x00422a34) */
/* WARNING: Removing unreachable block (ram,0x00422a40) */

void FUN_004227ec(undefined4 *param_1,undefined8 param_2)

{
  undefined4 uVar1;
  undefined2 uVar2;
  ushort uVar3;
  undefined4 uVar4;
  undefined4 uVar5;
  undefined4 uVar6;
  uint uVar7;
  undefined4 uVar8;
  uint uVar9;
  undefined4 uVar10;
  uint uVar11;
  undefined4 uVar12;
  uint uVar13;
  undefined4 uVar14;
  uint uVar15;
  undefined4 uVar16;
  uint uVar17;
  undefined4 uVar18;
  uint uVar19;
  undefined4 uVar20;
  uint uVar21;
  undefined4 uVar22;
  uint uVar23;
  undefined4 uVar24;
  uint uVar25;
  undefined4 uVar26;
  uint uVar27;
  undefined4 uVar28;
  uint uVar29;
  undefined4 uVar30;
  uint uVar31;
  undefined2 uVar32;
  int iVar33;
  undefined4 in_stack_00000070;
  undefined1 uStack0000000000000080;
  char cStack0000000000000081;
  ushort uStack0000000000000082;
  ushort uStack0000000000000084;
  ushort uStack0000000000000086;
  uint in_stack_00000088;
  uint uStack000000000000008c;
  uint in_stack_00000090;
  uint uStack0000000000000094;
  uint in_stack_00000098;
  uint uStack000000000000009c;
  uint in_stack_000000a0;
  uint uStack00000000000000a4;
  uint in_stack_000000a8;
  uint uStack00000000000000ac;
  uint in_stack_000000b0;
  uint uStack00000000000000b4;
  uint in_stack_000000b8;
  uint uStack00000000000000bc;
  uint in_stack_000000c0;
  uint uStack00000000000000c4;
  uint in_stack_000000c8;
  uint uStack00000000000000cc;
  uint in_stack_000000d0;
  uint uStack00000000000000d4;
  undefined2 in_stack_000000d8;
  undefined2 uStack00000000000000da;
  undefined4 uStack00000000000000dc;
  undefined2 in_stack_000000e0;
  undefined2 uStack00000000000000e2;
  undefined4 uStack00000000000000e4;
  undefined2 uStack00000000000000e8;
  undefined2 uStack00000000000000ea;
  undefined4 uStack00000000000000ec;
  undefined1 uStack00000000000000fc;
  
  func_0x00469240(param_2,&UNK_00886597,10);
  func_0x004653b0();
  uVar1 = *param_1;
  uStack00000000000000e2 = 0;
  uStack00000000000000e4 = 0;
  uStack00000000000000e8 = 0;
  in_stack_000000e0 = 0;
  in_stack_000000c8 = 0;
  uStack00000000000000cc = 0;
  in_stack_000000c0 = 0;
  uStack00000000000000c4 = 0;
  in_stack_000000d8 = 0;
  uStack00000000000000da = 0;
  uStack00000000000000dc = 0;
  in_stack_000000d0 = 0;
  uStack00000000000000d4 = 0;
  in_stack_000000a8 = 0;
  uStack00000000000000ac = 0;
  in_stack_000000a0 = 0;
  uStack00000000000000a4 = 0;
  in_stack_000000b8 = 0;
  uStack00000000000000bc = 0;
  in_stack_000000b0 = 0;
  uStack00000000000000b4 = 0;
  in_stack_00000088 = 0;
  uStack000000000000008c = 0;
  uStack0000000000000080 = 0;
  cStack0000000000000081 = '\0';
  uStack0000000000000082 = 0;
  uStack0000000000000084 = 0;
  uStack0000000000000086 = 0;
  in_stack_00000098 = 0;
  uStack000000000000009c = 0;
  in_stack_00000090 = 0;
  uStack0000000000000094 = 0;
  _uStack00000000000000fc = 0x6a;
  iVar33 = _getsockname(uVar1,&uStack0000000000000080,&uStack00000000000000fc);
  uVar32 = uStack00000000000000e8;
  uVar30 = uStack00000000000000d4;
  uVar28 = uStack00000000000000cc;
  uVar26 = in_stack_000000c8;
  uVar24 = uStack00000000000000c4;
  uVar22 = uStack00000000000000bc;
  uVar20 = uStack00000000000000b4;
  uVar18 = uStack00000000000000ac;
  uVar16 = in_stack_000000a8;
  uVar14 = uStack00000000000000a4;
  uVar12 = uStack000000000000009c;
  uVar10 = in_stack_00000098;
  uVar8 = uStack0000000000000094;
  uVar6 = uStack000000000000008c;
  if (iVar33 == -1) {
    ___error();
  }
  else {
    uVar2 = CONCAT11(cStack0000000000000081,uStack0000000000000080);
    if (_uStack00000000000000fc == 0) {
      iVar33 = 2;
    }
    else {
      iVar33 = _uStack00000000000000fc;
      if (cStack0000000000000081 != '\x01') goto LAB_00422994;
    }
    uVar5 = CONCAT22(uStack00000000000000e2,in_stack_000000e0);
    uVar4 = CONCAT22(uStack00000000000000da,in_stack_000000d8);
    uStack00000000000000c4 = in_stack_000000c0;
    in_stack_000000c8 = uVar24;
    uStack00000000000000bc = in_stack_000000b8;
    in_stack_000000c0 = uVar22;
    uStack00000000000000d4 = in_stack_000000d0;
    in_stack_000000d8 = (undefined2)uVar30;
    uStack00000000000000da = (undefined2)((uint)uVar30 >> 0x10);
    uStack00000000000000cc = uVar26;
    in_stack_000000d0 = uVar28;
    uStack00000000000000e8 = (undefined2)uStack00000000000000e4;
    uStack00000000000000ea = (undefined2)((uint)uStack00000000000000e4 >> 0x10);
    in_stack_000000e0 = (undefined2)uStack00000000000000dc;
    uStack00000000000000e2 = (undefined2)((uint)uStack00000000000000dc >> 0x10);
    uStack0000000000000094 = in_stack_00000090;
    in_stack_00000098 = uVar8;
    uStack000000000000008c = in_stack_00000088;
    in_stack_00000090 = uVar6;
    uStack00000000000000a4 = in_stack_000000a0;
    in_stack_000000a8 = uVar14;
    uStack000000000000009c = uVar10;
    in_stack_000000a0 = uVar12;
    in_stack_00000088 =
         (uint)uStack0000000000000084 | (uint)(((ulong)uStack0000000000000086 << 0x30) >> 0x20);
    in_stack_00000070 = CONCAT22(in_stack_00000070._2_2_,uVar32);
    uStack0000000000000086 = uStack0000000000000082;
    uStack0000000000000080 = (undefined1)iVar33;
    cStack0000000000000081 = (char)((uint)iVar33 >> 8);
    uStack0000000000000082 = (ushort)((uint)iVar33 >> 0x10);
    uStack00000000000000ec = in_stack_00000070;
    uStack00000000000000b4 = in_stack_000000b0;
    in_stack_000000b8 = uVar20;
    uStack00000000000000ac = uVar16;
    in_stack_000000b0 = uVar18;
    uStack0000000000000084 = uVar2;
    uStack00000000000000dc = uVar4;
    uStack00000000000000e4 = uVar5;
    func_0x004653b0();
  }
LAB_00422994:
  uStack00000000000000e2 = 0;
  uStack00000000000000e4 = 0;
  uStack00000000000000e8 = 0;
  in_stack_000000e0 = 0;
  in_stack_000000c8 = 0;
  uStack00000000000000cc = 0;
  in_stack_000000c0 = 0;
  uStack00000000000000c4 = 0;
  in_stack_000000d8 = 0;
  uStack00000000000000da = 0;
  uStack00000000000000dc = 0;
  in_stack_000000d0 = 0;
  uStack00000000000000d4 = 0;
  in_stack_000000a8 = 0;
  uStack00000000000000ac = 0;
  in_stack_000000a0 = 0;
  uStack00000000000000a4 = 0;
  in_stack_000000b8 = 0;
  uStack00000000000000bc = 0;
  in_stack_000000b0 = 0;
  uStack00000000000000b4 = 0;
  in_stack_00000088 = 0;
  uStack000000000000008c = 0;
  uStack0000000000000080 = 0;
  cStack0000000000000081 = '\0';
  uStack0000000000000082 = 0;
  uStack0000000000000084 = 0;
  uStack0000000000000086 = 0;
  in_stack_00000098 = 0;
  uStack000000000000009c = 0;
  in_stack_00000090 = 0;
  uStack0000000000000094 = 0;
  _uStack00000000000000fc = 0x6a;
  iVar33 = _getpeername(uVar1,&uStack0000000000000080,&uStack00000000000000fc);
  uVar32 = uStack00000000000000e8;
  uVar31 = uStack00000000000000d4;
  uVar29 = uStack00000000000000cc;
  uVar27 = in_stack_000000c8;
  uVar25 = uStack00000000000000c4;
  uVar23 = uStack00000000000000bc;
  uVar21 = uStack00000000000000b4;
  uVar19 = uStack00000000000000ac;
  uVar17 = in_stack_000000a8;
  uVar15 = uStack00000000000000a4;
  uVar13 = uStack000000000000009c;
  uVar11 = in_stack_00000098;
  uVar9 = uStack0000000000000094;
  uVar7 = uStack000000000000008c;
  if (iVar33 == -1) {
    ___error();
  }
  else {
    uVar3 = CONCAT11(cStack0000000000000081,uStack0000000000000080);
    if (_uStack00000000000000fc == 0) {
      iVar33 = 2;
    }
    else {
      iVar33 = _uStack00000000000000fc;
      if (cStack0000000000000081 != '\x01') goto code_r0x00422af0;
    }
    uVar6 = CONCAT22(uStack00000000000000e2,in_stack_000000e0);
    uVar1 = CONCAT22(uStack00000000000000da,in_stack_000000d8);
    uStack00000000000000c4 = in_stack_000000c0;
    in_stack_000000c8 = uVar25;
    uStack00000000000000bc = in_stack_000000b8;
    in_stack_000000c0 = uVar23;
    uStack00000000000000d4 = in_stack_000000d0;
    in_stack_000000d8 = (undefined2)uVar31;
    uStack00000000000000da = (undefined2)(uVar31 >> 0x10);
    uStack00000000000000cc = uVar27;
    in_stack_000000d0 = uVar29;
    uStack00000000000000e8 = (undefined2)uStack00000000000000e4;
    uStack00000000000000ea = (undefined2)((uint)uStack00000000000000e4 >> 0x10);
    in_stack_000000e0 = (undefined2)uStack00000000000000dc;
    uStack00000000000000e2 = (undefined2)((uint)uStack00000000000000dc >> 0x10);
    uStack0000000000000094 = in_stack_00000090;
    in_stack_00000098 = uVar9;
    uStack000000000000008c = in_stack_00000088;
    in_stack_00000090 = uVar7;
    uStack00000000000000a4 = in_stack_000000a0;
    in_stack_000000a8 = uVar15;
    uStack000000000000009c = uVar11;
    in_stack_000000a0 = uVar13;
    in_stack_00000088 =
         (uint)uStack0000000000000084 | (uint)(((ulong)uStack0000000000000086 << 0x30) >> 0x20);
    in_stack_00000070 = CONCAT22(in_stack_00000070._2_2_,uVar32);
    uStack0000000000000086 = uStack0000000000000082;
    uStack0000000000000080 = (undefined1)iVar33;
    cStack0000000000000081 = (char)((uint)iVar33 >> 8);
    uStack0000000000000082 = (ushort)((uint)iVar33 >> 0x10);
    uStack00000000000000ec = in_stack_00000070;
    uStack00000000000000b4 = in_stack_000000b0;
    in_stack_000000b8 = uVar21;
    uStack00000000000000ac = uVar17;
    in_stack_000000b0 = uVar19;
    uStack0000000000000084 = uVar3;
    uStack00000000000000dc = uVar1;
    uStack00000000000000e4 = uVar6;
    func_0x004653b0();
  }
code_r0x00422af0:
  func_0x00465628();
  return;
}

