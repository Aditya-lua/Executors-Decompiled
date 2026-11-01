
void FUN_0079b3d0(undefined8 param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4,
                 undefined8 param_5,long param_6,ulong param_7)

{
  undefined8 *puVar1;
  long lVar2;
  code *pcVar3;
  undefined8 *puVar4;
  long lVar5;
  undefined8 uVar6;
  undefined8 uVar7;
  undefined8 uVar8;
  undefined1 auVar9 [16];
  long lStack_78;
  long lStack_70;
  long lStack_68;
  
  auVar9 = __Unwind_Resume();
  puVar4 = auVar9._0_8_;
  lStack_78 = 0;
  lStack_70 = 1;
  lStack_68 = 0;
  func_0x0079b61c(&lStack_78,0,0x20,1,1);
  puVar1 = (undefined8 *)(lStack_70 + lStack_68);
  uVar7 = puVar4[4];
  uVar6 = puVar4[3];
  uVar8 = puVar4[1];
  puVar1[1] = puVar4[2];
  *puVar1 = uVar8;
  puVar1[3] = uVar7;
  puVar1[2] = uVar6;
  lStack_68 = lStack_68 + 0x20;
  if ((ulong)(lStack_78 - lStack_68) < 0x20) {
    func_0x0079b61c(&lStack_78,lStack_68,0x20,1,1);
  }
  puVar1 = (undefined8 *)(lStack_70 + lStack_68);
  uVar6 = puVar4[5];
  uVar8 = puVar4[8];
  uVar7 = puVar4[7];
  puVar1[1] = puVar4[6];
  *puVar1 = uVar6;
  puVar1[3] = uVar8;
  puVar1[2] = uVar7;
  lStack_68 = lStack_68 + 0x20;
  lVar5 = lStack_70;
  if (param_6 != 0) {
    if (0xffff < param_7) {
      func_0x007a247c(&UNK_0081e509,0x29,&UNK_009c2bb0);
                    /* WARNING: Does not return */
      pcVar3 = (code *)SoftwareBreakpoint(1,0x79b590);
      (*pcVar3)();
    }
    if ((ulong)(lStack_78 - lStack_68) < 2) {
      func_0x0079b61c(&lStack_78,lStack_68,2,1,1);
    }
    *(ushort *)(lStack_70 + lStack_68) =
         (ushort)(param_7 >> 8) & 0xff | (ushort)(((uint)param_7 & 0xff00ff) << 8);
    lStack_68 = lStack_68 + 2;
    if ((ulong)(lStack_78 - lStack_68) < param_7) {
      func_0x0079b61c(&lStack_78,lStack_68,param_7,1,1);
    }
    lVar2 = lStack_68;
    lVar5 = lStack_70;
    _memcpy(lStack_70 + lStack_68,param_6,param_7);
    lStack_68 = lVar2 + param_7;
  }
  (**(code **)(((undefined8 *)*puVar4)[1] + 0x20))
            (*(undefined8 *)*puVar4,auVar9._8_8_,param_3,puVar4 + 9,0x30,param_4,param_5,lVar5,
             lStack_68);
  if (lStack_78 == 0) {
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(lVar5,lStack_78,1);
  return;
}

