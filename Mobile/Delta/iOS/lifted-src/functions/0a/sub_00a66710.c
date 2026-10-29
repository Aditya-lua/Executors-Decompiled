/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa66710..0xa66794 (132 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a66710_1 {
    struct st_a66710_0 *field_0;
} st_a66710_1;

typedef struct st_a66710_0 {
    struct st_a66710_1 *field_0;
    char field_1;
    char padding_2[6];
    struct st_a66710_0 *field_8;
    char padding_10[40];
    unsigned int field_38;
    char padding_3c[28];
    struct st_a66710_0 *field_58;
} st_a66710_0;


st_a66710_0 * sub_a66710(st_a66710_0 *a0)
{
    unsigned long long v7;  // x22
    unsigned long long v8;  // x21
    st_a66710_0 *v17;  // x0
    unsigned long long v9;  // x20
    unsigned long long v10;  // x19
    unsigned long long v11;  // x30
    st_a66710_0 *v12;  // x8
    st_a66710_0 *v13;  // x0
    st_a66710_0 *v14;  // x21
    st_a66710_0 **v15;  // x9
    st_a66710_0 *v16;  // x0
    unsigned long long v0;  // [bp-0x30]
    unsigned long long v1;  // [bp-0x28]
    unsigned long long v2;  // [bp-0x20]
    unsigned long long v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    if (!a0)
        return a0;
    v0 = v7;
    v1 = v8;
    v2 = v9;
    v3 = v10;
    v4 = &v6;
    v5 = v11;
    v12 = *(int *)&a0->padding_10[32];
    v13 = a0;
    if ((unsigned int)v12)
    {
        v14 = 0;
        do
        {
            v15 = a0->field_0;
            v13 = *(long long *)((char *)a0->field_0 + 0x8 * v14);
            if (v13)
            {
                do
                {
                    v16 = v13;
                    sub_a6c2e4(v16, "crypto/lhash/lhash.c", 108);
                    v13 = *(long long *)&v16->field_1;
                } while (*(long long *)&v16->field_1);
                v15 = a0->field_0;
                v12 = *(int *)&a0->padding_10[32];
            }
        } while ((*(unsigned long long *)((char *)v15 + 0x8 * v14) = 0, v14 = (char *)&v14->field_0 + 1, v12 > v14));
    }
    v17 = v13;
    *(unsigned long long *)&a0->padding_3c[20] = 0;
    return v17;
}
