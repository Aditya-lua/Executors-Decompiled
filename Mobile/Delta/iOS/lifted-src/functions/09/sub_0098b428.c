/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x98b428..0x98b564 (316 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_98b428_1 {
    char padding_0[256];
    unsigned long long field_100;
} st_98b428_1;

typedef struct st_98b428_2 {
    char padding_0[32];
    char field_20;
} st_98b428_2;

typedef struct st_98b428_0 {
    char padding_0[192];
    long long field_c0;
    char padding_c8[288];
    unsigned short field_1e8;
} st_98b428_0;


st_98b428_1 * sub_98b428(st_98b428_1 *a0, unsigned long a1, st_98b428_2 *a2, st_98b428_0 *a3)
{
    st_98b428_1 *v2;  // x0
    unsigned short v4;  // x8
    st_98b428_1 *v5;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (16 >= a0)
    {
        if (4 < a0)
        {
            switch (a0)
            {
            case 5:
                v5 = sub_98952c(a3->field_c0);
                if (!v5)
                    return v5;
            case 16:
                v4 = a3->field_1e8 | 2;
                break;
            default:
                return a0;
            }
        }
        else if (a0 == 3)
        {
            v4 = (unsigned short)(16 << (a2->field_20 & 3 & 31)) & 112 | a3->field_1e8;
        }
        else if (a0 == 4)
        {
            v2 = sub_98952c(a3->field_c0);
            if (!v2)
                return v2;
            v2->field_100 = v2->field_100 | 0x800000000;
        }
        else
        {
            return a0;
        }
    }
    else
    {
        if (18 < a0)
        {
            switch (a0)
            {
            case 19:
                v4 = a3->field_1e8 | 8;
                break;
            case 30:
                v4 = a3->field_1e8 | 1;
                break;
            default:
                return a0;
            }
        }
        else if (a0 == 0x11)
        {
            v2 = sub_98952c(a3->field_c0);
            if (!v2)
                return v2;
            v2->field_100 = v2->field_100 | 0x200000000;
        }
        else if (a0 == 18)
        {
            v4 = a3->field_1e8 | 4;
        }
        else
        {
            return a0;
        }
    }
    a3->field_1e8 = v4;
    return a0;
}
