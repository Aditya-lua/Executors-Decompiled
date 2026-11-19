/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a36d48
 */

ECDSA_SIG * ECDSA_do_sign(uchar *dgst,int dgst_len,EC_KEY *eckey)

{
  ECDSA_SIG *pEVar1;
  
  if (*(code **)(*(long *)eckey + 0x60) == (code *)0x0) {
    ERR_new(dgst,dgst_len);
    ERR_set_debug("crypto/ec/ecdsa_sign.c",0x1f,"ECDSA_do_sign_ex");
    ERR_set_error(0x10,0x98,0);
    return (ECDSA_SIG *)0x0;
  }
                    /* WARNING: Could not recover jumptable at 0x00a36d60. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  pEVar1 = (ECDSA_SIG *)(**(code **)(*(long *)eckey + 0x60))(dgst,dgst_len,0,0,eckey);
  return pEVar1;
}

