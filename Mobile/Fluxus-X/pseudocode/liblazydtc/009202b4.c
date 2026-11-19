/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009202b4
 */

undefined8 FUN_009202b4(long *param_1,undefined8 param_2)

{
  undefined8 uVar1;
  undefined8 *puVar2;
  ulong uVar3;
  
  if (param_1[1] != 0) {
    uVar3 = 0;
    do {
      puVar2 = *(undefined8 **)(*param_1 + uVar3 * 8);
      uVar1 = FUN_009048cc(param_2,"%.*s: %.*s\r\n",*(undefined4 *)(puVar2 + 2),*puVar2,
                           *(undefined4 *)(puVar2 + 3),puVar2[1]);
      if ((int)uVar1 != 0) {
        return uVar1;
      }
      uVar3 = uVar3 + 1;
    } while (uVar3 < (ulong)param_1[1]);
  }
  return 0;
}

