/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0087cbdc
 */

void FUN_0087cbdc(undefined8 *param_1,undefined8 param_2,undefined4 param_3,int *param_4,
                 ulong param_5,uint param_6)

{
  int iVar1;
  uint uVar2;
  long lVar3;
  bool bVar4;
  ulong uVar5;
  long lVar6;
  char *pcVar7;
  int iVar8;
  int iVar9;
  double *pdVar10;
  undefined4 uVar11;
  undefined4 uVar12;
  undefined4 uVar13;
  byte bVar14;
  uint uVar15;
  undefined8 uVar16;
  double dVar17;
  undefined8 uVar18;
  double dVar19;
  double dVar20;
  undefined8 uVar21;
  double dVar22;
  undefined8 local_d0;
  undefined8 uStack_c8;
  undefined8 uStack_c0;
  undefined8 uStack_b8;
  undefined8 local_b0;
  undefined8 uStack_a8;
  undefined8 uStack_a0;
  undefined8 uStack_98;
  undefined8 local_90;
  undefined8 uStack_88;
  undefined8 uStack_80;
  undefined8 uStack_78;
  undefined8 local_70;
  undefined8 uStack_68;
  undefined8 uStack_60;
  undefined8 uStack_58;
  long local_48;
  
  lVar3 = tpidr_el0;
  local_48 = *(long *)(lVar3 + 0x28);
  switch(param_3) {
  case 2:
    if ((param_5 == 1) && (*param_4 == 3)) {
      dVar17 = *(double *)(param_4 + 2);
      *(undefined4 *)param_1 = 3;
      dVar17 = ABS(dVar17);
LAB_0087d9b4:
      *(undefined8 *)((long)param_1 + 0xc) = 0;
      *(undefined8 *)((long)param_1 + 4) = 0;
      *(undefined8 *)((long)param_1 + 0x1c) = 0;
      *(undefined8 *)((long)param_1 + 0x14) = 0;
      *(undefined4 *)((long)param_1 + 0x24) = 0;
LAB_0087d9c0:
      param_1[1] = dVar17;
LAB_0087d9c4:
      if (*(long *)(lVar3 + 0x28) == local_48) {
        return;
      }
      goto LAB_0087db88;
    }
    break;
  case 3:
    if ((param_5 == 1) && (*param_4 == 3)) {
      dVar17 = acos(*(double *)(param_4 + 2));
      uVar11 = SUB84(dVar17,0);
      uVar12 = (undefined4)((ulong)dVar17 >> 0x20);
LAB_0087d690:
      dVar20 = (double)CONCAT44(uVar12,uVar11);
      *(undefined4 *)((long)param_1 + 0x24) = 0;
      *(undefined4 *)param_1 = 3;
LAB_0087d6a0:
      *(undefined8 *)((long)param_1 + 0xc) = 0;
      *(undefined8 *)((long)param_1 + 4) = 0;
      *(undefined8 *)((long)param_1 + 0x1c) = 0;
      *(undefined8 *)((long)param_1 + 0x14) = 0;
      param_1[1] = dVar20;
      goto LAB_0087d9c4;
    }
    break;
  case 4:
    if ((param_5 == 1) && (*param_4 == 3)) {
      dVar17 = asin(*(double *)(param_4 + 2));
      uVar11 = SUB84(dVar17,0);
      uVar12 = (undefined4)((ulong)dVar17 >> 0x20);
      goto LAB_0087d690;
    }
    break;
  case 5:
    if (((param_5 == 2) && (*param_4 == 3)) && (param_4[10] == 3)) {
      dVar17 = atan2(*(double *)(param_4 + 2),*(double *)(param_4 + 0xc));
      uVar11 = SUB84(dVar17,0);
      uVar12 = (undefined4)((ulong)dVar17 >> 0x20);
      goto LAB_0087d690;
    }
    break;
  case 6:
    if ((param_5 == 1) && (*param_4 == 3)) {
      dVar17 = atan(*(double *)(param_4 + 2));
      uVar11 = SUB84(dVar17,0);
      uVar12 = (undefined4)((ulong)dVar17 >> 0x20);
      goto LAB_0087d690;
    }
    break;
  case 7:
    if ((param_5 == 1) && (*param_4 == 3)) {
      dVar17 = *(double *)(param_4 + 2);
      *(undefined4 *)param_1 = 3;
      dVar17 = (double)(long)dVar17;
      goto LAB_0087d9b4;
    }
    break;
  case 8:
    if ((param_5 == 1) && (*param_4 == 3)) {
      dVar17 = cosh(*(double *)(param_4 + 2));
      uVar11 = SUB84(dVar17,0);
      uVar12 = (undefined4)((ulong)dVar17 >> 0x20);
      goto LAB_0087d690;
    }
    break;
  case 9:
    if ((param_5 == 1) && (*param_4 == 3)) {
      dVar17 = cos(*(double *)(param_4 + 2));
      uVar11 = SUB84(dVar17,0);
      uVar12 = (undefined4)((ulong)dVar17 >> 0x20);
      goto LAB_0087d690;
    }
    break;
  case 10:
    if ((param_5 == 1) && (*param_4 == 3)) {
      dVar17 = *(double *)(param_4 + 2) / 0.017453292519943295;
LAB_0087cf74:
      *(undefined4 *)param_1 = 3;
      *(undefined8 *)((long)param_1 + 0xc) = 0;
      *(undefined8 *)((long)param_1 + 4) = 0;
      *(undefined8 *)((long)param_1 + 0x1c) = 0;
      *(undefined8 *)((long)param_1 + 0x14) = 0;
LAB_0087cf80:
      *(undefined4 *)((long)param_1 + 0x24) = 0;
      param_1[1] = dVar17;
      goto LAB_0087d9c4;
    }
    break;
  case 0xb:
    if ((param_5 == 1) && (*param_4 == 3)) {
      dVar17 = exp(*(double *)(param_4 + 2));
      uVar11 = SUB84(dVar17,0);
      uVar12 = (undefined4)((ulong)dVar17 >> 0x20);
      goto LAB_0087d690;
    }
    break;
  case 0xc:
    if ((param_5 == 1) && (*param_4 == 3)) {
      dVar17 = *(double *)(param_4 + 2);
      *(undefined4 *)param_1 = 3;
      dVar17 = (double)(long)dVar17;
      goto LAB_0087d9b4;
    }
    break;
  case 0xd:
    if (((param_5 == 2) && (*param_4 == 3)) && (param_4[10] == 3)) {
      dVar17 = fmod(*(double *)(param_4 + 2),*(double *)(param_4 + 0xc));
      uVar11 = SUB84(dVar17,0);
      uVar12 = (undefined4)((ulong)dVar17 >> 0x20);
      goto LAB_0087d690;
    }
    break;
  case 0xf:
    if (((param_5 == 2) && (*param_4 == 3)) && (param_4[10] == 3)) {
      dVar17 = ldexp(*(double *)(param_4 + 2),(int)*(double *)(param_4 + 0xc));
      uVar11 = SUB84(dVar17,0);
      uVar12 = (undefined4)((ulong)dVar17 >> 0x20);
      goto LAB_0087d690;
    }
    break;
  case 0x10:
    if ((param_5 == 1) && (*param_4 == 3)) {
      uVar11 = (undefined4)*(undefined8 *)(param_4 + 2);
      uVar12 = (undefined4)((ulong)*(undefined8 *)(param_4 + 2) >> 0x20);
LAB_0087cef8:
      dVar17 = log10((double)CONCAT44(uVar12,uVar11));
      uVar11 = SUB84(dVar17,0);
      uVar12 = (undefined4)((ulong)dVar17 >> 0x20);
      goto LAB_0087d690;
    }
    break;
  case 0x11:
    if (param_5 == 2) {
      if ((*param_4 == 3) && (param_4[10] == 3)) {
        dVar17 = *(double *)(param_4 + 0xc);
        if (dVar17 == 2.0) {
          dVar17 = log2(*(double *)(param_4 + 2));
          uVar11 = SUB84(dVar17,0);
          uVar12 = (undefined4)((ulong)dVar17 >> 0x20);
          goto LAB_0087d690;
        }
        dVar20 = *(double *)(param_4 + 2);
        uVar11 = SUB84(dVar20,0);
        uVar12 = (undefined4)((ulong)dVar20 >> 0x20);
        if (dVar17 == 10.0) goto LAB_0087cef8;
        dVar20 = log(dVar20);
        dVar17 = log(dVar17);
        dVar20 = dVar20 / dVar17;
        *(undefined4 *)param_1 = 3;
        *(undefined4 *)((long)param_1 + 0x24) = 0;
        goto LAB_0087d6a0;
      }
    }
    else if ((param_5 == 1) && (*param_4 == 3)) {
      dVar17 = log(*(double *)(param_4 + 2));
      uVar11 = SUB84(dVar17,0);
      uVar12 = (undefined4)((ulong)dVar17 >> 0x20);
      goto LAB_0087d690;
    }
    break;
  case 0x12:
    if ((param_5 != 0) && (*param_4 == 3)) {
      dVar17 = *(double *)(param_4 + 2);
      lVar6 = param_5 - 1;
      if (lVar6 != 0) {
        pdVar10 = (double *)(param_4 + 0xc);
        do {
          if (*(int *)(pdVar10 + -1) != 3) goto switchD_0087cc20_caseD_e;
          dVar20 = *pdVar10;
          if (*pdVar10 <= dVar17) {
            dVar20 = dVar17;
          }
          dVar17 = dVar20;
          lVar6 = lVar6 + -1;
          pdVar10 = pdVar10 + 5;
        } while (lVar6 != 0);
      }
LAB_0087d5f0:
      *(undefined4 *)((long)param_1 + 0x24) = 0;
      *(undefined4 *)param_1 = 3;
      *(undefined8 *)((long)param_1 + 0xc) = 0;
      *(undefined8 *)((long)param_1 + 4) = 0;
      *(undefined8 *)((long)param_1 + 0x1c) = 0;
      *(undefined8 *)((long)param_1 + 0x14) = 0;
      param_1[1] = dVar17;
      goto LAB_0087d9c4;
    }
    break;
  case 0x13:
    if ((param_5 != 0) && (*param_4 == 3)) {
      dVar17 = *(double *)(param_4 + 2);
      lVar6 = param_5 - 1;
      if (lVar6 != 0) {
        pdVar10 = (double *)(param_4 + 0xc);
        do {
          if (*(int *)(pdVar10 + -1) != 3) goto switchD_0087cc20_caseD_e;
          dVar20 = *pdVar10;
          if (dVar17 <= *pdVar10) {
            dVar20 = dVar17;
          }
          dVar17 = dVar20;
          lVar6 = lVar6 + -1;
          pdVar10 = pdVar10 + 5;
        } while (lVar6 != 0);
      }
      goto LAB_0087d5f0;
    }
    break;
  case 0x15:
    if (((param_5 == 2) && (*param_4 == 3)) && (param_4[10] == 3)) {
      dVar17 = pow(*(double *)(param_4 + 2),*(double *)(param_4 + 0xc));
      uVar11 = SUB84(dVar17,0);
      uVar12 = (undefined4)((ulong)dVar17 >> 0x20);
      goto LAB_0087d690;
    }
    break;
  case 0x16:
    if ((param_5 == 1) && (*param_4 == 3)) {
      dVar17 = *(double *)(param_4 + 2) * 0.017453292519943295;
LAB_0087d450:
      *(undefined4 *)param_1 = 3;
      goto LAB_0087d9b4;
    }
    break;
  case 0x17:
    if ((param_5 == 1) && (*param_4 == 3)) {
      dVar17 = sinh(*(double *)(param_4 + 2));
      uVar11 = SUB84(dVar17,0);
      uVar12 = (undefined4)((ulong)dVar17 >> 0x20);
      goto LAB_0087d690;
    }
    break;
  case 0x18:
    if ((param_5 == 1) && (*param_4 == 3)) {
      dVar17 = sin(*(double *)(param_4 + 2));
      uVar11 = SUB84(dVar17,0);
      uVar12 = (undefined4)((ulong)dVar17 >> 0x20);
      goto LAB_0087d690;
    }
    break;
  case 0x19:
    if ((param_5 == 1) && (*param_4 == 3)) {
      dVar17 = SQRT(*(double *)(param_4 + 2));
      goto LAB_0087cf74;
    }
    break;
  case 0x1a:
    if ((param_5 == 1) && (*param_4 == 3)) {
      dVar17 = tanh(*(double *)(param_4 + 2));
      uVar11 = SUB84(dVar17,0);
      uVar12 = (undefined4)((ulong)dVar17 >> 0x20);
      goto LAB_0087d690;
    }
    break;
  case 0x1b:
    if ((param_5 == 1) && (*param_4 == 3)) {
      dVar17 = tan(*(double *)(param_4 + 2));
      uVar11 = SUB84(dVar17,0);
      uVar12 = (undefined4)((ulong)dVar17 >> 0x20);
      goto LAB_0087d690;
    }
    break;
  case 0x1c:
    if ((((param_5 == 2) && (*param_4 == 3)) && (param_4[10] == 3)) &&
       ((uint)(int)*(double *)(param_4 + 0xc) < 0x20)) {
      uVar15 = (int)(long)*(double *)(param_4 + 2) >> ((int)*(double *)(param_4 + 0xc) & 0x1fU);
LAB_0087d9a8:
      dVar17 = (double)uVar15;
      *(undefined4 *)param_1 = 3;
      goto LAB_0087d9b4;
    }
    break;
  case 0x1d:
    if ((param_5 != 0) && (*param_4 == 3)) {
      lVar6 = param_5 - 1;
      uVar5 = (ulong)*(double *)(param_4 + 2);
      if (lVar6 != 0) {
        pdVar10 = (double *)(param_4 + 0xc);
        do {
          if (*(int *)(pdVar10 + -1) != 3) goto switchD_0087cc20_caseD_e;
          lVar6 = lVar6 + -1;
          uVar5 = (ulong)((uint)uVar5 & (uint)(long)*pdVar10);
          pdVar10 = pdVar10 + 5;
        } while (lVar6 != 0);
      }
LAB_0087d6f4:
      dVar17 = (double)(uVar5 & 0xffffffff);
      *(undefined4 *)((long)param_1 + 0x24) = 0;
      *(undefined4 *)param_1 = 3;
      *(undefined8 *)((long)param_1 + 0xc) = 0;
      *(undefined8 *)((long)param_1 + 4) = 0;
      *(undefined8 *)((long)param_1 + 0x1c) = 0;
      *(undefined8 *)((long)param_1 + 0x14) = 0;
      goto LAB_0087d9c0;
    }
    break;
  case 0x1e:
    if ((param_5 == 1) && (*param_4 == 3)) {
      uVar15 = ~(uint)(long)*(double *)(param_4 + 2);
      goto LAB_0087d9a8;
    }
    break;
  case 0x1f:
    if ((param_5 != 0) && (*param_4 == 3)) {
      lVar6 = param_5 - 1;
      uVar5 = (ulong)*(double *)(param_4 + 2);
      if (lVar6 != 0) {
        pdVar10 = (double *)(param_4 + 0xc);
        do {
          if (*(int *)(pdVar10 + -1) != 3) goto switchD_0087cc20_caseD_e;
          lVar6 = lVar6 + -1;
          uVar5 = (ulong)((uint)uVar5 | (uint)(long)*pdVar10);
          pdVar10 = pdVar10 + 5;
        } while (lVar6 != 0);
      }
      goto LAB_0087d6f4;
    }
    break;
  case 0x20:
    if ((param_5 != 0) && (*param_4 == 3)) {
      lVar6 = param_5 - 1;
      uVar5 = (ulong)*(double *)(param_4 + 2);
      if (lVar6 != 0) {
        pdVar10 = (double *)(param_4 + 0xc);
        do {
          if (*(int *)(pdVar10 + -1) != 3) goto switchD_0087cc20_caseD_e;
          lVar6 = lVar6 + -1;
          uVar5 = (ulong)((uint)uVar5 ^ (uint)(long)*pdVar10);
          pdVar10 = pdVar10 + 5;
        } while (lVar6 != 0);
      }
      goto LAB_0087d6f4;
    }
    break;
  case 0x21:
    if ((param_5 != 0) && (*param_4 == 3)) {
      lVar6 = param_5 - 1;
      uVar5 = (ulong)*(double *)(param_4 + 2);
      uVar15 = (uint)uVar5;
      if (lVar6 != 0) {
        pdVar10 = (double *)(param_4 + 0xc);
        do {
          if (*(int *)(pdVar10 + -1) != 3) goto switchD_0087cc20_caseD_e;
          lVar6 = lVar6 + -1;
          uVar15 = (uint)uVar5 & (uint)(long)*pdVar10;
          uVar5 = (ulong)uVar15;
          pdVar10 = pdVar10 + 5;
        } while (lVar6 != 0);
      }
      *(undefined4 *)((long)param_1 + 0x24) = 0;
      *(undefined4 *)param_1 = 2;
      *(undefined8 *)((long)param_1 + 0xc) = 0;
      *(undefined8 *)((long)param_1 + 4) = 0;
      *(undefined8 *)((long)param_1 + 0x1c) = 0;
      *(undefined8 *)((long)param_1 + 0x14) = 0;
      *(bool *)(param_1 + 1) = uVar15 != 0;
      goto LAB_0087d9c4;
    }
    break;
  case 0x22:
    if (((1 < param_5) && (*param_4 == 3)) && (param_4[10] == 3)) {
      if (param_5 == 2) {
        iVar9 = 1;
      }
      else {
        if (param_4[0x14] != 3) break;
        iVar9 = (int)*(double *)(param_4 + 0x16);
      }
      uVar15 = (uint)*(double *)(param_4 + 0xc);
      if (((-1 < (int)uVar15) && (0 < iVar9)) && ((int)(iVar9 + uVar15) < 0x21)) {
        uVar15 = (uint)(long)*(double *)(param_4 + 2) >> (ulong)(uVar15 & 0x1f) &
                 (-2 << (ulong)(iVar9 - 1U & 0x1f) ^ 0xffffffffU);
        goto LAB_0087d9a8;
      }
    }
    break;
  case 0x23:
    if (((param_5 == 2) && (*param_4 == 3)) && (param_4[10] == 3)) {
      uVar15 = (uint)(long)*(double *)(param_4 + 2) >> (-(int)*(double *)(param_4 + 0xc) & 0x1fU) |
               (uint)(long)*(double *)(param_4 + 2) <<
               0x20 - (-(int)*(double *)(param_4 + 0xc) & 0x1fU);
      goto LAB_0087d9a8;
    }
    break;
  case 0x24:
    if (((param_5 == 2) && (*param_4 == 3)) &&
       ((param_4[10] == 3 && ((uint)(int)*(double *)(param_4 + 0xc) < 0x20)))) {
      uVar15 = (int)(long)*(double *)(param_4 + 2) <<
               (ulong)((int)*(double *)(param_4 + 0xc) & 0x1f);
      goto LAB_0087d9a8;
    }
    break;
  case 0x25:
    if (((2 < param_5) && (*param_4 == 3)) && ((param_4[10] == 3 && (param_4[0x14] == 3)))) {
      if (param_5 == 3) {
        iVar9 = 1;
      }
      else {
        if (param_4[0x1e] != 3) break;
        iVar9 = (int)*(double *)(param_4 + 0x20);
      }
      uVar15 = (uint)*(double *)(param_4 + 0x16);
      if (((-1 < (int)uVar15) && (0 < iVar9)) && ((int)(iVar9 + uVar15) < 0x21)) {
        uVar2 = -2 << (ulong)(iVar9 - 1U & 0x1f);
        uVar15 = ((uint)(long)*(double *)(param_4 + 0xc) & (uVar2 ^ 0xffffffff)) <<
                 (ulong)(uVar15 & 0x1f) |
                 (uint)(long)*(double *)(param_4 + 2) &
                 (~uVar2 << (ulong)(uVar15 & 0x1f) ^ 0xffffffff);
        goto LAB_0087d9a8;
      }
    }
    break;
  case 0x26:
    if (((param_5 == 2) && (*param_4 == 3)) && (param_4[10] == 3)) {
      uVar15 = (uint)(long)*(double *)(param_4 + 2) >> ((int)*(double *)(param_4 + 0xc) & 0x1fU) |
               (uint)(long)*(double *)(param_4 + 2) <<
               0x20 - ((int)*(double *)(param_4 + 0xc) & 0x1fU);
      goto LAB_0087d9a8;
    }
    break;
  case 0x27:
    if ((((param_5 == 2) && (*param_4 == 3)) && (param_4[10] == 3)) &&
       ((uint)(int)*(double *)(param_4 + 0xc) < 0x20)) {
      uVar15 = (uint)(long)*(double *)(param_4 + 2) >>
               (ulong)((int)*(double *)(param_4 + 0xc) & 0x1f);
      goto LAB_0087d9a8;
    }
    break;
  case 0x28:
    if ((param_5 == 1) && (*param_4 != 0)) {
      if (*(long *)(lVar3 + 0x28) == local_48) {
        iVar9 = *param_4;
        if (iVar9 < 4) {
          if (iVar9 == 1) {
            param_1[4] = 0;
            uVar16 = 0x300000006;
            pcVar7 = "nil";
            goto LAB_0087dc00;
          }
          if (iVar9 == 2) {
            param_1[4] = 0;
            uVar16 = 0x700000006;
            pcVar7 = "boolean";
            goto LAB_0087dc00;
          }
          if (iVar9 != 3) goto LAB_0087dc30;
          pcVar7 = "number";
        }
        else if (iVar9 - 4U < 2) {
          pcVar7 = "vector";
        }
        else {
          if (iVar9 != 6) {
LAB_0087dc30:
            param_1[4] = 0;
            param_1[1] = 0;
            *param_1 = 0;
            param_1[3] = 0;
            param_1[2] = 0;
            return;
          }
          pcVar7 = "string";
        }
        uVar16 = 0x600000006;
        param_1[4] = 0;
LAB_0087dc00:
        param_1[1] = pcVar7;
        *param_1 = uVar16;
        param_1[3] = 0;
        param_1[2] = 0;
        return;
      }
      goto LAB_0087db88;
    }
    break;
  case 0x29:
    if (param_5 == 2) {
      if ((((*param_4 == 6) && (param_4[10] == 3)) &&
          (uVar15 = (uint)*(double *)(param_4 + 0xc), 0 < (int)uVar15)) &&
         (uVar15 <= (uint)param_4[1])) {
        bVar14 = *(byte *)(*(long *)(param_4 + 2) + (ulong)uVar15 + -1);
        goto LAB_0087d448;
      }
    }
    else if (((param_5 == 1) && (*param_4 == 6)) && (param_4[1] != 0)) {
      bVar14 = **(byte **)(param_4 + 2);
LAB_0087d448:
      dVar17 = (double)NEON_ucvtf((ulong)bVar14);
      goto LAB_0087d450;
    }
    break;
  case 0x2a:
    if (param_5 < 0x80) {
      uStack_c8 = 0;
      local_d0 = 0;
      uStack_b8 = 0;
      uStack_c0 = 0;
      uStack_a8 = 0;
      local_b0 = 0;
      uStack_98 = 0;
      uStack_a0 = 0;
      uStack_88 = 0;
      local_90 = 0;
      uStack_78 = 0;
      uStack_80 = 0;
      uStack_68 = 0;
      local_70 = 0;
      uStack_58 = 0;
      uStack_60 = 0;
      if (param_5 != 0) {
        uVar5 = 0;
        pdVar10 = (double *)(param_4 + 2);
        do {
          if ((*(int *)(pdVar10 + -1) != 3) || (0xff < (uint)(int)*pdVar10)) {
            param_1[4] = 0;
            param_1[1] = 0;
            *param_1 = 0;
            param_1[3] = 0;
            param_1[2] = 0;
            goto LAB_0087d9c4;
          }
          *(char *)((long)&local_d0 + uVar5) = (char)(int)*pdVar10;
          uVar5 = uVar5 + 1;
          pdVar10 = pdVar10 + 5;
        } while (param_5 != uVar5);
        uVar16 = FUN_008530cc(param_2,&local_d0,param_5);
        param_1[3] = 0;
        param_1[4] = 0;
        *(undefined4 *)param_1 = 6;
        *(int *)((long)param_1 + 4) = (int)param_5;
        param_1[1] = uVar16;
        param_1[2] = 0;
        goto LAB_0087d9c4;
      }
      goto LAB_0087d878;
    }
    break;
  case 0x2b:
    if ((param_5 == 1) && (*param_4 == 6)) {
      uVar15 = param_4[1];
      *(undefined4 *)param_1 = 3;
      dVar17 = (double)NEON_ucvtf((ulong)uVar15);
      goto LAB_0087d9b4;
    }
    break;
  case 0x2c:
    if ((param_5 == 1) && (*param_4 != 0)) {
      if (*(long *)(lVar3 + 0x28) != local_48) goto LAB_0087db88;
      iVar9 = *param_4;
      if (iVar9 < 4) {
        if (iVar9 == 1) {
          param_1[4] = 0;
          uVar16 = 0x300000006;
          pcVar7 = "nil";
          goto LAB_0087dd04;
        }
        if (iVar9 == 2) {
          param_1[4] = 0;
          uVar16 = 0x700000006;
          pcVar7 = "boolean";
          goto LAB_0087dd04;
        }
        if (iVar9 != 3) goto LAB_0087dca0;
        pcVar7 = "number";
      }
      else {
        if ((iVar9 - 4U < 2) || (iVar9 != 6)) {
LAB_0087dca0:
          param_1[4] = 0;
          param_1[1] = 0;
          *param_1 = 0;
          param_1[3] = 0;
          param_1[2] = 0;
          return;
        }
        pcVar7 = "string";
      }
      uVar16 = 0x600000006;
      param_1[4] = 0;
LAB_0087dd04:
      param_1[1] = pcVar7;
      *param_1 = uVar16;
      param_1[3] = 0;
      param_1[2] = 0;
      return;
    }
    break;
  case 0x2d:
    if (((1 < param_5) && (*param_4 == 6)) && (param_4[10] == 3)) {
      if (param_5 == 2) {
        iVar9 = param_4[1];
        iVar8 = iVar9;
      }
      else {
        if (param_4[0x14] != 3) break;
        iVar9 = param_4[1];
        iVar8 = (int)*(double *)(param_4 + 0x16);
      }
      uVar15 = iVar9 + 1U & iVar8 >> 0x1f;
      iVar1 = uVar15 + iVar8;
      if (iVar1 != 0 && iVar1 < 0 == SCARRY4(uVar15,iVar8)) {
        uVar15 = (iVar9 + 1U & (int)*(double *)(param_4 + 0xc) >> 0x1f) +
                 (int)*(double *)(param_4 + 0xc);
        if ((int)uVar15 < 2) {
          uVar15 = 1;
        }
        if (iVar9 <= iVar1) {
          iVar1 = iVar9;
        }
        if ((int)uVar15 <= iVar1) {
          iVar9 = (iVar1 - uVar15) + 1;
          uVar16 = FUN_008530cc(param_2,*(long *)(param_4 + 2) + (ulong)uVar15 + -1,(long)iVar9);
          param_1[3] = 0;
          param_1[4] = 0;
          *(undefined4 *)param_1 = 6;
          *(int *)((long)param_1 + 4) = iVar9;
          param_1[1] = uVar16;
          param_1[2] = 0;
          goto LAB_0087d9c4;
        }
      }
LAB_0087d878:
      param_1[4] = 0;
      param_1[1] = &DAT_002ab32c;
      *param_1 = 6;
      param_1[3] = 0;
      param_1[2] = 0;
      goto LAB_0087d9c4;
    }
    break;
  case 0x2e:
    if ((((param_5 == 3) && (*param_4 == 3)) && (param_4[10] == 3)) && (param_4[0x14] == 3)) {
      dVar20 = *(double *)(param_4 + 0xc);
      dVar17 = *(double *)(param_4 + 0x16);
      uVar12 = SUB84(dVar17,0);
      uVar13 = (undefined4)((ulong)dVar17 >> 0x20);
      if (dVar20 <= dVar17) {
        dVar22 = *(double *)(param_4 + 2);
        *(undefined4 *)param_1 = 3;
        if (dVar20 <= dVar22) {
          dVar20 = dVar22;
        }
        if (dVar20 <= dVar17) {
          uVar12 = SUB84(dVar20,0);
          uVar13 = (undefined4)((ulong)dVar20 >> 0x20);
        }
        goto LAB_0087cc84;
      }
    }
    break;
  case 0x2f:
    if ((param_5 == 1) && (*param_4 == 3)) {
      dVar17 = *(double *)(param_4 + 2);
      *(undefined4 *)param_1 = 3;
      uVar11 = 0xbff00000;
      if (0.0 <= dVar17) {
        uVar11 = 0;
      }
      uVar12 = 0;
      uVar13 = 0x3ff00000;
      if (dVar17 <= 0.0) {
        uVar12 = 0;
        uVar13 = uVar11;
      }
LAB_0087cc84:
      dVar17 = (double)CONCAT44(uVar13,uVar12);
      *(undefined8 *)((long)param_1 + 0xc) = 0;
      *(undefined8 *)((long)param_1 + 4) = 0;
      *(undefined8 *)((long)param_1 + 0x1c) = 0;
      *(undefined8 *)((long)param_1 + 0x14) = 0;
      goto LAB_0087cf80;
    }
    break;
  case 0x30:
    if ((param_5 == 1) && (*param_4 == 3)) {
      dVar17 = *(double *)(param_4 + 2);
      *(undefined4 *)param_1 = 3;
      dVar17 = (double)(long)dVar17;
      goto LAB_0087d9b4;
    }
    break;
  case 0x36:
    if (((1 < param_5) && (*param_4 == 3)) && (param_4[10] == 3)) {
      if ((param_6 & 1) == 0) {
        if (param_5 == 4) {
          if ((param_4[0x14] == 3) && (param_4[0x1e] == 3)) {
            dVar17 = *(double *)(param_4 + 2);
            dVar22 = *(double *)(param_4 + 0x16);
            *(undefined4 *)((long)param_1 + 0x24) = 0;
            dVar20 = *(double *)(param_4 + 0xc);
            dVar19 = *(double *)(param_4 + 0x20);
            *(undefined4 *)param_1 = 4;
            *(undefined8 *)((long)param_1 + 0xc) = 0;
            *(undefined8 *)((long)param_1 + 4) = 0;
            *(undefined8 *)((long)param_1 + 0x1c) = 0;
            *(undefined8 *)((long)param_1 + 0x14) = 0;
            param_1[2] = CONCAT44((float)dVar19,(float)dVar22);
            param_1[1] = CONCAT44((float)dVar20,(float)dVar17);
            goto LAB_0087d9c4;
          }
        }
        else if (param_5 == 3) {
          if (param_4[0x14] == 3) {
            dVar17 = *(double *)(param_4 + 2);
            dVar20 = *(double *)(param_4 + 0xc);
            dVar22 = *(double *)(param_4 + 0x16);
            *(undefined4 *)((long)param_1 + 0x24) = 0;
            *(undefined4 *)param_1 = 4;
            *(undefined8 *)((long)param_1 + 0xc) = 0;
            *(undefined8 *)((long)param_1 + 4) = 0;
            *(undefined8 *)((long)param_1 + 0x1c) = 0;
            *(undefined8 *)((long)param_1 + 0x14) = 0;
            *(float *)(param_1 + 1) = (float)dVar17;
            *(float *)((long)param_1 + 0xc) = (float)dVar20;
            *(float *)(param_1 + 2) = (float)dVar22;
            goto LAB_0087d9c4;
          }
        }
        else if (param_5 == 2) {
          dVar17 = *(double *)(param_4 + 2);
          dVar20 = *(double *)(param_4 + 0xc);
          *(undefined4 *)((long)param_1 + 0x24) = 0;
          *(undefined4 *)param_1 = 4;
          *(undefined8 *)((long)param_1 + 0xc) = 0;
          *(undefined8 *)((long)param_1 + 4) = 0;
          *(undefined8 *)((long)param_1 + 0x1c) = 0;
          *(undefined8 *)((long)param_1 + 0x14) = 0;
          *(float *)(param_1 + 1) = (float)dVar17;
          *(float *)((long)param_1 + 0xc) = (float)dVar20;
          *(undefined4 *)((long)param_1 + 0x14) = 0;
          goto LAB_0087d9c4;
        }
      }
      else if (param_5 == 4) {
        if ((param_4[0x14] == 3) && (param_4[0x1e] == 3)) {
          uVar16 = *(undefined8 *)(param_4 + 2);
          uVar21 = *(undefined8 *)(param_4 + 0xc);
          *param_1 = 5;
          param_1[1] = uVar16;
          uVar16 = *(undefined8 *)(param_4 + 0x16);
          uVar18 = *(undefined8 *)(param_4 + 0x20);
          param_1[2] = uVar21;
          param_1[3] = uVar16;
          param_1[4] = uVar18;
          goto LAB_0087d9c4;
        }
      }
      else if (param_5 == 3) {
        if (param_4[0x14] == 3) {
          uVar16 = *(undefined8 *)(param_4 + 0xc);
          uVar18 = *(undefined8 *)(param_4 + 0x16);
          param_1[4] = 0;
          param_1[2] = uVar16;
          param_1[3] = uVar18;
          uVar16 = *(undefined8 *)(param_4 + 2);
          *param_1 = 5;
          param_1[1] = uVar16;
          goto LAB_0087d9c4;
        }
      }
      else if (param_5 == 2) {
        uVar16 = *(undefined8 *)(param_4 + 2);
        param_1[2] = *(undefined8 *)(param_4 + 0xc);
        *param_1 = 5;
        param_1[1] = uVar16;
        if (*(long *)(lVar3 + 0x28) == local_48) {
          param_1[3] = 0;
          param_1[4] = 0;
          return;
        }
        goto LAB_0087db88;
      }
    }
    break;
  case 0x59:
    if ((((param_5 == 3) && (*param_4 == 3)) && (param_4[10] == 3)) && (param_4[0x14] == 3)) {
      dVar17 = *(double *)(param_4 + 0xc);
      if (*(double *)(param_4 + 0x16) != 1.0) {
        dVar17 = *(double *)(param_4 + 2) +
                 *(double *)(param_4 + 0x16) * (dVar17 - *(double *)(param_4 + 2));
      }
      goto LAB_0087d5f0;
    }
    break;
  case 0x5b:
    if ((param_5 == 1) && (*param_4 == 3)) {
      dVar17 = *(double *)(param_4 + 2);
      *(undefined4 *)param_1 = 2;
      bVar4 = NAN(dVar17);
      *(undefined8 *)((long)param_1 + 0xc) = 0;
      *(undefined8 *)((long)param_1 + 4) = 0;
LAB_0087d788:
      *(undefined8 *)((long)param_1 + 0x1c) = 0;
      *(undefined8 *)((long)param_1 + 0x14) = 0;
      *(undefined4 *)((long)param_1 + 0x24) = 0;
      *(bool *)(param_1 + 1) = bVar4;
      goto LAB_0087d9c4;
    }
    break;
  case 0x5c:
    if ((param_5 == 1) && (*param_4 == 3)) {
      uVar5 = *(ulong *)(param_4 + 2);
      *(undefined4 *)param_1 = 2;
      bVar4 = (uVar5 & 0x7fffffffffffffff) == 0x7ff0000000000000;
      *(undefined8 *)((long)param_1 + 0xc) = 0;
      *(undefined8 *)((long)param_1 + 4) = 0;
      goto LAB_0087d788;
    }
    break;
  case 0x5d:
    if ((param_5 == 1) && (*param_4 == 3)) {
      uVar5 = *(ulong *)(param_4 + 2);
      *(undefined4 *)param_1 = 2;
      *(undefined8 *)((long)param_1 + 0xc) = 0;
      *(undefined8 *)((long)param_1 + 4) = 0;
      bVar4 = (uVar5 & 0x7fffffffffffffff) < 0x7ff0000000000000;
      goto LAB_0087d788;
    }
  }
switchD_0087cc20_caseD_e:
  if (*(long *)(lVar3 + 0x28) == local_48) {
    param_1[4] = 0;
    param_1[1] = 0;
    *param_1 = 0;
    param_1[3] = 0;
    param_1[2] = 0;
    return;
  }
LAB_0087db88:
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}

