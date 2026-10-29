/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xae4810..0xae4880 (112 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ae4810_0 {
    unsigned int field_0;
    char padding_4[4];
    unsigned long long field_8;
    char padding_10[8];
    char field_18;
    char padding_19[7];
    unsigned long long field_20;
} st_ae4810_0;

typedef struct st_ae4810_1 {
    char padding_0[96];
    struct st_ae4810_0 *field_60;
} st_ae4810_1;


long long sub_ae4810(st_ae4810_1 *a0, long long a1)
{
    st_ae4810_0 *v2;  // x20
    st_ae4810_0 *v3;  // x20
    unsigned long v4;  // x2
    unsigned long v5;  // x2
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0->field_60;
    if (!a0->field_60->field_8)
        return v5;
    do
    {
        v3 = v2;
        if (sub_9c064c(a1, v3->field_0))
            sub_aeefc4(v3->field_8, 0, &v4);
    } while ((v2 = &v3->field_18, v3->field_20));
    return v4;
}
