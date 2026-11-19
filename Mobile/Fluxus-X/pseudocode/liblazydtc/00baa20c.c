/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00baa20c
 */

undefined8 mbedtls_oid_get_pkcs12_pbe_alg(long param_1,undefined4 *param_2,undefined4 *param_3)

{
  int iVar1;
  undefined8 uVar2;
  void *__s2;
  undefined *puVar3;
  
  if ((param_1 == 0) || (*(long *)(param_1 + 8) != 10)) {
LAB_00baa270:
    uVar2 = 0xffffffd2;
  }
  else {
    __s2 = *(void **)(param_1 + 0x10);
    iVar1 = memcmp(&DAT_002acd0b,__s2,10);
    puVar3 = &UNK_00cac3c0;
    if (iVar1 != 0) {
      iVar1 = memcmp(&DAT_002ceabd,__s2,10);
      if (iVar1 != 0) goto LAB_00baa270;
      puVar3 = &UNK_00cac3e8;
    }
    uVar2 = 0;
    *param_2 = *(undefined4 *)(puVar3 + 0x20);
    *param_3 = *(undefined4 *)(puVar3 + 0x24);
  }
  return uVar2;
}

