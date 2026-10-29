/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x97fe00..0x97fe5c (92 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_97fe00_0 {
    char padding_0[160];
    long long field_a0;
    char padding_a8[168];
    unsigned short field_150;
} st_97fe00_0;

typedef struct st_97fe00_1 {
    struct st_97fe00_0 *field_0;
    unsigned int field_8;
} st_97fe00_1;


unsigned long long sub_97fe00(st_97fe00_1 *a0)
{
    st_97fe00_0 *v2;  // x19
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0->field_0;
    if (!(v2->field_150 >> 5 & 1) && !sub_977368(v2->field_a0) && sub_97733c(v2->field_a0))
        return sub_979844(v2->field_a0, a0->field_8) != 0;
    return 0xffffffff;
}
