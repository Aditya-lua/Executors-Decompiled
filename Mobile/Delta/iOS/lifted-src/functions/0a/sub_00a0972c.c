/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa0972c..0xa099dc (688 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern long long g_d3c8a8;
extern char g_10002b0;

unsigned long long sub_a0972c(long long a0, unsigned long long *a1, void* a2)
{
    unsigned long i;  // x8
    unsigned long v12;  // x23
    unsigned long long v21;  // x16
    unsigned long long v22;  // x16
    unsigned long long v23;  // 4124
    unsigned long long v24;  // x4
    unsigned long v25;  // x17
    unsigned long long v26;  // 4214
    unsigned long long v27;  // x17
    unsigned long long v28;  // 4219
    unsigned long long v29;  // x4
    unsigned long long v30;  // x4
    unsigned long v13;  // x24
    unsigned long long v31;  // 4239
    unsigned long v32;  // x4
    unsigned long v33;  // 4244
    unsigned long long v34;  // x27
    unsigned long long v35;  // x26
    unsigned long long v36;  // 4264
    unsigned long v37;  // x26
    unsigned long v38;  // 4269
    unsigned long long v39;  // x27
    unsigned long long v40;  // x25
    unsigned long v14;  // x25
    unsigned long long v41;  // 4289
    unsigned long v42;  // x25
    unsigned long v43;  // 4294
    unsigned long long v44;  // x27
    unsigned long long v45;  // x24
    unsigned long long v46;  // 4314
    unsigned long v47;  // x24
    unsigned long v48;  // 4319
    unsigned long long v49;  // x27
    unsigned long long v50;  // x0
    unsigned long v15;  // x26
    unsigned long long v51;  // x23
    unsigned long long v52;  // 4339
    unsigned long long v53;  // x23
    unsigned long v54;  // 4344
    unsigned long long v55;  // x0
    unsigned long long v56;  // x5
    unsigned long v57;  // x27
    unsigned long long v58;  // x28
    unsigned long v59;  // 4196
    unsigned long long v60;  // x17
    unsigned long v16;  // x27
    unsigned long long v61;  // 4208
    unsigned long v62;  // 4213
    unsigned long long v63;  // x17
    unsigned long long v64;  // x17
    unsigned long long v65;  // 4245
    unsigned long v66;  // 4250
    unsigned long long v67;  // x17
    unsigned long long v68;  // x27
    unsigned long long v69;  // x17
    unsigned long long v70;  // 4270
    unsigned long v17;  // x28
    unsigned long v71;  // 4275
    unsigned long long v72;  // x17
    unsigned long v73;  // x4
    unsigned long long v74;  // x6
    unsigned long long v75;  // x17
    unsigned long long v76;  // 4295
    unsigned long v77;  // 4300
    unsigned long long v78;  // x17
    unsigned long long v79;  // x17
    unsigned long long v80;  // 4312
    unsigned long v18;  // x3
    unsigned long v81;  // 4317
    unsigned long long v82;  // x17
    unsigned long long v83;  // x16
    unsigned long long v84;  // x17
    unsigned long long v85;  // 4333
    unsigned long v86;  // 4342
    unsigned long long v87;  // x16
    unsigned long long v88;  // x16
    unsigned long long v89;  // 4115
    unsigned long long v90;  // 4126
    unsigned long long v19;  // x0
    unsigned long long v91;  // x0
    unsigned long long v20;  // x17
    unsigned long v0;  // [bp-0xa8]
    unsigned long long v1;  // [bp-0xa0]
    unsigned long v2;  // [bp-0x98]
    unsigned long v3;  // [bp-0x90]
    unsigned long v4;  // [bp-0x88]
    unsigned long v5;  // [bp-0x80]
    unsigned long v6;  // [bp-0x78]
    unsigned long long v7;  // [bp-0x70]
    unsigned long v8;  // [bp-0x68]
    char *v9;  // [bp-0x10]
    char v10;  // [bp+0x0]

    v9 = &v10;
    i = 0;
    v12 = 0;
    v13 = 0;
    v14 = 0;
    v15 = 0;
    v16 = 0;
    x30 = 0;
    v17 = 0;
    v18 = 0;
    v8 = *(long long *)&g_10002b0;
    do
    {
        v19 = *(long long *)((char *)a1 + i);
        v20 = *(long long *)a2 * v19 >> 64;
        v21 = v19 * *(long long *)a2;
        v22 = v21 + v17;
        v23 = arm64g_calculate_condition(50, v21, v17, 0);
        if (!(v23 & 1))
            v20 += 1;
        v24 = v19 * (long long)a2[8];
        v25 = v20 + x30;
        v26 = arm64g_calculate_condition(50, v20, x30, 0);
        v27 = v25 + v24;
        v28 = arm64g_calculate_flag_c(2, v25, v24, 0);
        v29 = !(v26 & 1) + ((long long)a2[8] * v19 >> 64) + v28;
        x30 = v19 * (long long)a2[16];
        v30 = v29 + v16;
        v31 = arm64g_calculate_condition(50, v29, v16, 0);
        v32 = v30 + x30;
        v33 = arm64g_calculate_flag_c(2, v30, x30, 0);
        v34 = !(v31 & 1) + ((long long)a2[16] * v19 >> 64) + v33;
        x30 = v19 * (long long)a2[24];
        v35 = v34 + v15;
        v36 = arm64g_calculate_condition(50, v34, v15, 0);
        v37 = v35 + x30;
        v38 = arm64g_calculate_flag_c(2, v35, x30, 0);
        v39 = !(v36 & 1) + ((long long)a2[24] * v19 >> 64) + v38;
        x30 = v19 * (long long)a2[32];
        v40 = v39 + v14;
        v41 = arm64g_calculate_condition(50, v39, v14, 0);
        v42 = v40 + x30;
        v43 = arm64g_calculate_flag_c(2, v40, x30, 0);
        v44 = !(v41 & 1) + ((long long)a2[32] * v19 >> 64) + v43;
        x30 = v19 * (long long)a2[40];
        v45 = v44 + v13;
        v46 = arm64g_calculate_condition(50, v44, v13, 0);
        v47 = v45 + x30;
        v48 = arm64g_calculate_flag_c(2, v45, x30, 0);
        v49 = !(v46 & 1) + ((long long)a2[40] * v19 >> 64) + v48;
        v50 = v19 * (long long)a2[48];
        v51 = v49 + v12;
        v52 = arm64g_calculate_condition(50, v49, v12, 0);
        v53 = v51 + v50;
        v54 = arm64g_calculate_flag_c(2, v51, v50, 0);
        v55 = !(v52 & 1) + ((long long)a2[48] * v19 >> 64) + v54;
        v56 = 269446386856070085 * v22;
        v57 = v56 * 2556006723728458995 >> 64;
        v58 = 0x5eeb636e52ff7369 * v22;
        v59 = arm64g_calculate_flag_c(2, v22, -v22, 0);
        v60 = v27 + v57 + v59;
        v61 = arm64g_calculate_condition(54, v27, v57, v59);
        v17 = v60 + v58;
        v62 = arm64g_calculate_flag_c(2, v60, v58, 0);
        v63 = !(v61 & 1) + (v56 * 2408513697996967765 >> 64) + v62;
        v22 *= 5236794098484522192;
        v64 = v63 + v32;
        v65 = arm64g_calculate_condition(50, v63, v32, 0);
        x30 = v64 + v22;
        v66 = arm64g_calculate_flag_c(2, v64, v22, 0);
        v67 = !(v65 & 1) + (v56 * 14145484589129676432 >> 64) + v66;
        v68 = 16568120613139785037 * v22;
        v69 = v67 + v37;
        v70 = arm64g_calculate_condition(50, v67, v37, 0);
        v16 = v69 + v68;
        v71 = arm64g_calculate_flag_c(2, v69, v68, 0);
        v72 = !(v70 & 1) + (v56 * 0xffffffff7cca23e9 >> 64) + v71;
        v73 = v56 * 0xffffffffffffffff >> 64;
        v74 = -(269446386856070085 * v22);
        v75 = v72 + v42;
        v76 = arm64g_calculate_condition(50, v72, v42, 0);
        v15 = v75 + v74;
        v77 = arm64g_calculate_flag_c(2, v75, v74, 0);
        v78 = !(v76 & 1) + v73 + v77;
        v79 = v78 + v47;
        v80 = arm64g_calculate_condition(50, v78, v47, 0);
        v14 = v79 + v74;
        v81 = arm64g_calculate_flag_c(2, v79, v74, 0);
        v82 = !(v80 & 1) + v73 + v81;
        v83 = 4342239631571317819 * v22;
        v84 = v82 + v53;
        v85 = arm64g_calculate_condition(50, v82, v53, 0);
        v13 = v84 + v83;
        v86 = arm64g_calculate_flag_c(2, v84, v83, 0);
        v87 = !(v85 & 1) + (v56 * 0x3fffffffffffffff >> 64) + v86;
        v88 = v87 + v18;
        v89 = arm64g_calculate_condition(50, v87, v18, 0);
        v18 = !(v89 & 1);
        v12 = v88 + v55;
        v90 = arm64g_calculate_condition(50, v88, v55, 0);
        if (!(v90 & 1))
            v18 += 1;
        i += 8;
    } while (i != 56);
    v0 = v17;
    v1 = v22;
    v2 = v16;
    v3 = v15;
    v4 = v14;
    v5 = v13;
    v6 = v12;
    v7 = v55;
    v91 = sub_a099e4(a0, &v0, &g_d3c8a8);
    if (*(long long *)&g_10002b0 == v8)
        return v91;
    ___stack_chk_fail();
}
