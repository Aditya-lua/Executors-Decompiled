/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009ff374
 */

int BIO_socket_ioctl(int fd,long type,void *arg)

{
  int iVar1;
  undefined4 *puVar2;
  
  iVar1 = ioctl(fd,type);
  if (iVar1 < 0) {
    ERR_new();
    ERR_set_debug("crypto/bio/bio_sock.c",0xd1,"BIO_socket_ioctl");
    puVar2 = (undefined4 *)__errno();
    ERR_set_error(2,*puVar2,"calling ioctlsocket()");
  }
  return iVar1;
}

