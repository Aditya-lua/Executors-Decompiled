
/* WARNING: Removing unreachable block (ram,0x00711330) */

ulong FUN_0071133c(void)

{
  long lVar1;
  int in_w8;
  long unaff_x29;
  undefined8 in_stack_00000028;
  
  if (in_w8 < 0) {
    __ZdlPv(*(undefined8 *)(unaff_x29 + -0x38));
    lVar1 = __Unwind_Resume();
    return (ulong)(*(long *)(lVar1 + 0x198) - *(long *)(lVar1 + 400)) >> 3;
  }
  do {
    __Unwind_Resume();
    __ZdlPv(in_stack_00000028);
  } while( true );
}

