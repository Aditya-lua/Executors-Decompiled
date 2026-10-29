/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3c4464..0x3c4834 (976 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3c4464_3 {
    char padding_0[24];
    struct st_3c4464_1 *field_18;
} st_3c4464_3;

typedef struct st_3c4464_2 {
    unsigned int field_0;
} st_3c4464_2;

typedef struct st_3c4464_1 {
    char padding_0[480];
    struct st_3c4464_2 *field_1e0;
    unsigned long long field_1e8;
    unsigned int field_1f0;
    unsigned int field_1f4;
} st_3c4464_1;

typedef struct st_3c4464_10 {
    struct st_3c4464_11 *field_0;
} st_3c4464_10;

typedef struct st_3c4464_11 {
    struct st_3c4464_10 *field_0;
} st_3c4464_11;

typedef struct st_3c4464_4 {
    char padding_0[1];
    char field_1;
    char padding_2[6];
    unsigned long long field_8;
    char padding_10[88];
    struct st_3c4464_3 *field_68;
} st_3c4464_4;

typedef struct st_3c4464_0 {
    char field_0;
} st_3c4464_0;

typedef struct st_3c4464_7 {
    struct st_3c4464_4 *field_0;
    unsigned int field_8;
} st_3c4464_7;

typedef struct st_3c4464_5 {
    char padding_0[1408];
    struct st_3c4464_4 *field_580;
} st_3c4464_5;

typedef struct st_3c4464_6 {
    char padding_0[96];
    struct st_3c4464_5 *field_60;
} st_3c4464_6;

extern unsigned long long g_e7d770;
extern st_3c4464_6 *g_f0d198;
extern st_3c4464_3 *g_f0d3d8;

st_3c4464_4 * sub_3c4464(unsigned long a0, long long a1, unsigned int a2)
{
    st_3c4464_4 *v9;  // w23
    st_3c4464_1 *v10;  // x25
    unsigned long long v11;  // 4121
    st_3c4464_7 *v12;  // x8
    char *v13;  // x0
    st_3c4464_4 *i;  // w8
    char *v15;  // x9
    unsigned int v16;  // w10
    unsigned int v17;  // w11
    unsigned int v0;  // [bp-0x94]
    st_3c4464_0 **v1;  // [bp-0x90], Other Possible Types: char
    st_3c4464_0 *v2;  // [bp-0x88]
    st_3c4464_0 **v3;  // [bp-0x80], Other Possible Types: char
    st_3c4464_0 *v4;  // [bp-0x78]
    st_3c4464_11 **v5;  // [bp-0x70]
    st_3c4464_11 **v6;  // [bp-0x68]
    char *v7;  // [bp-0x10]
    char v8;  // [bp+0x0]

    v7 = &v8;
    v2 = &v1;
    v1 = &v2;
    if (!g_f0d198->field_60->field_580)
        return 0;
    v0 = a2;
    v9 = (st_3c4464_4 *)0;
    v10 = g_f0d198->field_60->field_580->field_68->field_18;
    v4 = &v3;
    v3 = &v4;
    do
    {
        v11 = arm64g_calculate_condition(1, *(int *)((char *)v10->field_1e0 + 0x4 * v9), 1, 0);
        if (v11 & 1 || !(v12 = v10->field_1e8 + (v10->field_1f0 & *(int *)((char *)v10->field_1e0 + 0x4 * v9)) * 16, v12->field_8 == 2 && (v13 = sub_a0c8(v12->field_0->field_8), v5 = &v6, v6 = &v5, i = (st_3c4464_4 *)*v13, i)))
            continue;
        v15 = v13 + 1;
        v16 = 3760312;
        v17 = 23;
        do
        {
            v16 = (v16 ^ i) * v17;
            i = (st_3c4464_4 *)*v15;
            v15 += 1;
            v17 += 23;
        } while (i);
        if (v16 == 0x5369fe60)
        {
            if (v12->field_0)
            {
                _strlen(a1);
                g_f0d3d8->field_18();
            }
            break;
        }
    } while ((v9 = &v9->field_1, !(v9 >> ((char)v10->field_1f4 & 31))));
    goto *((void *)(g_e7d770));
}
