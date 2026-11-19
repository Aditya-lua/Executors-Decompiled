/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b0bfc
 */

void ssl_comp_free_compression_methods_int(void)

{
  undefined8 uVar1;
  
  uVar1 = DAT_00d218b8;
  DAT_00d218b8 = 0;
  OPENSSL_sk_pop_free(uVar1,&LAB_009b0c14);
  return;
}

