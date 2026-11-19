/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b2683c
 */

bool ossl_siv128_set_tag(long param_1,undefined8 *param_2,long param_3)

{
  undefined8 uVar1;
  
  if (param_3 == 0x10) {
    uVar1 = *param_2;
    *(undefined8 *)(param_1 + 0x18) = param_2[1];
    *(undefined8 *)(param_1 + 0x10) = uVar1;
  }
  return param_3 == 0x10;
}

