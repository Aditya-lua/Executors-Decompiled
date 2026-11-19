/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0093f910
 */

undefined4 FUN_0093f910(int *param_1,ulong param_2)

{
  int iVar1;
  
  iVar1 = pipe(param_1);
  if (iVar1 == 0) {
    iVar1 = fcntl(*param_1,2,1);
    if ((iVar1 == 0) && (iVar1 = fcntl(param_1[1],2,1), iVar1 == 0)) {
      if ((param_2 & 1) == 0) {
        return 0;
      }
      iVar1 = FUN_009308ec(*param_1,1);
      if ((-1 < iVar1) && (iVar1 = FUN_009308ec(param_1[1],1), -1 < iVar1)) {
        return 0;
      }
    }
    close(*param_1);
    close(param_1[1]);
    param_1[0] = -1;
    param_1[1] = -1;
  }
  return 0xffffffff;
}

