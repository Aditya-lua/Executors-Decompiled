
ulong FUN_0005cfe4(void)

{
  undefined1 **ppuVar1;
  undefined8 *****pppppuVar2;
  ulong uVar3;
  long *plVar4;
  undefined8 uVar5;
  undefined8 uVar6;
  long lVar7;
  long *unaff_x19;
  long unaff_x20;
  long unaff_x21;
  long unaff_x29;
  undefined1 auVar8 [16];
  undefined1 auVar9 [12];
  undefined1 uStack0000000000000006;
  undefined1 uStack0000000000000007;
  long lStack0000000000000008;
  long *plStack0000000000000020;
  long lStack0000000000000028;
  long *in_stack_00000040;
  undefined1 *puStack_60;
  ulong uStack_58;
  byte bStack_49;
  undefined8 *****pppppuStack_48;
  undefined2 uStack_40;
  undefined6 uStack_3e;
  byte bStack_31;
  
  uStack0000000000000006 = '\x01';
  plStack0000000000000020 = (long *)0x0;
  in_stack_00000040 = (long *)__Znwm(0x20);
  *in_stack_00000040 = (long)&UNK_009b8a58;
  in_stack_00000040[1] = (long)&uStack0000000000000006;
  in_stack_00000040[2] = (long)&uStack0000000000000007;
  in_stack_00000040[3] = (long)unaff_x19;
  plStack0000000000000020 = (long *)0x0;
  func_0x0005f7a8(unaff_x20 + 6,unaff_x20 + unaff_x21,0x2c,0xffffffffffffffff,
                  &lStack0000000000000028);
  if (in_stack_00000040 == &lStack0000000000000028) {
    lVar7 = 4;
    plVar4 = &lStack0000000000000028;
LAB_0005d058:
    (**(code **)(*plVar4 + lVar7 * 8))();
  }
  else if (in_stack_00000040 != (long *)0x0) {
    lVar7 = 5;
    plVar4 = in_stack_00000040;
    goto LAB_0005d058;
  }
  if (plStack0000000000000020 == &lStack0000000000000008) {
    lVar7 = 4;
    plVar4 = &lStack0000000000000008;
  }
  else {
    if (plStack0000000000000020 == (long *)0x0) goto LAB_0005d094;
    lVar7 = 5;
    plVar4 = plStack0000000000000020;
  }
  (**(code **)(*plVar4 + lVar7 * 8))();
LAB_0005d094:
  uVar3 = (ulong)(uStack0000000000000006 != '\0' && *unaff_x19 != unaff_x19[1]);
  if (*(long *)PTR____stack_chk_guard_009b01e8 != *(long *)(unaff_x29 + -0x28)) {
    do {
      auVar9 = ___stack_chk_fail(uVar3);
      if (auVar9._8_4_ == 0) {
        auVar8 = __Unwind_Resume(auVar9._0_8_);
        bStack_31 = 9;
        uStack_40 = 0x20;
        pppppuStack_48 = (undefined8 *****)s_HTTP_1_1_008d1b99._0_8_;
        __ZNSt3__19to_stringEi(&puStack_60,auVar8._8_8_);
        ppuVar1 = (undefined1 **)puStack_60;
        if (-1 < (char)bStack_49) {
          uStack_58 = (ulong)bStack_49;
          ppuVar1 = &puStack_60;
        }
        __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm
                  (&pppppuStack_48,ppuVar1,uStack_58);
        if ((char)bStack_49 < '\0') {
          __ZdlPv(puStack_60);
        }
        __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm
                  (&pppppuStack_48," ",1);
        uVar5 = func_0x00067a7c(auVar8._8_8_);
        uVar6 = _strlen();
        __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm
                  (&pppppuStack_48,uVar5,uVar6);
        __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm
                  (&pppppuStack_48,"\r\n",2);
        uVar3 = CONCAT62(uStack_3e,uStack_40);
        pppppuVar2 = pppppuStack_48;
        if (-1 < (char)bStack_31) {
          uVar3 = (ulong)bStack_31;
          pppppuVar2 = &pppppuStack_48;
        }
        uVar3 = (**(code **)(*auVar8._0_8_ + 0x30))(auVar8._0_8_,pppppuVar2,uVar3);
        if ((char)bStack_31 < '\0') {
          __ZdlPv(pppppuStack_48);
          return uVar3;
        }
        return uVar3;
      }
      if (in_stack_00000040 == &lStack0000000000000028) {
        lVar7 = 4;
        plVar4 = &lStack0000000000000028;
LAB_0005d0f0:
        (**(code **)(*plVar4 + lVar7 * 8))();
      }
      else if (in_stack_00000040 != (long *)0x0) {
        lVar7 = 5;
        plVar4 = in_stack_00000040;
        goto LAB_0005d0f0;
      }
      if (plStack0000000000000020 == &lStack0000000000000008) {
        lVar7 = 4;
        plVar4 = &lStack0000000000000008;
code_r0x0005d120:
        (**(code **)(*plVar4 + lVar7 * 8))();
      }
      else if (plStack0000000000000020 != (long *)0x0) {
        lVar7 = 5;
        plVar4 = plStack0000000000000020;
        goto code_r0x0005d120;
      }
      ___cxa_begin_catch(auVar9._0_8_);
      ___cxa_end_catch();
      uVar3 = 0;
    } while (*(long *)PTR____stack_chk_guard_009b01e8 != *(long *)(unaff_x29 + -0x28));
  }
  return uVar3;
}

