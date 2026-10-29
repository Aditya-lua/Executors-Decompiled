/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xacbbc4..0xacbc00 (60 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_acbbc4_0 {
    uint128_t field_0;
    uint128_t field_10;
    char field_20;
    char padding_21[59];
    int field_5c;
} st_acbbc4_0;


int sub_acbbc4(st_acbbc4_0 *a0)
{
    *(uint128_t *)&a0->field_5c = 0;
    memset(&a0->field_20, 0, 64);
    a0->field_0 = 0xda8a0600172442d74914b2b97380166f;
    a0->field_10 = 0xb0fb0e4ee38dee4d163138aaa96f30bc;
    return 1;
}
