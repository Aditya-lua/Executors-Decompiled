/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1ae788..0x1aebcc (1092 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1ae788_6 {
    uint128_t field_0;
    uint128_t field_10;
    unsigned long long field_20;
} st_1ae788_6;

typedef struct st_1ae788_1 {
    char padding_0[392];
    uint128_t field_188;
    uint128_t field_198;
    unsigned long long field_1a8;
} st_1ae788_1;

typedef struct st_1ae788_0 {
    char field_0;
} st_1ae788_0;

typedef struct st_1ae788_2 {
    st_1ae788_0 field_0;
} st_1ae788_2;

extern char g_e70038;
extern char g_10002b0;

unsigned long long sub_1ae788(st_1ae788_1 *a0, unsigned int *a1, unsigned long long *a2, long long a3, unsigned long a4, unsigned int *a5)
{
    unsigned long long *v56;  // x24
    st_1ae788_6 *v57;  // x28
    st_1ae788_2 **v58;  // x25
    unsigned long long v59;  // x0
    unsigned int v60;  // w8
    unsigned long long v61;  // x19
    long long v62;  // x0
    long long v63;  // x0
    long long v64;  // x0
    uint128_t v0;  // [bp-0x340]
    uint128_t v1;  // [bp-0x330]
    st_1ae788_0 **v2;  // [bp-0x320], Other Possible Types: char
    st_1ae788_0 *v3;  // [bp-0x318]
    char *v4;  // [bp-0x310], Other Possible Types: st_1ae788_0 **, st_1ae788_2 **, char
    unsigned long long v5;  // [bp-0x308]
    unsigned long long v6;  // [bp-0x300]
    st_1ae788_0 **v7;  // [bp-0x2f8], Other Possible Types: unsigned long long
    unsigned long long v8;  // [bp-0x2e9]
    st_1ae788_0 **v9;  // [bp-0x2e8], Other Possible Types: unsigned long long *, char
    char v10;  // [bp-0x2e0]
    st_1ae788_0 *v11;  // [bp-0x2c0], Other Possible Types: st_1ae788_1 *, unsigned long long, unsigned long
    char *v12;  // [bp-0x2b8], Other Possible Types: unsigned long long *, unsigned int
    unsigned int *v13;  // [bp-0x2b0], Other Possible Types: unsigned long long *, uint128_t, unsigned long long
    unsigned int *v14;  // [bp-0x2a8], Other Possible Types: unsigned int
    uint128_t v15;  // [bp-0x2a0], Other Possible Types: unsigned long long
    unsigned long long v16;  // [bp-0x290], Other Possible Types: unsigned long
    unsigned long long *v17;  // [bp-0x288]
    st_1ae788_0 *v18;  // [bp-0x280], Other Possible Types: unsigned long long
    unsigned long long v19;  // [bp-0x270]
    unsigned int v20;  // [bp-0x268], Other Possible Types: unsigned long long
    unsigned long long v21;  // [bp-0x260]
    unsigned long long v22;  // [bp-0x250]
    unsigned long long v23;  // [bp-0x240]
    unsigned long long v24;  // [bp-0x230]
    unsigned long long v25;  // [bp-0x220]
    unsigned long long v26;  // [bp-0x210]
    unsigned long long v27;  // [bp-0x200]
    unsigned long long v28;  // [bp-0x1f0]
    unsigned long long v29;  // [bp-0x1e7]
    unsigned long long v30;  // [bp-0x1e0]
    unsigned long long v31;  // [bp-0x1d0]
    unsigned long long v32;  // [bp-0x1c0]
    char v33;  // [bp-0x1a8]
    unsigned long long v34;  // [bp-0x188]
    unsigned long long v35;  // [bp-0x180]
    unsigned long long v36;  // [bp-0x178]
    unsigned int v37;  // [bp-0x170]
    unsigned long long v38;  // [bp-0x168]
    unsigned long long v39;  // [bp-0x158]
    unsigned long long v40;  // [bp-0x148]
    unsigned long long v41;  // [bp-0x138]
    unsigned int v42;  // [bp-0x130]
    unsigned long long v43;  // [bp-0x128]
    unsigned long long v44;  // [bp-0x118]
    unsigned long long v45;  // [bp-0x108]
    unsigned long long v46;  // [bp-0xf8]
    unsigned long long v47;  // [bp-0xd8]
    unsigned long long v48;  // [bp-0xb8]
    unsigned long long v49;  // [bp-0xb0]
    unsigned long long v50;  // [bp-0xa8]
    unsigned long long v51;  // [bp-0x98]
    unsigned long long v52;  // [bp-0x88]
    unsigned long v53;  // [bp-0x78]
    char *v54;  // [bp-0x10]
    char v55;  // [bp+0x0]

    v54 = &v55;
    v56 = a2;
    v53 = *(long long *)&g_10002b0;
    v3 = &v2;
    v2 = &v3;
    *(char *)a4 = 1;
    v34 = 0;
    v35 = 0;
    v36 = 0;
    v37 = 0xffffffff;
    v38 = 0;
    v39 = 0;
    v40 = 0;
    v41 = 0;
    v42 = 0x3f800000;
    v48 = 0;
    v49 = 0;
    v43 = 0;
    v44 = 0;
    v45 = 0;
    v47 = 0;
    v46 = 0;
    v50 = 0;
    v51 = 0;
    v52 = 0;
    v57 = (a0->padding_0)[1];
    v0 = v57->field_10;
    v1 = v57->field_0;
    v11 = a0;
    v12 = &v34;
    v13 = a5;
    sub_1a656c(&v33, &v11, &v4);
    v4 = &v9;
    v9 = &v4;
    v11 = &g_e70038;
    v12 = *a1;
    v13 = v1;
    v15 = v0;
    v16 = *(long long *)((char *)&a0->field_198 + 8);
    v17 = v56;
    v58 = &v18;
    v7 = 0;
    sub_1bc374(&v18, 0x1000, &v7);
    v20 = 0;
    v21 = 0;
    v59 = sub_6b0cc(&v33, &v11);
    v4 = &v18;
    sub_d18e4(&v4);
    sub_181a8(&v33);
    if (v59 & 1)
    {
        v60 = v37;
        if (v60 == 407)
        {
            v11 = &v4;
            v58 = &v11;
            v4 = &v11;
            if (sub_6b08(&a0[1].padding_0[296]) && !(v11 = &v4, v4 = &v11, !sub_6b08(&a0[1].padding_0[320])))
            {
                v5 = 0;
                v6 = 0;
                v4 = &v5;
                if (sub_1bfae8(&v34, &v4, 1))
                {
                    v27 = 0;
                    v28 = 0;
                    v25 = 0;
                    v26 = 0;
                    v23 = 0;
                    v24 = 0;
                    v18 = 0;
                    v19 = 0;
                    v11 = 0;
                    v13 = 0;
                    v15 = 0;
                    v16 = 0;
                    v21 = 0;
                    v22 = 0;
                    v14 = 0xffffffff;
                    v19 = 0;
                    v20 = 0x3f800000;
                    v28 = 0;
                    v29 = 0;
                    v24 = 0;
                    v31 = 0;
                    v32 = 0;
                    v30 = 0;
                    sub_1beff0(&v34, &v11);
                    sub_1b8250(&v11);
                    v0 = v57->field_10;
                    v1 = v57->field_0;
                    v11 = a0;
                    v12 = &v4;
                    v13 = &v34;
                    v14 = a5;
                    sub_1c419c(&v10, &v11, &v9);
                    v9 = &v7;
                    v7 = &v9;
                    v11 = &g_e70038;
                    v12 = *a1;
                    v13 = v1;
                    v15 = v0;
                    v16 = *(long long *)((char *)&a0->field_198 + 8);
                    v17 = v56;
                    v56 = &v18;
                    v8 = 0;
                    sub_1bc374(&v18, 0x1000, &v8);
                    v20 = 0;
                    v21 = 0;
                    v58 = sub_6b0cc(&v10, &v11);
                    v9 = &v18;
                    sub_d18e4(&v9);
                    sub_181a8(&v10);
                    if (v58 & 1)
                        goto LABEL_1aea2c;
                    sub_1c3db0(a0, a1, 1);
                    sub_1ac7ec(a0, a1);
                    sub_1b684c(a0, a1);
                    *(char *)a4 = 0;
                    sub_62aa0(&v4, v5);
                    goto LABEL_1aeabc;
                }
                else
                {
LABEL_1aea2c:
                    sub_62aa0(&v4, v5);
                }
            }
            v60 = v37;
        }
        if (v60 == 200)
        {
            v61 = 1;
        }
        else
        {
            *a5 = 15;
            sub_1beff0(a3, &v34);
            sub_1c3db0(a0, a1, 1);
            sub_1ac7ec(a0, a1);
            sub_1b684c(a0, a1);
LABEL_1aeabc:
            v61 = 0;
        }
    }
    else
    {
        sub_1c3db0(a0, a1, 1);
        sub_1ac7ec(a0, a1);
        sub_1b684c(a0, a1);
        v61 = 0;
        *(char *)a4 = 0;
    }
    sub_1b8250(&v34);
    if (*(long long *)&g_10002b0 == v53)
        return v61;
    v62 = ___stack_chk_fail();
    v9 = v56;
    sub_d18e4(&v9);
    sub_181a8(&v10);
    sub_62aa0(&v4, v5);
    sub_1b8250(&v34);
    v63 = __Unwind_Resume(v62);
    v4 = v58;
    sub_d18e4(&v4);
    sub_181a8(&v33);
    sub_1b8250(&v34);
    v64 = __Unwind_Resume(v63);
    sub_1b8250(&v34);
    __Unwind_Resume(v64);
}
