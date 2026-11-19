/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aea798
 */

undefined8 OSSL_STORE_INFO_get0_PUBKEY(int *param_1)

{
  undefined8 uVar1;
  
  uVar1 = 0;
  if (*param_1 == 3) {
    uVar1 = *(undefined8 *)(param_1 + 2);
  }
  return uVar1;
}

