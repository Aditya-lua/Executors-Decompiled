/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2f8f4..0x2fa10 (284 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_2f8f4_0 {
    char field_0;
} st_2f8f4_0;


long long sub_2f8f4(void* *a0)
{
    void* v6;  // x8
    void* v7;  // x9
    unsigned long long v8;  // x20
    unsigned long v9;  // x21
    unsigned long long v10;  // x0
    unsigned long long i;  // x20
    st_2f8f4_0 **v0;  // [bp-0x70], Other Possible Types: char
    st_2f8f4_0 *v1;  // [bp-0x68]
    char v2;  // [bp-0x60]
    char *v3;  // [bp-0x48], Other Possible Types: unsigned long long
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v1 = &v0;
    v0 = &v1;
    v3 = 0;
    sub_2fc4c(&v2, (long long)(a0[7] - a0[6]) >> 2, &v3);
    v6 = a0[6];
    v7 = a0[7];
    if (v7 != v6)
    {
        v8 = 0;
        do
        {
            v9 = *(int *)((char *)v6 + 4 * v8);
            v10 = sub_2cd98(v9, v8);
            if (!(v10 >> 31 & 1) && !(sub_2b304((unsigned int)v9 & 0xff) & 1))
                *(char *)(v2 + (v10 & 0xffffffff)) = 1;
        } while ((v8 += sub_2d3c0((unsigned int)v9 & 0xff), v6 = a0[6], v7 = a0[7], (long long)(a0[7] - v6) >> 2 > v8));
    }
    if (v7 != v6)
    {
        i = 0;
        do
        {
            i += sub_2d3c0(*((char *)v6 + 4 * i));
            v6 = a0[6];
        } while (i < (long long)(a0[7] - v6) >> 2);
    }
    v3 = &v2;
    return sub_30030(&v3);
}
