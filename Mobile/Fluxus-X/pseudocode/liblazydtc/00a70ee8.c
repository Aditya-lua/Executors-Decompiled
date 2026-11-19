/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a70ee8
 */

int FUN_00a70ee8(int param_1,undefined8 param_2,long param_3)

{
  int iVar1;
  ASN1_OBJECT *pAVar2;
  
  iVar1 = FUN_00a70a34();
  if (iVar1 < 1) {
    return iVar1;
  }
  if (param_1 == 8) {
    if (*(int *)(param_3 + 8) != 1) goto LAB_00a70f64;
  }
  else if ((param_1 != 1) || (*(int *)(param_3 + 8) != 2)) goto LAB_00a70f64;
  OBJ_obj2txt((char *)(param_3 + 0x40),0x32,*(ASN1_OBJECT **)(param_3 + 0x20),0);
  *(char **)(param_3 + 0x20) = (char *)(param_3 + 0x40);
  *(undefined4 *)(param_3 + 0x1c) = 0;
LAB_00a70f64:
  iVar1 = FUN_00a6fd84(param_1,param_2,param_3);
  if (0 < iVar1) {
    if (param_1 == 2) {
      if (*(int *)(param_3 + 8) != 1) {
        return iVar1;
      }
    }
    else {
      if (param_1 != 7) {
        return iVar1;
      }
      if (*(int *)(param_3 + 8) != 2) {
        return iVar1;
      }
    }
    pAVar2 = OBJ_txt2obj(*(char **)(param_3 + 0x20),0);
    *(ASN1_OBJECT **)(param_3 + 0x20) = pAVar2;
  }
  return iVar1;
}

