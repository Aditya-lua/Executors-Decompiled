
void FUN_001386e8(void)

{
  int iVar1;
  long lVar2;
  long lVar3;
  int iVar4;
  long unaff_x19;
  int unaff_w20;
  long *plVar5;
  int *unaff_x21;
  int *unaff_x22;
  undefined8 unaff_x23;
  long lVar6;
  long unaff_x24;
  int unaff_w25;
  int unaff_w26;
  long *unaff_x27;
  undefined8 *unaff_x28;
  undefined8 in_stack_00000008;
  
  *unaff_x28 = unaff_x23;
  if (unaff_w26 != 0) {
    lVar6 = *unaff_x27;
    lVar2 = lVar6 + (long)unaff_w26 * (long)unaff_w20;
    plVar5 = (long *)(unaff_x24 + (long)unaff_w25 * 0x18 + 8);
    lVar3 = *plVar5 - lVar2;
    if (lVar3 != 0) {
      _memmove(lVar6,lVar2,lVar3 + -3);
    }
    *plVar5 = lVar6 + lVar3;
  }
  iVar1 = *unaff_x21;
  iVar4 = *unaff_x22;
  if (iVar1 < iVar4) {
    lVar3 = *(long *)(unaff_x24 + (long)unaff_w25 * 0x18 + 8);
    func_0x00149130(in_stack_00000008,*unaff_x28,*unaff_x27,lVar3,
                    (lVar3 - *unaff_x27 >> 2) * -0x5555555555555555);
    iVar1 = *unaff_x21;
    iVar4 = *unaff_x22;
  }
  if (iVar1 < iVar4) {
    func_0x00138a58();
  }
  *(undefined1 *)(unaff_x19 + 0x5d) = 1;
  return;
}

