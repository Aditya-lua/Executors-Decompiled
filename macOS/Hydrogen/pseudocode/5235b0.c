
void FUN_005235b0(void)

{
  undefined8 *puVar1;
  long lVar2;
  code *pcVar3;
  int iVar4;
  long unaff_x19;
  long unaff_x20;
  undefined8 *unaff_x23;
  long *plVar5;
  long lVar6;
  undefined8 uVar7;
  undefined8 *puVar8;
  undefined8 *unaff_x26;
  long unaff_x27;
  long unaff_x28;
  long *in_stack_00000008;
  ulong in_stack_00000010;
  undefined8 uStack0000000000000028;
  long in_stack_00000030;
  long in_stack_00000038;
  long in_stack_00000040;
  undefined8 in_stack_00000048;
  
  do {
    iVar4 = _memcmp();
    puVar8 = unaff_x26;
    if (iVar4 == 0) goto LAB_00523580;
    do {
      puVar8 = unaff_x26;
      if (*(long *)(unaff_x28 + 0x10) != 0) {
        plVar5 = (long *)(*(long *)(unaff_x28 + 8) + 8);
        lVar6 = *(long *)(unaff_x28 + 0x10) << 4;
        do {
          if ((*plVar5 == unaff_x20) &&
             (iVar4 = _memcmp(plVar5[-1]), lVar2 = in_stack_00000038, iVar4 == 0)) {
            uVar7 = *unaff_x26;
            if (in_stack_00000038 == uStack0000000000000028) {
              func_0x0050c0c0(&uStack0000000000000028);
            }
            puVar1 = (undefined8 *)(in_stack_00000030 + lVar2 * 0x10);
            *puVar1 = uVar7;
            puVar1[1] = unaff_x19;
            in_stack_00000038 = lVar2 + 1;
            break;
          }
          plVar5 = plVar5 + 2;
          lVar6 = lVar6 + -0x10;
        } while (lVar6 != 0);
      }
LAB_00523580:
      unaff_x26 = puVar8 + 2;
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
        pcVar3 = (code *)SoftwareBreakpoint(1,0x523698);
        (*pcVar3)();
      }
      unaff_x19 = puVar8[3];
    } while (unaff_x20 != unaff_x19);
  } while( true );
}

