
/* WARNING: Type propagation algorithm not settling */

ulong FUN_0074c14c(ulong param_1)

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
  ulong in_x9;
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
  undefined8 unaff_d15;
  undefined8 in_stack_00000000;
  undefined8 uStack0000000000000008;
  undefined8 uStack0000000000000010;
  undefined8 uStack0000000000000018;
  
code_r0x0074c14c:
  param_1 = param_1 & in_x9;
joined_r0x0074c150:
  if (param_1 == 0) {
LAB_0074cc2c:
    unaff_x22[3] = 0x57;
code_r0x0074bf30:
    if (*(long *)(unaff_x22 + 4) != 0) {
      func_0x007434f4();
      unaff_x22[4] = 0;
      unaff_x22[5] = 0;
    }
    return unaff_x19;
  }
LAB_0074cbf4:
  unaff_x23 = unaff_x23 + 1;
  if (unaff_x19 <= unaff_x23) {
    return unaff_x19;
  }
LAB_0074c020:
  uStack0000000000000018._7_1_ = *(byte *)(unaff_x21 + unaff_x23);
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
      goto code_r0x0074c054;
    }
code_r0x0074cc18:
    unaff_x22[3] = 0x1b;
    goto code_r0x0074bf30;
  }
code_r0x0074c054:
  lVar8 = lVar12 + 0xa0;
  iVar2 = func_0x0074075c(lVar8,(long)&uStack0000000000000018 + 7,1);
  if (iVar2 != 0) goto code_r0x0074cc18;
  lVar5 = func_0x00156654(lVar8);
  lVar6 = func_0x00740a58(lVar8);
  iVar2 = (int)unaff_x25;
  if (*unaff_x22 == 2) goto code_r0x0074c0f8;
  if (*unaff_x22 != 1) {
    unaff_x19 = unaff_x19 + 1;
    goto code_r0x0074bf30;
  }
  switch(unaff_x22[1]) {
  case 0:
    if (unaff_x22[2] == 1) {
      uVar3 = unaff_x22[6];
      unaff_x22[6] = uVar3 + 1;
      if (uStack0000000000000018._7_1_ == 10) {
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
      if (uStack0000000000000018._7_1_ == 0xd) {
        unaff_x22[6] = uVar3;
        func_0x00740a78(lVar8,lVar5 + -1);
        goto joined_r0x0074c980;
      }
      goto LAB_0074cbf4;
    }
    if (unaff_x22[2] != 0) goto LAB_0074cbf4;
    if (uStack0000000000000018._7_1_ != 0x74) {
      unaff_x22[1] = iVar2;
      func_0x007406b0(lVar8);
      goto joined_r0x0074c5bc;
    }
    unaff_x22[2] = iVar2;
    unaff_x22[6] = unaff_x22[6] + 1;
    goto joined_r0x0074cc10;
  case 1:
    uVar7 = 0;
    switch(uStack0000000000000018._7_1_) {
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
    goto joined_r0x0074cc10;
  case 2:
    uVar3 = unaff_x22[6] + 1;
    unaff_x22[6] = uVar3;
    if (9 < uVar3) {
      if (uVar3 == 10) {
        if (uStack0000000000000018._7_1_ == 0x20) {
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
      goto LAB_0074cbf4;
    }
    param_1 = _memchr("rwx-tTsS",(long)(char)uStack0000000000000018._7_1_,9);
    goto joined_r0x0074c150;
  case 3:
    iVar2 = unaff_x22[2];
    if (iVar2 != 1) {
code_r0x0074c480:
      if ((iVar2 == 0) && (uStack0000000000000018._7_1_ != 0x20)) {
        if (uStack0000000000000018._7_1_ - 0x30 < 10) {
code_r0x0074c564:
          *(long *)(unaff_x22 + 8) = lVar5 + -1;
          unaff_x22[6] = 1;
          unaff_x25 = 1;
          unaff_x22[2] = 1;
          break;
        }
        goto LAB_0074cc2c;
      }
      goto LAB_0074cbf4;
    }
    iVar2 = unaff_x22[6];
    unaff_x22[6] = iVar2 + 1U;
    if (uStack0000000000000018._7_1_ != 0x20) {
code_r0x0074c6c8:
      if (9 < uStack0000000000000018._7_1_ - 0x30) goto LAB_0074cc2c;
      goto LAB_0074cbf4;
    }
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
joined_r0x0074cc10:
    unaff_x23 = unaff_x23 + 1;
    goto joined_r0x0074c5bc;
  case 4:
    iVar4 = unaff_x22[2];
    if (iVar4 != 1) {
code_r0x0074c554:
      if (iVar4 == 0) {
code_r0x0074c558:
        if (uStack0000000000000018._7_1_ != 0x20) goto code_r0x0074c564;
      }
      goto LAB_0074cbf4;
    }
    iVar2 = unaff_x22[6];
    unaff_x22[6] = iVar2 + 1U;
    if (uStack0000000000000018._7_1_ != 0x20) goto LAB_0074cbf4;
    *(undefined1 *)(*(long *)(unaff_x22 + 8) + (ulong)(iVar2 + 1U) + lVar6 + -1) = 0;
    *(undefined8 *)(unaff_x22 + 0xc) = *(undefined8 *)(unaff_x22 + 8);
    *(undefined8 *)(unaff_x22 + 1) = unaff_d12;
    unaff_x22[8] = 0;
    unaff_x22[9] = 0;
    unaff_x22[6] = 0;
    break;
  case 5:
    iVar4 = unaff_x22[2];
    if (iVar4 != 1) goto code_r0x0074c554;
    iVar2 = unaff_x22[6];
    unaff_x22[6] = iVar2 + 1U;
    if (uStack0000000000000018._7_1_ != 0x20) goto LAB_0074cbf4;
    *(undefined1 *)(*(long *)(unaff_x22 + 8) + (ulong)(iVar2 + 1U) + lVar6 + -1) = 0;
    *(undefined8 *)(unaff_x22 + 0xe) = *(undefined8 *)(unaff_x22 + 8);
    *(undefined8 *)(unaff_x22 + 1) = unaff_d13;
    unaff_x22[8] = 0;
    unaff_x22[9] = 0;
    unaff_x22[6] = 0;
    break;
  case 6:
    iVar2 = unaff_x22[2];
    if (iVar2 != 1) goto code_r0x0074c480;
    iVar2 = unaff_x22[6];
    unaff_x22[6] = iVar2 + 1U;
    if (uStack0000000000000018._7_1_ != 0x20) goto code_r0x0074c6c8;
    *(undefined1 *)(*(long *)(unaff_x22 + 8) + (ulong)(iVar2 + 1U) + lVar6 + -1) = 0;
    iVar2 = func_0x0077ed9c(lVar6 + *(long *)(unaff_x22 + 8),&uStack0000000000000010,10,
                            &uStack0000000000000008);
    if (iVar2 != 0) goto LAB_0074cbf4;
    if ((*uStack0000000000000010 == '\0') && (1 < uStack0000000000000008 + 0x8000000000000001U)) {
      lVar12 = *(long *)(unaff_x22 + 4);
      *(uint *)(lVar12 + 0x60) = *(uint *)(lVar12 + 0x60) | 0x40;
      *(long *)(lVar12 + 0x28) = uStack0000000000000008;
    }
    unaff_x22[6] = 0;
    unaff_x22[8] = 0;
    unaff_x22[9] = 0;
    *(undefined8 *)(unaff_x22 + 1) = unaff_d14;
    break;
  case 7:
    switch(unaff_x22[2]) {
    case 0:
      if (uStack0000000000000018._7_1_ != 0x20) {
        if ((uStack0000000000000018._7_1_ - 0x30 < 10) ||
           ((uStack0000000000000018._7_1_ & 0xffffffdf) - 0x41 < 0x1a)) goto code_r0x0074c564;
        goto LAB_0074cc2c;
      }
      goto LAB_0074cbf4;
    case 1:
      goto code_r0x0074c760;
    case 2:
      unaff_x22[6] = unaff_x22[6] + 1;
      if (uStack0000000000000018._7_1_ != 0x20) {
        if ((uStack0000000000000018._7_1_ - 0x30 < 10) ||
           ((uStack0000000000000018._7_1_ & 0xffffffdf) - 0x41 < 0x1a)) {
code_r0x0074c970:
          unaff_x22[2] = 3;
joined_r0x0074c980:
          unaff_x23 = unaff_x23 + 1;
          goto joined_r0x0074c5bc;
        }
        goto LAB_0074cc2c;
      }
      goto LAB_0074cbf4;
    case 3:
      unaff_x22[6] = unaff_x22[6] + 1;
      if (uStack0000000000000018._7_1_ != 0x20) goto code_r0x0074c7e0;
code_r0x0074c9c4:
      unaff_x22[2] = 4;
      unaff_x23 = unaff_x23 + 1;
      goto joined_r0x0074c5bc;
    case 4:
      unaff_x22[6] = unaff_x22[6] + 1;
      if (uStack0000000000000018._7_1_ != 0x20) {
        if ((uStack0000000000000018._7_1_ - 0x30 < 10) ||
           ((uStack0000000000000018._7_1_ & 0xffffffdf) - 0x41 < 0x1a)) {
          unaff_x22[2] = 5;
          goto joined_r0x0074cc10;
        }
        goto LAB_0074cc2c;
      }
      goto LAB_0074cbf4;
    case 5:
      iVar2 = unaff_x22[6];
      unaff_x22[6] = iVar2 + 1U;
      if (uStack0000000000000018._7_1_ == 0x20) {
        *(undefined1 *)(*(long *)(unaff_x22 + 8) + (ulong)(iVar2 + 1U) + lVar6 + -1) = 0;
        *(undefined8 *)(unaff_x22 + 0x10) = *(undefined8 *)(unaff_x22 + 8);
        if (*(int *)(lVar12 + 8) == 2) {
          *(undefined8 *)(unaff_x22 + 1) = in_stack_00000000;
        }
        else {
          *(undefined8 *)(unaff_x22 + 1) = unaff_d15;
        }
        goto joined_r0x0074cc10;
      }
      if ((((0xf5 < (byte)(uStack0000000000000018._7_1_ - 0x3a)) ||
           (0xe5 < (byte)((uStack0000000000000018._7_1_ & 0xdf) + 0xa5))) ||
          (uStack0000000000000018._7_1_ == 0x2e)) || (uStack0000000000000018._7_1_ == 0x3a))
      goto LAB_0074cbf4;
      goto LAB_0074cc2c;
    default:
      goto LAB_0074cbf4;
    }
  case 8:
    iVar4 = unaff_x22[2];
    if (iVar4 == 2) {
      if (uStack0000000000000018._7_1_ != 10) goto LAB_0074cc2c;
      lVar12 = *(long *)(unaff_x22 + 8) + (ulong)(uint)unaff_x22[6];
    }
    else {
      if (iVar4 != 1) goto code_r0x0074c554;
      iVar4 = unaff_x22[6];
      unaff_x22[6] = iVar4 + 1U;
      if (uStack0000000000000018._7_1_ != 10) {
        if (uStack0000000000000018._7_1_ == 0xd) goto code_r0x0074c778;
        goto LAB_0074cbf4;
      }
      lVar12 = *(long *)(unaff_x22 + 8) + (ulong)(iVar4 + 1U);
    }
    *(undefined1 *)(lVar12 + lVar6 + -1) = 0;
    *(undefined8 *)(unaff_x22 + 10) = *(undefined8 *)(unaff_x22 + 8);
    unaff_x22[1] = iVar2;
    func_0x0074cdcc();
    break;
  case 9:
    switch(unaff_x22[2]) {
    case 0:
      goto code_r0x0074c558;
    case 1:
      unaff_x22[6] = unaff_x22[6] + 1;
      if (uStack0000000000000018._7_1_ == 0x20) goto code_r0x0074c778;
      if ((uStack0000000000000018._7_1_ == 10) || (uStack0000000000000018._7_1_ == 0xd))
      goto LAB_0074cc2c;
      goto LAB_0074cbf4;
    case 2:
      unaff_x22[6] = unaff_x22[6] + 1;
      if (uStack0000000000000018._7_1_ == 0x2d) goto code_r0x0074c970;
      if ((uStack0000000000000018._7_1_ == 10) || (uStack0000000000000018._7_1_ == 0xd))
      goto LAB_0074cc2c;
      unaff_x22[2] = iVar2;
      break;
    case 3:
      unaff_x22[6] = unaff_x22[6] + 1;
      if (uStack0000000000000018._7_1_ == 0x3e) goto code_r0x0074c9c4;
      if ((uStack0000000000000018._7_1_ == 10) || (uStack0000000000000018._7_1_ == 0xd))
      goto LAB_0074cc2c;
      unaff_x22[2] = iVar2;
      break;
    case 4:
      iVar4 = unaff_x22[6];
      unaff_x22[6] = iVar4 + 1U;
      if (uStack0000000000000018._7_1_ == 0x20) {
        unaff_x22[2] = 5;
        *(undefined1 *)(*(long *)(unaff_x22 + 8) + (ulong)(iVar4 + 1U) + lVar6 + -4) = 0;
        uVar10 = *(undefined8 *)(unaff_x22 + 8);
        unaff_x22[6] = 0;
        unaff_x22[8] = 0;
        unaff_x22[9] = 0;
        *(undefined8 *)(unaff_x22 + 10) = uVar10;
      }
      else {
        if ((uStack0000000000000018._7_1_ == 10) || (uStack0000000000000018._7_1_ == 0xd))
        goto LAB_0074cc2c;
        unaff_x22[2] = iVar2;
      }
      break;
    case 5:
      if ((uStack0000000000000018._7_1_ == 10) || (uStack0000000000000018._7_1_ == 0xd))
      goto LAB_0074cc2c;
      unaff_x22[2] = 6;
      *(long *)(unaff_x22 + 8) = lVar5 + -1;
      unaff_x22[6] = iVar2;
      break;
    case 6:
      iVar4 = unaff_x22[6];
      unaff_x22[6] = iVar4 + 1U;
      if (uStack0000000000000018._7_1_ == 10) {
        lVar12 = *(long *)(unaff_x22 + 8) + (ulong)(iVar4 + 1U);
        goto code_r0x0074cbd4;
      }
      if (uStack0000000000000018._7_1_ != 0xd) goto LAB_0074cbf4;
      unaff_x22[2] = 7;
      break;
    case 7:
      if (uStack0000000000000018._7_1_ != 10) goto LAB_0074cc2c;
      lVar12 = *(long *)(unaff_x22 + 8) + (ulong)(uint)unaff_x22[6];
code_r0x0074cbd4:
      *(undefined1 *)(lVar12 + lVar6 + -1) = 0;
      *(undefined8 *)(unaff_x22 + 0x14) = *(undefined8 *)(unaff_x22 + 8);
      func_0x0074cdcc();
      unaff_x22[1] = iVar2;
    default:
      goto LAB_0074cbf4;
    }
    break;
  default:
    goto LAB_0074cbf4;
  }
  goto joined_r0x0074c5bc;
code_r0x0074c0f8:
  switch(unaff_x22[1]) {
  case 0:
    uVar3 = unaff_x22[6] + 1;
    unaff_x22[6] = uVar3;
    if (8 < uVar3) {
      if ((uVar3 == 9) && (uStack0000000000000018._7_1_ == 0x20)) {
        *(undefined8 *)(unaff_x22 + 1) = unaff_d8;
        break;
      }
      goto LAB_0074cc2c;
    }
    if (0x3f < (ulong)uStack0000000000000018._7_1_) goto LAB_0074cc2c;
    param_1 = unaff_x25 << ((ulong)uStack0000000000000018._7_1_ & 0x3f);
    in_x9 = 0x3ff200000000001;
    goto code_r0x0074c14c;
  case 1:
    iVar4 = unaff_x22[6];
    unaff_x22[6] = iVar4 + 1U;
    if (unaff_x22[2] != 1) {
      if (((unaff_x22[2] == 0) && (uStack0000000000000018._7_1_ != 9)) &&
         (uStack0000000000000018._7_1_ != 0x20)) {
        unaff_x22[2] = iVar2;
        goto joined_r0x0074c8dc;
      }
      goto LAB_0074cbf4;
    }
    if (uStack0000000000000018._7_1_ != 0x20) {
      param_1 = _memchr("APM0123456789:",(long)(char)uStack0000000000000018._7_1_,0xf);
      goto joined_r0x0074c150;
    }
    *(long *)(unaff_x22 + 0x10) = *(long *)(unaff_x22 + 8);
    *(undefined1 *)(*(long *)(unaff_x22 + 8) + (ulong)(iVar4 + 1U) + lVar6 + -1) = 0;
    *(undefined8 *)(unaff_x22 + 1) = unaff_d9;
    unaff_x22[6] = 0;
    break;
  case 2:
    iVar4 = unaff_x22[2];
    if (iVar4 != 1) goto code_r0x0074c554;
    iVar4 = unaff_x22[6];
    unaff_x22[6] = iVar4 + 1U;
    if (uStack0000000000000018._7_1_ == 0x20) {
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
joined_r0x0074c8dc:
      unaff_x23 = unaff_x23 + 1;
      goto joined_r0x0074c5bc;
    }
    goto LAB_0074cbf4;
  case 3:
    iVar4 = unaff_x22[2];
    if (iVar4 == 2) {
      if (uStack0000000000000018._7_1_ != 10) goto LAB_0074cc2c;
      *(undefined8 *)(unaff_x22 + 10) = *(undefined8 *)(unaff_x22 + 8);
    }
    else {
      if (iVar4 != 1) goto code_r0x0074c554;
      unaff_x22[6] = unaff_x22[6] + 1;
      if (uStack0000000000000018._7_1_ != 10) {
        if (uStack0000000000000018._7_1_ == 0xd) {
          unaff_x22[2] = 2;
          *(undefined1 *)(lVar5 + lVar6 + -1) = 0;
          break;
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
joined_r0x0074c5bc:
  unaff_x23 = unaff_x23 + 1;
joined_r0x0074c5bc:
  if (unaff_x19 <= unaff_x23) {
    return unaff_x19;
  }
  goto LAB_0074c020;
code_r0x0074c760:
  unaff_x22[6] = unaff_x22[6] + 1;
  if (uStack0000000000000018._7_1_ == 0x20) {
code_r0x0074c778:
    unaff_x22[2] = 2;
    goto joined_r0x0074c5bc;
  }
code_r0x0074c7e0:
  uVar3 = (uint)uStack0000000000000018._7_1_;
  if ((((9 < uVar3 - 0x30) && (0x19 < uVar3 - 0x61)) && (uVar3 != 0x2e)) &&
     (uVar3 - 0x5b < 0xffffffe6)) goto LAB_0074cc2c;
  goto LAB_0074cbf4;
}

