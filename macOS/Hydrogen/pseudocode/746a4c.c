
undefined8 FUN_00746a4c(void)

{
  int in_w8;
  long in_x9;
  long unaff_x19;
  char *pcStack0000000000000000;
  
  if ((in_w8 >= 1 && *(int *)(in_x9 + 0x570) != 0) && (in_w8 < 1 || -1 < *(int *)(in_x9 + 0x570))) {
    if (*(long *)(unaff_x19 + 0x18) == 0) {
      pcStack0000000000000000 = "???";
    }
    else {
      pcStack0000000000000000 =
           *(char **)(&UNK_00a1e570 + (ulong)*(byte *)(*(long *)(unaff_x19 + 0x18) + 0x4f6) * 8);
    }
    func_0x0073cfbc();
  }
  return 0;
}

