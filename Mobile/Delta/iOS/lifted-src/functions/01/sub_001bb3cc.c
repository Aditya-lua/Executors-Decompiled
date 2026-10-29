/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1bb3cc..0x1bb480 (180 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1bb3cc_0 {
    char field_0;
} st_1bb3cc_0;

extern char g_10002b0;

unsigned long long sub_1bb3cc(int *ptr, long long a1)
{
    unsigned long long dst;  // x0
    long long v7;  // x8
    st_1bb3cc_0 **v0;  // [bp-0x9f8], Other Possible Types: char
    st_1bb3cc_0 *v1;  // [bp-0x9f0]
    char v2;  // [bp-0x9e8]
    unsigned long v3;  // [bp-0x28]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v3 = *(long long *)&g_10002b0;
    v1 = &v0;
    v0 = &v1;
    sub_1af0ec(a1, &v2, &v3);
    dst = _memcpy(ptr, &v2, 2496);
    *(unsigned long long *)&ptr[624] = 0;
    if (*ptr >= 0)
    {
        v7 = 4;
        while (!*(int *)((char *)ptr + v7))
        {
            if (v7 == 2492)
            {
                *ptr = -0x80000000;
                break;
            }
        }
    }
    if (*(long long *)&g_10002b0 == v3)
        return dst;
    ___stack_chk_fail();
}
