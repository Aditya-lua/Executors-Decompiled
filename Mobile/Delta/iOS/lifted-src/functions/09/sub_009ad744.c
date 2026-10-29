/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9ad744..0x9ad838 (244 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9ad744_0 {
    char padding_0[7];
    char field_7;
    char padding_8[56];
    struct st_9ad744_0 *field_40;
    struct st_9ad744_0 *field_48;
} st_9ad744_0;


st_9ad744_0 * sub_9ad744(st_9ad744_0 *a0, st_9ad744_0 *a1)
{
    st_9ad744_0 *v2;  // x0
    st_9ad744_0 *v3;  // x21
    st_9ad744_0 *v4;  // x8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a6bffc(80, "ssl/statem/statem_dtls.c", 76);
    if (!v2)
        return v2;
    if (a0)
    {
        v3 = sub_a6bf4c(a0, "ssl/statem/statem_dtls.c", 80);
        if (v3)
        {
            v2->field_40 = v3;
            if (!a1)
            {
                v2->field_48 = 0;
                return v2;
            }
LABEL_9ad7a4:
            v4 = sub_a6bffc(&a0->field_7 >> 3, "ssl/statem/statem_dtls.c", 91);
            if (v4)
            {
                v2->field_48 = v4;
                return v2;
            }
            sub_a6c2e4(v3, "ssl/statem/statem_dtls.c", 93);
        }
        sub_a6c2e4();
        return 0;
    }
    v3 = 0;
    v2->field_40 = 0;
    if (!a1)
    {
        v2->field_48 = 0;
        return v2;
    }
    goto LABEL_9ad7a4;
}
