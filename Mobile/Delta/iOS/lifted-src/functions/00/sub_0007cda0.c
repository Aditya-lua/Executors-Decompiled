/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x7cda0..0x7cdfc (92 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_7cda0_0 {
    unsigned short field_0;
    char field_2;
} st_7cda0_0;


unsigned long long sub_7cda0(st_7cda0_0 *a0, unsigned long long a1, long long a2, unsigned long long n, unsigned int a4)
{
    unsigned int v2;  // w8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (n + 3 <= a1)
    {
        v2 = a4 + (unsigned int)n * 8;
        a0->field_0 = v2;
        a0->field_2 = v2 >> 16;
        _memcpy(a0 + 1, a2, n);
        return n + 3;
    }
    return 0xffffffffffffffba;
}
