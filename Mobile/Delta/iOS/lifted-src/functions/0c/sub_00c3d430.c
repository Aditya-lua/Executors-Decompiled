/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc3d430..0xc3d794 (868 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c3d430_0 {
    char padding_0[8];
    struct st_c3d430_1 *field_8;
} st_c3d430_0;

typedef struct st_c3d430_1 {
    char padding_0[32];
    struct st_c3d430_2 *field_20;
} st_c3d430_1;

typedef struct st_c3d430_3 {
    unsigned long long field_0;
    char padding_8[24];
    struct st_c3d430_0 *field_20;
} st_c3d430_3;

typedef struct st_c3d430_2 {
    unsigned long long field_0;
} st_c3d430_2;

extern long long g_e0eb40;

unsigned long long sub_c3d430(st_c3d430_3 *a0)
{
    unsigned long long v7;  // x21
    unsigned int i;  // w0
    unsigned long long v9;  // w20
    unsigned long v10;  // cc_dep1
    unsigned long long v11;  // 4107
    unsigned long long v12;  // 4107
    uint128_t v0;  // [bp-0xc0]
    char v1;  // [bp-0xb0], Other Possible Types: unsigned long
    unsigned long v2;  // [bp-0xa8], Other Possible Types: unsigned long long
    unsigned long long v3;  // [bp-0xa0]
    uint128_t v4;  // [bp-0x98]
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    if (a0->field_0)
    {
        sub_c3d01c(&v1, a0);
        v7 = v1;
        if (v7)
        {
            if (!(v2 & 1))
            {
                v1 = v7;
                v2 &= 0x7ffffffffffffffe;
                v3 = v7 + v2;
                v0 = 0x20000000000000000;
                v4 = 0x20000000000000000;
                do
                {
                    i = sub_c3dabc(&v1);
                    if (i == 1114113)
                    {
                        if (a0->field_20)
                            a0->field_20->field_8->field_20();
                        return 0;
                    }
                } while (i != 0x110000);
            }
            if (a0->field_20 && sub_be7850(a0->field_20, &g_e0eb40, 16) & 1)
                return 1;
            a0->field_0 = 0;
            a0->padding_8[0] = 0;
            return 0;
        }
        else
        {
            v9 = (char)v2;
            if (a0->field_20)
            {
                v10 = v9 & 0xff;
                if (v9)
                {
                    v11 = arm64g_calculate_condition(19, v10, 0, 0);
                    if (!(v11 & 1))
                        goto LABEL_c3d546;
LABEL_c3d545:
                }
                else
                {
                    v12 = arm64g_calculate_condition(19, v10, 0, 0);
                    if (v12 & 1)
                        goto LABEL_c3d545;
LABEL_c3d546:
                }
                if (sub_be7850() & 1)
                    return 1;
            }
            a0->field_0 = 0;
            a0->padding_8[0] = v9;
            return 0;
        }
    }
    else if (a0->field_20)
    {
        return sub_be7850();
    }
    else
    {
        return a0->field_20;
    }
}
