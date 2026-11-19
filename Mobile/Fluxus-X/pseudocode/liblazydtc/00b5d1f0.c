/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b5d1f0
 */

undefined8 FUN_00b5d1f0(long param_1,undefined8 param_2)

{
  long lVar1;
  undefined8 uVar2;
  
  uVar2 = 0;
  if (((param_1 != 0) &&
      ((lVar1 = OSSL_PARAM_locate(param_2,"algorithm-id"), lVar1 == 0 ||
       (uVar2 = OSSL_PARAM_set_octet_string
                          (lVar1,*(undefined8 *)(param_1 + 0x150),*(undefined8 *)(param_1 + 0x158)),
       (int)uVar2 != 0)))) &&
     ((lVar1 = OSSL_PARAM_locate(param_2,"digest-size"), lVar1 == 0 ||
      (uVar2 = OSSL_PARAM_set_size_t(lVar1,*(undefined8 *)(param_1 + 0x160)), (int)uVar2 != 0)))) {
    lVar1 = OSSL_PARAM_locate(param_2,"digest");
    if (lVar1 != 0) {
      if (*(long *)(param_1 + 0x170) == 0) {
        param_1 = param_1 + 0x18;
      }
      else {
        param_1 = EVP_MD_get0_name();
      }
      uVar2 = OSSL_PARAM_set_utf8_string(lVar1,param_1);
      if ((int)uVar2 == 0) {
        return uVar2;
      }
    }
    uVar2 = 1;
  }
  return uVar2;
}

