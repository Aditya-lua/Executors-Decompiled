
undefined8 FUN_0075a944(void)

{
  byte bVar1;
  int iVar2;
  byte *pbVar3;
  long lVar4;
  char *pcVar5;
  undefined8 uVar6;
  char cVar7;
  uint uVar8;
  byte *pbVar9;
  long *unaff_x19;
  long unaff_x20;
  long *unaff_x23;
  long unaff_x24;
  long unaff_x27;
  long unaff_x28;
  undefined8 in_stack_00000028;
  uint *in_stack_00000030;
  long in_stack_00000038;
  
code_r0x0075a944:
  if (unaff_x27 != 0xe) goto code_r0x0075a91c;
  pcVar5 = "Authorization:";
  uVar6 = 0xe;
code_r0x0075a970:
  iVar2 = func_0x0077e76c(unaff_x28,pcVar5,uVar6);
  if ((iVar2 != 0) && (iVar2 = func_0x0079080c(), iVar2 == 0)) goto LAB_0075a784;
code_r0x0075a91c:
  do {
    uVar6 = func_0x00740cf0();
    if ((int)uVar6 != 0) {
      if (in_stack_00000038 != 0) {
        func_0x00756ab4();
        in_stack_00000038 = 0;
      }
LAB_0075a72c:
      (*pcRam0000000000a2b5f0)();
      *unaff_x19 = in_stack_00000038;
      return uVar6;
    }
LAB_0075a784:
    do {
      uVar6 = 0;
      unaff_x23 = (long *)unaff_x23[1];
      if (unaff_x23 == (long *)0x0) goto LAB_0075a72c;
      unaff_x28 = *unaff_x23;
      pbVar3 = (byte *)_strchr(unaff_x28,0x3a);
      if (pbVar3 == (byte *)0x0) {
        lVar4 = _strchr(unaff_x28,0x3b);
        if (lVar4 == 0) goto LAB_0075a784;
        unaff_x27 = lVar4 - unaff_x28;
        pbVar3 = (byte *)(lVar4 + 1);
        do {
          do {
            do {
              pbVar9 = pbVar3 + 1;
              bVar1 = *pbVar3;
              pbVar3 = pbVar9;
            } while (bVar1 == 9);
          } while (bVar1 == 0x20);
          uVar8 = (uint)bVar1;
          if (uVar8 == 0) goto LAB_0075a834;
        } while (uVar8 - 10 < 4);
        if (uVar8 != 0) goto LAB_0075a784;
LAB_0075a834:
        if (unaff_x27 != 5) goto LAB_0075a864;
LAB_0075a848:
        if (*(long *)("/usr/lib/libobjc.A.dylib" + unaff_x20 + 0x10) == 0) goto LAB_0075a864;
        pcVar5 = "Host:";
        uVar6 = 5;
      }
      else {
        unaff_x27 = (long)pbVar3 - unaff_x28;
        do {
          do {
            do {
              pbVar3 = pbVar3 + 1;
              bVar1 = *pbVar3;
            } while (bVar1 == 9);
          } while (bVar1 == 0x20);
          uVar8 = (uint)bVar1;
          if (uVar8 == 0) goto LAB_0075a784;
        } while (uVar8 - 10 < 4);
        if (uVar8 == 0) goto LAB_0075a784;
        _strlen(pbVar3);
        if (unaff_x27 == 5) goto LAB_0075a848;
LAB_0075a864:
        cVar7 = *(char *)(unaff_x24 + 0x928);
        if (cVar7 == '\x02') {
          if (unaff_x27 == 0xd) {
            iVar2 = func_0x0077e76c(unaff_x28,"Content-Type:",0xd);
            if (iVar2 == 0) {
              cVar7 = *(char *)(unaff_x24 + 0x928);
              goto LAB_0075a880;
            }
            goto LAB_0075a784;
          }
        }
        else {
LAB_0075a880:
          if ((unaff_x27 == 0xd) && (cVar7 == '\x03')) {
            pcVar5 = "Content-Type:";
            uVar6 = 0xd;
            goto LAB_0075a914;
          }
        }
        if ((unaff_x27 == 0xf) && ((*in_stack_00000030 >> 0x12 & 1) != 0)) {
          pcVar5 = "Content-Length:";
          uVar6 = 0xf;
        }
        else if ((unaff_x27 == 0xb) &&
                (*(long *)((long)&linkedit_data_command_00001308.dataoff + unaff_x20) != 0)) {
          pcVar5 = "Connection:";
          uVar6 = 0xb;
        }
        else {
          if ((in_stack_00000028._4_4_ < 0x14) || (unaff_x27 != 0x12)) {
            if (unaff_x27 != 7) goto code_r0x0075a944;
            pcVar5 = "Cookie:";
            uVar6 = 7;
            goto code_r0x0075a970;
          }
          pcVar5 = "Transfer-Encoding:";
          uVar6 = 0x12;
        }
      }
LAB_0075a914:
      iVar2 = func_0x0077e76c(unaff_x28,pcVar5,uVar6);
    } while (iVar2 != 0);
  } while( true );
}

