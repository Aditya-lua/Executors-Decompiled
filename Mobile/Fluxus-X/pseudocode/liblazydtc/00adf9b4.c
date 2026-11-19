/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00adf9b4
 */

int SHA224_Update(SHA256_CTX *c,void *data,size_t len)

{
  SHA256_Update(c,data,len);
  return 1;
}

