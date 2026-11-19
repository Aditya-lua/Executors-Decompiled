/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b090f0
 */

ulong X509_issuer_name_hash_old(X509 *a)

{
  ulong uVar1;
  
  uVar1 = X509_NAME_hash_old(*(X509_NAME **)&(a->ex_data).dummy);
  return uVar1;
}

