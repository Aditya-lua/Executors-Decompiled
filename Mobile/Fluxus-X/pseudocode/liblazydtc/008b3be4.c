/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008b3be4
 */

void FUN_008b3be4(undefined8 param_1,undefined8 param_2,long *param_3)

{
  undefined8 uVar1;
  long lVar2;
  char *pcVar3;
  long lVar4;
  
  uVar1 = FUN_008be244();
  lVar2 = FUN_008be244(param_1,param_3);
  if (((*(int *)((long)param_3 + 0xc) == 5) && (lVar4 = *param_3, lVar4 != 0)) &&
     (*(uint *)(lVar4 + 0x14) < 0x41)) {
    pcVar3 = "attempt to index %s with \'%s\'";
    lVar2 = lVar4 + 0x18;
  }
  else {
    pcVar3 = "attempt to index %s with %s";
  }
                    /* WARNING: Subroutine does not return */
  FUN_008b39cc(param_1,pcVar3,uVar1,lVar2);
}

