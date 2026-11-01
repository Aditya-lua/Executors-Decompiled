
void FUN_000f235c(undefined8 param_1,long param_2,long param_3)

{
  int iVar1;
  uint uVar2;
  int iVar3;
  long unaff_x19;
  undefined8 *unaff_x20;
  long unaff_x21;
  int unaff_w22;
  int unaff_w23;
  uint unaff_w24;
  int iVar4;
  ulong unaff_x25;
  float fVar5;
  float unaff_s8;
  float unaff_s9;
  float unaff_s10;
  undefined8 unaff_d11;
  undefined8 unaff_d12;
  float in_stack_00000000;
  undefined8 in_stack_00000010;
  
  do {
    _memcpy(unaff_x21,param_2,param_3);
    func_0x000b83d4(*(undefined8 *)(unaff_x19 + 0x80));
    do {
      *(long *)(unaff_x19 + 0x80) = unaff_x21;
      *(int *)(unaff_x19 + 0x7c) = (int)unaff_x25;
      iVar4 = *(int *)(unaff_x19 + 0x78);
      while( true ) {
        fVar5 = (float)in_stack_00000010;
        in_stack_00000010 = CONCAT44(in_stack_00000000,fVar5);
        *(ulong *)(unaff_x21 + (long)iVar4 * 8) =
             CONCAT44((float)((ulong)unaff_d12 >> 0x20) +
                      (float)((ulong)unaff_d11 >> 0x20) * in_stack_00000000,
                      (float)unaff_d12 + (float)unaff_d11 * fVar5);
        iVar3 = *(int *)(unaff_x19 + 0x78);
        iVar4 = iVar3 + 1;
        *(int *)(unaff_x19 + 0x78) = iVar4;
        unaff_w22 = unaff_w22 + 1;
        if (unaff_w23 == unaff_w22) {
          return;
        }
        in_stack_00000000 =
             (float)___sincosf_stret(unaff_s8 + unaff_s9 * ((float)unaff_w22 / unaff_s10));
        unaff_d12 = *unaff_x20;
        if (iVar4 == *(int *)(unaff_x19 + 0x7c)) break;
        unaff_x21 = *(long *)(unaff_x19 + 0x80);
      }
      iVar1 = iVar4;
      if (iVar4 < 0) {
        iVar1 = iVar3 + 2;
      }
      uVar2 = unaff_w24;
      if (iVar4 != 0) {
        uVar2 = iVar4 + (iVar1 >> 1);
      }
      if ((int)uVar2 <= (int)(iVar3 + 2U)) {
        uVar2 = iVar3 + 2U;
      }
      unaff_x25 = (ulong)uVar2;
      unaff_x21 = func_0x000b810c(-(ulong)(uVar2 >> 0x1f) & 0xfffffff800000000 | unaff_x25 << 3);
      param_2 = *(long *)(unaff_x19 + 0x80);
    } while (param_2 == 0);
    param_3 = (long)*(int *)(unaff_x19 + 0x78) << 3;
  } while( true );
}

