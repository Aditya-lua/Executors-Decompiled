/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbc548..0xbc5c4 (124 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_bc548_0 {
    char padding_0[8];
    struct st_bc548_1 *field_8;
    char padding_10[32];
    unsigned int field_30;
    char padding_34[68];
    struct st_bc548_1 *field_78;
} st_bc548_0;

typedef struct st_bc548_1 {
    unsigned int field_0;
} st_bc548_1;

typedef struct st_bc548_2 {
    char field_0;
} st_bc548_2;


int sub_bc548(st_bc548_0 *a0, unsigned int *a1, unsigned int *a2)
{
    unsigned int *v2;  // x9
    unsigned long i;  // x12
    unsigned int v4;  // w11
    unsigned int v5;  // w13
    char v6;  // x14
    st_bc548_2 **v0;  // [bp-0x10], Other Possible Types: char
    st_bc548_2 *v1;  // [bp-0x8]

    v1 = &v0;
    v0 = &v1;
    v2 = a0->field_78;
    i = *a1;
    v4 = a2 - a0->field_8;
    v5 = *a2;
    v6 = 32 - a0->field_30;
    if (v4 > (unsigned int)i)
    {
        do
        {
            v2[0x35a7bd00 * *(int *)((char *)a0->field_8 + i) >> (v6 & 31)] = i;
            i += 1;
        } while (i < v4);
    }
    *a1 = v4;
    return v2[0x35a7bd00 * v5 >> (v6 & 31)];
}
