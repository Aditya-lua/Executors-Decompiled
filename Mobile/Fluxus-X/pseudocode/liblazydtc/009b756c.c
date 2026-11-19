/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b756c
 */

undefined8 SSL_CTX_get0_certificate(long param_1)

{
  if (*(undefined8 **)(param_1 + 0x158) == (undefined8 *)0x0) {
    return 0;
  }
  return *(undefined8 *)**(undefined8 **)(param_1 + 0x158);
}

