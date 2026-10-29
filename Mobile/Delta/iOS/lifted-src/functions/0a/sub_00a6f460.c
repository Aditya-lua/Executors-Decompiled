/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa6f460..0xa6f570 (272 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a6f460_0 {
    struct st_a6f460_0 *field_0;
    unsigned int field_8;
    struct st_a6f460_0 *field_c;
    struct st_a6f460_0 *field_10;
    unsigned long long field_18;
    char padding_20[8];
    struct st_a6f460_0 *field_28;
} st_a6f460_0;


int sub_a6f460(st_a6f460_0 *a0, st_a6f460_0 *a1, st_a6f460_0 *a2, st_a6f460_0 *a3)
{
    st_a6f460_0 *v2;  // w20
    st_a6f460_0 *v3;  // x0
    st_a6f460_0 *v4;  // x19
    unsigned long long v5;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a0 || !a1 || !a2 && a3)
    {
        sub_a368c8();
        sub_a369bc("crypto/param_build.c", 369, "OSSL_PARAM_BLD_push_octet_string");
        sub_a36abc(15, 0xc0102, 0);
        goto LABEL_a6f4b4;
    }
    else
    {
        v2 = (st_a6f460_0 *)(unsigned int)sub_a6cf54(a2);
        v3 = sub_a6bffc(56, "crypto/param_build.c", 55);
        if (v3)
        {
            v4 = v3;
            v3->field_0 = a1;
            v3->field_8 = 5;
            v4->field_c = a3;
            v5 = sub_a71e18(a3);
            v4->field_10 = v5;
            (&v4->field_8)[1] = (unsigned int)v2;
            (&a0->field_0)[v2 != 0] = (char *)(&a0->field_0)[v2 != 0] + v5;
            if ((int)sub_ad68a0(a0->field_c, v4) > 0)
            {
                *(st_a6f460_0 **)v4->padding_20 = a2;
                v3 = 1;
            }
            else
            {
                sub_a6c2e4(v4, "crypto/param_build.c", 0x44);
LABEL_a6f4b4:
                v3 = 0;
            }
        }
    }
    return (unsigned int)v3;
}
