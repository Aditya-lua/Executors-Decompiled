/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a238e4
 */

int FUN_00a238e4(long param_1)

{
  int iVar1;
  
  EC_KEY_get0_group(*(EC_KEY **)(param_1 + 0x20));
  iVar1 = EC_GROUP_order_bits();
  if (0x1ff < iVar1) {
    return 0x100;
  }
  if (0x17f < iVar1) {
    return 0xc0;
  }
  if (0xff < iVar1) {
    return 0x80;
  }
  if (0xdf < iVar1) {
    return 0x70;
  }
  if (0x9f < iVar1) {
    return 0x50;
  }
  if (iVar1 < 0) {
    iVar1 = iVar1 + 1;
  }
  return iVar1 >> 1;
}

