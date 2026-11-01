
void FUN_006a3f5c(void)

{
  uint uVar1;
  uint uVar2;
  code *pcVar3;
  int iVar4;
  undefined8 uVar5;
  long lVar6;
  ulong uVar7;
  ulong uVar8;
  ulong unaff_x19;
  long *unaff_x21;
  long unaff_x22;
  ulong unaff_x24;
  ulong unaff_x25;
  undefined8 uStack0000000000000018;
  
  do {
    unaff_x19 = unaff_x19 - unaff_x24;
    _memcpy(*(undefined8 *)(unaff_x22 + 0x70),*(undefined8 *)(unaff_x22 + 0x50),
            *(undefined4 *)(unaff_x22 + 0x10));
    func_0x006853f4(*(undefined8 *)(unaff_x22 + 0x50),*(undefined8 *)(unaff_x22 + 0x30),
                    *(undefined4 *)(unaff_x22 + 0x10));
    (**(code **)(**(long **)(unaff_x22 + 8) + 0x28))
              (*(long **)(unaff_x22 + 8),*(undefined8 *)(unaff_x22 + 0x50),0,
               *(undefined8 *)(unaff_x22 + 0x50));
    if (unaff_x19 == 0) {
      return;
    }
    if (*(long *)(unaff_x22 + 0x88) == 0) {
      _clock();
      func_0x006853f4(*(undefined8 *)(unaff_x22 + 0x30));
      uStack0000000000000018 = _time(0);
      uVar8 = (ulong)*(uint *)(unaff_x22 + 0x10);
      uVar7 = uVar8;
      if (7 < uVar8) {
        uVar7 = unaff_x25;
      }
      func_0x006853f4((*(long *)(unaff_x22 + 0x30) + uVar8) - uVar7,&uStack0000000000000018);
      (**(code **)(**(long **)(unaff_x22 + 8) + 0x28))
                (*(long **)(unaff_x22 + 8),*(undefined8 *)(unaff_x22 + 0x30),0,
                 *(undefined8 *)(unaff_x22 + 0x30));
    }
    else {
      (**(code **)(**(long **)(unaff_x22 + 8) + 0x28))
                (*(long **)(unaff_x22 + 8),*(undefined8 *)(unaff_x22 + 0x90),0,
                 *(undefined8 *)(unaff_x22 + 0x30));
      uVar7 = (ulong)*(uint *)(unaff_x22 + 0x10);
      if (*(uint *)(unaff_x22 + 0x10) != 0) {
        lVar6 = *(long *)(unaff_x22 + 0x90);
        do {
          uVar7 = uVar7 - 1;
          uVar1 = *(byte *)(lVar6 + uVar7) + 1;
          *(char *)(lVar6 + uVar7) = (char)uVar1;
          if (uVar7 == 0) break;
        } while (uVar1 >> 8 != 0);
      }
    }
    func_0x006853f4(*(undefined8 *)(unaff_x22 + 0x50),*(undefined8 *)(unaff_x22 + 0x30),
                    *(undefined4 *)(unaff_x22 + 0x10));
    (**(code **)(**(long **)(unaff_x22 + 8) + 0x28))
              (*(long **)(unaff_x22 + 8),*(undefined8 *)(unaff_x22 + 0x50),0,
               *(undefined8 *)(unaff_x22 + 0x50));
    uVar1 = *(uint *)(unaff_x22 + 0x10);
    iVar4 = _memcmp(*(undefined8 *)(unaff_x22 + 0x70),*(undefined8 *)(unaff_x22 + 0x50),(ulong)uVar1
                   );
    if (iVar4 == 0) {
      uVar5 = ___cxa_allocate_exception(0x28);
      func_0x0000a968();
      func_0x005ee06c(uVar5);
      ___cxa_throw(uVar5,&UNK_009f4668,&DAT_005ee0ec);
                    /* WARNING: Does not return */
      pcVar3 = (code *)SoftwareBreakpoint(1,0x6a4008);
      (*pcVar3)();
    }
    uVar2 = (uint)unaff_x19;
    if (uVar1 <= unaff_x19) {
      uVar2 = uVar1;
    }
    unaff_x24 = (ulong)uVar2;
    (**(code **)(*unaff_x21 + 0x130))();
  } while( true );
}

