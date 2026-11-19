/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b19328
 */

undefined8 OSSL_HTTP_close(long param_1,undefined4 param_2)

{
  long lVar1;
  undefined8 uVar2;
  
  if ((param_1 != 0) && (*(code **)(param_1 + 0x28) != (code *)0x0)) {
    lVar1 = (**(code **)(param_1 + 0x28))
                      (*(undefined8 *)(param_1 + 0x18),*(undefined8 *)(param_1 + 0x30),0,param_2);
    if (lVar1 == 0) {
      uVar2 = 0;
      goto LAB_00b19364;
    }
    *(long *)(param_1 + 0x18) = lVar1;
  }
  uVar2 = 1;
LAB_00b19364:
  OSSL_HTTP_REQ_CTX_free(param_1);
  return uVar2;
}

