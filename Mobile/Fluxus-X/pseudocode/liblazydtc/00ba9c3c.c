/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ba9c3c
 */

undefined8 mbedtls_oid_get_ec_grp_algid(long param_1,undefined4 *param_2)

{
  int iVar1;
  undefined8 uVar2;
  void *__s2;
  undefined *puVar3;
  
  if ((param_1 == 0) || (*(long *)(param_1 + 8) != 3)) {
LAB_00ba9c9c:
    uVar2 = 0xffffffd2;
  }
  else {
    __s2 = *(void **)(param_1 + 0x10);
    iVar1 = memcmp(&DAT_002b6b02,__s2,3);
    puVar3 = &UNK_00cab910;
    if (iVar1 != 0) {
      iVar1 = memcmp(&DAT_002c2c28,__s2,3);
      if (iVar1 != 0) goto LAB_00ba9c9c;
      puVar3 = &UNK_00cab938;
    }
    uVar2 = 0;
    *param_2 = *(undefined4 *)(puVar3 + 0x20);
  }
  return uVar2;
}

