
long FUN_005207b4(long param_1)

{
  undefined8 uVar1;
  int iVar2;
  long lVar3;
  long lVar4;
  undefined8 *unaff_x19;
  long lVar5;
  long unaff_x20;
  long lVar6;
  long unaff_x21;
  undefined8 unaff_x22;
  undefined8 *puVar7;
  undefined8 *unaff_x23;
  undefined8 *unaff_x24;
  long *unaff_x25;
  long *plVar8;
  long unaff_x26;
  long unaff_x27;
  long unaff_x28;
  long in_stack_00000000;
  long *in_stack_00000008;
  long *in_stack_00000010;
  long in_stack_00000018;
  long *in_stack_00000020;
  long in_stack_00000028;
  
  do {
    if (param_1 == unaff_x21) {
      iVar2 = _memcmp(unaff_x25[-1],unaff_x22,unaff_x21);
      if (iVar2 == 0) {
code_r0x005207d0:
        unaff_x26 = unaff_x28;
        if (unaff_x26 == in_stack_00000018) {
LAB_005206c4:
          *in_stack_00000010 = in_stack_00000018;
          puVar7 = unaff_x23;
          do {
            if (puVar7 == unaff_x24) {
              *unaff_x19 = puVar7;
              return 0;
            }
            unaff_x23 = puVar7 + 2;
            uVar1 = *puVar7;
            lVar4 = puVar7[1];
            lVar5 = unaff_x27;
            lVar3 = in_stack_00000028;
            do {
              puVar7 = unaff_x23;
              if ((*(long *)(lVar3 + 0x220) == lVar4) &&
                 (iVar2 = _memcmp(*(undefined8 *)(lVar3 + 0x218),uVar1,lVar4), iVar2 == 0)) {
                unaff_x26 = *(long *)(lVar3 + 0xb8);
                lVar3 = *(long *)(lVar3 + 0xc0);
                in_stack_00000018 = unaff_x26 + lVar3 * 0x20;
                *in_stack_00000010 = unaff_x26;
                in_stack_00000010[1] = in_stack_00000018;
                if (lVar3 != 0) {
                  in_stack_00000000 = *(long *)(*in_stack_00000020 + 0x10);
                  if (in_stack_00000000 != 0) {
                    in_stack_00000008 = (long *)(*(long *)(*in_stack_00000020 + 8) + 8);
                    in_stack_00000000 = in_stack_00000000 << 4;
                    goto LAB_00520748;
                  }
                  lVar3 = in_stack_00000020[2];
                  if (lVar3 == 0) {
                    *unaff_x19 = unaff_x23;
                    unaff_x28 = unaff_x26 + 0x20;
                    goto code_r0x005208ac;
                  }
                  lVar4 = in_stack_00000020[1];
                  goto code_r0x005207fc;
                }
                break;
              }
              lVar3 = lVar3 + 600;
              lVar5 = lVar5 + -600;
            } while (lVar5 != 0);
          } while( true );
        }
LAB_00520748:
        unaff_x28 = unaff_x26 + 0x20;
        unaff_x22 = *(undefined8 *)(unaff_x26 + 0x10);
        unaff_x21 = *(long *)(unaff_x26 + 0x18);
        lVar3 = in_stack_00000000;
        plVar8 = in_stack_00000008;
        do {
          if (*plVar8 == unaff_x21) {
            iVar2 = _memcmp(plVar8[-1],unaff_x22,unaff_x21);
            if (iVar2 == 0) goto code_r0x005207d0;
          }
          plVar8 = plVar8 + 2;
          lVar3 = lVar3 + -0x10;
          if (lVar3 == 0) {
            if (in_stack_00000020[2] == 0) {
              *unaff_x19 = unaff_x23;
code_r0x005208ac:
              *in_stack_00000010 = unaff_x28;
              return unaff_x26 + 0x10;
            }
            unaff_x25 = (long *)(in_stack_00000020[1] + 8);
            unaff_x20 = in_stack_00000020[2] << 4;
            goto code_r0x005207b0;
          }
        } while( true );
      }
    }
    unaff_x25 = unaff_x25 + 2;
    unaff_x20 = unaff_x20 + -0x10;
    if (unaff_x20 == 0) {
code_r0x00520860:
      *unaff_x19 = unaff_x23;
      *in_stack_00000010 = unaff_x28;
      return unaff_x26 + 0x10;
    }
code_r0x005207b0:
    param_1 = *unaff_x25;
  } while( true );
code_r0x005207fc:
  do {
    unaff_x28 = unaff_x26 + 0x20;
    uVar1 = *(undefined8 *)(unaff_x26 + 0x10);
    lVar5 = *(long *)(unaff_x26 + 0x18);
    lVar6 = lVar3 << 4;
    plVar8 = (long *)(lVar4 + 8);
    while ((*plVar8 != lVar5 || (iVar2 = _memcmp(plVar8[-1],uVar1,lVar5), iVar2 != 0))) {
      plVar8 = plVar8 + 2;
      lVar6 = lVar6 + -0x10;
      if (lVar6 == 0) goto code_r0x00520860;
    }
    unaff_x26 = unaff_x28;
  } while (unaff_x28 != in_stack_00000018);
  goto LAB_005206c4;
}

