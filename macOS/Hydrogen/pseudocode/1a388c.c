
void FUN_001a388c(void)

{
  long *plVar1;
  code *pcVar2;
  long lVar3;
  undefined8 *unaff_x19;
  long unaff_x20;
  long *unaff_x21;
  long unaff_x22;
  long lVar4;
  long lVar5;
  long unaff_x25;
  long unaff_x26;
  long unaff_x27;
  long *unaff_x28;
  undefined8 in_stack_00000000;
  undefined8 in_stack_00000008;
  undefined8 in_stack_00000010;
  
  do {
    plVar1 = unaff_x21 + 3;
    unaff_x20 = unaff_x20 + -0x18;
    if ((unaff_x25 == unaff_x26) || (unaff_x20 == 0)) {
      unaff_x19[1] = in_stack_00000010;
      *unaff_x19 = in_stack_00000008;
      unaff_x19[2] = unaff_x25;
      return;
    }
    if (unaff_x21[1] == unaff_x27) {
      lVar3 = unaff_x21[2];
      lVar4 = *plVar1;
      lVar5 = -0x8000000000000000;
    }
    else {
      lVar4 = *plVar1;
      if (lVar4 < 0) {
        in_stack_00000000 = 0;
LAB_001a3944:
        func_0x007a1f00(in_stack_00000000,unaff_x22,&UNK_009c24c0);
                    /* WARNING: Does not return */
        pcVar2 = (code *)SoftwareBreakpoint(1,0x1a395c);
        (*pcVar2)();
      }
      lVar5 = unaff_x21[2];
      if (lVar4 == 0) {
        lVar3 = 1;
      }
      else {
        lVar3 = func_0x00187bd0(lVar4,1);
        if (lVar3 == 0) {
          unaff_x22 = lVar4;
          goto LAB_001a3944;
        }
      }
      _memcpy(lVar3,lVar5,lVar4);
      unaff_x22 = lVar3;
      lVar5 = lVar4;
    }
    unaff_x26 = unaff_x26 + 1;
    unaff_x28[2] = lVar5;
    unaff_x28[3] = lVar3;
    unaff_x28[4] = lVar4;
    unaff_x21 = plVar1;
    unaff_x28 = unaff_x28 + 3;
  } while( true );
}

