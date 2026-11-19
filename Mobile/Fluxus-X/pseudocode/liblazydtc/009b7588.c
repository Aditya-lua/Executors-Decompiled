/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b7588
 */

undefined8 SSL_CTX_get0_privatekey(long param_1)

{
  if (*(long **)(param_1 + 0x158) == (long *)0x0) {
    return 0;
  }
  return *(undefined8 *)(**(long **)(param_1 + 0x158) + 8);
}

