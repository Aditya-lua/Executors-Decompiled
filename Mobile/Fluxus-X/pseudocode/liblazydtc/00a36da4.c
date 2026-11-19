/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a36da4
 */

ECDSA_SIG * ECDSA_do_sign_ex(uchar *dgst,int dgstlen,BIGNUM *kinv,BIGNUM *rp,EC_KEY *eckey)

{
  ECDSA_SIG *pEVar1;
  
  if (*(code **)(*(long *)eckey + 0x60) == (code *)0x0) {
    ERR_new(dgst,dgstlen);
    ERR_set_debug("crypto/ec/ecdsa_sign.c",0x1f,"ECDSA_do_sign_ex");
    ERR_set_error(0x10,0x98,0);
    return (ECDSA_SIG *)0x0;
  }
                    /* WARNING: Could not recover jumptable at 0x00a36db0. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  pEVar1 = (ECDSA_SIG *)(**(code **)(*(long *)eckey + 0x60))();
  return pEVar1;
}

