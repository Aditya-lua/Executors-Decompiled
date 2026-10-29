/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa0a0cc..0xa0a420 (852 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a0a0cc_0 {
    uint128_t field_0;
    uint128_t field_10;
    uint128_t field_20;
    unsigned long long field_30;
} st_a0a0cc_0;

extern long long g_d3c800;
extern long long g_d3c870;
extern char g_10002b0;
extern unsigned int g_fffffffffffffffc;

st_a0a0cc_0 * sub_a0a0cc(st_a0a0cc_0 *ptr, unsigned long a1, unsigned long long a2)
{
    unsigned long long v14;  // x8
    char *v15;  // x0
    unsigned long v24;  // 4233
    unsigned long long v25;  // x10
    unsigned long long v26;  // 4245
    unsigned long v27;  // x11
    unsigned long long v28;  // x10
    unsigned long v29;  // 4254
    unsigned long long v30;  // x11
    unsigned long long v31;  // 4266
    unsigned long v32;  // x12
    unsigned long long v33;  // x11
    unsigned long long i;  // x23
    unsigned long v34;  // 4275
    unsigned long long v35;  // x12
    unsigned long long v36;  // 4291
    unsigned long v37;  // x15
    unsigned long long v38;  // x12
    unsigned long v39;  // 4296
    unsigned long long v40;  // x13
    unsigned long long v41;  // 4308
    unsigned long v42;  // x14
    unsigned long long v43;  // x13
    long long v17;  // x20
    unsigned long v44;  // 4315
    unsigned long long v45;  // x14
    unsigned long long v46;  // 4327
    unsigned long long v47;  // x17
    unsigned long long v48;  // x8
    unsigned long v49;  // 4340
    long long v50;  // x0
    long long v51;  // x1
    unsigned long long v52;  // x9
    unsigned long long v53;  // 4355
    unsigned long long v18;  // x8
    unsigned long long v54;  // x9
    unsigned long v55;  // 4123
    long long v56;  // x0
    long long v57;  // x1
    unsigned long long v58;  // x10
    unsigned long long v59;  // 4138
    unsigned long long v60;  // x10
    unsigned long v61;  // 4123
    long long v62;  // x0
    long long v63;  // x1
    unsigned long v19;  // 4212
    unsigned long long v64;  // x11
    unsigned long long v65;  // 4138
    unsigned long long v66;  // x11
    unsigned long v67;  // 4121
    long long v68;  // x0
    long long v69;  // x1
    unsigned long long v70;  // x12
    unsigned long long v71;  // 4136
    unsigned long long v72;  // x12
    unsigned long v73;  // 4113
    unsigned long long v20;  // x9
    long long v74;  // x0
    long long v75;  // x1
    unsigned long long v76;  // x13
    unsigned long long v77;  // 4128
    unsigned long long v78;  // x13
    unsigned long v79;  // 4113
    long long v80;  // x0
    long long v81;  // x1
    unsigned long long v82;  // x17
    unsigned long long v83;  // 4128
    unsigned long long v21;  // 4224
    unsigned long v84;  // 4190
    unsigned long v85;  // 4197
    unsigned long long v86;  // x14
    unsigned long long v87;  // x15
    unsigned long long v88;  // x15
    unsigned long v89;  // 4210
    unsigned long long v90;  // x15
    unsigned long v91;  // 4217
    unsigned long long v92;  // x15
    unsigned long v93;  // 4224
    unsigned long v22;  // x10
    unsigned long v94;  // 4239
    unsigned long v95;  // 4246
    unsigned long v96;  // 4257
    unsigned long long v23;  // x9
    unsigned long v0;  // [bp-0xd8]
    unsigned long v1;  // [bp-0xd0]
    unsigned long v2;  // [bp-0xc8]
    unsigned long v3;  // [bp-0xc0]
    unsigned long v4;  // [bp-0xb8]
    unsigned long v5;  // [bp-0xb0]
    unsigned long v6;  // [bp-0xa8]
    uint128_t v7;  // [bp-0xa0], Other Possible Types: char
    uint128_t v8;  // [bp-0x90]
    uint128_t v9;  // [bp-0x80]
    unsigned long long v10;  // [bp-0x70]
    unsigned long v11;  // [bp-0x68]
    char *v12;  // [bp-0x10]
    char v13;  // [bp+0x0]

    v12 = &v13;
    v11 = *(long long *)&g_10002b0;
    if (a2)
    {
        v14 = (a2 >> 3) / 7 * 56;
        if (a2 == v14)
            v14 -= 56;
        sub_a09c14();
        if (a2 == 56)
        {
            sub_a0972c(ptr, &v7, &g_d3c800);
            sub_a0972c(ptr, ptr, &g_d3c870);
            v15 = &v7;
        }
        else
        {
            if (v14)
            {
                i = -v14;
                v17 = v14 + a1 - 56;
                do
                {
                    sub_a0972c(&v7, &v7, &g_d3c870);
                    sub_a09c14(&v0, v17, 56);
                    sub_a0972c(&v0, &v0, &g_d3c800);
                    sub_a0972c(&v0, &v0, &g_d3c870);
                    v18 = v0 + *(unsigned long long *)&v7;
                    v19 = arm64g_calculate_flag_c(2, v0, *(unsigned long long *)&v7, 0);
                    v20 = *(unsigned long long *)((void*)&v7 + 8) + v19;
                    v21 = arm64g_calculate_condition(54, *(unsigned long long *)((void*)&v7 + 8), 0, v19);
                    v22 = !(v21 & 1);
                    v23 = v20 + v1;
                    v24 = arm64g_calculate_flag_c(2, v20, v1, 0);
                    v25 = (unsigned long long)v8 + v22 + v24;
                    v26 = arm64g_calculate_condition(54, (unsigned long long)v8, v22, v24);
                    v27 = !(v26 & 1);
                    v28 = v25 + v2;
                    v29 = arm64g_calculate_flag_c(2, v25, v2, 0);
                    v30 = *(unsigned long long *)((void*)&v8 + 8) + v27 + v29;
                    v31 = arm64g_calculate_condition(54, *(unsigned long long *)((void*)&v8 + 8), v27, v29);
                    v32 = !(v31 & 1);
                    v33 = v30 + v3;
                    v34 = arm64g_calculate_flag_c(2, v30, v3, 0);
                    v35 = (unsigned long long)v9 + v32 + v34;
                    v36 = arm64g_calculate_condition(54, (unsigned long long)v9, v32, v34);
                    v37 = !(v36 & 1);
                    v38 = v35 + v4;
                    v39 = arm64g_calculate_flag_c(2, v35, v4, 0);
                    v40 = *(unsigned long long *)((void*)&v9 + 8) + v37 + v39;
                    v41 = arm64g_calculate_condition(54, *(unsigned long long *)((void*)&v9 + 8), v37, v39);
                    v42 = !(v41 & 1);
                    v43 = v40 + v5;
                    v44 = arm64g_calculate_flag_c(2, v40, v5, 0);
                    v45 = v10 + v42 + v44;
                    v46 = arm64g_calculate_condition(54, v10, v42, v44);
                    v47 = v45 + v6;
                    v48 = v18 + 15890737349981092621;
                    v49 = arm64g_calculate_flag_c(2, v18, 15890737349981092621, 0);
                    v50 = (char *)&g_fffffffffffffffc + v49 + 3;
                    v51 = v50 >> 63;
                    v52 = v50 + v23;
                    v53 = arm64g_calculate_condition(50, v50, v23, 0);
                    if (!(v53 & 1))
                        v51 += 1;
                    v54 = v52 + 16038230375712583851;
                    v55 = arm64g_calculate_flag_c(2, v52, 16038230375712583851, 0);
                    v56 = v51 + (char *)&g_fffffffffffffffc + v55 + 3;
                    v57 = v56 >> 63;
                    v58 = v56 + v28;
                    v59 = arm64g_calculate_condition(50, v56, v28, 0);
                    if (!(v59 & 1))
                        v57 += 1;
                    v60 = v58 + 4301259484579875184;
                    v61 = arm64g_calculate_flag_c(2, v58, 4301259484579875184, 0);
                    v62 = v57 + (char *)&g_fffffffffffffffc + v61 + 3;
                    v63 = v62 >> 63;
                    v64 = v62 + v33;
                    v65 = arm64g_calculate_condition(50, v62, v33, 0);
                    if (!(v65 & 1))
                        v63 += 1;
                    v66 = v64 + 2201345047;
                    v67 = arm64g_calculate_flag_c(2, v64, 2201345047, 0);
                    v68 = v63 + (char *)&g_fffffffffffffffc + v67 + 3;
                    v69 = v68 >> 63;
                    v70 = v68 + v38;
                    v71 = arm64g_calculate_condition(50, v68, v38, 0);
                    if (!(v71 & 1))
                        v69 += 1;
                    v72 = v70 + 1;
                    v73 = arm64g_calculate_flag_c(2, v70, 1, 0);
                    v74 = v69 + (char *)&g_fffffffffffffffc + v73 + 3;
                    v75 = v74 >> 63;
                    v76 = v74 + v43;
                    v77 = arm64g_calculate_condition(50, v74, v43, 0);
                    if (!(v77 & 1))
                        v75 += 1;
                    v78 = v76 + 1;
                    v79 = arm64g_calculate_flag_c(2, v76, 1, 0);
                    v80 = v75 + (char *)&g_fffffffffffffffc + v79 + 3;
                    v81 = v80 >> 63;
                    v82 = v80 + v47;
                    v83 = arm64g_calculate_condition(50, v80, v47, 0);
                    if (!(v83 & 1))
                        v81 += 1;
                    v84 = arm64g_calculate_flag_c(2, v82, 13835058055282163713, 0);
                    v85 = arm64g_calculate_flag_c(2, v45, v6, 0);
                    v86 = v81 + (char *)&g_fffffffffffffffc + v84 + !(v46 & 1) + v85 + 3;
                    v87 = v86 & 2556006723728458995;
                    v88 = v86 & 2408513697996967765;
                    v89 = arm64g_calculate_flag_c(2, v48, v87, 0);
                    v90 = v86 & 14145484589129676432;
                    v91 = arm64g_calculate_flag_c(6, v54, v88, v89);
                    v92 = v86 & 0xffffffff7cca23e9;
                    v93 = arm64g_calculate_flag_c(6, v60, v90, v91);
                    v7 = CONCAT(v54 + v88 + v89, v48 + v87);
                    v8 = CONCAT(v66 + v92 + v93, v60 + v90 + v91);
                    v94 = arm64g_calculate_flag_c(6, v66, v92, v93);
                    v95 = arm64g_calculate_flag_c(6, v72, v86, v94);
                    v9 = CONCAT(v78 + v86 + v95, v72 + v86 + v94);
                    v96 = arm64g_calculate_flag_c(6, v78, v86, v95);
                    v10 = (v86 & 0x3fffffffffffffff) + v82 + 13835058055282163713 + v96;
                    v17 -= 56;
                    i += 56;
                } while (i);
            }
            ptr->field_0 = v7;
            ptr->field_10 = v8;
            ptr->field_20 = v9;
            ptr->field_30 = v10;
            sub_a66ec0(&v7, 56);
            v15 = &v0;
        }
        ptr = sub_a66ec0(v15, 56);
    }
    else
    {
        memset(ptr, 0, 56);
    }
    if (*(long long *)&g_10002b0 == v11)
        return ptr;
    ___stack_chk_fail();
}
