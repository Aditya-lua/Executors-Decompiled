/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00925fbc
 */

void curl_mime_free(long *param_1)

{
  long lVar1;
  
  if (param_1 == (long *)0x0) {
    return;
  }
  lVar1 = *param_1;
  if (lVar1 != 0) {
    *(undefined8 *)(lVar1 + 0x1b0) = 1;
    *(undefined8 *)(lVar1 + 0x18) = 0;
    *(undefined8 *)(lVar1 + 0x20) = 0;
    *(undefined8 *)(lVar1 + 0x28) = 0;
    *(undefined8 *)(lVar1 + 0x30) = 0;
    *(long *)(lVar1 + 0x38) = lVar1;
    *(undefined8 *)(lVar1 + 0x40) = 0;
    *(undefined8 *)(lVar1 + 0x70) = 0;
    *(undefined8 *)(lVar1 + 0xa0) = 0;
    *(undefined8 *)(lVar1 + 0xa8) = 0;
    *(undefined8 *)(lVar1 + 0x98) = 0;
    *(undefined4 *)(lVar1 + 0x78) = 0;
    *(undefined4 *)(lVar1 + 0x10) = 0;
    *(uint *)(lVar1 + 0x14) = *(uint *)(lVar1 + 0x14) & 0xfffffffb;
    *param_1 = 0;
  }
  lVar1 = param_1[1];
  while (lVar1 != 0) {
    param_1[1] = *(long *)(lVar1 + 8);
    FUN_00925eb8(lVar1);
    (*(code *)PTR_free_00cc4678)(lVar1);
    lVar1 = param_1[1];
  }
  (*(code *)PTR_free_00cc4678)(param_1);
  return;
}

