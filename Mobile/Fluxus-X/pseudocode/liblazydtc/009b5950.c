/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b5950
 */

undefined8 SSL_get_client_ciphers(long param_1)

{
  undefined8 uVar1;
  
  uVar1 = 0;
  if (param_1 != 0) {
    if (*(int *)(param_1 + 0x38) == 0) {
      return 0;
    }
    uVar1 = *(undefined8 *)(param_1 + 0x520);
  }
  return uVar1;
}

