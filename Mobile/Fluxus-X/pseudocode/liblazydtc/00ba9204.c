/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ba9204
 */

undefined4 mbedtls_oid_get_attr_short_name(long param_1,undefined8 *param_2)

{
  int iVar1;
  undefined *__s1;
  undefined *__n;
  undefined **ppuVar2;
  
  if (param_1 != 0) {
    __n = *(undefined **)(param_1 + 8);
    __s1 = &DAT_002a8f46;
    ppuVar2 = &PTR_DAT_00cabb90;
    do {
      if ((ppuVar2[-4] == __n) &&
         (iVar1 = memcmp(__s1,*(void **)(param_1 + 0x10),(size_t)__n), iVar1 == 0)) {
        *param_2 = ppuVar2[-1];
        return 0;
      }
      __s1 = *ppuVar2;
      ppuVar2 = ppuVar2 + 5;
    } while (__s1 != (undefined *)0x0);
  }
  return 0xffffffd2;
}

