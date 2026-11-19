/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008aef1c
 */

char * FUN_008aef1c(undefined8 param_1,undefined4 param_2,char *param_3,size_t *param_4)

{
  int iVar1;
  size_t sVar2;
  
  iVar1 = FUN_008ab0e0();
  if (iVar1 < 1) {
    if (param_4 != (size_t *)0x0) {
      if (param_3 == (char *)0x0) {
        *param_4 = 0;
      }
      else {
        sVar2 = strlen(param_3);
        *param_4 = sVar2;
      }
    }
  }
  else {
    param_3 = (char *)FUN_008ab8a4(param_1,param_2,param_4);
    if (param_3 == (char *)0x0) {
                    /* WARNING: Subroutine does not return */
      FUN_008af05c(param_1,param_2,5);
    }
  }
  return param_3;
}

