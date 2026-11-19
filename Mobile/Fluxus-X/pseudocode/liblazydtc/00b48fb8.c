/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b48fb8
 */

undefined8 FUN_00b48fb8(undefined8 param_1,undefined8 param_2)

{
  long lVar1;
  undefined8 uVar2;
  
  lVar1 = OSSL_PARAM_locate(param_2,&DAT_002d7e7d);
  if (lVar1 == 0) {
    return 0xfffffffe;
  }
  uVar2 = OSSL_PARAM_set_size_t(lVar1,0xffffffffffffffff);
  return uVar2;
}

