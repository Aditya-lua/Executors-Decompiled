/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b02c34
 */

int X509_PURPOSE_get_trust(X509_PURPOSE *xp)

{
  return xp->trust;
}

