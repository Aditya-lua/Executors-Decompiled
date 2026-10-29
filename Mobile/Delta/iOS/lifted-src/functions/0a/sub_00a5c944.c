/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa5c944..0xa5ca90 (332 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a5c944_0 {
    struct st_a5c944_0 *field_0;
    char padding_8[24];
    struct st_a5c944_0 *field_20;
    struct st_a5c944_0 *field_28;
    struct st_a5c944_0 *field_30;
    struct st_a5c944_0 *field_38;
    char padding_40[32];
    struct st_a5c944_0 *field_60;
    char padding_68[16];
    struct st_a5c944_0 *field_78;
} st_a5c944_0;


st_a5c944_0 * sub_a5c944(st_a5c944_0 *a0, st_a5c944_0 *a1)
{
    st_a5c944_0 *v2;  // x0
    st_a5c944_0 *v3;  // x0
    st_a5c944_0 *v4;  // x8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a0)
    {
        sub_a5d5bc(a0);
        *(unsigned int *)&a0->field_0 = (unsigned int)a1;
        if (a0->field_20 && a0->field_20->field_60)
        {
            switch (a1)
            {
            case 2:
LABEL_a5c9c0:
                v2 = sub_a5597c();
                a0->field_28 = v2;
                if (!v2)
                    goto LABEL_a5c9dc;
                break;
            case 4:
                goto LABEL_a5c9c0;
            default:
                v2 = a0->field_28;
                if (!v2)
                {
LABEL_a5c9dc:
                    sub_a368c8(v2);
                    sub_a369bc("crypto/evp/pmeth_gn.c", 50, "gen_init");
                    sub_a36abc(6, 134, 0);
                    v3 = 0;
                    goto LABEL_a5ca5c;
                }
            }
        }
        else
        {
            v4 = a0->field_78;
            if (!v4)
                goto LABEL_a5ca2c;
            switch (a1)
            {
            case 4:
                if (!v4->field_38)
                    goto LABEL_a5ca2c;
                if (v4->field_30)
                    v4->field_30();
                break;
            case 2:
                if (!v4->field_28)
                    goto LABEL_a5ca2c;
                if (v4->field_20)
                    v4->field_20();
                break;
            default:
                break;
            }
        }
        return 1;
    }
    else
    {
LABEL_a5ca2c:
        sub_a368c8();
        sub_a369bc("crypto/evp/pmeth_gn.c", 87, "gen_init");
        sub_a36abc(6, 150, 0);
        v3 = 0xfffffffe;
LABEL_a5ca5c:
        if (!a0)
        {
            return v3;
        }
        else if (0 >= (int)(unsigned int)v3)
        {
            sub_a5d5bc(a0);
            *(unsigned int *)&a0->field_0 = 0;
            return v3;
        }
        else
        {
            return v3;
        }
    }
}
