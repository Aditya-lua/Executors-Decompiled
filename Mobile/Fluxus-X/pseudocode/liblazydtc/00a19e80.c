/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a19e80
 */

int DH_check(DH *dh,int *codes)

{
  int iVar1;
  BN_CTX *ctx;
  BIGNUM *r;
  BIGNUM *rem;
  BIGNUM *b;
  uint uVar2;
  BIGNUM *a;
  
  iVar1 = DH_get_nid();
  *codes = 0;
  if (iVar1 != 0) {
    return 1;
  }
  iVar1 = BN_num_bits(dh->p);
  if (0x8000 < iVar1) {
    ERR_new();
    ERR_set_debug("crypto/dh/dh_check.c",0x9d,"DH_check");
    ERR_set_error(5,0x67,0);
    *codes = 0x101;
    return 0;
  }
  iVar1 = DH_check_params(dh,codes);
  if (iVar1 == 0) {
    return 0;
  }
  ctx = (BN_CTX *)BN_CTX_new_ex(dh[1].pub_key);
  if (ctx != (BN_CTX *)0x0) {
    BN_CTX_start(ctx);
    r = BN_CTX_get(ctx);
    rem = BN_CTX_get(ctx);
    if (rem != (BIGNUM *)0x0) {
      if (dh->g != (BIGNUM *)0x0) {
        iVar1 = BN_ucmp(dh->p,dh->g);
        if (0 < iVar1) {
          a = (BIGNUM *)dh->length;
          b = BN_value_one();
          iVar1 = BN_cmp(a,b);
          if ((iVar1 < 1) || (iVar1 = BN_cmp((BIGNUM *)dh->length,dh->p), -1 < iVar1)) {
LAB_00a19f84:
            *codes = *codes | 8;
          }
          else {
            iVar1 = BN_mod_exp(r,(BIGNUM *)dh->length,dh->g,dh->p,ctx);
            if (iVar1 == 0) goto LAB_00a1a0a8;
            iVar1 = BN_is_one(r);
            if (iVar1 == 0) goto LAB_00a19f84;
          }
          iVar1 = BN_check_prime(dh->g,ctx,0);
          if (-1 < iVar1) {
            if (iVar1 == 0) {
              *codes = *codes | 0x10;
            }
            iVar1 = BN_div(r,rem,dh->p,dh->g,ctx);
            if (iVar1 != 0) {
              iVar1 = BN_is_one(rem);
              if (iVar1 == 0) {
                *codes = *codes | 0x20;
              }
              if ((dh->pub_key == (BIGNUM *)0x0) || (iVar1 = BN_cmp(dh->pub_key,r), iVar1 == 0))
              goto LAB_00a1a018;
              uVar2 = *codes | 0x40;
              goto LAB_00a1a014;
            }
          }
          goto LAB_00a1a0a8;
        }
        uVar2 = *codes | 0x20;
LAB_00a1a014:
        *codes = uVar2;
      }
LAB_00a1a018:
      iVar1 = BN_check_prime(dh->p,ctx,0);
      if (-1 < iVar1) {
        if (iVar1 == 0) {
          uVar2 = *codes | 1;
LAB_00a1a074:
          *codes = uVar2;
        }
        else if (dh->g == (BIGNUM *)0x0) {
          iVar1 = BN_rshift1(r,dh->p);
          if ((iVar1 == 0) || (iVar1 = BN_check_prime(r,ctx,0), iVar1 < 0)) goto LAB_00a1a0a8;
          if (iVar1 == 0) {
            uVar2 = *codes | 2;
            goto LAB_00a1a074;
          }
        }
        iVar1 = 1;
        goto LAB_00a1a0ac;
      }
    }
  }
LAB_00a1a0a8:
  iVar1 = 0;
LAB_00a1a0ac:
  BN_CTX_end(ctx);
  BN_CTX_free(ctx);
  return iVar1;
}

