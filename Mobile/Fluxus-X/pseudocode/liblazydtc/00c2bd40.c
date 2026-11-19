/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c2bd40
 */

undefined8 FUN_00c2bd40(undefined8 *param_1)

{
  int iVar1;
  undefined8 uVar2;
  undefined1 auStack_4f0 [624];
  undefined1 auStack_280 [528];
  undefined8 local_70;
  undefined1 auStack_68 [24];
  code *local_50;
  
  FUN_00c2fc80(auStack_280);
  param_1[2] = 0;
  param_1[3] = 0;
  FUN_00c2c354(auStack_4f0,auStack_280);
  iVar1 = FUN_00c2c564(auStack_4f0);
  while( true ) {
    if (iVar1 == 0) {
      return 5;
    }
    if ((iVar1 < 0) || (iVar1 = FUN_00c2c58c(auStack_4f0,auStack_68), iVar1 != 0)) break;
    if ((local_50 != (code *)0x0) &&
       (iVar1 = (*local_50)(1,1,*param_1,param_1,auStack_4f0), iVar1 != 8)) {
      if (iVar1 == 6) {
        FUN_00c2c3fc(auStack_4f0,0xfffffffe,&local_70);
        param_1[3] = local_70;
        uVar2 = FUN_00c2be38(auStack_280,auStack_4f0,param_1);
        return uVar2;
      }
      return 3;
    }
    iVar1 = FUN_00c2c564(auStack_4f0);
  }
  return 3;
}

