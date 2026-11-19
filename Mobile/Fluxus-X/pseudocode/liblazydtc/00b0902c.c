/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b0902c
 */

undefined4
X509_NAME_hash_ex(X509_NAME *param_1,undefined8 param_2,undefined8 param_3,undefined4 *param_4)

{
  int iVar1;
  EVP_MD *type;
  undefined4 uVar2;
  undefined4 local_44 [5];
  
  type = (EVP_MD *)EVP_MD_fetch(param_2,&DAT_002d142e);
  iVar1 = i2d_X509_NAME(param_1,(uchar **)0x0);
  if (param_4 != (undefined4 *)0x0) {
    *param_4 = 0;
  }
  if (type != (EVP_MD *)0x0) {
    uVar2 = 0;
    if (iVar1 < 0) goto LAB_00b090d0;
    iVar1 = EVP_Digest(param_1->canon_enc,(long)param_1->canon_enclen,(uchar *)local_44,(uint *)0x0,
                       type,(ENGINE *)0x0);
    if (iVar1 != 0) {
      uVar2 = local_44[0];
      if (param_4 != (undefined4 *)0x0) {
        *param_4 = 1;
      }
      goto LAB_00b090d0;
    }
  }
  uVar2 = 0;
LAB_00b090d0:
  EVP_MD_free(type);
  return uVar2;
}

