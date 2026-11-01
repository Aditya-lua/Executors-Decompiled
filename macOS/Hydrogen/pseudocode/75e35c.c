
undefined8 FUN_0075e35c(long param_1)

{
  int iVar1;
  undefined8 uVar2;
  ulong uVar3;
  long *plVar4;
  long lVar5;
  long unaff_x20;
  long unaff_x21;
  int unaff_w22;
  undefined8 uVar6;
  long *plVar7;
  long *plVar8;
  long unaff_x28;
  long unaff_x29;
  long in_stack_00000028;
  undefined8 uStack0000000000000048;
  undefined8 uStack0000000000000050;
  long in_stack_00000060;
  
  while( true ) {
    if (param_1 == 0) {
      do {
        if (in_stack_00000028 != 0) {
          _ber_free(in_stack_00000028,0);
        }
        lVar5 = _ldap_next_entry();
        if (lVar5 == 0) {
          uVar6 = 0;
          goto LAB_0075deb4;
        }
        in_stack_00000028 = 0;
        uVar2 = _ldap_get_dn();
        _strlen();
        uVar6 = func_0x007738a0();
        if (((int)uVar6 != 0) || (uVar6 = func_0x007738a0(), (int)uVar6 != 0)) {
          _ldap_memfree(uVar2);
          goto LAB_0075deb4;
        }
        uVar6 = func_0x007738a0();
        _ldap_memfree(uVar2);
        if ((int)uVar6 != 0) goto LAB_0075deb4;
        param_1 = _ldap_first_attribute();
      } while (param_1 == 0);
    }
    uVar3 = _strlen(param_1);
    plVar4 = (long *)_ldap_get_values_len();
    if (plVar4 != (long *)0x0) {
      if (*plVar4 != 0) {
        if (uVar3 < 8) {
          plVar8 = plVar4;
          do {
            plVar8 = plVar8 + 1;
            uVar6 = func_0x007738a0();
            if (((((int)uVar6 != 0) || (uVar6 = func_0x007738a0(), (int)uVar6 != 0)) ||
                (uVar6 = func_0x007738a0(), (int)uVar6 != 0)) ||
               ((uVar6 = func_0x007738a0(), (int)uVar6 != 0 ||
                (uVar6 = func_0x007738a0(), (int)uVar6 != 0)))) goto code_r0x0075e3a0;
          } while (*plVar8 != 0);
        }
        else {
          plVar8 = plVar4;
          do {
            plVar7 = plVar8 + 1;
            uVar6 = func_0x007738a0();
            if ((((int)uVar6 != 0) || (uVar6 = func_0x007738a0(), (int)uVar6 != 0)) ||
               (uVar6 = func_0x007738a0(), (int)uVar6 != 0)) goto code_r0x0075e3a0;
            iVar1 = _strcmp(";binary",uVar3 + param_1 + -7);
            if (iVar1 == 0) {
              uVar6 = func_0x00729570(((undefined8 *)*plVar8)[1],*(undefined8 *)*plVar8,
                                      &uStack0000000000000050,&uStack0000000000000048);
              if ((int)uVar6 != 0) goto code_r0x0075e3a0;
              if (uStack0000000000000048 != 0) {
                uVar6 = func_0x007738a0();
                (*pcRam0000000000a2b5f0)(uStack0000000000000050);
                if ((int)uVar6 != 0) goto code_r0x0075e3a0;
              }
            }
            else {
              uVar6 = func_0x007738a0();
              if ((int)uVar6 != 0) goto code_r0x0075e3a0;
            }
            uVar6 = func_0x007738a0();
            if ((int)uVar6 != 0) goto code_r0x0075e3a0;
            plVar8 = plVar7;
          } while (*plVar7 != 0);
        }
      }
      _ldap_value_free_len(plVar4);
    }
    _ldap_memfree(param_1);
    uVar6 = func_0x007738a0();
    if ((int)uVar6 != 0) break;
    param_1 = _ldap_next_attribute();
  }
LAB_0075deb4:
  if (in_stack_00000060 != 0) {
    _ldap_msgfree();
  }
  if (((unaff_w22 == 4) && (*(char *)(unaff_x28 + 3) < '\0')) &&
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
  if (unaff_x21 != 0) {
    _ldap_unbind_s();
  }
  func_0x00783c98();
  func_0x00734f74();
  return uVar6;
code_r0x0075e3a0:
  _ldap_value_free_len(plVar4);
  _ldap_memfree(param_1);
  if (in_stack_00000028 != 0) {
    _ber_free(in_stack_00000028,0);
  }
  goto LAB_0075deb4;
}

