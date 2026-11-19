/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009d5ca4
 */

ushort * custom_ext_find(undefined8 *param_1,int param_2,uint param_3,ulong *param_4)

{
  ushort *puVar1;
  ulong uVar2;
  
  if (param_1[1] != 0) {
    puVar1 = (ushort *)*param_1;
    uVar2 = 0;
    do {
      if ((*puVar1 == param_3) &&
         (((param_2 == 2 || (*(int *)(puVar1 + 2) == param_2)) || (*(int *)(puVar1 + 2) == 2)))) {
        if (param_4 == (ulong *)0x0) {
          return puVar1;
        }
        *param_4 = uVar2;
        return puVar1;
      }
      uVar2 = uVar2 + 1;
      puVar1 = puVar1 + 0x1c;
    } while (uVar2 < (ulong)param_1[1]);
  }
  return (ushort *)0x0;
}

