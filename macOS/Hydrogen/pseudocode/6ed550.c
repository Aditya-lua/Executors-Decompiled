
bool FUN_006ed550(long param_1)

{
  long *plVar1;
  long lVar2;
  long in_x9;
  
  plVar1 = *(long **)(param_1 + in_x9 * -0x28 + 8);
  if (((*(int *)((long)plVar1 + 0xc) == 7) && (lVar2 = *plVar1, *(char *)(lVar2 + 3) == '\0')) &&
     (lVar2 = *(long *)(lVar2 + 0x18), lVar2 != 0)) {
    return *(long *)(lVar2 + 0x28) != 0;
  }
  return false;
}

