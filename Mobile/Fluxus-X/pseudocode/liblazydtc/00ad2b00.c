/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ad2b00
 */

undefined4 EVP_PKEY_CTX_get0_rsa_oaep_label(int *param_1,undefined8 param_2)

{
  int iVar1;
  undefined4 uVar2;
  undefined8 local_98;
  undefined8 uStack_90;
  undefined8 local_88;
  undefined8 uStack_80;
  ulong local_78;
  undefined8 local_70;
  undefined8 uStack_68;
  undefined8 uStack_60;
  undefined8 uStack_58;
  ulong local_50;
  undefined8 local_48;
  undefined8 uStack_40;
  undefined8 local_38;
  undefined8 uStack_30;
  ulong local_28;
  
  if ((param_1 == (int *)0x0) || ((*param_1 != 0x200 && (*param_1 != 0x400)))) {
    ERR_new();
    ERR_set_debug("crypto/rsa/rsa_lib.c",0x475,"EVP_PKEY_CTX_get0_rsa_oaep_label");
    ERR_set_error(6,0x93,0);
    return 0xfffffffe;
  }
  iVar1 = EVP_PKEY_CTX_is_a(param_1,&DAT_002db996);
  if (iVar1 != 0) {
    OSSL_PARAM_construct_octet_ptr(&local_98,"oaep-label",param_2,0);
    local_50 = local_78;
    uStack_68 = uStack_90;
    local_70 = local_98;
    uStack_58 = uStack_80;
    uStack_60 = local_88;
    OSSL_PARAM_construct_end(&local_98);
    local_28 = local_78;
    uStack_30 = uStack_80;
    local_38 = local_88;
    uStack_40 = uStack_90;
    local_48 = local_98;
    iVar1 = EVP_PKEY_CTX_get_params(param_1,&local_70);
    if (iVar1 != 0) {
      uVar2 = (undefined4)local_50;
      if (local_50 >> 0x1f != 0) {
        uVar2 = 0xffffffff;
      }
      return uVar2;
    }
  }
  return 0xffffffff;
}

