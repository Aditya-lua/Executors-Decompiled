
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

ulong FUN_0014d51c(ulong *param_1,uint *param_2,ulong param_3,int param_4)

{
  long lVar1;
  byte bVar2;
  byte bVar3;
  byte bVar4;
  uint *puVar5;
  uint uVar6;
  ulong uVar7;
  ulong uVar8;
  undefined1 uStack000000000000000c;
  
  uVar8 = 5;
  if (param_4 != 0) {
    uVar8 = 1;
  }
  if ((param_2 == (uint *)0x0) && (param_3 != 0)) {
    return 0xffffffffffffffff;
  }
  if (uVar8 <= param_3) {
    param_1[3] = 0;
    param_1[2] = 0;
    param_1[5] = 0;
    param_1[4] = 0;
    param_1[1] = 0;
    *param_1 = 0;
    if (param_4 == 1) {
      if (param_3 == 0) {
        return 0xffffffffffffffb8;
      }
      uVar7 = 1;
      puVar5 = param_2;
    }
    else {
      uVar6 = *param_2;
      if (uVar6 != 0xfd2fb528) {
        if (uVar6 >> 4 != 0x184d2a5) {
          return 0xfffffffffffffff6;
        }
        if (param_3 < 8) {
          return 8;
        }
        *(uint *)((long)param_1 + 0x1c) = uVar6 + 0xe7b2d5b0;
        *(undefined8 *)((long)param_1 + 0x14) = _UNK_00813830;
        *param_1 = (ulong)param_2[1];
        return 0;
      }
      puVar5 = (uint *)((long)param_2 + (uVar8 - 1));
      uVar7 = uVar8;
    }
    bVar3 = (byte)*puVar5;
    lVar1 = *(long *)(&UNK_00813b00 + ((ulong)bVar3 & 3) * 8) + uVar7 +
            *(long *)(&UNK_00813b20 + ((ulong)(bVar3 >> 3) & 0x18));
    if ((bVar3 & 0x20) == 0) {
      lVar1 = lVar1 + 1;
    }
    uVar7 = lVar1 + (ulong)((uint)(bVar3 < 0x40) & (bVar3 & 0x20) >> 5);
    if (param_3 < uVar7) {
      return uVar7;
    }
    *(int *)(param_1 + 3) = (int)uVar7;
    bVar3 = *(byte *)((long)param_2 + (uVar8 - 1));
    if ((bVar3 >> 3 & 1) != 0) {
      return 0xfffffffffffffff2;
    }
    if ((bVar3 >> 5 & 1) == 0) {
      bVar2 = *(byte *)((long)param_2 + uVar8);
      if (0xaf < (ulong)bVar2) {
        return 0xfffffffffffffff0;
      }
      uVar8 = uVar8 + 1;
      uVar7 = 1L << (ulong)(bVar2 >> 3) + 10;
      uVar7 = uVar7 + (uVar7 >> 3) * ((ulong)bVar2 & 7);
    }
    else {
      uVar7 = 0;
    }
    bVar2 = bVar3 & 3;
    bVar4 = bVar3 >> 6;
    if (bVar2 == 3) {
      uVar6 = *(uint *)((long)param_2 + uVar8);
      uVar8 = uVar8 + 4;
    }
    else if (bVar2 == 2) {
      uVar6 = (uint)*(ushort *)((long)param_2 + uVar8);
      uVar8 = uVar8 + 2;
    }
    else if (bVar2 == 1) {
      uVar6 = (uint)*(byte *)((long)param_2 + uVar8);
      uVar8 = uVar8 + 1;
    }
    else {
      uVar6 = 0;
    }
    if (bVar4 == 1) {
      uVar8 = (ulong)*(ushort *)((long)param_2 + uVar8) + 0x100;
    }
    else if (bVar4 == 2) {
      uVar8 = (ulong)*(uint *)((long)param_2 + uVar8);
    }
    else if (bVar4 == 3) {
      uVar8 = *(ulong *)((long)param_2 + uVar8);
    }
    else if ((bVar3 >> 5 & 1) == 0) {
      uVar8 = 0xffffffffffffffff;
    }
    else {
      uVar8 = (ulong)*(byte *)((long)param_2 + uVar8);
    }
    if ((bVar3 & 0x20) != 0) {
      uVar7 = uVar8;
    }
    *param_1 = uVar8;
    param_1[1] = uVar7;
    if (0x1ffff < uVar7) {
      uVar7 = 0x20000;
    }
    *(int *)(param_1 + 2) = (int)uVar7;
    *(undefined4 *)((long)param_1 + 0x14) = 0;
    *(uint *)((long)param_1 + 0x1c) = uVar6;
    *(uint *)(param_1 + 4) = bVar3 >> 2 & 1;
    return 0;
  }
  if (param_3 == 0) {
    return uVar8;
  }
  if (param_4 == 1) {
    return uVar8;
  }
  _uStack000000000000000c = -0x2d04ad8;
  _memcpy(&uStack000000000000000c,param_2,param_3);
  if (_uStack000000000000000c == -0x2d04ad8) {
    return uVar8;
  }
  _uStack000000000000000c = 0x184d2a50;
  _memcpy(&uStack000000000000000c,param_2,param_3);
  if (_uStack000000000000000c >> 4 == 0x184d2a5) {
    return uVar8;
  }
  return 0xfffffffffffffff6;
}

