/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00916bac
 */

void FUN_00916bac(long param_1,char *param_2,socklen_t param_3)

{
  *param_2 = '\0';
  if (*(int *)(param_1 + 4) == 10) {
    inet_ntop(10,(void *)(*(long *)(param_1 + 0x20) + 8),param_2,param_3);
    return;
  }
  if (*(int *)(param_1 + 4) == 2) {
    inet_ntop(2,(void *)(*(long *)(param_1 + 0x20) + 4),param_2,param_3);
    return;
  }
  return;
}

