/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009f9aa8
 */

undefined8 ASYNC_WAIT_CTX_get_all_fds(long *param_1,undefined4 *param_2,long *param_3)

{
  undefined4 *puVar1;
  long lVar2;
  long lVar3;
  
  lVar2 = *param_1;
  *param_3 = 0;
  if (lVar2 != 0) {
    lVar3 = 0;
    do {
      while (*(int *)(lVar2 + 0x24) == 0) {
        puVar1 = param_2;
        if (param_2 != (undefined4 *)0x0) {
          puVar1 = param_2 + 1;
          *param_2 = *(undefined4 *)(lVar2 + 8);
        }
        lVar3 = lVar3 + 1;
        *param_3 = lVar3;
        lVar2 = *(long *)(lVar2 + 0x28);
        param_2 = puVar1;
        if (lVar2 == 0) {
          return 1;
        }
      }
      lVar2 = *(long *)(lVar2 + 0x28);
    } while (lVar2 != 0);
  }
  return 1;
}

