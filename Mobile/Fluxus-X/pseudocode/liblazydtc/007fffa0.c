/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 007fffa0
 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_007fffa0(ulong *param_1)

{
  ulong uVar1;
  long lVar2;
  ulong uVar3;
  byte bVar4;
  long *plVar5;
  char cVar6;
  int iVar7;
  int iVar8;
  undefined8 uVar9;
  undefined8 uVar10;
  undefined8 uVar11;
  long lVar12;
  undefined8 uVar13;
  long lVar14;
  undefined8 uVar15;
  long lVar16;
  undefined8 uVar17;
  long lVar18;
  undefined8 uVar19;
  long lVar20;
  size_t __n;
  void *__dest;
  long *local_90;
  undefined5 uStack_88;
  undefined2 uStack_83;
  undefined1 uStack_81;
  undefined1 uStack_80;
  undefined1 uStack_7f;
  undefined1 uStack_7e;
  undefined2 uStack_7d;
  undefined3 uStack_7b;
  undefined5 uStack_78;
  undefined2 uStack_73;
  undefined4 local_71;
  undefined4 uStack_6d;
  long local_68;
  
  lVar2 = tpidr_el0;
  local_68 = *(long *)(lVar2 + 0x28);
  local_90 = (long *)0x0;
  iVar7 = (**(code **)(*DAT_00ccabb8 + 0x30))(DAT_00ccabb8,&local_90,0x10006);
  if ((((iVar7 == 0) ||
       (iVar8 = (**(code **)(*DAT_00ccabb8 + 0x20))(DAT_00ccabb8,&local_90,0), iVar8 == 0)) &&
      (plVar5 = local_90, local_90 != (long *)0x0)) && (DAT_00ccabc0 != 0)) {
    uVar9 = (**(code **)(*local_90 + 0xf8))(local_90);
    uStack_80 = 0x66;
    uStack_7f = 0x3d;
    uStack_88 = 0x2f382c6267;
    uStack_83 = 0xc657;
    uStack_81 = 0xce;
    local_90 = (long *)0xdfce4e3f2d367160;
    if (((DAT_00ccad10 & 1) == 0) && (iVar8 = __cxa_guard_acquire(&DAT_00ccad10), iVar8 != 0)) {
                    /* try { // try from 00800a8c to 00800a9b has its CatchHandler @ 00800f30 */
      FUN_008026d8(&DAT_00ccacf8,&local_90);
      __cxa_atexit(&LAB_00802774,&DAT_00ccacf8,&PTR_LOOP_00c48880);
      __cxa_guard_release(&DAT_00ccad10);
    }
    FUN_00803604(&DAT_00ccacf8);
    uStack_88 = 0x92e505a4d;
    uStack_83 = 0xe673;
    local_90 = (long *)0xece32e1c0b1e576f;
    uStack_81 = 0xe3;
    uStack_80 = 0x44;
    uStack_7f = 6;
    uStack_7e = 0x7f;
    if (((DAT_00ccad30 & 1) == 0) && (iVar8 = __cxa_guard_acquire(&DAT_00ccad30), iVar8 != 0)) {
                    /* try { // try from 00800ad8 to 00800ae7 has its CatchHandler @ 00800f20 */
      FUN_00802780(&DAT_00ccad18,&local_90);
      __cxa_atexit(&LAB_00802824,&DAT_00ccad18,&PTR_LOOP_00c48880);
      __cxa_guard_release(&DAT_00ccad30);
    }
    FUN_0080364c(&DAT_00ccad18);
    uVar10 = (**(code **)(*plVar5 + 0x480))(plVar5,uVar9,&DAT_00ccacf8,&DAT_00ccad18);
    uVar10 = (**(code **)(*plVar5 + 0x488))(plVar5,uVar9,uVar10);
    uStack_80 = 0x8d;
    uStack_88 = 0x9d69406ce0;
    uStack_83 = 0x3080;
    uStack_81 = 0x6a;
    local_90 = (long *)0x6a279a9248515aea;
    if (((DAT_00ccad50 & 1) == 0) && (iVar8 = __cxa_guard_acquire(&DAT_00ccad50), iVar8 != 0)) {
                    /* try { // try from 00800b24 to 00800b33 has its CatchHandler @ 00800f10 */
      FUN_00802830(&DAT_00ccad38,&local_90);
      __cxa_atexit(&LAB_008028c4,&DAT_00ccad38,&PTR_LOOP_00c48880);
      __cxa_guard_release(&DAT_00ccad50);
    }
    FUN_008036a0(&DAT_00ccad38);
    uStack_88 = 0xb8344251ec;
    uStack_83 = 0x219d;
    uStack_81 = 0x66;
    local_90 = (long *)0x637c889d7a4f73a5;
    uStack_78 = 0x857a4910ec;
    uStack_73 = 0x7c8e;
    uStack_80 = 0xe3;
    uStack_7f = 0x58;
    uStack_7e = 0x1e;
    uStack_7d = 0xa732;
    uStack_7b = 0x793283;
    local_71 = 0x4055ef40;
    uStack_6d = 0x53d29f78;
    if (((DAT_00ccad88 & 1) == 0) && (iVar8 = __cxa_guard_acquire(&DAT_00ccad88), iVar8 != 0)) {
                    /* try { // try from 00800b70 to 00800b7f has its CatchHandler @ 00800f00 */
      FUN_008028d0(&DAT_00ccad60,&local_90);
      __cxa_atexit(&LAB_00802a14,&DAT_00ccad60,&PTR_LOOP_00c48880);
      __cxa_guard_release(&DAT_00ccad88);
    }
    if (DAT_00ccad87 == '\x01') {
      DAT_00ccad87 = '\0';
      _DAT_00ccad60 = _DAT_00ccad60 ^ 0xf53e9eb1b253f8d;
      uRam0000000000ccad68 = uRam0000000000ccad68 ^ 0xf53e9eb1b253f8d;
      _DAT_00ccad70 = _DAT_00ccad70 ^ 0xf53e9eb1b253f8d;
      uRam0000000000ccad78 = uRam0000000000ccad78 ^ 0xf53e9eb1b253f8d;
      DAT_00ccad84 = DAT_00ccad84 ^ 0xeb;
      DAT_00ccad85 = DAT_00ccad85 ^ 0xe9;
      DAT_00ccad86 = DAT_00ccad86 ^ 0x53;
      DAT_00ccad80 = DAT_00ccad80 ^ 0x1b253f8d;
    }
    uVar11 = (**(code **)(*plVar5 + 0x108))(plVar5,uVar9,&DAT_00ccad38,&DAT_00ccad60);
    lVar12 = FUN_007ffe68(plVar5,DAT_00ccabc0,uVar11,uVar10);
    param_1[1] = 0;
    param_1[2] = 0;
    *param_1 = 0;
    if (lVar12 != 0) {
                    /* try { // try from 0080021c to 00800227 has its CatchHandler @ 00800f74 */
      uVar11 = (**(code **)(*plVar5 + 0xf8))(plVar5,lVar12);
      if (((DAT_00ccada0 & 1) == 0) && (iVar8 = __cxa_guard_acquire(&DAT_00ccada0), iVar8 != 0)) {
        _DAT_00ccad98 = 0x1adf9907f38b61d;
        DAT_00ccad90 = 0x2ac0e08b4308ae07;
        __cxa_atexit(&LAB_00802a24,&DAT_00ccad90,&PTR_LOOP_00c48880);
        __cxa_guard_release(&DAT_00ccada0);
      }
      uVar1 = _DAT_00ccad98;
      if (DAT_00ccad9f == '\x01') {
        uVar3 = _DAT_00ccad98 >> 0x30;
        DAT_00ccad90 = DAT_00ccad90 ^ 0x4bad89f9137bcf6f;
        _DAT_00ccad98 = (uint5)(DAT_00ccad9c ^ 0xf9) << 0x20;
        _DAT_00ccad98 =
             (ulong)CONCAT34((int3)(CONCAT16((char)uVar3,CONCAT15(DAT_00ccad9d,_DAT_00ccad98)) >>
                                   0x20),(int)uVar1) ^ 0xad8900137bcf6f;
      }
      if (((DAT_00ccadb0 & 1) == 0) && (iVar8 = __cxa_guard_acquire(&DAT_00ccadb0), iVar8 != 0)) {
        DAT_00ccadac = '\x01';
        DAT_00ccada8 = 0x1321e647;
        __cxa_atexit(&LAB_00802a30,&DAT_00ccada8,&PTR_LOOP_00c48880);
        __cxa_guard_release(&DAT_00ccadb0);
      }
      if (DAT_00ccadac == '\x01') {
        DAT_00ccadac = '\0';
        DAT_00ccada8 = DAT_00ccada8 ^ 0x137bcf6f;
      }
                    /* try { // try from 00800300 to 0080031f has its CatchHandler @ 00800f70 */
      uVar13 = (**(code **)(*plVar5 + 0x108))(plVar5,uVar11,&DAT_00ccad90,&DAT_00ccada8);
                    /* try { // try from 00800320 to 0080032f has its CatchHandler @ 00800f7c */
      cVar6 = FUN_00800fb8(plVar5,lVar12,uVar13);
      if (cVar6 != '\0') {
        if (((DAT_00ccadd0 & 1) == 0) && (iVar8 = __cxa_guard_acquire(&DAT_00ccadd0), iVar8 != 0)) {
          _DAT_00ccadc8 = 0x13dbfdcd990ec09;
          DAT_00ccadc0 = 0x4a50a6c7e5a7f01c;
          __cxa_atexit(&LAB_00802a38,&DAT_00ccadc0,&PTR_LOOP_00c48880);
          __cxa_guard_release(&DAT_00ccadd0);
        }
        uVar1 = _DAT_00ccadc8;
        if (DAT_00ccadcf == '\x01') {
          bVar4 = DAT_00ccadcc;
          _DAT_00ccadc8 = _DAT_00ccadc8 & 0xffffffffffffff;
          uVar3 = _DAT_00ccadc8;
          _DAT_00ccadc8 = (uint5)(bVar4 ^ 0xb5) << 0x20;
          DAT_00ccadcd = SUB81(uVar3,5);
          DAT_00ccadc0 = DAT_00ccadc0 ^ 0x2b3dcfb5b5d3957b;
          _DAT_00ccadc8 =
               (ulong)CONCAT34((int3)(CONCAT16(DAT_00ccadce,CONCAT15(DAT_00ccadcd,_DAT_00ccadc8)) >>
                                     0x20),(int)uVar1) ^ 0x3dcf00b5d3957b;
        }
        uStack_88 = 0xdad6fcf112;
        local_90 = (long *)0x444fabdbd49fbc53;
        uStack_7b = 0x6f4da6;
        uStack_78 = 0xb58eb2e11a;
        uStack_83 = 0x49a1;
        uStack_81 = 0x4e;
        uStack_80 = 0x15;
        uStack_7f = 0xe1;
        uStack_7e = 0xfc;
        uStack_7d = 0xd9f6;
        if (((DAT_00ccadf8 & 1) == 0) && (iVar8 = __cxa_guard_acquire(&DAT_00ccadf8), iVar8 != 0)) {
                    /* try { // try from 00800c90 to 00800c9f has its CatchHandler @ 00800eec */
          FUN_00802a44(&DAT_00ccadd8,&local_90);
          __cxa_atexit(&LAB_00802b38,&DAT_00ccadd8,&PTR_LOOP_00c48880);
          __cxa_guard_release(&DAT_00ccadf8);
        }
        if (DAT_00ccadf5 == '\x01') {
          DAT_00ccadf0 = DAT_00ccadf0 ^ 0x7b;
          DAT_00ccadf1 = DAT_00ccadf1 ^ 0x95;
          DAT_00ccadf2 = DAT_00ccadf2 ^ 0xd3;
          DAT_00ccadd8 = DAT_00ccadd8 ^ 0x2b3dcfb5b5d3957b;
          DAT_00ccadf3 = DAT_00ccadf3 ^ 0xb5;
          DAT_00ccade0 = DAT_00ccade0 ^ 0x2b3dcfb5b5d3957b;
          DAT_00ccade8 = DAT_00ccade8 ^ 0x2b3dcfb5b5d3957b;
          DAT_00ccadf5 = '\0';
          DAT_00ccadf4 = DAT_00ccadf4 ^ 0xb5;
        }
                    /* try { // try from 0080047c to 00800497 has its CatchHandler @ 00800f68 */
        uVar13 = (**(code **)(*plVar5 + 0x108))(plVar5,uVar11,&DAT_00ccadc0,&DAT_00ccadd8);
                    /* try { // try from 00800498 to 008004a7 has its CatchHandler @ 00800f64 */
        lVar14 = FUN_007ffe68(plVar5,lVar12,uVar13);
        if (lVar14 != 0) {
                    /* try { // try from 008004b8 to 008004c7 has its CatchHandler @ 00800f5c */
          uVar13 = (**(code **)(*plVar5 + 0xf8))(plVar5,lVar14);
          if (((DAT_00ccae10 & 1) == 0) && (iVar8 = __cxa_guard_acquire(&DAT_00ccae10), iVar8 != 0))
          {
            DAT_00ccae0a = '\x01';
            DAT_00ccae00 = 0x72763a4fa051146e;
            _DAT_00ccae08 = 0x717d;
            __cxa_atexit(&LAB_00802b48,&DAT_00ccae00,&PTR_LOOP_00c48880);
            __cxa_guard_release(&DAT_00ccae10);
          }
          if (DAT_00ccae0a == '\x01') {
            DAT_00ccae0a = '\0';
            DAT_00ccae00 = DAT_00ccae00 ^ 0x331b5f3be9257109;
            _DAT_00ccae08 = _DAT_00ccae08 ^ 0x7109;
          }
          uStack_88 = 0x58c6411866;
          uStack_83 = 30000;
          uStack_81 = 0x47;
          local_90 = (long *)0x417f315aa50c3821;
          uStack_78 = 0x1f8851104d;
          uStack_73 = 0x6f16;
          local_71 = 0x254a6456;
          uStack_80 = 0x6c;
          uStack_7f = 0x1f;
          uStack_7e = 0x51;
          uStack_7d = 0x78c6;
          uStack_7b = 0x437233;
          if (((DAT_00ccae48 & 1) == 0) && (iVar8 = __cxa_guard_acquire(&DAT_00ccae48), iVar8 != 0))
          {
                    /* try { // try from 00800d34 to 00800d43 has its CatchHandler @ 00800ed8 */
            FUN_00802b54(&DAT_00ccae20,&local_90);
            __cxa_atexit(&LAB_00802c78,&DAT_00ccae20,&PTR_LOOP_00c48880);
            __cxa_guard_release(&DAT_00ccae48);
          }
          if (DAT_00ccae43 == '\x01') {
            DAT_00ccae43 = '\0';
            DAT_00ccae40 = DAT_00ccae40 ^ 9;
            DAT_00ccae41 = DAT_00ccae41 ^ 0x71;
            DAT_00ccae42 = DAT_00ccae42 ^ 0x25;
            _DAT_00ccae20 = _DAT_00ccae20 ^ 0x331b5f3be9257109;
            uRam0000000000ccae28 = uRam0000000000ccae28 ^ 0x331b5f3be9257109;
            _DAT_00ccae30 = _DAT_00ccae30 ^ 0x331b5f3be9257109;
            uRam0000000000ccae38 = uRam0000000000ccae38 ^ 0x331b5f3be9257109;
          }
                    /* try { // try from 008005cc to 008005e7 has its CatchHandler @ 00800f58 */
          uVar15 = (**(code **)(*plVar5 + 0x108))(plVar5,uVar13,&DAT_00ccae00,&DAT_00ccae20);
                    /* try { // try from 008005e8 to 008005fb has its CatchHandler @ 00800f78 */
          lVar16 = FUN_007ffe68(plVar5,lVar14,uVar15,0);
          if (lVar16 != 0) {
                    /* try { // try from 0080060c to 0080061f has its CatchHandler @ 00800f50 */
            uVar15 = (**(code **)(*plVar5 + 0xf8))(plVar5,lVar16);
            if (((DAT_00ccae60 & 1) == 0) &&
               (iVar8 = __cxa_guard_acquire(&DAT_00ccae60), iVar8 != 0)) {
              DAT_00ccae50 = 0x88eb48f6d72e4200;
              DAT_00ccae58 = 0xd1334837;
              _DAT_00ccae5c = 0x195;
              __cxa_atexit(&LAB_00802c88,&DAT_00ccae50,&PTR_LOOP_00c48880);
              __cxa_guard_release(&DAT_00ccae60);
            }
            if (DAT_00ccae5d == '\x01') {
              _DAT_00ccae5c = (ushort)(DAT_00ccae5c ^ 0x95);
              DAT_00ccae50 = DAT_00ccae50 ^ 0xe7bf2d95a54b2d63;
              DAT_00ccae58 = DAT_00ccae58 ^ 0xa54b2d63;
            }
            if (((DAT_00ccaea8 & 1) == 0) &&
               (iVar8 = __cxa_guard_acquire(&DAT_00ccaea8), iVar8 != 0)) {
              DAT_00ccaea4 = '\x01';
              DAT_00ccaea0 = 0xa5704800;
              uRam0000000000ccae78 = 0x89da59fbca280207;
              _DAT_00ccae70 = 0x8ed05ff1cb2a614b;
              uRam0000000000ccae88 = 0x86c94cffe9621617;
              _DAT_00ccae80 = 0x9fda59fbca080217;
              uRam0000000000ccae98 = 0x89da58e4c0185f02;
              _DAT_00ccae90 = 0x8ffc02f2cb2a414c;
              __cxa_atexit(&LAB_00802c94,&DAT_00ccae70,&PTR_LOOP_00c48880);
              __cxa_guard_release(&DAT_00ccaea8);
            }
            if (DAT_00ccaea4 == '\x01') {
              DAT_00ccaea4 = '\0';
              _DAT_00ccae70 = _DAT_00ccae70 ^ 0xe7bf2d95a54b2d63;
              uRam0000000000ccae78 = uRam0000000000ccae78 ^ 0xe7bf2d95a54b2d63;
              _DAT_00ccae80 = _DAT_00ccae80 ^ 0xe7bf2d95a54b2d63;
              uRam0000000000ccae88 = uRam0000000000ccae88 ^ 0xe7bf2d95a54b2d63;
              _DAT_00ccae90 = _DAT_00ccae90 ^ 0xe7bf2d95a54b2d63;
              uRam0000000000ccae98 = uRam0000000000ccae98 ^ 0xe7bf2d95a54b2d63;
              DAT_00ccaea0 = DAT_00ccaea0 ^ 0xa54b2d63;
            }
                    /* try { // try from 00800700 to 0080071b has its CatchHandler @ 00800f4c */
            uVar17 = (**(code **)(*plVar5 + 0x108))(plVar5,uVar15,&DAT_00ccae50,&DAT_00ccae70);
                    /* try { // try from 00800724 to 0080072f has its CatchHandler @ 00800f6c */
            lVar18 = FUN_007ffe68(plVar5,lVar16,uVar17,DAT_00ccabc0);
            if (lVar18 != 0) {
                    /* try { // try from 00800740 to 0080074f has its CatchHandler @ 00800f48 */
              uVar17 = (**(code **)(*plVar5 + 0xf8))(plVar5,lVar18);
              if (((DAT_00ccaec0 & 1) == 0) &&
                 (iVar8 = __cxa_guard_acquire(&DAT_00ccaec0), iVar8 != 0)) {
                _DAT_00ccaeb8 = 0x1f5;
                DAT_00ccaeb0 = 0x9239e66147504281;
                __cxa_atexit(&LAB_00802ca8,&DAT_00ccaeb0,&PTR_LOOP_00c48880);
                __cxa_guard_release(&DAT_00ccaec0);
              }
              if (DAT_00ccaeb9 == '\x01') {
                DAT_00ccaeb0 = DAT_00ccaeb0 ^ 0xf5578f1333032df5;
                _DAT_00ccaeb8 = (ushort)(DAT_00ccaeb8 ^ 0xf5);
              }
              uStack_88 = 0x3c546d4c99;
              local_90 = (long *)0xda36f972594f04dd;
              uStack_83 = 0x23dc;
              uStack_81 = 0x87;
              uStack_80 = 0x9c;
              uStack_7f = 0x43;
              uStack_7e = 100;
              uStack_7d = 0x1308;
              if (((DAT_00ccaee0 & 1) == 0) &&
                 (iVar8 = __cxa_guard_acquire(&DAT_00ccaee0), iVar8 != 0)) {
                    /* try { // try from 00800e88 to 00800e97 has its CatchHandler @ 00800ec4 */
                FUN_00802cb4(&DAT_00ccaec8,&local_90);
                __cxa_atexit(&LAB_00802d68,&DAT_00ccaec8,&PTR_LOOP_00c48880);
                __cxa_guard_release(&DAT_00ccaee0);
              }
              FUN_008036d8(&DAT_00ccaec8);
                    /* try { // try from 008007e0 to 008007f7 has its CatchHandler @ 00800f44 */
              uVar19 = (**(code **)(*plVar5 + 0x108))(plVar5,uVar17,&DAT_00ccaeb0,&DAT_00ccaec8);
                    /* try { // try from 008007f8 to 00800807 has its CatchHandler @ 00800f60 */
              lVar20 = FUN_007ffe68(plVar5,lVar18,uVar19);
              if (lVar20 != 0) {
                    /* try { // try from 00800818 to 00800863 has its CatchHandler @ 00800f54 */
                uVar19 = (**(code **)(*plVar5 + 0x548))(plVar5,lVar20,0);
                FUN_0080269c(param_1,uVar19);
                (**(code **)(*plVar5 + 0x550))(plVar5,lVar20,uVar19);
                (**(code **)(*plVar5 + 0xb8))(plVar5,lVar20);
              }
                    /* try { // try from 0080086c to 0080088b has its CatchHandler @ 00800f60 */
              (**(code **)(*plVar5 + 0xb8))(plVar5,uVar17);
              (**(code **)(*plVar5 + 0xb8))(plVar5,lVar18);
            }
                    /* try { // try from 00800894 to 008008b3 has its CatchHandler @ 00800f6c */
            (**(code **)(*plVar5 + 0xb8))(plVar5,uVar15);
            (**(code **)(*plVar5 + 0xb8))(plVar5,lVar16);
          }
                    /* try { // try from 008008bc to 008008df has its CatchHandler @ 00800f78 */
          (**(code **)(*plVar5 + 0xb8))(plVar5,uVar13);
          (**(code **)(*plVar5 + 0xb8))(plVar5,lVar14);
        }
      }
                    /* try { // try from 008008e8 to 00800907 has its CatchHandler @ 00800f7c */
      (**(code **)(*plVar5 + 0xb8))(plVar5,uVar11);
      (**(code **)(*plVar5 + 0xb8))(plVar5,lVar12);
    }
                    /* try { // try from 00800910 to 00800947 has its CatchHandler @ 00800f80 */
    (**(code **)(*plVar5 + 0xb8))(plVar5,uVar10);
    (**(code **)(*plVar5 + 0xb8))(plVar5,uVar9);
    if (iVar7 != 0) {
      (**(code **)(*DAT_00ccabb8 + 0x28))();
    }
  }
  else {
    if (((DAT_00ccacf0 & 1) == 0) && (iVar7 = __cxa_guard_acquire(&DAT_00ccacf0), iVar7 != 0)) {
      _DAT_00ccace8 = 0x1d1;
      __cxa_atexit(&LAB_008026d0,&DAT_00ccace8,&PTR_LOOP_00c48880);
      __cxa_guard_release(&DAT_00ccacf0);
    }
    if (DAT_00ccace9 == '\x01') {
      _DAT_00ccace8 = (ushort)(DAT_00ccace8 ^ 0xd1);
    }
    __n = strlen((char *)&DAT_00ccace8);
    if (0xfffffffffffffff7 < __n) {
      if (*(long *)(lVar2 + 0x28) == local_68) {
                    /* WARNING: Subroutine does not return */
        FUN_007fe124();
      }
      goto LAB_00800fb4;
    }
    if (__n < 0x17) {
      __dest = (void *)((long)param_1 + 1);
      *(char *)param_1 = (char)((int)__n << 1);
      if (__n != 0) goto LAB_008009e0;
    }
    else {
      uVar1 = 0x1a;
      if ((__n | 7) != 0x17) {
        uVar1 = (__n | 7) + 1;
      }
      __dest = operator_new(uVar1);
      param_1[1] = __n;
      param_1[2] = (ulong)__dest;
      *param_1 = uVar1 | 1;
LAB_008009e0:
      memcpy(__dest,&DAT_00ccace8,__n);
    }
    *(undefined1 *)((long)__dest + __n) = 0;
  }
  if (*(long *)(lVar2 + 0x28) == local_68) {
    return;
  }
LAB_00800fb4:
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}

