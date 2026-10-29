/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc641ac..0xc64ab4 (2312 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c641ac_0 {
    unsigned int field_0;
    char padding_4[4];
    unsigned long long field_8;
} st_c641ac_0;


unsigned long long sub_c641ac(st_c641ac_0 *a0, unsigned int a1, unsigned int a2, unsigned long long a3, unsigned int a4, unsigned int a5, unsigned int *a6)
{
    unsigned long v8;  // x8
    unsigned int idx;  // x19
    char *v6;  // [bp-0x10]
    char v7;  // [bp+0x0]

    v6 = &v7;
    if (!a0 || !(v8 = a0->field_0, idx = (unsigned int)a0, !(unsigned int)v8 || v8 >> 7 & 1 && (idx = sub_980dc8(a0), idx)))
        return 0xffffffff;
    if (23 < a1 || !(1 << ((char)a1 & 31) & 12582913) || a1 != 23 && a5)
        goto LABEL_0xc64238;
    else
        goto LABEL_0xc64294;
}
