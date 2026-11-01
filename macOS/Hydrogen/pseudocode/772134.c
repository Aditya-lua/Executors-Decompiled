
ulong FUN_00772134(undefined8 param_1,undefined8 param_2)

{
  int iVar1;
  long lVar2;
  char *pcVar3;
  uint uVar4;
  long unaff_x19;
  ulong uVar5;
  uint unaff_w27;
  uint *unaff_x28;
  ulong in_stack_00000070;
  undefined1 uStack0000000000000078;
  
  lVar2 = func_0x00782efc(param_1,param_2,4);
  if (lVar2 != 0) {
    func_0x0073c9e4();
    uVar5 = 0x55;
    goto LAB_0077216c;
  }
  lVar2 = func_0x00782efc();
  if (lVar2 != 0) {
    func_0x0073c9e4();
    uVar5 = 0x2b;
    goto LAB_0077216c;
  }
  uVar5 = func_0x00740a18(&uStack0000000000000078,"%s %s RTSP/1.0\r\nCSeq: %ld\r\n");
  if (((int)uVar5 != 0) ||
     (((in_stack_00000070 & 0x100000000) == 0 &&
      (uVar5 = func_0x00740a18(&uStack0000000000000078,"Session: %s\r\n"), (int)uVar5 != 0))))
  goto LAB_0077216c;
  uVar5 = func_0x00740a18(&uStack0000000000000078,"%s%s%s%s%s%s%s%s");
  (*pcRam0000000000a2b5f0)
            (*(undefined8 *)((long)&dylib_command_000012d0.dylib.current_version + unaff_x19));
  *(undefined8 *)((long)&dylib_command_000012d0.dylib.current_version + unaff_x19) = 0;
  if (((int)uVar5 != 0) ||
     ((((unaff_w27 == 4 || (unaff_w27 == 2)) && (uVar5 = func_0x00753e4c(), (int)uVar5 != 0)) ||
      (uVar5 = func_0x007538a4(), (int)uVar5 != 0)))) goto LAB_0077216c;
  if ((unaff_w27 < 10) && ((1 << (ulong)(unaff_w27 & 0x1f) & 0x308U) != 0)) {
    if (((byte)(&UNK_00001346)[unaff_x19] >> 3 & 1) == 0) {
      if (*(long *)(unaff_x19 + 0x210) == 0) {
        lVar2 = *(long *)(
                         "/System/Library/Frameworks/CoreServices.framework/Versions/A/CoreServices"
                         + unaff_x19 + 0x30);
        if (lVar2 < 0) {
          uVar5 = func_0x00774a20();
          lVar2 = 0;
        }
        else {
          uVar5 = func_0x00774334();
        }
      }
      else {
        lVar2 = _strlen(*(long *)(unaff_x19 + 0x210));
        uVar5 = func_0x00774ae4();
      }
      iVar1 = (int)uVar5;
    }
    else {
      lVar2 = *(long *)("/System/Library/Frameworks/CoreServices.framework/Versions/A/CoreServices"
                       + unaff_x19 + 0x30);
      (&UNK_00001342)[unaff_x19] = 4;
      uVar5 = func_0x00774334();
      iVar1 = (int)uVar5;
    }
    if (iVar1 != 0) goto LAB_0077216c;
    if (lVar2 < 1) {
      if (unaff_w27 == 8) {
        (&UNK_00001342)[unaff_x19] = 5;
        *unaff_x28 = *unaff_x28 | 0x20000;
      }
      goto LAB_00772428;
    }
    lVar2 = func_0x00782efc();
    if ((lVar2 == 0) &&
       (uVar5 = func_0x00740a18(&uStack0000000000000078,"Content-Length: %ld\r\n"), (int)uVar5 != 0)
       ) goto LAB_0077216c;
    if ((unaff_w27 & 0xfffffffe) == 8) {
      lVar2 = func_0x00782efc();
      if (lVar2 == 0) {
        pcVar3 = "Content-Type: text/parameters\r\n";
code_r0x00772414:
        uVar5 = func_0x0074075c(&uStack0000000000000078,pcVar3,0x1f);
        iVar1 = (int)uVar5;
        goto joined_r0x00772344;
      }
    }
    else if ((unaff_w27 == 3) && (lVar2 = func_0x00782efc(), lVar2 == 0)) {
      pcVar3 = "Content-Type: application/sdp\r\n";
      goto code_r0x00772414;
    }
  }
  else {
    uVar5 = func_0x00774a20();
    iVar1 = (int)uVar5;
joined_r0x00772344:
    if (iVar1 != 0) goto LAB_0077216c;
  }
LAB_00772428:
  uVar5 = func_0x0074075c(&uStack0000000000000078,"\r\n",2);
  if ((int)uVar5 == 0) {
    func_0x00783e98();
    uVar5 = func_0x00771554();
    if ((int)uVar5 == 0) {
      *(long *)((long)&dylib_command_00001108.dylib.current_version + unaff_x19) =
           *(long *)((long)&dylib_command_00001108.dylib.current_version + unaff_x19) + 1;
      if (*(long *)(unaff_x19 + 0x100) == 0) {
        uVar5 = 0;
      }
      else {
        func_0x00770948();
        iVar1 = func_0x0077011c();
        uVar4 = 0;
        if (iVar1 != 0) {
          uVar4 = 0x2a;
        }
        uVar5 = (ulong)uVar4;
      }
    }
    else {
      func_0x0073c9e4();
    }
  }
LAB_0077216c:
  func_0x00740678(&uStack0000000000000078);
  return uVar5;
}

