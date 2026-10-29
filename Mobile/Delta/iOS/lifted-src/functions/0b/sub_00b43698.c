/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb43698..0xb43760 (200 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b43698_0 {
    char padding_0[8];
    long long field_8;
} st_b43698_0;


unsigned long long sub_b43698(st_b43698_0 *a0, unsigned long long a1, long long a2, long long a3)
{
    long long v2;  // x0
    long long v3;  // x0
    unsigned long long v4;  // x20
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (sub_a2f9e0() && sub_b43894(a0, a3) && a1)
    {
        v2 = sub_954340(a0 + 1);
        v3 = sub_c4ba8(a0 + 1);
        v4 = sub_9f21e0(a0->field_8, a1, a2, v2, v3, 0);
        sub_afdddc(a0 + 1);
        return v4;
    }
    return 0;
}
