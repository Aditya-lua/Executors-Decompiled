/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009ca64c
 */

void dtls1_record_bitmap_update(long param_1,ulong *param_2)

{
  uint uVar1;
  ulong uVar2;
  
  uVar1 = FUN_009ca5f0((ulong *)(param_1 + 0x1cf8),param_2 + 1);
  if ((int)uVar1 < 1) {
    if (-uVar1 < 0x40) {
      *param_2 = *param_2 | 1L << ((ulong)-uVar1 & 0x3f);
    }
  }
  else {
    if (uVar1 < 0x40) {
      uVar2 = *param_2 << ((ulong)uVar1 & 0x3f) | 1;
    }
    else {
      uVar2 = 1;
    }
    *param_2 = uVar2;
    param_2[1] = *(ulong *)(param_1 + 0x1cf8);
  }
  return;
}

