/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa6f344..0xa6f460 (284 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a6f344_0 {
    struct st_a6f344_0 *field_0;
    char field_1;
    char padding_2[6];
    unsigned int field_8;
    struct st_a6f344_0 *field_c;
    struct st_a6f344_0 *field_10;
    unsigned long long field_18;
    char padding_20[8];
    struct st_a6f344_0 *field_28;
} st_a6f344_0;


int sub_a6f344(st_a6f344_0 *a0, st_a6f344_0 *a1, st_a6f344_0 *a2, st_a6f344_0 *len)
{
    st_a6f344_0 *v2;  // w24
    st_a6f344_0 *v3;  // x0
    st_a6f344_0 *v4;  // x23
    unsigned long long v5;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a0 && a1 && a2)
    {
        if (!len)
            len = _strlen(a2);
        v2 = (st_a6f344_0 *)(unsigned int)sub_a6cf54(a2);
        v3 = sub_a6bffc(56, "crypto/param_build.c", 55);
        if (v3)
        {
            v4 = v3;
            v3->field_0 = a1;
            *(unsigned int *)&v3->field_1 = 4;
            *(st_a6f344_0 **)&v3->field_8 = len;
            v5 = sub_a71e18((char *)&len->field_0 + 1);
            v4->field_c = v5;
            *(unsigned int *)&v4->padding_2[3] = (unsigned int)v2;
            (&a0->field_0)[v2 != 0] = (char *)(&a0->field_0)[v2 != 0] + v5;
            if ((int)sub_ad68a0(*(long long *)&a0->field_8, v4) > 0)
            {
                v4->field_18 = a2;
                v3 = 1;
            }
            else
            {
                sub_a6c2e4(v4, "crypto/param_build.c", 0x44);
LABEL_a6f430:
                v3 = 0;
            }
        }
    }
    else
    {
        sub_a368c8();
        sub_a369bc("crypto/param_build.c", 329, "OSSL_PARAM_BLD_push_utf8_string");
        sub_a36abc(15, 0xc0102, 0);
        goto LABEL_a6f430;
    }
    return (unsigned int)v3;
}
