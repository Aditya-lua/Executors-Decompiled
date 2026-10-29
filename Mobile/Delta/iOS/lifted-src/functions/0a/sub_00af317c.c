/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaf317c..0xaf31e0 (100 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_af317c_0 {
    struct st_af317c_0 *field_0;
    long long field_8;
} st_af317c_0;


st_af317c_0 * sub_af317c(st_af317c_0 *a0, long long a1)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    st_af317c_0 *v8;  // x0
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (!a0)
        return a0;
    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    v8 = sub_af3b1c(a1);
    if ((unsigned int)v8)
    {
        if ((int)a0->field_0 == 2)
        {
            sub_af99a8(a0->field_8);
        }
        else if ((int)a0->field_0 == 1)
        {
            sub_afc404(a0->field_8);
        }
        v8 = 1;
        *(unsigned int *)&a0->field_0 = 1;
        a0->field_8 = a1;
    }
    return v8;
}
