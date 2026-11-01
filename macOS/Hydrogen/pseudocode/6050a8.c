
void FUN_006050a8(uint param_1)

{
  long lVar1;
  long *plVar2;
  uint uVar3;
  long *unaff_x19;
  long unaff_x20;
  long unaff_x21;
  
  while (((param_1 >> 7 & 1) == 0 &&
         ((*(uint *)(*(long *)(unaff_x20 + 0x10) + (ulong)(param_1 & 0xff) * 4) >> 0xe & 1) != 0)))
  {
    plVar2 = *(long **)(unaff_x21 + *(long *)(*unaff_x19 + -0x18));
    if (plVar2[3] == plVar2[4]) {
      (**(code **)(*plVar2 + 0x50))();
    }
    else {
      plVar2[3] = plVar2[3] + 1;
    }
    plVar2 = *(long **)(unaff_x21 + *(long *)(*unaff_x19 + -0x18));
    if ((byte *)plVar2[3] == (byte *)plVar2[4]) {
      param_1 = (**(code **)(*plVar2 + 0x48))();
      if (param_1 == 0xffffffff) {
        uVar3 = 2;
code_r0x006050e8:
        lVar1 = (long)unaff_x19 + *(long *)(*unaff_x19 + -0x18);
        __ZNSt3__18ios_base5clearEj(lVar1,*(uint *)(lVar1 + 0x20) | uVar3);
        return;
      }
    }
    else {
      param_1 = (uint)*(byte *)plVar2[3];
    }
  }
  uVar3 = 0;
  goto code_r0x006050e8;
}

