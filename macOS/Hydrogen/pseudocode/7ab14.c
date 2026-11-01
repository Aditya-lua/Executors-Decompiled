
void FUN_0007ab14(undefined8 param_1,undefined8 param_2,undefined8 param_3,
                 code *UNRECOVERED_JUMPTABLE)

{
  char *pcVar1;
  undefined8 uVar2;
  int in_w8;
  
  if (in_w8 == 0) {
    pcVar1 = "false";
    uVar2 = 5;
  }
  else {
    pcVar1 = "true";
    uVar2 = 4;
  }
                    /* WARNING: Could not recover jumptable at 0x0007b4e4. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*UNRECOVERED_JUMPTABLE)(param_1,pcVar1,uVar2);
  return;
}

