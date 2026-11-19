/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00abe318
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

ASN1_PCTX * ASN1_PCTX_new(void)

{
  ASN1_PCTX *pAVar1;
  
  pAVar1 = (ASN1_PCTX *)CRYPTO_zalloc(0x28,"crypto/asn1/tasn_prn.c",0x27);
  if (pAVar1 == (ASN1_PCTX *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/asn1/tasn_prn.c",0x29,"ASN1_PCTX_new");
    ERR_set_error(0xd,0xc0100,0);
    return (ASN1_PCTX *)0x0;
  }
  return pAVar1;
}

