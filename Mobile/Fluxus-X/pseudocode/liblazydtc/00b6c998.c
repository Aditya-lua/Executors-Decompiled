/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b6c998
 */

void FUN_00b6c998(ulong *param_1,undefined8 *param_2)

{
  uint uVar1;
  uint uVar2;
  uint uVar3;
  uint uVar4;
  uint uVar5;
  uint uVar6;
  uint uVar7;
  uint uVar8;
  uint uVar9;
  uint uVar10;
  uint uVar11;
  long lVar12;
  ulong uVar13;
  ulong uVar14;
  long lVar15;
  undefined8 local_70;
  undefined8 uStack_68;
  undefined8 local_60;
  undefined8 uStack_58;
  undefined8 local_50;
  undefined8 uStack_48;
  undefined8 local_40;
  undefined8 uStack_38;
  long local_28;
  
  lVar12 = tpidr_el0;
  local_28 = *(long *)(lVar12 + 0x28);
  lVar15 = 10;
  local_60._0_4_ = (uint)param_1[2];
  local_60._4_4_ = (uint)(param_1[2] >> 0x20);
  uStack_58._0_4_ = (uint)param_1[3];
  uStack_58._4_4_ = (uint)(param_1[3] >> 0x20);
  uVar13 = *param_1 & 0xffffffff;
  local_70._4_4_ = (uint)(*param_1 >> 0x20);
  uVar14 = param_1[1] & 0xffffffff;
  uStack_68._4_4_ = (uint)(param_1[1] >> 0x20);
  local_40._0_4_ = (uint)param_1[6];
  local_40._4_4_ = (uint)(param_1[6] >> 0x20);
  uStack_38._0_4_ = (uint)param_1[7];
  uStack_38._4_4_ = (uint)(param_1[7] >> 0x20);
  local_50._0_4_ = (uint)param_1[4];
  local_50._4_4_ = (uint)(param_1[4] >> 0x20);
  uStack_48._0_4_ = (uint)param_1[5];
  uStack_48._4_4_ = (uint)(param_1[5] >> 0x20);
  do {
    uVar1 = (int)uVar13 + (uint)local_60;
    uVar2 = (int)uVar14 + (uint)uStack_58;
    local_40._0_4_ = (uint)local_40 ^ uVar1;
    local_40._4_4_ = local_40._4_4_ ^ local_70._4_4_ + local_60._4_4_;
    uStack_38._0_4_ = (uint)uStack_38 ^ uVar2;
    uStack_38._4_4_ = uStack_38._4_4_ ^ uStack_68._4_4_ + uStack_58._4_4_;
    uVar5 = (uint)local_40 >> 0x10 | (uint)local_40 << 0x10;
    uVar6 = local_40._4_4_ >> 0x10 | local_40._4_4_ << 0x10;
    uVar7 = (uint)uStack_38 >> 0x10 | (uint)uStack_38 << 0x10;
    uVar8 = uStack_38._4_4_ >> 0x10 | uStack_38._4_4_ << 0x10;
    local_50._0_4_ = uVar5 + (uint)local_50;
    local_50._4_4_ = uVar6 + local_50._4_4_;
    uStack_48._0_4_ = uVar7 + (uint)uStack_48;
    uStack_48._4_4_ = uVar8 + uStack_48._4_4_;
    local_60._0_4_ = (uint)local_50 ^ (uint)local_60;
    uVar3 = local_50._4_4_ ^ local_60._4_4_;
    uStack_58._0_4_ = (uint)uStack_48 ^ (uint)uStack_58;
    uVar4 = uStack_48._4_4_ ^ uStack_58._4_4_;
    uVar9 = (uint)local_60 >> 0x14 | (uint)local_60 << 0xc;
    uVar3 = uVar3 >> 0x14 | uVar3 << 0xc;
    uVar10 = (uint)uStack_58 >> 0x14 | (uint)uStack_58 << 0xc;
    uVar4 = uVar4 >> 0x14 | uVar4 << 0xc;
    uVar1 = uVar9 + uVar1;
    local_70._4_4_ = uVar3 + local_70._4_4_ + local_60._4_4_;
    uVar2 = uVar10 + uVar2;
    uStack_68._4_4_ = uVar4 + uStack_68._4_4_ + uStack_58._4_4_;
    uVar5 = uVar1 ^ uVar5;
    uVar6 = local_70._4_4_ ^ uVar6;
    uVar7 = uVar2 ^ uVar7;
    uVar8 = uStack_68._4_4_ ^ uVar8;
    uVar11 = uVar5 >> 0x18 | uVar5 << 8;
    uVar6 = uVar6 >> 0x18 | uVar6 << 8;
    uVar7 = uVar7 >> 0x18 | uVar7 << 8;
    uVar5 = uVar8 >> 0x18 | uVar8 << 8;
    local_50._0_4_ = uVar11 + (uint)local_50;
    local_50._4_4_ = uVar6 + local_50._4_4_;
    uStack_48._0_4_ = uVar7 + (uint)uStack_48;
    uStack_48._4_4_ = uVar5 + uStack_48._4_4_;
    uVar9 = (uint)local_50 ^ uVar9;
    uVar3 = local_50._4_4_ ^ uVar3;
    uVar10 = (uint)uStack_48 ^ uVar10;
    uVar4 = uStack_48._4_4_ ^ uVar4;
    uVar9 = uVar9 >> 0x19 | uVar9 << 7;
    uVar3 = uVar3 >> 0x19 | uVar3 << 7;
    uVar8 = uVar10 >> 0x19 | uVar10 << 7;
    uVar4 = uVar4 >> 0x19 | uVar4 << 7;
    uVar1 = uVar3 + uVar1;
    local_70._4_4_ = uVar8 + local_70._4_4_;
    uVar2 = uVar4 + uVar2;
    uStack_68._4_4_ = uStack_68._4_4_ + uVar9;
    uVar5 = uVar5 ^ uVar1;
    uVar11 = local_70._4_4_ ^ uVar11;
    uVar6 = uVar2 ^ uVar6;
    uVar7 = uStack_68._4_4_ ^ uVar7;
    uVar5 = uVar5 >> 0x10 | uVar5 << 0x10;
    uVar10 = uVar11 >> 0x10 | uVar11 << 0x10;
    uVar6 = uVar6 >> 0x10 | uVar6 << 0x10;
    uVar7 = uVar7 >> 0x10 | uVar7 << 0x10;
    uStack_48._0_4_ = uVar5 + (uint)uStack_48;
    uStack_48._4_4_ = uVar10 + uStack_48._4_4_;
    local_50._0_4_ = uVar6 + (uint)local_50;
    local_50._4_4_ = uVar7 + local_50._4_4_;
    uVar3 = (uint)uStack_48 ^ uVar3;
    uVar8 = uStack_48._4_4_ ^ uVar8;
    uVar4 = (uint)local_50 ^ uVar4;
    uVar9 = local_50._4_4_ ^ uVar9;
    uVar3 = uVar3 >> 0x14 | uVar3 << 0xc;
    uVar8 = uVar8 >> 0x14 | uVar8 << 0xc;
    uVar4 = uVar4 >> 0x14 | uVar4 << 0xc;
    uVar9 = uVar9 >> 0x14 | uVar9 << 0xc;
    uVar1 = uVar3 + uVar1;
    uVar13 = (ulong)uVar1;
    local_70._4_4_ = uVar8 + local_70._4_4_;
    uVar2 = uVar4 + uVar2;
    uVar14 = (ulong)uVar2;
    uStack_68._4_4_ = uVar9 + uStack_68._4_4_;
    uVar5 = uVar1 ^ uVar5;
    uVar10 = local_70._4_4_ ^ uVar10;
    uVar6 = uVar2 ^ uVar6;
    uVar7 = uStack_68._4_4_ ^ uVar7;
    uStack_38._4_4_ = uVar5 >> 0x18 | uVar5 << 8;
    local_40._0_4_ = uVar10 >> 0x18 | uVar10 << 8;
    local_40._4_4_ = uVar6 >> 0x18 | uVar6 << 8;
    uStack_38._0_4_ = uVar7 >> 0x18 | uVar7 << 8;
    uStack_48._0_4_ = uStack_38._4_4_ + (uint)uStack_48;
    uStack_48._4_4_ = (uint)local_40 + uStack_48._4_4_;
    local_50._0_4_ = local_40._4_4_ + (uint)local_50;
    local_50._4_4_ = (uint)uStack_38 + local_50._4_4_;
    uVar3 = (uint)uStack_48 ^ uVar3;
    uVar8 = uStack_48._4_4_ ^ uVar8;
    uVar4 = (uint)local_50 ^ uVar4;
    uVar9 = local_50._4_4_ ^ uVar9;
    lVar15 = lVar15 + -1;
    local_60._4_4_ = uVar3 >> 0x19 | uVar3 << 7;
    uStack_58._0_4_ = uVar8 >> 0x19 | uVar8 << 7;
    uStack_58._4_4_ = uVar4 >> 0x19 | uVar4 << 7;
    local_60._0_4_ = uVar9 >> 0x19 | uVar9 << 7;
  } while (lVar15 != 0);
  local_70 = CONCAT44(local_70._4_4_ + *(int *)((long)param_1 + 4),uVar1 + (int)*param_1);
  uStack_68 = CONCAT44(uStack_68._4_4_ + *(int *)((long)param_1 + 0xc),uVar2 + (int)param_1[1]);
  local_60 = CONCAT44(local_60._4_4_ + *(int *)((long)param_1 + 0x14),
                      (uint)local_60 + (int)param_1[2]);
  uStack_58 = CONCAT44(uStack_58._4_4_ + *(int *)((long)param_1 + 0x1c),
                       (uint)uStack_58 + (int)param_1[3]);
  local_50 = CONCAT44(local_50._4_4_ + *(int *)((long)param_1 + 0x24),
                      (uint)local_50 + (int)param_1[4]);
  uStack_48 = CONCAT44(uStack_48._4_4_ + *(int *)((long)param_1 + 0x2c),
                       (uint)uStack_48 + (int)param_1[5]);
  local_40 = CONCAT44(local_40._4_4_ + *(int *)((long)param_1 + 0x34),
                      (uint)local_40 + (int)param_1[6]);
  uStack_38 = CONCAT44(uStack_38._4_4_ + *(int *)((long)param_1 + 0x3c),
                       (uint)uStack_38 + (int)param_1[7]);
  param_2[5] = uStack_48;
  param_2[4] = local_50;
  param_2[3] = uStack_58;
  param_2[2] = local_60;
  param_2[7] = uStack_38;
  param_2[6] = local_40;
  param_2[1] = uStack_68;
  *param_2 = local_70;
  mbedtls_platform_zeroize(&local_70,0x40);
  if (*(long *)(lVar12 + 0x28) != local_28) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

