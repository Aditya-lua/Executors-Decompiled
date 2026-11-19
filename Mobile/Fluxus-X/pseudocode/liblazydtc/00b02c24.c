/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b02c24
 */

char * X509_PURPOSE_get0_name(X509_PURPOSE *xp)

{
  return xp->name;
}

