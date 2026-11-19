/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009c0edc
 */

undefined2 tls1_nid2group_id(int param_1)

{
  ulong uVar1;
  undefined2 *puVar2;
  
  uVar1 = 0;
  puVar2 = &DAT_0074cc38;
  do {
    if (*(int *)(puVar2 + -2) == param_1) {
      return *puVar2;
    }
    uVar1 = uVar1 + 1;
    puVar2 = puVar2 + 4;
  } while (uVar1 < 0x2a);
  return 0;
}

