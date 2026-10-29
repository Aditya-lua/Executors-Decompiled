/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa03188..0xa033e4 (604 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a03188_2 {
    char padding_0[152];
    struct st_a03188_1 *field_98;
} st_a03188_2;

typedef struct st_a03188_1 {
    int field_0;
    int field_4;
    struct st_a03188_0 *field_8;
    char padding_10[8];
    struct st_a03188_0 *field_18;
} st_a03188_1;

typedef struct st_a03188_0 {
    struct st_a03188_0 *field_0;
} st_a03188_0;


long long sub_a03188(st_a03188_2 *a0, long long a1, int a2, st_a03188_0 **a3)
{
    st_a03188_1 *v2;  // x20
    unsigned int v3;  // w8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0->field_98;
    if (a1 > 10)
    {
        switch (a1)
        {
        case 4099:
            if (sub_9c7b68(a3) != 64 && sub_9c7b68(a3) != 675 && sub_9c7b68(a3) != 672)
            {
                sub_a368c8();
                sub_a369bc("crypto/dsa/dsa_pmeth.c", 152, "pkey_dsa_ctrl");
                sub_a36abc(10, 106, 0);
                return 0;
            }
            v2->field_8 = a3;
            break;
        case 11:
            return 1;
        case 4098:
            v3 = __ROL__(a2, 27);
            if (8 < v3)
                return -0x2;
            if (1 << ((char)v3 & 31) & 417)
            {
                v2->field_4 = a2;
                break;
            }
            else
            {
                return -0x2;
            }
        case 13:
            *a3 = v2->field_18;
            return 1;
        case 4097:
            if (a2 >= 0x100)
            {
                v2->field_0 = a2;
                return 1;
            }
        default:
            goto LABEL_a0325c;
        }
    }
    else if (4 >= a1)
    {
        if (a1 != 1)
        {
            if (a1 == 2)
            {
                sub_a368c8();
                sub_a369bc("crypto/dsa/dsa_pmeth.c", 176, "pkey_dsa_ctrl");
                sub_a36abc(10, 150, 0);
                return -0x2;
            }
            return -0x2;
        }
        if (sub_9c7b68(a3) != 64 && sub_9c7b68(a3) != 116 && sub_9c7b68(a3) != 66 && sub_9c7b68(a3) != 675 && sub_9c7b68(a3) != 672 && sub_9c7b68(a3) != 673 && sub_9c7b68(a3) != 674 && sub_9c7b68(a3) != 1096 && sub_9c7b68(a3) != 1097 && sub_9c7b68(a3) != 1098 && sub_9c7b68(a3) != 1099)
        {
            sub_a368c8();
            sub_a369bc("crypto/dsa/dsa_pmeth.c", 160, "pkey_dsa_ctrl");
            sub_a36abc(10, 106, 0);
            return 0;
        }
        v2->field_18 = a3;
    }
    else
    {
        if (a1 == 5)
        {
            return 1;
        }
        else if (a1 == 7)
        {
            return 1;
        }
LABEL_a0325c:
        return -0x2;
    }
    return 1;
}
