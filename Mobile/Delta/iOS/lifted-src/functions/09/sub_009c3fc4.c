/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9c3fc4..0x9c4058 (148 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9c3fc4_0 {
    unsigned int field_0;
    unsigned int field_4;
    long long field_8;
} st_9c3fc4_0;

extern char g_d2c110;

unsigned long long sub_9c3fc4(unsigned long a0, st_9c3fc4_0 *a1)
{
    unsigned long v6;  // x8
    unsigned long long v7;  // x0
    char *v0;  // [bp-0x40]
    char v1;  // [bp-0x38], Other Possible Types: unsigned long long
    unsigned long long v2;  // [bp-0x30]
    unsigned long long v3;  // [bp-0x28]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v0 = &v1;
    if (a1)
    {
        v6 = a1->field_4;
        if (30 >= (unsigned int)v6 && !(0x2a23efff >> ((char)v6 & 63) & 1))
        {
            v1 = 0;
            v2 = 0;
            v3 = 0;
            v7 = sub_9c214c(&v0, a1->field_8, a1->field_0, (&g_d2c110)[v6] | 0x1000, 0x2000);
            if (v7 >> 31 & 1)
                return v7;
            *(unsigned long long *)a0 = v2;
            return v1;
        }
    }
    return 0xffffffff;
}
