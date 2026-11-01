
bool FUN_000dbe8c(void)

{
  int iVar1;
  undefined4 unaff_w19;
  long unaff_x22;
  undefined4 *unaff_x23;
  
  _memcpy();
  *unaff_x23 = unaff_w19;
  iVar1 = *(int *)(&UNK_00003f58 + unaff_x22);
  unaff_x23[3] = iVar1;
  return unaff_x23[0x1b] == iVar1 || unaff_x23[0x1b] == iVar1 + -1;
}

