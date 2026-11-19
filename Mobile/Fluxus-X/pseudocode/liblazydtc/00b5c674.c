/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b5c674
 */

undefined8 FUN_00b5c674(long param_1,undefined8 param_2)

{
  long lVar1;
  undefined8 uVar2;
  
  uVar2 = 0;
  if (((param_1 != 0) &&
      ((lVar1 = OSSL_PARAM_locate(param_2,"algorithm-id"), lVar1 == 0 ||
       (uVar2 = OSSL_PARAM_set_octet_string
                          (lVar1,*(undefined8 *)(param_1 + 0x150),*(undefined8 *)(param_1 + 0x158)),
       (int)uVar2 != 0)))) &&
     ((lVar1 = OSSL_PARAM_locate(param_2,"digest"), lVar1 == 0 ||
      (uVar2 = OSSL_PARAM_set_utf8_string(lVar1,param_1 + 0x19), (int)uVar2 != 0)))) {
    uVar2 = 1;
  }
  return uVar2;
}

