/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b0d1c4
 */

int X509_TRUST_get_trust(X509_TRUST *xp)

{
  return xp->trust;
}

