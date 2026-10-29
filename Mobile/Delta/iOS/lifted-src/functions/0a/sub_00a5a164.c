/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa5a164..0xa5a1ac (72 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a5a164_0 {
    char padding_0[8];
    struct st_a5a164_0 *field_8;
    char padding_10[80];
    struct st_a5a164_0 *field_60;
    char padding_68[24];
    struct st_a5a164_0 *field_80;
} st_a5a164_0;


st_a5a164_0 * sub_a5a164(st_a5a164_0 *a0)
{
    unsigned long long v3;  // x30
    st_a5a164_0 *v4;  // x8
    char *v0;  // [bp-0x10]
    unsigned long long v1;  // [bp-0x8]
    char v2;  // [bp+0x0]

    if (!a0)
    {
        return a0;
    }
    else if (a0->field_60)
    {
        v0 = &v2;
        v1 = v3;
        return !sub_a54c94();
    }
    else
    {
        v4 = a0->field_8;
        if (!v4 || !v4->field_80)
            return 0;
        goto *((void *)(v4->field_80));
        return 0;
    }
}
