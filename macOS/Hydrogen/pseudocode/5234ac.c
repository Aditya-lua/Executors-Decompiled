
void FUN_005234ac(void)

{
  undefined8 *puVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  long lVar4;
  code *pcVar5;
  int iVar6;
  long unaff_x19;
  long unaff_x20;
  long *unaff_x22;
  undefined8 *unaff_x23;
  long unaff_x24;
  long *plVar7;
  undefined8 unaff_x25;
  long lVar8;
  undefined8 *puVar9;
  undefined8 *unaff_x26;
  long unaff_x27;
  long unaff_x28;
  long *in_stack_00000008;
  ulong in_stack_00000010;
  long in_stack_00000018;
  long *in_stack_00000020;
  undefined8 uStack0000000000000028;
  long in_stack_00000030;
  long in_stack_00000038;
  long in_stack_00000040;
  undefined8 in_stack_00000048;
  
code_r0x005234ac:
  iVar6 = _memcmp(unaff_x22[-1],unaff_x25,unaff_x24);
  lVar8 = in_stack_00000038;
  if (iVar6 != 0) goto LAB_00523494;
  if (in_stack_00000038 == uStack0000000000000028) {
    func_0x0050c0c0(&uStack0000000000000028,&UNK_009ea540);
  }
  puVar9 = (undefined8 *)(in_stack_00000030 + lVar8 * 0x10);
  *puVar9 = unaff_x25;
  puVar9[1] = unaff_x24;
  in_stack_00000038 = lVar8 + 1;
  puVar9 = unaff_x26;
  do {
    if (*(long *)(unaff_x28 + 0x10) != 0) {
      plVar7 = (long *)(*(long *)(unaff_x28 + 8) + 8);
      lVar8 = *(long *)(unaff_x28 + 0x10) << 4;
      do {
        if ((*plVar7 == unaff_x20) &&
           (iVar6 = _memcmp(plVar7[-1]), lVar4 = in_stack_00000038, iVar6 == 0)) {
          uVar2 = *puVar9;
          uVar3 = puVar9[1];
          if (in_stack_00000038 == uStack0000000000000028) {
            func_0x0050c0c0(&uStack0000000000000028,&UNK_009ea558);
          }
          puVar1 = (undefined8 *)(in_stack_00000030 + lVar4 * 0x10);
          *puVar1 = uVar2;
          puVar1[1] = uVar3;
          in_stack_00000038 = lVar4 + 1;
          break;
        }
        plVar7 = plVar7 + 2;
        lVar8 = lVar8 + -0x10;
      } while (lVar8 != 0);
    }
    do {
      unaff_x26 = puVar9 + 2;
      unaff_x28 = unaff_x28 + 0x18;
      if (unaff_x26 == unaff_x23) {
        in_stack_00000008[1] = in_stack_00000030;
        *in_stack_00000008 = uStack0000000000000028;
        in_stack_00000008[2] = in_stack_00000038;
        if (((in_stack_00000010 & 0x100000000) != 0) && (in_stack_00000040 != 0)) {
          func_0x00187bd4(in_stack_00000048,in_stack_00000040 << 4,8);
        }
        return;
      }
      if (unaff_x28 == unaff_x27) {
        func_0x007a23bc(&UNK_009e9bf8);
                    /* WARNING: Does not return */
        pcVar5 = (code *)SoftwareBreakpoint(1,0x523698);
        (*pcVar5)();
      }
      unaff_x25 = *unaff_x26;
      unaff_x24 = puVar9[3];
    } while ((unaff_x20 == unaff_x24) && (iVar6 = _memcmp(), puVar9 = unaff_x26, iVar6 == 0));
    unaff_x19 = in_stack_00000018;
    unaff_x22 = in_stack_00000020;
    do {
      if (*unaff_x22 == unaff_x24) goto code_r0x005234ac;
LAB_00523494:
      unaff_x22 = unaff_x22 + 2;
      unaff_x19 = unaff_x19 + -0x10;
      puVar9 = unaff_x26;
    } while (unaff_x19 != 0);
  } while( true );
}

