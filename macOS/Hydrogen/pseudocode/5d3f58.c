
/* WARNING: Possible PIC construction at 0x005d3f78: Changing call to branch */

void FUN_005d3f58(long param_1)

{
  long lVar1;
  long *plVar2;
  long *unaff_x19;
  long unaff_x20;
  long unaff_x21;
  long unaff_x22;
  long unaff_x23;
  undefined8 unaff_x29;
  undefined *puVar3;
  undefined8 in_stack_00000030;
  undefined *in_stack_00000038;
  undefined1 uStack0000000000000040;
  
  do {
    func_0x005d2c74(param_1);
    do {
      do {
        unaff_x22 = unaff_x22 + 0x18;
        unaff_x21 = unaff_x21 + 1;
        if (unaff_x21 == 1) {
          if (*unaff_x19 == 0) {
            if (unaff_x19[3] == 0) {
              return;
            }
            register0x00000008 = (BADSPACEBASE *)&uStack0000000000000040;
            unaff_x29 = in_stack_00000030;
            puVar3 = in_stack_00000038;
          }
          else {
            puVar3 = &UNK_005d3f7c;
          }
          *(undefined8 *)((long)register0x00000008 + -0x10) = unaff_x29;
          *(undefined **)((long)register0x00000008 + -8) = puVar3;
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
          (*(code *)PTR__free_00a24e58)();
          return;
        }
        plVar2 = *(long **)(unaff_x20 + unaff_x22);
      } while (plVar2 == (long *)0x0);
      lVar1 = *plVar2;
      *plVar2 = lVar1 + unaff_x23;
      LORelease();
    } while (lVar1 != 1);
    param_1 = unaff_x20 + unaff_x22;
  } while( true );
}

