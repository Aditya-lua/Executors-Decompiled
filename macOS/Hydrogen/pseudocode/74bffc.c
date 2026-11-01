
/* WARNING: Type propagation algorithm not settling */

ulong FUN_0074bffc(long param_1)

{
  byte bVar1;
  int iVar2;
  uint uVar3;
  int iVar4;
  long lVar5;
  long lVar6;
  undefined4 uVar7;
  long lVar8;
  byte *pbVar9;
  undefined8 uVar10;
  byte *pbVar11;
  ulong unaff_x19;
  long unaff_x21;
  int *unaff_x22;
  ulong unaff_x23;
  long unaff_x25;
  long lVar12;
  undefined8 unaff_d8;
  undefined8 unaff_d9;
  undefined8 unaff_d10;
  undefined8 unaff_d11;
  undefined8 unaff_d12;
  undefined8 unaff_d13;
  undefined8 unaff_d14;
  undefined8 uVar13;
  undefined8 in_stack_00000000;
  undefined8 uStack0000000000000008;
  undefined8 uStack0000000000000010;
  undefined1 uStack000000000000001f;
  
  uVar13 = *(undefined8 *)(param_1 + 0x260);
  do {
    uStack000000000000001f = *(byte *)(unaff_x21 + unaff_x23);
    lVar12 = *(long *)(unaff_x22 + 4);
    if (lVar12 == 0) {
      lVar12 = func_0x007434dc();
      *(long *)(unaff_x22 + 4) = lVar12;
      if (lVar12 != 0) {
        unaff_x22[8] = 0;
        unaff_x22[9] = 0;
        unaff_x22[6] = 0;
        func_0x0074066c(lVar12 + 0xa0,&UNK_00002710);
        lVar12 = *(long *)(unaff_x22 + 4);
        goto LAB_0074c054;
      }
LAB_0074cc18:
      unaff_x22[3] = 0x1b;
      goto code_r0x0074bf30;
    }
LAB_0074c054:
    lVar8 = lVar12 + 0xa0;
    iVar2 = func_0x0074075c(lVar8,&uStack000000000000001f,1);
    if (iVar2 != 0) goto LAB_0074cc18;
    lVar5 = func_0x00156654(lVar8);
    lVar6 = func_0x00740a58(lVar8);
    iVar2 = (int)unaff_x25;
    if (*unaff_x22 == 2) {
      switch(unaff_x22[1]) {
      case 0:
        uVar3 = unaff_x22[6] + 1;
        unaff_x22[6] = uVar3;
        if (uVar3 < 9) {
          if (((ulong)uStack000000000000001f < 0x40) &&
             ((unaff_x25 << ((ulong)uStack000000000000001f & 0x3f) & 0x3ff200000000001U) != 0))
          goto LAB_0074cbf4;
        }
        else if ((uVar3 == 9) && (uStack000000000000001f == 0x20)) {
          *(undefined8 *)(unaff_x22 + 1) = unaff_d8;
          goto joined_r0x0074cc10;
        }
        goto LAB_0074cc2c;
      case 1:
        iVar4 = unaff_x22[6];
        unaff_x22[6] = iVar4 + 1U;
        if (unaff_x22[2] == 1) {
          if (uStack000000000000001f != 0x20) {
            lVar12 = _memchr("APM0123456789:",(long)(char)uStack000000000000001f,0xf);
            goto joined_r0x0074c5ec;
          }
          *(long *)(unaff_x22 + 0x10) = *(long *)(unaff_x22 + 8);
          *(undefined1 *)(*(long *)(unaff_x22 + 8) + (ulong)(iVar4 + 1U) + lVar6 + -1) = 0;
          *(undefined8 *)(unaff_x22 + 1) = unaff_d9;
          unaff_x22[6] = 0;
          goto joined_r0x0074cc10;
        }
        if (((unaff_x22[2] != 0) || (uStack000000000000001f == 9)) ||
           (uStack000000000000001f == 0x20)) goto LAB_0074cbf4;
        unaff_x22[2] = iVar2;
        break;
      case 2:
        iVar4 = unaff_x22[2];
        if (iVar4 != 1) goto code_r0x0074c554;
        iVar4 = unaff_x22[6];
        unaff_x22[6] = iVar4 + 1U;
        if (uStack000000000000001f == 0x20) {
          *(undefined1 *)(*(long *)(unaff_x22 + 8) + (ulong)(iVar4 + 1U) + lVar6 + -1) = 0;
          lVar8 = *(long *)(unaff_x22 + 8);
          iVar4 = _strcmp("<DIR>",lVar6 + lVar8);
          if (iVar4 == 0) {
            *(int *)(lVar12 + 8) = iVar2;
            *(undefined8 *)(lVar12 + 0x28) = 0;
            lVar12 = *(long *)(unaff_x22 + 4);
          }
          else {
            iVar2 = func_0x0077ed9c(lVar6 + lVar8,&uStack0000000000000010,10,lVar12 + 0x28);
            if (iVar2 != 0) goto LAB_0074cc2c;
            lVar12 = *(long *)(unaff_x22 + 4);
            *(undefined4 *)(lVar12 + 8) = 0;
          }
          *(uint *)(lVar12 + 0x60) = *(uint *)(lVar12 + 0x60) | 0x40;
          unaff_x22[6] = 0;
          *(undefined8 *)(unaff_x22 + 1) = unaff_d10;
          break;
        }
        goto LAB_0074cbf4;
      case 3:
        iVar4 = unaff_x22[2];
        if (iVar4 == 2) {
          if (uStack000000000000001f != 10) goto LAB_0074cc2c;
          *(undefined8 *)(unaff_x22 + 10) = *(undefined8 *)(unaff_x22 + 8);
        }
        else {
          if (iVar4 != 1) goto code_r0x0074c554;
          unaff_x22[6] = unaff_x22[6] + 1;
          if (uStack000000000000001f != 10) {
            if (uStack000000000000001f == 0xd) {
              unaff_x22[2] = 2;
              *(undefined1 *)(lVar5 + lVar6 + -1) = 0;
              goto joined_r0x0074cc10;
            }
            goto LAB_0074cbf4;
          }
          *(undefined8 *)(unaff_x22 + 10) = *(undefined8 *)(unaff_x22 + 8);
          *(undefined1 *)(lVar5 + lVar6 + -1) = 0;
        }
        func_0x0074cdcc();
        unaff_x22[1] = 0;
        unaff_x22[2] = 0;
        break;
      default:
        goto LAB_0074cbf4;
      }
      goto joined_r0x0074c854;
    }
    if (*unaff_x22 != 1) {
      unaff_x19 = unaff_x19 + 1;
      goto code_r0x0074bf30;
    }
    switch(unaff_x22[1]) {
    case 0:
      if (unaff_x22[2] == 1) {
        uVar3 = unaff_x22[6];
        unaff_x22[6] = uVar3 + 1;
        if (uStack000000000000001f == 10) {
          *(undefined1 *)(lVar6 + (ulong)uVar3) = 0;
          iVar4 = _strncmp("total ",lVar6,6);
          if (iVar4 == 0) {
            pbVar9 = (byte *)(lVar6 + 7);
            for (pbVar11 = (byte *)(lVar6 + 6); (bVar1 = *pbVar11, bVar1 == 9 || (bVar1 == 0x20));
                pbVar11 = pbVar11 + 1) {
              pbVar9 = pbVar9 + 1;
            }
            while (bVar1 - 0x30 < 10) {
              bVar1 = *pbVar9;
              pbVar9 = pbVar9 + 1;
            }
            if (bVar1 == 0) {
              unaff_x22[1] = iVar2;
              func_0x007406b0(lVar8);
              goto joined_r0x0074cc10;
            }
          }
          goto LAB_0074cc2c;
        }
        if (uStack000000000000001f == 0xd) {
          unaff_x22[6] = uVar3;
          func_0x00740a78(lVar8,lVar5 + -1);
          goto joined_r0x0074cc10;
        }
      }
      else if (unaff_x22[2] == 0) {
        if (uStack000000000000001f == 0x74) {
          unaff_x22[2] = iVar2;
          unaff_x22[6] = unaff_x22[6] + 1;
          goto joined_r0x0074cc10;
        }
        unaff_x22[1] = iVar2;
        func_0x007406b0(lVar8);
        goto joined_r0x0074cc10;
      }
      break;
    case 1:
      uVar7 = 0;
      switch(uStack000000000000001f) {
      case 0x2d:
        break;
      default:
        goto LAB_0074cc2c;
      case 0x44:
        uVar7 = 7;
        break;
      case 0x62:
        uVar7 = 3;
        break;
      case 99:
        uVar7 = 4;
        break;
      case 100:
        uVar7 = 1;
        break;
      case 0x6c:
        uVar7 = 2;
        break;
      case 0x70:
        uVar7 = 5;
        break;
      case 0x73:
        uVar7 = 6;
      }
      *(undefined4 *)(lVar12 + 8) = uVar7;
      unaff_x22[1] = 2;
      unaff_x22[6] = 0;
      *(long *)(unaff_x22 + 8) = unaff_x25;
      unaff_x23 = unaff_x23 + 1;
      goto joined_r0x0074cc10;
    case 2:
      uVar3 = unaff_x22[6] + 1;
      unaff_x22[6] = uVar3;
      if (uVar3 < 10) {
        lVar12 = _memchr("rwx-tTsS",(long)(char)uStack000000000000001f,9);
joined_r0x0074c5ec:
        if (lVar12 == 0) goto LAB_0074cc2c;
      }
      else if (uVar3 == 10) {
        if (uStack000000000000001f == 0x20) {
          *(undefined1 *)(lVar6 + 10) = 0;
          lVar12 = *(long *)(unaff_x22 + 8);
          uVar3 = func_0x0074cc38(lVar6 + lVar12);
          if ((uVar3 & 0xff000000) == 0) {
            lVar8 = *(long *)(unaff_x22 + 4);
            *(uint *)(lVar8 + 0x60) = *(uint *)(lVar8 + 0x60) | 8;
            *(uint *)(lVar8 + 0x18) = uVar3;
            *(long *)(unaff_x22 + 0x12) = lVar12;
            unaff_x22[6] = 0;
            *(undefined8 *)(unaff_x22 + 1) = unaff_d10;
            goto joined_r0x0074cc10;
          }
        }
        goto LAB_0074cc2c;
      }
      break;
    case 3:
      iVar2 = unaff_x22[2];
      if (iVar2 == 1) {
        iVar2 = unaff_x22[6];
        unaff_x22[6] = iVar2 + 1U;
        if (uStack000000000000001f == 0x20) {
          *(undefined1 *)(*(long *)(unaff_x22 + 8) + (ulong)(iVar2 + 1U) + lVar6 + -1) = 0;
          lVar12 = _strtol(lVar6 + *(long *)(unaff_x22 + 8),&uStack0000000000000010,10);
          if ((*uStack0000000000000010 == '\0') && (1 < lVar12 + 0x8000000000000001U)) {
            lVar8 = *(long *)(unaff_x22 + 4);
            *(uint *)(lVar8 + 0x60) = *(uint *)(lVar8 + 0x60) | 0x80;
            *(long *)(lVar8 + 0x30) = lVar12;
          }
          unaff_x22[6] = 0;
          unaff_x22[8] = 0;
          unaff_x22[9] = 0;
          *(undefined8 *)(unaff_x22 + 1) = unaff_d11;
          goto joined_r0x0074ca80;
        }
code_r0x0074c6c8:
        if (9 < uStack000000000000001f - 0x30) goto LAB_0074cc2c;
      }
      else {
code_r0x0074c480:
        if ((iVar2 == 0) && (uStack000000000000001f != 0x20)) {
          if (uStack000000000000001f - 0x30 < 10) goto code_r0x0074c564;
          goto LAB_0074cc2c;
        }
      }
      break;
    case 4:
      iVar4 = unaff_x22[2];
      if (iVar4 == 1) {
        iVar2 = unaff_x22[6];
        unaff_x22[6] = iVar2 + 1U;
        if (uStack000000000000001f == 0x20) {
          *(undefined1 *)(*(long *)(unaff_x22 + 8) + (ulong)(iVar2 + 1U) + lVar6 + -1) = 0;
          *(undefined8 *)(unaff_x22 + 0xc) = *(undefined8 *)(unaff_x22 + 8);
          *(undefined8 *)(unaff_x22 + 1) = unaff_d12;
          unaff_x22[8] = 0;
          unaff_x22[9] = 0;
          unaff_x22[6] = 0;
          goto joined_r0x0074ca80;
        }
      }
      else {
code_r0x0074c554:
        if (iVar4 == 0) goto code_r0x0074c558;
      }
      break;
    case 5:
      iVar4 = unaff_x22[2];
      if (iVar4 != 1) goto code_r0x0074c554;
      iVar2 = unaff_x22[6];
      unaff_x22[6] = iVar2 + 1U;
      if (uStack000000000000001f == 0x20) {
        *(undefined1 *)(*(long *)(unaff_x22 + 8) + (ulong)(iVar2 + 1U) + lVar6 + -1) = 0;
        *(undefined8 *)(unaff_x22 + 0xe) = *(undefined8 *)(unaff_x22 + 8);
        *(undefined8 *)(unaff_x22 + 1) = unaff_d13;
        unaff_x22[8] = 0;
        unaff_x22[9] = 0;
        unaff_x22[6] = 0;
        goto joined_r0x0074cc10;
      }
      break;
    case 6:
      iVar2 = unaff_x22[2];
      if (iVar2 != 1) goto code_r0x0074c480;
      iVar2 = unaff_x22[6];
      unaff_x22[6] = iVar2 + 1U;
      if (uStack000000000000001f != 0x20) goto code_r0x0074c6c8;
      *(undefined1 *)(*(long *)(unaff_x22 + 8) + (ulong)(iVar2 + 1U) + lVar6 + -1) = 0;
      iVar2 = func_0x0077ed9c(lVar6 + *(long *)(unaff_x22 + 8),&uStack0000000000000010,10,
                              &uStack0000000000000008);
      if (iVar2 == 0) {
        if ((*uStack0000000000000010 == '\0') && (1 < uStack0000000000000008 + 0x8000000000000001U))
        {
          lVar12 = *(long *)(unaff_x22 + 4);
          *(uint *)(lVar12 + 0x60) = *(uint *)(lVar12 + 0x60) | 0x40;
          *(long *)(lVar12 + 0x28) = uStack0000000000000008;
        }
        unaff_x22[6] = 0;
        unaff_x22[8] = 0;
        unaff_x22[9] = 0;
        *(undefined8 *)(unaff_x22 + 1) = unaff_d14;
        goto joined_r0x0074cc10;
      }
      break;
    case 7:
      switch(unaff_x22[2]) {
      case 0:
        if (uStack000000000000001f != 0x20) {
          if ((9 < uStack000000000000001f - 0x30) &&
             (0x19 < (uStack000000000000001f & 0xffffffdf) - 0x41)) goto LAB_0074cc2c;
          goto code_r0x0074c564;
        }
        break;
      case 1:
        unaff_x22[6] = unaff_x22[6] + 1;
        if (uStack000000000000001f == 0x20) {
code_r0x0074c778:
          unaff_x22[2] = 2;
          goto joined_r0x0074c854;
        }
        goto code_r0x0074c7e0;
      case 2:
        unaff_x22[6] = unaff_x22[6] + 1;
        if (uStack000000000000001f != 0x20) {
          if ((uStack000000000000001f - 0x30 < 10) ||
             ((uStack000000000000001f & 0xffffffdf) - 0x41 < 0x1a)) goto code_r0x0074c970;
          goto LAB_0074cc2c;
        }
        break;
      case 3:
        unaff_x22[6] = unaff_x22[6] + 1;
        if (uStack000000000000001f == 0x20) {
code_r0x0074c9c4:
          unaff_x22[2] = 4;
          goto joined_r0x0074cc10;
        }
code_r0x0074c7e0:
        uVar3 = (uint)uStack000000000000001f;
        if ((((9 < uVar3 - 0x30) && (0x19 < uVar3 - 0x61)) && (uVar3 != 0x2e)) &&
           (uVar3 - 0x5b < 0xffffffe6)) goto LAB_0074cc2c;
        break;
      case 4:
        unaff_x22[6] = unaff_x22[6] + 1;
        if (uStack000000000000001f != 0x20) {
          if ((uStack000000000000001f - 0x30 < 10) ||
             ((uStack000000000000001f & 0xffffffdf) - 0x41 < 0x1a)) {
            unaff_x22[2] = 5;
            goto joined_r0x0074c854;
          }
          goto LAB_0074cc2c;
        }
        break;
      case 5:
        iVar2 = unaff_x22[6];
        unaff_x22[6] = iVar2 + 1U;
        if (uStack000000000000001f == 0x20) {
          *(undefined1 *)(*(long *)(unaff_x22 + 8) + (ulong)(iVar2 + 1U) + lVar6 + -1) = 0;
          *(undefined8 *)(unaff_x22 + 0x10) = *(undefined8 *)(unaff_x22 + 8);
          if (*(int *)(lVar12 + 8) == 2) {
            *(undefined8 *)(unaff_x22 + 1) = in_stack_00000000;
          }
          else {
            *(undefined8 *)(unaff_x22 + 1) = uVar13;
          }
          goto joined_r0x0074cc10;
        }
        if (((((byte)(uStack000000000000001f - 0x3a) < 0xf6) &&
             ((byte)((uStack000000000000001f & 0xdf) + 0xa5) < 0xe6)) &&
            (uStack000000000000001f != 0x2e)) && (uStack000000000000001f != 0x3a))
        goto LAB_0074cc2c;
      }
      break;
    case 8:
      iVar4 = unaff_x22[2];
      if (iVar4 == 2) {
        if (uStack000000000000001f == 10) {
          lVar12 = *(long *)(unaff_x22 + 8) + (ulong)(uint)unaff_x22[6];
code_r0x0074cb2c:
          *(undefined1 *)(lVar12 + lVar6 + -1) = 0;
          *(undefined8 *)(unaff_x22 + 10) = *(undefined8 *)(unaff_x22 + 8);
          unaff_x22[1] = iVar2;
          func_0x0074cdcc();
          goto joined_r0x0074c854;
        }
        goto LAB_0074cc2c;
      }
      if (iVar4 != 1) goto code_r0x0074c554;
      iVar4 = unaff_x22[6];
      unaff_x22[6] = iVar4 + 1U;
      if (uStack000000000000001f == 10) {
        lVar12 = *(long *)(unaff_x22 + 8) + (ulong)(iVar4 + 1U);
        goto code_r0x0074cb2c;
      }
      if (uStack000000000000001f == 0xd) goto code_r0x0074c778;
      break;
    case 9:
      switch(unaff_x22[2]) {
      case 0:
code_r0x0074c558:
        if (uStack000000000000001f != 0x20) {
code_r0x0074c564:
          *(long *)(unaff_x22 + 8) = lVar5 + -1;
          unaff_x22[6] = 1;
          unaff_x25 = 1;
          unaff_x22[2] = 1;
joined_r0x0074cc10:
          unaff_x23 = unaff_x23 + 1;
          goto joined_r0x0074cc10;
        }
        break;
      case 1:
        unaff_x22[6] = unaff_x22[6] + 1;
        if (uStack000000000000001f == 0x20) goto code_r0x0074c778;
        if ((uStack000000000000001f == 10) || (uStack000000000000001f == 0xd)) goto LAB_0074cc2c;
        break;
      case 2:
        unaff_x22[6] = unaff_x22[6] + 1;
        if (uStack000000000000001f == 0x2d) {
code_r0x0074c970:
          unaff_x22[2] = 3;
          goto joined_r0x0074c854;
        }
        if ((uStack000000000000001f != 10) && (uStack000000000000001f != 0xd)) {
          unaff_x22[2] = iVar2;
          goto joined_r0x0074cc10;
        }
        goto LAB_0074cc2c;
      case 3:
        unaff_x22[6] = unaff_x22[6] + 1;
        if (uStack000000000000001f == 0x3e) goto code_r0x0074c9c4;
        if ((uStack000000000000001f != 10) && (uStack000000000000001f != 0xd)) {
          unaff_x22[2] = iVar2;
          unaff_x23 = unaff_x23 + 1;
          goto joined_r0x0074cc10;
        }
        goto LAB_0074cc2c;
      case 4:
        iVar4 = unaff_x22[6];
        unaff_x22[6] = iVar4 + 1U;
        if (uStack000000000000001f == 0x20) {
          unaff_x22[2] = 5;
          *(undefined1 *)(*(long *)(unaff_x22 + 8) + (ulong)(iVar4 + 1U) + lVar6 + -4) = 0;
          uVar10 = *(undefined8 *)(unaff_x22 + 8);
          unaff_x22[6] = 0;
          unaff_x22[8] = 0;
          unaff_x22[9] = 0;
          *(undefined8 *)(unaff_x22 + 10) = uVar10;
        }
        else {
          if ((uStack000000000000001f == 10) || (uStack000000000000001f == 0xd)) goto LAB_0074cc2c;
          unaff_x22[2] = iVar2;
        }
        goto joined_r0x0074cc10;
      case 5:
        if ((uStack000000000000001f != 10) && (uStack000000000000001f != 0xd)) {
          unaff_x22[2] = 6;
          *(long *)(unaff_x22 + 8) = lVar5 + -1;
          unaff_x22[6] = iVar2;
joined_r0x0074ca80:
          unaff_x23 = unaff_x23 + 1;
          goto joined_r0x0074cc10;
        }
        goto LAB_0074cc2c;
      case 6:
        iVar4 = unaff_x22[6];
        unaff_x22[6] = iVar4 + 1U;
        if (uStack000000000000001f == 10) {
          lVar12 = *(long *)(unaff_x22 + 8) + (ulong)(iVar4 + 1U);
code_r0x0074cbd4:
          *(undefined1 *)(lVar12 + lVar6 + -1) = 0;
          *(undefined8 *)(unaff_x22 + 0x14) = *(undefined8 *)(unaff_x22 + 8);
          func_0x0074cdcc();
          unaff_x22[1] = iVar2;
        }
        else if (uStack000000000000001f == 0xd) {
          unaff_x22[2] = 7;
          goto joined_r0x0074ca80;
        }
        break;
      case 7:
        if (uStack000000000000001f == 10) {
          lVar12 = *(long *)(unaff_x22 + 8) + (ulong)(uint)unaff_x22[6];
          goto code_r0x0074cbd4;
        }
LAB_0074cc2c:
        unaff_x22[3] = 0x57;
code_r0x0074bf30:
        if (*(long *)(unaff_x22 + 4) == 0) {
          return unaff_x19;
        }
        func_0x007434f4();
        unaff_x22[4] = 0;
        unaff_x22[5] = 0;
        return unaff_x19;
      }
    }
LAB_0074cbf4:
joined_r0x0074c854:
    unaff_x23 = unaff_x23 + 1;
joined_r0x0074cc10:
    if (unaff_x19 <= unaff_x23) {
      return unaff_x19;
    }
  } while( true );
}

