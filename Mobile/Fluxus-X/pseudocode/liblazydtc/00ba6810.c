/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ba6810
 */

undefined8 mbedtls_rsa_set_padding(long param_1,uint param_2,int param_3)

{
  long lVar1;
  undefined8 uVar2;
  
  if ((param_2 < 2) &&
     (((param_2 != 1 || (param_3 == 0)) || (lVar1 = mbedtls_md_info_from_type(param_3), lVar1 != 0))
     )) {
    uVar2 = 0;
    *(uint *)(param_1 + 0xe0) = param_2;
    *(int *)(param_1 + 0xe4) = param_3;
  }
  else {
    uVar2 = 0xffffbf00;
  }
  return uVar2;
}

