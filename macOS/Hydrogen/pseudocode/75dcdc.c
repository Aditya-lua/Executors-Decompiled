
undefined8 FUN_0075dcdc(char *param_1)

{
  int iVar1;
  ulong uVar2;
  undefined8 uVar3;
  long lVar4;
  ulong uVar5;
  long *plVar6;
  long lVar7;
  long unaff_x19;
  long unaff_x20;
  undefined8 uVar8;
  long lVar9;
  int unaff_w22;
  undefined8 uVar10;
  char *pcVar11;
  long *plVar12;
  long *plVar13;
  long unaff_x28;
  long unaff_x29;
  char *pcStack0000000000000000;
  undefined8 uStack0000000000000028;
  undefined1 uStack0000000000000030;
  undefined8 uStack0000000000000048;
  undefined8 uStack0000000000000050;
  undefined8 uStack0000000000000058;
  undefined8 uStack0000000000000060;
  
  pcStack0000000000000000 = "encrypted";
  if (unaff_w22 == 0) {
    pcStack0000000000000000 = param_1;
  }
  func_0x0073cab8();
  uVar8 = *(undefined8 *)(unaff_x19 + 0x68);
  if (*(long *)((long)&linkedit_data_command_00001318.cmd + unaff_x20) == 0) {
    uVar3 = 0;
    uVar10 = 0;
  }
  else {
    uVar3 = *(undefined8 *)(unaff_x19 + 0x1e0);
    uVar10 = *(undefined8 *)(unaff_x19 + 0x1e8);
  }
  _ldap_set_option(0,&UNK_00005005,&uStack0000000000000030);
  _ldap_set_option(0,0x11,(long)&uStack0000000000000058 + 4);
  if (unaff_w22 == 0) {
    if (1 < *(byte *)(unaff_x20 + 0xa14)) {
      func_0x0073c9e4();
      pcVar11 = (char *)0x0;
      lVar9 = 0;
      uVar2 = 0;
      uVar8 = 4;
      goto LAB_0075deb4;
    }
    lVar9 = _ldap_init(uVar8,*(undefined4 *)(unaff_x19 + 0x174));
    if (lVar9 == 0) {
      pcStack0000000000000000 = *(char **)(unaff_x19 + 0x70);
      func_0x0073c9e4();
      pcVar11 = (char *)0x0;
      uVar2 = 0;
      uVar8 = 7;
      goto LAB_0075deb4;
    }
    iVar1 = _ldap_simple_bind_s(lVar9,uVar3,uVar10);
    if (iVar1 != 0) {
      uStack0000000000000058._4_4_ = 2;
      _ldap_set_option(lVar9,0x11,(long)&uStack0000000000000058 + 4);
code_r0x0075dfd0:
      uVar2 = _ldap_simple_bind_s(lVar9,uVar3,uVar10);
      if ((int)uVar2 != 0) {
        pcStack0000000000000000 = (char *)_ldap_err2string();
        func_0x0073c9e4();
        pcVar11 = (char *)0x0;
        uVar8 = 0x26;
        goto LAB_0075deb4;
      }
    }
    func_0x0077093c();
    lVar7 = *(long *)(unaff_x29 + -0x58);
    uVar2 = _ldap_search_s(lVar9,*(undefined8 *)(lVar7 + 0x20),*(undefined4 *)(lVar7 + 0x30),
                           *(undefined8 *)(lVar7 + 0x38),*(undefined8 *)(lVar7 + 0x28),0,
                           &uStack0000000000000060);
    if ((uVar2 & 0xfffffffb) == 0) {
      lVar7 = _ldap_first_entry(lVar9,uStack0000000000000060);
      if (lVar7 == 0) {
        pcVar11 = (char *)0x0;
        uVar8 = 0;
      }
      else {
        pcVar11 = (char *)0x0;
        do {
          uStack0000000000000028 = 0;
          uVar3 = _ldap_get_dn(lVar9);
          _strlen();
          uVar8 = func_0x007738a0();
          if (((int)uVar8 != 0) || (uVar8 = func_0x007738a0(), (int)uVar8 != 0)) {
            _ldap_memfree(uVar3);
            goto LAB_0075deb4;
          }
          uVar8 = func_0x007738a0();
          _ldap_memfree(uVar3);
          if ((int)uVar8 != 0) goto LAB_0075deb4;
          lVar4 = _ldap_first_attribute(lVar9,lVar7,&uStack0000000000000028);
          if (lVar4 != 0) {
            do {
              uVar5 = _strlen(lVar4);
              plVar6 = (long *)_ldap_get_values_len(lVar9,lVar7,lVar4);
              if (plVar6 != (long *)0x0) {
                if (*plVar6 != 0) {
                  if (uVar5 < 8) {
                    plVar13 = plVar6;
                    do {
                      plVar13 = plVar13 + 1;
                      uVar8 = func_0x007738a0();
                      if (((((int)uVar8 != 0) || (uVar8 = func_0x007738a0(), (int)uVar8 != 0)) ||
                          (uVar8 = func_0x007738a0(), (int)uVar8 != 0)) ||
                         ((uVar8 = func_0x007738a0(), (int)uVar8 != 0 ||
                          (uVar8 = func_0x007738a0(), (int)uVar8 != 0)))) goto LAB_0075e3a0;
                    } while (*plVar13 != 0);
                  }
                  else {
                    plVar13 = plVar6;
                    do {
                      plVar12 = plVar13 + 1;
                      uVar8 = func_0x007738a0();
                      if ((((int)uVar8 != 0) || (uVar8 = func_0x007738a0(), (int)uVar8 != 0)) ||
                         (uVar8 = func_0x007738a0(), (int)uVar8 != 0)) goto LAB_0075e3a0;
                      iVar1 = _strcmp(";binary",uVar5 + lVar4 + -7);
                      if (iVar1 == 0) {
                        uVar8 = func_0x00729570(((undefined8 *)*plVar13)[1],*(undefined8 *)*plVar13,
                                                &uStack0000000000000050,&uStack0000000000000048);
                        if ((int)uVar8 != 0) goto LAB_0075e3a0;
                        if (uStack0000000000000048 != 0) {
                          uVar8 = func_0x007738a0();
                          (*pcRam0000000000a2b5f0)(uStack0000000000000050);
                          if ((int)uVar8 != 0) goto LAB_0075e3a0;
                        }
                      }
                      else {
                        uVar8 = func_0x007738a0();
                        if ((int)uVar8 != 0) goto LAB_0075e3a0;
                      }
                      uVar8 = func_0x007738a0();
                      if ((int)uVar8 != 0) goto LAB_0075e3a0;
                      plVar13 = plVar12;
                    } while (*plVar12 != 0);
                  }
                }
                _ldap_value_free_len(plVar6);
              }
              _ldap_memfree(lVar4);
              uVar8 = func_0x007738a0();
              if ((int)uVar8 != 0) goto LAB_0075deb4;
              lVar4 = _ldap_next_attribute(lVar9,lVar7,uStack0000000000000028);
            } while (lVar4 != 0);
          }
          if (uStack0000000000000028 != 0) {
            _ber_free(uStack0000000000000028,0);
          }
          lVar7 = _ldap_next_entry(lVar9,lVar7);
          pcVar11 = (char *)(ulong)((int)pcVar11 + 1);
        } while (lVar7 != 0);
        uVar8 = 0;
      }
    }
    else {
      pcStack0000000000000000 = (char *)_ldap_err2string(uVar2);
      func_0x0073c9e4();
      pcVar11 = (char *)0x0;
      uVar8 = 0x27;
    }
    goto LAB_0075deb4;
  }
  if ((*(byte *)(unaff_x19 + 0x321) & 1) == 0) {
    uStack0000000000000028 = uStack0000000000000028 & 0xffffffff00000000;
    uVar2 = _ldap_set_option(0,&UNK_00006006,&uStack0000000000000028);
    iVar1 = (int)uVar2;
joined_r0x0075df7c:
    if (iVar1 != 0) {
      pcStack0000000000000000 = (char *)_ldap_err2string();
LAB_0075dea0:
      func_0x0073c9e4();
      lVar9 = 0;
      goto code_r0x0075deac;
    }
    lVar9 = _ldap_init(uVar8,*(undefined4 *)(unaff_x19 + 0x174));
    if (lVar9 != 0) {
      uStack0000000000000028 = CONCAT44(uStack0000000000000028._4_4_,1);
      uVar2 = _ldap_set_option(lVar9,0x6000,&uStack0000000000000028);
      if ((int)uVar2 == 0) goto code_r0x0075dfd0;
      pcStack0000000000000000 = (char *)_ldap_err2string();
      func_0x0073c9e4();
      goto code_r0x0075deac;
    }
    pcStack0000000000000000 = *(char **)(unaff_x19 + 0x70);
    func_0x0073c9e4();
    uVar2 = 0;
    uVar8 = 7;
  }
  else {
    pcVar11 = *(char **)(unaff_x19 + 0x2c0);
    if ((*(long *)(unaff_x20 + 0x598) == 0) ||
       (iVar1 = func_0x0077e6f8(*(long *)(unaff_x20 + 0x598),"PEM"), iVar1 != 0)) {
      if (pcVar11 == (char *)0x0) {
        uVar2 = 0;
      }
      else {
        if ((*(char *)(unaff_x28 + 3) < '\0') &&
           ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                      unaff_x20 + 0x18) == 0 ||
            (0 < *(int *)(*(long *)(
                                   "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                   + unaff_x20 + 0x18) + 8))))) {
          pcStack0000000000000000 = pcVar11;
          func_0x0073cab8();
        }
        uVar2 = _ldap_set_option(0,&UNK_00006002,pcVar11);
        if ((int)uVar2 == 0) {
          uStack0000000000000028 = CONCAT44(uStack0000000000000028._4_4_,2);
          uVar2 = _ldap_set_option(0,&UNK_00006006,&uStack0000000000000028);
          iVar1 = (int)uVar2;
          goto joined_r0x0075df7c;
        }
        pcStack0000000000000000 = (char *)_ldap_err2string();
      }
      goto LAB_0075dea0;
    }
    func_0x0073c9e4();
    lVar9 = 0;
    uVar2 = 0;
code_r0x0075deac:
    uVar8 = 0x3a;
  }
  pcVar11 = (char *)0x0;
LAB_0075deb4:
  if (uStack0000000000000060 != 0) {
    _ldap_msgfree();
  }
  if ((((int)uVar2 == 4) && (*(char *)(unaff_x28 + 3) < '\0')) &&
     ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                unaff_x20 + 0x18) == 0 ||
      (0 < *(int *)(*(long *)(
                             "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                             + unaff_x20 + 0x18) + 8))))) {
    pcStack0000000000000000 = pcVar11;
    func_0x0073cab8();
  }
  if (*(long *)(unaff_x29 + -0x58) != 0) {
    _ldap_free_urldesc();
  }
  if (lVar9 != 0) {
    _ldap_unbind_s(lVar9);
  }
  func_0x00783c98();
  func_0x00734f74();
  return uVar8;
LAB_0075e3a0:
  _ldap_value_free_len(plVar6);
  _ldap_memfree(lVar4);
  if (uStack0000000000000028 != 0) {
    _ber_free(uStack0000000000000028,0);
  }
  goto LAB_0075deb4;
}

