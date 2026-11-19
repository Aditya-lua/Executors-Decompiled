/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00828798
 */

long * FUN_00828798(long *param_1,long *param_2,long *param_3,long *param_4,
                   basic_string_conflict *param_5)

{
  bool bVar1;
  ulong uVar2;
  long *plVar3;
  long *plVar4;
  long *plVar5;
  long *plVar6;
  long *plVar7;
  long *plVar8;
  
  plVar5 = param_1 + 1;
  plVar7 = plVar5;
  if ((plVar5 == param_2) ||
     (uVar2 = cpr::CaseInsensitiveCompare::operator()
                        ((CaseInsensitiveCompare *)(param_1 + 2),param_5,
                         (basic_string_conflict *)(param_2 + 4)), (uVar2 & 1) != 0)) {
    if ((long *)*param_1 == param_2) {
      plVar6 = param_2;
    }
    else {
      plVar3 = (long *)*param_2;
      if ((long *)*param_2 == (long *)0x0) {
        plVar3 = param_2;
        do {
          plVar6 = (long *)plVar3[2];
          bVar1 = plVar3 == (long *)*plVar6;
          plVar3 = plVar6;
        } while (bVar1);
      }
      else {
        do {
          plVar6 = plVar3;
          plVar3 = (long *)plVar6[1];
        } while ((long *)plVar6[1] != (long *)0x0);
      }
      uVar2 = cpr::CaseInsensitiveCompare::operator()
                        ((CaseInsensitiveCompare *)(param_1 + 2),
                         (basic_string_conflict *)(plVar6 + 4),param_5);
      if ((uVar2 & 1) == 0) {
        plVar6 = (long *)*plVar5;
        if ((long *)*plVar5 != (long *)0x0) {
          do {
            while( true ) {
              plVar5 = plVar6;
              uVar2 = cpr::CaseInsensitiveCompare::operator()
                                ((CaseInsensitiveCompare *)(param_1 + 2),param_5,
                                 (basic_string_conflict *)(plVar5 + 4));
              if ((uVar2 & 1) == 0) break;
              plVar6 = (long *)*plVar5;
              plVar7 = plVar5;
              if ((long *)*plVar5 == (long *)0x0) goto LAB_008288d8;
            }
            uVar2 = cpr::CaseInsensitiveCompare::operator()
                              ((CaseInsensitiveCompare *)(param_1 + 2),
                               (basic_string_conflict *)(plVar5 + 4),param_5);
            if ((uVar2 & 1) == 0) break;
            plVar7 = plVar5 + 1;
            plVar6 = (long *)*plVar7;
          } while ((long *)*plVar7 != (long *)0x0);
        }
        goto LAB_008288d8;
      }
    }
    if (*param_2 == 0) {
      *param_3 = (long)param_2;
      plVar6 = param_2;
    }
    else {
      *param_3 = (long)plVar6;
      plVar6 = plVar6 + 1;
    }
  }
  else {
    uVar2 = cpr::CaseInsensitiveCompare::operator()
                      ((CaseInsensitiveCompare *)(param_1 + 2),
                       (basic_string_conflict *)(param_2 + 4),param_5);
    if ((uVar2 & 1) == 0) {
      *param_3 = (long)param_2;
      *param_4 = (long)param_2;
      return param_4;
    }
    plVar6 = param_2 + 1;
    plVar3 = (long *)*plVar6;
    if (plVar3 == (long *)0x0) {
      plVar4 = param_2;
      do {
        plVar8 = (long *)plVar4[2];
        bVar1 = plVar4 != (long *)*plVar8;
        plVar4 = plVar8;
      } while (bVar1);
    }
    else {
      plVar4 = plVar3;
      do {
        plVar8 = plVar4;
        plVar4 = (long *)*plVar8;
      } while ((long *)*plVar8 != (long *)0x0);
    }
    if (plVar8 != plVar5) {
      uVar2 = cpr::CaseInsensitiveCompare::operator()
                        ((CaseInsensitiveCompare *)(param_1 + 2),param_5,
                         (basic_string_conflict *)(plVar8 + 4));
      if ((uVar2 & 1) == 0) {
        plVar6 = (long *)*plVar5;
        if ((long *)*plVar5 != (long *)0x0) {
          do {
            while( true ) {
              plVar5 = plVar6;
              uVar2 = cpr::CaseInsensitiveCompare::operator()
                                ((CaseInsensitiveCompare *)(param_1 + 2),param_5,
                                 (basic_string_conflict *)(plVar5 + 4));
              if ((uVar2 & 1) == 0) break;
              plVar6 = (long *)*plVar5;
              plVar7 = plVar5;
              if ((long *)*plVar5 == (long *)0x0) goto LAB_008288d8;
            }
            uVar2 = cpr::CaseInsensitiveCompare::operator()
                              ((CaseInsensitiveCompare *)(param_1 + 2),
                               (basic_string_conflict *)(plVar5 + 4),param_5);
            if ((uVar2 & 1) == 0) break;
            plVar7 = plVar5 + 1;
            plVar6 = (long *)*plVar7;
          } while ((long *)*plVar7 != (long *)0x0);
        }
LAB_008288d8:
        *param_3 = (long)plVar5;
        return plVar7;
      }
      plVar3 = (long *)*plVar6;
    }
    if (plVar3 == (long *)0x0) {
      *param_3 = (long)param_2;
    }
    else {
      *param_3 = (long)plVar8;
      plVar6 = plVar8;
    }
  }
  return plVar6;
}

