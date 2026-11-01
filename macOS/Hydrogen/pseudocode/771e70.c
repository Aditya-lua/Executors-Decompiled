
/* WARNING: Removing unreachable block (ram,0x00772204) */

ulong FUN_00771e70(void)

{
  byte bVar1;
  int iVar2;
  long lVar3;
  ulong uVar4;
  undefined8 uVar5;
  char *pcVar6;
  uint uVar7;
  long unaff_x19;
  uint unaff_w24;
  uint unaff_w27;
  uint *unaff_x28;
  undefined8 uStack0000000000000068;
  uint uStack0000000000000074;
  undefined1 uStack0000000000000078;
  
  uStack0000000000000068 = 0;
  uStack0000000000000074 = unaff_w24;
  lVar3 = func_0x00782efc();
  if ((lVar3 == 0) || (*(long *)((long)&dylib_command_000012d0.cmd + unaff_x19) == 0)) {
    func_0x00782efc();
  }
  else {
    (*pcRam0000000000a2b5f0)();
    *(undefined8 *)((long)&dylib_command_000012d0.cmd + unaff_x19) = 0;
  }
  uVar4 = func_0x00752f88();
  if ((int)uVar4 != 0) goto LAB_0077216c;
  (*pcRam0000000000a2b5f0)(*(undefined8 *)("/usr/lib/libobjc.A.dylib" + unaff_x19 + 8));
  pcVar6 = "/usr/lib/libobjc.A.dylib" + unaff_x19 + 8;
  pcVar6[0] = '\0';
  pcVar6[1] = '\0';
  pcVar6[2] = '\0';
  pcVar6[3] = '\0';
  pcVar6[4] = '\0';
  pcVar6[5] = '\0';
  pcVar6[6] = '\0';
  pcVar6[7] = '\0';
  if (*(long *)("/System/Library/Frameworks/Foundation.framework/Versions/C/Foundation" +
               unaff_x19 + 0x30) == 0) {
    bVar1 = (&UNK_00001345)[unaff_x19];
joined_r0x00772078:
    if ((bVar1 >> 2 & 1) == 0) goto code_r0x007720c0;
code_r0x007720a8:
    lVar3 = func_0x00782efc();
    if ((lVar3 != 0) || (*(long *)((long)&dylib_command_00001108.cmd + unaff_x19) == 0))
    goto code_r0x007720c0;
    (*pcRam0000000000a2b5f0)(*(undefined8 *)("/usr/lib/libobjc.A.dylib" + unaff_x19));
    pcVar6 = "/usr/lib/libobjc.A.dylib" + unaff_x19;
    pcVar6[0] = '\0';
    pcVar6[1] = '\0';
    pcVar6[2] = '\0';
    pcVar6[3] = '\0';
    pcVar6[4] = '\0';
    pcVar6[5] = '\0';
    pcVar6[6] = '\0';
    pcVar6[7] = '\0';
    uVar5 = func_0x00764704("Range: %s\r\n");
    *(undefined8 *)("/usr/lib/libobjc.A.dylib" + unaff_x19) = uVar5;
    lVar3 = func_0x00782efc();
  }
  else {
    lVar3 = func_0x00782efc();
    if (lVar3 == 0) {
      uVar5 = func_0x00764704("Referer: %s\r\n");
      *(undefined8 *)("/usr/lib/libobjc.A.dylib" + unaff_x19 + 8) = uVar5;
      bVar1 = (&UNK_00001345)[unaff_x19];
      goto joined_r0x00772078;
    }
    if (((byte)(&UNK_00001345)[unaff_x19] >> 2 & 1) != 0) goto code_r0x007720a8;
code_r0x007720c0:
    lVar3 = func_0x00782efc();
  }
  if (lVar3 != 0) {
    func_0x0073c9e4();
    uVar4 = 0x55;
    goto LAB_0077216c;
  }
  lVar3 = func_0x00782efc();
  if (lVar3 != 0) {
    func_0x0073c9e4();
    uVar4 = 0x2b;
    goto LAB_0077216c;
  }
  uVar4 = func_0x00740a18(&uStack0000000000000078,"%s %s RTSP/1.0\r\nCSeq: %ld\r\n");
  if (((int)uVar4 != 0) ||
     (((uStack0000000000000074 & 1) == 0 &&
      (uVar4 = func_0x00740a18(&uStack0000000000000078,"Session: %s\r\n"), (int)uVar4 != 0))))
  goto LAB_0077216c;
  uVar4 = func_0x00740a18(&uStack0000000000000078,"%s%s%s%s%s%s%s%s");
  (*pcRam0000000000a2b5f0)
            (*(undefined8 *)((long)&dylib_command_000012d0.dylib.current_version + unaff_x19));
  *(undefined8 *)((long)&dylib_command_000012d0.dylib.current_version + unaff_x19) = 0;
  if (((int)uVar4 != 0) ||
     ((((unaff_w27 == 4 || (unaff_w27 == 2)) && (uVar4 = func_0x00753e4c(), (int)uVar4 != 0)) ||
      (uVar4 = func_0x007538a4(), (int)uVar4 != 0)))) goto LAB_0077216c;
  if ((unaff_w27 < 10) && ((1 << (ulong)(unaff_w27 & 0x1f) & 0x308U) != 0)) {
    if (((byte)(&UNK_00001346)[unaff_x19] >> 3 & 1) == 0) {
      if (*(long *)(unaff_x19 + 0x210) == 0) {
        lVar3 = *(long *)(
                         "/System/Library/Frameworks/CoreServices.framework/Versions/A/CoreServices"
                         + unaff_x19 + 0x30);
        if (lVar3 < 0) {
          uVar4 = func_0x00774a20();
          lVar3 = 0;
        }
        else {
          uVar4 = func_0x00774334();
        }
      }
      else {
        lVar3 = _strlen(*(long *)(unaff_x19 + 0x210));
        uVar4 = func_0x00774ae4();
      }
      iVar2 = (int)uVar4;
    }
    else {
      lVar3 = *(long *)("/System/Library/Frameworks/CoreServices.framework/Versions/A/CoreServices"
                       + unaff_x19 + 0x30);
      (&UNK_00001342)[unaff_x19] = 4;
      uVar4 = func_0x00774334();
      iVar2 = (int)uVar4;
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
       (uVar4 = func_0x00740a18(&uStack0000000000000078,"Content-Length: %ld\r\n"), (int)uVar4 != 0)
       ) goto LAB_0077216c;
    if ((unaff_w27 & 0xfffffffe) == 8) {
      lVar3 = func_0x00782efc();
      if (lVar3 == 0) {
        pcVar6 = "Content-Type: text/parameters\r\n";
LAB_00772414:
        uVar4 = func_0x0074075c(&uStack0000000000000078,pcVar6,0x1f);
        iVar2 = (int)uVar4;
        goto joined_r0x00772344;
      }
    }
    else if ((unaff_w27 == 3) && (lVar3 = func_0x00782efc(), lVar3 == 0)) {
      pcVar6 = "Content-Type: application/sdp\r\n";
      goto LAB_00772414;
    }
  }
  else {
    uVar4 = func_0x00774a20();
    iVar2 = (int)uVar4;
joined_r0x00772344:
    if (iVar2 != 0) goto LAB_0077216c;
  }
LAB_00772428:
  uVar4 = func_0x0074075c(&uStack0000000000000078,"\r\n",2);
  if ((int)uVar4 == 0) {
    func_0x00783e98();
    uVar4 = func_0x00771554();
    if ((int)uVar4 == 0) {
      *(long *)((long)&dylib_command_00001108.dylib.current_version + unaff_x19) =
           *(long *)((long)&dylib_command_00001108.dylib.current_version + unaff_x19) + 1;
      if (*(long *)(unaff_x19 + 0x100) == 0) {
        uVar4 = 0;
      }
      else {
        func_0x00770948();
        iVar2 = func_0x0077011c();
        uVar7 = 0;
        if (iVar2 != 0) {
          uVar7 = 0x2a;
        }
        uVar4 = (ulong)uVar7;
      }
    }
    else {
      func_0x0073c9e4();
    }
  }
LAB_0077216c:
  func_0x00740678(&uStack0000000000000078);
  return uVar4;
}

