/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x980b2c..0x980be0 (180 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_980b2c_0 {
    char padding_0[16];
    unsigned long long field_10;
} st_980b2c_0;

typedef struct st_980b2c_1 {
    char padding_0[24];
    long long field_18;
} st_980b2c_1;

extern char g_10002b0;

void* sub_980b2c(st_980b2c_1 *a0, void* a1, void* a2, void* a3)
{
    void* v5;  // x0
    uint168_t v0;  // [bp-0x60]
    st_980b2c_0 *v1;  // [bp-0x40]
    unsigned long v2;  // [bp-0x28]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v2 = *(long long *)&g_10002b0;
    if (!a1 || (*(int128_t *)&v0 = *(int128_t *)a1, *(long long *)((char *)&v0 + 13) = (long long)a1[13], v1 = &a0->padding_0[8], *(char *)&v0 >= 21))
    {
        v5 = 0;
    }
    else
    {
        v5 = sub_a66b6c(a0->field_18, &v0);
        if (v5)
        {
            if (a2)
                *(long long *)a2 = (long long)v5[24];
            if (a3)
                *(long long *)a3 = *(long long *)((long long)v5[40] + 16);
            v5 = 1;
        }
    }
    if (*(long long *)&g_10002b0 == v2)
        return v5;
    ___stack_chk_fail();
}
