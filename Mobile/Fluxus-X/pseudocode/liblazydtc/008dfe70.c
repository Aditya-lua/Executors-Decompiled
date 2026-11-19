/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008dfe70
 */

ulong FUN_008dfe70(long param_1,ulong param_2,long *param_3,long param_4,uint param_5,long *param_6,
                  uint param_7)

{
  int iVar1;
  size_t __n;
  long lVar2;
  long lVar3;
  long lVar4;
  ulong uVar5;
  long *plVar6;
  ulong uVar7;
  void *__src;
  ulong uVar8;
  ulong uVar9;
  long lVar10;
  long local_1a0 [4];
  long local_180;
  long lStack_178;
  long lStack_170;
  long local_168;
  undefined8 uStack_160;
  undefined8 local_158;
  undefined8 uStack_150;
  undefined8 local_148;
  undefined8 uStack_140;
  byte local_138;
  char cStack_137;
  byte local_136;
  long local_120 [7];
  long local_e8;
  undefined8 uStack_e0;
  undefined8 local_d8;
  undefined8 uStack_d0;
  undefined8 local_c8;
  undefined8 uStack_c0;
  undefined1 local_b8;
  byte local_b7;
  ulong local_a8;
  undefined8 local_a0;
  long lStack_98;
  long lStack_90;
  undefined8 local_88;
  long local_78;
  
  lVar2 = tpidr_el0;
  local_78 = *(long *)(lVar2 + 0x28);
  lVar3 = blake3_simd_degree();
  if (param_2 <= (ulong)(lVar3 * 0x400)) {
    local_a8 = param_2 - 0x400;
    if (param_2 < 0x400) {
      uVar8 = 0;
      uVar9 = 0;
      uVar7 = param_2;
    }
    else {
      uVar9 = local_a8 >> 10;
      uVar8 = (local_a8 & 0xfffffffffffffc00) + 0x400;
      local_a8 = param_1 + (local_a8 & 0xfffffffffffffc00);
      uVar9 = uVar9 + 1;
      uVar7 = param_2 & 0x3ff;
    }
    blake3_hash_many(&local_a8,uVar9,0x10,param_3,param_4,1,param_5,1,2,param_6);
    if (uVar8 < param_2) {
      local_1a0[1] = param_3[1];
      local_1a0[0] = *param_3;
      local_1a0[3] = param_3[3];
      local_1a0[2] = param_3[2];
      local_180 = uVar9 + param_4;
      local_136 = (byte)param_5;
      __src = (void *)(param_1 + uVar8);
      lStack_170 = 0;
      lStack_178 = 0;
      uStack_160 = 0;
      local_168 = 0;
      uStack_150 = 0;
      local_158 = 0;
      uStack_140 = 0;
      local_148 = 0;
      local_138 = 0;
      cStack_137 = '\0';
      if (uVar7 < 0x41) {
        uVar8 = 0;
      }
      else {
        do {
          blake3_compress_in_place(local_1a0,__src,0x40,local_180,local_136 | cStack_137 == '\0');
          uVar7 = uVar7 - 0x40;
          __src = (void *)((long)__src + 0x40);
          cStack_137 = cStack_137 + '\x01';
        } while (0x40 < uVar7);
        uVar8 = (ulong)local_138;
      }
      lVar3 = local_180;
      __n = 0x40 - uVar8;
      if (uVar7 <= 0x40 - uVar8) {
        __n = uVar7;
      }
      memcpy((void *)((long)local_1a0 + uVar8 + 0x28),__src,__n);
      param_6 = param_6 + uVar9 * 4;
      local_120[1] = local_1a0[1];
      local_120[0] = local_1a0[0];
      local_120[3] = local_1a0[3];
      local_120[2] = local_1a0[2];
      iVar1 = (uint)local_138 + (int)__n;
      local_b8 = (undefined1)iVar1;
      _local_138 = CONCAT11(cStack_137,local_b8);
      uStack_e0 = uStack_160;
      local_e8 = local_168;
      local_120[6] = lStack_170;
      local_120[5] = lStack_178;
      local_b7 = local_136 | cStack_137 == '\0' | 2;
      uStack_d0 = uStack_150;
      local_d8 = local_158;
      uStack_c0 = uStack_140;
      local_c8 = local_148;
      lStack_98 = local_1a0[1];
      local_a0 = local_1a0[0];
      local_88 = local_1a0[3];
      lStack_90 = local_1a0[2];
      local_120[4] = lVar3;
      blake3_compress_in_place(&local_a0,local_120 + 5,iVar1,lVar3);
      uVar9 = uVar9 + 1;
      *(undefined4 *)param_6 = (undefined4)local_a0;
      *(undefined4 *)((long)param_6 + 4) = local_a0._4_4_;
      param_6[2] = lStack_90;
      param_6[1] = lStack_98;
      *(undefined4 *)(param_6 + 3) = (undefined4)local_88;
      *(undefined4 *)((long)param_6 + 0x1c) = local_88._4_4_;
    }
    goto LAB_008e022c;
  }
  uVar9 = LZCOUNT(param_2 - 1 >> 10 | 1);
  uVar8 = 0x400L << ((uVar9 ^ 0x3f) & 0x3f);
  lVar4 = blake3_simd_degree();
  lVar3 = 0x40;
  if (lVar4 != 1 || uVar9 == 0x3f) {
    lVar3 = lVar4 << 5;
  }
  lVar4 = FUN_008dfe70(param_1,uVar8,param_3,param_4,param_5,local_1a0,param_7 & 1);
  lVar3 = FUN_008dfe70(param_1 + uVar8,param_2 - uVar8,param_3,param_4 + (uVar8 >> 10),param_5,
                       (long)local_1a0 + lVar3,param_7 & 1);
  if (lVar4 == 1) {
    param_6[1] = local_1a0[1];
    *param_6 = local_1a0[0];
    param_6[3] = local_1a0[3];
    param_6[2] = local_1a0[2];
    param_6[5] = lStack_178;
    param_6[4] = local_180;
    param_6[7] = local_168;
    param_6[6] = lStack_170;
    uVar9 = 2;
    goto LAB_008e022c;
  }
  uVar8 = lVar3 + lVar4;
  if (uVar8 < 2) {
    uVar7 = 0;
    uVar5 = 0;
  }
  else {
    uVar7 = (uVar8 - 2 >> 1) + 1;
    if (uVar8 - 2 < 6) {
      uVar5 = 0;
LAB_008e01bc:
      plVar6 = local_1a0 + uVar5 * 8;
      do {
        local_120[uVar5] = (long)plVar6;
        uVar5 = uVar5 + 1;
        plVar6 = plVar6 + 8;
      } while (uVar7 != uVar5);
    }
    else {
      uVar5 = uVar7 & 0xfffffffffffffffc;
      plVar6 = local_120 + 2;
      uVar9 = uVar5;
      lVar3 = 0;
      lVar4 = 1;
      do {
        uVar9 = uVar9 - 4;
        plVar6[-1] = (long)(local_1a0 + lVar4 * 8);
        plVar6[-2] = (long)(local_1a0 + lVar3 * 8);
        plVar6[1] = (long)(local_120 + lVar4 * 8);
        *plVar6 = (long)(local_120 + lVar3 * 8);
        plVar6 = plVar6 + 4;
        lVar3 = lVar3 + 4;
        lVar4 = lVar4 + 4;
      } while (uVar9 != 0);
      if (uVar7 != uVar5) goto LAB_008e01bc;
    }
    uVar5 = uVar5 << 1;
  }
  blake3_hash_many(local_120,uVar7,1,param_3,0,0,param_5 | 4,0,0,param_6);
  uVar9 = uVar7;
  if (uVar5 < uVar8) {
    param_6 = param_6 + uVar7 * 4;
    uVar9 = uVar7 + 1;
    lVar3 = local_1a0[uVar7 * 8];
    lVar10 = local_1a0[uVar7 * 8 + 3];
    lVar4 = local_1a0[uVar7 * 8 + 2];
    param_6[1] = local_1a0[uVar7 * 8 + 1];
    *param_6 = lVar3;
    param_6[3] = lVar10;
    param_6[2] = lVar4;
  }
LAB_008e022c:
  if (*(long *)(lVar2 + 0x28) != local_78) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return uVar9;
}

