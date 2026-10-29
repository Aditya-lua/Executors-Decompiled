/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x53b8c..0x53c18 (140 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_53b8c_0 {
    char field_0;
} st_53b8c_0;


void* sub_53b8c(void* a0, unsigned long a1)
{
    void* v6;  // x0
    st_53b8c_0 **v0;  // [bp-0x40], Other Possible Types: char
    st_53b8c_0 *v1;  // [bp-0x38]
    st_53b8c_0 **v2;  // [bp-0x30], Other Possible Types: char
    st_53b8c_0 *v3;  // [bp-0x28]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v1 = &v0;
    v0 = &v1;
    if (!(long long)a0[16])
        return a0;
    if ((unsigned long long)(long long)a0[8] > a1)
    {
        v3 = &v2;
        v2 = &v3;
        sub_c044(*(long long *)a0);
        v6 = operatordelete(*(long long *)a0);
        *(unsigned long long *)a0 = 0;
        *(unsigned long long *)&a0[8] = 0;
    }
    else
    {
        sub_c044(*(long long *)a0);
        v6 = sub_1a030(*(long long *)a0, (long long)a0[8], a0 + 24);
    }
    *(unsigned long long *)&a0[16] = 0;
    return v6;
}
