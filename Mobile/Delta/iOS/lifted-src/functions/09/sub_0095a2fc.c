/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x95a2fc..0x95a46c (368 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_95a2fc_1 {
    char padding_0[40];
    struct st_95a2fc_0 *field_28;
} st_95a2fc_1;

typedef struct st_95a2fc_0 {
    struct st_95a2fc_0 *field_0;
} st_95a2fc_0;


st_95a2fc_0 ** sub_95a2fc(unsigned long a0, st_95a2fc_1 *a1, st_95a2fc_0 **a2, st_95a2fc_0 **a3, st_95a2fc_0 **a4)
{
    st_95a2fc_0 **v2;  // w8
    st_95a2fc_0 **v3;  // x24
    st_95a2fc_0 **v4;  // x8
    st_95a2fc_0 **v5;  // x25
    st_95a2fc_0 **v6;  // x23
    st_95a2fc_0 **v7;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = (st_95a2fc_0 **)(int)a1->field_28;
    if (31 >= v2)
    {
        if (3 < v2)
        {
            switch (v2)
            {
            case 4:
                v3 = 2;
                break;
            case 8:
                v3 = 3;
                break;
            case 16:
                v3 = 4;
                break;
            default:
LABEL_95a454:
                *a2 = 0;
                if (a3)
                {
LABEL_95a45c:
                    *(unsigned int *)a3 = 0;
                }
LABEL_95a460:
                if (a4)
                {
                    v4 = 0;
LABEL_95a42c:
                    *a4 = v4;
                }
LABEL_95a430:
                return 1;
            }
        }
        else if (!v2)
        {
            v3 = 9;
        }
        else if (v2 != 1)
        {
            if (v2 != 2)
                goto LABEL_95a454;
            v3 = 1;
        }
        else
        {
            v3 = 0;
        }
    }
    else
    {
        if (0x1ff >= v2)
        {
            switch (v2)
            {
            case 32:
                v3 = 5;
                break;
            case 128:
                v3 = 6;
                break;
            case 256:
                v3 = 7;
                break;
            default:
LABEL_95a454:
                *a2 = 0;
                if (a3)
                    goto LABEL_95a45c;
                goto LABEL_95a460;
            }
        }
        else
        {
            switch (v2)
            {
            case 512:
                v3 = 8;
                break;
            case 1024:
                v3 = 12;
                break;
            case 2048:
                v3 = 13;
                break;
            default:
LABEL_95a454:
                *a2 = 0;
                if (a3)
                    goto LABEL_95a45c;
                goto LABEL_95a460;
            }
        }
    }
    v5 = a0 + v3 * 8;
    v6 = v5[174];
    if (!v6)
        return 0;
    v7 = sub_963e6c(v6);
    if (!(unsigned int)v7)
        return v7;
    *a2 = v6;
    if (a3)
        *(int *)a3 = *(int *)(a0 + v3 * 4 + 1144);
    if (a4)
    {
        v4 = v5[188];
        goto LABEL_95a42c;
    }
    goto LABEL_95a430;
}
