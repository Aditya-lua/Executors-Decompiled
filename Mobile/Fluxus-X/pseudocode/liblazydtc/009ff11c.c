/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009ff11c
 */

int BIO_get_host_ip(char *str,uchar *ip)

{
  int iVar1;
  undefined8 uVar2;
  long local_30;
  undefined8 local_28;
  
  local_28 = 0;
  iVar1 = BIO_lookup(str,0,0,2,1,&local_28);
  if (iVar1 == 0) {
    ERR_add_error_data(2,"host=",str);
    return 0;
  }
  iVar1 = BIO_ADDRINFO_family(local_28);
  if (iVar1 == 2) {
    uVar2 = BIO_ADDRINFO_address(local_28);
    iVar1 = BIO_ADDR_rawaddress(uVar2,0,&local_30);
    if (iVar1 != 0) {
      iVar1 = 0;
      if (local_30 == 4) {
        uVar2 = BIO_ADDRINFO_address(local_28);
        iVar1 = BIO_ADDR_rawaddress(uVar2,ip,&local_30);
      }
      goto LAB_009ff1f4;
    }
  }
  else {
    ERR_new();
    ERR_set_debug("crypto/bio/bio_sock.c",0x3a,"BIO_get_host_ip");
    ERR_set_error(0x20,0x6b,0);
  }
  iVar1 = 0;
LAB_009ff1f4:
  BIO_ADDRINFO_free(local_28);
  return iVar1;
}

