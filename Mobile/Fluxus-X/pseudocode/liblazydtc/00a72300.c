/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a72300
 */

undefined8 FUN_00a72300(undefined4 param_1,undefined8 param_2,long param_3)

{
  int iVar1;
  long lVar2;
  undefined8 uVar3;
  
  uVar3 = *(undefined8 *)(param_3 + 0x20);
  iVar1 = EVP_PKEY_get_base_id(uVar3);
  if (iVar1 == 0x74) {
    EVP_PKEY_get0_DSA(uVar3);
    lVar2 = DSA_get0_p();
  }
  else {
    if (iVar1 != 0x1c) {
      ERR_new();
      ERR_set_debug("crypto/evp/ctrl_params_translate.c",0x69f,"get_dh_dsa_payload_p");
      ERR_set_error(6,0xe0,0);
      return 0;
    }
    EVP_PKEY_get0_DH(uVar3);
    lVar2 = DH_get0_p();
  }
  if ((lVar2 == 0) || (*(int *)(*(long *)(param_3 + 0x30) + 8) != 2)) {
    return 0;
  }
  *(long *)(param_3 + 0x20) = lVar2;
  uVar3 = FUN_00a6fd84(param_1,param_2,param_3);
  return uVar3;
}

