/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ac3f74
 */

undefined8 ossl_ctx_global_properties(undefined8 param_1,int param_2)

{
  int iVar1;
  undefined8 uVar2;
  
  if ((param_2 == 0) || (iVar1 = OPENSSL_init_crypto(0x40,0), iVar1 != 0)) {
    uVar2 = ossl_lib_ctx_get_data(param_1,0xe,&DAT_00c7c670);
  }
  else {
    uVar2 = 0;
  }
  return uVar2;
}

