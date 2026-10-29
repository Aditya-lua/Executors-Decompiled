/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xafe114..0xafe214 (256 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_afe114_0 {
    struct st_afe114_0 *field_0;
    unsigned int field_8;
    char padding_c[4];
    unsigned long long field_10;
    struct st_afe114_0 *field_18;
} st_afe114_0;


st_afe114_0 * sub_afe114(st_afe114_0 **a0, st_afe114_0 *a1, long long a2)
{
    unsigned long long v10;  // x24
    unsigned long long v11;  // x23
    st_afe114_0 *v20;  // x0
    st_afe114_0 *v21;  // x0
    unsigned long long v12;  // x22
    unsigned long long v13;  // x21
    unsigned long long v14;  // x20
    unsigned long long v15;  // x19
    unsigned long long v16;  // x30
    st_afe114_0 *v17;  // x0
    st_afe114_0 *v18;  // x0
    st_afe114_0 *v19;  // x21
    char v0;  // [bp-0x48]
    unsigned long long v1;  // [bp-0x40]
    unsigned long long v2;  // [bp-0x38]
    unsigned long long v3;  // [bp-0x30]
    unsigned long long v4;  // [bp-0x28]
    unsigned long long v5;  // [bp-0x20]
    unsigned long long v6;  // [bp-0x18]
    char *v7;  // [bp-0x10]
    unsigned long long v8;  // [bp-0x8]
    char v9;  // [bp+0x0]

    if (!a1)
        return 1;
    v1 = v10;
    v2 = v11;
    v3 = v12;
    v4 = v13;
    v5 = v14;
    v6 = v15;
    v7 = &v9;
    v8 = v16;
    if (!a1->field_0)
        return 1;
    v17 = sub_afdf6c(a1, &v0, a0 + 2);
    if (!(unsigned int)v17)
        return v17;
    v18 = sub_a6fbc4(a1, "digest");
    if (v18)
    {
        v19 = v18;
        if (v18->field_8 != 4)
            return 0;
        sub_a36c8c();
        sub_a3f52c(a0[1]);
        v20 = sub_a40ca8(a2, v19->field_10, v0);
        *a0 = v20;
        a0[1] = v20;
        if (!v20)
        {
            v21 = sub_a58d60(v19->field_10);
            if (v21 && (int)v21->field_18 != 1)
            {
                *a0 = v21;
            }
            else if (!*a0)
            {
                sub_a36e70();
                return *a0 != 0;
            }
        }
        sub_a36cd4();
        return *a0 != 0;
    }
    return 1;
}
