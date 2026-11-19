/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b0d1bc
 */

char * X509_TRUST_get0_name(X509_TRUST *xp)

{
  return xp->name;
}

