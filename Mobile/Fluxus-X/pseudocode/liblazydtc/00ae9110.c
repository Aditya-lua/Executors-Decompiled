/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ae9110
 */

undefined8 OPENSSL_sk_push(undefined4 *param_1,undefined8 param_2)

{
  undefined8 uVar1;
  
  if (param_1 == (undefined4 *)0x0) {
    return 0xffffffff;
  }
  uVar1 = OPENSSL_sk_insert(param_1,param_2,*param_1);
  return uVar1;
}

