/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ba9e24
 */

undefined8 mbedtls_oid_get_md_alg(long param_1,undefined4 *param_2)

{
  int iVar1;
  undefined8 uVar2;
  long lVar3;
  undefined **ppuVar4;
  void *pvVar5;
  
  if (param_1 == 0) {
LAB_00ba9ec0:
    uVar2 = 0xffffffd2;
  }
  else {
    lVar3 = *(long *)(param_1 + 8);
    if (lVar3 == 5) {
      pvVar5 = *(void **)(param_1 + 0x10);
      iVar1 = memcmp(&DAT_002b6b06,pvVar5,5);
      if (iVar1 == 0) {
        ppuVar4 = &PTR_DAT_00cab9b0;
      }
      else {
        iVar1 = memcmp(&DAT_002bec32,pvVar5,5);
        if (iVar1 != 0) goto LAB_00ba9ec0;
        ppuVar4 = &PTR_DAT_00caba78;
      }
    }
    else if (lVar3 == 9) {
      pvVar5 = *(void **)(param_1 + 0x10);
      iVar1 = memcmp(&DAT_002ab1c1,pvVar5,9);
      if (iVar1 == 0) {
        ppuVar4 = &PTR_DAT_00cab9d8;
      }
      else {
        iVar1 = memcmp(&DAT_002b4ffe,pvVar5,9);
        if (iVar1 == 0) {
          ppuVar4 = &PTR_DAT_00caba00;
        }
        else {
          iVar1 = memcmp(&DAT_002c88fd,pvVar5,9);
          if (iVar1 == 0) {
            ppuVar4 = &PTR_DAT_00caba28;
          }
          else {
            iVar1 = memcmp(&DAT_002c6945,pvVar5,9);
            if (iVar1 == 0) {
              ppuVar4 = &PTR_DAT_00caba50;
            }
            else {
              iVar1 = memcmp(&DAT_002c694f,pvVar5,9);
              if (iVar1 == 0) {
                ppuVar4 = &PTR_DAT_00cabaa0;
              }
              else {
                iVar1 = memcmp(&DAT_002d6da3,pvVar5,9);
                if (iVar1 == 0) {
                  ppuVar4 = &PTR_DAT_00cabac8;
                }
                else {
                  iVar1 = memcmp(&DAT_002b31bc,pvVar5,9);
                  if (iVar1 == 0) {
                    ppuVar4 = &PTR_DAT_00cabaf0;
                  }
                  else {
                    iVar1 = memcmp(&DAT_002bec38,pvVar5,9);
                    if (iVar1 != 0) goto LAB_00ba9ec0;
                    ppuVar4 = &PTR_DAT_00cabb18;
                  }
                }
              }
            }
          }
        }
      }
    }
    else {
      if ((lVar3 != 8) || (**(long **)(param_1 + 0x10) != 0x5020df78648862a)) goto LAB_00ba9ec0;
      ppuVar4 = &PTR_DAT_00cab988;
    }
    uVar2 = 0;
    *param_2 = *(undefined4 *)(ppuVar4 + 4);
  }
  return uVar2;
}

