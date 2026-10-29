/* 7ff70c7b1630 FUN_7ff70c7b1630 */

void FUN_7ff70c7b1630(longlong *param_1,longlong *param_2,longlong *param_3)

{
  char cVar1;
  longlong *plVar2;
  undefined8 *puVar3;
  longlong *plVar4;
  longlong *plVar5;
  longlong *plVar6;
  longlong *plVar7;
  longlong lVar8;
  
  param_1[1] = param_1[1] + 1;
  plVar2 = (longlong *)*param_1;
  plVar5 = (longlong *)*param_2;
  param_3[1] = (longlong)plVar5;
  if (plVar5 == plVar2) {
    *plVar2 = (longlong)param_3;
    plVar2[1] = (longlong)param_3;
    plVar2[2] = (longlong)param_3;
    *(undefined1 *)(param_3 + 3) = 1;
    return;
  }
  plVar7 = param_3 + 1;
  if ((int)param_2[1] == 0) {
    plVar5[2] = (longlong)param_3;
    if (*param_2 == plVar2[2]) {
      plVar2[2] = (longlong)param_3;
      plVar5 = (longlong *)*plVar7;
      cVar1 = (char)plVar5[3];
      goto joined_r0x7ff70c7b16ac;
    }
  }
  else {
    *plVar5 = (longlong)param_3;
    if (*param_2 == *plVar2) {
      *plVar2 = (longlong)param_3;
      plVar5 = (longlong *)*plVar7;
      cVar1 = (char)plVar5[3];
      goto joined_r0x7ff70c7b16ac;
    }
  }
  plVar5 = (longlong *)*plVar7;
  cVar1 = (char)plVar5[3];
joined_r0x7ff70c7b16ac:
  do {
    if (cVar1 != '\0') {
      *(undefined1 *)(plVar2[1] + 0x18) = 1;
      return;
    }
    plVar6 = (longlong *)plVar5[1];
    plVar4 = (longlong *)*plVar6;
    if (plVar5 == plVar4) {
      plVar4 = (longlong *)plVar6[2];
      if ((char)plVar4[3] == '\0') goto LAB_7ff70c7b16c0;
      plVar7 = (longlong *)plVar5[2];
      if (param_3 == plVar7) {
        lVar8 = *plVar7;
        plVar5[2] = lVar8;
        if (*(char *)(lVar8 + 0x19) == '\0') {
          *(longlong **)(lVar8 + 8) = plVar5;
          plVar6 = (longlong *)plVar5[1];
          plVar7[1] = (longlong)plVar6;
          lVar8 = *param_1;
          if (plVar5 != *(longlong **)(lVar8 + 8)) goto LAB_7ff70c7b1787;
LAB_7ff70c7b183a:
          *(longlong **)(lVar8 + 8) = plVar7;
        }
        else {
          plVar7[1] = (longlong)plVar6;
          lVar8 = *param_1;
          if (plVar5 == *(longlong **)(lVar8 + 8)) goto LAB_7ff70c7b183a;
LAB_7ff70c7b1787:
          if (plVar5 == (longlong *)*plVar6) {
            *plVar6 = (longlong)plVar7;
          }
          else {
            plVar6[2] = (longlong)plVar7;
          }
        }
        *plVar7 = (longlong)plVar5;
        plVar5[1] = (longlong)plVar7;
        param_3 = plVar5;
        plVar5 = plVar7;
      }
      *(undefined1 *)(plVar5 + 3) = 1;
      *(undefined1 *)(*(longlong *)(param_3[1] + 8) + 0x18) = 0;
      plVar5 = *(longlong **)(param_3[1] + 8);
      plVar7 = (longlong *)*plVar5;
      lVar8 = plVar7[2];
      *plVar5 = lVar8;
      if (*(char *)(lVar8 + 0x19) == '\0') {
        *(longlong **)(lVar8 + 8) = plVar5;
      }
      puVar3 = (undefined8 *)plVar5[1];
      plVar7[1] = (longlong)puVar3;
      if (plVar5 == *(longlong **)(*param_1 + 8)) {
        *(longlong **)(*param_1 + 8) = plVar7;
        plVar7[2] = (longlong)plVar5;
      }
      else if (plVar5 == (longlong *)puVar3[2]) {
        puVar3[2] = plVar7;
        plVar7[2] = (longlong)plVar5;
      }
      else {
        *puVar3 = plVar7;
        plVar7[2] = (longlong)plVar5;
      }
LAB_7ff70c7b1818:
      plVar5[1] = (longlong)plVar7;
    }
    else {
      if ((char)plVar4[3] != '\0') {
        plVar7 = (longlong *)*plVar5;
        if (param_3 == plVar7) {
          lVar8 = plVar7[2];
          *plVar5 = lVar8;
          if (*(char *)(lVar8 + 0x19) == '\0') {
            *(longlong **)(lVar8 + 8) = plVar5;
            plVar6 = (longlong *)plVar5[1];
            plVar7[1] = (longlong)plVar6;
            lVar8 = *param_1;
            if (plVar5 != *(longlong **)(lVar8 + 8)) goto LAB_7ff70c7b1759;
LAB_7ff70c7b17ae:
            *(longlong **)(lVar8 + 8) = plVar7;
          }
          else {
            plVar7[1] = (longlong)plVar6;
            lVar8 = *param_1;
            if (plVar5 == *(longlong **)(lVar8 + 8)) goto LAB_7ff70c7b17ae;
LAB_7ff70c7b1759:
            if (plVar5 == (longlong *)plVar6[2]) {
              plVar6[2] = (longlong)plVar7;
            }
            else {
              *plVar6 = (longlong)plVar7;
            }
          }
          plVar7[2] = (longlong)plVar5;
          plVar5[1] = (longlong)plVar7;
          param_3 = plVar5;
          plVar5 = plVar7;
        }
        *(undefined1 *)(plVar5 + 3) = 1;
        *(undefined1 *)(*(longlong *)(param_3[1] + 8) + 0x18) = 0;
        plVar5 = *(longlong **)(param_3[1] + 8);
        plVar7 = (longlong *)plVar5[2];
        lVar8 = *plVar7;
        plVar5[2] = lVar8;
        if (*(char *)(lVar8 + 0x19) == '\0') {
          *(longlong **)(lVar8 + 8) = plVar5;
        }
        plVar6 = (longlong *)plVar5[1];
        plVar7[1] = (longlong)plVar6;
        if (plVar5 == *(longlong **)(*param_1 + 8)) {
          *(longlong **)(*param_1 + 8) = plVar7;
        }
        else if (plVar5 == (longlong *)*plVar6) {
          *plVar6 = (longlong)plVar7;
        }
        else {
          plVar6[2] = (longlong)plVar7;
        }
        *plVar7 = (longlong)plVar5;
        goto LAB_7ff70c7b1818;
      }
LAB_7ff70c7b16c0:
      *(undefined1 *)(plVar5 + 3) = 1;
      *(undefined1 *)(plVar4 + 3) = 1;
      *(undefined1 *)(*(longlong *)(*plVar7 + 8) + 0x18) = 0;
      param_3 = *(longlong **)(*plVar7 + 8);
    }
    plVar7 = param_3 + 1;
    plVar5 = (longlong *)param_3[1];
    cVar1 = (char)plVar5[3];
  } while( true );
}


