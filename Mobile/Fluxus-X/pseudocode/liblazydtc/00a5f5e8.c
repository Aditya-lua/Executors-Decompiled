/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a5f5e8
 */

void EVP_MD_is_a(int *param_1,undefined8 param_2)

{
  int iVar1;
  char *pcVar2;
  long lVar3;
  
  if (param_1 == (int *)0x0) {
    return;
  }
  lVar3 = *(long *)(param_1 + 0x1c);
  if (lVar3 == 0) {
    pcVar2 = *(char **)(param_1 + 0x18);
    if (pcVar2 == (char *)0x0) {
      pcVar2 = OBJ_nid2sn(*param_1);
    }
    lVar3 = 0;
    iVar1 = 0;
  }
  else {
    iVar1 = param_1[0x16];
    pcVar2 = (char *)0x0;
  }
  evp_is_a(lVar3,iVar1,pcVar2,param_2);
  return;
}

