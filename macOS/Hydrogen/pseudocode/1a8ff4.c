
void FUN_001a8ff4(long *param_1,undefined8 param_2,long param_3)

{
  ulong uVar1;
  long unaff_x19;
  long unaff_x20;
  long unaff_x21;
  long unaff_x22;
  ulong unaff_x23;
  long unaff_x24;
  long *plVar2;
  long *unaff_x25;
  long in_stack_00000018;
  
code_r0x001a8ff4:
  do {
    func_0x00187bd4(param_1[1],param_3,1);
    do {
      do {
        while( true ) {
          plVar2 = unaff_x25;
          unaff_x25 = plVar2 + 4;
          unaff_x21 = unaff_x21 + 1;
          unaff_x20 = unaff_x20 + -1;
          if (unaff_x20 == 0) {
            if (in_stack_00000018 != 0) {
              func_0x00187bd4();
            }
            return;
          }
          param_3 = *unaff_x25;
          uVar1 = param_3 + unaff_x22;
          if (3 < (ulong)(param_3 + unaff_x22)) {
            uVar1 = unaff_x23;
          }
          if (1 < (long)uVar1) break;
          if (uVar1 != 0) {
            if (uVar1 == 1) goto code_r0x001a8fe4;
code_r0x001a8fc0:
            if ((param_3 != unaff_x24) && (param_1 = unaff_x25, param_3 != 0))
            goto code_r0x001a8ff4;
          }
        }
      } while (uVar1 == 2);
      if (uVar1 != 3) goto code_r0x001a8fc0;
code_r0x001a8fe4:
      param_1 = (long *)(unaff_x19 + unaff_x21 * 0x20 + 8);
      param_3 = plVar2[5];
    } while (param_3 == 0);
  } while( true );
}

