/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00baddd4
 */

undefined8 mbedtls_internal_sha512_process(long param_1,ulong *param_2)

{
  long lVar1;
  long lVar2;
  long lVar3;
  long lVar4;
  ulong uVar5;
  ulong *puVar6;
  long *plVar7;
  ulong uVar8;
  long local_2f8;
  long lStack_2f0;
  ulong local_2e8;
  ulong local_2e0 [79];
  ulong local_68;
  ulong uStack_60;
  ulong local_58;
  ulong uStack_50;
  ulong local_48;
  ulong uStack_40;
  ulong local_38;
  ulong uStack_30;
  long local_28;
  
  lVar3 = tpidr_el0;
  local_28 = *(long *)(lVar3 + 0x28);
  uStack_30 = *(ulong *)(param_1 + 0x48);
  local_38 = *(ulong *)(param_1 + 0x40);
  uStack_40 = *(ulong *)(param_1 + 0x38);
  local_48 = *(ulong *)(param_1 + 0x30);
  uStack_50 = *(ulong *)(param_1 + 0x28);
  local_58 = *(ulong *)(param_1 + 0x20);
  uStack_60 = *(ulong *)(param_1 + 0x18);
  local_68 = *(ulong *)(param_1 + 0x10);
  uVar8 = (*param_2 & 0xff00ff00ff00ff00) >> 8 | (*param_2 & 0xff00ff00ff00ff) << 8;
  uVar8 = (uVar8 & 0xffff0000ffff0000) >> 0x10 | (uVar8 & 0xffff0000ffff) << 0x10;
  uVar5 = uVar8 >> 0x20 | uVar8 << 0x20;
  uVar8 = (param_2[1] & 0xff00ff00ff00ff00) >> 8 | (param_2[1] & 0xff00ff00ff00ff) << 8;
  uVar8 = (uVar8 & 0xffff0000ffff0000) >> 0x10 | (uVar8 & 0xffff0000ffff) << 0x10;
  local_2e8 = uVar5;
  local_2e0[0] = uVar8 >> 0x20 | uVar8 << 0x20;
  uVar8 = (param_2[2] & 0xff00ff00ff00ff00) >> 8 | (param_2[2] & 0xff00ff00ff00ff) << 8;
  uVar8 = (uVar8 & 0xffff0000ffff0000) >> 0x10 | (uVar8 & 0xffff0000ffff) << 0x10;
  local_2e0[1] = uVar8 >> 0x20 | uVar8 << 0x20;
  uVar8 = (param_2[3] & 0xff00ff00ff00ff00) >> 8 | (param_2[3] & 0xff00ff00ff00ff) << 8;
  uVar8 = (uVar8 & 0xffff0000ffff0000) >> 0x10 | (uVar8 & 0xffff0000ffff) << 0x10;
  local_2e0[2] = uVar8 >> 0x20 | uVar8 << 0x20;
  uVar8 = (param_2[4] & 0xff00ff00ff00ff00) >> 8 | (param_2[4] & 0xff00ff00ff00ff) << 8;
  uVar8 = (uVar8 & 0xffff0000ffff0000) >> 0x10 | (uVar8 & 0xffff0000ffff) << 0x10;
  local_2e0[3] = uVar8 >> 0x20 | uVar8 << 0x20;
  uVar8 = (param_2[5] & 0xff00ff00ff00ff00) >> 8 | (param_2[5] & 0xff00ff00ff00ff) << 8;
  uVar8 = (uVar8 & 0xffff0000ffff0000) >> 0x10 | (uVar8 & 0xffff0000ffff) << 0x10;
  local_2e0[4] = uVar8 >> 0x20 | uVar8 << 0x20;
  uVar8 = (param_2[6] & 0xff00ff00ff00ff00) >> 8 | (param_2[6] & 0xff00ff00ff00ff) << 8;
  uVar8 = (uVar8 & 0xffff0000ffff0000) >> 0x10 | (uVar8 & 0xffff0000ffff) << 0x10;
  local_2e0[5] = uVar8 >> 0x20 | uVar8 << 0x20;
  uVar8 = (param_2[7] & 0xff00ff00ff00ff00) >> 8 | (param_2[7] & 0xff00ff00ff00ff) << 8;
  uVar8 = (uVar8 & 0xffff0000ffff0000) >> 0x10 | (uVar8 & 0xffff0000ffff) << 0x10;
  local_2e0[6] = uVar8 >> 0x20 | uVar8 << 0x20;
  uVar8 = (param_2[8] & 0xff00ff00ff00ff00) >> 8 | (param_2[8] & 0xff00ff00ff00ff) << 8;
  uVar8 = (uVar8 & 0xffff0000ffff0000) >> 0x10 | (uVar8 & 0xffff0000ffff) << 0x10;
  local_2e0[7] = uVar8 >> 0x20 | uVar8 << 0x20;
  uVar8 = (param_2[9] & 0xff00ff00ff00ff00) >> 8 | (param_2[9] & 0xff00ff00ff00ff) << 8;
  uVar8 = (uVar8 & 0xffff0000ffff0000) >> 0x10 | (uVar8 & 0xffff0000ffff) << 0x10;
  local_2e0[8] = uVar8 >> 0x20 | uVar8 << 0x20;
  uVar8 = (param_2[10] & 0xff00ff00ff00ff00) >> 8 | (param_2[10] & 0xff00ff00ff00ff) << 8;
  uVar8 = (uVar8 & 0xffff0000ffff0000) >> 0x10 | (uVar8 & 0xffff0000ffff) << 0x10;
  local_2e0[9] = uVar8 >> 0x20 | uVar8 << 0x20;
  uVar8 = (param_2[0xb] & 0xff00ff00ff00ff00) >> 8 | (param_2[0xb] & 0xff00ff00ff00ff) << 8;
  uVar8 = (uVar8 & 0xffff0000ffff0000) >> 0x10 | (uVar8 & 0xffff0000ffff) << 0x10;
  local_2e0[10] = uVar8 >> 0x20 | uVar8 << 0x20;
  uVar8 = (param_2[0xc] & 0xff00ff00ff00ff00) >> 8 | (param_2[0xc] & 0xff00ff00ff00ff) << 8;
  uVar8 = (uVar8 & 0xffff0000ffff0000) >> 0x10 | (uVar8 & 0xffff0000ffff) << 0x10;
  local_2e0[0xb] = uVar8 >> 0x20 | uVar8 << 0x20;
  uVar8 = (param_2[0xd] & 0xff00ff00ff00ff00) >> 8 | (param_2[0xd] & 0xff00ff00ff00ff) << 8;
  uVar8 = (uVar8 & 0xffff0000ffff0000) >> 0x10 | (uVar8 & 0xffff0000ffff) << 0x10;
  local_2e0[0xc] = uVar8 >> 0x20 | uVar8 << 0x20;
  uVar8 = (param_2[0xe] & 0xff00ff00ff00ff00) >> 8 | (param_2[0xe] & 0xff00ff00ff00ff) << 8;
  uVar8 = (uVar8 & 0xffff0000ffff0000) >> 0x10 | (uVar8 & 0xffff0000ffff) << 0x10;
  local_2e0[0xd] = uVar8 >> 0x20 | uVar8 << 0x20;
  uVar8 = (param_2[0xf] & 0xff00ff00ff00ff00) >> 8 | (param_2[0xf] & 0xff00ff00ff00ff) << 8;
  uVar8 = (uVar8 & 0xffff0000ffff0000) >> 0x10 | (uVar8 & 0xffff0000ffff) << 0x10;
  local_2e0[0xe] = uVar8 >> 0x20 | uVar8 << 0x20;
  lVar4 = 0;
  do {
    uVar8 = *(ulong *)((long)local_2e0 + lVar4 + 0x68);
    lVar1 = lVar4 + 8;
    lVar2 = uVar5 + *(long *)((long)local_2e0 + lVar4 + 0x40);
    uVar5 = *(ulong *)((long)local_2e0 + lVar4);
    *(ulong *)((long)local_2e0 + lVar4 + 0x78) =
         lVar2 + ((uVar8 >> 0x3d | uVar8 << 3) ^ uVar8 >> 6 ^ (uVar8 >> 0x13 | uVar8 << 0x2d)) +
         ((uVar5 >> 8 | uVar5 << 0x38) ^ uVar5 >> 7 ^ (uVar5 >> 1 | uVar5 << 0x3f));
    lVar4 = lVar1;
  } while (lVar1 != 0x200);
  uVar8 = 0;
  puVar6 = local_2e0 + 2;
  plVar7 = &DAT_00788788;
  do {
    lVar4 = plVar7[-4] + uStack_30 +
            ((local_48 >> 0xe | local_48 << 0x32) ^ (local_48 >> 0x12 | local_48 << 0x2e) ^
            (local_48 >> 0x29 | local_48 << 0x17)) + puVar6[-3] +
            ((uStack_40 ^ local_38) & local_48 ^ local_38);
    uStack_50 = uStack_50 + lVar4;
    uStack_30 = ((local_68 >> 0x1c | local_68 << 0x24) ^ (local_68 >> 0x22 | local_68 << 0x1e) ^
                (local_68 >> 0x27 | local_68 << 0x19)) +
                (local_58 & (uStack_60 | local_68) | uStack_60 & local_68) + lVar4;
    lVar4 = (uStack_50 & (uStack_40 ^ local_48) ^ uStack_40) + local_38 + plVar7[-3] + puVar6[-2] +
            ((uStack_50 >> 0xe | uStack_50 << 0x32) ^ (uStack_50 >> 0x12 | uStack_50 << 0x2e) ^
            (uStack_50 >> 0x29 | uStack_50 * 0x800000));
    local_58 = lVar4 + local_58;
    local_38 = lVar4 + ((uStack_30 >> 0x1c | uStack_30 << 0x24) ^
                        (uStack_30 >> 0x22 | uStack_30 * 0x40000000) ^
                       (uStack_30 >> 0x27 | uStack_30 * 0x2000000)) +
                       ((uStack_30 | local_68) & uStack_60 | uStack_30 & local_68);
    lVar4 = plVar7[-2] + uStack_40 + puVar6[-1] + (local_58 & (uStack_50 ^ local_48) ^ local_48) +
            ((local_58 >> 0xe | local_58 << 0x32) ^ (local_58 >> 0x12 | local_58 << 0x2e) ^
            (local_58 >> 0x29 | local_58 * 0x800000));
    uStack_60 = lVar4 + uStack_60;
    uStack_40 = lVar4 + ((local_38 >> 0x1c | local_38 << 0x24) ^
                         (local_38 >> 0x22 | local_38 * 0x40000000) ^
                        (local_38 >> 0x27 | local_38 * 0x2000000)) +
                        ((local_38 | uStack_30) & local_68 | local_38 & uStack_30);
    lVar4 = plVar7[-1] + local_48 + *puVar6 + (uStack_60 & (local_58 ^ uStack_50) ^ uStack_50) +
            ((uStack_60 >> 0xe | uStack_60 << 0x32) ^ (uStack_60 >> 0x12 | uStack_60 << 0x2e) ^
            (uStack_60 >> 0x29 | uStack_60 * 0x800000));
    local_68 = lVar4 + local_68;
    local_48 = lVar4 + ((uStack_40 >> 0x1c | uStack_40 << 0x24) ^
                        (uStack_40 >> 0x22 | uStack_40 * 0x40000000) ^
                       (uStack_40 >> 0x27 | uStack_40 * 0x2000000)) +
                       ((uStack_40 | local_38) & uStack_30 | uStack_40 & local_38);
    lVar4 = *plVar7 + uStack_50 + puVar6[1] + (local_68 & (uStack_60 ^ local_58) ^ local_58) +
            ((local_68 >> 0xe | local_68 << 0x32) ^ (local_68 >> 0x12 | local_68 << 0x2e) ^
            (local_68 >> 0x29 | local_68 * 0x800000));
    uStack_30 = lVar4 + uStack_30;
    uStack_50 = lVar4 + ((local_48 >> 0x1c | local_48 << 0x24) ^
                         (local_48 >> 0x22 | local_48 * 0x40000000) ^
                        (local_48 >> 0x27 | local_48 * 0x2000000)) +
                        ((local_48 | uStack_40) & local_38 | local_48 & uStack_40);
    uVar8 = uVar8 + 8;
    lVar4 = plVar7[1] + local_58 + puVar6[2] + (uStack_30 & (local_68 ^ uStack_60) ^ uStack_60) +
            ((uStack_30 >> 0xe | uStack_30 << 0x32) ^ (uStack_30 >> 0x12 | uStack_30 << 0x2e) ^
            (uStack_30 >> 0x29 | uStack_30 * 0x800000));
    local_38 = lVar4 + local_38;
    local_58 = lVar4 + ((uStack_50 >> 0x1c | uStack_50 << 0x24) ^
                        (uStack_50 >> 0x22 | uStack_50 * 0x40000000) ^
                       (uStack_50 >> 0x27 | uStack_50 * 0x2000000)) +
                       ((uStack_50 | local_48) & uStack_40 | uStack_50 & local_48);
    lVar4 = plVar7[2] + uStack_60 + puVar6[3] + (local_38 & (uStack_30 ^ local_68) ^ local_68) +
            ((local_38 >> 0xe | local_38 << 0x32) ^ (local_38 >> 0x12 | local_38 << 0x2e) ^
            (local_38 >> 0x29 | local_38 * 0x800000));
    uStack_40 = lVar4 + uStack_40;
    uStack_60 = lVar4 + ((local_58 >> 0x1c | local_58 << 0x24) ^
                         (local_58 >> 0x22 | local_58 * 0x40000000) ^
                        (local_58 >> 0x27 | local_58 * 0x2000000)) +
                        ((local_58 | uStack_50) & local_48 | local_58 & uStack_50);
    lStack_2f0 = ((uStack_60 >> 0x1c | uStack_60 << 0x24) ^
                  (uStack_60 >> 0x22 | uStack_60 * 0x40000000) ^
                 (uStack_60 >> 0x27 | uStack_60 * 0x2000000)) +
                 ((uStack_60 | local_58) & uStack_50 | uStack_60 & local_58);
    local_2f8 = plVar7[3] + local_68 + puVar6[4] + (uStack_40 & (local_38 ^ uStack_30) ^ uStack_30)
                + ((uStack_40 >> 0xe | uStack_40 << 0x32) ^ (uStack_40 >> 0x12 | uStack_40 << 0x2e)
                  ^ (uStack_40 >> 0x29 | uStack_40 * 0x800000));
    puVar6 = puVar6 + 8;
    local_48 = local_2f8 + local_48;
    local_68 = local_2f8 + lStack_2f0;
    plVar7 = plVar7 + 8;
  } while (uVar8 < 0x50);
  *(ulong *)(param_1 + 0x10) = *(long *)(param_1 + 0x10) + local_68;
  *(ulong *)(param_1 + 0x18) = *(long *)(param_1 + 0x18) + uStack_60;
  *(ulong *)(param_1 + 0x30) = *(long *)(param_1 + 0x30) + local_48;
  *(ulong *)(param_1 + 0x38) = *(long *)(param_1 + 0x38) + uStack_40;
  *(ulong *)(param_1 + 0x20) = *(long *)(param_1 + 0x20) + local_58;
  *(ulong *)(param_1 + 0x28) = *(long *)(param_1 + 0x28) + uStack_50;
  *(ulong *)(param_1 + 0x40) = *(long *)(param_1 + 0x40) + local_38;
  *(ulong *)(param_1 + 0x48) = *(long *)(param_1 + 0x48) + uStack_30;
  mbedtls_platform_zeroize(&local_2f8,0x2d0);
  if (*(long *)(lVar3 + 0x28) != local_28) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return 0;
}

