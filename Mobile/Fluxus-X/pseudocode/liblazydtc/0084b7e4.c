/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0084b7e4
 */

byte FUN_0084b7e4(long param_1,long param_2,long param_3,undefined8 *param_4,uint param_5,
                 byte param_6)

{
  long lVar1;
  int iVar2;
  long lVar3;
  byte bVar4;
  undefined8 *puVar5;
  undefined8 *puVar6;
  bool bVar7;
  long *plVar8;
  void *pvVar9;
  undefined8 uVar10;
  long lVar11;
  long lVar12;
  ulong uVar13;
  ulong uVar14;
  undefined1 *puVar15;
  long *plVar16;
  ulong *puVar17;
  uint uVar18;
  long lVar19;
  undefined8 *local_170;
  undefined8 *local_168;
  undefined8 *local_160;
  undefined4 local_158;
  undefined4 uStack_154;
  undefined8 uStack_150;
  undefined8 uStack_148;
  undefined8 uStack_140;
  void *local_138;
  void *pvStack_130;
  long lStack_128;
  void *local_120;
  void *pvStack_118;
  long local_110;
  undefined5 uStack_108;
  undefined3 uStack_103;
  undefined5 uStack_100;
  long local_f8;
  long lStack_f0;
  undefined1 local_e8;
  ulong local_e0;
  undefined8 uStack_d8;
  undefined8 uStack_d0;
  undefined8 local_c8;
  void *pvStack_c0;
  void *local_b8;
  long lStack_b0;
  void *local_a8;
  void *pvStack_a0;
  long local_98;
  undefined5 uStack_90;
  undefined3 uStack_8b;
  undefined5 uStack_88;
  long local_78;
  
  lVar3 = tpidr_el0;
  local_78 = *(long *)(lVar3 + 0x28);
  lVar19 = *(long *)(param_1 + 0x28);
  local_170 = (undefined8 *)0x0;
  local_168 = (undefined8 *)0x0;
  local_160 = (undefined8 *)0x0;
  local_e0 = local_e0 & 0xffffffff00000000;
  uStack_d0 = 0;
  uStack_d8 = 0;
  pvStack_c0 = (void *)0x0;
  local_c8 = 0;
  lStack_b0 = 0;
  local_b8 = (void *)0x0;
  pvStack_a0 = (void *)0x0;
  local_a8 = (void *)0x0;
  uStack_90 = 0;
  local_98 = 0;
  uStack_8b = 0;
  uStack_88 = 0;
  if (lVar19 == 0) {
    bVar4 = 0;
  }
  else {
    local_e8 = 0;
    local_158 = 0;
    uStack_148 = 0;
    uStack_150 = 0;
    local_138 = (void *)0x0;
    uStack_140 = 0;
    lStack_128 = 0;
    pvStack_130 = (void *)0x0;
    pvStack_118 = (void *)0x0;
    local_120 = (void *)0x0;
    uStack_108 = 0;
    local_110 = 0;
    uStack_103 = 0;
    uStack_100 = 0;
                    /* try { // try from 0084b878 to 0084b887 has its CatchHandler @ 0084be0c */
    local_f8 = param_3;
    lStack_f0 = param_3;
    local_168 = (undefined8 *)FUN_008447a0(&local_170,&local_158);
    if (local_120 != (void *)0x0) {
      pvStack_118 = local_120;
      operator_delete(local_120,local_110 - (long)local_120);
    }
    if (local_138 != (void *)0x0) {
      pvStack_130 = local_138;
      operator_delete(local_138,lStack_128 - (long)local_138);
    }
    *(undefined4 *)(local_168 + -0xc) = 0;
    lVar11 = local_168[-8];
    local_168[-9] = param_3;
    lVar12 = local_168[-7] - lVar11 >> 3;
    local_168[-0xb] = param_2;
    local_168[-10] = param_2;
    uVar13 = (ulong)*(uint *)(param_1 + 0x1c);
    bVar7 = uVar13 < (ulong)(lVar12 * -0x5555555555555555);
    lVar12 = uVar13 + lVar12 * 0x5555555555555555;
    if (bVar7 || lVar12 == 0) {
      if (bVar7) {
        local_168[-7] = lVar11 + uVar13 * 0x18;
      }
    }
    else {
                    /* try { // try from 0084b900 to 0084b953 has its CatchHandler @ 0084be08 */
      FUN_00844b70(local_168 + -8,lVar12,&local_f8);
    }
    lVar12 = local_168[-5];
    uVar13 = (ulong)*(uint *)(param_1 + 0x20);
    uVar14 = local_168[-4] - lVar12 >> 4;
    if (uVar13 < uVar14 || uVar13 - uVar14 == 0) {
      if (uVar13 < uVar14) {
        local_168[-4] = lVar12 + uVar13 * 0x10;
      }
    }
    else {
      FUN_00844cfc(local_168 + -5,uVar13 - uVar14);
    }
    lVar12 = 0;
    bVar4 = 0;
    uVar18 = 0;
    local_168[-2] = lVar19;
    lVar19 = param_3 - param_2;
    *(uint *)(local_168 + -1) = param_5;
    *(byte *)((long)local_168 + -4) = param_6 & 1;
    do {
      puVar5 = local_168;
      uVar18 = uVar18 + 1;
      if (((uVar18 & 0xfff) == 0) && ((int)lVar19 <= (int)(uVar18 >> 0xc))) {
        if (*(long *)(lVar3 + 0x28) == local_78) {
                    /* try { // try from 0084bdec to 0084bdef has its CatchHandler @ 0084be2c */
          FUN_008444e8();
LAB_0084bdf0:
          if (*(long *)(lVar3 + 0x28) == local_78) {
                    /* try { // try from 0084be04 to 0084be07 has its CatchHandler @ 0084be10 */
            uVar10 = FUN_008446b4();
                    /* catch() { ... } // from try @ 0084b900 with catch @ 0084be08 */
                    /* catch() { ... } // from try @ 0084bdec with catch @ 0084be2c */
            FUN_00844494(&local_e0);
            FUN_00844700(&local_170);
            if (*(long *)(lVar3 + 0x28) == local_78) {
                    /* WARNING: Subroutine does not return */
              FUN_00c2c090(uVar10);
            }
          }
        }
        goto LAB_0084be5c;
      }
      plVar16 = local_168 + -2;
      plVar8 = (long *)*plVar16;
      puVar17 = local_168 + -0xc;
      if (plVar8 != (long *)0x0) {
                    /* try { // try from 0084b9e0 to 0084b9e7 has its CatchHandler @ 0084be28 */
        (**(code **)(*plVar8 + 0x10))(plVar8,puVar17);
      }
      puVar6 = local_168;
      iVar2 = (int)*puVar17;
      if (iVar2 < -0x3e1) {
        if (1 < iVar2 + 0x3e3U) {
          if (iVar2 != -1000) goto LAB_0084bdf0;
          if ((((param_5 >> 5 & 1) != 0) && (puVar5[-10] == param_2)) ||
             (((param_5 >> 0xc & 1) != 0 && (puVar5[-10] != param_3)))) goto LAB_0084ba40;
          lVar11 = puVar5[-0xb];
          lVar1 = puVar5[-10];
          if (!(bool)(bVar4 & lVar1 - lVar11 <= lVar12)) {
            uStack_d8 = puVar5[-0xb];
            local_e0 = *puVar17;
            local_c8 = puVar5[-9];
            uStack_d0 = puVar5[-10];
            if (&local_e0 != puVar17) {
                    /* try { // try from 0084bb6c to 0084bb8f has its CatchHandler @ 0084be28 */
              FUN_0084cf44(&pvStack_c0,puVar5[-8],puVar5[-7],
                           ((long)(puVar5[-7] - puVar5[-8]) >> 3) * -0x5555555555555555);
              FUN_0084d118(&local_a8,puVar5[-5],puVar5[-4],(long)(puVar5[-4] - puVar5[-5]) >> 4);
            }
            uStack_88 = (undefined5)((ulong)*(undefined8 *)((long)puVar5 + -0xb) >> 0x18);
            uStack_90 = (undefined5)*plVar16;
            uStack_8b = (undefined3)((ulong)*plVar16 >> 0x28);
            lVar12 = lVar1 - lVar11;
          }
          puVar5 = local_168;
          puVar6 = local_170;
          if (lVar12 == lVar19) {
            for (; puVar6 != puVar5; puVar5 = puVar5 + -0xc) {
              pvVar9 = (void *)puVar5[-5];
              if (pvVar9 != (void *)0x0) {
                puVar5[-4] = pvVar9;
                operator_delete(pvVar9,puVar5[-3] - (long)pvVar9);
              }
              pvVar9 = (void *)puVar5[-8];
              if (pvVar9 != (void *)0x0) {
                puVar5[-7] = pvVar9;
                operator_delete(pvVar9,puVar5[-6] - (long)pvVar9);
              }
            }
            local_168 = puVar6;
            bVar4 = 1;
            lVar12 = lVar19;
          }
          else {
            pvVar9 = (void *)local_168[-5];
            if (pvVar9 != (void *)0x0) {
              local_168[-4] = pvVar9;
              operator_delete(pvVar9,local_168[-3] - (long)pvVar9);
            }
            pvVar9 = (void *)puVar5[-8];
            if (pvVar9 != (void *)0x0) {
              puVar5[-7] = pvVar9;
              operator_delete(pvVar9,puVar5[-6] - (long)pvVar9);
            }
            local_168 = puVar5 + -0xc;
            bVar4 = 1;
          }
        }
      }
      else if (iVar2 == -0x3e1) {
LAB_0084ba40:
        pvVar9 = (void *)local_168[-5];
        if (pvVar9 != (void *)0x0) {
          local_168[-4] = pvVar9;
          operator_delete(pvVar9,local_168[-3] - (long)pvVar9);
        }
        pvVar9 = (void *)puVar6[-8];
        if (pvVar9 != (void *)0x0) {
          puVar6[-7] = pvVar9;
          operator_delete(pvVar9,puVar6[-6] - (long)pvVar9);
        }
        local_168 = puVar6 + -0xc;
      }
      else if (iVar2 == -0x3e0) {
                    /* try { // try from 0084ba80 to 0084ba8b has its CatchHandler @ 0084be14 */
        FUN_00844534(&local_158,puVar17);
                    /* try { // try from 0084ba98 to 0084babb has its CatchHandler @ 0084be18 */
        (**(code **)(*(long *)*plVar16 + 0x18))((long *)*plVar16,1,puVar17);
        (**(code **)(*(long *)CONCAT35(uStack_103,uStack_108) + 0x18))
                  ((long *)CONCAT35(uStack_103,uStack_108),0,&local_158);
        if (local_168 < local_160) {
          local_168[6] = 0;
          local_168[7] = 0;
          local_168[4] = 0;
          local_168[5] = 0;
          local_168[1] = uStack_150;
          *local_168 = CONCAT44(uStack_154,local_158);
          local_168[3] = uStack_140;
          local_168[2] = uStack_148;
          local_168[8] = 0;
          local_168[9] = 0;
          local_168[5] = pvStack_130;
          local_168[4] = local_138;
          local_138 = (void *)0x0;
          pvStack_130 = (void *)0x0;
          local_168[6] = lStack_128;
          local_168[8] = pvStack_118;
          local_168[7] = local_120;
          lStack_128 = 0;
          local_120 = (void *)0x0;
          local_168[9] = local_110;
          pvStack_118 = (void *)0x0;
          local_110 = 0;
          *(ulong *)((long)local_168 + 0x55) = CONCAT53(uStack_100,uStack_103);
          local_168[10] = CONCAT35(uStack_103,uStack_108);
          local_168 = local_168 + 0xc;
        }
        else {
                    /* try { // try from 0084bc10 to 0084bc1b has its CatchHandler @ 0084be18 */
          local_168 = (undefined8 *)FUN_008447a0(&local_170,&local_158);
          if (local_120 != (void *)0x0) {
            pvStack_118 = local_120;
            operator_delete(local_120,local_110 - (long)local_120);
          }
        }
        if (local_138 != (void *)0x0) {
          pvStack_130 = local_138;
          operator_delete(local_138,lStack_128 - (long)local_138);
        }
      }
      else if (iVar2 != -0x3df) goto LAB_0084bdf0;
    } while (local_170 != local_168);
    if (bVar4 != 0) {
      plVar8 = (long *)*param_4;
      *plVar8 = param_2;
      plVar8[1] = param_2 + lVar12;
      *(undefined1 *)(plVar8 + 2) = 1;
      if ((long)local_b8 - (long)pvStack_c0 != 0) {
        puVar15 = (undefined1 *)((long)pvStack_c0 + 0x10);
        uVar13 = 1;
        do {
          plVar16 = plVar8 + uVar13 * 3;
          lVar19 = *(long *)(puVar15 + -0x10);
          plVar16[1] = *(long *)(puVar15 + -8);
          *plVar16 = lVar19;
          *(undefined1 *)(plVar16 + 2) = *puVar15;
          bVar7 = uVar13 < (ulong)(((long)local_b8 - (long)pvStack_c0 >> 3) * -0x5555555555555555);
          puVar15 = puVar15 + 0x18;
          uVar13 = (ulong)((int)uVar13 + 1);
        } while (bVar7);
      }
    }
    if (local_a8 != (void *)0x0) {
      pvStack_a0 = local_a8;
      operator_delete(local_a8,local_98 - (long)local_a8);
    }
  }
  if (pvStack_c0 != (void *)0x0) {
    local_b8 = pvStack_c0;
    operator_delete(pvStack_c0,lStack_b0 - (long)pvStack_c0);
  }
  puVar6 = local_170;
  puVar5 = local_168;
  if (local_170 != (undefined8 *)0x0) {
    for (; puVar6 != puVar5; puVar5 = puVar5 + -0xc) {
      pvVar9 = (void *)puVar5[-5];
      if (pvVar9 != (void *)0x0) {
        puVar5[-4] = pvVar9;
        operator_delete(pvVar9,puVar5[-3] - (long)pvVar9);
      }
      pvVar9 = (void *)puVar5[-8];
      if (pvVar9 != (void *)0x0) {
        puVar5[-7] = pvVar9;
        operator_delete(pvVar9,puVar5[-6] - (long)pvVar9);
      }
    }
    local_168 = puVar6;
    operator_delete(local_170,(long)local_160 - (long)local_170);
  }
  if (*(long *)(lVar3 + 0x28) == local_78) {
    return bVar4;
  }
LAB_0084be5c:
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}

