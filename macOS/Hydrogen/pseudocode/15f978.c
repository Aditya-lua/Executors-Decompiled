
bool FUN_0015f978(void)

{
  int iVar1;
  undefined4 uVar2;
  long lVar3;
  undefined8 uVar4;
  long unaff_x19;
  
  lVar3 = func_0x007b7e00();
  if (lVar3 == 0xb) {
    iVar1 = func_0x007b6c20();
    if (iVar1 != 0) goto LAB_0015fb20;
    func_0x007b6ce0();
    func_0x001607a8();
    func_0x007b7e00();
  }
  else {
    lVar3 = func_0x007b7e00();
    if (lVar3 != 0xc) {
      return false;
    }
    uVar4 = func_0x007b6ce0();
    func_0x007b6ee0();
    func_0x000b72b0();
    func_0x000b72b0();
    func_0x000b72b0();
    func_0x000b72b0();
    uVar2 = func_0x001607a8(uVar4);
    switch(uVar2) {
    case 0x20f:
      break;
    case 0x210:
      break;
    case 0x211:
      break;
    case 0x212:
      break;
    case 0x213:
      break;
    case 0x214:
      break;
    case 0x215:
      break;
    case 0x216:
      break;
    default:
      goto LAB_0015fb20;
    }
    func_0x007b6ee0();
  }
  func_0x000b72b0();
  func_0x000b72d4();
LAB_0015fb20:
  return *(char *)(unaff_x19 + 0xc3) != '\0';
}

