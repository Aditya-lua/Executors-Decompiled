/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a86388
 */

long FUN_00a86388(void)

{
  int iVar1;
  long lVar2;
  
  if (DAT_00d22090 == 0) {
    lVar2 = EVP_MD_meth_new(0x40,0x41);
    if (((((lVar2 == 0) || (iVar1 = EVP_MD_meth_set_result_size(lVar2,0x14), iVar1 == 0)) ||
         (iVar1 = EVP_MD_meth_set_input_blocksize(lVar2,0x40), iVar1 == 0)) ||
        ((iVar1 = EVP_MD_meth_set_app_datasize(lVar2,0x68), iVar1 == 0 ||
         (iVar1 = EVP_MD_meth_set_flags(lVar2,0), iVar1 == 0)))) ||
       ((iVar1 = EVP_MD_meth_set_init(lVar2,FUN_00a86450), iVar1 == 0 ||
        ((iVar1 = EVP_MD_meth_set_update(lVar2,FUN_00a86464), iVar1 == 0 ||
         (iVar1 = EVP_MD_meth_set_final(lVar2,&LAB_00a86490), iVar1 == 0)))))) {
      EVP_MD_meth_free(lVar2);
      lVar2 = 0;
    }
    DAT_00d22090 = lVar2;
  }
  return DAT_00d22090;
}

