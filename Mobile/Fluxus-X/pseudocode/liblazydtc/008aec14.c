/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008aec14
 */

void FUN_008aec14(long param_1,undefined4 param_2,undefined8 param_3)

{
  int iVar1;
  long lVar2;
  char *__s1;
  
  if ((((*(ulong *)(param_1 + 0x50) <= *(ulong *)(param_1 + 0x20)) ||
       (lVar2 = **(long **)(*(ulong *)(param_1 + 0x50) + 8), lVar2 == 0)) ||
      (*(char *)(lVar2 + 6) == '\0')) || (*(long *)(lVar2 + 0x18) == 0)) {
LAB_008aec58:
                    /* WARNING: Subroutine does not return */
    FUN_008aecb4(param_1,"invalid argument #%d (%s)",param_2,param_3);
  }
  __s1 = (char *)(*(long *)(lVar2 + 0x18) + 0x18);
  iVar1 = strcmp(__s1,"__namecall");
  if (iVar1 == 0) {
    if (*(long *)(param_1 + 8) == 0) goto LAB_008aec58;
    __s1 = (char *)(*(long *)(param_1 + 8) + 0x18);
  }
                    /* WARNING: Subroutine does not return */
  FUN_008aecb4(param_1,"invalid argument #%d to \'%s\' (%s)",param_2,__s1,param_3);
}

