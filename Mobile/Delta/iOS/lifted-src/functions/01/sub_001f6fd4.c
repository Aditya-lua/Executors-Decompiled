/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1f6fd4..0x1f7088 (180 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1f6fd4_1 {
    char padding_0[148];
    unsigned int field_94;
    char padding_98[48];
    unsigned long long field_c8;
} st_1f6fd4_1;

typedef struct st_1f6fd4_0 {
    char field_0;
} st_1f6fd4_0;


unsigned int sub_1f6fd4(st_1f6fd4_1 *a0, long long a1)
{
    unsigned int v4;  // x20
    st_1f6fd4_0 **v0;  // [bp-0x40], Other Possible Types: char
    st_1f6fd4_0 *v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (a0->field_c8)
    {
        sub_1f4900(a0);
LABEL_1f7054:
        sub_1efdf4(a0);
        sub_1f36b8(a0);
        v4 = 0;
    }
    else
    {
        sub_1f4900(a0);
        if (a0->field_94 >> 5 & 1)
            goto LABEL_1f7054;
        v4 = 1;
        sub_1fa588(a0, 1, a1);
        sub_1efdf4(a0);
        sub_1f36b8(a0);
        sub_1f51c4(a0);
    }
    sub_1f2534(a0);
    return v4;
}
