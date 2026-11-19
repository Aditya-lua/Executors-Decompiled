/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a471b0
 */

undefined8
FUN_00a471b0(undefined8 param_1,EVP_MD_CTX *param_2,char param_3,void *param_4,ulong param_5,
            undefined8 param_6)

{
  int iVar1;
  undefined8 uVar2;
  EVP_MD *type;
  undefined1 local_44;
  undefined1 local_43;
  char local_40 [16];
  
  uVar2 = 0;
  builtin_strncpy(local_40,"SigEd448",9);
  if (param_5 < 0x100) {
    local_44 = param_3 != '\0';
    local_43 = (undefined1)param_5;
    type = (EVP_MD *)EVP_MD_fetch(param_1,"SHAKE256",param_6);
    uVar2 = 0;
    if (type != (EVP_MD *)0x0) {
      iVar1 = EVP_DigestInit_ex(param_2,type,(ENGINE *)0x0);
      if ((((iVar1 == 0) || (iVar1 = EVP_DigestUpdate(param_2,local_40,8), iVar1 == 0)) ||
          (iVar1 = EVP_DigestUpdate(param_2,&local_44,2), iVar1 == 0)) ||
         (iVar1 = EVP_DigestUpdate(param_2,param_4,param_5), iVar1 == 0)) {
        EVP_MD_free(type);
        uVar2 = 0;
      }
      else {
        EVP_MD_free(type);
        uVar2 = 0xffffffff;
      }
    }
  }
  return uVar2;
}

