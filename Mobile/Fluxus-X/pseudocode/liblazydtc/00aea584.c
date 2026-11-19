/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aea584
 */

undefined8 OSSL_STORE_INFO_get0_data(int param_1,int *param_2)

{
  undefined8 uVar1;
  
  uVar1 = 0;
  if (*param_2 == param_1) {
    uVar1 = *(undefined8 *)(param_2 + 2);
  }
  return uVar1;
}

