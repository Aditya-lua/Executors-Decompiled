/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaac648..0xaac6e8 (160 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_aac648_0 {
    char padding_0[16];
    struct st_aac648_0 *field_10;
} st_aac648_0;


st_aac648_0 * sub_aac648(st_aac648_0 *a0, st_aac648_0 *a1, unsigned int a2)
{
    st_aac648_0 *v2;  // x20
    st_aac648_0 *v3;  // x19
    st_aac648_0 *v4;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a1;
    v3 = sub_aadf1c();
    if (v3 && (a2 == 20 || (v4 = sub_9cf11c(), v3->field_10 = v4, v4 && sub_9c19dc())) && sub_9cf8bc(v3, a0))
    {
        if (!v2)
            v2 = a0;
        if (sub_9cf9fc() && sub_9cf8bc(&v3[1].padding_0[8], v2))
            return v3;
    }
    sub_aadf28(v3);
    return 0;
}
