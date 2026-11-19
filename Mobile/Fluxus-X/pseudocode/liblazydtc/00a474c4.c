/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a474c4
 */

bool ossl_ed448_sign(undefined8 param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4,
                    undefined8 param_5,undefined8 param_6,undefined8 param_7,undefined8 param_8,
                    undefined8 param_9)

{
  int iVar1;
  
  iVar1 = ossl_c448_ed448_sign
                    (param_1,param_2,param_6,param_5,param_3,param_4,0,param_7,param_8,param_9);
  return iVar1 == -1;
}

