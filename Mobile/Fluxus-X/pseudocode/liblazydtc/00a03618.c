/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a03618
 */

int BN_MONT_CTX_set(BN_MONT_CTX *mont,BIGNUM *mod,BN_CTX *ctx)

{
  BIGNUM *a;
  uint uVar1;
  int iVar2;
  int iVar3;
  BIGNUM *ret;
  BIGNUM *pBVar4;
  BIGNUM *pBVar5;
  ulong uVar6;
  ulong local_68;
  undefined8 uStack_60;
  BIGNUM local_58;
  
  iVar3 = BN_is_zero(mod);
  if (iVar3 != 0) {
    return 0;
  }
  BN_CTX_start(ctx);
  ret = BN_CTX_get(ctx);
  if (ret != (BIGNUM *)0x0) {
    a = &mont->N;
    pBVar4 = BN_copy(a,mod);
    if (pBVar4 != (BIGNUM *)0x0) {
      iVar3 = BN_get_flags(mod,4);
      if (iVar3 != 0) {
        BN_set_flags(a,4);
      }
      pBVar4 = &mont->RR;
      (mont->N).neg = 0;
      bn_init(&local_58);
      local_58.d = &local_68;
      local_58.dmax = 2;
      local_58.neg = 0;
      iVar3 = BN_get_flags(mod,4);
      if (iVar3 != 0) {
        BN_set_flags(&local_58,4);
      }
      iVar3 = BN_num_bits(mod);
      uVar1 = iVar3 + 0x7e;
      if (-1 < (int)(iVar3 + 0x3fU)) {
        uVar1 = iVar3 + 0x3fU;
      }
      mont->ri = uVar1 & 0xffffffc0;
      BN_zero_ex(pBVar4);
      iVar3 = BN_set_bit(pBVar4,0x40);
      if (iVar3 != 0) {
        local_68 = *mod->d;
        uStack_60 = 0;
        local_58.top = (int)(local_68 != 0);
        iVar3 = BN_is_one(&local_58);
        if (iVar3 == 0) {
          pBVar5 = BN_mod_inverse(ret,pBVar4,&local_58,ctx);
          if (pBVar5 == (BIGNUM *)0x0) goto LAB_00a03848;
        }
        else {
          BN_zero_ex(ret);
        }
        iVar3 = BN_lshift(ret,ret,0x40);
        if (iVar3 != 0) {
          iVar3 = BN_is_zero(ret);
          if (iVar3 == 0) {
            iVar3 = BN_sub_word(ret,1);
          }
          else {
            iVar3 = BN_set_word(ret,0xffffffffffffffff);
          }
          if ((iVar3 != 0) && (iVar3 = BN_div(ret,(BIGNUM *)0x0,ret,&local_58,ctx), iVar3 != 0)) {
            if (ret->top < 1) {
              uVar6 = 0;
            }
            else {
              uVar6 = *ret->d;
            }
            mont->n0[0] = uVar6;
            mont->n0[1] = 0;
            BN_zero_ex(pBVar4);
            iVar3 = BN_set_bit(pBVar4,mont->ri << 1);
            if ((iVar3 != 0) && (iVar3 = BN_div((BIGNUM *)0x0,pBVar4,pBVar4,a,ctx), iVar3 != 0)) {
              iVar2 = (mont->RR).top;
              iVar3 = (mont->N).top;
              if (iVar2 < iVar3) {
                memset(pBVar4->d + iVar2,0,(ulong)(uint)((iVar3 + -1) - iVar2) * 8 + 8);
              }
              (mont->RR).top = iVar3;
              iVar3 = 1;
              goto LAB_00a0384c;
            }
          }
        }
      }
    }
  }
LAB_00a03848:
  iVar3 = 0;
LAB_00a0384c:
  BN_CTX_end(ctx);
  return iVar3;
}

