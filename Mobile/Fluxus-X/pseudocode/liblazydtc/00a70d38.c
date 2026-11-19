/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a70d38
 */

undefined8 FUN_00a70d38(int param_1,undefined8 param_2,long param_3)

{
  undefined8 uVar1;
  
  uVar1 = FUN_00a6fd84();
  if ((0 < (int)uVar1) &&
     (((param_1 == 5 || (uVar1 = 0, param_1 == 2)) && (uVar1 = 0, *(int *)(param_3 + 8) == 1)))) {
    uVar1 = 1;
    **(undefined8 **)(param_3 + 0x20) = *(undefined8 *)(param_3 + 0x28);
  }
  return uVar1;
}

