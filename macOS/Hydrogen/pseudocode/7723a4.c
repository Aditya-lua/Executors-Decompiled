
ulong FUN_007723a4(void)

{
  bool in_ZR;
  int iVar1;
  long lVar2;
  ulong uVar3;
  char *pcVar4;
  uint uVar5;
  long unaff_x19;
  int unaff_w27;
  undefined1 uStack0000000000000078;
  
  if (in_ZR) {
    lVar2 = func_0x00782efc();
    if (lVar2 == 0) {
      pcVar4 = "Content-Type: text/parameters\r\n";
LAB_00772414:
      uVar3 = func_0x0074075c(&uStack0000000000000078,pcVar4,0x1f);
      if ((int)uVar3 != 0) goto LAB_0077216c;
    }
  }
  else if ((unaff_w27 == 3) && (lVar2 = func_0x00782efc(), lVar2 == 0)) {
    pcVar4 = "Content-Type: application/sdp\r\n";
    goto LAB_00772414;
  }
  uVar3 = func_0x0074075c(&uStack0000000000000078,"\r\n",2);
  if ((int)uVar3 == 0) {
    func_0x00783e98();
    uVar3 = func_0x00771554();
    if ((int)uVar3 == 0) {
      *(long *)((long)&dylib_command_00001108.dylib.current_version + unaff_x19) =
           *(long *)((long)&dylib_command_00001108.dylib.current_version + unaff_x19) + 1;
      if (*(long *)(unaff_x19 + 0x100) == 0) {
        uVar3 = 0;
      }
      else {
        func_0x00770948();
        iVar1 = func_0x0077011c();
        uVar5 = 0;
        if (iVar1 != 0) {
          uVar5 = 0x2a;
        }
        uVar3 = (ulong)uVar5;
      }
    }
    else {
      func_0x0073c9e4();
    }
  }
LAB_0077216c:
  func_0x00740678(&uStack0000000000000078);
  return uVar3;
}

