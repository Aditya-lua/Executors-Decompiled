
void FUN_004e7eb8(long param_1,undefined8 param_2,long param_3)

{
  uint uVar1;
  int iVar2;
  long *unaff_x19;
  long unaff_x20;
  long unaff_x21;
  long unaff_x22;
  undefined8 *unaff_x23;
  byte *unaff_x24;
  long lVar3;
  long unaff_x25;
  undefined8 uStack0000000000000008;
  long in_stack_00000010;
  long in_stack_00000018;
  
  while( true ) {
    lVar3 = unaff_x25;
    if (param_3 != unaff_x23[1]) goto LAB_004e7e94;
    iVar2 = _memcmp(param_1,*unaff_x23);
    if (iVar2 != 0) goto LAB_004e7e94;
    uVar1 = *(uint *)(unaff_x25 + 0x250);
    if ((uVar1 >> 2 & 1) != 0) goto LAB_004e7e94;
    if (((((uVar1 >> 0xd & 1) != 0) || ((*unaff_x24 & 1) == 0)) && ((uVar1 >> 3 & 1) == 0)) &&
       ((*unaff_x24 & 1) != 0 || (uVar1 & 0x1000) != 0)) goto LAB_004e7e94;
    if (unaff_x21 == uStack0000000000000008) {
      func_0x007a5594(&uStack0000000000000008,unaff_x21,1,8,8);
      unaff_x20 = in_stack_00000010;
    }
    lVar3 = unaff_x25 + 600;
    *(long *)(unaff_x20 + unaff_x21 * 8) = unaff_x25;
    unaff_x21 = unaff_x21 + 1;
    in_stack_00000018 = unaff_x21;
    if (lVar3 == unaff_x22) break;
    while ((*(int *)(lVar3 + 0x38) != 1 || (param_1 = *(long *)(lVar3 + 0x40), param_1 == 0))) {
LAB_004e7e94:
      lVar3 = lVar3 + 600;
      if (lVar3 == unaff_x22) goto code_r0x004e7f34;
    }
    param_3 = *(long *)(lVar3 + 0x48);
    unaff_x25 = lVar3;
  }
code_r0x004e7f34:
  unaff_x19[1] = in_stack_00000010;
  *unaff_x19 = uStack0000000000000008;
  unaff_x19[2] = in_stack_00000018;
  return;
}

