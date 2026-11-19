/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00919fec
 */

undefined8
FUN_00919fec(long param_1,long param_2,undefined8 param_3,int param_4,undefined8 param_5,
            uint param_6)

{
  undefined8 uVar1;
  byte bVar2;
  long lVar3;
  ulong uVar4;
  uint uVar5;
  
  if ((((~*(uint *)(param_2 + 0x3a0) & 5) != 0) && (*(long *)(param_1 + 0x12f0) == 0)) &&
     (*(long *)(param_1 + 0x918) == 0)) {
    *(byte *)(param_1 + 0xd68) = *(byte *)(param_1 + 0xd68) | 1;
    *(byte *)(param_1 + 0xd88) = *(byte *)(param_1 + 0xd88) | 1;
    return 0;
  }
  lVar3 = *(long *)(param_1 + 0xd50);
  if ((lVar3 != 0) && (*(long *)(param_1 + 0xd58) == 0)) {
    *(long *)(param_1 + 0xd58) = lVar3;
  }
  lVar3 = *(long *)(param_1 + 0xd70);
  if ((lVar3 == 0) || (*(long *)(param_1 + 0xd78) != 0)) {
    uVar4 = *(ulong *)(param_2 + 0x3a0);
  }
  else {
    *(long *)(param_1 + 0xd78) = lVar3;
    uVar4 = *(ulong *)(param_2 + 0x3a0);
  }
  if (((uVar4 & 1) == 0) || ((((uint)(uVar4 >> 3) & 1 ^ param_6) & 1) != 0)) {
    *(byte *)(param_1 + 0xd88) = *(byte *)(param_1 + 0xd88) | 1;
  }
  else {
    uVar1 = FUN_0091a178(param_1,param_2,(long *)(param_1 + 0xd70),param_3,param_5,1);
    if ((int)uVar1 != 0) {
      return uVar1;
    }
  }
  uVar4 = FUN_0096795c(param_1);
  if (((uVar4 & 1) == 0) && ((*(byte *)(param_2 + 0x3a2) >> 4 & 1) == 0)) {
    uVar1 = 0;
    bVar2 = *(byte *)(param_1 + 0xd68) | 1;
    *(byte *)(param_1 + 0xd68) = bVar2;
  }
  else {
    uVar1 = FUN_0091a178(param_1,param_2,(long *)(param_1 + 0xd50),param_3,param_5,0);
    bVar2 = *(byte *)(param_1 + 0xd68);
  }
  if (((((bVar2 & 3) == 2) || ((*(byte *)(param_1 + 0xd88) & 3) == 2)) && (param_4 != 0)) &&
     (param_4 != 5)) {
    uVar5 = *(uint *)(param_1 + 0x1b1) | 0x10000;
  }
  else {
    uVar5 = *(uint *)(param_1 + 0x1b1) & 0xfffeffff;
  }
  *(uint *)(param_1 + 0x1b1) = uVar5;
  return uVar1;
}

