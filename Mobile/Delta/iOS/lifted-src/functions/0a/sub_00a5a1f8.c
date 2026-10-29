/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa5a1f8..0xa5a4c8 (720 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a5a1f8_1 {
    char padding_0[280];
    struct st_a5a1f8_0 *field_118;
    struct st_a5a1f8_0 *field_120;
} st_a5a1f8_1;

typedef struct st_a5a1f8_0 {
    struct st_a5a1f8_0 *field_0;
    struct st_a5a1f8_1 *field_8;
    char padding_10[16];
    struct st_a5a1f8_0 *field_20;
    char padding_28[64];
    struct st_a5a1f8_0 *field_68;
} st_a5a1f8_0;


st_a5a1f8_0 * sub_a5a1f8(st_a5a1f8_0 *a0, long long a1, st_a5a1f8_0 *a2, long long a3)
{
    unsigned long long v11;  // x26
    unsigned long long v12;  // x25
    st_a5a1f8_0 *v21;  // x19
    st_a5a1f8_0 *v22;  // x0
    st_a5a1f8_0 *v23;  // x8
    unsigned long long v13;  // x24
    unsigned long long v14;  // x23
    unsigned long long v15;  // x22
    unsigned long long v16;  // x21
    unsigned long long v17;  // x20
    unsigned long long v18;  // x19
    unsigned long long v19;  // x30
    st_a5a1f8_0 *v20;  // x20
    unsigned long long v0;  // [bp-0x50]
    unsigned long long v1;  // [bp-0x48]
    unsigned long long v2;  // [bp-0x40]
    unsigned long long v3;  // [bp-0x38]
    unsigned long long v4;  // [bp-0x30]
    unsigned long long v5;  // [bp-0x28]
    unsigned long long v6;  // [bp-0x20]
    unsigned long long v7;  // [bp-0x18]
    char *v8;  // [bp-0x10]
    unsigned long long v9;  // [bp-0x8]
    char v10;  // [bp+0x0]

    if (!a0)
        return a0;
    v0 = v11;
    v1 = v12;
    v2 = v13;
    v3 = v14;
    v4 = v15;
    v5 = v16;
    v6 = v17;
    v7 = v18;
    v8 = &v10;
    v9 = v19;
    if (a0->field_20)
    {
        if (!a0->field_8->field_118)
        {
            return 0;
        }
        else if (!a0->field_8->field_120)
        {
            return 0;
        }
    }
    else
    {
        if (!a0->field_68)
            return 0;
    }
    if (a2 && (v20 = a2->field_0, a2->field_0 = 0, v20))
    {
        v21 = 0;
LABEL_a5a29c:
        if (a0->field_20)
            a0->field_8->field_118();
        v22 = sub_c67654(a0, v20, 135);
    }
    else
    {
        v22 = sub_a5d5a8(a1, a0, a3);
        if (v22)
        {
            v21 = v22->field_20;
            v22->field_20 = 0;
            sub_a5d6b0();
            v20 = v21;
            if (v21)
                goto LABEL_a5a29c;
            v22 = 0;
        }
        else
        {
            v20 = 0;
            v21 = 0;
        }
    }
    if (!v22)
        v23 = 0;
    else
        v23 = v20;
    if (a2 && v23)
    {
        v21 = 0;
        a2->field_0 = v23;
    }
    sub_a55830(v21);
    return v22;
}
