
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_005ec3e4(ulong *param_1)

{
  char cVar1;
  code *pcVar2;
  long lVar3;
  long lVar4;
  ulong *puVar5;
  undefined8 *puVar6;
  long *plVar7;
  ulong *extraout_x8;
  ulong *extraout_x8_00;
  ulong *extraout_x8_01;
  undefined8 extraout_x9;
  ulong uVar8;
  ulong extraout_x9_00;
  long *extraout_x10;
  undefined *extraout_x11;
  undefined *puVar9;
  
  lVar4 = ___ZN12tracing_core10dispatcher11GLOBAL_INIT17h2e36d73a7bb96473E;
  pcVar2 = 
  ___ZN12tracing_core10dispatcher13CURRENT_STATE29__u7b__u7b_constant_u7d__u7d_28__u7b__u7b_closure_u7d__u7d_3VAL17h8a3c273f0d227084E
  ;
  if (___ZN12tracing_core10dispatcher12SCOPED_COUNT17hb93c9af185a47bb5E == 0) {
    plVar7 = plRam0000000000a2aa78;
    uVar8 = ___ZN12tracing_core10dispatcher15GLOBAL_DISPATCH17h107bb7149eefa31bE;
    if (___ZN12tracing_core10dispatcher11GLOBAL_INIT17h2e36d73a7bb96473E != 2) {
      uVar8 = 0;
      plVar7 = (long *)&__ZN12tracing_core10dispatcher13NO_SUBSCRIBER17h8dae511100ad6a9eE;
    }
    if ((uVar8 & 1) != 0) {
      uVar8 = 1;
      lVar3 = *plVar7;
      *plVar7 = lVar3 + 1;
      if (lVar3 < 0) goto LAB_005ec594;
    }
    puVar9 = puRam0000000000a2aa80;
    if (lVar4 != 2) {
      puVar9 = &UNK_009f4080;
    }
    goto LAB_005ec56c;
  }
  lVar4 = (*
          ___ZN12tracing_core10dispatcher13CURRENT_STATE29__u7b__u7b_constant_u7d__u7d_28__u7b__u7b_closure_u7d__u7d_3VAL17h8a3c273f0d227084E
          )(&
            __ZN12tracing_core10dispatcher13CURRENT_STATE29__u7b__u7b_constant_u7d__u7d_28__u7b__u7b_closure_u7d__u7d_3VAL17h8a3c273f0d227084E
           );
  if (*(char *)(lVar4 + 0x28) == '\x01') {
LAB_005ec454:
    lVar4 = (*pcVar2)(&
                      __ZN12tracing_core10dispatcher13CURRENT_STATE29__u7b__u7b_constant_u7d__u7d_28__u7b__u7b_closure_u7d__u7d_3VAL17h8a3c273f0d227084E
                     );
    cVar1 = *(char *)(lVar4 + 0x20);
    *(undefined1 *)(lVar4 + 0x20) = 0;
    param_1 = extraout_x8_00;
    if (cVar1 == '\x01') {
      puVar5 = (ulong *)(*pcVar2)(&
                                  __ZN12tracing_core10dispatcher13CURRENT_STATE29__u7b__u7b_constant_u7d__u7d_28__u7b__u7b_closure_u7d__u7d_3VAL17h8a3c273f0d227084E
                                 );
      if (0x7ffffffffffffffe < *puVar5) {
        func_0x007a2378(&UNK_009f4198);
LAB_005ec594:
                    /* WARNING: Does not return */
        pcVar2 = (code *)SoftwareBreakpoint(1,0x5ec598);
        (*pcVar2)();
      }
      puVar6 = (undefined8 *)
               (*pcVar2)(&
                         __ZN12tracing_core10dispatcher13CURRENT_STATE29__u7b__u7b_constant_u7d__u7d_28__u7b__u7b_closure_u7d__u7d_3VAL17h8a3c273f0d227084E
                        );
      *puVar6 = extraout_x9;
      puVar5 = puVar6 + 1;
      uVar8 = *puVar5;
      if (uVar8 == 2) {
        puVar5 = (ulong *)&__ZN12tracing_core10dispatcher15GLOBAL_DISPATCH17h107bb7149eefa31bE;
        if (___ZN12tracing_core10dispatcher11GLOBAL_INIT17h2e36d73a7bb96473E != 2) {
          puVar5 = (ulong *)&__ZN12tracing_core10dispatcher4NONE17hec1704e7c8575e04E;
        }
        uVar8 = *puVar5;
      }
      if (((uVar8 & 1) != 0) &&
         (lVar4 = *(long *)puVar5[1], *(long *)puVar5[1] = lVar4 + 1, lVar4 < 0)) goto LAB_005ec594;
      plVar7 = (long *)(*pcVar2)(&
                                 __ZN12tracing_core10dispatcher13CURRENT_STATE29__u7b__u7b_constant_u7d__u7d_28__u7b__u7b_closure_u7d__u7d_3VAL17h8a3c273f0d227084E
                                );
      *plVar7 = *plVar7 + -1;
      *(undefined1 *)(plVar7 + 4) = 1;
      param_1 = extraout_x8_01;
      uVar8 = extraout_x9_00;
      plVar7 = extraout_x10;
      puVar9 = extraout_x11;
      goto LAB_005ec56c;
    }
  }
  else {
    param_1 = extraout_x8;
    if (*(char *)(lVar4 + 0x28) != '\x02') {
      lVar4 = (*pcVar2)(&
                        __ZN12tracing_core10dispatcher13CURRENT_STATE29__u7b__u7b_constant_u7d__u7d_28__u7b__u7b_closure_u7d__u7d_3VAL17h8a3c273f0d227084E
                       );
      func_0x00438238(lVar4,&DAT_005e9ec0);
      *(undefined1 *)(lVar4 + 0x28) = 1;
      goto LAB_005ec454;
    }
  }
  uVar8 = 0;
  puVar9 = &UNK_009f4080;
  plVar7 = (long *)&__ZN12tracing_core10dispatcher13NO_SUBSCRIBER17h8dae511100ad6a9eE;
LAB_005ec56c:
  *param_1 = uVar8;
  param_1[1] = (ulong)plVar7;
  param_1[2] = (ulong)puVar9;
  return;
}

