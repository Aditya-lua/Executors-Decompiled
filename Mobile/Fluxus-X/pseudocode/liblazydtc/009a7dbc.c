/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009a7dbc
 */

void pqueue_free(pqueue pq)

{
  CRYPTO_free(pq);
  return;
}

