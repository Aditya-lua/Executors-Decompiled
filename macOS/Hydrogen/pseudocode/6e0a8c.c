
void FUN_006e0a8c(ulong param_1,long param_2)

{
  ulong in_x9;
  ulong in_x11;
  ulong uVar1;
  long lVar2;
  ulong uVar3;
  ulong uVar4;
  ulong *puVar5;
  long *unaff_x19;
  long unaff_x20;
  ulong unaff_x21;
  
  do {
    lVar2 = *unaff_x19;
    uVar3 = *(ulong *)(lVar2 + param_1 * 0x18);
    if (uVar3 != unaff_x19[3]) {
      uVar1 = 0;
      uVar4 = uVar3 >> 4 ^ uVar3 >> 9;
      do {
        puVar5 = (ulong *)(param_2 + (uVar4 & in_x9) * 0x18);
        if (*puVar5 == unaff_x21) {
          *puVar5 = uVar3;
          goto LAB_006e0a98;
        }
        if (*puVar5 == uVar3) goto LAB_006e0a98;
        uVar1 = uVar1 + 1;
        uVar4 = uVar1 + (uVar4 & in_x9);
      } while (uVar1 <= in_x9);
      puVar5 = (ulong *)0x0;
LAB_006e0a98:
      *puVar5 = uVar3;
      lVar2 = lVar2 + param_1 * 0x18;
      uVar3 = *(ulong *)(lVar2 + 8);
      *(undefined2 *)(puVar5 + 2) = *(undefined2 *)(lVar2 + 0x10);
      puVar5[1] = uVar3;
      in_x11 = unaff_x19[1];
    }
    param_1 = param_1 + 1;
    if (in_x11 <= param_1) {
      lVar2 = *unaff_x19;
      *unaff_x19 = param_2;
      unaff_x19[1] = unaff_x20;
      if (lVar2 == 0) {
        return;
      }
                    /* WARNING: Could not recover jumptable at 0x007b2f68. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (*(code *)PTR___ZdlPv_009b01b8)(lVar2);
      return;
    }
  } while( true );
}

