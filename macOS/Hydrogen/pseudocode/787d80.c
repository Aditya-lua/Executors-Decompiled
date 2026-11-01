
undefined8 FUN_00787d80(undefined4 *param_1)

{
  int iVar1;
  undefined8 uVar2;
  long lVar3;
  long lVar4;
  dword *pdVar5;
  uint uVar6;
  long *plVar7;
  long unaff_x29;
  undefined1 auVar8 [16];
  undefined8 in_stack_00000020;
  undefined1 uStack0000000000000028;
  
  pdVar5 = &section_000000b8.reserved2;
  func_0x0077ea88(*param_1,&uStack0000000000000028);
  func_0x0073cab8();
  uVar2 = (*pcRam0000000000a2b5f0)(in_stack_00000020);
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x28)) {
    return uVar2;
  }
  auVar8 = ___stack_chk_fail();
  lVar3 = auVar8._0_8_;
  lVar4 = _strlen(pdVar5);
  if (lVar4 - 1U < 7) {
    iVar1 = func_0x0077e6e4((long)(char)*pdVar5);
    uVar6 = iVar1 + 0x7a40;
    if (lVar4 != 1) {
      iVar1 = func_0x0077e6e4((long)*(char *)((long)pdVar5 + 1));
      uVar6 = iVar1 + uVar6 * 0x20;
      if (lVar4 != 2) {
        iVar1 = func_0x0077e6e4((long)*(char *)((long)pdVar5 + 2));
        uVar6 = iVar1 + uVar6 * 0x20;
        if (lVar4 != 3) {
          iVar1 = func_0x0077e6e4((long)*(char *)((long)pdVar5 + 3));
          uVar6 = iVar1 + uVar6 * 0x20;
          if (lVar4 != 4) {
            iVar1 = func_0x0077e6e4((long)(char)pdVar5[1]);
            uVar6 = iVar1 + uVar6 * 0x20;
            if (lVar4 != 5) {
              iVar1 = func_0x0077e6e4((long)*(char *)((long)pdVar5 + 5));
              uVar6 = iVar1 + uVar6 * 0x20;
              if (lVar4 != 6) {
                iVar1 = func_0x0077e6e4((long)*(char *)((long)pdVar5 + 6));
                uVar6 = iVar1 + uVar6 * 0x20;
              }
            }
          }
        }
      }
    }
    plVar7 = *(long **)(&UNK_00a20020 + (ulong)(uVar6 % 0x43) * 8);
    if ((((plVar7 != (long *)0x0) && (iVar1 = func_0x0077e76c(pdVar5,*plVar7,lVar4), iVar1 != 0)) &&
        (*(char *)(*plVar7 + lVar4) == '\0')) &&
       (((*(uint *)((long)plVar7 + 0x94) & *(uint *)(lVar3 + 0x954)) != 0 &&
        ((((byte)(&UNK_00001344)[lVar3] >> 3 & 1) == 0 ||
         ((*(uint *)(lVar3 + 0x958) & *(uint *)((long)plVar7 + 0x94)) != 0)))))) {
      *(long **)(auVar8._8_8_ + 0x3a8) = plVar7;
      *(long **)(auVar8._8_8_ + 0x3a0) = plVar7;
      return 0;
    }
  }
  func_0x0073c9e4(lVar3,"Protocol \"%s\" %s%s");
  return 1;
}

