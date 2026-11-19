/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b106f4
 */

void X509_STORE_CTX_set0_trusted_stack(long param_1,undefined8 param_2)

{
  *(undefined8 *)(param_1 + 0x28) = param_2;
  *(undefined1 **)(param_1 + 0x40) = &LAB_00b10714;
  *(undefined1 **)(param_1 + 0x78) = &LAB_00b10758;
  return;
}

