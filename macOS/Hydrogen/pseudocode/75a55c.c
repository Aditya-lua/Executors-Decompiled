
undefined8 FUN_0075a55c(void)

{
  int iVar1;
  byte bVar2;
  int iVar3;
  undefined8 uVar4;
  long lVar5;
  char *pcVar6;
  long lVar7;
  char *pcVar8;
  undefined8 uVar9;
  char cVar10;
  uint in_w8;
  uint uVar11;
  byte *pbVar13;
  byte *pbVar12;
  long in_x9;
  long lVar14;
  int in_w10;
  long *unaff_x19;
  long unaff_x20;
  long unaff_x21;
  int unaff_w23;
  long *plVar15;
  long unaff_x26;
  long lVar16;
  long lVar17;
  undefined8 uStack0000000000000038;
  
  if (in_w10 == 1) {
    lVar14 = *(long *)(in_x9 + 0x68);
  }
  else if ((in_w8 >> 9 & 1) == 0) {
    lVar14 = *(long *)(in_x9 + 0x68);
  }
  else {
    lVar14 = *(long *)(in_x9 + 0x68);
  }
  if (unaff_x21 != lVar14) {
    _strchr();
  }
  lVar14 = func_0x00764704("%s%s%s:%d");
  if (lVar14 == 0) {
    uVar4 = 0x1b;
  }
  else {
    uVar4 = _strlen(lVar14);
    uVar4 = func_0x00756954(&uStack0000000000000038,"CONNECT",7,0,0,lVar14,uVar4,0);
    if (((((int)uVar4 == 0) && (uVar4 = func_0x00752f88(), (int)uVar4 == 0)) &&
        ((unaff_w23 != 1 ||
         ((lVar5 = func_0x00752938(), lVar5 != 0 ||
          (uVar4 = func_0x00740e84(uStack0000000000000038 + 0x30,"Host",lVar14), (int)uVar4 == 0))))
        )) && (((*(long *)((long)&linkedit_data_command_00001328.cmd + unaff_x20) == 0 ||
                (uVar4 = func_0x00741120(uStack0000000000000038 + 0x30), (int)uVar4 == 0)) &&
               (((((lVar5 = func_0x00752938(), lVar5 != 0 ||
                   (*(char **)(unaff_x20 + 0x838) == (char *)0x0)) ||
                  (**(char **)(unaff_x20 + 0x838) == '\0')) ||
                 (uVar4 = func_0x00740e84(uStack0000000000000038 + 0x30,"User-Agent"),
                 (int)uVar4 == 0)) &&
                (((unaff_w23 != 1 || (lVar5 = func_0x00752938(), lVar5 != 0)) ||
                 (uVar4 = func_0x00740e84(uStack0000000000000038 + 0x30,"Proxy-Connection",
                                          "Keep-Alive"), (int)uVar4 == 0)))))))) {
      lVar5 = 0x328;
      if ((*(byte *)(unaff_x20 + 0xa1a) & 0x40) != 0) {
        lVar5 = 0x680;
      }
      plVar15 = *(long **)(unaff_x20 + lVar5);
      if (plVar15 == (long *)0x0) {
        uVar4 = 0;
      }
      else {
        lVar5 = uStack0000000000000038 + 0x30;
        iVar1 = *(int *)(unaff_x26 + 8);
        do {
          lVar17 = *plVar15;
          pcVar6 = (char *)_strchr(lVar17,0x3a);
          if ((byte *)pcVar6 == (byte *)0x0) {
            lVar7 = _strchr(lVar17,0x3b);
            if (lVar7 != 0) {
              lVar16 = lVar7 - lVar17;
              pbVar13 = (byte *)(lVar7 + 1);
              do {
                do {
                  do {
                    pbVar12 = pbVar13 + 1;
                    bVar2 = *pbVar13;
                    pbVar13 = pbVar12;
                  } while (bVar2 == 9);
                } while (bVar2 == 0x20);
                uVar11 = (uint)bVar2;
                if (uVar11 == 0) goto code_r0x0075a834;
              } while (uVar11 - 10 < 4);
              if (uVar11 == 0) {
code_r0x0075a834:
                uVar4 = 0;
                pcVar6 = "";
                goto joined_r0x0075a7ec;
              }
            }
          }
          else {
            lVar16 = (long)pcVar6 - lVar17;
            do {
              do {
                do {
                  pcVar6 = pcVar6 + 1;
                  bVar2 = *pcVar6;
                } while (bVar2 == 9);
              } while (bVar2 == 0x20);
              uVar11 = (uint)bVar2;
              if (uVar11 == 0) goto code_r0x0075a784;
            } while (uVar11 - 10 < 4);
            if (uVar11 != 0) {
              uVar4 = _strlen(pcVar6);
joined_r0x0075a7ec:
              if ((lVar16 == 5) && (*(long *)("/usr/lib/libobjc.A.dylib" + unaff_x20 + 0x10) != 0))
              {
                pcVar8 = "Host:";
                uVar9 = 5;
code_r0x0075a914:
                iVar3 = func_0x0077e76c(lVar17,pcVar8,uVar9);
                if (iVar3 != 0) goto code_r0x0075a784;
              }
              else {
                cVar10 = (&UNK_00001342)[unaff_x20];
                if (cVar10 == '\x02') {
                  if (lVar16 == 0xd) {
                    iVar3 = func_0x0077e76c(lVar17,"Content-Type:",0xd);
                    if (iVar3 != 0) goto code_r0x0075a784;
                    cVar10 = (&UNK_00001342)[unaff_x20];
                    goto code_r0x0075a880;
                  }
                }
                else {
code_r0x0075a880:
                  if ((lVar16 == 0xd) && (cVar10 == '\x03')) {
                    pcVar8 = "Content-Type:";
                    uVar9 = 0xd;
                    goto code_r0x0075a914;
                  }
                }
                if ((lVar16 == 0xf) && ((*(uint *)(unaff_x20 + 0x1c1) >> 0x12 & 1) != 0)) {
                  pcVar8 = "Content-Length:";
                  uVar9 = 0xf;
                  goto code_r0x0075a914;
                }
                if ((lVar16 == 0xb) &&
                   (*(long *)((long)&linkedit_data_command_00001308.dataoff + unaff_x20) != 0)) {
                  pcVar8 = "Connection:";
                  uVar9 = 0xb;
                  goto code_r0x0075a914;
                }
                if ((0x13 < iVar1) && (lVar16 == 0x12)) {
                  pcVar8 = "Transfer-Encoding:";
                  uVar9 = 0x12;
                  goto code_r0x0075a914;
                }
                if (lVar16 == 7) {
                  pcVar8 = "Cookie:";
                  uVar9 = 7;
code_r0x0075a970:
                  iVar3 = func_0x0077e76c(lVar17,pcVar8,uVar9);
                  if ((iVar3 != 0) && (iVar3 = func_0x0079080c(), iVar3 == 0))
                  goto code_r0x0075a784;
                }
                else if (lVar16 == 0xe) {
                  pcVar8 = "Authorization:";
                  uVar9 = 0xe;
                  goto code_r0x0075a970;
                }
              }
              uVar4 = func_0x00740cf0(lVar5,lVar17,lVar16,pcVar6,uVar4);
              if ((int)uVar4 != 0) goto code_r0x0075a71c;
            }
          }
code_r0x0075a784:
          uVar4 = 0;
          plVar15 = (long *)plVar15[1];
        } while (plVar15 != (long *)0x0);
      }
      goto code_r0x0075a72c;
    }
  }
code_r0x0075a71c:
  if (uStack0000000000000038 != 0) {
    func_0x00756ab4();
    uStack0000000000000038 = 0;
  }
code_r0x0075a72c:
  (*pcRam0000000000a2b5f0)(lVar14);
  *unaff_x19 = uStack0000000000000038;
  return uVar4;
}

