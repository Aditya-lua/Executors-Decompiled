/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9e5c0c..0x9e5c70 (100 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9e5c0c_0 {
    unsigned long long *field_0;
    unsigned int field_8;
    char padding_c[4];
    int field_10;
} st_9e5c0c_0;


unsigned long long sub_9e5c0c(st_9e5c0c_0 *a0, unsigned long long a1)
{
    unsigned long v0;  // x9
    unsigned long v1;  // x10
    unsigned long long v2;  // x0
    unsigned long long *v3;  // x8
    unsigned long i;  // x9
    unsigned long v5;  // x9
    unsigned long long *v6;  // x8

    if (a0->field_10)
        return 0;
    v0 = a0->field_8;
    if ((unsigned int)v0)
    {
        v1 = *a0->field_0 ^ a1;
        v2 = (unsigned int)((long long)(v1 - 1 & ~v1) >> 63) & 1;
        if ((int)v0 < 2)
            return (unsigned int)((long long)(v1 - 1 & ~v1) >> 63) & 1;
        v3 = a0->field_0 + 1;
        i = v0 - 1;
        do
        {
            v5 = i;
            v6 = v3 + 1;
            v2 = (unsigned int)((long long)(*v3 - 1 & ~*v3) >> 63) & (unsigned int)v2;
            v3 = v6;
            i = v5 - 1;
        } while (i);
        return v2;
    }
    return 0;
}
