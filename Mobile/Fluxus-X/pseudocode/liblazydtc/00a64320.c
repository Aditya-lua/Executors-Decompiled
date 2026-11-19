/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a64320
 */

undefined8 EVP_KDF_names_do_all(long *param_1,undefined8 param_2,undefined8 param_3)

{
  undefined8 uVar1;
  
  if (*param_1 == 0) {
    return 1;
  }
  uVar1 = evp_names_do_all(*param_1,(int)param_1[1],param_2,param_3);
  return uVar1;
}

