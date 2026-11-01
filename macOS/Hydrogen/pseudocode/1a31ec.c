
void FUN_001a31ec(long param_1)

{
  long *plVar1;
  code *pcVar2;
  undefined1 in_ZR;
  long lVar3;
  undefined8 uVar4;
  long in_x11;
  long in_x12;
  undefined2 unaff_w19;
  long unaff_x20;
  undefined2 unaff_w21;
  long unaff_x22;
  long unaff_x23;
  long lVar5;
  long lVar6;
  long unaff_x25;
  long unaff_x27;
  long *unaff_x28;
  undefined8 in_stack_00000000;
  undefined8 *in_stack_00000008;
  long in_stack_00000010;
  undefined8 in_stack_00000018;
  undefined8 in_stack_00000020;
  
  do {
    if ((bool)in_ZR) {
      lVar3 = *(long *)(in_x12 + unaff_x22 + 8);
      lVar6 = *(long *)(in_x12 + unaff_x22 + 0x10);
      lVar5 = -0x8000000000000000;
    }
    else {
      lVar6 = *(long *)(in_x12 + unaff_x22 + 0x10);
      if (lVar6 < 0) {
        in_stack_00000000 = 0;
LAB_001a32b4:
        func_0x007a1f00(in_stack_00000000,unaff_x23,&UNK_009c24c0);
                    /* WARNING: Does not return */
        pcVar2 = (code *)SoftwareBreakpoint(1,0x1a32c8);
        (*pcVar2)();
      }
      uVar4 = *(undefined8 *)(in_x12 + unaff_x22 + 8);
      if (lVar6 == 0) {
        lVar3 = 1;
      }
      else {
        lVar3 = func_0x00187bd0(lVar6,1);
        if (lVar3 == 0) {
          unaff_x23 = lVar6;
          goto LAB_001a32b4;
        }
      }
      _memcpy(lVar3,uVar4,lVar6);
      in_x11 = -0x8000000000000000;
      param_1 = in_stack_00000010;
      unaff_x23 = lVar3;
      lVar5 = lVar6;
    }
    unaff_x27 = unaff_x27 + 1;
    plVar1 = (long *)(param_1 + unaff_x22);
    *plVar1 = lVar5;
    plVar1[1] = lVar3;
    plVar1[2] = lVar6;
    *(undefined2 *)(plVar1 + 3) = unaff_w21;
    unaff_x22 = unaff_x22 + 0x20;
    *(undefined2 *)((long)plVar1 + 0x1a) = unaff_w19;
    if ((unaff_x20 == unaff_x27) || (unaff_x25 == unaff_x22)) {
      in_stack_00000008[1] = in_stack_00000020;
      *in_stack_00000008 = in_stack_00000018;
      in_stack_00000008[2] = unaff_x20;
      return;
    }
    unaff_w21 = (undefined2)unaff_x28[7];
    unaff_w19 = *(undefined2 *)((long)unaff_x28 + 0x3a);
    in_ZR = unaff_x28[4] == in_x11;
    unaff_x28 = unaff_x28 + 4;
  } while( true );
}

