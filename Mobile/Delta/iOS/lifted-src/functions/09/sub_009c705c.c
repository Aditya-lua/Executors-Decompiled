/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9c705c..0x9c71a0 (324 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9c705c_0 {
    struct st_9c705c_0 *field_0;
} st_9c705c_0;


int sub_9c705c(st_9c705c_0 **a0, int a1, unsigned int *a2, st_9c705c_0 **a3)
{
    unsigned long long v11;  // x24
    unsigned long long v12;  // x23
    unsigned long v21;  // cc_op
    unsigned long v22;  // cc_dep1
    unsigned long v23;  // cc_dep2
    unsigned long v24;  // cc_ndep
    unsigned long long v25;  // 4110
    unsigned long long v26;  // 4102
    unsigned long long v13;  // x22
    unsigned long long v27;  // 4110
    unsigned long long v28;  // 4102
    unsigned int v29;  // w8
    st_9c705c_0 **v30;  // w8
    st_9c705c_0 **v31;  // x2
    long long v32;  // x1
    unsigned long long v14;  // x21
    unsigned long long v15;  // x20
    unsigned long long v16;  // x19
    unsigned long long v17;  // x30
    st_9c705c_0 **num;  // x0
    st_9c705c_0 **v19;  // x23
    st_9c705c_0 **v20;  // x9
    unsigned long v0;  // [bp-0x50]
    st_9c705c_0 **v1;  // [bp-0x48]
    unsigned long long v2;  // [bp-0x40]
    unsigned long long v3;  // [bp-0x38]
    unsigned long long v4;  // [bp-0x30]
    unsigned long long v5;  // [bp-0x28]
    unsigned long long v6;  // [bp-0x20]
    unsigned long long v7;  // [bp-0x18]
    char *v8;  // [bp-0x10]
    unsigned long long v9;  // [bp-0x8]
    char v10;  // [bp+0x0]

    if (a0)
    {
        v2 = v11;
        v3 = v12;
        v4 = v13;
        v5 = v14;
        v6 = v15;
        v7 = v16;
        v8 = &v10;
        v9 = v17;
        num = _strtoul();
        v19 = v1;
        if (v19)
        {
            v20 = (char *)a0 + a1;
            if (*(char *)v19)
            {
                v25 = arm64g_calculate_condition(v21 | 16, v22, v23, v24);
                v26 = arm64g_calculate_condition(132, (v25 & 1 ? v19 : 0), (v25 & 1 ? v20 : 0), 0);
                if (v26 & 1)
                    goto LABEL_9c7124;
            }
            else
            {
                v27 = arm64g_calculate_condition(v21 | 16, v22, v23, v24);
                v28 = arm64g_calculate_condition(128, (v27 & 1 ? v19 : 0), (v27 & 1 ? v20 : 0), 0);
                if (v28 & 1)
                    goto LABEL_9c7124;
            }
        }
        if (num < 0)
        {
            sub_a368c8();
            sub_a369bc("crypto/asn1/asn1_gen.c", 365, "parse_tagging");
            v32 = 0xbb;
            v31 = 0;
            goto LABEL_9c7120;
        }
        *a2 = (unsigned int)num;
        if (!v19 || (unsigned int)(a0 - v19) == -a1)
            goto LABEL_9c70e8;
        v29 = *(char *)v19;
        if (79 >= (int)v29)
        {
            switch (v29)
            {
            case 65:
                v30 = (st_9c705c_0 **)64;
LABEL_9c70ec:
                *(unsigned int *)a3 = (unsigned int)v30;
                goto LABEL_9c70f0;
            case 67:
LABEL_9c70e8:
                v30 = (st_9c705c_0 **)128;
                goto LABEL_9c70ec;
            default:
                sub_a368c8();
LABEL_9c715c:
                sub_a369bc("crypto/asn1/asn1_gen.c", 394, "parse_tagging");
                v0 = *(char *)v19;
                v31 = "Char=%c";
                v32 = 186;
LABEL_9c7120:
                sub_a36abc(13, v32, v31);
LABEL_9c7124:
                a0 = 0;
                break;
            }
        }
        else
        {
            switch (v29)
            {
            case 80:
                v30 = (st_9c705c_0 **)192;
                break;
            case 85:
                *(unsigned int *)a3 = 0;
LABEL_9c70f0:
                a0 = 1;
                goto LABEL_9c7128;
            default:
                sub_a368c8();
                goto LABEL_9c715c;
            }
            goto LABEL_9c70ec;
        }
LABEL_9c7128:
    }
    return (unsigned int)a0;
}
