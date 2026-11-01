
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

long FUN_002dc27c(void)

{
  int iVar1;
  undefined8 *puVar2;
  code *pcVar3;
  long unaff_x19;
  undefined8 unaff_x20;
  
  *(undefined8 *)(unaff_x19 + 8) = 0;
  *(undefined **)(unaff_x19 + 0x10) = &_aws_lc_0_24_0_kem_asn1_meth;
  *(undefined4 *)(unaff_x19 + 4) = __aws_lc_0_24_0_kem_asn1_meth;
  puVar2 = (undefined8 *)func_0x0036e31c(0x18);
  if (puVar2 != (undefined8 *)0x0) {
    *puVar2 = unaff_x20;
    *(undefined8 **)(unaff_x19 + 8) = puVar2;
    return unaff_x19;
  }
  iVar1 = func_0x00370810();
  if (iVar1 != 0) {
    if ((*(long *)(unaff_x19 + 0x10) != 0) &&
       (pcVar3 = *(code **)(*(long *)(unaff_x19 + 0x10) + 0xa0), pcVar3 != (code *)0x0)) {
      (*pcVar3)();
      *(undefined8 *)(unaff_x19 + 8) = 0;
      *(undefined4 *)(unaff_x19 + 4) = 0;
    }
    func_0x0036e3d8();
  }
  return 0;
}

