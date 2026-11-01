
void FUN_0066db00(void)

{
  byte bVar1;
  char cVar2;
  code *pcVar3;
  bool in_ZR;
  long *plVar4;
  undefined8 uVar5;
  int in_w8;
  uint uVar6;
  long lVar7;
  byte *pbVar8;
  long *unaff_x19;
  long unaff_x20;
  ulong uVar9;
  long unaff_x22;
  uint unaff_w23;
  undefined1 uStack0000000000000008;
  
  if (in_ZR) {
    bVar1 = *(byte *)(unaff_x22 + (ulong)(unaff_w23 - 1));
    if ((bVar1 == 0) || (unaff_w23 < bVar1)) {
LAB_0066dcd8:
      uVar5 = ___cxa_allocate_exception(0x28);
      func_0x0000a968(&uStack0000000000000008,
                      "StreamTransformationFilter: invalid PKCS #7 block padding found");
      func_0x005f3d74(uVar5,&uStack0000000000000008);
      ___cxa_throw(uVar5,&DAT_009b6548,&DAT_005f3df4);
      goto code_r0x0066ddb8;
    }
    uVar9 = (ulong)(unaff_w23 - bVar1);
    pbVar8 = (byte *)(unaff_x22 + uVar9);
    lVar7 = unaff_x20 - uVar9;
    do {
      if ((uint)bVar1 != (uint)*pbVar8) {
        if (lVar7 != 0) goto LAB_0066dcd8;
        break;
      }
      pbVar8 = pbVar8 + 1;
      lVar7 = lVar7 + -1;
    } while (lVar7 != 0);
  }
  else if (in_w8 == 4) {
    uVar6 = (uint)*(byte *)(unaff_x22 + (ulong)(unaff_w23 - 1));
    if ((uVar6 == 0) || (unaff_w23 < uVar6)) {
      uVar5 = ___cxa_allocate_exception(0x28);
      func_0x0000a968(&uStack0000000000000008,
                      "StreamTransformationFilter: invalid W3C block padding found");
      func_0x005f3d74(uVar5,&uStack0000000000000008);
      ___cxa_throw(uVar5,&DAT_009b6548,&DAT_005f3df4);
code_r0x0066ddb8:
                    /* WARNING: Does not return */
      pcVar3 = (code *)SoftwareBreakpoint(1,0x66ddbc);
      (*pcVar3)();
    }
  }
  else {
    lVar7 = unaff_x20;
    do {
      if (lVar7 == 0 || lVar7 + -1 == 0) {
        cVar2 = *(char *)(unaff_x22 - (ulong)(unaff_x20 == 0));
        break;
      }
      cVar2 = *(char *)(unaff_x22 + -1 + lVar7);
      lVar7 = lVar7 + -1;
    } while (cVar2 == '\0');
    if (cVar2 != -0x80) {
      uVar5 = ___cxa_allocate_exception(0x28);
      func_0x0000a968(&uStack0000000000000008,
                      "StreamTransformationFilter: invalid ones-and-zeros padding found");
      func_0x005f3d74(uVar5,&uStack0000000000000008);
      ___cxa_throw(uVar5,&DAT_009b6548,&DAT_005f3df4);
      goto code_r0x0066ddb8;
    }
  }
  plVar4 = (long *)(**(code **)(*unaff_x19 + 0x160))();
  (**(code **)(*plVar4 + 0x38))();
  return;
}

