/* 7ff70c959390 FUN_7ff70c959390 */

void FUN_7ff70c959390(longlong param_1,longlong param_2,longlong param_3)

{
  longlong lVar1;
  bool bVar2;
  
  if (param_3 != 0) {
    lVar1 = 0;
    do {
      *(undefined *)(param_1 + lVar1) = (&UNK_7ff70cb50760)[*(byte *)(param_2 + lVar1)];
      if (*(char *)(param_2 + lVar1) == '\0') {
        return;
      }
      bVar2 = param_3 + -1 != lVar1;
      lVar1 = lVar1 + 1;
    } while (bVar2);
  }
  return;
}


