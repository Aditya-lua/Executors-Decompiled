/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009de4f8
 */

undefined8 dtls_process_hello_verify(long param_1,long *param_2)

{
  long lVar1;
  ulong uVar2;
  ulong __n;
  
  uVar2 = param_2[1];
  if (1 < uVar2) {
    lVar1 = *param_2;
    *param_2 = lVar1 + 2;
    param_2[1] = uVar2 - 2;
    if (uVar2 - 2 != 0) {
      __n = (ulong)*(byte *)(lVar1 + 2);
      if (__n <= uVar2 - 3) {
        *param_2 = lVar1 + 3 + __n;
        param_2[1] = (uVar2 - 3) - __n;
        memcpy(*(void **)(param_1 + 0x4b8),(void *)(lVar1 + 3),__n);
        *(ulong *)(*(long *)(param_1 + 0x4b8) + 0x100) = __n;
        return 1;
      }
    }
  }
  ERR_new();
  ERR_set_debug("ssl/statem/statem_clnt.c",0x505,"dtls_process_hello_verify");
  ossl_statem_fatal(param_1,0x32,0x9f,0);
  return 0;
}

