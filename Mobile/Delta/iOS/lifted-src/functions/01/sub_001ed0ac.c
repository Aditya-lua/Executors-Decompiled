/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1ed0ac..0x1ed4e4 (1080 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1ed0ac_3 {
    struct st_1ed0ac_0 *field_0;
} st_1ed0ac_3;

typedef struct st_1ed0ac_0 {
    char field_0;
} st_1ed0ac_0;


unsigned long long sub_1ed0ac(unsigned long long a0, unsigned long a1, long long a2, long long a3, long long a4, unsigned long long a5)
{
    long long v53;  // x23
    unsigned long long v54;  // x22
    unsigned long long v63;  // x1
    long long v64;  // x0
    unsigned long long v65;  // x0
    unsigned long long v55;  // x19
    unsigned long long *v56;  // x26
    long long v57;  // x0
    unsigned long long v58;  // x0
    long long v59;  // x0
    unsigned long long v60;  // x0
    long long v61;  // x0
    unsigned long long v62;  // x0
    unsigned long long *v0;  // [bp-0x390]
    st_1ed0ac_0 **v1;  // [bp-0x388], Other Possible Types: char
    st_1ed0ac_0 *v2;  // [bp-0x380]
    unsigned long long *v3;  // [bp-0x378], Other Possible Types: unsigned long
    long long v4;  // [bp-0x370]
    long long v5;  // [bp-0x368]
    unsigned int v6;  // [bp-0x360]
    unsigned long long v7;  // [bp-0x358]
    unsigned long long v8;  // [bp-0x350]
    unsigned long long v9;  // [bp-0x348]
    unsigned long long v10;  // [bp-0x328]
    unsigned long long v11;  // [bp-0x318]
    unsigned long long v12;  // [bp-0x308]
    unsigned long long v13;  // [bp-0x2f8]
    unsigned long long v14;  // [bp-0x2e8]
    unsigned long long v15;  // [bp-0x298]
    unsigned long long v16;  // [bp-0x290]
    uint200_t v17;  // [bp-0x280]
    unsigned long long v18;  // [bp-0x260]
    unsigned long long v19;  // [bp-0x258]
    unsigned long long v20;  // [bp-0x250]
    unsigned long long v21;  // [bp-0x248]
    unsigned long long v22;  // [bp-0x240]
    unsigned long long v23;  // [bp-0x238]
    unsigned long long v24;  // [bp-0x228]
    unsigned long long v25;  // [bp-0x218]
    unsigned long long v26;  // [bp-0x208]
    char v27;  // [bp-0x1f8]
    unsigned long long v28;  // [bp-0x1d8]
    unsigned long long v29;  // [bp-0x1d0]
    unsigned long long v30;  // [bp-0x1c8]
    unsigned long long v31;  // [bp-0x1a8]
    unsigned long long v32;  // [bp-0x198]
    unsigned long long v33;  // [bp-0x188]
    unsigned long long v34;  // [bp-0x178]
    unsigned long long v35;  // [bp-0x168]
    unsigned long long v36;  // [bp-0x118]
    unsigned long long v37;  // [bp-0x110]
    unsigned long long v38;  // [bp-0x100]
    unsigned long long v39;  // [bp-0xf7]
    unsigned long long v40;  // [bp-0xe0]
    unsigned long long v41;  // [bp-0xd8]
    unsigned long long v42;  // [bp-0xd0]
    unsigned long long v43;  // [bp-0xc8]
    unsigned long long v44;  // [bp-0xc0]
    unsigned long long v45;  // [bp-0xb8]
    unsigned long long v46;  // [bp-0xa8]
    unsigned long long v47;  // [bp-0x98]
    unsigned long long v48;  // [bp-0x88]
    char *v49;  // [bp-0x78], Other Possible Types: st_1ed0ac_3 **, st_1ed0ac_0 *
    unsigned long long *v50;  // [bp-0x70], Other Possible Types: st_1ed0ac_0 **
    char *v51;  // [bp-0x10]
    char v52;  // [bp+0x0]

    v51 = &v52;
    v53 = a2;
    v54 = a1;
    v55 = a0;
    v2 = &v1;
    v1 = &v2;
    v28 = 0;
    v29 = 0;
    v30 = 0;
    v31 = 0;
    v32 = 0;
    v33 = 0;
    v34 = 0;
    v35 = 0;
    v36 = 0;
    v56 = &v37;
    v41 = 0;
    v40 = 0;
    v42 = 0;
    v44 = 0;
    v43 = 0;
    v45 = 0;
    v46 = 0;
    v47 = 0;
    v48 = 0;
    v39 = 0;
    v38 = 0;
    v37 = 0;
    v3 = a1;
    v4 = a2;
    v5 = a3;
    v6 = a5;
    v8 = 0;
    v9 = 0;
    v7 = 0;
    v10 = 0;
    v11 = 0;
    v12 = 0;
    v13 = 0;
    v14 = 0;
    v15 = 0;
    v18 = 0;
    v19 = 0;
    v20 = 0;
    v21 = 0;
    v22 = 0;
    v23 = 0;
    v26 = 0;
    v25 = 0;
    v24 = 0;
    *(uint128_t *)((char *)&v17 + 9) = 0;
    v16 = 0;
    *(uint128_t *)&v17 = 0;
    sub_1efb98(a3);
    if (!(a5 >> 7 & 1))
    {
        if (!(a5 >> 8 & 1))
        {
            v0 = &v37;
            while (1)
            {
                v49 = &v50;
                v50 = &v49;
                if (sub_1ecec4(&v3, &v27) & 1)
                    break;
                sub_1ea8d0(&v50, *(unsigned long long *)((void*)&v17 + 8), *(unsigned long long *)((void*)&v17 + 16), v55);
                v57 = sub_a0c8(a4);
                v58 = sub_a0c8(a4);
                v55 = sub_1ebf34(&v7, *(unsigned long long *)((void*)&v17 + 8), v57, v58 + sub_6b08(a4), a5);
                sub_1ea778(&v3);
                v53 = v19;
                v54 = v18;
            }
            goto LABEL_1ed2e0;
        }
        else
        {
            v50 = &v49;
            v49 = &v50;
            if (!(sub_1ecec4(&v3, &v27) & 1))
            {
                sub_1ea8d0(&v50, *(unsigned long long *)((void*)&v17 + 8), *(unsigned long long *)((void*)&v17 + 16), v55);
                v59 = sub_a0c8(a4);
                v60 = sub_a0c8(a4);
                v55 = sub_1ebf34(&v7, *(unsigned long long *)((void*)&v17 + 8), v59, v60 + sub_6b08(a4), a5);
                v53 = v19;
                v54 = v18;
            }
LABEL_1ed364:
            v63 = v54;
            sub_1ea8d0(&v50, v63, v53, v55);
            v55 = v63;
        }
    }
    else
    {
        if (!(a5 >> 8 & 1))
        {
            v0 = &v37;
            while (1)
            {
                v49 = &v50;
                v50 = &v49;
                if (sub_1ecec4(&v3, &v27) & 1)
                    break;
                v61 = sub_a0c8(a4);
                v62 = sub_a0c8(a4);
                v55 = sub_1ebf34(&v7, v55, v61, v62 + sub_6b08(a4), a5);
                sub_1ea778(&v3);
                v53 = v19;
                v54 = v18;
            }
LABEL_1ed2e0:
            v56 = v0;
            if (!(a5 >> 7 & 1))
                goto LABEL_1ed364;
        }
        else
        {
            v50 = &v49;
            v49 = &v50;
            if (!(sub_1ecec4(&v3, &v27) & 1))
            {
                v64 = sub_a0c8(a4);
                v65 = sub_a0c8(a4);
                v55 = sub_1ebf34(&v7, v55, v64, v65 + sub_6b08(a4), a5);
            }
        }
    }
    sub_1eccac(&v25 + 1);
    sub_1eccac(&v24);
    v50 = &v16;
    sub_127c0(&v50);
    sub_1eccac(&v13);
    sub_1eccac(&v11 + 1);
    sub_1eccac(&v10);
    sub_1eccac(&v7);
    sub_1eccac(&v47 + 1);
    sub_1eccac(&v46);
    v3 = v56;
    sub_127c0(&v3);
    sub_1eccac(&v34);
    sub_1eccac(&v32 + 1);
    sub_1eccac(&v31);
    sub_1eccac(&v28);
    return v55;
}
