
void FUN_00037f34(undefined8 param_1,long *param_2)

{
  long lVar1;
  long *plVar2;
  long *in_x9;
  long lVar3;
  long *plVar4;
  long *plVar5;
  long *plVar6;
  long *in_x10;
  long lVar7;
  int in_w11;
  
  plVar2 = (long *)0x0;
  lVar3 = in_x10[3];
  plVar4 = in_x9;
  if (in_x10 != param_2) {
    lVar7 = param_2[2];
    in_x10[2] = lVar7;
    *(long **)(lVar7 + (ulong)(*(long **)param_2[2] != param_2) * 8) = in_x10;
    lVar7 = *param_2;
    lVar1 = param_2[1];
    *(long **)(lVar7 + 0x10) = in_x10;
    *in_x10 = lVar7;
    in_x10[1] = lVar1;
    if (lVar1 != 0) {
      *(long **)(lVar1 + 0x10) = in_x10;
    }
    *(char *)(in_x10 + 3) = (char)param_2[3];
    if (in_x9 != param_2) {
      in_x10 = in_x9;
    }
    plVar4 = in_x10;
  }
  if (((char)lVar3 != '\0') && (plVar4 != (long *)0x0)) {
    if (in_w11 != 0) {
      while( true ) {
        plVar5 = (long *)plVar2[2];
        if ((long *)*plVar5 != plVar2) break;
        if ((char)plVar2[3] == '\0') {
          *(undefined1 *)(plVar2 + 3) = 1;
          *(undefined1 *)(plVar5 + 3) = 0;
          lVar3 = plVar2[1];
          *plVar5 = lVar3;
          if (lVar3 != 0) {
            *(long **)(lVar3 + 0x10) = plVar5;
          }
          plVar2[2] = plVar5[2];
          ((undefined8 *)plVar5[2])[*(long **)plVar5[2] != plVar5] = plVar2;
          plVar2[1] = (long)plVar5;
          plVar5[2] = (long)plVar2;
          plVar6 = plVar2;
          if (plVar4 != plVar5) {
            plVar6 = plVar4;
          }
          plVar2 = (long *)*plVar5;
          plVar5 = (long *)*plVar2;
          plVar4 = plVar6;
          if (plVar5 == (long *)0x0) goto code_r0x00037ec4;
code_r0x00037ebc:
          plVar4 = plVar6;
          if ((char)plVar5[3] != '\0') goto code_r0x00037ec4;
code_r0x00037fb4:
          plVar6 = plVar2;
code_r0x00037fb8:
          plVar4 = (long *)plVar6[2];
          *(char *)(plVar6 + 3) = (char)plVar4[3];
          *(undefined1 *)(plVar4 + 3) = 1;
          *(undefined1 *)(plVar5 + 3) = 1;
          lVar3 = *plVar4;
          lVar7 = *(long *)(lVar3 + 8);
          *plVar4 = lVar7;
          if (lVar7 != 0) {
            *(long **)(lVar7 + 0x10) = plVar4;
          }
          *(long *)(lVar3 + 0x10) = plVar4[2];
          ((undefined8 *)plVar4[2])[*(long **)plVar4[2] != plVar4] = lVar3;
          *(long **)(lVar3 + 8) = plVar4;
          plVar4[2] = lVar3;
          return;
        }
        plVar5 = (long *)*plVar2;
        plVar6 = plVar4;
        if (plVar5 != (long *)0x0) goto code_r0x00037ebc;
code_r0x00037ec4:
        plVar6 = (long *)plVar2[1];
        if ((plVar6 != (long *)0x0) && ((char)plVar6[3] == '\0')) {
          if ((plVar5 == (long *)0x0) || ((char)plVar5[3] != '\0')) {
            *(undefined1 *)(plVar6 + 3) = 1;
            *(undefined1 *)(plVar2 + 3) = 0;
            lVar3 = *plVar6;
            plVar2[1] = lVar3;
            if (lVar3 != 0) {
              *(long **)(lVar3 + 0x10) = plVar2;
            }
            plVar6[2] = plVar2[2];
            ((undefined8 *)plVar2[2])[*(long **)plVar2[2] != plVar2] = plVar6;
            *plVar6 = (long)plVar2;
            plVar2[2] = (long)plVar6;
            plVar5 = plVar2;
            goto code_r0x00037fb8;
          }
          goto code_r0x00037fb4;
        }
        *(undefined1 *)(plVar2 + 3) = 0;
        plVar2 = (long *)plVar2[2];
        if ((char)plVar2[3] == '\0' || plVar2 == plVar4) {
code_r0x00037f50:
          *(undefined1 *)(plVar2 + 3) = 1;
          return;
        }
code_r0x00037d98:
        plVar2 = (long *)((undefined8 *)plVar2[2])[*(long **)plVar2[2] == plVar2];
      }
      if ((char)plVar2[3] == '\0') {
        *(undefined1 *)(plVar2 + 3) = 1;
        *(undefined1 *)(plVar5 + 3) = 0;
        plVar6 = (long *)plVar5[1];
        lVar3 = *plVar6;
        plVar5[1] = lVar3;
        if (lVar3 != 0) {
          *(long **)(lVar3 + 0x10) = plVar5;
        }
        plVar6[2] = plVar5[2];
        ((undefined8 *)plVar5[2])[*(long **)plVar5[2] != plVar5] = plVar6;
        *plVar6 = (long)plVar5;
        plVar5[2] = (long)plVar6;
        plVar5 = plVar2;
        if (plVar4 != (long *)*plVar2) {
          plVar5 = plVar4;
        }
        plVar2 = (long *)((long *)*plVar2)[1];
        plVar6 = (long *)*plVar2;
        plVar4 = plVar5;
        if (plVar6 == (long *)0x0) goto code_r0x00037e40;
code_r0x00037e38:
        plVar4 = plVar5;
        if ((char)plVar6[3] != '\0') goto code_r0x00037e40;
        plVar5 = (long *)plVar2[1];
        if (plVar5 != (long *)0x0) goto code_r0x00037f64;
      }
      else {
        plVar6 = (long *)*plVar2;
        plVar5 = plVar4;
        if (plVar6 != (long *)0x0) goto code_r0x00037e38;
code_r0x00037e40:
        plVar5 = (long *)plVar2[1];
        if ((plVar5 == (long *)0x0) || ((char)plVar5[3] != '\0')) {
          *(undefined1 *)(plVar2 + 3) = 0;
          plVar2 = (long *)plVar2[2];
          if (plVar2 == plVar4) {
            plVar2 = plVar4;
          }
          else if ((char)plVar2[3] != '\0') goto code_r0x00037d98;
          goto code_r0x00037f50;
        }
code_r0x00037f64:
        if ((char)plVar5[3] == '\0') {
          plVar6 = plVar2;
          goto code_r0x00038010;
        }
      }
      *(undefined1 *)(plVar6 + 3) = 1;
      *(undefined1 *)(plVar2 + 3) = 0;
      lVar3 = plVar6[1];
      *plVar2 = lVar3;
      if (lVar3 != 0) {
        *(long **)(lVar3 + 0x10) = plVar2;
      }
      plVar6[2] = plVar2[2];
      ((undefined8 *)plVar2[2])[*(long **)plVar2[2] != plVar2] = plVar6;
      plVar6[1] = (long)plVar2;
      plVar2[2] = (long)plVar6;
      plVar5 = plVar2;
code_r0x00038010:
      lVar3 = plVar6[2];
      *(undefined1 *)(plVar6 + 3) = *(undefined1 *)(lVar3 + 0x18);
      *(undefined1 *)(lVar3 + 0x18) = 1;
      *(undefined1 *)(plVar5 + 3) = 1;
      plVar4 = *(long **)(lVar3 + 8);
      lVar7 = *plVar4;
      *(long *)(lVar3 + 8) = lVar7;
      if (lVar7 != 0) {
        *(long *)(lVar7 + 0x10) = lVar3;
      }
      plVar4[2] = *(long *)(lVar3 + 0x10);
      (*(long **)(lVar3 + 0x10))[**(long **)(lVar3 + 0x10) != lVar3] = (long)plVar4;
      *plVar4 = lVar3;
      *(long **)(lVar3 + 0x10) = plVar4;
      return;
    }
    *(undefined1 *)(in_x9 + 3) = 1;
  }
  return;
}

