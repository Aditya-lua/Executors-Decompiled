
void FUN_0078ca28(long param_1,long param_2,undefined8 param_3,undefined8 param_4)

{
  ulong uVar1;
  undefined8 uStack0000000000000000;
  char *pcStack0000000000000008;
  char *pcStack0000000000000010;
  
  if (*(int *)(param_1 + 8) < 1) {
    return;
  }
  uVar1 = (ulong)*(byte *)(param_2 + 0x18) & 0xf;
  if (((uint)uVar1 < 0xb) && ((0x707U >> uVar1 & 1) != 0)) {
    pcStack0000000000000008 =
         *(char **)(&UNK_00a20468 + *(long *)(&UNK_008ce848 + uVar1 * 8) * 0x10);
  }
  else {
    pcStack0000000000000008 = "???";
  }
  pcStack0000000000000010 = " NON-FINAL";
  if ((char)*(byte *)(param_2 + 0x18) < '\0') {
    pcStack0000000000000010 = "";
  }
  uStack0000000000000000 = param_4;
  func_0x0073ce84(param_3,"websocket, decoded %s [%s%s]");
  return;
}

