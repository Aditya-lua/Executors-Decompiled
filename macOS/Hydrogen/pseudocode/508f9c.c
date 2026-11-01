
void FUN_00508f9c(void)

{
  undefined4 *puVar1;
  long lVar2;
  undefined8 uVar3;
  ulong uVar4;
  undefined2 uVar5;
  code *pcVar6;
  ulong uVar7;
  undefined8 *unaff_x19;
  long unaff_x20;
  undefined4 *unaff_x21;
  undefined4 *unaff_x22;
  ulong unaff_x23;
  ulong unaff_x26;
  undefined8 *unaff_x28;
  undefined8 *in_stack_00000000;
  long in_stack_00000010;
  undefined8 in_stack_00000018;
  undefined8 in_stack_00000020;
  undefined8 uStack0000000000000030;
  undefined8 in_stack_00000038;
  undefined8 in_stack_00000040;
  undefined8 in_stack_00000048;
  undefined8 in_stack_00000050;
  
  if (unaff_x23 == 2) {
    if (in_stack_00000010 != 1) {
      do {
        if (unaff_x26 < 2) goto LAB_005091e4;
        uVar3 = *unaff_x19;
        uVar4 = unaff_x19[1];
        uVar7 = unaff_x26 - 2;
        *(undefined2 *)unaff_x22 = *(undefined2 *)unaff_x21;
        unaff_x26 = uVar7 - uVar4;
        if (uVar7 < uVar4) goto LAB_005091e4;
        lVar2 = (long)unaff_x22 + 2;
        unaff_x22 = (undefined4 *)(lVar2 + uVar4);
        _memcpy(lVar2,uVar3);
        unaff_x19 = unaff_x19 + 2;
      } while (unaff_x19 != unaff_x28);
    }
  }
  else if (unaff_x23 == 3) {
    if (in_stack_00000010 != 1) {
      do {
        if (unaff_x26 < 3) goto LAB_005091e4;
        uVar3 = *unaff_x19;
        uVar4 = unaff_x19[1];
        uVar7 = unaff_x26 - 3;
        uVar5 = *(undefined2 *)unaff_x21;
        *(undefined1 *)((long)unaff_x22 + 2) = *(undefined1 *)((long)unaff_x21 + 2);
        *(undefined2 *)unaff_x22 = uVar5;
        unaff_x26 = uVar7 - uVar4;
        if (uVar7 < uVar4) goto LAB_005091e4;
        lVar2 = (long)unaff_x22 + 3;
        unaff_x22 = (undefined4 *)(lVar2 + uVar4);
        _memcpy(lVar2,uVar3);
        unaff_x19 = unaff_x19 + 2;
      } while (unaff_x19 != unaff_x28);
    }
  }
  else if (unaff_x23 == 4) {
    if (in_stack_00000010 != 1) {
      do {
        if (unaff_x26 < 4) {
LAB_005091e4:
          uStack0000000000000030 = &UNK_009e8d38;
          in_stack_00000038 = 1;
          in_stack_00000048 = 0;
          in_stack_00000050 = 0;
          in_stack_00000040 = 8;
          func_0x007a2420(&uStack0000000000000030,&UNK_009e8d48);
                    /* WARNING: Does not return */
          pcVar6 = (code *)SoftwareBreakpoint(1,0x509214);
          (*pcVar6)();
        }
        uVar3 = *unaff_x19;
        uVar4 = unaff_x19[1];
        uVar7 = unaff_x26 - 4;
        *unaff_x22 = *unaff_x21;
        unaff_x26 = uVar7 - uVar4;
        if (uVar7 < uVar4) goto LAB_005091e4;
        puVar1 = unaff_x22 + 1;
        unaff_x22 = (undefined4 *)((long)puVar1 + uVar4);
        _memcpy(puVar1,uVar3);
        unaff_x19 = unaff_x19 + 2;
      } while (unaff_x19 != unaff_x28);
    }
  }
  else if (in_stack_00000010 != 1) {
    do {
      uVar4 = unaff_x26 - unaff_x23;
      if (unaff_x26 < unaff_x23) goto LAB_005091e4;
      uVar3 = *unaff_x19;
      uVar7 = unaff_x19[1];
      _memcpy(unaff_x22);
      unaff_x26 = uVar4 - uVar7;
      if (uVar4 < uVar7) goto LAB_005091e4;
      lVar2 = (long)unaff_x22 + unaff_x23;
      unaff_x22 = (undefined4 *)(lVar2 + uVar7);
      _memcpy(lVar2,uVar3,uVar7);
      unaff_x19 = unaff_x19 + 2;
    } while (unaff_x19 != unaff_x28);
  }
  in_stack_00000000[1] = in_stack_00000020;
  *in_stack_00000000 = in_stack_00000018;
  in_stack_00000000[2] = unaff_x20 - unaff_x26;
  return;
}

