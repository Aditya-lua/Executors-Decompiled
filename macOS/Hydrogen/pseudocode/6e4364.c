
bool FUN_006e4364(long param_1,long param_2)

{
  int iVar1;
  long lVar2;
  long *plVar3;
  long unaff_x19;
  
  plVar3 = (long *)(param_2 + param_1);
  iVar1 = *(int *)((long)plVar3 + 0xc);
  if (iVar1 == 8) {
    lVar2 = (*plVar3 + 8) - *(long *)(*plVar3 + 8);
  }
  else if (iVar1 == 6) {
    lVar2 = *(long *)(*plVar3 + 0x10);
  }
  else {
    lVar2 = *(long *)(*(long *)(unaff_x19 + 0x18) + (long)iVar1 * 8 + 0x328);
  }
  if (lVar2 != 0) {
    plVar3 = *(long **)(unaff_x19 + 8);
    *plVar3 = lVar2;
    *(undefined4 *)((long)plVar3 + 0xc) = 6;
    *(long *)(unaff_x19 + 8) = *(long *)(unaff_x19 + 8) + 0x10;
  }
  return lVar2 != 0;
}

