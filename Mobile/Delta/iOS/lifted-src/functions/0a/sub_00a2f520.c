/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa2f520..0xa2f658 (312 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a2f520_0 {
    struct st_a2f520_0 *field_0;
    struct st_a2f520_0 *field_8;
} st_a2f520_0;


st_a2f520_0 * sub_a2f520(long long a0, st_a2f520_0 *a1, st_a2f520_0 *a2)
{
    st_a2f520_0 *v3;  // x19
    st_a2f520_0 *v4;  // x8
    st_a2f520_0 *v5;  // x9
    st_a2f520_0 *v6;  // x20
    st_a2f520_0 *v0;  // [bp-0x38]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v0 = 0;
    if (!a2)
    {
        sub_a368c8();
        sub_a369bc("crypto/encode_decode/encoder_lib.c", 127, "OSSL_ENCODER_to_data");
        sub_a36abc(59, 0xc0102, 0);
        return 0;
    }
    v3 = sub_9d3c1c(sub_9d8844());
    if (v3 && sub_a2f068(a0, v3) && sub_9d46fc(v3, 115, 0, &v0) >= 1)
    {
        if (a1)
        {
            if (a1->field_0)
            {
                v4 = v0;
                v5 = a2->field_0 - v4->field_0;
                if (v4->field_0 > a2->field_0)
                    goto LABEL_a2f5a4;
            }
            else
            {
                v4 = v0;
                v5 = v4->field_0;
            }
            a2->field_0 = v5;
            if (a1->field_0)
            {
                _memcpy(a1->field_0, v4->field_8, v4->field_0);
                a1->field_0 = a1->field_0 + v0->field_0;
            }
            else
            {
                a1->field_0 = v4->field_8;
                v4->field_8 = 0;
            }
        }
        else
        {
            a2->field_0 = v0->field_0;
        }
        v6 = 1;
    }
    else
    {
LABEL_a2f5a4:
        v6 = 0;
    }
    sub_9d3c28(v3);
    return v6;
}
