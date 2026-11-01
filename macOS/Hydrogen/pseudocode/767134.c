
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

undefined8 FUN_00767134(int param_1,undefined8 param_2,char *param_3)

{
  long lVar1;
  int iVar2;
  ulong uVar3;
  char *pcVar4;
  long extraout_x1;
  long unaff_x19;
  undefined1 *unaff_x20;
  undefined8 unaff_x21;
  long unaff_x23;
  long unaff_x24;
  long unaff_x29;
  char *in_stack_00000020;
  
  if (param_1 == 0) {
    iVar2 = func_0x0074075c();
    if (iVar2 != 0) {
      unaff_x21 = 0x1b;
      param_3 = in_stack_00000020;
      goto LAB_0076753c;
    }
    uVar3 = func_0x00156654();
    param_3 = in_stack_00000020;
    if (1 < uVar3) {
      pcVar4 = (char *)func_0x00740a58();
      param_3 = pcVar4;
      func_0x0073c8fc();
      if (*pcVar4 != '\0' || pcVar4[1] != '\0') {
        func_0x0073c9e4();
        func_0x007406b0();
        unaff_x21 = 8;
        goto code_r0x00767548;
      }
      lVar1 = *(long *)(unaff_x19 + 0x1b0) + 0x28;
      uVar3 = func_0x00156654(lVar1);
      if (uVar3 < 2 || uVar3 - 2 == 0) {
        func_0x007406b0(lVar1,uVar3 - 2);
      }
      else {
        func_0x007406c8(lVar1);
      }
      if (*(char *)(unaff_x23 + 0x928) == '\x01') {
        unaff_x21 = func_0x0076759c();
        if ((int)unaff_x21 == 0) {
          unaff_x21 = func_0x00767824();
          *unaff_x20 = 1;
        }
        *(undefined4 *)(unaff_x24 + 0x3ec) = 0;
      }
      else {
        unaff_x21 = func_0x007678f4();
        if ((int)unaff_x21 == 0) {
          *(undefined8 *)(*(long *)(unaff_x19 + 0x18) + 1000) = _UNK_008cd8a0;
          goto code_r0x00767548;
        }
      }
      goto LAB_0076753c;
    }
  }
  else {
LAB_0076753c:
    if ((int)unaff_x21 != 0x51) goto code_r0x00767548;
  }
  unaff_x21 = 0;
code_r0x00767548:
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x58)) {
    return unaff_x21;
  }
  ___stack_chk_fail();
  *(undefined4 *)param_3 = *(undefined4 *)(extraout_x1 + 0x238);
  return 1;
}

