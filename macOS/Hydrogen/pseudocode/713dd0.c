
void FUN_00713dd0(long param_1)

{
  long *plVar1;
  undefined8 in_x9;
  long lVar2;
  long unaff_x29;
  
  *(undefined8 *)(param_1 + 8) = in_x9;
  plVar1 = *(long **)(unaff_x29 + -0x88);
  lVar2 = *plVar1 + *(long *)(unaff_x29 + -0x80) * 0x28;
  if (lVar2 != plVar1[1]) {
    plVar1[1] = lVar2;
  }
  return;
}

