
bool FUN_006ed53c(long param_1,undefined8 param_2,uint param_3)

{
  long *plVar1;
  long lVar2;
  int in_w9;
  uint in_w10;
  
  if ((((param_3 < in_w9 * (in_w10 & 0xffff | 0xcccc0000)) &&
       (plVar1 = *(long **)(param_1 + (long)(int)param_3 * -0x28 + 8),
       *(int *)((long)plVar1 + 0xc) == 7)) && (lVar2 = *plVar1, *(char *)(lVar2 + 3) == '\0')) &&
     (lVar2 = *(long *)(lVar2 + 0x18), lVar2 != 0)) {
    return *(long *)(lVar2 + 0x28) != 0;
  }
  return false;
}

