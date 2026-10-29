/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xab1b24..0xab1b90 (108 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ab1b24_0 {
    char padding_0[136];
    long long field_88;
} st_ab1b24_0;


int sub_ab1b24(st_ab1b24_0 *a0, unsigned long long *a1)
{
    unsigned int v2;  // w0
    unsigned long idx;  // x21
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_ad69e4(a0->field_88);
    if ((int)v2 < 1)
        return 0;
    idx = 0;
    do
    {
        a1[idx] = *(long long *)sub_ad69f8(a0->field_88, idx);
        idx += 1;
    } while (v2 != idx);
    return 1;
}
