/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009a7d44
 */

void pitem_free(pitem *item)

{
  CRYPTO_free(item);
  return;
}

