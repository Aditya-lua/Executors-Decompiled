/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008aed6c
 */

void FUN_008aed6c(long param_1,undefined4 param_2,undefined8 param_3)

{
  int iVar1;
  undefined8 uVar2;
  long lVar3;
  char *__s1;
  
  if ((((*(ulong *)(param_1 + 0x20) < *(ulong *)(param_1 + 0x50)) &&
       (lVar3 = **(long **)(*(ulong *)(param_1 + 0x50) + 8), lVar3 != 0)) &&
      (*(char *)(lVar3 + 6) != '\0')) && (*(long *)(lVar3 + 0x18) != 0)) {
    __s1 = (char *)(*(long *)(lVar3 + 0x18) + 0x18);
    iVar1 = strcmp(__s1,"__namecall");
    if (iVar1 == 0) {
      __s1 = (char *)0x0;
      if (*(long *)(param_1 + 8) != 0) {
        __s1 = (char *)(*(long *)(param_1 + 8) + 0x18);
      }
    }
  }
  else {
    __s1 = (char *)0x0;
  }
  lVar3 = FUN_008aa2e4(param_1,param_2);
  if (lVar3 == 0) {
    if (__s1 == (char *)0x0) {
                    /* WARNING: Subroutine does not return */
      FUN_008aecb4(param_1,"missing argument #%d (%s expected)",param_2,param_3);
    }
                    /* WARNING: Subroutine does not return */
    FUN_008aecb4(param_1,"missing argument #%d to \'%s\' (%s expected)",param_2,__s1,param_3);
  }
  uVar2 = FUN_008be244(param_1,lVar3);
  if (__s1 == (char *)0x0) {
                    /* WARNING: Subroutine does not return */
    FUN_008aecb4(param_1,"invalid argument #%d (%s expected, got %s)",param_2,param_3,uVar2);
  }
                    /* WARNING: Subroutine does not return */
  FUN_008aecb4(param_1,"invalid argument #%d to \'%s\' (%s expected, got %s)",param_2,__s1,param_3);
}

