
void FUN_0006ce20(void)

{
  undefined8 *puVar1;
  int in_w8;
  undefined8 *in_x9;
  undefined8 *in_x10;
  int in_w11;
  undefined8 in_stack_00000000;
  long in_stack_00000010;
  undefined8 uStack0000000000000018;
  undefined8 in_stack_00000028;
  undefined8 uStack0000000000000030;
  undefined8 in_stack_00000040;
  undefined8 in_stack_00000048;
  undefined8 in_stack_00000058;
  
  if (in_w11 == 0x52) {
    puVar1 = in_x9;
    if (-1 < in_w8) {
      puVar1 = in_x10;
    }
    if ((*(byte *)((long)puVar1 + 5) & 0xdf) == 0x45) {
      if (-1 < in_w8) {
        in_x9 = &uStack0000000000000030;
      }
      if ((*(byte *)((long)in_x9 + 6) & 0xdf) == 0x52) goto LAB_0006ce7c;
    }
  }
  func_0x00060210(&uStack0000000000000018,0);
  if (in_stack_00000010 < 0) {
    __ZdlPv(in_stack_00000000);
  }
LAB_0006ce7c:
  if (in_stack_00000028._7_1_ < '\0') {
    __ZdlPv(uStack0000000000000018);
  }
  if (in_stack_00000040._7_1_ < '\0') {
    __ZdlPv(uStack0000000000000030);
  }
  if (in_stack_00000058._7_1_ < '\0') {
    __ZdlPv(in_stack_00000048);
  }
  return;
}

