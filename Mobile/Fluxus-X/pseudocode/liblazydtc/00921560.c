/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00921560
 */

void curl_formfree(long *param_1)

{
  ulong uVar1;
  long lVar2;
  
  while (param_1 != (long *)0x0) {
    lVar2 = *param_1;
    curl_formfree(param_1[9]);
    uVar1 = param_1[10];
    if (((uint)uVar1 >> 2 & 1) == 0) {
      (*(code *)PTR_free_00cc4678)(param_1[1]);
      uVar1 = param_1[10];
    }
    if ((uVar1 & 0x58) == 0) {
      (*(code *)PTR_free_00cc4678)(param_1[3]);
    }
    (*(code *)PTR_free_00cc4678)(param_1[7]);
    (*(code *)PTR_free_00cc4678)(param_1[0xb]);
    (*(code *)PTR_free_00cc4678)(param_1);
    param_1 = (long *)lVar2;
  }
  return;
}

