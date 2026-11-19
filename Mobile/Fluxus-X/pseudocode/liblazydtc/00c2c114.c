/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c2c114
 */

/* WARNING: Removing unreachable block (ram,0x00c2c210) */
/* WARNING: Removing unreachable block (ram,0x00c2c214) */
/* WARNING: Removing unreachable block (ram,0x00c2c218) */
/* WARNING: Removing unreachable block (ram,0x00c2c228) */

void FUN_00c2c114(undefined8 param_1,undefined8 param_2,undefined8 *param_3,code *param_4,
                 undefined8 param_5)

{
  int iVar1;
  undefined8 uVar2;
  code *UNRECOVERED_JUMPTABLE;
  undefined1 auStack_98 [24];
  code *local_80;
  
  FUN_00c2c354(param_2,param_1);
  iVar1 = FUN_00c2c578(param_2);
  while( true ) {
    if (iVar1 < 1) {
      (*param_4)(1,0x1a,*param_3,param_3,param_2,param_5);
      return;
    }
    iVar1 = FUN_00c2c58c(param_2,auStack_98);
    if (iVar1 != 0) {
      return;
    }
    iVar1 = (*param_4)(1,10,*param_3,param_3,param_2,param_5);
    if (iVar1 != 0) {
      return;
    }
    if ((local_80 != (code *)0x0) &&
       (iVar1 = (*local_80)(1,10,*param_3,param_3,param_2), iVar1 != 8)) break;
    iVar1 = FUN_00c2c578(param_2);
  }
  if (iVar1 == 7) {
    uVar2 = FUN_00c2c344(param_2);
    UNRECOVERED_JUMPTABLE = (code *)FUN_00c2c334();
                    /* WARNING: Could not recover jumptable at 0x00c2c184. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*UNRECOVERED_JUMPTABLE)(uVar2);
    return;
  }
  return;
}

