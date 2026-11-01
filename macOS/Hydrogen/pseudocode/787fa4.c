
undefined8 FUN_00787fa4(long param_1)

{
  uint uVar1;
  long *plVar2;
  char *pcVar3;
  bool bVar4;
  int iVar5;
  uint uVar6;
  ulong uVar7;
  long lVar8;
  long unaff_x20;
  long unaff_x21;
  undefined8 uVar9;
  uint unaff_w23;
  undefined1 uStack0000000000000010;
  undefined1 uStack0000000000000018;
  undefined8 uStack0000000000000020;
  undefined8 uStack0000000000000028;
  undefined8 uStack0000000000000030;
  undefined8 uStack0000000000000038;
  
  _uStack0000000000000010 = 0;
  _uStack0000000000000018 = 0;
  if (param_1 == 0) goto LAB_00788008;
  iVar5 = func_0x0078a0e4(param_1,0);
  if (iVar5 != 0) {
    func_0x0077ea64();
    func_0x0073c9e4();
    uVar9 = 5;
    goto LAB_0078800c;
  }
  iVar5 = func_0x00789530(param_1,1,&uStack0000000000000018,0);
  if (iVar5 != 0) goto LAB_00788008;
  iVar5 = func_0x0077e6f8("https",_uStack0000000000000018);
  if (iVar5 == 0) {
    iVar5 = func_0x0077e6f8("socks5h",_uStack0000000000000018);
    if (iVar5 == 0) {
      iVar5 = func_0x0077e6f8("socks5",_uStack0000000000000018);
      if (iVar5 == 0) {
        iVar5 = func_0x0077e6f8("socks4a",_uStack0000000000000018);
        if (iVar5 == 0) {
          iVar5 = func_0x0077e6f8("socks4",_uStack0000000000000018);
          if ((iVar5 == 0) && (iVar5 = func_0x0077e6f8("socks",_uStack0000000000000018), iVar5 == 0)
             ) {
            iVar5 = func_0x0077e6f8("http",_uStack0000000000000018);
            if (iVar5 == 0) {
              func_0x0073c9e4();
              uVar9 = 7;
              goto LAB_0078800c;
            }
          }
          else {
            unaff_w23 = 4;
          }
        }
        else {
          unaff_w23 = 6;
        }
      }
      else {
        unaff_w23 = 5;
      }
    }
    else {
      unaff_w23 = 7;
    }
  }
  else {
    bVar4 = unaff_w23 == 3;
    unaff_w23 = 2;
    if (bVar4) {
      unaff_w23 = 3;
    }
  }
  uVar7 = func_0x00795250();
  if (((uVar7 & 1) == 0) && ((unaff_w23 & 0xfffffffe) == 2)) {
    func_0x0073c9e4();
    uVar9 = 4;
    goto LAB_0078800c;
  }
  uVar1 = unaff_w23 & 0xfffffffc;
  plVar2 = (long *)(unaff_x20 + 0xa8);
  if (uVar1 != 4) {
    plVar2 = (long *)(unaff_x20 + 0xe0);
  }
  *(char *)((long)plVar2 + 0x24) = (char)unaff_w23;
  iVar5 = func_0x00789530(param_1,2,&uStack0000000000000030,0x40);
  if (((iVar5 != 0xb) && (iVar5 != 0)) ||
     ((iVar5 = func_0x00789530(param_1,3,&uStack0000000000000028,0x40), iVar5 != 0xc && (iVar5 != 0)
      ))) {
    uVar9 = 0;
    goto LAB_0078800c;
  }
  if (uStack0000000000000030 != 0 || uStack0000000000000028 != 0) {
    (*pcRam0000000000a2b5f0)(plVar2[5]);
    plVar2[5] = uStack0000000000000030;
    uVar9 = func_0x00775ed0(unaff_x21 + 0x1330);
    uStack0000000000000030 = 0;
    if ((int)uVar9 != 0) goto LAB_0078800c;
    (*pcRam0000000000a2b5f0)(plVar2[6]);
    plVar2[6] = 0;
    if ((uStack0000000000000028 == 0) &&
       (uStack0000000000000028 = (*pcRam0000000000a2b600)(""), uStack0000000000000028 == 0))
    goto LAB_00788008;
    plVar2[6] = uStack0000000000000028;
    uVar9 = func_0x00775ed0(&UNK_00001338 + unaff_x21);
    uStack0000000000000028 = 0;
    if ((int)uVar9 != 0) goto LAB_0078800c;
    *(ulong *)(unaff_x20 + 0x398) = *(ulong *)(unaff_x20 + 0x398) | 4;
  }
  func_0x00789530(param_1,6,&uStack0000000000000038,0);
  if (uStack0000000000000038 == 0) {
    uVar6 = (uint)*(ushort *)(unaff_x21 + 0x688);
    if ((*(ushort *)(unaff_x21 + 0x688) == 0) && (uVar6 = 0x438, (unaff_w23 & 0xfffffffe) == 2)) {
      uVar6 = 0x1bb;
    }
code_r0x007882a4:
    *(uint *)(plVar2 + 4) = uVar6;
    if (((uVar1 == 4) || (*(int *)(unaff_x20 + 0x174) < 0)) || (*(long *)(unaff_x20 + 0xa8) == 0)) {
      *(uint *)(unaff_x20 + 0x174) = uVar6;
    }
  }
  else {
    uVar6 = _strtol(uStack0000000000000038,0,10);
    (*pcRam0000000000a2b5f0)(uStack0000000000000038);
    if (-1 < (int)uVar6) goto code_r0x007882a4;
  }
  iVar5 = func_0x00789530(param_1,5,&uStack0000000000000020,0x40);
  if (iVar5 == 0) {
    if ((uVar1 == 4) && (iVar5 = func_0x0077e6f8("localhost",uStack0000000000000020), iVar5 != 0)) {
      iVar5 = func_0x00789530(param_1,7,&uStack0000000000000010,0x40);
      if (iVar5 != 0) goto LAB_00788008;
      iVar5 = _strcmp("/",_uStack0000000000000010);
      if (iVar5 == 0) goto code_r0x0078836c;
      (*pcRam0000000000a2b5f0)(uStack0000000000000020);
      uStack0000000000000020 = (char *)func_0x00764704("localhost%s");
      if (uStack0000000000000020 == (char *)0x0) goto LAB_00788008;
      (*pcRam0000000000a2b5f0)(*(undefined8 *)(unaff_x20 + 0xa8));
      *(char **)(unaff_x20 + 0xa8) = uStack0000000000000020;
      *(char **)(unaff_x20 + 0xb8) = uStack0000000000000020;
    }
    else {
code_r0x0078836c:
      (*pcRam0000000000a2b5f0)(*plVar2);
      pcVar3 = uStack0000000000000020;
      *plVar2 = (long)uStack0000000000000020;
      if (*uStack0000000000000020 == '[') {
        lVar8 = _strlen(uStack0000000000000020);
        pcVar3[lVar8 + -1] = '\0';
        uStack0000000000000020 = uStack0000000000000020 + 1;
        func_0x00787c94(param_1);
      }
      plVar2[2] = (long)uStack0000000000000020;
    }
    uVar9 = 0;
    uStack0000000000000020 = (char *)0x0;
  }
  else {
LAB_00788008:
    uVar9 = 0x1b;
  }
LAB_0078800c:
  (*pcRam0000000000a2b5f0)(uStack0000000000000030);
  (*pcRam0000000000a2b5f0)(uStack0000000000000028);
  (*pcRam0000000000a2b5f0)(uStack0000000000000020);
  (*pcRam0000000000a2b5f0)(_uStack0000000000000018);
  (*pcRam0000000000a2b5f0)(_uStack0000000000000010);
  func_0x00789278(param_1);
  return uVar9;
}

