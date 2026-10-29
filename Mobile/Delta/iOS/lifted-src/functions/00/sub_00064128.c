/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x64128..0x641cc (164 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_64128_1 {
    unsigned long long field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    char field_17;
} st_64128_1;

typedef struct st_64128_0 {
    char field_0;
} st_64128_0;


st_64128_1 * sub_64128(st_64128_1 *ptr, unsigned long long a1)
{
    long long v4;  // x21
    unsigned long long v5;  // x0
    st_64128_0 **v0;  // [bp-0x40], Other Possible Types: char
    st_64128_0 *v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (sub_1dcb8() >= a1)
    {
        if (22 >= a1)
        {
            memset(ptr, 0, 24);
            *((char *)&ptr->field_10 + 7) = a1;
            return ptr;
        }
        v4 = sub_24d64(a1) + 1;
        v5 = sub_121f8(ptr, v4);
        ptr->field_8 = a1;
        ptr->field_10 = v4 | 0x8000000000000000;
        ptr->field_0 = v5;
        return ptr;
    }
    sub_245d0();
}
