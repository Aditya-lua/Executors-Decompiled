/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x97fb98..0x97fcc8 (304 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_97fb98_1 {
    char padding_0[24];
    struct st_97fb98_0 *field_18;
} st_97fb98_1;

typedef struct st_97fb98_0 {
    char padding_0[160];
    long long field_a0;
    char padding_a8[8];
    unsigned short field_b0;
    char padding_b2[158];
    unsigned short field_150;
    char padding_152[2];
    unsigned int field_154;
    char padding_158[24];
    long long field_170;
} st_97fb98_0;


unsigned short sub_97fb98(st_97fb98_1 *a0)
{
    st_97fb98_0 *v2;  // x19
    unsigned short v3;  // x8
    unsigned short v4;  // x20
    unsigned long long v5;  // 4106
    unsigned short v6;  // w8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0->field_18;
    if (!(v2->field_150 >> 4 & 1))
    {
        if (v2->field_154 != 2 && !v2->field_154)
            goto LABEL_97fbc4;
        v3 = sub_97dd30();
        v4 = *(long long *)&v2->field_b0;
        if (v4 != v3)
        {
            *(unsigned long long *)&v2->field_b0 = v3;
            if (v3)
            {
                do
                {
                    /* unsupported instruction */;
                    /* unsupported instruction */;
                    /* unsupported instruction */;
                } while (/* unsupported instruction */ ^ 1);
                v5 = arm64g_calculate_condition(19, /* unsupported instruction */, 1, 0);
                if (!(v5 & 1))
                    /* unsupported instruction */;
            }
            else
            {
                sub_95efac(v2);
            }
            if (v4)
                sub_95eea4(v4);
            if (*(long long *)&v2->field_b0)
                goto LABEL_97fc7c;
        }
        else if (v3)
        {
LABEL_97fc7c:
            v2->field_150 = v2->field_150 | 16;
            v6 = *(int *)&v2->padding_158[16];
            if (!*(int *)&v2->padding_158[16])
            {
                if (!v2->field_154)
                    v6 = 1;
                else
                    v6 = 2;
            }
            sub_979b18(v2->field_a0, v6 == 2, v2->field_170);
            return 1;
        }
    }
    else
    {
LABEL_97fbc4:
    }
    sub_97c738();
    return 0;
}
