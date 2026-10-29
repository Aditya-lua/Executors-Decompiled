/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x989cac..0x989ce8 (60 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_989cac_0 {
    char padding_0[8];
    struct st_989cac_0 *field_8;
} st_989cac_0;

typedef struct st_989cac_2 {
    char padding_0[16];
    struct st_989cac_0 *field_10;
    struct st_989cac_0 *field_18;
    char padding_20[224];
    unsigned long long field_100;
} st_989cac_2;

typedef struct st_989cac_1 {
    unsigned long long field_0;
    char padding_8[16];
    struct st_989cac_0 *field_18;
    struct st_989cac_0 *field_20;
} st_989cac_1;


st_989cac_1 * sub_989cac(st_989cac_1 *a0, st_989cac_2 *a1)
{
    st_989cac_0 *v0;  // x9
    st_989cac_0 *v1;  // x8
    st_989cac_0 *v2;  // x1
    unsigned long long v3;  // x8

    v0 = a0->field_18;
    v1 = &a0->field_18;
    a1->field_10 = v0;
    v2 = &a1->field_10;
    v0->field_8 = v2;
    *(st_989cac_0 **)v1->padding_0 = v2;
    v2->field_8 = v1;
    v3 = 80;
    if (!(v2[15].padding_0 & 2))
        v3 = 72;
    *(long long *)((char *)a0 + v3) = *(long long *)((char *)a0 + v3) + 1;
    return a0;
}
