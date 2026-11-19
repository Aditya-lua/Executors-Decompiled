/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009d4494
 */

undefined8 tls_parse_stoc_renegotiate(long param_1,undefined8 *param_2)

{
  ulong uVar1;
  byte *__s1;
  byte bVar2;
  int iVar3;
  byte *__s1_00;
  undefined8 uVar4;
  ulong __n;
  undefined8 uVar5;
  ulong uVar6;
  size_t __n_00;
  
  __n = *(ulong *)(param_1 + 0x430);
  __n_00 = *(size_t *)(param_1 + 0x478);
  uVar1 = __n_00 + __n;
  if ((uVar1 != 0) && ((__n == 0 || (__n_00 == 0)))) {
    ERR_new();
    ERR_set_debug("ssl/statem/extensions_clnt.c",0x4c0,"tls_parse_stoc_renegotiate");
    uVar4 = 0x50;
    uVar5 = 0xc0103;
    goto LAB_009d45b8;
  }
  if (param_2[1] == 0) {
    ERR_new();
    uVar4 = 0x4c6;
  }
  else {
    uVar6 = param_2[1] - 1;
    __s1_00 = (byte *)*param_2 + 1;
    bVar2 = *(byte *)*param_2;
    *param_2 = __s1_00;
    param_2[1] = uVar6;
    if (uVar6 == bVar2) {
      if (uVar1 == uVar6) {
        if (__n <= uVar1) {
          __s1 = __s1_00 + __n;
          *param_2 = __s1;
          param_2[1] = __n_00;
          iVar3 = memcmp(__s1_00,(void *)(param_1 + 0x3f0),__n);
          if (iVar3 == 0) {
            *param_2 = __s1 + __n_00;
            param_2[1] = 0;
            iVar3 = memcmp(__s1,(void *)(param_1 + 0x438),__n_00);
            if (iVar3 == 0) {
              *(undefined4 *)(param_1 + 0x480) = 1;
              return 1;
            }
            ERR_new();
            uVar4 = 0x4e0;
            goto LAB_009d45ac;
          }
        }
        ERR_new();
        uVar4 = 0x4d9;
      }
      else {
        ERR_new();
        uVar4 = 0x4d2;
      }
LAB_009d45ac:
      ERR_set_debug("ssl/statem/extensions_clnt.c",uVar4,"tls_parse_stoc_renegotiate");
      uVar4 = 0x2f;
      uVar5 = 0x151;
      goto LAB_009d45b8;
    }
    ERR_new();
    uVar4 = 0x4cc;
  }
  ERR_set_debug("ssl/statem/extensions_clnt.c",uVar4,"tls_parse_stoc_renegotiate");
  uVar4 = 0x32;
  uVar5 = 0x150;
LAB_009d45b8:
  ossl_statem_fatal(param_1,uVar4,uVar5,0);
  return 0;
}

