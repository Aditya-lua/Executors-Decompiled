/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a75648
 */

void EVP_PKEY_meth_copy(EVP_PKEY_METHOD *dst,EVP_PKEY_METHOD *src)

{
  undefined8 uVar1;
  
  uVar1 = *(undefined8 *)dst;
  memcpy(dst,src,0x100);
  *(undefined8 *)dst = uVar1;
  return;
}

