/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b55fe8
 */

void SipHash_Update(long *param_1,ulong *param_2,size_t param_3)

{
  void *__dest;
  ulong *__src;
  uint uVar1;
  uint uVar2;
  ulong uVar3;
  ulong uVar4;
  ulong uVar5;
  ulong uVar6;
  ulong uVar7;
  ulong uVar8;
  
  uVar8 = param_1[1];
  uVar3 = param_1[2];
  uVar7 = param_1[3];
  uVar1 = *(uint *)(param_1 + 5);
  uVar6 = param_1[4];
  *param_1 = *param_1 + param_3;
  if (uVar1 != 0) {
    uVar5 = (ulong)(8 - uVar1);
    __dest = (void *)((long)param_1 + (ulong)uVar1 + 0x38);
    if (param_3 < uVar5) {
      memcpy(__dest,param_2,param_3);
      *(uint *)(param_1 + 5) = uVar1 + (int)param_3;
      return;
    }
    memcpy(__dest,param_2,uVar5);
    param_3 = param_3 - uVar5;
    param_2 = (ulong *)((long)param_2 + uVar5);
    uVar6 = param_1[7] ^ uVar6;
    if (*(uint *)(param_1 + 6) != 0) {
      uVar1 = 0;
      do {
        uVar8 = uVar3 + uVar8;
        uVar3 = uVar8 ^ (uVar3 >> 0x33 | uVar3 << 0xd);
        uVar5 = uVar6 + uVar7 ^ (uVar6 >> 0x30 | uVar6 << 0x10);
        uVar1 = uVar1 + 1;
        uVar8 = uVar5 + (uVar8 >> 0x20 | uVar8 << 0x20);
        uVar7 = uVar6 + uVar7 + uVar3;
        uVar6 = uVar8 ^ (uVar5 >> 0x2b | uVar5 << 0x15);
        uVar3 = uVar7 ^ (uVar3 >> 0x2f | uVar3 << 0x11);
        uVar7 = uVar7 >> 0x20 | uVar7 << 0x20;
      } while (uVar1 < *(uint *)(param_1 + 6));
    }
    uVar8 = uVar8 ^ param_1[7];
  }
  uVar1 = (uint)param_3 & 7;
  __src = (ulong *)((long)param_2 + (param_3 - uVar1));
  if (param_2 != __src) {
    do {
      uVar5 = *param_2;
      uVar6 = uVar5 ^ uVar6;
      if (*(uint *)(param_1 + 6) != 0) {
        uVar2 = 0;
        do {
          uVar8 = uVar3 + uVar8;
          uVar3 = uVar8 ^ (uVar3 >> 0x33 | uVar3 << 0xd);
          uVar4 = uVar6 + uVar7 ^ (uVar6 >> 0x30 | uVar6 << 0x10);
          uVar2 = uVar2 + 1;
          uVar8 = uVar4 + (uVar8 >> 0x20 | uVar8 << 0x20);
          uVar7 = uVar6 + uVar7 + uVar3;
          uVar6 = uVar8 ^ (uVar4 >> 0x2b | uVar4 << 0x15);
          uVar3 = uVar7 ^ (uVar3 >> 0x2f | uVar3 << 0x11);
          uVar7 = uVar7 >> 0x20 | uVar7 << 0x20;
        } while (uVar2 < *(uint *)(param_1 + 6));
      }
      param_2 = param_2 + 1;
      uVar8 = uVar8 ^ uVar5;
    } while (param_2 != __src);
  }
  if ((param_3 & 7) != 0) {
    memcpy(param_1 + 7,__src,(ulong)uVar1);
  }
  *(uint *)(param_1 + 5) = uVar1;
  param_1[1] = uVar8;
  param_1[2] = uVar3;
  param_1[3] = uVar7;
  param_1[4] = uVar6;
  return;
}

