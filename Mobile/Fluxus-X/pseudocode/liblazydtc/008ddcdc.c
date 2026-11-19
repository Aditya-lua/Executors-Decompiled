/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008ddcdc
 */

void FUN_008ddcdc(long *param_1,undefined8 *param_2,char *param_3,ulong param_4)

{
  byte bVar1;
  byte bVar2;
  long lVar3;
  void *pvVar4;
  undefined8 uVar5;
  runtime_error *this;
  char *pcVar6;
  ulong uVar7;
  char *pcVar9;
  char *pcVar8;
  char *pcVar10;
  long lVar11;
  void *unaff_x21;
  char *__src;
  void *pvVar12;
  char *pcVar13;
  ulong uVar14;
  size_t sVar15;
  ulong uVar16;
  ulong uVar17;
  byte *pbVar18;
  byte *pbVar19;
  uint uVar20;
  undefined8 uVar21;
  undefined8 uVar22;
  undefined1 local_820 [16];
  undefined4 local_810;
  undefined4 uStack_80c;
  undefined4 uStack_808;
  undefined4 uStack_804;
  undefined8 uStack_800;
  undefined8 uStack_7f8;
  undefined1 auStack_7e8 [1912];
  long local_70;
  
  lVar3 = tpidr_el0;
  local_70 = *(long *)(lVar3 + 0x28);
  if (param_4 == 0) goto LAB_008de11c;
  if (*param_3 == '\0') {
    uVar5 = __cxa_allocate_exception(0x10);
                    /* try { // try from 008de144 to 008de14f has its CatchHandler @ 008de210 */
    FUN_008de29c(uVar5,"bytecode starts with a null byte");
  }
  else {
    if (param_4 < 0x4000001) {
      *param_1 = 0;
      param_1[1] = 0;
      param_1[2] = 0;
      if (param_4 == 0) {
        pcVar6 = (char *)0x0;
        pcVar13 = (char *)0x0;
        __src = (char *)0x0;
      }
      else {
        if ((long)param_4 < 0) {
          if (*(long *)(lVar3 + 0x28) == local_70) {
                    /* try { // try from 008de1f0 to 008de1f3 has its CatchHandler @ 008de228 */
            uVar5 = FUN_0080734c();
                    /* catch() { ... } // from try @ 008dde2c with catch @ 008de1f4 */
            if (unaff_x21 != (void *)0x0) {
              param_1[1] = (long)unaff_x21;
              operator_delete(unaff_x21,param_1[2] - (long)unaff_x21);
            }
            if (*(long *)(lVar3 + 0x28) == local_70) {
                    /* WARNING: Subroutine does not return */
              FUN_00c2c090(uVar5);
            }
          }
          goto LAB_008de298;
        }
                    /* try { // try from 008ddd58 to 008ddd5f has its CatchHandler @ 008de228 */
        __src = operator_new(param_4);
        pcVar6 = __src + param_4;
        *param_1 = (long)__src;
        param_1[2] = (long)pcVar6;
        pcVar9 = param_3;
        pcVar13 = __src;
        if ((param_4 < 0x20) || ((ulong)((long)__src - (long)param_3) < 0x20)) {
LAB_008dddd0:
          pcVar10 = pcVar13;
          do {
            pcVar8 = pcVar9 + 1;
            pcVar13 = pcVar10 + 1;
            *pcVar10 = *pcVar9;
            pcVar9 = pcVar8;
            pcVar10 = pcVar13;
          } while (pcVar8 != param_3 + param_4);
        }
        else {
          uVar17 = param_4 & 0x7ffffe0;
          pcVar9 = __src + 0x10;
          pcVar10 = param_3 + 0x10;
          pcVar13 = __src + uVar17;
          uVar14 = uVar17;
          do {
            pcVar8 = pcVar10 + -8;
            uVar5 = *(undefined8 *)(pcVar10 + -0x10);
            uVar22 = *(undefined8 *)(pcVar10 + 8);
            uVar21 = *(undefined8 *)pcVar10;
            uVar14 = uVar14 - 0x20;
            pcVar10 = pcVar10 + 0x20;
            *(undefined8 *)(pcVar9 + -8) = *(undefined8 *)pcVar8;
            *(undefined8 *)(pcVar9 + -0x10) = uVar5;
            *(undefined8 *)(pcVar9 + 8) = uVar22;
            *(undefined8 *)pcVar9 = uVar21;
            pcVar9 = pcVar9 + 0x20;
          } while (uVar14 != 0);
          pcVar9 = param_3 + uVar17;
          if (param_4 != uVar17) goto LAB_008dddd0;
        }
        param_1[1] = (long)pcVar13;
      }
      uVar14 = (long)pcVar13 - (long)__src;
      pcVar9 = pcVar13;
      if (uVar14 < 0x400) {
        uVar17 = 0x400 - uVar14;
        if ((ulong)((long)pcVar6 - (long)pcVar13) < uVar17) {
          uVar16 = (long)pcVar6 - (long)__src;
          uVar7 = uVar16 * 2;
          if (uVar7 < 0x401) {
            uVar7 = 0x400;
          }
          if (0x3ffffffffffffffe < uVar16) {
            uVar7 = 0x7fffffffffffffff;
          }
                    /* try { // try from 008dde2c to 008dde33 has its CatchHandler @ 008de1f4 */
          pcVar6 = operator_new(uVar7);
          memset(pcVar6 + uVar14,0,uVar17);
          pcVar9 = pcVar6 + 0x400;
          memcpy(pcVar6,__src,uVar14);
          *param_1 = (long)pcVar6;
          param_1[1] = (long)pcVar9;
          param_1[2] = (long)(pcVar6 + uVar7);
          if (__src == (char *)0x0) {
            __src = pcVar6;
          }
          else {
            operator_delete(__src,uVar16);
            pcVar9 = (char *)param_1[1];
            __src = (char *)*param_1;
          }
        }
        else {
          pcVar9 = pcVar13 + uVar17;
          memset(pcVar13,0,uVar17);
          param_1[1] = (long)pcVar9;
        }
      }
                    /* try { // try from 008ddea4 to 008ddee3 has its CatchHandler @ 008de24c */
      blake3_hasher_init(auStack_7e8);
      blake3_hasher_update(auStack_7e8,__src,(long)pcVar9 - (long)__src);
      uStack_808 = 0;
      uStack_804 = 0;
      local_810 = 0;
      uStack_80c = 0;
      uStack_7f8 = 0;
      uStack_800 = 0;
      blake3_hasher_finalize(auStack_7e8,&local_810,0x20);
      local_820 = FUN_008dfafc(*param_2,CONCAT44(uStack_808,uStack_80c),uStack_804);
                    /* try { // try from 008ddef0 to 008ddf07 has its CatchHandler @ 008de224 */
      FUN_008de49c(param_1,param_1[1],local_820,&local_810,0x10);
      uVar20 = 0;
      lVar11 = 0;
      pbVar19 = (byte *)param_1[1];
      do {
        bVar2 = auStack_7e8[lVar11 + -0x38] ^ (byte)(0x74171870 >> (ulong)(uVar20 & 0x1f));
        if (pbVar19 < (byte *)param_1[2]) {
          pbVar18 = pbVar19 + 1;
          *pbVar19 = bVar2;
        }
        else {
          pvVar12 = (void *)*param_1;
          sVar15 = (long)pbVar19 - (long)pvVar12;
          uVar14 = sVar15 + 1;
          if ((long)uVar14 < 0) {
            if (*(long *)(lVar3 + 0x28) != local_70) goto LAB_008de298;
                    /* try { // try from 008de100 to 008de103 has its CatchHandler @ 008de25c */
            FUN_0080734c();
            goto LAB_008de104;
          }
          uVar7 = param_1[2] - (long)pvVar12;
          uVar17 = uVar7 * 2;
          if (uVar7 * 2 <= uVar14) {
            uVar17 = uVar14;
          }
          if (0x3ffffffffffffffe < uVar7) {
            uVar17 = 0x7fffffffffffffff;
          }
          if (uVar17 == 0) {
            pvVar4 = (void *)0x0;
          }
          else {
                    /* try { // try from 008ddf88 to 008ddf8f has its CatchHandler @ 008de254 */
            pvVar4 = operator_new(uVar17);
          }
          pbVar18 = (byte *)((long)pvVar4 + sVar15) + 1;
          *(byte *)((long)pvVar4 + sVar15) = bVar2;
          memcpy(pvVar4,pvVar12,sVar15);
          *param_1 = (long)pvVar4;
          param_1[1] = (long)pbVar18;
          param_1[2] = (long)pvVar4 + uVar17;
          if (pvVar12 != (void *)0x0) {
            operator_delete(pvVar12,uVar7);
          }
        }
        lVar11 = lVar11 + 1;
        uVar20 = uVar20 + 8;
        param_1[1] = (long)pbVar18;
        pbVar19 = pbVar18;
      } while (lVar11 != 4);
      lVar11 = 0;
      do {
        bVar2 = auStack_7e8[lVar11 + -0x38];
        bVar1 = (&DAT_00364ed0)[lVar11];
        if (pbVar18 < (byte *)param_1[2]) {
          pbVar19 = pbVar18 + 1;
          *pbVar18 = bVar1 ^ bVar2;
        }
        else {
          pvVar12 = (void *)*param_1;
          sVar15 = (long)pbVar18 - (long)pvVar12;
          uVar14 = sVar15 + 1;
          if ((long)uVar14 < 0) goto LAB_008de104;
          uVar7 = param_1[2] - (long)pvVar12;
          uVar17 = uVar7 * 2;
          if (uVar7 * 2 <= uVar14) {
            uVar17 = uVar14;
          }
          if (0x3ffffffffffffffe < uVar7) {
            uVar17 = 0x7fffffffffffffff;
          }
          if (uVar17 == 0) {
            pvVar4 = (void *)0x0;
          }
          else {
                    /* try { // try from 008de054 to 008de05b has its CatchHandler @ 008de250 */
            pvVar4 = operator_new(uVar17);
          }
          pbVar19 = (byte *)((long)pvVar4 + sVar15) + 1;
          *(byte *)((long)pvVar4 + sVar15) = bVar1 ^ bVar2;
          memcpy(pvVar4,pvVar12,sVar15);
          *param_1 = (long)pvVar4;
          param_1[1] = (long)pbVar19;
          param_1[2] = (long)pvVar4 + uVar17;
          if (pvVar12 != (void *)0x0) {
            operator_delete(pvVar12,uVar7);
          }
        }
        lVar11 = lVar11 + 1;
        param_1[1] = (long)pbVar19;
        pbVar18 = pbVar19;
      } while (lVar11 != 4);
                    /* try { // try from 008de0ac to 008de0b3 has its CatchHandler @ 008de248 */
      uVar14 = FUN_008de2cc(param_2,*param_1,(long)pbVar19 - *param_1);
      if ((uVar14 & 1) == 0) {
        this = (runtime_error *)__cxa_allocate_exception(0x10);
                    /* try { // try from 008de1a4 to 008de1af has its CatchHandler @ 008de1fc */
        std::runtime_error::runtime_error(this,"signed bytecode failed local verification");
        if (*(long *)(lVar3 + 0x28) == local_70) {
                    /* try { // try from 008de1c4 to 008de1db has its CatchHandler @ 008de248 */
                    /* WARNING: Subroutine does not return */
          __cxa_throw(this,&std::runtime_error::typeinfo,std::underflow_error::~underflow_error);
        }
      }
      else if (*(long *)(lVar3 + 0x28) == local_70) {
        return;
      }
      goto LAB_008de298;
    }
    uVar5 = __cxa_allocate_exception(0x10);
                    /* try { // try from 008de160 to 008de16b has its CatchHandler @ 008de20c */
    FUN_008de29c(uVar5,"bytecode exceeds maximum payload size");
  }
  goto LAB_008de16c;
LAB_008de104:
  if (*(long *)(lVar3 + 0x28) != local_70) goto LAB_008de298;
                    /* try { // try from 008de118 to 008de11b has its CatchHandler @ 008de258 */
  FUN_0080734c();
LAB_008de11c:
  uVar5 = __cxa_allocate_exception(0x10);
                    /* try { // try from 008de128 to 008de133 has its CatchHandler @ 008de214 */
  FUN_008de29c(uVar5,"bytecode is empty");
LAB_008de16c:
  if (*(long *)(lVar3 + 0x28) == local_70) {
                    /* WARNING: Subroutine does not return */
    __cxa_throw(uVar5,&std::invalid_argument::typeinfo,std::domain_error::~domain_error);
  }
LAB_008de298:
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}

