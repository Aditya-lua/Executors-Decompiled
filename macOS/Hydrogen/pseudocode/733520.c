
ulong FUN_00733520(long param_1,undefined8 param_2,undefined8 param_3,code *param_4,code *param_5,
                  undefined8 param_6)

{
  long lVar1;
  int iVar2;
  undefined8 uVar3;
  long lVar4;
  ulong uVar5;
  
  if (param_1 == 0) {
    uVar5 = 0;
  }
  else {
    lVar4 = *(long *)(param_1 + 0xe0);
    if ((lVar4 == 0) || ((*(byte *)(lVar4 + 4) >> 5 & 1) == 0)) {
      lVar4 = *(long *)(param_1 + 0xd8);
      if ((lVar4 == 0) && (lVar4 = *(long *)(param_1 + 0xd0), lVar4 == 0)) {
        return 0;
      }
      lVar1 = lVar4 + 0x188;
      lVar4 = *(long *)(lVar4 + 0x210);
    }
    else {
      lVar1 = lVar4 + 0x28;
      lVar4 = *(long *)(lVar4 + 0xb0);
    }
    if ((lVar4 != 0) && ((*(byte *)(lVar4 + 4) >> 5 & 1) != 0)) {
      func_0x00779cfc(*(undefined8 *)(lVar1 + 0x78),5,2);
    }
    *(byte *)(lVar1 + 0x98) = *(byte *)(lVar1 + 0x98) | 1;
    lVar4 = func_0x0074dc7c(lVar1,param_2,param_3);
    if (lVar4 == 0) {
      uVar5 = 0;
    }
    else {
      lVar4 = func_0x00740a58();
      do {
        uVar5 = (ulong)(lVar4 != 0);
        if (lVar4 == 0) goto joined_r0x0073366c;
        uVar3 = func_0x00156654(lVar4);
        lVar4 = func_0x006f4058(lVar4);
        iVar2 = (*param_4)(uVar3,param_6);
      } while (iVar2 == 0);
      uVar5 = 1;
    }
joined_r0x0073366c:
    if (param_5 != (code *)0x0) {
      uVar5 = (*param_5)(uVar5,param_6);
    }
    *(byte *)(lVar1 + 0x98) = *(byte *)(lVar1 + 0x98) & 0xfe;
    if ((*(long *)(lVar1 + 0x88) != 0) && ((*(byte *)(*(long *)(lVar1 + 0x88) + 4) >> 5 & 1) != 0))
    {
      func_0x00779d40(*(undefined8 *)(lVar1 + 0x78),5);
      return uVar5;
    }
  }
  return uVar5;
}

