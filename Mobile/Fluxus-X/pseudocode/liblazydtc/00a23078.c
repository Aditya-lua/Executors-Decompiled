/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a23078
 */

long FUN_00a23078(long param_1,long param_2)

{
  int iVar1;
  long lVar2;
  undefined8 uVar3;
  
  if ((param_1 == 0) || (param_2 == 0)) {
    ERR_new();
    ERR_set_debug("crypto/dso/dso_dlfcn.c",0xae,"dlfcn_bind_func");
    uVar3 = 0xc0102;
  }
  else {
    iVar1 = OPENSSL_sk_num(*(undefined8 *)(param_1 + 8));
    if (iVar1 < 1) {
      ERR_new();
      ERR_set_debug("crypto/dso/dso_dlfcn.c",0xb2,"dlfcn_bind_func");
      uVar3 = 0x69;
    }
    else {
      uVar3 = *(undefined8 *)(param_1 + 8);
      iVar1 = OPENSSL_sk_num(uVar3);
      lVar2 = OPENSSL_sk_value(uVar3,iVar1 + -1);
      if (lVar2 != 0) {
        lVar2 = dlsym(lVar2,param_2);
        if (lVar2 == 0) {
          ERR_new();
          ERR_set_debug("crypto/dso/dso_dlfcn.c",0xbc,"dlfcn_bind_func");
          uVar3 = dlerror();
          ERR_set_error(0x25,0x6a,"symname(%s): %s",param_2,uVar3);
          return 0;
        }
        return lVar2;
      }
      ERR_new();
      ERR_set_debug("crypto/dso/dso_dlfcn.c",0xb7,"dlfcn_bind_func");
      uVar3 = 0x68;
    }
  }
  ERR_set_error(0x25,uVar3,0);
  return 0;
}

