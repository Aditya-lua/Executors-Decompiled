/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b02c2c
 */

char * X509_PURPOSE_get0_sname(X509_PURPOSE *xp)

{
  return xp->sname;
}

