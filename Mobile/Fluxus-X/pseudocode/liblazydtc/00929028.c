/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00929028
 */

/* WARNING: Type propagation algorithm not settling */

int FUN_00929028(undefined8 param_1,code *param_2,byte *param_3,undefined8 *param_4)

{
  uint uVar1;
  double dVar2;
  long lVar3;
  bool bVar4;
  bool bVar5;
  byte bVar6;
  int iVar7;
  int iVar8;
  size_t sVar9;
  undefined8 uVar10;
  double dVar11;
  byte *pbVar12;
  double *pdVar13;
  int iVar14;
  long lVar15;
  uint uVar16;
  uint uVar17;
  ulong uVar18;
  ulong uVar19;
  int iVar20;
  uint uVar21;
  double dVar22;
  byte *pbVar23;
  long lVar24;
  double *pdVar25;
  byte *pbVar26;
  int iVar27;
  uint uVar28;
  double *pdVar29;
  byte *pbVar30;
  long lVar31;
  uint uVar32;
  uint uVar33;
  char *pcVar34;
  char *pcVar35;
  char *local_1a00;
  undefined8 local_19f0;
  undefined8 uStack_19e8;
  undefined8 uStack_19e0;
  undefined8 uStack_19d8;
  byte local_19c8 [323];
  byte local_1885 [5];
  uint local_1880 [2];
  double adStack_1878 [255];
  uint local_1080 [2];
  undefined8 local_1078;
  long local_1070 [510];
  long local_80;
  
  lVar3 = tpidr_el0;
  local_80 = *(long *)(lVar3 + 0x28);
  pdVar25 = (double *)*param_4;
  lVar31 = param_4[1];
  lVar24 = param_4[2];
  iVar27 = *(int *)(param_4 + 3);
  iVar7 = *(int *)((long)param_4 + 0x1c);
  iVar20 = 0;
  iVar8 = 0;
  uVar28 = 0;
  uVar21 = 0xffffffff;
  local_19f0 = 0;
  uStack_19e8 = 0;
LAB_009290f0:
  pbVar26 = param_3;
  pbVar23 = param_3;
switchD_009291e0_caseD_21:
  do {
    if (*pbVar23 != 0x25) {
      if (*pbVar23 == 0) {
        if ((long)pbVar23 - (long)pbVar26 != 0) {
          if (0x7f < iVar20) goto LAB_0092a26c;
          lVar15 = (long)iVar20;
          iVar20 = iVar20 + 1;
          (local_1080 + lVar15 * 8 + 2)[0] = 0x100000;
          (local_1080 + lVar15 * 8 + 2)[1] = 0;
          local_1070[lVar15 * 4] = (long)pbVar26;
          local_1070[lVar15 * 4 + 1] = (long)pbVar23 - (long)pbVar26;
        }
        if ((int)uVar21 < 0) goto LAB_009298b0;
        pdVar29 = adStack_1878;
        uVar18 = 0;
        goto LAB_00929790;
      }
      pbVar23 = pbVar23 + 1;
      goto switchD_009291e0_caseD_21;
    }
    pbVar30 = pbVar23 + 1;
    bVar6 = *pbVar30;
    uVar16 = (uint)bVar6;
    if (bVar6 != 0x25) {
      if (iVar8 == 1) {
        uVar16 = 0xffffffff;
        param_3 = pbVar30;
      }
      else {
        pbVar12 = pbVar30;
        if (bVar6 - 0x30 < 10) {
          iVar14 = 0;
          pbVar23 = pbVar23 + 2;
          do {
            if (iVar14 < 0x80) {
              iVar14 = iVar14 * 10 + uVar16 + -0x30;
            }
            param_3 = pbVar23 + 1;
            uVar16 = (uint)*pbVar23;
            pbVar23 = param_3;
          } while (uVar16 - 0x30 < 10);
          if ((((iVar14 != 0) && (iVar14 < 0x81)) && (uVar16 == 0x24)) &&
             (pbVar12 = param_3, 0 < iVar14)) {
            uVar16 = iVar14 - 1;
            iVar8 = 2;
            goto LAB_009291b0;
          }
        }
        param_3 = pbVar12;
        if (iVar8 == 2) goto LAB_0092a26c;
        iVar8 = 1;
        uVar16 = 0xffffffff;
      }
LAB_009291b0:
      uVar17 = 0;
      uVar19 = 0;
      uVar18 = 0;
LAB_009291c4:
      pbVar23 = param_3;
      param_3 = pbVar23 + 1;
      uVar32 = (uint)*pbVar23;
      uVar33 = uVar17;
      switch(*pbVar23) {
      case 0x20:
        uVar17 = uVar17 | 1;
        goto LAB_009291c4;
      default:
        goto switchD_009291e0_caseD_21;
      case 0x23:
        uVar17 = uVar17 | 8;
        goto LAB_009291c4;
      case 0x2a:
        uVar17 = uVar17 | 0x4000;
        uVar18 = 0xffffffff;
        if (iVar8 == 2) {
          uVar33 = (uint)*param_3;
          if (9 < *param_3 - 0x30) goto LAB_0092a26c;
          iVar14 = 0;
          pbVar23 = pbVar23 + 2;
          do {
            if (iVar14 < 0x80) {
              iVar14 = iVar14 * 10 + uVar33 + -0x30;
            }
            param_3 = pbVar23 + 1;
            uVar33 = (uint)*pbVar23;
            pbVar23 = param_3;
          } while (uVar33 - 0x30 < 10);
          if (((iVar14 == 0) || (0x80 < iVar14)) || (uVar33 != 0x24)) goto LAB_0092a26c;
          uVar18 = (ulong)(iVar14 - 1);
          if (iVar14 < 1) goto LAB_0092a26c;
        }
        goto LAB_009291c4;
      case 0x2b:
        uVar17 = uVar17 | 2;
        goto LAB_009291c4;
      case 0x2d:
        uVar17 = uVar17 & 0xfffffeff | 4;
        goto LAB_009291c4;
      case 0x2e:
        bVar6 = *param_3;
        if (bVar6 == 0x2a) {
          uVar17 = uVar17 | 0x10000;
          pbVar12 = pbVar23 + 2;
          if (iVar8 == 2) {
            uVar33 = (uint)*pbVar12;
            if (9 < *pbVar12 - 0x30) goto LAB_0092a26c;
            iVar14 = 0;
            pbVar23 = pbVar23 + 3;
            do {
              if (iVar14 < 0x80) {
                iVar14 = iVar14 * 10 + uVar33 + -0x30;
              }
              pbVar12 = pbVar23 + 1;
              uVar33 = (uint)*pbVar23;
              pbVar23 = pbVar12;
            } while (uVar33 - 0x30 < 10);
            if (((iVar14 == 0) || (0x80 < iVar14)) ||
               ((uVar33 != 0x24 || (uVar19 = (ulong)(iVar14 - 1), iVar14 < 1)))) goto LAB_0092a26c;
          }
          else {
            uVar19 = 0xffffffff;
          }
        }
        else {
          lVar15 = 1;
          if (bVar6 == 0x2d) {
            lVar15 = 2;
          }
          uVar33 = (uint)pbVar23[lVar15];
          pbVar12 = pbVar23 + 2;
          if (bVar6 != 0x2d) {
            pbVar12 = param_3;
          }
          if (pbVar23[lVar15] - 0x30 < 10) {
            uVar32 = 0;
            do {
              if (0xccccccc < (int)uVar32) goto LAB_0092a26c;
              iVar14 = uVar32 * 10 + uVar33;
              pbVar12 = pbVar12 + 1;
              uVar33 = (uint)*pbVar12;
              uVar32 = iVar14 - 0x30;
            } while (uVar33 - 0x30 < 10);
          }
          else {
            uVar32 = 0;
          }
          uVar17 = uVar17 | 0x8000;
          uVar33 = -uVar32;
          if (bVar6 != 0x2d) {
            uVar33 = uVar32;
          }
          uVar19 = (ulong)uVar33;
        }
        param_3 = pbVar12;
        if ((~uVar17 & 0x18000) == 0) goto LAB_0092a26c;
        goto LAB_009291c4;
      case 0x30:
        uVar17 = (uVar17 << 6 ^ 0xffffffff) & 0x100 | uVar17;
      case 0x31:
      case 0x32:
      case 0x33:
      case 0x34:
      case 0x35:
      case 0x36:
      case 0x37:
      case 0x38:
      case 0x39:
        uVar18 = 0;
        uVar17 = uVar17 | 0x2000;
        do {
          if (0xccccccc < (int)uVar18) goto LAB_0092a26c;
          iVar14 = (int)uVar18 * 10 + uVar32;
          pbVar23 = pbVar23 + 1;
          uVar32 = (uint)*pbVar23;
          uVar18 = (ulong)(iVar14 - 0x30);
        } while (uVar32 - 0x30 < 10);
        param_3 = pbVar23;
        goto LAB_009291c4;
      case 0x45:
        uVar33 = 0x41000;
        goto LAB_009294e8;
      case 0x47:
        uVar33 = 0x81000;
LAB_009294e8:
        lVar15 = (long)pbVar30 - (long)pbVar26;
        uVar17 = uVar17 | uVar33;
        goto LAB_009294f0;
      case 0x4c:
        uVar17 = uVar17 | 0x80;
        goto LAB_009291c4;
      case 0x4f:
      case 0x7a:
        uVar17 = uVar17 | 0x20;
        goto LAB_009291c4;
      case 0x53:
        uVar32 = 0;
        pbVar30 = pbVar30 + (-1 - (long)pbVar26);
        uVar33 = uVar17 | 8;
        goto joined_r0x00929538;
      case 0x58:
        uVar33 = 0x1a00;
        goto LAB_0092956c;
      case 99:
        uVar33 = uVar17 | 0x20000;
        goto LAB_00929514;
      case 100:
      case 0x69:
        pbVar30 = pbVar30 + (-1 - (long)pbVar26);
        if ((uVar17 >> 6 & 1) == 0) {
          uVar32 = (uVar17 >> 5 & 1) + 3;
        }
        else {
          uVar32 = 5;
        }
        goto joined_r0x00929538;
      case 0x65:
        lVar15 = (long)pbVar30 - (long)pbVar26;
        uVar17 = uVar17 | 0x40000;
        goto LAB_009294f0;
      case 0x66:
        lVar15 = (long)pbVar30 - (long)pbVar26;
        goto LAB_009294f0;
      case 0x67:
        lVar15 = (long)pbVar30 - (long)pbVar26;
        uVar17 = uVar17 | 0x80000;
LAB_009294f0:
        pbVar30 = (byte *)(lVar15 + -1);
        uVar32 = 9;
        uVar33 = uVar17;
        goto joined_r0x00929538;
      case 0x68:
        uVar17 = uVar17 | 0x10;
        goto LAB_009291c4;
      case 0x6c:
        if ((uVar17 >> 5 & 1) == 0) {
          uVar17 = uVar17 | 0x20;
        }
        else {
          uVar17 = uVar17 | 0x40;
        }
        goto LAB_009291c4;
      case 0x6e:
        uVar32 = 2;
        break;
      case 0x6f:
        uVar33 = uVar17 | 0x400;
LAB_00929514:
        uVar32 = 3;
        uVar17 = uVar33;
        break;
      case 0x70:
        uVar32 = 1;
        break;
      case 0x71:
        goto switchD_009291e0_caseD_71;
      case 0x73:
        uVar32 = 0;
        break;
      case 0x75:
        if ((uVar17 >> 6 & 1) == 0) {
          uVar32 = uVar17 >> 5 & 1 | 6;
        }
        else {
          uVar32 = 8;
        }
        uVar33 = uVar17 | 0x200;
        break;
      case 0x78:
        uVar33 = 0xa00;
LAB_0092956c:
        uVar33 = uVar17 | uVar33;
        uVar32 = 6;
      }
      pbVar30 = pbVar30 + (-1 - (long)pbVar26);
joined_r0x00929538:
      if ((uVar17 >> 0xe & 1) != 0) {
        uVar17 = (uint)uVar18;
        if ((int)uVar17 < 0) {
          uVar18 = (ulong)uVar28;
          uVar28 = uVar28 + 1;
        }
        else if ((1 << (ulong)(uVar17 & 7) & (uint)local_19c8[(ulong)(uVar17 >> 3) - 0x28]) != 0)
        goto LAB_0092a26c;
        uVar17 = (uint)uVar18;
        if (0x7f < (int)uVar17) goto LAB_0092a26c;
        if ((int)uVar21 <= (int)uVar17) {
          uVar21 = uVar17;
        }
        *(undefined4 *)((long)local_1880 + (-(uVar18 >> 0x1f) & 0xfffffff000000000 | uVar18 << 4)) =
             0xb;
        uVar1 = uVar17 + 7;
        if (-1 < (int)uVar17) {
          uVar1 = uVar17;
        }
        lVar15 = (long)((ulong)uVar1 << 0x20) >> 0x23;
        local_19c8[lVar15 + -0x28] = local_19c8[lVar15 + -0x28] | (byte)(1 << (ulong)(uVar17 & 7));
      }
      if ((uVar33 >> 0x10 & 1) != 0) {
        uVar17 = (uint)uVar19;
        if ((int)uVar17 < 0) {
          uVar19 = (ulong)uVar28;
          uVar28 = uVar28 + 1;
        }
        else if ((1 << (ulong)(uVar17 & 7) & (uint)local_19c8[(ulong)(uVar17 >> 3) - 0x28]) != 0)
        goto LAB_0092a26c;
        uVar17 = (uint)uVar19;
        if (0x7f < (int)uVar17) goto LAB_0092a26c;
        if ((int)uVar21 <= (int)uVar17) {
          uVar21 = uVar17;
        }
        *(undefined4 *)((long)local_1880 + (-(uVar19 >> 0x1f) & 0xfffffff000000000 | uVar19 << 4)) =
             0xc;
        uVar1 = uVar17 + 7;
        if (-1 < (int)uVar17) {
          uVar1 = uVar17;
        }
        lVar15 = (long)((ulong)uVar1 << 0x20) >> 0x23;
        local_19c8[lVar15 + -0x28] = local_19c8[lVar15 + -0x28] | (byte)(1 << (ulong)(uVar17 & 7));
      }
      uVar17 = uVar28;
      if (-1 < (int)uVar16) {
        uVar17 = uVar16;
      }
      if (0x7f < (int)uVar17) goto LAB_0092a26c;
      uVar1 = uVar17 + 7;
      if (-1 < (int)uVar17) {
        uVar1 = uVar17;
      }
      lVar15 = (long)((ulong)uVar1 << 0x20) >> 0x23;
      bVar6 = local_19c8[lVar15 + -0x28];
      *(uint *)((long)local_1880 +
               (-(ulong)(uVar17 >> 0x1f) & 0xfffffff000000000 | (ulong)uVar17 << 4)) = uVar32;
      local_19c8[lVar15 + -0x28] = bVar6 | (byte)(1 << (ulong)(uVar17 & 7));
      if (0x7f < iVar20) goto LAB_0092a26c;
      uVar28 = uVar28 - ((int)uVar16 >> 0x1f);
      lVar15 = (long)iVar20;
      iVar20 = iVar20 + 1;
      if ((int)uVar21 <= (int)uVar17) {
        uVar21 = uVar17;
      }
      local_1080[lVar15 * 8 + 2] = uVar33;
      *(uint *)((long)local_1070 + lVar15 * 0x20 + -4) = uVar17;
      local_1080[lVar15 * 8] = (uint)uVar18;
      local_1080[lVar15 * 8 + 1] = (uint)uVar19;
      local_1070[lVar15 * 4] = (long)pbVar26;
      local_1070[lVar15 * 4 + 1] = (long)pbVar30;
      goto LAB_009290f0;
    }
    if (pbVar30 + (-1 - (long)pbVar26) != (byte *)0x0) {
      if (0x7f < iVar20) goto LAB_0092a26c;
      lVar15 = (long)iVar20;
      iVar20 = iVar20 + 1;
      (local_1080 + lVar15 * 8 + 2)[0] = 0x100000;
      (local_1080 + lVar15 * 8 + 2)[1] = 0;
      local_1070[lVar15 * 4] = (long)pbVar26;
      local_1070[lVar15 * 4 + 1] = (long)(pbVar30 + (-1 - (long)pbVar26));
    }
    pbVar23 = pbVar23 + 2;
    pbVar26 = pbVar30;
  } while( true );
switchD_009291e0_caseD_71:
  uVar17 = uVar17 | 0x40;
  goto LAB_009291c4;
LAB_00929790:
  do {
    if ((1 << (ulong)((uint)uVar18 & 7) & (uint)local_19c8[(uVar18 >> 3 & 0x1fffffff) - 0x28]) == 0)
    goto LAB_0092a26c;
    pdVar13 = pdVar25;
    switch(*(undefined4 *)(pdVar29 + -1)) {
    case 0:
    case 1:
    case 2:
    case 4:
    case 5:
    case 7:
    case 8:
      if (iVar27 < 0) {
        iVar8 = iVar27 + 8;
        if (0 < iVar8) goto LAB_009297e4;
        pdVar25 = (double *)(lVar31 + iVar27);
      }
      else {
        iVar8 = iVar27;
LAB_009297e4:
        pdVar13 = pdVar25 + 1;
      }
      dVar11 = *pdVar25;
      iVar27 = iVar8;
      break;
    case 3:
    case 0xb:
    case 0xc:
      if (iVar27 < 0) {
        iVar8 = iVar27 + 8;
        if (0 < iVar8) goto LAB_009297fc;
        pdVar25 = (double *)(lVar31 + iVar27);
      }
      else {
        iVar8 = iVar27;
LAB_009297fc:
        pdVar13 = pdVar25 + 1;
      }
      dVar11 = (double)(long)(int)*(uint *)pdVar25;
      iVar27 = iVar8;
      break;
    case 6:
      if (iVar27 < 0) {
        iVar8 = iVar27 + 8;
        if (0 < iVar8) goto LAB_0092984c;
        pdVar25 = (double *)(lVar31 + iVar27);
        iVar27 = iVar8;
      }
      else {
        iVar8 = iVar27;
LAB_0092984c:
        pdVar13 = pdVar25 + 1;
        iVar27 = iVar8;
      }
      dVar11 = (double)(ulong)*(uint *)pdVar25;
      break;
    case 9:
      if (iVar7 < 0) {
        iVar8 = iVar7 + 0x10;
        if (0 < iVar8) goto LAB_00929880;
        pdVar25 = (double *)(lVar24 + iVar7);
        iVar7 = iVar8;
      }
      else {
        iVar8 = iVar7;
LAB_00929880:
        pdVar13 = pdVar25 + 1;
        iVar7 = iVar8;
      }
      dVar11 = *pdVar25;
      break;
    default:
      goto switchD_009297bc_caseD_a;
    }
    *pdVar29 = dVar11;
switchD_009297bc_caseD_a:
    pdVar29 = pdVar29 + 2;
    bVar5 = (long)uVar18 < (long)(int)uVar21;
    pdVar25 = pdVar13;
    uVar18 = uVar18 + 1;
  } while (bVar5);
LAB_009298b0:
  if (iVar20 < 1) {
LAB_0092a26c:
    iVar27 = 0;
  }
  else {
    pbVar26 = (byte *)((ulong)&local_19f0 | 1);
    pbVar23 = (byte *)((ulong)&local_19f0 | 2);
    lVar31 = 0;
    iVar27 = 0;
    local_1a00 = "0123456789abcdefghijklmnopqrstuvwxyz";
    do {
      pcVar35 = "0123456789abcdefghijklmnopqrstuvwxyz";
      lVar24 = local_1070[lVar31 * 4 + 1];
      uVar28 = local_1080[lVar31 * 8 + 2];
      if (lVar24 != 0) {
        pcVar34 = (char *)local_1070[lVar31 * 4];
        do {
          if (*pcVar34 == '\0') break;
          iVar7 = (*param_2)(*pcVar34,param_1);
          if (iVar7 != 0) goto LAB_0092a270;
          pcVar34 = pcVar34 + 1;
          lVar24 = lVar24 + -1;
          iVar27 = iVar27 + 1;
        } while (lVar24 != 0);
        if ((uVar28 >> 0x14 & 1) == 0) goto LAB_00929948;
        goto LAB_0092a258;
      }
LAB_00929948:
      uVar16 = local_1080[lVar31 * 8];
      uVar21 = uVar16;
      if ((uVar28 >> 0xe & 1) == 0) {
        if ((uVar28 >> 0x10 & 1) != 0) goto LAB_0092995c;
LAB_009299a4:
        if ((uVar28 >> 0xf & 1) == 0) {
          uVar17 = 0xffffffff;
        }
        else {
          uVar17 = local_1080[lVar31 * 8 + 1];
        }
      }
      else {
        uVar17 = *(uint *)(adStack_1878 + (long)(int)uVar16 * 2);
        uVar21 = uVar17;
        if ((int)uVar17 < 0) {
          uVar21 = 0x7fffffff;
          if (uVar17 != 0x80000000) {
            uVar21 = -uVar17;
          }
          uVar28 = uVar28 & 0xfffffeff | 4;
        }
        if ((uVar28 >> 0x10 & 1) == 0) goto LAB_009299a4;
LAB_0092995c:
        uVar17 = *(uint *)(adStack_1878 + (long)(int)local_1080[lVar31 * 8 + 1] * 2);
        if ((int)uVar17 < 0) {
          uVar17 = 0xffffffff;
        }
      }
      uVar18 = (ulong)*(uint *)((long)local_1070 + lVar31 * 0x20 + -4);
      if (9 < local_1880[uVar18 * 4]) goto LAB_0092a258;
      uVar33 = uVar28 & 8;
      switch(local_1880[uVar18 * 4]) {
      case 0:
        pcVar35 = (char *)adStack_1878[uVar18 * 2];
        if (pcVar35 == (char *)0x0) {
          if ((uVar17 != 0xffffffff) && ((int)uVar17 < 5)) {
            uVar18 = 0;
            pcVar35 = "";
            uVar19 = 0;
            goto joined_r0x00929fa4;
          }
          uVar33 = 0;
          uVar28 = uVar28 & 0xfffffff7;
          uVar18 = 5;
          pcVar35 = "(nil)";
          iVar7 = 5;
        }
        else {
          if (uVar17 == 0xffffffff) {
            if (*pcVar35 == '\0') {
              uVar18 = 0;
              uVar19 = uVar18;
              goto joined_r0x00929fa4;
            }
            uVar18 = strlen(pcVar35);
          }
          else {
            uVar18 = (ulong)(int)uVar17;
          }
          uVar19 = uVar18;
          if (0x7ffffffe < uVar18) {
            uVar19 = 0x7fffffff;
          }
joined_r0x00929fa4:
          iVar7 = (int)uVar19;
          if (uVar33 != 0) {
            iVar8 = (*param_2)(0x22,param_1);
            if (iVar8 != 0) goto LAB_0092a270;
            iVar27 = iVar27 + 1;
          }
        }
        iVar7 = uVar21 - iVar7;
        if ((uVar28 >> 2 & 1) == 0) {
          while (bVar5 = 0 < iVar7, iVar7 = iVar7 + -1, bVar5) {
            iVar8 = (*param_2)(0x20,param_1);
            if (iVar8 != 0) goto LAB_0092a270;
            iVar27 = iVar27 + 1;
          }
        }
        for (; (uVar18 != 0 && (*pcVar35 != '\0')); pcVar35 = pcVar35 + 1) {
          iVar8 = (*param_2)(*pcVar35,param_1);
          if (iVar8 != 0) goto LAB_0092a270;
          uVar18 = uVar18 - 1;
          iVar27 = iVar27 + 1;
        }
        if (((uVar28 >> 2 & 1) != 0) && (0 < iVar7)) {
          iVar7 = iVar7 + 1;
          do {
            iVar8 = (*param_2)(0x20,param_1);
            if (iVar8 != 0) goto LAB_0092a270;
            iVar7 = iVar7 + -1;
            iVar27 = iVar27 + 1;
          } while (1 < iVar7);
        }
        if (uVar33 != 0) {
          iVar7 = (*param_2)(0x22,param_1);
          if (iVar7 != 0) goto LAB_0092a270;
          iVar27 = iVar27 + 1;
        }
        break;
      case 1:
        dVar11 = adStack_1878[uVar18 * 2];
        if (dVar11 != 0.0) {
          bVar5 = true;
          if ((uVar28 & 0x1000) != 0) {
            pcVar35 = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
          }
          goto LAB_00929c44;
        }
        if ((uVar28 >> 2 & 1) == 0) {
          iVar7 = uVar21 - 5;
        }
        else {
          iVar7 = uVar21 - 6;
          iVar8 = iVar7;
          if (5 < (int)uVar21) {
            do {
              iVar7 = (*param_2)(0x20,param_1);
              if (iVar7 != 0) goto LAB_0092a270;
              iVar7 = iVar8 + -1;
              iVar27 = iVar27 + 1;
              bVar5 = 0 < iVar8;
              iVar8 = iVar7;
            } while (bVar5);
          }
        }
        iVar8 = (*param_2)(0x28,param_1);
        if (iVar8 == 0) {
          iVar8 = (*param_2)(0x6e,param_1);
          if (iVar8 != 0) goto LAB_0092a2ac;
          iVar8 = (*param_2)(0x69,param_1);
          if (iVar8 == 0) {
            iVar8 = (*param_2)(0x6c,param_1);
            if (iVar8 == 0) {
              iVar8 = (*param_2)(0x29,param_1);
              if (iVar8 == 0) {
                iVar27 = iVar27 + 5;
                if ((0 < iVar7) && ((uVar28 >> 2 & 1) == 0)) {
                  iVar7 = iVar7 + 1;
                  do {
                    iVar8 = (*param_2)(0x20,param_1);
                    if (iVar8 != 0) goto LAB_0092a270;
                    iVar7 = iVar7 + -1;
                    iVar27 = iVar27 + 1;
                  } while (1 < iVar7);
                }
                break;
              }
              iVar27 = iVar27 + 4;
            }
            else {
              iVar27 = iVar27 + 3;
            }
          }
          else {
            iVar27 = iVar27 + 2;
          }
        }
        goto LAB_0092a270;
      case 2:
        if (((uVar28 >> 6 & 1) == 0) && ((uVar28 >> 5 & 1) == 0)) {
          if ((uVar28 >> 4 & 1) == 0) {
            *(int *)adStack_1878[uVar18 * 2] = iVar27;
          }
          else {
            *(short *)adStack_1878[uVar18 * 2] = (short)iVar27;
          }
        }
        else {
          *(long *)adStack_1878[uVar18 * 2] = (long)iVar27;
        }
        break;
      default:
        goto switchD_009299e4_caseD_3;
      case 6:
      case 7:
      case 8:
        uVar28 = uVar28 | 0x200;
switchD_009299e4_caseD_3:
        dVar11 = adStack_1878[uVar18 * 2];
        if ((uVar28 >> 0x11 & 1) == 0) {
          if ((uVar28 >> 10 & 1) == 0) {
            if ((uVar28 >> 0xb & 1) != 0) {
              if ((uVar28 & 0x1000) != 0) {
                pcVar35 = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
              }
              bVar5 = uVar33 != 0;
LAB_00929c44:
              dVar22 = 7.90505033345994e-323;
              local_1a00 = pcVar35;
              goto LAB_00929c48;
            }
            uVar16 = 0;
            dVar22 = dVar11;
            if ((uVar28 >> 9 & 1) == 0) {
              dVar22 = (double)-(long)dVar11;
              if (-1 < (long)dVar11) {
                dVar22 = dVar11;
              }
              uVar16 = (uint)((ulong)dVar11 >> 0x3f);
            }
            bVar5 = uVar33 != 0;
            if (uVar17 == 0xffffffff) {
              uVar17 = 1;
            }
            lVar24 = 0;
            if (dVar22 != 0.0) {
              do {
                bVar4 = 9 < (ulong)dVar22;
                local_1885[lVar24 + 1] = SUB81(dVar22,0) + (char)((ulong)dVar22 / 10) * -10 | 0x30;
                lVar24 = lVar24 + -1;
                dVar22 = (double)((ulong)dVar22 / 10);
              } while (bVar4);
            }
            dVar22 = 4.94065645841247e-323;
          }
          else {
            bVar5 = uVar33 != 0;
            dVar22 = 3.95252516672997e-323;
LAB_00929c48:
            if (uVar17 == 0xffffffff) {
              uVar17 = 1;
            }
            if (dVar11 == 0.0) {
              uVar16 = 0;
              lVar24 = 0;
            }
            else {
              lVar24 = 0;
              do {
                dVar2 = 0.0;
                if (dVar22 != 0.0) {
                  dVar2 = (double)((ulong)dVar11 / (ulong)dVar22);
                }
                local_1885[lVar24 + 1] = local_1a00[(long)dVar11 - (long)dVar2 * (long)dVar22];
                lVar24 = lVar24 + -1;
                bVar4 = (ulong)dVar22 <= (ulong)dVar11;
                dVar11 = dVar2;
              } while (bVar4);
              uVar16 = 0;
            }
          }
          iVar7 = uVar21 + (int)lVar24;
          iVar8 = uVar17 + (int)lVar24;
          if (((!bVar5) || (dVar22 != 3.95252516672997e-323)) || (0 < iVar8)) {
            if (0 < iVar8) {
              iVar7 = iVar7 - iVar8;
              pbVar30 = local_1885 + lVar24 + 1;
              lVar15 = lVar24;
              while (lVar24 = lVar15, local_19c8 <= pbVar30) {
                lVar24 = lVar15 + -1;
                local_1885[lVar15 + 1] = 0x30;
                if ((int)(uVar17 + (int)lVar15) < 2) break;
                pbVar30 = local_1885 + lVar15;
                lVar15 = lVar24;
              }
            }
          }
          else {
            iVar7 = iVar7 + -1;
            local_1885[lVar24 + 1] = 0x30;
            lVar24 = lVar24 + -1;
          }
          iVar8 = iVar7 + -2;
          if (!(bool)(bVar5 & dVar22 == 7.90505033345994e-323)) {
            iVar8 = iVar7;
          }
          iVar8 = iVar8 - (uVar16 | (uVar28 & 3) != 0);
          iVar7 = iVar8;
          if ((uVar28 & 0x104) == 0) {
            iVar7 = iVar8 + -1;
            iVar14 = iVar7;
            if (0 < iVar8) {
              do {
                iVar7 = (*param_2)(0x20,param_1);
                if (iVar7 != 0) goto LAB_0092a270;
                iVar7 = iVar14 + -1;
                iVar27 = iVar27 + 1;
                bVar4 = 0 < iVar14;
                iVar14 = iVar7;
              } while (bVar4);
            }
          }
          if (uVar16 == 0) {
            if ((uVar28 >> 1 & 1) != 0) {
              uVar10 = 0x2b;
              goto LAB_00929e00;
            }
            if ((uVar28 & 1) != 0) {
              uVar10 = 0x20;
              goto LAB_00929e00;
            }
          }
          else {
            uVar10 = 0x2d;
LAB_00929e00:
            iVar8 = (*param_2)(uVar10,param_1);
            if (iVar8 != 0) goto LAB_0092a270;
            iVar27 = iVar27 + 1;
          }
          if ((bool)(bVar5 & dVar22 == 7.90505033345994e-323)) {
            iVar8 = (*param_2)(0x30,param_1);
            if (iVar8 != 0) goto LAB_0092a270;
            if ((uVar28 >> 0xc & 1) == 0) {
              uVar10 = 0x78;
            }
            else {
              uVar10 = 0x58;
            }
            iVar8 = (*param_2)(uVar10,param_1);
            if (iVar8 != 0) {
LAB_0092a2ac:
              iVar27 = iVar27 + 1;
              goto LAB_0092a270;
            }
            iVar27 = iVar27 + 2;
          }
          iVar8 = iVar7;
          if ((uVar28 & 0x104) == 0x100) {
            iVar8 = iVar7 + -1;
            if (0 < iVar7) {
              do {
                iVar8 = iVar7;
                iVar7 = (*param_2)(0x30,param_1);
                if (iVar7 != 0) goto LAB_0092a270;
                iVar7 = iVar8 + -1;
                iVar27 = iVar27 + 1;
              } while (0 < iVar7);
              iVar8 = iVar8 + -2;
            }
          }
          if (lVar24 < 0) {
            lVar24 = lVar24 + 0x145;
            do {
              iVar7 = (*param_2)(local_19c8[lVar24],param_1);
              if (iVar7 != 0) goto LAB_0092a270;
              lVar15 = lVar24 + -0x145;
              lVar24 = lVar24 + 1;
              iVar27 = iVar27 + 1;
            } while (lVar15 < -1);
          }
          if (((uVar28 >> 2 & 1) != 0) && (0 < iVar8)) {
            iVar8 = iVar8 + 1;
            do {
              iVar7 = (*param_2)(0x20,param_1);
              if (iVar7 != 0) goto LAB_0092a270;
              iVar8 = iVar8 + -1;
              iVar27 = iVar27 + 1;
            } while (1 < iVar8);
          }
        }
        else {
          if ((uVar28 >> 2 & 1) == 0) {
            uVar16 = uVar21;
            if ((int)uVar21 < 2) {
              uVar21 = uVar21 - 1;
            }
            else {
              do {
                iVar7 = (*param_2)(0x20,param_1);
                if (iVar7 != 0) goto LAB_0092a270;
                uVar17 = uVar16 - 1;
                uVar21 = uVar16 - 2;
                iVar27 = iVar27 + 1;
                uVar16 = uVar17;
              } while (uVar21 != 0 && 0 < (int)uVar17);
            }
          }
          iVar7 = (*param_2)((ulong)dVar11 & 0xffffffff,param_1);
          if (iVar7 != 0) goto LAB_0092a270;
          iVar27 = iVar27 + 1;
          if (((uVar28 >> 2 & 1) != 0) && (1 < (int)uVar21)) {
            iVar7 = uVar21 + 1;
            do {
              iVar8 = (*param_2)(0x20,param_1);
              if (iVar8 != 0) goto LAB_0092a270;
              iVar7 = iVar7 + -1;
              iVar27 = iVar27 + 1;
            } while (2 < iVar7);
          }
        }
        break;
      case 9:
        uStack_19e8 = 0;
        local_19f0 = 0x25;
        uStack_19d8 = 0;
        uStack_19e0 = 0;
        sVar9 = strlen((char *)&local_19f0);
        if ((uVar28 & 0x2000) != 0) {
          uVar21 = uVar16;
        }
        if ((uVar28 >> 0xf & 1) == 0) {
          if ((uVar28 >> 2 & 1) == 0) goto LAB_00929b50;
LAB_00929f28:
          local_19f0._0_2_ = CONCAT11(0x2d,(char)local_19f0);
          pbVar30 = pbVar23;
          pbVar12 = pbVar23;
          if ((uVar28 >> 1 & 1) != 0) goto LAB_00929f3c;
LAB_00929b58:
          pbVar30 = pbVar12;
          if ((uVar28 & 1) == 0) goto LAB_00929b5c;
LAB_00929f48:
          pbVar30 = pbVar12 + 1;
          *pbVar12 = 0x20;
          lVar24 = 0x20 - sVar9;
          if (uVar33 != 0) goto LAB_00929f54;
LAB_00929b64:
          *pbVar30 = 0;
        }
        else {
          uVar17 = local_1080[lVar31 * 8 + 1];
          if ((uVar28 >> 2 & 1) != 0) goto LAB_00929f28;
LAB_00929b50:
          pbVar30 = pbVar26;
          pbVar12 = pbVar26;
          if ((uVar28 >> 1 & 1) == 0) goto LAB_00929b58;
LAB_00929f3c:
          pbVar12 = pbVar30 + 1;
          *pbVar30 = 0x2b;
          pbVar30 = pbVar12;
          if ((uVar28 & 1) != 0) goto LAB_00929f48;
LAB_00929b5c:
          lVar24 = 0x20 - sVar9;
          if (uVar33 == 0) goto LAB_00929b64;
LAB_00929f54:
          *pbVar30 = 0x23;
          pbVar30[1] = 0;
          pbVar30 = pbVar30 + 1;
        }
        if (-1 < (int)uVar21) {
          if (0x144 < (int)uVar21) {
            uVar21 = 0x145;
          }
          iVar7 = curl_msnprintf(pbVar30,lVar24,&DAT_002c6d41,uVar21);
          pbVar30 = pbVar30 + iVar7;
          lVar24 = lVar24 - iVar7;
        }
        if (-1 < (int)uVar17) {
          dVar11 = adStack_1878[uVar18 * 2];
          iVar7 = 0x144;
          if ((int)uVar17 <= (int)uVar21 && 0 < (int)uVar21) {
            iVar7 = 0x144 - uVar21;
          }
          for (; 10.0 <= dVar11; dVar11 = dVar11 / 10.0) {
            iVar7 = iVar7 + -1;
          }
          uVar21 = iVar7 - 1;
          if ((int)uVar17 <= iVar7) {
            uVar21 = uVar17;
          }
          iVar7 = curl_msnprintf(pbVar30,lVar24,&DAT_002bf1b1,
                                 uVar21 & ((int)uVar21 >> 0x1f ^ 0xffffffffU));
          pbVar30 = pbVar30 + iVar7;
        }
        pbVar12 = pbVar30;
        if ((uVar28 >> 5 & 1) != 0) {
          pbVar12 = pbVar30 + 1;
          *pbVar30 = 0x6c;
        }
        if ((uVar28 >> 0x12 & 1) == 0) {
          if ((uVar28 >> 0x13 & 1) != 0) {
            bVar6 = 0x67;
            goto LAB_0092a000;
          }
          bVar6 = 0x66;
        }
        else {
          bVar6 = 0x65;
LAB_0092a000:
          bVar6 = (byte)(uVar28 >> 7) & 0x20 ^ bVar6;
        }
        dVar11 = adStack_1878[uVar18 * 2];
        *pbVar12 = bVar6;
        pbVar12[1] = 0;
        snprintf((char *)local_19c8,0x146,(char *)&local_19f0,dVar11);
        if (local_19c8[0] != 0) {
          pbVar30 = (byte *)((ulong)local_19c8 | 1);
          bVar6 = local_19c8[0];
          do {
            iVar7 = (*param_2)(bVar6,param_1);
            if (iVar7 != 0) goto LAB_0092a270;
            bVar6 = *pbVar30;
            iVar27 = iVar27 + 1;
            pbVar30 = pbVar30 + 1;
          } while (bVar6 != 0);
        }
      }
LAB_0092a258:
      lVar31 = lVar31 + 1;
    } while (lVar31 < iVar20);
  }
LAB_0092a270:
  if (*(long *)(lVar3 + 0x28) != local_80) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar27;
}

