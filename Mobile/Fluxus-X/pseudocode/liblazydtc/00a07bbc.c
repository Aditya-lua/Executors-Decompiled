/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a07bbc
 */

/* WARNING: Type propagation algorithm not settling */

BIGNUM * int_bn_mod_inverse(BIGNUM *param_1,BIGNUM *param_2,BIGNUM *param_3,BN_CTX *param_4,
                           undefined4 *param_5)

{
  int iVar1;
  int iVar2;
  BIGNUM *pBVar3;
  BIGNUM *pBVar4;
  BIGNUM *pBVar5;
  BIGNUM *pBVar6;
  BIGNUM *pBVar7;
  BIGNUM *pBVar8;
  BIGNUM *pBVar9;
  BIGNUM *a;
  int iVar10;
  BIGNUM *b;
  BIGNUM *local_a0;
  BIGNUM *local_98;
  BIGNUM BStack_78;
  
  iVar1 = BN_abs_is_word(param_3,1);
  if ((iVar1 != 0) || (iVar1 = BN_is_zero(param_3), iVar1 != 0)) {
    *param_5 = 1;
    return (BIGNUM *)0x0;
  }
  *param_5 = 0;
  iVar1 = BN_get_flags(param_2,4);
  if ((iVar1 == 0) && (iVar1 = BN_get_flags(param_3,4), iVar1 == 0)) {
    BN_CTX_start(param_4);
    pBVar5 = BN_CTX_get(param_4);
    pBVar7 = BN_CTX_get(param_4);
    pBVar8 = BN_CTX_get(param_4);
    pBVar3 = BN_CTX_get(param_4);
    local_98 = BN_CTX_get(param_4);
    local_a0 = BN_CTX_get(param_4);
    pBVar4 = BN_CTX_get(param_4);
    a = (BIGNUM *)0x0;
    if ((pBVar4 == (BIGNUM *)0x0) ||
       (((a = param_1, param_1 == (BIGNUM *)0x0 && (a = BN_new(), a == (BIGNUM *)0x0)) ||
        (iVar1 = BN_set_word(pBVar8,1), iVar1 == 0)))) goto joined_r0x00a07e08;
    BN_zero_ex(local_a0);
    pBVar6 = BN_copy(pBVar7,param_2);
    if (((pBVar6 == (BIGNUM *)0x0) || (pBVar6 = BN_copy(pBVar5,param_3), pBVar6 == (BIGNUM *)0x0))
       || (((pBVar5->neg = 0, pBVar7->neg != 0 || (iVar1 = BN_ucmp(pBVar7,pBVar5), -1 < iVar1)) &&
           (iVar1 = BN_nnmod(pBVar7,pBVar7,pBVar5,param_4), iVar1 == 0)))) goto joined_r0x00a07e08;
    iVar1 = BN_is_odd(param_3);
    if ((iVar1 == 0) || (iVar1 = BN_num_bits(param_3), 0x800 < iVar1)) {
      iVar1 = BN_is_zero(pBVar7);
      if (iVar1 != 0) goto LAB_00a080f4;
      pBVar6 = local_a0;
      pBVar9 = pBVar5;
      iVar1 = -1;
      do {
        local_a0 = pBVar8;
        iVar10 = iVar1;
        pBVar5 = pBVar7;
        pBVar8 = pBVar9;
        b = pBVar6;
        iVar1 = BN_num_bits(pBVar8);
        iVar2 = BN_num_bits(pBVar5);
        if (iVar1 == iVar2) {
          iVar1 = BN_set_word(pBVar3,1);
          if (iVar1 == 0) goto joined_r0x00a07e08;
          iVar1 = BN_sub(local_98,pBVar8,pBVar5);
        }
        else {
          iVar1 = BN_num_bits(pBVar8);
          iVar2 = BN_num_bits(pBVar5);
          if (iVar1 == iVar2 + 1) {
            iVar1 = BN_lshift1(pBVar4,pBVar5);
            if (iVar1 == 0) goto joined_r0x00a07e08;
            iVar1 = BN_ucmp(pBVar8,pBVar4);
            if (iVar1 < 0) {
              iVar1 = BN_set_word(pBVar3,1);
              if (iVar1 == 0) goto joined_r0x00a07e08;
              pBVar7 = pBVar8;
            }
            else {
              iVar1 = BN_sub(local_98,pBVar8,pBVar4);
              if ((iVar1 == 0) || (iVar1 = BN_add(pBVar3,pBVar4,pBVar5), iVar1 == 0))
              goto joined_r0x00a07e08;
              iVar1 = BN_ucmp(pBVar8,pBVar3);
              if (iVar1 < 0) {
                iVar1 = BN_set_word(pBVar3,2);
                goto joined_r0x00a082cc;
              }
              iVar1 = BN_set_word(pBVar3,3);
              if (iVar1 == 0) goto joined_r0x00a07e08;
              pBVar7 = local_98;
            }
            iVar1 = BN_sub(local_98,pBVar7,pBVar5);
          }
          else {
            iVar1 = BN_div(pBVar3,local_98,pBVar8,pBVar5,param_4);
          }
        }
joined_r0x00a082cc:
        if (iVar1 == 0) goto joined_r0x00a07e08;
        iVar1 = BN_is_one(pBVar3);
        if (iVar1 == 0) {
          iVar1 = BN_is_word(pBVar3,2);
          if (iVar1 == 0) {
            iVar1 = BN_is_word(pBVar3,4);
            if (iVar1 == 0) {
              if (pBVar3->top == 1) {
                pBVar7 = BN_copy(pBVar8,local_a0);
                if (pBVar7 == (BIGNUM *)0x0) goto joined_r0x00a07e08;
                iVar1 = BN_mul_word(pBVar8,*pBVar3->d);
              }
              else {
                iVar1 = BN_mul(pBVar8,pBVar3,local_a0,param_4);
              }
            }
            else {
              iVar1 = BN_lshift(pBVar8,local_a0,2);
            }
          }
          else {
            iVar1 = BN_lshift1(pBVar8,local_a0);
          }
          if (iVar1 == 0) goto joined_r0x00a07e08;
          iVar1 = BN_add(pBVar8,pBVar8,b);
        }
        else {
          iVar1 = BN_add(pBVar8,local_a0,b);
        }
        if (iVar1 == 0) goto joined_r0x00a07e08;
        iVar2 = BN_is_zero(local_98);
        pBVar6 = local_a0;
        pBVar9 = pBVar5;
        pBVar7 = local_98;
        iVar1 = -iVar10;
        local_98 = b;
      } while (iVar2 == 0);
      if (0 < iVar10) goto LAB_00a080f4;
    }
    else {
      iVar1 = BN_is_zero(pBVar7);
      if (iVar1 == 0) {
        iVar1 = 0;
        do {
          while (iVar2 = BN_is_bit_set(pBVar7,iVar1), iVar2 == 0) {
            iVar2 = BN_is_odd(pBVar8);
            if ((iVar2 != 0) && (iVar2 = BN_uadd(pBVar8,pBVar8,param_3), iVar2 == 0))
            goto joined_r0x00a07e08;
            iVar1 = iVar1 + 1;
            iVar2 = BN_rshift1(pBVar8,pBVar8);
            if (iVar2 == 0) goto joined_r0x00a07e08;
          }
          if ((iVar1 != 0) && (iVar1 = BN_rshift(pBVar7,pBVar7,iVar1), iVar1 == 0))
          goto joined_r0x00a07e08;
          iVar1 = 0;
          while (iVar2 = BN_is_bit_set(pBVar5,iVar1), iVar2 == 0) {
            iVar2 = BN_is_odd(local_a0);
            if ((iVar2 != 0) && (iVar2 = BN_uadd(local_a0,local_a0,param_3), iVar2 == 0))
            goto joined_r0x00a07e08;
            iVar1 = iVar1 + 1;
            iVar2 = BN_rshift1(local_a0,local_a0);
            if (iVar2 == 0) goto joined_r0x00a07e08;
          }
          if ((iVar1 != 0) && (iVar1 = BN_rshift(pBVar5,pBVar5,iVar1), iVar1 == 0))
          goto joined_r0x00a07e08;
          iVar1 = BN_ucmp(pBVar7,pBVar5);
          if (iVar1 < 0) {
            iVar1 = BN_uadd(local_a0,local_a0,pBVar8);
            if (iVar1 == 0) goto joined_r0x00a07e08;
            iVar1 = BN_usub(pBVar5,pBVar5,pBVar7);
          }
          else {
            iVar1 = BN_uadd(pBVar8,pBVar8,local_a0);
            if (iVar1 == 0) goto joined_r0x00a07e08;
            iVar1 = BN_usub(pBVar7,pBVar7,pBVar5);
          }
          if (iVar1 == 0) goto joined_r0x00a07e08;
          iVar2 = BN_is_zero(pBVar7);
          iVar1 = 0;
        } while (iVar2 == 0);
      }
LAB_00a080f4:
      iVar1 = BN_sub(local_a0,param_3,local_a0);
      if (iVar1 == 0) goto joined_r0x00a07e08;
    }
    iVar1 = BN_is_one(pBVar5);
    if (iVar1 == 0) {
      *param_5 = 1;
      goto joined_r0x00a07e08;
    }
    if ((local_a0->neg == 0) && (iVar1 = BN_ucmp(local_a0,param_3), iVar1 < 0)) {
      pBVar7 = BN_copy(a,local_a0);
      if (pBVar7 != (BIGNUM *)0x0) goto LAB_00a08148;
LAB_00a0844c:
      pBVar7 = (BIGNUM *)0x0;
    }
    else {
      iVar1 = BN_nnmod(a,local_a0,param_3,param_4);
      if (iVar1 == 0) goto LAB_00a0844c;
LAB_00a08148:
      pBVar7 = a;
    }
    if (param_1 != (BIGNUM *)0x0 || pBVar7 != (BIGNUM *)0x0) goto LAB_00a07e10;
  }
  else {
    BN_CTX_start(param_4);
    pBVar3 = BN_CTX_get(param_4);
    pBVar4 = BN_CTX_get(param_4);
    pBVar5 = BN_CTX_get(param_4);
    pBVar6 = BN_CTX_get(param_4);
    pBVar7 = BN_CTX_get(param_4);
    pBVar8 = BN_CTX_get(param_4);
    pBVar9 = BN_CTX_get(param_4);
    a = (BIGNUM *)0x0;
    if ((pBVar9 != (BIGNUM *)0x0) &&
       (((a = param_1, param_1 != (BIGNUM *)0x0 || (a = BN_new(), a != (BIGNUM *)0x0)) &&
        (iVar1 = BN_set_word(pBVar5,1), iVar1 != 0)))) {
      BN_zero_ex(pBVar8);
      pBVar9 = BN_copy(pBVar4,param_2);
      if ((pBVar9 != (BIGNUM *)0x0) && (pBVar9 = BN_copy(pBVar3,param_3), pBVar9 != (BIGNUM *)0x0))
      {
        pBVar3->neg = 0;
        if ((pBVar4->neg != 0) || (iVar1 = BN_ucmp(pBVar4,pBVar3), -1 < iVar1)) {
          bn_init(&BStack_78);
          BN_with_flags(&BStack_78,pBVar4,4);
          iVar1 = BN_nnmod(pBVar4,&BStack_78,pBVar3,param_4);
          if (iVar1 == 0) goto joined_r0x00a07e08;
        }
        iVar1 = -1;
        while( true ) {
          pBVar9 = pBVar7;
          iVar2 = BN_is_zero(pBVar4);
          if (iVar2 != 0) break;
          bn_init(&BStack_78);
          BN_with_flags(&BStack_78,pBVar3,4);
          iVar2 = BN_div(pBVar6,pBVar9,&BStack_78,pBVar4,param_4);
          if ((iVar2 == 0) || (iVar2 = BN_mul(pBVar3,pBVar6,pBVar5,param_4), iVar2 == 0))
          goto joined_r0x00a07e08;
          iVar2 = BN_add(pBVar3,pBVar3,pBVar8);
          iVar1 = -iVar1;
          pBVar7 = pBVar8;
          pBVar8 = pBVar5;
          pBVar5 = pBVar3;
          pBVar3 = pBVar4;
          pBVar4 = pBVar9;
          if (iVar2 == 0) goto joined_r0x00a07e08;
        }
        if ((-1 < iVar1) || (iVar1 = BN_sub(pBVar8,param_3,pBVar8), iVar1 != 0)) {
          iVar1 = BN_is_one(pBVar3);
          if (iVar1 != 0) {
            if ((pBVar8->neg == 0) && (iVar1 = BN_ucmp(pBVar8,param_3), iVar1 < 0)) {
              pBVar7 = BN_copy(a,pBVar8);
              if (pBVar7 != (BIGNUM *)0x0) goto LAB_00a080d8;
LAB_00a08424:
              pBVar7 = (BIGNUM *)0x0;
            }
            else {
              iVar1 = BN_nnmod(a,pBVar8,param_3,param_4);
              if (iVar1 == 0) goto LAB_00a08424;
LAB_00a080d8:
              *param_5 = 0;
              pBVar7 = a;
            }
            if (!(param_1 != (BIGNUM *)0x0 || pBVar7 != (BIGNUM *)0x0)) goto LAB_00a07e0c;
            goto LAB_00a07e10;
          }
          *param_5 = 1;
        }
      }
    }
joined_r0x00a07e08:
    pBVar7 = (BIGNUM *)0x0;
    if (param_1 != (BIGNUM *)0x0) goto LAB_00a07e10;
  }
LAB_00a07e0c:
  BN_free(a);
LAB_00a07e10:
  BN_CTX_end(param_4);
  return pBVar7;
}

