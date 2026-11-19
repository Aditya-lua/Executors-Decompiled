/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ba951c
 */

undefined8 mbedtls_oid_get_certificate_policies(long param_1,undefined8 *param_2)

{
  if (param_1 == 0) {
    return 0xffffffd2;
  }
  if (*(long *)(param_1 + 8) != 4) {
    return 0xffffffd2;
  }
  if (**(int **)(param_1 + 0x10) == 0x201d55) {
    *param_2 = "Any Policy";
    return 0;
  }
  return 0xffffffd2;
}

