/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b0eb54
 */

int X509_cmp_current_time(ASN1_TIME *s)

{
  int iVar1;
  
  iVar1 = X509_cmp_time(s,(time_t *)0x0);
  return iVar1;
}

