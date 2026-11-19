/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a99d94
 */

void OPENSSL_cleanse(void *ptr,size_t len)

{
  (*(code *)PTR_memset_00cc9150)(ptr,0,len);
  return;
}

