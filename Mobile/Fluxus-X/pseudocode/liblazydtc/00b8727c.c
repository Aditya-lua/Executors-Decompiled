/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b8727c
 */

undefined8 psa_crypto_local_output_alloc(undefined8 param_1,size_t param_2,undefined8 *param_3)

{
  void *pvVar1;
  undefined8 uVar2;
  
  *param_3 = 0;
  param_3[1] = 0;
  param_3[2] = 0;
  if (param_2 == 0) {
    uVar2 = 0;
  }
  else {
    pvVar1 = calloc(param_2,1);
    param_3[1] = pvVar1;
    if (pvVar1 == (void *)0x0) {
      uVar2 = 0xffffff73;
    }
    else {
      uVar2 = 0;
      param_3[2] = param_2;
      *param_3 = param_1;
    }
  }
  return uVar2;
}

