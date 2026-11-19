/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a36ea0
 */

int ECDSA_sign_setup(EC_KEY *eckey,BN_CTX *ctx,BIGNUM **kinv,BIGNUM **rp)

{
  int iVar1;
  
  if (*(code **)(*(long *)eckey + 0x58) == (code *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/ec/ecdsa_sign.c",0x38,"ECDSA_sign_setup");
    ERR_set_error(0x10,0x98,0);
    return 0;
  }
                    /* WARNING: Could not recover jumptable at 0x00a36eac. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  iVar1 = (**(code **)(*(long *)eckey + 0x58))();
  return iVar1;
}

