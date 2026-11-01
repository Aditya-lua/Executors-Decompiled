
/* WARNING: Possible PIC construction at 0x00079a80: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x00079a84) */

undefined8 * FUN_00079a78(void)

{
  long lVar1;
  undefined8 uStack0000000000000008;
  char in_stack_00000018;
  
  __ZdlPv();
  lVar1 = uStack0000000000000008;
  uStack0000000000000008 = 0;
  if (lVar1 != 0) {
    if (in_stack_00000018 != '\0') {
      func_0x00078220(lVar1 + 0x40,*(undefined1 *)(lVar1 + 0x38));
      if (*(char *)(lVar1 + 0x37) < '\0') {
        __ZdlPv(*(undefined8 *)(lVar1 + 0x20));
      }
    }
    __ZdlPv(lVar1);
  }
  return &uStack0000000000000008;
}

