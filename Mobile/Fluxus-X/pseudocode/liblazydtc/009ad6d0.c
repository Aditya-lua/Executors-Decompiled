/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009ad6d0
 */

undefined4 SSL_add_store_cert_subjects_to_stack(undefined8 param_1,undefined8 param_2)

{
  undefined4 uVar1;
  undefined8 uVar2;
  
  uVar2 = OPENSSL_sk_set_cmp_func(param_1,&DAT_009ad51c);
  uVar1 = FUN_009ad72c(param_1,param_2,1);
  OPENSSL_sk_set_cmp_func(param_1,uVar2);
  return uVar1;
}

