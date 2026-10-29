/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x97cc68..0x97cd98 (304 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_97cc68_2 {
    char padding_0[112];
    struct st_97cc68_1 *field_70;
    struct st_97cc68_1 *field_78;
} st_97cc68_2;

typedef struct st_97cc68_1 {
    char padding_0[128];
    struct st_97cc68_2 *field_80;
    char padding_88[40];
    struct st_97cc68_1 *field_b0;
} st_97cc68_1;

typedef struct st_97cc68_3 {
    char padding_0[120];
    long long field_78;
    char padding_80[224];
    struct st_97cc68_1 *field_160;
} st_97cc68_3;

typedef struct st_97cc68_0 {
    char padding_0[88];
    long long field_58;
} st_97cc68_0;


st_97cc68_1 * sub_97cc68(unsigned long a0, unsigned long a1, unsigned long a2)
{
    st_97cc68_1 *v7;  // x19
    st_97cc68_1 *v8;  // x22
    unsigned long long v9;  // x8
    long long v10;  // x20
    unsigned long v11;  // x8
    st_97cc68_0 *v0;  // [bp-0x68]
    st_97cc68_3 *v1;  // [bp-0x50]
    st_97cc68_1 *v2;  // [bp-0x48]
    st_97cc68_1 *v3;  // [bp-0x40]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    if (!sub_97f48c())
        return 0;
    sub_ad9384(sub_c4ba8(v0->field_58));
    if (v3)
    {
        v7 = v1->field_160;
        v8 = v2;
        if (v8)
            goto LABEL_97cd18;
    }
    else
    {
        sub_963068(v1->field_78, a1 & 0x3df6ffb85);
        sub_962f70(v1->field_78, a2 & 0x3df6ffb85);
        v7 = (v1->field_160 & ~a1 | a2) & 0x3df6ffb87;
        v1->field_160 = v7;
        v8 = v2;
        if (v8)
        {
LABEL_97cd18:
            v9 = v8->field_b0 & ~a1 | a2;
            v8->field_b0 = v9 & 3725568391;
            v10 = __ROL__((unsigned int)v9, 31) & 0x80000001 & 1;
            v11 = v8->field_80;
            if (*(long long *)(v11 + 120))
            {
                sub_986440(*(long long *)(v11 + 120), v10);
                v11 = v8->field_80;
            }
            if (*(long long *)(v11 + 112))
                sub_989124(*(long long *)(v11 + 112), v10);
            if (v3)
                v7 = v2->field_b0;
        }
    }
    sub_ad93b4(sub_c4ba8(v0->field_58));
    return v7;
}
