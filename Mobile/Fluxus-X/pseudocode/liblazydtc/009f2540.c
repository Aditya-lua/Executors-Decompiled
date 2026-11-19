/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009f2540
 */

void d2i_PrivateKey_ex(undefined4 param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4,
                      undefined8 param_5,undefined8 param_6)

{
  long lVar1;
  
  lVar1 = FUN_009f25b4();
  if (lVar1 == 0) {
    ossl_d2i_PrivateKey_legacy(param_1,param_2,param_3,param_4,param_5,param_6);
    return;
  }
  return;
}

