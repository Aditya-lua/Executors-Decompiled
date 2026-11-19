/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b9e1a0
 */

undefined8
mbedtls_psa_mac_sign_finish(int *param_1,undefined8 param_2,undefined8 param_3,undefined8 *param_4)

{
  undefined8 uVar1;
  
  if (*param_1 == 0) {
    uVar1 = 0xffffff77;
  }
  else {
    uVar1 = FUN_00b9e1e0(param_1,param_2,param_3);
    if ((int)uVar1 == 0) {
      *param_4 = param_3;
    }
  }
  return uVar1;
}

