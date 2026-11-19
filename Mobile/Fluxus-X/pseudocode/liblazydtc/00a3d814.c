/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a3d814
 */

undefined8
FUN_00a3d814(undefined8 param_1,undefined8 param_2,long param_3,undefined8 param_4,
            undefined8 param_5)

{
  long lVar1;
  undefined8 *puVar2;
  undefined8 uVar3;
  
  lVar1 = EVP_MD_CTX_get_pkey_ctx();
  puVar2 = (undefined8 *)evp_pkey_get_legacy(*(undefined8 *)(lVar1 + 0x88));
  if (puVar2 == (undefined8 *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/ec/ecx_meth.c",0x362,"pkey_ecd_digestverify25519");
    ERR_set_error(0x10,0x74,0);
  }
  else if (param_3 == 0x40) {
    uVar3 = ossl_ed25519_verify(param_4,param_5,param_2,(long)puVar2 + 0x11,*puVar2,puVar2[1]);
    return uVar3;
  }
  return 0;
}

