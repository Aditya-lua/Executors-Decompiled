/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ba9570
 */

undefined8 mbedtls_oid_get_sig_alg_desc(undefined8 param_1,undefined8 *param_2)

{
  long lVar1;
  undefined8 uVar2;
  
  lVar1 = FUN_00ba95ac();
  if (lVar1 == 0) {
    uVar2 = 0xffffffd2;
  }
  else {
    uVar2 = 0;
    *param_2 = *(undefined8 *)(lVar1 + 0x18);
  }
  return uVar2;
}

