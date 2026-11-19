/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bb3aa8
 */

undefined8 FUN_00bb3aa8(undefined8 *param_1,void *param_2,size_t param_3,int param_4,int param_5)

{
  int *piVar1;
  void *__dest;
  ulong uVar2;
  int *piVar3;
  
  if (((param_2 == (void *)0x0) || (param_3 == 0)) || (param_4 == 1)) {
    *param_1 = 0;
    param_1[1] = param_2;
    if (param_2 == (void *)0x0) {
      param_3 = 0;
    }
  }
  else {
    if ((code *)param_1[0xd58] == (code *)0x0) {
      __dest = malloc(param_3);
      *param_1 = __dest;
      param_1[1] = __dest;
    }
    else {
      __dest = (void *)(*(code *)param_1[0xd58])(param_1[0xd5a],param_3);
      *param_1 = __dest;
      param_1[1] = __dest;
    }
    if (__dest == (void *)0x0) {
      return 0xffffffffffffffc0;
    }
    memcpy(__dest,param_2,param_3);
  }
  param_1[2] = param_3;
  *(undefined4 *)(param_1 + 0x506) = 0xc00000c;
  piVar1 = (int *)((long)param_1 + 0x6ab4);
  piVar1[0] = 0;
  piVar1[1] = 0;
  if (param_5 != 1) {
    if (param_3 < 8) {
      if (param_5 == 2) {
        return 0xffffffffffffffe2;
      }
    }
    else {
      piVar3 = (int *)param_1[1];
      if (*piVar3 == -0x13cf5bc9) {
        *piVar1 = piVar3[1];
        uVar2 = ZSTD_loadDEntropy(param_1 + 3,piVar3,param_3);
        if (0xffffffffffffff88 < uVar2) {
          return 0xffffffffffffffe2;
        }
        *(undefined4 *)(param_1 + 0xd57) = 1;
      }
      else if (param_5 == 2) {
        return 0xffffffffffffffe2;
      }
    }
  }
  return 0;
}

