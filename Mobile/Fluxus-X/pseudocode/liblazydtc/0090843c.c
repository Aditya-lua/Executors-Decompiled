/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0090843c
 */

void FUN_0090843c(undefined8 param_1,void *param_2,int param_3,uint param_4,byte param_5)

{
  byte bVar1;
  uint uVar2;
  void *__dest;
  uint uVar3;
  int iVar4;
  byte *__dest_00;
  uint uVar5;
  
  if (-1 < param_3) {
    uVar5 = *(uint *)((long)param_2 + 0x14);
    if (uVar5 == 0) {
      uVar3 = 0;
    }
    else {
      __dest_00 = (byte *)((long)param_2 + 0x18);
      uVar2 = 1;
      __dest = param_2;
      do {
        uVar3 = uVar2;
        if (*(int *)((long)param_2 + (ulong)(uVar3 - 1) * 4) == param_3) {
          bVar1 = *__dest_00 & (param_5 ^ 0xff);
          *__dest_00 = bVar1 | (byte)param_4;
          if (bVar1 != 0 || (param_4 & 0xff) != 0) {
            return;
          }
          if (uVar3 <= uVar5 && uVar5 - uVar3 != 0) {
            memmove(__dest,(void *)((long)__dest + 4),(ulong)(uVar5 - uVar3) << 2);
            uVar5 = *(uint *)((long)param_2 + 0x14);
            memmove(__dest_00,__dest_00 + 1,(ulong)(uVar5 - uVar3));
          }
          iVar4 = uVar5 - 1;
          goto LAB_00908504;
        }
        __dest_00 = __dest_00 + 1;
        uVar2 = uVar3 + 1;
        __dest = (void *)((long)__dest + 4);
      } while (uVar3 < uVar5);
    }
    if ((param_4 != 0) && (uVar3 < 5)) {
      *(int *)((long)param_2 + (ulong)uVar3 * 4) = param_3;
      iVar4 = uVar3 + 1;
      *(byte *)((long)param_2 + (ulong)uVar3 + 0x18) = (byte)param_4;
LAB_00908504:
      *(int *)((long)param_2 + 0x14) = iVar4;
    }
  }
  return;
}

