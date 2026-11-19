/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009e23c0
 */

undefined8 FUN_009e23c0(long param_1,void *param_2)

{
  int iVar1;
  pitem *ppVar2;
  void *ptr;
  uint uVar3;
  long lVar4;
  ulong uVar5;
  ulong uVar6;
  long lVar7;
  void *__dest;
  undefined1 auStack_150 [256];
  ulong local_50;
  long local_48;
  
  uVar5 = *(ulong *)((long)param_2 + 0x20);
  if (*(ulong *)((long)param_2 + 8) < *(long *)((long)param_2 + 0x18) + uVar5) {
    return 0xffffffff;
  }
  uVar6 = *(ulong *)(param_1 + 0xa00);
  if (uVar6 < 0x454d) {
    uVar6 = 0x454c;
  }
  if (uVar6 < *(ulong *)((long)param_2 + 8)) {
    return 0xffffffff;
  }
  if (uVar5 == 0) {
    return 0xfffffffd;
  }
  local_48 = (ulong)CONCAT11((char)*(undefined2 *)((long)param_2 + 0x10),
                             (char)((ushort)*(undefined2 *)((long)param_2 + 0x10) >> 8)) << 0x30;
  ppVar2 = pqueue_find(*(pqueue *)(*(long *)(param_1 + 0x4b8) + 0x118),(uchar *)&local_48);
  if (ppVar2 == (pitem *)0x0) {
    __dest = (void *)FUN_009e2038(*(undefined8 *)((long)param_2 + 8),1);
    if (__dest == (void *)0x0) {
      return 0xffffffff;
    }
    memcpy(__dest,param_2,0x58);
    *(undefined8 *)((long)__dest + 0x18) = 0;
    *(undefined8 *)((long)__dest + 0x20) = *(undefined8 *)((long)__dest + 8);
    lVar4 = *(long *)((long)__dest + 0x60);
  }
  else {
    __dest = ppVar2->data;
    if (*(long *)((long)__dest + 8) != *(long *)((long)param_2 + 8)) {
      return 0xffffffff;
    }
    lVar4 = *(long *)((long)__dest + 0x60);
  }
  if (lVar4 == 0) {
    while( true ) {
      uVar6 = uVar5;
      if (0xff < uVar5) {
        uVar6 = 0x100;
      }
      iVar1 = (**(code **)(*(long *)(param_1 + 8) + 0x68))
                        (param_1,0x16,0,auStack_150,uVar6,0,&local_50);
      if (iVar1 < 1) break;
      uVar5 = uVar5 - local_50;
      if (uVar5 == 0) {
        return 0xfffffffd;
      }
    }
  }
  else {
    iVar1 = (**(code **)(*(long *)(param_1 + 8) + 0x68))
                      (param_1,0x16,0,
                       *(long *)((long)__dest + 0x58) + *(long *)((long)param_2 + 0x18),uVar5,0,
                       &local_50);
    if ((0 < iVar1) && (local_50 == uVar5)) {
      uVar6 = *(ulong *)((long)param_2 + 0x18);
      if ((long)uVar5 < 9) {
        if ((long)uVar6 < (long)(uVar6 + uVar5)) {
          do {
            lVar4 = (long)uVar6 >> 3;
            uVar3 = (uint)uVar6;
            uVar6 = uVar6 + 1;
            *(byte *)(*(long *)((long)__dest + 0x60) + lVar4) =
                 *(byte *)(*(long *)((long)__dest + 0x60) + lVar4) | (byte)(1 << (ulong)(uVar3 & 7))
            ;
          } while ((long)uVar6 < (long)(*(long *)((long)param_2 + 0x18) + uVar5));
        }
      }
      else {
        *(byte *)(*(long *)((long)__dest + 0x60) + ((long)uVar6 >> 3)) =
             *(byte *)(*(long *)((long)__dest + 0x60) + ((long)uVar6 >> 3)) |
             (&DAT_0029b980)[uVar6 & 7];
        uVar6 = *(long *)((long)param_2 + 0x18) + uVar5;
        lVar4 = (*(long *)((long)param_2 + 0x18) >> 3) + 1;
        lVar7 = (long)(uVar6 - 1) >> 3;
        if (lVar4 < lVar7) {
          do {
            *(undefined1 *)(*(long *)((long)__dest + 0x60) + lVar4) = 0xff;
            lVar4 = lVar4 + 1;
            uVar6 = *(long *)((long)param_2 + 0x18) + uVar5;
            lVar7 = (long)(uVar6 - 1) >> 3;
          } while (lVar4 < lVar7);
        }
        *(byte *)(*(long *)((long)__dest + 0x60) + lVar7) =
             *(byte *)(*(long *)((long)__dest + 0x60) + lVar7) | (&DAT_0029a220)[uVar6 & 7];
      }
      uVar5 = *(ulong *)((long)param_2 + 8);
      if (uVar5 != 0) {
        ptr = *(void **)((long)__dest + 0x60);
        lVar4 = (long)(uVar5 - 1) >> 3;
        if (*(char *)((long)ptr + lVar4) == (&DAT_0029a220)[uVar5 & 7]) {
          do {
            if (lVar4 < 1) {
              CRYPTO_free(ptr);
              *(undefined8 *)((long)__dest + 0x60) = 0;
              break;
            }
            lVar7 = lVar4 + -1;
            lVar4 = lVar4 + -1;
          } while (*(char *)((long)ptr + lVar7) == -1);
        }
        if (ppVar2 != (pitem *)0x0) {
          return 0xfffffffd;
        }
        ppVar2 = pitem_new((uchar *)&local_48,__dest);
        if ((ppVar2 != (pitem *)0x0) &&
           (ppVar2 = pqueue_insert(*(pqueue *)(*(long *)(param_1 + 0x4b8) + 0x118),ppVar2),
           ppVar2 != (pitem *)0x0)) {
          return 0xfffffffd;
        }
        if (__dest == (void *)0x0) {
          return 0xffffffff;
        }
        goto LAB_009e2668;
      }
    }
  }
  if (ppVar2 != (pitem *)0x0) {
    return 0xffffffff;
  }
  if (__dest == (void *)0x0) {
    return 0xffffffff;
  }
LAB_009e2668:
  CRYPTO_free(*(void **)((long)__dest + 0x58));
  CRYPTO_free(*(void **)((long)__dest + 0x60));
  CRYPTO_free(__dest);
  return 0xffffffff;
}

