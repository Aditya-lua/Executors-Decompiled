/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa1a764..0xa1a958 (500 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a1a764_0 {
    char padding_0[8];
    unsigned long long field_8;
    long long field_10;
    long long field_18;
    char padding_20[32];
    unsigned long long field_40;
    char padding_48[72];
    unsigned long long field_90;
} st_a1a764_0;


unsigned long long sub_a1a764(st_a1a764_0 *a0, unsigned long long a1, unsigned long long a2, unsigned long long a3)
{
    unsigned long long v2;  // x0
    unsigned int v3;  // w0
    long long v4;  // x1
    unsigned long long v5;  // x0
    unsigned long long v6;  // x0
    unsigned long long v7;  // x0
    unsigned long long v8;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a1)
    {
        v2 = a0->field_40;
        if (!v2 || (v2 = sub_9e4828(v2), (unsigned int)v2 || (v2 = sub_9e5c94(a0->field_40), (unsigned int)v2)))
        {
            sub_a368c8(v2);
            sub_a369bc("crypto/ec/ec_lib.c", 381, "EC_GROUP_set_generator");
            v4 = 103;
        }
        else if (!a2 || sub_9e4828(a2) || sub_9e5c94(a2) || (v3 = sub_9e46a8(a2), (int)sub_9e46a8(a2) > (int)(sub_9e46a8(a0->field_40) + 1)))
        {
            sub_a368c8();
            sub_a369bc("crypto/ec/ec_lib.c", 392, "EC_GROUP_set_generator");
            v4 = 122;
        }
        else if (a3 && sub_9e5c94(a3))
        {
            sub_a368c8();
            sub_a369bc("crypto/ec/ec_lib.c", 402, "EC_GROUP_set_generator");
            v4 = 164;
        }
        else
        {
            v5 = a0->field_8;
            if (!v5)
            {
                v5 = sub_a1a56c(a0);
                a0->field_8 = v5;
                if (!v5)
                    return v5;
            }
            v6 = sub_a1a654(v5, a1);
            if (!(unsigned int)v6)
                return v6;
            v7 = sub_9e4c34(a0->field_10, a2);
            if (!v7)
                return v7;
            if (a3 && !sub_9e4828(a3))
            {
                v8 = sub_9e4c34(a0->field_18, a3);
                if (!v8)
                    return v8;
            }
            else if (!sub_a1a958(a0))
            {
                sub_9e5b4c(a0->field_18);
                return 0;
            }
            if (!sub_9e5c70(a0->field_10))
            {
                sub_9e6c64(a0->field_90);
                a0->field_90 = 0;
                return 1;
            }
        }
    }
    else
    {
        sub_a368c8();
        sub_a369bc("crypto/ec/ec_lib.c", 374, "EC_GROUP_set_generator");
        v4 = 786690;
    }
    sub_a36abc(16, v4, 0);
    return 0;
}
