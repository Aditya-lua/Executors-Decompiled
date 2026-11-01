
bool FUN_007313dc(long param_1,int param_2)

{
  bool bVar1;
  int iVar2;
  long *plVar3;
  undefined1 uStack000000000000000c;
  
  plVar3 = *(long **)(*(long *)(param_1 + 0x18) + (long)param_2 * 8 + 0x260);
  _uStack000000000000000c = 0;
  bVar1 = false;
  if (plVar3 != (long *)0x0) {
    iVar2 = (**(code **)(*plVar3 + 0x70))(plVar3,param_1,7,&uStack000000000000000c,0);
    bVar1 = iVar2 == 0 && _uStack000000000000000c != 0;
  }
  return bVar1;
}

