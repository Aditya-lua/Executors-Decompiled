/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2ac45c..0x2ac4e4 (136 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_2ac45c_0 {
    char field_0;
} st_2ac45c_0;


void* sub_2ac45c(void* *a0, unsigned long long *a1)
{
    void* v4;  // x0
    unsigned long long v5;  // x21
    void* v6;  // x0
    st_2ac45c_0 **v0;  // [bp-0x40], Other Possible Types: char
    st_2ac45c_0 *v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    if (a0[2] > a0[1])
    {
        v4 = a0[1];
        *(unsigned long long *)&v4[8] = 0;
        *(unsigned long long *)v4 = 0;
        v5 = *a1;
        v1 = &v0;
        v0 = &v1;
        sub_2a6e94(v4 + 8, 0);
        *(char *)v4 = 6;
        *(unsigned long long *)&v4[8] = v5;
        v6 = v4 + 16;
    }
    else
    {
        v6 = sub_2a9850(a0);
    }
    a0[1] = v6;
    return v6 - 16;
}
