/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b14664
 */

void X509_VERIFY_PARAM_move_peername(long param_1,long param_2)

{
  void *pvVar1;
  
  if (param_2 == 0) {
    pvVar1 = (void *)0x0;
  }
  else {
    pvVar1 = *(void **)(param_2 + 0x48);
  }
  if (*(void **)(param_1 + 0x48) != pvVar1) {
    CRYPTO_free(*(void **)(param_1 + 0x48));
    *(void **)(param_1 + 0x48) = pvVar1;
  }
  if (param_2 != 0) {
    *(undefined8 *)(param_2 + 0x48) = 0;
  }
  return;
}

