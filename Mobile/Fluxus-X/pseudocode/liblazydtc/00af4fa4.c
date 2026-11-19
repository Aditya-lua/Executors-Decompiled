/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00af4fa4
 */

GENERAL_NAME * GENERAL_NAME_dup(GENERAL_NAME *a)

{
  GENERAL_NAME *pGVar1;
  
  pGVar1 = ASN1_dup(i2d_GENERAL_NAME,d2i_GENERAL_NAME,a);
  return pGVar1;
}

