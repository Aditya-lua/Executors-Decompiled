
/* WARNING: Possible PIC construction at 0x0070f340: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x0070f344) */
/* WARNING: Removing unreachable block (ram,0x0070f390) */

void thunk_FUN_0070f324(void)

{
  long lVar1;
  long *unaff_x19;
  long lVar2;
  long lVar3;
  undefined8 in_stack_00000040;
  long in_stack_00000050;
  
  if (in_stack_00000050 < 0) {
    __ZdlPv(in_stack_00000040);
  }
  lVar2 = *unaff_x19;
  if (lVar2 != 0) {
    lVar3 = unaff_x19[1];
    lVar1 = lVar2;
    if (lVar3 != lVar2) {
      do {
        lVar3 = lVar3 + -0x28;
      } while (lVar3 != lVar2);
      lVar1 = *unaff_x19;
    }
    unaff_x19[1] = lVar2;
    __ZdlPv(lVar1);
  }
  return;
}

