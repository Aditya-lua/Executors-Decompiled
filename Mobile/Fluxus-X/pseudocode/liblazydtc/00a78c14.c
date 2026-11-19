/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a78c14
 */

int DH_generate_parameters_ex(DH *dh,int prime_len,int generator,BN_GENCB *cb)

{
  int iVar1;
  BN_CTX *ctx;
  BIGNUM *a;
  BIGNUM *a_00;
  BIGNUM *pBVar2;
  undefined8 uVar3;
  code *UNRECOVERED_JUMPTABLE;
  ulong w;
  
  UNRECOVERED_JUMPTABLE = *(code **)&dh[1].priv_key[2].neg;
  if (UNRECOVERED_JUMPTABLE != (code *)0x0) {
                    /* WARNING: Could not recover jumptable at 0x00a78c6c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    iVar1 = (*UNRECOVERED_JUMPTABLE)(dh,prime_len,generator,cb);
    return iVar1;
  }
  if (10000 < prime_len) {
    ERR_new();
    ERR_set_debug("crypto/dh/dh_gen.c",0xa3,"dh_builtin_genparams");
    uVar3 = 0x67;
LAB_00a78cd0:
    ERR_set_error(5,uVar3,0);
    return 0;
  }
  if (prime_len < 0x200) {
    ERR_new();
    ERR_set_debug("crypto/dh/dh_gen.c",0xa8,"dh_builtin_genparams");
    uVar3 = 0x7e;
    goto LAB_00a78cd0;
  }
  ctx = (BN_CTX *)BN_CTX_new_ex(dh[1].pub_key);
  if (ctx != (BN_CTX *)0x0) {
    BN_CTX_start(ctx);
    a = BN_CTX_get(ctx);
    a_00 = BN_CTX_get(ctx);
    if (a_00 != (BIGNUM *)0x0) {
      if (dh->p == (BIGNUM *)0x0) {
        pBVar2 = BN_new();
        dh->p = pBVar2;
        if (pBVar2 == (BIGNUM *)0x0) goto LAB_00a78d70;
      }
      if (dh->length == 0) {
        pBVar2 = BN_new();
        dh->length = (long)pBVar2;
        if (pBVar2 == (BIGNUM *)0x0) goto LAB_00a78d70;
      }
      if (generator < 2) {
        ERR_new();
        ERR_set_debug("crypto/dh/dh_gen.c",0xbc,"dh_builtin_genparams");
        ERR_set_error(5,0x65,0);
      }
      else if (generator == 5) {
        iVar1 = BN_set_word(a,0x3c);
        if ((iVar1 != 0) && (iVar1 = BN_set_word(a_00,0x3b), iVar1 != 0)) {
          w = 5;
          goto LAB_00a78e54;
        }
      }
      else if (generator == 2) {
        iVar1 = BN_set_word(a,0x18);
        if ((iVar1 != 0) && (iVar1 = BN_set_word(a_00,0x17), iVar1 != 0)) {
          w = 2;
LAB_00a78e54:
          iVar1 = BN_generate_prime_ex2(dh->p,prime_len,1,a,a_00,cb,ctx);
          if (((iVar1 != 0) && (iVar1 = BN_GENCB_call(cb,3,0), iVar1 != 0)) &&
             (iVar1 = BN_set_word((BIGNUM *)dh->length,w), iVar1 != 0)) {
            dh[1].method_mont_p = (BN_MONT_CTX *)((long)&(dh[1].method_mont_p)->ri + 1);
            iVar1 = 1;
            goto LAB_00a78da4;
          }
        }
      }
      else {
        iVar1 = BN_set_word(a,0xc);
        if ((iVar1 != 0) && (iVar1 = BN_set_word(a_00,0xb), iVar1 != 0)) {
          w = (ulong)generator;
          goto LAB_00a78e54;
        }
      }
    }
  }
LAB_00a78d70:
  ERR_new();
  ERR_set_debug("crypto/dh/dh_gen.c",0xe2,"dh_builtin_genparams");
  ERR_set_error(5,0x80003,0);
  iVar1 = 0;
LAB_00a78da4:
  BN_CTX_end(ctx);
  BN_CTX_free(ctx);
  return iVar1;
}

