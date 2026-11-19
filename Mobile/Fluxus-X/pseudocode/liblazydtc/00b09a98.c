/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b09a98
 */

undefined8 FUN_00b09a98(long param_1,int param_2,ulong *param_3)

{
  int iVar1;
  char acStack_80 [80];
  undefined1 auStack_28 [8];
  
  if ((param_1 == 0) || (iVar1 = EVP_PKEY_is_a(param_1,&DAT_002cf33a), iVar1 == 0)) {
    return 0x39;
  }
  iVar1 = EVP_PKEY_get_group_name(param_1,acStack_80,0x50,auStack_28);
  if (iVar1 == 0) {
    return 0x3a;
  }
  iVar1 = OBJ_txt2nid(acStack_80);
  if (iVar1 == 0x19f) {
    if ((param_2 != 0x31a) && (param_2 != -1)) {
      return 0x3b;
    }
    if ((*param_3 & 0x10000) == 0) {
      return 0x3c;
    }
  }
  else {
    if (iVar1 != 0x2cb) {
      return 0x3a;
    }
    if ((param_2 != 0x31b) && (param_2 != -1)) {
      return 0x3b;
    }
    if (((uint)*param_3 >> 0x11 & 1) == 0) {
      return 0x3c;
    }
    *param_3 = *param_3 & 0xfffffffffffeffff;
  }
  return 0;
}

