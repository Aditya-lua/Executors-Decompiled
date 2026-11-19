/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00902c64
 */

int curl_easy_pause(int *param_1,uint param_2)

{
  uint uVar1;
  uint uVar2;
  uint uVar3;
  bool bVar4;
  int iVar5;
  ulong uVar6;
  ulong uVar7;
  
  if (((param_1 == (int *)0x0) || (*param_1 != -0x3f212453)) || (*(long *)(param_1 + 8) == 0)) {
    return 0x2b;
  }
  uVar6 = FUN_0092f1bc(param_1);
  uVar2 = param_1[0x4a];
  uVar1 = (param_2 & 4) << 3 | (param_2 & 1) << 4;
  uVar3 = uVar1 | uVar2 & 0xffffffcf;
  if (((uVar2 & (uVar3 ^ 0xffffffff)) >> 5 & 1) == 0) {
    bVar4 = false;
  }
  else {
    bVar4 = param_1[0x16] - 0xdU < 2;
  }
  param_1[0x4a] = uVar3;
  if (uVar1 != 0x30) {
    FUN_0092aff8(param_1,0,8);
    param_1[0x310] = 0;
    param_1[0x311] = 0;
    if ((param_2 & 4) == 0) {
      *(byte *)((long)param_1 + 0x131b) = *(byte *)((long)param_1 + 0x131b) | 2;
    }
    if ((param_2 & 1) == 0) {
      *(byte *)((long)param_1 + 0x131b) = *(byte *)((long)param_1 + 0x131b) | 1;
    }
    if (((uVar1 != (uVar2 & 0x30)) && (*(long *)(param_1 + 0x30) != 0)) &&
       (iVar5 = FUN_0092b1f4(), iVar5 != 0)) {
      iVar5 = 0x2a;
      goto joined_r0x00902dec;
    }
  }
  if ((!bVar4) || (iVar5 = FUN_00935fe0(param_1), iVar5 == 0)) {
    if (((*(byte *)(param_1 + 0x4a) >> 4 & 1) == 0) &&
       (uVar7 = thunk_FUN_00937204(param_1), (uVar7 & 1) != 0)) {
      FUN_00908198(param_1,0);
      iVar5 = thunk_FUN_009372b4(param_1);
      if (iVar5 != 0) goto joined_r0x00902dec;
    }
    if (((uint)param_1[0x4c7] >> 10 & 1) == 0) {
      iVar5 = 0;
      if (uVar1 != (uVar2 & 0x30)) {
        iVar5 = FUN_0092e408(param_1);
      }
    }
    else {
      iVar5 = 0;
    }
  }
joined_r0x00902dec:
  if ((uVar6 & 1) != 0) {
    FUN_0092f198(param_1,1);
  }
  return iVar5;
}

