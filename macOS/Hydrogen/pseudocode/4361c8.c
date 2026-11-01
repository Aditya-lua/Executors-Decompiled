
undefined8 FUN_004361c8(void)

{
  int iVar1;
  undefined8 uVar2;
  long unaff_x19;
  undefined1 uStack0000000000000018;
  
  if (*(int *)(unaff_x19 + 0x70) == 5) {
    iVar1 = *(int *)(unaff_x19 + 0x58);
  }
  else {
    func_0x004653b0(&uStack0000000000000018,&UNK_008863d6,6,(int *)(unaff_x19 + 0x70),&UNK_009dbf90)
    ;
    iVar1 = *(int *)(unaff_x19 + 0x58);
  }
  if (iVar1 != 0) {
    func_0x004653b0(&uStack0000000000000018,&UNK_008876ae,6,unaff_x19 + 0x58,&UNK_009dbfb0);
  }
  uVar2 = func_0x00465628(&uStack0000000000000018);
  return uVar2;
}

