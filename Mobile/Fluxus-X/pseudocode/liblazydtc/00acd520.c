/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00acd520
 */

void RIPEMD160_Transform(RIPEMD160_CTX *c,uchar *b)

{
  ripemd160_block_data_order(c,b,1);
  return;
}

