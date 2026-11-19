/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c3aba0
 */

ECDSA_SIG * d2i_ECDSA_SIG(ECDSA_SIG **sig,uchar **pp,long len)

{
  ECDSA_SIG *pEVar1;
  
  pEVar1 = d2i_ECDSA_SIG(sig,pp,len);
  return pEVar1;
}

