/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00863160
 */

void FUN_00863160(long param_1)

{
  long lVar1;
  bool bVar2;
  int iVar3;
  char *__s1;
  undefined1 auStack_78 [24];
  char *local_60;
  int local_58 [8];
  long local_38;
  
  lVar1 = tpidr_el0;
  local_38 = *(long *)(lVar1 + 0x28);
  if ((*(int *)(param_1 + 0x90) == 0x119) &&
     (__s1 = *(char **)(param_1 + 0xa8), __s1 != (char *)0x0)) {
    iVar3 = strcmp(__s1,"class");
    if (iVar3 == 0) {
      FUN_00853d20(local_58,param_1 + 0x70);
      bVar2 = local_58[0] == 0x119;
      goto LAB_00863204;
    }
    iVar3 = strcmp(__s1,"open");
    if ((iVar3 == 0) && (FUN_00853d20(local_58,param_1 + 0x70), local_58[0] == 0x119)) {
      FUN_00853d20(auStack_78,param_1 + 0x70);
      bVar2 = false;
      if (local_60 != (char *)0x0) {
        iVar3 = strcmp(local_60,"class");
        bVar2 = iVar3 == 0;
      }
      goto LAB_00863204;
    }
  }
  bVar2 = false;
LAB_00863204:
  if (*(long *)(lVar1 + 0x28) != local_38) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(bVar2);
  }
  return;
}

