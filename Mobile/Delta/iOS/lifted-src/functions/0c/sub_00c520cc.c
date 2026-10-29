/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc520cc..0xc52154 (136 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c520cc_1 {
    struct st_c520cc_0 *field_0;
    unsigned long long field_8;
} st_c520cc_1;

typedef struct st_c520cc_0 {
    unsigned int field_0;
    unsigned short field_4;
    char field_6;
    char field_7;
} st_c520cc_0;


void* sub_c520cc(void* a0, st_c520cc_1 *a1, char a2)
{
    st_c520cc_0 *v0;  // x8
    unsigned long long v1;  // x9
    unsigned long long v2;  // x9
    st_c520cc_0 *v3;  // x10

    if (a2 == 8)
    {
        v0 = a1->field_0;
        v1 = a1->field_8;
        if (a1->field_8 > 7)
        {
            a1->field_0 = &v0[1];
            a1->field_8 = v1 - 8;
            *(unsigned long long *)&a0[8] = v0->field_7 * 0x100000000000000 | (v0->field_0 * 0x100 | (v0->field_4 | v0->field_6 * 0x10000) * 0x10000000000) >> 8;
            *(char *)a0 = 82;
            return a0;
        }
    }
    else
    {
        v0 = a1->field_0;
        v2 = a1->field_8;
        if (a1->field_8 > 3)
        {
            v3 = v0->field_0;
            a1->field_0 = &v0->field_4;
            a1->field_8 = v2 - 4;
            *(st_c520cc_0 **)&a0[8] = v3;
            *(char *)a0 = 82;
            return a0;
        }
    }
    *(unsigned long long *)a0 = 19;
    *(st_c520cc_0 **)&a0[8] = v0;
    return a0;
}
