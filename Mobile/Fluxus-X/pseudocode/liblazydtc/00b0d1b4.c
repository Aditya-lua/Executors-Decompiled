/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b0d1b4
 */

int X509_TRUST_get_flags(X509_TRUST *xp)

{
  return xp->flags;
}

