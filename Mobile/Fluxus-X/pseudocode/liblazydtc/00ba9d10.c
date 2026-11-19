/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ba9d10
 */

undefined8 mbedtls_oid_get_cipher_alg(long param_1,undefined4 *param_2)

{
  int iVar1;
  long lVar2;
  undefined *puVar3;
  void *__s2;
  
  if (param_1 == 0) {
    return 0xffffffd2;
  }
  lVar2 = *(long *)(param_1 + 8);
  if (lVar2 == 9) {
    __s2 = *(void **)(param_1 + 0x10);
    iVar1 = memcmp(&DAT_002aed6e,__s2,9);
    if (iVar1 == 0) {
      puVar3 = &UNK_00cac168;
    }
    else {
      iVar1 = memcmp(&DAT_002cc9d2,__s2,9);
      if (iVar1 == 0) {
        puVar3 = &UNK_00cac190;
      }
      else {
        iVar1 = memcmp(&DAT_002a5021,__s2,9);
        if (iVar1 != 0) {
          return 0xffffffd2;
        }
        puVar3 = &UNK_00cac1b8;
      }
    }
  }
  else if (lVar2 == 8) {
    if (**(long **)(param_1 + 0x10) != 0x7030df78648862a) {
      return 0xffffffd2;
    }
    puVar3 = &UNK_00cac140;
  }
  else {
    if ((lVar2 != 5) || (iVar1 = memcmp(&DAT_002bac4a,*(void **)(param_1 + 0x10),5), iVar1 != 0)) {
      return 0xffffffd2;
    }
    puVar3 = &UNK_00cac118;
  }
  *param_2 = *(undefined4 *)(puVar3 + 0x20);
  return 0;
}

