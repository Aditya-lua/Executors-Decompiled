/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb238c4..0xb239b8 (244 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b238c4_0 {
    struct st_b238c4_0 *field_0;
    unsigned int field_4;
} st_b238c4_0;


st_b238c4_0 * sub_b238c4(long long a0, unsigned int a1, unsigned long a2, st_b238c4_0 **a3, unsigned int *a4)
{
    st_b238c4_0 *v2;  // x0
    st_b238c4_0 *v3;  // x19
    st_b238c4_0 *v4;  // x1
    st_b238c4_0 *v5;  // w0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_9c7910();
    if (v2)
    {
        v3 = v2;
        v4 = &v2->field_4;
        if (a1 == 920)
            v5 = (st_b238c4_0 *)(unsigned int)sub_9fd594(a0, v4);
        else
            v5 = (st_b238c4_0 *)(unsigned int)sub_9fd468(a0, v4);
        *(unsigned int *)&v3->field_0 = (unsigned int)v5;
        if (v5 > 0)
        {
            *(unsigned int *)((char *)&v3->field_0 + 4) = 16;
            *a3 = v3;
            *a4 = 16;
            return 1;
        }
        sub_a368c8();
        sub_a369bc("providers/implementations/encode_decode/encode_key2any.c", 469, "prepare_dh_params");
        sub_a36abc(57, 0x8000d, 0);
        sub_9c7940(v3);
    }
    else
    {
        sub_a368c8();
        sub_a369bc("providers/implementations/encode_decode/encode_key2any.c", 459, "prepare_dh_params");
        sub_a36abc(57, 0x8000d, 0);
    }
    return 0;
}
