/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ba9a08
 */

undefined8 mbedtls_oid_get_ec_grp(long param_1,undefined4 *param_2)

{
  int iVar1;
  long lVar2;
  undefined **ppuVar3;
  void *pvVar4;
  
  if (param_1 == 0) {
    return 0xffffffd2;
  }
  lVar2 = *(long *)(param_1 + 8);
  if (lVar2 == 5) {
    pvVar4 = *(void **)(param_1 + 0x10);
    iVar1 = memcmp(&DAT_0078837d,pvVar4,5);
    if (iVar1 == 0) {
      ppuVar3 = &PTR_DAT_00cab758;
    }
    else {
      iVar1 = memcmp(&DAT_00788383,pvVar4,5);
      if (iVar1 == 0) {
        ppuVar3 = &PTR_DAT_00cab7a8;
      }
      else {
        iVar1 = memcmp(&DAT_00788389,pvVar4,5);
        if (iVar1 == 0) {
          ppuVar3 = &PTR_DAT_00cab7d0;
        }
        else {
          iVar1 = memcmp(&DAT_0078838f,pvVar4,5);
          if (iVar1 == 0) {
            ppuVar3 = &PTR_DAT_00cab7f8;
          }
          else {
            iVar1 = memcmp(&DAT_00788395,pvVar4,5);
            if (iVar1 == 0) {
              ppuVar3 = &PTR_DAT_00cab820;
            }
            else {
              iVar1 = memcmp(&DAT_0078839b,pvVar4,5);
              if (iVar1 != 0) {
                return 0xffffffd2;
              }
              ppuVar3 = &PTR_DAT_00cab848;
            }
          }
        }
      }
    }
  }
  else if (lVar2 == 9) {
    pvVar4 = *(void **)(param_1 + 0x10);
    iVar1 = memcmp(&DAT_002a3401,pvVar4,9);
    if (iVar1 == 0) {
      ppuVar3 = &PTR_DAT_00cab870;
    }
    else {
      iVar1 = memcmp(&DAT_002b8c56,pvVar4,9);
      if (iVar1 == 0) {
        ppuVar3 = &PTR_DAT_00cab898;
      }
      else {
        iVar1 = memcmp(&DAT_002acce5,pvVar4,9);
        if (iVar1 != 0) {
          return 0xffffffd2;
        }
        ppuVar3 = &PTR_DAT_00cab8c0;
      }
    }
  }
  else {
    if (lVar2 != 8) {
      return 0xffffffd2;
    }
    ppuVar3 = &PTR_DAT_00cab730;
    if (**(long **)(param_1 + 0x10) != 0x101033dce48862a) {
      if (**(long **)(param_1 + 0x10) != 0x701033dce48862a) {
        return 0xffffffd2;
      }
      ppuVar3 = &PTR_DAT_00cab780;
    }
  }
  *param_2 = *(undefined4 *)(ppuVar3 + 4);
  return 0;
}

