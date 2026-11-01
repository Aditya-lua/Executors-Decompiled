
void FUN_00708518(long param_1,long *param_2)

{
  int iVar1;
  undefined8 *puVar2;
  long lVar3;
  
  iVar1 = (**(code **)(*param_2 + 0x1e8))(param_2,param_1);
  if (iVar1 != 0) {
    if (*(long *)(param_1 + 0x28) != 0) {
      lVar3 = *(long *)(param_1 + 0x28) << 3;
      puVar2 = *(undefined8 **)(param_1 + 0x20);
      do {
        (*(code *)**(undefined8 **)*puVar2)();
        lVar3 = lVar3 + -8;
        puVar2 = puVar2 + 1;
      } while (lVar3 != 0);
    }
    if (*(undefined8 **)(param_1 + 0x30) != (undefined8 *)0x0) {
                    /* WARNING: Could not recover jumptable at 0x00708580. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (**(code **)**(undefined8 **)(param_1 + 0x30))();
      return;
    }
  }
  return;
}

