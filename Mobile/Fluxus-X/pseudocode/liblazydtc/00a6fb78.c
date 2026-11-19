/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a6fb78
 */

void FUN_00a6fb78(char *param_1,int *param_2)

{
  int iVar1;
  
  if (*param_2 == 0) {
    iVar1 = OBJ_sn2nid(param_1);
    *param_2 = iVar1;
    if (iVar1 == 0) {
      iVar1 = OBJ_ln2nid(param_1);
      *param_2 = iVar1;
    }
  }
  return;
}

