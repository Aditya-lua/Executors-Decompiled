/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009c6444
 */

void FUN_009c6444(undefined4 *param_1,int *param_2,char *param_3)

{
  int iVar1;
  undefined4 uVar2;
  
  iVar1 = strcmp(param_3,"RSA");
  if (iVar1 == 0) {
    uVar2 = 6;
  }
  else {
    iVar1 = strcmp(param_3,"RSA-PSS");
    if ((iVar1 == 0) || (iVar1 = strcmp(param_3,"PSS"), iVar1 == 0)) {
      uVar2 = 0x390;
    }
    else {
      iVar1 = strcmp(param_3,"DSA");
      if (iVar1 == 0) {
        uVar2 = 0x74;
      }
      else {
        iVar1 = strcmp(param_3,"ECDSA");
        if (iVar1 != 0) {
          iVar1 = OBJ_sn2nid(param_3);
          *param_2 = iVar1;
          if (iVar1 == 0) {
            iVar1 = OBJ_ln2nid(param_3);
            *param_2 = iVar1;
            return;
          }
          return;
        }
        uVar2 = 0x198;
      }
    }
  }
  *param_1 = uVar2;
  return;
}

