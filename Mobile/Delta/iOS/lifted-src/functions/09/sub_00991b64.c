/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x991b64..0x991bd0 (108 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_991b64_1 {
    char padding_0[136];
    struct st_991b64_0 *field_88;
} st_991b64_1;

typedef struct st_991b64_0 {
    char padding_0[8];
    struct st_991b64_0 *field_8;
} st_991b64_0;


int sub_991b64(st_991b64_1 *a0)
{
    st_991b64_0 *v2;  // x0
    st_991b64_0 *v3;  // x20
    st_991b64_0 *v4;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a6bf4c(16, "ssl/record/rec_layer_d1.c", 24);
    if (v2)
    {
        v3 = v2;
        a0->field_88 = v2;
        v4 = sub_954274();
        v3->field_8 = v4;
        if (v4)
        {
            v2 = 1;
        }
        else
        {
            sub_a6c2e4(v3, "ssl/record/rec_layer_d1.c", 32);
            v2 = 0;
            a0->field_88 = 0;
        }
    }
    return (unsigned int)v2;
}
