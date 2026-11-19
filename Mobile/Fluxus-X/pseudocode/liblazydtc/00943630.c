/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00943630
 */

ulong FUN_00943630(long param_1)

{
  uint uVar1;
  uint uVar2;
  ulong uVar3;
  
  uVar1 = *(uint *)(param_1 + 0x128);
  if ((uVar1 >> 1 & 1) == 0) {
    uVar3 = 0;
    uVar2 = uVar1;
  }
  else {
    uVar2 = FUN_00936028(param_1);
    uVar3 = (ulong)(uVar2 & (uVar1 & 1) == 0);
    if ((uVar1 & 1) == 0) {
      return uVar3;
    }
  }
  if ((uVar2 & 1) == 0) {
    return uVar3;
  }
  uVar3 = thunk_FUN_00937204(param_1);
  return uVar3;
}

