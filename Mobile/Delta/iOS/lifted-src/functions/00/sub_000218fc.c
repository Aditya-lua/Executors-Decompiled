/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x218fc..0x21970 (116 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_218fc_0 {
    char field_0;
} st_218fc_0;


unsigned long long sub_218fc(unsigned long long *a0, unsigned long long a1)
{
    unsigned long long v5;  // x30
    unsigned long long v6;  // x9
    unsigned long long v7;  // x10
    st_218fc_0 **v0;  // [bp-0x20], Other Possible Types: char
    st_218fc_0 *v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    v2 = &v4;
    v3 = v5;
    v1 = &v0;
    v0 = &v1;
    if (230584300921369395 >= a1)
    {
        v6 = 14757395258967641293 * ((long long)(a0[2] - *a0) >> 4);
        v7 = v6 * 2;
        if (a1 < v7)
            a1 = v7;
        if (v6 >= 115292150460684697)
            return 230584300921369395;
        return a1;
    }
    sub_ca34();
}
