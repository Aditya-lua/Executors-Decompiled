/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x650d4..0x6516c (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_650d4_1 {
    char padding_0[8];
    long long field_8;
} st_650d4_1;

typedef struct st_650d4_0 {
    char field_0;
} st_650d4_0;


long long sub_650d4(st_650d4_1 *a0, long long a1, unsigned long a2, char a3)
{
    long long v6;  // x21
    st_650d4_0 **v0;  // [bp-0x50], Other Possible Types: char
    st_650d4_0 *v1;  // [bp-0x48]
    st_650d4_1 *v2;  // [bp-0x40]
    char v3;  // [bp-0x38]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v1 = &v0;
    v2 = a0;
    v0 = &v1;
    v3 = 0;
    if (a3)
    {
        sub_2be1c();
        v6 = a2 - a1;
        sub_6505c(a0->field_8, a1, v6);
        a0->field_8 = a0->field_8 + v6;
    }
    v3 = 1;
    return sub_3115c(&v2);
}
