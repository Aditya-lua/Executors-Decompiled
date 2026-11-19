/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aa5ea0
 */

void MD4_Transform(MD4_CTX *c,uchar *b)

{
  md4_block_data_order(c,b,1);
  return;
}

