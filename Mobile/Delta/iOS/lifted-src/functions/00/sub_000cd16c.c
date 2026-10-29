/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xcd16c..0xcd318 (428 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_cd16c_1 {
    char padding_0[8];
    struct st_cd16c_2 *field_8;
} st_cd16c_1;

typedef struct st_cd16c_2 {
    unsigned long long field_0;
} st_cd16c_2;

typedef struct st_cd16c_0 {
    char field_0;
} st_cd16c_0;

extern unsigned long long g_e6dac8;

unsigned long long sub_cd16c(st_cd16c_1 *a0, long long a1)
{
    unsigned long long v5;  // x0
    long long ptr;  // x0
    long long v0;  // [bp-0x78]
    st_cd16c_0 **v1;  // [bp-0x70], Other Possible Types: char
    st_cd16c_0 *v2;  // [bp-0x68]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v2 = &v1;
    v1 = &v2;
    if (sub_cd068())
        return 0xffffffffffffffff;
    v5 = sub_cd0c8(a0, a1);
    if (v5 >= 0xffff)
        v5 = 0xffff;
    ptr = _malloc();
    if (ptr)
    {
        v0 = ptr + 1;
        if (v5 <= 4)
        {
            _free(ptr);
            return 0xffffffffffffffff;
        }
        if (0x404 < v5)
            v5 = 0x404;
        if (!sub_cd068())
            a0->field_8();
        goto *((void *)(g_e6dac8));
    }
    return 0xffffffffffffffff;
}
