/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ba9ffc
 */

undefined8 mbedtls_oid_get_oid_by_md(int param_1,undefined8 *param_2,undefined8 *param_3)

{
  uint uVar1;
  ulong uVar2;
  long lVar3;
  
  uVar1 = param_1 - 3;
  if (0x10 < uVar1) {
    return 0xffffffd2;
  }
  if ((0x1e1e7U >> (ulong)(uVar1 & 0x1f) & 1) == 0) {
    return 0xffffffd2;
  }
  uVar2 = -(ulong)(uVar1 >> 0x1f) & 0xfffffff800000000 | (ulong)uVar1 << 3;
  lVar3 = *(long *)((long)&PTR_PTR_00cac6f0 + uVar2);
  *param_2 = *(undefined8 *)((long)&PTR_DAT_00cac660 + uVar2);
  *param_3 = *(undefined8 *)(lVar3 + 8);
  return 0;
}

