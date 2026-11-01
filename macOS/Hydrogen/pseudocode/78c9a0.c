
void FUN_0078c9a0(long param_1,undefined8 param_2,undefined8 param_3)

{
  char in_NG;
  char in_OV;
  int in_w9;
  ulong uVar1;
  undefined8 uStack0000000000000000;
  char *pcStack0000000000000008;
  char *pcStack0000000000000010;
  
  if (in_NG != in_OV || in_w9 < 1) {
    return;
  }
  uVar1 = (ulong)*(byte *)(param_1 + 0x18) & 0xf;
  if (((uint)uVar1 < 0xb) && ((0x707U >> uVar1 & 1) != 0)) {
    pcStack0000000000000008 =
         *(char **)(&UNK_00a20468 + *(long *)(&UNK_008ce848 + uVar1 * 8) * 0x10);
  }
  else {
    pcStack0000000000000008 = "???";
  }
  pcStack0000000000000010 = " NON-FINAL";
  if ((char)*(byte *)(param_1 + 0x18) < '\0') {
    pcStack0000000000000010 = "";
  }
  uStack0000000000000000 = param_3;
  func_0x0073ce84(param_2,"websocket, decoded %s [%s%s]");
  return;
}

