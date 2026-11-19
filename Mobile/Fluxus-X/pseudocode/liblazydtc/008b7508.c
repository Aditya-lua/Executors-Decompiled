/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008b7508
 */

void FUN_008b7508(undefined8 *param_1)

{
  bool bVar1;
  long lVar2;
  char *pcVar3;
  
  param_1[1] = 0;
  *param_1 = 0;
  param_1[3] = 0;
  param_1[2] = 0;
  param_1[5] = 0;
  param_1[4] = 0;
  param_1[7] = 0;
  param_1[6] = 0;
  param_1[9] = 0;
  param_1[8] = 0;
  param_1[0xb] = 0;
  param_1[10] = 0;
  param_1[0xd] = 0;
  param_1[0xc] = 0;
  param_1[0xf] = 0;
  param_1[0xe] = 0;
  param_1[0x11] = 0;
  param_1[0x10] = 0;
  param_1[0x13] = 0;
  param_1[0x12] = 0;
  memset(param_1 + 0x14,0xff,0x401);
  lVar2 = 0;
  param_1[1] = 0x2000000018;
  *param_1 = 0x1000000008;
  param_1[3] = 0x4000000038;
  param_1[2] = 0x3000000028;
  param_1[5] = 0x8000000070;
  param_1[4] = 0x6000000050;
  param_1[7] = 0xc0000000b0;
  param_1[6] = 0xa000000090;
  param_1[9] = 0x100000000f0;
  param_1[8] = 0xe0000000d0;
  param_1[0xb] = 0x18000000160;
  param_1[10] = 0x14000000120;
  param_1[0xd] = 0x200000001e0;
  param_1[0xc] = 0x1c0000001a0;
  param_1[0xf] = 0x300000002c0;
  param_1[0xe] = 0x28000000240;
  *(undefined4 *)((long)param_1 + 0x4a4) = 0x24;
  param_1[0x11] = 0x400000003c0;
  param_1[0x10] = 0x38000000340;
  do {
    *(char *)((long)(param_1 + 0x14) + (long)*(int *)((long)param_1 + lVar2 * 4)) = (char)lVar2;
    lVar2 = lVar2 + 1;
  } while (lVar2 < *(int *)((long)param_1 + 0x4a4));
  pcVar3 = (char *)((long)param_1 + 0x49f);
  lVar2 = -0x400;
  do {
    if (*pcVar3 < '\0') {
      *pcVar3 = pcVar3[1];
    }
    bVar1 = lVar2 != -1;
    lVar2 = lVar2 + 1;
    pcVar3 = pcVar3 + -1;
  } while (bVar1);
  return;
}

