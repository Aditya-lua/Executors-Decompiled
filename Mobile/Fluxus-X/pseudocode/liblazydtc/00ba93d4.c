/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ba93d4
 */

undefined8 mbedtls_oid_get_extended_key_usage(long param_1,undefined8 *param_2)

{
  int iVar1;
  undefined8 uVar2;
  undefined **ppuVar3;
  long *plVar4;
  
  if (param_1 == 0) {
LAB_00ba94d0:
    uVar2 = 0xffffffd2;
  }
  else {
    if (*(long *)(param_1 + 8) == 9) {
      iVar1 = memcmp(&DAT_002dd16e,*(void **)(param_1 + 0x10),9);
      if (iVar1 != 0) goto LAB_00ba94d0;
      ppuVar3 = &PTR_DAT_00cac0d8;
    }
    else {
      if (*(long *)(param_1 + 8) != 8) goto LAB_00ba94d0;
      plVar4 = *(long **)(param_1 + 0x10);
      ppuVar3 = (undefined **)&UNK_00cac018;
      if (*plVar4 != 0x10307050501062b) {
        if (*plVar4 == 0x20307050501062b) {
          ppuVar3 = &PTR_DAT_00cac038;
        }
        else if (*plVar4 == 0x30307050501062b) {
          ppuVar3 = &PTR_DAT_00cac058;
        }
        else if (*plVar4 == 0x40307050501062b) {
          ppuVar3 = &PTR_DAT_00cac078;
        }
        else if (*plVar4 == 0x80307050501062b) {
          ppuVar3 = &PTR_DAT_00cac098;
        }
        else {
          if (*plVar4 != 0x90307050501062b) goto LAB_00ba94d0;
          ppuVar3 = &PTR_DAT_00cac0b8;
        }
      }
    }
    uVar2 = 0;
    *param_2 = ppuVar3[3];
  }
  return uVar2;
}

