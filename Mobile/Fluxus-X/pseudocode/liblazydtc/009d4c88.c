/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009d4c88
 */

undefined8 tls_parse_stoc_npn(long param_1,undefined8 *param_2)

{
  byte bVar1;
  int iVar2;
  undefined8 uVar3;
  void *__dest;
  undefined8 uVar4;
  code *pcVar5;
  byte *pbVar6;
  long lVar7;
  ulong uVar8;
  ulong uVar9;
  byte local_2c [4];
  void *local_28;
  
  if ((*(long *)(param_1 + 0x240) == 0) || (*(long *)(param_1 + 0x2c8) == 0)) {
    pcVar5 = *(code **)(*(long *)(param_1 + 0x9a8) + 0x2c8);
    if (pcVar5 == (code *)0x0) {
      ERR_new();
      ERR_set_debug("ssl/statem/extensions_clnt.c",0x5f5,"tls_parse_stoc_npn");
      uVar3 = 0x6e;
    }
    else {
      pbVar6 = (byte *)*param_2;
      lVar7 = param_2[1];
      do {
        if (lVar7 == 0) {
          iVar2 = (*pcVar5)(param_1,&local_28,local_2c,(byte *)*param_2,param_2[1],
                            *(undefined8 *)(*(long *)(param_1 + 0x9a8) + 0x2d0));
          if (iVar2 != 0) {
            ERR_new();
            ERR_set_debug("ssl/statem/extensions_clnt.c",0x604,"tls_parse_stoc_npn");
            uVar3 = 0x28;
            goto LAB_009d4d6c;
          }
          CRYPTO_free(*(void **)(param_1 + 0xb18));
          __dest = CRYPTO_malloc((uint)local_2c[0],"ssl/statem/extensions_clnt.c",0x60d);
          *(void **)(param_1 + 0xb18) = __dest;
          if (__dest != (void *)0x0) {
            memcpy(__dest,local_28,(ulong)local_2c[0]);
            *(undefined4 *)(param_1 + 0x484) = 1;
            *(ulong *)(param_1 + 0xb20) = (ulong)local_2c[0];
            return 1;
          }
          *(undefined8 *)(param_1 + 0xb20) = 0;
          ERR_new();
          ERR_set_debug("ssl/statem/extensions_clnt.c",0x610,"tls_parse_stoc_npn");
          uVar3 = 0x50;
          uVar4 = 0xc0103;
          goto LAB_009d4d70;
        }
        bVar1 = *pbVar6;
        uVar9 = (ulong)bVar1;
        uVar8 = lVar7 - 1;
        lVar7 = uVar8 - uVar9;
      } while ((uVar9 <= uVar8) && (pbVar6 = pbVar6 + uVar9 + 1, bVar1 != 0));
      ERR_new();
      ERR_set_debug("ssl/statem/extensions_clnt.c",0x5e0,"ssl_next_proto_validate");
      uVar3 = 0x32;
    }
LAB_009d4d6c:
    uVar4 = 0x6e;
LAB_009d4d70:
    ossl_statem_fatal(param_1,uVar3,uVar4,0);
    uVar3 = 0;
  }
  else {
    uVar3 = 1;
  }
  return uVar3;
}

