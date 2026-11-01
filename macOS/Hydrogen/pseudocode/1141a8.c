
bool FUN_001141a8(void)

{
  ushort uVar1;
  ushort uVar2;
  char cVar3;
  char cVar4;
  short sVar5;
  short sVar6;
  bool bVar7;
  bool bVar8;
  bool bVar9;
  byte bVar10;
  byte bVar11;
  int iVar12;
  int iVar13;
  long lVar14;
  ulong extraout_x1;
  segment_command *psVar15;
  undefined8 *puVar16;
  undefined8 uVar17;
  undefined8 uVar18;
  undefined8 uVar19;
  long lVar20;
  ulong uVar21;
  long lVar22;
  ulong uVar23;
  long unaff_x19;
  segment_command *unaff_x20;
  undefined4 *unaff_x21;
  undefined1 *puVar24;
  undefined4 unaff_w24;
  segment_command *unaff_x25;
  undefined8 *unaff_x26;
  long unaff_x27;
  float fVar25;
  undefined4 extraout_s0;
  double dVar26;
  float fVar27;
  double dVar28;
  segment_command *in_stack_00000000;
  undefined8 in_stack_00000008;
  undefined1 uStack0000000000000010;
  undefined8 uStack0000000000000050;
  long in_stack_00000058;
  
  iVar13 = unaff_x21[0x76d];
  if (iVar13 != in_stack_00000008._4_4_) {
    func_0x000c24fc();
  }
  *(undefined8 *)(*(long *)(unaff_x19 + 0x4000) + 0x110) = *unaff_x26;
  uStack0000000000000050 =
       CONCAT44((float)((ulong)unaff_x26[1] >> 0x20) - (float)((ulong)*unaff_x26 >> 0x20),
                (float)unaff_x26[1] - (float)*unaff_x26);
  puVar24 = &uStack0000000000000010;
  puVar16 = &uStack0000000000000050;
  psVar15 = &segment_command_00000020;
  uVar17 = 0x18000010;
  uVar18 = 0;
  uVar19 = 0;
  iVar12 = func_0x00119cac();
  if (iVar13 != in_stack_00000008._4_4_) {
    unaff_x21[0x76d] = *unaff_x21;
  }
  if (iVar12 == 0) {
    bVar9 = false;
    goto LAB_001143d0;
  }
  puVar24 = *(undefined1 **)(&UNK_009bae28 + unaff_x27 * 0x20);
  _memcpy(&uStack0000000000000050);
  func_0x00110318(&uStack0000000000000010);
  psVar15 = unaff_x25;
  if (in_stack_00000000 == (segment_command *)0x0 && unaff_x20 == (segment_command *)0x0)
  goto LAB_001143ac;
  psVar15 = unaff_x20;
  if ((in_stack_00000000 == (segment_command *)0x0) || (unaff_x20 == (segment_command *)0x0))
  goto LAB_0011439c;
  switch(unaff_w24) {
  case 0:
    cVar3 = (char)in_stack_00000000->cmd;
    cVar4 = (char)unaff_x20->cmd;
    bVar9 = cVar4 < cVar3;
    if (cVar3 < cVar4) break;
    goto code_r0x0011438c;
  case 1:
    bVar10 = (byte)in_stack_00000000->cmd;
    bVar11 = (byte)unaff_x20->cmd;
    bVar9 = bVar11 < bVar10;
    if (bVar11 <= bVar10) goto code_r0x0011438c;
    break;
  case 2:
    sVar5 = (short)in_stack_00000000->cmd;
    sVar6 = (short)unaff_x20->cmd;
    bVar9 = sVar6 < sVar5;
    if (sVar6 <= sVar5) goto code_r0x0011438c;
    break;
  case 3:
    uVar1 = (ushort)in_stack_00000000->cmd;
    uVar2 = (ushort)unaff_x20->cmd;
    bVar9 = uVar2 < uVar1;
    if (uVar2 <= uVar1) goto code_r0x0011438c;
    break;
  case 4:
    bVar9 = (int)unaff_x20->cmd < (int)in_stack_00000000->cmd;
    if ((int)unaff_x20->cmd <= (int)in_stack_00000000->cmd) goto code_r0x0011438c;
    break;
  case 5:
    bVar9 = unaff_x20->cmd < in_stack_00000000->cmd;
    if (unaff_x20->cmd <= in_stack_00000000->cmd) goto code_r0x0011438c;
    break;
  case 6:
    lVar20._0_4_ = in_stack_00000000->cmd;
    lVar20._4_4_ = in_stack_00000000->cmdsize;
    lVar14._0_4_ = unaff_x20->cmd;
    lVar14._4_4_ = unaff_x20->cmdsize;
    bVar9 = lVar14 < lVar20;
    if (lVar14 <= lVar20) goto code_r0x0011438c;
    break;
  case 7:
    uVar21._0_4_ = in_stack_00000000->cmd;
    uVar21._4_4_ = in_stack_00000000->cmdsize;
    uVar23._0_4_ = unaff_x20->cmd;
    uVar23._4_4_ = unaff_x20->cmdsize;
    bVar9 = uVar23 < uVar21;
    if (uVar23 <= uVar21) goto code_r0x0011438c;
    break;
  case 8:
    fVar25 = (float)in_stack_00000000->cmd;
    fVar27 = (float)unaff_x20->cmd;
    bVar9 = NAN(fVar25) || NAN(fVar27);
    bVar8 = fVar25 == fVar27;
    bVar7 = fVar25 < fVar27;
    goto code_r0x00114384;
  case 9:
    dVar26 = *(double *)in_stack_00000000;
    dVar28 = *(double *)unaff_x20;
    bVar7 = false;
    bVar8 = false;
    bVar9 = true;
    if (!NAN(dVar26) && !NAN(dVar28)) {
      bVar7 = dVar26 < dVar28;
      bVar8 = dVar26 == dVar28;
      bVar9 = false;
    }
code_r0x00114384:
    bVar9 = !bVar8 && bVar7 == bVar9;
    if (!bVar7) {
code_r0x0011438c:
      if (!bVar9) {
        in_stack_00000000 = unaff_x20;
      }
      psVar15 = in_stack_00000000;
    }
  }
LAB_0011439c:
  func_0x00110860();
LAB_001143ac:
  iVar13 = _memcmp(&uStack0000000000000050);
  bVar9 = iVar13 != 0;
  if (iVar13 != 0) {
    func_0x000c255c(in_stack_00000008._4_4_);
  }
LAB_001143d0:
  if (*(long *)PTR____stack_chk_guard_009b01e8 == in_stack_00000058) {
    return bVar9;
  }
  lVar14 = ___stack_chk_fail();
  lVar20 = lRam0000000000a334c0;
  lVar22 = *(long *)(lRam0000000000a334c0 + 0x4000);
  *(undefined1 *)(lVar22 + 0xc0) = 1;
  if (*(char *)(lVar22 + 0xc3) == '\0') {
    func_0x000d8a9c();
    func_0x000d4e10(lVar14);
    func_0x000d890c();
    func_0x000d876c(psVar15);
    iVar13 = (int)psVar15;
    if (iVar13 < 1) {
      bVar10 = 0;
    }
    else {
      lVar22 = *(long *)(&UNK_009bae28 +
                        (-(extraout_x1 >> 0x1f & 1) & 0xffffffe000000000 |
                        (extraout_x1 & 0xffffffff) << 5));
      func_0x000d505c(0);
      bVar10 = func_0x00113a24(extraout_s0,"",extraout_x1,puVar24,puVar16,uVar17,uVar18,uVar19);
      func_0x000d53d0();
      func_0x000d88dc();
      if (iVar13 != 1) {
        iVar12 = 1;
        do {
          puVar24 = puVar24 + lVar22;
          func_0x000d505c(iVar12);
          func_0x000d8444(0,*(undefined4 *)(&UNK_0000393c + lVar20));
          bVar11 = func_0x00113a24(extraout_s0,"",extraout_x1,puVar24,puVar16,uVar17,uVar18,uVar19);
          bVar10 = bVar10 | bVar11;
          func_0x000d53d0();
          func_0x000d88dc();
          iVar12 = iVar12 + 1;
        } while (iVar13 != iVar12);
      }
    }
    func_0x000d53d0();
    lVar22 = func_0x000bc0e8(lVar14,0);
    if (lVar22 != lVar14) {
      func_0x000d8444(0,*(undefined4 *)(&UNK_0000393c + lVar20));
      func_0x0010aa24(lVar14,lVar22,0);
    }
    func_0x000d818c();
  }
  else {
    bVar10 = 0;
  }
  return (bool)(bVar10 & 1);
}

