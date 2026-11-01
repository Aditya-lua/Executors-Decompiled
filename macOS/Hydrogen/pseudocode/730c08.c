
void FUN_00730c08(long param_1,int param_2)

{
  long lVar1;
  long *plVar2;
  int unaff_w19;
  
  plVar2 = *(long **)(*(long *)(param_1 + 0x18) + (long)param_2 * 8 + 0x260);
  if (plVar2 != (long *)0x0) {
    (**(code **)(*plVar2 + 0x20))(plVar2,param_1);
  }
  lVar1 = *(long *)(param_1 + 0x18) + (long)unaff_w19 * 0x10;
  *(undefined8 *)(lVar1 + 0x278) = 0;
  *(undefined8 *)(lVar1 + 0x270) = 0;
  return;
}

