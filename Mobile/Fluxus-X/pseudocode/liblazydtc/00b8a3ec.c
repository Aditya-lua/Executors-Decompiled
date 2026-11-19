/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b8a3ec
 */

undefined4 psa_sign_hash_complete(int *param_1,void *param_2,size_t param_3,undefined8 *param_4)

{
  int iVar1;
  byte bVar2;
  void *__s;
  undefined4 uVar3;
  
  *param_4 = 0;
  iVar1 = *param_1;
  bVar2 = *(byte *)(param_1 + 2);
  if (iVar1 == 0) {
    *(byte *)(param_1 + 2) = bVar2 | 1;
    uVar3 = 0xffffff77;
  }
  else {
    if ((bVar2 & 1) == 0) {
      if (param_3 == 0) {
        uVar3 = 0xffffff76;
      }
      else {
        __s = calloc(param_3,1);
        if (__s != (void *)0x0) {
          param_1[3] = 0;
          memset(__s,0x21,param_3);
          *(byte *)(param_1 + 2) = bVar2 | 1;
          *param_1 = 0;
          if (param_2 == (void *)0x0) {
            return 0xffffff69;
          }
          uVar3 = 0xffffff79;
          if (iVar1 == 1) {
            uVar3 = 0xffffff7a;
          }
          memcpy(param_2,__s,param_3);
          free(__s);
          return uVar3;
        }
        uVar3 = 0xffffff73;
      }
    }
    else {
      uVar3 = 0xffffff77;
    }
    *(byte *)(param_1 + 2) = bVar2 | 1;
    *param_1 = 0;
  }
  return uVar3;
}

