/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009e09c0
 */

undefined8 tls_process_cert_status_body(long param_1,long *param_2)

{
  char cVar1;
  void *__dest;
  undefined8 uVar2;
  undefined8 uVar3;
  long lVar4;
  char *pcVar5;
  ulong __n;
  
  lVar4 = param_2[1];
  if (lVar4 != 0) {
    pcVar5 = (char *)*param_2;
    cVar1 = *pcVar5;
    *param_2 = (long)(pcVar5 + 1);
    param_2[1] = lVar4 - 1U;
    if (cVar1 == '\x01') {
      if (lVar4 - 1U < 3) {
LAB_009e0aa0:
        ERR_new();
        uVar2 = 0xa55;
      }
      else {
        __n = (ulong)(byte)pcVar5[1] << 0x10 | (ulong)(byte)pcVar5[2] << 8 | (ulong)(byte)pcVar5[3];
        *param_2 = (long)(pcVar5 + 4);
        param_2[1] = lVar4 - 4U;
        if (lVar4 - 4U != __n) goto LAB_009e0aa0;
        __dest = CRYPTO_malloc((int)__n,"ssl/statem/statem_clnt.c",0xa58);
        *(void **)(param_1 + 0xa88) = __dest;
        if (__dest == (void *)0x0) {
          *(undefined8 *)(param_1 + 0xa90) = 0;
          ERR_new();
          ERR_set_debug("ssl/statem/statem_clnt.c",0xa5b,"tls_process_cert_status_body");
          uVar2 = 0x50;
          uVar3 = 0xc0100;
          goto LAB_009e0ac4;
        }
        *(ulong *)(param_1 + 0xa90) = __n;
        if (__n <= (ulong)param_2[1]) {
          memcpy(__dest,(void *)*param_2,__n);
          *param_2 = *param_2 + __n;
          param_2[1] = param_2[1] - __n;
          return 1;
        }
        ERR_new();
        uVar2 = 0xa60;
      }
      ERR_set_debug("ssl/statem/statem_clnt.c",uVar2,"tls_process_cert_status_body");
      uVar2 = 0x32;
      uVar3 = 0x9f;
      goto LAB_009e0ac4;
    }
  }
  ERR_new();
  ERR_set_debug("ssl/statem/statem_clnt.c",0xa50,"tls_process_cert_status_body");
  uVar2 = 0x32;
  uVar3 = 0x149;
LAB_009e0ac4:
  ossl_statem_fatal(param_1,uVar2,uVar3,0);
  return 0;
}

