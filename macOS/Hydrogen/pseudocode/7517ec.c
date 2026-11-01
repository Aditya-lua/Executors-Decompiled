
undefined8 FUN_007517ec(void)

{
  int iVar1;
  long lVar2;
  char *pcVar3;
  undefined1 *puVar4;
  undefined8 uVar5;
  long lVar6;
  ulong uVar7;
  long unaff_x19;
  long unaff_x20;
  uint uVar8;
  undefined8 *unaff_x27;
  long unaff_x29;
  
  *(undefined4 *)(unaff_x19 + 0xc4c) = *(undefined4 *)(*(long *)(unaff_x20 + 0x3a0) + 0x94);
  (*(code *)*unaff_x27)(*(undefined8 *)("/usr/lib/libobjc.A.dylib" + unaff_x19 + 0x10));
  pcVar3 = "/usr/lib/libobjc.A.dylib" + unaff_x19 + 0x10;
  pcVar3[0] = '\0';
  pcVar3[1] = '\0';
  pcVar3[2] = '\0';
  pcVar3[3] = '\0';
  pcVar3[4] = '\0';
  pcVar3[5] = '\0';
  pcVar3[6] = '\0';
  pcVar3[7] = '\0';
  lVar2 = func_0x00782efc();
  if ((lVar2 == 0) ||
     ((((byte)(&UNK_00001344)[unaff_x19] >> 3 & 1) != 0 &&
      (iVar1 = func_0x0077e6f8(*(undefined8 *)(unaff_x19 + 0xc40),*(undefined8 *)(unaff_x20 + 0x68))
      , iVar1 == 0)))) {
    uVar8 = *(uint *)(*(long *)(unaff_x20 + 0x3a8) + 0x94);
    if ((((uVar8 & 0x80000002) == 0) || (*(int *)(unaff_x20 + 0x518) != 0x1bb)) &&
       (((uVar8 & 0x40000001) == 0 || (*(int *)(unaff_x20 + 0x518) != 0x50)))) {
      lVar2 = func_0x00764704("Host: %s%s%s:%d\r\n");
      *(long *)("/usr/lib/libobjc.A.dylib" + unaff_x19 + 0x10) = lVar2;
    }
    else {
      lVar2 = func_0x00764704("Host: %s%s%s\r\n");
      *(long *)("/usr/lib/libobjc.A.dylib" + unaff_x19 + 0x10) = lVar2;
    }
joined_r0x0075193c:
    if (lVar2 == 0) {
      return 0x1b;
    }
  }
  else {
    pcVar3 = (char *)func_0x007529d0(lVar2);
    if (pcVar3 == (char *)0x0) {
      return 0x1b;
    }
    if (*pcVar3 == '[') {
      lVar6 = _strlen(pcVar3);
      _memmove(pcVar3,pcVar3 + 1,lVar6 + -1);
      uVar5 = 0x5d;
code_r0x00751974:
      puVar4 = (undefined1 *)_strchr(pcVar3,uVar5);
      if (puVar4 != (undefined1 *)0x0) {
        *puVar4 = 0;
      }
      (*(code *)*unaff_x27)(*(undefined8 *)("/usr/lib/libobjc.A.dylib" + unaff_x19 + 0x18));
      *(char **)("/usr/lib/libobjc.A.dylib" + unaff_x19 + 0x18) = pcVar3;
      iVar1 = func_0x0077e6f8("Host:",lVar2);
    }
    else {
      if (*pcVar3 != '\0') {
        uVar5 = 0x3a;
        goto code_r0x00751974;
      }
      (*(code *)*unaff_x27)(pcVar3);
      iVar1 = func_0x0077e6f8("Host:",lVar2);
    }
    if (iVar1 == 0) {
      lVar2 = func_0x00764704("Host:%s\r\n");
      *(long *)("/usr/lib/libobjc.A.dylib" + unaff_x19 + 0x10) = lVar2;
      goto joined_r0x0075193c;
    }
  }
  lVar2 = func_0x00782efc();
  if (lVar2 != 0) {
    (*(code *)*unaff_x27)(*(undefined8 *)((long)&dylib_command_000012d0.cmd + unaff_x19));
    *(undefined8 *)((long)&dylib_command_000012d0.cmd + unaff_x19) = 0;
  }
  uVar8 = (uint)(byte)(&UNK_00001342)[unaff_x19];
  if (((*(uint *)(*(long *)(unaff_x20 + 0x3a0) + 0x94) & 0xc0000007) != 0) &&
     (uVar8 = (uint)(byte)(&UNK_00001342)[unaff_x19], ((&UNK_00001346)[unaff_x19] & 8) != 0)) {
    uVar8 = 4;
  }
  if (*(long *)(unaff_x19 + 0x7c0) == 0) {
    if ((*(byte *)(unaff_x19 + 0x1c3) >> 1 & 1) != 0) {
      lVar2 = *(long *)("/System/Library/Frameworks/Foundation.framework/Versions/C/Foundation" +
                       unaff_x19 + 0x20);
      goto joined_r0x00751a9c;
    }
    if (uVar8 - 1 < 5) {
      lVar2 = *(long *)("/System/Library/Frameworks/Foundation.framework/Versions/C/Foundation" +
                       unaff_x19 + 0x20);
      goto joined_r0x00751a9c;
    }
    if (*(long *)("/System/Library/Frameworks/Foundation.framework/Versions/C/Foundation" +
                 unaff_x19 + 0x20) == 0) goto code_r0x00751ab8;
code_r0x00751a2c:
    lVar2 = func_0x00764704("%s?%s");
    if (lVar2 == 0) {
      return 0x1b;
    }
  }
  else {
    lVar2 = *(long *)("/System/Library/Frameworks/Foundation.framework/Versions/C/Foundation" +
                     unaff_x19 + 0x20);
joined_r0x00751a9c:
    if (lVar2 != 0) goto code_r0x00751a2c;
code_r0x00751ab8:
    lVar2 = 0;
  }
  uVar5 = func_0x00752f88();
  (*(code *)*unaff_x27)(lVar2);
  if ((int)uVar5 == 0) {
    (*(code *)*unaff_x27)(*(undefined8 *)("/usr/lib/libobjc.A.dylib" + unaff_x19 + 8));
    pcVar3 = "/usr/lib/libobjc.A.dylib" + unaff_x19 + 8;
    pcVar3[0] = '\0';
    pcVar3[1] = '\0';
    pcVar3[2] = '\0';
    pcVar3[3] = '\0';
    pcVar3[4] = '\0';
    pcVar3[5] = '\0';
    pcVar3[6] = '\0';
    pcVar3[7] = '\0';
    if ((*(long *)("/System/Library/Frameworks/Foundation.framework/Versions/C/Foundation" +
                  unaff_x19 + 0x30) != 0) && (lVar2 = func_0x00782efc(), lVar2 == 0)) {
      lVar2 = func_0x00764704("Referer: %s\r\n");
      *(long *)("/usr/lib/libobjc.A.dylib" + unaff_x19 + 8) = lVar2;
      if (lVar2 == 0) {
        return 0x1b;
      }
    }
    lVar2 = func_0x00782efc();
    if ((lVar2 == 0) && (*(long *)(unaff_x19 + 0x7e8) != 0)) {
      (*(code *)*unaff_x27)
                (*(undefined8 *)((long)&dylib_command_000012d0.dylib.name.offset + unaff_x19));
      *(undefined8 *)((long)&dylib_command_000012d0.dylib.name.offset + unaff_x19) = 0;
      lVar2 = func_0x00764704("Accept-Encoding: %s\r\n");
      *(long *)((long)&dylib_command_000012d0.dylib.name.offset + unaff_x19) = lVar2;
      if (lVar2 == 0) {
        return 0x1b;
      }
    }
    else {
      (*(code *)*unaff_x27)
                (*(undefined8 *)((long)&dylib_command_000012d0.dylib.name.offset + unaff_x19));
      *(undefined8 *)((long)&dylib_command_000012d0.dylib.name.offset + unaff_x19) = 0;
    }
    lVar2 = func_0x00782efc();
    if ((lVar2 == 0) && ((*(byte *)(unaff_x19 + 0xa1d) >> 1 & 1) != 0)) {
      lVar2 = func_0x00782efc();
      (*(code *)*unaff_x27)
                (*(undefined8 *)((long)&linkedit_data_command_00001308.dataoff + unaff_x19));
      *(undefined8 *)((long)&linkedit_data_command_00001308.dataoff + unaff_x19) = 0;
      if (lVar2 == 0) {
        lVar2 = 0;
      }
      else {
        lVar2 = func_0x007529d0(lVar2);
        if (lVar2 == 0) {
          return 0x1b;
        }
      }
      uVar5 = func_0x00764704("Connection: %s%sTE\r\nTE: gzip\r\n");
      *(undefined8 *)((long)&linkedit_data_command_00001308.dataoff + unaff_x19) = uVar5;
      (*(code *)*unaff_x27)(lVar2);
      if (*(long *)((long)&linkedit_data_command_00001308.dataoff + unaff_x19) == 0) {
        return 0x1b;
      }
    }
    uVar8 = func_0x00754078();
    if (uVar8 == 0xb) {
      pcVar3 = "1.1";
    }
    else if (uVar8 == 0x1e) {
      pcVar3 = "3";
    }
    else if (uVar8 == 0x14) {
      pcVar3 = "2";
    }
    else {
      pcVar3 = "1.0";
    }
    *(char **)(unaff_x29 + -0x88) = pcVar3;
    uVar5 = func_0x007540fc();
    if ((int)uVar5 == 0) {
      *(long *)(unaff_x29 + -0x90) = unaff_x19 + 0x1c1;
      func_0x00782efc();
      uVar5 = func_0x007544dc();
      if ((int)uVar5 != 0) {
        return uVar5;
      }
      func_0x0074066c(unaff_x29 + -0x80,0x100000);
      func_0x007406b0(unaff_x19 + 0xc10);
      uVar5 = func_0x00740a18(unaff_x29 + -0x80,"%s ");
      if (((int)uVar5 == 0) && (uVar5 = func_0x0075465c(), (int)uVar5 == 0)) {
        if ((*(char *)(unaff_x20 + 0x398) < '\0') && (lVar2 = func_0x00782efc(), lVar2 == 0)) {
          lVar2 = func_0x00764704("Alt-Used: %s:%d\r\n");
          if (lVar2 == 0) {
            func_0x00740678(unaff_x29 + -0x80);
            return 0x1b;
          }
        }
        else {
          lVar2 = 0;
        }
        if (((*(ulong *)(unaff_x20 + 0x398) & 9) == 1) && (lVar6 = func_0x00782efc(), lVar6 == 0)) {
          func_0x00752938();
        }
        uVar5 = func_0x00740a18(unaff_x29 + -0x80," HTTP/%s\r\n%s%s%s%s%s%s%s%s%s%s%s%s");
        (*(code *)*unaff_x27)
                  (*(undefined8 *)((long)&dylib_command_000012d0.dylib.current_version + unaff_x19))
        ;
        *(undefined8 *)((long)&dylib_command_000012d0.dylib.current_version + unaff_x19) = 0;
        (*(code *)*unaff_x27)
                  (*(undefined8 *)((long)&linkedit_data_command_00001328.cmd + unaff_x19));
        *(undefined8 *)((long)&linkedit_data_command_00001328.cmd + unaff_x19) = 0;
        (*(code *)*unaff_x27)(lVar2);
        if ((int)uVar5 == 0) {
          uVar7 = func_0x007315f4();
          if (((uVar8 < 0x14) && ((uVar7 & 1) == 0)) && ((&UNK_00001340)[unaff_x19] == '\x03')) {
            func_0x00740678(unaff_x29 + -0x80);
            return 1;
          }
          uVar5 = func_0x007548a4();
          if (((((int)uVar5 == 0) &&
               ((*(uint *)(*(long *)(unaff_x20 + 0x3a0) + 0x94) >> 0x1e == 0 ||
                (uVar5 = func_0x0078bbf0(), (int)uVar5 == 0)))) &&
              (uVar5 = func_0x00753e4c(), (int)uVar5 == 0)) &&
             ((uVar5 = func_0x007538a4(), (int)uVar5 == 0 &&
              (uVar5 = func_0x00754c00(), (int)uVar5 == 0)))) {
            uVar5 = func_0x00771554();
            func_0x00740678(unaff_x29 + -0x80);
            if ((0x13 < uVar8) && ((int)uVar5 == 0)) {
              if ((**(uint **)(unaff_x29 + -0x90) >> 0xf & 1) == 0) {
                return 0;
              }
              **(uint **)(unaff_x29 + -0x90) = **(uint **)(unaff_x29 + -0x90) & 0xffff7fff;
              return 0;
            }
            goto code_r0x0075178c;
          }
        }
      }
      func_0x00740678(unaff_x29 + -0x80);
    }
  }
code_r0x0075178c:
  if ((int)uVar5 == 100) {
    func_0x0073c9e4();
    return uVar5;
  }
  return uVar5;
}

