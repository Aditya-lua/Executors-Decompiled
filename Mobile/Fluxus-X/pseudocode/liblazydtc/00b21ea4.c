/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b21ea4
 */

undefined8 FUN_00b21ea4(long param_1,undefined8 param_2)

{
  long lVar1;
  long lVar2;
  undefined1 *puVar3;
  undefined8 uVar4;
  
  uVar4 = 0;
  if (param_1 != 0) {
    lVar1 = OSSL_PARAM_locate(param_2,"digest");
    if (lVar1 != 0) {
      lVar2 = ossl_prov_digest_md(param_1 + 0x10);
      if (lVar2 == 0) {
        puVar3 = &DAT_002ab32c;
      }
      else {
        puVar3 = (undefined1 *)EVP_MD_get0_name();
      }
      uVar4 = OSSL_PARAM_set_utf8_string(lVar1,puVar3);
      if ((int)uVar4 == 0) {
        return uVar4;
      }
    }
    uVar4 = 1;
  }
  return uVar4;
}

