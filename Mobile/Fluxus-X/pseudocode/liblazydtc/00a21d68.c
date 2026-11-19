/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a21d68
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

DSA_SIG * DSA_SIG_new(void)

{
  DSA_SIG *pDVar1;
  
  pDVar1 = (DSA_SIG *)CRYPTO_zalloc(0x10,"crypto/dsa/dsa_sign.c",0x24);
  if (pDVar1 == (DSA_SIG *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/dsa/dsa_sign.c",0x26,"DSA_SIG_new");
    ERR_set_error(10,0xc0100,0);
  }
  return pDVar1;
}

