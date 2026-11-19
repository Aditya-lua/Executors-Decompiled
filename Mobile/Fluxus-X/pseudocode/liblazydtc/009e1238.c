/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009e1238
 */

/* WARNING: Removing unreachable block (ram,0x009e14e8) */
/* WARNING: Removing unreachable block (ram,0x009e14d0) */
/* WARNING: Removing unreachable block (ram,0x009e18b0) */
/* WARNING: Removing unreachable block (ram,0x009e134c) */

undefined8 dtls_get_message(undefined4 *param_1,int *param_2)

{
  undefined1 uVar1;
  ushort uVar2;
  undefined1 uVar3;
  undefined1 uVar4;
  bool bVar5;
  bool bVar6;
  char cVar7;
  int iVar8;
  pitem *ppVar9;
  pitem *item;
  ulong uVar10;
  undefined8 uVar11;
  undefined8 uVar12;
  undefined1 *puVar13;
  long lVar14;
  long lVar15;
  uint uVar16;
  void *ptr;
  void *pvVar17;
  ulong uVar18;
  ulong uVar19;
  ulong uVar20;
  ulong local_1e8;
  char local_1e0 [8];
  ulong local_1d8;
  ulong local_1c8;
  ulong uStack_1c0;
  int local_188;
  char local_184;
  byte local_183;
  byte local_182;
  byte local_181;
  undefined1 local_180;
  undefined1 local_17f;
  byte local_17e;
  byte local_17d;
  byte local_17c;
  byte local_17b;
  byte local_17a;
  byte local_179;
  pitem *local_178 [32];
  ulong local_78;
  long local_70 [2];
  
  lVar14 = *(long *)(param_1 + 0x12e);
  memset((void *)(lVar14 + 400),0,0x58);
LAB_009e1528:
  bVar6 = false;
  do {
    local_178[0] = pqueue_iterator(*(pqueue *)(*(long *)(param_1 + 0x12e) + 0x118));
    ppVar9 = pqueue_next(local_178);
    if (ppVar9 != (pitem *)0x0) {
      do {
        pvVar17 = ppVar9->data;
        uVar2 = *(ushort *)(*(long *)(param_1 + 0x12e) + 0x110);
        if (uVar2 <= *(ushort *)((long)pvVar17 + 0x10)) {
          bVar5 = false;
LAB_009e1670:
          lVar15 = *(long *)((long)pvVar17 + 0x60);
          ptr = pvVar17;
          item = ppVar9;
joined_r0x009e1678:
          if ((lVar15 == 0) &&
             ((bVar5 || (*(short *)(*(long *)(param_1 + 0x12e) + 0x110) ==
                         *(short *)((long)ptr + 0x10))))) {
            uVar11 = *(undefined8 *)((long)ptr + 0x20);
            pqueue_pop(*(pqueue *)(*(long *)(param_1 + 0x12e) + 0x118));
            iVar8 = FUN_009e26f0(param_1,ptr);
            if (iVar8 == 0) {
              CRYPTO_free(*(void **)((long)ptr + 0x58));
              CRYPTO_free(*(void **)((long)ptr + 0x60));
              CRYPTO_free(ptr);
              pitem_free(item);
              goto LAB_009e19a8;
            }
            if (*(size_t *)((long)ptr + 0x20) != 0) {
              memcpy((void *)(*(long *)(*(long *)(param_1 + 0x22) + 8) + *(long *)((long)ptr + 0x18)
                             + 0xc),*(void **)((long)ptr + 0x58),*(size_t *)((long)ptr + 0x20));
            }
            CRYPTO_free(*(void **)((long)ptr + 0x58));
            CRYPTO_free(*(void **)((long)ptr + 0x60));
            CRYPTO_free(ptr);
            pitem_free(item);
            if (bVar5) {
              *(undefined4 *)(*(long *)(param_1 + 0x12e) + 0x10e) = 0;
            }
            *(undefined8 *)(param_1 + 0x26) = uVar11;
            goto LAB_009e19cc;
          }
          break;
        }
        if ((((uVar2 == 1) && (*(ushort *)((long)pvVar17 + 0x10) == 0)) && (param_1[0xe] != 0)) &&
           (param_1[0x17] == 0x15)) {
          item = pqueue_next(local_178);
          if (item == (pitem *)0x0) {
LAB_009e166c:
            bVar5 = true;
            goto LAB_009e1670;
          }
          ptr = item->data;
          if (*(short *)((long)ptr + 0x10) != *(short *)(*(long *)(param_1 + 0x12e) + 0x110))
          goto LAB_009e166c;
          pqueue_pop(*(pqueue *)(*(long *)(param_1 + 0x12e) + 0x118));
          if (pvVar17 != (void *)0x0) {
            CRYPTO_free(*(void **)((long)pvVar17 + 0x58));
            CRYPTO_free(*(void **)((long)pvVar17 + 0x60));
            CRYPTO_free(pvVar17);
          }
          pitem_free(ppVar9);
          bVar5 = false;
          lVar15 = *(long *)((long)ptr + 0x60);
          goto joined_r0x009e1678;
        }
        pqueue_pop(*(pqueue *)(*(long *)(param_1 + 0x12e) + 0x118));
        if (pvVar17 != (void *)0x0) {
          CRYPTO_free(*(void **)((long)pvVar17 + 0x58));
          CRYPTO_free(*(void **)((long)pvVar17 + 0x60));
          CRYPTO_free(pvVar17);
        }
        pitem_free(ppVar9);
        ppVar9 = pqueue_next(local_178);
      } while (ppVar9 != (pitem *)0x0);
    }
    iVar8 = (**(code **)(*(long *)(param_1 + 2) + 0x68))
                      (param_1,0x16,&local_188,&local_184,0xc,0,&local_1e8);
    if (iVar8 < 1) {
LAB_009e189c:
      iVar8 = 0;
      param_1[10] = 3;
      goto LAB_009e19b8;
    }
    if (local_188 == 0x14) {
      if (local_184 == '\x01') {
        memcpy(*(void **)(*(long *)(param_1 + 0x22) + 8),&local_184,local_1e8);
        *(ulong *)(param_1 + 0x26) = local_1e8 - 1;
        lVar15 = *(long *)(*(long *)(param_1 + 0x22) + 8);
        param_1[0xb6] = 0x101;
        *(ulong *)(param_1 + 0xb4) = local_1e8 - 1;
        *(long *)(param_1 + 0x24) = lVar15 + 1;
        goto LAB_009e19cc;
      }
      ERR_new();
      ERR_set_debug("ssl/statem/statem_dtls.c",0x345,"dtls_get_reassembled_message");
      uVar11 = 10;
      uVar12 = 0x67;
      goto LAB_009e199c;
    }
    if (local_1e8 != 0xc) {
      ERR_new();
      uVar11 = 0x354;
      goto LAB_009e192c;
    }
    memset(local_1e0,0,0x58);
    uVar3 = local_17f;
    uVar1 = local_180;
    cVar7 = local_184;
    uVar19 = (ulong)local_183 << 0x10 | (ulong)local_182 << 8 | (ulong)local_181;
    uVar20 = (ulong)local_17e << 0x10 | (ulong)local_17d << 8 | (ulong)local_17c;
    uVar16 = (uint)CONCAT11(local_180,local_17f);
    uVar18 = (ulong)local_17b << 0x10 | (ulong)local_17a << 8 | (ulong)local_179;
    local_1e0[0] = local_184;
    local_1d8 = uVar19;
    local_1c8 = uVar20;
    uStack_1c0 = uVar18;
    uVar10 = RECORD_LAYER_get_rrec_length(param_1 + 0x316);
    if (uVar10 < uVar18) {
      ERR_new();
      uVar11 = 0x364;
LAB_009e1960:
      ERR_set_debug("ssl/statem/statem_dtls.c",uVar11,"dtls_get_reassembled_message");
      uVar11 = 0x2f;
      uVar12 = 0x10f;
      goto LAB_009e199c;
    }
    lVar15 = *(long *)(param_1 + 0x12e);
    if (uVar16 != *(ushort *)(lVar15 + 0x110)) {
      if (((local_184 == '\x01') && (*(ushort *)(lVar15 + 0x110) == 1)) &&
         ((uVar16 == 0 && (param_1[0xe] != 0)))) {
        if (param_1[0x17] == 0x15) {
          bVar6 = true;
          goto LAB_009e17a8;
        }
        uVar16 = 0;
      }
      if (uVar19 < uVar18 + uVar20) goto LAB_009e19b0;
      local_70[0] = (ulong)CONCAT11(uVar3,uVar1) << 0x30;
      ppVar9 = pqueue_find(*(pqueue *)(lVar15 + 0x118),(uchar *)local_70);
      uVar2 = *(ushort *)(*(long *)(param_1 + 0x12e) + 0x110);
      if ((((uVar16 <= uVar2) || (uVar18 == uVar19 && ppVar9 != (pitem *)0x0)) ||
          (uVar2 + 10 < uVar16)) || ((cVar7 == '\x14' && (uVar2 == 0)))) break;
      if (uVar18 != uVar19) {
LAB_009e14d4:
        iVar8 = FUN_009e23c0(param_1,local_1e0);
        goto LAB_009e19b8;
      }
      uVar18 = *(ulong *)(param_1 + 0x280);
      if (uVar18 < 0x454d) {
        uVar18 = 0x454c;
      }
      if ((uVar18 < uVar19) || (pvVar17 = (void *)FUN_009e2038(uVar19,0), pvVar17 == (void *)0x0))
      goto LAB_009e19b0;
      memcpy(pvVar17,local_1e0,0x58);
      if ((((uVar19 == 0) ||
           ((iVar8 = (**(code **)(*(long *)(param_1 + 2) + 0x68))
                               (param_1,0x16,0,*(undefined8 *)((long)pvVar17 + 0x58),uVar19,0,
                                &local_78), 0 < iVar8 && (local_78 == uVar19)))) &&
          (ppVar9 = pitem_new((uchar *)local_70,pvVar17), ppVar9 != (pitem *)0x0)) &&
         (ppVar9 = pqueue_insert(*(pqueue *)(*(long *)(param_1 + 0x12e) + 0x118),ppVar9),
         ppVar9 != (pitem *)0x0)) goto LAB_009e1340;
      CRYPTO_free(*(void **)((long)pvVar17 + 0x58));
      CRYPTO_free(*(void **)((long)pvVar17 + 0x60));
      CRYPTO_free(pvVar17);
      goto LAB_009e14c4;
    }
LAB_009e17a8:
    if ((uVar18 != 0) && (uVar18 < uVar19)) goto LAB_009e14d4;
    if ((((param_1[0xe] != 0) || (*(long *)(lVar15 + 0x1a8) != 0)) || (param_1[0x17] == 1)) ||
       (local_184 != '\0')) {
      iVar8 = FUN_009e26f0(param_1,local_1e0);
      if (iVar8 != 0) {
        if (uVar18 == 0) {
          local_1e8 = 0;
        }
        else {
          iVar8 = (**(code **)(*(long *)(param_1 + 2) + 0x68))
                            (param_1,0x16,0,*(long *)(*(long *)(param_1 + 0x22) + 8) + uVar20 + 0xc,
                             uVar18,0,&local_1e8);
          if (iVar8 < 1) goto LAB_009e189c;
          if (local_1e8 != uVar18) {
            ERR_new();
            uVar11 = 0x3ba;
            goto LAB_009e1960;
          }
        }
        if (bVar6) {
          *(undefined4 *)(*(long *)(param_1 + 0x12e) + 0x10e) = 0;
        }
        *(ulong *)(param_1 + 0x26) = uVar18;
LAB_009e19cc:
        iVar8 = param_1[0xb6];
        *param_2 = iVar8;
        puVar13 = *(undefined1 **)(*(long *)(param_1 + 0x22) + 8);
        if (iVar8 == 0x101) {
          if (*(code **)(param_1 + 0x130) != (code *)0x0) {
            (**(code **)(param_1 + 0x130))
                      (0,*param_1,0x14,puVar13,1,param_1,*(undefined8 *)(param_1 + 0x132));
            return 1;
          }
        }
        else {
          uVar11 = *(undefined8 *)(lVar14 + 0x198);
          *puVar13 = *(undefined1 *)(lVar14 + 400);
          puVar13[3] = (char)uVar11;
          uVar3 = (undefined1)((ulong)uVar11 >> 0x10);
          puVar13[1] = uVar3;
          uVar4 = (undefined1)((ulong)uVar11 >> 8);
          puVar13[2] = uVar4;
          puVar13[4] = *(undefined1 *)(lVar14 + 0x1a1);
          uVar1 = *(undefined1 *)(lVar14 + 0x1a0);
          *(undefined2 *)(puVar13 + 6) = 0;
          puVar13[8] = 0;
          puVar13[9] = uVar3;
          puVar13[10] = uVar4;
          puVar13[5] = uVar1;
          puVar13[0xb] = (char)uVar11;
          memset((void *)(lVar14 + 400),0,0x58);
          *(short *)(*(long *)(param_1 + 0x12e) + 0x110) =
               *(short *)(*(long *)(param_1 + 0x12e) + 0x110) + 1;
          *(long *)(param_1 + 0x24) = *(long *)(*(long *)(param_1 + 0x22) + 8) + 0xc;
        }
        return 1;
      }
      goto LAB_009e19a8;
    }
    if ((local_182 != 0 || local_183 != 0) || local_181 != 0) goto LAB_009e1924;
    if (*(code **)(param_1 + 0x130) != (code *)0x0) {
      (**(code **)(param_1 + 0x130))
                (0,*param_1,0x16,&local_184,0xc,param_1,*(undefined8 *)(param_1 + 0x132));
    }
    *(undefined8 *)(param_1 + 0x26) = 0;
  } while( true );
joined_r0x009e12f8:
  if (uVar18 == 0) goto LAB_009e1340;
  uVar10 = uVar18;
  if (0xff < uVar18) {
    uVar10 = 0x100;
  }
  iVar8 = (**(code **)(*(long *)(param_1 + 2) + 0x68))(param_1,0x16,0,local_178,uVar10,0,&local_78);
  if (iVar8 < 1) goto LAB_009e14c4;
  uVar18 = uVar18 - local_78;
  goto joined_r0x009e12f8;
LAB_009e1340:
  iVar8 = -3;
  goto LAB_009e19b8;
LAB_009e14c4:
  iVar8 = 0;
  goto LAB_009e19b8;
LAB_009e1924:
  ERR_new();
  uVar11 = 0x397;
LAB_009e192c:
  ERR_set_debug("ssl/statem/statem_dtls.c",uVar11,"dtls_get_reassembled_message");
  uVar11 = 10;
  uVar12 = 0xf4;
LAB_009e199c:
  ossl_statem_fatal(param_1,uVar11,uVar12,0);
LAB_009e19a8:
  *(undefined8 *)(param_1 + 0x26) = 0;
LAB_009e19b0:
  iVar8 = 0;
LAB_009e19b8:
  if (1 < iVar8 + 3U) {
    return 0;
  }
  goto LAB_009e1528;
}

