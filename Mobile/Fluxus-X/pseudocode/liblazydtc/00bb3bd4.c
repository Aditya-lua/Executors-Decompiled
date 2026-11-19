/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bb3bd4
 */

undefined8 ZSTD_freeDDict(undefined8 *param_1)

{
  undefined8 uVar1;
  code *pcVar2;
  
  if (param_1 == (undefined8 *)0x0) {
    return 0;
  }
  pcVar2 = (code *)param_1[0xd59];
  uVar1 = param_1[0xd5a];
  if ((void *)*param_1 == (void *)0x0) {
    if (pcVar2 != (code *)0x0) goto LAB_00bb3c10;
  }
  else {
    if (pcVar2 != (code *)0x0) {
      (*pcVar2)(uVar1);
LAB_00bb3c10:
      (*pcVar2)(uVar1,param_1);
      return 0;
    }
    free((void *)*param_1);
  }
  free(param_1);
  return 0;
}

