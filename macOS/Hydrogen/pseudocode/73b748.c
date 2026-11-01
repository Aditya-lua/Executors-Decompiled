
undefined2 FUN_0073b748(long *param_1,ulong param_2)

{
  char cVar1;
  bool in_ZR;
  long lVar2;
  
  if (in_ZR) {
    if ((*param_1 == 0x48532d4d41524353 && *(long *)((long)param_1 + 3) == 0x312d4148532d4d41) &&
       ((param_2 == 0xb ||
        ((((cVar1 = *(char *)((long)param_1 + 0xb), (byte)(cVar1 + 0xa5U) < 0xe6 &&
           ((byte)(cVar1 - 0x3aU) < 0xf6)) && (cVar1 != '_')) && (cVar1 != '-')))))) {
      lVar2 = 9;
    }
    else {
      if ((param_2 < 0xd) ||
         (*param_1 != 0x48532d4d41524353 || *(long *)((long)param_1 + 5) != 0x3635322d4148532d)) {
        return 0;
      }
      if (param_2 != 0xd) {
        cVar1 = *(char *)((long)param_1 + 0xd);
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
  }
  else {
    lVar2 = 8;
  }
  return *(undefined2 *)(&UNK_00a1e148 + lVar2 * 0x18);
}

