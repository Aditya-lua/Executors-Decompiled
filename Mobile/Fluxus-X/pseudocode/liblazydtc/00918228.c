/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00918228
 */

int FUN_00918228(long param_1)

{
  int iVar1;
  long lVar2;
  
  lVar2 = *(long *)(param_1 + 0x20);
  if (*(long *)(param_1 + 0xd98) != 0) {
    *(long *)(lVar2 + 0x30) = *(long *)(param_1 + 0xd98);
    *(undefined8 *)(param_1 + 0xd98) = 0;
  }
  iVar1 = FUN_00947128(param_1);
  if (iVar1 != 0) {
    FUN_0092bab8(param_1);
    FUN_0090fe90(param_1,lVar2,1);
    FUN_00946cfc(param_1,lVar2,1);
  }
  return iVar1;
}

