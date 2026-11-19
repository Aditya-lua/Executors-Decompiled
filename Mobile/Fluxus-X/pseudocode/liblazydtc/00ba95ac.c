/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ba95ac
 */

undefined ** FUN_00ba95ac(long param_1)

{
  int iVar1;
  
  if (param_1 != 0) {
    switch(*(undefined8 *)(param_1 + 8)) {
    case 5:
      iVar1 = memcmp(&DAT_002c692d,*(void **)(param_1 + 0x10),5);
      if (iVar1 == 0) {
        return &PTR_DAT_00cab550;
      }
      break;
    case 7:
      iVar1 = memcmp(&DAT_002bac3c,*(void **)(param_1 + 0x10),7);
      if (iVar1 == 0) {
        return &PTR_DAT_00cab578;
      }
      break;
    case 8:
      if (**(long **)(param_1 + 0x10) == 0x103043dce48862a) {
        return &PTR_DAT_00cab5a0;
      }
      if (**(long **)(param_1 + 0x10) == 0x203043dce48862a) {
        return &PTR_DAT_00cab5c8;
      }
      if (**(long **)(param_1 + 0x10) == 0x303043dce48862a) {
        return &PTR_DAT_00cab5f0;
      }
      if (**(long **)(param_1 + 0x10) == 0x403043dce48862a) {
        return &PTR_DAT_00cab618;
      }
      break;
    case 9:
      iVar1 = memcmp(&DAT_002bac32,*(void **)(param_1 + 0x10),9);
      if (iVar1 == 0) {
        return &PTR_DAT_00cab460;
      }
      iVar1 = memcmp(&DAT_002ab1b7,*(void **)(param_1 + 0x10),9);
      if (iVar1 == 0) {
        return &PTR_DAT_00cab488;
      }
      iVar1 = memcmp(&DAT_002a33e8,*(void **)(param_1 + 0x10),9);
      if (iVar1 == 0) {
        return &PTR_DAT_00cab4b0;
      }
      iVar1 = memcmp(&DAT_002c0c16,*(void **)(param_1 + 0x10),9);
      if (iVar1 == 0) {
        return &PTR_DAT_00cab4d8;
      }
      iVar1 = memcmp(&DAT_002d6d90,*(void **)(param_1 + 0x10),9);
      if (iVar1 == 0) {
        return &PTR_DAT_00cab500;
      }
      iVar1 = memcmp(&DAT_002d09d8,*(void **)(param_1 + 0x10),9);
      if (iVar1 == 0) {
        return &PTR_DAT_00cab528;
      }
      iVar1 = memcmp(&DAT_002cc9bd,*(void **)(param_1 + 0x10),9);
      if (iVar1 == 0) {
        return &PTR_DAT_00cab640;
      }
    }
  }
  return (undefined **)0x0;
}

