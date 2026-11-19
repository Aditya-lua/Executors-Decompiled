/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00970140
 */

void FUN_00970140(long param_1)

{
  undefined8 *puVar1;
  
  puVar1 = *(undefined8 **)(*(long *)(param_1 + 0x10) + 0x30);
  if ((SSL *)puVar1[1] != (SSL *)0x0) {
    SSL_free((SSL *)puVar1[1]);
    puVar1[1] = 0;
  }
  if ((SSL_CTX *)*puVar1 != (SSL_CTX *)0x0) {
    SSL_CTX_free((SSL_CTX *)*puVar1);
    *puVar1 = 0;
    *(byte *)((long)puVar1 + 0x25) = *(byte *)((long)puVar1 + 0x25) & 0xfe;
  }
  if (puVar1[3] != 0) {
    BIO_meth_free();
    puVar1[3] = 0;
  }
  return;
}

