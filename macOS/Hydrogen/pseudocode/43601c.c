
/* WARNING: Type propagation algorithm not settling */

undefined8 FUN_0043601c(undefined8 param_1,undefined8 param_2)

{
  int iVar1;
  undefined8 uVar2;
  long unaff_x19;
  undefined1 uStack0000000000000018;
  
  uVar2 = func_0x004653b0(&uStack0000000000000018,param_2,7,unaff_x19 + 0x98);
  func_0x004653b0(uVar2,&UNK_008884c4,4);
  if (((*(byte *)(unaff_x19 + 0x90) & 1) != 0) || (*(long *)(unaff_x19 + 0x88) != 0)) {
    func_0x004653b0(&uStack0000000000000018,&UNK_0088769c,3,unaff_x19 + 0x78,&UNK_009dbf10);
  }
  if (*(long *)(unaff_x19 + 0xa8) != 0) {
    func_0x004653b0(&uStack0000000000000018,&UNK_0088769f,3,(long *)(unaff_x19 + 0xa8),&UNK_009dbf30
                   );
  }
  if (*(int *)(unaff_x19 + 0x48) != 0) {
    func_0x004653b0(&uStack0000000000000018,&UNK_008876a2,3,(int *)(unaff_x19 + 0x48),&UNK_009dbf50)
    ;
  }
  if (*(int *)(unaff_x19 + 0x50) != 0) {
    func_0x004653b0(&uStack0000000000000018,&UNK_008876a5,3,(int *)(unaff_x19 + 0x50),&UNK_009dbf50)
    ;
  }
  if (*(long *)(unaff_x19 + 0xb8) != 0) {
    func_0x004653b0(&uStack0000000000000018,&UNK_008876a8,6,(long *)(unaff_x19 + 0xb8),&UNK_009dbf70
                   );
  }
  if (*(int *)(unaff_x19 + 0x60) == 5) {
    iVar1 = *(int *)(unaff_x19 + 0x68);
  }
  else {
    func_0x004653b0(&uStack0000000000000018,&UNK_0088667d,5,(int *)(unaff_x19 + 0x60),&UNK_009dbf90)
    ;
    iVar1 = *(int *)(unaff_x19 + 0x68);
  }
  if (iVar1 == 5) {
    iVar1 = *(int *)(unaff_x19 + 0x70);
  }
  else {
    func_0x004653b0(&uStack0000000000000018,&UNK_008863d0,6,unaff_x19 + 0x68,&UNK_009dbf90);
    iVar1 = *(int *)(unaff_x19 + 0x70);
  }
  if (iVar1 == 5) {
    iVar1 = *(int *)(unaff_x19 + 0x58);
  }
  else {
    func_0x004653b0(&uStack0000000000000018,&UNK_008863d6,6,unaff_x19 + 0x70,&UNK_009dbf90);
    iVar1 = *(int *)(unaff_x19 + 0x58);
  }
  if (iVar1 != 0) {
    func_0x004653b0(&uStack0000000000000018,&UNK_008876ae,6,unaff_x19 + 0x58,&UNK_009dbfb0);
  }
  uVar2 = func_0x00465628(&uStack0000000000000018);
  return uVar2;
}

