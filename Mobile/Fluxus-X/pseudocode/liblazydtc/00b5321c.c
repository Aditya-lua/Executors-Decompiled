/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b5321c
 */

undefined8 FUN_00b5321c(long param_1,undefined8 param_2)

{
  long lVar1;
  undefined8 uVar2;
  
  lVar1 = OSSL_PARAM_locate(param_2,&DAT_002d7e7d);
  if (((lVar1 == 0) ||
      (uVar2 = OSSL_PARAM_set_size_t(lVar1,*(undefined1 *)(param_1 + 0x80)), (int)uVar2 != 0)) &&
     ((lVar1 = OSSL_PARAM_locate(param_2,"block-size"), lVar1 == 0 ||
      (uVar2 = OSSL_PARAM_set_size_t(lVar1,0x40), (int)uVar2 != 0)))) {
    uVar2 = 1;
  }
  return uVar2;
}

