/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa46f74..0xa46fec (120 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a46f74_2 {
    char padding_0[120];
    struct st_a46f74_0 *field_78;
} st_a46f74_2;

typedef struct st_a46f74_1 {
    unsigned int field_0;
    unsigned int field_4;
    unsigned int field_8;
    unsigned int field_c;
    unsigned int field_10;
    unsigned int field_14;
    unsigned int field_18;
    unsigned int field_1c;
} st_a46f74_1;

typedef struct st_a46f74_0 {
    unsigned int field_0;
    unsigned int field_4;
    unsigned int field_8;
    unsigned int field_c;
    unsigned int field_10;
    unsigned int field_14;
    unsigned int field_18;
    unsigned int field_1c;
    unsigned int field_20;
    unsigned int field_24;
    unsigned int field_28;
    unsigned int field_2c;
    char padding_30[64];
    struct st_a46f74_1 *field_70;
} st_a46f74_0;


int sub_a46f74(st_a46f74_2 *a0, unsigned int *a1, unsigned int *a2)
{
    st_a46f74_0 *v0;  // x8

    v0 = a0->field_78;
    if (a1)
    {
        v0->field_0 = *a1;
        v0->field_4 = a1[1];
        v0->field_8 = a1[2];
        v0->field_c = a1[3];
        v0->field_10 = a1[4];
        v0->field_14 = a1[5];
        v0->field_18 = a1[6];
        v0->field_1c = a1[7];
    }
    if (a2)
    {
        v0->field_20 = *a2;
        v0->field_24 = a2[1];
        v0->field_28 = a2[2];
        v0->field_2c = a2[3];
    }
    *(unsigned int *)&v0->field_70 = 0;
    return 1;
}
