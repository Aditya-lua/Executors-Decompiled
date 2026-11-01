
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_0012be4c(float param_1,float param_2,undefined1 param_3 [16],undefined1 param_4 [16],
                 float param_5)

{
  undefined4 uVar1;
  int iVar2;
  int in_w8;
  int unaff_w19;
  int unaff_w20;
  int unaff_w21;
  long *unaff_x22;
  long unaff_x23;
  int unaff_w24;
  undefined4 unaff_w26;
  undefined4 unaff_w27;
  long unaff_x28;
  float fVar3;
  float fVar4;
  float unaff_s8;
  float unaff_s9;
  float unaff_s10;
  float unaff_s11;
  float unaff_s12;
  float unaff_s13;
  float unaff_s14;
  undefined4 unaff_s15;
  undefined8 in_stack_00000028;
  long in_stack_00000030;
  undefined8 in_stack_00000038;
  float fStack0000000000000048;
  float fStack000000000000004c;
  float fStack0000000000000050;
  float fStack0000000000000054;
  undefined1 uStack0000000000000058;
  float fStack0000000000000070;
  float fStack0000000000000074;
  undefined4 uStack0000000000000078;
  undefined1 uStack0000000000000080;
  float fStack0000000000000084;
  
  while( true ) {
    param_5 = param_5 + unaff_s12 * unaff_s10;
    if (param_2 + 2.0 <= param_5) {
      param_5 = param_5 + -1.0;
    }
    _uStack0000000000000058 = CONCAT44(unaff_s15,param_5);
    uVar1 = unaff_w27;
    if (unaff_w20 != in_w8) {
      uVar1 = unaff_w26;
    }
    _uStack0000000000000080 = param_2;
    fStack0000000000000084 = param_1;
    func_0x000f3bb0(0,*(undefined8 *)(unaff_x23 + 0x2a8),&uStack0000000000000080,
                    &uStack0000000000000058,uVar1,0);
    unaff_w24 = unaff_w24 + -1;
    if (unaff_w24 == 0) break;
    in_w8 = (int)(fStack0000000000000050 * unaff_s12 + 0.5);
    param_2 = fStack0000000000000054 + unaff_s12 * unaff_s10;
    unaff_s12 = unaff_s13 + unaff_s12;
    iVar2 = 0;
    if (unaff_w21 != 0) {
      iVar2 = (unaff_w19 + in_w8) / unaff_w21;
    }
    fVar3 = unaff_s9 *
            (*(float *)(*unaff_x22 +
                       (long)(int)unaff_x22[1] * (long)((unaff_w19 + in_w8) - iVar2 * unaff_w21)) -
            unaff_s8);
    fVar4 = 0.0;
    if (fVar3 <= unaff_s11) {
      fVar4 = unaff_s11 - fVar3;
    }
    param_1 = fStack0000000000000048 + unaff_s14 * fStack000000000000004c;
    param_5 = fStack0000000000000054;
    unaff_s14 = unaff_s11;
    if (0.0 <= fVar3) {
      unaff_s14 = fVar4;
    }
  }
  if (in_stack_00000030 != 0) {
    fStack0000000000000084 = fStack0000000000000074 + *(float *)(&UNK_00003928 + unaff_x28);
    _uStack0000000000000080 = fStack0000000000000070;
    _uStack0000000000000058 = _UNK_00813248;
    func_0x000bca40(&uStack0000000000000080,&uStack0000000000000078,in_stack_00000030,0,0,
                    &uStack0000000000000058,0);
  }
  if (0.0 < in_stack_00000028._4_4_) {
    func_0x000bc130(uStack0000000000000078 + *(float *)(&UNK_0000393c + unaff_x28),
                    fStack0000000000000048,in_stack_00000038,0,1);
  }
  return;
}

