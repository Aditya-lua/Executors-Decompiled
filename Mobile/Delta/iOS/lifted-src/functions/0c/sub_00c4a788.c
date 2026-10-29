/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc4a788..0xc4a7f8 (112 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c4a788_0 {
    unsigned long long field_0;
    long long *field_8;
    unsigned long long field_10;
} st_c4a788_0;


void sub_c4a788(st_c4a788_0 *a0)
{
    unsigned long long v2;  // x21
    unsigned long long *v3;  // x22
    unsigned long long v4;  // x21
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0->field_10;
    if (a0->field_10)
    {
        v3 = a0->field_8 + 1;
        do
        {
            v4 = v2;
            if (*v3)
                _free(*(long long *)((char *)v3 - 8));
        } while ((v3 += 4, v2 = v4 - 1, v4 != 1));
    }
    if (!a0->field_0)
        return;
    _free();
    return;
}
