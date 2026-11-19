/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008e0fdc
 */

void blake3_hasher_finalize_seek(undefined8 *param_1,ulong param_2,void *param_3,ulong param_4)

{
  undefined8 *puVar1;
  size_t sVar2;
  long lVar3;
  byte bVar4;
  uint6 uVar5;
  undefined8 uVar6;
  ulong uVar7;
  ulong uVar8;
  long lVar9;
  undefined8 uVar10;
  undefined8 uVar11;
  undefined8 uVar12;
  undefined8 uVar13;
  undefined8 local_120;
  undefined8 uStack_118;
  undefined8 uStack_110;
  undefined8 uStack_108;
  undefined8 local_100;
  undefined8 local_f8;
  undefined8 uStack_f0;
  undefined8 local_e8;
  undefined8 uStack_e0;
  undefined8 local_d8;
  undefined8 uStack_d0;
  undefined8 local_c8;
  undefined8 uStack_c0;
  char local_b8;
  byte local_b7;
  undefined8 local_b0;
  undefined8 uStack_a8;
  undefined8 local_a0;
  undefined8 local_98;
  long local_68;
  
  lVar3 = tpidr_el0;
  local_68 = *(long *)(lVar3 + 0x28);
  if (param_4 == 0) goto LAB_008e13fc;
  uVar8 = (ulong)*(byte *)(param_1 + 0x12);
  if (uVar8 == 0) {
    uStack_118 = param_1[5];
    local_120 = param_1[4];
    uStack_108 = param_1[7];
    uStack_110 = param_1[6];
    uStack_f0 = param_1[10];
    local_f8 = param_1[9];
    local_b8 = *(char *)(param_1 + 0x11);
    uStack_e0 = param_1[0xc];
    local_e8 = param_1[0xb];
    uStack_d0 = param_1[0xe];
    local_d8 = param_1[0xd];
    uStack_c0 = param_1[0x10];
    local_c8 = param_1[0xf];
    uVar7 = param_2 & 0x3f;
    bVar4 = *(byte *)((long)param_1 + 0x8a) | *(char *)((long)param_1 + 0x89) == '\0';
    local_100 = param_1[8];
    uVar8 = param_2 >> 6;
    local_b7 = bVar4 | 2;
    if (uVar7 != 0) {
      blake3_compress_xof(&local_120,&local_f8,local_b8,uVar8,bVar4 | 10,&local_b0);
      sVar2 = param_4;
      if (0x40 - uVar7 <= param_4) {
        sVar2 = 0x40 - uVar7;
      }
      memcpy(param_3,(void *)((long)&local_b0 + uVar7),sVar2);
      param_3 = (void *)((long)param_3 + sVar2);
      param_4 = param_4 - sVar2;
      uVar8 = uVar8 + 1;
    }
    uVar7 = param_4 >> 6;
    if (0x3f < param_4) {
      blake3_xof_many(&local_120,&local_f8,local_b8,uVar8,local_b7 | 8,param_3,uVar7);
    }
  }
  else {
    local_b8 = *(char *)(param_1 + 0x11);
    if (local_b8 == '\0' && *(char *)((long)param_1 + 0x89) == '\0') {
      uVar8 = uVar8 - 2;
      uStack_118 = param_1[1];
      local_120 = *param_1;
      uStack_108 = param_1[3];
      uStack_110 = param_1[2];
      local_100 = 0;
      local_b8 = '@';
      uStack_e0 = *(undefined8 *)((long)param_1 + uVar8 * 0x20 + 0xa9);
      local_e8 = *(undefined8 *)((long)param_1 + uVar8 * 0x20 + 0xa1);
      uStack_f0 = *(undefined8 *)((long)param_1 + uVar8 * 0x20 + 0x99);
      local_f8 = *(undefined8 *)((long)param_1 + uVar8 * 0x20 + 0x91);
      uStack_d0 = *(undefined8 *)((long)param_1 + uVar8 * 0x20 + 0xb9);
      local_d8 = *(undefined8 *)((long)param_1 + uVar8 * 0x20 + 0xb1);
      uStack_c0 = *(undefined8 *)((long)param_1 + uVar8 * 0x20 + 0xc9);
      local_c8 = *(undefined8 *)((long)param_1 + uVar8 * 0x20 + 0xc1);
      local_b7 = *(byte *)((long)param_1 + 0x8a) | 4;
      if (uVar8 != 0) goto LAB_008e11d4;
    }
    else {
      uStack_118 = param_1[5];
      local_120 = param_1[4];
      uStack_108 = param_1[7];
      uStack_110 = param_1[6];
      uStack_f0 = param_1[10];
      local_f8 = param_1[9];
      local_100 = param_1[8];
      uStack_e0 = param_1[0xc];
      local_e8 = param_1[0xb];
      uStack_d0 = param_1[0xe];
      local_d8 = param_1[0xd];
      local_b7 = *(byte *)((long)param_1 + 0x8a) | *(char *)((long)param_1 + 0x89) == '\0' | 2;
      uStack_c0 = param_1[0x10];
      local_c8 = param_1[0xf];
LAB_008e11d4:
      lVar9 = uVar8 * 0x20 + 0x71;
      do {
        puVar1 = (undefined8 *)((long)param_1 + lVar9);
        uVar11 = puVar1[1];
        uVar10 = *puVar1;
        uVar13 = puVar1[3];
        uVar12 = puVar1[2];
        uVar8 = uVar8 - 1;
        uStack_a8 = uStack_118;
        local_b0 = local_120;
        local_98 = uStack_108;
        local_a0 = uStack_110;
        blake3_compress_in_place(&local_b0,&local_f8,local_b8,local_100);
        uStack_118 = param_1[1];
        local_120 = *param_1;
        uStack_108 = param_1[3];
        uStack_110 = param_1[2];
        lVar9 = lVar9 + -0x20;
        local_100 = 0;
        local_d8 = local_b0;
        uStack_d0._0_5_ = (uint5)uStack_a8 & 0xff000000ff;
        uStack_d0 = CONCAT53((uint5)uStack_d0 >> 0x18,(int3)uStack_a8) & 0xffffff00ff;
        uVar7 = uStack_d0;
        uStack_d0._0_4_ = CONCAT13((char)((ulong)uStack_a8 >> 0x18),(undefined3)uStack_d0);
        uStack_d0 = CONCAT17((char)((ulong)uStack_a8 >> 0x38),
                             CONCAT16((char)((ulong)uStack_a8 >> 0x30),
                                      CONCAT15((char)((ulong)uStack_a8 >> 0x28),(uint5)uStack_d0)));
        uStack_d0._0_2_ = CONCAT11((char)((ulong)uStack_a8 >> 8),(char)uVar7);
        local_c8._0_5_ = (uint5)local_a0 & 0xff000000ff;
        local_c8 = CONCAT53((uint5)local_c8 >> 0x18,(int3)local_a0) & 0xffffff00ff;
        local_c8._0_2_ = CONCAT11((char)((ulong)local_a0 >> 8),(undefined1)local_c8);
        uVar6 = local_c8;
        local_c8._0_6_ = CONCAT15((char)((ulong)local_a0 >> 0x28),(uint5)local_c8);
        uVar5 = (uint6)(undefined6)local_c8 >> 0x20;
        local_c8._0_4_ = CONCAT13((char)((ulong)local_a0 >> 0x18),(int3)uVar6);
        local_c8 = CONCAT17((char)((ulong)local_a0 >> 0x38),
                            CONCAT16((char)((ulong)local_a0 >> 0x30),
                                     CONCAT24((short)uVar5,(undefined4)local_c8)));
        local_b7 = *(byte *)((long)param_1 + 0x8a) | 4;
        uStack_c0 = local_98;
        local_b8 = '@';
        local_f8 = uVar10;
        uStack_f0 = uVar11;
        local_e8 = uVar12;
        uStack_e0 = uVar13;
      } while (uVar8 != 0);
    }
    local_b8 = 0x40;
    local_100 = 0;
    uVar8 = param_2 >> 6;
    param_2 = param_2 & 0x3f;
    if (param_2 != 0) {
      blake3_compress_xof(&local_120,&local_f8,0x40,uVar8,local_b7 | 8,&local_b0);
      sVar2 = param_4;
      if (0x40 - param_2 <= param_4) {
        sVar2 = 0x40 - param_2;
      }
      memcpy(param_3,(void *)((long)&local_b0 + param_2),sVar2);
      param_3 = (void *)((long)param_3 + sVar2);
      param_4 = param_4 - sVar2;
      uVar8 = uVar8 + 1;
    }
    uVar7 = param_4 >> 6;
    if (0x3f < param_4) {
      blake3_xof_many(&local_120,&local_f8,local_b8,uVar8,local_b7 | 8,param_3,uVar7);
    }
  }
  if ((param_4 & 0x3f) != 0) {
    blake3_compress_xof(&local_120,&local_f8,local_b8,uVar7 + uVar8,local_b7 | 8,&local_b0);
    memcpy((void *)((long)param_3 + (param_4 & 0xffffffffffffffc0)),&local_b0,param_4 & 0x3f);
  }
LAB_008e13fc:
  if (*(long *)(lVar3 + 0x28) != local_68) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

