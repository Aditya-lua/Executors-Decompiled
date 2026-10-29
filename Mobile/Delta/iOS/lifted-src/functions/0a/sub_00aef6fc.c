/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaef6fc..0xaef870 (372 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_aef6fc_0 {
    char field_0;
    struct st_aef6fc_0 *field_1;
    struct st_aef6fc_0 *field_2;
} st_aef6fc_0;

typedef struct st_aef6fc_1 {
    char padding_0[8];
    unsigned long long field_8;
    struct st_aef6fc_0 *field_10;
} st_aef6fc_1;


st_aef6fc_0 * sub_aef6fc(st_aef6fc_1 *a0, st_aef6fc_0 **a1)
{
    st_aef6fc_0 *v6;  // x21
    unsigned int v7;  // w22
    st_aef6fc_0 *v8;  // w8
    st_aef6fc_0 *v9;  // w8
    unsigned long long v0;  // [bp-0x50]
    unsigned long v1;  // [bp-0x48]
    unsigned long long v2;  // [bp-0x40]
    st_aef6fc_0 *v3;  // [bp-0x38]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v6 = a0->field_10;
    if (!v6)
        goto LABEL_aef800;
    if (_strcmp(v6, "TRUE") && _strcmp(v6, "true"))
    {
        v7 = v6->field_0;
        if ((v7 != 121 && v7 != 89 || (&v6->field_0)[1]) && _strcmp(v6, "YES") && _strcmp(v6, "yes"))
        {
            if (!_strcmp(v6, "FALSE"))
            {
                *(unsigned int *)a1 = 0;
                return 1;
            }
            else if (_strcmp(v6, "false"))
            {
                switch (v7)
                {
                case 110:
                    switch (v9)
                    {
                    case 0:
                        *(unsigned int *)a1 = 0;
                        return 1;
                    case 111:
                        if ((&v6->field_0)[2])
                            goto LABEL_aef800;
                        *(unsigned int *)a1 = 0;
                        return 1;
                    default:
LABEL_aef800:
                        sub_a368c8();
                    }
                    break;
                case 78:
                    switch (v8)
                    {
                    case 0:
                        *(unsigned int *)a1 = 0;
                        return 1;
                    case 79:
                        if ((&v6->field_0)[2])
                            goto LABEL_aef800;
                        *(unsigned int *)a1 = 0;
                        return 1;
                    default:
LABEL_aef800:
                        sub_a368c8();
                    }
                    break;
                default:
LABEL_aef800:
                    sub_a368c8();
                }
                sub_a369bc("crypto/x509/v3_utl.c", 291, "X509V3_get_value_bool");
                sub_a36abc(0x22, 104, 0);
                v2 = ", value=";
                v3 = a0->field_10;
                v0 = "name=";
                v1 = a0->field_8;
                sub_a364a0(4);
                return 0;
            }
            else
            {
                *(unsigned int *)a1 = 0;
                return 1;
            }
        }
    }
    *(unsigned int *)a1 = 0xff;
    return 1;
}
