/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00843df0
 */

undefined8
FUN_00843df0(long param_1,long param_2,long param_3,undefined8 *param_4,uint param_5,byte param_6)

{
  int iVar1;
  long lVar2;
  undefined8 *puVar3;
  bool bVar4;
  long *plVar5;
  void *pvVar6;
  undefined8 uVar7;
  long lVar8;
  long lVar9;
  ulong uVar10;
  ulong uVar11;
  undefined1 *puVar12;
  long *plVar13;
  undefined8 *puVar14;
  int *piVar15;
  long lVar16;
  uint uVar17;
  undefined8 *local_f8;
  undefined8 *local_f0;
  undefined8 *local_e8;
  undefined4 local_e0;
  undefined4 uStack_dc;
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
  long local_80;
  long lStack_78;
  undefined1 local_70;
  long local_68;
  
  lVar2 = tpidr_el0;
  local_68 = *(long *)(lVar2 + 0x28);
  lVar16 = *(long *)(param_1 + 0x28);
  local_f8 = (undefined8 *)0x0;
  local_f0 = (undefined8 *)0x0;
  local_e8 = (undefined8 *)0x0;
  if (lVar16 == 0) {
    uVar7 = 0;
  }
  else {
    local_70 = 0;
    local_e0 = 0;
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
                    /* try { // try from 00843e6c to 00843e77 has its CatchHandler @ 00844270 */
    local_80 = param_3;
    lStack_78 = param_3;
    local_f0 = (undefined8 *)FUN_008447a0(&local_f8,&local_e0);
    if (local_a8 != (void *)0x0) {
      pvStack_a0 = local_a8;
      operator_delete(local_a8,local_98 - (long)local_a8);
    }
    if (pvStack_c0 != (void *)0x0) {
      local_b8 = pvStack_c0;
      operator_delete(pvStack_c0,lStack_b0 - (long)pvStack_c0);
    }
    *(undefined4 *)(local_f0 + -0xc) = 0;
    lVar8 = local_f0[-8];
    local_f0[-0xb] = param_2;
    local_f0[-10] = param_2;
    local_f0[-9] = param_3;
    lVar9 = local_f0[-7] - lVar8 >> 3;
    uVar10 = (ulong)*(uint *)(param_1 + 0x1c);
    bVar4 = uVar10 < (ulong)(lVar9 * -0x5555555555555555);
    lVar9 = uVar10 + lVar9 * 0x5555555555555555;
    if (bVar4 || lVar9 == 0) {
      if (bVar4) {
        local_f0[-7] = lVar8 + uVar10 * 0x18;
      }
    }
    else {
                    /* try { // try from 00843eec to 00843f33 has its CatchHandler @ 0084426c */
      FUN_00844b70(local_f0 + -8,lVar9,&local_80);
    }
    lVar9 = local_f0[-5];
    uVar10 = (ulong)*(uint *)(param_1 + 0x20);
    uVar11 = local_f0[-4] - lVar9 >> 4;
    if (uVar10 < uVar11 || uVar10 - uVar11 == 0) {
      if (uVar10 < uVar11) {
        local_f0[-4] = lVar9 + uVar10 * 0x10;
      }
    }
    else {
      FUN_00844cfc(local_f0 + -5,uVar10 - uVar11);
    }
    local_f0[-2] = lVar16;
    lVar16 = param_3 - param_2;
    uVar17 = 1;
    *(uint *)(local_f0 + -1) = param_5;
    *(byte *)((long)local_f0 + -4) = param_6 & 1;
    do {
      puVar3 = local_f0;
      if (((uVar17 & 0xfff) == 0) && ((int)lVar16 <= (int)(uVar17 >> 0xc))) {
        if (*(long *)(lVar2 + 0x28) == local_68) {
                    /* try { // try from 00844254 to 00844257 has its CatchHandler @ 00844290 */
          FUN_008444e8();
LAB_00844258:
          if (*(long *)(lVar2 + 0x28) == local_68) {
                    /* try { // try from 00844268 to 0084426b has its CatchHandler @ 00844274 */
            uVar7 = FUN_008446b4();
                    /* catch() { ... } // from try @ 00843eec with catch @ 0084426c */
                    /* catch() { ... } // from try @ 00844254 with catch @ 00844290 */
            FUN_00844700(&local_f8);
            if (*(long *)(lVar2 + 0x28) == local_68) {
                    /* WARNING: Subroutine does not return */
              FUN_00c2c090(uVar7);
            }
          }
        }
        goto LAB_008442b4;
      }
      plVar5 = (long *)local_f0[-2];
      piVar15 = (int *)(local_f0 + -0xc);
      if (plVar5 != (long *)0x0) {
                    /* try { // try from 00843fac to 00843fb3 has its CatchHandler @ 0084428c */
        (**(code **)(*plVar5 + 0x10))(plVar5,piVar15);
      }
      puVar14 = local_f0;
      iVar1 = *piVar15;
      if (iVar1 < -0x3e1) {
        if (iVar1 + 0x3e3U < 2) goto LAB_00843f74;
        if (iVar1 != -1000) goto LAB_00844258;
        if (((param_5 >> 5 & 1) != 0) && (puVar3[-10] == param_2)) {
LAB_00844004:
          pvVar6 = (void *)local_f0[-5];
          if (pvVar6 != (void *)0x0) {
            local_f0[-4] = pvVar6;
            operator_delete(pvVar6,local_f0[-3] - (long)pvVar6);
          }
          pvVar6 = (void *)puVar14[-8];
          if (pvVar6 != (void *)0x0) {
            puVar14[-7] = pvVar6;
            operator_delete(pvVar6,puVar14[-6] - (long)pvVar6);
          }
          local_f0 = puVar14 + -0xc;
          goto LAB_00843f74;
        }
        if ((param_5 >> 0xc & 1) == 0) {
          lVar16 = puVar3[-10] - param_2;
        }
        else if (puVar3[-10] != param_3) goto LAB_00844004;
        plVar5 = (long *)*param_4;
        *plVar5 = param_2;
        plVar5[1] = param_2 + lVar16;
        *(undefined1 *)(plVar5 + 2) = 1;
        lVar16 = puVar3[-7] - puVar3[-8];
        if (lVar16 != 0) {
          puVar12 = (undefined1 *)(puVar3[-8] + 0x10);
          uVar10 = 1;
          do {
            plVar13 = plVar5 + uVar10 * 3;
            lVar9 = *(long *)(puVar12 + -0x10);
            plVar13[1] = *(long *)(puVar12 + -8);
            *plVar13 = lVar9;
            *(undefined1 *)(plVar13 + 2) = *puVar12;
            bVar4 = uVar10 < (ulong)((lVar16 >> 3) * -0x5555555555555555);
            puVar12 = puVar12 + 0x18;
            uVar10 = (ulong)((int)uVar10 + 1);
          } while (bVar4);
        }
        uVar7 = 1;
        puVar3 = local_f8;
        goto joined_r0x008441a4;
      }
      if (iVar1 == -0x3e1) goto LAB_00844004;
      if (iVar1 == -0x3e0) {
                    /* try { // try from 00844044 to 0084404f has its CatchHandler @ 00844278 */
        FUN_00844534(&local_e0,piVar15);
                    /* try { // try from 0084405c to 008440f3 has its CatchHandler @ 0084427c */
        (**(code **)(*(long *)puVar3[-2] + 0x18))((long *)puVar3[-2],1,piVar15);
        (**(code **)(*(long *)CONCAT35(uStack_8b,uStack_90) + 0x18))
                  ((long *)CONCAT35(uStack_8b,uStack_90),0,&local_e0);
        if (local_f0 < local_e8) {
          local_f0[6] = 0;
          local_f0[7] = 0;
          local_f0[4] = 0;
          local_f0[5] = 0;
          local_f0[8] = 0;
          local_f0[9] = 0;
          local_f0[1] = uStack_d8;
          *local_f0 = CONCAT44(uStack_dc,local_e0);
          local_f0[3] = local_c8;
          local_f0[2] = uStack_d0;
          local_f0[5] = local_b8;
          local_f0[4] = pvStack_c0;
          pvStack_c0 = (void *)0x0;
          local_b8 = (void *)0x0;
          local_f0[6] = lStack_b0;
          local_f0[8] = pvStack_a0;
          local_f0[7] = local_a8;
          lStack_b0 = 0;
          local_a8 = (void *)0x0;
          local_f0[9] = local_98;
          pvStack_a0 = (void *)0x0;
          local_98 = 0;
          *(ulong *)((long)local_f0 + 0x55) = CONCAT53(uStack_88,uStack_8b);
          local_f0[10] = CONCAT35(uStack_8b,uStack_90);
          local_f0 = local_f0 + 0xc;
        }
        else {
          local_f0 = (undefined8 *)FUN_008447a0(&local_f8,&local_e0);
          if (local_a8 != (void *)0x0) {
            pvStack_a0 = local_a8;
            operator_delete(local_a8,local_98 - (long)local_a8);
          }
        }
        if (pvStack_c0 != (void *)0x0) {
          local_b8 = pvStack_c0;
          operator_delete(pvStack_c0,lStack_b0 - (long)pvStack_c0);
        }
      }
      else if (iVar1 != -0x3df) goto LAB_00844258;
LAB_00843f74:
      uVar17 = uVar17 + 1;
    } while (local_f8 != local_f0);
    uVar7 = 0;
    puVar3 = local_f8;
joined_r0x008441a4:
    local_f8 = puVar3;
    if (puVar3 != (undefined8 *)0x0) {
      for (puVar14 = local_f0; puVar3 != puVar14; puVar14 = puVar14 + -0xc) {
        pvVar6 = (void *)puVar14[-5];
        if (pvVar6 != (void *)0x0) {
          puVar14[-4] = pvVar6;
          operator_delete(pvVar6,puVar14[-3] - (long)pvVar6);
        }
        pvVar6 = (void *)puVar14[-8];
        if (pvVar6 != (void *)0x0) {
          puVar14[-7] = pvVar6;
          operator_delete(pvVar6,puVar14[-6] - (long)pvVar6);
        }
      }
      local_f0 = puVar3;
      operator_delete(local_f8,(long)local_e8 - (long)local_f8);
    }
  }
  if (*(long *)(lVar2 + 0x28) == local_68) {
    return uVar7;
  }
LAB_008442b4:
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}

