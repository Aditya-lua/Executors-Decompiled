
void FUN_006e1e98(long param_1,undefined8 param_2,int param_3)

{
  undefined8 *puVar1;
  undefined8 *puVar2;
  long unaff_x19;
  
  puVar1 = (undefined8 *)(param_1 + (long)param_3 * 0x10);
  while( true ) {
    puVar2 = puVar1 + 2;
    if (*(undefined8 **)(unaff_x19 + 8) <= puVar2) break;
    puVar1[1] = puVar1[3];
    *puVar1 = *puVar2;
    puVar1 = puVar2;
  }
  *(undefined8 **)(unaff_x19 + 8) = *(undefined8 **)(unaff_x19 + 8) + -2;
  return;
}

