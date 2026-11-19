/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b5b9a0
 */

undefined8 FUN_00b5b9a0(long param_1,undefined8 param_2)

{
  long lVar1;
  undefined8 uVar2;
  
  lVar1 = OSSL_PARAM_locate(param_2,"state");
  if ((((lVar1 == 0) ||
       (uVar2 = OSSL_PARAM_set_int(lVar1,*(undefined4 *)(param_1 + 8)), (int)uVar2 != 0)) &&
      ((lVar1 = OSSL_PARAM_locate(param_2,"strength"), lVar1 == 0 ||
       (uVar2 = OSSL_PARAM_set_int(lVar1,*(undefined4 *)(param_1 + 0xc)), (int)uVar2 != 0)))) &&
     ((lVar1 = OSSL_PARAM_locate(param_2,"max_request"), lVar1 == 0 ||
      (uVar2 = OSSL_PARAM_set_size_t(lVar1,*(undefined8 *)(param_1 + 0x10)), (int)uVar2 != 0)))) {
    uVar2 = 1;
  }
  return uVar2;
}

