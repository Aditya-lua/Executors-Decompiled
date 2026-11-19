/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009fda6c
 */

/* WARNING: Removing unreachable block (ram,0x009fdcc8) */
/* WARNING: Removing unreachable block (ram,0x009fddb8) */
/* WARNING: Removing unreachable block (ram,0x009fdde8) */
/* WARNING: Removing unreachable block (ram,0x009fdb84) */
/* WARNING: Removing unreachable block (ram,0x009fdd90) */
/* WARNING: Removing unreachable block (ram,0x009fdcd8) */
/* WARNING: Removing unreachable block (ram,0x009fdd80) */
/* WARNING: Removing unreachable block (ram,0x009fde18) */
/* WARNING: Removing unreachable block (ram,0x009fde60) */
/* WARNING: Removing unreachable block (ram,0x009fde78) */
/* WARNING: Removing unreachable block (ram,0x009fde30) */
/* WARNING: Removing unreachable block (ram,0x009fdda0) */
/* WARNING: Removing unreachable block (ram,0x009fdbd4) */
/* WARNING: Removing unreachable block (ram,0x009fdba4) */
/* WARNING: Removing unreachable block (ram,0x009fdd2c) */
/* WARNING: Removing unreachable block (ram,0x009fde00) */
/* WARNING: Removing unreachable block (ram,0x009fddd0) */
/* WARNING: Removing unreachable block (ram,0x009fdb58) */
/* WARNING: Removing unreachable block (ram,0x009fdb18) */
/* WARNING: Removing unreachable block (ram,0x009fe3d4) */

undefined8
FUN_009fda6c(undefined8 param_1,long param_2,ulong *param_3,long *param_4,uint *param_5,
            byte *param_6,long *param_7)

