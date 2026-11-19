/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bafc84
 */

undefined8 ZSTD_freeDCtx(void *param_1)

{
  undefined8 uVar1;
  undefined8 *__ptr;
  code *pcVar2;
  
  if (param_1 == (void *)0x0) {
    return 0;
  }
  if (*(long *)((long)param_1 + 0x75d8) != 0) {
    return 0xffffffffffffffc0;
  }
  pcVar2 = *(code **)((long)param_1 + 0x75b8);
  uVar1 = *(undefined8 *)((long)param_1 + 0x75c0);
  ZSTD_freeDDict(*(undefined8 *)((long)param_1 + 0x75e8));
  *(undefined4 *)((long)param_1 + 0x7600) = 0;
  *(undefined8 *)((long)param_1 + 0x75f0) = 0;
  *(undefined8 *)((long)param_1 + 0x75e8) = 0;
  if (*(void **)((long)param_1 + 0x7620) != (void *)0x0) {
    if (pcVar2 == (code *)0x0) {
      free(*(void **)((long)param_1 + 0x7620));
    }
    else {
      (*pcVar2)(uVar1);
    }
  }
  __ptr = *(undefined8 **)((long)param_1 + 0x7608);
  *(undefined8 *)((long)param_1 + 0x7620) = 0;
  if (__ptr == (undefined8 *)0x0) goto LAB_00bafd3c;
  if ((void *)*__ptr == (void *)0x0) {
    if (pcVar2 == (code *)0x0) goto LAB_00bafd30;
LAB_00bafd18:
    (*pcVar2)(uVar1,__ptr);
  }
  else {
    if (pcVar2 != (code *)0x0) {
      (*pcVar2)(uVar1);
      goto LAB_00bafd18;
    }
    free((void *)*__ptr);
LAB_00bafd30:
    free(__ptr);
  }
  *(undefined8 *)((long)param_1 + 0x7608) = 0;
LAB_00bafd3c:
  if (pcVar2 == (code *)0x0) {
    free(param_1);
  }
  else {
    (*pcVar2)(uVar1,param_1);
  }
  return 0;
}

