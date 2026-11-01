
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_005ca5a0(undefined8 *param_1,ulong param_2)

{
  long *plVar1;
  undefined8 uVar2;
  ulong uVar3;
  long *unaff_x20;
  long *plVar4;
  long lVar5;
  long lVar6;
  
  plVar1 = *(long **)(param_2 + 8);
  lVar5 = *(long *)(param_2 + 0x10);
  lVar6 = lVar5 << 7;
  plVar4 = plVar1;
  do {
    if (lVar6 == 0) {
      *(undefined1 *)(param_1 + 2) = 1;
      uVar2 = _UNK_0089eb10;
      param_1[1] = _UNK_0089eb18;
      *param_1 = uVar2;
      plVar4 = plVar1;
      for (; lVar5 != 0; lVar5 = lVar5 + -1) {
        if (*plVar4 != 0xc) {
          func_0x0059ce88(plVar4);
        }
        func_0x0059ce88(plVar4 + 8);
        plVar4 = plVar4 + 0x10;
      }
      if (*unaff_x20 == 0) {
        return;
      }
      func_0x00187bd4(plVar1,*unaff_x20 << 7,8);
      return;
    }
    if ((*plVar4 != 0xc) && (uVar3 = func_0x005d7e94(param_2,plVar4), (uVar3 & 1) != 0)) break;
    param_2 = func_0x005d7e94();
    plVar4 = plVar4 + 0x10;
    lVar6 = lVar6 + -0x80;
  } while ((param_2 & 1) == 0);
  lVar5 = *unaff_x20;
  param_1[2] = unaff_x20[1];
  param_1[1] = lVar5;
  param_1[3] = unaff_x20[2];
  *param_1 = 5;
  return;
}

