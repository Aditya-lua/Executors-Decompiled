/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b67c64
 */

undefined8
FUN_00b67c64(long param_1,undefined8 *param_2,size_t *param_3,undefined8 *param_4,ulong param_5)

{
  char cVar1;
  byte bVar2;
  size_t len;
  int iVar3;
  undefined8 uVar4;
  size_t sVar5;
  long lVar6;
  long lVar7;
  
  if (*(long *)(param_1 + 0x28) == -1) {
    if ((*(byte *)(param_1 + 0x54) >> 2 & 1) != 0) {
      iVar3 = *(int *)(param_1 + 0x50);
      lVar7 = *(long *)(param_1 + 0xf0);
      if (iVar3 == 0) {
        if (((*(byte *)(param_1 + 0x54) & 1) != 0) && (0xb < *(ulong *)(param_1 + 0x10))) {
          sVar5 = 0;
          iVar3 = (int)*(ulong *)(param_1 + 0x10);
          uVar4 = 0;
          if (iVar3 < 1) goto LAB_00b67f78;
          iVar3 = RAND_bytes_ex(*(undefined8 *)(param_1 + 0xe8),param_1 + 0x55,(long)iVar3,0);
          if (0 < iVar3) {
            *(undefined4 *)(param_1 + 0x50) = 1;
            *(byte *)(param_1 + 0x54) = *(byte *)(param_1 + 0x54) | 8;
            goto LAB_00b67d3c;
          }
        }
      }
      else if (iVar3 != 3) {
        if (iVar3 == 1) {
LAB_00b67d3c:
          uVar4 = (**(code **)(lVar7 + 8))(param_1,param_1 + 0x55,*(undefined8 *)(param_1 + 0x10));
          if ((int)uVar4 != 0) {
            *(undefined4 *)(param_1 + 0x50) = 2;
            goto LAB_00b67d5c;
          }
        }
        else {
LAB_00b67d5c:
          if (param_4 == (undefined8 *)0x0) {
            if (((*(byte *)(param_1 + 0x54) & 1) == 0) && (*(long *)(param_1 + 0x18) == -1))
            goto LAB_00b67d10;
            uVar4 = (**(code **)(lVar7 + 0x20))(param_1,param_1 + 0xd5);
            if ((int)uVar4 != 0) {
              sVar5 = 0;
              *(undefined4 *)(param_1 + 0x50) = 3;
              goto LAB_00b67f0c;
            }
          }
          else {
            if (param_2 == (undefined8 *)0x0) {
              uVar4 = (**(code **)(lVar7 + 0x10))(param_1,param_4,param_5);
              iVar3 = (int)uVar4;
            }
            else {
              uVar4 = (**(code **)(lVar7 + 0x18))(param_1,param_4,param_5,param_2);
              iVar3 = (int)uVar4;
            }
            sVar5 = param_5;
            if (iVar3 != 0) {
LAB_00b67f0c:
              uVar4 = 1;
              goto LAB_00b67f78;
            }
          }
        }
        sVar5 = 0;
        goto LAB_00b67f78;
      }
    }
LAB_00b67d10:
    sVar5 = 0;
    uVar4 = 0;
    goto LAB_00b67f78;
  }
  uVar4 = ossl_prov_is_running();
  if ((int)uVar4 == 0) goto LAB_00b67f64;
  bVar2 = *(byte *)(param_1 + 0x54);
  if (((bVar2 >> 2 & 1) == 0) || (param_2 != param_4)) goto LAB_00b67f60;
  uVar4 = 0;
  len = param_5 - 0x18;
  sVar5 = 0;
  if (0x17 < param_5) {
    if ((bVar2 & 1) == 0) {
      if ((bVar2 & 0x15) != 0x14) goto LAB_00b67f60;
      *(undefined8 *)(param_1 + 0x55 + *(long *)(param_1 + 0x10) + -8) = *param_2;
      uVar4 = (**(code **)(*(long *)(param_1 + 0xf0) + 8))
                        (param_1,param_1 + 0x55,*(undefined8 *)(param_1 + 0x10));
      if ((int)uVar4 != 0) {
LAB_00b67e14:
        *(undefined4 *)(param_1 + 0x50) = 2;
        param_2 = param_2 + 1;
        iVar3 = (**(code **)(*(long *)(param_1 + 0xf0) + 0x28))
                          (param_1,param_1 + 0xd5,*(undefined8 *)(param_1 + 0x28),param_2,len,
                           param_2,(long)param_2 + len,0x10);
        if (iVar3 != 0) {
          sVar5 = param_5;
          if ((*(byte *)(param_1 + 0x54) & 1) == 0) {
            sVar5 = len;
          }
          uVar4 = 1;
          goto LAB_00b67f68;
        }
        if ((*(byte *)(param_1 + 0x54) & 1) == 0) {
          OPENSSL_cleanse(param_2,len);
        }
        goto LAB_00b67f60;
      }
    }
    else {
      lVar7 = *(long *)(param_1 + 0x30) + 1;
      *(long *)(param_1 + 0x30) = lVar7;
      if (lVar7 == 0) {
        ERR_new(0);
        ERR_set_debug("providers/implementations/ciphers/ciphercommon_gcm.c",0x216,"gcm_tls_cipher")
        ;
        ERR_set_error(0x39,0x7e,0);
      }
      else if (((bVar2 ^ 0xff) & 0x14) == 0) {
        uVar4 = (**(code **)(*(long *)(param_1 + 0xf0) + 8))
                          (param_1,param_1 + 0x55,*(undefined8 *)(param_1 + 0x10));
        if ((int)uVar4 != 0) {
          sVar5 = *(ulong *)(param_1 + 0x10);
          lVar7 = param_1 + sVar5;
          if (7 < sVar5) {
            sVar5 = 8;
          }
          memcpy(param_2,(void *)((lVar7 + 0x55) - sVar5),sVar5);
          lVar6 = 0;
          lVar7 = param_1 + *(long *)(param_1 + 0x10) + 0x54;
          do {
            cVar1 = *(char *)(lVar7 + lVar6) + '\x01';
            *(char *)(lVar7 + lVar6) = cVar1;
            if (lVar6 + 8U < 2) break;
            lVar6 = lVar6 + -1;
          } while (cVar1 == '\0');
          goto LAB_00b67e14;
        }
        goto LAB_00b67f64;
      }
LAB_00b67f60:
      uVar4 = 0;
    }
LAB_00b67f64:
    sVar5 = 0;
  }
LAB_00b67f68:
  *(undefined4 *)(param_1 + 0x50) = 3;
  *(undefined8 *)(param_1 + 0x28) = 0xffffffffffffffff;
LAB_00b67f78:
  *param_3 = sVar5;
  return uVar4;
}

