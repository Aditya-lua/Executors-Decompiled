/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ae8d20
 */

undefined8 OPENSSL_sk_reserve(long param_1,undefined8 param_2)

{
  undefined8 uVar1;
  
  if (param_1 == 0) {
    ERR_new();
    ERR_set_debug("crypto/stack/stack.c",0xfb,"OPENSSL_sk_reserve");
    ERR_set_error(0xf,0xc0102,0);
    return 0;
  }
  if ((int)param_2 < 0) {
    return 1;
  }
  uVar1 = FUN_00ae8ba0(param_1,param_2,1);
  return uVar1;
}

