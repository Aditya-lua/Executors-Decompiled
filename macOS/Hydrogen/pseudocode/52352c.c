
void FUN_0052352c(long param_1)

{
  undefined8 *puVar1;
  undefined8 uVar2;
  long lVar3;
  undefined8 uVar4;
  long lVar5;
  code *pcVar6;
  int iVar7;
  long lVar8;
  long unaff_x20;
  long *plVar9;
  undefined8 *unaff_x23;
  long *unaff_x24;
  long unaff_x25;
  undefined8 *unaff_x26;
  long unaff_x27;
  long lVar10;
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
  
code_r0x0052352c:
  iVar7 = _memcmp(param_1);
  lVar10 = in_stack_00000038;
  if (iVar7 != 0) goto LAB_0052350c;
  uVar2 = *unaff_x26;
  uVar4 = unaff_x26[1];
  if (in_stack_00000038 == uStack0000000000000028) {
    func_0x0050c0c0(&uStack0000000000000028,&UNK_009ea558);
  }
  puVar1 = (undefined8 *)(in_stack_00000030 + lVar10 * 0x10);
  *puVar1 = uVar2;
  puVar1[1] = uVar4;
  in_stack_00000038 = lVar10 + 1;
  do {
    do {
      do {
        lVar10 = unaff_x28;
        puVar1 = unaff_x26 + 2;
        unaff_x28 = lVar10 + 0x18;
        if (puVar1 == unaff_x23) {
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
          pcVar6 = (code *)SoftwareBreakpoint(1,0x523698);
          (*pcVar6)();
        }
        uVar2 = *puVar1;
        lVar3 = unaff_x26[3];
        unaff_x26 = puVar1;
      } while ((unaff_x20 == lVar3) && (iVar7 = _memcmp(), iVar7 == 0));
      lVar8 = in_stack_00000018;
      plVar9 = in_stack_00000020;
      do {
        if ((*plVar9 == lVar3) &&
           (iVar7 = _memcmp(plVar9[-1],uVar2,lVar3), lVar5 = in_stack_00000038, iVar7 == 0)) {
          if (in_stack_00000038 == uStack0000000000000028) {
            func_0x0050c0c0(&uStack0000000000000028,&UNK_009ea540);
          }
          puVar1 = (undefined8 *)(in_stack_00000030 + lVar5 * 0x10);
          *puVar1 = uVar2;
          puVar1[1] = lVar3;
          in_stack_00000038 = lVar5 + 1;
          break;
        }
        plVar9 = plVar9 + 2;
        lVar8 = lVar8 + -0x10;
      } while (lVar8 != 0);
    } while (*(long *)(lVar10 + 0x28) == 0);
    unaff_x24 = (long *)(*(long *)(lVar10 + 0x20) + 8);
    unaff_x25 = *(long *)(lVar10 + 0x28) << 4;
    do {
      if (*unaff_x24 == unaff_x20) {
        param_1 = unaff_x24[-1];
        goto code_r0x0052352c;
      }
LAB_0052350c:
      unaff_x24 = unaff_x24 + 2;
      unaff_x25 = unaff_x25 + -0x10;
    } while (unaff_x25 != 0);
  } while( true );
}

