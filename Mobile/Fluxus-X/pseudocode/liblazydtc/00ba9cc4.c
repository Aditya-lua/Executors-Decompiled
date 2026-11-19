/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ba9cc4
 */

undefined8 mbedtls_oid_get_oid_by_ec_grp_algid(int param_1,undefined8 *param_2,undefined8 *param_3)

{
  undefined *puVar1;
  undefined *puVar2;
  
  puVar1 = &UNK_00cab910;
  if (param_1 == 9) {
    puVar2 = &DAT_002b6b02;
  }
  else {
    if (param_1 != 0xd) {
      return 0xffffffd2;
    }
    puVar1 = &UNK_00cab938;
    puVar2 = &DAT_002c2c28;
  }
  *param_2 = puVar2;
  *param_3 = *(undefined8 *)(puVar1 + 8);
  return 0;
}

