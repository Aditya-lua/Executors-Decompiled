/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aceed4
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

RSA_PSS_PARAMS * RSA_PSS_PARAMS_new(void)

{
  RSA_PSS_PARAMS *pRVar1;
  
  pRVar1 = (RSA_PSS_PARAMS *)ASN1_item_new((ASN1_ITEM *)&DAT_00c7cf18);
  return pRVar1;
}