{
  long *plVar1;
  byte bVar2;
  uint uVar3;
  int iVar4;
  int iVar5;
  undefined8 uVar6;
  undefined4 uVar7;
  uint *puVar8;
  ulong *puVar9;
  undefined8 *puVar10;
  short *psVar11;
  int *piVar12;
  ulong uVar13;
  uint uVar14;
  long lVar15;
  ushort *puVar16;
  undefined4 uVar17;
  uint uVar18;
  uint uVar19;
  byte *pbVar20;
  byte *pbVar21;
  char *pcVar22;
  uint uVar23;
  undefined8 uVar24;
  ulong local_68;
  
  plVar1 = param_7 + 3;
  local_68 = 0;
  uVar7 = 0;
  uVar23 = 0;
  iVar4 = 0;
  uVar18 = 0;
  uVar14 = 0xffffffff;
  pbVar20 = param_6 + 1;
  uVar19 = (uint)*param_6;
LAB_009fdac8:
  do {
    if (uVar19 == 0) goto LAB_009fe4b0;
    if ((param_2 == 0) && (*param_3 <= local_68)) goto LAB_009fe4b4;
    pbVar21 = pbVar20;
    switch(iVar4) {
    case 0:
      if (uVar19 == 0x25) {
        bVar2 = *pbVar20;
        iVar4 = 1;
        pbVar20 = pbVar20 + 1;
        uVar19 = (uint)bVar2;
      }
      else {
        iVar5 = FUN_009fe654(param_1,param_2,&local_68,param_3,uVar19);
        iVar4 = 0;
        if (iVar5 == 0) {
          return 0;
        }
        bVar2 = *pbVar20;
        pbVar20 = pbVar20 + 1;
        uVar19 = (uint)bVar2;
      }
      goto LAB_009fdac8;
    case 1:
      iVar4 = 2;
      switch(uVar19) {
      case 0x20:
        uVar19 = (uint)*pbVar20;
        uVar23 = uVar23 | 4;
        iVar4 = 1;
        pbVar20 = pbVar20 + 1;
        goto LAB_009fdac8;
      case 0x23:
        uVar19 = (uint)*pbVar20;
        uVar23 = uVar23 | 8;
        iVar4 = 1;
        pbVar20 = pbVar20 + 1;
        goto LAB_009fdac8;
      case 0x2b:
        uVar19 = (uint)*pbVar20;
        uVar23 = uVar23 | 2;
        iVar4 = 1;
        pbVar20 = pbVar20 + 1;
        goto LAB_009fdac8;
      case 0x2d:
        uVar19 = (uint)*pbVar20;
        uVar23 = uVar23 | 1;
        iVar4 = 1;
        pbVar20 = pbVar20 + 1;
        goto LAB_009fdac8;
      case 0x30:
        uVar19 = (uint)*pbVar20;
        uVar23 = uVar23 | 0x10;
        iVar4 = 1;
        pbVar20 = pbVar20 + 1;
        goto LAB_009fdac8;
      }
      break;
    case 2:
      iVar4 = ossl_isdigit(uVar19);
      if (iVar4 == 0) {
        if (uVar19 == 0x2a) {
          iVar4 = (int)*plVar1;
          if ((iVar4 < 0) && (*(int *)plVar1 = iVar4 + 8, iVar4 + 8 < 1)) {
            puVar8 = (uint *)(param_7[1] + (long)iVar4);
          }
          else {
            puVar8 = (uint *)*param_7;
            *param_7 = (long)(puVar8 + 2);
          }
          uVar18 = *puVar8;
          uVar19 = (uint)*pbVar20;
          iVar4 = 3;
          pbVar20 = pbVar20 + 1;
        }
        else {
          iVar4 = 3;
        }
      }
      else {
        bVar2 = *pbVar20;
        uVar18 = (uVar19 + uVar18 * 10) - 0x30;
        iVar4 = 2;
        pbVar20 = pbVar20 + 1;
        uVar19 = (uint)bVar2;
      }
      goto LAB_009fdac8;
    case 3:
      if (uVar19 == 0x2e) {
        bVar2 = *pbVar20;
        iVar4 = 4;
        pbVar20 = pbVar20 + 1;
        uVar19 = (uint)bVar2;
      }
      else {
        iVar4 = 5;
      }
      goto LAB_009fdac8;
    case 4:
      iVar4 = ossl_isdigit(uVar19);
      if (iVar4 == 0) {
        if (uVar19 == 0x2a) {
          iVar4 = (int)*plVar1;
          if ((iVar4 < 0) && (*(int *)plVar1 = iVar4 + 8, iVar4 + 8 < 1)) {
            puVar8 = (uint *)(param_7[1] + (long)iVar4);
          }
          else {
            puVar8 = (uint *)*param_7;
            *param_7 = (long)(puVar8 + 2);
          }
          uVar14 = *puVar8;
          bVar2 = *pbVar20;
          iVar4 = 5;
          pbVar20 = pbVar20 + 1;
          uVar19 = (uint)bVar2;
        }
        else {
          iVar4 = 5;
        }
      }
      else {
        bVar2 = *pbVar20;
        uVar14 = (uVar19 + (uVar14 & ((int)uVar14 >> 0x1f ^ 0xffffffffU)) * 10) - 0x30;
        iVar4 = 4;
        pbVar20 = pbVar20 + 1;
        uVar19 = (uint)bVar2;
      }
      goto LAB_009fdac8;
    case 5:
      iVar4 = 6;
      switch(uVar19) {
      case 0x4c:
        uVar19 = (uint)*pbVar20;
        uVar7 = 3;
        iVar4 = 6;
        pbVar20 = pbVar20 + 1;
        goto LAB_009fdac8;
      case 0x68:
        uVar19 = (uint)*pbVar20;
        uVar7 = 1;
        iVar4 = 6;
        pbVar20 = pbVar20 + 1;
        goto LAB_009fdac8;
      case 0x6a:
      case 0x71:
        pbVar21 = pbVar20 + 1;
        uVar19 = (uint)*pbVar20;
        uVar7 = 4;
        iVar4 = 6;
        break;
      case 0x6c:
        pbVar21 = pbVar20 + 1;
        if (*pbVar20 != 0x6c) {
          pbVar21 = pbVar20;
        }
        uVar19 = (uint)*pbVar21;
        uVar7 = 4;
        if (*pbVar20 != 0x6c) {
          uVar7 = 2;
        }
        iVar4 = 6;
        pbVar20 = pbVar21 + 1;
        goto LAB_009fdac8;
      case 0x7a:
        uVar19 = (uint)*pbVar20;
        uVar7 = 5;
        iVar4 = 6;
        pbVar20 = pbVar20 + 1;
        goto LAB_009fdac8;
      }
      break;
    case 6:
      switch(uVar19) {
      case 0x25:
        goto LAB_009fdfe0;
      case 0x45:
        uVar23 = uVar23 | 0x20;
      case 0x65:
        iVar4 = *(int *)((long)param_7 + 0x1c);
        if ((iVar4 < 0) && (*(int *)((long)param_7 + 0x1c) = iVar4 + 0x10, iVar4 + 0x10 < 1)) {
          puVar10 = (undefined8 *)(param_7[2] + (long)iVar4);
        }
        else {
          puVar10 = (undefined8 *)*param_7;
          *param_7 = (long)(puVar10 + 1);
        }
        uVar24 = *puVar10;
        uVar6 = 1;
        goto LAB_009fe044;
      case 0x47:
        uVar23 = uVar23 | 0x20;
      case 0x67:
        iVar4 = *(int *)((long)param_7 + 0x1c);
        if ((iVar4 < 0) && (*(int *)((long)param_7 + 0x1c) = iVar4 + 0x10, iVar4 + 0x10 < 1)) {
          puVar10 = (undefined8 *)(param_7[2] + (long)iVar4);
        }
        else {
          puVar10 = (undefined8 *)*param_7;
          *param_7 = (long)(puVar10 + 1);
        }
        uVar24 = *puVar10;
        uVar6 = 2;
LAB_009fe044:
        uVar6 = FUN_009fea48(uVar24,param_1,param_2,&local_68,param_3,uVar18,uVar14,uVar23,uVar6);
        iVar4 = (int)uVar6;
joined_r0x009fe3b0:
        if (iVar4 == 0) {
          return uVar6;
        }
        break;
      case 0x58:
        uVar23 = uVar23 | 0x20;
      case 0x6f:
      case 0x75:
      case 0x78:
        uVar23 = uVar23 | 0x40;
        switch(uVar7) {
        case 1:
          iVar4 = (int)*plVar1;
          if ((iVar4 < 0) && (*(int *)plVar1 = iVar4 + 8, iVar4 + 8 < 1)) {
            uVar13 = (ulong)*(ushort *)(param_7[1] + (long)iVar4);
          }
          else {
            puVar16 = (ushort *)*param_7;
            *param_7 = (long)(puVar16 + 4);
            uVar13 = (ulong)*puVar16;
          }
          break;
        case 2:
        case 4:
        case 5:
          iVar4 = (int)*plVar1;
          if ((iVar4 < 0) && (*(int *)plVar1 = iVar4 + 8, iVar4 + 8 < 1)) {
            puVar9 = (ulong *)(param_7[1] + (long)iVar4);
          }
          else {
            puVar9 = (ulong *)*param_7;
            *param_7 = (long)(puVar9 + 1);
          }
          uVar13 = *puVar9;
          break;
        default:
          iVar4 = (int)*plVar1;
          if ((iVar4 < 0) && (*(int *)plVar1 = iVar4 + 8, iVar4 + 8 < 1)) {
            puVar8 = (uint *)(param_7[1] + (long)iVar4);
          }
          else {
            puVar8 = (uint *)*param_7;
            *param_7 = (long)(puVar8 + 2);
          }
          uVar13 = (ulong)*puVar8;
        }
        uVar17 = 10;
        if (uVar19 != 0x75) {
          uVar17 = 0x10;
        }
        uVar7 = 8;
        if (uVar19 != 0x6f) {
          uVar7 = uVar17;
        }
        goto LAB_009fe398;
      case 99:
        iVar4 = (int)*plVar1;
        if ((iVar4 < 0) && (*(int *)plVar1 = iVar4 + 8, iVar4 + 8 < 1)) {
          puVar8 = (uint *)(param_7[1] + (long)iVar4);
        }
        else {
          puVar8 = (uint *)*param_7;
          *param_7 = (long)(puVar8 + 2);
        }
        uVar19 = *puVar8;
LAB_009fdfe0:
        uVar6 = FUN_009fe654(param_1,param_2,&local_68,param_3,uVar19);
        iVar4 = (int)uVar6;
        goto joined_r0x009fe3b0;
      case 100:
      case 0x69:
        switch(uVar7) {
        case 1:
          iVar4 = (int)*plVar1;
          if ((iVar4 < 0) && (*(int *)plVar1 = iVar4 + 8, iVar4 + 8 < 1)) {
            uVar13 = (ulong)*(short *)(param_7[1] + (long)iVar4);
          }
          else {
            psVar11 = (short *)*param_7;
            *param_7 = (long)(psVar11 + 4);
            uVar13 = (ulong)*psVar11;
          }
          break;
        case 2:
        case 4:
        case 5:
          iVar4 = (int)*plVar1;
          if ((iVar4 < 0) && (*(int *)plVar1 = iVar4 + 8, iVar4 + 8 < 1)) {
            puVar9 = (ulong *)(param_7[1] + (long)iVar4);
          }
          else {
            puVar9 = (ulong *)*param_7;
            *param_7 = (long)(puVar9 + 1);
          }
          uVar13 = *puVar9;
          break;
        default:
          iVar4 = (int)*plVar1;
          if ((iVar4 < 0) && (*(int *)plVar1 = iVar4 + 8, iVar4 + 8 < 1)) {
            piVar12 = (int *)(param_7[1] + (long)iVar4);
          }
          else {
            piVar12 = (int *)*param_7;
            *param_7 = (long)(piVar12 + 2);
          }
          uVar13 = (ulong)*piVar12;
        }
        uVar7 = 10;
        goto LAB_009fe398;
      case 0x66:
        iVar4 = *(int *)((long)param_7 + 0x1c);
        if ((iVar4 < 0) && (*(int *)((long)param_7 + 0x1c) = iVar4 + 0x10, iVar4 + 0x10 < 1)) {
          puVar10 = (undefined8 *)(param_7[2] + (long)iVar4);
        }
        else {
          puVar10 = (undefined8 *)*param_7;
          *param_7 = (long)(puVar10 + 1);
        }
        uVar24 = *puVar10;
        uVar6 = 0;
        goto LAB_009fe044;
      case 0x6e:
        iVar4 = (int)*plVar1;
        if ((iVar4 < 0) && (*(int *)plVar1 = iVar4 + 8, iVar4 + 8 < 1)) {
          puVar10 = (undefined8 *)(param_7[1] + (long)iVar4);
        }
        else {
          puVar10 = (undefined8 *)*param_7;
          *param_7 = (long)(puVar10 + 1);
        }
        *(int *)*puVar10 = (int)local_68;
        break;
      case 0x70:
        iVar4 = (int)*plVar1;
        if ((iVar4 < 0) && (*(int *)plVar1 = iVar4 + 8, iVar4 + 8 < 1)) {
          puVar9 = (ulong *)(param_7[1] + (long)iVar4);
        }
        else {
          puVar9 = (ulong *)*param_7;
          *param_7 = (long)(puVar9 + 1);
        }
        uVar13 = *puVar9;
        uVar23 = uVar23 | 8;
        uVar7 = 0x10;
LAB_009fe398:
        uVar6 = FUN_009fe7b8(param_1,param_2,&local_68,param_3,uVar13,uVar7,uVar18,uVar14,uVar23);
        iVar4 = (int)uVar6;
        goto joined_r0x009fe3b0;
      case 0x73:
        iVar4 = (int)*plVar1;
        if ((iVar4 < 0) && (*(int *)plVar1 = iVar4 + 8, iVar4 + 8 < 1)) {
          puVar10 = (undefined8 *)(param_7[1] + (long)iVar4);
        }
        else {
          puVar10 = (undefined8 *)*param_7;
          *param_7 = (long)(puVar10 + 1);
        }
        if (((int)uVar14 < 0) && (uVar14 = 0x7fffffff, param_2 == 0)) {
          uVar14 = (uint)*param_3;
        }
        lVar15 = (long)(int)uVar14;
        pcVar22 = "<NULL>";
        if ((char *)*puVar10 != (char *)0x0) {
          pcVar22 = (char *)*puVar10;
        }
        if (lVar15 < 0) {
          lVar15 = -1;
        }
        lVar15 = OPENSSL_strnlen(pcVar22,lVar15);
        uVar3 = uVar18 - (int)lVar15;
        uVar19 = 0;
        if (-1 < (int)(uVar3 | uVar18)) {
          uVar19 = uVar3;
        }
        uVar18 = uVar14;
        if ((-1 < (int)uVar14) &&
           (uVar18 = uVar19 + uVar14, (int)(0x7fffffff - uVar19) <= (int)uVar14)) {
          uVar18 = 0x7fffffff;
        }
        uVar14 = -uVar19;
        if ((uVar23 & 1) == 0) {
          uVar14 = uVar19;
        }
        if (((int)uVar14 < 1) || (uVar18 == 0)) {
          uVar19 = 0;
        }
        else {
          uVar19 = 0;
          uVar23 = uVar14;
          do {
            uVar6 = FUN_009fe654(param_1,param_2,&local_68,param_3,0x20);
            if ((int)uVar6 == 0) {
              return uVar6;
            }
            uVar14 = uVar23 - 1;
            uVar19 = uVar19 + 1;
          } while ((1 < (int)uVar23) && (uVar23 = uVar14, uVar19 < uVar18));
        }
        if ((lVar15 != 0) && (uVar19 < uVar18)) {
          lVar15 = -lVar15;
          do {
            lVar15 = lVar15 + 1;
            uVar6 = FUN_009fe654(param_1,param_2,&local_68,param_3,*pcVar22);
            if ((int)uVar6 == 0) {
              return uVar6;
            }
            uVar19 = uVar19 + 1;
          } while ((uVar19 < uVar18) && (pcVar22 = pcVar22 + 1, lVar15 != 0));
        }
        if (((int)uVar14 < 0) && (uVar19 < uVar18)) {
          do {
            uVar19 = uVar19 + 1;
            uVar6 = FUN_009fe654(param_1,param_2,&local_68,param_3,0x20);
            if ((int)uVar6 == 0) {
              return uVar6;
            }
          } while (((int)uVar14 < -1) && (uVar14 = uVar14 + 1, uVar19 < uVar18));
        }
        break;
      case 0x77:
        pbVar20 = pbVar20 + 1;
      }
      bVar2 = *pbVar20;
      uVar18 = 0;
      iVar4 = 0;
      uVar23 = 0;
      uVar7 = 0;
      uVar14 = 0xffffffff;
      pbVar20 = pbVar20 + 1;
      uVar19 = (uint)bVar2;
      goto LAB_009fdac8;
    }
    pbVar20 = pbVar21;
    if (iVar4 == 7) {
LAB_009fe4b0:
      if (param_2 == 0) {
LAB_009fe4b4:
        uVar13 = *param_3 - 1;
        *param_5 = (uint)(uVar13 < local_68);
        if (uVar13 < local_68) {
          local_68 = uVar13;
        }
      }
      uVar6 = FUN_009fe654(param_1,param_2,&local_68,param_3,0);
      if ((int)uVar6 != 0) {
        uVar6 = 1;
        *param_4 = local_68 - 1;
      }
      return uVar6;
    }
  } while( true );
}

