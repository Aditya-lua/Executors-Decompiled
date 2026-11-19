/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009e61e8
 */

undefined8 FUN_009e61e8(long param_1,undefined8 param_2,X509 *param_3,int param_4)

{
  undefined4 uVar1;
  int iVar2;
  int iVar3;
  undefined8 uVar4;
  uchar *puStack_38;
  
  iVar2 = i2d_X509(param_3,(uchar **)0x0);
  if (iVar2 < 0) {
    ERR_new();
    ERR_set_debug("ssl/statem/statem_lib.c",0x388,"ssl_add_cert_to_wpacket");
    uVar1 = 0x80007;
  }
  else {
    iVar3 = WPACKET_sub_allocate_bytes__(param_2,(long)iVar2,&puStack_38,3);
    if ((iVar3 != 0) && (iVar3 = i2d_X509(param_3,&puStack_38), iVar3 == iVar2)) {
      if (((*(byte *)(*(long *)(*(int **)(param_1 + 8) + 0x30) + 0x60) >> 3 & 1) == 0) &&
         (((iVar2 = **(int **)(param_1 + 8), 0x303 < iVar2 && (iVar2 != 0x10000)) &&
          (uVar4 = tls_construct_extensions(param_1,param_2,0x1000,param_3,(long)param_4),
          (int)uVar4 == 0)))) {
        return uVar4;
      }
      return 1;
    }
    ERR_new();
    ERR_set_debug("ssl/statem/statem_lib.c",0x38d,"ssl_add_cert_to_wpacket");
    uVar1 = 0xc0103;
  }
  ossl_statem_fatal(param_1,0x50,uVar1,0);
  return 0;
}

