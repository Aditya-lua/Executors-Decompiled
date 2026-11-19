/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a7fb64
 */

uchar * HMAC(EVP_MD *evp_md,void *key,int key_len,uchar *d,size_t n,uchar *md,uint *md_len)

{
  int iVar1;
  undefined8 uVar2;
  uchar *puVar3;
  undefined8 local_58;
  
  iVar1 = EVP_MD_get_size(evp_md,key,key_len);
  local_58 = 0;
  if (iVar1 < 0) {
    puVar3 = (uchar *)0x0;
  }
  else {
    uVar2 = EVP_MD_get0_name(evp_md);
    puVar3 = &DAT_00d21b50;
    if (md != (uchar *)0x0) {
      puVar3 = md;
    }
    puVar3 = (uchar *)EVP_Q_mac(0,&DAT_002c35d3,0,uVar2,0,key,(long)key_len,d,n,puVar3,(long)iVar1,
                                &local_58);
    if (md_len != (uint *)0x0) {
      *md_len = (uint)local_58;
    }
  }
  return puVar3;
}

