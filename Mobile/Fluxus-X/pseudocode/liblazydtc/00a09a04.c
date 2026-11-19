/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a09a04
 */

void bn_mul_recursive(ulong *param_1,long param_2,long param_3,uint param_4,int param_5,int param_6,
                     ulong *param_7)

{
  ulong *puVar1;
  int iVar2;
  long lVar3;
  long lVar4;
  uint uVar5;
  int iVar6;
  bool bVar7;
  bool bVar8;
  int iVar9;
  int iVar10;
  int iVar11;
  long lVar12;
  long lVar13;
  long lVar14;
  ulong uVar15;
  ulong *bp;
  ulong *rp;
  ulong uVar16;
  
  uVar5 = param_4;
  if ((int)param_4 < 0) {
    uVar5 = param_4 + 1;
  }
  if ((param_4 == 8) && (param_6 == 0 && param_5 == 0)) {
    bn_mul_comba8(param_1,param_2,param_3);
    return;
  }
  if ((int)param_4 < 0x10) {
    bn_mul_normal(param_1,param_2,param_5 + param_4,param_3,param_6 + param_4);
    param_6 = param_6 + param_5;
    if (param_6 < 0) {
      memset(param_1 + (int)(param_6 + param_4 * 2),0,
             -(ulong)((uint)-param_6 >> 0x1f) & 0xfffffff800000000 | (ulong)(uint)-param_6 << 3);
      return;
    }
    return;
  }
  uVar5 = (int)uVar5 >> 1;
  uVar15 = (ulong)uVar5;
  uVar16 = -(ulong)(uVar5 >> 0x1f) & 0xfffffff800000000 | uVar15 << 3;
  iVar6 = -param_5;
  iVar11 = uVar5 + param_5;
  lVar14 = (long)(int)uVar5;
  lVar3 = param_2 + uVar16;
  iVar2 = uVar5 + param_6;
  iVar9 = bn_cmp_part_words(param_2,lVar3,iVar11,iVar6);
  lVar4 = param_3 + uVar16;
  iVar10 = bn_cmp_part_words(lVar4,param_3,iVar2,param_6);
  switch(iVar9 * 3 + iVar10) {
  case 2:
    bn_sub_part_words(param_7,param_2,lVar3,iVar11,iVar6);
    lVar12 = param_3;
    lVar13 = lVar4;
    iVar11 = -param_6;
LAB_00a09c0c:
    bn_sub_part_words(param_7 + lVar14,lVar12,lVar13,iVar2,iVar11);
    bVar8 = false;
    bVar7 = true;
    goto LAB_00a09c58;
  case 4:
    bn_sub_part_words(param_7,param_2,lVar3,iVar11,iVar6);
    lVar12 = lVar4;
    lVar13 = param_3;
    iVar11 = param_6;
    break;
  case -4:
    bn_sub_part_words(param_7,lVar3,param_2,iVar11,param_5);
    iVar11 = -param_6;
    lVar12 = param_3;
    lVar13 = lVar4;
    break;
  case -3:
  case -1:
  case 0:
  case 1:
  case 3:
    bVar7 = false;
    bVar8 = true;
    goto LAB_00a09c58;
  case -2:
    bn_sub_part_words(param_7,lVar3,param_2,iVar11,param_5);
    lVar12 = lVar4;
    lVar13 = param_3;
    iVar11 = param_6;
    goto LAB_00a09c0c;
  default:
    bVar7 = false;
    bVar8 = false;
    goto LAB_00a09c58;
  }
  bn_sub_part_words(param_7 + lVar14,lVar12,lVar13,iVar2,iVar11);
  bVar8 = false;
  bVar7 = false;
LAB_00a09c58:
  if (((param_4 & 0xfffffffe) == 8) && (param_6 == 0 && param_5 == 0)) {
    rp = param_7 + (int)param_4;
    if (bVar8) {
      rp[5] = 0;
      rp[4] = 0;
      rp[7] = 0;
      rp[6] = 0;
      rp[1] = 0;
      *rp = 0;
      rp[3] = 0;
      rp[2] = 0;
    }
    else {
      bn_mul_comba4(rp,param_7,param_7 + lVar14);
    }
    bn_mul_comba4(param_1,param_2,param_3);
    bp = param_1 + (int)param_4;
    bn_mul_comba4(bp,lVar3,lVar4);
  }
  else if (((param_4 & 0xfffffffe) == 0x10) && (param_6 == 0 && param_5 == 0)) {
    rp = param_7 + (int)param_4;
    if (bVar8) {
      memset(rp,0,0x80);
    }
    else {
      bn_mul_comba8(rp,param_7,param_7 + lVar14);
    }
    bn_mul_comba8(param_1,param_2,param_3);
    bp = param_1 + (int)param_4;
    bn_mul_comba8(bp,lVar3,lVar4);
  }
  else {
    puVar1 = param_7 + (long)(int)param_4 * 2;
    rp = param_7 + (int)param_4;
    if (bVar8) {
      memset(rp,0,(long)(int)param_4 << 3);
    }
    else {
      bn_mul_recursive(rp,param_7,param_7 + lVar14,uVar15,0,0,puVar1);
    }
    bn_mul_recursive(param_1,param_2,param_3,uVar15,0,0,puVar1);
    bp = param_1 + (int)param_4;
    bn_mul_recursive(bp,lVar3,lVar4,uVar15,param_5,param_6,puVar1);
  }
  uVar15 = bn_add_words(param_7,param_1,bp,param_4);
  if (bVar7) {
    uVar16 = bn_sub_words(rp,param_7,rp,param_4);
    iVar11 = -(int)uVar16;
  }
  else {
    uVar16 = bn_add_words(rp,rp,param_7,param_4);
    iVar11 = (int)uVar16;
  }
  uVar16 = bn_add_words(param_1 + lVar14,param_1 + lVar14,rp,param_4);
  iVar11 = (int)uVar15 + iVar11 + (int)uVar16;
  if (iVar11 != 0) {
    lVar14 = lVar14 + (int)param_4;
    uVar15 = param_1[lVar14];
    param_1[lVar14] = uVar15 + (long)iVar11;
    if (CARRY8(uVar15,(long)iVar11)) {
      param_1 = param_1 + lVar14;
      do {
        param_1 = param_1 + 1;
        uVar15 = *param_1;
        *param_1 = uVar15 + 1;
      } while (uVar15 + 1 == 0);
    }
  }
  return;
}

