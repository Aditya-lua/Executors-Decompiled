
void FUN_000c418c(long param_1)

{
  long in_x9;
  undefined1 in_w10;
  uint in_w14;
  
  if (*(char *)(param_1 + 0xcf) != '\0' && (in_w14 & 9) == 1) {
    in_w10 = 1;
  }
  *(undefined1 *)(param_1 + 0xcb) = in_w10;
  if (*(int *)(&UNK_0000173c + in_x9) != -1) {
    *(bool *)(param_1 + 0xcb) = *(int *)(&UNK_0000173c + in_x9) != 0;
  }
  *(bool *)(param_1 + 0xcc) = *(int *)(&UNK_00001740 + in_x9) - 1U < 0xfffffffe;
  return;
}

