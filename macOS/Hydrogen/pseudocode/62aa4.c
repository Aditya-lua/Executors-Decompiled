
long FUN_00062aa4(void)

{
  long lVar1;
  
  __ZdlPv();
  lVar1 = __Unwind_Resume();
  if (*(char *)(lVar1 + 0x1f) < '\0') {
    __ZdlPv(*(undefined8 *)(lVar1 + 8));
    return lVar1;
  }
  return lVar1;
}

