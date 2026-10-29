/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb72668..0xb726d4 (108 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b72668_0 {
    unsigned long long field_0;
    long long *field_8;
    unsigned long long field_10;
} st_b72668_0;


void sub_b72668(st_b72668_0 *a0)
{
    unsigned long long i;  // x21
    unsigned long long *v3;  // x22
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    i = a0->field_10;
    for (v3 = a0->field_8 + 1; i; i -= 1)
    {
        if (*(long long *)((char *)v3 - 8))
            _free(*v3);
        v3 += 3;
    }
    if (!a0->field_0)
        return;
    _free();
    return;
}
