
void FUN_001b77c4(void)

{
  undefined8 uVar1;
  ulong uVar2;
  long lVar3;
  long lVar4;
  long lVar5;
  long *unaff_x19;
  long unaff_x20;
  long unaff_x21;
  long unaff_x22;
  
  _memcpy();
  lVar4 = *unaff_x19;
  lVar3 = unaff_x22 + unaff_x21;
  unaff_x19[2] = lVar3;
  uVar1 = *(undefined8 *)(unaff_x20 + 0x58);
  uVar2 = *(ulong *)(unaff_x20 + 0x60);
  if ((ulong)(lVar4 - lVar3) < 2) {
    func_0x0079b61c();
    lVar3 = unaff_x19[2];
    lVar4 = *unaff_x19;
  }
  lVar5 = unaff_x19[1];
  *(ushort *)(lVar5 + lVar3) = (ushort)(uVar2 >> 8) & 0xff | (ushort)(((uint)uVar2 & 0xff00ff) << 8)
  ;
  lVar3 = lVar3 + 2;
  unaff_x19[2] = lVar3;
  if ((ulong)(lVar4 - lVar3) < uVar2) {
    func_0x0079b61c();
    lVar5 = unaff_x19[1];
    lVar3 = unaff_x19[2];
  }
  _memcpy(lVar5 + lVar3,uVar1,uVar2);
  unaff_x19[2] = lVar3 + uVar2;
                    /* WARNING: Could not recover jumptable at 0x002277d4. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)(&UNK_002277d8 + (ulong)(byte)(&UNK_00828215)[*(ushort *)(unaff_x20 + 0x18)] * 4))();
  return;
}

