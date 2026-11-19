/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008c9360
 */

void FUN_008c9360(long param_1,long param_2,byte param_3,byte param_4,long param_5,
                 undefined8 param_6,undefined8 param_7,undefined8 param_8,long param_9,long param_10
                 ,long *param_11)

{
  long *plVar1;
  int iVar2;
  undefined4 uVar3;
  undefined1 uVar4;
  char cVar5;
  uint uVar6;
  long lVar7;
  byte bVar8;
  int iVar9;
  uint uVar10;
  byte *pbVar11;
  undefined8 *puVar12;
  int *piVar13;
  long *plVar14;
  double *pdVar15;
  void *pvVar16;
  undefined8 uVar17;
  byte bVar18;
  uint uVar19;
  long lVar20;
  ulong uVar21;
  float *pfVar22;
  long lVar23;
  char cVar24;
  float fVar25;
  long lVar26;
  undefined4 *puVar27;
  long lVar28;
  code *pcVar29;
  ulong uVar30;
  undefined8 *puVar31;
  ulong uVar32;
  uint uVar33;
  uint uVar34;
  long lVar35;
  uint uVar36;
  byte *pbVar37;
  uint uVar38;
  int *piVar39;
  ulong uVar40;
  uint *puVar41;
  long lVar42;
  byte *pbVar43;
  float fVar44;
  double dVar45;
  float fVar46;
  double dVar47;
  float fVar48;
  long local_88;
  int *local_80;
  ulong local_78;
  long local_70;
  
  lVar7 = tpidr_el0;
  local_70 = *(long *)(lVar7 + 0x28);
  lVar20 = *param_11;
  uVar4 = *(undefined1 *)(param_10 + lVar20);
  *param_11 = lVar20 + 1;
  *(undefined1 *)(param_2 + 5) = uVar4;
  uVar4 = *(undefined1 *)(param_10 + lVar20 + 1);
  *param_11 = lVar20 + 2;
  *(undefined1 *)(param_2 + 7) = uVar4;
  uVar4 = *(undefined1 *)(param_10 + lVar20 + 2);
  *param_11 = lVar20 + 3;
  *(undefined1 *)(param_2 + 6) = uVar4;
  uVar4 = *(undefined1 *)(param_10 + lVar20 + 3);
  *param_11 = lVar20 + 4;
  *(undefined1 *)(param_2 + 3) = uVar4;
  if (3 < param_3) {
    uVar4 = *(undefined1 *)(param_10 + lVar20 + 4);
    lVar42 = lVar20 + 5;
    *param_11 = lVar42;
    *(undefined1 *)(param_2 + 4) = uVar4;
    if (param_4 == 1) {
      uVar34 = 0;
      uVar40 = 0;
      do {
        bVar8 = *(byte *)(param_10 + lVar42);
        lVar42 = lVar42 + 1;
        *param_11 = lVar42;
        uVar36 = uVar34 & 0x1f;
        uVar34 = uVar34 + 7;
        uVar36 = (bVar8 & 0x7f) << (ulong)uVar36 | (uint)uVar40;
        uVar40 = (ulong)uVar36;
      } while ((char)bVar8 < '\0');
      if (uVar36 == 0) {
        uVar40 = 0;
      }
      else {
        uVar34 = 3;
        if (0x7f < uVar36) {
          uVar34 = 4;
        }
        pbVar11 = (byte *)FUN_008b7610(param_1,uVar34 + uVar36,*(undefined1 *)(param_2 + 1));
        *(byte **)(param_2 + 0x40) = pbVar11;
        *(uint *)(param_2 + 0xbc) = uVar34 + uVar36;
        if (uVar36 < 0x80) {
          lVar20 = 2;
          lVar26 = 1;
          *pbVar11 = (byte)uVar36;
        }
        else {
          *pbVar11 = (byte)uVar36 | 0x80;
          *(char *)(*(long *)(param_2 + 0x40) + 1) = (char)(uVar36 >> 7);
          lVar20 = 3;
          lVar26 = 2;
        }
        *(undefined1 *)(*(long *)(param_2 + 0x40) + lVar26) = 0;
        *(undefined1 *)(*(long *)(param_2 + 0x40) + lVar20) = 0;
        memcpy((void *)(*(long *)(param_2 + 0x40) + (ulong)uVar34),(void *)(param_10 + lVar42),
               uVar40);
        lVar42 = *param_11;
      }
      *param_11 = lVar42 + uVar40;
    }
    else if ((param_4 & 0xfe) == 2) {
      uVar34 = 0;
      uVar40 = 0;
      lVar20 = lVar20 + 6;
      pbVar11 = (byte *)(param_10 + lVar42);
      do {
        pbVar43 = pbVar11 + 1;
        bVar8 = *pbVar11;
        *param_11 = lVar20;
        lVar20 = lVar20 + 1;
        uVar36 = uVar34 & 0x1f;
        uVar34 = uVar34 + 7;
        uVar36 = (bVar8 & 0x7f) << (ulong)uVar36 | (uint)uVar40;
        uVar40 = (ulong)uVar36;
        pbVar11 = pbVar43;
      } while ((char)bVar8 < '\0');
      if (uVar36 != 0) {
        pvVar16 = (void *)FUN_008b7610(param_1,uVar40,*(undefined1 *)(param_2 + 1));
        *(uint *)(param_2 + 0xbc) = uVar36;
        *(void **)(param_2 + 0x40) = pvVar16;
        memcpy(pvVar16,pbVar43,uVar40);
        *param_11 = *param_11 + uVar40;
        if (param_4 == 3) {
          lVar20 = 0;
          uVar34 = 0;
          uVar40 = 0;
          pbVar43 = *(byte **)(param_2 + 0x40);
          pbVar11 = pbVar43;
          do {
            pbVar37 = pbVar11 + 1;
            bVar8 = *pbVar11;
            lVar20 = lVar20 + 1;
            uVar36 = uVar34 & 0x1f;
            uVar34 = uVar34 + 7;
            uVar36 = (bVar8 & 0x7f) << (ulong)uVar36 | (uint)uVar40;
            uVar40 = (ulong)uVar36;
            pbVar11 = pbVar37;
          } while ((char)bVar8 < '\0');
          uVar34 = 0;
          uVar32 = 0;
          do {
            pbVar11 = pbVar37 + 1;
            bVar8 = *pbVar37;
            lVar20 = lVar20 + 1;
            uVar10 = uVar34 & 0x1f;
            uVar34 = uVar34 + 7;
            uVar10 = (bVar8 & 0x7f) << (ulong)uVar10 | (uint)uVar32;
            uVar32 = (ulong)uVar10;
            pbVar37 = pbVar11;
          } while ((char)bVar8 < '\0');
          uVar34 = 0;
          uVar33 = 0;
          do {
            pbVar37 = pbVar11;
            lVar20 = lVar20 + 1;
            uVar38 = uVar34 & 0x1f;
            uVar34 = uVar34 + 7;
            uVar33 = (*pbVar37 & 0x7f) << (ulong)uVar38 | uVar33;
            pbVar11 = pbVar37 + 1;
          } while ((char)*pbVar37 < '\0');
          if (uVar36 != 0) {
            if (2 < uVar36) {
              pbVar11 = pbVar37 + 3;
              lVar42 = uVar40 - 2;
              bVar8 = DAT_00d1fe58;
              do {
                bVar18 = *pbVar11;
                if ((bVar8 & 1) == 0) {
                  uVar34 = bVar18 - 0x40;
                  if (uVar34 < 0x20) {
                    bVar18 = *(byte *)(param_5 + (ulong)uVar34);
                    goto LAB_008c95bc;
                  }
                  bVar8 = 0;
                }
                else {
                  uVar34 = (bVar18 & 0x7f) - 0x40;
                  if (uVar34 < 0x20) {
                    bVar18 = *(byte *)(param_5 + (ulong)uVar34) | bVar18 & 0x80;
                  }
LAB_008c95bc:
                  *pbVar11 = bVar18;
                  bVar8 = DAT_00d1fe58;
                }
                lVar42 = lVar42 + -1;
                pbVar11 = pbVar11 + 1;
              } while (lVar42 != 0);
            }
            lVar20 = uVar40 + lVar20;
          }
          if (uVar10 != 0) {
            pbVar11 = pbVar37 + 1 + uVar40;
            uVar40 = uVar32;
            bVar8 = DAT_00d1fe58;
            do {
              bVar18 = *pbVar11;
              if ((bVar8 & 1) == 0) {
                uVar34 = bVar18 - 0x40;
                if (uVar34 < 0x20) {
                  bVar18 = *(byte *)(param_5 + (ulong)uVar34);
                  goto LAB_008ca4f8;
                }
                bVar8 = 0;
              }
              else {
                uVar34 = (bVar18 & 0x7f) - 0x40;
                if (uVar34 < 0x20) {
                  bVar18 = *(byte *)(param_5 + (ulong)uVar34) | bVar18 & 0x80;
                }
LAB_008ca4f8:
                *pbVar11 = bVar18;
                bVar8 = DAT_00d1fe58;
              }
              uVar40 = uVar40 - 1;
              pbVar11 = pbVar11 + 1;
            } while (uVar40 != 0);
            lVar20 = lVar20 + uVar32;
          }
          if (uVar33 != 0) {
            uVar34 = 0;
            bVar8 = DAT_00d1fe58;
            do {
              bVar18 = pbVar43[lVar20];
              if ((bVar8 & 1) == 0) {
                uVar36 = bVar18 - 0x40;
                if (uVar36 < 0x20) {
                  bVar18 = *(byte *)(param_5 + (ulong)uVar36);
                  goto LAB_008ca594;
                }
                bVar8 = 0;
              }
              else {
                uVar36 = (bVar18 & 0x7f) - 0x40;
                if (uVar36 < 0x20) {
                  bVar18 = *(byte *)(param_5 + (ulong)uVar36) | bVar18 & 0x80;
                }
LAB_008ca594:
                pbVar43[lVar20] = bVar18;
                bVar8 = DAT_00d1fe58;
              }
              lVar20 = lVar20 + 2;
              do {
                pbVar11 = pbVar43 + lVar20;
                lVar20 = lVar20 + 1;
              } while ((char)*pbVar11 < '\0');
              do {
                pbVar11 = pbVar43 + lVar20;
                lVar20 = lVar20 + 1;
              } while ((char)*pbVar11 < '\0');
              uVar34 = uVar34 + 1;
            } while (uVar34 != uVar33);
          }
        }
      }
    }
  }
  lVar20 = *param_11;
  uVar34 = 0;
  uVar40 = 0;
  do {
    bVar8 = *(byte *)(param_10 + lVar20);
    lVar20 = lVar20 + 1;
    *param_11 = lVar20;
    uVar36 = uVar34 & 0x1f;
    uVar34 = uVar34 + 7;
    uVar36 = (bVar8 & 0x7f) << (ulong)uVar36 | (uint)uVar40;
    uVar40 = (ulong)uVar36;
  } while ((char)bVar8 < '\0');
  if ((int)uVar36 < 0) {
    lVar20 = *(long *)(lVar7 + 0x28);
  }
  else {
    lVar42 = FUN_008b7610(param_1,uVar40 << 2,*(undefined1 *)(param_2 + 1));
    *(uint *)(param_2 + 0xb8) = uVar36;
    *(long *)(param_2 + 0x30) = lVar42;
    lVar20 = *param_11;
    if (uVar36 != 0) {
      lVar26 = 0;
      do {
        uVar3 = *(undefined4 *)(param_10 + lVar20);
        lVar20 = lVar20 + 4;
        *param_11 = lVar20;
        *(undefined4 *)(lVar42 + lVar26 * 4) = uVar3;
        lVar26 = lVar26 + 1;
      } while (lVar26 < *(int *)(param_2 + 0xb8));
    }
    uVar34 = 0;
    uVar40 = 0;
    *(long *)(param_2 + 0x18) = lVar42;
    do {
      bVar8 = *(byte *)(param_10 + lVar20);
      lVar20 = lVar20 + 1;
      *param_11 = lVar20;
      uVar36 = uVar34 & 0x1f;
      uVar34 = uVar34 + 7;
      uVar36 = (bVar8 & 0x7f) << (ulong)uVar36 | (uint)uVar40;
      uVar40 = (ulong)uVar36;
    } while ((char)bVar8 < '\0');
    if ((int)uVar36 < 0) {
      lVar20 = *(long *)(lVar7 + 0x28);
    }
    else {
      lVar20 = FUN_008b7610(param_1,uVar40 << 4,*(undefined1 *)(param_2 + 1));
      *(uint *)(param_2 + 0x9c) = uVar36;
      *(long *)(param_2 + 0x28) = lVar20;
      if (uVar36 != 0) {
        if (uVar36 == 1) {
          uVar21 = 0;
LAB_008c9750:
          lVar42 = uVar40 - uVar21;
          puVar27 = (undefined4 *)(lVar20 + uVar21 * 0x10 + 0xc);
          do {
            lVar42 = lVar42 + -1;
            *puVar27 = 0;
            puVar27 = puVar27 + 4;
          } while (lVar42 != 0);
        }
        else {
          uVar21 = uVar40 & 0x7ffffffe;
          puVar27 = (undefined4 *)(lVar20 + 0x1c);
          uVar32 = uVar21;
          do {
            uVar32 = uVar32 - 2;
            puVar27[-4] = 0;
            *puVar27 = 0;
            puVar27 = puVar27 + 8;
          } while (uVar32 != 0);
          if (uVar21 != uVar40) goto LAB_008c9750;
        }
        lVar42 = 0;
        lVar20 = param_10 + 1;
        do {
          lVar23 = *param_11;
          bVar8 = *(byte *)(param_10 + lVar23);
          lVar26 = lVar23 + 1;
          *param_11 = lVar26;
          if (bVar8 < 6) {
            if (bVar8 < 3) {
              if (bVar8 == 1) {
                bVar8 = *(byte *)(param_10 + lVar26);
                *param_11 = lVar23 + 2;
                pfVar22 = (float *)(*(long *)(param_2 + 0x28) + lVar42 * 0x10);
                *pfVar22 = (float)(uint)bVar8;
                fVar25 = 1.4013e-45;
              }
              else {
                if (bVar8 != 2) goto LAB_008c979c;
                lVar26 = *(long *)(param_10 + lVar26);
                fVar25 = 4.2039e-45;
                *param_11 = lVar23 + 9;
                pfVar22 = (float *)(*(long *)(param_2 + 0x28) + lVar42 * 0x10);
                *(long *)pfVar22 = lVar26;
              }
LAB_008c9798:
              pfVar22[3] = fVar25;
            }
            else {
              if (bVar8 == 3) {
                lVar26 = FUN_008ca668(param_6,param_10,param_11);
                lVar23 = *(long *)(param_2 + 0x28);
                fVar25 = 7.00649e-45;
                goto LAB_008c9df8;
              }
              if (bVar8 == 4) {
                uVar3 = *(undefined4 *)(param_10 + lVar26);
                *param_11 = lVar23 + 5;
                local_80 = *(int **)(param_2 + 0x28);
                local_78 = CONCAT44(local_78._4_4_,uVar3);
                local_88 = param_9;
                if (*(char *)(param_9 + 3) == '\0') {
                  lVar26 = *(long *)(param_1 + 0x68);
                  *(undefined4 *)(lVar26 + 0xc) = 0;
                  lVar26 = lVar26 + 0x10;
                  *(long *)(param_1 + 0x68) = lVar26;
                }
                else {
                  FUN_008aa984(param_1);
                  iVar9 = FUN_008b47f0(param_1,FUN_008caa20,&local_88,
                                       *(long *)(param_1 + 0x68) - *(long *)(param_1 + 0x58),0);
                  lVar26 = *(long *)(param_1 + 0x68);
                  if (iVar9 != 0) {
                    *(undefined4 *)(lVar26 + -4) = 0;
                  }
                }
                uVar17 = *(undefined8 *)(lVar26 + -0x10);
                puVar12 = (undefined8 *)(*(long *)(param_2 + 0x28) + lVar42 * 0x10);
                puVar12[1] = *(undefined8 *)(lVar26 + -8);
                *puVar12 = uVar17;
                *(long *)(param_1 + 0x68) = *(long *)(param_1 + 0x68) + -0x10;
              }
              else if (bVar8 == 5) {
                uVar34 = 0;
                uVar36 = 0;
                do {
                  bVar8 = *(byte *)(lVar20 + lVar23);
                  lVar26 = lVar23 + 2;
                  lVar23 = lVar23 + 1;
                  *param_11 = lVar26;
                  uVar10 = uVar34 & 0x1f;
                  uVar34 = uVar34 + 7;
                  uVar36 = (bVar8 & 0x7f) << (ulong)uVar10 | uVar36;
                } while ((char)bVar8 < '\0');
                lVar26 = FUN_008bae54(param_1,0,uVar36);
                if (0 < (int)uVar36) {
                  uVar34 = 0;
                  do {
                    lVar23 = *param_11;
                    uVar10 = 0;
                    uVar33 = 0;
                    do {
                      bVar8 = *(byte *)(param_10 + lVar23);
                      lVar23 = lVar23 + 1;
                      *param_11 = lVar23;
                      uVar38 = uVar10 & 0x1f;
                      uVar10 = uVar10 + 7;
                      uVar33 = (bVar8 & 0x7f) << (ulong)uVar38 | uVar33;
                    } while ((char)bVar8 < '\0');
                    puVar12 = (undefined8 *)
                              FUN_008bbce8(param_1,lVar26,
                                           *(long *)(param_2 + 0x28) + (long)(int)uVar33 * 0x10);
                    uVar34 = uVar34 + 1;
                    *puVar12 = 0;
                    *(undefined4 *)((long)puVar12 + 0xc) = 3;
                  } while (uVar34 != uVar36);
                }
                fVar25 = 8.40779e-45;
                pfVar22 = (float *)(*(long *)(param_2 + 0x28) + lVar42 * 0x10);
                *(long *)pfVar22 = lVar26;
                goto LAB_008c9798;
              }
            }
          }
          else if (bVar8 < 8) {
            if (bVar8 == 6) {
              uVar34 = 0;
              uVar36 = 0;
              do {
                bVar8 = *(byte *)(lVar20 + lVar23);
                lVar26 = lVar23 + 2;
                lVar23 = lVar23 + 1;
                *param_11 = lVar26;
                uVar10 = uVar34 & 0x1f;
                uVar34 = uVar34 + 7;
                uVar36 = (bVar8 & 0x7f) << (ulong)uVar10 | uVar36;
              } while ((char)bVar8 < '\0');
              lVar26 = FUN_008ca754(param_7,param_1,uVar36);
              lVar26 = FUN_008b4d5c(param_1,*(undefined1 *)(lVar26 + 6),param_8,lVar26);
              fVar25 = 9.80909e-45;
              *(bool *)(lVar26 + 3) = *(char *)(lVar26 + 5) != '\0';
LAB_008c9df4:
              lVar23 = *(long *)(param_2 + 0x28);
LAB_008c9df8:
              pfVar22 = (float *)(lVar23 + lVar42 * 0x10);
              *(long *)pfVar22 = lVar26;
              goto LAB_008c9798;
            }
            if (bVar8 == 7) {
              fVar44 = *(float *)(param_10 + lVar26);
              *param_11 = lVar23 + 5;
              fVar46 = *(float *)(param_10 + lVar23 + 5);
              *param_11 = lVar23 + 9;
              fVar48 = *(float *)(param_10 + lVar23 + 9);
              *param_11 = lVar23 + 0x11;
              lVar26 = *(long *)(param_2 + 0x28);
LAB_008c995c:
              pfVar22 = (float *)(lVar26 + lVar42 * 0x10);
              fVar25 = 5.60519e-45;
              *pfVar22 = fVar44;
              pfVar22[1] = fVar46;
              pfVar22[2] = fVar48;
              goto LAB_008c9798;
            }
          }
          else if (bVar8 == 8) {
            uVar34 = 0;
            uVar40 = 0;
            do {
              bVar8 = *(byte *)(lVar20 + lVar23);
              lVar26 = lVar23 + 2;
              lVar23 = lVar23 + 1;
              *param_11 = lVar26;
              uVar36 = uVar34 & 0x1f;
              uVar34 = uVar34 + 7;
              uVar36 = (bVar8 & 0x7f) << (ulong)uVar36 | (uint)uVar40;
              uVar40 = (ulong)uVar36;
            } while ((char)bVar8 < '\0');
            lVar26 = FUN_008bae54(param_1,0,uVar40);
            local_80 = (int *)0x0;
            local_78 = 0;
            local_88 = param_1;
                    /* try { // try from 008c9a44 to 008c9a53 has its CatchHandler @ 008ca600 */
            piVar13 = (int *)FUN_008b7610(param_1,uVar40 << 2,0);
            local_80 = piVar13;
            local_78 = uVar40;
            if (uVar36 == 0) {
LAB_008c9e54:
              plVar14 = (long *)(*(long *)(param_2 + 0x28) + lVar42 * 0x10);
              *plVar14 = lVar26;
              *(undefined4 *)((long)plVar14 + 0xc) = 6;
              if (piVar13 == (int *)0x0) goto LAB_008c979c;
            }
            else {
              uVar34 = 0;
              lVar23 = 0;
              do {
                lVar28 = *param_11;
                uVar10 = 0;
                uVar33 = 0;
                do {
                  bVar8 = *(byte *)(param_10 + lVar28);
                  lVar28 = lVar28 + 1;
                  *param_11 = lVar28;
                  uVar38 = uVar10 & 0x1f;
                  uVar10 = uVar10 + 7;
                  uVar33 = (bVar8 & 0x7f) << (ulong)uVar38 | uVar33;
                } while ((char)bVar8 < '\0');
                    /* try { // try from 008c9ac8 to 008c9ad3 has its CatchHandler @ 008ca60c */
                plVar14 = (long *)FUN_008bbce8(param_1,lVar26,
                                               *(long *)(param_2 + 0x28) + (long)(int)uVar33 * 0x10)
                ;
                uVar10 = *(uint *)(param_10 + *param_11);
                *param_11 = *param_11 + 4;
                lVar28 = lVar23;
                if ((int)uVar10 < 0) {
LAB_008c9a7c:
                  *plVar14 = 0;
                  *(undefined4 *)((long)plVar14 + 0xc) = 3;
                }
                else {
                  plVar1 = (long *)(*(long *)(param_2 + 0x28) + (ulong)uVar10 * 0x10);
                  if (*(int *)((long)plVar1 + 0xc) == 0) {
                    lVar28 = lVar23 + 1;
                    piVar13[lVar23] = uVar33;
                    goto LAB_008c9a7c;
                  }
                  lVar23 = *plVar1;
                  plVar14[1] = plVar1[1];
                  *plVar14 = lVar23;
                  if (((4 < *(int *)((long)plVar1 + 0xc)) && ((*(byte *)(lVar26 + 2) >> 2 & 1) != 0)
                      ) && ((*(byte *)(*plVar1 + 2) & 3) != 0)) {
                    /* try { // try from 008c9b24 to 008c9b2f has its CatchHandler @ 008ca604 */
                    FUN_008b6370(param_1,lVar26);
                  }
                }
                uVar34 = uVar34 + 1;
                lVar23 = lVar28;
              } while (uVar34 != uVar36);
              piVar39 = piVar13;
              if (lVar28 == 0) goto LAB_008c9e54;
              do {
                    /* try { // try from 008c9e1c to 008c9e27 has its CatchHandler @ 008ca608 */
                lVar23 = FUN_008bbce8(param_1,lVar26,
                                      *(long *)(param_2 + 0x28) + (long)*piVar39 * 0x10);
                lVar28 = lVar28 + -1;
                *(undefined4 *)(lVar23 + 0xc) = 0;
                piVar39 = piVar39 + 1;
              } while (lVar28 != 0);
              plVar14 = (long *)(*(long *)(param_2 + 0x28) + lVar42 * 0x10);
              *plVar14 = lVar26;
              *(undefined4 *)((long)plVar14 + 0xc) = 6;
            }
                    /* try { // try from 008c9e74 to 008c9e87 has its CatchHandler @ 008ca5fc */
            FUN_008b7a9c(param_1,piVar13,uVar40 << 2,0);
          }
          else {
            if (bVar8 == 10) {
              uVar34 = 0;
              uVar40 = 0;
              lVar26 = lVar23 + 6;
              pbVar11 = (byte *)(param_10 + 5 + lVar23);
              do {
                pbVar43 = pbVar11;
                lVar35 = lVar26;
                lVar28 = lVar23;
                bVar8 = *(byte *)(param_10 + lVar28 + 1);
                uVar36 = uVar34 & 0x1f;
                *param_11 = lVar28 + 2;
                uVar34 = uVar34 + 7;
                uVar40 = (ulong)((bVar8 & 0x7f) << (ulong)uVar36 | (uint)uVar40);
                lVar23 = lVar28 + 1;
                lVar26 = lVar35 + 1;
                pbVar11 = pbVar43 + 1;
              } while ((char)bVar8 < '\0');
              lVar23 = *(long *)(param_2 + 0x28);
              lVar26 = param_10 + lVar28 + 1;
              uVar34 = 0;
              uVar32 = 0;
              bVar8 = *(byte *)(lVar26 + 1);
              *param_11 = lVar28 + 3;
              lVar28 = lVar28 + 4;
              bVar18 = *(byte *)(lVar26 + 2);
              uVar36 = (uint)bVar8;
              *param_11 = lVar28;
              do {
                pbVar11 = pbVar43;
                lVar26 = lVar35;
                bVar8 = *(byte *)(param_10 + lVar28);
                lVar28 = lVar28 + 1;
                *param_11 = lVar28;
                uVar10 = uVar34 & 0x1f;
                uVar34 = uVar34 + 7;
                uVar10 = (bVar8 & 0x7f) << (ulong)uVar10 | (uint)uVar32;
                uVar32 = (ulong)uVar10;
                lVar35 = lVar26 + 1;
                pbVar43 = pbVar11 + 1;
              } while ((char)bVar8 < '\0');
              uVar34 = 0;
              uVar33 = 0;
              do {
                bVar8 = *pbVar11;
                *param_11 = lVar26;
                lVar26 = lVar26 + 1;
                uVar38 = uVar34 & 0x1f;
                uVar34 = uVar34 + 7;
                uVar33 = (bVar8 & 0x7f) << (ulong)uVar38 | uVar33;
                pbVar11 = pbVar11 + 1;
              } while ((char)bVar8 < '\0');
              uVar38 = (uint)bVar18;
              iVar9 = uVar10 - uVar38;
              uVar34 = iVar9 + uVar33;
              pvVar16 = (void *)FUN_008b7610(param_1,(ulong)uVar34 << 3,*(undefined1 *)(param_1 + 4)
                                            );
              memset(pvVar16,0,(ulong)uVar34 << 3);
              lVar26 = FUN_008bae54(param_1,0,uVar34 - uVar36);
              if (uVar10 - uVar36 != 0) {
                uVar21 = 0;
                do {
                  lVar28 = *param_11;
                  uVar19 = 0;
                  uVar30 = 0;
                  do {
                    bVar8 = *(byte *)(param_10 + lVar28);
                    lVar28 = lVar28 + 1;
                    *param_11 = lVar28;
                    uVar6 = uVar19 & 0x1f;
                    uVar19 = uVar19 + 7;
                    uVar30 = (ulong)((bVar8 & 0x7f) << (ulong)uVar6 | (uint)uVar30);
                  } while ((char)bVar8 < '\0');
                  *(undefined8 *)((long)pvVar16 + uVar21 * 8) =
                       *(undefined8 *)(*(long *)(param_2 + 0x28) + uVar30 * 0x10);
                  pdVar15 = (double *)FUN_008bce4c(param_1,lVar26);
                  uVar30 = uVar21 & 0xffffffff;
                  uVar21 = uVar21 + 1;
                  *(undefined4 *)((long)pdVar15 + 0xc) = 3;
                  *pdVar15 = (double)uVar30;
                } while (uVar21 != uVar10 - uVar36);
              }
              if (uVar10 < uVar34) {
                do {
                  lVar28 = *param_11;
                  uVar34 = 0;
                  uVar21 = 0;
                  do {
                    bVar8 = *(byte *)(param_10 + lVar28);
                    lVar28 = lVar28 + 1;
                    *param_11 = lVar28;
                    uVar19 = uVar34 & 0x1f;
                    uVar34 = uVar34 + 7;
                    uVar21 = (ulong)((bVar8 & 0x7f) << (ulong)uVar19 | (uint)uVar21);
                  } while ((char)bVar8 < '\0');
                  *(undefined8 *)((long)pvVar16 + uVar32 * 8) =
                       *(undefined8 *)(*(long *)(param_2 + 0x28) + uVar21 * 0x10);
                  pdVar15 = (double *)FUN_008bce4c(param_1,lVar26);
                  uVar21 = uVar32 & 0xffffffff;
                  uVar32 = uVar32 + 1;
                  *(undefined4 *)((long)pdVar15 + 0xc) = 3;
                  *pdVar15 = (double)uVar21;
                } while (uVar32 != iVar9 + uVar33);
              }
              *(undefined1 *)(lVar26 + 7) = 1;
              lVar26 = FUN_008b2358(param_1,*(undefined8 *)(lVar23 + uVar40 * 0x10),lVar26,pvVar16,
                                    uVar10,uVar33,uVar36,uVar38,param_8);
              fVar25 = 1.54143e-44;
              goto LAB_008c9df4;
            }
            if (bVar8 == 0xb) {
              dVar45 = *(double *)(param_10 + lVar26);
              *param_11 = lVar23 + 9;
              dVar47 = *(double *)(param_10 + lVar23 + 9);
              *param_11 = lVar23 + 0x11;
              fVar44 = (float)dVar45;
              dVar45 = *(double *)(param_10 + lVar23 + 0x11);
              *param_11 = lVar23 + 0x21;
              lVar26 = *(long *)(param_2 + 0x28);
              fVar46 = (float)dVar47;
              fVar48 = (float)dVar45;
              goto LAB_008c995c;
            }
          }
LAB_008c979c:
          lVar42 = lVar42 + 1;
        } while (lVar42 < *(int *)(param_2 + 0x9c));
      }
      if (0 < *(int *)(param_2 + 0xb8)) {
        puVar41 = *(uint **)(param_2 + 0x30);
        do {
          uVar36 = *puVar41;
          uVar34 = uVar36 & 0xff;
          if (uVar34 == 0xf) {
            uVar34 = 0x53;
LAB_008c9f2c:
            if ((puVar41[1] & 0xffff0000) == 0) {
              lVar20 = *(long *)(*(long *)(param_2 + 0x28) + (ulong)puVar41[1] * 0x10);
              uVar10 = (uint)*(ushort *)(lVar20 + 6);
              if (*(ushort *)(lVar20 + 6) == 0x8000) {
                pcVar29 = *(code **)(*(long *)(param_1 + 0x60) + 0x6a8);
                if (pcVar29 == (code *)0x0) {
                  uVar10 = 0xffff;
                }
                else {
                  uVar10 = (*pcVar29)(param_1,lVar20 + 0x18,*(undefined4 *)(lVar20 + 0x14));
                  uVar36 = *puVar41;
                }
                *(short *)(lVar20 + 6) = (short)uVar10;
              }
              if ((uVar10 >> 0xf & 1) == 0) {
                uVar36 = uVar36 & 0xffffff00 | uVar34;
                *puVar41 = uVar36;
              }
            }
          }
          else {
            if (uVar34 == 0x14) {
              uVar34 = 0x55;
              goto LAB_008c9f2c;
            }
            if (uVar34 == 0x10) {
              uVar34 = 0x54;
              goto LAB_008c9f2c;
            }
          }
          iVar9 = FUN_007feb1c(uVar36 & 0xff);
          puVar41 = puVar41 + iVar9;
        } while (puVar41 < (uint *)(*(long *)(param_2 + 0x30) + (long)*(int *)(param_2 + 0xb8) * 4))
        ;
      }
      lVar20 = *param_11;
      uVar34 = 0;
      uVar40 = 0;
      do {
        bVar8 = *(byte *)(param_10 + lVar20);
        lVar20 = lVar20 + 1;
        *param_11 = lVar20;
        uVar36 = uVar34 & 0x1f;
        uVar34 = uVar34 + 7;
        uVar36 = (bVar8 & 0x7f) << (ulong)uVar36 | (uint)uVar40;
        uVar40 = (ulong)uVar36;
      } while ((char)bVar8 < '\0');
      if (-1 < (int)uVar36) {
        pvVar16 = (void *)FUN_008b7610(param_1,uVar40 << 3,*(undefined1 *)(param_2 + 1));
        *(uint *)(param_2 + 0xac) = uVar36;
        *(void **)(param_2 + 0x38) = pvVar16;
        if (uVar36 != 0) {
          memset(pvVar16,0,uVar40 << 3);
          lVar20 = 0;
          do {
            lVar42 = *param_11;
            uVar34 = 0;
            uVar36 = 0;
            do {
              bVar8 = *(byte *)(param_10 + lVar42);
              lVar42 = lVar42 + 1;
              *param_11 = lVar42;
              uVar10 = uVar34 & 0x1f;
              uVar34 = uVar34 + 7;
              uVar36 = (bVar8 & 0x7f) << (ulong)uVar10 | uVar36;
            } while ((char)bVar8 < '\0');
            uVar17 = FUN_008ca8f8(param_7,param_1,uVar36);
            *(undefined8 *)(*(long *)(param_2 + 0x38) + lVar20 * 8) = uVar17;
            lVar20 = lVar20 + 1;
          } while (lVar20 < *(int *)(param_2 + 0xac));
        }
        lVar20 = *param_11;
        uVar34 = 0;
        uVar36 = 0;
        do {
          bVar8 = *(byte *)(param_10 + lVar20);
          lVar20 = lVar20 + 1;
          *param_11 = lVar20;
          uVar10 = uVar34 & 0x1f;
          uVar34 = uVar34 + 7;
          uVar36 = (bVar8 & 0x7f) << (ulong)uVar10 | uVar36;
        } while ((char)bVar8 < '\0');
        *(uint *)(param_2 + 0xa0) = uVar36;
        uVar17 = FUN_008ca668(param_6,param_10,param_11);
        *(undefined8 *)(param_2 + 0x88) = uVar17;
        lVar20 = *param_11;
        cVar24 = *(char *)(param_10 + lVar20);
        *param_11 = lVar20 + 1;
        if (cVar24 != '\0') {
          bVar8 = *(byte *)(param_10 + lVar20 + 1);
          *param_11 = lVar20 + 2;
          uVar34 = (uint)bVar8;
          iVar2 = *(int *)(param_2 + 0xb8) + -1 >> (uVar34 & 0x1f);
          uVar40 = (long)*(int *)(param_2 + 0xb8) + 3U & 0xfffffffffffffffc;
          iVar9 = (int)uVar40 + iVar2 * 4 + 4;
          *(uint *)(param_2 + 0xa8) = uVar34;
          lVar20 = FUN_008b7610(param_1,(long)iVar9,*(undefined1 *)(param_2 + 1));
          *(long *)(param_2 + 0x90) = lVar20;
          *(int *)(param_2 + 0xb0) = iVar9;
          *(ulong *)(param_2 + 8) = lVar20 + uVar40;
          if (0 < *(int *)(param_2 + 0xb8)) {
            lVar20 = 0;
            cVar24 = '\0';
            do {
              cVar5 = *(char *)(param_10 + *param_11);
              *param_11 = *param_11 + 1;
              cVar24 = cVar24 + cVar5;
              *(char *)(*(long *)(param_2 + 0x90) + lVar20) = cVar24;
              lVar20 = lVar20 + 1;
            } while (lVar20 < *(int *)(param_2 + 0xb8));
          }
          if (-1 < iVar2) {
            lVar20 = *param_11;
            iVar9 = 0;
            uVar40 = (ulong)(iVar2 + 1);
            piVar13 = *(int **)(param_2 + 8);
            do {
              iVar2 = *(int *)(param_10 + lVar20);
              lVar20 = lVar20 + 4;
              uVar40 = uVar40 - 1;
              *param_11 = lVar20;
              iVar9 = iVar2 + iVar9;
              *piVar13 = iVar9;
              piVar13 = piVar13 + 1;
            } while (uVar40 != 0);
          }
        }
        cVar24 = *(char *)(param_10 + *param_11);
        lVar20 = *param_11 + 1;
        *param_11 = lVar20;
        if (cVar24 != '\0') {
          uVar34 = 0;
          uVar40 = 0;
          do {
            bVar8 = *(byte *)(param_10 + lVar20);
            lVar20 = lVar20 + 1;
            *param_11 = lVar20;
            uVar36 = uVar34 & 0x1f;
            uVar34 = uVar34 + 7;
            uVar36 = (bVar8 & 0x7f) << (ulong)uVar36 | (uint)uVar40;
            uVar40 = (ulong)uVar36;
          } while ((char)bVar8 < '\0');
          if ((int)uVar36 < 0) goto LAB_008ca5d0;
          puVar12 = (undefined8 *)
                    FUN_008b7610(param_1,(uVar40 + (ulong)uVar36 * 2) * 8,
                                 *(undefined1 *)(param_2 + 1));
          *(uint *)(param_2 + 0xa4) = uVar36;
          *(undefined8 **)(param_2 + 0x80) = puVar12;
          if (uVar36 != 0) {
            if (uVar36 == 1) {
              uVar21 = 0;
LAB_008ca208:
              lVar20 = uVar40 - uVar21;
              puVar12 = puVar12 + uVar21 * 3;
              do {
                lVar20 = lVar20 + -1;
                *puVar12 = 0;
                puVar12 = puVar12 + 3;
              } while (lVar20 != 0);
            }
            else {
              uVar21 = uVar40 & 0x7ffffffe;
              uVar32 = uVar21;
              puVar31 = puVar12;
              do {
                *puVar31 = 0;
                uVar32 = uVar32 - 2;
                puVar31[3] = 0;
                puVar31 = puVar31 + 6;
              } while (uVar32 != 0);
              if (uVar21 != uVar40) goto LAB_008ca208;
            }
            lVar20 = 0;
            do {
              uVar17 = FUN_008ca668(param_6,param_10,param_11);
              lVar26 = *(long *)(param_2 + 0x80);
              uVar34 = 0;
              uVar36 = 0;
              *(undefined8 *)(lVar26 + lVar20 * 0x18) = uVar17;
              lVar42 = *param_11;
              do {
                bVar8 = *(byte *)(param_10 + lVar42);
                lVar42 = lVar42 + 1;
                *param_11 = lVar42;
                uVar10 = uVar34 & 0x1f;
                uVar34 = uVar34 + 7;
                uVar36 = (bVar8 & 0x7f) << (ulong)uVar10 | uVar36;
              } while ((char)bVar8 < '\0');
              uVar34 = 0;
              uVar10 = 0;
              *(uint *)(lVar26 + lVar20 * 0x18 + 8) = uVar36;
              do {
                lVar23 = lVar42;
                bVar8 = *(byte *)(param_10 + lVar23);
                lVar42 = lVar23 + 1;
                *param_11 = lVar42;
                uVar36 = uVar34 & 0x1f;
                uVar34 = uVar34 + 7;
                uVar10 = (bVar8 & 0x7f) << (ulong)uVar36 | uVar10;
              } while ((char)bVar8 < '\0');
              lVar26 = lVar26 + lVar20 * 0x18;
              lVar20 = lVar20 + 1;
              *(uint *)(lVar26 + 0xc) = uVar10;
              uVar4 = *(undefined1 *)(param_10 + lVar42);
              *param_11 = lVar23 + 2;
              *(undefined1 *)(lVar26 + 0x10) = uVar4;
            } while (lVar20 < *(int *)(param_2 + 0xa4));
          }
          lVar20 = *param_11;
          uVar34 = 0;
          uVar40 = 0;
          do {
            bVar8 = *(byte *)(param_10 + lVar20);
            lVar20 = lVar20 + 1;
            *param_11 = lVar20;
            uVar36 = uVar34 & 0x1f;
            uVar34 = uVar34 + 7;
            uVar36 = (bVar8 & 0x7f) << (ulong)uVar36 | (uint)uVar40;
            uVar40 = (ulong)uVar36;
          } while ((char)bVar8 < '\0');
          if ((int)uVar36 < 0) goto LAB_008ca5d0;
          pvVar16 = (void *)FUN_008b7610(param_1,uVar40 << 3,*(undefined1 *)(param_2 + 1));
          *(uint *)(param_2 + 0xb4) = uVar36;
          *(void **)(param_2 + 0x10) = pvVar16;
          if (uVar36 != 0) {
            memset(pvVar16,0,uVar40 << 3);
            lVar20 = 0;
            do {
              uVar17 = FUN_008ca668(param_6,param_10,param_11);
              *(undefined8 *)(*(long *)(param_2 + 0x10) + lVar20 * 8) = uVar17;
              lVar20 = lVar20 + 1;
            } while (lVar20 < *(int *)(param_2 + 0xb4));
          }
        }
        if (10 < param_3) {
          lVar20 = *param_11;
          uVar34 = 0;
          uVar40 = 0;
          do {
            bVar8 = *(byte *)(param_10 + lVar20);
            lVar20 = lVar20 + 1;
            *param_11 = lVar20;
            uVar36 = uVar34 & 0x1f;
            uVar34 = uVar34 + 7;
            uVar36 = (bVar8 & 0x7f) << (ulong)uVar36 | (uint)uVar40;
            uVar40 = (ulong)uVar36;
          } while ((char)bVar8 < '\0');
          *(uint *)(param_2 + 200) = uVar36;
          if (uVar36 != 0) {
            uVar17 = FUN_008b7610(param_1,uVar40 << 4,*(undefined1 *)(param_2 + 1));
            *(undefined8 *)(param_2 + 0xc0) = uVar17;
            if (*(int *)(param_2 + 200) != 0) {
              uVar40 = 0;
              do {
                lVar20 = *param_11;
                bVar8 = *(byte *)(param_10 + lVar20);
                uVar34 = (uint)bVar8;
                *param_11 = lVar20 + 1;
                puVar41 = (uint *)(*(long *)(param_2 + 0xc0) + uVar40 * 0x10);
                *puVar41 = (uint)bVar8;
                if (bVar8 == 0) {
                  uVar36 = 0;
                  do {
                    bVar8 = *(byte *)(param_10 + 1 + lVar20);
                    lVar42 = lVar20 + 2;
                    lVar20 = lVar20 + 1;
                    *param_11 = lVar42;
                    uVar10 = uVar36 & 0x1f;
                    uVar36 = uVar36 + 7;
                    uVar34 = (bVar8 & 0x7f) << (ulong)uVar10 | uVar34;
                  } while ((char)bVar8 < '\0');
LAB_008ca3c8:
                  puVar41[2] = 0;
                  puVar41[3] = 0;
                  puVar41[1] = uVar34;
                }
                else if (bVar8 == 1) {
                  uVar36 = 0;
                  uVar34 = 0;
                  do {
                    bVar8 = *(byte *)(param_10 + 1 + lVar20);
                    lVar42 = lVar20 + 2;
                    lVar20 = lVar20 + 1;
                    *param_11 = lVar42;
                    uVar10 = uVar36 & 0x1f;
                    uVar36 = uVar36 + 7;
                    uVar34 = (bVar8 & 0x7f) << (ulong)uVar10 | uVar34;
                  } while ((char)bVar8 < '\0');
                  goto LAB_008ca3c8;
                }
                uVar40 = uVar40 + 1;
              } while (uVar40 < *(uint *)(param_2 + 200));
            }
          }
          if ((param_3 != 0xb) && ((*(byte *)(param_2 + 4) >> 3 & 1) != 0)) {
            lVar20 = *param_11;
            uVar40 = 0;
            uVar32 = 0;
            do {
              bVar8 = *(byte *)(param_10 + lVar20);
              lVar20 = lVar20 + 1;
              *param_11 = lVar20;
              uVar21 = uVar40 & 0x3f;
              uVar40 = (ulong)((int)uVar40 + 7);
              uVar32 = ((ulong)bVar8 & 0x7f) << uVar21 | uVar32;
            } while ((char)bVar8 < '\0');
            *(ulong *)(param_2 + 0xe0) = uVar32;
          }
        }
        if (*(long *)(lVar7 + 0x28) == local_70) {
          return;
        }
        goto LAB_008ca634;
      }
LAB_008ca5d0:
      lVar20 = *(long *)(lVar7 + 0x28);
    }
  }
  if (lVar20 == local_70) {
                    /* WARNING: Subroutine does not return */
    FUN_008b75fc(param_1);
  }
LAB_008ca634:
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}

