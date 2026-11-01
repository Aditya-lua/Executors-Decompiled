
undefined8 FUN_00787d28(code *param_1,undefined8 param_2,undefined8 param_3,char *param_4)

{
  int iVar1;
  undefined8 uVar2;
  long lVar3;
  long lVar4;
  uint uVar5;
  long *plVar6;
  long unaff_x29;
  undefined1 auVar7 [16];
  
  uVar2 = (*param_1)();
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x28)) {
    return uVar2;
  }
  auVar7 = ___stack_chk_fail();
  lVar3 = auVar7._0_8_;
  lVar4 = _strlen(param_4);
  if (lVar4 - 1U < 7) {
    iVar1 = func_0x0077e6e4((long)*param_4);
    uVar5 = iVar1 + 0x7a40;
    if (lVar4 != 1) {
      iVar1 = func_0x0077e6e4((long)param_4[1]);
      uVar5 = iVar1 + uVar5 * 0x20;
      if (lVar4 != 2) {
        iVar1 = func_0x0077e6e4((long)param_4[2]);
        uVar5 = iVar1 + uVar5 * 0x20;
        if (lVar4 != 3) {
          iVar1 = func_0x0077e6e4((long)param_4[3]);
          uVar5 = iVar1 + uVar5 * 0x20;
          if (lVar4 != 4) {
            iVar1 = func_0x0077e6e4((long)param_4[4]);
            uVar5 = iVar1 + uVar5 * 0x20;
            if (lVar4 != 5) {
              iVar1 = func_0x0077e6e4((long)param_4[5]);
              uVar5 = iVar1 + uVar5 * 0x20;
              if (lVar4 != 6) {
                iVar1 = func_0x0077e6e4((long)param_4[6]);
                uVar5 = iVar1 + uVar5 * 0x20;
              }
            }
          }
        }
      }
    }
    plVar6 = *(long **)(&UNK_00a20020 + (ulong)(uVar5 % 0x43) * 8);
    if ((((plVar6 != (long *)0x0) && (iVar1 = func_0x0077e76c(param_4,*plVar6,lVar4), iVar1 != 0))
        && (*(char *)(*plVar6 + lVar4) == '\0')) &&
       (((*(uint *)((long)plVar6 + 0x94) & *(uint *)(lVar3 + 0x954)) != 0 &&
        ((((byte)(&UNK_00001344)[lVar3] >> 3 & 1) == 0 ||
         ((*(uint *)(lVar3 + 0x958) & *(uint *)((long)plVar6 + 0x94)) != 0)))))) {
      *(long **)(auVar7._8_8_ + 0x3a8) = plVar6;
      *(long **)(auVar7._8_8_ + 0x3a0) = plVar6;
      return 0;
    }
  }
  func_0x0073c9e4(lVar3,"Protocol \"%s\" %s%s");
  return 1;
}

