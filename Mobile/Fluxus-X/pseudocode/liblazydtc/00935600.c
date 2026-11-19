/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00935600
 */

undefined8 * FUN_00935600(long param_1,char *param_2)

{
  int iVar1;
  undefined8 *puVar2;
  
  puVar2 = *(undefined8 **)(param_1 + 0x130);
  while ((puVar2 != (undefined8 *)0x0 && (iVar1 = strcmp(param_2,*(char **)*puVar2), iVar1 != 0))) {
    puVar2 = (undefined8 *)puVar2[1];
  }
  return puVar2;
}

