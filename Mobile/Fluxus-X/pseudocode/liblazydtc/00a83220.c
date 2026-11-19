/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a83220
 */

int CRYPTO_memcmp(void *a,void *b,size_t len)

{
  uint uVar1;
  
  if (len == 0) {
    return 0;
  }
  uVar1 = 0;
  do {
    len = len - 1;
    uVar1 = uVar1 | *(byte *)b ^ *(byte *)a;
    a = (byte *)((long)a + 1);
    b = (byte *)((long)b + 1);
  } while (len != 0);
  return uVar1;
}

