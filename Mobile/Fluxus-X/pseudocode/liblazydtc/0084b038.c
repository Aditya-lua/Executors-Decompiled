/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0084b038
 */

/* WARNING: Removing unreachable block (ram,0x0084b5a8) */
/* WARNING: Removing unreachable block (ram,0x0084b5c0) */

bool FUN_0084b038(long param_1,long param_2,long param_3,undefined8 *param_4,uint param_5,
                 byte param_6)

{
  int iVar1;
  long lVar2;
  long *plVar3;
  void *pvVar4;
  undefined8 uVar5;
  undefined8 *puVar6;
  long lVar7;
  undefined4 *puVar8;
  long lVar9;
  long lVar10;
  ulong uVar11;
  ulong uVar12;
  bool bVar13;
  long lVar14;
  undefined8 *puVar16;
  undefined8 *puVar15;
  int *piVar17;
  uint uVar18;
  undefined8 uVar19;
  undefined8 uVar20;
  undefined8 uVar21;
  void *local_110;
  undefined8 *puStack_108;
  undefined8 *local_100;
  long lStack_f8;
  ulong local_f0;
  long lStack_e8;
  undefined4 local_d8;
  undefined4 uStack_d4;
  undefined8 uStack_d0;
  undefined8 uStack_c8;
  undefined8 uStack_c0;
  undefined8 local_b8;
  undefined8 uStack_b0;
  undefined8 uStack_a8;
  undefined8 local_a0;
  undefined8 uStack_98;
  undefined8 local_90;
  undefined5 uStack_88;
  undefined3 uStack_83;
  undefined5 uStack_80;
  long local_78;
  
  lVar2 = tpidr_el0;
  local_78 = *(long *)(lVar2 + 0x28);
  lVar14 = *(long *)(param_1 + 0x28);
  lStack_f8 = 0;
  local_100 = (undefined8 *)0x0;
  lStack_e8 = 0;
  local_f0 = 0;
  puStack_108 = (undefined8 *)0x0;
  local_110 = (void *)0x0;
  if (lVar14 == 0) {
    bVar13 = false;
  }
  else {
    local_d8 = 0;
    uStack_c8 = 0;
    uStack_d0 = 0;
    local_b8 = 0;
    uStack_c0 = 0;
    uStack_a8 = 0;
    uStack_b0 = 0;
    uStack_98 = 0;
    local_a0 = 0;
    uStack_88 = 0;
    local_90 = 0;
    uStack_83 = 0;
    uStack_80 = 0;
                    /* try { // try from 0084b0a8 to 0084b0b3 has its CatchHandler @ 0084b798 */
    FUN_0084c130(&local_110);
    puVar6 = (undefined8 *)
             (puStack_108[(lStack_e8 + local_f0) / 0x2a] + ((lStack_e8 + local_f0) % 0x2a) * 0x60);
    puVar6[1] = uStack_d0;
    *puVar6 = CONCAT44(uStack_d4,local_d8);
    puVar6[3] = uStack_c0;
    puVar6[2] = uStack_c8;
    puVar6[5] = 0;
    puVar6[6] = 0;
    puVar6[4] = 0;
    local_b8 = 0;
    uStack_b0 = 0;
    uStack_a8 = 0;
    puVar6[7] = 0;
    puVar6[8] = 0;
    puVar6[9] = 0;
    local_a0 = 0;
    uStack_98 = 0;
    local_90 = 0;
    *(ulong *)((long)puVar6 + 0x55) = CONCAT53(uStack_80,uStack_83);
    puVar6[10] = CONCAT35(uStack_83,uStack_88);
    uVar11 = lStack_e8 + local_f0;
    lStack_e8 = lStack_e8 + 1;
    puVar8 = (undefined4 *)(puStack_108[uVar11 / 0x2a] + (uVar11 % 0x2a) * 0x60);
    lVar9 = *(long *)(puVar8 + 0xe);
    uVar11 = (ulong)*(uint *)(param_1 + 0x20);
    *puVar8 = 0;
    uVar12 = *(long *)(puVar8 + 0x10) - lVar9 >> 4;
    *(long *)(puVar8 + 2) = param_2;
    *(long *)(puVar8 + 4) = param_2;
    *(long *)(puVar8 + 6) = param_3;
    if (uVar11 < uVar12 || uVar11 - uVar12 == 0) {
      if (uVar11 < uVar12) {
        *(ulong *)(puVar8 + 0x10) = lVar9 + uVar11 * 0x10;
      }
    }
    else {
                    /* try { // try from 0084b194 to 0084b197 has its CatchHandler @ 0084b794 */
      FUN_00844cfc(puVar8 + 0xe,uVar11 - uVar12);
    }
    uVar11 = (lStack_e8 + local_f0) - 1;
    bVar13 = false;
    uVar18 = 0;
    lVar9 = 0;
    lVar7 = puStack_108[uVar11 / 0x2a] + (uVar11 % 0x2a) * 0x60;
    *(byte *)(lVar7 + 0x5c) = param_6 & 1;
    *(long *)(lVar7 + 0x50) = lVar14;
    lVar14 = param_3 - param_2;
    *(uint *)(lVar7 + 0x58) = param_5;
    do {
      uVar18 = uVar18 + 1;
      if (((uVar18 & 0xfff) == 0) && ((int)lVar14 <= (int)(uVar18 >> 0xc))) {
        if (*(long *)(lVar2 + 0x28) == local_78) {
                    /* try { // try from 0084b778 to 0084b77b has its CatchHandler @ 0084b7b4 */
          FUN_008444e8();
LAB_0084b77c:
          if (*(long *)(lVar2 + 0x28) == local_78) {
                    /* try { // try from 0084b790 to 0084b793 has its CatchHandler @ 0084b79c */
            uVar5 = FUN_008446b4();
                    /* catch() { ... } // from try @ 0084b194 with catch @ 0084b794 */
                    /* catch() { ... } // from try @ 0084b28c with catch @ 0084b7b8
                       catch() { ... } // from try @ 0084b5d4 with catch @ 0084b7b8 */
            FUN_0084c0ac(&local_110);
            if (*(long *)(lVar2 + 0x28) == local_78) {
                    /* WARNING: Subroutine does not return */
              FUN_00c2c090(uVar5);
            }
          }
        }
        goto LAB_0084b7e0;
      }
      uVar11 = (lStack_e8 + local_f0) - 1;
      piVar17 = (int *)(puStack_108[uVar11 / 0x2a] + (uVar11 % 0x2a) * 0x60);
      plVar3 = *(long **)(piVar17 + 0x14);
      if (plVar3 != (long *)0x0) {
        (**(code **)(*plVar3 + 0x10))(plVar3,piVar17);
      }
      iVar1 = *piVar17;
      if (iVar1 < -0x3e2) {
        if (iVar1 == -1000) {
          if ((((param_5 >> 5 & 1) != 0) && (*(long *)(piVar17 + 4) == param_2)) ||
             (((param_5 >> 0xc & 1) != 0 && (*(long *)(piVar17 + 4) != param_3))))
          goto LAB_0084b28c;
          lVar7 = *(long *)(piVar17 + 4) - *(long *)(piVar17 + 2);
          if (lVar9 <= lVar7) {
            lVar9 = lVar7;
          }
          if (!bVar13) {
            lVar9 = lVar7;
          }
          if (lVar9 == lVar14) {
            if (local_100 == puStack_108) {
              puVar6 = puStack_108;
            }
            else {
              plVar3 = puStack_108 + local_f0 / 0x2a;
              lVar9 = *plVar3 + (local_f0 % 0x2a) * 0x60;
              lVar7 = puStack_108[(lStack_e8 + local_f0) / 0x2a] +
                      ((lStack_e8 + local_f0) % 0x2a) * 0x60;
              puVar6 = local_100;
              if (lVar9 != lVar7) {
                do {
                  pvVar4 = *(void **)(lVar9 + 0x38);
                  if (pvVar4 != (void *)0x0) {
                    *(void **)(lVar9 + 0x40) = pvVar4;
                    operator_delete(pvVar4,*(long *)(lVar9 + 0x48) - (long)pvVar4);
                  }
                  pvVar4 = *(void **)(lVar9 + 0x20);
                  if (pvVar4 != (void *)0x0) {
                    *(void **)(lVar9 + 0x28) = pvVar4;
                    operator_delete(pvVar4,*(long *)(lVar9 + 0x30) - (long)pvVar4);
                  }
                  lVar9 = lVar9 + 0x60;
                  if (lVar9 - *plVar3 == 0xfc0) {
                    plVar3 = plVar3 + 1;
                    lVar9 = *plVar3;
                  }
                } while (lVar9 != lVar7);
                puVar6 = local_100;
              }
            }
            lStack_e8 = 0;
            lVar9 = (long)puVar6 - (long)puStack_108;
            while (uVar11 = lVar9 >> 3, 2 < uVar11) {
              operator_delete((void *)*puStack_108,0xfc0);
              puStack_108 = puStack_108 + 1;
              lVar9 = (long)local_100 - (long)puStack_108;
            }
            if (uVar11 == 1) {
              local_f0 = 0x15;
            }
            else if (uVar11 == 2) {
              local_f0 = 0x2a;
            }
            bVar13 = true;
            lVar9 = lVar14;
          }
          else {
                    /* try { // try from 0084b5d4 to 0084b5db has its CatchHandler @ 0084b7b8 */
            FUN_0084be60(&local_110);
            bVar13 = true;
          }
        }
        else if (iVar1 != -999) {
          if (iVar1 != -0x3e3) goto LAB_0084b77c;
          if (local_f0 == 0) {
            FUN_0084c9ec(&local_110);
          }
          lVar10 = puStack_108[local_f0 / 0x2a];
          lVar7 = 0;
          if (local_100 != puStack_108) {
            lVar7 = lVar10 + (local_f0 % 0x2a) * 0x60;
          }
          if (lVar7 == lVar10) {
            lVar7 = (puStack_108 + local_f0 / 0x2a)[-1] + 0xfc0;
          }
          uVar21 = *(undefined8 *)(piVar17 + 2);
          uVar20 = *(undefined8 *)piVar17;
          uVar19 = *(undefined8 *)(piVar17 + 6);
          uVar5 = *(undefined8 *)(piVar17 + 4);
          *(undefined8 *)(lVar7 + -0x38) = 0;
          *(undefined8 *)(lVar7 + -0x30) = 0;
          *(undefined8 *)(lVar7 + -0x40) = 0;
          *(undefined8 *)(lVar7 + -0x58) = uVar21;
          *(undefined8 *)(lVar7 + -0x60) = uVar20;
          *(undefined8 *)(lVar7 + -0x48) = uVar19;
          *(undefined8 *)(lVar7 + -0x50) = uVar5;
          uVar5 = *(undefined8 *)(piVar17 + 8);
          *(undefined8 *)(lVar7 + -0x38) = *(undefined8 *)(piVar17 + 10);
          *(undefined8 *)(lVar7 + -0x40) = uVar5;
          *(undefined8 *)(lVar7 + -0x30) = *(undefined8 *)(piVar17 + 0xc);
          piVar17[8] = 0;
          piVar17[9] = 0;
          piVar17[10] = 0;
          piVar17[0xb] = 0;
          piVar17[0xc] = 0;
          piVar17[0xd] = 0;
          *(undefined8 *)(lVar7 + -0x28) = 0;
          *(undefined8 *)(lVar7 + -0x20) = 0;
          *(undefined8 *)(lVar7 + -0x18) = 0;
          uVar5 = *(undefined8 *)(piVar17 + 0xe);
          *(undefined8 *)(lVar7 + -0x20) = *(undefined8 *)(piVar17 + 0x10);
          *(undefined8 *)(lVar7 + -0x28) = uVar5;
          *(undefined8 *)(lVar7 + -0x18) = *(undefined8 *)(piVar17 + 0x12);
          lVar10 = *(long *)(piVar17 + 0x14);
          piVar17[0xe] = 0;
          piVar17[0xf] = 0;
          piVar17[0x10] = 0;
          piVar17[0x11] = 0;
          piVar17[0x12] = 0;
          piVar17[0x13] = 0;
          *(undefined8 *)(lVar7 + -0xb) = *(undefined8 *)((long)piVar17 + 0x55);
          *(long *)(lVar7 + -0x10) = lVar10;
          local_f0 = local_f0 - 1;
          lStack_e8 = lStack_e8 + 1;
LAB_0084b28c:
                    /* try { // try from 0084b28c to 0084b34b has its CatchHandler @ 0084b7b8 */
          FUN_0084be60(&local_110);
        }
      }
      else if (iVar1 < -0x3e0) {
        if (iVar1 != -0x3e2) {
          if (iVar1 == -0x3e1) goto LAB_0084b28c;
          goto LAB_0084b77c;
        }
      }
      else if (iVar1 == -0x3e0) {
                    /* try { // try from 0084b4a4 to 0084b4af has its CatchHandler @ 0084b7a0 */
        FUN_00844534(&local_d8,piVar17);
                    /* try { // try from 0084b4bc to 0084b50f has its CatchHandler @ 0084b7a4 */
        (**(code **)(**(long **)(piVar17 + 0x14) + 0x18))(*(long **)(piVar17 + 0x14),1,piVar17);
        (**(code **)(*(long *)CONCAT35(uStack_83,uStack_88) + 0x18))
                  ((long *)CONCAT35(uStack_83,uStack_88),0,&local_d8);
        uVar11 = 0;
        if ((long)local_100 - (long)puStack_108 != 0) {
          uVar11 = ((long)local_100 - (long)puStack_108 >> 3) * 0x2a - 1;
        }
        uVar12 = lStack_e8 + local_f0;
        if (uVar11 == uVar12) {
          FUN_0084c130(&local_110);
          uVar12 = lStack_e8 + local_f0;
        }
        puVar6 = (undefined8 *)(puStack_108[uVar12 / 0x2a] + (uVar12 % 0x2a) * 0x60);
        puVar6[1] = uStack_d0;
        *puVar6 = CONCAT44(uStack_d4,local_d8);
        puVar6[3] = uStack_c0;
        puVar6[2] = uStack_c8;
        puVar6[5] = 0;
        puVar6[6] = 0;
        puVar6[4] = 0;
        puVar6[5] = uStack_b0;
        puVar6[4] = local_b8;
        puVar6[6] = uStack_a8;
        puVar6[7] = 0;
        puVar6[8] = 0;
        puVar6[9] = 0;
        puVar6[8] = uStack_98;
        puVar6[7] = local_a0;
        puVar6[9] = local_90;
        *(ulong *)((long)puVar6 + 0x55) = CONCAT53(uStack_80,uStack_83);
        puVar6[10] = CONCAT35(uStack_83,uStack_88);
        lStack_e8 = lStack_e8 + 1;
        local_90 = 0;
        uStack_98 = 0;
        local_a0 = 0;
        uStack_a8 = 0;
        uStack_b0 = 0;
        local_b8 = 0;
      }
      else if (iVar1 != -0x3df) goto LAB_0084b77c;
    } while (lStack_e8 != 0);
    if (bVar13) {
      plVar3 = (long *)*param_4;
      *plVar3 = param_2;
      plVar3[1] = param_2 + lVar9;
      *(undefined1 *)(plVar3 + 2) = 1;
    }
  }
  lStack_e8 = 0;
  lVar14 = (long)local_100 - (long)puStack_108;
  puVar6 = local_100;
  while( true ) {
    uVar11 = lVar14 >> 3;
    local_100 = puVar6;
    if (uVar11 < 3) break;
    operator_delete((void *)*puStack_108,0xfc0);
    puStack_108 = puStack_108 + 1;
    lVar14 = (long)local_100 - (long)puStack_108;
    puVar6 = local_100;
  }
  if (uVar11 == 1) {
    local_f0 = 0x15;
  }
  else if (uVar11 == 2) {
    local_f0 = 0x2a;
  }
  puVar15 = puStack_108;
  if (puStack_108 != puVar6) {
    do {
      puVar16 = puVar15 + 1;
      operator_delete((void *)*puVar15,0xfc0);
      puVar15 = puVar16;
    } while (puVar16 != puVar6);
    if ((long)puStack_108 - (long)local_100 != 0) {
      local_100 = (undefined8 *)
                  ((long)local_100 +
                  (((long)puStack_108 - (long)local_100) + 7U & 0xfffffffffffffff8));
    }
  }
  if (local_110 != (void *)0x0) {
    operator_delete(local_110,lStack_f8 - (long)local_110);
  }
  if (*(long *)(lVar2 + 0x28) == local_78) {
    return bVar13;
  }
LAB_0084b7e0:
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}

