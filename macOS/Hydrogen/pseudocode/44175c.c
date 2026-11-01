
void FUN_0044175c(ulong param_1)

{
  ulong uVar1;
  char *pcVar2;
  undefined4 *puVar3;
  long lVar4;
  ushort uVar5;
  uint uVar6;
  ulong uVar7;
  byte *pbVar8;
  ulong in_x9;
  ulong in_x10;
  uint uVar9;
  ulong uVar10;
  ulong *unaff_x19;
  long unaff_x20;
  ulong unaff_x21;
  ulong uVar11;
  ulong unaff_x22;
  uint *unaff_x23;
  ulong unaff_x24;
  ushort *puVar12;
  undefined *unaff_x26;
  undefined *puVar13;
  undefined4 uVar14;
  ulong unaff_x28;
  undefined8 in_stack_00000008;
  uint *in_stack_00000010;
  ulong in_stack_00000018;
  undefined8 uStack0000000000000020;
  ulong in_stack_00000028;
  ulong in_stack_00000030;
  undefined4 uStack0000000000000038;
  undefined *in_stack_00000040;
  ulong in_stack_00000048;
  undefined8 in_stack_000000a0;
  undefined8 in_stack_000000a8;
  
  while( true ) {
    unaff_x24 = unaff_x24 + 1;
    in_x9 = in_x9 - 1;
    if (param_1 == unaff_x24) break;
    while (unaff_x26[unaff_x24] == '.') {
      if (param_1 - 1 == unaff_x24) {
        puVar13 = &UNK_00888917;
        uVar10 = 0x20;
        goto code_r0x0044181c;
      }
      pcVar2 = unaff_x26 + unaff_x24 + 1;
      if (*pcVar2 == '#') {
        if (in_x10 == unaff_x24) {
code_r0x004418f0:
          puVar13 = &UNK_00888937;
          uVar10 = 0x23;
          goto code_r0x0044181c;
        }
        unaff_x22 = 0;
        pbVar8 = unaff_x26 + unaff_x24 + 2;
        do {
          uVar6 = *pbVar8 - 0x30;
          if (((9 < uVar6) ||
              (uVar10 = unaff_x22 * (unaff_x21 & 0xffffffff), (uVar10 & 0xffffffff00000000) != 0))
             || (uVar9 = (uint)uVar10, CARRY4(uVar9,uVar6))) goto code_r0x004418f0;
          unaff_x22 = (ulong)(uVar6 + uVar9);
          in_x9 = in_x9 - 1;
          pbVar8 = pbVar8 + 1;
        } while (in_x9 != 0);
        uVar14 = 1;
      }
      else {
        unaff_x21 = ~unaff_x24 + param_1;
        uVar14 = 2;
      }
      while( true ) {
        if (unaff_x28 == uStack0000000000000020) {
          func_0x0043e7ec(&uStack0000000000000020,&UNK_009dca88);
          in_stack_00000018 = in_stack_00000028;
        }
        uVar7 = in_stack_00000028;
        puVar3 = (undefined4 *)(in_stack_00000018 + unaff_x28 * 0x40);
        *puVar3 = uVar14;
        puVar3[1] = (int)unaff_x22;
        uVar1 = unaff_x28 + 1;
        *(undefined **)(puVar3 + 2) = unaff_x26;
        *(ulong *)(puVar3 + 4) = unaff_x24;
        *(char **)(puVar3 + 6) = pcVar2;
        *(ulong *)(puVar3 + 8) = unaff_x21;
        *(undefined8 *)(puVar3 + 10) = 0;
        puVar3[0xe] = (int)unaff_x28 + in_stack_00000008._4_4_;
        unaff_x21 = 10;
        in_stack_00000030 = uVar1;
        if (unaff_x23 == in_stack_00000010) {
          uVar11 = *(ulong *)(unaff_x20 + 0x40);
          if (*(ulong *)(unaff_x20 + 0x30) <= *(ulong *)(unaff_x20 + 0x40)) {
            uVar11 = *(ulong *)(unaff_x20 + 0x30);
          }
          if (uVar11 == 0) goto code_r0x004418c0;
          puVar12 = *(ushort **)(unaff_x20 + 0x38);
          goto code_r0x00441888;
        }
        unaff_x22 = (ulong)*unaff_x23;
        func_0x0044120c(&uStack0000000000000038);
        uVar10 = in_stack_00000048;
        puVar13 = in_stack_00000040;
        if ((uStack0000000000000038 & 1) != 0) goto code_r0x0044181c;
        unaff_x26 = in_stack_00000040;
        unaff_x28 = uVar1;
        if (in_stack_00000040 != (undefined *)0x0) break;
        uVar14 = 0;
        unaff_x23 = unaff_x23 + 1;
      }
      if (in_stack_00000048 == 0) goto LAB_00441810;
      in_x9 = in_stack_00000048 - 2;
      param_1 = in_stack_00000048;
      in_x10 = in_x9;
      unaff_x23 = unaff_x23 + 1;
      unaff_x24 = 0;
    }
  }
LAB_00441810:
  uVar10 = 0x25;
  puVar13 = &UNK_008888c4;
code_r0x0044181c:
  unaff_x19[1] = (ulong)puVar13;
  unaff_x19[2] = uVar10;
  *unaff_x19 = 0x8000000000000000;
  if (uStack0000000000000020 == 0) {
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(in_stack_00000028,uStack0000000000000020 << 6,8);
  return;
code_r0x00441888:
  uVar5 = *puVar12;
  func_0x00441424(&uStack0000000000000038);
  uVar10 = in_stack_00000048;
  puVar13 = in_stack_00000040;
  if ((uStack0000000000000038 & 1) != 0) goto code_r0x0044181c;
  if (uVar1 <= uVar5) {
    puVar13 = &UNK_0088899b;
    uVar10 = 0x19;
    goto code_r0x0044181c;
  }
  lVar4 = uVar7 + (ulong)uVar5 * 0x40;
  *(undefined **)(lVar4 + 0x28) = in_stack_00000040;
  *(ulong *)(lVar4 + 0x30) = in_stack_00000048;
  uVar11 = uVar11 - 1;
  puVar12 = puVar12 + 1;
  if (uVar11 == 0) {
code_r0x004418c0:
    unaff_x19[1] = in_stack_00000028;
    *unaff_x19 = uStack0000000000000020;
    unaff_x19[2] = in_stack_00000030;
    return;
  }
  goto code_r0x00441888;
}

