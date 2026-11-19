/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ba9904
 */

undefined8 mbedtls_oid_get_pk_alg(long param_1,undefined4 *param_2)

{
  int iVar1;
  long lVar2;
  undefined **ppuVar3;
  
  if (param_1 != 0) {
    lVar2 = *(long *)(param_1 + 8);
    if (lVar2 == 5) {
      iVar1 = memcmp(&DAT_002bac44,*(void **)(param_1 + 0x10),5);
      if (iVar1 == 0) {
        ppuVar3 = &PTR_DAT_00cab6e0;
        goto LAB_00ba99b4;
      }
    }
    else if (lVar2 == 7) {
      iVar1 = memcmp(&DAT_002aed66,*(void **)(param_1 + 0x10),7);
      if (iVar1 == 0) {
        ppuVar3 = &PTR_DAT_00cab6b8;
        goto LAB_00ba99b4;
      }
    }
    else if ((lVar2 == 9) &&
            (iVar1 = memcmp(&DAT_002a8f78,*(void **)(param_1 + 0x10),9), iVar1 == 0)) {
      ppuVar3 = &PTR_DAT_00cab690;
LAB_00ba99b4:
      *param_2 = *(undefined4 *)(ppuVar3 + 4);
      return 0;
    }
  }
  return 0xffffffd2;
}

