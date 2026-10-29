/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xafa568..0xafa634 (204 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_afa568_0 {
    struct st_afa568_0 *field_0;
    struct st_afa568_0 *field_8;
    struct st_afa568_0 *field_10;
} st_afa568_0;


int sub_afa568(st_afa568_0 **a0)
{
    st_afa568_0 *v2;  // x0
    st_afa568_0 *v3;  // x19
    long long v4;  // x20
    st_afa568_0 *v5;  // x0
    st_afa568_0 *v6;  // x0
    long long v7;  // x21
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a6bffc(40, "crypto/x509/x_name.c", 92);
    if (v2)
    {
        v3 = v2;
        v4 = 524295;
        v5 = sub_ad61b4();
        v3->field_0 = v5;
        if (v5)
        {
            v6 = sub_9ebce0();
            v3->field_10 = v6;
            if (v6)
            {
                v2 = 1;
                *(unsigned int *)&v3->field_8 = 1;
                *a0 = v3;
            }
            else
            {
                v7 = 101;
LABEL_afa5d8:
                sub_a368c8();
                sub_a369bc("crypto/x509/x_name.c", v7, "x509_name_ex_new");
                sub_a36abc(13, v4, 0);
                sub_ad6020(v3->field_0);
                sub_a6c2e4(v3, "crypto/x509/x_name.c", 111);
                v2 = 0;
            }
        }
        else
        {
            v4 = 524303;
            v7 = 97;
            goto LABEL_afa5d8;
        }
    }
    return (unsigned int)v2;
}
