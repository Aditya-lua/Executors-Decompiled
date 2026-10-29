/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc42004..0xc422a4 (672 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c42004_4 {
    unsigned long long field_0;
    unsigned long long field_8;
    char padding_10[8];
    struct st_c42004_3 *field_18;
} st_c42004_4;

typedef struct st_c42004_0 {
    char padding_0[24];
    struct st_c42004_1 *field_18;
    char *field_20;
} st_c42004_0;

typedef struct st_c42004_3 {
    char padding_0[56];
    struct st_c42004_2 *field_38;
    char padding_40[8];
    struct st_c42004_2 *field_48;
} st_c42004_3;

typedef struct st_c42004_1 {
    struct st_c42004_0 *field_0;
} st_c42004_1;

typedef struct st_c42004_2 {
    unsigned long long field_0;
} st_c42004_2;

extern unsigned long long g_be766c;
extern unsigned long long g_bef1c8;
extern unsigned long long g_c409b8;
extern long long g_cba52b;
extern long long g_efcf38;
extern long long g_efcf68;
extern long long g_efd0c8;
extern st_c42004_2 *g_f0b240;

void sub_c42004(st_c42004_4 *a0, st_c42004_0 **a1)
{
    unsigned long long v61;  // x28
    unsigned long long v62;  // x27
    unsigned long long v71;  // x30
    st_c42004_0 *v72;  // x9
    st_c42004_0 **v73;  // x8
    unsigned long v74;  // cc_dep1
    st_c42004_0 **v75;  // x8
    unsigned long long v76;  // 4106
    unsigned long long v77;  // 4106
    unsigned long long v63;  // x26
    unsigned long long v64;  // x25
    unsigned long long v65;  // x24
    unsigned long long v66;  // x23
    unsigned long long v67;  // x22
    unsigned long long v68;  // x21
    unsigned long long v69;  // x20
    unsigned long long v70;  // x19
    st_c42004_0 **v0;  // [bp-0x2e8]
    st_c42004_0 *v1;  // [bp-0x2e0]
    st_c42004_0 **v2;  // [bp-0x2d8]
    st_c42004_0 **v3;  // [bp-0x2d0]
    st_c42004_0 **v4;  // [bp-0x2c0]
    st_c42004_0 **v5;  // [bp-0x2b0]
    st_c42004_0 **v6;  // [bp-0x2a0]
    st_c42004_0 **v7;  // [bp-0x290]
    st_c42004_0 **v8;  // [bp-0x280]
    st_c42004_0 **v9;  // [bp-0x270]
    st_c42004_0 **v10;  // [bp-0x260]
    st_c42004_0 **v11;  // [bp-0x250]
    st_c42004_0 **v12;  // [bp-0x240]
    st_c42004_0 **v13;  // [bp-0x230]
    st_c42004_0 **v14;  // [bp-0x220]
    st_c42004_0 **v15;  // [bp-0x210]
    st_c42004_0 **v16;  // [bp-0x200]
    st_c42004_0 **v17;  // [bp-0x1f0]
    st_c42004_0 **v18;  // [bp-0x1e0]
    st_c42004_0 **v19;  // [bp-0x1d0]
    st_c42004_0 **v20;  // [bp-0x1c0]
    st_c42004_0 **v21;  // [bp-0x1b0]
    st_c42004_0 **v22;  // [bp-0x1a0]
    st_c42004_0 **v23;  // [bp-0x190]
    st_c42004_0 **v24;  // [bp-0x180]
    st_c42004_0 **v25;  // [bp-0x170]
    st_c42004_0 **v26;  // [bp-0x160]
    st_c42004_0 **v27;  // [bp-0x150]
    st_c42004_0 **v28;  // [bp-0x140]
    st_c42004_0 **v29;  // [bp-0x130]
    st_c42004_0 **v30;  // [bp-0x120]
    st_c42004_0 **v31;  // [bp-0x110]
    st_c42004_0 **v32;  // [bp-0x100]
    st_c42004_0 **v33;  // [bp-0xf0]
    st_c42004_0 **v34;  // [bp-0xe0]
    st_c42004_1 **v35;  // [bp-0xd0]
    uint128_t v36;  // [bp-0xc8]
    st_c42004_0 **v37;  // [bp-0xb8]
    st_c42004_1 **v38;  // [bp-0xb0]
    unsigned long long v39;  // [bp-0xa8]
    st_c42004_1 **v40;  // [bp-0xa0]
    unsigned long long v41;  // [bp-0x98]
    unsigned long v42;  // [bp-0x90]
    unsigned long long v43;  // [bp-0x88]
    unsigned long v44;  // [bp-0x80]
    unsigned long long v45;  // [bp-0x78]
    st_c42004_1 **v46;  // [bp-0x70]
    st_c42004_0 **v47;  // [bp-0x68]
    unsigned long long v48;  // [bp-0x60]
    unsigned long long v49;  // [bp-0x58]
    unsigned long long v50;  // [bp-0x50]
    unsigned long long v51;  // [bp-0x48]
    unsigned long long v52;  // [bp-0x40]
    unsigned long long v53;  // [bp-0x38]
    unsigned long long v54;  // [bp-0x30]
    unsigned long long v55;  // [bp-0x28]
    unsigned long long v56;  // [bp-0x20]
    unsigned long long v57;  // [bp-0x18]
    char *v58;  // [bp-0x10]
    unsigned long long v59;  // [bp-0x8]
    char v60;  // [bp+0x0]

    v48 = v61;
    v49 = v62;
    v50 = v63;
    v51 = v64;
    v52 = v65;
    v53 = v66;
    v54 = v67;
    v55 = v68;
    v56 = v69;
    v57 = v70;
    v58 = &v60;
    v59 = v71;
    if (a1)
    {
        v72 = *a1;
        v73 = v72->field_18;
        if (v73)
            v72 = v72->field_20 - 1;
    }
    else
    {
        v73 = 0;
    }
    v74 = v73;
    if (!v73)
    {
        v75 = "<unnamed>__rust_end_short_backtrace__rust_begin_short_backtraces";
        v76 = arm64g_calculate_condition(4, v74, 0, 0);
        if (!(v76 & 1))
            goto LABEL_c42062;
LABEL_c42061:
        v72 = 9;
    }
    else
    {
        v75 = v73;
        v77 = arm64g_calculate_condition(4, v74, 0, 0);
        if (v77 & 1)
            goto LABEL_c42061;
LABEL_c42062:
    }
    v0 = v75;
    v1 = v72;
    v3 = 0;
    if (_pthread_threadid_np())
        g_f0b240();
    v2 = v3;
    v33 = (st_c42004_0 **)0;
    v34 = (st_c42004_0 **)0;
    v31 = (st_c42004_0 **)0;
    v32 = (st_c42004_0 **)0;
    v29 = (st_c42004_0 **)0;
    v30 = (st_c42004_0 **)0;
    v27 = (st_c42004_0 **)0;
    v28 = (st_c42004_0 **)0;
    v25 = (st_c42004_0 **)0;
    v26 = (st_c42004_0 **)0;
    v23 = (st_c42004_0 **)0;
    v24 = (st_c42004_0 **)0;
    v21 = (st_c42004_0 **)0;
    v22 = (st_c42004_0 **)0;
    v19 = (st_c42004_0 **)0;
    v20 = (st_c42004_0 **)0;
    v17 = (st_c42004_0 **)0;
    v18 = (st_c42004_0 **)0;
    v15 = (st_c42004_0 **)0;
    v16 = (st_c42004_0 **)0;
    v13 = (st_c42004_0 **)0;
    v14 = (st_c42004_0 **)0;
    v11 = (st_c42004_0 **)0;
    v12 = (st_c42004_0 **)0;
    v10 = (st_c42004_0 **)0;
    v8 = (st_c42004_0 **)0;
    v9 = (st_c42004_0 **)0;
    v6 = (st_c42004_0 **)0;
    v7 = (st_c42004_0 **)0;
    v4 = (st_c42004_0 **)0;
    v5 = (st_c42004_0 **)0;
    v3 = (st_c42004_0 **)0;
    v35 = &v3;
    v36 = 0x200;
    v38 = &v0;
    v39 = &g_be766c;
    v40 = &v2;
    v41 = &g_bef1c8;
    v42 = a0->field_0;
    v43 = &g_c409b8;
    v44 = a0->field_8;
    v45 = &g_be766c;
    v46 = &v35;
    v47 = 0;
    if (!sub_be769c(&v46, &g_efcf38, &g_cba52b, &v38))
    {
        if (v47)
            sub_c40ff0(&v47);
        if (513 > *(unsigned long long *)((void*)&v36 + 8))
            a0->field_18->field_38();
        sub_c73bb0(0, *(unsigned long long *)((void*)&v36 + 8), 0x200, &g_efd0c8);
    }
    else if (v47)
    {
        v37 = v47;
        sub_c40ff0(&v37);
        v38 = &v0;
        v39 = &g_be766c;
        v40 = &v2;
        v41 = &g_bef1c8;
        v42 = a0->field_0;
        v43 = &g_c409b8;
        v44 = a0->field_8;
        v45 = &g_be766c;
        a0->field_18->field_48();
    }
    sub_c73b38("a formatting trait implementation returned an error when the underlying stream did notinternal error: entered unreachable codefile name contained an unexpected NUL byte", 173, &g_efcf68);
    __debugbreak();
}
