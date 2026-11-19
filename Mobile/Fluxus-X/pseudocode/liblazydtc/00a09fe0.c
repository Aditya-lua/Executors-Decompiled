/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a09fe0
 */

void bn_mul_part_recursive
               (ulong *param_1,long param_2,long param_3,uint param_4,uint param_5,uint param_6,
               ulong *param_7)

{
  long lVar1;
  long lVar2;
  ulong *puVar3;
  uint uVar4;
  int iVar5;
  bool bVar6;
  int iVar7;
  int iVar8;
  int iVar9;
  long lVar10;
  long lVar11;
  ulong uVar12;
  ulong *rp;
  ulong *bp;
  long lVar13;
  ulong uVar14;
  int num;
  uint uVar15;
  
  uVar14 = (ulong)param_4;
  if ((int)param_4 < 8) {
    bn_mul_normal(param_1,param_2,param_5 + param_4,param_3,param_6 + param_4);
    return;
  }
  lVar11 = (long)(int)param_4;
  iVar9 = param_4 - param_5;
  uVar12 = -(ulong)(param_4 >> 0x1f) & 0xfffffffe00000000 | uVar14 << 1;
  lVar1 = param_2 + lVar11 * 8;
  iVar7 = bn_cmp_part_words(param_2,lVar1,param_5,iVar9);
  lVar2 = param_3 + lVar11 * 8;
  iVar5 = param_6 - param_4;
  iVar8 = bn_cmp_part_words(lVar2,param_3,param_6,iVar5);
  num = (int)(uVar14 << 1);
  switch(iVar7 * 3 + iVar8) {
  case 3:
  case 4:
    bn_sub_part_words(param_7,param_2,lVar1,param_5,iVar9);
    lVar13 = lVar2;
    lVar10 = param_3;
    break;
  case -4:
    bn_sub_part_words(param_7,lVar1,param_2,param_5,param_5 - param_4);
    iVar5 = param_4 - param_6;
    lVar13 = param_3;
    lVar10 = lVar2;
    break;
  case -3:
  case -2:
    bn_sub_part_words(param_7,lVar1,param_2,param_5,param_5 - param_4);
    lVar13 = lVar2;
    lVar10 = param_3;
    goto LAB_00a0a130;
  case -1:
  case 0:
  case 1:
  case 2:
    bn_sub_part_words(param_7,param_2,lVar1,param_5,iVar9);
    iVar5 = param_4 - param_6;
    lVar13 = param_3;
    lVar10 = lVar2;
LAB_00a0a130:
    bn_sub_part_words(param_7 + lVar11,lVar13,lVar10,param_6,iVar5);
    bVar6 = true;
    goto joined_r0x00a0a140;
  default:
    goto switchD_00a0a0c8_default;
  }
  bn_sub_part_words(param_7 + lVar11,lVar13,lVar10,param_6,iVar5);
switchD_00a0a0c8_default:
  bVar6 = false;
joined_r0x00a0a140:
  if (param_4 == 8) {
    rp = param_7 + uVar12;
    bn_mul_comba8(rp,param_7,param_7 + 8);
    bn_mul_comba8(param_1,param_2,param_3);
    bp = param_1 + uVar12;
    bn_mul_normal(bp,lVar1,param_5,lVar2,param_6);
    uVar15 = (0x10 - param_5) - param_6;
    memset(param_1 + (int)(param_5 + 0x10 + param_6),0,
           -(ulong)(uVar15 >> 0x1f) & 0xfffffff800000000 | (ulong)uVar15 << 3);
  }
  else {
    puVar3 = param_7 + lVar11 * 4;
    rp = param_7 + num;
    lVar13 = (long)num;
    bn_mul_recursive(rp,param_7,param_7 + lVar11,uVar14,0,0,puVar3);
    bn_mul_recursive(param_1,param_2,param_3,uVar14,0,0,puVar3);
    uVar15 = param_4 >> 1;
    uVar4 = param_5;
    if ((int)param_5 <= (int)param_6) {
      uVar4 = param_6;
    }
    if (uVar4 == uVar15) {
      bn_mul_recursive(param_1 + lVar13,lVar1,lVar2,uVar15,param_5 - uVar15,param_6 - uVar15,puVar3)
      ;
      uVar15 = num - (param_4 & 0xfffffffe);
      memset(param_1 + (int)(num + (param_4 & 0xfffffffe)),0,
             -(ulong)(uVar15 >> 0x1f) & 0xfffffff800000000 | (ulong)uVar15 << 3);
    }
    else {
      bp = param_1 + lVar13;
      if ((int)(uVar4 - uVar15) < 1) {
        memset(bp,0,lVar13 << 3);
        if (((int)param_5 < 0x10) && ((int)param_6 < 0x10)) {
          bn_mul_normal(bp,lVar1,param_5,lVar2,param_6);
        }
        else {
          do {
            if ((int)uVar15 < 0) {
              uVar15 = uVar15 + 1;
            }
            uVar15 = (int)uVar15 >> 1;
            if (((int)uVar15 < (int)param_5) || ((int)uVar15 < (int)param_6)) {
              bn_mul_part_recursive(bp,lVar1,lVar2,uVar15,param_5 - uVar15,param_6 - uVar15,puVar3);
              goto LAB_00a0a334;
            }
          } while ((uVar15 != param_5) && (uVar15 != param_6));
          bn_mul_recursive(bp,lVar1,lVar2,uVar15,param_5 - uVar15,param_6 - uVar15);
        }
        goto LAB_00a0a334;
      }
      bn_mul_part_recursive(bp,lVar1,lVar2,uVar15,param_5 - uVar15,param_6 - uVar15,puVar3);
      uVar15 = (num - param_5) - param_6;
      memset(param_1 + (int)(num + param_5 + param_6),0,
             -(ulong)(uVar15 >> 0x1f) & 0xfffffff800000000 | (ulong)uVar15 << 3);
    }
    bp = param_1 + lVar13;
  }
LAB_00a0a334:
  uVar14 = bn_add_words(param_7,param_1,bp,num);
  if (bVar6) {
    uVar12 = bn_sub_words(rp,param_7,rp,num);
    iVar9 = -(int)uVar12;
  }
  else {
    uVar12 = bn_add_words(rp,rp,param_7,num);
    iVar9 = (int)uVar12;
  }
  uVar12 = bn_add_words(param_1 + lVar11,param_1 + lVar11,rp,num);
  iVar9 = (int)uVar14 + iVar9 + (int)uVar12;
  if ((iVar9 != 0) &&
     (uVar14 = param_1[lVar11 * 3], param_1[lVar11 * 3] = uVar14 + (long)iVar9,
     CARRY8(uVar14,(long)iVar9))) {
    param_1 = param_1 + lVar11 * 3;
    do {
      param_1 = param_1 + 1;
      uVar14 = *param_1;
      *param_1 = uVar14 + 1;
    } while (uVar14 + 1 == 0);
  }
  return;
}

