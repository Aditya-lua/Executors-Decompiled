
/* WARNING: Possible PIC construction at 0x0073feb8: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x0073febc) */

void thunk_FUN_0073fe7c(void)

{
  long unaff_x19;
  undefined1 *puVar1;
  long lVar2;
  long lVar3;
  long unaff_x29;
  undefined1 uStack0000000000000048;
  int in_stack_000002b0;
  long lStack_28;
  long lStack_20;
  
  if (0 < in_stack_000002b0) {
    lVar3 = 0;
    puVar1 = &uStack0000000000000048;
    do {
      func_0x00740678(puVar1);
      lVar3 = lVar3 + 1;
      puVar1 = puVar1 + 0x20;
    } while (lVar3 < in_stack_000002b0);
  }
  lVar3 = *(long *)(unaff_x19 + 0x1b8);
  if (lVar3 == 0) {
    if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x60)) {
      return;
    }
    unaff_x19 = ___stack_chk_fail();
  }
  lVar2 = *(long *)(unaff_x19 + 0x1b8);
  if ((lVar2 != 0) && (*(long *)(unaff_x19 + 0xd0) != 0)) {
    lStack_20 = lVar3;
    if (-1 < *(long *)(lVar2 + 8)) {
      *(undefined8 *)(lVar2 + 8) = 0xffffffffffffffff;
      lStack_28 = func_0x0076bfe0();
      if (lStack_28 != 0) {
        func_0x00768434(*(undefined8 *)(unaff_x19 + 0xd0),lStack_28);
        func_0x0078443c(&lStack_28);
      }
    }
    if (((-1 < *(long *)(lVar2 + 0x240)) &&
        (*(undefined8 *)(lVar2 + 0x240) = 0xffffffffffffffff, *(long *)(unaff_x19 + 0xd0) != 0)) &&
       (lStack_28 = func_0x0076bfe0(), lStack_28 != 0)) {
      func_0x00768434(*(undefined8 *)(unaff_x19 + 0xd0),lStack_28);
      func_0x0078443c(&lStack_28);
    }
  }
  return;
}

