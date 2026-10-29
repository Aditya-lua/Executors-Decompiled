/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa66664..0xa66710 (172 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a66664_1 {
    struct st_a66664_0 *field_0;
} st_a66664_1;

typedef struct st_a66664_0 {
    struct st_a66664_1 *field_0;
    char field_1;
    char padding_2[6];
    struct st_a66664_0 *field_8;
    char padding_10[40];
    unsigned int field_38;
    char padding_3c[28];
    struct st_a66664_0 *field_58;
} st_a66664_0;


void sub_a66664(st_a66664_0 *a0)
{
    unsigned long long v7;  // x22
    unsigned long long v8;  // x21
    unsigned long long v9;  // x20
    unsigned long long v10;  // x19
    unsigned long long v11;  // x30
    st_a66664_0 *v12;  // x8
    st_a66664_0 *v13;  // x21
    st_a66664_0 **v14;  // x9
    unsigned long v15;  // x0
    unsigned long v16;  // x0
    unsigned long long v0;  // [bp-0x30]
    unsigned long long v1;  // [bp-0x28]
    unsigned long long v2;  // [bp-0x20]
    unsigned long long v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    if (!a0)
        return;
    v0 = v7;
    v1 = v8;
    v2 = v9;
    v3 = v10;
    v4 = &v6;
    v5 = v11;
    v12 = *(int *)&a0->padding_10[32];
    if ((unsigned int)v12)
    {
        v13 = 0;
        do
        {
            v14 = a0->field_0;
            v15 = *(long long *)((char *)a0->field_0 + 0x8 * v13);
            if (*(long long *)((char *)a0->field_0 + 0x8 * v13))
            {
                do
                {
                    v16 = v15;
                    sub_a6c2e4(v16, "crypto/lhash/lhash.c", 108);
                    v15 = *(long long *)(v16 + 8);
                } while (*(long long *)(v16 + 8));
                v14 = a0->field_0;
                v12 = *(int *)&a0->padding_10[32];
            }
        } while ((*(unsigned long long *)((char *)v14 + 0x8 * v13) = 0, v13 = (char *)&v13->field_0 + 1, v12 > v13));
    }
    *(unsigned long long *)&a0->padding_3c[20] = 0;
    sub_a6c2e4(a0->field_0, "crypto/lhash/lhash.c", 92);
    sub_a6c2e4();
    return;
}
