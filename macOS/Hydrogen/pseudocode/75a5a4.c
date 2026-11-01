
undefined8 thunk_FUN_0075a5bc(void)

{
  int iVar1;
  byte bVar2;
  int iVar3;
  long lVar4;
  undefined8 uVar5;
  long lVar6;
  char *pcVar7;
  long lVar8;
  char *pcVar9;
  undefined8 uVar10;
  char cVar11;
  int in_w8;
  uint uVar12;
  byte *pbVar14;
  byte *pbVar13;
  long *unaff_x19;
  long unaff_x20;
  int unaff_w23;
  long *plVar15;
  long unaff_x26;
  long lVar16;
  long lVar17;
  char *pcStack0000000000000000;
  char *pcStack0000000000000010;
  undefined8 uStack0000000000000038;
  
  pcStack0000000000000000 = "";
  if (in_w8 != 0) {
    pcStack0000000000000000 = "[";
  }
  pcStack0000000000000010 = "";
  if (in_w8 != 0) {
    pcStack0000000000000010 = "]";
  }
  lVar4 = func_0x00764704("%s%s%s:%d");
  if (lVar4 == 0) {
    uVar5 = 0x1b;
  }
  else {
    uVar5 = _strlen(lVar4);
    pcStack0000000000000000 = (char *)0x0;
    uVar5 = func_0x00756954(&uStack0000000000000038,"CONNECT",7,0,0,lVar4,uVar5,0);
    if (((((int)uVar5 == 0) && (uVar5 = func_0x00752f88(), (int)uVar5 == 0)) &&
        ((unaff_w23 != 1 ||
         ((lVar6 = func_0x00752938(), lVar6 != 0 ||
          (uVar5 = func_0x00740e84(uStack0000000000000038 + 0x30,"Host",lVar4), (int)uVar5 == 0)))))
        ) && (((*(long *)((long)&linkedit_data_command_00001328.cmd + unaff_x20) == 0 ||
               (uVar5 = func_0x00741120(uStack0000000000000038 + 0x30), (int)uVar5 == 0)) &&
              (((((lVar6 = func_0x00752938(), lVar6 != 0 ||
                  (*(char **)(unaff_x20 + 0x838) == (char *)0x0)) ||
                 (**(char **)(unaff_x20 + 0x838) == '\0')) ||
                (uVar5 = func_0x00740e84(uStack0000000000000038 + 0x30,"User-Agent"),
                (int)uVar5 == 0)) &&
               (((unaff_w23 != 1 || (lVar6 = func_0x00752938(), lVar6 != 0)) ||
                (uVar5 = func_0x00740e84(uStack0000000000000038 + 0x30,"Proxy-Connection",
                                         "Keep-Alive"), (int)uVar5 == 0)))))))) {
      lVar6 = 0x328;
      if ((*(byte *)(unaff_x20 + 0xa1a) & 0x40) != 0) {
        lVar6 = 0x680;
      }
      plVar15 = *(long **)(unaff_x20 + lVar6);
      if (plVar15 == (long *)0x0) {
        uVar5 = 0;
      }
      else {
        lVar6 = uStack0000000000000038 + 0x30;
        iVar1 = *(int *)(unaff_x26 + 8);
        do {
          lVar17 = *plVar15;
          pcVar7 = (char *)_strchr(lVar17,0x3a);
          if ((byte *)pcVar7 == (byte *)0x0) {
            lVar8 = _strchr(lVar17,0x3b);
            if (lVar8 != 0) {
              lVar16 = lVar8 - lVar17;
              pbVar14 = (byte *)(lVar8 + 1);
              do {
                do {
                  do {
                    pbVar13 = pbVar14 + 1;
                    bVar2 = *pbVar14;
                    pbVar14 = pbVar13;
                  } while (bVar2 == 9);
                } while (bVar2 == 0x20);
                uVar12 = (uint)bVar2;
                if (uVar12 == 0) goto code_r0x0075a834;
              } while (uVar12 - 10 < 4);
              if (uVar12 == 0) {
code_r0x0075a834:
                uVar5 = 0;
                pcVar7 = "";
                goto joined_r0x0075a7ec;
              }
            }
          }
          else {
            lVar16 = (long)pcVar7 - lVar17;
            do {
              do {
                do {
                  pcVar7 = pcVar7 + 1;
                  bVar2 = *pcVar7;
                } while (bVar2 == 9);
              } while (bVar2 == 0x20);
              uVar12 = (uint)bVar2;
              if (uVar12 == 0) goto code_r0x0075a784;
            } while (uVar12 - 10 < 4);
            if (uVar12 != 0) {
              uVar5 = _strlen(pcVar7);
joined_r0x0075a7ec:
              if ((lVar16 == 5) && (*(long *)("/usr/lib/libobjc.A.dylib" + unaff_x20 + 0x10) != 0))
              {
                pcVar9 = "Host:";
                uVar10 = 5;
code_r0x0075a914:
                iVar3 = func_0x0077e76c(lVar17,pcVar9,uVar10);
                if (iVar3 != 0) goto code_r0x0075a784;
              }
              else {
                cVar11 = (&UNK_00001342)[unaff_x20];
                if (cVar11 == '\x02') {
                  if (lVar16 == 0xd) {
                    iVar3 = func_0x0077e76c(lVar17,"Content-Type:",0xd);
                    if (iVar3 != 0) goto code_r0x0075a784;
                    cVar11 = (&UNK_00001342)[unaff_x20];
                    goto code_r0x0075a880;
                  }
                }
                else {
code_r0x0075a880:
                  if ((lVar16 == 0xd) && (cVar11 == '\x03')) {
                    pcVar9 = "Content-Type:";
                    uVar10 = 0xd;
                    goto code_r0x0075a914;
                  }
                }
                if ((lVar16 == 0xf) && ((*(uint *)(unaff_x20 + 0x1c1) >> 0x12 & 1) != 0)) {
                  pcVar9 = "Content-Length:";
                  uVar10 = 0xf;
                  goto code_r0x0075a914;
                }
                if ((lVar16 == 0xb) &&
                   (*(long *)((long)&linkedit_data_command_00001308.dataoff + unaff_x20) != 0)) {
                  pcVar9 = "Connection:";
                  uVar10 = 0xb;
                  goto code_r0x0075a914;
                }
                if ((0x13 < iVar1) && (lVar16 == 0x12)) {
                  pcVar9 = "Transfer-Encoding:";
                  uVar10 = 0x12;
                  goto code_r0x0075a914;
                }
                if (lVar16 == 7) {
                  pcVar9 = "Cookie:";
                  uVar10 = 7;
code_r0x0075a970:
                  iVar3 = func_0x0077e76c(lVar17,pcVar9,uVar10);
                  if ((iVar3 != 0) && (iVar3 = func_0x0079080c(), iVar3 == 0))
                  goto code_r0x0075a784;
                }
                else if (lVar16 == 0xe) {
                  pcVar9 = "Authorization:";
                  uVar10 = 0xe;
                  goto code_r0x0075a970;
                }
              }
              uVar5 = func_0x00740cf0(lVar6,lVar17,lVar16,pcVar7,uVar5);
              if ((int)uVar5 != 0) goto LAB_0075a71c;
            }
          }
code_r0x0075a784:
          uVar5 = 0;
          plVar15 = (long *)plVar15[1];
        } while (plVar15 != (long *)0x0);
      }
      goto code_r0x0075a72c;
    }
  }
LAB_0075a71c:
  if (uStack0000000000000038 != 0) {
    func_0x00756ab4();
    uStack0000000000000038 = 0;
  }
code_r0x0075a72c:
  (*pcRam0000000000a2b5f0)(lVar4);
  *unaff_x19 = uStack0000000000000038;
  return uVar5;
}

