/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b0d25c
 */

int X509v3_get_ext_count(stack_st_X509_EXTENSION *x)

{
  uint uVar1;
  
  uVar1 = 0;
  if (x != (stack_st_X509_EXTENSION *)0x0) {
    uVar1 = OPENSSL_sk_num();
    uVar1 = uVar1 & ((int)uVar1 >> 0x1f ^ 0xffffffffU);
  }
  return uVar1;
}

