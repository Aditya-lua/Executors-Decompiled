/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0085d5f0
 */

ulong FUN_0085d5f0(int *param_1)

{
  uint uVar1;
  bool bVar2;
  
  uVar1 = *param_1 - 0x10e;
  bVar2 = uVar1 < 8;
  if (!bVar2) {
    uVar1 = 0;
  }
  return (ulong)CONCAT14(bVar2,uVar1);
}

