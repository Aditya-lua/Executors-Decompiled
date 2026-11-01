
long FUN_0060bf88(long param_1,long param_2)

{
  ulong *puVar1;
  ulong *puVar2;
  ulong uVar3;
  long lVar4;
  ulong uVar5;
  ulong uVar6;
  ulong uVar7;
  ulong uVar8;
  ulong uVar9;
  ulong uVar10;
  long lVar11;
  bool bVar12;
  byte *pbVar13;
  long unaff_x21;
  long lVar14;
  ulong uVar15;
  ulong in_stack_00000010;
  ulong in_stack_00000018;
  long in_stack_00000020;
  undefined8 uStack0000000000000030;
  ulong in_stack_00000040;
  ulong in_stack_00000048;
  long in_stack_00000050;
  
  uVar15 = *(ulong *)(param_2 + 0x18);
  if (uVar15 == *(ulong *)(param_1 + 0x30)) {
    lVar11 = unaff_x21 + 0x48;
    pbVar13 = *(byte **)(unaff_x21 + 0x68);
    lVar14 = *(long *)(unaff_x21 + 0x38);
    if (pbVar13 != *(byte **)(param_2 + 0x20)) {
      _memcpy(pbVar13,*(byte **)(param_2 + 0x20),uVar15 << 3);
    }
    if (uVar15 != 0) {
      if ((*pbVar13 & 1) != 0) {
        uVar7 = 0;
        uVar5 = 0;
        lVar4 = uVar15 - 1;
        do {
          puVar1 = (ulong *)(pbVar13 + uVar5 * 8);
          puVar2 = (ulong *)(lVar14 + uVar5 * 8);
          uVar8 = *puVar2;
          uVar3 = *puVar1;
          uVar10 = (ulong)CARRY8(uVar8 + uVar3,uVar7);
          *puVar1 = uVar8 + uVar3 + uVar7;
          uVar6 = puVar2[1];
          uVar9 = uVar6 + puVar1[1];
          uVar7 = (ulong)(CARRY8(uVar9,uVar10) || CARRY8(uVar9 + uVar10,(ulong)CARRY8(uVar8,uVar3)))
          ;
          if (CARRY8(uVar6,puVar1[1])) {
            uVar7 = uVar7 + 1;
          }
          puVar1[1] = uVar9 + uVar10 + (ulong)CARRY8(uVar8,uVar3);
          uVar5 = uVar5 + 2;
        } while (uVar5 < uVar15);
        uVar5 = 0;
        do {
          uVar9 = *(ulong *)(pbVar13 + uVar15 * 8 + -8);
          *(ulong *)(pbVar13 + uVar15 * 8 + -8) = uVar5 | uVar9 >> 1;
          uVar5 = uVar9 << 0x3f;
          uVar15 = uVar15 - 1;
        } while (uVar15 != 0);
        lVar4 = lVar4 * 8;
        *(ulong *)(pbVar13 + lVar4) = *(long *)(pbVar13 + lVar4) + (uVar7 << 0x3f);
        return lVar11;
      }
      uVar5 = 0;
      do {
        uVar7 = *(ulong *)(pbVar13 + uVar15 * 8 + -8);
        *(ulong *)(pbVar13 + uVar15 * 8 + -8) = uVar5 | uVar7 >> 1;
        uVar5 = uVar7 << 0x3f;
        uVar15 = uVar15 - 1;
      } while (uVar15 != 0);
    }
  }
  else {
    if ((uVar15 == 0) || ((**(byte **)(param_2 + 0x20) & 1) == 0)) {
      bVar12 = true;
      func_0x00609afc(&uStack0000000000000030,param_2,1);
    }
    else {
      func_0x006072ac(param_2,unaff_x21 + 0x18);
      func_0x00609afc(&uStack0000000000000030);
      bVar12 = false;
    }
    lVar11 = unaff_x21 + 0x78;
    func_0x005ffccc(lVar11,&uStack0000000000000030);
    uStack0000000000000030 = &UNK_009f5d60;
    uVar15 = in_stack_00000040;
    if (in_stack_00000048 <= in_stack_00000040) {
      uVar15 = in_stack_00000048;
    }
    if (in_stack_00000050 != 0) {
      if (uVar15 != 0) {
        do {
          *(undefined8 *)(in_stack_00000050 + -8 + uVar15 * 8) = 0;
          uVar15 = uVar15 - 1;
        } while (uVar15 != 0);
      }
      func_0x00611644();
    }
    if (!bVar12) {
      if (in_stack_00000018 <= in_stack_00000010) {
        in_stack_00000010 = in_stack_00000018;
      }
      if (in_stack_00000020 != 0) {
        if (in_stack_00000010 != 0) {
          do {
            *(undefined8 *)(in_stack_00000020 + -8 + in_stack_00000010 * 8) = 0;
            in_stack_00000010 = in_stack_00000010 - 1;
          } while (in_stack_00000010 != 0);
        }
        func_0x00611644();
      }
    }
  }
  return lVar11;
}

