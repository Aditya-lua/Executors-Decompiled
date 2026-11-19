/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a2647c
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

ECDSA_SIG * ECDSA_SIG_new(void)

{
  ECDSA_SIG *pEVar1;
  
  pEVar1 = (ECDSA_SIG *)CRYPTO_zalloc(0x10,"crypto/ec/ec_asn1.c",0x4b4);
  if (pEVar1 == (ECDSA_SIG *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/ec/ec_asn1.c",0x4b6,"ECDSA_SIG_new");
    ERR_set_error(0x10,0xc0100,0);
  }
  return pEVar1;
}

