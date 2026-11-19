/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009c0cc8
 */

undefined8 tls1_clear(int *param_1)

{
  int iVar1;
  undefined8 uVar2;
  
  uVar2 = ssl3_clear();
  if ((int)uVar2 != 0) {
    uVar2 = 1;
    iVar1 = 0x304;
    if (**(int **)(param_1 + 2) != 0x10000) {
      iVar1 = **(int **)(param_1 + 2);
    }
    *param_1 = iVar1;
  }
  return uVar2;
}

