/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bb1bf4
 */

/* WARNING: Removing unreachable block (ram,0x00bb1c64) */

undefined8 ZSTD_decompressBegin_usingDDict(long *param_1,long param_2)

{
  long lVar1;
  long lVar2;
  
  if (param_2 != 0) {
    lVar1 = ZSTD_DDict_dictContent(param_2);
    lVar2 = ZSTD_DDict_dictSize(param_2);
    *(uint *)((long)param_1 + 0x75fc) = (uint)(param_1[0xe9b] != lVar1 + lVar2);
  }
  lVar1 = ZSTD_trace_decompress_begin(param_1);
  param_1[0x2edc] = lVar1;
  *(undefined4 *)(param_1 + 0xebf) = 0;
  lVar1 = 5;
  if ((int)param_1[0xeb3] != 0) {
    lVar1 = 1;
  }
  param_1[0xea4] = 0;
  param_1[0xea3] = 0;
  param_1[0xe9c] = lVar1;
  param_1[0xe99] = 0;
  param_1[0xe98] = 0;
  param_1[0xe9b] = 0;
  param_1[0xe9a] = 0;
  *(undefined4 *)(param_1 + 0x507) = 0xc00000c;
  *(undefined4 *)(param_1 + 0xebc) = 1;
  param_1[0xea6] = 0;
  param_1[0xea5] = 3;
  *(undefined8 *)((long)param_1 + 0x683c) = 0x400000001;
  *(undefined4 *)((long)param_1 + 0x6844) = 8;
  *param_1 = (long)(param_1 + 4);
  param_1[1] = (long)(param_1 + 0x306);
  param_1[2] = (long)(param_1 + 0x205);
  param_1[3] = (long)(param_1 + 0x507);
  if (param_2 != 0) {
    ZSTD_copyDDictParameters(param_1,param_2);
  }
  return 0;
}

