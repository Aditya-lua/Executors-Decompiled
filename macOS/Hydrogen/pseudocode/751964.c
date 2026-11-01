
undefined8 FUN_00751964(undefined8 param_1)

{
  int iVar1;
  undefined1 *puVar2;
  long lVar3;
  undefined8 uVar4;
  long lVar5;
  ulong uVar6;
  char *pcVar7;
  long unaff_x19;
  long unaff_x20;
  uint uVar8;
  undefined8 unaff_x22;
  undefined8 *unaff_x27;
  long unaff_x29;
  
  puVar2 = (undefined1 *)_strchr(param_1,0x5d);
  if (puVar2 != (undefined1 *)0x0) {
    *puVar2 = 0;
  }
  (*(code *)*unaff_x27)(*(undefined8 *)("/usr/lib/libobjc.A.dylib" + unaff_x19 + 0x18));
  *(undefined8 *)("/usr/lib/libobjc.A.dylib" + unaff_x19 + 0x18) = unaff_x22;
  iVar1 = func_0x0077e6f8("Host:");
  if (iVar1 == 0) {
    lVar3 = func_0x00764704("Host:%s\r\n");
    *(long *)("/usr/lib/libobjc.A.dylib" + unaff_x19 + 0x10) = lVar3;
    if (lVar3 == 0) {
      return 0x1b;
    }
  }
  lVar3 = func_0x00782efc();
  if (lVar3 != 0) {
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
      lVar3 = *(long *)("/System/Library/Frameworks/Foundation.framework/Versions/C/Foundation" +
                       unaff_x19 + 0x20);
      goto joined_r0x00751a9c;
    }
    if (uVar8 - 1 < 5) {
      lVar3 = *(long *)("/System/Library/Frameworks/Foundation.framework/Versions/C/Foundation" +
                       unaff_x19 + 0x20);
      goto joined_r0x00751a9c;
    }
    if (*(long *)("/System/Library/Frameworks/Foundation.framework/Versions/C/Foundation" +
                 unaff_x19 + 0x20) == 0) goto LAB_00751ab8;
LAB_00751a2c:
    lVar3 = func_0x00764704("%s?%s");
    if (lVar3 == 0) {
      return 0x1b;
    }
  }
  else {
    lVar3 = *(long *)("/System/Library/Frameworks/Foundation.framework/Versions/C/Foundation" +
                     unaff_x19 + 0x20);
joined_r0x00751a9c:
    if (lVar3 != 0) goto LAB_00751a2c;
LAB_00751ab8:
    lVar3 = 0;
  }
  uVar4 = func_0x00752f88();
  (*(code *)*unaff_x27)(lVar3);
  if ((int)uVar4 == 0) {
    (*(code *)*unaff_x27)(*(undefined8 *)("/usr/lib/libobjc.A.dylib" + unaff_x19 + 8));
    pcVar7 = "/usr/lib/libobjc.A.dylib" + unaff_x19 + 8;
    pcVar7[0] = '\0';
    pcVar7[1] = '\0';
    pcVar7[2] = '\0';
    pcVar7[3] = '\0';
    pcVar7[4] = '\0';
    pcVar7[5] = '\0';
    pcVar7[6] = '\0';
    pcVar7[7] = '\0';
    if ((*(long *)("/System/Library/Frameworks/Foundation.framework/Versions/C/Foundation" +
                  unaff_x19 + 0x30) != 0) && (lVar3 = func_0x00782efc(), lVar3 == 0)) {
      lVar3 = func_0x00764704("Referer: %s\r\n");
      *(long *)("/usr/lib/libobjc.A.dylib" + unaff_x19 + 8) = lVar3;
      if (lVar3 == 0) {
        return 0x1b;
      }
    }
    lVar3 = func_0x00782efc();
    if ((lVar3 == 0) && (*(long *)(unaff_x19 + 0x7e8) != 0)) {
      (*(code *)*unaff_x27)
                (*(undefined8 *)((long)&dylib_command_000012d0.dylib.name.offset + unaff_x19));
      *(undefined8 *)((long)&dylib_command_000012d0.dylib.name.offset + unaff_x19) = 0;
      lVar3 = func_0x00764704("Accept-Encoding: %s\r\n");
      *(long *)((long)&dylib_command_000012d0.dylib.name.offset + unaff_x19) = lVar3;
      if (lVar3 == 0) {
        return 0x1b;
      }
    }
    else {
      (*(code *)*unaff_x27)
                (*(undefined8 *)((long)&dylib_command_000012d0.dylib.name.offset + unaff_x19));
      *(undefined8 *)((long)&dylib_command_000012d0.dylib.name.offset + unaff_x19) = 0;
    }
    lVar3 = func_0x00782efc();
    if ((lVar3 == 0) && ((*(byte *)(unaff_x19 + 0xa1d) >> 1 & 1) != 0)) {
      lVar3 = func_0x00782efc();
      (*(code *)*unaff_x27)
                (*(undefined8 *)((long)&linkedit_data_command_00001308.dataoff + unaff_x19));
      *(undefined8 *)((long)&linkedit_data_command_00001308.dataoff + unaff_x19) = 0;
      if (lVar3 == 0) {
        lVar3 = 0;
      }
      else {
        lVar3 = func_0x007529d0(lVar3);
        if (lVar3 == 0) {
          return 0x1b;
        }
      }
      uVar4 = func_0x00764704("Connection: %s%sTE\r\nTE: gzip\r\n");
      *(undefined8 *)((long)&linkedit_data_command_00001308.dataoff + unaff_x19) = uVar4;
      (*(code *)*unaff_x27)(lVar3);
      if (*(long *)((long)&linkedit_data_command_00001308.dataoff + unaff_x19) == 0) {
        return 0x1b;
      }
    }
    uVar8 = func_0x00754078();
    if (uVar8 == 0xb) {
      pcVar7 = "1.1";
    }
    else if (uVar8 == 0x1e) {
      pcVar7 = "3";
    }
    else if (uVar8 == 0x14) {
      pcVar7 = "2";
    }
    else {
      pcVar7 = "1.0";
    }
    *(char **)(unaff_x29 + -0x88) = pcVar7;
    uVar4 = func_0x007540fc();
    if ((int)uVar4 == 0) {
      *(long *)(unaff_x29 + -0x90) = unaff_x19 + 0x1c1;
      func_0x00782efc();
      uVar4 = func_0x007544dc();
      if ((int)uVar4 != 0) {
        return uVar4;
      }
      func_0x0074066c(unaff_x29 + -0x80,0x100000);
      func_0x007406b0(unaff_x19 + 0xc10);
      uVar4 = func_0x00740a18(unaff_x29 + -0x80,"%s ");
      if (((int)uVar4 == 0) && (uVar4 = func_0x0075465c(), (int)uVar4 == 0)) {
        if ((*(char *)(unaff_x20 + 0x398) < '\0') && (lVar3 = func_0x00782efc(), lVar3 == 0)) {
          lVar3 = func_0x00764704("Alt-Used: %s:%d\r\n");
          if (lVar3 == 0) {
            func_0x00740678(unaff_x29 + -0x80);
            return 0x1b;
          }
        }
        else {
          lVar3 = 0;
        }
        if (((*(ulong *)(unaff_x20 + 0x398) & 9) == 1) && (lVar5 = func_0x00782efc(), lVar5 == 0)) {
          func_0x00752938();
        }
        uVar4 = func_0x00740a18(unaff_x29 + -0x80," HTTP/%s\r\n%s%s%s%s%s%s%s%s%s%s%s%s");
        (*(code *)*unaff_x27)
                  (*(undefined8 *)((long)&dylib_command_000012d0.dylib.current_version + unaff_x19))
        ;
        *(undefined8 *)((long)&dylib_command_000012d0.dylib.current_version + unaff_x19) = 0;
        (*(code *)*unaff_x27)
                  (*(undefined8 *)((long)&linkedit_data_command_00001328.cmd + unaff_x19));
        *(undefined8 *)((long)&linkedit_data_command_00001328.cmd + unaff_x19) = 0;
        (*(code *)*unaff_x27)(lVar3);
        if ((int)uVar4 == 0) {
          uVar6 = func_0x007315f4();
          if (((uVar8 < 0x14) && ((uVar6 & 1) == 0)) && ((&UNK_00001340)[unaff_x19] == '\x03')) {
            func_0x00740678(unaff_x29 + -0x80);
            return 1;
          }
          uVar4 = func_0x007548a4();
          if (((((int)uVar4 == 0) &&
               ((*(uint *)(*(long *)(unaff_x20 + 0x3a0) + 0x94) >> 0x1e == 0 ||
                (uVar4 = func_0x0078bbf0(), (int)uVar4 == 0)))) &&
              (uVar4 = func_0x00753e4c(), (int)uVar4 == 0)) &&
             ((uVar4 = func_0x007538a4(), (int)uVar4 == 0 &&
              (uVar4 = func_0x00754c00(), (int)uVar4 == 0)))) {
            uVar4 = func_0x00771554();
            func_0x00740678(unaff_x29 + -0x80);
            if ((0x13 < uVar8) && ((int)uVar4 == 0)) {
              if ((**(uint **)(unaff_x29 + -0x90) >> 0xf & 1) == 0) {
                return 0;
              }
              **(uint **)(unaff_x29 + -0x90) = **(uint **)(unaff_x29 + -0x90) & 0xffff7fff;
              return 0;
            }
            goto LAB_0075178c;
          }
        }
      }
      func_0x00740678(unaff_x29 + -0x80);
    }
  }
LAB_0075178c:
  if ((int)uVar4 == 100) {
    func_0x0073c9e4();
  }
  return uVar4;
}

