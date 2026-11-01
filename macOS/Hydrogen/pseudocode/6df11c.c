
void FUN_006df11c(ulong param_1)

{
  ulong *puVar1;
  char cVar2;
  undefined8 *puVar3;
  ulong in_x9;
  long in_x10;
  ulong uVar4;
  long *unaff_x19;
  char *pcVar5;
  long unaff_x20;
  ulong unaff_x21;
  long lVar6;
  long unaff_x22;
  ulong unaff_x23;
  ulong unaff_x24;
  ulong *unaff_x26;
  long unaff_x27;
  undefined8 uVar7;
  undefined8 uVar8;
  
code_r0x006df11c:
  in_x9 = in_x9 + in_x10 & unaff_x24;
  uVar4 = *(ulong *)(unaff_x20 + in_x9 * 0x20);
  in_x10 = in_x10 + 1;
  if (uVar4 != unaff_x21) goto LAB_006df114;
  do {
    puVar1 = (ulong *)(unaff_x20 + in_x9 * 0x20);
    *puVar1 = param_1;
    *puVar1 = param_1;
    cVar2 = *(char *)((long)puVar1 + 0x1f);
    while( true ) {
      puVar3 = (undefined8 *)(unaff_x20 + in_x9 * 0x20 + 8);
      if (cVar2 < '\0') {
        __ZdlPv(*puVar3);
      }
      lVar6 = unaff_x27 + unaff_x23 * 0x20;
      uVar8 = *(undefined8 *)(lVar6 + 0x10);
      uVar7 = *(undefined8 *)(lVar6 + 8);
      puVar3[2] = *(undefined8 *)(lVar6 + 0x18);
      puVar3[1] = uVar8;
      *puVar3 = uVar7;
      *(undefined1 *)((long)unaff_x26 + 0x1f) = 0;
      *(undefined1 *)(lVar6 + 8) = 0;
      uVar4 = unaff_x19[1];
      do {
        unaff_x23 = unaff_x23 + 1;
        if (uVar4 <= unaff_x23) {
          lVar6 = *unaff_x19;
          *unaff_x19 = unaff_x20;
          unaff_x19[1] = unaff_x22;
          if (lVar6 == 0) {
            return;
          }
          if (uVar4 != 0) {
            pcVar5 = (char *)(lVar6 + 0x1f);
            do {
              if (*pcVar5 < '\0') {
                __ZdlPv(*(undefined8 *)(pcVar5 + -0x17));
              }
              pcVar5 = pcVar5 + 0x20;
              uVar4 = uVar4 - 1;
            } while (uVar4 != 0);
          }
                    /* WARNING: Could not recover jumptable at 0x007b2f68. Too many branches */
                    /* WARNING: Treating indirect jump as call */
          (*(code *)PTR___ZdlPv_009b01b8)(lVar6);
          return;
        }
        unaff_x27 = *unaff_x19;
        unaff_x26 = (ulong *)(unaff_x27 + unaff_x23 * 0x20);
        param_1 = *unaff_x26;
      } while (param_1 == unaff_x19[3]);
      in_x9 = (param_1 >> 4 ^ param_1 >> 9) & unaff_x24;
      uVar4 = *(ulong *)(unaff_x20 + in_x9 * 0x20);
      if (uVar4 == unaff_x21) break;
      in_x10 = 1;
LAB_006df114:
      if (uVar4 != param_1) goto code_r0x006df11c;
      puVar1 = (ulong *)(unaff_x20 + in_x9 * 0x20);
      *puVar1 = param_1;
      cVar2 = *(char *)((long)puVar1 + 0x1f);
    }
  } while( true );
}

