/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb57cd4..0xb57d38 (100 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b57cd4_0 {
    char padding_0[88];
    unsigned long long field_58;
} st_b57cd4_0;


int sub_b57cd4(st_b57cd4_0 *a0, unsigned long a1, unsigned long a2, unsigned long long a3)
{
    unsigned long long v2;  // x22
    unsigned long long i;  // x24
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0->field_58;
    if (a3 < v2)
        return 1;
    i = 0;
    do
    {
        sub_a66074(a2 + i, a1 + i, a0 + 2);
        i += v2;
    } while (i <= a3 - v2);
    return 1;
}
