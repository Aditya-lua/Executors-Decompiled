/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009dd7cc
 */

undefined8 tls_construct_next_proto(long param_1,undefined8 param_2)

{
  int iVar1;
  undefined8 uVar2;
  size_t __n;
  void *local_28;
  
  local_28 = (void *)0x0;
  uVar2 = *(undefined8 *)(param_1 + 0xb20);
  iVar1 = WPACKET_sub_memcpy__(param_2,*(undefined8 *)(param_1 + 0xb18),uVar2,1);
  if (iVar1 != 0) {
    __n = 0x20 - ((ulong)((int)uVar2 + 2) & 0x1f);
    iVar1 = WPACKET_sub_allocate_bytes__(param_2,__n,&local_28,1);
    if (iVar1 != 0) {
      memset(local_28,0,__n);
      return 1;
    }
  }
  ERR_new();
  ERR_set_debug("ssl/statem/statem_clnt.c",0xe08,"tls_construct_next_proto");
  ossl_statem_fatal(param_1,0x50,0xc0103,0);
  return 0;
}

