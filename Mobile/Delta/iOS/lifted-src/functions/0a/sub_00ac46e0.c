/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xac46e0..0xac4a0c (812 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ac46e0_2 {
    char padding_0[160];
    struct st_ac46e0_3 *field_a0;
    struct st_ac46e0_0 *field_a8;
    struct st_ac46e0_4 *field_b0;
} st_ac46e0_2;

typedef struct st_ac46e0_4 {
    char padding_0[24];
    unsigned long long field_18;
    unsigned long long field_20;
} st_ac46e0_4;

typedef struct st_ac46e0_3 {
    char padding_0[32];
    unsigned int field_20;
    unsigned int field_24;
} st_ac46e0_3;

typedef struct st_ac46e0_1 {
    unsigned long long field_0;
} st_ac46e0_1;

typedef struct st_ac46e0_0 {
    char padding_0[48];
    struct st_ac46e0_1 *field_30;
    char padding_38[8];
    unsigned long long field_40;
    char padding_48[8];
    struct st_ac46e0_1 *field_50;
} st_ac46e0_0;

extern char g_10002b0;

unsigned int sub_ac46e0(st_ac46e0_2 **a0, unsigned long a1, char *a2, unsigned long long a3, unsigned long a4, unsigned long long a5, unsigned long long a6)
{
    char *v20;  // x26
    st_ac46e0_2 *v21;  // x8
    char *v30;  // x26
    st_ac46e0_0 *v22;  // x20
    unsigned long v23;  // x22
    unsigned int v24;  // x21
    unsigned long long *v25;  // x23
    unsigned int v26;  // w8
    unsigned int v27;  // x9
    unsigned int v28;  // x10
    unsigned int *iter;  // x12
    unsigned long long *v0;  // [bp-0x630]
    st_ac46e0_0 *v1;  // [bp-0x628]
    unsigned long long v2;  // [bp-0x620]
    unsigned long long v3;  // [bp-0x618]
    unsigned int v4;  // [bp-0x610]
    unsigned int v5;  // [bp-0x60c]
    unsigned int v6;  // [bp-0x608]
    unsigned long v7;  // [bp-0x600]
    unsigned long v8;  // [bp-0x5f0]
    unsigned long long *v9;  // [bp-0x5e8]
    unsigned long v10;  // [bp-0x5e0]
    st_ac46e0_2 **v11;  // [bp-0x5d8]
    unsigned long long v12;  // [bp-0x5d0]
    char v13;  // [bp-0x5c8]
    unsigned int v14;  // [bp-0x588]
    char v15;  // [bp-0x55c]
    unsigned int v16;  // [bp-0xfc]
    unsigned long v17;  // [bp-0x70]
    char *v18;  // [bp-0x10]
    char v19;  // [bp+0x0]

    v18 = &v19;
    v12 = a3;
    v20 = a2;
    v17 = *(long long *)&g_10002b0;
    v21 = *a0;
    v22 = v21->field_a8;
    v23 = v21->field_a0->field_20;
    v24 = v21->field_a0->field_24;
    v14 = 0;
    v10 = v22->field_40;
    v11 = a0;
    v25 = v21->field_b0;
    v7 = v25[3];
    v8 = v25[4];
    v9 = v22->field_30;
    if (sub_c68800(&v13, &v15, 1120, 0))
    {
        if (v24)
        {
            v26 = 0;
            v27 = 0;
            v28 = 0;
            v4 = 1 << ((char)v23 & 31);
            iter = &v16;
            while (1)
            {
                if (v27 < (unsigned int)v23)
                {
                    v30 = v20 + 1;
                    v26 = *v20 | v26 * 0x100;
                    v27 += 8;
                    v20 = v30;
                }
                else
                {
                    v27 -= v23;
                    *iter = v26 >> ((char)v27 & 31) & ~(0xffffffff << ((char)v23 & 31));
                    iter += 1;
                    v28 += 1;
                    if (v28 == v24)
                        break;
                }
            }
            if (v24)
            {
                v2 = a5;
                v3 = a6;
                v0 = v25;
                v1 = v22;
                v6 = 0;
                v5 = 0;
                v9();
            }
        }
        if (sub_c68eb8(&v13, &v14))
            v22->field_50();
        sub_a66ec0();
    }
    if (*(long long *)&g_10002b0 == v17)
        return 0;
    ___stack_chk_fail();
}
