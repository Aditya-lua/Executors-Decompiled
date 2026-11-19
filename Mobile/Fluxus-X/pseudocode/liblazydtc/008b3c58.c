/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008b3c58
 */

void FUN_008b3c58(undefined8 param_1,undefined8 param_2,long *param_3)

{
  int iVar1;
  undefined8 uVar2;
  long lVar3;
  char *pcVar4;
  
  iVar1 = *(int *)((long)param_3 + 0xc);
  uVar2 = FUN_008be244();
  if (iVar1 == 5) {
    pcVar4 = "this %s does not have a key named \'%s\'";
    lVar3 = *param_3 + 0x18;
  }
  else {
    lVar3 = FUN_008be244(param_1,param_3);
    pcVar4 = "cannot index %s with a %s";
  }
                    /* WARNING: Subroutine does not return */
  FUN_008b39cc(param_1,pcVar4,uVar2,lVar3);
}

