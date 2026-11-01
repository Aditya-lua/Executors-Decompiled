
int FUN_0076c738(long param_1,char *param_2,long *param_3,long *param_4,undefined8 param_5)

{
  char cVar1;
  byte bVar2;
  uint uVar3;
  bool bVar4;
  int iVar5;
  int iVar6;
  long lVar7;
  char *pcVar8;
  byte *pbVar9;
  char *pcVar10;
  byte *pbVar11;
  long lVar12;
  int iVar13;
  bool bVar14;
  byte *pbVar15;
  int iVar16;
  uint uVar17;
  long lVar18;
  long lVar19;
  undefined8 uStack_68;
  undefined1 auStack_50 [32];
  byte abStack_30 [32];
  
  lVar19 = *param_3;
  func_0x0074066c(auStack_50,0x1000);
  if ((*(byte *)(param_1 + 0x28) & 1) == 0) {
    lVar7 = _fopen(param_5,"r");
    func_0x0074066c(abStack_30,0x4000);
    if (lVar7 == 0) {
      func_0x00740678();
      return 3;
    }
    do {
      iVar5 = func_0x0073aa84(abStack_30,lVar7);
      if (iVar5 == 0) {
        func_0x00740678(abStack_30);
        _fclose(lVar7);
        goto LAB_0076c96c;
      }
      for (pcVar8 = (char *)func_0x00740a58(abStack_30);
          (cVar1 = *pcVar8, cVar1 == '\t' || (cVar1 == ' ')); pcVar8 = pcVar8 + 1) {
      }
    } while ((cVar1 == '#') || (iVar5 = func_0x007408a0(param_1), iVar5 == 0));
    iVar13 = 4;
    if (iVar5 != 0x1b) {
      iVar13 = 2;
    }
    func_0x00740678(abStack_30);
    _fclose(lVar7);
    if (iVar13 != 0) {
      return iVar13;
    }
LAB_0076c96c:
    *(byte *)(param_1 + 0x28) = *(byte *)(param_1 + 0x28) | 1;
  }
  pbVar9 = (byte *)func_0x00740a58(param_1);
  lVar7 = lVar19;
  if (pbVar9 == (byte *)0x0) {
    bVar4 = false;
    lVar18 = 0;
    iVar13 = 1;
LAB_0076cec0:
    func_0x00740678(auStack_50);
joined_r0x0076cfb4:
    if (iVar13 == 0) {
      if ((lVar18 != 0) || ((bool)(bVar4 ^ 1))) {
        if (lVar18 != 0 || lVar7 != 0) goto LAB_0076cf7c;
        lVar7 = 0;
        lVar18 = 0;
        iVar13 = 1;
      }
      else {
        lVar18 = (*pcRam0000000000a2b600)("");
        if (lVar18 != 0) {
LAB_0076cf7c:
          if (lVar19 == 0) {
            *param_3 = lVar7;
          }
          *param_4 = lVar18;
          return 0;
        }
        iVar13 = 4;
        lVar18 = 0;
      }
    }
LAB_0076cf2c:
    func_0x00740678(param_1);
    if (lVar19 == 0) {
      (*pcRam0000000000a2b5f0)(lVar7);
    }
    (*pcRam0000000000a2b5f0)(lVar18);
    return iVar13;
  }
  uStack_68 = 0;
  lVar18 = 0;
  bVar4 = false;
  iVar13 = 1;
  iVar5 = 0;
LAB_0076c9b4:
  func_0x007406b0(auStack_50);
  pbVar15 = pbVar9 + 1;
  pbVar11 = pbVar9 + 2;
  bVar2 = *pbVar9;
  pbVar9 = pbVar15;
  if (bVar2 == 0x20 || bVar2 == 9) {
    do {
      pbVar15 = pbVar9 + 1;
      pbVar11 = pbVar11 + 1;
      bVar2 = *pbVar9;
      pbVar9 = pbVar15;
    } while (bVar2 == 0x20 || bVar2 == 9);
  }
  iVar16 = 0;
  if (bVar2 != 0xd && bVar2 != 10) {
    iVar16 = 3;
  }
  if (iVar5 != 3) {
    iVar16 = iVar5;
  }
  iVar5 = iVar16;
  if (bVar2 == 0x22) {
    if (*pbVar15 != 0) {
      bVar14 = false;
      bVar2 = *pbVar15;
      do {
        abStack_30[0] = bVar2;
        if (bVar14) {
          if (abStack_30[0] == 0x74) {
            abStack_30[0] = 9;
            iVar6 = func_0x0074075c(auStack_50,abStack_30,1);
          }
          else {
            if (abStack_30[0] == 0x72) {
              abStack_30[0] = 0xd;
              iVar6 = func_0x0074075c(auStack_50,abStack_30,1);
              goto joined_r0x0076cb68;
            }
            if (abStack_30[0] != 0x6e) goto LAB_0076cb10;
            abStack_30[0] = 10;
            iVar6 = func_0x0074075c(auStack_50,abStack_30,1);
          }
          if (iVar6 != 0) goto LAB_0076cf0c;
LAB_0076cb24:
          bVar14 = false;
          bVar2 = *pbVar11;
        }
        else {
          if (abStack_30[0] != 0x5c) {
            if (abStack_30[0] != 0x22) {
LAB_0076cb10:
              iVar6 = func_0x0074075c(auStack_50,abStack_30,1);
joined_r0x0076cb68:
              if (iVar6 == 0) goto LAB_0076cb24;
              goto LAB_0076cf0c;
            }
            goto LAB_0076ca60;
          }
          bVar14 = true;
          bVar2 = *pbVar11;
        }
        pbVar11 = pbVar11 + 1;
        if (bVar2 == 0) break;
      } while( true );
    }
LAB_0076cf04:
    iVar13 = 2;
LAB_0076cf1c:
    func_0x00740678(auStack_50);
    goto LAB_0076cf2c;
  }
  pbVar11 = pbVar15 + -1;
  if ((bVar2 == 0) || (bVar2 == 10)) {
    lVar12 = _strchr(pbVar11,10);
    if (lVar12 == 0) {
      func_0x00740678(auStack_50);
      goto joined_r0x0076cfb4;
    }
    pbVar9 = (byte *)(lVar12 + 1);
    if (pbVar9 == (byte *)0x0) goto LAB_0076cec0;
    goto LAB_0076c9b4;
  }
  lVar12 = 0;
  while (((bVar2 != 9 && (bVar2 != 0x20)) && (3 < bVar2 - 10))) {
    pbVar11 = pbVar11 + 1;
    lVar12 = lVar12 + 1;
    bVar2 = *pbVar11;
  }
  if (lVar12 == 0) goto LAB_0076cf04;
  iVar6 = func_0x0074075c(auStack_50);
  if (iVar6 != 0) {
LAB_0076cf0c:
    iVar13 = 4;
    if (iVar6 != 0x1b) {
      iVar13 = 2;
    }
    goto LAB_0076cf1c;
  }
LAB_0076ca60:
  pcVar8 = (char *)func_0x00740a58(auStack_50);
  if (iVar16 == 3) {
    iVar5 = 0;
    if (*pcVar8 != '\0') {
      iVar5 = 3;
    }
    pbVar9 = pbVar11 + 1;
    goto LAB_0076c9b4;
  }
  if (iVar16 != 2) {
    if (iVar16 != 1) {
      if (iVar16 == 0) {
        iVar5 = func_0x0077e6f8("macdef",pcVar8);
        if (iVar5 == 0) {
          iVar5 = func_0x0077e6f8("machine",pcVar8);
          if (iVar5 == 0) {
            pcVar10 = "default";
            goto LAB_0076cc28;
          }
          (*pcRam0000000000a2b5f0)(lVar18);
          if (lVar19 == 0) {
            bVar4 = false;
LAB_0076cd88:
            (*pcRam0000000000a2b5f0)(lVar7);
            lVar7 = 0;
            lVar18 = 0;
            uStack_68 = 0;
            pbVar9 = pbVar11 + 1;
            iVar5 = 1;
            goto LAB_0076c9b4;
          }
          uStack_68 = 0;
          bVar4 = false;
          lVar18 = 0;
          iVar5 = 1;
        }
        else {
          iVar5 = 3;
        }
      }
LAB_0076cc90:
      pbVar9 = pbVar11 + 1;
      goto LAB_0076c9b4;
    }
    pcVar10 = param_2;
LAB_0076cc28:
    iVar5 = func_0x0077e6f8(pcVar10,pcVar8);
    if (iVar5 != 0) {
      iVar13 = 0;
    }
    iVar5 = (uint)(iVar5 != 0) << 1;
    goto LAB_0076cc48;
  }
  uVar3 = uStack_68._4_4_;
  uVar17 = uVar3;
  if ((int)uStack_68 == 2) {
    (*pcRam0000000000a2b5f0)(lVar18);
    lVar18 = (*pcRam0000000000a2b600)(pcVar8);
    if (lVar18 == 0) {
      iVar13 = 4;
      goto LAB_0076cf1c;
    }
    uStack_68 = 0;
    uVar17 = uVar3 | 2;
    if (lVar19 != 0 && !bVar4) {
      uVar17 = uVar3;
    }
LAB_0076ce28:
  }
  else {
    if ((int)uStack_68 != 1) {
      iVar5 = func_0x0077e6f8("login",pcVar8);
      if (iVar5 != 0) {
        uStack_68 = 1;
        goto LAB_0076ce28;
      }
      iVar5 = func_0x0077e6f8("password",pcVar8);
      if (iVar5 == 0) {
        iVar5 = func_0x0077e6f8("machine",pcVar8);
        if (iVar5 != 0) {
          if (uStack_68._4_4_ >> 1 == 0) {
            (*pcRam0000000000a2b5f0)(lVar18);
            if (lVar19 == 0) goto LAB_0076cd88;
            uStack_68 = 0;
            lVar18 = 0;
            iVar5 = 1;
            goto LAB_0076cc90;
          }
          goto LAB_0076cec0;
        }
        iVar5 = func_0x0077e6f8("default",pcVar8);
        if (iVar5 != 0) {
          (*pcRam0000000000a2b5f0)(lVar18);
          if (lVar19 == 0) {
            (*pcRam0000000000a2b5f0)(lVar7);
            lVar18 = 0;
            lVar7 = 0;
            iVar13 = 0;
          }
          else {
            lVar18 = 0;
            iVar13 = 0;
          }
        }
      }
      else {
        uStack_68 = 2;
      }
      goto LAB_0076ce28;
    }
    if (lVar19 == 0) {
      (*pcRam0000000000a2b5f0)(lVar7);
      lVar7 = (*pcRam0000000000a2b600)(pcVar8);
      if (lVar7 == 0) {
        iVar13 = 4;
        goto LAB_0076cf1c;
      }
      bVar4 = true;
    }
    else {
      iVar5 = func_0x0077e89c(lVar7,pcVar8);
      bVar4 = iVar5 == 0;
    }
    uStack_68._0_4_ = 0;
    uVar17 = uStack_68._4_4_ | 1;
  }
  uStack_68 = CONCAT44(uVar17,(int)uStack_68);
  iVar5 = 2;
  if ((uVar17 == 3) && (bVar4)) goto LAB_0076cec0;
LAB_0076cc48:
  pbVar9 = pbVar11 + 1;
  goto LAB_0076c9b4;
}

