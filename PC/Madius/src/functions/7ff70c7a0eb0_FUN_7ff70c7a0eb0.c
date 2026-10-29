/* 7ff70c7a0eb0 FUN_7ff70c7a0eb0 */

/* WARNING: Control flow encountered bad instruction data */
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

undefined8 FUN_7ff70c7a0eb0(longlong param_1,undefined8 param_2)

{
  undefined4 uVar1;
  longlong *plVar2;
  
  if (*(longlong *)(param_1 + 0x180) == 0) {
    if (*(char *)(param_1 + 0x188) == '\x01') {
      plVar2 = (longlong *)FUN_7ff70ca6ea90(_DAT_7ff70cb95d18,&UNK_7ff70cb8cd9e);
      func_0x7ff70d63ef18((longlong)*(int *)(*plVar2 + 4) + (longlong)plVar2,10);
                    /* WARNING: Bad instruction - Truncating control flow here */
      halt_baddata();
    }
    uVar1 = FUN_7ff70c8f1ec0(**(undefined8 **)(param_1 + 0x48));
    FUN_7ff70c7a0f50(param_1,param_2,uVar1);
  }
  else {
    FUN_7ff70c79f650(param_1,param_2);
  }
  return param_2;
}


