/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xab1bb8..0xab1c50 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ab1bb8_0 {
    char padding_0[136];
    long long field_88;
} st_ab1bb8_0;


unsigned long long * sub_ab1bb8(st_ab1bb8_0 *a0, unsigned long long *a1, unsigned long long *a2)
{
    unsigned long long *v2;  // w0
    unsigned long long *i;  // x22
    unsigned long long *v4;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = (unsigned long long *)(unsigned int)sub_ad69e4(a0->field_88);
    if (v2 < 1)
        return 0;
    if (!a1 && !a2)
        return 1;
    i = 0;
    do
    {
        v4 = sub_ad69f8(a0->field_88, i);
        if (a1)
            *(unsigned long long *)((char *)a1 + 0x8 * i) = v4[1];
        if (a2)
            *(unsigned long long *)((char *)a2 + 0x8 * i) = v4[2];
        i = (char *)i + 1;
    } while (v2 != i);
    return 1;
}
