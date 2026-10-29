/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaa231c..0xaa23b4 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_aa231c_0 {
    long long field_0;
    struct st_aa231c_1 *field_8;
} st_aa231c_0;

typedef struct st_aa231c_1 {
    long long field_0;
    long long field_8;
} st_aa231c_1;


long long sub_aa231c(st_aa231c_0 *a0, long long a1, long long a2)
{
    long long v2;  // x0
    long long v3;  // x21
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (sub_a99eac(a0->field_0) == 152 && sub_a99eac(a0->field_8->field_0) == 158)
    {
        v2 = sub_afc3e0();
        v3 = sub_9c8eb8(a0->field_8->field_8, v2, a1, a2);
        if (sub_afc420(v3, a1, a2, a2))
            return v3;
        sub_afc404(v3);
    }
    return 0;
}
