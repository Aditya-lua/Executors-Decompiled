
void FUN_006f427c(long param_1)

{
  long lVar1;
  long lVar2;
  long in_x9;
  long unaff_x19;
  
  for (; param_1 < in_x9; param_1 = param_1 + 1) {
    *(char *)(unaff_x19 + *(int *)(unaff_x19 + param_1 * 4) + 0xa0) = (char)param_1;
    in_x9 = (long)*(int *)(unaff_x19 + 0x4a4);
  }
  lVar2 = 0x400;
  do {
    lVar1 = unaff_x19 + lVar2;
    if (*(char *)(lVar1 + 0x9f) < '\0') {
      *(undefined1 *)(lVar1 + 0x9f) = *(undefined1 *)(lVar1 + 0xa0);
    }
    lVar2 = lVar2 + -1;
  } while (lVar2 != 0);
  return;
}

