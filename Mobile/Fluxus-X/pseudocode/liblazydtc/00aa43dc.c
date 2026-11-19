/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aa43dc
 */

undefined8 ossl_provider_self_test(long param_1)

{
  undefined8 uVar1;
  
  if (*(code **)(param_1 + 0x90) == (code *)0x0) {
    uVar1 = 1;
  }
  else {
    uVar1 = (**(code **)(param_1 + 0x90))(*(undefined8 *)(param_1 + 0xd0));
    if ((int)uVar1 == 0) {
      FUN_00aa3e00(param_1);
      uVar1 = 0;
    }
  }
  return uVar1;
}

