
uint FUN_006e53cc(void)

{
  uint uVar1;
  long lVar2;
  long *plVar3;
  double *pdVar4;
  double *pdVar5;
  long unaff_x19;
  uint unaff_w20;
  int unaff_w21;
  double dVar6;
  double dVar7;
  
  if (unaff_w21 < 1) {
    if (unaff_w21 < -9999) {
      plVar3 = (long *)func_0x006e60a0();
      lVar2 = *plVar3;
      uVar1 = *(uint *)(lVar2 + 8);
      goto joined_r0x006e548c;
    }
    plVar3 = (long *)(*(long *)(unaff_x19 + 8) + (long)unaff_w21 * 0x10);
  }
  else {
    plVar3 = (long *)(*(long *)(unaff_x19 + 0x10) + (ulong)(unaff_w21 - 1) * 0x10);
    if (*(long **)(unaff_x19 + 8) <= plVar3) {
      lVar2 = __dyld_get_image_header(0);
      lVar2 = *(long *)(lVar2 + 0x4e8dd08);
      uVar1 = *(uint *)(lVar2 + 8);
      goto joined_r0x006e548c;
    }
  }
  lVar2 = *plVar3;
  uVar1 = *(uint *)(lVar2 + 8);
joined_r0x006e548c:
  if (unaff_w20 < uVar1) {
    pdVar5 = (double *)(*(long *)(lVar2 + 0x18) + (long)(int)unaff_w20 * 0x10);
    do {
      if (*(int *)((long)pdVar5 + 0xc) != 0) {
        pdVar4 = *(double **)(unaff_x19 + 8);
        unaff_w20 = unaff_w20 + 1;
        *pdVar4 = (double)(int)unaff_w20;
        *(undefined4 *)((long)pdVar4 + 0xc) = 3;
        dVar7 = pdVar5[1];
        dVar6 = *pdVar5;
        goto LAB_006e5508;
      }
      unaff_w20 = unaff_w20 + 1;
      pdVar5 = pdVar5 + 2;
    } while (unaff_w20 < uVar1);
  }
  if (unaff_w20 - uVar1 >> (ulong)(*(byte *)(lVar2 + 6) & 0x1f) == 0) {
    do {
      unaff_w20 = unaff_w20 + 1;
      pdVar5 = (double *)(*(long *)(lVar2 + 0x20) + (long)(int)((unaff_w20 - uVar1) - 1) * 0x20);
      if (*(int *)((long)pdVar5 + 0xc) != 0) {
        pdVar4 = *(double **)(unaff_x19 + 8);
        *pdVar4 = pdVar5[2];
        *(undefined4 *)(pdVar4 + 1) = *(undefined4 *)(pdVar5 + 3);
        *(uint *)((long)pdVar4 + 0xc) = *(uint *)((long)pdVar5 + 0x1c) & 0xf;
        dVar7 = pdVar5[1];
        dVar6 = *pdVar5;
LAB_006e5508:
        pdVar4[3] = dVar7;
        pdVar4[2] = dVar6;
        *(double **)(unaff_x19 + 8) = pdVar4 + 4;
        return unaff_w20;
      }
    } while (unaff_w20 - uVar1 >> (ulong)(*(byte *)(lVar2 + 6) & 0x1f) == 0);
  }
  return 0xffffffff;
}

