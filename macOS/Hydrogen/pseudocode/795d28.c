
undefined8 FUN_00795d28(long param_1,long param_2)

{
  int iVar1;
  long lVar2;
  long lVar3;
  undefined8 uVar4;
  long unaff_x21;
  long unaff_x24;
  long *plVar5;
  long *unaff_x26;
  long unaff_x29;
  undefined1 auVar6 [16];
  ulong in_stack_00000028;
  undefined1 *in_stack_00000030;
  undefined1 uStack0000000000000038;
  
  do {
    iVar1 = func_0x00764560(param_1,param_2);
    param_1 = unaff_x21 + iVar1;
    plVar5 = unaff_x26;
    do {
      unaff_x26 = plVar5 + 1;
      if (*plVar5 == 0) {
        uRam0000000000a40a70 = param_1 - 0xa40a78;
        if (in_stack_00000028 != 0) {
          if (uRam0000000000a40a70 < in_stack_00000028) {
            _strcpy(in_stack_00000030,0xa40a78);
          }
          else {
            *in_stack_00000030 = 0;
          }
        }
        if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x60)) {
          return 0;
        }
        auVar6 = ___stack_chk_fail();
        if (puRam0000000000a2b7d8 != &UNK_00a20588 || lRam0000000000a2b7e0 == 0) {
          return 2;
        }
        lVar3 = func_0x0074cf0c("CURL_SSL_BACKEND");
        lVar2 = lRam0000000000a2b7e0;
        if ((lVar3 == 0) || (lRam0000000000a2b7e0 == 0)) goto code_r0x00795e44;
        iVar1 = func_0x0077e6f8(lVar3,*(undefined8 *)(lRam0000000000a2b7e0 + 8));
        plVar5 = (long *)0xa2b7e0;
        if (iVar1 == 0) goto code_r0x00795e94;
        goto code_r0x00795e40;
      }
      lVar2 = (**(code **)(*plVar5 + 0x30))(&uStack0000000000000038,200);
      plVar5 = unaff_x26;
    } while (lVar2 == 0);
    param_2 = (unaff_x24 - param_1) + 200;
    unaff_x21 = param_1;
  } while( true );
  while( true ) {
    iVar1 = func_0x0077e6f8(lVar3,*(undefined8 *)(plVar5[1] + 8));
    plVar5 = plVar5 + 1;
    if (iVar1 != 0) break;
code_r0x00795e94:
    if (plVar5[1] == 0) {
      lVar2 = lRam0000000000a2b7e0;
      goto code_r0x00795e44;
    }
  }
code_r0x00795e40:
  lVar2 = *plVar5;
code_r0x00795e44:
  puRam0000000000a2b7d8 = (undefined *)lVar2;
  (*pcRam0000000000a2b5f0)(lVar3);
                    /* WARNING: Could not recover jumptable at 0x00795e7c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  uVar4 = (**(code **)((long)puRam0000000000a2b7d8 + 0x58))(auVar6._0_8_,auVar6._8_8_);
  return uVar4;
}

