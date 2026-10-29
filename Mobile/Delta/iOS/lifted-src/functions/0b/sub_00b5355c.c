/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb5355c..0xb53674 (280 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b5355c_0 {
    struct st_b5355c_0 *field_0;
    char padding_8[8];
    char field_10;
    char padding_11[255];
    struct st_b5355c_0 *field_110;
    char field_118;
    char padding_119[31];
    struct st_b5355c_0 *field_138;
} st_b5355c_0;

typedef struct st_b5355c_1 {
    char padding_0[32];
    struct st_b5355c_0 *field_20;
} st_b5355c_1;


st_b5355c_0 * sub_b5355c(st_b5355c_0 *a0, st_b5355c_0 *a1)
{
    unsigned long long v8;  // x22
    unsigned long long v9;  // x21
    unsigned long long v10;  // x20
    unsigned long long v11;  // x19
    unsigned long long v12;  // x30
    st_b5355c_0 *v13;  // x0
    st_b5355c_0 *v14;  // x0
    st_b5355c_0 *v15;  // x22
    st_b5355c_0 **v0;  // [bp-0x38], Other Possible Types: st_b5355c_1 *
    unsigned long long v1;  // [bp-0x30]
    unsigned long long v2;  // [bp-0x28]
    unsigned long long v3;  // [bp-0x20]
    unsigned long long v4;  // [bp-0x18]
    char *v5;  // [bp-0x10]
    unsigned long long v6;  // [bp-0x8]
    char v7;  // [bp+0x0]

    if (a0)
    {
        v1 = v8;
        v2 = v9;
        v3 = v10;
        v4 = v11;
        v5 = &v7;
        v6 = v12;
        if (!a1 || !a1->field_0)
        {
LABEL_b53648:
            v13 = 1;
        }
        else if (!sub_a6fbc4(a1, "context-string") || !(v0 = &a0->field_10, v13 = sub_a71440(), !(unsigned int)v13))
        {
            v14 = sub_a6fbc4(a1, "test-entropy");
            if (v14 && (v0 = &a0->field_118, v15 = sub_ac4034(a0->field_0), !sub_a71440(v14, &v0, v15, &a0->field_138) || a0->field_138 != v15))
            {
                v13 = 0;
                a0->field_138 = 0;
            }
            else if ((!sub_a6fbc4(a1, "deterministic") || (v13 = sub_a6fc2c(), (unsigned int)v13)) && !(sub_a6fbc4(a1, "message-encoding") && !(v13 = sub_a6fc2c(), (unsigned int)v13)))
            {
                goto LABEL_b53648;
            }
        }
        else
        {
            a0->field_110 = 0;
        }
        a0 = v13;
    }
    return (unsigned int)a0;
}
