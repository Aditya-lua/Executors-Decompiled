/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0091a54c
 */

undefined8 FUN_0091a54c(long param_1,uint param_2,byte *param_3)

{
  long lVar1;
  long lVar2;
  byte bVar3;
  bool bVar4;
  int iVar5;
  ulong uVar6;
  uint uVar7;
  
  bVar4 = (param_2 & 1) == 0;
  lVar1 = param_1 + 0xd70;
  if (bVar4) {
    lVar1 = param_1 + 0xd50;
  }
  lVar2 = 0x1348;
  if (bVar4) {
    lVar2 = 0x1350;
  }
  if (*param_3 == 0) {
    return 0;
  }
LAB_0091a5b8:
  iVar5 = curl_strnequal(param_3,&DAT_002cadad,4);
  if (iVar5 == 0) {
LAB_0091a640:
    iVar5 = curl_strnequal(param_3,"Digest",6);
    if (iVar5 != 0) {
      bVar3 = param_3[6];
      if (((bVar3 < 0x2d) && ((1L << ((ulong)bVar3 & 0x3f) & 0x100100000201U) != 0)) ||
         (bVar3 - 10 < 4)) {
        if ((*(byte *)(lVar1 + 0x10) >> 1 & 1) != 0) {
          if (param_1 == 0) goto LAB_0091a808;
          if ((*(byte *)(param_1 + 0xa85) >> 4 & 1) == 0) goto LAB_0091a808;
          if ((*(long *)(param_1 + 0x12a0) != 0) && (*(int *)(*(long *)(param_1 + 0x12a0) + 8) < 1))
          goto LAB_0091a808;
          FUN_00904c98(param_1,"Ignoring duplicate digest auth header.");
          bVar3 = *param_3;
          goto joined_r0x0091a710;
        }
        uVar6 = FUN_00963d90();
        if ((uVar6 & 1) == 0) goto LAB_0091a808;
        *(ulong *)(param_1 + lVar2) = *(ulong *)(param_1 + lVar2) | 2;
        *(ulong *)(lVar1 + 0x10) = *(ulong *)(lVar1 + 0x10) | 2;
        iVar5 = FUN_00924a2c(param_1,param_2 & 1,param_3);
        if (iVar5 == 0) goto LAB_0091a808;
        goto joined_r0x0091a778;
      }
    }
    iVar5 = curl_strnequal(param_3,"Basic",5);
    if (iVar5 == 0) {
LAB_0091a7a0:
      iVar5 = curl_strnequal(param_3,"Bearer",6);
      if (iVar5 == 0) goto LAB_0091a808;
      bVar3 = param_3[6];
      if (((0x2c < bVar3) || ((1L << ((ulong)bVar3 & 0x3f) & 0x100100000201U) == 0)) &&
         (3 < bVar3 - 10)) goto LAB_0091a808;
      *(ulong *)(param_1 + lVar2) = *(ulong *)(param_1 + lVar2) | 0x40;
      *(ulong *)(lVar1 + 0x10) = *(ulong *)(lVar1 + 0x10) | 0x40;
      if (*(long *)(lVar1 + 8) != 0x40) goto LAB_0091a808;
    }
    else {
      bVar3 = param_3[5];
      if (((0x2c < bVar3) || ((1L << ((ulong)bVar3 & 0x3f) & 0x100100000201U) == 0)) &&
         (3 < bVar3 - 10)) goto LAB_0091a7a0;
      *(ulong *)(param_1 + lVar2) = *(ulong *)(param_1 + lVar2) | 1;
      *(ulong *)(lVar1 + 0x10) = *(ulong *)(lVar1 + 0x10) | 1;
      if (*(long *)(lVar1 + 8) != 1) goto LAB_0091a808;
    }
    *(undefined8 *)(lVar1 + 0x10) = 0;
joined_r0x0091a778:
    if (((param_1 != 0) && ((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0)) &&
       ((*(long *)(param_1 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8))))) {
      FUN_00904c98(param_1,"Authentication problem. Ignoring this.");
    }
    uVar7 = *(uint *)(param_1 + 0x131c) | 0x20;
  }
  else {
    bVar3 = param_3[4];
    if (((0x2c < bVar3) || ((1L << ((ulong)bVar3 & 0x3f) & 0x100100000201U) == 0)) &&
       (3 < bVar3 - 10)) goto LAB_0091a640;
    if (((*(byte *)(lVar1 + 0x10) >> 3 & 1) == 0) && (uVar6 = FUN_00966eb8(), (uVar6 & 1) == 0))
    goto LAB_0091a808;
    *(ulong *)(param_1 + lVar2) = *(ulong *)(param_1 + lVar2) | 8;
    *(ulong *)(lVar1 + 0x10) = *(ulong *)(lVar1 + 0x10) | 8;
    if (*(long *)(lVar1 + 8) != 8) goto LAB_0091a808;
    iVar5 = FUN_00924ccc(param_1,param_2 & 1,param_3);
    if (iVar5 != 0) goto joined_r0x0091a778;
    uVar7 = *(uint *)(param_1 + 0x131c) & 0xffffffdf;
  }
  *(uint *)(param_1 + 0x131c) = uVar7;
  bVar3 = *param_3;
joined_r0x0091a710:
  while ((bVar3 != 0 && (bVar3 != 0x2c))) {
    param_3 = param_3 + 1;
LAB_0091a808:
    bVar3 = *param_3;
  }
  if (bVar3 == 0x2c) {
    param_3 = param_3 + 1;
  }
  do {
    bVar3 = *param_3;
    if ((bVar3 != 9) && (bVar3 != 0x20)) {
      uVar7 = (uint)bVar3;
      if (uVar7 == 0) {
        return 0;
      }
      if (3 < uVar7 - 10) break;
    }
    param_3 = param_3 + 1;
  } while( true );
  if (uVar7 == 0) {
    return 0;
  }
  goto LAB_0091a5b8;
}

