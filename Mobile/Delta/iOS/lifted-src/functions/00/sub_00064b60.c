/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x64b60..0x64c0c (172 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_64b60_0 {
    struct st_64b60_0 *field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    char field_17;
} st_64b60_0;

typedef struct st_64b60_1 {
    char field_0;
} st_64b60_1;


char * sub_64b60(st_64b60_0 *a0, long long a1, long long a2, unsigned long long a3)
{
    st_64b60_0 *v4;  // x21
    long long v5;  // x23
    st_64b60_0 *v6;  // x0
    char *v7;  // x0
    st_64b60_1 **v0;  // [bp-0x50], Other Possible Types: char
    st_64b60_1 *v1;  // [bp-0x48]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v4 = a0;
    v1 = &v0;
    v0 = &v1;
    if (sub_1dcb8() >= a3)
    {
        if (22 >= a3)
        {
            *((char *)&v4->field_10 + 7) = a3;
        }
        else
        {
            v5 = sub_24d64(a3) + 1;
            v6 = sub_121f8(v4, v5);
            v4->field_8 = a3;
            v4->field_10 = v5 | 0x8000000000000000;
            v4->field_0 = v6;
            v4 = v6;
        }
        v7 = sub_64d80(a1, a2, v4);
        *v7 = 0;
        return v7;
    }
    sub_245d0();
}
