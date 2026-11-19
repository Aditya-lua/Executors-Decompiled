/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ba97d0
 */

undefined8 mbedtls_oid_get_sig_alg(undefined8 param_1,undefined4 *param_2,undefined4 *param_3)

{
  long lVar1;
  undefined8 uVar2;
  
  lVar1 = FUN_00ba95ac();
  if (lVar1 == 0) {
    uVar2 = 0xffffffd2;
  }
  else {
    uVar2 = 0;
    *param_2 = *(undefined4 *)(lVar1 + 0x20);
    *param_3 = *(undefined4 *)(lVar1 + 0x24);
  }
  return uVar2;
}

