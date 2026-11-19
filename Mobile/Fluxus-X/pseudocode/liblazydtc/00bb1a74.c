/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bb1a74
 */

undefined8 ZSTD_decompressBegin_usingDict(long *param_1,int *param_2,ulong param_3)

{
  long lVar1;
  ulong uVar2;
  long lVar3;
  int *piVar4;
  
  lVar1 = ZSTD_trace_decompress_begin(param_1);
  param_1[0x2edc] = lVar1;
  *(undefined4 *)(param_1 + 0xebf) = 0;
  lVar1 = 5;
  if ((int)param_1[0xeb3] != 0) {
    lVar1 = 1;
  }
  param_1[0xe9c] = lVar1;
  param_1[0xea4] = 0;
  param_1[0xea3] = 0;
  *(undefined4 *)(param_1 + 0x507) = 0xc00000c;
  param_1[0xe99] = 0;
  param_1[0xe98] = 0;
  *(undefined4 *)((long)param_1 + 0x6844) = 8;
  *(undefined8 *)((long)param_1 + 0x683c) = 0x400000001;
  *(undefined4 *)(param_1 + 0xebc) = 1;
  param_1[0xe9b] = 0;
  param_1[0xe9a] = 0;
  *param_1 = (long)(param_1 + 4);
  param_1[1] = (long)(param_1 + 0x306);
  param_1[0xea6] = 0;
  param_1[0xea5] = 3;
  param_1[2] = (long)(param_1 + 0x205);
  param_1[3] = (long)(param_1 + 0x507);
  if ((param_2 != (int *)0x0) && (param_3 != 0)) {
    if ((param_3 < 8) || (*param_2 != -0x13cf5bc9)) {
      lVar1 = 0;
      lVar3 = 0;
      piVar4 = param_2;
    }
    else {
      *(int *)(param_1 + 0xebf) = param_2[1];
      uVar2 = ZSTD_loadDEntropy(param_1 + 4,param_2,param_3);
      if (0xffffffffffffff88 < uVar2) {
        return 0xffffffffffffffe2;
      }
      lVar3 = param_1[0xe98];
      lVar1 = param_1[0xe99];
      param_1[0xea6] = 0x100000001;
      piVar4 = (int *)((long)param_2 + uVar2);
    }
    param_1[0xe9b] = lVar3;
    param_1[0xe99] = (long)piVar4;
    param_1[0xe9a] = (long)piVar4 + (lVar1 - lVar3);
    param_1[0xe98] = (long)param_2 + param_3;
  }
  return 0;
}

