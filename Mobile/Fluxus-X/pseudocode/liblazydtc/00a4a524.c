/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a4a524
 */

bool ossl_x448(undefined8 param_1,undefined8 param_2,undefined8 param_3)

{
  int iVar1;
  
  iVar1 = ossl_x448_int(param_1,param_3,param_2);
  return iVar1 == -1;
}

