
undefined2 FUN_0073b1bc(ulong param_1,long *param_2,ulong param_3)

{
  char cVar1;
  long lVar2;
  long in_x9;
  ulong in_x10;
  
  if ((param_1 == (in_x10 & 0xffff | 0x4145424854550000) && in_x9 == 0x5245524145424854) &&
     ((param_3 == 0xb ||
      ((((cVar1 = *(char *)((long)param_2 + 0xb), (byte)(cVar1 + 0xa5U) < 0xe6 &&
         ((byte)(cVar1 - 0x3aU) < 0xf6)) && (cVar1 != '_')) && (cVar1 != '-')))))) {
    lVar2 = 8;
  }
  else if ((*param_2 == 0x48532d4d41524353 && *(long *)((long)param_2 + 3) == 0x312d4148532d4d41) &&
          ((param_3 == 0xb ||
           (((cVar1 = *(char *)((long)param_2 + 0xb), (byte)(cVar1 + 0xa5U) < 0xe6 &&
             ((byte)(cVar1 - 0x3aU) < 0xf6)) && ((cVar1 != '_' && (cVar1 != '-')))))))) {
    lVar2 = 9;
  }
  else {
    if ((param_3 < 0xd) ||
       (*param_2 != 0x48532d4d41524353 || *(long *)((long)param_2 + 5) != 0x3635322d4148532d)) {
      return 0;
    }
    if (param_3 != 0xd) {
      cVar1 = *(char *)((long)param_2 + 0xd);
      if (0xe5 < (byte)(cVar1 + 0xa5U)) {
        return 0;
      }
      if (0xf5 < (byte)(cVar1 - 0x3aU)) {
        return 0;
      }
      if (cVar1 == '-') {
        return 0;
      }
      if (cVar1 == '_') {
        return 0;
      }
    }
    lVar2 = 10;
  }
  return *(undefined2 *)(&UNK_00a1e148 + lVar2 * 0x18);
}

