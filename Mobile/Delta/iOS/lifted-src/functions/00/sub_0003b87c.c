/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3b87c..0x3b8e8 (108 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3b87c_0 {
    char field_0;
} st_3b87c_0;


long long sub_3b87c(unsigned int *a0, long long a1, unsigned long long a2)
{
    unsigned long long v7;  // x30
    unsigned int v8;  // w8
    unsigned int v9;  // w9
    unsigned long long v0;  // [bp-0x30]
    unsigned long long v1;  // [bp-0x28]
    st_3b87c_0 **v2;  // [bp-0x20], Other Possible Types: char
    st_3b87c_0 *v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    v4 = &v6;
    v5 = v7;
    v3 = &v2;
    v2 = &v3;
    v8 = a0[383];
    v9 = v8 + (unsigned int)a2;
    if (0x100 > v9)
    {
        a0[383] = v9;
        if (v9 < a0[384])
            v9 = a0[384];
        a0[384] = v9;
        return v8 & 0xff;
    }
    v0 = a2;
    v1 = 0xff;
    sub_45808(a1 + 12, "Out of registers when trying to allocate %d registers: exceeded limit %d");
}
