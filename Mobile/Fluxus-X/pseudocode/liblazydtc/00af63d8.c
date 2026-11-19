/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00af63d8
 */

undefined8 FUN_00af63d8(undefined8 *param_1,void *param_2,void *param_3,int param_4)

{
  bool bVar1;
  int iVar2;
  undefined8 uVar3;
  ASN1_VALUE *val;
  ASN1_VALUE *pAVar4;
  ASN1_BIT_STRING *pAVar5;
  long lVar6;
  size_t sVar7;
  long lVar8;
  size_t __n;
  size_t sVar9;
  
  __n = (size_t)param_4;
  iVar2 = memcmp(param_2,param_3,__n);
  if (0 < iVar2) {
    return 0;
  }
  iVar2 = FUN_00af6c48(param_2,param_3,param_4);
  if (-1 < iVar2) {
    uVar3 = FUN_00af6210(param_1,param_2,iVar2,param_4);
    return uVar3;
  }
  val = ASN1_item_new((ASN1_ITEM *)&DAT_00c7e788);
  if (val == (ASN1_VALUE *)0x0) {
    return 0;
  }
  *(undefined4 *)val = 1;
  pAVar4 = ASN1_item_new((ASN1_ITEM *)&DAT_00c7e750);
  *(ASN1_VALUE **)(val + 8) = pAVar4;
  if (pAVar4 != (ASN1_VALUE *)0x0) {
    if (*(long *)pAVar4 == 0) {
      pAVar5 = ASN1_BIT_STRING_new();
      **(undefined8 **)(val + 8) = pAVar5;
      if (pAVar5 == (ASN1_BIT_STRING *)0x0) goto LAB_00af664c;
      pAVar4 = *(ASN1_VALUE **)(val + 8);
    }
    if (*(long *)(pAVar4 + 8) == 0) {
      pAVar5 = ASN1_BIT_STRING_new();
      *(ASN1_BIT_STRING **)(*(long *)(val + 8) + 8) = pAVar5;
      if (pAVar5 == (ASN1_BIT_STRING *)0x0) goto LAB_00af664c;
    }
    lVar8 = __n << 0x20;
    sVar9 = __n;
    do {
      sVar7 = sVar9;
      lVar8 = lVar8 + -0x100000000;
      if ((long)sVar7 < 1) {
        bVar1 = false;
        goto LAB_00af6510;
      }
      sVar9 = sVar7 - 1;
    } while (*(char *)((long)param_2 + (sVar7 - 1)) == '\0');
    bVar1 = true;
LAB_00af6510:
    iVar2 = ASN1_BIT_STRING_set((ASN1_STRING *)**(undefined8 **)(val + 8),param_2,(int)sVar7);
    if (iVar2 != 0) {
      *(ulong *)(**(long **)(val + 8) + 0x10) =
           *(ulong *)(**(long **)(val + 8) + 0x10) & 0xfffffffffffffff8;
      *(ulong *)(**(long **)(val + 8) + 0x10) = *(ulong *)(**(long **)(val + 8) + 0x10) | 8;
      if (bVar1) {
        lVar6 = -8;
        do {
          iVar2 = (int)lVar6;
          lVar6 = lVar6 + 1;
        } while ((0xffU >> (ulong)(iVar2 + 9U & 0x1f) &
                 (uint)*(byte *)((long)param_2 + (lVar8 >> 0x20))) != 0);
        *(ulong *)(**(long **)(val + 8) + 0x10) = *(ulong *)(**(long **)(val + 8) + 0x10) | -lVar6;
      }
      lVar8 = __n << 0x20;
      do {
        sVar9 = __n;
        lVar8 = lVar8 + -0x100000000;
        if ((long)sVar9 < 1) {
          bVar1 = false;
          goto LAB_00af65c4;
        }
        __n = sVar9 - 1;
      } while (*(char *)((long)param_3 + (sVar9 - 1)) == -1);
      bVar1 = true;
LAB_00af65c4:
      iVar2 = ASN1_BIT_STRING_set(*(ASN1_STRING **)(*(long *)(val + 8) + 8),param_3,(int)sVar9);
      if (iVar2 != 0) {
        *(ulong *)(*(long *)(*(long *)(val + 8) + 8) + 0x10) =
             *(ulong *)(*(long *)(*(long *)(val + 8) + 8) + 0x10) & 0xfffffffffffffff8;
        *(ulong *)(*(long *)(*(long *)(val + 8) + 8) + 0x10) =
             *(ulong *)(*(long *)(*(long *)(val + 8) + 8) + 0x10) | 8;
        if (bVar1) {
          lVar6 = -8;
          do {
            iVar2 = (int)lVar6;
            lVar6 = lVar6 + 1;
          } while ((0xffU >> (ulong)(iVar2 + 9U & 0x1f) &
                   (*(byte *)((long)param_3 + (lVar8 >> 0x20)) ^ 0xffffffff)) != 0);
          *(ulong *)(*(long *)(*(long *)(val + 8) + 8) + 0x10) =
               *(ulong *)(*(long *)(*(long *)(val + 8) + 8) + 0x10) | -lVar6;
        }
        *param_1 = val;
        return 1;
      }
    }
  }
LAB_00af664c:
  ASN1_item_free(val,(ASN1_ITEM *)&DAT_00c7e788);
  return 0;
}

