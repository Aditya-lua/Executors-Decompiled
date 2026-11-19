/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a47514
 */

bool ossl_ed448_verify(undefined8 param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4,
                      undefined8 param_5,undefined8 param_6,undefined4 param_7,undefined8 param_8)

{
  int iVar1;
  
  iVar1 = ossl_c448_ed448_verify(param_1,param_4,param_5,param_2,param_3,0,param_6,param_7,param_8);
  return iVar1 == -1;
}

