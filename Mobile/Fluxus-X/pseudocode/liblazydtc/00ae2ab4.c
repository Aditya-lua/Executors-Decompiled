/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ae2ab4
 */

int SHA384_Update(SHA512_CTX *c,void *data,size_t len)

{
  SHA512_Update(c,data,len);
  return 1;
}

