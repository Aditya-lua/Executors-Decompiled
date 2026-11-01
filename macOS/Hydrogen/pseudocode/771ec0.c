
ulong FUN_00771ec0(long param_1)

{
  byte bVar1;
  int iVar2;
  long lVar3;
  undefined8 uVar4;
  char *pcVar5;
  uint uVar6;
  long unaff_x19;
  ulong uVar7;
  uint unaff_w27;
  uint *unaff_x28;
  ulong in_stack_00000070;
  undefined1 uStack0000000000000078;
  
  if ((param_1 == 0) && (*(long *)(unaff_x19 + 0x7e8) != 0)) {
    (*pcRam0000000000a2b5f0)
              (*(undefined8 *)((long)&dylib_command_000012d0.dylib.name.offset + unaff_x19));
    *(undefined8 *)((long)&dylib_command_000012d0.dylib.name.offset + unaff_x19) = 0;
    lVar3 = func_0x00764704("Accept-Encoding: %s\r\n");
    *(long *)((long)&dylib_command_000012d0.dylib.name.offset + unaff_x19) = lVar3;
    if (lVar3 == 0) {
      uVar7 = 0x1b;
      goto LAB_0077216c;
    }
  }
  lVar3 = func_0x00782efc();
  if ((lVar3 == 0) || (*(long *)((long)&dylib_command_000012d0.cmd + unaff_x19) == 0)) {
    func_0x00782efc();
  }
  else {
    (*pcRam0000000000a2b5f0)();
    *(undefined8 *)((long)&dylib_command_000012d0.cmd + unaff_x19) = 0;
  }
  uVar7 = func_0x00752f88();
  if ((int)uVar7 != 0) goto LAB_0077216c;
  (*pcRam0000000000a2b5f0)(*(undefined8 *)("/usr/lib/libobjc.A.dylib" + unaff_x19 + 8));
  pcVar5 = "/usr/lib/libobjc.A.dylib" + unaff_x19 + 8;
  pcVar5[0] = '\0';
  pcVar5[1] = '\0';
  pcVar5[2] = '\0';
  pcVar5[3] = '\0';
  pcVar5[4] = '\0';
  pcVar5[5] = '\0';
  pcVar5[6] = '\0';
  pcVar5[7] = '\0';
  if (*(long *)("/System/Library/Frameworks/Foundation.framework/Versions/C/Foundation" +
               unaff_x19 + 0x30) == 0) {
    bVar1 = (&UNK_00001345)[unaff_x19];
joined_r0x00772078:
    if ((bVar1 >> 2 & 1) == 0) goto LAB_007720c0;
LAB_007720a8:
    lVar3 = func_0x00782efc();
    if ((lVar3 != 0) || (*(long *)((long)&dylib_command_00001108.cmd + unaff_x19) == 0))
    goto LAB_007720c0;
    (*pcRam0000000000a2b5f0)(*(undefined8 *)("/usr/lib/libobjc.A.dylib" + unaff_x19));
    pcVar5 = "/usr/lib/libobjc.A.dylib" + unaff_x19;
    pcVar5[0] = '\0';
    pcVar5[1] = '\0';
    pcVar5[2] = '\0';
    pcVar5[3] = '\0';
    pcVar5[4] = '\0';
    pcVar5[5] = '\0';
    pcVar5[6] = '\0';
    pcVar5[7] = '\0';
    uVar4 = func_0x00764704("Range: %s\r\n");
    *(undefined8 *)("/usr/lib/libobjc.A.dylib" + unaff_x19) = uVar4;
    lVar3 = func_0x00782efc();
  }
  else {
    lVar3 = func_0x00782efc();
    if (lVar3 == 0) {
      uVar4 = func_0x00764704("Referer: %s\r\n");
      *(undefined8 *)("/usr/lib/libobjc.A.dylib" + unaff_x19 + 8) = uVar4;
      bVar1 = (&UNK_00001345)[unaff_x19];
      goto joined_r0x00772078;
    }
    if (((byte)(&UNK_00001345)[unaff_x19] >> 2 & 1) != 0) goto LAB_007720a8;
LAB_007720c0:
    lVar3 = func_0x00782efc();
  }
  if (lVar3 != 0) {
    func_0x0073c9e4();
    uVar7 = 0x55;
    goto LAB_0077216c;
  }
  lVar3 = func_0x00782efc();
  if (lVar3 != 0) {
    func_0x0073c9e4();
    uVar7 = 0x2b;
    goto LAB_0077216c;
  }
  uVar7 = func_0x00740a18(&uStack0000000000000078,"%s %s RTSP/1.0\r\nCSeq: %ld\r\n");
  if (((int)uVar7 != 0) ||
     (((in_stack_00000070 & 0x100000000) == 0 &&
      (uVar7 = func_0x00740a18(&uStack0000000000000078,"Session: %s\r\n"), (int)uVar7 != 0))))
  goto LAB_0077216c;
  uVar7 = func_0x00740a18(&uStack0000000000000078,"%s%s%s%s%s%s%s%s");
  (*pcRam0000000000a2b5f0)
            (*(undefined8 *)((long)&dylib_command_000012d0.dylib.current_version + unaff_x19));
  *(undefined8 *)((long)&dylib_command_000012d0.dylib.current_version + unaff_x19) = 0;
  if (((int)uVar7 != 0) ||
     ((((unaff_w27 == 4 || (unaff_w27 == 2)) && (uVar7 = func_0x00753e4c(), (int)uVar7 != 0)) ||
      (uVar7 = func_0x007538a4(), (int)uVar7 != 0)))) goto LAB_0077216c;
  if ((unaff_w27 < 10) && ((1 << (ulong)(unaff_w27 & 0x1f) & 0x308U) != 0)) {
    if (((byte)(&UNK_00001346)[unaff_x19] >> 3 & 1) == 0) {
      if (*(long *)(unaff_x19 + 0x210) == 0) {
        lVar3 = *(long *)(
                         "/System/Library/Frameworks/CoreServices.framework/Versions/A/CoreServices"
                         + unaff_x19 + 0x30);
        if (lVar3 < 0) {
          uVar7 = func_0x00774a20();
          lVar3 = 0;
        }
        else {
          uVar7 = func_0x00774334();
        }
      }
      else {
        lVar3 = _strlen(*(long *)(unaff_x19 + 0x210));
        uVar7 = func_0x00774ae4();
      }
      iVar2 = (int)uVar7;
    }
    else {
      lVar3 = *(long *)("/System/Library/Frameworks/CoreServices.framework/Versions/A/CoreServices"
                       + unaff_x19 + 0x30);
      (&UNK_00001342)[unaff_x19] = 4;
      uVar7 = func_0x00774334();
      iVar2 = (int)uVar7;
    }
    if (iVar2 != 0) goto LAB_0077216c;
    if (lVar3 < 1) {
      if (unaff_w27 == 8) {
        (&UNK_00001342)[unaff_x19] = 5;
        *unaff_x28 = *unaff_x28 | 0x20000;
      }
      goto LAB_00772428;
    }
    lVar3 = func_0x00782efc();
    if ((lVar3 == 0) &&
       (uVar7 = func_0x00740a18(&uStack0000000000000078,"Content-Length: %ld\r\n"), (int)uVar7 != 0)
       ) goto LAB_0077216c;
    if ((unaff_w27 & 0xfffffffe) == 8) {
      lVar3 = func_0x00782efc();
      if (lVar3 == 0) {
        pcVar5 = "Content-Type: text/parameters\r\n";
code_r0x00772414:
        uVar7 = func_0x0074075c(&uStack0000000000000078,pcVar5,0x1f);
        iVar2 = (int)uVar7;
        goto joined_r0x00772344;
      }
    }
    else if ((unaff_w27 == 3) && (lVar3 = func_0x00782efc(), lVar3 == 0)) {
      pcVar5 = "Content-Type: application/sdp\r\n";
      goto code_r0x00772414;
    }
  }
  else {
    uVar7 = func_0x00774a20();
    iVar2 = (int)uVar7;
joined_r0x00772344:
    if (iVar2 != 0) goto LAB_0077216c;
  }
LAB_00772428:
  uVar7 = func_0x0074075c(&uStack0000000000000078,"\r\n",2);
  if ((int)uVar7 == 0) {
    func_0x00783e98();
    uVar7 = func_0x00771554();
    if ((int)uVar7 == 0) {
      *(long *)((long)&dylib_command_00001108.dylib.current_version + unaff_x19) =
           *(long *)((long)&dylib_command_00001108.dylib.current_version + unaff_x19) + 1;
      if (*(long *)(unaff_x19 + 0x100) == 0) {
        uVar7 = 0;
      }
      else {
        func_0x00770948();
        iVar2 = func_0x0077011c();
        uVar6 = 0;
        if (iVar2 != 0) {
          uVar6 = 0x2a;
        }
        uVar7 = (ulong)uVar6;
      }
    }
    else {
      func_0x0073c9e4();
    }
  }
LAB_0077216c:
  func_0x00740678(&uStack0000000000000078);
  return uVar7;
}

