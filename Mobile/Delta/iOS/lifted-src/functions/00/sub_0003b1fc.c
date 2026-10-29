/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3b1fc..0x3b2f4 (248 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3b1fc_1 {
    char padding_0[1532];
    unsigned int field_5fc;
} st_3b1fc_1;

typedef struct st_3b1fc_0 {
    char field_0;
} st_3b1fc_0;


unsigned long long sub_3b1fc(st_3b1fc_1 *a0, unsigned int a1, unsigned long a2, long long a3, unsigned long a4)
{
    unsigned long long v6;  // x0
    st_3b1fc_0 **v0;  // [bp-0x60], Other Possible Types: char
    st_3b1fc_0 *v1;  // [bp-0x58]
    st_3b1fc_1 *v2;  // [bp-0x50]
    unsigned int v3;  // [bp-0x48]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v1 = &v0;
    v0 = &v1;
    if (0xff < sub_45e80())
    {
        v2 = a0;
        v3 = a0->field_5fc;
        sub_385b8(a0, a3, &v2);
        v6 = sub_2ad10();
        v2->field_5fc = v3;
        return v6;
    }
    return sub_2ad10();
}
