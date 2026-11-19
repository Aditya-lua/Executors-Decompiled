/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bb39a4
 */

undefined8 *
ZSTD_createDDict_advanced
          (undefined8 param_1,undefined8 param_2,undefined4 param_3,undefined4 param_4,
          undefined8 *param_5)

{
  undefined8 *__ptr;
  ulong uVar1;
  undefined8 uVar2;
  code *pcVar3;
  undefined8 uVar4;
  
  pcVar3 = (code *)*param_5;
  if ((pcVar3 == (code *)0x0) != (param_5[1] == 0)) {
    return (undefined8 *)0x0;
  }
  if (pcVar3 == (code *)0x0) {
    __ptr = malloc(0x6ad8);
  }
  else {
    __ptr = (undefined8 *)(*pcVar3)(param_5[2],0x6ad8);
  }
  if (__ptr == (undefined8 *)0x0) {
    return (undefined8 *)0x0;
  }
  uVar4 = param_5[1];
  uVar2 = *param_5;
  __ptr[0xd5a] = param_5[2];
  __ptr[0xd59] = uVar4;
  __ptr[0xd58] = uVar2;
  uVar1 = FUN_00bb3aa8(__ptr,param_1,param_2,param_3,param_4);
  if (uVar1 < 0xffffffffffffff89) {
    return __ptr;
  }
  pcVar3 = (code *)__ptr[0xd59];
  uVar2 = __ptr[0xd5a];
  if ((void *)*__ptr == (void *)0x0) {
    if (pcVar3 != (code *)0x0) goto LAB_00bb3a70;
  }
  else {
    if (pcVar3 != (code *)0x0) {
      (*pcVar3)(uVar2);
LAB_00bb3a70:
      (*pcVar3)(uVar2,__ptr);
      return (undefined8 *)0x0;
    }
    free((void *)*__ptr);
  }
  free(__ptr);
  return (undefined8 *)0x0;
}

