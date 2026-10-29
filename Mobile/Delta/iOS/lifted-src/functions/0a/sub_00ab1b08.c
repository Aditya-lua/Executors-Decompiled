/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xab1b08..0xab1b24 (28 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ab1b08_0 {
    char padding_0[136];
    long long field_88;
} st_ab1b08_0;


unsigned int sub_ab1b08(st_ab1b08_0 *a0)
{
    unsigned int v2;  // w0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_ad69e4(a0->field_88);
    return v2 & ~((int)(v2) >> 31);
}
