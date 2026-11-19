/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00970a7c
 */

int FUN_00970a7c(void *param_1,int param_2,int param_3,char *param_4)

{
  int iVar1;
  int iVar2;
  
  iVar2 = 0;
  if ((-1 < param_2) && (param_3 == 0)) {
    strlen(param_4);
    iVar1 = FUN_00963a5c();
    iVar2 = 0;
    if (iVar1 < param_2) {
      memcpy(param_1,param_4,(long)(iVar1 + 1));
      iVar2 = iVar1;
    }
  }
  return iVar2;
}

