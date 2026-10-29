/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9fe628..0x9fe748 (288 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9fe628_0 {
    char padding_0[8];
    unsigned long long field_8;
    char padding_10[8];
    unsigned long long field_18;
    char padding_20[80];
    unsigned long long field_70;
    unsigned long long field_78;
    char padding_80[48];
    long long field_b0;
} st_9fe628_0;


long long sub_9fe628(st_9fe628_0 *a0, unsigned long a1)
{
    unsigned long v4;  // x19
    unsigned long v5;  // x20
    unsigned long v6;  // x21
    unsigned long v7;  // x22
    unsigned long v0;  // [bp-0x40]
    unsigned long v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v0 = 0;
    v1 = 0;
    if (!a0->field_8)
    {
        return a1;
    }
    else if (!a0->field_18)
    {
        return a1;
    }
    else if (!a0->field_78)
    {
        return a1;
    }
    else if (a0->field_70)
    {
        sub_a7b198(a0->field_b0, &v1, &v0);
        v4 = sub_a7b1f0(v1, v0);
        if (v4)
        {
            sub_a7b334(v4, "Conditional_PCT", "DH");
            v5 = sub_9dddcc(a0->field_b0);
            if (v5)
            {
                v6 = sub_9e4958();
                if (v6 && sub_9ff308(v5, a0, a0->field_78, v6))
                    v7 = !sub_9e5528(v6, a0->field_70);
                else
                    v7 = 0;
            }
            else
            {
                v7 = 0;
                v6 = 0;
            }
        }
        else
        {
            v7 = 0;
            v5 = 0;
            v6 = 0;
        }
        sub_9e48d4(v6);
        sub_9dded4(v5);
        sub_a7b380(v4, v7);
        sub_a7b324(v4);
        return v7;
    }
    else
    {
        return a1;
    }
}
