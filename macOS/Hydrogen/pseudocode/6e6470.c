
void FUN_006e6470(void)

{
  int iVar1;
  long lVar2;
  long lVar3;
  long lVar4;
  long extraout_x8;
  undefined1 auVar5 [16];
  
  func_0x006e6594();
  func_0x006e3a18();
  func_0x006e5524();
  auVar5 = func_0x006e52d0();
  lVar2 = auVar5._0_8_;
  if (((*(ulong *)(lVar2 + 0x40) < *(ulong *)(lVar2 + 0x20)) &&
      (lVar4 = **(long **)(*(ulong *)(lVar2 + 0x20) + 8), lVar4 != 0)) &&
     (*(char *)(lVar4 + 3) != '\0')) goto LAB_006e6560;
  lVar4 = 0;
  do {
    lVar3 = func_0x006e1710(lVar2,auVar5._8_8_);
    if (lVar3 == 0) {
      if (lVar4 == 0) {
        lVar3 = func_0x006e644c(lVar2,"missing argument #%d (%s expected)");
        goto code_r0x006e6508;
      }
code_r0x006e6530:
      func_0x006e644c(lVar2,"missing argument #%d to \'%s\' (%s expected)");
    }
    else {
code_r0x006e6508:
      func_0x006fe8d4(lVar2,lVar3);
      if (lVar4 == 0) {
        func_0x006e644c(lVar2,"invalid argument #%d (%s expected, got %s)");
        goto code_r0x006e6530;
      }
    }
    func_0x006e644c(lVar2,"invalid argument #%d to \'%s\' (%s expected, got %s)");
    lVar4 = extraout_x8;
LAB_006e6560:
    lVar4 = (lVar4 + 0x28) - *(long *)(lVar4 + 0x28);
    if ((lVar4 != 0) && (iVar1 = _strcmp(lVar4,"__namecall"), iVar1 == 0)) {
      lVar4 = 0;
      if (*(long *)(lVar2 + 0x70) != 0) {
        lVar4 = *(long *)(lVar2 + 0x70) + 0x18;
      }
    }
  } while( true );
}

