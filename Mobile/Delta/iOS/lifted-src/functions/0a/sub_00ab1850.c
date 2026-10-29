/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xab1850..0xab18b8 (104 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ab1850_0 {
    char padding_0[16];
    int field_10;
    char padding_14[20];
    long long field_28;
    char padding_30[88];
    long long field_88;
} st_ab1850_0;


long long sub_ab1850(st_ab1850_0 *a0)
{
    long long v2;  // x19
    int v3;  // w0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_9e46a8(a0->field_28);
    if (a0->field_10 == 1)
    {
        v3 = sub_ad69e4(a0->field_88);
        if (v3 < 1 || v3 + 2 > (int)sub_ab2a14(v2))
            return 0;
    }
    return sub_ab148c(v2);
}
