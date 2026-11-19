/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009e65c4
 */

undefined8 send_certificate_request(long param_1)

{
  uint uVar1;
  int iVar2;
  uint uVar3;
  
  uVar1 = *(uint *)(param_1 + 0x968);
  if (((((uVar1 & 1) == 0) ||
       (((((*(byte *)(*(long *)(*(int **)(param_1 + 8) + 0x30) + 0x60) >> 3 & 1) == 0 &&
          ((uVar1 >> 3 & 1) != 0)) && (iVar2 = **(int **)(param_1 + 8), 0x303 < iVar2)) &&
        ((iVar2 != 0x10000 && (*(int *)(param_1 + 0xba8) != 3)))))) ||
      (((uVar1 >> 2 & 1) != 0 && (0 < *(int *)(param_1 + 0xbc0))))) ||
     ((uVar3 = *(uint *)(*(long *)(param_1 + 0x2e0) + 0x20), (uVar3 & 0x50) != 0 ||
      ((uVar3 & 4) != 0 && (uVar1 & 2) == 0)))) {
    return 0;
  }
  return 1;
}

