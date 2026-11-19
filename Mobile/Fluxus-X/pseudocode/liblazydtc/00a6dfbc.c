/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a6dfbc
 */

char * evp_pkey_type2name(int param_1)

{
  char *pcVar1;
  long lVar2;
  
  if (param_1 < 0x398) {
    if (param_1 < 0x74) {
      lVar2 = 0;
      if (param_1 != 6) {
        if (param_1 != 0x1c) {
LAB_00a6e090:
          pcVar1 = OBJ_nid2sn(param_1);
          return pcVar1;
        }
        lVar2 = 8;
      }
    }
    else if (param_1 == 0x74) {
      lVar2 = 0xb;
    }
    else if (param_1 == 0x198) {
      lVar2 = 2;
    }
    else {
      if (param_1 != 0x390) goto LAB_00a6e090;
      lVar2 = 1;
    }
  }
  else if (param_1 < 0x43f) {
    if (param_1 == 0x398) {
      lVar2 = 9;
    }
    else if (param_1 == 0x40a) {
      lVar2 = 5;
    }
    else {
      if (param_1 != 0x40b) goto LAB_00a6e090;
      lVar2 = 6;
    }
  }
  else if (param_1 == 0x43f) {
    lVar2 = 3;
  }
  else if (param_1 == 0x440) {
    lVar2 = 4;
  }
  else {
    if (param_1 != 0x494) goto LAB_00a6e090;
    lVar2 = 7;
  }
  return (&PTR_DAT_00c5ebe0)[lVar2 * 2];
}

