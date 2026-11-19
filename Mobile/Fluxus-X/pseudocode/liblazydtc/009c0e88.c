/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009c0e88
 */

uint tls1_group_id2nid(ushort param_1,int param_2)

{
  uint uVar1;
  ulong uVar2;
  ushort *puVar3;
  
  if (param_1 == 0) {
    return 0;
  }
  uVar2 = 0;
  puVar3 = &DAT_0074cc38;
  do {
    if (*puVar3 == param_1) {
      return *(uint *)(puVar3 + -2);
    }
    uVar2 = uVar2 + 1;
    puVar3 = puVar3 + 4;
  } while (uVar2 < 0x2a);
  uVar1 = 0;
  if (param_2 != 0) {
    uVar1 = param_1 | 0x1000000;
  }
  return uVar1;
}

