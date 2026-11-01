
void FUN_006f3b3c(long param_1,long param_2,long param_3)

{
  long lVar1;
  long *plVar2;
  ulong in_x9;
  long in_x10;
  long unaff_x19;
  ulong unaff_x20;
  long unaff_x21;
  
  plVar2 = (long *)(in_x10 + (in_x9 & 0xffffffff) * 8);
  if (*plVar2 == param_3) {
    *plVar2 = param_1;
  }
  (**(code **)(*(long *)(param_2 + 0x18) + 0x10))
            (*(undefined8 *)(*(long *)(param_2 + 0x18) + 0x18),param_3,
             (long)*(int *)(param_3 + 0x20),0);
  *(long *)(unaff_x21 + 0x48) = *(long *)(unaff_x21 + 0x48) - unaff_x19;
  lVar1 = unaff_x21 + (unaff_x20 & 0xffffffff) * 8;
  *(long *)(lVar1 + 0x560) = *(long *)(lVar1 + 0x560) - unaff_x19;
  return;
}

