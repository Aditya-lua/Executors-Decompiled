/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xebbc..0xec54 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ebbc_1 {
    char padding_0[216];
    long long field_d8;
    char padding_e0[240];
    unsigned long long field_1d0;
    unsigned long long field_1d8;
} st_ebbc_1;

typedef struct st_ebbc_0 {
    char field_0;
} st_ebbc_0;


long long sub_ebbc(st_ebbc_1 *a0, long long a1, long long a2, long long a3, unsigned long a4)
{
    long long v5;  // x0
    st_ebbc_0 **v0;  // [bp-0x48], Other Possible Types: char
    st_ebbc_0 *v1;  // [bp-0x40]
    char *v2;  // [bp-0x38]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v1 = &v0;
    v0 = &v1;
    v2 = &v4;
    sub_1b464();
    v5 = sub_404c(a0->field_d8, 72);
    return sub_7024(v5, a1, a2, a3, 0xffffffff + 2863311531 * (unsigned int)(a0->field_1d8 - a0->field_1d0 >> 4));
}
