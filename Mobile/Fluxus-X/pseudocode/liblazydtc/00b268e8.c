/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b268e8
 */

undefined8 ossl_siv128_speed(long param_1,int param_2)

{
  undefined4 uVar1;
  
  uVar1 = 1;
  if (param_2 == 1) {
    uVar1 = 0xffffffff;
  }
  *(undefined4 *)(param_1 + 0x3c) = uVar1;
  return 1;
}

