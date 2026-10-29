/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc494f0..0xc497a0 (688 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c494f0_1 {
    char padding_0[16];
    unsigned long long field_10;
} st_c494f0_1;

typedef struct st_c494f0_0 {
    unsigned int field_0;
    char padding_4[4];
    unsigned long long field_8;
    unsigned long long field_10;
    char padding_18[8];
    unsigned long long field_20;
    unsigned int field_28;
    unsigned int field_2c;
} st_c494f0_0;


double sub_c494f0(void* a0, void* a1)
{
    unsigned int v15;  // w8
    unsigned int v16;  // w9
    unsigned long long v25;  // x30
    unsigned long v26;  // cc_dep1
    unsigned long long v27;  // 4110
    unsigned long long v28;  // 4102
    unsigned long long v29;  // 4110
    unsigned long long v30;  // 4102
    uint128_t v31;  // q0
    void* v32;  // x8
    st_c494f0_0 *v33;  // x9
    unsigned long v34;  // x10
    unsigned long long v17;  // x26
    unsigned long v35;  // x11
    unsigned long long v36;  // x12
    unsigned long long v37;  // x13
    st_c494f0_0 *v38;  // x9
    void* v39;  // x2
    void* v40;  // x8
    st_c494f0_0 *v41;  // x9
    void* v42;  // x1
    unsigned int v43;  // w16
    void* v44;  // x15
    unsigned long long v18;  // x25
    st_c494f0_1 *v45;  // x14
    unsigned int v46;  // x8
    unsigned long long v47;  // x14
    unsigned long v48;  // x10
    unsigned int v49;  // x8
    unsigned int v50;  // x9
    unsigned long long *v51;  // x8
    unsigned int v52;  // x19
    unsigned long long v53;  // x21
    unsigned int v54;  // x20
    unsigned long long v19;  // x24
    unsigned long v55;  // x22
    unsigned long v56;  // x23
    unsigned long v57;  // d0
    unsigned long long v20;  // x23
    unsigned long long v21;  // x22
    unsigned long long v22;  // x21
    unsigned long long v23;  // x20
    unsigned long long v24;  // x19
    uint128_t v0;  // [bp-0x90]
    uint128_t v1;  // [bp-0x80]
    uint128_t v2;  // [bp-0x70]
    uint128_t v3;  // [bp-0x60]
    unsigned long long v4;  // [bp-0x50]
    unsigned long long v5;  // [bp-0x48]
    unsigned long long v6;  // [bp-0x40]
    unsigned long long v7;  // [bp-0x38]
    unsigned long long v8;  // [bp-0x30]
    unsigned long long v9;  // [bp-0x28]
    unsigned long long v10;  // [bp-0x20]
    unsigned long long v11;  // [bp-0x18]
    char *v12;  // [bp-0x10]
    unsigned long long v13;  // [bp-0x8]
    char v14;  // [bp+0x0]

    v15 = *(int *)a1;
    if (2 < v15)
        v16 = v15 - 3;
    else
        v16 = 2;
    if (!v16)
    {
        *(unsigned long long *)a0 = 2;
        return v57;
    }
    v4 = v17;
    v5 = v18;
    v6 = v19;
    v7 = v20;
    v8 = v21;
    v9 = v22;
    v10 = v23;
    v11 = v24;
    v12 = &v14;
    v13 = v25;
    v26 = v16;
    if (v16 == 1)
    {
        v0 = (int128_t)a1[8];
        v1 = (int128_t)a1[24];
        *(unsigned int *)&a1[8] = 2;
        if (v15 <= 2)
        {
            v27 = arm64g_calculate_condition(147, v26, 1, 0);
            v28 = arm64g_calculate_condition(4, (v27 & 1 ? (long long)a1[72] : 0x40000000), 0, 0);
            if (!(v28 & 1))
                goto LABEL_c49550;
        }
        else
        {
            v29 = arm64g_calculate_condition(147, v26, 1, 0);
            v30 = arm64g_calculate_condition(0, (v29 & 1 ? (long long)a1[72] : 0x40000000), 0, 0);
            if (!(v30 & 1))
            {
LABEL_c49550:
                _free((long long)a1[56]);
                a1 = a1;
                a0 = a0;
            }
        }
        *(unsigned int *)a1 = 3;
        *(unsigned long long *)a0 = 0;
        v31 = v0;
        *(uint128_t *)&a0[16] = v31;
        *(uint128_t *)&a0[32] = v1;
        *(unsigned short *)&a0[64] = 2;
    }
    else
    {
        v31 = *(int128_t *)a1;
        v2 = v31;
        v3 = (int128_t)a1[16];
        *(unsigned int *)a1 = 2;
        v32 = (long long)a1[80];
        if ((long long)a1[64] != v32)
        {
            v33 = *(long long *)((char *)v32 - 8);
            *(void* *)&a1[80] = v32 - 8;
            v34 = v33->field_28;
            v35 = v33->field_2c;
            v36 = (unsigned int)v34 != 0;
            v37 = (unsigned int)v35 != 0;
            v38 = v33;
            if (!(v38->field_0 & 1) || (v39 = (long long)a1[32], v38 = v33, (long long)v39[96] == 47))
            {
LABEL_c49638:
                v46 = 0;
                goto LABEL_c4963c;
            }
            if ((long long)v39[456] == 1)
            {
                v40 = v39 + 464;
                v41 = v33;
                v42 = a1;
                v38 = v33;
                if (!*(long long *)v40)
                    goto LABEL_c49604;
                goto LABEL_c49618;
            }
            else
            {
                v41 = v33;
                v42 = a1;
                v40 = sub_c76d30(v39 + 456, (long long)a1[40]);
                v38 = v41;
                if (*(long long *)v40)
                    goto LABEL_c49618;
LABEL_c49604:
                v43 = (char)v40[8];
                v44 = (long long)v40[16];
                if (v43 == 82)
                {
                    v40 = v44;
                    v42 = a1;
                    v38 = v41;
LABEL_c49618:
                    a1 = v42;
                    if ((unsigned long long)(long long)v40[8] <= v33->field_8)
                        goto LABEL_c49638;
                    v45 = *(long long *)v40 + 24 * v33->field_8;
                    v46 = *(long long *)&v45->padding_0[8];
                    v47 = v45->field_10;
                    a1 = v42;
LABEL_c4963c:
                    *(unsigned int *)a1 = v36;
                    *(unsigned int *)&a1[4] = v34;
                    *(unsigned int *)&a1[8] = v37;
                    *(unsigned int *)&a1[12] = v35;
                    *(unsigned long long *)&a1[16] = v46;
                    *(unsigned long long *)&a1[24] = v47;
                    v48 = v38->field_10;
                    v49 = (unsigned int)v38->padding_18;
                    if (v49)
                    {
                        v35 = v38->field_20;
                        v50 = *(short *)((long long)a1[32] + 552);
                        v36 = *(short *)((long long)a1[32] + 554);
                    }
                    else
                    {
                        v50 = 2;
                    }
                    v31 = v2;
                    *(uint128_t *)&a0[16] = v31;
                    *(uint128_t *)&a0[32] = v3;
                    *(unsigned long long *)a0 = 1;
                    *(unsigned long *)&a0[8] = v48;
                    *(unsigned long long *)&a0[48] = v49;
                    *(unsigned long *)&a0[56] = v35;
                    *(unsigned short *)&a0[64] = v50;
                    *(unsigned short *)&a0[66] = v36;
                }
                else
                {
                    *(int *)&a0[9] = (int)v40[9];
                    *(int *)&a0[12] = (int)v40[12];
                    *(char *)&a0[8] = v43;
                    *(void* *)&a0[16] = v44;
                    *(unsigned long long *)a0 = 3;
                }
            }
        }
        else
        {
            v51 = (long long)a1[48];
            v52 = v51[5];
            if (v52)
            {
                v53 = v51[6];
                v54 = *(short *)((long long)a1[32] + 552);
                v55 = *(short *)((long long)a1[32] + 554);
                v56 = v51[4];
                if ((long long)a1[72])
                    goto LABEL_c4968c;
            }
            else
            {
                v54 = 2;
                v56 = v51[4];
                if ((long long)a1[72])
                {
LABEL_c4968c:
                    _free((long long)a1[56]);
                    a1 = a1;
                    a0 = a0;
                }
            }
            *(unsigned int *)a1 = 3;
            v31 = v2;
            *(uint128_t *)&a0[16] = v31;
            *(uint128_t *)&a0[32] = v3;
            *(unsigned long long *)a0 = 1;
            *(unsigned long *)&a0[8] = v56;
            *(unsigned long long *)&a0[48] = v52;
            *(unsigned long long *)&a0[56] = v53;
            *(unsigned short *)&a0[64] = v54;
            *(unsigned short *)&a0[66] = v55;
        }
    }
    return *(unsigned long long *)&v31;
}
