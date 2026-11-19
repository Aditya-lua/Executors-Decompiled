/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a200c4
 */

DSA * DSAparams_dup(DSA *x)

{
  DSA *pDVar1;
  
  pDVar1 = ASN1_item_dup((ASN1_ITEM *)&DAT_00c5a998,x);
  return pDVar1;
}

