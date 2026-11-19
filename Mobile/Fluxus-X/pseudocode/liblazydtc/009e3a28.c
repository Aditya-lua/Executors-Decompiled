/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009e3a28
 */

undefined8 tls_construct_finished(long param_1,undefined8 param_2)

{
  void *__src;
  long lVar1;
  long lVar2;
  int iVar3;
  int iVar4;
  undefined8 uVar5;
  ulong __n;
  long lVar6;
  
  iVar4 = *(int *)(param_1 + 0x38);
  if ((iVar4 == 0) && (*(int *)(param_1 + 0xba8) != 4)) {
    *(undefined4 *)(param_1 + 0x70) = 1;
  }
  lVar6 = *(long *)(*(int **)(param_1 + 8) + 0x30);
  if (((((*(byte *)(lVar6 + 0x60) >> 3 & 1) == 0) &&
       (iVar3 = **(int **)(param_1 + 8), 0x303 < iVar3)) && (iVar3 != 0x10000)) &&
     ((iVar4 == 0 && (*(int *)(param_1 + 0x2f0) == 0)))) {
    uVar5 = (**(code **)(lVar6 + 0x20))(param_1,0x92);
    if ((int)uVar5 == 0) {
      return uVar5;
    }
    iVar4 = *(int *)(param_1 + 0x38);
    lVar6 = *(long *)(*(long *)(param_1 + 8) + 0xc0);
  }
  lVar1 = 0x30;
  if (iVar4 != 0) {
    lVar1 = 0x40;
  }
  lVar2 = 0x38;
  if (iVar4 != 0) {
    lVar2 = 0x48;
  }
  __src = (void *)(param_1 + 0x1c0);
  __n = (**(code **)(lVar6 + 0x28))
                  (param_1,*(undefined8 *)(lVar6 + lVar1),*(undefined8 *)(lVar6 + lVar2),__src);
  if (__n != 0) {
    *(ulong *)(param_1 + 0x240) = __n;
    iVar4 = WPACKET_memcpy(param_2,__src,__n);
    if (iVar4 == 0) {
      ERR_new();
      uVar5 = 0x25f;
    }
    else {
      if (((((*(byte *)(*(long *)(*(int **)(param_1 + 8) + 0x30) + 0x60) >> 3 & 1) != 0) ||
           (iVar4 = **(int **)(param_1 + 8), iVar4 < 0x304)) || (iVar4 == 0x10000)) &&
         (uVar5 = ssl_log_secret(param_1,"CLIENT_RANDOM",*(long *)(param_1 + 0x918) + 0x50,
                                 *(undefined8 *)(*(long *)(param_1 + 0x918) + 8)), (int)uVar5 == 0))
      {
        return uVar5;
      }
      if (__n < 0x41) {
        if (*(int *)(param_1 + 0x38) == 0) {
          memcpy((void *)(param_1 + 0x3f0),__src,__n);
          *(ulong *)(param_1 + 0x430) = __n;
        }
        else {
          memcpy((void *)(param_1 + 0x438),__src,__n);
          *(ulong *)(param_1 + 0x478) = __n;
        }
        return 1;
      }
      ERR_new();
      uVar5 = 0x272;
    }
    ERR_set_debug("ssl/statem/statem_lib.c",uVar5,"tls_construct_finished");
    ossl_statem_fatal(param_1,0x50,0xc0103,0);
  }
  return 0;
}

