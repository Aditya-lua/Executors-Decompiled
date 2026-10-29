/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9e56a0..0x9e5708 (104 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9e56a0_1 {
    unsigned long long field_0;
} st_9e56a0_1;

typedef struct st_9e56a0_0 {
    struct st_9e56a0_1 *field_0;
    unsigned int field_8;
} st_9e56a0_0;


unsigned long long sub_9e56a0(st_9e56a0_0 *a0, unsigned long long a1)
{
    unsigned int v0;  // w9
    unsigned long v1;  // x8
    unsigned long long *v2;  // x11
    unsigned long v3;  // x9
    unsigned long v4;  // x8
    unsigned long v5;  // x9

    if (a1 >> 31 & 1)
        return 0;
    v0 = (unsigned int)a1 >> 6;
    v1 = a0->field_8;
    if ((int)v1 <= (int)v0)
        return 0;
    v2 = a0->field_0;
    v2[v0] = v2[v0] & ~(1 << ((char)a1 & 63));
    v3 = (char *)&v2[v1] - 8;
    while (1)
    {
        v4 = v1;
        v5 = v3 - 8;
        if (*(long long *)v3)
        {
            a0->field_8 = v4;
            return 1;
        }
        v1 = (unsigned int)v4 - 1;
        v3 = v5;
        if (1 >= (int)v4)
        {
            a0->field_8 = 0;
            *(unsigned int *)((char *)&a0[1].field_0 + 4) = 0;
            return 1;
        }
    }
}
