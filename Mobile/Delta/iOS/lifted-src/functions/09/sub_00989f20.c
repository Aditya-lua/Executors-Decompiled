/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x989f20..0x989fc4 (164 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_989f20_0 {
    long long field_0;
    long long field_8;
    char padding_10[8];
    unsigned int field_18;
} st_989f20_0;


long long sub_989f20(st_989f20_0 *a0)
{
    long long v2;  // x20
    long long v3;  // x0
    long long v4;  // x0
    long long v5;  // x22
    long long v6;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_977398(a0->field_0);
    v3 = sub_977390(a0->field_0);
    sub_ad9384(v2);
    v4 = sub_977244(a0->field_0);
    if (!a0->field_18)
    {
        v5 = v4;
        do
        {
            v6 = sub_97b884(v3, sub_975ff4(v5));
            sub_ad948c(a0->field_8, v2, v6);
        } while (!a0->field_18 && (sub_982d48(v5, 1), !a0->field_18));
    }
    sub_ad93b4(v2);
    return 1;
}
