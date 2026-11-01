
void FUN_0042da20(void)

{
  undefined8 uVar1;
  int *unaff_x19;
  undefined8 uVar2;
  undefined8 uStack0000000000000018;
  
  func_0x00469240();
  uVar2 = *(undefined8 *)(unaff_x19 + 2);
  if (*unaff_x19 == 1) {
    uVar1 = func_0x004653b0();
    uStack0000000000000018 = *(undefined8 *)(unaff_x19 + 6);
  }
  else {
    __Unwind_GetIP(uVar2);
    uVar1 = func_0x004653b0();
    uStack0000000000000018 = __Unwind_GetIP(uVar2);
  }
  func_0x004653b0(uVar1,&UNK_00886ce0,0xe,&uStack0000000000000018,&UNK_009db410);
  func_0x00465628();
  return;
}

