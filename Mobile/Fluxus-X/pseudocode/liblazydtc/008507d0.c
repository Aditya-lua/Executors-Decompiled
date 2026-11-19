/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008507d0
 */

char * FUN_008507d0(long param_1)

{
  char *pcVar1;
  int iVar2;
  undefined8 *puVar3;
  
  puVar3 = *(undefined8 **)(param_1 + 0x20);
  if (*(int *)(param_1 + 0x40) != 0) {
    return (char *)*puVar3;
  }
  iVar2 = *(int *)(puVar3 + 1);
  if ((puVar3 != (undefined8 *)0x0) && (iVar2 == DAT_00d1b010)) {
    return *(char **)puVar3[4];
  }
  if ((puVar3 != (undefined8 *)0x0) && (iVar2 == DAT_00d1b020)) {
    return (char *)puVar3[4];
  }
  pcVar1 = "*error*";
  if (iVar2 != DAT_00d1b2b0) {
    pcVar1 = (char *)0x0;
  }
  return pcVar1;
}

