/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b4af9c
 */

undefined8 FUN_00b4af9c(long param_1,undefined8 param_2)

{
  int iVar1;
  long lVar2;
  long lVar3;
  undefined8 uVar4;
  ulong uVar5;
  
  lVar2 = OSSL_PARAM_locate(param_2,&DAT_002d7e7d);
  if (lVar2 == 0) {
    return 0xfffffffe;
  }
  lVar3 = ossl_prov_digest_md(param_1 + 8);
  if (lVar3 == 0) {
    ERR_new();
    ERR_set_debug("providers/implementations/kdfs/x942kdf.c",0x186,"x942kdf_size");
    ERR_set_error(0x39,0x81,0);
    uVar5 = 0;
  }
  else {
    iVar1 = EVP_MD_get_size();
    uVar5 = (long)iVar1 & ((long)iVar1 >> 0x3f ^ 0xffffffffffffffffU);
  }
  uVar4 = OSSL_PARAM_set_size_t(lVar2,uVar5);
  return uVar4;
}

