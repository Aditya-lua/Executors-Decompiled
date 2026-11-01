
void thunk_FUN_002165a4(void)

{
  long lVar1;
  long lVar2;
  long lVar3;
  code *pcVar4;
  long lVar5;
  long lVar6;
  long in_x9;
  long *unaff_x19;
  long unaff_x21;
  long unaff_x22;
  long *unaff_x26;
  long *unaff_x27;
  undefined8 in_stack_00000008;
  long *plStack0000000000000018;
  
  do {
    lVar1 = *unaff_x27;
    lVar6 = unaff_x27[1];
    lVar2 = unaff_x27[2];
    lVar3 = unaff_x27[3];
    unaff_x27 = unaff_x27 + 4;
    *(long **)(unaff_x21 + 8) = unaff_x27;
    lVar5 = lVar2;
    if (lVar1 == in_x9 && lVar6 == unaff_x22) {
      plStack0000000000000018 = unaff_x19;
      if (lVar3 < 0) {
        in_stack_00000008 = 0;
LAB_0021661c:
        func_0x007a1f00(in_stack_00000008,lVar3,&UNK_009c6fd0);
                    /* WARNING: Does not return */
        pcVar4 = (code *)SoftwareBreakpoint(1,0x216634);
        (*pcVar4)();
      }
      if (lVar3 == 0) {
        lVar5 = 1;
      }
      else {
        lVar5 = func_0x00187bd0(lVar3,1);
        if (lVar5 == 0) goto LAB_0021661c;
      }
      _memcpy(lVar5,lVar2,lVar3);
      in_x9 = -0x7fffffffffffffff;
      lVar6 = lVar3;
    }
    *unaff_x19 = lVar1;
    unaff_x19[1] = lVar6;
    unaff_x19[2] = lVar5;
    unaff_x19[3] = lVar3;
    unaff_x19 = unaff_x19 + 4;
    if (unaff_x27 == unaff_x26) {
      return;
    }
  } while( true );
}

