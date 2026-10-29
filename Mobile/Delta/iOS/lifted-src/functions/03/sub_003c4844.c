/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3c4844..0x3c4a78 (564 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3c4844_0 {
    char padding_0[8];
    unsigned long long field_8;
} st_3c4844_0;

typedef struct st_3c4844_4 {
    char padding_0[24];
    struct st_3c4844_2 *field_18;
} st_3c4844_4;

typedef struct st_3c4844_3 {
    unsigned int field_0;
} st_3c4844_3;

typedef struct st_3c4844_2 {
    char padding_0[480];
    struct st_3c4844_3 *field_1e0;
    unsigned long long field_1e8;
    unsigned int field_1f0;
    unsigned int field_1f4;
} st_3c4844_2;

typedef struct st_3c4844_8 {
    struct st_3c4844_9 *field_0;
} st_3c4844_8;

typedef struct st_3c4844_9 {
    struct st_3c4844_8 *field_0;
} st_3c4844_9;

typedef struct st_3c4844_5 {
    char field_0;
} st_3c4844_5;

typedef struct st_3c4844_1 {
    struct st_3c4844_0 *field_0;
    unsigned int field_8;
} st_3c4844_1;

extern st_3c4844_4 *g_f0d3d8;

char * sub_3c4844(char *a0, st_3c4844_4 *a1, long long a2)
{
    st_3c4844_0 *v6;  // w23
    st_3c4844_2 *v7;  // x24
    unsigned long long v8;  // 4121
    st_3c4844_1 *v9;  // x8
    st_3c4844_0 *i;  // w8
    char *v11;  // x9
    unsigned int v12;  // w10
    unsigned int v13;  // w11
    st_3c4844_5 **v0;  // [bp-0x80], Other Possible Types: char
    st_3c4844_5 *v1;  // [bp-0x78]
    st_3c4844_9 **v2;  // [bp-0x70]
    st_3c4844_9 **v3;  // [bp-0x68]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v6 = (st_3c4844_0 *)0;
    v7 = a1->field_18;
    v1 = &v0;
    v0 = &v1;
    while (1)
    {
        v8 = arm64g_calculate_condition(1, *(int *)((char *)v7->field_1e0 + 0x4 * v6), 1, 0);
        if (!(v8 & 1) && !(v9 = v7->field_1e8 + (v7->field_1f0 & *(int *)((char *)v7->field_1e0 + 0x4 * v6)) * 16, v9->field_8 != 2 || !(a0 = sub_a0c8(v9->field_0->field_8), v2 = &v3, v3 = &v2, i = (st_3c4844_0 *)*a0, i)))
        {
            v11 = a0 + 1;
            v12 = 3760312;
            v13 = 23;
            do
            {
                v12 = (v12 ^ i) * v13;
                i = (st_3c4844_0 *)*v11;
                v11 += 1;
                v13 += 23;
            } while (i);
            if (v12 == 928368784)
                break;
        }
        v6 = &v6->padding_0[1];
        if (v6 >> ((char)v7->field_1f4 & 31))
            return a0;
    }
    if (!v9->field_0)
        return a0;
    sub_a0c8(a2);
    sub_6b08(a2);
    g_f0d3d8->field_18();
}
