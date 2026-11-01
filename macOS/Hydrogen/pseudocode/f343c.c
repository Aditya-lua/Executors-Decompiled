
void FUN_000f343c(float param_1,float param_2,float param_3,undefined8 param_4)

{
  int iVar1;
  uint uVar2;
  bool in_ZR;
  long lVar3;
  int iVar4;
  long unaff_x19;
  float *unaff_x20;
  float *unaff_x21;
  float fVar5;
  float unaff_s9;
  undefined8 uStack0000000000000000;
  undefined8 uStack0000000000000018;
  
  if (!in_ZR) {
    param_3 = param_1;
  }
  uStack0000000000000018 =
       CONCAT44(param_2 + (float)((ulong)*(undefined8 *)unaff_x21 >> 0x20),
                param_2 + (float)*(undefined8 *)unaff_x21);
  uStack0000000000000000 = param_4;
  if (0.5 <= param_2) {
    func_0x000f1da4(param_2);
  }
  else {
    iVar4 = *(int *)(unaff_x19 + 0x78);
    if (iVar4 == *(int *)(unaff_x19 + 0x7c)) {
      iVar1 = iVar4;
      if (iVar4 < 0) {
        iVar1 = iVar4 + 1;
      }
      uVar2 = 8;
      if (iVar4 != 0) {
        uVar2 = iVar4 + (iVar1 >> 1);
      }
      if ((int)uVar2 <= (int)(iVar4 + 1U)) {
        uVar2 = iVar4 + 1U;
      }
      lVar3 = func_0x000b810c(-(ulong)(uVar2 >> 0x1f) & 0xfffffff800000000 | (ulong)uVar2 << 3);
      if (*(long *)(unaff_x19 + 0x80) != 0) {
        _memcpy(lVar3,*(long *)(unaff_x19 + 0x80),(long)*(int *)(unaff_x19 + 0x78) << 3);
        func_0x000b83d4(*(undefined8 *)(unaff_x19 + 0x80));
      }
      *(long *)(unaff_x19 + 0x80) = lVar3;
      *(uint *)(unaff_x19 + 0x7c) = uVar2;
      iVar4 = *(int *)(unaff_x19 + 0x78);
    }
    else {
      lVar3 = *(long *)(unaff_x19 + 0x80);
    }
    *(undefined8 *)(lVar3 + (long)iVar4 * 8) = uStack0000000000000018;
    *(int *)(unaff_x19 + 0x78) = *(int *)(unaff_x19 + 0x78) + 1;
  }
  uStack0000000000000018 = CONCAT44(unaff_s9 + unaff_x21[1],*unaff_x20 - unaff_s9);
  if (0.5 <= unaff_s9) {
    func_0x000f1da4(unaff_s9);
  }
  else {
    iVar4 = *(int *)(unaff_x19 + 0x78);
    if (iVar4 == *(int *)(unaff_x19 + 0x7c)) {
      iVar1 = iVar4;
      if (iVar4 < 0) {
        iVar1 = iVar4 + 1;
      }
      uVar2 = 8;
      if (iVar4 != 0) {
        uVar2 = iVar4 + (iVar1 >> 1);
      }
      if ((int)uVar2 <= (int)(iVar4 + 1U)) {
        uVar2 = iVar4 + 1U;
      }
      lVar3 = func_0x000b810c(-(ulong)(uVar2 >> 0x1f) & 0xfffffff800000000 | (ulong)uVar2 << 3);
      if (*(long *)(unaff_x19 + 0x80) != 0) {
        _memcpy(lVar3,*(long *)(unaff_x19 + 0x80),(long)*(int *)(unaff_x19 + 0x78) << 3);
        func_0x000b83d4(*(undefined8 *)(unaff_x19 + 0x80));
      }
      *(long *)(unaff_x19 + 0x80) = lVar3;
      *(uint *)(unaff_x19 + 0x7c) = uVar2;
      iVar4 = *(int *)(unaff_x19 + 0x78);
    }
    else {
      lVar3 = *(long *)(unaff_x19 + 0x80);
    }
    *(undefined8 *)(lVar3 + (long)iVar4 * 8) = uStack0000000000000018;
    *(int *)(unaff_x19 + 0x78) = *(int *)(unaff_x19 + 0x78) + 1;
  }
  fVar5 = (float)uStack0000000000000000;
  uStack0000000000000018 =
       CONCAT44((float)((ulong)*(undefined8 *)unaff_x20 >> 0x20) - fVar5,
                (float)*(undefined8 *)unaff_x20 - fVar5);
  if (0.5 <= fVar5) {
    func_0x000f1da4();
  }
  else {
    iVar4 = *(int *)(unaff_x19 + 0x78);
    if (iVar4 == *(int *)(unaff_x19 + 0x7c)) {
      iVar1 = iVar4;
      if (iVar4 < 0) {
        iVar1 = iVar4 + 1;
      }
      uVar2 = 8;
      if (iVar4 != 0) {
        uVar2 = iVar4 + (iVar1 >> 1);
      }
      if ((int)uVar2 <= (int)(iVar4 + 1U)) {
        uVar2 = iVar4 + 1U;
      }
      lVar3 = func_0x000b810c(-(ulong)(uVar2 >> 0x1f) & 0xfffffff800000000 | (ulong)uVar2 << 3);
      if (*(long *)(unaff_x19 + 0x80) != 0) {
        _memcpy(lVar3,*(long *)(unaff_x19 + 0x80),(long)*(int *)(unaff_x19 + 0x78) << 3);
        func_0x000b83d4(*(undefined8 *)(unaff_x19 + 0x80));
      }
      *(long *)(unaff_x19 + 0x80) = lVar3;
      *(uint *)(unaff_x19 + 0x7c) = uVar2;
      iVar4 = *(int *)(unaff_x19 + 0x78);
    }
    else {
      lVar3 = *(long *)(unaff_x19 + 0x80);
    }
    *(undefined8 *)(lVar3 + (long)iVar4 * 8) = uStack0000000000000018;
    *(int *)(unaff_x19 + 0x78) = *(int *)(unaff_x19 + 0x78) + 1;
  }
  uStack0000000000000018 = CONCAT44(unaff_x20[1] - param_3,param_3 + *unaff_x21);
  if (0.5 <= param_3) {
    func_0x000f1da4(param_3);
  }
  else {
    iVar4 = *(int *)(unaff_x19 + 0x78);
    if (iVar4 == *(int *)(unaff_x19 + 0x7c)) {
      iVar1 = iVar4;
      if (iVar4 < 0) {
        iVar1 = iVar4 + 1;
      }
      uVar2 = 8;
      if (iVar4 != 0) {
        uVar2 = iVar4 + (iVar1 >> 1);
      }
      if ((int)uVar2 <= (int)(iVar4 + 1U)) {
        uVar2 = iVar4 + 1U;
      }
      lVar3 = func_0x000b810c(-(ulong)(uVar2 >> 0x1f) & 0xfffffff800000000 | (ulong)uVar2 << 3);
      if (*(long *)(unaff_x19 + 0x80) != 0) {
        _memcpy(lVar3,*(long *)(unaff_x19 + 0x80),(long)*(int *)(unaff_x19 + 0x78) << 3);
        func_0x000b83d4(*(undefined8 *)(unaff_x19 + 0x80));
      }
      *(long *)(unaff_x19 + 0x80) = lVar3;
      *(uint *)(unaff_x19 + 0x7c) = uVar2;
      iVar4 = *(int *)(unaff_x19 + 0x78);
    }
    else {
      lVar3 = *(long *)(unaff_x19 + 0x80);
    }
    *(undefined8 *)(lVar3 + (long)iVar4 * 8) = uStack0000000000000018;
    *(int *)(unaff_x19 + 0x78) = *(int *)(unaff_x19 + 0x78) + 1;
  }
  return;
}

