/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0089682c
 */

void FUN_0089682c(undefined8 *param_1,long param_2,ulong param_3,ulong param_4,byte param_5)

{
  long *plVar1;
  uint uVar2;
  uint uVar3;
  ulong *puVar4;
  undefined8 *puVar5;
  long lVar6;
  long lVar7;
  undefined4 uVar8;
  byte bVar9;
  char cVar10;
  undefined1 uVar11;
  int iVar12;
  long lVar13;
  void *pvVar14;
  int iVar15;
  int iVar16;
  undefined1 uVar17;
  int iVar18;
  uint uVar19;
  undefined4 uVar20;
  undefined8 *puVar21;
  int *piVar22;
  int *piVar23;
  byte bVar24;
  ulong uVar25;
  long lVar26;
  ulong uVar27;
  int iVar28;
  long lVar29;
  ulong uVar30;
  long lVar31;
  ulong *puVar32;
  ulong *puVar33;
  ulong *puVar34;
  long lVar35;
  ulong uVar36;
  ulong uVar37;
  long lVar38;
  uint uVar39;
  undefined8 uVar40;
  char cVar41;
  ulong uVar42;
  undefined8 uVar43;
  long lVar44;
  ulong uVar45;
  ulong uVar46;
  size_t sVar47;
  long lVar48;
  size_t __n;
  uint local_108;
  ulong *local_e8;
  ulong *local_d0;
  undefined4 uStack_c8;
  undefined3 uStack_c4;
  undefined7 local_c0;
  undefined1 uStack_b9;
  int iStack_b8;
  undefined4 uStack_b4;
  undefined1 local_b0;
  byte bStack_af;
  undefined5 uStack_ae;
  undefined1 uStack_a9;
  undefined7 uStack_a8;
  undefined1 uStack_a1;
  undefined7 uStack_a0;
  undefined1 uStack_99;
  undefined7 uStack_98;
  undefined1 uStack_91;
  long local_90;
  long local_80;
  
  lVar13 = tpidr_el0;
  local_80 = *(long *)(lVar13 + 0x28);
  uVar36 = param_3 >> 0x20;
  uVar37 = (ulong)(uint)((int)param_3 << 3);
  if (param_1[0x12] != 0) {
    uVar25 = (uVar37 + 8 ^ uVar36) * -0x622015f714c7d297;
    uVar25 = (uVar36 ^ uVar25 >> 0x2f ^ uVar25) * -0x622015f714c7d297;
    uVar25 = (uVar25 ^ uVar25 >> 0x2f) * -0x6b622cb0470b6a63 >>
             ((ulong)*(byte *)(param_1 + 0x13) & 0x3f);
    if ((*(ulong *)(param_1[0x10] + (uVar25 >> 6) * 8) >> (uVar25 & 0x3f) & 1) != 0) {
      do {
        puVar32 = (ulong *)(param_1[0xd] + uVar25 * 0x50);
        if (*puVar32 == param_3) goto LAB_00896918;
        uVar25 = uVar25 + 1 & param_1[0x11] - 1;
      } while ((*(ulong *)(param_1[0x10] + (uVar25 >> 6) * 8) >> (uVar25 & 0x3f) & 1) != 0);
    }
  }
  puVar32 = (ulong *)0x0;
LAB_00896918:
  uVar39 = 1;
  puVar4 = (ulong *)0x0;
  if (puVar32 != (ulong *)0x0) {
    puVar4 = puVar32 + 1;
  }
  if ((param_5 != 0) && ((puVar4[8] & 1) == 0)) {
    uVar39 = (uint)*(byte *)((long)param_1 + (param_4 & 0xff) + 0x698);
  }
  uVar8 = *(undefined4 *)((long)param_1 + 0x64c);
  uVar25 = *(ulong *)(param_3 + 0x60);
  lVar29 = param_1[0xd0];
  lVar26 = param_1[0xd1];
  uVar11 = (undefined1)param_4;
  if (uVar25 != 0) {
    if (uVar25 < 0x38e38e38e38e38f) {
                    /* try { // try from 00896994 to 00896997 has its CatchHandler @ 0089843c */
      puVar32 = operator_new(uVar25 * 0x48);
      local_108 = (uint)param_4 & 0xff;
      local_d0 = puVar32 + uVar25 * 9;
      uVar46 = 0;
      local_e8 = puVar32;
LAB_008969f8:
      uVar27 = *(ulong *)(param_2 + 0x40);
      if (uVar46 < uVar27) {
        sVar47 = *(ulong *)(*(long *)(param_2 + 0x38) + uVar46 * 8);
      }
      else {
        sVar47 = 0;
      }
      uVar42 = *(ulong *)(*(long *)(param_3 + 0x58) + uVar46 * 8);
      if ((int)puVar4[6] == 2) {
        uVar19 = (uint)(puVar4[7] == uVar42) & (uVar39 ^ 1);
      }
      else {
        uVar19 = 0;
      }
      uVar45 = uVar46 + 1;
                    /* try { // try from 00896a60 to 00896a6b has its CatchHandler @ 00898470 */
      if (((uVar45 != uVar27) || (uVar25 <= uVar27)) ||
         (uVar25 = FUN_00892bc4(param_1,sVar47), (uVar25 & 1) == 0)) {
        iVar16 = uStack_b4;
        iVar18 = iStack_b8;
        iStack_b8 = (int)param_1;
        iVar12 = iStack_b8;
        uStack_b4 = (int)((ulong)param_1 >> 0x20);
        iVar15 = uStack_b4;
        if (param_1[0x27] != 0) {
          uVar25 = ((ulong)(uint)((int)uVar42 << 3) + 8 ^ uVar42 >> 0x20) * -0x622015f714c7d297;
          uVar25 = (uVar42 >> 0x20 ^ uVar25 >> 0x2f ^ uVar25) * -0x622015f714c7d297;
          uVar25 = (uVar25 ^ uVar25 >> 0x2f) * -0x6b622cb0470b6a63 >>
                   ((ulong)*(byte *)(param_1 + 0x28) & 0x3f);
          if ((*(ulong *)(param_1[0x25] + (uVar25 >> 6) * 8) >> (uVar25 & 0x3f) & 1) != 0) {
            do {
              puVar33 = (ulong *)(param_1[0x22] + uVar25 * 0x28);
              if (*puVar33 == uVar42) {
                if ((char)puVar33[4] == '\x01') {
                  if (uVar19 == 0) goto LAB_008973d8;
                  bStack_af = 0;
                  local_c0 = 0xc4b2e8;
                  uStack_b9 = 0;
                  local_b0 = uVar11;
                  if (sVar47 == 0) {
LAB_00896b60:
                    bVar24 = 0;
                  }
                  else {
                    /* try { // try from 00896b48 to 00896b53 has its CatchHandler @ 00898428 */
                    uVar19 = FUN_0088df20(param_1,sVar47);
                    if (uVar19 == local_108) goto LAB_00896b60;
                    puVar21 = *(undefined8 **)(*(long *)(param_2 + 0x38) + uVar46 * 8);
                    /* try { // try from 00897380 to 00897387 has its CatchHandler @ 00898428 */
                    (**(code **)*puVar21)(puVar21,&local_c0);
                    bVar24 = bStack_af;
                  }
                  if ((*(ulong *)(param_2 + 0x40) <= uVar45) || ((bVar24 & 1) != 0))
                  goto LAB_008973d4;
                  uVar25 = uVar45;
                  goto LAB_008973a4;
                }
                break;
              }
              uVar25 = uVar25 + 1 & param_1[0x26] - 1;
            } while ((*(ulong *)(param_1[0x25] + (uVar25 >> 6) * 8) >> (uVar25 & 0x3f) & 1) != 0);
          }
        }
        if (sVar47 != 0) {
          if (param_1[0x2e] != 0) {
            uVar25 = ((ulong)(uint)((int)sVar47 << 3) + 8 ^ sVar47 >> 0x20) * -0x622015f714c7d297;
            uVar25 = (sVar47 >> 0x20 ^ uVar25 >> 0x2f ^ uVar25) * -0x622015f714c7d297;
            uVar25 = (uVar25 ^ uVar25 >> 0x2f) * -0x6b622cb0470b6a63 >>
                     ((ulong)*(byte *)(param_1 + 0x2f) & 0x3f);
            if ((*(ulong *)(param_1[0x2c] + (uVar25 >> 6) * 8) >> (uVar25 & 0x3f) & 1) != 0) {
              do {
                puVar33 = (ulong *)(param_1[0x29] + uVar25 * 0x30);
                if (*puVar33 == sVar47) {
                  if ((int)puVar33[1] != 0) {
                    uVar46 = puVar33[2];
                    uVar25 = puVar33[1];
                    uStack_b4._3_1_ = (undefined1)uVar46;
                    local_b0 = (undefined1)(uVar46 >> 8);
                    bStack_af = (byte)(uVar46 >> 0x10);
                    uStack_ae = (undefined5)(uVar46 >> 0x18);
                    uStack_b9 = (undefined1)uVar25;
                    iStack_b8 = (int)(uVar25 >> 8);
                    uStack_b4._0_3_ = (undefined3)(uVar25 >> 0x28);
                    uVar27 = puVar33[4];
                    uStack_a1 = (undefined1)uVar27;
                    uStack_a0 = (undefined7)(uVar27 >> 8);
                    uStack_a9 = (undefined1)puVar33[3];
                    uStack_a8 = (undefined7)(puVar33[3] >> 8);
                    uVar25 = puVar33[5];
                    uStack_99 = (undefined1)uVar25;
                    uStack_98 = (undefined7)(uVar25 >> 8);
                    if (puVar32 < local_d0) {
                      *puVar32 = uVar42;
                      *(undefined1 *)(puVar32 + 1) = 0xff;
                      puVar32[6] = uVar25;
                      puVar32[5] = uVar27;
                      *(ulong *)((long)puVar32 + 0x21) = CONCAT17(uStack_a1,uStack_a8);
                      *(ulong *)((long)puVar32 + 0x19) = CONCAT17(uStack_a9,(int7)(uVar46 >> 8));
                      *(ulong *)((long)puVar32 + 0x11) = CONCAT44(uStack_b4,iStack_b8);
                      *(ulong *)((long)puVar32 + 9) = CONCAT17(uStack_b9,local_c0);
                      goto LAB_00896c38;
                    }
                    sVar47 = (long)puVar32 - (long)local_e8;
                    uVar25 = ((long)sVar47 >> 3) * -0x71c71c71c71c71c7 + 1;
                    if (0x38e38e38e38e38e < uVar25) {
                      if (*(long *)(lVar13 + 0x28) != local_80) goto LAB_008984dc;
                      FUN_00898944();
                      goto LAB_00898378;
                    }
                    uVar27 = (long)local_d0 - (long)local_e8;
                    uVar46 = ((long)uVar27 >> 3) * 0x1c71c71c71c71c72;
                    if (uVar46 <= uVar25) {
                      uVar46 = uVar25;
                    }
                    if (0x1c71c71c71c71c6 < (ulong)(((long)uVar27 >> 3) * -0x71c71c71c71c71c7)) {
                      uVar46 = 0x38e38e38e38e38e;
                    }
                    if (0x38e38e38e38e38e < uVar46) goto LAB_00898348;
                    /* try { // try from 00897330 to 00897333 has its CatchHandler @ 008983f0 */
                    puVar33 = operator_new(uVar46 * 0x48);
                    puVar32 = (ulong *)((long)puVar33 + sVar47);
                    *(undefined1 *)(puVar32 + 1) = 0xff;
                    local_d0 = puVar33 + uVar46 * 9;
                    *puVar32 = uVar42;
                    *(undefined4 *)(puVar32 + 7) = 0;
                    *(ulong *)((long)puVar32 + 0x11) = CONCAT44(uStack_b4,iStack_b8);
                    *(ulong *)((long)puVar32 + 9) = CONCAT17(uStack_b9,local_c0);
                    *(ulong *)((long)puVar32 + 0x21) = CONCAT17(uStack_a1,uStack_a8);
                    *(ulong *)((long)puVar32 + 0x19) =
                         CONCAT17(uStack_a9,CONCAT52(uStack_ae,CONCAT11(bStack_af,local_b0)));
                    puVar32[6] = CONCAT71(uStack_98,uStack_99);
                    puVar32[5] = CONCAT71(uStack_a0,uStack_a1);
                    goto LAB_008976a8;
                  }
                  break;
                }
                uVar25 = uVar25 + 1 & param_1[0x2d] - 1;
              } while ((*(ulong *)(param_1[0x2c] + (uVar25 >> 6) * 8) >> (uVar25 & 0x3f) & 1) != 0);
            }
          }
          iVar28 = *(int *)(sVar47 + 8);
          uVar25 = sVar47;
          iStack_b8 = iVar18;
          uStack_b4 = iVar16;
          if (iVar28 != DAT_00d1b010) {
            do {
              if ((iVar28 != DAT_00d1afc0) && (iVar28 != DAT_00d1b0b0)) goto LAB_00896ea4;
              uVar25 = *(ulong *)(uVar25 + 0x20);
              iVar28 = *(int *)(uVar25 + 8);
            } while ((uVar25 == 0) || (iVar28 != DAT_00d1b010));
          }
          if (param_1[0x27] == 0) {
LAB_00896e88:
            puVar33 = (ulong *)0x0;
          }
          else {
            uVar25 = *(ulong *)(uVar25 + 0x20);
            uVar27 = ((ulong)(uint)((int)uVar25 << 3) + 8 ^ uVar25 >> 0x20) * -0x622015f714c7d297;
            uVar27 = (uVar25 >> 0x20 ^ uVar27 >> 0x2f ^ uVar27) * -0x622015f714c7d297;
            uVar27 = (uVar27 ^ uVar27 >> 0x2f) * -0x6b622cb0470b6a63 >>
                     ((ulong)*(byte *)(param_1 + 0x28) & 0x3f);
            if ((*(ulong *)(param_1[0x25] + (uVar27 >> 6) * 8) >> (uVar27 & 0x3f) & 1) == 0)
            goto LAB_00896e88;
            do {
              puVar34 = (ulong *)(param_1[0x22] + uVar27 * 0x28);
              if (*puVar34 == uVar25) goto LAB_00896e78;
              uVar27 = uVar27 + 1 & param_1[0x26] - 1;
            } while ((*(ulong *)(param_1[0x25] + (uVar27 >> 6) * 8) >> (uVar27 & 0x3f) & 1) != 0);
            puVar34 = (ulong *)0x0;
LAB_00896e78:
            puVar33 = (ulong *)0x0;
            if (puVar34 != (ulong *)0x0) {
              puVar33 = puVar34 + 1;
            }
          }
                    /* try { // try from 00896e8c to 00896f07 has its CatchHandler @ 00898474 */
          iVar18 = FUN_0088df20(param_1);
          if (iVar18 < 0) {
LAB_00896ea4:
            if (uVar19 == 0) {
LAB_00896f58:
              iVar18 = *(int *)((long)param_1 + 0x64c);
              uVar19 = iVar18 + 1;
              if (uVar19 < 0x100) {
                *(uint *)((long)param_1 + 0x64c) = uVar19;
                uVar2 = *(uint *)(param_1 + 0xca);
                if (*(uint *)(param_1 + 0xca) <= uVar19) {
                  uVar2 = uVar19;
                }
                *(uint *)(param_1 + 0xca) = uVar2;
                    /* try { // try from 00896f80 to 00896f9b has its CatchHandler @ 0089846c */
                uVar20 = FUN_008769d0(*param_1);
                uVar17 = FUN_00891438(param_1,sVar47,iVar18,param_4);
                local_c0 = 0;
                uStack_b9 = 0;
                iStack_b8 = 0;
                uStack_b4 = 0;
                local_b0 = 0;
                bStack_af = 0;
                uStack_ae = 0;
                uStack_a9 = 0;
                if (puVar32 < local_d0) {
                  *puVar32 = uVar42;
                  *(uint *)((long)puVar32 + 0xc) = CONCAT31(uStack_c4,uStack_c8._3_1_);
                  *(undefined1 *)(puVar32 + 1) = uVar17;
                  *(undefined4 *)((long)puVar32 + 9) = uStack_c8;
                  puVar32[2] = 0;
                  puVar32[3] = 0;
                  puVar32[5] = 0;
                  puVar32[4] = 0;
                  puVar32[6] = 0;
                  *(undefined4 *)(puVar32 + 7) = uVar20;
                  puVar32[8] = sVar47;
                  goto LAB_00897484;
                }
                __n = (long)puVar32 - (long)local_e8;
                uVar25 = ((long)__n >> 3) * -0x71c71c71c71c71c7 + 1;
                if (uVar25 < 0x38e38e38e38e38f) {
                  uVar27 = (long)local_d0 - (long)local_e8;
                  lVar48 = (long)uVar27 >> 3;
                  uVar46 = lVar48 * 0x1c71c71c71c71c72;
                  if (uVar46 <= uVar25) {
                    uVar46 = uVar25;
                  }
                  if (0x1c71c71c71c71c6 < (ulong)(lVar48 * -0x71c71c71c71c71c7)) {
                    uVar46 = 0x38e38e38e38e38e;
                  }
                  if (uVar46 < 0x38e38e38e38e38f) {
                    /* try { // try from 0089706c to 0089706f has its CatchHandler @ 00898440 */
                    puVar34 = operator_new(uVar46 * 0x48);
                    puVar33 = (ulong *)((long)puVar34 + __n);
                    local_d0 = puVar34 + uVar46 * 9;
                    *puVar33 = uVar42;
                    *(undefined1 *)(puVar33 + 1) = uVar17;
                    puVar33[6] = 0;
                    puVar32 = puVar33 + 9;
                    puVar33[3] = 0;
                    puVar33[2] = 0;
                    puVar33[5] = 0;
                    puVar33[4] = 0;
                    *(undefined4 *)(puVar33 + 7) = uVar20;
                    puVar33[8] = sVar47;
                    memcpy(puVar34,local_e8,__n);
                    if (local_e8 != (ulong *)0x0) {
                      operator_delete(local_e8,uVar27);
                    }
                    local_e8 = puVar34;
                    goto LAB_008969e8;
                  }
                  if (*(long *)(lVar13 + 0x28) == local_80) {
                    /* WARNING: Subroutine does not return */
                    /* try { // try from 00898258 to 00898273 has its CatchHandler @ 00898460 */
                    FUN_007fe1b8();
                  }
                }
                else if (*(long *)(lVar13 + 0x28) == local_80) {
                  FUN_00898944();
                  goto LAB_00898274;
                }
              }
              else if (*(long *)(lVar13 + 0x28) == local_80) {
                    /* try { // try from 008981cc to 008981e3 has its CatchHandler @ 0089845c */
                    /* WARNING: Subroutine does not return */
                FUN_0087fcd8(sVar47 + 0xc,
                             "Out of registers when trying to allocate %d registers: exceeded limit %d"
                             ,1,0xff);
              }
            }
            else {
              bStack_af = 0;
              local_c0 = 0xc4b2e8;
              uStack_b9 = 0;
              iStack_b8 = iVar12;
              uStack_b4 = iVar15;
              local_b0 = uVar11;
              uVar19 = FUN_0088df20(param_1,sVar47);
              if (uVar19 == local_108) {
                bVar24 = 0;
              }
              else {
                puVar21 = *(undefined8 **)(*(long *)(param_2 + 0x38) + uVar46 * 8);
                (**(code **)*puVar21)(puVar21,&local_c0);
                bVar24 = bStack_af;
              }
              if ((uVar45 < *(ulong *)(param_2 + 0x40)) && ((bVar24 & 1) == 0)) {
                uVar25 = uVar45;
                do {
                  puVar21 = *(undefined8 **)(*(long *)(param_2 + 0x38) + uVar25 * 8);
                    /* try { // try from 00896f34 to 00896f3b has its CatchHandler @ 0089849c */
                  (**(code **)*puVar21)(puVar21,&local_c0);
                  uVar25 = uVar25 + 1;
                  bVar24 = bStack_af;
                  if (*(ulong *)(param_2 + 0x40) <= uVar25) break;
                } while ((bStack_af & 1) == 0);
              }
              if ((bVar24 & 1) != 0) goto LAB_00896f58;
                    /* try { // try from 008970cc to 008970df has its CatchHandler @ 00898474 */
              FUN_0088d1d0(param_1,sVar47,param_4,1);
              local_c0 = 0;
              uStack_b9 = 0;
              iStack_b8 = 0;
              uStack_b4 = 0;
              local_b0 = 0;
              bStack_af = 0;
              uStack_ae = 0;
              uStack_a9 = 0;
              if (puVar32 < local_d0) goto LAB_008975ac;
              sVar47 = (long)puVar32 - (long)local_e8;
              uVar25 = ((long)sVar47 >> 3) * -0x71c71c71c71c71c7 + 1;
              if (uVar25 < 0x38e38e38e38e38f) {
                uVar27 = (long)local_d0 - (long)local_e8;
                uVar46 = ((long)uVar27 >> 3) * 0x1c71c71c71c71c72;
                if (uVar46 <= uVar25) {
                  uVar46 = uVar25;
                }
                if (0x1c71c71c71c71c6 < (ulong)(((long)uVar27 >> 3) * -0x71c71c71c71c71c7)) {
                  uVar46 = 0x38e38e38e38e38e;
                }
                if (uVar46 < 0x38e38e38e38e38f) {
                    /* try { // try from 00897174 to 00897177 has its CatchHandler @ 00898420 */
                  puVar33 = operator_new(uVar46 * 0x48);
                  goto LAB_00897674;
                }
                goto LAB_008982e8;
              }
              if (*(long *)(lVar13 + 0x28) == local_80) {
                FUN_00898944();
                goto LAB_00898318;
              }
            }
          }
          else {
            if (puVar33 == (ulong *)0x0) {
              uVar25 = 0;
            }
            else {
              if ((puVar33[3] & 1) != 0) goto LAB_00896ea4;
              uVar25 = *puVar33;
            }
            uStack_a9 = 0;
            uStack_ae = 0;
            bStack_af = 0;
            local_b0 = 0;
            uStack_b4 = 0;
            iStack_b8 = 0;
            uStack_b9 = 0;
            local_c0 = 0;
            if (puVar32 < local_d0) {
              *puVar32 = uVar42;
              *(uint *)((long)puVar32 + 0xc) = CONCAT31(uStack_c4,uStack_c8._3_1_);
              *(char *)(puVar32 + 1) = (char)iVar18;
              puVar32[6] = 0;
              *(undefined4 *)((long)puVar32 + 9) = uStack_c8;
              puVar32[2] = 0;
              puVar32[3] = 0;
              puVar32[5] = 0;
              puVar32[4] = 0;
              *(undefined4 *)(puVar32 + 7) = 0xffffffff;
              puVar32[8] = uVar25;
              puVar32 = puVar32 + 9;
              goto LAB_008969e8;
            }
            sVar47 = (long)puVar32 - (long)local_e8;
            uVar46 = ((long)sVar47 >> 3) * -0x71c71c71c71c71c7 + 1;
            if (uVar46 < 0x38e38e38e38e38f) {
              uVar27 = (long)local_d0 - (long)local_e8;
              uVar30 = ((long)uVar27 >> 3) * 0x1c71c71c71c71c72;
              if (uVar30 <= uVar46) {
                uVar30 = uVar46;
              }
              if (0x1c71c71c71c71c6 < (ulong)(((long)uVar27 >> 3) * -0x71c71c71c71c71c7)) {
                uVar30 = 0x38e38e38e38e38e;
              }
              if (uVar30 < 0x38e38e38e38e38f) {
                    /* try { // try from 00897258 to 0089725b has its CatchHandler @ 00898434 */
                puVar33 = operator_new(uVar30 * 0x48);
                puVar32 = (ulong *)((long)puVar33 + sVar47);
                *puVar32 = uVar42;
                *(undefined4 *)((long)puVar32 + 9) = uStack_c8;
                local_d0 = puVar33 + uVar30 * 9;
                *(char *)(puVar32 + 1) = (char)iVar18;
                *(uint *)((long)puVar32 + 0xc) = CONCAT31(uStack_c4,uStack_c8._3_1_);
                puVar32[2] = 0;
                puVar32[3] = 0;
                puVar32[5] = CONCAT44(uStack_b4,iStack_b8);
                puVar32[4] = CONCAT17(uStack_b9,local_c0);
                puVar32[8] = uVar25;
                puVar32[6] = CONCAT17(uStack_a9,CONCAT52(uStack_ae,CONCAT11(bStack_af,local_b0)));
                *(undefined4 *)(puVar32 + 7) = 0xffffffff;
                goto LAB_008976b0;
              }
LAB_00898274:
              if (*(long *)(lVar13 + 0x28) == local_80) {
                    /* WARNING: Subroutine does not return */
                    /* try { // try from 00898288 to 008982a3 has its CatchHandler @ 00898450 */
                FUN_007fe1b8();
              }
            }
            else if (*(long *)(lVar13 + 0x28) == local_80) {
              FUN_00898944();
              goto LAB_008982a4;
            }
          }
          goto LAB_008984dc;
        }
        local_c0 = 0;
        uStack_b9 = 0;
        iStack_b8 = 0;
        uStack_b4 = 0;
        local_b0 = 0;
        bStack_af = 0;
        uStack_ae = 0;
        uStack_a9 = 0;
        if (puVar32 < local_d0) {
          *puVar32 = uVar42;
          *(uint *)((long)puVar32 + 0xc) = CONCAT31(uStack_c4,uStack_c8._3_1_);
          *(undefined1 *)(puVar32 + 1) = 0xff;
          *(undefined4 *)((long)puVar32 + 9) = uStack_c8;
          puVar32[2] = 1;
          puVar32[3] = 0;
          puVar32[5] = 0;
          puVar32[4] = 0;
          puVar32[6] = 0;
LAB_00896c38:
          *(undefined4 *)(puVar32 + 7) = 0;
          goto LAB_008975e4;
        }
        sVar47 = (long)puVar32 - (long)local_e8;
        uVar25 = ((long)sVar47 >> 3) * -0x71c71c71c71c71c7 + 1;
        if (uVar25 < 0x38e38e38e38e38f) {
          uVar27 = (long)local_d0 - (long)local_e8;
          lVar48 = (long)uVar27 >> 3;
          uVar46 = lVar48 * 0x1c71c71c71c71c72;
          if (uVar46 <= uVar25) {
            uVar46 = uVar25;
          }
          if (0x1c71c71c71c71c6 < (ulong)(lVar48 * -0x71c71c71c71c71c7)) {
            uVar46 = 0x38e38e38e38e38e;
          }
          if (uVar46 < 0x38e38e38e38e38f) {
                    /* try { // try from 00896cc0 to 00896cc3 has its CatchHandler @ 00898454 */
            puVar34 = operator_new(uVar46 * 0x48);
            puVar33 = (ulong *)((long)puVar34 + sVar47);
            *(undefined1 *)(puVar33 + 1) = 0xff;
            local_d0 = puVar34 + uVar46 * 9;
            *puVar33 = uVar42;
            puVar32 = puVar33 + 9;
            puVar33[8] = 0;
            *(undefined8 *)((long)puVar33 + 0x1c) = 0;
            *(undefined8 *)((long)puVar33 + 0x14) = 0;
            *(undefined8 *)((long)puVar33 + 0x2c) = 0;
            *(undefined8 *)((long)puVar33 + 0x24) = 0;
            *(undefined4 *)(puVar33 + 2) = 1;
            *(undefined8 *)((long)puVar33 + 0x34) = 0;
            memcpy(puVar34,local_e8,sVar47);
            if (local_e8 != (ulong *)0x0) {
              operator_delete(local_e8,uVar27);
            }
            local_e8 = puVar34;
            goto LAB_008969e8;
          }
          if (*(long *)(lVar13 + 0x28) == local_80) {
                    /* WARNING: Subroutine does not return */
                    /* try { // try from 008981f8 to 00898213 has its CatchHandler @ 00898468 */
            FUN_007fe1b8();
          }
          goto LAB_008984dc;
        }
        if (*(long *)(lVar13 + 0x28) != local_80) goto LAB_008984dc;
        FUN_00898944();
        goto LAB_00898214;
      }
      iVar12 = *(int *)(param_3 + 0x60) - *(int *)(param_2 + 0x40);
      iVar18 = *(int *)((long)param_1 + 0x64c);
      uVar19 = iVar12 + 1;
      uVar2 = uVar19 + iVar18;
      if (0xff < uVar2) {
LAB_00898378:
        if (*(long *)(lVar13 + 0x28) == local_80) {
                    /* try { // try from 0089838c to 008983a3 has its CatchHandler @ 008983e0 */
                    /* WARNING: Subroutine does not return */
          FUN_0087fcd8(sVar47 + 0xc,
                       "Out of registers when trying to allocate %d registers: exceeded limit %d",
                       uVar19,0xff);
        }
        goto LAB_008984dc;
      }
      *(uint *)((long)param_1 + 0x64c) = uVar2;
      uVar3 = *(uint *)(param_1 + 0xca);
      if (*(uint *)(param_1 + 0xca) <= uVar2) {
        uVar3 = uVar2;
      }
      *(uint *)(param_1 + 0xca) = uVar3;
                    /* try { // try from 00897718 to 0089771f has its CatchHandler @ 008983e4 */
      uVar20 = FUN_008769d0(*param_1);
      if ((*(int *)(sVar47 + 8) == DAT_00d1b040) && (sVar47 != 0)) {
                    /* try { // try from 00897738 to 00897753 has its CatchHandler @ 008983d8 */
        FUN_0088888c(param_1,sVar47,iVar18,uVar19,1,0);
      }
      else if ((*(int *)(sVar47 + 8) == DAT_00d1b030) && (sVar47 != 0)) {
        if (0 < *(int *)((long)param_1 + 0xc)) {
                    /* try { // try from 00897780 to 0089779f has its CatchHandler @ 008983d4 */
          FUN_00876644(*param_1,*(int *)(sVar47 + 0xc) + 1);
        }
        FUN_00875b54(*param_1,0x3f,iVar18,iVar12 + 2,0);
      }
      uVar25 = *(ulong *)(param_3 + 0x60);
      if (uVar46 < uVar25) {
        cVar41 = '\0';
        goto LAB_00897810;
      }
      goto LAB_00897918;
    }
    if (*(long *)(lVar13 + 0x28) == local_80) {
                    /* try { // try from 008982e4 to 008982e7 has its CatchHandler @ 0089843c */
      FUN_00898944();
LAB_008982e8:
      if (*(long *)(lVar13 + 0x28) == local_80) {
                    /* WARNING: Subroutine does not return */
                    /* try { // try from 008982fc to 00898317 has its CatchHandler @ 00898438 */
        FUN_007fe1b8();
      }
    }
    goto LAB_008984dc;
  }
  local_d0 = (ulong *)0x0;
  puVar32 = (ulong *)0x0;
  local_e8 = (ulong *)0x0;
  uVar25 = 0;
  goto LAB_00897918;
  while ((bStack_af & 1) == 0) {
LAB_008973a4:
    puVar21 = *(undefined8 **)(*(long *)(param_2 + 0x38) + uVar25 * 8);
                    /* try { // try from 008973b4 to 008973bb has its CatchHandler @ 0089847c */
    (**(code **)*puVar21)(puVar21,&local_c0);
    uVar25 = uVar25 + 1;
    bVar24 = bStack_af;
    if (*(ulong *)(param_2 + 0x40) <= uVar25) break;
  }
LAB_008973d4:
  iVar18 = iStack_b8;
  iVar16 = uStack_b4;
  if ((bVar24 & 1) == 0) {
    if (sVar47 == 0) {
      FUN_00875b54(*param_1,2,param_4,0,0);
    }
    else {
                    /* try { // try from 00897568 to 00897597 has its CatchHandler @ 00898428 */
      FUN_0088d1d0(param_1,sVar47,param_4,1);
    }
    local_c0 = 0;
    uStack_b9 = 0;
    iStack_b8 = 0;
    uStack_b4 = 0;
    local_b0 = 0;
    bStack_af = 0;
    uStack_ae = 0;
    uStack_a9 = 0;
    if (puVar32 < local_d0) {
LAB_008975ac:
      uStack_a9 = 0;
      uStack_ae = 0;
      bStack_af = 0;
      local_b0 = 0;
      uStack_b4 = 0;
      iStack_b8 = 0;
      uStack_b9 = 0;
      local_c0 = 0;
      *puVar32 = uVar42;
      *(uint *)((long)puVar32 + 0xc) = CONCAT31(uStack_c4,uStack_c8._3_1_);
      *(undefined1 *)(puVar32 + 1) = uVar11;
      *(undefined4 *)((long)puVar32 + 9) = uStack_c8;
      puVar32[2] = 0;
      puVar32[3] = 0;
      puVar32[6] = 0;
      puVar32[5] = 0;
      puVar32[4] = 0;
      *(undefined4 *)(puVar32 + 7) = 0xffffffff;
LAB_008975e4:
      puVar32[8] = 0;
      puVar32 = puVar32 + 9;
      goto LAB_008969e8;
    }
    sVar47 = (long)puVar32 - (long)local_e8;
    uVar25 = ((long)sVar47 >> 3) * -0x71c71c71c71c71c7 + 1;
    if (0x38e38e38e38e38e < uVar25) {
      if (*(long *)(lVar13 + 0x28) == local_80) {
        uVar43 = FUN_00898944();
                    /* catch() { ... } // from try @ 00897780 with catch @ 008983d4 */
                    /* catch() { ... } // from try @ 00896f34 with catch @ 0089849c */
        if (local_e8 != (ulong *)0x0) {
          operator_delete(local_e8,(long)local_d0 - (long)local_e8);
        }
        *(undefined4 *)((long)param_1 + 0x64c) = uVar8;
        if (*(long *)(lVar13 + 0x28) == local_80) {
                    /* WARNING: Subroutine does not return */
          FUN_00c2c090(uVar43);
        }
      }
      goto LAB_008984dc;
    }
    uVar27 = (long)local_d0 - (long)local_e8;
    uVar46 = ((long)uVar27 >> 3) * 0x1c71c71c71c71c72;
    if (uVar46 <= uVar25) {
      uVar46 = uVar25;
    }
    if (0x1c71c71c71c71c6 < (ulong)(((long)uVar27 >> 3) * -0x71c71c71c71c71c7)) {
      uVar46 = 0x38e38e38e38e38e;
    }
    if (0x38e38e38e38e38e < uVar46) {
      if (*(long *)(lVar13 + 0x28) == local_80) {
                    /* WARNING: Subroutine does not return */
                    /* try { // try from 008983b8 to 008983d3 has its CatchHandler @ 008983ec */
        FUN_007fe1b8();
      }
      goto LAB_008984dc;
    }
                    /* try { // try from 00897670 to 00897673 has its CatchHandler @ 008983dc */
    puVar33 = operator_new(uVar46 * 0x48);
LAB_00897674:
    puVar32 = (ulong *)((long)puVar33 + sVar47);
    *puVar32 = uVar42;
    *(undefined1 *)(puVar32 + 1) = uVar11;
    local_d0 = puVar33 + uVar46 * 9;
    puVar32[6] = 0;
    puVar32[3] = 0;
    puVar32[2] = 0;
    puVar32[5] = 0;
    puVar32[4] = 0;
    *(undefined4 *)(puVar32 + 7) = 0xffffffff;
LAB_008976a8:
    puVar32[8] = 0;
LAB_008976b0:
    puVar32 = puVar32 + 9;
    memcpy(puVar33,local_e8,sVar47);
    if (local_e8 != (ulong *)0x0) goto LAB_008969dc;
  }
  else {
LAB_008973d8:
    uStack_b4 = iVar16;
    iStack_b8 = iVar18;
    iVar18 = *(int *)((long)param_1 + 0x64c);
    uVar19 = iVar18 + 1;
    if (0xff < uVar19) {
LAB_008982a4:
      if (*(long *)(lVar13 + 0x28) == local_80) {
                    /* try { // try from 008982b8 to 008982cf has its CatchHandler @ 0089842c */
                    /* WARNING: Subroutine does not return */
        FUN_0087fcd8(sVar47 + 0xc,
                     "Out of registers when trying to allocate %d registers: exceeded limit %d",1,
                     0xff);
      }
      goto LAB_008984dc;
    }
    *(uint *)((long)param_1 + 0x64c) = uVar19;
    uVar2 = *(uint *)(param_1 + 0xca);
    if (*(uint *)(param_1 + 0xca) <= uVar19) {
      uVar2 = uVar19;
    }
    *(uint *)(param_1 + 0xca) = uVar2;
                    /* try { // try from 00897400 to 0089743b has its CatchHandler @ 0089844c */
    uVar20 = FUN_008769d0(*param_1);
    if (sVar47 == 0) {
      FUN_00875b54(*param_1,2,iVar18,0,0);
    }
    else {
      FUN_0088d1d0(param_1,sVar47,iVar18,1);
    }
    local_c0 = 0;
    uStack_b9 = 0;
    iStack_b8 = 0;
    uStack_b4 = 0;
    local_b0 = 0;
    bStack_af = 0;
    uStack_ae = 0;
    uStack_a9 = 0;
    if (puVar32 < local_d0) {
      *puVar32 = uVar42;
      *(uint *)((long)puVar32 + 0xc) = CONCAT31(uStack_c4,uStack_c8._3_1_);
      *(char *)(puVar32 + 1) = (char)iVar18;
      *(undefined4 *)((long)puVar32 + 9) = uStack_c8;
      puVar32[2] = 0;
      puVar32[3] = 0;
      puVar32[5] = 0;
      puVar32[4] = 0;
      puVar32[6] = 0;
      *(undefined4 *)(puVar32 + 7) = uVar20;
      puVar32[8] = 0;
LAB_00897484:
      uStack_a9 = 0;
      uStack_ae = 0;
      bStack_af = 0;
      local_b0 = 0;
      uStack_b4 = 0;
      iStack_b8 = 0;
      uStack_b9 = 0;
      local_c0 = 0;
      puVar32 = puVar32 + 9;
      goto LAB_008969e8;
    }
    sVar47 = (long)puVar32 - (long)local_e8;
    uVar25 = ((long)sVar47 >> 3) * -0x71c71c71c71c71c7 + 1;
    if (0x38e38e38e38e38e < uVar25) {
      if (*(long *)(lVar13 + 0x28) == local_80) {
        FUN_00898944();
LAB_00898348:
        if (*(long *)(lVar13 + 0x28) == local_80) {
                    /* WARNING: Subroutine does not return */
                    /* try { // try from 0089835c to 00898377 has its CatchHandler @ 00898424 */
          FUN_007fe1b8();
        }
      }
      goto LAB_008984dc;
    }
    uVar27 = (long)local_d0 - (long)local_e8;
    uVar46 = ((long)uVar27 >> 3) * 0x1c71c71c71c71c72;
    if (uVar46 <= uVar25) {
      uVar46 = uVar25;
    }
    if (0x1c71c71c71c71c6 < (ulong)(((long)uVar27 >> 3) * -0x71c71c71c71c71c7)) {
      uVar46 = 0x38e38e38e38e38e;
    }
    if (0x38e38e38e38e38e < uVar46) {
LAB_00898318:
      if (*(long *)(lVar13 + 0x28) == local_80) {
                    /* WARNING: Subroutine does not return */
                    /* try { // try from 0089832c to 00898347 has its CatchHandler @ 00898430 */
        FUN_007fe1b8();
      }
      goto LAB_008984dc;
    }
                    /* try { // try from 0089750c to 0089750f has its CatchHandler @ 008983f4 */
    puVar33 = operator_new(uVar46 * 0x48);
    puVar34 = (ulong *)((long)puVar33 + sVar47);
    local_d0 = puVar33 + uVar46 * 9;
    *puVar34 = uVar42;
    puVar32 = puVar34 + 9;
    *(char *)(puVar34 + 1) = (char)iVar18;
    puVar34[3] = 0;
    puVar34[2] = 0;
    puVar34[5] = 0;
    puVar34[4] = 0;
    puVar34[6] = 0;
    *(undefined4 *)(puVar34 + 7) = uVar20;
    puVar34[8] = 0;
    memcpy(puVar33,local_e8,sVar47);
    if (local_e8 != (ulong *)0x0) {
LAB_008969dc:
      operator_delete(local_e8,uVar27);
    }
  }
  local_e8 = puVar33;
LAB_008969e8:
  uVar25 = *(ulong *)(param_3 + 0x60);
  uVar46 = uVar45;
  if (uVar25 <= uVar45) goto LAB_00897918;
  goto LAB_008969f8;
LAB_00898214:
  if (*(long *)(lVar13 + 0x28) == local_80) {
                    /* try { // try from 00898228 to 00898243 has its CatchHandler @ 00898464 */
    FUN_00898944();
LAB_0089822c:
    if (*(long *)(lVar13 + 0x28) == local_80) {
                    /* WARNING: Subroutine does not return */
      FUN_007fe1b8();
    }
  }
  goto LAB_008984dc;
LAB_00897810:
  do {
    uVar25 = *(ulong *)(*(long *)(param_3 + 0x58) + uVar46 * 8);
    iStack_b8 = 0;
    uStack_b4 = 0;
    local_b0 = 0;
    bStack_af = 0;
    uStack_ae = 0;
    uStack_a9 = 0;
    local_c0 = 0;
    uStack_b9 = 0;
    cVar10 = cVar41 + (char)iVar18;
    if (puVar32 < local_d0) {
      *puVar32 = uVar25;
      *(uint *)((long)puVar32 + 0xc) = CONCAT31(uStack_c4,uStack_c8._3_1_);
      *(char *)(puVar32 + 1) = cVar10;
      puVar32[6] = 0;
      *(undefined4 *)((long)puVar32 + 9) = uStack_c8;
      puVar32[2] = 0;
      puVar32[3] = 0;
      puVar32[5] = 0;
      puVar32[4] = 0;
      *(undefined4 *)(puVar32 + 7) = uVar20;
      puVar32[8] = 0;
    }
    else {
      sVar47 = (long)puVar32 - (long)local_e8;
      uVar27 = ((long)sVar47 >> 3) * -0x71c71c71c71c71c7 + 1;
      if (0x38e38e38e38e38e < uVar27) goto LAB_00898214;
      uVar45 = (long)local_d0 - (long)local_e8;
      lVar48 = (long)uVar45 >> 3;
      uVar42 = lVar48 * 0x1c71c71c71c71c72;
      if (uVar42 <= uVar27) {
        uVar42 = uVar27;
      }
      if (0x1c71c71c71c71c6 < (ulong)(lVar48 * -0x71c71c71c71c71c7)) {
        uVar42 = 0x38e38e38e38e38e;
      }
      if (0x38e38e38e38e38e < uVar42) goto LAB_0089822c;
                    /* try { // try from 008978b4 to 008978b7 has its CatchHandler @ 00898448 */
      puVar33 = operator_new(uVar42 * 0x48);
      puVar32 = (ulong *)((long)puVar33 + sVar47);
      local_d0 = puVar33 + uVar42 * 9;
      *(char *)(puVar32 + 1) = cVar10;
      *puVar32 = uVar25;
      puVar32[6] = 0;
      puVar32[3] = 0;
      puVar32[2] = 0;
      puVar32[5] = 0;
      puVar32[4] = 0;
      puVar32[8] = 0;
      *(undefined4 *)(puVar32 + 7) = uVar20;
      memcpy(puVar33,local_e8,sVar47);
      if (local_e8 != (ulong *)0x0) {
        operator_delete(local_e8,uVar45);
      }
      local_e8 = puVar33;
    }
    puVar32 = puVar32 + 9;
    uVar46 = uVar46 + 1;
    cVar41 = cVar41 + '\x01';
    uVar25 = *(ulong *)(param_3 + 0x60);
  } while (uVar46 < uVar25);
LAB_00897918:
  if (uVar25 < *(ulong *)(param_2 + 0x40)) {
    do {
                    /* try { // try from 0089792c to 00897933 has its CatchHandler @ 00898488 */
      FUN_00889800(param_1,*(undefined8 *)(*(long *)(param_2 + 0x38) + uVar25 * 8));
      uVar25 = uVar25 + 1;
    } while (uVar25 < *(ulong *)(param_2 + 0x40));
  }
  if (local_e8 != puVar32) {
    puVar33 = local_e8;
    do {
      if ((int)puVar33[2] == 0) {
        FUN_00884b7c(param_1,*puVar33,(char)puVar33[1],(int)puVar33[7]);
        if ((puVar33[8] != 0) && (param_1[0x27] != 0)) {
          uVar25 = *puVar33;
          uVar46 = ((ulong)(uint)((int)uVar25 << 3) + 8 ^ uVar25 >> 0x20) * -0x622015f714c7d297;
          uVar46 = (uVar25 >> 0x20 ^ uVar46 >> 0x2f ^ uVar46) * -0x622015f714c7d297;
          uVar46 = (uVar46 ^ uVar46 >> 0x2f) * -0x6b622cb0470b6a63 >>
                   ((ulong)*(byte *)(param_1 + 0x28) & 0x3f);
          if ((*(ulong *)(param_1[0x25] + (uVar46 >> 6) * 8) >> (uVar46 & 0x3f) & 1) != 0) {
            do {
              puVar34 = (ulong *)(param_1[0x22] + uVar46 * 0x28);
              if (*puVar34 == uVar25) {
                puVar34[1] = puVar33[8];
                break;
              }
              uVar46 = uVar46 + 1 & param_1[0x26] - 1;
            } while ((*(ulong *)(param_1[0x25] + (uVar46 >> 6) * 8) >> (uVar46 & 0x3f) & 1) != 0);
          }
        }
      }
      else {
                    /* try { // try from 00897988 to 008979bb has its CatchHandler @ 00898490 */
        puVar34 = (ulong *)FUN_008984e0(param_1 + 0x30,puVar33);
        uVar42 = puVar33[3];
        uVar27 = puVar33[2];
        uVar46 = puVar33[5];
        uVar25 = puVar33[4];
        puVar34[4] = puVar33[6];
        puVar34[1] = uVar42;
        *puVar34 = uVar27;
        puVar34[3] = uVar46;
        puVar34[2] = uVar25;
      }
      puVar33 = puVar33 + 9;
    } while (puVar33 != puVar32);
  }
  lVar48 = lVar26 - lVar29 >> 3;
  if ((int)puVar4[6] == 3 && (uVar39 & 1) == 0) {
    uVar25 = puVar4[7];
  }
  else {
    uVar25 = 0;
  }
  local_c0 = (undefined7)param_3;
  uStack_b9 = (undefined1)(param_3 >> 0x38);
  iStack_b8 = (int)lVar48;
  uStack_b4 = (int)(lVar26 - lVar29 >> 0x23);
  uStack_a8 = (undefined7)uVar25;
  uStack_a1 = (undefined1)(uVar25 >> 0x38);
  uStack_a0 = 0;
  uStack_99 = 0;
  uStack_98 = 0;
  uStack_91 = 0;
  local_90 = 0;
  puVar32 = (ulong *)param_1[0xfe];
  bStack_af = param_5;
  if (puVar32 < (ulong *)param_1[0xff]) {
    puVar32[5] = 0;
    puVar32[6] = 0;
    puVar32[4] = 0;
    puVar32[1] = CONCAT44(uStack_b4,iStack_b8);
    *puVar32 = param_3;
    puVar32[3] = uVar25;
    puVar32[2] = CONCAT17(uStack_a9,CONCAT52(uStack_ae,CONCAT11(param_5,uVar11)));
    puVar32[5] = 0;
    puVar32[4] = 0;
    puVar32[6] = 0;
    param_1[0xfe] = puVar32 + 7;
    local_b0 = uVar11;
  }
  else {
                    /* try { // try from 00897ae8 to 00897af3 has its CatchHandler @ 008983f8 */
    local_b0 = uVar11;
    uVar43 = FUN_00898a44(param_1 + 0xfd,&local_c0);
    pvVar14 = (void *)CONCAT17(uStack_99,uStack_a0);
    param_1[0xfe] = uVar43;
    if (pvVar14 != (void *)0x0) {
      uStack_98 = uStack_a0;
      uStack_91 = uStack_99;
      operator_delete(pvVar14,local_90 - (long)pvVar14);
    }
  }
  plVar1 = param_1 + 0x68;
                    /* try { // try from 00897b20 to 00897b33 has its CatchHandler @ 00898458 */
  FUN_0087e324(plVar1,param_1 + 0x1b,param_1 + 0x22,param_1 + 1,*(undefined8 *)(param_3 + 0x90),
               param_1[199]);
  if (param_1[0x6d] != 0) {
    uVar25 = param_1[0x6a];
    if (uVar25 != 0) {
      puVar32 = (ulong *)param_1[0x6b];
      uVar46 = *puVar32;
      if (uVar46 == 0) {
        uVar27 = 0;
        do {
          if (uVar25 - 1 == uVar27) goto LAB_00897c30;
          uVar46 = puVar32[uVar27 + 1];
          uVar27 = uVar27 + 1;
        } while (uVar46 == 0);
      }
      else {
        uVar27 = 0;
      }
      uVar42 = (uVar46 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar46 & 0x5555555555555555) << 1;
      uVar42 = (uVar42 & 0xcccccccccccccccc) >> 2 | (uVar42 & 0x3333333333333333) << 2;
      uVar42 = (uVar42 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar42 & 0xf0f0f0f0f0f0f0f) << 4;
      uVar42 = (uVar42 & 0xff00ff00ff00ff00) >> 8 | (uVar42 & 0xff00ff00ff00ff) << 8;
      uVar42 = (uVar42 & 0xffff0000ffff0000) >> 0x10 | (uVar42 & 0xffff0000ffff) << 0x10;
      uVar42 = LZCOUNT(uVar42 >> 0x20 | uVar42 << 0x20) | uVar27 << 6;
      do {
        do {
          puVar21 = (undefined8 *)(*plVar1 + uVar42 * 0x10);
          uVar40 = puVar21[1];
          uVar43 = *puVar21;
          iStack_b8 = (int)uVar40;
          uStack_b4 = (int)((ulong)uVar40 >> 0x20);
          local_c0 = (undefined7)uVar43;
          uStack_b9 = (undefined1)((ulong)uVar43 >> 0x38);
                    /* try { // try from 00897bb0 to 00897bdb has its CatchHandler @ 00898484 */
          piVar22 = (int *)FUN_0087f690(param_1 + 0x45,&local_c0);
          iVar18 = *piVar22;
          if (iStack_b8 != iVar18) {
            piVar23 = (int *)FUN_0087f690(param_1 + 0x6f,&local_c0);
            *piVar23 = iVar18;
            *piVar22 = iStack_b8;
          }
          uVar46 = uVar46 - 1 & uVar46;
          if (uVar46 == 0) {
            uVar30 = uVar27;
            uVar45 = uVar25;
            if (uVar25 <= uVar27 + 1) {
              uVar45 = uVar27 + 1;
            }
            do {
              uVar27 = uVar30 + 1;
              if (uVar25 <= uVar27) {
                uVar46 = 0;
                uVar27 = uVar45;
                goto LAB_00897b9c;
              }
              uVar46 = puVar32[uVar30 + 1];
              uVar30 = uVar27;
            } while (uVar46 == 0);
          }
          uVar42 = (uVar46 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar46 & 0x5555555555555555) << 1;
          uVar42 = (uVar42 & 0xcccccccccccccccc) >> 2 | (uVar42 & 0x3333333333333333) << 2;
          uVar42 = (uVar42 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar42 & 0xf0f0f0f0f0f0f0f) << 4;
          uVar42 = (uVar42 & 0xff00ff00ff00ff00) >> 8 | (uVar42 & 0xff00ff00ff00ff) << 8;
          uVar42 = (uVar42 & 0xffff0000ffff0000) >> 0x10 | (uVar42 & 0xffff0000ffff) << 0x10;
          uVar42 = LZCOUNT(uVar42 >> 0x20 | uVar42 << 0x20) | uVar27 << 6;
        } while (uVar46 != 0);
LAB_00897b9c:
      } while (uVar27 != uVar25);
    }
LAB_00897c30:
                    /* try { // try from 00897c30 to 00897ca7 has its CatchHandler @ 00898458 */
    FUN_00898be0(plVar1,0x20);
  }
  param_1[0x77] = param_1[0x76];
  param_1[0x7a] = param_1[0x79];
  FUN_0089c2cc(param_1 + 0x29,param_1 + 0x22,param_1 + 0x30,param_1[200],
               *(undefined1 *)(param_1 + 0xc9),*(int *)(param_1 + 6) == 1,param_1[0xb],
               *(undefined8 *)(param_3 + 0x90),param_1[199],param_1 + 0x37,param_1 + 0x76,
               param_1 + 0x79);
  uVar43 = param_1[0x1ae];
  if ((DAT_00d1ec80 == '\x01') && (param_1[0x1a5] != 0)) {
    uVar37 = (uVar37 + 8 ^ uVar36) * -0x622015f714c7d297;
    uVar36 = (uVar36 ^ uVar37 >> 0x2f ^ uVar37) * -0x622015f714c7d297;
    uVar36 = (uVar36 ^ uVar36 >> 0x2f) * -0x6b622cb0470b6a63 >>
             ((ulong)*(byte *)(param_1 + 0x1a6) & 0x3f);
    if ((*(ulong *)(param_1[0x1a3] + (uVar36 >> 6) * 8) >> (uVar36 & 0x3f) & 1) != 0) {
      do {
        if (*(ulong *)(param_1[0x1a0] + uVar36 * 0x20) == param_3) {
          param_1[0x1ae] = param_1[0x1a0] + uVar36 * 0x20 + 8;
          break;
        }
        uVar36 = uVar36 + 1 & param_1[0x1a4] - 1;
      } while ((*(ulong *)(param_1[0x1a3] + (uVar36 >> 6) * 8) >> (uVar36 & 0x3f) & 1) != 0);
    }
  }
  lVar26 = *(long *)(param_3 + 0x90);
  if (*(long *)(lVar26 + 0x28) != 0) {
    uVar36 = 0;
    do {
      uVar40 = *(undefined8 *)(*(long *)(lVar26 + 0x20) + uVar36 * 8);
      if (DAT_00d1f0e8 == '\x01') {
                    /* try { // try from 00897d8c to 00897db3 has its CatchHandler @ 00898498 */
        FUN_00884cbc(param_1,lVar26,uVar40,lVar48);
      }
      FUN_0088506c(param_1,uVar40);
      uVar37 = FUN_0089acdc(param_1 + 0x29,uVar40);
      if ((uVar37 & 1) != 0) {
        lVar26 = param_1[0xfe];
                    /* try { // try from 00897e3c to 00897e57 has its CatchHandler @ 008983e8 */
        if ((*(long *)(lVar26 + -0x18) != *(long *)(lVar26 + -0x10)) &&
           (lVar44 = *(long *)(*(long *)(lVar26 + -0x10) + -8), lVar29 = FUN_00875ec8(*param_1),
           lVar44 == lVar29 + -1)) {
          FUN_00875d78(*param_1,0x17);
          *(long *)(lVar26 + -0x10) = *(long *)(lVar26 + -0x10) + -8;
        }
        param_1[0x1ae] = uVar43;
        goto LAB_00897e6c;
      }
      uVar36 = uVar36 + 1;
      lVar26 = *(long *)(param_3 + 0x90);
    } while (uVar36 < *(ulong *)(lVar26 + 0x28));
  }
  param_1[0x1ae] = uVar43;
  if (param_5 != 0) {
    uVar36 = 0;
    do {
                    /* try { // try from 00897df0 to 00897e07 has its CatchHandler @ 00898480 */
      FUN_00875b54(*param_1,2,(uint)param_4 + (int)uVar36,0,0);
      uVar36 = uVar36 + 1;
    } while (param_5 != uVar36);
  }
                    /* try { // try from 00897e14 to 00897e1f has its CatchHandler @ 00898444 */
  FUN_008860c8(param_1,lVar48);
LAB_00897e6c:
                    /* try { // try from 00897e6c to 00897e77 has its CatchHandler @ 00898444 */
  FUN_008862e0(param_1,lVar48);
                    /* try { // try from 00897e7c to 00897e7f has its CatchHandler @ 00898494 */
  uVar43 = FUN_00875ec8(*param_1);
  lVar26 = param_1[0xfe];
  puVar21 = *(undefined8 **)(lVar26 + -0x18);
  puVar5 = *(undefined8 **)(lVar26 + -0x10);
  if (puVar21 != puVar5) {
    do {
                    /* try { // try from 00897e9c to 00897ea3 has its CatchHandler @ 0089848c */
      uVar36 = FUN_00875ed8(*param_1,*puVar21,uVar43);
      if ((uVar36 & 1) == 0) {
        if (*(long *)(lVar13 + 0x28) == local_80) {
                    /* WARNING: Subroutine does not return */
          FUN_0087fcd8(param_2 + 0xc,"Exceeded jump distance limit; simplify the code to compile");
        }
        goto LAB_008984dc;
      }
      puVar21 = puVar21 + 1;
    } while (puVar21 != puVar5);
    lVar26 = param_1[0xfe];
    puVar21 = *(undefined8 **)(lVar26 + -0x18);
  }
  if (puVar21 != (undefined8 *)0x0) {
    *(undefined8 **)(lVar26 + -0x10) = puVar21;
    operator_delete(puVar21,*(long *)(lVar26 + -8) - (long)puVar21);
  }
  param_1[0xfe] = lVar26 + -0x38;
  lVar26 = *(long *)(param_3 + 0x60);
  if (lVar26 != 0) {
    lVar48 = param_1[0x34];
    lVar6 = param_1[0x35];
    lVar29 = 0;
    lVar44 = param_1[0x26];
    lVar7 = param_1[0x27];
    lVar31 = *(long *)(param_3 + 0x58);
    bVar24 = *(byte *)(param_1 + 0x36);
    lVar35 = param_1[0x33];
    bVar9 = *(byte *)(param_1 + 0x28);
    lVar38 = param_1[0x25];
    do {
      uVar36 = *(ulong *)(lVar31 + lVar29 * 8);
      uVar37 = uVar36 >> 0x20;
      uVar25 = (ulong)(uint)((int)uVar36 << 3);
      if ((lVar6 != 0) &&
         (uVar46 = (uVar25 + 8 ^ uVar37) * -0x622015f714c7d297,
         uVar46 = (uVar37 ^ uVar46 >> 0x2f ^ uVar46) * -0x622015f714c7d297,
         uVar46 = (uVar46 ^ uVar46 >> 0x2f) * -0x6b622cb0470b6a63 >> ((ulong)bVar24 & 0x3f),
         (*(ulong *)(lVar35 + (uVar46 >> 6) * 8) >> (uVar46 & 0x3f) & 1) != 0)) {
        do {
          puVar32 = (ulong *)(param_1[0x30] + uVar46 * 0x30);
          if (*puVar32 == uVar36) {
            *(undefined4 *)(puVar32 + 1) = 0;
            if (lVar7 != 0) goto LAB_00897fc8;
            goto LAB_00897f44;
          }
          uVar46 = uVar46 + 1 & lVar48 - 1U;
        } while ((*(ulong *)(lVar35 + (uVar46 >> 6) * 8) >> (uVar46 & 0x3f) & 1) != 0);
      }
      if (lVar7 != 0) {
LAB_00897fc8:
        uVar25 = (uVar25 + 8 ^ uVar37) * -0x622015f714c7d297;
        uVar37 = (uVar37 ^ uVar25 >> 0x2f ^ uVar25) * -0x622015f714c7d297;
        uVar37 = (uVar37 ^ uVar37 >> 0x2f) * -0x6b622cb0470b6a63 >> ((ulong)bVar9 & 0x3f);
        if ((*(ulong *)(lVar38 + (uVar37 >> 6) * 8) >> (uVar37 & 0x3f) & 1) != 0) {
          do {
            puVar32 = (ulong *)(param_1[0x22] + uVar37 * 0x28);
            if (*puVar32 == uVar36) {
              puVar32[1] = 0;
              break;
            }
            uVar37 = uVar37 + 1 & lVar44 - 1U;
          } while ((*(ulong *)(lVar38 + (uVar37 >> 6) * 8) >> (uVar37 & 0x3f) & 1) != 0);
        }
      }
LAB_00897f44:
      lVar29 = lVar29 + 1;
    } while (lVar29 != lVar26);
  }
  if (param_1[0x74] != 0) {
    uVar36 = param_1[0x71];
    if (uVar36 != 0) {
      puVar32 = (ulong *)param_1[0x72];
      uVar37 = *puVar32;
      if (uVar37 == 0) {
        uVar25 = 0;
        do {
          if (uVar36 - 1 == uVar25) goto LAB_00898114;
          uVar37 = puVar32[uVar25 + 1];
          uVar25 = uVar25 + 1;
        } while (uVar37 == 0);
      }
      else {
        uVar25 = 0;
      }
      uVar46 = (uVar37 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar37 & 0x5555555555555555) << 1;
      uVar46 = (uVar46 & 0xcccccccccccccccc) >> 2 | (uVar46 & 0x3333333333333333) << 2;
      uVar46 = (uVar46 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar46 & 0xf0f0f0f0f0f0f0f) << 4;
      uVar46 = (uVar46 & 0xff00ff00ff00ff00) >> 8 | (uVar46 & 0xff00ff00ff00ff) << 8;
      uVar46 = (uVar46 & 0xffff0000ffff0000) >> 0x10 | (uVar46 & 0xffff0000ffff) << 0x10;
      uVar46 = LZCOUNT(uVar46 >> 0x20 | uVar46 << 0x20) | uVar25 << 6;
      do {
        do {
          puVar21 = (undefined8 *)(param_1[0x6f] + uVar46 * 0x10);
          uVar40 = puVar21[1];
          uVar43 = *puVar21;
          iStack_b8 = (int)uVar40;
          iVar18 = iStack_b8;
          uStack_b4 = (int)((ulong)uVar40 >> 0x20);
          local_c0 = (undefined7)uVar43;
          uStack_b9 = (undefined1)((ulong)uVar43 >> 0x38);
                    /* try { // try from 008980bc to 008980c7 has its CatchHandler @ 00898478 */
          piVar22 = (int *)FUN_0087f690(param_1 + 0x45,&local_c0);
          *piVar22 = iVar18;
          uVar37 = uVar37 - 1 & uVar37;
          if (uVar37 == 0) {
            uVar42 = uVar25;
            uVar27 = uVar36;
            if (uVar36 <= uVar25 + 1) {
              uVar27 = uVar25 + 1;
            }
            do {
              uVar25 = uVar42 + 1;
              if (uVar36 <= uVar25) {
                uVar37 = 0;
                uVar25 = uVar27;
                goto LAB_008980a4;
              }
              uVar37 = puVar32[uVar42 + 1];
              uVar42 = uVar25;
            } while (uVar37 == 0);
          }
          uVar46 = (uVar37 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar37 & 0x5555555555555555) << 1;
          uVar46 = (uVar46 & 0xcccccccccccccccc) >> 2 | (uVar46 & 0x3333333333333333) << 2;
          uVar46 = (uVar46 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar46 & 0xf0f0f0f0f0f0f0f) << 4;
          uVar46 = (uVar46 & 0xff00ff00ff00ff00) >> 8 | (uVar46 & 0xff00ff00ff00ff) << 8;
          uVar46 = (uVar46 & 0xffff0000ffff0000) >> 0x10 | (uVar46 & 0xffff0000ffff) << 0x10;
          uVar46 = LZCOUNT(uVar46 >> 0x20 | uVar46 << 0x20) | uVar25 << 6;
        } while (uVar37 != 0);
LAB_008980a4:
      } while (uVar25 != uVar36);
    }
LAB_00898114:
                    /* try { // try from 00898114 to 008981b7 has its CatchHandler @ 00898494 */
    FUN_00898be0(param_1 + 0x6f,0x20);
  }
  FUN_0089be8c(param_1 + 0x29,param_1 + 0x76);
  FUN_0089c0d8(param_1 + 0x30,param_1 + 0x79);
  if (local_e8 != (ulong *)0x0) {
    operator_delete(local_e8,(long)local_d0 - (long)local_e8);
  }
  *(undefined4 *)((long)param_1 + 0x64c) = uVar8;
  if (*(long *)(lVar13 + 0x28) == local_80) {
    return;
  }
LAB_008984dc:
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}

