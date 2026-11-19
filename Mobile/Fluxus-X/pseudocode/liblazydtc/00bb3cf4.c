/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bb3cf4
 */

undefined8 *
ZSTD_initStaticDDict
          (undefined8 *param_1,ulong param_2,int *param_3,size_t param_4,int param_5,int param_6)

{
  int *piVar1;
  ulong uVar2;
  int *__dest;
  
  if (((ulong)param_1 & 7) == 0) {
    uVar2 = 0x6ad8;
    if (param_5 != 1) {
      uVar2 = param_4 + 0x6ad8;
    }
    if (uVar2 <= param_2) {
      __dest = param_3;
      if (param_5 == 0) {
        __dest = (int *)(param_1 + 0xd5b);
        memcpy(__dest,param_3,param_4);
      }
      uVar2 = 0;
      if (__dest != (int *)0x0) {
        uVar2 = param_4;
      }
      *(undefined4 *)(param_1 + 0x506) = 0xc00000c;
      piVar1 = (int *)((long)param_1 + 0x6ab4);
      *param_1 = 0;
      param_1[1] = __dest;
      param_1[2] = uVar2;
      piVar1[0] = 0;
      piVar1[1] = 0;
      if (param_6 != 1) {
        if ((uVar2 < 8) || (*__dest != -0x13cf5bc9)) {
          if (param_6 != 2) {
            return param_1;
          }
        }
        else {
          *piVar1 = __dest[1];
          uVar2 = ZSTD_loadDEntropy(param_1 + 3,__dest,param_4);
          if (uVar2 < 0xffffffffffffff89) {
            *(undefined4 *)(param_1 + 0xd57) = 1;
            return param_1;
          }
        }
        param_1 = (undefined8 *)0x0;
      }
      return param_1;
    }
  }
  return (undefined8 *)0x0;
}

