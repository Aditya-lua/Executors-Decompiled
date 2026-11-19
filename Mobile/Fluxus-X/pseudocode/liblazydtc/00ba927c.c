/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ba927c
 */

undefined8 mbedtls_oid_get_x509_ext_type(long param_1,undefined4 *param_2)

{
  int iVar1;
  undefined8 uVar2;
  void *__s2;
  undefined *puVar3;
  
  if (param_1 == 0) {
LAB_00ba937c:
    uVar2 = 0xffffffd2;
  }
  else {
    if (*(long *)(param_1 + 8) == 9) {
      iVar1 = memcmp(&DAT_002c2c0d,*(void **)(param_1 + 0x10),9);
      if (iVar1 != 0) goto LAB_00ba937c;
      puVar3 = &UNK_00cabf50;
    }
    else {
      if (*(long *)(param_1 + 8) != 3) goto LAB_00ba937c;
      __s2 = *(void **)(param_1 + 0x10);
      iVar1 = memcmp(&DAT_002c0bd0,__s2,3);
      puVar3 = &UNK_00cabeb0;
      if (iVar1 != 0) {
        iVar1 = memcmp(&DAT_002c0bd4,__s2,3);
        if (iVar1 == 0) {
          puVar3 = &UNK_00cabed8;
        }
        else {
          iVar1 = memcmp(&DAT_002d09c3,__s2,3);
          if (iVar1 == 0) {
            puVar3 = &UNK_00cabf00;
          }
          else {
            iVar1 = memcmp(&DAT_002c88d6,__s2,3);
            if (iVar1 == 0) {
              puVar3 = &UNK_00cabf28;
            }
            else {
              iVar1 = memcmp(&DAT_002b4ffa,__s2,3);
              if (iVar1 == 0) {
                puVar3 = &UNK_00cabf78;
              }
              else {
                iVar1 = memcmp(&DAT_002c2c17,__s2,3);
                if (iVar1 == 0) {
                  puVar3 = &UNK_00cabfa0;
                }
                else {
                  iVar1 = memcmp(&DAT_002c2c1b,__s2,3);
                  if (iVar1 != 0) goto LAB_00ba937c;
                  puVar3 = &UNK_00cabfc8;
                }
              }
            }
          }
        }
      }
    }
    uVar2 = 0;
    *param_2 = *(undefined4 *)(puVar3 + 0x20);
  }
  return uVar2;
}

