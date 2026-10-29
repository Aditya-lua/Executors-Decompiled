/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa781e0..0xa783bc (476 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a781e0_0 {
    char field_0;
    struct st_a781e0_0 *field_1;
    struct st_a781e0_0 *field_2;
} st_a781e0_0;


st_a781e0_0 * sub_a781e0(unsigned long long a0, st_a781e0_0 *a1, st_a781e0_0 **a2)
{
    st_a781e0_0 *v3;  // w22
    st_a781e0_0 *v4;  // w8
    unsigned long long v0;  // [bp-0x40]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    if (!a1)
    {
        sub_a368c8();
        sub_a369bc("crypto/provider_conf.c", 280, "provider_conf_parse_bool_setting");
        v0 = a0;
        sub_a36abc(15, 105, "directive %s set to unrecognized value");
        return 0;
    }
    if ((a1->field_0 != 49 || (&a1->field_0)[1]) && _strcmp(a1, "yes") && _strcmp(a1, "YES") && _strcmp(a1, "true") && _strcmp(a1, "TRUE"))
    {
        switch (v3)
        {
        case 79:
            if ((&a1->field_0)[1] == 78)
            {
LABEL_a78300:
                if (!(&a1->field_0)[2])
                    goto LABEL_a78308;
                goto LABEL_a78348;
            }
            goto LABEL_a78348;
        case 48:
            v4 = (st_a781e0_0 *)(&a1->field_0)[1];
            if (!v4)
            {
                *(unsigned int *)a2 = (unsigned int)v4;
                return 1;
            }
            goto LABEL_a78348;
        case 110:
            if ((&a1->field_0)[1] != 111 || (v4 = (st_a781e0_0 *)(&a1->field_0)[2], v4))
                goto LABEL_a78348;
            else
                goto LABEL_a7830c;
        case 78:
            goto LABEL_a78348;
        case 111:
            if ((&a1->field_0)[1] == 110)
                goto LABEL_a78300;
        default:
LABEL_a78348:
            if (_strcmp(a1, "false") && _strcmp(a1, "FALSE") && _strcmp(a1, "off") && _strcmp(a1, "OFF"))
            {
                sub_a368c8();
                sub_a369bc("crypto/provider_conf.c", 302, "provider_conf_parse_bool_setting");
                v0 = a0;
                sub_a36abc(15, 105, "directive %s set to unrecognized value");
                return 0;
            }
            v4 = (st_a781e0_0 *)0;
            break;
        }
    }
    else
    {
LABEL_a78308:
        v4 = (st_a781e0_0 *)1;
    }
LABEL_a7830c:
    *(unsigned int *)a2 = (unsigned int)v4;
    return 1;
}
