/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3201c..0x320e0 (196 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3201c_0 {
    char field_0;
} st_3201c_0;

extern unsigned long long g_e63c78;
extern unsigned long long g_e63ca0;

unsigned long long sub_3201c(unsigned long a0, unsigned long long a1, long long a2, unsigned long long a3, long long a4)
{
    long long v4;  // x21
    unsigned long long v5;  // x23
    st_3201c_0 **v0;  // [bp-0x50], Other Possible Types: char
    st_3201c_0 *v1;  // [bp-0x48]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (a1 <= a3)
        return 0xffffffffffffffff;
    v4 = a0 + a3;
    v5 = -a3;
    while (1)
    {
        if (sub_ca18(a2, a4, v4))
        {
            v4 += 1;
            v5 -= 1;
            if (-a1 == v5)
                goto *((void *)(g_e63c78));
        }
        else
        {
            goto *((void *)(g_e63ca0));
        }
    }
}
