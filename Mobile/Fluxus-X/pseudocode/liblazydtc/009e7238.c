/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009e7238
 */

undefined8 tls_construct_server_hello(int *param_1,undefined8 param_2)

{
  bool bVar1;
  int iVar2;
  long lVar3;
  int *piVar4;
  undefined8 uVar5;
  undefined4 uVar6;
  ulong *puVar7;
  undefined1 auStack_38 [8];
  
  if (((((*(byte *)(*(long *)(*(int **)(param_1 + 2) + 0x30) + 0x60) >> 3 & 1) == 0) &&
       (iVar2 = **(int **)(param_1 + 2), 0x303 < iVar2)) && (iVar2 != 0x10000)) ||
     (param_1[0x23a] == 1)) {
    bVar1 = true;
    lVar3 = 0x303;
  }
  else {
    lVar3 = (long)*param_1;
    bVar1 = false;
  }
  iVar2 = WPACKET_put_bytes__(param_2,lVar3,2);
  if (iVar2 != 0) {
    piVar4 = (int *)hrrrandom;
    if (param_1[0x23a] != 1) {
      piVar4 = param_1 + 0x50;
    }
    iVar2 = WPACKET_memcpy(param_2,piVar4,0x20);
    if (iVar2 != 0) {
      if (((*(byte *)(*(long *)(param_1 + 0x26a) + 0x50) >> 1 & 1) == 0) && (param_1[0x134] == 0)) {
        *(undefined8 *)(*(long *)(param_1 + 0x246) + 0x250) = 0;
        if (bVar1) goto LAB_009e72e8;
LAB_009e731c:
        puVar7 = (ulong *)(*(long *)(param_1 + 0x246) + 0x250);
        piVar4 = (int *)(*(long *)(param_1 + 0x246) + 600);
      }
      else {
        if (!bVar1) goto LAB_009e731c;
LAB_009e72e8:
        puVar7 = (ulong *)(param_1 + 600);
        piVar4 = param_1 + 0x250;
      }
      if (*puVar7 < 0x21) {
        lVar3 = 0;
        if (!bVar1) {
          if (*(int **)(param_1 + 0xd0) == (int *)0x0) {
            lVar3 = 0;
          }
          else {
            lVar3 = (long)**(int **)(param_1 + 0xd0);
          }
        }
        iVar2 = WPACKET_sub_memcpy__(param_2,piVar4,*puVar7,1);
        if (((iVar2 != 0) &&
            (iVar2 = (**(code **)(*(long *)(param_1 + 2) + 0x98))
                               (*(undefined8 *)(param_1 + 0xb8),param_2,auStack_38), iVar2 != 0)) &&
           (iVar2 = WPACKET_put_bytes__(param_2,lVar3,1), iVar2 != 0)) {
          if (param_1[0x23a] == 1) {
            uVar6 = 0x800;
          }
          else if ((*(byte *)(*(long *)(*(int **)(param_1 + 2) + 0x30) + 0x60) >> 3 & 1) == 0) {
            iVar2 = **(int **)(param_1 + 2);
            uVar6 = 0x100;
            if ((0x303 < iVar2) && (uVar6 = 0x100, iVar2 != 0x10000)) {
              uVar6 = 0x200;
            }
          }
          else {
            uVar6 = 0x100;
          }
          uVar5 = tls_construct_extensions(param_1,param_2,uVar6,0,0);
          if ((int)uVar5 == 0) {
            return uVar5;
          }
          if (param_1[0x23a] == 1) {
            SSL_SESSION_free(*(SSL_SESSION **)(param_1 + 0x246));
            param_1[0x246] = 0;
            param_1[0x247] = 0;
            param_1[0x134] = 0;
            uVar5 = create_synthetic_message_hash(param_1,0,0,0,0);
            iVar2 = (int)uVar5;
          }
          else {
            if ((*(byte *)(param_1 + 0x25a) & 1) != 0) {
              return 1;
            }
            uVar5 = ssl3_digest_cached_records(param_1,0);
            iVar2 = (int)uVar5;
          }
          if (iVar2 == 0) {
            return uVar5;
          }
          return 1;
        }
        ERR_new();
        uVar5 = 0x943;
      }
      else {
        ERR_new();
        uVar5 = 0x932;
      }
      goto LAB_009e73d8;
    }
  }
  ERR_new();
  uVar5 = 0x90f;
LAB_009e73d8:
  ERR_set_debug("ssl/statem/statem_srvr.c",uVar5,"tls_construct_server_hello");
  ossl_statem_fatal(param_1,0x50,0xc0103,0);
  return 0;
}

