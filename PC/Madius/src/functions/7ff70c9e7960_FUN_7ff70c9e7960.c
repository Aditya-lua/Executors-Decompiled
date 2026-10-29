/* 7ff70c9e7960 FUN_7ff70c9e7960 */

/* WARNING: Control flow encountered bad instruction data */
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

longlong * FUN_7ff70c9e7960(longlong *param_1)

{
  int iVar1;
  longlong *in_RAX;
  bool bVar2;
  char cVar3;
  char cVar4;
  undefined1 auStack_58 [60];
  undefined4 uStack_1c;
  undefined8 uStack_18;
  
  uStack_18 = 0xfffffffffffffffe;
  if (*(char *)((longlong)param_1 + 9) == '\x01') {
    cVar4 = '\0';
    cVar3 = *param_1 < 0;
    if (*param_1 != 0) {
      in_RAX = (longlong *)func_0x7ff70d6b86cc();
      if (cVar4 != cVar3) {
                    /* WARNING: Bad instruction - Truncating control flow here */
        halt_baddata();
      }
      bVar2 = (int)in_RAX == 0;
      if (bVar2) {
        uStack_1c = func_0x7ff70d6eb14b();
        if (bVar2) {
          func_0x7ff70c9e79f0(auStack_58,&UNK_7ff70cb90c9d,&uStack_1c);
                    /* WARNING: Subroutine does not return */
          FUN_7ff70cb12a50(auStack_58,&UNK_7ff70cbcadd0);
        }
        FUN_7ff70caa4f40();
        *param_1 = (longlong)&DAT_7ff70cc1b150;
        iVar1 = func_0x7ff70cb12570();
        if (iVar1 == 0) {
          if (_DAT_7ff70cc1b19c != 0x7fffffff) {
            *(undefined1 *)(param_1 + 1) = 1;
            return param_1;
          }
          _DAT_7ff70cc1b19c = 0x7ffffffe;
                    /* WARNING: Subroutine does not return */
          FUN_7ff70cb124d0(6);
        }
                    /* WARNING: Subroutine does not return */
        FUN_7ff70cb124d0(5);
      }
    }
  }
  *(undefined1 *)((longlong)param_1 + 9) = 0;
  return in_RAX;
}


