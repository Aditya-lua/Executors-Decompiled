
void FUN_000f7edc(long param_1)

{
  long in_x9;
  long lVar1;
  long lVar2;
  
  lVar1 = in_x9 << 4;
  do {
    while (lVar2 = *(long *)(param_1 + 0x88), *(char *)(param_1 + 0x48) == '\0') {
      *(long *)(lVar2 + 0x48) = param_1;
      *(undefined2 *)(lVar2 + 0x50) = 1;
      param_1 = param_1 + 0x90;
      lVar1 = lVar1 + -0x90;
      if (lVar1 == 0) {
        return;
      }
    }
    *(short *)(lVar2 + 0x50) = *(short *)(lVar2 + 0x50) + 1;
    param_1 = param_1 + 0x90;
    lVar1 = lVar1 + -0x90;
  } while (lVar1 != 0);
  return;
}

