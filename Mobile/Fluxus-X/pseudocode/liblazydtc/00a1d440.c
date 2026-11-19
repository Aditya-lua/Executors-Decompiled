/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a1d440
 */

int BN_div_recp(BIGNUM *dv,BIGNUM *rem,BIGNUM *m,BN_RECP_CTX *recp,BN_CTX *ctx)

{
  int iVar1;
  int iVar2;
  int iVar3;
  BIGNUM *pBVar4;
  BIGNUM *r;
  BIGNUM *a;
  uint uVar5;
  uint uVar6;
  
  BN_CTX_start(ctx);
  if (dv == (BIGNUM *)0x0) {
    dv = BN_CTX_get(ctx);
  }
  if (rem == (BIGNUM *)0x0) {
    rem = BN_CTX_get(ctx);
  }
  pBVar4 = BN_CTX_get(ctx);
  r = BN_CTX_get(ctx);
  uVar5 = 0;
  if (r != (BIGNUM *)0x0) {
    iVar1 = BN_ucmp(m,&recp->N);
    if (iVar1 < 0) {
      BN_zero_ex(dv);
      pBVar4 = BN_copy(rem,m);
      uVar5 = (uint)(pBVar4 != (BIGNUM *)0x0);
    }
    else {
      iVar2 = BN_num_bits(m);
      iVar1 = recp->num_bits * 2;
      if (iVar1 <= iVar2) {
        iVar1 = iVar2;
      }
      iVar2 = iVar1;
      if (iVar1 != recp->shift) {
        BN_CTX_start(ctx);
        a = BN_CTX_get(ctx);
        if ((a == (BIGNUM *)0x0) || (iVar3 = BN_set_bit(a,iVar1), iVar3 == 0)) {
          iVar2 = -1;
        }
        else {
          iVar3 = BN_div(&recp->Nr,(BIGNUM *)0x0,a,&recp->N,ctx);
          if (iVar3 == 0) {
            iVar2 = -1;
          }
        }
        BN_CTX_end(ctx);
        recp->shift = iVar2;
      }
      if ((((iVar2 != -1) && (iVar2 = BN_rshift(pBVar4,m,recp->num_bits), iVar2 != 0)) &&
          (iVar2 = BN_mul(r,pBVar4,&recp->Nr,ctx), iVar2 != 0)) &&
         (iVar1 = BN_rshift(dv,r,iVar1 - recp->num_bits), iVar1 != 0)) {
        dv->neg = 0;
        iVar1 = BN_mul(r,&recp->N,dv,ctx);
        if ((iVar1 != 0) && (iVar1 = BN_usub(rem,m,r), iVar1 != 0)) {
          uVar6 = 0xffffffff;
          rem->neg = 0;
          do {
            iVar1 = BN_ucmp(rem,&recp->N);
            if (iVar1 < 0) {
              iVar2 = BN_is_zero(rem);
              iVar1 = 0;
              if (iVar2 == 0) {
                iVar1 = m->neg;
              }
              rem->neg = iVar1;
              uVar5 = 1;
              dv->neg = (recp->N).neg ^ m->neg;
              break;
            }
            uVar6 = uVar6 + 1;
            if (2 < uVar6) {
              ERR_new();
              ERR_set_debug("crypto/bn/bn_recp.c",0x95,"BN_div_recp");
              ERR_set_error(3,0x65,0);
              goto LAB_00a1d69c;
            }
            iVar1 = BN_usub(rem,rem,&recp->N);
            if (iVar1 == 0) goto LAB_00a1d69c;
            iVar1 = BN_add_word(dv,1);
            uVar5 = 0;
          } while (iVar1 != 0);
          goto LAB_00a1d6a0;
        }
      }
LAB_00a1d69c:
      uVar5 = 0;
    }
  }
LAB_00a1d6a0:
  BN_CTX_end(ctx);
  return uVar5;
}

