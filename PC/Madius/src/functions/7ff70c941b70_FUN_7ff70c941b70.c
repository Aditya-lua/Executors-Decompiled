/* 7ff70c941b70 FUN_7ff70c941b70 */

bool FUN_7ff70c941b70(undefined8 *param_1,undefined8 *param_2)

{
  int iVar1;
  bool bVar2;
  
  bVar2 = true;
  if (param_1 != (undefined8 *)0x0 || param_2 != (undefined8 *)0x0) {
    if ((param_1 == (undefined8 *)0x0 || param_2 == (undefined8 *)0x0) || (param_1[1] != param_2[1])
       ) {
      return false;
    }
    iVar1 = FUN_7ff70cb12b50(*param_1,*param_2);
    bVar2 = iVar1 == 0;
  }
  return bVar2;
}


