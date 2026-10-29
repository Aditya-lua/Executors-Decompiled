/* 7ff70ca32d80 Catch_All@7ff70ca32d80 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

undefined * Catch_All_7ff70ca32d80(undefined8 param_1,longlong param_2)

{
  longlong *plVar1;
  
  plVar1 = *(longlong **)(param_2 + 0x38);
  (*_DAT_7ff70cb95d28)
            ((longlong)plVar1 + (longlong)*(int *)(*plVar1 + 4),
             *(uint *)((longlong)plVar1 + (longlong)*(int *)(*plVar1 + 4) + 0x10) | 4,1);
  return &UNK_7ff70ca32d3c;
}


