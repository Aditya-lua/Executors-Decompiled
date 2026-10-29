/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb294ac..0xb29640 (404 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b294ac_0 {
    long long field_0;
    long long field_8;
    long long field_10;
    char padding_18[4];
    long long field_1c;
    long long field_20;
    long long field_28;
    long long field_30;
    long long field_38;
} st_b294ac_0;


unsigned long long sub_b294ac(st_b294ac_0 *a0, unsigned long long a1, long long *a2, long long a3)
{
    unsigned long long v10;  // x24
    unsigned long long v11;  // x23
    unsigned long long v20;  // x21
    unsigned long long v21;  // x19
    unsigned long long v12;  // x22
    unsigned long long v13;  // x21
    unsigned long long v14;  // x20
    unsigned long long v15;  // x19
    unsigned long long v16;  // x30
    long long v17;  // x1
    unsigned long long v18;  // x22
    unsigned long long v19;  // x0
    unsigned long long v0;  // [bp-0x48]
    unsigned long long v1;  // [bp-0x40]
    unsigned long long v2;  // [bp-0x38]
    unsigned long long v3;  // [bp-0x30]
    unsigned long long v4;  // [bp-0x28]
    unsigned long long v5;  // [bp-0x20]
    unsigned long long v6;  // [bp-0x18]
    char *v7;  // [bp-0x10]
    unsigned long long v8;  // [bp-0x8]
    char v9;  // [bp+0x0]

    if ((a0->padding_18)[1] != 1)
    {
        if (!(a0->padding_18)[1])
            return sub_b29cc4();
        return 0;
    }
    else
    {
        if (a1)
        {
            v1 = v10;
            v2 = v11;
            v3 = v12;
            v4 = v13;
            v5 = v14;
            v6 = v15;
            v7 = &v9;
            v8 = v16;
            if ((unsigned long long)a0->field_30 > (unsigned long long)a3)
            {
                sub_a368c8();
                sub_a369bc("providers/implementations/exchange/ecdh_exch.c", 578, "ecdh_X9_63_kdf_derive");
                v17 = 106;
            }
            else
            {
                if (a0->field_8 && a0->field_10)
                {
                    if (sub_9ffdd0(a0->field_8))
                        v18 = sub_a1ad1c() + 7 >> 3;
                    else
                        v18 = 0;
                    v0 = v18;
                    v19 = sub_a6c610(v18, "providers/implementations/exchange/ecdh_exch.c", 583);
                    if (!v19)
                        return v19;
                    v20 = v19;
                    if (sub_b29cc4(a0, v20, &v0, v18) && sub_a1e7f4(a1, a0->field_30, v20, v0, a0->field_20, a0->field_28, a0->field_1c, a0->field_0, 0))
                    {
                        *a2 = a0->field_30;
                        v21 = 1;
                    }
                    else
                    {
                        v21 = 0;
                    }
                    sub_a6d4c0(v20, v0, "providers/implementations/exchange/ecdh_exch.c", 600);
                    return v21;
                }
                sub_a368c8();
                sub_a369bc("providers/implementations/exchange/ecdh_exch.c", 477, "ecdh_plain_derive");
                v17 = 128;
            }
            sub_a36abc(57, v17, 0);
            return 0;
        }
        else
        {
            *a2 = a0->field_30;
            return 1;
        }
    }
}
