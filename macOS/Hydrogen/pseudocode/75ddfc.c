
undefined8 FUN_0075ddfc(void)

{
  int iVar1;
  ulong uVar2;
  undefined8 uVar3;
  long lVar4;
  ulong uVar5;
  long *plVar6;
  long lVar7;
  long unaff_x20;
  long lVar8;
  undefined8 uVar9;
  long *plVar10;
  long *plVar11;
  long unaff_x28;
  long unaff_x29;
  undefined8 uStack0000000000000028;
  undefined8 uStack0000000000000048;
  undefined8 uStack0000000000000050;
  undefined8 uStack0000000000000060;
  
  uVar2 = _ldap_set_option(0,&UNK_00006002);
  if ((int)uVar2 == 0) {
    uStack0000000000000028 = CONCAT44(uStack0000000000000028._4_4_,2);
    uVar2 = _ldap_set_option(0,&UNK_00006006,&uStack0000000000000028);
    if ((int)uVar2 != 0) {
      _ldap_err2string();
      goto LAB_0075dea0;
    }
    lVar8 = _ldap_init();
    if (lVar8 == 0) {
      func_0x0073c9e4();
      uVar2 = 0;
      uVar9 = 7;
      goto LAB_0075deb4;
    }
    uStack0000000000000028 = CONCAT44(uStack0000000000000028._4_4_,1);
    uVar2 = _ldap_set_option(lVar8,0x6000,&uStack0000000000000028);
    if ((int)uVar2 == 0) {
      uVar2 = _ldap_simple_bind_s(lVar8);
      if ((int)uVar2 == 0) {
        func_0x0077093c();
        lVar7 = *(long *)(unaff_x29 + -0x58);
        uVar2 = _ldap_search_s(lVar8,*(undefined8 *)(lVar7 + 0x20),*(undefined4 *)(lVar7 + 0x30),
                               *(undefined8 *)(lVar7 + 0x38),*(undefined8 *)(lVar7 + 0x28),0,
                               &uStack0000000000000060);
        if ((uVar2 & 0xfffffffb) == 0) {
          lVar7 = _ldap_first_entry(lVar8,uStack0000000000000060);
          if (lVar7 == 0) {
            uVar9 = 0;
          }
          else {
            do {
              uStack0000000000000028 = 0;
              uVar3 = _ldap_get_dn(lVar8);
              _strlen();
              uVar9 = func_0x007738a0();
              if (((int)uVar9 != 0) || (uVar9 = func_0x007738a0(), (int)uVar9 != 0)) {
                _ldap_memfree(uVar3);
                goto LAB_0075deb4;
              }
              uVar9 = func_0x007738a0();
              _ldap_memfree(uVar3);
              if ((int)uVar9 != 0) goto LAB_0075deb4;
              lVar4 = _ldap_first_attribute(lVar8,lVar7,&uStack0000000000000028);
              if (lVar4 != 0) {
                do {
                  uVar5 = _strlen(lVar4);
                  plVar6 = (long *)_ldap_get_values_len(lVar8,lVar7,lVar4);
                  if (plVar6 != (long *)0x0) {
                    if (*plVar6 != 0) {
                      if (uVar5 < 8) {
                        plVar11 = plVar6;
                        do {
                          plVar11 = plVar11 + 1;
                          uVar9 = func_0x007738a0();
                          if (((((int)uVar9 != 0) || (uVar9 = func_0x007738a0(), (int)uVar9 != 0))
                              || (uVar9 = func_0x007738a0(), (int)uVar9 != 0)) ||
                             ((uVar9 = func_0x007738a0(), (int)uVar9 != 0 ||
                              (uVar9 = func_0x007738a0(), (int)uVar9 != 0)))) goto code_r0x0075e3a0;
                        } while (*plVar11 != 0);
                      }
                      else {
                        plVar11 = plVar6;
                        do {
                          plVar10 = plVar11 + 1;
                          uVar9 = func_0x007738a0();
                          if ((((int)uVar9 != 0) || (uVar9 = func_0x007738a0(), (int)uVar9 != 0)) ||
                             (uVar9 = func_0x007738a0(), (int)uVar9 != 0)) goto code_r0x0075e3a0;
                          iVar1 = _strcmp(";binary",uVar5 + lVar4 + -7);
                          if (iVar1 == 0) {
                            uVar9 = func_0x00729570(((undefined8 *)*plVar11)[1],
                                                    *(undefined8 *)*plVar11,&uStack0000000000000050,
                                                    &uStack0000000000000048);
                            if ((int)uVar9 != 0) goto code_r0x0075e3a0;
                            if (uStack0000000000000048 != 0) {
                              uVar9 = func_0x007738a0();
                              (*pcRam0000000000a2b5f0)(uStack0000000000000050);
                              if ((int)uVar9 != 0) goto code_r0x0075e3a0;
                            }
                          }
                          else {
                            uVar9 = func_0x007738a0();
                            if ((int)uVar9 != 0) goto code_r0x0075e3a0;
                          }
                          uVar9 = func_0x007738a0();
                          if ((int)uVar9 != 0) goto code_r0x0075e3a0;
                          plVar11 = plVar10;
                        } while (*plVar10 != 0);
                      }
                    }
                    _ldap_value_free_len(plVar6);
                  }
                  _ldap_memfree(lVar4);
                  uVar9 = func_0x007738a0();
                  if ((int)uVar9 != 0) goto LAB_0075deb4;
                  lVar4 = _ldap_next_attribute(lVar8,lVar7,uStack0000000000000028);
                } while (lVar4 != 0);
              }
              if (uStack0000000000000028 != 0) {
                _ber_free(uStack0000000000000028,0);
              }
              lVar7 = _ldap_next_entry(lVar8,lVar7);
            } while (lVar7 != 0);
            uVar9 = 0;
          }
        }
        else {
          _ldap_err2string(uVar2);
          func_0x0073c9e4();
          uVar9 = 0x27;
        }
      }
      else {
        _ldap_err2string();
        func_0x0073c9e4();
        uVar9 = 0x26;
      }
      goto LAB_0075deb4;
    }
    _ldap_err2string();
    func_0x0073c9e4();
  }
  else {
    _ldap_err2string();
LAB_0075dea0:
    func_0x0073c9e4();
    lVar8 = 0;
  }
  uVar9 = 0x3a;
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
    func_0x0073cab8();
  }
  if (*(long *)(unaff_x29 + -0x58) != 0) {
    _ldap_free_urldesc();
  }
  if (lVar8 != 0) {
    _ldap_unbind_s(lVar8);
  }
  func_0x00783c98();
  func_0x00734f74();
  return uVar9;
code_r0x0075e3a0:
  _ldap_value_free_len(plVar6);
  _ldap_memfree(lVar4);
  if (uStack0000000000000028 != 0) {
    _ber_free(uStack0000000000000028,0);
  }
  goto LAB_0075deb4;
}

