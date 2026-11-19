/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a14940
 */

undefined8 FUN_00a14940(long param_1,X509_PUBKEY *param_2,long *param_3,ulong *param_4)

{
  int iVar1;
  EVP_MD *type;
  uchar *md;
  undefined8 uVar2;
  uint uStack_44;
  uchar *local_38;
  
  local_38 = (uchar *)0x0;
  type = (EVP_MD *)
         EVP_MD_fetch(*(undefined8 *)(param_1 + 0x50),"SHA2-256",*(undefined8 *)(param_1 + 0x58));
  if (type == (EVP_MD *)0x0) {
    md = (uchar *)0x0;
  }
  else {
    md = (uchar *)*param_3;
    if ((((md != (uchar *)0x0) && (0x1f < *param_4)) ||
        (md = CRYPTO_malloc(0x20,"crypto/ct/ct_sct_ctx.c",0xdc), md != (uchar *)0x0)) &&
       ((iVar1 = i2d_X509_PUBKEY(param_2,&local_38), 0 < iVar1 &&
        (iVar1 = EVP_Digest(local_38,(long)iVar1,md,&uStack_44,type,(ENGINE *)0x0), iVar1 != 0)))) {
      if (md == (uchar *)*param_3) {
        md = (uchar *)0x0;
        uVar2 = 1;
      }
      else {
        CRYPTO_free((uchar *)*param_3);
        *param_3 = (long)md;
        *param_4 = 0x20;
        uVar2 = 1;
        md = (uchar *)0x0;
      }
      goto LAB_00a14a24;
    }
  }
  uVar2 = 0;
LAB_00a14a24:
  EVP_MD_free(type);
  CRYPTO_free(md);
  CRYPTO_free(local_38);
  return uVar2;
}

