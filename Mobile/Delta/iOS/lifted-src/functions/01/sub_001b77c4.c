/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1b77c4..0x1b7824 (96 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1b77c4_2 {
    char padding_0[8];
    unsigned long long field_8;
    unsigned long long field_10;
    char padding_18[28];
    char field_34;
} st_1b77c4_2;

typedef struct st_1b77c4_1 {
    unsigned int field_0;
    char padding_4[76];
    unsigned long long field_50;
} st_1b77c4_1;

typedef struct st_1b77c4_0 {
    char field_0;
} st_1b77c4_0;


void sub_1b77c4(st_1b77c4_2 *a0, unsigned int a1, st_1b77c4_1 *a2)
{
    st_1b77c4_0 **v0;  // [bp-0x20], Other Possible Types: char
    st_1b77c4_0 *v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    a2->field_0 = 0xfffffc1e;
    if (a0->field_34 != a1)
    {
        a2->field_50 = a0->field_8;
        sub_1be72c();
        return;
    }
    a2->field_50 = a0->field_10;
    return;
}
