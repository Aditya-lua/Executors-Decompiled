
undefined8 FUN_0075b40c(long param_1)

{
  bool bVar1;
  int iVar2;
  undefined8 uVar3;
  char *pcVar4;
  long lVar5;
  char cVar6;
  undefined4 uVar7;
  long lVar8;
  char *in_x10;
  long unaff_x19;
  char *unaff_x20;
  char *pcVar9;
  undefined4 *puVar10;
  char *unaff_x23;
  long unaff_x26;
  long lVar11;
  undefined8 uStack0000000000000018;
  undefined8 uStack0000000000000020;
  undefined8 uStack0000000000000028;
  
  if (*in_x10 != '/') {
    in_x10 = unaff_x23;
  }
  uVar3 = func_0x00742734(param_1,(long)in_x10 - param_1,unaff_x26 + 8,0,3);
  if ((int)uVar3 != 0) {
    return uVar3;
  }
  cVar6 = *unaff_x23;
  if (cVar6 == ';') {
    do {
      pcVar9 = unaff_x23;
      cVar6 = pcVar9[1];
      lVar8 = 0;
      while( true ) {
        if (cVar6 == '\0') {
          return 3;
        }
        if (cVar6 == '=') break;
        cVar6 = pcVar9[lVar8 + 2];
        lVar8 = lVar8 + 1;
      }
      uVar3 = func_0x00742734(pcVar9 + 1,lVar8,&uStack0000000000000028,0,3);
      if ((int)uVar3 != 0) {
        return uVar3;
      }
      for (lVar11 = 0;
          (((cVar6 = (pcVar9 + lVar8 + 2)[lVar11],
            (int)cVar6 - 0x30U < 10 || (((int)cVar6 & 0xffffffdfU) - 0x41 & 0xff) < 0x1a ||
            (iVar2 = (int)cVar6, iVar2 - 0x24U < 0xc)) ||
           (iVar2 - 0x21U < 0x3f &&
            (1L << ((ulong)(iVar2 - 0x21U) & 0x3f) & 0x4000000092000001U) != 0)) || (iVar2 == 0x7e))
          ; lVar11 = lVar11 + 1) {
      }
      uVar3 = func_0x00742734(pcVar9 + lVar8 + 2,lVar11,&uStack0000000000000020,
                              &uStack0000000000000018,3);
      if ((int)uVar3 != 0) {
        (*pcRam0000000000a2b5f0)(uStack0000000000000028);
        return uVar3;
      }
      iVar2 = func_0x0077e6f8(uStack0000000000000028,"UIDVALIDITY");
      if ((iVar2 == 0) || (*(long *)(unaff_x26 + 0x10) != 0)) {
        iVar2 = func_0x0077e6f8(uStack0000000000000028,"UID");
        if ((iVar2 == 0) || (*(long *)(unaff_x26 + 0x18) != 0)) {
          iVar2 = func_0x0077e6f8(uStack0000000000000028,"MAILINDEX");
          if ((iVar2 == 0) || (*(long *)(unaff_x26 + 0x20) != 0)) {
            iVar2 = func_0x0077e6f8(uStack0000000000000028,"SECTION");
            if ((iVar2 == 0) || (*(long *)(unaff_x26 + 0x28) != 0)) {
              iVar2 = func_0x0077e6f8(uStack0000000000000028,"PARTIAL");
              if ((iVar2 == 0) || (*(long *)(unaff_x26 + 0x30) != 0)) {
                (*pcRam0000000000a2b5f0)(uStack0000000000000028);
                (*pcRam0000000000a2b5f0)(uStack0000000000000020);
                return 3;
              }
              if ((uStack0000000000000018 != 0) &&
                 (*(char *)(uStack0000000000000020 + uStack0000000000000018 + -1) == '/')) {
                *(undefined1 *)(uStack0000000000000020 + uStack0000000000000018 + -1) = 0;
              }
              *(long *)(unaff_x26 + 0x30) = uStack0000000000000020;
            }
            else {
              if ((uStack0000000000000018 != 0) &&
                 (*(char *)(uStack0000000000000020 + uStack0000000000000018 + -1) == '/')) {
                *(undefined1 *)(uStack0000000000000020 + uStack0000000000000018 + -1) = 0;
              }
              *(long *)(unaff_x26 + 0x28) = uStack0000000000000020;
            }
          }
          else {
            if ((uStack0000000000000018 != 0) &&
               (*(char *)(uStack0000000000000020 + uStack0000000000000018 + -1) == '/')) {
              *(undefined1 *)(uStack0000000000000020 + uStack0000000000000018 + -1) = 0;
            }
            *(long *)(unaff_x26 + 0x20) = uStack0000000000000020;
          }
        }
        else {
          if ((uStack0000000000000018 != 0) &&
             (*(char *)(uStack0000000000000020 + uStack0000000000000018 + -1) == '/')) {
            *(undefined1 *)(uStack0000000000000020 + uStack0000000000000018 + -1) = 0;
          }
          *(long *)(unaff_x26 + 0x18) = uStack0000000000000020;
        }
      }
      else {
        if ((uStack0000000000000018 != 0) &&
           (*(char *)(uStack0000000000000020 + uStack0000000000000018 + -1) == '/')) {
          *(undefined1 *)(uStack0000000000000020 + uStack0000000000000018 + -1) = 0;
        }
        *(long *)(unaff_x26 + 0x10) = uStack0000000000000020;
      }
      uStack0000000000000020 = 0;
      (*pcRam0000000000a2b5f0)(uStack0000000000000028);
      (*pcRam0000000000a2b5f0)(uStack0000000000000020);
      cVar6 = pcVar9[lVar11 + lVar8 + 2];
      unaff_x23 = pcVar9 + lVar11 + lVar8 + 2;
    } while (cVar6 == ';');
    unaff_x23 = pcVar9 + lVar11 + lVar8 + 2;
    lVar8 = *(long *)(unaff_x26 + 8);
  }
  else {
    lVar8 = *(long *)(unaff_x26 + 8);
  }
  if (((lVar8 != 0) && (*(long *)(unaff_x26 + 0x18) == 0)) && (*(long *)(unaff_x26 + 0x20) == 0)) {
    func_0x00789530(*(undefined8 *)
                     ("/System/Library/Frameworks/CoreServices.framework/Versions/A/CoreServices" +
                     unaff_x19 + 0x48),8,unaff_x26 + 0x38,0x40);
    cVar6 = *unaff_x23;
  }
  if (cVar6 != '\0') {
    return 3;
  }
  if (*(long *)(unaff_x19 + 0x7c0) != 0) {
    lVar8 = *(long *)(unaff_x19 + 0x1b0);
    uVar3 = func_0x00742734(*(long *)(unaff_x19 + 0x7c0),0,(undefined8 *)(lVar8 + 0x40),0,3);
    if ((int)uVar3 != 0) {
      return uVar3;
    }
    pcVar9 = *(char **)(lVar8 + 0x40);
    cVar6 = *pcVar9;
    pcVar4 = pcVar9;
    while (cVar6 != '\0') {
      if (cVar6 == ' ') {
        uVar3 = (*pcRam0000000000a2b600)();
        *(undefined8 *)(lVar8 + 0x48) = uVar3;
        *pcVar9 = '\0';
        if (*(long *)(lVar8 + 0x48) == 0) {
          return 0x1b;
        }
        break;
      }
      pcVar9 = pcVar9 + 1;
      pcVar4 = pcVar4 + 1;
      cVar6 = *pcVar4;
    }
  }
  *(undefined8 *)(unaff_x19 + 0xe8) = 0xffffffffffffffff;
  func_0x00770948();
  func_0x0077093c();
  func_0x00770580();
  func_0x00770554();
  lVar8 = *(long *)(unaff_x19 + 0x18);
  puVar10 = *(undefined4 **)(unaff_x19 + 0x1b0);
  if ((*(byte *)(unaff_x19 + 0x1c3) >> 1 & 1) != 0) {
    *puVar10 = 1;
  }
  *unaff_x20 = '\0';
  if ((((*(long *)(puVar10 + 2) == 0) || (*(long *)(lVar8 + 0x4c8) == 0)) ||
      (iVar2 = func_0x0077e6f8(), iVar2 == 0)) ||
     (((*(long *)(puVar10 + 4) != 0 && (*(long *)(lVar8 + 0x4d0) != 0)) &&
      (iVar2 = func_0x0077e6f8(), iVar2 == 0)))) {
    bVar1 = false;
    if (((byte)(&UNK_00001346)[unaff_x19] >> 3 & 1) == 0) goto LAB_0075b84c;
LAB_0075b854:
    lVar11 = *(long *)(unaff_x19 + 0x1b0);
    if (*(long *)(lVar11 + 8) == 0) {
LAB_0075b8ec:
      func_0x0073c9e4();
      return 3;
    }
    if (*(int *)(unaff_x19 + 0x348) == 0) {
      uVar3 = func_0x00774334();
      if ((int)uVar3 != 0) {
        return uVar3;
      }
      lVar5 = *(long *)("/System/Library/Frameworks/CoreServices.framework/Versions/A/CoreServices"
                       + unaff_x19 + 0x30);
    }
    else {
      *(uint *)(unaff_x19 + 0x34c) = *(uint *)(unaff_x19 + 0x34c) & 0xfffffffd;
      func_0x007600a8(unaff_x19 + 0x338,*(undefined8 *)(unaff_x19 + 0x328),0);
      uVar3 = func_0x00761020();
      if ((int)uVar3 != 0) {
        return uVar3;
      }
      lVar5 = func_0x00782efc();
      if ((lVar5 == 0) &&
         (uVar3 = func_0x00760e1c(unaff_x19 + 0x380,"Mime-Version: 1.0"), (int)uVar3 != 0)) {
        return uVar3;
      }
      uVar3 = func_0x007616ac();
      if ((int)uVar3 != 0) {
        return uVar3;
      }
      lVar5 = func_0x00774c40();
      *(long *)("/System/Library/Frameworks/CoreServices.framework/Versions/A/CoreServices" +
               unaff_x19 + 0x30) = lVar5;
    }
    if (lVar5 < 0) {
      func_0x0073c9e4();
      return 0x19;
    }
    lVar11 = func_0x0075d62c(*(undefined8 *)(lVar11 + 8),0);
    if (lVar11 == 0) {
      return 0x1b;
    }
    uVar3 = func_0x0075d338();
    (*pcRam0000000000a2b5f0)(lVar11);
    if ((int)uVar3 != 0) {
      return uVar3;
    }
    lVar11 = *(long *)(unaff_x19 + 0x18);
    uVar7 = 0xb;
  }
  else {
    bVar1 = true;
    if (((byte)(&UNK_00001346)[unaff_x19] >> 3 & 1) != 0) goto LAB_0075b854;
LAB_0075b84c:
    if (*(int *)(unaff_x19 + 0x348) != 0) goto LAB_0075b854;
    if (*(long *)(puVar10 + 0x10) == 0) {
      if (bVar1) {
        if ((*(long *)(puVar10 + 6) != 0) || (*(long *)(puVar10 + 8) != 0)) {
          uVar3 = func_0x0075d770();
          if ((int)uVar3 != 0) {
            return uVar3;
          }
          lVar11 = *(long *)(unaff_x19 + 0x18);
          goto LAB_0075bb68;
        }
        if (*(long *)(puVar10 + 0xe) == 0) goto LAB_0075bc00;
        if (*(long *)(*(long *)(unaff_x19 + 0x1b0) + 0x38) == 0) goto LAB_0075b8ec;
        uVar3 = func_0x0075d338();
        if ((int)uVar3 != 0) {
          return uVar3;
        }
        lVar11 = *(long *)(unaff_x19 + 0x18);
        uVar7 = 0xd;
      }
      else {
        if ((*(long *)(puVar10 + 2) != 0) &&
           (((*(long *)(puVar10 + 6) != 0 || (*(long *)(puVar10 + 8) != 0)) ||
            (*(long *)(puVar10 + 0xe) != 0)))) goto LAB_0075ba70;
LAB_0075bc00:
        if (*(long *)(*(long *)(unaff_x19 + 0x1b0) + 0x40) == 0) {
          lVar11 = *(long *)(*(long *)(unaff_x19 + 0x1b0) + 8);
          if (lVar11 == 0) {
            lVar11 = (*pcRam0000000000a2b600)("");
          }
          else {
            lVar11 = func_0x0075d62c(lVar11,1);
          }
          if (lVar11 == 0) {
            return 0x1b;
          }
          uVar3 = func_0x0075d338();
          (*pcRam0000000000a2b5f0)(lVar11);
          iVar2 = (int)uVar3;
        }
        else {
          uVar3 = func_0x0075d338();
          iVar2 = (int)uVar3;
        }
joined_r0x0075bb58:
        if (iVar2 != 0) {
          return uVar3;
        }
        lVar11 = *(long *)(unaff_x19 + 0x18);
        uVar7 = 7;
      }
    }
    else {
      if ((bVar1) || (*(long *)(puVar10 + 2) == 0)) {
        if (*(long *)(*(long *)(unaff_x19 + 0x1b0) + 0x40) == 0) {
          lVar11 = *(long *)(*(long *)(unaff_x19 + 0x1b0) + 8);
          if (lVar11 == 0) {
            lVar11 = (*pcRam0000000000a2b600)("");
          }
          else {
            lVar11 = func_0x0075d62c(lVar11,1);
          }
          if (lVar11 == 0) {
            return 0x1b;
          }
          uVar3 = func_0x0075d338();
          (*pcRam0000000000a2b5f0)(lVar11);
        }
        else {
          uVar3 = func_0x0075d338();
        }
        iVar2 = (int)uVar3;
        goto joined_r0x0075bb58;
      }
LAB_0075ba70:
      lVar11 = *(long *)(unaff_x19 + 0x18);
      lVar5 = *(long *)(unaff_x19 + 0x1b0);
      (*pcRam0000000000a2b5f0)(*(undefined8 *)(lVar11 + 0x4c8));
      *(undefined8 *)(lVar11 + 0x4c8) = 0;
      (*pcRam0000000000a2b5f0)(*(undefined8 *)(lVar11 + 0x4d0));
      *(undefined8 *)(lVar11 + 0x4d0) = 0;
      lVar11 = *(long *)(lVar5 + 8);
      if (lVar11 == 0) goto LAB_0075b8ec;
      lVar11 = func_0x0075d62c(lVar11,0);
      if (lVar11 == 0) {
        return 0x1b;
      }
      uVar3 = func_0x0075d338();
      (*pcRam0000000000a2b5f0)(lVar11);
      if ((int)uVar3 != 0) {
        return uVar3;
      }
      lVar11 = *(long *)(unaff_x19 + 0x18);
      uVar7 = 8;
    }
  }
  *(undefined4 *)(lVar11 + 0x4d8) = uVar7;
LAB_0075bb68:
  uVar3 = func_0x0076dfc0();
  *unaff_x20 = *(int *)(lVar11 + 0x4d8) == 0;
  func_0x00731574(lVar8,0);
  if ((int)uVar3 != 0) {
    return uVar3;
  }
  if ((*unaff_x20 != '\0') && (**(int **)(unaff_x19 + 0x1b0) != 0)) {
    func_0x00783c98();
  }
  return 0;
}

