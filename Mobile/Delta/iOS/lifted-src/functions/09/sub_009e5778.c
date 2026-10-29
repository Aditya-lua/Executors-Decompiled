/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9e5778..0x9e57d0 (88 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9e5778_1 {
    unsigned long long field_0;
} st_9e5778_1;

typedef struct st_9e5778_0 {
    struct st_9e5778_1 *field_0;
    unsigned int field_8;
} st_9e5778_0;


unsigned long long sub_9e5778(st_9e5778_0 *a0, unsigned long long a1)
{
    unsigned int v0;  // w8
    unsigned long long v1;  // w9

    if (a1 >> 31 & 1)
        return 0;
    v0 = (unsigned int)a1 >> 6;
    if ((int)a0->field_8 <= (int)v0)
        return 0;
    v1 = (unsigned int)a1 & 63;
    if (!v1)
    {
        a0->field_8 = v0;
        return 1;
    }
    a0->field_8 = v0 + 1;
    *(unsigned long long *)&a0->field_0[v0] = *(long long *)&a0->field_0[v0] & ~(0xffffffffffffffff << ((char)v1 & 63));
    return 1;
}
