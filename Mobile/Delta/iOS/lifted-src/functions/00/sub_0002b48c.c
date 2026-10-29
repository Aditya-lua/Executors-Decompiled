/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2b48c..0x2b4f8 (108 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_2b48c_0 {
    char padding_0[8];
    char *field_8;
    struct st_2b48c_1 *field_10;
} st_2b48c_0;

typedef struct st_2b48c_1 {
    char padding_0[24];
    unsigned int field_18;
    char field_1c;
} st_2b48c_1;


char * sub_2b48c(st_2b48c_0 *a0, st_2b48c_1 *a1)
{
    char *v2;  // x0
    unsigned int v3;  // w8
    char *v4;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a0->field_10 <= a0->field_8)
    {
        v4 = sub_30c24(a0);
        a0->field_8 = v4;
        return v4 - 32;
    }
    v2 = sub_5c38(a0->field_8);
    v3 = a1->field_18;
    v2[28] = a1->field_1c;
    *(unsigned int *)&v2[24] = v3;
    a0->field_8 = v2 + 32;
    return v2;
}
