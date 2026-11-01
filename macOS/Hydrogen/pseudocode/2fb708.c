
/* WARNING: Removing unreachable block (ram,0x002fb8a0) */
/* WARNING: Removing unreachable block (ram,0x002fb9e0) */
/* WARNING: Removing unreachable block (ram,0x002fba08) */
/* WARNING: Removing unreachable block (ram,0x002fb9e8) */
/* WARNING: Removing unreachable block (ram,0x002fb8b0) */
/* WARNING: Removing unreachable block (ram,0x002fb8bc) */
/* WARNING: Removing unreachable block (ram,0x002fb7e8) */
/* WARNING: Removing unreachable block (ram,0x002fb804) */
/* WARNING: Removing unreachable block (ram,0x002fb748) */
/* WARNING: Removing unreachable block (ram,0x002fb7e0) */
/* WARNING: Removing unreachable block (ram,0x002fb824) */
/* WARNING: Removing unreachable block (ram,0x002fb82c) */
/* WARNING: Removing unreachable block (ram,0x002fb928) */
/* WARNING: Removing unreachable block (ram,0x002fb758) */
/* WARNING: Removing unreachable block (ram,0x002fb808) */
/* WARNING: Removing unreachable block (ram,0x002fb90c) */
/* WARNING: Removing unreachable block (ram,0x002fb814) */
/* WARNING: Removing unreachable block (ram,0x002fb83c) */
/* WARNING: Removing unreachable block (ram,0x002fb844) */
/* WARNING: Removing unreachable block (ram,0x002fb768) */
/* WARNING: Removing unreachable block (ram,0x002fb858) */
/* WARNING: Removing unreachable block (ram,0x002fb874) */
/* WARNING: Removing unreachable block (ram,0x002fb898) */
/* WARNING: Removing unreachable block (ram,0x002fb9c4) */
/* WARNING: Removing unreachable block (ram,0x002fba20) */
/* WARNING: Removing unreachable block (ram,0x002fb77c) */
/* WARNING: Removing unreachable block (ram,0x002fb8e8) */
/* WARNING: Removing unreachable block (ram,0x002fb8c4) */
/* WARNING: Removing unreachable block (ram,0x002fb9fc) */
/* WARNING: Removing unreachable block (ram,0x002fba00) */
/* WARNING: Removing unreachable block (ram,0x002fba24) */

undefined8 FUN_002fb708(void)

{
  int iVar1;
  code *pcVar2;
  long unaff_x19;
  long unaff_x20;
  
  func_0x003707e8(unaff_x20 + 0x58);
  iVar1 = func_0x002d8060();
  if (iVar1 != 0) {
    func_0x0028f83c(0xe,0,0x43,"/aws-lc/crypto/fipsmodule/evp/digestsign.c",0x10b);
  }
  func_0x0028f83c(4,0,0x44,"/aws-lc/crypto/fipsmodule/rsa/rsa.c",0x5a3);
  iVar1 = func_0x00370810();
  if (iVar1 != 0) {
    if ((*(long *)(unaff_x19 + 0x10) != 0) &&
       (pcVar2 = *(code **)(*(long *)(unaff_x19 + 0x10) + 0xa0), pcVar2 != (code *)0x0)) {
      (*pcVar2)();
      *(undefined8 *)(unaff_x19 + 8) = 0;
      *(undefined4 *)(unaff_x19 + 4) = 0;
    }
    func_0x0036e3d8();
  }
  func_0x002c13c0();
  func_0x0036e3d8(0);
  return 0;
}

