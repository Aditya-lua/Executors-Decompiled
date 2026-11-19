/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aa6b54
 */

void MD5_Transform(MD5_CTX *c,uchar *b)

{
  md5_block_data_order(c,b,1);
  return;
}

