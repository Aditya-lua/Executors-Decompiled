/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa995dc..0xa99624 (72 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a995dc_1 {
    char padding_0[8];
    struct st_a995dc_0 *field_8;
} st_a995dc_1;

typedef struct st_a995dc_0 {
    char padding_0[16];
    unsigned int field_10;
} st_a995dc_0;


void sub_a995dc(st_a995dc_1 *a0)
{
    st_a995dc_0 *v2;  // x8
    unsigned int v3;  // w9
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v2 = a0->field_8;
    v3 = v2->field_10;
    v2->field_10 = v3 - 1;
    if (v3 == 1)
    {
        v0 = &v1;
        sub_9c3580(v2);
    }
}
