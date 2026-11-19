/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0089e084
 */

void FUN_0089e084(undefined8 *param_1,undefined4 param_2,int *param_3,int *param_4,
                 undefined8 param_5)

{
  uint uVar1;
  void *pvVar2;
  int iVar3;
  int iVar4;
  long lVar5;
  byte bVar6;
  bool bVar7;
  undefined8 uVar8;
  float fVar9;
  undefined8 uVar10;
  double dVar11;
  undefined8 uVar12;
  float fVar13;
  undefined8 uVar14;
  double dVar15;
  undefined8 uVar16;
  double dVar17;
  undefined8 local_60;
  undefined8 uStack_58;
  void *local_50;
  long local_48;
  
  lVar5 = tpidr_el0;
  local_48 = *(long *)(lVar5 + 0x28);
  switch(param_2) {
  case 0:
    iVar4 = *param_3;
    iVar3 = *param_4;
    if ((iVar4 == 3) && (iVar3 == 3)) {
      *(undefined4 *)param_1 = 3;
      param_1[1] = *(double *)(param_3 + 2) + *(double *)(param_4 + 2);
    }
    else if ((iVar4 == 4) && (iVar3 == 4)) {
      *(undefined4 *)param_1 = 4;
      *(float *)(param_1 + 1) = (float)param_3[2] + (float)param_4[2];
      *(float *)((long)param_1 + 0xc) = (float)param_3[3] + (float)param_4[3];
      *(float *)(param_1 + 2) = (float)param_3[4] + (float)param_4[4];
      *(float *)((long)param_1 + 0x14) = (float)param_3[5] + (float)param_4[5];
    }
    else if ((iVar4 == 5) && (iVar3 == 5)) {
      *(undefined4 *)param_1 = 5;
      param_1[1] = *(double *)(param_3 + 2) + *(double *)(param_4 + 2);
      param_1[2] = *(double *)(param_3 + 4) + *(double *)(param_4 + 4);
      param_1[3] = *(double *)(param_3 + 6) + *(double *)(param_4 + 6);
      param_1[4] = *(double *)(param_3 + 8) + *(double *)(param_4 + 8);
    }
    break;
  case 1:
    iVar4 = *param_3;
    iVar3 = *param_4;
    if ((iVar4 == 3) && (iVar3 == 3)) {
      *(undefined4 *)param_1 = 3;
      param_1[1] = *(double *)(param_3 + 2) - *(double *)(param_4 + 2);
    }
    else if ((iVar4 == 4) && (iVar3 == 4)) {
      *(undefined4 *)param_1 = 4;
      *(float *)(param_1 + 1) = (float)param_3[2] - (float)param_4[2];
      *(float *)((long)param_1 + 0xc) = (float)param_3[3] - (float)param_4[3];
      *(float *)(param_1 + 2) = (float)param_3[4] - (float)param_4[4];
      *(float *)((long)param_1 + 0x14) = (float)param_3[5] - (float)param_4[5];
    }
    else if ((iVar4 == 5) && (iVar3 == 5)) {
      *(undefined4 *)param_1 = 5;
      param_1[1] = *(double *)(param_3 + 2) - *(double *)(param_4 + 2);
      param_1[2] = *(double *)(param_3 + 4) - *(double *)(param_4 + 4);
      param_1[3] = *(double *)(param_3 + 6) - *(double *)(param_4 + 6);
      param_1[4] = *(double *)(param_3 + 8) - *(double *)(param_4 + 8);
    }
    break;
  case 2:
    iVar4 = *param_3;
    iVar3 = *param_4;
    if ((iVar4 == 3) && (iVar3 == 3)) {
      *(undefined4 *)param_1 = 3;
      param_1[1] = *(double *)(param_3 + 2) * *(double *)(param_4 + 2);
    }
    else if ((iVar4 == 4) && (iVar3 == 4)) {
      fVar9 = (float)param_3[5] * (float)param_4[5];
      if (((fVar9 == 0.0) || ((float)param_3[5] != 0.0)) || ((float)param_4[5] != 0.0)) {
        *(undefined4 *)param_1 = 4;
        *(float *)(param_1 + 1) = (float)param_3[2] * (float)param_4[2];
        *(float *)((long)param_1 + 0xc) = (float)param_3[3] * (float)param_4[3];
        fVar13 = (float)param_3[4] * (float)param_4[4];
LAB_0089eb90:
        *(float *)(param_1 + 2) = fVar13;
        *(float *)((long)param_1 + 0x14) = fVar9;
      }
    }
    else if ((iVar4 == 3) && (iVar3 == 4)) {
      fVar9 = (float)param_4[5] * (float)*(double *)(param_3 + 2);
      if (((float)param_4[5] != 0.0) || (fVar9 == 0.0)) {
        *(undefined4 *)param_1 = 4;
        *(float *)(param_1 + 1) = (float)param_4[2] * (float)*(double *)(param_3 + 2);
        *(float *)((long)param_1 + 0xc) = (float)param_4[3] * (float)*(double *)(param_3 + 2);
        dVar11 = *(double *)(param_3 + 2);
        fVar13 = (float)param_4[4];
LAB_0089eb14:
        fVar13 = fVar13 * (float)dVar11;
        goto LAB_0089eb90;
      }
    }
    else if ((iVar4 == 4) && (iVar3 == 3)) {
      fVar9 = (float)param_3[5] * (float)*(double *)(param_4 + 2);
      if (((float)param_3[5] != 0.0) || (fVar9 == 0.0)) {
        *(undefined4 *)param_1 = 4;
        *(float *)(param_1 + 1) = (float)param_3[2] * (float)*(double *)(param_4 + 2);
        *(float *)((long)param_1 + 0xc) = (float)param_3[3] * (float)*(double *)(param_4 + 2);
        dVar11 = *(double *)(param_4 + 2);
        fVar13 = (float)param_3[4];
        goto LAB_0089eb14;
      }
    }
    else if ((iVar4 == 5) && (iVar3 == 5)) {
      dVar11 = *(double *)(param_3 + 8) * *(double *)(param_4 + 8);
      if (((dVar11 == 0.0) || (*(double *)(param_3 + 8) != 0.0)) ||
         (*(double *)(param_4 + 8) != 0.0)) {
        *(undefined4 *)param_1 = 5;
        param_1[1] = *(double *)(param_3 + 2) * *(double *)(param_4 + 2);
        param_1[2] = *(double *)(param_3 + 4) * *(double *)(param_4 + 4);
        dVar15 = *(double *)(param_3 + 6);
LAB_0089edd8:
        dVar17 = *(double *)(param_4 + 6);
LAB_0089eddc:
        dVar15 = dVar15 * dVar17;
LAB_0089ee44:
        param_1[3] = dVar15;
        param_1[4] = dVar11;
      }
    }
    else if ((iVar4 == 3) && (iVar3 == 5)) {
      dVar11 = *(double *)(param_4 + 8) * *(double *)(param_3 + 2);
      if ((*(double *)(param_4 + 8) != 0.0) || (dVar11 == 0.0)) {
        *(undefined4 *)param_1 = 5;
        param_1[1] = *(double *)(param_3 + 2) * *(double *)(param_4 + 2);
        param_1[2] = *(double *)(param_3 + 2) * *(double *)(param_4 + 4);
        dVar15 = *(double *)(param_3 + 2);
        goto LAB_0089edd8;
      }
    }
    else if (((iVar4 == 5) && (iVar3 == 3)) &&
            ((dVar11 = *(double *)(param_3 + 8) * *(double *)(param_4 + 2),
             *(double *)(param_3 + 8) != 0.0 || (dVar11 == 0.0)))) {
      *(undefined4 *)param_1 = 5;
      param_1[1] = *(double *)(param_3 + 2) * *(double *)(param_4 + 2);
      param_1[2] = *(double *)(param_3 + 4) * *(double *)(param_4 + 2);
      dVar15 = *(double *)(param_3 + 6);
      dVar17 = *(double *)(param_4 + 2);
      goto LAB_0089eddc;
    }
    break;
  case 3:
    iVar4 = *param_3;
    iVar3 = *param_4;
    if ((iVar4 == 3) && (iVar3 == 3)) {
      *(undefined4 *)param_1 = 3;
      param_1[1] = *(double *)(param_3 + 2) / *(double *)(param_4 + 2);
    }
    else if ((iVar4 == 4) && (iVar3 == 4)) {
      fVar9 = (float)param_3[5] / (float)param_4[5];
      if (((fVar9 == 0.0) || ((float)param_3[5] != 0.0)) || ((float)param_4[5] != 0.0)) {
        *(undefined4 *)param_1 = 4;
        *(float *)(param_1 + 1) = (float)param_3[2] / (float)param_4[2];
        *(float *)((long)param_1 + 0xc) = (float)param_3[3] / (float)param_4[3];
        fVar13 = (float)param_3[4];
LAB_0089e8d8:
        fVar13 = fVar13 / (float)param_4[4];
        goto LAB_0089eb90;
      }
    }
    else if ((iVar4 == 3) && (iVar3 == 4)) {
      fVar9 = (float)*(double *)(param_3 + 2) / (float)param_4[5];
      if (((float)param_4[5] != 0.0) || (fVar9 == 0.0)) {
        *(undefined4 *)param_1 = 4;
        *(float *)(param_1 + 1) = (float)*(double *)(param_3 + 2) / (float)param_4[2];
        *(float *)((long)param_1 + 0xc) = (float)*(double *)(param_3 + 2) / (float)param_4[3];
        fVar13 = (float)*(double *)(param_3 + 2);
        goto LAB_0089e8d8;
      }
    }
    else if ((iVar4 == 4) && (iVar3 == 3)) {
      fVar9 = (float)param_3[5] / (float)*(double *)(param_4 + 2);
      if (((float)param_3[5] != 0.0) || (fVar9 == 0.0)) {
        *(undefined4 *)param_1 = 4;
        *(float *)(param_1 + 1) = (float)param_3[2] / (float)*(double *)(param_4 + 2);
        *(float *)((long)param_1 + 0xc) = (float)param_3[3] / (float)*(double *)(param_4 + 2);
        fVar13 = (float)param_3[4] / (float)*(double *)(param_4 + 2);
        goto LAB_0089eb90;
      }
    }
    else if ((iVar4 == 5) && (iVar3 == 5)) {
      dVar11 = *(double *)(param_3 + 8) / *(double *)(param_4 + 8);
      if (((dVar11 == 0.0) || (*(double *)(param_3 + 8) != 0.0)) ||
         (*(double *)(param_4 + 8) != 0.0)) {
        *(undefined4 *)param_1 = 5;
        param_1[1] = *(double *)(param_3 + 2) / *(double *)(param_4 + 2);
        param_1[2] = *(double *)(param_3 + 4) / *(double *)(param_4 + 4);
        dVar15 = *(double *)(param_3 + 6);
LAB_0089ee3c:
        dVar17 = *(double *)(param_4 + 6);
LAB_0089ee40:
        dVar15 = dVar15 / dVar17;
        goto LAB_0089ee44;
      }
    }
    else if ((iVar4 == 3) && (iVar3 == 5)) {
      dVar11 = *(double *)(param_3 + 2) / *(double *)(param_4 + 8);
      if ((*(double *)(param_4 + 8) != 0.0) || (dVar11 == 0.0)) {
        *(undefined4 *)param_1 = 5;
        param_1[1] = *(double *)(param_3 + 2) / *(double *)(param_4 + 2);
        param_1[2] = *(double *)(param_3 + 2) / *(double *)(param_4 + 4);
        dVar15 = *(double *)(param_3 + 2);
        goto LAB_0089ee3c;
      }
    }
    else if (((iVar4 == 5) && (iVar3 == 3)) &&
            ((dVar11 = *(double *)(param_3 + 8) / *(double *)(param_4 + 2),
             *(double *)(param_3 + 8) != 0.0 || (dVar11 == 0.0)))) {
      *(undefined4 *)param_1 = 5;
      param_1[1] = *(double *)(param_3 + 2) / *(double *)(param_4 + 2);
      param_1[2] = *(double *)(param_3 + 4) / *(double *)(param_4 + 2);
      dVar15 = *(double *)(param_3 + 6);
      dVar17 = *(double *)(param_4 + 2);
      goto LAB_0089ee40;
    }
    break;
  case 4:
    iVar4 = *param_3;
    iVar3 = *param_4;
    if ((iVar4 == 3) && (iVar3 == 3)) {
      *(undefined4 *)param_1 = 3;
      param_1[1] = (long)(*(double *)(param_3 + 2) / *(double *)(param_4 + 2));
    }
    else if ((iVar4 == 4) && (iVar3 == 4)) {
      fVar9 = (float)(int)((float)param_3[5] / (float)param_4[5]);
      if (((fVar9 == 0.0) || ((float)param_3[5] != 0.0)) || ((float)param_4[5] != 0.0)) {
        *(undefined4 *)param_1 = 4;
        *(int *)(param_1 + 1) = (int)((float)param_3[2] / (float)param_4[2]);
        *(int *)((long)param_1 + 0xc) = (int)((float)param_3[3] / (float)param_4[3]);
        fVar13 = (float)param_3[4];
LAB_0089e780:
        fVar13 = (float)(int)(fVar13 / (float)param_4[4]);
        goto LAB_0089eb90;
      }
    }
    else if ((iVar4 == 3) && (iVar3 == 4)) {
      fVar9 = (float)(int)((float)*(double *)(param_3 + 2) / (float)param_4[5]);
      if (((float)param_4[5] != 0.0) || (fVar9 == 0.0)) {
        *(undefined4 *)param_1 = 4;
        *(int *)(param_1 + 1) = (int)((float)*(double *)(param_3 + 2) / (float)param_4[2]);
        *(int *)((long)param_1 + 0xc) = (int)((float)*(double *)(param_3 + 2) / (float)param_4[3]);
        fVar13 = (float)*(double *)(param_3 + 2);
        goto LAB_0089e780;
      }
    }
    else if ((iVar4 == 4) && (iVar3 == 3)) {
      if (((float)param_3[5] != 0.0) ||
         ((float)(int)((float)param_3[5] / (float)*(double *)(param_4 + 2)) == 0.0)) {
        *(undefined4 *)param_1 = 4;
        *(int *)(param_1 + 1) = (int)((float)param_3[2] / (float)*(double *)(param_4 + 2));
        *(int *)((long)param_1 + 0xc) = (int)((float)param_3[3] / (float)*(double *)(param_4 + 2));
        *(int *)(param_1 + 2) = (int)((float)param_3[4] / (float)*(double *)(param_4 + 2));
        *(int *)((long)param_1 + 0x14) = (int)((float)param_3[5] / (float)*(double *)(param_4 + 2));
      }
    }
    else if ((iVar4 == 5) && (iVar3 == 5)) {
      dVar11 = (double)(long)(*(double *)(param_3 + 8) / *(double *)(param_4 + 8));
      if (((dVar11 == 0.0) || (*(double *)(param_3 + 8) != 0.0)) ||
         (*(double *)(param_4 + 8) != 0.0)) {
        *(undefined4 *)param_1 = 5;
        param_1[1] = (long)(*(double *)(param_3 + 2) / *(double *)(param_4 + 2));
        param_1[2] = (long)(*(double *)(param_3 + 4) / *(double *)(param_4 + 4));
        dVar15 = *(double *)(param_3 + 6);
LAB_0089ed70:
        dVar15 = (double)(long)(dVar15 / *(double *)(param_4 + 6));
        goto LAB_0089ee44;
      }
    }
    else if ((iVar4 == 3) && (iVar3 == 5)) {
      dVar11 = (double)(long)(*(double *)(param_3 + 2) / *(double *)(param_4 + 8));
      if ((dVar11 == 0.0) || (*(double *)(param_4 + 8) != 0.0)) {
        *(undefined4 *)param_1 = 5;
        param_1[1] = (long)(*(double *)(param_3 + 2) / *(double *)(param_4 + 2));
        param_1[2] = (long)(*(double *)(param_3 + 2) / *(double *)(param_4 + 4));
        dVar15 = *(double *)(param_3 + 2);
        goto LAB_0089ed70;
      }
    }
    else if (((iVar4 == 5) && (iVar3 == 3)) &&
            (((double)(long)(*(double *)(param_3 + 8) / *(double *)(param_4 + 2)) == 0.0 ||
             (*(double *)(param_3 + 8) != 0.0)))) {
      *(undefined4 *)param_1 = 5;
      param_1[1] = (long)(*(double *)(param_3 + 2) / *(double *)(param_4 + 2));
      param_1[2] = (long)(*(double *)(param_3 + 4) / *(double *)(param_4 + 2));
      param_1[3] = (long)(*(double *)(param_3 + 6) / *(double *)(param_4 + 2));
      param_1[4] = (long)(*(double *)(param_3 + 8) / *(double *)(param_4 + 2));
    }
    break;
  case 5:
    if ((*param_3 == 3) && (*param_4 == 3)) {
      *(undefined4 *)param_1 = 3;
      param_1[1] = *(double *)(param_3 + 2) -
                   *(double *)(param_4 + 2) *
                   (double)(long)(*(double *)(param_3 + 2) / *(double *)(param_4 + 2));
    }
    break;
  case 6:
    if ((*param_3 == 3) && (*param_4 == 3)) {
      *(undefined4 *)param_1 = 3;
      dVar11 = pow(*(double *)(param_3 + 2),*(double *)(param_4 + 2));
      param_1[1] = dVar11;
    }
    break;
  case 7:
    if (((*param_3 == 6) && (*param_4 == 6)) && (uVar1 = param_4[1] + param_3[1], uVar1 < 0x1001)) {
      *(uint *)((long)param_1 + 4) = uVar1;
      iVar4 = param_3[1];
      *(undefined4 *)param_1 = 6;
      if (iVar4 == 0) {
        param_1[1] = *(undefined8 *)(param_4 + 2);
      }
      else if (param_4[1] == 0) {
        param_1[1] = *(undefined8 *)(param_3 + 2);
      }
      else {
        local_60 = 0;
        uStack_58 = 0;
        local_50 = (void *)0x0;
                    /* try { // try from 0089e348 to 0089e373 has its CatchHandler @ 0089ef9c */
        std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>
        ::reserve((basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *)
                  &local_60,(ulong)(uVar1 + 1));
        std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>
        ::append((basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *)
                 &local_60,*(char **)(param_3 + 2),(ulong)(uint)param_3[1]);
        std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>
        ::append((basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *)
                 &local_60,*(char **)(param_4 + 2),(ulong)(uint)param_4[1]);
        pvVar2 = local_50;
        if ((local_60 & 1) == 0) {
          pvVar2 = (void *)((long)&local_60 + 1);
        }
                    /* try { // try from 0089e388 to 0089e38f has its CatchHandler @ 0089ef98 */
        uVar8 = FUN_008530cc(param_5,pvVar2,*(undefined4 *)((long)param_1 + 4));
        param_1[1] = uVar8;
        if ((local_60 & 1) != 0) {
          operator_delete(local_50,local_60 & 0xfffffffffffffffe);
        }
      }
    }
    break;
  case 8:
    iVar4 = *param_3;
    if ((iVar4 != 0) && (iVar3 = *param_4, iVar3 != 0)) {
      if ((iVar4 == 4) && (iVar3 == 4)) {
        if ((((float)param_3[2] != (float)param_4[2]) || ((float)param_3[3] != (float)param_4[3]))
           || (((float)param_3[4] != (float)param_4[4] || ((float)param_3[5] == (float)param_4[5])))
           ) {
LAB_0089e9e4:
          *(undefined4 *)param_1 = 2;
          bVar6 = FUN_0089fd34(param_3,param_4);
          *(byte *)(param_1 + 1) = (bVar6 ^ 0xff) & 1;
        }
      }
      else if (((((iVar4 != 5) || (iVar3 != 5)) ||
                (*(double *)(param_3 + 2) != *(double *)(param_4 + 2))) ||
               ((*(double *)(param_3 + 4) != *(double *)(param_4 + 4) ||
                (*(double *)(param_3 + 6) != *(double *)(param_4 + 6))))) ||
              (*(double *)(param_3 + 8) == *(double *)(param_4 + 8))) goto LAB_0089e9e4;
    }
    break;
  case 9:
    iVar4 = *param_3;
    if ((iVar4 != 0) && (iVar3 = *param_4, iVar3 != 0)) {
      if ((iVar4 == 4) && (iVar3 == 4)) {
        if (((((float)param_3[2] != (float)param_4[2]) || ((float)param_3[3] != (float)param_4[3]))
            || ((float)param_3[4] != (float)param_4[4])) || ((float)param_3[5] == (float)param_4[5])
           ) {
LAB_0089e84c:
          *(undefined4 *)param_1 = 2;
          bVar6 = FUN_0089fd34(param_3,param_4);
          *(byte *)(param_1 + 1) = bVar6 & 1;
        }
      }
      else if (((((iVar4 != 5) || (iVar3 != 5)) ||
                (*(double *)(param_3 + 2) != *(double *)(param_4 + 2))) ||
               ((*(double *)(param_3 + 4) != *(double *)(param_4 + 4) ||
                (*(double *)(param_3 + 6) != *(double *)(param_4 + 6))))) ||
              (*(double *)(param_3 + 8) == *(double *)(param_4 + 8))) goto LAB_0089e84c;
    }
    break;
  case 10:
    if ((*param_3 == 3) && (*param_4 == 3)) {
      *(undefined4 *)param_1 = 2;
      bVar7 = *(double *)(param_3 + 2) < *(double *)(param_4 + 2);
LAB_0089e4b0:
      *(bool *)(param_1 + 1) = bVar7;
    }
    break;
  case 0xb:
    if ((*param_3 == 3) && (*param_4 == 3)) {
      *(undefined4 *)param_1 = 2;
      bVar7 = *(double *)(param_3 + 2) <= *(double *)(param_4 + 2);
      goto LAB_0089e4b0;
    }
    break;
  case 0xc:
    if ((*param_3 == 3) && (*param_4 == 3)) {
      *(undefined4 *)param_1 = 2;
      bVar7 = *(double *)(param_4 + 2) < *(double *)(param_3 + 2);
      goto LAB_0089e4b0;
    }
    break;
  case 0xd:
    if ((*param_3 == 3) && (*param_4 == 3)) {
      *(undefined4 *)param_1 = 2;
      bVar7 = *(double *)(param_4 + 2) <= *(double *)(param_3 + 2);
      goto LAB_0089e4b0;
    }
    break;
  case 0xe:
    iVar4 = *param_3;
    if (iVar4 != 0) {
      if ((iVar4 != 1) && ((iVar4 != 2 || ((char)param_3[2] != '\0')))) {
        param_3 = param_4;
      }
      if (*(long *)(lVar5 + 0x28) == local_48) {
        uVar16 = *(undefined8 *)(param_3 + 2);
        uVar14 = *(undefined8 *)param_3;
        uVar12 = *(undefined8 *)(param_3 + 6);
        uVar10 = *(undefined8 *)(param_3 + 4);
        uVar8 = *(undefined8 *)(param_3 + 8);
LAB_0089e2a8:
        param_1[4] = uVar8;
        param_1[1] = uVar16;
        *param_1 = uVar14;
        param_1[3] = uVar12;
        param_1[2] = uVar10;
        return;
      }
      goto LAB_0089efd0;
    }
    break;
  case 0xf:
    iVar4 = *param_3;
    if (iVar4 != 0) {
      if ((iVar4 != 1) && ((iVar4 != 2 || ((char)param_3[2] != '\0')))) {
        param_4 = param_3;
      }
      if (*(long *)(lVar5 + 0x28) == local_48) {
        uVar16 = *(undefined8 *)(param_4 + 2);
        uVar14 = *(undefined8 *)param_4;
        uVar12 = *(undefined8 *)(param_4 + 6);
        uVar10 = *(undefined8 *)(param_4 + 4);
        uVar8 = *(undefined8 *)(param_4 + 8);
        goto LAB_0089e2a8;
      }
      goto LAB_0089efd0;
    }
  }
  if (*(long *)(lVar5 + 0x28) == local_48) {
    return;
  }
LAB_0089efd0:
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}

