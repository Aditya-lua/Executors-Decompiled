
void FUN_0078cac4(long param_1,undefined8 param_2,undefined8 param_3)

{
  char in_w8;
  long in_x9;
  ulong in_x10;
  undefined8 uStack0000000000000000;
  char *pcStack0000000000000008;
  char *pcStack0000000000000010;
  undefined8 uStack0000000000000018;
  undefined8 uStack0000000000000020;
  
  if ((in_x10 & 1) == 0) {
    pcStack0000000000000008 = "???";
  }
  else {
    pcStack0000000000000008 =
         *(char **)(&UNK_00a20468 + *(long *)(&UNK_008ce848 + in_x9 * 8) * 0x10);
  }
  pcStack0000000000000010 = " NON-FINAL";
  if (in_w8 < '\0') {
    pcStack0000000000000010 = "";
  }
  uStack0000000000000018 = *(undefined8 *)(param_1 + 8);
  uStack0000000000000020 = *(undefined8 *)(param_1 + 0x10);
  uStack0000000000000000 = param_3;
  func_0x0073ce84(param_2,"websocket, decoded %s [%s%s payload=%ld/%ld]");
  return;
}

