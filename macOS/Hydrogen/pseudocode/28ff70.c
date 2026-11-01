
void FUN_0028ff70(long param_1)

{
  undefined8 *puVar1;
  long lVar2;
  int iVar3;
  long lVar4;
  undefined8 uVar5;
  undefined8 *puVar6;
  long *unaff_x19;
  long lVar7;
  ulong uVar8;
  
  if (*(ulong *)(param_1 + 8) == 0) {
    puVar6 = (undefined8 *)func_0x00373eb8(0);
    if ((puVar6 != (undefined8 *)0x0) ||
       ((puVar6 = (undefined8 *)_calloc(1,400), puVar6 != (undefined8 *)0x0 &&
        (iVar3 = func_0x00373f5c(0,puVar6,0x290080), iVar3 != 0)))) {
      _free(puVar6[1]);
      *puVar6 = 0;
      puVar6[1] = 0;
      puVar6[2] = 0;
      _free(puVar6[4]);
      puVar6[3] = 0;
      puVar6[4] = 0;
      puVar6[5] = 0;
      _free(puVar6[7]);
      puVar6[6] = 0;
      puVar6[7] = 0;
      puVar6[8] = 0;
      _free(puVar6[10]);
      puVar6[9] = 0;
      puVar6[10] = 0;
      puVar6[0xb] = 0;
      _free(puVar6[0xd]);
      puVar6[0xc] = 0;
      puVar6[0xd] = 0;
      puVar6[0xe] = 0;
      _free(puVar6[0x10]);
      puVar6[0xf] = 0;
      puVar6[0x10] = 0;
      puVar6[0x11] = 0;
      _free(puVar6[0x13]);
      puVar6[0x12] = 0;
      puVar6[0x13] = 0;
      puVar6[0x14] = 0;
      _free(puVar6[0x16]);
      puVar6[0x15] = 0;
      puVar6[0x16] = 0;
      puVar6[0x17] = 0;
      _free(puVar6[0x19]);
      puVar6[0x18] = 0;
      puVar6[0x19] = 0;
      puVar6[0x1a] = 0;
      _free(puVar6[0x1c]);
      puVar6[0x1b] = 0;
      puVar6[0x1c] = 0;
      puVar6[0x1d] = 0;
      _free(puVar6[0x1f]);
      puVar6[0x1e] = 0;
      puVar6[0x1f] = 0;
      puVar6[0x20] = 0;
      _free(puVar6[0x22]);
      puVar6[0x21] = 0;
      puVar6[0x22] = 0;
      puVar6[0x23] = 0;
      _free(puVar6[0x25]);
      puVar6[0x24] = 0;
      puVar6[0x25] = 0;
      puVar6[0x26] = 0;
      _free(puVar6[0x28]);
      puVar6[0x27] = 0;
      puVar6[0x28] = 0;
      puVar6[0x29] = 0;
      _free(puVar6[0x2b]);
      puVar6[0x2a] = 0;
      puVar6[0x2b] = 0;
      puVar6[0x2c] = 0;
      _free(puVar6[0x2e]);
      puVar6[0x2d] = 0;
      puVar6[0x2e] = 0;
      puVar6[0x2f] = 0;
      _free(puVar6[0x31]);
      puVar6[0x30] = 0;
      puVar6[0x31] = 0;
    }
    return;
  }
  if (0xf < *(ulong *)(param_1 + 8)) {
    puVar6 = (undefined8 *)_abort();
    if (puVar6 == (undefined8 *)0x0) {
      return;
    }
    _free(puVar6[1]);
    *puVar6 = 0;
    puVar6[1] = 0;
    puVar6[2] = 0;
    _free(puVar6[4]);
    puVar6[3] = 0;
    puVar6[4] = 0;
    puVar6[5] = 0;
    _free(puVar6[7]);
    puVar6[6] = 0;
    puVar6[7] = 0;
    puVar6[8] = 0;
    _free(puVar6[10]);
    puVar6[9] = 0;
    puVar6[10] = 0;
    puVar6[0xb] = 0;
    _free(puVar6[0xd]);
    puVar6[0xc] = 0;
    puVar6[0xd] = 0;
    puVar6[0xe] = 0;
    _free(puVar6[0x10]);
    puVar6[0xf] = 0;
    puVar6[0x10] = 0;
    puVar6[0x11] = 0;
    _free(puVar6[0x13]);
    puVar6[0x12] = 0;
    puVar6[0x13] = 0;
    puVar6[0x14] = 0;
    _free(puVar6[0x16]);
    puVar6[0x15] = 0;
    puVar6[0x16] = 0;
    puVar6[0x17] = 0;
    _free(puVar6[0x19]);
    puVar6[0x18] = 0;
    puVar6[0x19] = 0;
    puVar6[0x1a] = 0;
    _free(puVar6[0x1c]);
    puVar6[0x1b] = 0;
    puVar6[0x1c] = 0;
    puVar6[0x1d] = 0;
    _free(puVar6[0x1f]);
    puVar6[0x1e] = 0;
    puVar6[0x1f] = 0;
    puVar6[0x20] = 0;
    _free(puVar6[0x22]);
    puVar6[0x21] = 0;
    puVar6[0x22] = 0;
    puVar6[0x23] = 0;
    _free(puVar6[0x25]);
    puVar6[0x24] = 0;
    puVar6[0x25] = 0;
    puVar6[0x26] = 0;
    _free(puVar6[0x28]);
    puVar6[0x27] = 0;
    puVar6[0x28] = 0;
    puVar6[0x29] = 0;
    _free(puVar6[0x2b]);
    puVar6[0x2a] = 0;
    puVar6[0x2b] = 0;
    puVar6[0x2c] = 0;
    _free(puVar6[0x2e]);
    puVar6[0x2d] = 0;
    puVar6[0x2e] = 0;
    puVar6[0x2f] = 0;
    _free(puVar6[0x31]);
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)PTR__free_00a24e58)(puVar6);
    return;
  }
  lVar4 = func_0x00373eb8(0);
  if ((lVar4 == 0) &&
     ((lVar4 = _calloc(1,400), lVar4 == 0 || (iVar3 = func_0x00373f5c(0,lVar4,0x290080), iVar3 == 0)
      ))) {
    return;
  }
  if (unaff_x19[1] == 0) {
    iVar3 = -1;
  }
  else {
    lVar7 = 0;
    uVar8 = 0;
    do {
      puVar6 = (undefined8 *)(lVar4 + lVar7);
      puVar1 = (undefined8 *)(*unaff_x19 + lVar7);
      _free(puVar6[1]);
      *puVar6 = 0;
      puVar6[1] = 0;
      puVar6[2] = 0;
      lVar2 = puVar1[1];
      *puVar6 = *puVar1;
      if (lVar2 != 0) {
        uVar5 = _strdup();
        puVar6[1] = uVar5;
      }
      *(undefined4 *)(puVar6 + 2) = *(undefined4 *)(puVar1 + 2);
      *(undefined2 *)((long)puVar6 + 0x14) = *(undefined2 *)((long)puVar1 + 0x14);
      uVar8 = uVar8 + 1;
      lVar7 = lVar7 + 0x18;
    } while (uVar8 < (ulong)unaff_x19[1]);
    iVar3 = (int)unaff_x19[1] + -1;
  }
  *(int *)(lVar4 + 0x180) = iVar3;
  *(undefined4 *)(lVar4 + 0x184) = 0xf;
  return;
}

