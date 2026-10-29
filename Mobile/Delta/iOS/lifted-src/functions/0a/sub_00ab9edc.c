/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xab9edc..0xaba190 (692 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ab9edc_0 {
    char padding_0[40];
    long long field_28;
    long long field_30;
    long long field_38;
    long long field_40;
    long long field_48;
    long long field_50;
    long long field_58;
    long long field_60;
    char padding_68[112];
    unsigned int field_d8;
} st_ab9edc_0;


long long sub_ab9edc(st_ab9edc_0 *a0, int a1, long long a2, long long a3)
{
    long long v2;  // x20
    long long v3;  // x22
    long long v12;  // x0
    long long v13;  // x0
    long long v4;  // x23
    long long v5;  // x24
    long long v6;  // x25
    long long v7;  // x0
    long long v8;  // x0
    long long v9;  // x0
    long long v10;  // x26
    long long v11;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    sub_9de064(a3);
    v2 = sub_9de208(a3);
    v3 = sub_9de208(a3);
    v4 = sub_9de208(a3);
    v5 = sub_9de208(a3);
    v6 = sub_9de208(a3);
    if (v6)
    {
        sub_9e5d14(v2, 4);
        sub_9e5d14(v3, 4);
        sub_9e5d14(v4, 4);
        sub_9e5d14(v5, 4);
        sub_9e5d14(v6, 4);
        if (sub_ab9870(a3, a0->field_40, a0->field_48, v4, v6, v2, v3, v5) != 1)
            goto LABEL_aba0ec;
        if (a2)
        {
            sub_9e48d4(a0->field_30);
            v7 = sub_9e4b00(a2);
            a0->field_30 = v7;
            if (!v7)
                goto LABEL_aba0ec;
            v8 = sub_9e4988(sub_9e4838(a0->field_38));
            a0->field_38 = v8;
            if (!v8 || (sub_9e5d14(), !sub_9e1750(a0->field_38, a2, v4, a3)))
                goto LABEL_aba0ec;
            if ((int)sub_9e46a8(a0->field_38) > a1 >> 1)
            {
                v9 = a0->field_28;
                if (v9 || (v9 = sub_9e4958(0), a0->field_28 = v9, v9))
                {
                    if (sub_9e7dc8(v9, a0->field_40, a0->field_48, a3))
                        goto LABEL_aba038;
                    goto LABEL_aba0ec;
                }
            }
            else
            {
                v10 = 0;
LABEL_aba0f0:
                sub_9e48d4(a0->field_30);
                a0->field_30 = 0;
                sub_9e48d4(a0->field_38);
                a0->field_38 = 0;
                sub_9e48d4(a0->field_28);
                a0->field_28 = 0;
                sub_9e48d4(a0->field_60);
                a0->field_60 = 0;
                sub_9e48d4(a0->field_58);
                a0->field_58 = 0;
                sub_9e48d4(a0->field_50);
                a0->field_50 = 0;
            }
        }
        else
        {
LABEL_aba038:
            v11 = a0->field_50;
            if (v11 || (v11 = sub_9e4988(0), a0->field_50 = v11, v11))
            {
                sub_9e5d14(v11, 4);
                if (sub_9de520(0, a0->field_50, a0->field_38, v2, a3) && !(v12 = a0->field_58, !v12 && !(v12 = sub_9e4988(0), a0->field_58 = v12, v12)))
                {
                    sub_9e5d14(v12, 4);
                    if (sub_9de520(0, a0->field_58, a0->field_38, v3, a3))
                    {
                        v13 = sub_9e4988(sub_9e48d4(a0->field_60));
                        a0->field_60 = v13;
                        if (v13 && !(sub_9e5d14(), !sub_9e1750(a0->field_60, a0->field_48, a0->field_40, a3)))
                        {
                            a0->field_d8 = a0->field_d8 + 1;
                            v10 = 1;
                            goto LABEL_aba138;
                        }
                    }
                }
            }
            goto LABEL_aba0ec;
        }
    }
    else
    {
LABEL_aba0ec:
        v10 = 0xffffffff;
        goto LABEL_aba0f0;
    }
LABEL_aba138:
    sub_9e4cf0(v2);
    sub_9e4cf0(v3);
    sub_9e4cf0(v4);
    sub_9e4cf0(v5);
    sub_9e4cf0(v6);
    sub_9de17c(a3);
    return v10;
}
