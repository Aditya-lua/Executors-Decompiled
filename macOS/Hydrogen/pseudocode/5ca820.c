
bool FUN_005ca820(long param_1)

{
  long lVar1;
  ulong uVar2;
  long lVar3;
  long *plVar4;
  
  plVar4 = *(long **)(param_1 + 8);
  lVar1 = *(long *)(param_1 + 0x10) << 7;
  do {
    lVar3 = lVar1;
    if (lVar3 == 0) break;
    if ((*plVar4 != 0xc) && (uVar2 = func_0x005d7e94(param_1,plVar4), (uVar2 & 1) != 0)) break;
    plVar4 = plVar4 + 0x10;
    param_1 = func_0x005d7e94();
    lVar1 = lVar3 + -0x80;
  } while ((int)param_1 == 0);
  return lVar3 != 0;
}

