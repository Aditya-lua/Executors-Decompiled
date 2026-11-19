/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009e26f0
 */

undefined8 FUN_009e26f0(long param_1,byte *param_2)

{
  byte bVar1;
  int iVar2;
  undefined8 uVar3;
  undefined8 uVar4;
  ulong uVar5;
  long lVar6;
  ulong uVar7;
  
  uVar7 = *(ulong *)(param_2 + 8);
  if (uVar7 < (ulong)(*(long *)(param_2 + 0x20) + *(long *)(param_2 + 0x18))) {
LAB_009e2730:
    ERR_new();
    uVar3 = 0x1be;
  }
  else {
    uVar5 = *(ulong *)(param_1 + 0xa00);
    if (uVar5 < 0x454d) {
      uVar5 = 0x454c;
    }
    if (uVar5 < uVar7) goto LAB_009e2730;
    if (*(long *)(*(long *)(param_1 + 0x4b8) + 0x1a8) == 0) {
      iVar2 = BUF_MEM_grow_clean(*(BUF_MEM **)(param_1 + 0x88),uVar7 + 0xc);
      if (iVar2 != 0) {
        lVar6 = *(long *)(param_1 + 0x4b8);
        *(ulong *)(param_1 + 0x2d0) = uVar7;
        *(ulong *)(lVar6 + 0x198) = uVar7;
        bVar1 = *param_2;
        *(uint *)(param_1 + 0x2d8) = (uint)bVar1;
        *(byte *)(lVar6 + 400) = bVar1;
        *(undefined2 *)(lVar6 + 0x1a0) = *(undefined2 *)(param_2 + 0x10);
        return 1;
      }
      ERR_new();
      ERR_set_debug("ssl/statem/statem_dtls.c",0x1c8,"dtls1_preprocess_fragment");
      uVar3 = 0x50;
      uVar4 = 0x80007;
      goto LAB_009e2754;
    }
    if (uVar7 == *(ulong *)(*(long *)(param_1 + 0x4b8) + 0x198)) {
      return 1;
    }
    ERR_new();
    uVar3 = 0x1d6;
  }
  ERR_set_debug("ssl/statem/statem_dtls.c",uVar3,"dtls1_preprocess_fragment");
  uVar3 = 0x2f;
  uVar4 = 0x98;
LAB_009e2754:
  ossl_statem_fatal(param_1,uVar3,uVar4,0);
  return 0;
}

