/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x53f4c..0x53fd4 (136 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_53f4c_1 {
    char padding_0[88];
    char field_58;
    char padding_59[39];
    unsigned long long field_80;
    unsigned long long *field_88;
} st_53f4c_1;

typedef struct st_53f4c_0 {
    char padding_0[8];
    unsigned long long field_8;
} st_53f4c_0;


st_53f4c_1 * sub_53f4c(st_53f4c_1 *a0, long long i)
{
    unsigned long long *v2;  // x8
    st_53f4c_0 *v3;  // x22
    st_53f4c_0 *v4;  // x0
    st_53f4c_1 *v5;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0->field_88;
    if ((char *)v2 - a0->field_80 >> 4 <= (unsigned long long)i)
        return a0;
    do
    {
        v3 = (char *)v2 - 16;
        sub_53ee8(&a0->field_58, v3);
        v4 = sub_fb84(&a0->field_58, v3);
        v4->field_8 = *(long long *)((char *)v2 - 8);
        v5 = sub_c84c(&a0->field_80, (char *)a0->field_88 - 16);
        v2 = a0->field_88;
    } while ((unsigned long long)i < (char *)a0->field_88 - a0->field_80 >> 4);
    return v5;
}
