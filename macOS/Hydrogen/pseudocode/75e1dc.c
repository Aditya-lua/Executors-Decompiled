
undefined8 FUN_0075e1dc(void)

{
  int iVar1;
  undefined8 uVar2;
  ulong uVar3;
  undefined8 uVar4;
  long lVar5;
  long unaff_x20;
  long unaff_x21;
  int unaff_w22;
  long unaff_x25;
  long *unaff_x26;
  long *plVar6;
  long unaff_x28;
  long unaff_x29;
  long in_stack_00000010;
  long *in_stack_00000020;
  long in_stack_00000028;
  undefined8 uStack0000000000000048;
  undefined8 uStack0000000000000050;
  long in_stack_00000060;
  
  do {
    iVar1 = _strcmp(";binary",in_stack_00000010);
    if (iVar1 == 0) {
      uVar4 = func_0x00729570(((undefined8 *)unaff_x26[-1])[1],*(undefined8 *)unaff_x26[-1],
                              &uStack0000000000000050,&uStack0000000000000048);
      if ((int)uVar4 != 0) {
LAB_0075e3a0:
        _ldap_value_free_len(in_stack_00000020);
        _ldap_memfree(unaff_x25);
        if (in_stack_00000028 != 0) {
          _ber_free(in_stack_00000028,0);
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
        return uVar4;
      }
      if (uStack0000000000000048 != 0) {
        uVar4 = func_0x007738a0();
        (*pcRam0000000000a2b5f0)(uStack0000000000000050);
        if ((int)uVar4 != 0) goto LAB_0075e3a0;
      }
    }
    else {
      uVar4 = func_0x007738a0();
      if ((int)uVar4 != 0) goto LAB_0075e3a0;
    }
    uVar4 = func_0x007738a0();
    if ((int)uVar4 != 0) goto LAB_0075e3a0;
    if (*unaff_x26 == 0) {
      while( true ) {
        do {
          _ldap_value_free_len(in_stack_00000020);
          do {
            _ldap_memfree(unaff_x25);
            uVar4 = func_0x007738a0();
            if ((int)uVar4 != 0) goto LAB_0075deb4;
            unaff_x25 = _ldap_next_attribute();
            if (unaff_x25 == 0) {
              do {
                if (in_stack_00000028 != 0) {
                  _ber_free(in_stack_00000028,0);
                }
                lVar5 = _ldap_next_entry();
                if (lVar5 == 0) {
                  uVar4 = 0;
                  goto LAB_0075deb4;
                }
                in_stack_00000028 = 0;
                uVar2 = _ldap_get_dn();
                _strlen();
                uVar4 = func_0x007738a0();
                if (((int)uVar4 != 0) || (uVar4 = func_0x007738a0(), (int)uVar4 != 0)) {
                  _ldap_memfree(uVar2);
                  goto LAB_0075deb4;
                }
                uVar4 = func_0x007738a0();
                _ldap_memfree(uVar2);
                if ((int)uVar4 != 0) goto LAB_0075deb4;
                unaff_x25 = _ldap_first_attribute();
              } while (unaff_x25 == 0);
            }
            uVar3 = _strlen(unaff_x25);
            unaff_x26 = (long *)_ldap_get_values_len();
          } while (unaff_x26 == (long *)0x0);
          in_stack_00000020 = unaff_x26;
        } while (*unaff_x26 == 0);
        if (7 < uVar3) break;
        plVar6 = unaff_x26;
        do {
          plVar6 = plVar6 + 1;
          uVar4 = func_0x007738a0();
          if (((((int)uVar4 != 0) || (uVar4 = func_0x007738a0(), (int)uVar4 != 0)) ||
              (uVar4 = func_0x007738a0(), (int)uVar4 != 0)) ||
             ((uVar4 = func_0x007738a0(), (int)uVar4 != 0 ||
              (uVar4 = func_0x007738a0(), (int)uVar4 != 0)))) goto LAB_0075e3a0;
        } while (*plVar6 != 0);
      }
      in_stack_00000010 = uVar3 + unaff_x25 + -7;
    }
    unaff_x26 = unaff_x26 + 1;
    uVar4 = func_0x007738a0();
    if ((((int)uVar4 != 0) || (uVar4 = func_0x007738a0(), (int)uVar4 != 0)) ||
       (uVar4 = func_0x007738a0(), (int)uVar4 != 0)) goto LAB_0075e3a0;
  } while( true );
}

