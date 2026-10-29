/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x804fc..0x80564 (104 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_804fc_0 {
    char field_0;
} st_804fc_0;


long long sub_804fc(unsigned long a0, unsigned int *a1, unsigned int a2)
{
    st_804fc_0 **v0;  // [bp-0x40], Other Possible Types: char
    st_804fc_0 *v1;  // [bp-0x38]
    unsigned int *v2;  // [bp-0x30]
    long long idx;  // [bp-0x28]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v1 = &v0;
    v2 = a1;
    v0 = &v1;
    idx = 0;
    if (a2 < 5)
        return 0;
    sub_7f8e4(&v2, 0, a2);
    v2[idx] = a2;
    return idx;
}
