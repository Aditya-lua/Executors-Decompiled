/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0087fe44
 */

void FUN_0087fe44(undefined8 param_1,undefined8 *param_2,undefined8 param_3,undefined8 *param_4)

{
  size_t __n;
  int *piVar1;
  char *pcVar2;
  char *pcVar3;
  int *piVar4;
  byte bVar5;
  long lVar6;
  bool bVar7;
  ulong *puVar8;
  undefined1 uVar9;
  int iVar10;
  uint uVar11;
  undefined4 uVar12;
  long lVar13;
  ulong uVar14;
  undefined1 *puVar15;
  ulong uVar16;
  ulong uVar17;
  ulong *puVar18;
  long *plVar19;
  undefined8 local_fb8;
  undefined8 local_fb0;
  undefined8 uStack_fa8;
  undefined8 local_fa0;
  undefined8 uStack_f98;
  undefined8 local_f90;
  undefined8 uStack_f88;
  undefined8 local_f80;
  undefined8 uStack_f78;
  undefined8 local_f70;
  undefined8 uStack_f68;
  ulong *local_f60;
  ulong *local_f58;
  ulong *local_f50;
  undefined1 local_f44 [4];
  undefined8 local_f40;
  undefined8 uStack_f38;
  undefined8 local_f30;
  undefined8 uStack_f28;
  undefined8 local_f20;
  undefined8 local_f18;
  undefined8 local_f10;
  long *plStack_f08;
  long *local_f00;
  undefined8 local_ef8;
  undefined8 local_ef0;
  undefined8 uStack_ee8;
  undefined1 local_edc [16];
  undefined1 local_ecc;
  undefined **local_ec8;
  byte *pbStack_ec0;
  byte *local_eb8;
  void *local_eb0;
  void *pvStack_ea8;
  long local_ea0;
  void *local_e98;
  void *local_e90;
  long lStack_e88;
  undefined1 local_e80;
  undefined **local_e08;
  ulong **local_e00;
  undefined2 local_df8;
  undefined1 auStack_df0 [216];
  long local_d18 [3];
  long local_d00;
  long local_cf8;
  long local_cf0;
  byte local_ce8;
  undefined1 auStack_ce0 [56];
  undefined1 auStack_ca8 [56];
  undefined1 auStack_c70 [56];
  undefined1 auStack_c38 [56];
  undefined1 auStack_c00 [56];
  undefined1 auStack_bc8 [56];
  undefined1 auStack_b90 [56];
  undefined1 auStack_b58 [56];
  undefined1 auStack_b20 [56];
  undefined1 auStack_ae8 [216];
  undefined1 auStack_a10 [608];
  undefined1 *local_7b0;
  undefined1 local_7a8;
  byte local_778;
  byte local_777 [1583];
  undefined1 auStack_148 [56];
  undefined1 auStack_110 [32];
  long local_f0 [3];
  long local_d8;
  long local_d0;
  long local_c8;
  byte local_c0;
  byte abStack_b8 [56];
  long local_80;
  long local_78;
  
  lVar6 = tpidr_el0;
  bVar7 = false;
  local_78 = *(long *)(lVar6 + 0x28);
  plStack_f08 = (long *)param_4[7];
  local_f10 = param_4[6];
  local_ef8 = param_4[9];
  local_f00 = (long *)param_4[8];
  uStack_ee8 = param_4[0xb];
  local_ef0 = param_4[10];
  pcVar2 = (char *)param_2[2];
  pcVar3 = (char *)param_2[3];
  local_f44[0] = 0;
  uStack_f38 = param_4[1];
  local_f40 = *param_4;
  uStack_f28 = param_4[3];
  local_f30 = param_4[2];
  local_f18 = param_4[5];
  local_f20 = param_4[4];
  for (; pcVar2 != pcVar3; pcVar2 = pcVar2 + 0x30) {
    if (*pcVar2 == '\x01') {
      bVar5 = pcVar2[0x18];
      uVar16 = *(ulong *)(pcVar2 + 0x20);
      piVar4 = *(int **)(pcVar2 + 0x28);
      uVar14 = (ulong)(bVar5 >> 1);
      piVar1 = (int *)(pcVar2 + 0x19);
      if ((bVar5 & 1) != 0) {
        uVar14 = uVar16;
        piVar1 = piVar4;
      }
      __n = uVar14;
      if (8 < uVar14) {
        __n = 9;
      }
      iVar10 = memcmp(piVar1,"optimize ",__n);
      if (iVar10 == 0 && 8 < uVar14) {
        uVar11 = atoi((char *)((long)piVar1 + 9));
        if (1 < (int)uVar11) {
          uVar11 = 2;
        }
        local_f40 = CONCAT44(local_f40._4_4_,uVar11 & ((int)uVar11 >> 0x1f ^ 0xffffffffU));
      }
      uVar14 = (ulong)(bVar5 >> 1);
      if ((bVar5 & 1) != 0) {
        uVar14 = uVar16;
      }
      if (uVar14 == 6) {
        piVar1 = (int *)(pcVar2 + 0x19);
        if ((bVar5 & 1) != 0) {
          piVar1 = piVar4;
        }
        if (*piVar1 == 0x6974616e && (short)piVar1[1] == 0x6576) {
          bVar7 = true;
          local_f40 = CONCAT44(local_f40._4_4_,2);
          uStack_f38 = CONCAT44(uStack_f38._4_4_,1);
          local_f44[0] = 1;
        }
      }
    }
  }
  local_e00 = &local_f60;
  local_e08 = &PTR_LAB_00c4a9f8;
  local_f60 = (ulong *)0x0;
  local_f58 = (ulong *)0x0;
  param_2 = (undefined8 *)*param_2;
  local_f50 = (ulong *)0x0;
  local_df8 = 0;
                    /* try { // try from 0087fedc to 0087fee3 has its CatchHandler @ 0088067c */
  local_f60 = operator_new(0x80);
  local_f50 = local_f60 + 0x10;
                    /* try { // try from 0087fef8 to 0087ff03 has its CatchHandler @ 00880674 */
  local_f58 = local_f60;
  (**(code **)*param_2)(param_2,&local_e08);
  if (local_df8._1_1_ == '\x01') {
    local_f40 = CONCAT44(local_f40._4_4_,2);
    uStack_f38 = CONCAT44(uStack_f38._4_4_,1);
  }
                    /* try { // try from 0087ff24 to 0087ff3b has its CatchHandler @ 0088066c */
  FUN_008806d4(auStack_df0,param_1,&local_f40,param_3);
                    /* try { // try from 0087ff44 to 00880057 has its CatchHandler @ 00880688 */
  FUN_008a8a7c(local_d18,param_3,local_f10);
  if (DAT_00d1f0a8 == '\x01') {
    FUN_008a8c90(local_d18,auStack_ce0,auStack_148,auStack_110,param_2);
  }
  else {
    FUN_008a8da8(local_d18,auStack_ce0,param_2);
  }
  if (0 < (int)local_f40) {
                    /* try { // try from 00880064 to 00880073 has its CatchHandler @ 00880660 */
    lVar13 = FUN_00853270(param_3,"getfenv");
                    /* try { // try from 00880078 to 00880087 has its CatchHandler @ 00880644 */
    if ((lVar13 != 0) || (lVar13 = FUN_00853270(param_3,"setfenv"), lVar13 != 0)) {
      pbStack_ec0 = &local_778;
      local_eb8 = local_777;
      local_ec8 = &PTR_LAB_00c4ac30;
                    /* try { // try from 008800b0 to 008800bb has its CatchHandler @ 00880658 */
      (**(code **)*param_2)(param_2,&local_ec8);
    }
    if (1 < (int)local_f40) {
      if (((local_778 & 1) == 0) && ((local_777[0] & 1) == 0)) {
        local_7b0 = auStack_bc8;
                    /* try { // try from 008800e4 to 008800f3 has its CatchHandler @ 00880640 */
        uVar14 = FUN_00853270(param_3,&DAT_002b8f61);
        if (uVar14 == 0) {
LAB_0088017c:
          if (local_f00 != (long *)0x0) {
            lVar13 = *local_f00;
            plVar19 = local_f00;
            while (lVar13 != 0) {
                    /* try { // try from 008801b4 to 008801bb has its CatchHandler @ 0088063c */
              uVar14 = FUN_00853270(param_3);
              if (uVar14 != 0) {
                if ((local_cf0 == 0) ||
                   (uVar16 = (uVar14 >> 4 ^ uVar14 >> 9) * -0x61c8864680b583eb >>
                             ((ulong)local_ce8 & 0x3f),
                   (*(ulong *)(local_d00 + (uVar16 >> 6) * 8) >> (uVar16 & 0x3f) & 1) == 0))
                goto LAB_00880224;
                while (*(ulong *)(local_d18[0] + uVar16 * 0x10) != uVar14) {
                  uVar16 = uVar16 + 1 & local_cf8 - 1U;
                  if ((*(ulong *)(local_d00 + (uVar16 >> 6) * 8) >> (uVar16 & 0x3f) & 1) == 0)
                  goto LAB_00880224;
                }
                if (*(int *)(local_d18[0] + uVar16 * 0x10 + 8) == 0) goto LAB_00880224;
              }
              plVar19 = plVar19 + 1;
              lVar13 = *plVar19;
            }
          }
        }
        else {
          if ((local_cf0 != 0) &&
             (uVar16 = (uVar14 >> 4 ^ uVar14 >> 9) * -0x61c8864680b583eb >>
                       ((ulong)local_ce8 & 0x3f),
             (*(ulong *)(local_d00 + (uVar16 >> 6) * 8) >> (uVar16 & 0x3f) & 1) != 0)) {
            do {
              if (*(ulong *)(local_d18[0] + uVar16 * 0x10) == uVar14) {
                if (*(int *)(local_d18[0] + uVar16 * 0x10 + 8) != 0) goto LAB_0088017c;
                break;
              }
              uVar16 = uVar16 + 1 & local_cf8 - 1U;
            } while ((*(ulong *)(local_d00 + (uVar16 >> 6) * 8) >> (uVar16 & 0x3f) & 1) != 0);
          }
LAB_00880224:
          local_7a8 = 1;
        }
      }
    }
    if (0 < (int)local_f40) {
                    /* try { // try from 0088023c to 008802af has its CatchHandler @ 00880688 */
      FUN_0087e324(auStack_bc8,local_d18,auStack_ce0,&local_f40,param_2,param_3);
      FUN_0089ba58(auStack_c38,auStack_ce0,param_2);
      FUN_0089c2cc(auStack_ca8,auStack_ce0,auStack_c70,local_7b0,local_7a8,(int)local_f18 == 1,
                   local_ef0,param_2,param_3,auStack_c38,0,0);
      FUN_008a2b74(auStack_c00,param_2);
    }
  }
  if (plStack_f08 != (long *)0x0) {
    lVar13 = *plStack_f08;
    plVar19 = plStack_f08;
    while (lVar13 != 0) {
                    /* try { // try from 008802d0 to 008802fb has its CatchHandler @ 00880690 */
      local_ec8 = (undefined **)FUN_00853270(param_3);
      if (local_ec8 != (undefined **)0x0) {
        uVar9 = FUN_0087635c(param_1);
        puVar15 = (undefined1 *)FUN_00880c1c(auStack_b90,&local_ec8);
        *puVar15 = uVar9;
      }
      plVar19 = plVar19 + 1;
      lVar13 = *plVar19;
    }
    if (0x100 < (ulong)((long)plVar19 - (long)plStack_f08)) {
      if (*(long *)(lVar6 + 0x28) == local_78) {
                    /* try { // try from 0088062c to 0088063b has its CatchHandler @ 0088065c */
                    /* WARNING: Subroutine does not return */
        FUN_0087fcd8((long)param_2 + 0xc,"Exceeded userdata type limit in the compilation options");
      }
      goto LAB_008806d0;
    }
  }
  if ((0 < (int)uStack_f38) || (1 < (int)local_f40)) {
                    /* try { // try from 00880340 to 00880367 has its CatchHandler @ 00880688 */
    FUN_008a4010(auStack_b58,auStack_b20,auStack_ae8,param_2,local_f20,auStack_b90,auStack_a10,
                 auStack_bc8,local_d18,local_ef8,param_1);
  }
  if (DAT_00d1ec80 == 1) {
    pbStack_ec0 = (byte *)local_f0;
    local_eb8 = abStack_b8;
    local_ec8 = &PTR_FUN_00c4ae68;
    pvStack_ea8 = (void *)0x0;
    local_eb0 = (void *)0x0;
    local_e98 = (void *)0x0;
    local_ea0 = 0;
    lStack_e88 = 0;
    local_e90 = (void *)0x0;
    local_e80 = 0;
                    /* try { // try from 008803b4 to 008803bf has its CatchHandler @ 00880648 */
    (**(code **)*param_2)(param_2,&local_ec8);
    local_ec8 = &PTR_FUN_00c4ae68;
    if (local_e98 != (void *)0x0) {
      local_e90 = local_e98;
      operator_delete(local_e98,lStack_e88 - (long)local_e98);
    }
    if (local_eb0 != (void *)0x0) {
      pvStack_ea8 = local_eb0;
      operator_delete(local_eb0,local_ea0 - (long)local_eb0);
    }
  }
  puVar8 = local_f58;
  if (local_f60 != local_f58) {
    puVar18 = local_f60;
LAB_00880434:
    uVar14 = *puVar18;
    local_ec8 = (undefined **)((ulong)local_ec8 & 0xffffffffffffff00);
    if ((((DAT_00d1ec80 & 1) != 0) && (local_c8 != 0)) &&
       (uVar16 = ((ulong)(uint)((int)uVar14 << 3) + 8 ^ uVar14 >> 0x20) * -0x622015f714c7d297,
       uVar16 = (uVar14 >> 0x20 ^ uVar16 >> 0x2f ^ uVar16) * -0x622015f714c7d297,
       uVar16 = (uVar16 ^ uVar16 >> 0x2f) * -0x6b622cb0470b6a63 >> ((ulong)local_c0 & 0x3f),
       (*(ulong *)(local_d8 + (uVar16 >> 6) * 8) >> (uVar16 & 0x3f) & 1) != 0)) {
      uVar17 = uVar16;
      do {
        if (*(ulong *)(local_f0[0] + uVar17 * 0x20) == uVar14) goto LAB_008804c8;
        uVar17 = uVar17 + 1 & local_d0 - 1U;
      } while ((*(ulong *)(local_d8 + (uVar17 >> 6) * 8) >> (uVar17 & 0x3f) & 1) != 0);
    }
    goto LAB_0088050c;
  }
LAB_00880540:
  local_f70 = 0;
  uStack_f68 = 0;
  local_f80 = 0;
  uStack_f78 = 0;
  local_f90 = 0;
  uStack_f88 = 0;
  local_fa0 = 0;
  uStack_f98 = 0;
  local_fb0 = 0;
  uStack_fa8 = 0;
  local_fb8 = 0;
  local_edc[0] = 0;
  local_ecc = 0;
                    /* try { // try from 00880560 to 0088059f has its CatchHandler @ 00880668 */
  FUN_0084efe4(&local_ec8,(long)param_2 + 0xc,&local_f70,&local_f80,&local_f90,0,&local_fa0,1,
               &local_fb0,param_2,0,&local_fb8,0,0,local_edc);
                    /* try { // try from 008805a0 to 008805b3 has its CatchHandler @ 00880664 */
  uVar12 = FUN_00880dc8(auStack_df0,&local_ec8,local_f44);
                    /* try { // try from 008805b4 to 008805c3 has its CatchHandler @ 00880684 */
  FUN_00874b7c(param_1,uVar12);
  FUN_00876c90(param_1);
  FUN_00881a10(auStack_df0);
  if (local_f60 != (ulong *)0x0) {
    local_f58 = local_f60;
    operator_delete(local_f60,(long)local_f50 - (long)local_f60);
  }
  if (*(long *)(lVar6 + 0x28) == local_78) {
    return;
  }
LAB_008806d0:
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
  while (uVar16 = uVar16 + 1 & local_d0 - 1U,
        (*(ulong *)(local_d8 + (uVar16 >> 6) * 8) >> (uVar16 & 0x3f) & 1) != 0) {
LAB_008804c8:
    if (*(ulong *)(local_f0[0] + uVar16 * 0x20) == uVar14) {
      lVar13 = local_f0[0] + uVar16 * 0x20;
      goto LAB_008804fc;
    }
  }
  lVar13 = 0;
LAB_008804fc:
  local_80 = 0;
  if (lVar13 != 0) {
    local_80 = lVar13 + 8;
  }
LAB_0088050c:
                    /* try { // try from 0088050c to 00880517 has its CatchHandler @ 0088068c */
  FUN_00880dc8(auStack_df0,uVar14,&local_ec8);
  if (DAT_00d1ec80 == 1) {
    local_80 = 0;
  }
  if ((((byte)local_ec8 >> 2 & 1) != 0) && (!bVar7)) {
    local_f44[0] = bVar7;
  }
  puVar18 = puVar18 + 1;
  if (puVar18 == puVar8) goto LAB_00880540;
  goto LAB_00880434;
}

