/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a3db48
 */

undefined8 ossl_ecx_key_fromdata(long param_1,undefined8 param_2,int param_3)

{
  undefined8 *puVar1;
  int iVar2;
  long lVar3;
  long lVar4;
  undefined8 uVar5;
  long local_48;
  long local_40;
  long local_38;
  
  local_40 = 0;
  local_38 = 0;
  if (param_1 == 0) {
LAB_00a3dc34:
    uVar5 = 0;
  }
  else {
    lVar3 = OSSL_PARAM_locate_const(param_2,&DAT_002ad463);
    if (param_3 == 0) {
      lVar4 = 0;
    }
    else {
      lVar4 = OSSL_PARAM_locate_const(param_2,&DAT_002a3e83);
    }
    if (lVar3 == 0 && lVar4 == 0) {
      return 0;
    }
    if (lVar4 != 0) {
      puVar1 = (undefined8 *)(param_1 + 0x50);
      iVar2 = OSSL_PARAM_get_octet_string(lVar4,puVar1,*(undefined8 *)(param_1 + 0x58),&local_38);
      if (iVar2 == 0) goto LAB_00a3dc34;
      if (local_38 != *(long *)(param_1 + 0x58)) {
        CRYPTO_secure_clear_free(*puVar1,local_38,"crypto/ec/ecx_backend.c",0x54);
        *puVar1 = 0;
        return 0;
      }
    }
    local_48 = param_1 + 0x11;
    if (lVar3 == 0) {
      iVar2 = ossl_ecx_public_from_private(param_1);
      if (iVar2 == 0) goto LAB_00a3dc34;
    }
    else {
      iVar2 = OSSL_PARAM_get_octet_string(lVar3,&local_48,0x39,&local_40);
      if (iVar2 == 0) goto LAB_00a3dc34;
      if (local_40 != *(long *)(param_1 + 0x58)) {
        return 0;
      }
    }
    *(byte *)(param_1 + 0x10) = *(byte *)(param_1 + 0x10) | 1;
    uVar5 = 1;
  }
  return uVar5;
}

