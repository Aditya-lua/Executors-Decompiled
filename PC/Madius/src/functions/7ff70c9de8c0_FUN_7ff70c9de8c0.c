/* 7ff70c9de8c0 FUN_7ff70c9de8c0 */

/* WARNING: Control flow encountered bad instruction data */

undefined8
FUN_7ff70c9de8c0(undefined8 param_1,longlong param_2,longlong param_3,undefined8 param_4,
                longlong param_5)

{
  if (param_3 != 0) {
    func_0x7ff70d8bea7d(0x2d2d2d2d2d455441,param_2,param_3 + param_2);
                    /* WARNING: Bad instruction - Truncating control flow here */
    halt_baddata();
  }
  if ((param_5 != 0) && (*(char *)(param_5 + 0xa37) == '\x01')) {
    FUN_7ff70c941400(param_5,&UNK_7ff70cb8f932,param_4);
  }
  return 0;
}


