/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009ff6a4
 */

int BIO_set_tcp_ndelay(int sock,int turn_on)

{
  int iVar1;
  int local_14;
  
  local_14 = turn_on;
  iVar1 = setsockopt(sock,6,1,&local_14,4);
  return (int)(iVar1 == 0);
}

