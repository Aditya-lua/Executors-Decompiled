/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0092df2c
 */

long curl_multi_info_read(int *param_1,undefined4 *param_2)

{
  undefined4 uVar1;
  long lVar2;
  
  *param_2 = 0;
  if (param_1 != (int *)0x0) {
    if (*param_1 != 0xbab1e) {
      return 0;
    }
    if ((*(byte *)((long)param_1 + 0x231) >> 2 & 1) != 0) {
      return 0;
    }
    param_1 = param_1 + 8;
    lVar2 = FUN_00925eb0(param_1);
    if (lVar2 != 0) {
      lVar2 = **(long **)param_1;
      FUN_00925d80(param_1,*(long **)param_1,0);
      FUN_00925eb0(param_1);
      uVar1 = FUN_00963a5c();
      *param_2 = uVar1;
      return lVar2 + 0x18;
    }
  }
  return 0;
}

