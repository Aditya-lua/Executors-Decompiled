/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb44960..0xb44b68 (520 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b44960_0 {
    char padding_0[8];
    long long field_8;
    char padding_10[24];
    long long field_28;
    char padding_30[16];
    unsigned int field_40;
} st_b44960_0;


unsigned long long sub_b44960(st_b44960_0 *a0, long long a1, long long *a2)
{
    long long v3;  // x22
    unsigned long long v4;  // x0
    unsigned long long v13;  // x14
    unsigned long long v14;  // x13
    unsigned long long v15;  // x14
    unsigned long long v16;  // x13
    unsigned long long v17;  // x14
    unsigned long long v18;  // x13
    char *v19;  // x12
    unsigned long long v5;  // x8
    unsigned long long v6;  // w13
    unsigned long long v7;  // x10
    unsigned long long v8;  // w9
    unsigned long long v9;  // x10
    unsigned long long v10;  // x0
    unsigned long long v11;  // w9
    unsigned long long v12;  // x12
    char v0;  // [bp-0x34]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v3 = a0->field_8;
    v4 = sub_a2f9e0();
    if (!(unsigned int)v4)
        return v4;
    if (a0->field_40)
    {
        v5 = 0;
LABEL_b44998:
        v6 = 0;
        v7 = 1;
        v8 = 1;
        goto LABEL_b449a4;
    }
    else
    {
        v5 = a0->field_28 * 8;
        if (!v5)
            goto LABEL_b44998;
        if (v5 < 0x100)
        {
            v9 = 0;
            v8 = 1;
        }
        else if (v5 < 0x10000)
        {
            v9 = 0;
            v8 = 2;
        }
        else if (v5 > 0xffffff)
        {
            if (v5 <= 0xffffffff)
            {
                v8 = 4;
            }
            else if (v5 <= 0xffffffffff)
            {
                v8 = 5;
            }
            else if (v5 > 0xffffffffffff)
            {
                if (v5 <= 0xffffffffffffff)
                    v8 = 7;
                else
                    v8 = 8;
            }
            else
            {
                v8 = 6;
            }
            v9 = 1;
        }
        else
        {
            v9 = 0;
            v8 = 3;
        }
        if (v9 & 1)
        {
            sub_a368c8();
            sub_a369bc("providers/implementations/macs/kmac_prov.c", 538, "right_encode");
            sub_a36abc(57, 202, 0);
            v10 = 0;
        }
        else
        {
            v7 = v8;
            v6 = v8;
LABEL_b449a4:
            v11 = v8;
            if (1 < v6)
                v12 = v6;
            else
                v12 = 1;
            v13 = v12 - 1;
            (&v0)[v13] = v5;
            if (v6 > 1)
            {
                v14 = v12 - 2;
                (&v0)[v14] = v5 >> 8;
                if (v13 >= 2)
                {
                    v15 = v12 - 3;
                    (&v0)[v15] = v5 >> 16;
                    if (v14 >= 2)
                    {
                        v16 = v12 - 4;
                        (&v0)[v16] = v5 >> 24;
                        if (v15 >= 2)
                        {
                            v17 = v12 - 5;
                            (&v0)[v17] = v5 >> 32;
                            if (v16 >= 2)
                            {
                                v18 = v12 - 6;
                                (&v0)[v18] = v5 >> 40;
                                if (v17 >= 2)
                                {
                                    v19 = &(&v0)[v12];
                                    *(v19 - 7) = v5 >> 48;
                                    if (v18 >= 2)
                                        *(v19 - 8) = v5 >> 56;
                                }
                            }
                        }
                    }
                }
            }
            (&v0)[v7] = v11;
            v10 = sub_a3fe10(v3, &v0, v11 + 1);
            if ((unsigned int)v10)
                v10 = sub_a400f8(v3, a1, a0->field_28) != 0;
        }
    }
    *a2 = a0->field_28;
    return v10;
}
