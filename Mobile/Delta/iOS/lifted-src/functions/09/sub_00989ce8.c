/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x989ce8..0x989d40 (88 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_989ce8_0 {
    char padding_0[8];
    struct st_989ce8_1 *field_8;
} st_989ce8_0;

typedef struct st_989ce8_1 {
    struct st_989ce8_0 *field_0;
} st_989ce8_1;


unsigned long long sub_989ce8(unsigned long long *a0, void* a1)
{
    st_989ce8_0 *v0;  // x9
    st_989ce8_0 **v1;  // x8
    unsigned long long v2;  // x8
    unsigned long long v3;  // x8

    v0 = (long long)a1[16];
    v1 = (long long)a1[24];
    v0->field_8 = v1;
    *v1 = v0;
    *(unsigned long long *)&a1[16] = 0;
    *(unsigned long long *)&a1[24] = 0;
    v2 = 80;
    if (!((long long)a1[0x100] & 2))
        v2 = 72;
    *(long long *)((char *)a0 + v2) = *(long long *)((char *)a0 + v2) - 1;
    v3 = 128;
    if (!((char)a1[0x100] & 2))
        v3 = 120;
    if (!*(long long *)((char *)a0 + v3))
        return 0;
}
