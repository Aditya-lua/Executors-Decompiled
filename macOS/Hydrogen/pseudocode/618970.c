
ulong FUN_00618970(undefined8 param_1,undefined8 param_2,ulong param_3,undefined8 param_4,
                  undefined8 param_5)

{
  long lVar1;
  long lVar2;
  ulong uVar3;
  ulong uVar4;
  uint unaff_w21;
  undefined1 auVar5 [16];
  undefined8 in_stack_00000000;
  long in_stack_00000010;
  undefined8 in_stack_00000018;
  long in_stack_00000028;
  
  if (in_stack_00000028 < 0) {
    __ZdlPv(in_stack_00000018);
  }
  if (in_stack_00000010 < 0) {
    __ZdlPv(in_stack_00000000);
    unaff_w21 = unaff_w21 & 1;
  }
  if (unaff_w21 != 0) {
    ___cxa_free_exception();
  }
  auVar5 = __Unwind_Resume();
  lVar1 = auVar5._0_8_;
  switch(*(undefined4 *)(lVar1 + 0x28)) {
  case 0:
    uVar4 = 0;
    *(undefined8 *)(lVar1 + 0x20) = 0;
    if (*(long *)(lVar1 + 0x70) == 0) goto code_r0x00618a78;
    while (uVar4 < param_3) {
      lVar2 = *(long *)(lVar1 + 0x78);
      if (lVar2 == *(long *)(lVar1 + 0x70)) {
code_r0x00618ac8:
        lVar2 = func_0x0066ad70(lVar1,1,*(undefined8 *)(lVar1 + 0x48),*(undefined8 *)(lVar1 + 0x40),
                                0,param_5,&UNK_008ba5c8);
        if (lVar2 != 0) {
          lVar2 = *(long *)(lVar1 + 0x40);
          goto code_r0x00618b84;
        }
        lVar2 = 0;
        *(undefined8 *)(lVar1 + 0x78) = 0;
      }
code_r0x00618af4:
      uVar4 = param_3 - *(long *)(lVar1 + 0x20);
      uVar3 = *(long *)(lVar1 + 0x70) - lVar2;
      if (uVar4 <= uVar3) {
        uVar3 = uVar4;
      }
      lVar2 = func_0x0066ad70(lVar1,2,auVar5._8_8_ + *(long *)(lVar1 + 0x20),uVar3,0,param_5,
                              &UNK_008ba5c8);
      if (lVar2 != 0) {
        param_3 = uVar3 - *(long *)(lVar1 + 0x20);
        goto code_r0x00618b98;
      }
      uVar4 = *(long *)(lVar1 + 0x20) + uVar3;
      *(ulong *)(lVar1 + 0x20) = uVar4;
      *(ulong *)(lVar1 + 0x78) = *(long *)(lVar1 + 0x78) + uVar3;
    }
    break;
  case 1:
    goto code_r0x00618ac8;
  case 2:
    lVar2 = *(long *)(lVar1 + 0x78);
    goto code_r0x00618af4;
  case 3:
code_r0x00618a78:
    lVar2 = func_0x0066ad70(lVar1,3,auVar5._8_8_,param_3,0,param_5,&UNK_008ba5c8);
    if (lVar2 != 0) {
      param_3 = param_3 - *(long *)(lVar1 + 0x20);
      goto code_r0x00618b98;
    }
    break;
  case 4:
    goto code_r0x00618b54;
  default:
    goto code_r0x00618bb8;
  }
  if ((int)param_4 != 0) {
code_r0x00618b54:
    lVar2 = func_0x0066ad70(lVar1,4,*(undefined8 *)(lVar1 + 0x68),*(undefined8 *)(lVar1 + 0x60),
                            param_4,param_5,&UNK_008ba5c8);
    if (lVar2 != 0) {
      lVar2 = *(long *)(lVar1 + 0x60);
code_r0x00618b84:
      param_3 = lVar2 - *(long *)(lVar1 + 0x20);
code_r0x00618b98:
      if (param_3 < 2) {
        param_3 = 1;
      }
      return param_3;
    }
    *(undefined8 *)(lVar1 + 0x78) = 0;
  }
code_r0x00618bb8:
  return 0;
}

