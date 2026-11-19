/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0091ebb4
 */

/* WARNING: Removing unreachable block (ram,0x0091eda0) */
/* WARNING: Removing unreachable block (ram,0x0091edb4) */

int FUN_0091ebb4(long param_1,byte *param_2,int param_3)

{
  char *pcVar1;
  long lVar2;
  bool bVar3;
  bool bVar4;
  int iVar5;
  long lVar6;
  undefined4 uVar7;
  uint uVar8;
  ulong uVar9;
  undefined **ppuVar10;
  byte *pbVar11;
  byte *pbVar12;
  undefined8 local_70;
  long local_68;
  
  lVar2 = tpidr_el0;
  bVar3 = param_3 == 0;
  pcVar1 = "transfer";
  if (bVar3) {
    pcVar1 = "content";
  }
  local_68 = *(long *)(lVar2 + 0x28);
  uVar7 = 3;
  if (!bVar3) {
    uVar7 = 1;
  }
LAB_0091ec48:
  while ((uVar9 = (ulong)*param_2, *param_2 < 0x2d &&
         ((1L << (uVar9 & 0x3f) & 0x100100000200U) != 0))) {
    param_2 = param_2 + 1;
  }
  pbVar11 = (byte *)0x0;
  pbVar12 = param_2;
  do {
    uVar8 = (uint)uVar9;
    if (uVar8 < 0x20) {
      if (uVar8 != 9) {
        if (uVar8 != 0) goto LAB_0091eca0;
        break;
      }
    }
    else if (uVar8 != 0x20) {
      if (uVar8 == 0x2c) break;
LAB_0091eca0:
      if (3 < (uVar8 - 10 & 0xff)) {
        pbVar11 = pbVar12 + (1 - (long)param_2);
      }
    }
    pbVar12 = pbVar12 + 1;
    uVar9 = (ulong)*pbVar12;
  } while( true );
  if (pbVar11 == (byte *)0x0) goto LAB_0091ef6c;
  if ((((param_1 != 0) && ((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0)) &&
      ((*(long *)(param_1 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8))))) &&
     (0 < DAT_00cc46b0)) {
    FUN_009050ec(param_1,"looking for %s decoder: %.*s",pcVar1,(ulong)pbVar11 & 0xffffffff,param_2);
  }
  if (param_3 == 0) {
    bVar4 = false;
    uVar9 = *(ulong *)(param_1 + 0xa82);
LAB_0091ed5c:
    if ((uVar9 >> 0x23 & 1) != 0) {
LAB_0091efac:
      iVar5 = 0;
      if (((uint)uVar9 >> 0x1c & 1) == 0) goto LAB_0091f0bc;
      if (*(long *)(param_1 + 0x12a0) == 0) {
        if (DAT_00cc46b0 < 1) goto LAB_0091f0b8;
      }
      else {
        if (*(int *)(*(long *)(param_1 + 0x12a0) + 8) < 1) goto LAB_0091f0b8;
        iVar5 = 0;
        if (DAT_00cc46b0 < 1) goto LAB_0091f0bc;
      }
      FUN_009050ec(param_1,"decoder not requested, ignored: %.*s",(ulong)pbVar11 & 0xffffffff,
                   param_2);
      goto LAB_0091f0b8;
    }
  }
  else {
    bVar4 = false;
    if (pbVar11 == (byte *)0x7) {
      iVar5 = curl_strnequal(param_2,"chunked",7);
      bVar4 = iVar5 != 0;
    }
    uVar9 = *(ulong *)(param_1 + 0xa82);
    if (param_3 == 0) goto LAB_0091ed5c;
    if (!bVar4 && (uVar9 >> 0x16 & 1) == 0) goto LAB_0091efac;
  }
  lVar6 = FUN_00935568(param_1,uVar7);
  if (4 < lVar6 + 1U) {
    FUN_00904b80(param_1,"Reject response due to more than %u content encodings",5);
    iVar5 = 0x3d;
    goto LAB_0091f0bc;
  }
  if (((param_3 == 0) || (iVar5 = curl_strnequal(param_2,"chunked",pbVar11), iVar5 == 0)) ||
     ("chunked"[(long)pbVar11] != '\0')) {
    iVar5 = curl_strnequal(param_2,"identity",pbVar11);
    if ((((pbVar11 != (byte *)0x8) || (ppuVar10 = &PTR_s_identity_00c4f588, iVar5 == 0)) &&
        (((iVar5 = curl_strnequal(param_2,&DAT_002c6e43,pbVar11), pbVar11 != (byte *)0x4 ||
          (ppuVar10 = &PTR_s_identity_00c4f588, iVar5 == 0)) &&
         ((iVar5 = curl_strnequal(param_2,"deflate",pbVar11), pbVar11 != (byte *)0x7 ||
          (ppuVar10 = &PTR_s_deflate_00c4f5b8, iVar5 == 0)))))) &&
       ((iVar5 = curl_strnequal(param_2,&DAT_002af2db,pbVar11), pbVar11 != (byte *)0x4 ||
        (ppuVar10 = &PTR_DAT_00c4f5e8, iVar5 == 0)))) {
      iVar5 = curl_strnequal(param_2,"x-gzip",pbVar11);
      ppuVar10 = &PTR_DAT_00c4f5e8;
      if (iVar5 == 0 || pbVar11 != (byte *)0x6) {
        ppuVar10 = (undefined **)0x0;
      }
    }
  }
  else {
    ppuVar10 = &PTR_s_chunked_00c4f648;
  }
  if ((bVar4 && ppuVar10 != (undefined **)0x0) &&
     (lVar6 = FUN_00935644(param_1,ppuVar10), lVar6 != 0)) {
    iVar5 = 0;
    if ((*(byte *)(param_1 + 0xa85) >> 4 & 1) == 0) goto LAB_0091f0bc;
    if (*(long *)(param_1 + 0x12a0) == 0) {
      if (DAT_00cc46b0 < 1) goto LAB_0091f0b8;
    }
    else {
      if (*(int *)(*(long *)(param_1 + 0x12a0) + 8) < 1) goto LAB_0091f0b8;
      iVar5 = 0;
      if (DAT_00cc46b0 < 1) goto LAB_0091f0bc;
    }
    FUN_009050ec(param_1,"ignoring duplicate \'chunked\' decoder");
    goto LAB_0091f0b8;
  }
  if ((!bVar4 && !bVar3) && (lVar6 = FUN_00935600(param_1,"chunked"), lVar6 != 0)) {
    FUN_00904b80(param_1,"Reject response due to \'chunked\' not being the last Transfer-Encoding");
    iVar5 = 0x3d;
    goto LAB_0091f0bc;
  }
  if (ppuVar10 == (undefined **)0x0) {
    ppuVar10 = &PTR_s_ce_error_00c4f558;
  }
  iVar5 = FUN_00935470(&local_70,param_1,ppuVar10,uVar7);
  if (((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0) &&
     (((*(long *)(param_1 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8))) &&
      (0 < DAT_00cc46b0)))) {
    FUN_009050ec(param_1,"added %s decoder %s -> %d",pcVar1,*ppuVar10,iVar5);
  }
  if (iVar5 != 0) goto LAB_0091f0bc;
  iVar5 = FUN_00935594(param_1,local_70);
  if (iVar5 != 0) {
    FUN_0093551c(param_1,local_70);
    goto LAB_0091f0bc;
  }
  uVar8 = (uint)*pbVar12;
LAB_0091ef6c:
  param_2 = pbVar12;
  if (uVar8 == 0) {
LAB_0091f0b8:
    iVar5 = 0;
LAB_0091f0bc:
    if (*(long *)(lVar2 + 0x28) != local_68) {
                    /* WARNING: Subroutine does not return */
      __stack_chk_fail();
    }
    return iVar5;
  }
  goto LAB_0091ec48;
}

