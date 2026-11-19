/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b552a8
 */

undefined8 FUN_00b552a8(long param_1,undefined8 param_2)

{
  undefined4 uVar1;
  long lVar2;
  undefined8 uVar3;
  
  lVar2 = OSSL_PARAM_locate(param_2,&DAT_002d7e7d);
  if ((lVar2 == 0) ||
     (uVar3 = OSSL_PARAM_set_size_t(lVar2,*(undefined8 *)(param_1 + 0x28)), (int)uVar3 != 0)) {
    lVar2 = OSSL_PARAM_locate(param_2,"block-size");
    if (lVar2 != 0) {
      ossl_prov_digest_md(param_1 + 0x10);
      uVar1 = EVP_MD_get_block_size();
      uVar3 = OSSL_PARAM_set_int(lVar2,uVar1);
      if ((int)uVar3 == 0) {
        return uVar3;
      }
    }
    uVar3 = 1;
  }
  return uVar3;
}

