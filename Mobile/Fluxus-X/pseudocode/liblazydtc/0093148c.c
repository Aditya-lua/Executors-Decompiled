/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0093148c
 */

undefined8 FUN_0093148c(long param_1)

{
  undefined8 uVar1;
  
  *(undefined8 *)(param_1 + 0xaa8) = 0;
  uVar1 = FUN_009314dc();
  if ((int)uVar1 == 0) {
    if (((*(byte *)(param_1 + 0xadc) >> 4 & 1) == 0) && ((*(byte *)(param_1 + 0xc34) & 1) == 0)) {
      curl_mfprintf(*(undefined8 *)(param_1 + 0x1b8),&DAT_002c4dae);
    }
    uVar1 = 0;
    *(undefined4 *)(param_1 + 0xc30) = 0;
  }
  return uVar1;
}

