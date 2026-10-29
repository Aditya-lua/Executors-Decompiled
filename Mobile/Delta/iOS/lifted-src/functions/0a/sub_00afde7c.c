/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xafde7c..0xafdf6c (240 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_afde7c_0 {
    struct st_afde7c_0 *field_0;
    unsigned int field_8;
    char padding_c[4];
    unsigned long long field_10;
    struct st_afde7c_0 *field_18;
} st_afde7c_0;


st_afde7c_0 * sub_afde7c(st_afde7c_0 **a0, st_afde7c_0 *a1, long long a2)
{
    unsigned long long v8;  // x22
    unsigned long long v9;  // x21
    st_afde7c_0 *v18;  // x0
    unsigned long long v10;  // x20
    unsigned long long v11;  // x19
    unsigned long long v12;  // x30
    st_afde7c_0 *v13;  // x0
    st_afde7c_0 *v14;  // x0
    st_afde7c_0 *v15;  // x21
    st_afde7c_0 *v17;  // x0
    char v0;  // [bp-0x38]
    unsigned long long v1;  // [bp-0x30]
    unsigned long long v2;  // [bp-0x28]
    unsigned long long v3;  // [bp-0x20]
    unsigned long long v4;  // [bp-0x18]
    char *v5;  // [bp-0x10]
    unsigned long long v6;  // [bp-0x8]
    char v7;  // [bp+0x0]

    if (!a1)
        return 1;
    v1 = v8;
    v2 = v9;
    v3 = v10;
    v4 = v11;
    v5 = &v7;
    v6 = v12;
    if (!a1->field_0)
        return 1;
    v13 = sub_afdf6c(a1, &v0, a0 + 2);
    if (!(unsigned int)v13)
        return v13;
    v14 = sub_a6fbc4(a1, "cipher");
    if (v14)
    {
        v15 = v14;
        if (v14->field_8 != 4)
            return 0;
        sub_a36c8c(sub_a4bbe4(a0[1]));
        v17 = sub_a4e104(a2, v15->field_10, v0);
        *a0 = v17;
        a0[1] = v17;
        if (!v17)
        {
            v18 = sub_a58c5c(v15->field_10);
            if (v18 && (int)v18->field_18 != 1)
            {
                *a0 = v18;
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
