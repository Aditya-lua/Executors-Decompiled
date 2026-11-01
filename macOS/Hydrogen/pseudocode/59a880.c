
void FUN_0059a880(undefined8 *param_1)

{
  ulong uVar1;
  undefined2 *puVar2;
  undefined8 uVar3;
  long lVar4;
  undefined8 *extraout_x8;
  long *extraout_x8_00;
  long lVar5;
  long lVar6;
  long lVar7;
  long lStack_a0;
  long lStack_98;
  long lStack_90;
  long lStack_88;
  undefined8 uStack_80;
  ulong uStack_78;
  
  puVar2 = (undefined2 *)func_0x00187bd0(3,1);
  if (puVar2 != (undefined2 *)0x0) {
    *puVar2 = 0x201;
    *(undefined1 *)(puVar2 + 1) = 1;
    *param_1 = 1;
    param_1[1] = puVar2;
    param_1[2] = 1;
    return;
  }
  uVar3 = func_0x007a1f18(1,3);
  puVar2 = (undefined2 *)func_0x00187bd0(3,1);
  if (puVar2 != (undefined2 *)0x0) {
    *puVar2 = (short)uVar3;
    *(char *)(puVar2 + 1) = (char)((ulong)uVar3 >> 0x10);
    *extraout_x8 = 1;
    extraout_x8[1] = puVar2;
    extraout_x8[2] = 1;
    return;
  }
  lVar4 = func_0x007a1f18(1,3);
  lStack_a0 = 0;
  lStack_98 = 1;
  lStack_90 = 0;
  if (*(long *)(lVar4 + 0x10) != 0) {
    lVar6 = 0;
    lVar5 = *(long *)(lVar4 + 8);
    lVar4 = *(long *)(lVar4 + 0x10) * 3;
    lVar7 = 1;
    do {
      func_0x0059abe0(&lStack_88,lVar5);
      uVar1 = uStack_78;
      uVar3 = uStack_80;
      if ((ulong)(lStack_a0 - lVar6) < uStack_78) {
        func_0x007acb90(&lStack_a0,lVar6,uStack_78);
        lVar6 = lStack_90;
        lVar7 = lStack_98;
      }
      _memcpy(lVar7 + lVar6,uVar3,uVar1);
      lVar6 = lVar6 + uVar1;
      lStack_90 = lVar6;
      if (lStack_88 != 0) {
        func_0x00187bd4(uVar3,lStack_88,1);
      }
      lVar5 = lVar5 + 3;
      lVar4 = lVar4 + -3;
    } while (lVar4 != 0);
  }
  extraout_x8_00[1] = lStack_98;
  *extraout_x8_00 = lStack_a0;
  extraout_x8_00[2] = lStack_90;
  return;
}

