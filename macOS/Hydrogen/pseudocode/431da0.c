
void FUN_00431da0(undefined8 param_1)

{
  code *pcVar1;
  uint uVar2;
  long lVar3;
  undefined8 uVar4;
  undefined1 uVar5;
  undefined1 uVar6;
  long unaff_x20;
  long unaff_x29;
  undefined8 in_stack_00000008;
  undefined1 uStack0000000000000010;
  undefined8 uStack0000000000000020;
  
  lVar3 = func_0x00187bd8(param_1,0x400,1);
  if (lVar3 == 0) {
    func_0x007a1f00(1);
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x431dd0);
    (*pcVar1)();
  }
  uStack0000000000000020 = unaff_x20;
  func_0x004653b0(&uStack0000000000000010,&UNK_008884b8,4,&uStack0000000000000020,&UNK_009da2f8);
  if (uStack0000000000000020 != 0) {
    func_0x00187bd4(lVar3,uStack0000000000000020,1);
  }
  uVar2 = _fcntl(in_stack_00000008._4_4_,3);
  if (uVar2 != 0xffffffff) {
    uVar2 = uVar2 & 3;
    if (uVar2 < 2) {
      if (uVar2 == 0) {
        uVar6 = 1;
        uVar5 = 0;
      }
      else {
        uVar6 = 0;
        uVar5 = 1;
      }
    }
    else {
      if (uVar2 != 2) goto LAB_00431eb8;
      uVar5 = 1;
      uVar6 = 1;
    }
    *(undefined1 *)(unaff_x29 + -0x21) = uVar6;
    uStack0000000000000020 = CONCAT71(uStack0000000000000020._1_7_,uVar5);
    uVar4 = func_0x004653b0(&uStack0000000000000010,&UNK_008884b0,4,unaff_x29 + -0x21,&UNK_009d9f48)
    ;
    func_0x004653b0(uVar4,&UNK_0088740d,5,&uStack0000000000000020,&UNK_009d9f48);
  }
LAB_00431eb8:
  func_0x00465628(&uStack0000000000000010);
  return;
}

