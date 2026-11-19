/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b54324
 */

ulong FUN_00b54324(long param_1,uchar *param_2,long *param_3)

{
  uint uVar1;
  ulong uVar2;
  undefined8 local_a8;
  undefined8 uStack_a0;
  undefined8 local_98;
  undefined8 uStack_90;
  undefined8 local_88;
  undefined8 local_80;
  undefined8 uStack_78;
  undefined8 uStack_70;
  undefined8 uStack_68;
  undefined8 local_60;
  int local_24;
  
  memset(&local_80,0,0x50);
  local_24 = 0;
  uVar2 = ossl_prov_is_running();
  if ((int)uVar2 != 0) {
    uVar1 = EVP_EncryptFinal_ex(*(EVP_CIPHER_CTX **)(param_1 + 8),param_2,&local_24);
    uVar2 = (ulong)uVar1;
    if (uVar1 != 0) {
      local_24 = 0x10;
      OSSL_PARAM_construct_octet_string(&local_a8,&DAT_002c5a75,param_2,0x10);
      local_60 = local_88;
      uStack_78 = uStack_a0;
      local_80 = local_a8;
      uStack_68 = uStack_90;
      uStack_70 = local_98;
      uVar2 = EVP_CIPHER_CTX_get_params(*(undefined8 *)(param_1 + 8),&local_80);
      if ((int)uVar2 != 0) {
        uVar2 = 1;
        *param_3 = (long)local_24;
      }
    }
  }
  return uVar2;
}

