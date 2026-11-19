/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b53a0c
 */

int CMAC_CTX_copy(CMAC_CTX *out,CMAC_CTX *in)

{
  int iVar1;
  int iVar2;
  size_t __n;
  
  if ((*(int *)(in + 0x88) == -1) ||
     (iVar1 = EVP_CIPHER_CTX_get_block_size(*(undefined8 *)in), iVar1 < 0)) {
    return 0;
  }
  iVar2 = EVP_CIPHER_CTX_copy(*(EVP_CIPHER_CTX **)out,*(EVP_CIPHER_CTX **)in);
  if (iVar2 == 0) {
    return 0;
  }
  __n = (size_t)iVar1;
  memcpy(out + 8,in + 8,__n);
  memcpy(out + 0x28,in + 0x28,__n);
  memcpy(out + 0x48,in + 0x48,__n);
  memcpy(out + 0x68,in + 0x68,__n);
  *(undefined4 *)(out + 0x88) = *(undefined4 *)(in + 0x88);
  return 1;
}

