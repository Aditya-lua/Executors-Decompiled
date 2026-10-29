/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x97d118..0x97d380 (616 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_97d118_1 {
    char padding_0[120];
    long long field_78;
    char padding_80[32];
    long long field_a0;
    char padding_a8[168];
    unsigned short field_150;
} st_97d118_1;

typedef struct st_97d118_0 {
    char padding_0[88];
    long long field_58;
} st_97d118_0;

extern long long g_97d3d0;
extern long long g_97d470;
extern long long g_97d478;

long long sub_97d118(unsigned long a0, unsigned long long a1, unsigned short a2)
{
    st_97d118_1 *v6;  // x21
    st_97d118_1 *v8;  // x21
    unsigned short v9;  // w0
    unsigned short v10;  // x19
    st_97d118_0 *v0;  // [bp-0x68], Other Possible Types: char
    st_97d118_1 *v1;  // [bp-0x50]
    unsigned short v2;  // [bp-0x40]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    if (!sub_97f48c())
        return 0xffffffff;
    if (v2)
    {
        sub_97c738(&v0);
    }
    else
    {
        sub_ad9384(sub_c4ba8(*(long long *)(v0 + 88)));
        if (sub_977354(v1->field_a0))
        {
            sub_ad93b4(sub_c4ba8(v0->field_58));
            return 1;
        }
        if (!(a1 & 10))
        {
            v6 = v1;
            if (!(v6->field_150 >> 5 & 1))
            {
                sub_989d88(sub_97724c(v6->field_a0));
                v6->field_150 = v6->field_150 | 32;
                v6 = v1;
            }
            sub_97724c(v6->field_a0);
            if (!(v6->field_150 >> 5 & 1) || !sub_989df8())
            {
                if (a1 >> 2 & 1 || !sub_980e14(v0))
                {
                    sub_97d424(&v0);
                }
                else if (1 > (int)sub_97d380(&v0, &g_97d3d0, v1))
                {
                    sub_ad93b4(sub_c4ba8(v0->field_58));
                    return 0;
                }
            }
            v8 = v1;
            sub_97724c(v8->field_a0);
            if (!(v8->field_150 >> 5 & 1) || !sub_989df8())
            {
                sub_ad93b4(sub_c4ba8(v0->field_58));
                return 0;
            }
        }
        if (!(a1 >> 3 & 1) || sub_977368(v1->field_a0))
        {
LABEL_97d2b4:
            v1->field_150 = v1->field_150 | 32;
            sub_978d04();
            sub_962a1c(v1->field_78, 1);
            if (sub_977354(v1->field_a0))
            {
                sub_ad93b4(sub_c4ba8(v0->field_58));
                return 1;
            }
            if (a1 >> 2 & 1 || (v9 = sub_980e14(v0), a1 & 1 || !sub_980e14(v0)))
            {
                sub_97d424(&v0);
LABEL_97d358:
                v10 = sub_977354(v1->field_a0);
                sub_ad93b4(sub_c4ba8(v0->field_58));
                return v10;
            }
            if (1 <= (int)sub_97d380(&v0, &g_97d478, v1))
                goto LABEL_97d358;
        }
        else if (a1 >> 2 & 1 || !sub_980e14(v0))
        {
            sub_97d424(&v0);
LABEL_97d2a4:
            if (sub_977368(v1->field_a0))
                goto LABEL_97d2b4;
        }
        else if (1 <= (int)sub_97d380(&v0, &g_97d470, v1))
        {
            goto LABEL_97d2a4;
        }
        sub_ad93b4(sub_c4ba8(v0->field_58));
        return 0;
    }
    return 0xffffffff;
}
