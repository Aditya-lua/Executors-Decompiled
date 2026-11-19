/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009e8ea8
 */

undefined8 tls_process_client_hello(long param_1,long *param_2)

{
  void *__src;
  byte *pbVar1;
  ulong uVar2;
  long lVar3;
  long lVar4;
  char cVar5;
  byte bVar6;
  byte bVar7;
  byte bVar8;
  byte bVar9;
  byte bVar10;
  byte bVar11;
  long lVar12;
  int iVar13;
  uint uVar14;
  int *ptr;
  undefined8 uVar15;
  undefined8 uVar16;
  size_t __n;
  ulong uVar17;
  undefined1 *puVar18;
  byte *pbVar19;
  ulong uVar20;
  ulong uVar21;
  undefined8 local_50;
  undefined8 uStack_48;
  
  if (((*(int *)(param_1 + 0xba0) == 0) && (*(long *)(param_1 + 0x240) != 0)) &&
     (*(long *)(param_1 + 0x2c8) != 0)) {
    if ((((*(byte *)(*(long *)(*(int **)(param_1 + 8) + 0x30) + 0x60) >> 3 & 1) == 0) &&
        (iVar13 = **(int **)(param_1 + 8), 0x303 < iVar13)) && (iVar13 != 0x10000)) {
      ERR_new();
      ERR_set_debug("ssl/statem/statem_srvr.c",0x569,"tls_process_client_hello");
      ossl_statem_fatal(param_1,0x50,0xc0103,0);
      ptr = (int *)0x0;
      goto LAB_009e91d4;
    }
    if (((*(ulong *)(param_1 + 0x9e8) & 0x40000100) != 0x100) ||
       ((((uint)*(ulong *)(param_1 + 0x9e8) >> 0x12 & 1) == 0 && (*(int *)(param_1 + 0x480) == 0))))
    {
      ssl3_send_alert(param_1,1,100);
      return 1;
    }
    *(undefined4 *)(param_1 + 0xba0) = 1;
    *(undefined4 *)(param_1 + 0x3c) = 1;
  }
  ptr = (int *)CRYPTO_zalloc(0x290,"ssl/statem/statem_srvr.c",0x577);
  if (ptr == (int *)0x0) {
    ERR_new();
    ERR_set_debug("ssl/statem/statem_srvr.c",0x579,"tls_process_client_hello");
    ossl_statem_fatal(param_1,0x50,0xc0103,0);
    goto LAB_009e91d4;
  }
  iVar13 = RECORD_LAYER_is_sslv2_record(param_1 + 0xc58);
  *ptr = iVar13;
  if (iVar13 == 0) {
    uVar17 = param_2[1];
LAB_009e8fec:
    if (uVar17 < 2) {
      ERR_new();
      ERR_set_debug("ssl/statem/statem_srvr.c",0x5a8,"tls_process_client_hello");
      uVar15 = 0x32;
      uVar16 = 0xa0;
      goto LAB_009e91b4;
    }
    pbVar19 = (byte *)*param_2;
    uVar20 = uVar17 - 2;
    bVar6 = *pbVar19;
    ptr[1] = (uint)bVar6 << 8;
    ptr[1] = (uint)CONCAT11(bVar6,pbVar19[1]);
    *param_2 = (long)(pbVar19 + 2);
    param_2[1] = uVar20;
    if (iVar13 != 0) {
      if (uVar20 < 2) {
LAB_009e9088:
        ERR_new();
        uVar15 = 0x5b9;
LAB_009e90a0:
        ERR_set_debug("ssl/statem/statem_srvr.c",uVar15,"tls_process_client_hello");
        uVar15 = 0x32;
        uVar16 = 0xd5;
        goto LAB_009e91b4;
      }
      bVar6 = pbVar19[2];
      bVar7 = pbVar19[3];
      *param_2 = (long)(pbVar19 + 4);
      param_2[1] = uVar17 - 4;
      if (uVar17 - 4 < 2) goto LAB_009e9088;
      bVar8 = pbVar19[4];
      bVar9 = pbVar19[5];
      *param_2 = (long)(pbVar19 + 6);
      param_2[1] = uVar17 - 6;
      if (uVar17 - 6 < 2) goto LAB_009e9088;
      uVar20 = (ulong)(uint)CONCAT11(bVar8,bVar9);
      bVar10 = pbVar19[6];
      bVar11 = pbVar19[7];
      *param_2 = (long)(pbVar19 + 8);
      param_2[1] = uVar17 - 8;
      if (CONCAT11(bVar8,bVar9) < 0x21) {
        uVar2 = (ulong)CONCAT11(bVar6,bVar7);
        if (uVar2 <= uVar17 - 8) {
          *(byte **)(ptr + 0x56) = pbVar19 + 8;
          *(ulong *)(ptr + 0x58) = uVar2;
          lVar3 = *param_2;
          lVar4 = param_2[1];
          *param_2 = (long)(lVar3 + uVar2);
          param_2[1] = lVar4 - uVar2;
          if (uVar20 <= lVar4 - uVar2) {
            uVar14 = (uint)CONCAT11(bVar10,bVar11);
            uVar21 = (ulong)uVar14;
            memcpy(ptr + 0xc,(void *)(lVar3 + uVar2),uVar20);
            uVar17 = param_2[1] - uVar20;
            __src = (void *)(*param_2 + uVar20);
            *param_2 = (long)__src;
            param_2[1] = uVar17;
            if (uVar21 <= uVar17) {
              *param_2 = (long)__src + uVar21;
              param_2[1] = uVar17 - uVar21;
              if (uVar17 - uVar21 == 0) {
                *(ulong *)(ptr + 10) = uVar20;
                if (0x1f < uVar14) {
                  uVar14 = 0x20;
                }
                ptr[4] = 0;
                ptr[5] = 0;
                ptr[2] = 0;
                ptr[3] = 0;
                ptr[8] = 0;
                ptr[9] = 0;
                ptr[6] = 0;
                ptr[7] = 0;
                memcpy((void *)((long)(ptr + 10) - (ulong)uVar14),__src,(ulong)uVar14);
                pbVar19 = &DAT_0074dd20;
                __n = 1;
                ptr[0x9e] = 0;
                ptr[0x9f] = 0;
                ptr[0x9c] = 0;
                ptr[0x9d] = 0;
                goto LAB_009e9450;
              }
            }
          }
        }
        ERR_new();
        uVar15 = 0x5c8;
        goto LAB_009e90a0;
      }
      ERR_new();
      ERR_set_debug("ssl/statem/statem_srvr.c",0x5be,"tls_process_client_hello");
      uVar15 = 0x2f;
LAB_009e91b0:
      uVar16 = 0x9f;
      goto LAB_009e91b4;
    }
    if (uVar20 < 0x20) {
LAB_009e9190:
      ERR_new();
      uVar15 = 0x5e6;
LAB_009e91a8:
      ERR_set_debug("ssl/statem/statem_srvr.c",uVar15,"tls_process_client_hello");
      uVar15 = 0x32;
      goto LAB_009e91b0;
    }
    uVar15 = *(undefined8 *)(pbVar19 + 0x12);
    *(undefined8 *)(ptr + 8) = *(undefined8 *)(pbVar19 + 0x1a);
    *(undefined8 *)(ptr + 6) = uVar15;
    uVar15 = *(undefined8 *)(pbVar19 + 2);
    *(undefined8 *)(ptr + 4) = *(undefined8 *)(pbVar19 + 10);
    *(undefined8 *)(ptr + 2) = uVar15;
    lVar3 = *param_2;
    lVar4 = param_2[1];
    lVar12 = lVar4 + -0x20;
    *param_2 = lVar3 + 0x20;
    param_2[1] = lVar12;
    if (lVar12 == 0) goto LAB_009e9190;
    bVar6 = *(byte *)(lVar3 + 0x20);
    uVar17 = (ulong)bVar6;
    uVar20 = lVar4 - 0x21;
    if (uVar20 < uVar17) goto LAB_009e9190;
    *param_2 = lVar3 + 0x21 + uVar17;
    param_2[1] = uVar20 - uVar17;
    if (0x20 < bVar6) {
      ptr[10] = 0;
      ptr[0xb] = 0;
      goto LAB_009e9190;
    }
    *(ulong *)(ptr + 10) = uVar17;
    memcpy(ptr + 0xc,(void *)(lVar3 + 0x21),uVar17);
    if ((*(byte *)(*(long *)(*(long *)(param_1 + 8) + 0xc0) + 0x60) >> 3 & 1) != 0) {
      uVar17 = param_2[1];
      if (uVar17 != 0) {
        uVar17 = uVar17 - 1;
        pbVar19 = (byte *)*param_2 + 1;
        uVar20 = (ulong)*(byte *)*param_2;
        if (uVar20 <= uVar17) {
          *param_2 = (long)(pbVar19 + uVar20);
          param_2[1] = uVar17 - uVar20;
          *(ulong *)(ptr + 0x14) = uVar20;
          memcpy(ptr + 0x16,pbVar19,uVar20);
          uVar14 = SSL_get_options(param_1);
          if (((uVar14 >> 0xd & 1) != 0) && (*(long *)(ptr + 0x14) == 0)) {
            CRYPTO_free(ptr);
            return 1;
          }
          goto LAB_009e92f0;
        }
      }
      ERR_new();
      uVar15 = 0x5ec;
      goto LAB_009e91a8;
    }
LAB_009e92f0:
    uVar20 = param_2[1];
    uVar17 = uVar20 - 2;
    if (uVar20 < 2) {
LAB_009e9314:
      ERR_new();
      uVar15 = 0x603;
      goto LAB_009e91a8;
    }
    puVar18 = (undefined1 *)*param_2;
    uVar20 = (ulong)CONCAT11(*puVar18,puVar18[1]);
    if (uVar17 < uVar20) goto LAB_009e9314;
    *param_2 = (long)(puVar18 + 2 + uVar20);
    param_2[1] = uVar17 - uVar20;
    *(undefined1 **)(ptr + 0x56) = puVar18 + 2;
    *(ulong *)(ptr + 0x58) = uVar20;
    if (param_2[1] == 0) {
LAB_009e9394:
      ERR_new();
      uVar15 = 0x608;
      goto LAB_009e91a8;
    }
    uVar17 = param_2[1] - 1;
    pbVar19 = (byte *)*param_2 + 1;
    __n = (size_t)*(byte *)*param_2;
    lVar3 = uVar17 - __n;
    if (uVar17 < __n) goto LAB_009e9394;
    pbVar1 = pbVar19 + __n;
    *param_2 = (long)pbVar1;
    param_2[1] = lVar3;
    if (lVar3 == 1) {
LAB_009e94c4:
      ERR_new();
      uVar15 = 0x612;
      goto LAB_009e91a8;
    }
    if (lVar3 != 0) {
      uVar17 = (ulong)CONCAT11(*pbVar1,pbVar1[1]);
      if (uVar17 <= lVar3 - 2U) {
        *param_2 = (long)(pbVar1 + 2 + uVar17);
        param_2[1] = (lVar3 - 2U) - uVar17;
        *(byte **)(ptr + 0x9c) = pbVar1 + 2;
        *(ulong *)(ptr + 0x9e) = uVar17;
        if (param_2[1] == 0) goto LAB_009e9450;
      }
      goto LAB_009e94c4;
    }
    ptr[0x9c] = 0;
    ptr[0x9d] = 0;
    ptr[0x9e] = 0;
    ptr[0x9f] = 0;
LAB_009e9450:
    *(size_t *)(ptr + 0x5a) = __n;
    memcpy(ptr + 0x5c,pbVar19,__n);
    uStack_48 = *(undefined8 *)(ptr + 0x9e);
    local_50 = *(undefined8 *)(ptr + 0x9c);
    iVar13 = tls_collect_extensions(param_1,&local_50,0x80,ptr + 0xa2,ptr + 0xa0,1);
    if (iVar13 != 0) {
      *(int **)(param_1 + 0xb58) = ptr;
      return 2;
    }
  }
  else {
    if (((*(long *)(param_1 + 0x240) == 0) || (*(long *)(param_1 + 0x2c8) == 0)) &&
       (*(int *)(param_1 + 0x8e8) == 0)) {
      if (param_2[1] != 0) {
        uVar17 = param_2[1] - 1;
        cVar5 = *(char *)*param_2;
        *param_2 = (long)((char *)*param_2 + 1);
        param_2[1] = uVar17;
        if (cVar5 == '\x01') goto LAB_009e8fec;
      }
      ERR_new();
      ERR_set_debug("ssl/statem/statem_srvr.c",0x5a2,"tls_process_client_hello");
      uVar15 = 0x50;
      uVar16 = 0xc0103;
    }
    else {
      ERR_new();
      ERR_set_debug("ssl/statem/statem_srvr.c",0x588,"tls_process_client_hello");
      uVar15 = 10;
      uVar16 = 0xf4;
    }
LAB_009e91b4:
    ossl_statem_fatal(param_1,uVar15,uVar16,0);
  }
  CRYPTO_free(*(void **)(ptr + 0xa2));
LAB_009e91d4:
  CRYPTO_free(ptr);
  return 0;
}

