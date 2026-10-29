/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x39c60..0x39d04 (164 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_39c60_1 {
    char padding_0[8];
    struct st_39c60_0 *field_8;
    struct st_39c60_0 *field_10;
} st_39c60_1;

typedef struct st_39c60_0 {
    char field_0;
} st_39c60_0;


int sub_39c60(st_39c60_1 *a0, long long a1)
{
    st_39c60_0 **v0;  // [bp-0x30], Other Possible Types: char
    st_39c60_0 *v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (sub_1935c(a1 + 32, "getfenv"))
    {
        *(char *)a0->field_8 = 1;
        if (!sub_1935c(a1 + 32, "setfenv"))
            return 0;
    }
    else if (!sub_1935c(a1 + 32, "setfenv"))
    {
        return 0;
    }
    *(char *)a0->field_10 = 1;
    return 0;
}
