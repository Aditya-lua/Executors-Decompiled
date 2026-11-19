/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009ff6dc
 */

int BIO_socket_nbio(int fd,int mode)

{
  int iVar1;
  undefined4 *puVar2;
  int local_14;
  
  local_14 = mode;
  iVar1 = ioctl(fd,0x5421,&local_14);
  if (iVar1 < 0) {
    ERR_new();
    ERR_set_debug("crypto/bio/bio_sock.c",0xd1,"BIO_socket_ioctl");
    puVar2 = (undefined4 *)__errno();
    ERR_set_error(2,*puVar2,"calling ioctlsocket()");
  }
  return (int)(iVar1 == 0);
}

