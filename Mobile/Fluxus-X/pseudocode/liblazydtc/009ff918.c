/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009ff918
 */

int BIO_socket(int param_1,int param_2,int param_3)

{
  int iVar1;
  undefined4 *puVar2;
  
  iVar1 = BIO_sock_init();
  if (iVar1 == 1) {
    iVar1 = socket(param_1,param_2,param_3);
    if (iVar1 != -1) {
      return iVar1;
    }
    ERR_new();
    ERR_set_debug("crypto/bio/bio_sock2.c",0x32,"BIO_socket");
    puVar2 = (undefined4 *)__errno();
    ERR_set_error(2,*puVar2,"calling socket()");
    ERR_new();
    ERR_set_debug("crypto/bio/bio_sock2.c",0x34,"BIO_socket");
    ERR_set_error(0x20,0x76,0);
  }
  return -1;
}

