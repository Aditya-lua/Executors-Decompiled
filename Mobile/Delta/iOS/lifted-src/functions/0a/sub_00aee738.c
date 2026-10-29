/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaee738..0xaee7d4 (156 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_aee738_0 {
    long long field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    unsigned long long field_18;
} st_aee738_0;

extern st_aee738_0 g_eb93b0;

unsigned long long sub_aee738(long long a0, long long a1)
{
    unsigned long long v2;  // x21
    unsigned long long v3;  // w23
    unsigned long long v4;  // x0
    unsigned long long v5;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = 0;
    v3 = 0;
    while (1)
    {
        if (sub_9c064c(a1, v2))
        {
            if (v3 >= 1)
            {
                v4 = sub_9d4888(a0, ", ");
                if (!(unsigned int)v4)
                    return v4;
            }
            v5 = sub_9d4888(a0, (&g_eb93b0.field_0)[v2]);
            if (!(unsigned int)v5)
                return v5;
            v3 += 1;
        }
        v2 += 1;
        if (v2 == 12)
            return 1;
    }
}
