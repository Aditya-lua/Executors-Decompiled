/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00baa058
 */

undefined8 mbedtls_oid_get_md_hmac(long param_1,undefined4 *param_2)

{
  int iVar1;
  undefined8 uVar2;
  undefined *puVar3;
  long *plVar4;
  void *__s2;
  
  if (param_1 == 0) {
LAB_00baa1ac:
    uVar2 = 0xffffffd2;
  }
  else {
    if (*(long *)(param_1 + 8) == 9) {
      __s2 = *(void **)(param_1 + 0x10);
      iVar1 = memcmp(&DAT_002d29f2,__s2,9);
      if (iVar1 == 0) {
        puVar3 = &UNK_00cac2d0;
      }
      else {
        iVar1 = memcmp(&DAT_002c494f,__s2,9);
        if (iVar1 == 0) {
          puVar3 = &UNK_00cac2f8;
        }
        else {
          iVar1 = memcmp(&DAT_002d4b0a,__s2,9);
          if (iVar1 == 0) {
            puVar3 = &UNK_00cac320;
          }
          else {
            iVar1 = memcmp(&DAT_002a1358,__s2,9);
            if (iVar1 != 0) goto LAB_00baa1ac;
            puVar3 = &UNK_00cac348;
          }
        }
      }
    }
    else {
      if (*(long *)(param_1 + 8) != 8) goto LAB_00baa1ac;
      plVar4 = *(long **)(param_1 + 0x10);
      puVar3 = &UNK_00cac208;
      if (*plVar4 != 0x7020df78648862a) {
        if (*plVar4 == 0x8020df78648862a) {
          puVar3 = &UNK_00cac230;
        }
        else if (*plVar4 == 0x9020df78648862a) {
          puVar3 = &UNK_00cac258;
        }
        else if (*plVar4 == 0xa020df78648862a) {
          puVar3 = &UNK_00cac280;
        }
        else if (*plVar4 == 0xb020df78648862a) {
          puVar3 = &UNK_00cac2a8;
        }
        else {
          if (*plVar4 != 0x40108050501062b) goto LAB_00baa1ac;
          puVar3 = &UNK_00cac370;
        }
      }
    }
    uVar2 = 0;
    *param_2 = *(undefined4 *)(puVar3 + 0x20);
  }
  return uVar2;
}

