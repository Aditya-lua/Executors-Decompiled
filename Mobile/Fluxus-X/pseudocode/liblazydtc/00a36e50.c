/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a36e50
 */

int ECDSA_sign_ex(int type,uchar *dgst,int dgstlen,uchar *sig,uint *siglen,BIGNUM *kinv,BIGNUM *rp,
                 EC_KEY *eckey)

{
  int iVar1;
  
  if (*(code **)(*(long *)eckey + 0x50) == (code *)0x0) {
    ERR_new(type,dgst,dgstlen);
    ERR_set_debug("crypto/ec/ecdsa_sign.c",0x2f,"ECDSA_sign_ex");
    ERR_set_error(0x10,0x98,0);
    return 0;
  }
                    /* WARNING: Could not recover jumptable at 0x00a36e5c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  iVar1 = (**(code **)(*(long *)eckey + 0x50))();
  return iVar1;
}

