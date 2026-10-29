/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1ed704..0x1ed820 (284 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1ed704_1 {
    char padding_0[40];
    char *field_28;
    char padding_30[88];
    char *field_88;
    char padding_90[16];
    unsigned long long field_a0;
    unsigned long long field_a8;
} st_1ed704_1;

typedef struct st_1ed704_3 {
    unsigned long long field_0;
    char padding_8[2040];
    unsigned long long field_800;
} st_1ed704_3;

typedef struct st_1ed704_2 {
    unsigned int *field_0;
    unsigned long long field_8;
    char padding_10[8];
    struct st_1ed704_3 *field_18;
} st_1ed704_2;

typedef struct st_1ed704_0 {
    char field_0;
} st_1ed704_0;


int sub_1ed704(st_1ed704_2 *a0, st_1ed704_1 *a1)
{
    char *v5;  // x22
    unsigned long v6;  // x8
    char *v7;  // x26
    unsigned long v8;  // x21
    unsigned int *v9;  // x27
    char *v10;  // x28
    char *i;  // x28
    unsigned int v12;  // w0
    unsigned long v0;  // [bp-0x78]
    st_1ed704_0 **v1;  // [bp-0x70], Other Possible Types: char
    st_1ed704_0 *v2;  // [bp-0x68]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v2 = &v1;
    v1 = &v2;
    v5 = a1->field_88;
    v6 = a0->field_18->field_800;
    v0 = a1->field_a8;
    if (a1->field_a8 - v5 <= a0->field_18->field_800)
        return 0;
    v7 = v5;
    do
    {
        v7 = &v7[v6];
        v8 = *v7;
        if (*a0->field_0 == (unsigned int)v8 || sub_1f9f2c(v8) == *a0->field_0)
        {
            v9 = a0->field_0 + 1;
            v10 = v7 - 1;
            do
            {
                i = v10;
                v12 = sub_1f9f2c(*i);
                if (*v9 != v12)
                    break;
                v9 += 1;
                if (v9 == &a0->field_0[a0->field_8])
                {
                    a1->field_28 = i;
                    a1->field_a0 = v7 + 1;
                    return 1;
                }
                v10 = i - 1;
            } while (i != v5);
        }
    } while ((v6 = (&a0->field_18->field_0)[v8 & 0xff], v0 - v7 > (&a0->field_18->field_0)[v8 & 0xff]));
    return 0;
}
