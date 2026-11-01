
void FUN_0059578c(ulong *param_1,long *param_2,ulong param_3,undefined8 param_4,undefined8 param_5,
                 undefined8 param_6)

{
  byte bVar1;
  ulong in_x9;
  ulong uVar2;
  ulong in_x10;
  ulong uVar3;
  long lVar4;
  ulong uVar5;
  
  bVar1 = *(byte *)((long)param_1 + in_x10);
  uVar5 = (ulong)(bVar1 & 1);
  if (param_2[2] == 0) {
    if (((bVar1 & 1) == 0) && ((bVar1 & 1) == 0)) {
      uVar5 = 0;
    }
    else {
      func_0x007ac598(param_2,1,param_5,param_6,1);
      param_1 = (ulong *)*param_2;
      in_x9 = param_2[1];
      uVar2 = in_x9 & param_3;
      uVar3 = *(ulong *)((long)param_1 + uVar2) & 0x8080808080808080;
      if (uVar3 == 0) {
        lVar4 = 8;
        do {
          uVar2 = uVar2 + lVar4 & in_x9;
          lVar4 = lVar4 + 8;
          uVar3 = *(ulong *)((long)param_1 + uVar2) & 0x8080808080808080;
        } while (uVar3 == 0);
      }
      uVar3 = (uVar3 >> 7 & 0xff00ff00ff00ff00) >> 8 | (uVar3 >> 7 & 0xff00ff00ff00ff) << 8;
      uVar3 = (uVar3 & 0xffff0000ffff0000) >> 0x10 | (uVar3 & 0xffff0000ffff) << 0x10;
      in_x10 = uVar2 + ((ulong)LZCOUNT(uVar3 >> 0x20 | uVar3 << 0x20) >> 3) & in_x9;
      if (-1 < *(char *)((long)param_1 + in_x10)) {
        uVar3 = (*param_1 & 0x8080808080808080) >> 7;
        uVar3 = (uVar3 & 0xff00ff00ff00ff00) >> 8 | (uVar3 & 0xff00ff00ff00ff) << 8;
        uVar3 = (uVar3 & 0xffff0000ffff0000) >> 0x10 | (uVar3 & 0xffff0000ffff) << 0x10;
        in_x10 = (ulong)LZCOUNT(uVar3 >> 0x20 | uVar3 << 0x20) >> 3;
      }
    }
  }
  param_2[2] = param_2[2] - uVar5;
  bVar1 = (byte)(param_3 >> 0x38);
  *(byte *)((long)param_1 + in_x10) = bVar1 >> 1;
  *(byte *)(*param_2 + (in_x10 - 8 & in_x9) + 8) = bVar1 >> 1;
  param_2[3] = param_2[3] + 1;
  *(undefined8 *)(*param_2 + in_x10 * -8 + -8) = param_4;
  return;
}

