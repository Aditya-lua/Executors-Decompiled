/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00807c3c
 */

undefined8 FUN_00807c3c(undefined8 param_1)

{
  long *plVar1;
  long lVar2;
  long lVar3;
  
  FUN_008af088(param_1,1,8);
  FUN_008af088(param_1,2,8);
  plVar1 = (long *)FUN_008abd78(param_1,1);
  if (plVar1 == (long *)0x0) {
    lVar3 = 0;
  }
  else {
    lVar3 = *plVar1;
  }
  plVar1 = (long *)FUN_008abd78(param_1,2);
  if (plVar1 == (long *)0x0) {
    lVar2 = 0;
  }
  else {
    lVar2 = *plVar1;
  }
  FUN_008ac964(param_1,lVar3 == lVar2);
  return 1;
}

