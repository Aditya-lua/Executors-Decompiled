/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0089d05c
 */

void FUN_0089d05c(int *param_1,long param_2,long param_3)

{
  undefined1 uVar1;
  byte bVar2;
  long lVar3;
  int iVar4;
  undefined8 *puVar5;
  int *piVar6;
  undefined8 uVar7;
  ulong uVar8;
  bool bVar9;
  bool bVar10;
  byte *pbVar11;
  long *plVar12;
  long lVar13;
  long lVar14;
  ulong uVar15;
  float fVar16;
  undefined8 uVar17;
  double dVar18;
  undefined8 uVar19;
  undefined8 uVar20;
  undefined8 local_108;
  long local_100;
  undefined8 local_f8;
  undefined8 local_f0;
  undefined8 local_d0;
  undefined8 uStack_c8;
  double local_c0;
  double dStack_b8;
  undefined8 uStack_b0;
  ulong local_a8;
  undefined1 local_a0;
  int local_90;
  undefined4 uStack_8c;
  ulong uStack_88;
  undefined8 uStack_80;
  undefined8 uStack_78;
  undefined8 local_70;
  long local_68;
  
  lVar3 = tpidr_el0;
  local_68 = *(long *)(lVar3 + 0x28);
  iVar4 = *(int *)(param_3 + 8);
  param_1[0] = 0;
  param_1[1] = 0;
  param_1[2] = 0;
  param_1[3] = 0;
  if ((param_3 != 0) && (iVar4 == DAT_00d1afc0)) {
    uVar7 = *(undefined8 *)(param_3 + 0x20);
LAB_0089d0b8:
    FUN_0089d05c(param_1,param_2,uVar7);
    goto LAB_0089d154;
  }
  if (iVar4 == DAT_00d1afd0) {
    *param_1 = 1;
    goto LAB_0089d154;
  }
  if ((param_3 != 0) && (iVar4 == DAT_00d1afe0)) {
    uVar1 = *(undefined1 *)(param_3 + 0x1c);
    *param_1 = 2;
    *(undefined1 *)(param_1 + 2) = uVar1;
    goto LAB_0089d154;
  }
  if ((param_3 != 0) && (iVar4 == DAT_00d1aff0)) {
    dVar18 = *(double *)(param_3 + 0x20);
LAB_0089d120:
    *param_1 = 3;
    *(double *)(param_1 + 2) = dVar18;
    goto LAB_0089d154;
  }
  if ((param_3 != 0) && (iVar4 == DAT_00d1b000)) {
    uVar7 = *(undefined8 *)(param_3 + 0x28);
    *(undefined8 *)(param_1 + 2) = *(undefined8 *)(param_3 + 0x20);
    *param_1 = 6;
    param_1[1] = (int)uVar7;
    goto LAB_0089d154;
  }
  if ((param_3 != 0) && (iVar4 == DAT_00d1b010)) {
    puVar5 = (undefined8 *)FUN_0089c210(*(undefined8 *)(param_2 + 0x18),param_3 + 0x20);
    if (puVar5 == (undefined8 *)0x0) {
      puVar5 = (undefined8 *)FUN_0089c210(param_2 + 0x80,param_3 + 0x20);
LAB_0089d2f0:
      if (puVar5 != (undefined8 *)0x0) {
        uVar20 = puVar5[1];
        uVar19 = *puVar5;
        uVar17 = puVar5[3];
        uVar7 = puVar5[2];
        *(undefined8 *)(param_1 + 8) = puVar5[4];
        *(undefined8 *)(param_1 + 2) = uVar20;
        *(undefined8 *)param_1 = uVar19;
        *(undefined8 *)(param_1 + 6) = uVar17;
        *(undefined8 *)(param_1 + 4) = uVar7;
      }
      goto LAB_0089d154;
    }
LAB_0089d1bc:
    uVar20 = puVar5[1];
    uVar19 = *puVar5;
    uVar17 = puVar5[3];
    uVar7 = puVar5[2];
    *(undefined8 *)(param_1 + 8) = puVar5[4];
    *(undefined8 *)(param_1 + 2) = uVar20;
    *(undefined8 *)param_1 = uVar19;
    *(undefined8 *)(param_1 + 6) = uVar17;
    *(undefined8 *)(param_1 + 4) = uVar7;
    goto LAB_0089d154;
  }
  if ((iVar4 == DAT_00d1b020) || (iVar4 == DAT_00d1b030)) goto LAB_0089d154;
  local_100 = param_3;
  if (iVar4 != DAT_00d1b040) {
    local_100 = 0;
  }
  if (local_100 == 0) {
    if ((param_3 != 0) && (iVar4 == DAT_00d1b050)) {
      FUN_0089d05c(&local_d0,param_2,*(undefined8 *)(param_3 + 0x20));
      if ((int)local_d0 != 4) {
        if ((int)local_d0 != 5) {
          if ((int)local_d0 != 7) {
            if (((*(char *)(param_2 + 0x28) == '\x01') &&
                (lVar13 = *(long *)(param_3 + 0x20), lVar13 != 0)) &&
               (*(int *)(lVar13 + 8) == DAT_00d1b020)) {
              if ((*(char **)(lVar13 + 0x20) != (char *)0x0) &&
                 (iVar4 = strcmp(*(char **)(lVar13 + 0x20),"math"), iVar4 == 0)) {
                FUN_0087dd18(param_1,*(undefined8 *)(param_3 + 0x28));
              }
              if ((*(code **)(param_2 + 0x30) != (code *)0x0) && (*param_1 == 0)) {
                (**(code **)(param_2 + 0x30))
                          (*(undefined8 *)(lVar13 + 0x20),*(undefined8 *)(param_3 + 0x28),param_1);
                if ((*(byte *)(param_2 + 0x29) == 1) && (*param_1 == 4)) {
                  uVar7 = *(undefined8 *)(param_1 + 4);
                  *param_1 = 5;
                  *(double *)(param_1 + 4) =
                       (double)(float)((ulong)*(undefined8 *)(param_1 + 2) >> 0x20);
                  *(double *)(param_1 + 2) = (double)(float)*(undefined8 *)(param_1 + 2);
                  *(double *)(param_1 + 8) = (double)(float)((ulong)uVar7 >> 0x20);
                  *(double *)(param_1 + 6) = (double)(float)uVar7;
                }
                else if (((*(byte *)(param_2 + 0x29) & 1) == 0) && (*param_1 == 5)) {
                  dVar18 = *(double *)(param_1 + 4);
                  *param_1 = 4;
                  *(ulong *)(param_1 + 4) =
                       CONCAT44((float)*(double *)(param_1 + 8),(float)*(double *)(param_1 + 6));
                  *(ulong *)(param_1 + 2) = CONCAT44((float)dVar18,(float)*(double *)(param_1 + 2));
                }
              }
            }
            goto LAB_0089d154;
          }
          if ((ulong)((*(long *)(param_2 + 0x48) - *(long *)(param_2 + 0x40) >> 3) *
                     0x6db6db6db6db6db7) <= (ulong)uStack_c8) goto LAB_0089d154;
          puVar5 = (undefined8 *)
                   FUN_0089dcf8(*(long *)(param_2 + 0x40) + (long)uStack_c8 * 0x38,param_3 + 0x28);
          goto LAB_0089d2f0;
        }
        pbVar11 = *(byte **)(param_3 + 0x28);
        if (pbVar11 == (byte *)0x0) goto LAB_0089d154;
        bVar2 = *pbVar11;
        if (bVar2 < 0x78) {
          if (bVar2 == 0x58) goto LAB_0089d738;
          if (bVar2 == 0x59) goto LAB_0089d850;
          if (bVar2 != 0x5a) goto LAB_0089d154;
        }
        else if (bVar2 != 0x7a) {
          if (bVar2 == 0x79) {
LAB_0089d850:
            if (pbVar11[1] != 0) goto LAB_0089d154;
            dVar18 = local_c0;
            goto LAB_0089d120;
          }
          if (bVar2 != 0x78) goto LAB_0089d154;
LAB_0089d738:
          if (pbVar11[1] != 0) goto LAB_0089d154;
          dVar18 = uStack_c8;
          goto LAB_0089d120;
        }
        if (pbVar11[1] != 0) goto LAB_0089d154;
        dVar18 = dStack_b8;
        goto LAB_0089d120;
      }
      pbVar11 = *(byte **)(param_3 + 0x28);
      if (pbVar11 == (byte *)0x0) goto LAB_0089d154;
      bVar2 = *pbVar11;
      if (bVar2 < 0x78) {
        if (bVar2 != 0x58) {
          if (bVar2 == 0x59) goto LAB_0089d860;
          if (bVar2 != 0x5a) goto LAB_0089d154;
          goto LAB_0089d840;
        }
LAB_0089d760:
        if (pbVar11[1] != 0) goto LAB_0089d154;
        fVar16 = (float)uStack_c8;
      }
      else if (bVar2 == 0x7a) {
LAB_0089d840:
        if (pbVar11[1] != 0) goto LAB_0089d154;
        fVar16 = local_c0._0_4_;
      }
      else {
        if (bVar2 != 0x79) {
          if (bVar2 != 0x78) goto LAB_0089d154;
          goto LAB_0089d760;
        }
LAB_0089d860:
        if (pbVar11[1] != 0) goto LAB_0089d154;
        fVar16 = uStack_c8._4_4_;
      }
      dVar18 = (double)fVar16;
      goto LAB_0089d120;
    }
    if ((param_3 != 0) && (iVar4 == DAT_00d1b060)) {
      FUN_0089d05c(&local_d0,param_2,*(undefined8 *)(param_3 + 0x28));
      FUN_0089d05c(&local_90,param_2,*(undefined8 *)(param_3 + 0x20));
      if ((local_90 != 7) ||
         ((((int)local_d0 != 6 ||
           (lVar13 = *(long *)(param_2 + 0x40),
           (ulong)((*(long *)(param_2 + 0x48) - lVar13 >> 3) * 0x6db6db6db6db6db7) <= uStack_88)) ||
          (local_d0._4_4_ == 0)))) goto LAB_0089d154;
      local_f8 = FUN_008530cc(*(undefined8 *)(param_2 + 0x38),uStack_c8);
      puVar5 = (undefined8 *)FUN_0089dcf8(lVar13 + uStack_88 * 0x38,&local_f8);
      if (puVar5 == (undefined8 *)0x0) goto LAB_0089d154;
      goto LAB_0089d1bc;
    }
    if ((param_3 != 0) && (iVar4 == DAT_00d1b070)) {
      (**(code **)**(undefined8 **)(param_3 + 0x90))(*(undefined8 **)(param_3 + 0x90),param_2);
      goto LAB_0089d154;
    }
    if ((param_3 == 0) || (iVar4 != DAT_00d1b080)) {
      if ((param_3 != 0) && (iVar4 == DAT_00d1b090)) {
        FUN_0089d05c(&local_d0,param_2,*(undefined8 *)(param_3 + 0x20));
        if ((int)local_d0 != 0) {
          FUN_0089df6c(param_1,*(undefined4 *)(param_3 + 0x1c),&local_d0);
        }
        goto LAB_0089d154;
      }
      if ((param_3 != 0) && (iVar4 == DAT_00d1b0a0)) {
        FUN_0089d05c(&local_d0,param_2,*(undefined8 *)(param_3 + 0x20));
        FUN_0089d05c(&local_90,param_2,*(undefined8 *)(param_3 + 0x28));
        if ((int)local_d0 != 0) {
          FUN_0089e084(param_1,*(undefined4 *)(param_3 + 0x1c),&local_d0,&local_90,
                       *(undefined8 *)(param_2 + 0x38));
        }
        goto LAB_0089d154;
      }
      if ((param_3 == 0) || (iVar4 != DAT_00d1b0b0)) {
        if ((param_3 != 0) && (iVar4 == DAT_00d1b0c0)) {
          FUN_0089d05c(&local_d0,param_2,*(undefined8 *)(param_3 + 0x20));
          FUN_0089d05c(&local_90,param_2,*(undefined8 *)(param_3 + 0x30));
          piVar6 = (int *)&local_f8;
          FUN_0089d05c(&local_f8,param_2,*(undefined8 *)(param_3 + 0x40));
          if ((int)local_d0 != 0) {
            if ((int)local_d0 != 1) {
              if (((int)local_d0 == 2) && ((char)uStack_c8 == '\0')) {
                piVar6 = (int *)&local_f8;
              }
              else {
                piVar6 = &local_90;
              }
            }
            uVar17 = *(undefined8 *)(piVar6 + 2);
            uVar7 = *(undefined8 *)piVar6;
            uVar20 = *(undefined8 *)(piVar6 + 6);
            uVar19 = *(undefined8 *)(piVar6 + 4);
            *(undefined8 *)(param_1 + 8) = *(undefined8 *)(piVar6 + 8);
            *(undefined8 *)(param_1 + 2) = uVar17;
            *(undefined8 *)param_1 = uVar7;
            *(undefined8 *)(param_1 + 6) = uVar20;
            *(undefined8 *)(param_1 + 4) = uVar19;
          }
          goto LAB_0089d154;
        }
        if ((param_3 != 0) && (iVar4 == DAT_00d1b0d0)) {
          if (*(long *)(param_3 + 0x38) != 0) {
            lVar13 = *(long *)(param_3 + 0x38) << 3;
            bVar10 = true;
            puVar5 = *(undefined8 **)(param_3 + 0x30);
            do {
              FUN_0089d05c(&local_d0,param_2,*puVar5);
              lVar13 = lVar13 + -8;
              bVar10 = (bool)((int)local_d0 == 6 & bVar10);
              puVar5 = puVar5 + 1;
            } while (lVar13 != 0);
            if (!bVar10) goto LAB_0089d154;
          }
          FUN_0089efd4(param_1,param_3,*(undefined8 *)(param_2 + 8),*(undefined8 *)(param_2 + 0x38))
          ;
          goto LAB_0089d154;
        }
        if ((param_3 == 0) || (iVar4 != DAT_00d1b0e0)) goto LAB_0089d154;
      }
      uVar7 = *(undefined8 *)(param_3 + 0x20);
      goto LAB_0089d0b8;
    }
    local_a0 = 0x40;
    dStack_b8 = 0.0;
    local_c0 = 0.0;
    local_a8 = 0;
    uStack_b0 = 0;
    uStack_c8 = 0.0;
    local_d0 = 0;
    if (*(long *)(param_3 + 0x28) == 0) {
LAB_0089d77c:
      lVar13 = *(long *)(param_2 + 0x40);
      lVar14 = *(long *)(param_2 + 0x48);
      *param_1 = 7;
      *(long *)(param_1 + 2) = (lVar14 - lVar13 >> 3) * 0x6db6db6db6db6db7;
                    /* try { // try from 0089d7ac to 0089d7bf has its CatchHandler @ 0089d9e4 */
      FUN_0089def0((long *)(param_2 + 0x40),&local_d0);
    }
    else {
      lVar13 = 0;
      uVar8 = 0;
      do {
        lVar14 = *(long *)(param_3 + 0x20) + lVar13;
                    /* try { // try from 0089d564 to 0089d56f has its CatchHandler @ 0089d9f0 */
        FUN_0089d05c(&local_90,param_2,*(undefined8 *)(lVar14 + 0x10));
        if (*(long *)(lVar14 + 8) != 0) {
                    /* try { // try from 0089d57c to 0089d583 has its CatchHandler @ 0089d9ec */
          FUN_0089d05c(&local_f8);
          if (((((int)local_f8 == 6) && (local_90 != 0)) && (local_90 != 7)) &&
             (local_f8._4_4_ != 0)) {
                    /* try { // try from 0089d5b4 to 0089d5c7 has its CatchHandler @ 0089d9e8 */
            local_108 = FUN_008530cc(*(undefined8 *)(param_2 + 0x38),local_f0);
            puVar5 = (undefined8 *)FUN_0089dd88(&local_d0,&local_108);
            puVar5[4] = local_70;
            puVar5[1] = uStack_88;
            *puVar5 = CONCAT44(uStack_8c,local_90);
            puVar5[3] = uStack_78;
            puVar5[2] = uStack_80;
          }
        }
        uVar8 = uVar8 + 1;
        lVar13 = lVar13 + 0x18;
      } while (uVar8 < *(ulong *)(param_3 + 0x28));
      if (local_a8 == *(ulong *)(param_3 + 0x28)) goto LAB_0089d77c;
    }
    FUN_0089d008(&local_d0);
    goto LAB_0089d154;
  }
  FUN_0089d05c(&local_d0,param_2,*(undefined8 *)(local_100 + 0x20));
  lVar13 = param_3;
  if (*(long *)(param_2 + 0x20) != 0) {
    piVar6 = (int *)FUN_0089da18(*(long *)(param_2 + 0x20),&local_100);
    lVar13 = local_100;
    if ((piVar6 != (int *)0x0) && (*piVar6 != 0)) {
      plVar12 = (long *)(param_2 + 0x60);
      lVar14 = *(long *)(param_2 + 0x68) - *plVar12;
      lVar13 = (lVar14 >> 3) * -0x3333333333333333;
      FUN_0089dad8(plVar12,lVar13 + *(long *)(local_100 + 0x40));
      if (*(long *)(local_100 + 0x40) == 0) {
        uVar8 = 0;
LAB_0089d4c8:
        FUN_0087cbdc(param_1,*(undefined8 *)(param_2 + 0x38),*piVar6,
                     *(long *)(param_2 + 0x60) + lVar14,uVar8,*(undefined1 *)(param_2 + 0x29));
      }
      else {
        uVar15 = 0;
        bVar10 = true;
        do {
          FUN_0089d05c(&local_d0,param_2,*(undefined8 *)(*(long *)(local_100 + 0x38) + uVar15 * 8));
          bVar9 = false;
          if (((int)local_d0 != 0) && ((int)local_d0 != 7)) {
            FUN_0089dba4(plVar12,&local_d0);
            bVar9 = bVar10;
          }
          uVar15 = uVar15 + 1;
          uVar8 = *(ulong *)(local_100 + 0x40);
          bVar10 = bVar9;
        } while (uVar15 < uVar8);
        if (bVar9) goto LAB_0089d4c8;
      }
      FUN_0089dcbc(plVar12,lVar13);
      goto LAB_0089d154;
    }
  }
  if (*(long *)(lVar13 + 0x40) != 0) {
    uVar8 = 0;
    do {
      FUN_0089d05c(&local_d0,param_2,*(undefined8 *)(*(long *)(lVar13 + 0x38) + uVar8 * 8));
      uVar8 = uVar8 + 1;
      lVar13 = local_100;
    } while (uVar8 < *(ulong *)(local_100 + 0x40));
  }
LAB_0089d154:
  FUN_0089f448(param_2,*(undefined8 *)(param_2 + 8),param_3,param_1);
  if (*(long *)(lVar3 + 0x28) != local_68) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

