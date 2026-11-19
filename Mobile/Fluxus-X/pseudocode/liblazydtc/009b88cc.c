/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b88cc
 */

undefined8 SSL_client_hello_get0_compression_methods(long param_1,long *param_2)

{
  long lVar1;
  
  lVar1 = *(long *)(param_1 + 0xb58);
  if (lVar1 == 0) {
    return 0;
  }
  if (param_2 != (long *)0x0) {
    *param_2 = lVar1 + 0x170;
    lVar1 = *(long *)(param_1 + 0xb58);
  }
  return *(undefined8 *)(lVar1 + 0x168);
}

