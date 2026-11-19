/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008e525c
 */

uint FUN_008e525c(long param_1,uint param_2)

{
  long lVar1;
  uint uVar2;
  
  uVar2 = *(uint *)(param_1 + 0x1c);
  if (uVar2 < param_2) {
    uVar2 = param_2 + 0x40 & 0xffffffc0;
    lVar1 = FUN_008e4ff0(uVar2 << 3);
    if (lVar1 == 0) {
      uVar2 = 0;
    }
    else {
      FUN_008e4fd4(lVar1,0x41,uVar2 << 3);
      FUN_008e4fb8(lVar1,*(undefined8 *)(param_1 + 0x10),*(int *)(param_1 + 0x18) << 3);
      free(*(void **)(param_1 + 0x10));
      *(long *)(param_1 + 0x10) = lVar1;
      *(uint *)(param_1 + 0x1c) = uVar2;
    }
  }
  return uVar2;
}

