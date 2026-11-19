/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009e5cbc
 */

undefined8 parse_ca_names(long param_1,long *param_2)

{
  uchar *puVar1;
  ulong uVar2;
  ulong uVar3;
  int iVar4;
  long lVar5;
  undefined8 uVar6;
  undefined8 uVar7;
  undefined1 *puVar8;
  ulong uVar9;
  X509_NAME *a;
  uchar *local_48;
  
  lVar5 = OPENSSL_sk_new(&LAB_009e5ee0);
  if (lVar5 == 0) {
    ERR_new();
    ERR_set_debug("ssl/statem/statem_lib.c",0x8cb,"parse_ca_names");
    uVar6 = 0x50;
    uVar7 = 0xc0100;
  }
  else {
    uVar3 = param_2[1] - 2;
    if (1 < (ulong)param_2[1]) {
      puVar8 = (undefined1 *)*param_2;
      uVar2 = (ulong)CONCAT11(*puVar8,puVar8[1]);
      if (uVar2 <= uVar3) {
        puVar1 = puVar8 + 2;
        *param_2 = (long)(puVar1 + uVar2);
        param_2[1] = uVar3 - uVar2;
        do {
          if (uVar2 == 0) {
            OPENSSL_sk_pop_free(*(undefined8 *)(param_1 + 0x308),X509_NAME_free);
            *(long *)(param_1 + 0x308) = lVar5;
            return 1;
          }
          if (uVar2 == 1) {
LAB_009e5e38:
            ERR_new();
            uVar6 = 0x8da;
            goto LAB_009e5d2c;
          }
          uVar3 = (ulong)CONCAT11(*puVar1,puVar1[1]);
          uVar9 = uVar2 - 2;
          uVar2 = uVar9 - uVar3;
          if (uVar9 < uVar3) goto LAB_009e5e38;
          local_48 = puVar1 + 2;
          a = d2i_X509_NAME((X509_NAME **)0x0,&local_48,uVar3);
          if (a == (X509_NAME *)0x0) {
            ERR_new();
            ERR_set_debug("ssl/statem/statem_lib.c",0x8e0,"parse_ca_names");
            uVar6 = 0x32;
            uVar7 = 0x8000d;
            goto LAB_009e5ed0;
          }
          puVar1 = puVar1 + 2 + uVar3;
          if (local_48 != puVar1) {
            ERR_new();
            ERR_set_debug("ssl/statem/statem_lib.c",0x8e4,"parse_ca_names");
            uVar6 = 0x32;
            uVar7 = 0x83;
            goto LAB_009e5ed0;
          }
          iVar4 = OPENSSL_sk_push(lVar5,a);
        } while (iVar4 != 0);
        ERR_new();
        ERR_set_debug("ssl/statem/statem_lib.c",0x8e9,"parse_ca_names");
        uVar6 = 0x50;
        uVar7 = 0xc0100;
LAB_009e5ed0:
        ossl_statem_fatal(param_1,uVar6,uVar7,0);
        goto LAB_009e5d74;
      }
    }
    ERR_new();
    uVar6 = 0x8d0;
LAB_009e5d2c:
    ERR_set_debug("ssl/statem/statem_lib.c",uVar6,"parse_ca_names");
    uVar6 = 0x32;
    uVar7 = 0x9f;
  }
  ossl_statem_fatal(param_1,uVar6,uVar7,0);
  a = (X509_NAME *)0x0;
LAB_009e5d74:
  OPENSSL_sk_pop_free(lVar5,X509_NAME_free);
  X509_NAME_free(a);
  return 0;
}

