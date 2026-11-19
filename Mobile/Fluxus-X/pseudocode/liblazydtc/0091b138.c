/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0091b138
 */

void FUN_0091b138(long param_1,long param_2,undefined8 *param_3,uint *param_4)

{
  uint uVar1;
  undefined *puVar2;
  
  uVar1 = (uint)*(byte *)(param_1 + 0x131a);
  if (((*(byte *)(*(long *)(param_2 + 0x3a8) + 0x8c) & 7) != 0) &&
     ((*(byte *)(param_1 + 0x131e) & 2) != 0)) {
    uVar1 = 4;
  }
  puVar2 = *(undefined **)(param_1 + 0x818);
  if (puVar2 == (undefined *)0x0) {
    if (*(char *)(param_1 + 0x1b2) < '\0') {
      puVar2 = &DAT_002bce54;
    }
    else if (uVar1 - 1 < 5) {
      puVar2 = (&PTR_DAT_00c4f530)[(char)(uVar1 - 1)];
    }
    else {
      puVar2 = &DAT_002d7152;
    }
  }
  *param_3 = puVar2;
  *param_4 = uVar1;
  return;
}

