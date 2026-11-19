/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009c9808
 */

ushort * dtls1_get_bitmap(long param_1,long param_2,undefined4 *param_3)

{
  ushort uVar1;
  ushort *puVar2;
  ushort *puVar3;
  
  *param_3 = 0;
  puVar3 = *(ushort **)(param_1 + 0x1d10);
  uVar1 = *puVar3;
  if (*(ulong *)(param_2 + 0x40) == (ulong)uVar1) {
    return puVar3 + 4;
  }
  puVar2 = (ushort *)0x0;
  if ((*(ulong *)(param_2 + 0x40) == (ulong)uVar1 + 1) &&
     (puVar2 = (ushort *)0x0, puVar3[0x14] != uVar1)) {
    puVar2 = puVar3 + 0xc;
    *param_3 = 1;
  }
  return puVar2;
}

