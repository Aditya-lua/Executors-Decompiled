/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009d688c
 */

undefined8 tls_parse_ctos_renegotiate(long param_1,long *param_2)

{
  int iVar1;
  byte *__s1;
  undefined8 uVar2;
  ulong __n;
  undefined8 uVar3;
  ulong uVar4;
  
  if (param_2[1] != 0) {
    uVar4 = param_2[1] - 1;
    __s1 = (byte *)*param_2 + 1;
    __n = (ulong)*(byte *)*param_2;
    *param_2 = (long)__s1;
    param_2[1] = uVar4;
    if (__n <= uVar4) {
      *param_2 = (long)(__s1 + __n);
      param_2[1] = uVar4 - __n;
      if (*(ulong *)(param_1 + 0x430) == __n) {
        iVar1 = memcmp(__s1,(void *)(param_1 + 0x3f0),__n);
        if (iVar1 == 0) {
          *(undefined4 *)(param_1 + 0x480) = 1;
          return 1;
        }
        ERR_new();
        uVar2 = 0x3e;
      }
      else {
        ERR_new();
        uVar2 = 0x38;
      }
      ERR_set_debug("ssl/statem/extensions_srvr.c",uVar2,"tls_parse_ctos_renegotiate");
      uVar2 = 0x28;
      uVar3 = 0x151;
      goto LAB_009d6944;
    }
  }
  ERR_new();
  ERR_set_debug("ssl/statem/extensions_srvr.c",0x32,"tls_parse_ctos_renegotiate");
  uVar2 = 0x32;
  uVar3 = 0x150;
LAB_009d6944:
  ossl_statem_fatal(param_1,uVar2,uVar3,0);
  return 0;
}

